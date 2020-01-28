package com.example.demo.controller;

import com.example.demo.dao.PayloadData;
import com.example.demo.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MessageController {

  private MessageService messageService;

  @PostMapping("/send")
  public String sendMessage(@RequestBody PayloadData payload) {
    return messageService.sendMessage(payload);
  }

}
