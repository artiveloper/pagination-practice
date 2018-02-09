package me.artiveloper.pagination.service;

import me.artiveloper.pagination.domain.Criteria;
import me.artiveloper.pagination.domain.Post;

import java.util.List;

public interface PostService {

    List<Post> getPostList(Criteria criteria);

    int getTotalPostCount();

}
