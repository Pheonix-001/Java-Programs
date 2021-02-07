package recursion;

public class Fact {

    public static void main(String[] args) {


        System.out.println(factorial(5));;
    }


    static int factorial(int n) {

        int result = 0;

        if (n > 0) {
            result =  n * factorial(n - 1);
        }
        else{
            result = 0;
        }

        return result;

    }
}

