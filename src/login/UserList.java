package login;

import java.util.ArrayList;
import java.util.HashMap;

public class UserList {
	static ArrayList<User> userList = new ArrayList<>();
	static HashMap<String, User> hashList = new HashMap<>();
	static boolean auth = false;

	public static void addUser(User user) {
		userList.add(user);
		hashList.put(user.getEmail(), user);
	}

	public static void showUsers() {
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}

	public User getUser(String email) {
		User u = new User();
		if (UserList.hashList.containsKey(email)) {
			u = UserList.hashList.get(email);
			return u;
		}
		return u;


	}

	public static boolean userLogin(String email, String password) {
		 auth = false;

		if (UserList.hashList.containsKey(email)) {
			if (UserList.hashList.get(email).getPassword().equals(password)) {
				auth = true;
			}

		}
		return auth;
	}
	public static void userLogout() {
		auth = false;
	}
}
