//二叉搜索树的封装类
public class BinaryTree {
    private Node root;
    public BinaryTree(){
        root=null;
    }

    //按关键字查找节点
    public Node find(int key){
        Node cur=root;//从根节点开始查找
        if (cur==null){//如果树为空，直接返回null
            return null;
        }

        while (cur.age!=key){
            if (key<cur.age){
                cur=cur.leftChild;//如果关键字比当前节点小，转向左子节点
            }else {
                cur=cur.rightChild;//如果关键字比当前节点大，转向右子节点
            }
            if (cur==null){//没有找到结果，搜索结束
                return null;
            }
        }
        return cur;
    }

    //插入新节点
}
