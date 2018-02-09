package me.artiveloper.pagination.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Pagination {

    private boolean prev;
    private boolean next;
    private int startPage;
    private int lastPage;
    private int displayedPage = 5;
    private Criteria criteria;

    public Pagination(Criteria criteria) {
        this.criteria = criteria;
    }

    public void computePage(final int totalPostCount) {
        lastPage = (int) (Math.ceil(criteria.getCurrentPage() / (double) displayedPage) * displayedPage);
        startPage = (lastPage - displayedPage) + 1;

        int tempLastPage = (int) (Math.ceil(totalPostCount / (double) criteria.getPostPerPage()));
        if (lastPage > tempLastPage) {
            lastPage = tempLastPage;
        }

        prev = startPage != 1;
        next = (lastPage * criteria.getPostPerPage()) < totalPostCount;
    }

}
