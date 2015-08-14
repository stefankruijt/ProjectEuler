package problem9;

public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    public Solution() {
        for(int a=0; a<1000; a++) {
            for(int b=a; b<1000; b++) {
                for(int c=b; c<1000; c++) {
                    if(Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2)) {
                        //System.out.println("Triplet discovered!");
                        continue;
                    }
                    if((a < b && a < c && b < c) && (a + b + c == 1000)) {
                        System.out.println("Answer: a:"+a + " b:" + b + " c:" + c);
                        System.out.println("The product of these numbers is:" + a * b * c);
                        return;
                    }
                }
            }
        }
    }
}