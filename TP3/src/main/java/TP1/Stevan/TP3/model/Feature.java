package TP1.Stevan.TP3.model;



public class Feature{
	private String type;
	private Geometry geometry;

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometries) {
		this.geometry = geometries;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
