package com.example.demo.service;

import com.example.demo.dao.PayloadData;

public interface MessageService {

  String sendMessage(PayloadData payload);

  PayloadData receiveMessage();
}
