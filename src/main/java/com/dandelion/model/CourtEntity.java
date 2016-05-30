package com.dandelion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author JackSpancer
 * 场地
 *
 */
@Table(name = "t_courtinfo")
@Entity
public class CourtEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 9)
	private int id;
	
	@Column(name = "username")
	private String owner;            //所有者
	
	@Column(name = "courtName")
	private String courtName;        //场地名称
	
	@Column(name = "location")
	private String location;         //所在地
	
	@Column(name = "detailLocation")
	private String detailLocation;   //详细地址
	
	@Column(name = "xBaidu")
	private Double xBaidu;           //百度地图x
	
	@Column(name = "yBaidu")
	private Double yBaidu;           //百度地图y
	
	@Column(name = "tel")
	private String tel;              //场地电话
	
	

	public CourtEntity() {
	}

	public CourtEntity(int id, String owner, String courtName, String location,
			String detailLocation, Double xBaidu, Double yBaidu, String tel) {
		this.id = id;
		this.owner = owner;
		this.courtName = courtName;
		this.location = location;
		this.detailLocation = detailLocation;
		this.xBaidu = xBaidu;
		this.yBaidu = yBaidu;
		this.tel = tel;
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
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the courtName
	 */
	public String getCourtName() {
		return courtName;
	}

	/**
	 * @param courtName the courtName to set
	 */
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the detailLocation
	 */
	public String getDetailLocation() {
		return detailLocation;
	}

	/**
	 * @param detailLocation the detailLocation to set
	 */
	public void setDetailLocation(String detailLocation) {
		this.detailLocation = detailLocation;
	}

	/**
	 * @return the xBaidu
	 */
	public Double getxBaidu() {
		return xBaidu;
	}

	/**
	 * @param xBaidu the xBaidu to set
	 */
	public void setxBaidu(Double xBaidu) {
		this.xBaidu = xBaidu;
	}

	/**
	 * @return the yBaidu
	 */
	public Double getyBaidu() {
		return yBaidu;
	}

	/**
	 * @param yBaidu the yBaidu to set
	 */
	public void setyBaidu(Double yBaidu) {
		this.yBaidu = yBaidu;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
}
