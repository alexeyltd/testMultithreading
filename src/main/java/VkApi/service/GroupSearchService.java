package VkApi.service;


import VkApi.model.Response;


public interface GroupSearchService {

    Response getVkJson(String mainKeyword, String token);
}
