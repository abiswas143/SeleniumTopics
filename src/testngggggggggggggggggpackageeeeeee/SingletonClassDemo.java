package testngggggggggggggggggpackageeeeeee;
public class SingletonClassDemo {
	public static SingletonClassDemo instance;
	private SingletonClassDemo() {
	}
	public static SingletonClassDemo getInstance(){
		if (instance == null) {
			instance = new SingletonClassDemo();
		}
		return instance;
	}
}
