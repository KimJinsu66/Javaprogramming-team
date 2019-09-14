package 단원7;
import java.util.*;
/**
 * ArrayListEx 교과서p409
 * 
 * @author () 
 * @version (2019.09.12)
 */
public class ArrayListEx
{
    public static void main(String[] args){
        //문자열만 삽입 가능한 Arraylist 생성
        ArrayList<String> a = new ArrayList<String>();
        
        //키보드로부터 4개의 이름 입력받아 ArreyList에 삽입
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i ++){
            System.out.print("이름을 입력하세요>>");//Scanner 객체 생성
            String s = sc.next();
            a.add(s); 
        }
        //ArreyList에 들어 있는 모든 이름 출력
        for(int i = 0; i< a.size(); i++){
            String name = a.get(i); // ArrayList의 i번째 정수 받아오기;
            System.out.println(name + " ");
        }
        //가장 긴 이름 출력
        int longestIndex = 0;//현재 가장 긴 이름이 있는 ArreyList 내의 인덱스
        for(int i=1; i<a.size(); i++){
            if(a.get(longestIndex).length() < a.get(i).length())//이름 길이 비교
                longestIndex = i; //i 번째 이름이 더 긴 이름임
        }
        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
        sc.close();
    }
}
