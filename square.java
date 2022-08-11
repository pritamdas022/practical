import java.util.Scanner;
public class square {
    public static void main(String[] args){
        // input Scanner
        Scanner sc=new Scanner(System.in);
        int side=0;
        // area=side*side
        int area=0;
        // perimeter=4*side
        int perimeter=0;
        System.out.print("Enter the length of the side of a squere :");
        side=sc.nextInt();

        area = side*side;
        perimeter = 4*side;

        // output the area and perimeter of a squere

        System.out.println("the area of square is:"+area);
        System.out.println("The perimeter of squere is :"+perimeter);


    }
    
}
