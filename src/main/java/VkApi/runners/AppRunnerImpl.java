package VkApi.runners;

import VkApi.model.Item;
import VkApi.model.Response;
import VkApi.service.GroupSearchService;
import VkApi.service.WallSearchService;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
/*
@Component
public class AppRunnerImpl implements AppRunner {

    public static List<Pair<Long, String>> listPair = new ArrayList<Pair<Long, String>>();

    @Autowired
    GroupSearchService groupSearchService;

    @Autowired
    WallSearchService wallSearchService;



    @Override
    public void run(String... args) throws Exception {


        String mainKeyword = args[0];
        String token = args[1];


        int groupSizeFirstPart = groupSearchService.getVkJson(mainKeyword, token).getItems().size();
        List<Item> listItemFirstPart = groupSearchService.getVkJson(mainKeyword, token).getItems();

        int groupSizeSecondPart = groupSearchService.getVkJson(mainKeyword, token).getItems().size();
        List<Item> listItemSecondPart = groupSearchService.getVkJson(mainKeyword, token).getItems();

        for (int i = 0; i < groupSizeFirstPart / 2; i++) {

            listPair.add(new Pair<>((long) listItemFirstPart.get(i).getId(),
                    "https://vk.com/club" + listItemFirstPart.get(i).getId()));

        }

        for (int i = groupSizeFirstPart / 2; i < groupSizeSecondPart; i++) {

            listPair.add(new Pair<>((long) listItemSecondPart.get(i).getId(),
                    "https://vk.com/club" + listItemSecondPart.get(i).getId()));

        }

        for (Pair<Long, String> pair: listPair) {
            System.out.print( "\n\n");
            Response result = null;

            if (pair.getKey() != null) {
                System.out.println("In this group ->" + pair.getValue());
                result = wallSearchService.JsonWallSearch(pair.getKey(), mainKeyword, token);
            }


            if (result != null) {
                System.out.println("-------------------------");
                for (int i = 0; i < result.getItems().size(); i++) {
                    System.out.print( "\n");
                    System.out.println( "We found Post - \n" + result.getItems().get(i).getText());
                }
                System.out.println("-------------------------");
            }
            else {
                System.out.print("Our access was denied");
            }

        }



    }


}
*/
