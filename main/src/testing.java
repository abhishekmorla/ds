public class testing {

    public static void main(String[] args) {
        int x = 1234321;
        int rev = 0;
        while(x > 0)
        {
            int rem = x % 10;
            rev = rem + rev * 10;
            x = x/10;
        }
        System.out.println(rev);
    }
}

