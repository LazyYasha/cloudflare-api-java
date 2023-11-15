package com.lyasha.cf.base;

import lombok.Data;

@Data
public class CloudflareApiResponse<T> {

    private boolean success;
    private T result;
}
