package TP1.Stevan.TP3.model;

import java.util.ArrayList;
import java.util.List;

public class EtalabAPIAddress{
	private List<Feature> features = new ArrayList<>();

	public Feature getFeatures() {
		return features.get(0);
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

}
