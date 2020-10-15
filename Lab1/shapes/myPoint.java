public class myPoint {
    double x;
    double y;

    myPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double CrossProduct(myPoint a, myPoint b) {
        double res;
        res = (a.y*b.x-a.x*b.y);
        return res > 0 ? res : -res;
    }

    public myPoint getVector(myPoint a, myPoint b) {
        myPoint res = new myPoint(b.x - a.x, b.y - a.y);
        return res;
    }

}
