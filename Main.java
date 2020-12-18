import javax.swing.*;

/**
 * Created by Home on 15.12.2020.
 */
public class Main {
    public static void main(String[] args) {
      Gui1 app =new Gui1("Calculator");
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,200);
        app.setResizable(false);

    }
}
