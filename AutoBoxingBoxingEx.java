
/**
 * p356
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class AutoBoxingBoxingEx
{
    public static void main(String[] args){
        int n = 10;
        Integer intObject = n;//auto boxing
        System.out.println("intObject = " + intObject);
        
        int m = intObject + 10;//auto unboxing
        System.out.println("m = " + m);
    }
}
