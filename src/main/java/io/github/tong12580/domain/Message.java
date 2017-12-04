package io.github.tong12580.domain;

/**
 * @author yuton
 * @version 1.0
 * @description io.github.tong12580.domain
 * @since 上午10:37 2017/12/4
 */
public class Message {
    public static final Integer HELLO = 0;
    public static final Integer GOODBYE = 1;

    private String message;

    private Integer status;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
