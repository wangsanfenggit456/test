package com.po;

import java.io.Serializable;

public class Student implements Serializable {
	private Integer  sid ;
	private String sname ;
	private String sex ;
	private String address ;
	private String birthday ;
	private Integer classid ;
	private String cname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sname, String sex, String address, String birthday, Integer classid) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
		this.classid = classid;
	}

	public Student(Integer sid, String sname, String sex, String address, String birthday, Integer classid,
			String cname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
		this.classid = classid;
		this.cname = cname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", address=" + address + ", birthday="
				+ birthday + ", classid=" + classid + ", cname=" + cname + "]";
	}
	
}
