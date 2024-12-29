package com.Firstcode;
import java.util.Scanner;
public class Practice {
	public static void print(String x) {
		System.out.println(x);
	}
	public static void print(Integer x) {
		System.out.println(x);
	}
	public static void print(Float x) {
		System.out.println(x);
	}
	public static void print(Double x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		/*
		System.out.println("Enter that no. whose table you want");
		int X = input.nextInt();
		int i=1;
		while(true) {
			System.out.print(X+"X"+i+" = ");
			System.out.println(X*i);
			i+=1;
			if (i==11) {
				break;
			}
		}
		*/
		
		/* Maths class 
		double r=7.5;
		System.out.print("The area of circle = ");
		double A = Math.PI*r*r;
		System.out.println(A);
		System.out.print("The perimeter of circle = ");
		double P = 2*Math.PI*r;
		System.out.println(P);
		*/
		
		
		/* Swapping a number
		 int a = 15;
		 int b = 27;
		 a = a + b;  // Add a and b and store the result in a
	     b = a - b;  // Subtract the original b from the new a and store the result in b
	     a = a - b;
	     System.out.println(a);
	     System.out.println(b);
	     */
		
		/* Binary Product 
		System.out.println("enter first binary number: ");
		String binary1 = input.nextLine();
		System.out.println("enter second binary number: ");
		String binary2  = input.nextLine();
		int num1 = Integer.parseInt(binary1,2);
		int num2 = Integer.parseInt(binary2,2);
		int M = num1*num2;
		System.out.println(M);
		String binary_product = Integer.toBinaryString(M);
		System.out.println(binary_product);
		*/
		
		/* Decimal to binary
		System.out.println("Enter a decimal number: ");
		int a = input.nextInt();
		String binary_a = Integer.toBinaryString(a);
		System.out.print("Binary of "+a+" = ");
		System.out.println(binary_a);
		*/
		
		/* Decimal to Hexadecimal
		System.out.println("Enter a decimal number: ");
		int a = input.nextInt();
		String Hex_a = Integer.toHexString(a);
		System.out.print("Hexadecimal of "+a+" = ");
		System.out.println(Hex_a);
		*/
		
		/* Binary to Octal
		System.out.println("Enter a Binary number: ");
		String binary_a = input.nextLine();
		int Int_a = Integer.parseInt(binary_a,2);
		String Octal_a = Integer.toOctalString(Int_a);
		System.out.println(Octal_a);
		*/
		
		
		/*Sum of Digit
		System.out.println("Enter the number:");
		int a = input.nextInt();
		int A = a;
		int sum = 0;
		while (a!=0) {
			int numb = a%10;
			sum +=numb;
			a = a/10;	
		}
		System.out.print("Sum of the digits of "+A+" = ");
		System.out.println(sum);	
		*/
		
		/*
		System.out.println("Polygon of what side:");
		int n = input.nextInt();
		System.out.println("Enter the length of the side:");
		int l = input.nextInt();
		double Area = (n*l*l)/(4*Math.tan(Math.PI/6));
		System.out.println("Area of polygon of side "+n+" of length "+l+" is = "+Area);
		*/
		
		/*
		System.out.println("Enter a sentence: ");
		String x = input.nextLine();
		int L = x.length();
		int i = L;
		while(true) {
			System.out.print(x.charAt(i));
			i = i-1;
			if (i<0) {
				break;
			}
		}
		*/
		 
		/*Count the number of letter, digit, spacebar, special charcter
		String x = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char[] ch = x.toCharArray();
		
		int letter = 0;
		int digit = 0;
		int spacebar = 0;
		int specialch = 0;
		
		for(int i = 0; i<x.length(); i+=1) {
			if (Character.isLetter(ch[i])) {
				letter +=1;
			}
			else if (Character.isDigit(ch[i])) {
				digit+=1;
			}
			else if (Character.isSpaceChar(ch[i])) {
				spacebar +=1;
			}
			else {
				specialch+=1;
			}
		}
		System.out.println("no. of letter : "+letter);
		System.out.println("no. of digit : "+digit);
		System.out.println("no. of spacebar : "+spacebar);
		System.out.println("no. of special charcter : "+specialch);
		*/
		
		
		/* All unique 3-digit numbers made with 1,2,3,4 
		//numbers = 1,2,3,4
		
		int amount = 0;
		for (int i = 1; i<=4; i++) {
			for (int j = 1; j<=4; j++) {
				for (int k =1; k<=4; k++) {
					if (i!=j && j!=k && k!=i) {
						amount ++;
						System.out.print(i);
						System.out.print(j);
						System.out.println(k);
					}
				}
			}
		}
		System.out.print("Total no. of unique numbers are: ");
		System.out.println(amount);
		*/
				
		//Mini Project
		
				int MyNumber = (int)(Math.random()*100);
				int UserNumber = 0;
				
				do {
					print("Guess any integer (1-100): ");
					UserNumber = input.nextInt();
					
					if (UserNumber == MyNumber) {
						print("WOW! you won the game");
						break;
					}
					else if (UserNumber>MyNumber) {
						print("Bad Luck!");
						print("Your number is too large");
						print("If you don't want to play then enter any negative Number");
					}
					else if (UserNumber < MyNumber && UserNumber > 0) {
						print("Bad Luck!");
						print("Your number is too small");
						print("If you don't want to play then enter any negative Number");
					}
					else {
						print("Very Bad");
						print("You lose the Game");
					}
				
				}while (UserNumber >= 0);
				
				System.out.print("My Number Was: ");
				print(MyNumber);
				
		
		
		
		
		
		
		
		
	}

}

