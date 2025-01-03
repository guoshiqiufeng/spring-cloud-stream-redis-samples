package io.github.guoshiqiufeng.cloud.samples.jedis.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@SpringBootApplication
public class JedisSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(JedisSentinelApplication.class, args);
    }

    @Bean("recall")
    public Consumer<Message<String>> recall() {
        return (consumer) -> {
            String payload = consumer.getPayload();
            System.out.println(payload);
        };
    }
}
