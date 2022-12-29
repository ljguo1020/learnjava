package com.ljguo.service.impl;

import com.ljguo.mapper.AccountMapper;
import com.ljguo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void method(String addAccount, String subAccount, Integer money) {
        accountMapper.add(addAccount,money);
        accountMapper.sub(subAccount,money);
    }
}
