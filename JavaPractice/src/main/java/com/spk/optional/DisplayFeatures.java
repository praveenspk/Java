package com.spk.optional;

import java.util.Optional;

import com.spk.withoutOptional.ScreenResolution;

public class DisplayFeatures {

	private String size; // In inches
	private Optional<ScreenResolution> resolution;

	public DisplayFeatures(String size, Optional<ScreenResolution> resolution){
		this.size = size;
		this.resolution = resolution;
	}

	public String getSize() {
		return size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}

}