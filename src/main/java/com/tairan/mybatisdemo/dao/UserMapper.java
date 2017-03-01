package com.tairan.mybatisdemo.dao;


import com.tairan.mybatisdemo.model.User;
import org.apache.ibatis.annotations.*;

import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    String deleteByPrimaryKey="DELETE FROM user WHERE id =#{id}";

    String insert="INSERT INTO USER(ID,USERNAME,PASSWORD,AGE) VALUES(#{id},#{userName},#{password},#{age})";

    String select="SELECT * FROM USER";

    String selectBiId="SELECT * FROM user WHERE id = #{id}";

    String updateByPrimaryKey="UPDATE user SET username=#{userName},age=#{age} WHERE id=#{id}";




    @Delete(deleteByPrimaryKey)
    int deleteByPrimaryKey(Integer id);

    @Insert(insert)
    int insert(User user);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "password", column = "password"),
            @Result(property = "age", column = "age")
    })
    @SelectProvider(type = SqlProvider.class,method = "selectAllUser")
    List<User> select();

    @SelectProvider(type = SqlProvider.class,method = "selectUserCheck")
    List<User> combine(User user);

    @Select(selectBiId)
    User selectById(@Param("id") int id);

    @Update(updateByPrimaryKey)
    int updateByPrimaryKey(User user);
}