package com.nowcoder.mapper;

import com.nowcoder.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    int selectDiscussPostRows(int userId);






}
