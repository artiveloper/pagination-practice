package me.artiveloper.pagination.controller;

import lombok.AllArgsConstructor;
import me.artiveloper.pagination.domain.Criteria;
import me.artiveloper.pagination.domain.Pagination;
import me.artiveloper.pagination.domain.Post;
import me.artiveloper.pagination.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/posts")
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @GetMapping("")
    public String list(Criteria criteria, Model model){

        Pagination pagination = new Pagination(criteria);
        pagination.computePage(postService.getTotalPostCount());
        model.addAttribute("pagination", pagination);

        List<Post> posts = postService.getPostList(criteria);
        model.addAttribute("posts", posts);
        return "list";
    }

}
