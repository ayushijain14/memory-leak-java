package memory.leak.java;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		System.out.println("App Launched");
		
		List<User> users = new ArrayList<>();
		
		for(int i=1; i<=10000; i++) {
			users.add(new User());
		}
		
		System.out.println("App Closed");
	}

}
