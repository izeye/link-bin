package com.izeye.linkbin.core.web;

import com.izeye.linkbin.core.domain.Link;
import com.izeye.linkbin.core.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by izeye on 15. 12. 6..
 */
@Controller
@RequestMapping(path = "/link-bin")
public class HomeController {
	
	@Autowired
	private LinkService linkService;
	
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Link> links = linkService.findAll();
		model.addAttribute("links", links);
		return "index";
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String add() {
		return "add";
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(Link link) {
		linkService.add(link);
		return "redirect:list";
	}
	
}
