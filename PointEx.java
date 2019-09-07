//import java.util.ObjectPropertyEx;
/**
 * 여기에 p344 클래스 설명을 작성하십시오.
 * 
 * @author (테라오카유이카 2018315053) 
 * @version (2019.09.06)
 */
public class PointEx
{
    int x,y;
    public PointEx(int x, int y){
        this.x = x; 
        this.y = y;
    }
}
public class EqualsExample{
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());// 클래스 이름
        System.out.println(obj.hashCode());//해시 코드 값
        System.out.println(obj.toString());//객체를 문자열로 만들어 출력
        System.out.println(obj);//객체 출력
    }
    public static void main(String[] args){
        PointEx p = new PointEx(2,3);
        print(p); 
    }
}
