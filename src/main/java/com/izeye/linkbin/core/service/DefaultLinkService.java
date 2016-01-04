package com.izeye.linkbin.core.service;

import com.izeye.linkbin.core.domain.Link;
import com.izeye.linkbin.core.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by izeye on 15. 12. 6..
 */
@Service
public class DefaultLinkService implements LinkService {
	
	@Autowired
	private LinkRepository linkRepository;
	
	@Override
	public List<Link> findAllInReverseOrder() {
		return linkRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
	}

	@Override
	public void add(Link link) {
		linkRepository.save(link);
	}

}
