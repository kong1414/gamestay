package cn.xmut.edu.gamestay.dao;

import cn.xmut.edu.gamestay.pojo.po.Game;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface GameMapper extends Mapper<Game> {
}