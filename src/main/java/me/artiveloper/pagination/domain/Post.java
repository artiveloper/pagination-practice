package me.artiveloper.pagination.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class Post {

    private int postno;
    private String subject;
    private String content;
    private String writer;
    private LocalDateTime regdate;

    @Builder
    public Post(String subject, String content, String writer, LocalDateTime regdate) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
        this.regdate = regdate;
    }
}
