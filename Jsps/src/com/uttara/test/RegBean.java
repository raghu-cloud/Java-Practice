package com.uttara.test;

import java.io.Serializable;

public class RegBean implements Serializable {
	@Override
	public String toString() {
		return "RegBean [email=" + email + ", passwrd=" + passwrd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((passwrd == null) ? 0 : passwrd.hashCode());
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (passwrd == null) {
			if (other.passwrd != null)
				return false;
		} else if (!passwrd.equals(other.passwrd))
			return false;
		return true;
	}
	String email,passwrd;
	public RegBean()
	{
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

}
