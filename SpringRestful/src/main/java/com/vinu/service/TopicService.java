package com.vinu.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vinu.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("jr", "Java Roo"),
			new Topic("jb", "Java Boot"),
			new Topic("js", "Java Spring")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String id){		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
