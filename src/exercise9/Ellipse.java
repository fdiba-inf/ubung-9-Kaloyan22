package exercise9;

public class Ellipse {
    private Point startPoint;
    private double a;
    private double b;

    public Ellipse() {
        startPoint = new Point(0, 0);
        a = 1;
        b = 1;
    }

    public Ellipse(Point startPoint, double a, double b) {
        this.startPoint = new Point(startPoint);
        this.a = a;
        this.b = b;
    }

    public Ellipse(Ellipse ellipseVar) {
        startPoint = new Point(ellipseVar.startPoint);
        a = ellipseVar.a;
        b = ellipseVar.b;
    }

    public String Shape() {
      if(a==b) {
        return "Circle";
      }
      else {
        return "Ellipse";
      }
    }

    public double P() {
        return Math.PI*(3*(a + b) - Math.sqrt((3*a+b)*(a+3*b)));
    }
    
    public boolean Validation() {
        return a > 0 && b > 0;
    }
    public double S() {
        return a * b * Math.PI;
    }
    public String ConvertToStr() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, a, b, Shape(), P(), S());
    }

    public boolean equal(Ellipse ellipseVar) {
        boolean A2 = Utils.equals(a, ellipseVar.a);
        boolean B2 = Utils.equals(b, ellipseVar.b);
        boolean A2Inverted = Utils.equals(a, ellipseVar.a);
        boolean B2Inverted = Utils.equals(b, ellipseVar.b);

        return (A2 && B2) || (A2Inverted && B2Inverted);
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("a: ");
            a = Utils.INPUT.nextDouble();
            System.out.print("b: ");
            b = Utils.INPUT.nextDouble();
        } while (!Validation());
    }
}
