package com.mgmetehan.springaopexamples.service;

import com.mgmetehan.springaopexamples.model.Post;

public interface PostService {
    Post save(Post newPost);

    String sendMessage(String message);
}
