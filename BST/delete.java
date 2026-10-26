class delete{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node Delete(Node root, int val){
        if(root.data > val){
            //left subtree
            root.left = Delete(root.left, val);
        }else if(root.data < val){
            //right subtree
            root.right = Delete(root.right, val);
        }else{//voila
            //root.data == val
            //case 1: no child
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2: one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3: two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        } 
        inorder(root);  
        System.out.println();
        root = Delete(root, 5);
        inorder(root);

    }
    
}