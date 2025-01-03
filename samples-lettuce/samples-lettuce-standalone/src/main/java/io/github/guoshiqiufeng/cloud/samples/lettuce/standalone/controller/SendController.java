package io.github.guoshiqiufeng.cloud.samples.lettuce.standalone.controller;

import com.alibaba.fastjson2.JSON;
import io.github.guoshiqiufeng.cloud.samples.lettuce.standalone.vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

/**
 * @author yanghq
 * @version 1.0
 * @since 2025/1/3 14:49
 */
@RestController
public class SendController {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("/send")
    public String sendForJson() {
        MessageVO messageVO = new MessageVO();
        messageVO.setKey(UUID.randomUUID().toString());
        messageVO.setMsg("hello ");
        messageVO.setIds(Set.of("1", "2"));
        messageVO.setCreateTime(LocalDateTime.now());
        streamBridge.send("out-0", JSON.toJSONString(messageVO));
        return "success";
    }

    @GetMapping("/sendForObject")
    public String sendForObject() {
        MessageVO messageVO = new MessageVO();
        messageVO.setKey(UUID.randomUUID().toString());
        messageVO.setMsg("hello ");
        messageVO.setIds(Set.of("1", "2"));
        messageVO.setCreateTime(LocalDateTime.now());
        streamBridge.send("out-0", messageVO);
        return "success";
    }

    @GetMapping("/send1")
    public String send1() {
        MessageVO messageVO = new MessageVO();
        messageVO.setKey(UUID.randomUUID().toString());
        messageVO.setMsg("hello ");
        messageVO.setCreateTime(LocalDateTime.now());
        streamBridge.send("out-1", messageVO);
        return "success";
    }

}
