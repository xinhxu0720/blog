package com.visionvera.util;


public class SMSProxy{
	
	public SMSProxy(){
		try {
			SocketServer s = new SocketServer();
			s.run();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
