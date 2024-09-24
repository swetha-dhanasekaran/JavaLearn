package home.java.learn.spring;

public class A {

    public A(){
        System.out.println("A constructor");
    }
   void meth(){
        System.out.println("Meth");
    }

    public static void main(String[] args) {
        B b = new B();
//        b.meth();
//        B.meth1();
    }
}

class B extends A{

    public B(){
        System.out.println("B will print");
    }
    void meth() {
        System.out.println("Ba");
    }

   static void meth1() {
        System.out.println("meth1");
    }
}


//Meth
//B

//B
//Meth
//Meth

//B

//Compilation error