package org.tomo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.tomo.domain.BoardVO;
import org.tomo.service.BoardService;
import org.tomo.domain.PageMaker;
import org.tomo.domain.SearchCriteria;

@Controller
@RequestMapping("/board")
public class BoardController {
		
	@Autowired
	private BoardService service;
	
	  @RequestMapping(value = "/list", method = RequestMethod.GET)
	  public void listAll(Model model, BoardVO vo) throws Exception {
		  System.out.println("유경호 테스트");
	   
	    model.addAttribute("list", service.boardAllList(vo));
	  }

	  @RequestMapping(value = "/readPage", method = RequestMethod.GET)
	  public void read(@RequestParam("boardVO") BoardVO vo, Model model) throws Exception {

	    model.addAttribute(service.boardRead(vo));
	  }
}
