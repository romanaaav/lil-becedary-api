package com.lilbecedary.ws.service;

import java.util.List;
import java.util.Map;

import com.lilbecedary.ws.shared.dto.ArtistDto;

public interface ArtistService {
	List<ArtistDto> getArtists(Map<String, String> queryStrings);
	ArtistDto getArtist(String publicId);
}
