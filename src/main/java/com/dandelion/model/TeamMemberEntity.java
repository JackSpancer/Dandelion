package com.dandelion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_teammember")
public class TeamMemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 9)
	private int id;

	@Column(name = "teamid")
	private int teamid;

	@Column(name = "userid")
	private int userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public TeamMemberEntity(int teamid, int userid) {
		super();
		this.teamid = teamid;
		this.userid = userid;
	}

	public TeamMemberEntity() {
		super();
	}

	@Override
	public String toString() {
		return "TeamMemberEntity [id=" + id + ", teamid=" + teamid
				+ ", userid=" + userid + "]";
	}

}
