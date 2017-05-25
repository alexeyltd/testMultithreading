package VkApi.service;


import VkApi.model.Response;

public interface WallSearchService {

    Response JsonWallSearch(Long owner, String query, String token);

}
