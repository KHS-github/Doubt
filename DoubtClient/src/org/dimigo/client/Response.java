package org.dimigo.client;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Response {
	
	private Response(){
	}
	
	public static ByteArrayOutputStream HelloResponse() throws IOException{
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		DataOutputStream str = new DataOutputStream(stream);
		str.writeShort(0x00);
		
		return stream;
	}
	
}
