import java.util.*;
public class Array {
    public static int linersearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int binarysearch(int arr[],int key){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                st=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;

    }
    //using bruteforce
    public static void reversebrute(int arr[]){
        int n=arr.length;
        
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    // using two pointer approach
    public static void reversearr(int arr[]){
        int st=0,end=arr.length-1;
        while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        System.out.print("Reverse array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // pairs
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter size of arr:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the element");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.print("enter the key");
        // int key=sc.nextInt();
        // int index=linersearch(arr, key);
       
        // int index=binarysearch(arr, key);
        // System.out.print("index of key:"+index);
        /*
         for reverse array
         */
        // reversearr(arr);
        // reversebrute(arr);
        pairs(arr);
        
       
    
       
    }
}
