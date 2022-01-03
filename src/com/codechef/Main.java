package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// count no of vowels in an array:
        Scanner sc = new Scanner(System.in);
        int count =0;
        char[] arr = new char[7];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next().charAt(0);
        }
        /*
        it will contain both the uppercase and lowercase characters as a vowel:
         */
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o'||arr[i]=='u'||
            arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                count++;
            }
        }
        System.out.println("The number of vowels are "+count);
    }
}
