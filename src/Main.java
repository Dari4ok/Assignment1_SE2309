import action.Shape;
import action.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

#comment
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source");
        Scanner sc = new Scanner(file);
        int i = 0;

        Shape shape = new Shape();

        while (sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape);
    }
}
