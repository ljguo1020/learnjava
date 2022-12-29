package com.ljguo.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional
    void method(String addAccount, String subAccount, Integer money);
}
