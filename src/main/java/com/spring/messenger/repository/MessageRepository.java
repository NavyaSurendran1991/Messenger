package com.spring.messenger.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.messenger.model.Message;


public interface MessageRepository extends CrudRepository<Message, Long>{

}
