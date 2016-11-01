package org.xa12.net.jersey.restful;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.xa12.core.ServiceGetter;
import org.xa12.mybatis.mysql.mapper.custom.WorldInfoMapper;

@Path("/WorldInfo")
public class WorldInfo {

	private static WorldInfoMapper mapper = ServiceGetter.getInstance().getQueryService().getWorldInfoMapper();
	
	@GET
	public List<HashMap<String, Object>> getAllCities() {return mapper.getAllCities();}
}
