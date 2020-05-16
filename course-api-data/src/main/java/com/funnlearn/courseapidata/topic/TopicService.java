package com.funnlearn.courseapidata.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	private List<Topic> topic =new ArrayList<>(Arrays.asList(
			new Topic("java","java","Java Topic"),
			new Topic("spring","spring","spring descpription"),
			new Topic("javascript","javascript","javascript descrption")
			
			));
	
	public List<Topic> getAllTopics()
	{
		//return topic;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
		
	}
	public Topic getTopic(String id)
	
	{
		return topicRepository.findById(id).orElse(null);
		
		//return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
		//this.topic.add(topic);
	}
	public void updateTopic(Topic top,String id)
	{
		topicRepository.save(top);
	}
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);
		//topic.removeIf(t ->t.getId().equals(id));
	}

}
