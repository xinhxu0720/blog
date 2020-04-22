package com.visionvera.dao.xinhxu;


import com.visionvera.vo.Message;
import org.apache.ibatis.annotations.Param;
import scala.Int;

import java.util.List;

public interface MessageDao {

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> querAll(@Param("type") int type);

    List<Message> findone(String createDate);
}