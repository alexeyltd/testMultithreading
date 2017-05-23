package VkApi.service;


import VkApi.model.Response;

import java.util.concurrent.Future;

public interface WallSearchService {

    Future<Response> JsonWallSearch(Long owner, String query, String token);

}
