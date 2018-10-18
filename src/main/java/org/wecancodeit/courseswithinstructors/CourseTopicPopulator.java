package org.wecancodeit.courseswithinstructors;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.courseswithinstructorsmodel.CourseTopic;
import org.wecancodeit.courseswithinstructorsmodel.Instructor;
import org.wecancodeit.courseswithinstructorsrepository.InstructorRepository;
import org.wecancodeit.courseswithinstructorsrepositorycourses.CourseTopicRepository;

@Service
public class CourseTopicPopulator implements CommandLineRunner {

	@Resource
	InstructorRepository instructorRepo;
	@Resource
	CourseTopicRepository courseTopicRepo;
	
	@Override
	public void run(String...args) throws Exception {
		
		instructorRepo.save(new Instructor("Don","Hamilton"));
		instructorRepo.save(new Instructor("Brian", "Forsythe"));
		instructorRepo.save(new Instructor("Alan" , "Kostrick"));
		courseTopicRepo.save(new CourseTopic("Sexy Dancing", "Seductive Krunk dancing set to 19th century Waltzes"));
		courseTopicRepo.save(new CourseTopic("Inspirational Badminten", "Inspiring youths through active badminton-based learning."));
		courseTopicRepo.save(new CourseTopic("New Wave Hair Styling", "Load up on gel and hair-spray for this exotic voyage into the grim stylings of 1980s new-wave hair styles."));
		courseTopicRepo.save(new CourseTopic("High Octane Alligator Racing", "Learn the ins-and-outs of high-stakes gambling, reptilian animal husbandry: are you willing to risk it all?!?"));
		

	}
	

}