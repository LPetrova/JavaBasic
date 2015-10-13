import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aX = input.nextInt();
        int aY = input.nextInt();
        int bX = input.nextInt();
        int bY = input.nextInt();
        int cX = input.nextInt();
        int cY = input.nextInt();

        int triangleArea = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);

        if (triangleArea != 0){
            System.out.printf("Triangle area is: %d", triangleArea);
        }
        else{
            System.out.println("All points lie in a straight line and do not form a triangle");
            System.out.println("0");
        }

    }
}
