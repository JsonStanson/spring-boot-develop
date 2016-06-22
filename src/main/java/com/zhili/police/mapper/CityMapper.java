package com.zhili.police.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhili.config.mybatis.MyMapper;
import com.zhili.police.domain.City;

public interface CityMapper extends MyMapper<City> {
	// @Insert("insert into city (name,state,country) values(#{name},#{state},
	// #{country})")
	void save(City city);

	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);
}
