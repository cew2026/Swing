import javax.swing.*;
import java.awt.*;

public class SwingTile {
    private JFrame mainframe;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;

    public SwingTile(){
        prepareGUI();
    }

    public static void main(String[]args){
        SwingTile swingControlDemo = new SwingTile();

    }

    public void prepareGUI(){
        mainframe = new JFrame("Verion : Medium/Easy 1");
        mainframe.setBounds(0,0,500,500);
        mainframe.setLayout(new BorderLayout());


        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3));



        JButton button = new JButton("button 1");
        JButton button3 = new JButton("button 3");
        JButton button2 = new JButton("button 2");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");

        JLabel label = new JLabel("label 1", JLabel.CENTER);
        JLabel label2 = new JLabel("label 2", JLabel.CENTER);
        JLabel label3 = new JLabel(" ");

        controlPanel.add(button2);
        controlPanel.add(label);
        controlPanel.add(button4);
        controlPanel.add(label2);
        controlPanel.add(button5);
        controlPanel.add(label3);
        mainframe.add(controlPanel);





        mainframe.add(button, BorderLayout.NORTH);
        mainframe.add(button3, BorderLayout.SOUTH);
        mainframe.setVisible(true);

    }

}
