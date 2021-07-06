package GeometryShapes;

import java.util.Scanner;
public class reposit1 {
    public static void main(String[] args)
    {
        String shape;
        System.out.println("SELECT SHAPE");
        Scanner sc = new Scanner(System.in);
        shape = sc.nextLine();

        switch (shape) {
            case "square" -> {
                System.out.println("Enter length of side");
                Scanner sq = new Scanner(System.in);
                int a = sq.nextInt();
                int peri = 4 * a;
                int area = a * a;
                System.out.println("perimeter of square is");
                System.out.println(area);
            }
            case "rectangle" -> {
                Scanner sr = new Scanner(System.in);
                System.out.println("enter length of rectangle");
                int b = sr.nextInt();
                System.out.println("Enter breadth of rectangle");
                int c = sr.nextInt();
                int perir = 2 * (b + c);
                int arear = b * c;
                System.out.println("perimeter of rectangle is ");
                System.out.println(perir);
                System.out.println("Area of rectangle is ");
                System.out.println(arear);
            }
            case "cylinder" -> {
                Scanner cr = new Scanner(System.in);
                System.out.println("enter radius of cylinder");
                int d = cr.nextInt();
                System.out.println("enter the height of cylinder");
                int e = cr.nextInt();
                double peric = 2 * 3.14 * (d + e);
                double areac = 2 * 2 * 3.14 * (d * d);
                System.out.println("perimeter of cylinder is");
                System.out.println(peric);
                System.out.println("area of cylinder is");
                System.out.println(areac);
            }
            case "triangle" -> {
                Scanner tr = new Scanner(System.in);
                System.out.println("enter lenth of triangle");
                int f = tr.nextInt();
                System.out.println("enter the height of triangle ");
                int g = tr.nextInt();
                int perit = f + f + f;
                int areat = (f * g) / 2;
                System.out.println("perimeter of triangle is");
                System.out.println(perit);
                System.out.println("area of triangle is");
                System.out.println(areat);
            }
        }
    }
}