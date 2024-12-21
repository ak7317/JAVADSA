import java.util.*;
public class pattern {
    public static void patt3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void patt4(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void Inverted_rotated_halfpyramid(int n){
        /*
           *
          **
         ***
        ****
       *****
         */

        for(int i=1;i<=n;i++)
            {
                //spaces
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                
                //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            
                System.out.println();
            }
        
         
        }
        public static void Inverted_halfpyramid_with_number(int n){
            /*
            12345
            1234
            123
            12
            1
             
             */
    
            for(int i=1;i<=n;i++)
                {
            
        
                    
                    for(int j=1;j<=n;j++){
                        if(i+j<=n+1){
                        System.out.print(j);
                        }
                    }
                
                    System.out.println();
                }
            
             
            }
            public static void flouds_Tringle(int n){
                int val=1;
                for(int i=1;i<=n;i++){
                    
                    for(int j=1;j<=i;j++){
                        System.out.print(val+" ");
                        val++;
                        
                    }
                   
                    System.out.println();
                }
            }
            public static void zero_1_Tringle(int n){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        if((i+j)%2==0){
                            System.out.print("1"+" ");
                        }
                        else{
                            System.out.print("0"+" ");
                        }
                        
                    }
                    System.out.println();
                }
            }
            public static void butterfly(int n){
                /*
      
                 */
                // 1st half
                for(int i=1;i<=n;i++){
                    
                    // stars
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    //spaces
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                 //2nd half
                 for(int i=n;i>=1;i--){
                    
                    // stars
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    //spaces
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            public static void solid_RHOMBUS(int n){
                for(int i=1;i<=n;i++){
                    //spaces
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=n;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            public static void hollow_RHOMBUS(int n){
                for(int i=1;i<=n;i++){
                    //spaces
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    // hollow
                    for(int j=1;j<=n;j++){
                        if(i==1||i==n||j==1||j==n){
                        System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
            public static void diamond(int n){
                //1st half
                for(int i=1;i<=n;i++){
                    //spaces
                    for(int j=1;j<=n-i;j++){
                        System.out.print("  ");
                    }
                    for(int j=1;j<=(2*i)-1;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                // 2nd half
                for(int i=n;i>=1;i--){
                    //spaces
                    for(int j=1;j<=n-i;j++){
                        System.out.print("  ");
                    }
                    for(int j=1;j<=(2*i)-1;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Inverted_rotated_halfpyramid(n);
    
        // Inverted_halfpyramid_with_number(n);
        // flouds_Tringle(n);
        // zero_1_Tringle(n);
        // butterfly(n);
        // hollow_RHOMBUS(n);
        diamond(n);


    }

    }

