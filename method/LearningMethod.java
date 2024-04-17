package java_practices.method;

public class LearningMethod {
    public static void main(String[] args) {
        System.out.println("sususus");
        //parameter of argi from printSomeJunk class
        MyUtils.printSomeJunk("This is some data");
        MyUtils.printSomeJunk1(30);
        MyUtils.sum2Numbers(100,200);
        System.out.println(MyUtils.add10(35));
        int var = MyUtils.add10(100);
        System.out.println(var);
    }
}
