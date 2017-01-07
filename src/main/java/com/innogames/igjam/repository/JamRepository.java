package com.innogames.igjam.repository;

import com.innogames.igjam.model.Jam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JamRepository extends CrudRepository<Jam, Integer> {

	Jam findBySlug(String slug);
}
