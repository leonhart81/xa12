package org.xa12.test.core;

import org.xa12.core.ServiceGetter;
import org.xa12.mybatis.mysql.mapper.custom.WorldInfoMapper;

public class QueryServiceWorldInfoMapperTest {
	
	private WorldInfoMapper mapper;
	
	public QueryServiceWorldInfoMapperTest() {
		mapper = ServiceGetter.getInstance().getQueryService().getWorldInfoMapper();
	}
	
	public void test() {
		System.out.println("[selectAllCities] " + mapper.getAllCities());
	}
	
	public static void main(String[] args) {
		new QueryServiceWorldInfoMapperTest().test();
	}
}
