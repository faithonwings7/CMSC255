class Exercise09_09{
    public static void main(String[] args){

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10 , 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
}

class RegularPolygon{
    //defines number of sides in polygon : default 3
    int n = 3; //number of sides
    private double side = 1.0; //length of side
    private double x = 0.0; //x-coordinate of polygon's center
    private double y = 0.0; //y-coordinate of polygon's center

    //Construct polygon object with default values
    RegularPolygon(){

    }

    // Construct a polygon object with specified number of sides and length of side, centere 0,0
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    //Construct polygon object with specified number sides and length of side and x, y-coordinates
    RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //accessor and mutator methods for all data fields
    public int getN(){
        return this.n;
    }
    public void setN(){
        this.n = n;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(){
        this.side = side;
    }
    public double getX(){
        return this.x;
    }
    public void setX(){
        this.x = x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(){
        this.y = y;
    }

    public double getPerimeter(){
        return this.side * this.n;
    }
    public double getArea(){
        return ((this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n)));
    }

}
