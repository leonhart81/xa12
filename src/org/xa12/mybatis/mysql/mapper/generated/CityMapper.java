package org.xa12.mybatis.mysql.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xa12.model.bo.City;
import org.xa12.model.bo.CityExample;

public interface CityMapper {
    long countByExample(CityExample example);

	int deleteByExample(CityExample example);

	int insert(City record);

	int insertSelective(City record);

	List<City> selectByExample(CityExample example);

	int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

	int updateByExample(@Param("record") City record, @Param("example") CityExample example);
}