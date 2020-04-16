package com.lilbecedary.ws.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lilbecedary.ws.service.ArtistService;
import com.lilbecedary.ws.shared.dto.ArtistDto;

@Service
public class ArtistServiceImpl implements ArtistService{

	@Override
	public List<ArtistDto> getArtists(Map<String, String> queryStrings) {
		if(queryStrings.isEmpty()) {
			
		}
		return null;
	}

	@Override
	public ArtistDto getArtist(String publicId) {
		// TODO Auto-generated method stub
		return null;
	}

}
