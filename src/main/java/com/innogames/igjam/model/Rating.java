package com.innogames.igjam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Rating {

	@Id
	@GeneratedValue
	private Integer id;

	private Integer score;

	@Column(columnDefinition = "TEXT")
	private String text;

	private LocalDateTime posted;

	@ManyToOne
	private Game game;

	@ManyToOne
	private User user;
}
