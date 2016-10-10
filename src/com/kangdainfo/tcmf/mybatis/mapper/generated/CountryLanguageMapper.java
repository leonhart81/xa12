package com.kangdainfo.tcmf.mybatis.mapper.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.xa12.model.bo.CountryLanguage;
import org.xa12.model.bo.CountryLanguageExample;

public interface CountryLanguageMapper {
    long countByExample(CountryLanguageExample example);

    int deleteByExample(CountryLanguageExample example);

    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);

    List<CountryLanguage> selectByExample(CountryLanguageExample example);

    int updateByExampleSelective(@Param("record") CountryLanguage record, @Param("example") CountryLanguageExample example);

    int updateByExample(@Param("record") CountryLanguage record, @Param("example") CountryLanguageExample example);
}