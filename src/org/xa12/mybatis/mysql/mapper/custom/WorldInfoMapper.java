package org.xa12.mybatis.mysql.mapper.custom;

import java.util.HashMap;
import java.util.List;

public interface WorldInfoMapper {
	
	List<HashMap<String, Object>> selectAllCities();
}
