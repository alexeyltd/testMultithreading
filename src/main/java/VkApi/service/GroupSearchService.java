package VkApi.service;


import VkApi.model.Response;

import java.util.concurrent.Future;


public interface GroupSearchService {

    Future<Response> getVkJson(String mainKeyword, String token);
}
