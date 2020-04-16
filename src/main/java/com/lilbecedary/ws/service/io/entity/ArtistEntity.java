package com.lilbecedary.ws.service.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ArtistEntity implements Serializable{
	private static final long serialVersionUID = 1374431032654620915L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false, length=36)
	private String publicId;
	
}
