package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="questions")
//@Getter
//@Setter
public class Question {
	@Id
	@GeneratedValue( strategy =GenerationType.IDENTITY)
	private int id;
	private String question;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Level level;
	
	@OneToMany(mappedBy = "question")
	private List <Answer> answers;
	
}
