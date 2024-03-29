/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/10/14 22:20
 * @ClassName Stack
 * @Version 1.0
 **/
public class Stack {
    private int size;//栈的大小
    private int top;//栈顶元素的下标
    private char[] stackArray;//栈的容器

    //构造函数
    public Stack(int size){
        stackArray=new char[size];
        top=-1;//初始化栈的时候，栈内无元素，栈顶下标设置为-1
        this.size=size;
    }

    //入栈，同时，栈顶院的下标加一
    public void push(char elem){
        stackArray[++top]=elem;//插入栈顶
    }

    //出栈，删除栈顶元素，同时，栈顶元素的下标减一
    public char pop(){
        return stackArray[top--];
    }

    //查看栈顶元素，但不删除
    public char peek(){
        return stackArray[top];
    }

    //判空
    public boolean isEmpty(){
        return (top==-1);
    }

    //判满
    public boolean isFull(){
        return (top==size-1);
    }
}
