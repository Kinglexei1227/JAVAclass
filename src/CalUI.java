
import javax.swing.*;

public class CalUI extends JFrame {
    JTextField jf; //한줄 입력착
    JButton[] b; // 0~9 까지 숫자 버튼
    JButton clear; // "C" 버튼
    JButton equal; // "=" 버튼

    // 사칙연산 버튼


    public CalUI() {
        super("계산기");
        jf = new JTextField(15); //판때기 이름 설정
        this.add(jf); //판때기에 입력창 추가
        b = new JButton[10];
        for (int i=0; i<10; i++) {
            b[i] = new JButton("1"+i);
            this.add(b[i]);
        }
    }
}
