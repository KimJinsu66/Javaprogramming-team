
/**
 * Write a description of class ToStringEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class PointEx{
    int x, y;
    public PointEx(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + "," + y + ")";
    }
}

public class ToStringEx
{
    public static void main(String[] args){
        PointEx  p = new PointEx(2,3);
        System.out.println(p.toString());
        System.out.println(p); // p는 p.toString()으로 자동변환
        System.out.println(p + "입니다"); //p.toString() + "입니다"로 자동변환
        
    }
}
