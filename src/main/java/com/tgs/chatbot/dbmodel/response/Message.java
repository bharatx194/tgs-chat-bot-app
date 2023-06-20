package com.tgs.chatbot.dbmodel.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Message {
	
	@JsonProperty("role") private String role;
	
	@JsonProperty("content") private Object content;

}
