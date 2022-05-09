public class Test3Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.study();
        stu.testParam(100,"语文");
        String s = stu.textReturn();
        System.out.println("获得"+s);
        int i = stu.textMethod(100,25);
        System.out.println(i);
    }
}
