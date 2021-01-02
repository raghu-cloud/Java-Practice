package com.raghu.demoSpringbootApp.listController;

public class Topics {
	
	public String fistTopic;
	public String secondTopic;
	public String thirTopic;
	
	public Topics(String fistTopic, String secondTopic, String thirTopic) {
		super();
		this.fistTopic = fistTopic;
		this.secondTopic = secondTopic;
		this.thirTopic = thirTopic;
	}
	
	public Topics() {
		
	}
	
	
	public String getFistTopic() {
		return fistTopic;
	}
	public void setFistTopic(String fistTopic) {
		this.fistTopic = fistTopic;
	}
	public String getSecondTopic() {
		return secondTopic;
	}
	public void setSecondTopic(String secondTopic) {
		this.secondTopic = secondTopic;
	}
	public String getThirTopic() {
		return thirTopic;
	}
	public void setThirTopic(String thirTopic) {
		this.thirTopic = thirTopic;
	}
	
	
	

}
