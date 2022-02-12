import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        super("SceneChangeExample");
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
        SceneChanger.getInstance().setMasterView(this);

        //POINT. Mainでは別に何を生成してもよくね？
        SceneChanger.getInstance().change(new View1(new Presenter1(new Model())));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
