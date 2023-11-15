package com.lyasha.cf.base;

public class CloudflareApiException extends RuntimeException {

    public CloudflareApiException(String message) {
        super(message);
    }

    public CloudflareApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
