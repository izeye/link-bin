package com.izeye.linkbin.core.repository;

import com.izeye.linkbin.Application;
import com.izeye.linkbin.core.domain.Link;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by izeye on 15. 12. 6..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class LinkRepositoryTests {
	
	@Autowired
	LinkRepository linkRepository;
	
	@Test
	@Transactional
	public void test() {
		Link link = new Link("http://www.google.com");
		Link saved = linkRepository.save(link);

		Link found = linkRepository.findOne(saved.getId());
		assertThat(found, is(link));
	}
	
	@Test
	public void testFindAllInReverseOrder() {
		List<Link> links = linkRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
		links.forEach(System.out::println);
	}
	
}
