import java.util.ObjectPropertyEX;
/**
 * 여기에 p344 클래스 설명을 작성하십시오.
 * 
 * @author (테라오카유이카 2018315053) 
 * @version (2019.09.06)
 */
public class Point
{
    int x,y;
    public Point(int x, int y){
        this.x = x; 
        this.y = y;
    }
}
public class ObjectPropertyEX{
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());// 클래스 이름
        System.out.println(obj.hashCode());//해시 코드 값
        System.out.println(obj.toString());//객체를 문자열로 만들어 출력
        System.out.println(obj);//객체 출력
    }
    public static void main(String[] args){
        Point p = new Point(2,3);
        print(p); 
    }
}
