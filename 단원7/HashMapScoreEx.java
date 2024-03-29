package 단원7;
import java.util.*;
/**
 * HashMap을 이용하여 학생의 이름과 점수를 기록 관리하는 프로그램 
 * 
 * @author (2018315053 테리오카유이카) 
 * @version (2019.09.17)
 */
public class HashMapScoreEx
{
    public static void main(String[] args){
        HashMap<String, Integer> scoreMap = new HashMap<String,Integer>();

        scoreMap.put("테라오카유이카",70);
        scoreMap.put("이와사키메구미 ",100);
        scoreMap.put("야마오토요시카",98);
        scoreMap.put("사토모에카",97);
        scoreMap.put("이가영",99);
        System.out.println("HashMap의 요소 개수 :" + scoreMap.size());

        Set<String> keys = scoreMap.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String name = it.next();        //다음 키. 학생 이름
            int score = scoreMap.get(name); //점수 알아내기
            System.out.println(name + ":" + score);
        }
    }
}