package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId ,int offset,int limit);

    //@Param注解用于给参数取别名
    //如果只有一个参数，并且需要拼动态sql，那么必须要给这个参数用该注解
    int selectDiscussPostRows(@Param("userId")int userId);





}
