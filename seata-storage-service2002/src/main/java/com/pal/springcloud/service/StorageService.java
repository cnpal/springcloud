package com.pal.springcloud.service;

public interface StorageService {
    void decrease(Long productId, Integer count);
}
