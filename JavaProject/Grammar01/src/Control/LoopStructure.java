package Control;

public class LoopStructure {

    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.print("\n");
        }

    }
}


class PrimeNumber {

    public static void main(String[] args){

        int primeCounter = 0;
        for(int i = 2; i <= 10000; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i + "\t");
                primeCounter++;
                if(primeCounter % 8 == 0) System.out.print("\n");
            }
        }
    }
}