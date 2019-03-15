package com.spring.messenger.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.messenger.model.Profile;


public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
