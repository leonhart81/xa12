package org.xa12.core;

public class ServiceGetter {
	
	private static ServiceGetter instance = null;
	
	private ServiceGetter(){}
	
	public static ServiceGetter getInstance() {
		if (instance == null) {
			synchronized(ServiceGetter.class) {
				if (instance == null) {
					instance = new ServiceGetter();
				}
			}
		}
		return instance;
	}
}
