package com.lidy.redis.repository;

import org.springframework.data.repository.CrudRepository;

import com.lidy.redis.entity.Person;

public interface PersonRedisRepository extends CrudRepository<Person, String> {
}
