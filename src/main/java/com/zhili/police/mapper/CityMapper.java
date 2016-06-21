package com.zhili.police.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhili.police.domain.City;



public interface CityMapper {
	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);
}
