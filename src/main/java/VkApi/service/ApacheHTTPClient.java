package VkApi.service;


import java.util.concurrent.Future;

public interface ApacheHTTPClient {

    Future<String> getApacheHTTPClient(String mainKeyword, String token);

}
