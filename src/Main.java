import action.shape;
import action.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Q:\\oop_java\\Assignment1se2309\\src\\source");
        Scanner sc = new Scanner(file);
        int i = 0;
        while (sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            Shape.addPoint(point);
        }
        shape.toString();
    }
}