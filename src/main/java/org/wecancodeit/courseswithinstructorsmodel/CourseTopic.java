package org.wecancodeit.courseswithinstructorsmodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseTopic {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String decscription;
	
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDecscription() {
		return decscription;
	}
	public CourseTopic() {}
	
	public CourseTopic(String name, String decscription) {
		super();
		this.name = name;
		this.decscription = decscription;
	}
	@ManyToOne
	
	
}
