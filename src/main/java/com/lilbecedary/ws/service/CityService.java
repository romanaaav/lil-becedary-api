package com.lilbecedary.ws.service;

import java.util.List;
import java.util.Map;

import com.lilbecedary.ws.shared.dto.CityDto;

public interface CityService {
	List<CityDto> getCities(Map<String, String> queryStrings);
	CityDto getCity(String publicId);
}
