public class Circle {
    myPoint central;
    double R;
    private double Pi = 3.14;

    Circle(myPoint a, double R) {
        this.central = a;
        this.R = R;
    }

    public double getArea() {
        return Pi*R*R;
    }

}
