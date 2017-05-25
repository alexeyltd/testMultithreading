package VkApi.service;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;


@Service
public class ApacheHTTPClientImpl implements  ApacheHTTPClient {


    @Override
    public String getApacheHTTPClient(String mainKeyword, String token) {

        final String URL = "https://api.vk.com/method/";
        final String METHOD = "groups.search?";
        final String TOKEN = "&access_token=" + token;
        final String VERSION = "&v=5.52";
        final String PARAMETER_COUNT = "count=5";
        final String PARAMETER_TYPE = "&type=group";
        final String PARAMETER_Q = "&q=";


        StringBuilder stringBuilder = null;
        String mainGetGroupsJsonFromVkApi = URL + METHOD + PARAMETER_COUNT + PARAMETER_TYPE + PARAMETER_Q + mainKeyword + TOKEN + VERSION;


        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(mainGetGroupsJsonFromVkApi);

            request.addHeader("accept", "application/json");

            HttpResponse response = client.execute(request);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int responseCode = response.getStatusLine().getStatusCode();

            System.out.println("**GET** request Url: " + request.getURI());
            System.out.println("Response Code: " + responseCode);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            stringBuilder = new StringBuilder();
            String line = "";
            while ((line = rd.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return stringBuilder.toString();


    }

}
