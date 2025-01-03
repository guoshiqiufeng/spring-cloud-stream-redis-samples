package io.github.guoshiqiufeng.cloud.samples.lettuce.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@SpringBootApplication
public class LettuceStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(LettuceStandaloneApplication.class, args);
    }

    @Bean("recall")
    public Consumer<Message<String>> recall() {
        return (consumer) -> {
            String payload = consumer.getPayload();
            System.out.println(payload);
        };
    }
}
