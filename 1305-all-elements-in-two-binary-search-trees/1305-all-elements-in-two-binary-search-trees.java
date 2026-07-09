class Solution {
    void merge(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c){
        int i = 0,j = 0;
        while(i < a.size() && j < b.size()){
            if(a.get(i) < b.get(j)){
                c.add(a.get(i));
                i++;
            }
            else {
                c.add(b.get(j));
                j++;
            }
        }
        if(i < a.size()){
            while(i < a.size()){
                c.add(a.get(i));
                i++;
            }
        }else{
            while(j < b.size()){
                c.add(b.get(j));
                j++;
            }
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        TreeNode curr = root1;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right;
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right == curr){
                    pred.right = null;
                    a.add(curr.val);
                    curr = curr.right;
                }
            }else{
                a.add(curr.val);
                curr = curr.right;
            }
        } 
        curr = root2;
        while(curr != null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right;
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right == curr){
                    pred.right = null;
                    b.add(curr.val);
                    curr = curr.right;
                }
            }else{
                b.add(curr.val);
                curr = curr.right;
            }
        }
        ArrayList<Integer> c = new ArrayList<>();
        merge(a,b,c);
        return c;
    }
}