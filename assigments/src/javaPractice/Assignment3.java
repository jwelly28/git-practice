package javaPractice;


//(((((10/2)-2)+2)-2)*2)
public class Assignment3 {

    public int div(int num1, int num2) {
        return num1 / num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        int a =10;
        int b=2;
        Assignment3 obj = new Assignment3();
        int result1 = obj.div(a,b);
        int result2 = obj.sub(result1, b);
        int result3 = obj.sum(result2,b);
        int result4 = obj.sub(result3, b);
        int result5 = obj.multiply(result4, b);

        System.out.println("((((10/2)-2)+2)-2)*2) =" + " "+result5);

    }
}
