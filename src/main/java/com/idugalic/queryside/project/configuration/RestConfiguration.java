package com.idugalic.queryside.project.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.idugalic.queryside.project.domain.Project;

/**
 * A configuration of rest data respositories for {@link Project}.
 * 
 * @author idugalic
 *
 */
@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter {
 
	  @Override
	    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
        config.exposeIdsFor(Project.class);
    }
  
}