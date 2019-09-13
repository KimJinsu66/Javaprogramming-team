package 단원7;
import java.util.*;
/**
 * 여기에 ArrayList 클래스 설명을 작성하십시오.
 */
public class ArrayListEx1
{
    public static void main(String[] args){
    ArrayList<String> a = new ArrayList<String>(); // ArrayList생성
    //요소 삽입
    a.add("Hello");
    a.add("Hi");
    a.add("Java");
    //요소 중간 삽입
    a.add(2,"shy");
    // 요소 알아내기;
    a.get(1);
    //요소 삭제
    a.remove(2);
    // 모든 요소 삭제;
    a.clear();
}
}
