package com.lidy.redis.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;

@Getter
@RedisHash(value = "people", timeToLive = 30)
public class Person {

	@Id
	private String id;
	private String name;
	private Integer age;
	private LocalDateTime createdAt;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
		this.createdAt = LocalDateTime.now();
	}
}