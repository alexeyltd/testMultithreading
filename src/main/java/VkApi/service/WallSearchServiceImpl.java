package VkApi.service;


import VkApi.model.Response;
import VkApi.model.RootObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class WallSearchServiceImpl implements WallSearchService {

    private static final Logger logger = LoggerFactory.getLogger(WallSearchServiceImpl.class);


    @Override
    public Response JsonWallSearch(Long owner, String query, String token) {

        final String URL = "https://api.vk.com/method/";
        final String METHOD = "wall.search?";
        final String TOKEN = "&access_token=" + token;
        final String VERSION = "&v=5.52";
        final String OWNER_ID = "owner_id=-";
        final String PARAMETER_QUERY = "&query=";
        final String COUNT = "&count=50";
        final String EXTENDED = "&extended=1";

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();

//        String resultAccountInfoJsonFromVkApi = restTemplate.getForObject(URL + METHOD + OWNER_ID + owner + PARAMETER_QUERY + query + COUNT + EXTENDED + TOKEN + VERSION, String.class);
        RootObject rootObject = restTemplate.getForObject(URL + METHOD + OWNER_ID + owner + PARAMETER_QUERY + query + COUNT + EXTENDED + TOKEN + VERSION, RootObject.class);

        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        RootObject rootObject = null;


//        try {
//            rootObject = objectMapper.readValue(resultAccountInfoJsonFromVkApi, RootObject.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        logger.info(Thread.currentThread().getName());

        return rootObject.getResponse();

    }

}
