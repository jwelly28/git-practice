package javaPractice;

public class Student {
    int age=30;
    int rollNo = 123;

    public void age(){
        System.out.println("Automation is very easy");
    }
    public void rollNo(){
        System.out.println("Welcome to all of you");
    }
    public static void main(String[] args) {
      Student obj = new Student();
      obj.age();
      obj.rollNo();
        System.out.println("Roll No. =" + " "+obj.rollNo);
        System.out.println("Age =" + " "+obj.age);
    }
}
