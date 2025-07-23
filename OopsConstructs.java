class Point {
    private double x;
    private double y;

    public Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(((x * x) + (y * y)));
    }

    public double distance(Point point){
        double resX = point.x - this.x;
        double resY = point.y - this.y;

        return Math.sqrt(resX * resX + resY * resY);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
}

class Tester{
    public static void  main(String args[]){
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(3);

        System.out.println("The distance of P1 from the origin is " + p1.distance());

        Point p2 = new Point(5, 6);
        System.out.println("The distance of p1 from p2 is " + p2.distance(p1));
    }
}