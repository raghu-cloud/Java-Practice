package com.raghu.demoSpringbootApp.listController;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class TopicService {
	
	public List<Topics> topics=Arrays.asList(
			new Topics("springboot","java","Bootstarap"),
			new Topics("javaScripts","python","machine-learning"),
			new Topics("ruby","golang","php")
			);
	
	public List<Topics> getTopics() {
		return topics;
	}
			
}
