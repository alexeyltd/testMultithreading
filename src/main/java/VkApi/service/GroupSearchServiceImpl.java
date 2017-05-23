package VkApi.service;


import VkApi.model.Response;
import VkApi.model.RootObject;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class GroupSearchServiceImpl implements GroupSearchService {

    private static final Logger logger = LoggerFactory.getLogger(GroupSearchServiceImpl.class);


    @Async
    @Override
    public Future<Response> getVkJson(String mainKeyword, String token)  {

        final String URL = "https://api.vk.com/method/";
        final String METHOD = "groups.search?";
        final String TOKEN = "&access_token=" + token;
        final String VERSION = "&v=5.52";
        final String PARAMETER_COUNT = "count=10";
        final String PARAMETER_TYPE = "&type=group";
        final String PARAMETER_Q = "&q=";


        String mainGetGroupsJsonFromVkApi = URL + METHOD + PARAMETER_COUNT + PARAMETER_TYPE + PARAMETER_Q + mainKeyword + TOKEN + VERSION;

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();

        String resultGroupsJsonFromVkApi = restTemplate.getForObject(mainGetGroupsJsonFromVkApi, String.class);


        RootObject rootObject = null;

        try {
            TimeUnit.MILLISECONDS.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            rootObject = objectMapper.readValue(resultGroupsJsonFromVkApi, RootObject.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info(Thread.currentThread().getName());


        return new AsyncResult<>(rootObject.getResponse());



    }

}
