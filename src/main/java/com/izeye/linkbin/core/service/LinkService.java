package com.izeye.linkbin.core.service;

import com.izeye.linkbin.core.domain.Link;

import java.util.List;

/**
 * Created by izeye on 15. 12. 6..
 */
public interface LinkService {
	
	List<Link> findAllInReverseOrder();
	
	void add(Link link);
	
}
