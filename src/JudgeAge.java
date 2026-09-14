public class JudgeAge{
    public static void main(String[] args){
        int age = 22;
        if (age <= 5){
            System.out.println("幼儿");
        }else if(age <= 18){
            System.out.println("青少年");
        }else if (age <= 35){
            System.out.println("青年");
        }else if (age <= 55){
            System.out.println("中年");
        }else if (age <= 150){
            System.out.println("老年");
        }

    }
}