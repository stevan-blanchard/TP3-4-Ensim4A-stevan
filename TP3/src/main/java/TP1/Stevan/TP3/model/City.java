package TP1.Stevan.TP3.model;

public class City {
	private int insee;
	private int cp;
	private String name;
	private float latitude;
	private float longitude;

	private int altitude;
	
	public int getInsee() {
		return insee;
	}
	public void setInsee(int insee) {
		this.insee = insee;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	
}
