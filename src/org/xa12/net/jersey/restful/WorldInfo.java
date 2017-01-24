package org.xa12.net.jersey.restful;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.xa12.core.ServiceGetter;
import org.xa12.mybatis.mysql.mapper.custom.WorldInfoMapper;

@Path("/WorldInfo")
public class WorldInfo {

	private static WorldInfoMapper mapper = ServiceGetter.getInstance().getQueryService().getWorldInfoMapper();
	
	@GET
	@Path("/AllCities")
	public List<HashMap<String, Object>> getAllCities() {return mapper.getAllCities();}
	
	@GET
	@Path("/AllCountries")
	public List<HashMap<String, Object>> getAllCountries() {return mapper.getAllCountries();}
	
	@GET
	@Path("/AllCountryLanguages")
	public List<HashMap<String, Object>> getAllCountryLanguages() {return mapper.getAllCountryLanguages();}
	
	@GET
	@Path("/Countries")
	public HashMap<String, Object> getCountryByCountryCode(@QueryParam("code") String code) {
		return mapper.getCountryByCountryCode(code);
	}
	
	@GET
	@Path("/Cities")
	public List<HashMap<String, Object>> getCitiesByCountryCode(@QueryParam("countryCode") String countryCode) {
		return mapper.getCitiesByCountryCode(countryCode);
	}
	
	@GET
	@Path("/Languages")
	public List<HashMap<String, Object>> getCountryLanguagesByCode(@QueryParam("countryCode") String countryCode) {
		return mapper.getCountryLanguagesByCode(countryCode);
	}
}
