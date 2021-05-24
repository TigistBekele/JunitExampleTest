package com.qa.house;

public class Door {

	
	protected boolean isOpen;
	
	
	public Door() {
		super();
		isOpen = false;
	}

	public Door(boolean isOpen) {
		super();
		this.isOpen = isOpen;
	}
		public boolean openDoor() {
			return isOpen = true;
		}
		public boolean closeDoor() {
			return isOpen = false;
		}
		
		public boolean isOpen() {
			return isOpen;
		}
}




