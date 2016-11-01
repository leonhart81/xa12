package org.xa12.core.services.impl;

import org.xa12.core.services.QueryService;
import org.xa12.mybatis.mysql.mapper.custom.WorldInfoMapper;

public class QueryServiceImpl implements QueryService {
	
	private WorldInfoMapper worldInfoMapper;
	
	@Override
	public WorldInfoMapper getWorldInfoMapper() {return worldInfoMapper;}

	@Override
	public void setWorldInfoMapper(WorldInfoMapper worldInfoMapper) {this.worldInfoMapper = worldInfoMapper;}
}
