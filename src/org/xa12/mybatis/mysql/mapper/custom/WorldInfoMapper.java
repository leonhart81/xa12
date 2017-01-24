package org.xa12.mybatis.mysql.mapper.custom;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WorldInfoMapper {
	
	List<HashMap<String, Object>> getAllCities();
	List<HashMap<String, Object>> getCitiesByCountryCode(@Param("countryCode") String countryCode);
	
	List<HashMap<String, Object>> getAllCountries();
	HashMap<String, Object> getCountryByCountryCode(@Param("countryCode") String countryCode);
	
	List<HashMap<String, Object>> getAllCountryLanguages();
	List<HashMap<String, Object>> getCountryLanguagesByCode(@Param("countryCode") String countryCode);
}
