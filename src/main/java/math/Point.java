package math;

public class Point {

    double x, y;

    public Point(double x, double y){

        this.x = x;
        this.y = y;

    }

    public double getX(){

        return x;

    }

    public void setX(double x){

        this.x = x;

    }

    public double getY(){

        return y;

    }

    public void setY(double y){

        this.y = y;

    }

    public double radius(){

        return Math.sqrt((x * x) + (y * y));

    }

    public double distance(double x, double y){

        return Math.sqrt((this.y - y) * (this.y - y) + (this.x - x) * (this.x - x));

    }

}
