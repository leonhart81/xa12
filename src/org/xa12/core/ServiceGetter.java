package org.xa12.core;

import org.xa12.core.services.QueryService;

public class ServiceGetter {
	
	private QueryService queryService;
	
	private static ServiceGetter instance;
	
	public ServiceGetter() {
		if (ServiceGetter.instance != null) {
			throw new RuntimeException(this.getClass().getName() + "is designed to be a Singleton, the instance already exist:"
					+ ServiceGetter.instance);
		}
		ServiceGetter.instance = this;
	}
	
	public static ServiceGetter getInstance() {
		return instance;
	}

	public QueryService getQueryService() {return this.queryService;}

	public void setQueryService(QueryService queryService) {this.queryService = queryService;}
}
