import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        int[] a=new int[26];
        int max=0;
        char d = 0;
        for(int i=0;i<str.length();i++)
        {
            a[str.charAt(i)-'a']++;
            if(a[str.charAt(i)-'a']>max)
            {
                max=a[str.charAt(i)-'a'];
                 d=str.charAt(i);
            }
        }
        
        String st="";
        max=1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==d&&max==1){
                max++;
                continue;
                
            }
            st=str.charAt(i)+st;
        }
        System.out.println(st);

    }
}
