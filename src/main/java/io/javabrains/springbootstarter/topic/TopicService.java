package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>( Arrays.asList(new Topic("Spring", "Spring Framework", "Spring FrameWork Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("JavaScript", "JavaScript Framework", "JavaScript Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		
	return	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
		
	}


	
	
}
