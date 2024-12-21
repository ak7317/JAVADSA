public class Linklist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
   
    public void addFirst(int data){
        //step1=create newnode
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
           
           
            return;
        }
        
        //step2=newNode.next=head
        newNode.next=head;
        //step3=head=newNode
        head=newNode;
    
    

    }
    public void print(){
       
        if(head==null){
            System.out.print("ll is empty");
        }
        Node temp=head;
        while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
        }
        System.out.println("null");
    }
   

    

    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
       
    }
}
