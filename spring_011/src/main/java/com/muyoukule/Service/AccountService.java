package com.muyoukule.Service;

import java.io.IOException;

public interface AccountService {
    /**
     * 转账操作
     *
     * @param out   传出方
     * @param in    转入方
     * @param money 金额
     */
    //配置当前接口方法具有事务
    public void transfer(String out, String in, Double money) throws IOException;
}