package org.xa12.core;

public class ServiceGetter {
	
	private static ServiceGetter instance;
	
	private ServiceGetter(){}
	
	public static ServiceGetter getInstance() {
		if (instance != null) {
			throw new RuntimeException(ServiceGetter.class.getClass() + " is designed to be singleton, the instance has already existed!");
		}
		return instance;
	}
}
