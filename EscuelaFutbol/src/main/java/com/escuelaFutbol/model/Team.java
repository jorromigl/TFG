package com.escuelaFutbol.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teams")
public class Team {

	@Id
	private String id;

	String name;

	Collection<User> jugadores;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void seName(String name) {
		this.name = name;
	}

	public Collection<User> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Collection<User> jugadores) {
		this.jugadores = jugadores;
	}

	public Team(String name, Collection<User> jugadores) {
		super();
		this.name = name;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", jugadores=" + jugadores + "]";
	}

}