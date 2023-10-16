package com.github.sandro.springboot.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.sandro.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Curso Java Jpa", "Sandro"));
		repository.insert(new Course(2, "Curso Python Jpa", "Sandro"));
		repository.insert(new Course(3, "Curso Springboot Jpa", "Sandro"));
		repository.deleteById(1);

		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
