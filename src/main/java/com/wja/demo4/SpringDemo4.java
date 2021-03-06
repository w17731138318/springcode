package com.wja.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring声明式事务管理方式三:基于注解的管理方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {

    /**
     * 注入代理类:代理类对事务进行了管
     */
    @Resource(name="accountService")
    private AccountService accountService;

    @Test
    public void demo() {
        accountService.zhuanzhang("aaa", "bbb", 200d);
    }
}
