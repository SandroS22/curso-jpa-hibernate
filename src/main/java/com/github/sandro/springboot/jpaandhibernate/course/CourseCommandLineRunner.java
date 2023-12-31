package com.github.sandro.springboot.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.sandro.springboot.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Curso Java Jpa", "Sandro"));
		repository.save(new Course(2, "Curso Python Jpa", "Sandro"));
		repository.save(new Course(3, "Curso Springboot Jpa", "Sandro"));
		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));

		System.out.println(repository.findAll());
		System.out.println(repository.count());

		System.out.println(repository.findByAuthor("Sandro"));
		System.out.println(repository.findByAuthor(""));

		System.out.println(repository.findByName("Curso Python Jpa"));
		System.out.println(repository.findByName(""));
	}

}
