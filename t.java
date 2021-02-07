import java.util.*;

public class t {
    public static void main(String[] args) {

        phoneBook();


    }



    // Phone book program -> insert name and number and get number by input name
    public static void phoneBook(){
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> contactList = new HashMap<>();

        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            String name = sc.next();
            int num = sc.nextInt();
            sc.nextLine();
            contactList.put(name, num);
        }

        while(sc.hasNext()) {

            String get = sc.next();
            if(contactList.containsKey(get)){
                System.out.println(get + "=" + contactList.get(get));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
