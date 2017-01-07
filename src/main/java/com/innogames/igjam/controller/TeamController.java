package com.innogames.igjam.controller;

import com.innogames.igjam.model.Jam;
import com.innogames.igjam.model.Team;
import com.innogames.igjam.repository.JamRepository;
import com.innogames.igjam.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TeamController {

	@Autowired
	private JamRepository jamRepository;

	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping(path = "/jams/{jamSlug}/team/{teamId}", method = RequestMethod.GET)
	public String getJamTeam(@PathVariable String jamSlug, @PathVariable String teamId) {
		Jam jam = jamRepository.findBySlug(jamSlug);
		Team team = teamRepository.findOne(Integer.valueOf(teamId));

		return "jam/team/info.html";
	}

	@RequestMapping(path = "/jams/{jamSlug}/team", method = RequestMethod.GET)
	public String getJamCurrentTeam(@PathVariable String jamSlug) {
		Jam jam = jamRepository.findBySlug(jamSlug);
		//ToDo user session
		//get current team via participation and redirect to team url (getJamTeam)
		return "";
	}
}
