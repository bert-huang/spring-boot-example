package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StubController {

  @GetMapping("/")
  String stub() {
    return "Nothing to see here, move along.";
  }
}
