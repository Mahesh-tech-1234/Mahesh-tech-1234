class MethodOverloadingExample {
    public static void display(int num) {
        System.out.println("Integer number: " + num);
    }

    public static void display(double num) {
        System.out.println("Double number: " + num);
    }

    public static void display(int num1, int num2) {
        System.out.println("Integer numbers: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        display(10); 
        display(5.5); 
        display(20,30); 
    }
}
