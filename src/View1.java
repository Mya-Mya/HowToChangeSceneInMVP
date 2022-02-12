import javax.swing.*;
import java.awt.*;

public class View1 extends JPanel implements IView1 {
    public View1(Presenter1 presenter) {//POINT1. このシーンのプレゼンターを受け取る
        //ビューの内容の構築
        super(new BorderLayout());
        add(new JLabel("View1"), BorderLayout.CENTER);
        JButton button = new JButton("2へ");
        button.addActionListener(e -> presenter.onPush());
        add(button, BorderLayout.SOUTH);

        //POINT2. コンストラクタの最後にプレゼンターに自分を登録
        presenter.setView(this);
    }

    @Override
    public void requestChangeSceneTo2(Presenter2 presenter) {
        //POINT3. ビューを生成
        View2 view2 = new View2(presenter);
        SceneChanger.getInstance().change(view2);
    }
}
