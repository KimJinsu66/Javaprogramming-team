package 단원7;
import java.util.Vector;
import java.util.Iterator;

/**
 * 여기에 IteratorEx 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class IteratorExample
{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>(); // 요소가 Integer 타입인 벡터
        v.add(3);
        v.add(5);
        v.add(7);
        Iterator<Integer> it = v.iterator(); //벡터 v의 요소를 순차 검색할 Iterator 객체리턴
        
        while(it.hasNext()){// it로 벡터의 끝까지 반복
            int n = it.next(); //it가 가리키는 요소 리턴
            System.out.println(n);
        }
    
    }
}
