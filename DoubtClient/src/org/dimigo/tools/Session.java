package org.dimigo.tools;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Queue;

public class Session implements Runnable{
	
	//Input : read
	//Output : write
	private Queue<Message> message;
	private Player m_player = null;
	private Selector selector = null;
	
	public Session(){
	}
	
//	public void sessionOpen(String strIP){
//		Thread thread = new Thread(this);
//		thread.start();
//	}
	
	public void sessionOpen(String strIP){
		try {
			SocketChannel socket = SocketChannel.open();
			socket.configureBlocking(true);
			socket.register(selector, SelectionKey.OP_ACCEPT);
			
			socket.connect(new InetSocketAddress(strIP, 5000));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private DataInputStream receiveData(InputStream is) throws IOException{
		int size = is.read();
		byte[] wholeData = new byte[size];
		is.read(wholeData, 0, size);
		return new DataInputStream(new ByteArrayInputStream(wholeData));
	}

	@Override
	public void run() {
		try(Socket socket = new Socket("localhost", 5000);
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream()){
			
			while(true){
				DataInputStream received = receiveData(is);
				short hedaer = received.readShort();
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
