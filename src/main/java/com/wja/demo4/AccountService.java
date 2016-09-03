package com.wja.demo4;

/**
 * Created by wangweixin on 16/9/3.
 * 转账借口
 */
public interface AccountService {
    /**
     * @param out 转出账号
     * @param in 转入账号
     * @param money  转账金额
     */
    public void zhuanzhang(String out, String in, Double money);
}
