package com.mgmetehan.springaopexamples.service.impl;

import com.mgmetehan.springaopexamples.model.Post;
import com.mgmetehan.springaopexamples.repository.PostRepository;
import com.mgmetehan.springaopexamples.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public Post save(Post newPost) {
        var postSave = new Post();
        postSave.setUserName(newPost.getUserName());
        postSave.setTitle(newPost.getTitle());
        postSave.setText(newPost.getText());

        return postRepository.save(postSave);
    }

    @Override
    public String sendMessage(String message) {
        return message;
    }
}
