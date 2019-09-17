package 단원7;
import java.util.*;
/**
 * 여기에 CollectionsEx 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class CollectionsEx{
    static void printList(LinkedList<String>l){
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            String e = iterator.next();
            String separator;
            if(iterator.hasNext())
                separator = "->"; //마지막 요소가 아니면 >> 출력
            else
                separator = "\n"; //마지막 요소이면 줄바꿈
            System.out.print(e+separator);
        }
    }
    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<String>();//빈 리스트 생성
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0,"터미네이터");
        myList.add(2,"아바타");
        
        Collections.sort(myList);
        printList(myList);
        int index = Collections.binarySearch(myList,"아바타")+1;
        System.out.println("아바타는" + index +"번째 요소입니다.");
    }
}

