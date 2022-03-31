package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@RefreshScope
public class Attributes {

	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private String age;
	
	@Value("${place}")
	private String place;
}
