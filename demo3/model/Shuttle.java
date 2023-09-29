package com.demo3.model;

public class Shuttle {
	private String shuttleID;
	private int shuttleNumber;
	private int shuttleCapacity;
	public String getShuttleID() {
		return shuttleID;
	}
	public void setShuttleID(String shuttleID) {
		this.shuttleID = shuttleID;
	}
	public int getShuttleNumber() {
		return shuttleNumber;
	}
	public void setShuttleNumber(int shuttleNumber) {
		this.shuttleNumber = shuttleNumber;
	}
	public int getShuttleCapacity() {
		return shuttleCapacity;
	}
	public void setShuttleCapacity(int shuttleCapacity) {
		this.shuttleCapacity = shuttleCapacity;
	}
	public Shuttle(String shuttleID, int shuttleNumber, int shuttleCapacity) {
		super();
		this.shuttleID = shuttleID;
		this.shuttleNumber = shuttleNumber;
		this.shuttleCapacity = shuttleCapacity;
	}
	@Override
	public String toString() {
		return "Shuttle [shuttleID=" + shuttleID + ", shuttleNumber=" + shuttleNumber + ", shuttleCapacity="
				+ shuttleCapacity + "]";
	}
	
	
	
}
