
/**
 * 여기에 MathEx 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MathEx
{
    public static void main(String[] args){
        double a = -2.78987434;//절대값구하기 
        System.out.println(Math.PI);//원주율 상수 출력
        System.out.println(Math.ceil(a)); //ceil(올림)
        System.out.println(Math.floor(a));//floor(내림)
        System.out.println(Math.sqrt(9));//제곱근
        System.out.println(Math.exp(2));//e의 2승
        System.out.println(Math.round(3.14)); //반올림
        //[1,45] 사이의 정수형 난수 5개 발생
        System.out.print("이번주 행운의 버호는 ");
        for(int i = 0; i<5; i++){
            System.out.print((int)(Math.random()*45 + 1) + " "); //난수 발생
        }
    }
}
