package me.artiveloper.pagination.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
public class PaginationTest {

    @Test
    public void paginationTest() {
        Criteria criteria = new Criteria(1);
        Pagination pagination = new Pagination(criteria);
        pagination.computePage(150);

        assertThat(pagination.getStartPage()).isEqualTo(1);
        assertThat(pagination.getLastPage()).isEqualTo(5);

        criteria = new Criteria(8);
        pagination = new Pagination(criteria);
        pagination.computePage(150);

        assertThat(pagination.getStartPage()).isEqualTo(6);
        assertThat(pagination.getLastPage()).isEqualTo(10);
    }
}