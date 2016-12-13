package com.innogames.igjam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class GameScreenshot {

	@Id
	@GeneratedValue
	private Integer id;

	private String caption;

	private String url;

	private Integer index;

	@NotNull
	@ManyToOne
	private Game game;

	private byte[] screenshot;
}
