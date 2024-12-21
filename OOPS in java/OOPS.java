public class oops {
   
    
        public static void main(String args[]){
            Pen p1=new Pen();
            p1.setcolor("yellow");
            System.out.println(p1.color);
            p1.settip(5);
            System.out.println(p1.tip);
            Student st=new Student();
            st.caclperc(80,80,80);
            System.out.println(st.percen);
            BankAccount myacc=new BankAccount();
            myacc.username="Aaman";
            System.out.println(myacc.username);
            // myacc.password="k123";
            myacc.setpassword("khan123");
           
    
        }
    }
    class BankAccount{
       public String username;
       private String password;
       public void setpassword(String pwd){
        password=pwd;
       }

    }
        
    class Pen{
        String color;
         int tip;
        void setcolor(String newcolor){
         color=newcolor;
        }
        void settip( int newtip){
            tip=newtip;
        }
    }
    class Student {
        String name;
        int age;
        float percen;
        void caclperc(int phy,int che,int math){
             percen=(phy+che+math)/3;
            }
    }
    
    

