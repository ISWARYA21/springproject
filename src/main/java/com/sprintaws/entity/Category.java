package com.sprintaws.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="catid")
	private int catid;
	
	@Column(name = "catname")
	private String categoryName;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "itemid", referencedColumnName = "item_id")
	//private Item item;
	 
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}