public class Trapezoid {
    // a  b
    //d    c
    myPoint a, b, c, d;
    myPoint point = new myPoint(0, 0);
    Trapezoid(myPoint a, myPoint b, myPoint c, myPoint d) {
        if (b.y != a.y || c.y != d.y) {
            System.out.println("illegal!!! \n this trapezoid is illegal!");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getAreaByVector() {
        return (point.CrossProduct(point.getVector(d, a), point.getVector(d,b))
                + point.CrossProduct(point.getVector(d, b), point.getVector(d, c)))/2;
    }

    public double getAreaByShape() {
        return (((b.x-a.x)+(c.x-d.x))*(a.y-d.y))/2;
    }

}
