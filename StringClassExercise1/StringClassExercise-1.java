package StringClassExercise1;

class Customer{
    private String name;
    private int discount;

    public void findDiscountAndName(String inputString){
        String[] val = inputString.split(":");
        if(val[0].equalsIgnoreCase("Regular")){
            this.discount = 10;
        }else{
            this.discount = 20;
            // checking
            // checking 3
        }
        this.name = val[1];
        System.out.println("Hi "+this.name+"! "+this.discount+"% discount is applicable for you");
    }

}

class Tester{
    public static void main(String args[]){
        Customer c1 = new Customer();
        c1.findDiscountAndName("Regular:Sai");
    }
}