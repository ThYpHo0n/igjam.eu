package com.innogames.igjam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Participation {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Team team;

	@ManyToOne
	private Jam jam;

	@ManyToOne
	private User user;

	private boolean showInFinder;

	private LocalDateTime registered;
}
