package com.example.demo.service;

import com.example.demo.dao.PayloadData;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jmx.JmxException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class SimpleMessageService implements MessageService {

  private final String queueName = "DEV.QUEUE.1";
  private JmsTemplate template;

  @Override
  public String sendMessage(PayloadData payload) {
    try {
      template.convertAndSend(queueName, payload);
      return "OK";
    } catch (JmxException e) {
      e.printStackTrace();
      return "FAIL";
    }
  }

  @Override
  public PayloadData receiveMessage() {
    try {
      return (PayloadData) template.receiveAndConvert(queueName);
    } catch (JmsException e) {
      e.printStackTrace();
    }
    return null;
  }
}
