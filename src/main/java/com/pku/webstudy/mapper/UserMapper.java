package com.pku.webstudy.mapper;

import com.pku.webstudy.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author Yorke
 * @Date 2020/3/14 19:34
 */
@Component
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (name, account_id, token, gmt_create, gmt_modify) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModify})")
    void insert(User user);

    @Select("SELECT * FROM user WHERE token = #{token}")
    User findByToken(@Param("token") String token); //参数不是类时，需要@param注解
}
