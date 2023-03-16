package Demo;

/**
 * @Author: 林宇扬
 * @Date: 2023/3/3 14:30
 * @Java version: 1.8.0_361
 * @Description:NULL
 */
public class FiveException extends Exception  {
    public FiveException(){
        super("除数不能为5");
    }
    public FiveException(String message){
        super(message);
    }
}