import javax.swing.*;
import java.awt.*;

public class SceneChanger {
    private static SceneChanger instance;
    private JFrame masterView;

    public static SceneChanger getInstance() {
        if (instance == null) {
            instance = new SceneChanger();
        }
        return instance;
    }

    public void setMasterView(JFrame masterView) {
        this.masterView = masterView;
    }

    public void change(JPanel view) {
        Container container = masterView.getContentPane();
        container.removeAll();
        container.add(view, BorderLayout.CENTER);
        masterView.validate();
    }
}
