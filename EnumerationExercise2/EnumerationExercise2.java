package EnumerationExercise2;

//import EnumerationExercise1.Student;

enum Category{
    MOBILE, TABLET, COMPUTER, LAPTOP;
}

class Shop{
    private double amount;
    private Category type;
    private double discount;
    public Shop(double amount, Category type){
        this.amount = amount;
        this.type = type;
    }

    public Category getType(){
        return type;
    }

    public double getAmount(){
        return this.amount;
    }

    public void checkDiscountApplicability(double amount, Category type){
        if(amount >= 30000){
            System.out.println("you are applicable for discount");
            this.applyDiscount(amount, type);
        }else{
            System.out.println("Total Amount is " + this.amount);
        }
    }

    public void applyDiscount(double amount, Category type){
        switch (type){
            case Category.MOBILE:
                System.out.println("Before discount amount is " + amount + " After discount amount is "+ discountCalculator(amount, 15));
                break;
            case Category.TABLET, Category.COMPUTER:
                System.out.println("Before discount amount is " + amount + " After discount amount is "+ discountCalculator(amount, 10));
                break;
            case Category.LAPTOP:
                System.out.println("Before discount amount is " + amount + " After discount amount is "+ discountCalculator(amount, 8));
                break;
            default:
                break;
        }
    }

    public double discountCalculator(double amount, int discount){
        return (amount - (amount * (float)discount/100));
    }
}

class Tester{
    public static void main(String args[]){
        Shop shop = new Shop(50000, Category.COMPUTER);
        shop.checkDiscountApplicability(shop.getAmount(), shop.getType());
    }
}