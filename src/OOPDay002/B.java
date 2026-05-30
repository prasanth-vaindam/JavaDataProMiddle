package OOPDay002;

/**
 * 
 * @author prasanth vaindam
 * 
 *Important Rules
this() and super() must be the first statement in a constructor.
A constructor can call:
another constructor using this()
parent constructor using super()
You cannot use both this() and super() in the same constructor directly.
If no super() is written, Java automatically inserts super(). 
 * 
 * 
 * 
 * Why Use Constructor Chaining?
Reduces repeated code
Improves readability
Centralizes object initialization
Makes maintenance easier

 *
 */
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        this(10);
        System.out.println("B default");
    }

    B(int x) {
        super();
        System.out.println("B parameterized");
    }

    public static void main(String[] args) {
        new B();
    }
}