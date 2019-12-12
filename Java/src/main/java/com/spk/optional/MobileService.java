package com.spk.optional;

import java.util.Optional;

import com.spk.withoutOptional.ScreenResolution;
/**
 * @author Praveen
 *
 */
public class MobileService {

  public Integer getMobileScreenWidth(Optional<Mobile> mobile){
	return mobile.flatMap(Mobile::getDisplayFeatures)
		 .flatMap(DisplayFeatures::getResolution)
		 .map(ScreenResolution::getWidth)
		 .orElse(0);

  }

}
