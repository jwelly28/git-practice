package javaPractice;

//((((10+2)+2)-2)*2)/2)
public class Assignment2 {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a=10;
        int b=2;
        Assignment2 obj=new Assignment2();
        int result1=obj.sum(a,b);
        int result2=obj.sum(result1, b);
        int result3=obj.sub(result2, b);
        int result4=obj.multiply(result3, b);
        int result5 = obj.div(result4, b);

        System.out.println("((((10+2)+2)-2)*2)/2) =" + " "+result5);

    }

}
