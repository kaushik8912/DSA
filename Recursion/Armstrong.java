package Recursion;

public class Armstrong {
    static boolean isArmstrong(int org, int compute, int copy) {
        if (org == 0) {
            if (compute == copy) {
                return true;
            }
            return false;
        }
        int rem = org % 10;
        compute = compute + (rem * rem * rem);
        return isArmstrong(org / 10, compute, copy);

    }

    public static void main(String[] args) {
        int num = 153;
        boolean result = isArmstrong(num, 0, num);
        System.out.println(result ? "Armstrong" : "Not Armstrong");
    }
}
