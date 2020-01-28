package com.example.demo.listener;

import com.example.demo.dao.PayloadData;

public interface QueueListener {

  void receiveMessage(PayloadData payload);

}
