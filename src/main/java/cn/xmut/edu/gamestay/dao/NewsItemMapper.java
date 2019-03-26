package cn.xmut.edu.gamestay.dao;

import cn.xmut.edu.gamestay.pojo.po.NewsItem;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface NewsItemMapper extends Mapper<NewsItem> {
}