package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {
        Point startPoint2 = new Point(2, 3);

        Ellipse FirstEllipse = new Ellipse();
        Ellipse SecondEllipse = new Ellipse(startPoint2, 5, 6);
        Ellipse ThirdEllipse = new Ellipse(SecondEllipse);
        Ellipse FourthEllipse = new Ellipse();
        
        FourthEllipse.initialize();

        System.out.println("Ellipse 1: " + FirstEllipse);
        System.out.println("Ellipse 2: " + SecondEllipse);
        System.out.println("Ellipse 3: " + ThirdEllipse);
        System.out.println("Ellipse 4: " + FourthEllipse);
        System.out.println("Ellipse 2 equals Ellipse 1: " + SecondEllipse.equal(FirstEllipse));
        System.out.println("Ellipse 2 equals Ellipse 3: " + SecondEllipse.equal(ThirdEllipse));
    }
}