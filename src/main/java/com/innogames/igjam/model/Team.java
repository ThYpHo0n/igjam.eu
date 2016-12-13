package com.innogames.igjam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Jam jam;

	private String name;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(columnDefinition = "TEXT")
	private String livestreams;

	private String irc;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Participation> members;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Invitation> invites;

	@ManyToOne
	private Game game;
}
