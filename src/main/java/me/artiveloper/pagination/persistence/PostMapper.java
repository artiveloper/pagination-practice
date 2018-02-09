package me.artiveloper.pagination.persistence;

import me.artiveloper.pagination.domain.Criteria;
import me.artiveloper.pagination.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    int totalPostCount();

    List<Post> list(Criteria criteria);

}
