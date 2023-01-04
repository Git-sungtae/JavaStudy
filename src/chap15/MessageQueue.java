package chap15;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class MessageQueue {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "장장장"));
		messageQueue.offer(new Message("sendSMS", "성성성"));
		messageQueue.offer(new Message("sendKakaoTalk", "태태태"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}
		
		
		
		
	}
}
