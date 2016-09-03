package com.wja.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.w3c.dom.ranges.RangeException;

/**
 * Created by wangweixin on 16/9/3.
 * 转账实现
 */
public class AccountServiceImp implements AccountService{

    private AccountDao accountDao;


    //注入事务管理的模板
    private TransactionTemplate transactionTemplate;
    /**
     * @param out 转出账号
     * @param in 转入账号
     * @param money  转账金额
     */
    public void zhuanzhang(String out, String in, Double money) throws RuntimeException{

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {

                //异常被处理,所以不会回滚

//                try {
//                    accountDao.outMoney(out, money);
//                    int a=1/0;
//                    accountDao.inMoney(in, money);
//                } catch (Exception e) {
//                    System.out.println("异常被处理!");
//                }
                //异常不处理或继续抛出运行时异常,会回滚
                try {
                    accountDao.outMoney(out, money);
                    int a=1/0;
                    accountDao.inMoney(in, money);
                } catch (Exception e) {
                    System.out.println("异常被处理!");
                    throw new RuntimeException("抛出异常");
                }
            }
        });

    }
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
