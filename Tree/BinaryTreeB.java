import java.util.*;
public class BinaryTreeB {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node builTree(int nodes[]){
            idx++;
            if( idx>=nodes.length || nodes[idx]==-1){
                return null;
            }
            
            Node newNode=new Node(nodes[idx]);
            newNode.left=builTree(nodes);
            newNode.right=builTree(nodes);
            return newNode;

        
    }
    public static void preorder(Node root){
        if(root==null){
            // System.out.print(-1+" ");
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            // System.out.print(-1+" ");
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            // System.out.print(-1+" ");
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null){
                System.err.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }
            else
            {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int lcount=countNode(root.left);
        int rcount=countNode(root.right);
        return lcount+rcount+1;
    }
    public static int someofNode(Node root){
        if(root==null){
            return 0;
        }
        int lsum=someofNode(root.left);
        int rsum=someofNode(root.right);
        return lsum+rsum+root.data;
    }

     public static int diameter(Node root){
    if(root == null)
    {
        return 0;
    }
     int leftDiam=diameter(root.left);
     int leftHt=height(root.left); // above fun use
     int rightDiam=diameter(root.right);
     int rightHt=height(root.right); // above fun use
     int SelfDiam=leftHt+rightHt+1;
     return Math.max(SelfDiam, Math.max(leftDiam, rightDiam));


  }
  public static boolean isIdentical(Node root, Node subRoot){
    if(root == null && subRoot == null)
    {
        return true;
    }
    if(root == null || subRoot == null || root.data!=subRoot.data)
    {
       return false;
    }
    if(!isIdentical(root.left,subRoot.left)){
        return false;
    }
    if(!isIdentical(root.right,subRoot.right))
    {
        return false;
    }
    return true;
}
public boolean isSubtree(Node root, Node subRoot) {
    if(root == null ) {
        return false;
    }
    if(root.data==subRoot.data){
        if(isIdentical(root,subRoot)){
            return true;
        }
    }
     boolean leftans=isSubtree(root.left,subRoot);
    boolean rightans=isSubtree(root.right,subRoot);
   
    return leftans || rightans;


}
}
public static boolean getpath(Node root, int n,ArrayList<Node>path)  // helper of lca
{
    if( root == null ){
        return false;
    }
path.add(root);
if(root.data==n)
{
return true;
}
 boolean foundLeft= getpath(root.left, n, path);
 boolean foundRight= getpath(root.right, n, path);
 if(foundLeft || foundRight)
 {
    return true;
 }
 path.remove(path.size()-1);
 return false;
}
public static Node lca (Node root , int n1, int n2){
    ArrayList<Node> path1= new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();
    getpath(root,n1,path1);
    getpath(root,n2,path2);
     
    // last common ancestor
    int i=0;
    for(; i<path1.size() && i<path2.size();i++){
        if(path1.get(i)!=path2.get(i)){
            break;
        }
    }
    Node lca= path1.get(i-1);
    return lca;

}
// approach 2;
public static Node lca2(Node root,int n1, int n2)
{
    if(root == null || root.data == n1 || root.data==n2){
        return root;

    }
    Node leftLca=lca2(root.left, n1, n2);
    Node rightLca=lca2(root.right, n1, n2);
    if(rightLca == null){
        return leftLca;
    }
    if(leftLca == null)
    {
        return rightLca;
    }
    return root;
}
public static int lcaDist(Node root,int n){
    if(root == null ){
         return -1;
    }
    if(root.data==n){
        return 0;
    }
    int leftDist= lcaDist(root.left, n);
    int rightDist= lcaDist(root.right, n);
    if(leftDist== 1 && rightDist == -1)
    {
        return -1;
    }
    else if(leftDist ==-1)
    {
        return rightDist +1;
    }
    else
    {
    return leftDist +1;
    }
}
public static int minDist(Node root , int n1,int n2){
    Node lca=lca2(root, n1, n2);
    int dist1=lcaDist(lca,n1);
    int dist2 = lcaDist(lca,n2);
    return dist1+dist2;
}
public static int KthAncesstor(Node root , int n, int k)
{   
    if(root == null)
    {
        return -1;
    }
    if(root.data== n)
    {
        return 0;
    }
    int leftDist = KthAncesstor(root.left, n, k);
    int rightDist = KthAncesstor(root.right, n, k);
    if(leftDist == -1 && rightDist == -1)
    {
        return -1;
    }
    int max = Math.max(leftDist, rightDist);
    if(max+1 == k){
        System.out.println(root.data);
    }
    return max+1;
}
public static int transform(Node root)
{
    if(root == null)
    {
        return 0;
    }
    int leftChild = transform(root.left);
    int rightChild = transform(root.right);
    int data = root.data;
    int newLeft = root.left == null ? 0 : root.left.data;
    int newRight = root.right == null ? 0 : root.right.data;
    
    root.data = newLeft + leftChild + newRight + rightChild;
     
    return data;
}
public static void preorder(Node root)
{
    if(root == null)
    {
        return ;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}


    public static void main(String args[]){
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        // BinaryTree.idx = -1;
     
        // Node root=tree.builTree(nodes);
        // // System.out.println(root.data);
        // // tree.preorder(root);
        // //  BinaryTree.inorder(root);
        // // tree.postorder(root);
        // // tree.levelOrder(root);
        // // System.out.println(tree.height(root));
        // // System.out.println(tree.countNode(root));
        // System.out.println(tree.someofNode(root));
        // Node root = new Node(1);
        // root.left=new Node(2);
        // root.right =new Node(3);
        // root.left.left=new Node(4);
        // root.left.right=new Node(5);
        // root.right.left= new Node(6);
        // root.right.right =new Node(7);
        // System.out.println(tree.diameter(root));

        // main tree
        
        // Node root= new Node(1);
        // root.left= new Node(2);
        // root.right=new Node(3);
        // root.left.left=new Node(4);
        // root.left.right=new Node(5);
        // root.right.left= new Node(6);
        // root.right.right =new Node(7);

        // // subtree
        // Node subRoot= new Node(2);
        // subRoot.left= new Node(4);
        // // subRoot.right=new Node(5);
        // System.out.println(tree.isSubtree(root,subRoot));
        /*
         
         */
        Node root =new Node(1);
        root.left = new Node(2);
        root.right= new Node (3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
         /*
           1
          /   \
         2     3
        / \   / \
       4   5 6   7
         */
        // int n1=4, n2 =7;
        // System.out.println(lca(root,n1,n2).data);
        // System.out.println(lca2(root,n1,n2).data);
        // System.out.println(minDist(root,n1,n2));
        // int n=6, k=1;
        // KthAncesstor(root, n, k);
        transform(root);
        preorder(root);
        


       

 }
}