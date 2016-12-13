package com.innogames.igjam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Invitation {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Team team;

	@ManyToOne
	private User user;
}
