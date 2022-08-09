
// import java.util.*;
// public class demo{
//     public static void main(String[] args){
//      Scanner scan = new Scanner(System.in); 
//      int n = scan.nextInt();
//      int [] a = new int[n];
//       for(int i = 0;i<n;i++)
//       {
//           a[i] = scan.nextInt(); 
//       }
    
//         scan.close();

//         // Prints each sequential element in array a
//         for (int i = 0; i < a.length; i++) {
//             System.out.println(a[i]);
//         }
//     }
// }
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class demo{

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         for(int i = 1;sc.hasNext();i++){
//             System.out.println(i + " " + sc.nextLine());
//         }
//     }
// }
// import java .util.*;
// public class demo{
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter the number a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the number b : ");
//         int b = sc.nextInt();
//         System.out.print("Enter the number c : ");
//         int c = sc.nextInt();

//         double result = b * b - 4.0 * a * c;
//         if(result > 0.0){
//             double r1 = (-b + Math.pow(result,0.5)) / (2.0*a);
//             double r2 = (-b - Math.pow(result,0.5)) / 2.0*a;

//             System.out.println("The roots is "+r1+" and "+r2);
//         }else if(result == 0.0){
//             double r1 = -b / (2.0 * a);
//             System.out.println("The root is : "+r1);
//         }else{
//             System.out.println("The equation has no real roots");
//         }
//         }
//     }

// Table number calculation

// import java.util.*;
// public class demo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the positive intiger: ");
//         int num = sc.nextInt();
//         for(int i = 1; i<=10;i++){
//             System.out.println(num+ "x" +i+ "=" +num*i);
//         }
//     }
// }
// A raise to b 
/* 
import java.util.*;
public class demo{
    public static void main(String[] args){
        int a,b;
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive number a: ");
        a = sc.nextInt();
        System.out.println("Enter the positive number b: ");
        b = sc.nextInt();
        for(int i = 1; i<=b;i++){
            result*=a;
        }
        System.out.println("a raise to b is: "+result);
    }
}
*/
// import java.util.Scanner;

// public class demo
// {
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
     
//         int number;
//         int reverse = 0;
        
//         System.out.print("Enter the number ");
//         number = console.nextInt();
        
//         int temp = number;
//         int remainder = 0;
        
//         while(temp>0)
//         {
// 	    remainder = temp % 10;
// 	    reverse = reverse * 10 + remainder;
//             temp /= 10;
//         }

//         System.out.println("Reverse of " + number + " is " + reverse);
//     }
// }
// class test{
//     void show(int a,int b)
//     {
//         int result = a+b;

//       System.out.println("the sum of numbers is:"+ result);
//     }
// }

// class exam extends test{
//     void show(int a,int b)
//     {
//         int result = a-b;
//         System.out.println("difference of numbers is: "+result);
//     }
// }
// class demo{
//     public static void main(String[] args){

//         test t = new test();
//         t.show(3,9);

//         exam e = new exam();
//         e.show(5,4);
//     }
// }
// WRITE A PROGRAM PRINT A NUMBERS FROM 1 TO 10?
/* 
 public class demo{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i<=10; i++){
        sum = sum+i;
            System.out.println(sum);
        }
    }
}
*/
// WRITE A PROGRAM THAT PROMPTS THE USER TO INPUT A POSITIVE INTEGER.IT SHOUID THEN PRINT THE MULTIPLICATION TABLE OF THAT NUMBER.
/* 
import java.util.*;
public class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer :");
        int num = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num+ "x" +i+ "=" +num*i);
        }

    }
}
*/
// WRITE A PROGRAM TO FIND THE FACTORIAL VALUE OF ANY NUMBER ENTERED THROUGH THE KEYBOARD.
/* 
import java.util.*;
public class demo{
    public static void main(String[] args){
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer number :");
        int num = sc.nextInt();

        for(int i = num; i>=1;i--){
            fact = fact*i;
            System.out.print("Factorial number is :"+fact);

        }
    }
}
*/

// TWO NUMBERS ARE ENTERED THROUGH THE KEYWORD.WRITE A PROGRAM FIND THE VALUE OF ONE NUMBER RAISED TO THE POWER OF ANOTHER.
/* 
import java.util.*;
public class demo {
    public static void main(String[] args){
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer a :");
        int a = sc.nextInt();
        System.out.print("Enter the positive integer b :");
        int b = sc.nextInt();

        for(int i = 1; i<=b; i++){
         result = result*a;

         System.out.println("A raised to the power is :"+result);

        }
    }
    
}
*/
//WRITE A PROGRAM THAT PROMPTS THE USER INPUT AN INTEGER AND THEN OUTPUT THE NUMBER WITH THE DIGIT REVERSE.
/* 
import java.util.*;
public class demo{
    public static void main(String[] args){
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE POSITIVE INTEGER NUMBER THAT YOU WANT TO REVERSE :");
        int num = sc.nextInt();

        while(num!=0){
            int remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
            System.out.println("REVERSE NUMBER IS :"+reverse);


        }
    }
}
*/
// WRITE A PROGRAM THAT READS A SET OF INTIGERS, AND THEN PRINTS THE SUM OF THE EVEN AND ODD INTEGERS.
/* 
 import java. util.*;
 public class demo{
     public static void main(String[] args){
         int evenSum = 0;
         int oddSum = 0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :");
         int num = sc.nextInt();

         for(int i = 1; i<=num; i++){
             if(i%2==0){
                 evenSum+=i;
             }else{
                 oddSum+=i;
             }
         }
         System.out.println("sum of even numbers is :"+evenSum);
         System.out.println("sum of odd numbers :"+oddSum);
     }
 }
 */
 
public class demo{
    public static void main(String[] args){
        for(int i =1;i<=20;i++){
            int tableOf = i;
            for(int j = 1; j<=10;j++){
                System.out.print(tableOf*j+" ");
            }
            System.out.println();
        }
        
    }
}

// import java.util.*;
// public class demo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number :");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<=i;j++){
//                 for(int k=1; k<=num;k++){
//                     for(int t=1;t<=num-i;t++){
//                         System.out.print("* ");
//                     }
//                     System.out.println();
//             }
            
//         }
//         }
//     }
// }

// import java.util.*;
// public class demo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
// }