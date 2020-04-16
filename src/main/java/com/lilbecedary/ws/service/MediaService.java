package com.lilbecedary.ws.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lilbecedary.ws.shared.dto.MediaDto;

@Service
public interface MediaService {
	List<MediaDto> getMedias(Map<String,String> queryStrings);
	MediaDto getMedia(String publicId);
}
