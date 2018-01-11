// Fortune Teller

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.Random;

public class FortuneTeller extends JFrame
    implements ActionListener
{
  private static final EasySound ding = new EasySound("C:\\Users\\kihyun_lee\\IdeaProjects\\FortuneTeller.java\\src\\ding.wav");

  // Declare an array of "fortunes" (strings):
  String [] fortunes = {"You will live a long and happy life!", "You will go to heaven!", "You have troubles coming ahead, but you can persevere!", "You will find the perfect person for you soon!",
          "You will do great things in the world!"};

  private JTextField display;
  
  public FortuneTeller()
  {
    super("Fortune Teller");

    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    // Pick and display a random fortune:

    ding.play();

    Random fortune = new Random();
    int fortuneNum;
    fortuneNum = fortune.nextInt(fortunes.length);
    display.setText("  " + fortunes[] );
    ding.play();
  }

  public static void main(String[] args)
  {
    JFrame window = new FortuneTeller();
    window.setBounds(300, 300, 300, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true); 
  }
}
