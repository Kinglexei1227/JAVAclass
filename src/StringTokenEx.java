import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        //StringTokenizer : 문자열 분리를 위해 사용하는 클래스

        String str ="3+2-1";
        int result = 0;
        StringTokenizer t = new StringTokenizer(str, "+-*/", true);
        while ( t.hasMoreTokens()) { //더 가져올 토큰이 있다면
            String r = t.nextToken();
            //Interger.parseInt("0"); => 문자형 -> int형으로 변경
            //result = result + Integer.parseInt(r);

            if (r.equals("+")) {
                result = result + Integer.parseInt(t.nextToken());
            }else if (r.equals("-")) {
                result = result - Integer.parseInt(t.nextToken());
            }else if (r.equals("*")) {
                result = result * Integer.parseInt(t.nextToken());
            }else if (r.equals("/")) {
                result = result / Integer.parseInt(t.nextToken());
            }else {
                //r이 "+-*/" 아니라면 남은건 숫자
                result = Integer.parseInt(r);
            }




            System.out.println(r);
        }
        System.out.println(result);
    }
}
