package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BenzSuv extends AbsBenz {
	private final static String G_SERIES = "Gϵ��SUV";
	
	@Override
	public String getModel() {
		return G_SERIES;
	}

}
