package me.artiveloper.pagination.service;

import lombok.AllArgsConstructor;
import me.artiveloper.pagination.domain.Criteria;
import me.artiveloper.pagination.domain.Post;
import me.artiveloper.pagination.persistence.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Override
    public List<Post> getPostList(Criteria criteria) {
        return postRepository.postList(criteria);
    }

    @Override
    public int getTotalPostCount() {
        return postRepository.totalPostCount();
    }

}
