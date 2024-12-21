import java.util.*;
public class sorting{
   
    static void selectionSort( int arr[], int n)
    {
         
         for( int i=0; i< n-1 ; i++)
         {
             int maxIndex = i;

             for( int j=i+1; j<n; j++)
             {
                 if( arr[j]> arr[maxIndex])
                 {
                     maxIndex = j;
                 }
             }
             
             int temp = arr[i];
             arr[i]= arr[ maxIndex];
             arr[maxIndex]= temp;

         }

    }
    public static void countsort(int arr[],int n){

         
         int maxElement= 0;

         for( int i=0;i<n;i++)
         {
             if( arr[i] > maxElement)
             {
                 maxElement = arr[i];
             }
         }

         int count[]= new int[ maxElement+1];

         for( int i=0;i<n;i++)
         {
            count[arr[i]]++;  
         }

         for( int i= maxElement; i>=0;i--)
         {
               int freq = count[i];

               while(freq<0)
               {
                   System.out.print(  arr[i]+" " );
                   freq--;
                   
               }
               
         }
    }
    public static void insertionsort(int arr[],int n){
        
        for( int i=1;i<n;i++)
        {
            int key= arr[i];

            int j= i-1;

            while( j>=0 && arr[j]< key )
            {
                 arr[j+1] = arr[j];
                 j--;
            }

            arr[j+1]= key;
    }
}
// trapping water 
public static int trappedwater(int arr[]){
    int n=arr.length;
    // left maxboundatu arr
    int leftmaxbound[]=new int[n];
    leftmaxbound[0]=arr[0];
    for(int i=1;i<n;i++){
        leftmaxbound[i]=Math.max(arr[i],leftmaxbound[i-1]);
    }
    //right maxboindaty arr
    int rightmaxbound[]=new int[n];
    rightmaxbound[n-1]=arr[n-1];
    for(int i=n-2;i>=0;i--){
        rightmaxbound[i]=Math.max(arr[i],rightmaxbound[i+1]);
    }
    //loop
    int trappedwater=0;
    for(int i=0;i<n;i++)
    {   //waterlevel=min(leftmaxbound,rightmaxbound)
        int waterlevel=Math.min(leftmaxbound[i],rightmaxbound[i]);
        trappedwater +=waterlevel-arr[i];//trapped water=waterlevel-height[i]or arr[i]
    }
    return trappedwater;
    
    
}
    

    public static int buyandsell(int prices[]){
        int n=prices.length;
        int maxpro=0;
        int bestbuy=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]>bestbuy){
                maxpro=Math.max(maxpro,prices[i]-bestbuy);
            }
            bestbuy=Math.min(bestbuy,prices[i]);
        }
        return maxpro;
    }
    public static void main(String[] args) 
    {
        //  int arr[]= {1,3,5,7,9};
        //  int n= arr.length;

        //  selectionSort( arr, n);
        // countsort(arr, n);
        // insertionsort(arr, n);

        //  for( int i=0;i<n;i++)
        //  {
        //      System.out.print(arr[i]+" ");
        //  }
        /*for traped water */
        // int arr[] ={4, 2, 0, 6, 3, 2, 5};
        // System.out.print(trappedwater(arr));

        //for buyand sell
        int prices[]={7,1,5,3,6,4};
        System.out.print(buyandsell(prices));
    }
    
}