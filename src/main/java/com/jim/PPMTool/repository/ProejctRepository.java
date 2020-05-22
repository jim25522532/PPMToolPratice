package com.jim.PPMTool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jim.PPMTool.domain.Project;

@Repository
public interface ProejctRepository extends CrudRepository<Project , Long>{
	
	@Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
