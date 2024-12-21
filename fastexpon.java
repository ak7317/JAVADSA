public class fastexpon {
        public static void main(String[] args) 
        {
               int a=2,n=8;
               int ans=1;
    
               while( n>0)
               {
                     if( n%2==1 )
                     {
                         ans = ans*a;
                     }
                     n=n/2;
                     a=a*a;
               }
    
               System.out.println( ans );
        }
    }

