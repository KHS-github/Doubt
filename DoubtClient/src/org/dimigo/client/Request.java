package org.dimigo.client;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Request {
	
	private Request(){
	}
	
	public static ByteArrayOutputStream HandshakeExitRequest() throws IOException{
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		DataOutputStream str = new DataOutputStream(stream);
		
		str.writeShort(0xFF);
		
		return stream;
	}
	
	public static ByteArrayOutputStream CreateGameRoomRequest(String roomName) throws IOException{
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		DataOutputStream str = new DataOutputStream(stream);
		
		str.writeShort(0x01);
		str.writeUTF(roomName);
		
		return stream;
	}
	
	public static ByteArrayOutputStream CheckPlayersInGameRoom(String roomName) throws IOException{
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		DataOutputStream str = new DataOutputStream(stream);
		
		str.writeShort(0x02);
		str.writeUTF(roomName);
		
		return stream;
	}
	
}
