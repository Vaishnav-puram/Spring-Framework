package com.springcore;
import java.util.*;
public class Student {
	private int sid;
	private String sname;
	private String saddress;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("setting student id...");
		this.sid = sid;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("setting student name....");
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		System.out.println("setting student address....");
		this.saddress = saddress;
	}
}
