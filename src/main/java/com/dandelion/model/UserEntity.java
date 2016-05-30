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

/**
 * 
 * @author JackSpancer
 * 
 */

@Table(name="t_user")
@Entity
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 9)
	private int id;
	
	@Column(name = "username", nullable = false, length = 20)
	private String username;
	
	@Column(name = "password", nullable = false, length = 32)
	private String password;
	
	@Column(name = "sex", length = 1, nullable = true)
	private boolean sex; // 默认为男
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday", nullable = true)
	private Date birthDay; //生日
	
	@Column(name = "mobile",  nullable = true, length = 13)
	private String mobile; //手机号码
	
	@Column(name = "startPlay", nullable = true)
	private Date startPlay;//开始打球时间
	
	@Temporal(TemporalType.TIMESTAMP) 
	@Column(name = "regtime")
	private Date regtime;  //注册时间
	
	@Column(name = "state")
	private boolean state;  //注册的状态
	
	@Column(name = "remark", nullable = true)
	private String remark;  //标记，备用

	public UserEntity() {
	}

	public UserEntity(String username, String password, boolean sex,
			Date birthDay, String mobile, Date startPlay, Date regtime,
			boolean state, String remark) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.birthDay = birthDay;
		this.mobile = mobile;
		this.startPlay = startPlay;
		this.regtime = regtime;
		this.state = state;
		this.remark = remark;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the startPlay
	 */
	public Date getStartPlay() {
		return startPlay;
	}

	/**
	 * @param startPlay the startPlay to set
	 */
	public void setStartPlay(Date startPlay) {
		this.startPlay = startPlay;
	}

	/**
	 * @return the regtime
	 */
	public Date getRegtime() {
		return regtime;
	}

	/**
	 * @param regtime the regtime to set
	 */
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username
				+ ", password=" + password + ", sex=" + sex + ", birthDay="
				+ birthDay + ", mobile=" + mobile + ", startPlay=" + startPlay
				+ ", regtime=" + regtime + ", state=" + state + ", remark="
				+ remark + "]";
	}
	
	
	
}
