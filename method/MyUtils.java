package java_practices.method;

public class MyUtils {

    public static void printSomeJunk(String argi) {
        System.out.println("Some bla bla bla " + argi);
    }
    public static void printSomeJunk1(int num) {
        System.out.println("This is the age: " + num);
    }
    public static void sum2Numbers(int n1, int n2) {
        System.out.println(n1+n2);
    }
    //remember void cannot return values.
    public static int add10(int n3) {
        int result = n3 + 10;
        return result; 
    }
}
