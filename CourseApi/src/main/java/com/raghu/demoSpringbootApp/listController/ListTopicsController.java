package com.raghu.demoSpringbootApp.listController;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListTopicsController {
	
	@Autowired
	private TopicService topics;
	
	@RequestMapping("/listTopics")
	public List<Topics> getAllTopics(){
		return topics.getTopics();
	}
	
	@RequestMapping("/listPersons")
	public List<Person> getAllPersonDetails(){
		Person p1=new Person("Ram","Bangalore","India");
		Person p2=new Person("Steve","SanFransisco","US");
		List<Person> l=new ArrayList<Person>();
		l.add(p1);
		l.add(p2);
		return l;
		
	}

}
