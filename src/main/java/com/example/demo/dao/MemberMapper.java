package com.example.demo.dao;

import com.example.demo.model.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM member WhERE no = #{no}")
    Member selectMember(long no);

    // 쿼리를 분리한 메소드
    Member selectMember2(long no);
}
