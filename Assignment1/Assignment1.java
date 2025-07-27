package Assignment1;

class Quadratic{
    public int a;
    public int b;
    public int c;

    public Quadratic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int discriminantValue(){
        int bValue = b*b;
        return bValue - (4 * a * c);
    }

    public void resultValue(){
        int discriminValue = this.discriminantValue();
        if(discriminValue == 0){
            int temp = -b / 2*a;
            System.out.println("value is 0 " + temp);
        }else if(discriminValue > 0){
            double squareValue = b*b - (4*a*c);
            double squareRootValue = Math.sqrt(squareValue);
            double addTemp = -b + squareRootValue;
            System.out.println("value is >0 " + (addTemp / (2 * a)));

            double subTemp = -b - squareRootValue;
            System.out.println("value is >0 " + (subTemp / (2 * a)));
        }else{
            System.out.println("The equations does not have real roots");
        }
    }
}

class Tester{
    public static void main(String args[]){
        Quadratic q1 = new Quadratic(1,4,6);
        q1.resultValue();
    }
}