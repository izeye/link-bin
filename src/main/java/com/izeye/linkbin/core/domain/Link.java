package com.izeye.linkbin.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by izeye on 15. 12. 6..
 */
@Entity
@Data
public class Link {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String url;
	
	public Link() {
	}
	
	public Link(String url) {
		this.url = url;
	}
	
}
