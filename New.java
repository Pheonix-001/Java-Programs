public class New {

    static void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
    }


    public static void main(String[] args) {

        String s = "ABC";
        int len = s.length();
        int left = 0;
        int right = len - 1;

        char x = 'A';
        char y = 'B';

        System.out.println(x + " " + y);

        swap(x, y);
//        char temp = x;
//        x = y;
//        y = temp;

        System.out.println(x + " " + y);



    }
}
