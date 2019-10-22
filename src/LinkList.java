public class LinkList {
    private Link first;
    public LinkList(){
        first=null;
    }

    //插入到链表的前端
    public void insertFirst(Link link){
        link.next=first;
        first=link;
    }

    //删除第一个链结点，返回删除的链结点引用
    public Link deleteFirst() throws Exception{
        if (isEmpty){
            throw new Exception("链表尾空！不能进行删除操作");
        }
        Link temp=first;
        first=first.next;
        return temp;
    }

    //打印出所有的链表元素
    public void displayList(){
        Link cur=first;
        while (cur !=null){//循环打印每个链结点
            cur.displayLink();
            cur=cur.next;
        }
    }

    //删除属性为指定值得链结点
    public Link delete(int key){
        Link link=null;
        Link cur=first;
        Link next=first.next;
        Link previous=null;
        while (cur!=null){
            if (cur.age==key){//找到要删除的链结点
                link=cur;
                //如果当前链结点的前驱为null，证明当其为链表的第一个链结点，删除该链结点后需要对first属性重新赋值
                if (previous==null){
                    this.first=next;
                }else {
                    //删除操作，即将前驱的next指针指向当前链结点的next，链表中将去当前链结点这一环
                    previous.next=next;
                }
                break;
            }else if (cur.next==null){//当前链结点不是目标且下一个链结点为null，证明没有要删除的结点
                break;
            }

            //当前链结点不是要删除的目标，则向后继续寻找
            next=next.next;
            cur=cur.next;
            previous=cur;
        }

        return link;
    }

    //查找属性为指定值得链结点

}
