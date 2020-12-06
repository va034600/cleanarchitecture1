package com.gmail.va034600.cleanarchitecture1.gateway.queue.impl;

import com.gmail.va034600.cleanarchitecture1.business.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
    @Override
    public void sendMail(String email, String title) {
        System.out.printf("send email:" + email);
        System.out.printf("send title:" + title);
    }
}
