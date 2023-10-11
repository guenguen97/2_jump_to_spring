package com.example.demo.chat;


import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@RequiredArgsConstructor
@Controller
public class GreetingController {

    private final GreetingRepository greetingRepository;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(10); // simulated delay
        Greeting greeting= new Greeting(message.getName());
        greetingRepository.save(greeting);


        return new Greeting( HtmlUtils.htmlEscape(message.getName()) );
    }

}
