import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,d,e;
        System.out.println("enter the marks of the five subjects");
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d= scanner.nextInt();
        e= scanner.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("total marks "+ sum);
        double avg=sum/5;
        System.out.println("average marks"+ avg);
    }
}