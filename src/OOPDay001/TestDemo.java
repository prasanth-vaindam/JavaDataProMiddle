package OOPDay001;

public class TestDemo {
	String fname;
	String lname;
	int age;
	
	public static void fun() {
		System.out.println("this is staic method in TestDemo class");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		Demo obj2 = new Demo();
		fun();
		System.out.println(obj.x);
		obj.x = 25;
		obj2.x = 44;
		System.out.println(obj.x);
		System.out.println(obj2.x);
//		obj.passMark = 40;
		System.out.println(obj.passMark);
		TestDemo tobj = new TestDemo();
		tobj.fname="Prasanth";
		tobj.lname="Vaindam";
		tobj.age = 20;
		tobj.fun();
		System.out.println(tobj.fname + " " + tobj.lname + " is " + tobj.age);
		obj.display();
	}
}
