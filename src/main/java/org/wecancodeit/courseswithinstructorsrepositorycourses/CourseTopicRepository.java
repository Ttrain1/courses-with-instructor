package org.wecancodeit.courseswithinstructorsrepositorycourses;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.courseswithinstructorsmodel.CourseTopic;

	public interface CourseTopicRepository extends CrudRepository<CourseTopic, Long>{
		
	}
