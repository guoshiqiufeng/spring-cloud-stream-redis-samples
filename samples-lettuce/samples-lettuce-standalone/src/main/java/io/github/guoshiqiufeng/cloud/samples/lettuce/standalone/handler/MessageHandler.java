package io.github.guoshiqiufeng.cloud.samples.lettuce.standalone.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author yanghq
 * @version 1.0
 * @since 2025/1/3 14:58
 */
@Slf4j
@Component("send")
public class MessageHandler implements Consumer<Message<String>> {

    /**
     * Performs this operation on the given argument.
     *
     * @param messageVOMessage the input argument
     */
    @Override
    public void accept(Message<String> messageVOMessage) {
        log.info("send Receive New Messages: {}", messageVOMessage.getPayload());
    }
}
