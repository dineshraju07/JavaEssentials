package ArraysExercise1;

class CricketScore {

    public static void main(String args[]) {

        int[] score = {281, 344, 265, 272, 236, 324, 287};
        double avg = 0, sum = 0;
        int eql = 0, lower = 0, higher = 0;
        for (int val : score) {
            avg += val;
        }

        sum = avg / score.length;

        System.out.println("The Average score of the team is " + sum + " runs");
        for (int val : score) {
            if(val == sum){
                eql++;
            } else if (val > sum) {
                higher++;
            }else{
                lower++;
            }
        }
        System.out.println("Number of matches having score above average is " + higher);
        System.out.println("Number of matches having score equal to average is " + eql);
        System.out.println("Number of matches having score below average is " + lower);
    }

}