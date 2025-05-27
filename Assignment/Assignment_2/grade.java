import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=90 && a<=100){
            System.err.println("Grade A");
        }
        else if(a>=75 && a<90){
            System.err.println("Grade B");
        }
        else if(a>=60 && a<70){
            System.err.println("Grade C");
        }
        else if(a>=40 && a<60){
            System.err.println("Grade D");
        }
        else{
            System.err.println("Fail");
        }
    }
}
