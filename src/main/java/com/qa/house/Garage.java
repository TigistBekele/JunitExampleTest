package com.qa.house;

import java.util.List;

import com.qa.Vehicles;

public class Garage {

	protected List<Vehicles> contents;
	protected Door mainShutter;

	public Garage(List<Vehicles> contents) {
		super();
		this.contents = contents;
	}

	public List<Vehicles> getContents() {
		return contents;
	}

	public void setContents(List<Vehicles> contents) {
		this.contents = contents;
	}
	
	
	public void addVechicles(Vehicles vehicle) {
		
		
	}
	
}


