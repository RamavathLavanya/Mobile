package Patterns;

import java.util.Scanner;

public class CharacterPattern {
	
	public static void printCharacterPattern(char c){
        // A->65
        int x='A'; // ascii value of A
        int n=c; // ascii value of c
        int rows=n-x+1;
        int spaces=0;

        for(int i=rows;i>=1;i--){  // 7
            for(int j=0;j<i;j++){ //
                System.out.print((char)(x+j));
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=i-1;j>=0;j--){ //
                System.out.print((char)(x+j));
            }
            System.out.println();
            spaces+=2;
        }

        spaces=spaces-4;

        for(int i=2;i<=rows;i++){  // 7
            for(int j=0;j<i;j++){ //
                System.out.print((char)(x+j));
            }

            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=i-1;j>=0;j--){ //
                System.out.print((char)(x+j));
            }
            spaces-=2;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0); //G
        printCharacterPattern(c);
    }
}

// F

// ABCDEFGGFEDCBA 7 - 0
// ABCDEF  FEDCBA 6 - 2
// ABCDE    EDCBA 5 - 4
// ABCD      DCBA 4 - 6
// ABC        BCA 3 - 8
// AB          BA 2 - 10
// A            A 1 - 12


