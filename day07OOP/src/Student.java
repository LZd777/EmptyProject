public class Student {
    void study(){
        System.out.println("学习");
    }

    void testParam(int a ,String s){
        System.out.println(s+a);
    }

    String textReturn(){
        System.out.println("奖状");
        return "三好学生";
    }

    int textMethod(int a ,int b){
        System.out.println("总分");
        return a+b;
    }
}

