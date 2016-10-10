package com.kangdainfo.tcmf.mybatis.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xa12.model.bo.Country;
import org.xa12.model.bo.CountryExample;

public interface CountryMapper {
    long countByExample(CountryExample example);

	int deleteByExample(CountryExample example);

	int insert(Country record);

	int insertSelective(Country record);

	List<Country> selectByExample(CountryExample example);

	int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

	int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);
}