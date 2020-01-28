package com.example.demo.listener;

import com.example.demo.dao.PayloadData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class DevQueueListener implements QueueListener {

  @Override
  @JmsListener(destination = "DEV.QUEUE.1")
  public void receiveMessage(PayloadData payload) {
    log.info("Received: {}", payload);
  }
}
