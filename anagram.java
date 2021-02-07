import java.util.*;
public class anagram {
    static int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "abc";

        show("", word);
        System.out.println("number of anagram : " + c);

    }

    static void show(String s1, String w) {
        if(w.length() <= 1) {
            c++;
            System.out.println(s1 + w);
        } else {
            for(int i = 0; i < w.length(); i++) {
                String x = w.substring(i, i+1);
                String y = w.substring(0, i);
                String z = w.substring(i+1);

                show(s1 + x, y + z);
            }
        }
    }

}



//public class anagram {
//
//    static Set<String> hash_Set = new HashSet<>();
//
//    // Recursive function to generate permutations of the string
//    static void Permutation(String str, String ans) {
//
//        // If string is empty
//        if (str.length() == 0) {
//
//            // Add the generated permutation to the set in order to avoid duplicates
//            hash_Set.add(ans);
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//
//            // ith character of str
//            char ch = str.charAt(i);
//
//            // Rest of the string after excluding the ith character
//            String ros = str.substring(0, i) + str.substring(i + 1);
//
//            // Recursive call
//            Permutation(ros, ans + ch);
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        String s = "abc";
//
//        // Generate permutations
//        Permutation(s, "");
//
//        // Print the generated permutations
//        hash_Set.forEach((n) -> System.out.println(n));
//
//        String name = "jayant";
//        System.out.println(name.substring(2));
//    }
//}





