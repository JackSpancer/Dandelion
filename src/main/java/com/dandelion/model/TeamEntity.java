package com.dandelion.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_teaminfo")
public class TeamEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 9)
	private int id;

	@Column(name = "teamname")
	private String teamname; 			// 球队名称
	
	@Column(name = "leader")
	private String leader; 				// 球队的领队

//	@Column(name = "Declaration", columnDefinition = "default null")
	@Column(name = "Declaration")
	private String Declaration; 		// 球队宣言

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "regdate")
	private Date regdate; 				// 组队日期

	@Column(name = "introduction ")
	private String introduction; 		// 球队介绍

	@Column(name = "mobile",  nullable = true, length = 13)
	private String mobile; 				//联系电话

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getDeclaration() {
		return Declaration;
	}

	public void setDeclaration(String declaration) {
		Declaration = declaration;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public TeamEntity() {
	}

	public TeamEntity(String teamname, String leader,
			String declaration, Date regdate, String introduction, String mobile) {
		this.teamname = teamname;
		this.leader = leader;
		Declaration = declaration;
		this.regdate = regdate;
		this.introduction = introduction;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "TeamEntity [id=" + id + ", teamname=" + teamname + ", leader="
				+ leader + ", Declaration=" + Declaration + ", regdate="
				+ regdate + ", introduction=" + introduction + ", mobile="
				+ mobile + "]";
	}
	
	
}
