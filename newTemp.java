import  java.lang.Math;

public class newTemp {

    static void print(int arr[]){

        for(int i: arr){
            System.out.print(" "+i);
        }
    }
    static void sort(int a[],int n){
        int neg = 0;
        int i = 0, j = 0;
        for(i=0; i<n; i++) {
            if (Math.abs(a[i])!=a[i])
            {
                neg++;
            }
        }
        System.out.println(neg);
        i=0;
        for(j=0;j<n;j++){
            if(Math.abs(a[j])!=a[j])
            {
                a[i]=a[j];
                i++;
            }
            else{
                a[neg]=a[j];
                neg++;
            }
        }
        print(a);
    }

    public static void main(String[] args) {
        int arr[]= new int []{-2,1,-3,4,-6,8,0};
        print(arr);
        System.out.println("");
        sort(arr,7);

    }
}

