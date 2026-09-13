import java.util.Scanner;
public class Practice_Switch{
    public static void main(String[] args){
        System.out.println("please input score:");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch (score){
            case 90:
                System.out.println("you score is 90");
                break;
            case 80:
                System.out.println("you score is 80");
                break;
            case 70:
                System.out.println("you score is 70");
                break;
            case 60:
                System.out.println("you score is 60");
                break;
                default:
                    System.out.println("you score not up to understand");

        }

    }
}