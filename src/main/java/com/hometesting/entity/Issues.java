package com.hometesting.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="issue")
public class Issues {
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long issueId;
	@Column
	private IssueType type;
	private List<IssueStage> changeLogs;
	private Stage current_state;
	@Column
	private Date updatedAt;
	@Column
	private Date deletedAt;
	@Column
	private Date createDate;
	
	
	

}
