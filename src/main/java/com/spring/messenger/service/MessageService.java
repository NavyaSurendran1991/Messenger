package com.spring.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.messenger.model.Message;
import com.spring.messenger.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	MessageRepository messageRepository;	
	
	public List<Message> getAllMessages(){
		List<Message> messageList= new ArrayList<>();		
		  messageRepository.findAll().forEach(messageList :: add);
		  return messageList;
	}
	
    /*public List<Message> getAllMessagesForYear(int year){
		Calendar cal= Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		List<Message> messageList= new ArrayList<Message>();
		for(Message message: new ArrayList<Message>(database.values())) {
			if(message.getCreated().getYear() == year) {
				messageList.add(message);
			}
		}
		return  messageList;
	}*/
	
    public Message getMessage(long messageId) {
    	Optional<Message> message= messageRepository.findById(messageId);
    	System.out.println("message---------"+message);
    	Message messageObj =message.get();
    	return messageObj;
    }
    
    public Message saveMessage(Message message) {    	
    	return messageRepository.save(message);
    }
    
    public void removeMessage(long messageId) {
    	 messageRepository.deleteById(messageId);
    }
    
    public Message updateMessage(Message message) {
    	return messageRepository.save(message);
    }
}
