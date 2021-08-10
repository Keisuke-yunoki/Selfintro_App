package com.example.selfintroapp.domain;

public class Appdata {
	
	private Integer id;		// アプリデータID
	private Integer year;	// 年
	private Integer month;	// 月
	private Integer age;	// 年齢
	private String profession;	// 職業
	private String description;	// 説明
	private String remarks;		// 備考
	
	
	public Appdata(Integer id, Integer year, Integer month, Integer age, String profession, String description, String remarks) {
		this.id = id;
		this.year = year;
		this.month = month;
		this.age = age;
		this.profession = profession;
		this.description = description;
		this.remarks = remarks;
	}
	
	/**
	 * アプリデータIDを取得する
	 * @return アプリデータID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * アプリデータIDを設定する
	 * @param id アプリデータID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 年を取得する
	 * @return year　年
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * 年を設定する
	 * @param year セットする year
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * 月を取得する
	 * @return month
	 */
	public Integer getMonth() {
		return month;
	}
	/**
	 * 月を設定する
	 * @param month セットする month
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	/**
	 * 年齢を取得する
	 * @return age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * 年齢を設定する
	 * @param age セットする age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * 職業を取得する
	 * @return profession
	 */
	public String getProfession() {
		return profession;
	}
	/**
	 * 職業を設定する
	 * @param profession セットする profession
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	/**
	 * 説明を取得する
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 説明を設定する
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 備考を取得する
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 備考を設定する
	 * @param remarks セットする remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}



