package com.lilbecedary.ws.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lilbecedary.ws.service.io.entity.ArtistEntity;

@Repository
public interface ArtistRepository extends PagingAndSortingRepository<ArtistEntity, Long>{
	ArtistEntity findByPublicId(String publicId);
}
