package Assignment2;

//enum MovieId{
//    MOVIE1(101),
//    MOVIE2(102),
//    MOVIE3(103);
//
//    private final int movieNumber;
//
//    private MovieId(int movieNumber){
//        this.movieNumber = movieNumber;
//    }
//
//    public int getMovieId(){
//        return movieNumber;
//    }
//}

//enum MovieFare{
//    MOVIE1(120),
//    MOVIE2(170),
//    MOVIE3(150);
//
//    private final int movieFareAmount;
//
//    private MovieFare(int movieFareAmount){
//        this.movieFareAmount = movieFareAmount;
//    }
//
//    public int getMovieFare(){
//        return movieFareAmount;
//    }
//}

class BookMyMovie{
    private int movieId;
    private int noOfTickets;
    private double discount;
    private double totalAmount;

    public BookMyMovie(int movieId, int noOfTickets){
        this.movieId = movieId;
        this.noOfTickets = noOfTickets;
    }

    public int getMovieId(){
        return movieId;
    }

    public int getNoOfTickets(){
        return noOfTickets;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void calculateDiscount(){
        int id = movieId;
        if((movieId== 101 || movieId == 102 || movieId == 103) && noOfTickets < 5){
            discount = 0;
        } else if ((movieId == 101 || movieId==103) && (noOfTickets >=5 && noOfTickets < 10)) {
            discount = 15;
        } else if ((movieId == 101 || movieId==103) && (noOfTickets >= 10 && noOfTickets <= 15)) {
            discount = 20;
        } else if ( movieId == 102 && (noOfTickets >=5 && noOfTickets < 10)) {
            discount = 10;
        } else if (movieId == 102 && (noOfTickets >=10 && noOfTickets < 15)) {
            discount = 15;
        }else{
            discount = 0;
        }
    }

    public void calculateTicketAmount(){
        this.calculateDiscount();
        if(movieId == 101){
            totalAmount = 120 * noOfTickets - (120 * noOfTickets * (discount/100));
        }else if(movieId == 102){
            totalAmount = 170 * noOfTickets - (170 * noOfTickets * (discount/100));
        }else if(movieId == 103){
            totalAmount = 150 * noOfTickets - (150 * noOfTickets * (discount/100));
        }else{
            System.out.println("please select the appropriate movie");
        }
        System.out.println(totalAmount);
    }
}

class Tester{
    public static void main(String args[]){
        BookMyMovie b1 = new BookMyMovie(103, 8);
        b1.calculateTicketAmount();
    }
}
