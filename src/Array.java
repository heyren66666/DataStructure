public class Array {
    private String [] strArray;
    private int length=0;

    //构造方法
    public Array(int max){
        strArray=new String [max];
    }
    //检测是否包含某个元素
    public int contains(String target){
        int index=-1;
        for (int i=0;i<length;i++){
            if (strArray[i].equals(target)){
                index=i;
                break;
            }
        }
        return index;
    }

    //插入
    public void insert(String elem){
        strArray[length]=elem;
        length++;
    }

    //删除某个指定元素值，删除成功则返回true，否则返回false
    public boolean delete(String target){
        int index=-1;
        if ((index=contains(target))!=-1){
            for (int i=index;i<length;i++){
                strArray[i]=strArray[i+1];
            }
            length--;
            return true;
        }else{
            return false;
        }
    }

    //列出所有元素
    public void display(){
        for (int i=0;i<length;i++){
            System.out.print(strArray[i]+"\t");
        }
    }
}
