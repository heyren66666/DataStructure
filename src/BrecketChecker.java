import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author heyren
 * @Description //TODO
 * @Date 2019/10/14 22:45
 * @ClassName BrecketChecker
 * @Version 1.0
 **/
public class BrecketChecker {
    private String input;

    //构造方法，接收待检查的字符串
    public BrecketChecker(String in){
        this.input=in;
    }

    //检查分隔符匹配的方法
    public void check(){
        int strLength=input.length();
        Stack stack=new Stack(strLength);

        for (int i=0;i<strLength;i++){
            char ch=input.charAt(i);//一次获取串中的单个字符
            switch (ch){
                case '{':
                case '[':
                case '(':
                    //如果为左分隔符，压入栈
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    //如果为右分割符，与栈顶元素进行匹配
                    if(!stack.isEmpty()){
                        char chx=stack.pop();

                        if ((ch=='{'&&chx!='}')||
                            (ch=='['&&chx!=']')||
                                (ch=='('&&chx!=')')
                                ){
                            System.out.println("匹配出错！字符："+ch+",下标："+i);
                        } else {
                            System.out.println("匹配出错！字符："+ch+",下标："+i);
                        }

                    }
                    default:
                        break;
            }
        }

        if (!stack.isEmpty()){
            System.out.println("有括号没有关闭！");
        }
    }

    public static void main(String[] args){
        System.out.println("输入需要检测的字符串：");
        String str=getString();
        BrecketChecker brecketChecker=new BrecketChecker(str);
        brecketChecker.check();
    }

    public static String getString(){
        String str="";
        try {
            InputStreamReader reader=new InputStreamReader(System.in);
            BufferedReader bufferedReader=new BufferedReader(reader);
            str=bufferedReader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
}



