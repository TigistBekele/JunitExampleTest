package com.qa.house;

import java.util.ArrayList;

public class House {

	protected Door frontDoor;
	protected ArrayList<Windows> propertiyWindows;
	
	protected String address;
	protected Garage attachedGarage;
	
	public House() {
		
	}
	
	public House(Door frontDoor, ArrayList<Windows> propertiyWindows, String address, Garage attachedGarage) {
		super();
		this.frontDoor = frontDoor;
		this.propertiyWindows = propertiyWindows;
		this.address = address;
		this.attachedGarage = attachedGarage;
	}

	
	public boolean openFrontDoor() {
		return this.frontDoor.openDoor();
	}
	public boolean closeFrontDoor() {
		return this.frontDoor.closeDoor();
	}
	
}

