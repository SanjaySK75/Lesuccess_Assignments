import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' 
            || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }
        System.out.println("Vowels : " + vowelCount + " Consonants : " + consonantCount);
    }
}
