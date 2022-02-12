import javax.swing.*;
import java.awt.*;

public class View2 extends JPanel implements IView2 {
    public View2(Presenter2 presenter) {
        super(new BorderLayout());
        add(new JLabel("View2"), BorderLayout.CENTER);
        JButton button = new JButton("Push");
        button.addActionListener(e -> presenter.onPush());
        add(button, BorderLayout.SOUTH);

        presenter.setView(this);
    }

    @Override
    public void showSomething() {
        JOptionPane.showMessageDialog(
                this,
                new JLabel("showSomething"),
                "View2",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
