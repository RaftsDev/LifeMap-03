package com.lifemap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="branches")
public class Branches{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="parent_id")
	private int parentId;
	
	@Column(name="for_tasks_id")
	private int forTasksId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="short_desc")
	private String shortDesc;

	public Branches() {
		
	}

	public Branches(int parentId, String name) {
		this.parentId = parentId;
		this.forTasksId = parentId;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getForTasksId() {
		return forTasksId;
	}

	public void setForTasksId(int forTasksId) {
		this.forTasksId = forTasksId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	@Override
	public String toString() {
		return "Branches [id=" + id + ", parentId=" + parentId + ", forTasksId=" + forTasksId + ", name=" + name
				+ ", shortDesc=" + shortDesc + "]";
	}
	
	
	
	
	
}