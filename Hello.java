import java.util.Arrays;

class Hello {

    public static void main(String args[]) {

//        System.out.println("hi");
//        var res=11;
//        res = Integer.parseInt("98");
//      System.out.println("discont is" + 100 *(1-25.5/100));
//        String val = "hi";
//        val = val.replace("h", "j");
//        System.out.println(res);
//        int n1 = 100;
//        int n2;
//        int n3;
//        n2 = ++n1;
//        n3 = n2++;
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        int temperature = 25;
//        double kelvin = 273.15;
//        double res = temperature + kelvin;
//        System.out.println(res);

//        int pointer = 0;
//        int value = 1;
//        while(true){
//            ++pointer;
//            System.out.println(pointer);
//            if(pointer % 2 == 0){
//                continue;
//            }else if(pointer % 5 == 0){
//                break;
//            }
//
//            value *= 3;
//            System.out.println(value);

//        String lucky = "1523";
//        int res = 0;
//        for (int i = 0; i < lucky.length(); i++) {
//            if (i % 2 != 0) {
//                int temp = Integer.parseInt(String.valueOf(lucky.charAt(i)));
//                res += temp * temp;
//                System.out.println(Integer.parseInt(String.valueOf(lucky.charAt(i))));
//            }

//        }
//        System.out.println(res);
//        if (res % 9 == 0) {
//            System.out.println("lucky");
//        } else {
//            System.out.println("not lucky");
//        }

        //---------String------------
//        String s1 = "Saidine kjjj";
//        String s2 = "sai";
//        String[] res = s1.split(" ");
//        int a = 9;
//        for(String val: res){
//        System.out.println(val);
//        }
//        StringBuilder s1 = new StringBuilder("sai");
//        String s2 = s1.toString();
//        System.out.println("din"+s2);
//        System.out.println(Character.valueOf('5'));
//        int[] n1 = new int[]{1, 2};
//        int[] n2 = new int[2];
//        n2[0] = 1;
//        n2[1] = 2;
//        System.out.println(Arrays.binarySearch(n1, 8));
//        System.out.println(Arrays.toString(n1));

        int marks =79;
        if(marks > 80){
            System.out.println("above 80");
        } else if (marks>60 && marks<=80) {
            System.out.println("below 81");
        }else{
            System.out.println("50");
        }
    }
}
