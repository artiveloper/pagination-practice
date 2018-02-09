package me.artiveloper.pagination.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Criteria {

    private int page = 1;
    private int postPerPage = 10;

    public Criteria(int page) {
        this.page = page;
        if (page <= 0) {
            page = 1;
        }
    }

    // 프론트에서 현재 페이지 조회를 위함
    public int getCurrentPage(){
        return this.page;
    }

    // 마이바티스에서 페이지 계산을 위함
    public int getPage() {
        return (this.page - 1) * this.postPerPage;
    }

}
