import javax.swing.*;
import java.awt.*;

public class Swing{
    private JFrame mainframe;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;

    public Swing(){
        prepareGUI();
    }

    public static void main(String[]args){
        Swing swingControlDemo = new Swing();
    }

    public void prepareGUI(){
        mainframe = new JFrame("Easy 2");
        mainframe.setBounds(0,0,500,500);
        mainframe.setLayout(new BorderLayout(4,1));

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());

        JButton button = new JButton("button 1");
        controlPanel.add(button, BorderLayout.NORTH);

        JButton button2 = new JButton(("button 2"));
        controlPanel.add(button2, BorderLayout.EAST);

        JButton button3 = new JButton("button 3");
        controlPanel.add(button3, BorderLayout.WEST);

        JButton button4 = new JButton(("button 4"));
        controlPanel.add(button4, BorderLayout.SOUTH);

        JButton button5 = new JButton("button 5");
        controlPanel.add(button5, BorderLayout.CENTER);



        mainframe.add(controlPanel);

        mainframe.setVisible(true);
    }


}
