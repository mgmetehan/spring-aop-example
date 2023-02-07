package com.mgmetehan.springaopexamples.controller;

import com.mgmetehan.springaopexamples.annotation.RequireVerifiedMail;
import com.mgmetehan.springaopexamples.model.Post;
import com.mgmetehan.springaopexamples.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    @RequireVerifiedMail
    public ResponseEntity<Post> save(@RequestBody Post newPost) {
        return new ResponseEntity<>(postService.save(newPost), HttpStatus.CREATED);
    }

    @PostMapping("print")
    public ResponseEntity<String> exampleMethod(@RequestBody String message) {
        return ResponseEntity.ok(postService.sendMessage(message));
    }
}
