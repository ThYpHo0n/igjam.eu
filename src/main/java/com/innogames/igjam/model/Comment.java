package com.innogames.igjam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(columnDefinition = "TEXT")
	@NotNull
	private String text;

	@NotNull
	@ManyToOne
	private User user;

	@NotNull
	@ManyToOne
	private Game game;

	private LocalDateTime posted;
}
