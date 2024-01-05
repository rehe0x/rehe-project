package com.rehe.auth.admin.mapper;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author xiech
 * @description
 * @date 2024/1/4
 */
@Mapper
public interface UserTestMapper {
    @Select("SELECT * FROM admin_user")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
    public List<Map> test();
}
