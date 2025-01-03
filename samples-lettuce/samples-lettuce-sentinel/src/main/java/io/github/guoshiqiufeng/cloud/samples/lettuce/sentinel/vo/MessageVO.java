package io.github.guoshiqiufeng.cloud.samples.lettuce.sentinel.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author yanghq
 * @version 1.0
 * @since 2025/1/3 14:52
 */
@Data
public class MessageVO implements Serializable {

    private static final long serialVersionUID = 807173843169199376L;

    private String msg;

    private String key;

    private Set<String> ids;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
