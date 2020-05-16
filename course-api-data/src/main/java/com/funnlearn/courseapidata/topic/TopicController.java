package com.funnlearn.courseapidata.topic;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService; 

	@RequestMapping("/topic")
	public List<Topic> getTopics()
	{
		return topicService.getAllTopics();
	}
			
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateTopic(@RequestBody Topic t,@PathVariable String id)
	{
		topicService.updateTopic(t, id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")	
	public void deleteMapping(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	
	
				
		
	
	
	
}
