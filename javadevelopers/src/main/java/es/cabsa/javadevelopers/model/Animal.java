package es.cabsa.javadevelopers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal implements Serializable{
    
    private static final long serializableUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "name")
	private String name;

    @Column(name = "legs")
	private int legs;


    //Constructors
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

    //Constructors
	public Animal(Long id, String name, int legs) {
		super();
		this.id = id;
		this.name = name;
        this.legs = legs;
	}


    //Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public int getLegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
}
