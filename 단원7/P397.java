package 단원7;
import java.util.Vector;

/**
 * 여기에 P397 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class P397
{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer> ();
        
        v.add(Integer.valueOf(5));
        v.add(Integer.valueOf(4));
        v.add(Integer.valueOf(-1));
        
        v.add(5); // 5 -> new Integer(5)로 자동박싱
        v.add(4);
        v.add(-1);
        
        v.add("hello");
        v.add(3.5);
        v.add(new Person());
        
        v.add(null); // 벡터에는 null도 삽입 가능;
        
        v.add(2,100); //벡터 중간에 객체 삽입 가능;(인덱스 2 , 정수 100);
        
        
        Integer obj = v.get(1); // 벡터의  1번째 Integer 객체를 얻어낸다.
        int i = obj.intValue(); // obj 에 있는 정수를 알아낸다. 이 값은 4;
        
        int i = v.get(1); // 자동 언박싱
        
        int len = v.size(); // 벡터의 크기. 벡터에 존재하는 요소 객체의 수 
        int cap = v.capacity(); // 벡터의 용량
        
        v.remove(1); // 인덱스 1의 위치에 있는 요소 삭제 ; 
        v.removeAllElements();
    }
}
