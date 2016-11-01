package org.xa12.core.services;

import org.xa12.mybatis.mysql.mapper.custom.WorldInfoMapper;

public interface QueryService {
	
	WorldInfoMapper getWorldInfoMapper();
	void setWorldInfoMapper(WorldInfoMapper worldInfoMapper);
}
