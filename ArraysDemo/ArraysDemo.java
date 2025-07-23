package ArraysDemo;

class Pizza{
    String[] pizzaSize = {"Regular","Medium","Large"};
    int[] pizzaCost = {100,250,390};

    public String[] pizzaOdered;
    public int[] quantityOrdered;

    public Pizza(String[] pzOrder, int[] qtyOrder){
        this.pizzaOdered = pzOrder;
        this.quantityOrdered = qtyOrder;
    }

    public void totalAmount(){
        float totalBIll = 0f;

        for(int i=0;i<pizzaSize.length;i++){
            for(int j=0;j<pizzaOdered.length;j++){
                if(pizzaSize[i].equalsIgnoreCase(pizzaOdered[j])){
                    totalBIll += pizzaCost[i] * quantityOrdered[j];
                }
            }
        }
        //5% discount
        totalBIll = totalBIll - (totalBIll*(float)5/100);
        System.out.println("Total Amount is "+totalBIll);
    }
}

class Tester{
    public static void main(String args[]){
        Pizza p1 = new Pizza(new String[]{"Medium","Regular"}, new int[]{2,1});
        p1.totalAmount();
    }
}