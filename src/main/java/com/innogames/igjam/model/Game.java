package com.innogames.igjam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Game {

	@Id
	@GeneratedValue
	private Integer id;

	private String title;

	private String slug;

	private LocalDateTime created;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(columnDefinition = "TEXT")
	private String technology;

	@Column(columnDefinition = "TEXT")
	private String help;

	private boolean isDeleted;

	private boolean hasCheated;

	@ManyToOne
	private Jam jam;

	@ManyToOne
	private Team team;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comment> comments;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Rating> ratings;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GamePackage> packages;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GameScreenshot> screenshots;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Vote> votes;
}
