package com.websocketdemo.app.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WebSocketResponse {

	private Object object;
	
	private Integer status;
	
	private String message; 
}
