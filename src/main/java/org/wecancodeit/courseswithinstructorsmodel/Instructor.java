package org.wecancodeit.courseswithinstructorsmodel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {

	public Instructor() {}
	
	public Instructor( String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastname;
	
	
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastname() {
		return lastname;
	}
	
	@OneToMany
	(mappedBy="instructor")
	private Set<CourseTopic> courses  = new HashSet<CourseTopic>();
}
