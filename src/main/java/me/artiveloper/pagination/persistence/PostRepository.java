package me.artiveloper.pagination.persistence;

import lombok.AllArgsConstructor;
import me.artiveloper.pagination.domain.Criteria;
import me.artiveloper.pagination.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PostRepository {

    private PostMapper postMapper;

    public int totalPostCount(){
        return postMapper.totalPostCount();
    }

    public List<Post> postList(Criteria criteria){
        return postMapper.list(criteria);
    }

}
