package com.innogames.igjam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GamePackage {

	@Id
	@GeneratedValue
	private Integer id;

	private String url;

	@ManyToOne
	private Game game;

	private String type;

	private byte[] data;
}
