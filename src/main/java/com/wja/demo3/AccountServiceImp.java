package com.wja.demo3;

/**
 * Created by wangweixin on 16/9/3.
 * 转账实现
 */
public class AccountServiceImp implements AccountService {

    private AccountDao accountDao;

    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    public void zhuanzhang(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int a=1/0;
        accountDao.inMoney(in, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
