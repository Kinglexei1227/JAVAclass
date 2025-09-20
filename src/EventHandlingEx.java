


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
//ctrl + shift + o  : import 단축키

class MyListner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("버튼이클릭됨");
    }
}




//버튼 클릭 이벤트 처리
class MyFrame extends JFrame {
    JFrame jf;
    JButton jb;

    public MyFrame() {
        jf = new JFrame("판때기이름");
        jb = new JButton("나는버튼");

        MyListner m = new MyListner();
        jb.addActionListener(m);

        this.add(jb); //판때기에 버튼 추가
        setSize(300,300); //판때기 크기 지정
        setLocation(200,200); //판때기 위치 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //강제종료활성화
        setVisible(true); //화면에 보여주겠다.


    }
}



public class EventHandlingEx {
    public static void main(String[] args) {
        new MyFrame();
        System.out.println();
    }
}
