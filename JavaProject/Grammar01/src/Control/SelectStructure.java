package Control;

public class SelectStructure {

    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Please type in your age.");
        int age = s.nextInt();

        String str = "Baby";
        if(age < 0 || age > 100){
            str = "invalid input";
        }
        else if(age >= 60){
            str = "Old man";
        }
        else if(age >= 25){
           str = "Man";
        }
        else if(age >= 12){
            str = "Teenager";
        }
        else if(age >= 2){
            str = "Children";
        }

        System.out.println(str);
    }
}

class Weather {

    public static void main(String[] args){
        System.out.println("What's the weather today?");
        System.out.println("0: Sunny day\n1: Rainy day");
        java.util.Scanner scannerWeather = new java.util.Scanner(System.in);
        int weather = scannerWeather.nextInt();

        System.out.println("What's your gender?");
        System.out.println("0: Male\n1: Female");
        java.util.Scanner scannerGender = new java.util.Scanner(System.in);
        int gender = scannerGender.nextInt();

        if(weather == 0){ //Sunny day
            System.out.println("What's the Temperature today?");
            java.util.Scanner scannerTemp = new java.util.Scanner(System.in);
            double temp = scannerTemp.nextDouble();
            if(temp < -20 || temp > 45){
                System.out.println("invalid temperature");
            }
            else if(temp >= 10 && temp <= 30){
                if(gender == 0){ //Male
                    System.out.println("Wear a T-shirt.");
                }
                else{ //Female
                    System.out.println("Wear a dress.");
                }
            }
            else{
                System.out.println("Stay at home");
            }
        }
        else{ // Rainy day
            System.out.println("Rain today,Stay at home");
        }

    }
}

class SwitchTest {

    public static void main(String[] args){
        System.out.println("Type in the amount of Euro you want to transfer into other currency.");
        java.util.Scanner scannerAmount = new java.util.Scanner(System.in);
        double amount = scannerAmount.nextDouble();
        double transferAmount;
        System.out.println("Choose the currency you want to transfer.");
        System.out.println("0: USD");
        System.out.println("1: RMB");
        System.out.println("2: JPY");
        System.out.println("3: GPB");
        java.util.Scanner scannerType = new java.util.Scanner(System.in);
        int type = scannerType.nextInt();

        switch (type) {
            case 0 -> {
                transferAmount = amount * 1.19;
                System.out.println("USD: " + transferAmount);
            }
            case 1 -> {
                transferAmount = amount * 7.85;
                System.out.println("RMB: " + transferAmount);
            }
            case 2 -> {
                transferAmount = amount * 122.74;
                System.out.println("JPY: " + transferAmount);
            }
            case 3 -> {
                transferAmount = amount * 0.9;
                System.out.println("GPB: " + transferAmount);
            }
            default -> System.out.println("invalid input");
        }

    }
}