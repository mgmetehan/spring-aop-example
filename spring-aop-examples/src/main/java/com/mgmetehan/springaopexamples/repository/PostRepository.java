package com.mgmetehan.springaopexamples.repository;

import com.mgmetehan.springaopexamples.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
