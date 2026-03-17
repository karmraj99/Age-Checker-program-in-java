import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String a){
        System.out.println(a);
    }
    
}

public class AgeChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age ");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.print(e);
        }
        sc.close();
    }

    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age is under 18");
        }else{
            System.out.print("Age is +18");
        }
    }
}
