package org.maatalla.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Role implements Serializable {
   @Id
   private String role;
   private String description;
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getDescription() {
	return description;
}
public Role() {
	super();
}
public void setDescription(String description) {
	this.description = description;
}
}
