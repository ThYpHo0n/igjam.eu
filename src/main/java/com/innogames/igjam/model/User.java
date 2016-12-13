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
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	private String username;

	private byte[] password;

	private Integer token;

	private String email;

	private String newEmail;

	private boolean isAdmin;

	private boolean isVerified;

	private boolean isDeleted;

	private LocalDateTime registered;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Rating> ratings;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comment> comments;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Invitation> invites;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Participation> participations;

	private boolean abilityProgrammer;

	private boolean abilityGamedesigner;

	private boolean ability2dartist;

	private boolean ability3dartist;

	private boolean abilityComposer;

	private boolean abilitySounddesigner;

	private String location;

	private String locationCoords;

	private String locationDisplay;

	private String locationFlag;

	private String realName;

	private String website;

	private String avatar;

	private String pmMode;

	private boolean notifyNewJam;

	private boolean notifyJamStart;

	private boolean notifyJamFinish;

	private boolean notifyGameComment;

	private boolean notifyTeamInvitation;

	private boolean notifyNewsletter;

	@Column(columnDefinition = "TEXT")
	private String about;
}
