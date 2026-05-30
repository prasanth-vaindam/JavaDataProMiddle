package OOPDay001;

public class Demo {

	int x;
	final int passMark = 35;
	public void display() {
		System.out.println("this is display method in demo class");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		Demo obj2 = new Demo();
		obj2.x = 24;
		System.out.println(obj.x);
		System.out.println(obj2.x);
	}
}
