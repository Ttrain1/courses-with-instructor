package org.wecancodeit.courseswithinstructorsrepository;


import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.courseswithinstructorsmodel.Instructor;

	public interface InstructorRepository extends CrudRepository<Instructor, Long>{
		
	}
