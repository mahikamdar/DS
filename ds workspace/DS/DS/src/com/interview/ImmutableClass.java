package com.interview;

import java.util.List;

public final class ImmutableClass {

	private final String name;
	private final String id;
	private final List<String> l;
	public ImmutableClass(String name, String id, List<String> l) {
		super();
		this.name = name;
		this.id = id;
		this.l= l;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @return the l
	 */
	public List<String> getL() {
		return l;
	}



	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", id=" + id + ", l=" + l + "]";
	}



	
	
	
}