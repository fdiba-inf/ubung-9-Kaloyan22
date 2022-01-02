package exercise9;

public class Rectangle {
    private Point Anfang;
    private double h;
    private double Br;

    public Rectangle() {
        Anfang = new Point(0, 0);
        h = 1;
        Br = 1;
    }

    public Rectangle(Point Anfang, double h, double Br) {
        this.Anfang = new Point(Anfang);
        this.h = h;
        this.Br = Br;
    }

    public Rectangle(Rectangle otherRectangle) {
        Anfang = new Point(otherRectangle.Anfang);
        h = otherRectangle.h;
        Br = otherRectangle.Br;
    }

    public boolean isValid() {
        return h > 0 && Br > 0;
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            Anfang.initialize();
            System.out.print("Enter h: ");
            h = Utils.INPUT.nextDouble();
            System.out.print("Enter Br: ");
            Br = Utils.INPUT.nextDouble();
        } while (!isValid());
    }

    public double calculatePerimeter() {
        return h * 2 + Br * 2;
    }

    public double calculateArea() {
        return h * Br;
    }

    public String getType() {
        return (h == Br) ? "Square" : "Rectangle";
    }

    public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", Anfang, h, Br, getType(), calculatePerimeter(), calculateArea());
    }

    public boolean equals(Rectangle otherRectangle) {
        boolean sameh = Utils.equals(h, otherRectangle.h);
        boolean sameBr = Utils.equals(Br, otherRectangle.Br);
        boolean samehReversed = Utils.equals(h, otherRectangle.Br);
        boolean sameBrReversed = Utils.equals(Br, otherRectangle.h);

        return (sameh && sameBr) || (samehReversed && sameBrReversed);
    }
}
