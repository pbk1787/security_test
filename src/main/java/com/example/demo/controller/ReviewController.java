package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @GetMapping
    public ResponseEntity<String> reviews(Authentication authentication) {
        return ResponseEntity.ok().body(authentication.getName()+"님의 리뷰등록이 완료 되었습니다.");
    }

}
