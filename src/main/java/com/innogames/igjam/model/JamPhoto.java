package com.innogames.igjam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class JamPhoto {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Jam jam;

	private byte[] photo;
}
