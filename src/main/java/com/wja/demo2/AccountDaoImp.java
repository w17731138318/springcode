package com.wja.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by wangweixin on 16/9/3.
 * 转账Dao接口实现
 */
public class AccountDaoImp extends JdbcDaoSupport implements AccountDao {
    /**
     * @param out   转出账号
     * @param money 转账金额
     */
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     * @param in    转入账号
     * @param money 转账金额
     */
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }

    public static void main(String[] args) {
        AccountDaoImp a =new AccountDaoImp();
        a.inMoney("aaa",100D);
    }
}
