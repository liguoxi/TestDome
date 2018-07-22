package com.liguoxi.mapper;

import com.liguoxi.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface Notice2Mapper {
    @Select("select * from notice")
    List<Notice> queryAllNotice();

    Long count();
    List<Notice> findByPage(@Param("p")Long start,@Param("r") Long rows);
}
