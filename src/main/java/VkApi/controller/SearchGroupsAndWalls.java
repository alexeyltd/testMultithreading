package VkApi.controller;

import VkApi.model.Item;
import VkApi.model.Response;
import VkApi.service.ApacheHTTPClient;
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
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Controller
public class SearchGroupsAndWalls {

    @Autowired
    GroupSearchService groupSearchService;

    @Autowired
    WallSearchService wallSearchService;


//    @Autowired
//    ApacheHTTPClient apacheHTTPClient;


//    @Autowired
//    AppRunner appRunner;


    public static List<Pair<Long, String>> listPair = new ArrayList<Pair<Long, String>>();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String searchPage() {

        return "search_groups";

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getUsersPage(@RequestParam(value = "main") String mainKeyword) {


        Stopwatch stopwatch = Stopwatch.createStarted();

        final String ACCESS_ONE = "53c2207ef83c37171713a6e97560c819af52b44537dbc15c0451b661d5316432384e95fc24f343a88c134";
        final String ACCESS_TWO = "5d866b1300b52bd30eacd405e05a3ed90673f31f349072cf16a616ee02e8ad1a22c3eccdfe21e1f40dc88";
//        final String ACCESS_THREE = "53c2207ef83c37171713a6e97560c819af52b44537dbc15c0451b661d5316432384e95fc24f343a88c134";



//        Future<String> apacheOne = apacheHTTPClient.getApacheHTTPClient(mainKeyword, ACCESS_ONE);
//        Future<String> apacheTwo = apacheHTTPClient.getApacheHTTPClient(mainKeyword, ACCESS_TWO);

/*
        try {
            appRunner.run(mainKeyword, ACCESS_ONE);
            appRunner.run(mainKeyword, ACCESS_TWO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        int groupTokenOne = 0;
        List<Item> listItemFirstPart = null;
        int groupTokenTwo = 0;
        List<Item> listItemSecondPart = null;


        try {
            groupTokenOne = groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).get().getItems().size();
            listItemFirstPart = groupSearchService.getVkJson(mainKeyword, ACCESS_ONE).get().getItems();
            groupTokenTwo = groupSearchService.getVkJson(mainKeyword, ACCESS_TWO).get().getItems().size();
            listItemSecondPart = groupSearchService.getVkJson(mainKeyword, ACCESS_TWO).get().getItems();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



        for (int i = 0; i < groupTokenOne / 2; i++) {

            listPair.add(new Pair<>((long) listItemFirstPart.get(i).getId(),
                    "https://vk.com/club" + listItemFirstPart.get(i).getId()));

        }

        for (int i = groupTokenOne / 2; i < groupTokenTwo; i++) {

            listPair.add(new Pair<>((long) listItemSecondPart.get(i).getId(),
                    "https://vk.com/club" + listItemSecondPart.get(i).getId()));

        }

        for (Pair<Long, String> pair: listPair) {
            System.out.print( "\n\n");
            Future<Response> result = null;

            if (pair.getKey() != null) {
                System.out.println("In this group ->" + pair.getValue());
                result = wallSearchService.JsonWallSearch(pair.getKey(), mainKeyword, ACCESS_ONE);
            }

            int sizeResult = 0;

            try {
                sizeResult = result.get().getItems().size();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }


            if (result != null) {
                System.out.println("-------------------------");
                for (int i = 0; i < sizeResult; i++) {
                    System.out.print( "\n");
                    try {
                        System.out.println( "We found Post - \n" + result.get().getItems().get(i).getText());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("-------------------------");
            }
            else {
                System.out.print("Our access was denied");
            }



        }





        stopwatch.elapsed(TimeUnit.MILLISECONDS);

        System.out.println(stopwatch);


        return "redirect:/";


    }





}
