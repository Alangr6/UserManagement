package login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class User {
	String name;
	String email;
	String password;
	String securityQuestion;

	ArrayList<String> messageList = new ArrayList<>();

	

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User() {

	}


	public ArrayList<String> getMessageList() {
		return messageList;
	}

	public void setMessageList(ArrayList<String> messageList) {
		this.messageList = messageList;
	}

	public void sendMessage(String message) {
		messageList.add(message);
	}

	public void showMessages() {
		for (String messages : messageList) {
			System.out.println(messages);
		}
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", securityQuestion="
				+ securityQuestion + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
