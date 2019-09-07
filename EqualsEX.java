
/**
 * 여기에 p349 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
class Point{
    int x,y;
    public Point(int x, int y){
        this.x =x; this.y = y;
    }

    public boolean epuals(Object obj){
        Point p = (Point)obj; //객체 obj를 Point 타입으로 다운 캐스팅
        if(x == p.x && y == p.y)return true;
        else return false;
    }
}

public class EqualsEX{
    public static void main(String[] args){
        Point a = new Point(2,3);
        Point b = new Point(2,3);
        Point c = new Point(3,4);
        if(a == b) //false
            System.out.println("a==b");
        if(a.equals(b)) //false
            System.out.println("a is equal to b");    
        if(a.equals(c)) //false
            System.out.println("a is equal to c");
    }
}

