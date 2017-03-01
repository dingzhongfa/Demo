package com.tairan.mybatisdemo.dao;

import com.tairan.mybatisdemo.model.bill_transfer_guarantee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface bill_transfer_guaranteeMapper {
    int deleteByPrimaryKey(String id);

    int insert(bill_transfer_guarantee record);

    int insertSelective(bill_transfer_guarantee record);

    @Select("select * from bill_transfer_guarantee")
    List<bill_transfer_guarantee> selectAll();

    bill_transfer_guarantee selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(bill_transfer_guarantee record);

    int updateByPrimaryKey(bill_transfer_guarantee record);
}