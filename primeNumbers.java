/*
Author: Boafo Tabitha Amanor
Student ID: 10939908
A PROGRAM THAT PRODUCES THE SUM OF ALL PRIME NUMBERS LESS THAN A GIVEN NUMBER
*/

public class primeNumbers{
    public static void main(String[] arg){
        int sum = 0;
        int number = 100;
        for(int i = 1; i < number; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println("The Sum of Prime Numbers, 1 to 100 is: " + sum);
    }

    private static boolean isPrime(int num) {
        if (num == 2){
           return true;
        }
        for (int i = 3; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
