package Identifier;

public class Variable {

    static int j = 3;

    public static void main(String[] args){
        int i = 100;
        char p = 'r';
        System.out.println(i);
        System.out.println(j);
        System.out.println(p);

        boolean sex = false;
        String user = sex ? "male" : "female";
        System.out.println(user);
    }
}
