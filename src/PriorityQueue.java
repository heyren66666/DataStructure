import java.net.MalformedURLException;

public class PriorityQueue {
    private int[] queArray;
    private int maxSize;
    private int length;//队列长度
    private int referencePoint;//基准点

    //构造方法，初始化队列
    public PriorityQueue(int maxSize,int referencePoint){
        this.maxSize=maxSize;
        this.referencePoint=referencePoint;
        queArray=new int[maxSize];
        length=0;
    }

    //插入
    public void insert(int elem) throws Exception{
        if (isFull()){
            throw new Exception("队列已满，不能进行插入操作");
        }
        if (length==0){
            queArray[length++]=elem;
        }else {
            int i;
            for (i=length;i>0;i--){
                int dis= Math.abs(elem-referencePoint);//待插入元素距离
                int curDis=Math.abs(queArray[i-1]-referencePoint);//当前元素的距离
                //将比插入元素优先级高的元素后移一位
                if (dis>=curDis){
                    queArray[i]=queArray[i-1];
                }else {
                    break;
                }
            }
            queArray[i]=elem;
            length++;
        }

    }

    //移除
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("队列为空，不能进行删除操啊在！");
        }
        int elem=queArray[--length];
        return elem;
    }

    //查看队头元素
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("队列内没有元素！");
        }
        return queArray[length-1];
    }

    //返回队列长度
    public int size(){
        return length;
    }

    //判空
    public boolean isEmpty(){
        return (length==0);
    }

    //判满
    public boolean isFull(){
        return (length==maxSize);
    }
}
