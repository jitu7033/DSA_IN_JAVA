import java.util.*;

//import static java.lang.CharacterData0E.A;

public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid number");


        }
        System.out.println("Input yor number");

        int number =  sc.nextInt();

        switch(number){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("Invalid number");
        }
        char str = sc.next().charAt(0);
        switch(str){
        case 'A':
             System.out.println("apple");
             break;
        case 'B':
              System.out.println("ball");
              break;
        case 'C':
            System.out.println("cat");
            break;
        case 'D':
             System.out.println("dog");
             break;
        case 'E':
              System.out.println("elephant");
              break;
        case 'F':
              System.out.println("five");
              break;
        default:
              System.out.println("Invalid number");
    }

    }
}
