package com.wja.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by wangweixin on 16/9/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {

    /**
     * 注入代理类:代理类对事务进行了管
     */
    //@Resource(name="accountService")
    @Resource(name="accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo() {
        accountService.zhuanzhang("aaa", "bbb", 200d);
    }
}
