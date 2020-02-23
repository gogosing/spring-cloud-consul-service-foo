package me.gogosing.service.impl;

import me.gogosing.model.external.Message;
import me.gogosing.service.MessageService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JinBum Jeong on 2020/02/23.
 */
@Service
public class MessageServiceImpl implements MessageService {

    private final RestTemplate restTemplate;

    public MessageServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getExternalMessage() {
        return restTemplate
                .getForObject("//bar-service/v1/message", Message.class)
                .getMessage();
    }
}
