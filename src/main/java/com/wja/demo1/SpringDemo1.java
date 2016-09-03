package com.wja.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by wangweixin on 16/9/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class SpringDemo1 {
    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void demo1() {

        try {
            accountService.zhuanzhang("aaa", "bbb", 200d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
