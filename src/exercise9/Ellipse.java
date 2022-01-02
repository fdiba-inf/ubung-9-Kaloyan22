package exercise9;

public class Ellipse {
    private Point Anfang;
    private double a;
    private double b;

    public Ellipse() {
        Anfang = new Point(0, 0);
        a = 1;
        b = 1;
    }

    public Ellipse(Point Anfang, double a, double b) {
        this.Anfang = new Point(Anfang);
        this.a = a;
        this.b = b;
    }

    public Ellipse(Ellipse ellipseVar) {
        Anfang = new Point(ellipseVar.Anfang);
        a = ellipseVar.a;
        b = ellipseVar.b;
    }

    public String getType() {
      if(a==b) {
        return "Circle";
      }
      else {
        return "Ellipse";
      }
    }

    public double calculatePerimeter() {
        return Math.PI*(3*(a + b) - Math.sqrt((3*a+b)*(a+3*b)));
    }
    
    public boolean isValid() {
        return a > 0 && b > 0;
    }
    public double calculateArea() {
        return a * b * Math.PI;
    }
    public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", Anfang, a, b, getType(), calculatePerimeter(), calculateArea());
    }

    public boolean equals(Ellipse ellipseVar) {
        boolean A2 = Utils.isValid(a, ellipseVar.a);
        boolean B2 = Utils.isValid(b, ellipseVar.b);
        boolean A2Inverted = Utils.isValid(a, ellipseVar.a);
        boolean B2Inverted = Utils.isValid(b, ellipseVar.b);

        return (A2 && B2) || (A2Inverted && B2Inverted);
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            Anfang.initialize();
            System.out.print("a: ");
            a = Utils.INPUT.nextDouble();
            System.out.print("b: ");
            b = Utils.INPUT.nextDouble();
        } while (!isValid());
    }
}
