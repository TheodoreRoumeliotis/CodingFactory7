package gr.aueb.cf.ch2;

public class FrogJumps {
    public static void main(String[] args) {

        int start = 10;
        int target = 85;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double) hop);


        System.out.printf("Jumps: %d", jumps);
    }
}
