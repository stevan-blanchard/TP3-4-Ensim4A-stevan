package TP1.Stevan.TP3.model;

import java.util.ArrayList;
import java.util.List;

public class Geometry{
	private String type;
	private List<Float> coordinates = new ArrayList<>();

	public float getCoordinates() {
		return coordinates.get(0);
	}

	public void setCoordinates(List<Float> coordinates) {
		this.coordinates = coordinates;
	}	
	public float getlatitude(){
		return coordinates.get(1);
	}
	public float getlongitude(){
		return coordinates.get(0);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}