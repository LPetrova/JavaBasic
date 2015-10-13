import java.util.Scanner;

public class PointsInsideFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean isInsideFirstFigure = (x >= 12.5 && x <= 17.5)
                && (y >= 8.5 && y <= 13.5);

        boolean isInsideSecondFigure = (x >= 20 && x <= 22.5)
                && (y >= 8.5 && y <= 13.5);

        boolean isInsideThirdFigure = (x >= 12.5 && x <= 22.5)
                && (y >= 6 && y <= 8.5);

        if (isInsideFirstFigure || isInsideSecondFigure || isInsideThirdFigure){
            System.out.println("Inside");
        }
        else {
            System.out.println("Outside");
        }

    }
}



