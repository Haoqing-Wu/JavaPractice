package Control;

public class Method {

    public static void main(String[] args){
        Method.method1();
        method1();
        int i = Method.sum(12,52);
        long j = Method.sum(15L,21L);
        double k = Method.sum(5.26,9.68);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        Method.list(9);
    }

    public static void method1(){
        System.out.println("Method1 executed");
    }
    //overload
    public static int sum(int a, int b){
        return a + b;
    }

    public static long sum(long a, long b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static int recursion(int n){
        if(n==1) return 1;
        else if(n == 2) return 1;
        else return recursion(n - 1) + recursion(n - 2);
    }

    public static void list(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(recursion(i));
        }
    }
}
