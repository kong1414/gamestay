package cn.xmut.edu.gamestay.dao;

import cn.xmut.edu.gamestay.pojo.po.Account;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AccountMapper extends Mapper<Account> {
}