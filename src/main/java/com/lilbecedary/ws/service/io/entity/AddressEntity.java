package com.lilbecedary.ws.service.io.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="addresses")
public class AddressEntity implements Serializable{

	private static final long serialVersionUID = -8681089719172190681L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false, length=36)
	private String publicId;
	
	@Column(nullable=false, length=15)
	private String city;
	
	@Column(nullable=false, length=15)
	private String country;
	
	@OneToMany
	@JoinColumn(name="artist_id")
	private List<ArtistEntity> artistDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressId() {
		return publicId;
	}

	public void setAddressId(String addressId) {
		this.publicId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<ArtistEntity> getArtistDetails() {
		return artistDetails;
	}

	public void setArtistDetails(List<ArtistEntity> artistDetails) {
		this.artistDetails = artistDetails;
	}
	
	
}
