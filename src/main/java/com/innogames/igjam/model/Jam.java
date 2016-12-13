package com.innogames.igjam.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Jam {

	@Id
	@GeneratedValue
	private Integer id;

	private String slug;

	private String title;

	private String theme;

	private String location;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(columnDefinition = "TEXT")
	private String restrictions;

	private LocalDateTime announced;

	private LocalDateTime startTime;

	private Integer teamLimit;

	//private Integer participantLimit;

	private Integer registrationDuration;

	private Integer packagingDuration;

	private Integer ratingDuration;

	private Integer duration;

	private Integer lastNotification;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Game> games;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Participation> participants;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Team> teams;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<JamPhoto> photos;
}
