package com.jim.PPMTool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jim.PPMTool.domain.Project;
import com.jim.PPMTool.repository.ProejctRepository;

@Service
public class ProjectService {
	@Autowired
	private ProejctRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		//Logic
		return projectRepository.save(project);
	}
}
