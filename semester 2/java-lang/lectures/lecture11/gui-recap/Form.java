import java.awt.*;
import javax.swing.*;

public class Form extends JFrame {
  private JLabel farenheightLabel, celciusLabel;
  private JTextField farenheightTextFeild, celciusTextField;
  private JButton convertButton, resetButton;

  public Form() {
    setTitle("Temperature Converter");
    setResizable(false);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);

    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
    layout.setHorizontalGroup(hGroup);

    GroupLayout.ParallelGroup vGroup = layout.createParallelGroup(GroupLayout.Alignment.BASELINE);
    layout.setVerticalGroup(vGroup);

    farenheightLabel = new JLabel("Farenheight");
    farenheightTextFeild = new JTextField(10);
    hGroup.addGroup(
        layout
            .createParallelGroup()
            .addComponent(farenheightLabel)
            .addComponent(farenheightTextFeild));
    vGroup.addGroup(
        layout
            .createSequentialGroup()
            .addComponent(farenheightLabel)
            .addComponent(farenheightTextFeild));

    celciusLabel = new JLabel("Celcius");
    celciusTextField = new JTextField(10);
    hGroup.addComponent(celciusLabel).addComponent(celciusTextField);
    vGroup.addComponent(celciusLabel).addComponent(celciusTextField);

    convertButton = new JButton("Convert");
    resetButton = new JButton("Reset");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // pack();
    setSize(600, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Form();
  }
}
