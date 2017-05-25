package VkApi.controller;

import VkApi.model.Item;
import VkApi.model.Response;
import VkApi.service.GroupSearchService;
import VkApi.service.WallSearchService;
import com.google.common.base.Stopwatch;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

@Controller
public class SearchGroupsAndWalls {

    @Autowired
    GroupSearchService groupSearchService;

    @Autowired
    WallSearchService wallSearchService;


    public static List<Pair<Long, String>> listPair = new ArrayList<Pair<Long, String>>();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String searchPage() {

        return "search_groups";

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getUsersPage(@RequestParam(value = "main") String mainKeyword) throws ExecutionException, InterruptedException {


        Stopwatch stopwatch = Stopwatch.createStarted();

        final String ACCESS_ONE = "53c2207ef83c37171713a6e97560c819af52b44537dbc15c0451b661d5316432384e95fc24f343a88c134";
        final String ACCESS_TWO = "5d866b1300b52bd30eacd405e05a3ed90673f31f349072cf16a616ee02e8ad1a22c3eccdfe21e1f40dc88";

//        int groupTokenOne = 0;
//        List<Item> listItemFirstPart = null;
//        int groupTokenTwo = 0;
//        List<Item> listItemSecondPart = null;

        ExecutorService executorService = Executors.newFixedThreadPool(2);

//        Future future = executorService.submit((Callable) () -> groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).get().getItems().size());

        Set<Callable<Integer>> callablesInteger = new HashSet<>();
        Set<Callable<List<Item>>> callablesListItems = new HashSet<>();

        callablesInteger.add(() -> groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).getItems().size());
        callablesInteger.add(() -> groupSearchService.getVkJson(mainKeyword, ACCESS_TWO).getItems().size());

        callablesListItems.add(() -> groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).getItems());
        callablesListItems.add(() -> groupSearchService.getVkJson(mainKeyword, ACCESS_TWO).getItems());

        List<Future<Integer>> listInteger = executorService.invokeAll(callablesInteger);
        List<Future<List<Item>>> listItems = executorService.invokeAll(callablesListItems);

        int groupTokenOne = listInteger.get(0).get();
        List<Item> listItemFirstPart = listItems.get(0).get();
        int groupTokenTwo = listInteger.get(1).get();
        List<Item> listItemSecondPart = listItems.get(0).get();


//        try {
//            groupTokenOne = groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).get().getItems().size();
//            listItemFirstPart = groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).get().getItems();
//            groupTokenTwo = groupSearchService.getVkJson(mainKeyword, ACCESS_TWO).get().getItems().size();
//            listItemSecondPart = groupSearchService.getVkJson(mainKeyword, ACCESS_TWO).get().getItems();
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }

        Set<Callable<String>> callables = new HashSet<>();

        callables.add(() -> {
            for (int i = 0; i < groupTokenOne / 2; i++) {

                listPair.add(new Pair<>((long) listItemFirstPart.get(i).getId(),
                        "https://vk.com/club" + listItemFirstPart.get(i).getId()));

            }
            return "okay first part";
        });
        callables.add(() -> {
            for (int i = groupTokenOne / 2; i < groupTokenTwo; i++) {

                listPair.add(new Pair<>((long) listItemSecondPart.get(i).getId(),
                        "https://vk.com/club" + listItemSecondPart.get(i).getId()));

            }
            return "okay second part";
        });

        List<Future<String>> futures = executorService.invokeAll(callables);


        Future future = executorService.submit((Callable) () -> {
            Response result;
            int sizeResult;

            for (Pair<Long, String> pair : listPair) {
                System.out.print("\n\n");

                if (pair.getKey() != null) {
                    System.out.println("In this group ->" + pair.getValue());
                    result = wallSearchService.JsonWallSearch(pair.getKey(), mainKeyword, ACCESS_ONE);
                }   else {
                   continue;
                }

                if (result == null) {
                    continue;
                }

                sizeResult = result.getItems().size();


                System.out.println("-------------------------");
                for (int i = 0; i < sizeResult; i++) {
                    System.out.print("\n");
                    System.out.println("We found Post - \n" + result.getItems().get(i).getText());
                }
                System.out.println("-------------------------");
            }
            return "Finished thread - " + Thread.currentThread().getName();
        });

        System.out.println(future.get());


//        executorService.execute(() -> {
//            for (Pair<Long, String> pair: listPair) {
//                System.out.print( "\n\n");
//                Future<Response> result = null;
//
//                if (pair.getKey() != null) {
//                    System.out.println("In this group ->" + pair.getValue());
//                    result = wallSearchService.JsonWallSearch(pair.getKey(), mainKeyword, ACCESS_ONE);
//                }
//
//                int sizeResult = 0;
//
//                try {
//                    sizeResult = result.get().getItems().size();
//                } catch (InterruptedException | ExecutionException e) {
//                    e.printStackTrace();
//                }
//
//
//                System.out.println("-------------------------");
//                for (int i = 0; i < sizeResult; i++) {
//                    System.out.print( "\n");
//                    try {
//                        System.out.println( "We found Post - \n" + result.get().getItems().get(i).getText());
//                    } catch (InterruptedException | ExecutionException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println("-------------------------");
//
//
//            }
//        });

        executorService.shutdown();





//        for (int i = 0; i < groupTokenOne / 2; i++) {
//
//            listPair.add(new Pair<>((long) listItemFirstPart.get(i).getId(),
//                    "https://vk.com/club" + listItemFirstPart.get(i).getId()));
//
//        }
//        for (int i = groupTokenOne / 2; i < groupTokenTwo; i++) {
//
//            listPair.add(new Pair<>((long) listItemSecondPart.get(i).getId(),
//                    "https://vk.com/club" + listItemSecondPart.get(i).getId()));
//
//        }

//        for (Pair<Long, String> pair: listPair) {
//            System.out.print( "\n\n");
//            Future<Response> result = null;
//
//            if (pair.getKey() != null) {
//                System.out.println("In this group ->" + pair.getValue());
//                result = wallSearchService.JsonWallSearch(pair.getKey(), mainKeyword, ACCESS_ONE);
//            }
//
//            int sizeResult = 0;
//
//            try {
//                sizeResult = result.get().getItems().size();
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//
//
//            System.out.println("-------------------------");
//            for (int i = 0; i < sizeResult; i++) {
//                System.out.print( "\n");
//                try {
//                    System.out.println( "We found Post - \n" + result.get().getItems().get(i).getText());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } catch (ExecutionException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("-------------------------");
//
//
//        }


        stopwatch.elapsed(TimeUnit.MILLISECONDS);

        System.out.println(stopwatch);



        return "redirect:/";


    }





}
