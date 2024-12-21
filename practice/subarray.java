import java.util.*;
public class subarray {
    public static void subarray(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]={1,-2,6,-1,3};
        subarray(nums);
    }
}
