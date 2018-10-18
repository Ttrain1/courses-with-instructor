package org.wecancodeit.courseswithinstructorscontroller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.wecancodeit.courseswithinstructorsrepository.InstructorRepository;

@Controller
public class InstructorController {

	@Resource
	InstructorRepository instrutorRepo;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
}
