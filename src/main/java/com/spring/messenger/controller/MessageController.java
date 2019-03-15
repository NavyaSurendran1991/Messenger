package com.spring.messenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.messenger.model.Message;
import com.spring.messenger.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	MessageService messageService;

	@RequestMapping("/messages")
	public List<Message> getAllMessages(){		
		return messageService.getAllMessages();
	}
	
	@RequestMapping("/messages/{messageId}")
	public Message getAllMessages(@PathVariable String messageId){	
		System.out.println("messageId--------"+messageId);
		return messageService.getMessage(Long.getLong(messageId));
	}
	
	@RequestMapping(method= RequestMethod.POST,value="/messages")
	public Message saveMessage(@RequestBody Message message) {
		return messageService.saveMessage(message);
	}
}
