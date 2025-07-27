package StaticExercise1;

class Car{
    private String color;
    private static int numberOfCars;

    public Car(String color){
        numberOfCars++;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public static int getNumberOfCars(){
        return numberOfCars;
    }

    public void displayColor(){
        System.out.println("Color of the color: " + color);
    }
}

class Tester{
    public static void displayColor() {
        System.out.println("Display car details");
    }

    public static void main(String args[]){

        Car c1 = new Car("Red");
        Car c2 = new Car("Green");
        Car c3 = new Car("Blue");

        Tester.displayColor();
        System.out.println("Number of cars created: " + Car.getNumberOfCars());
        System.out.println("Color of cars: ");
        c1.displayColor();
        c2.displayColor();
        c3.displayColor();
    }
}