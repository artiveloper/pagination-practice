package me.artiveloper.pagination.persistence;

import groovy.util.logging.Slf4j;
import me.artiveloper.pagination.domain.Criteria;
import me.artiveloper.pagination.domain.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@MybatisTest
@Import(PostRepository.class)
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void totalPostCountTest() {
        assertThat(postRepository.totalPostCount()).isGreaterThan(1);
    }

    @Test
    public void postListTest() {
        Criteria criteria = new Criteria(1);
        List<Post> postList = postRepository.postList(criteria);
        assertThat(postList.size()).isEqualTo(10);
    }

}
