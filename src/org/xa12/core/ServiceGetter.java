package org.xa12.core;

import org.xa12.core.services.QueryService;

public class ServiceGetter {
	
	private QueryService queryService;
	
	private static ServiceGetter instance;
	
	private ServiceGetter(){}
	
	public static ServiceGetter getInstance() {
		if (instance != null) {
			throw new RuntimeException(ServiceGetter.class.getClass() + " is designed to be singleton, the instance has already existed!");
		}
		return instance;
	}

	public QueryService getQueryService() {return queryService;}

	public void setQueryService(QueryService queryService) {this.queryService = queryService;}
}
