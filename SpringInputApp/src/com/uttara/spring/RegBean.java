package com.uttara.spring;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class RegBean {

	@NotEmpty
	private String uname;
	@NotEmpty @Email
	private String email;
	
	private String pass;
	private String rpass;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Past(message="You should ideally be born in the past!")
	private Date dob;
	
	public RegBean() {
		System.out.println("in RB no-arg constr");
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
		System.out.println("in setDob() "+dob);
	}

	public String getUname() {
		System.out.println("in getUname()");
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("in setUname() "+uname);
	}

	public String getEmail() {
		System.out.println("in getEmail()");
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("in setEmail() "+email);
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
		System.out.println("in setPass() "+pass);
	}

	public String getRpass() {
		return rpass;
	}

	public void setRpass(String rpass) {
		this.rpass = rpass;
		System.out.println("in setRPass() "+rpass);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((rpass == null) ? 0 : rpass.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegBean other = (RegBean) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (rpass == null) {
			if (other.rpass != null)
				return false;
		} else if (!rpass.equals(other.rpass))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegBean [uname=" + uname + ", email=" + email + ", pass="
				+ pass + ", rpass=" + rpass + ", dob=" + dob + "]";
	}

	
	
}
