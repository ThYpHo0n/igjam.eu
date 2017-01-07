/*package com.innogames.igjam.service;

import net.bican.wordpress.FilterPost;
import net.bican.wordpress.Post;
import net.bican.wordpress.Term;
import net.bican.wordpress.Wordpress;
import net.bican.wordpress.exceptions.InsufficientRightsException;
import net.bican.wordpress.exceptions.InvalidArgumentsException;
import net.bican.wordpress.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.util.List;

@Component
public class WordpressService {

	@Value("${wordpress.username}")
	private String username;

	@Value("${wordpress.password}")
	private String password;

	@Value("${wordpress.url}")
	private String url;

	private Wordpress wordpress;

	public WordpressService() throws MalformedURLException {
		wordpress = new Wordpress(username, password, url);
	}

	public Post getPostById(Integer id) throws InsufficientRightsException, ObjectNotFoundException {
		return wordpress.getPost(id);
	}

	public List<Post> getPosts() {
		FilterPost filter = new FilterPost();
		filter.setPost_status("publish");

		return wordpress.getPosts(filter);
	}

	public List<Term> getCategories() throws InsufficientRightsException, InvalidArgumentsException {
		return wordpress.getTerms("category");
	}
}
*/
