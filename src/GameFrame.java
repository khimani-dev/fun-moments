import javax.swing.*;

public class GameFrame extends JFrame {
 GameFrame(){
     this.add(new GamePanel());// GamePanel panel =new GamePanel();
     this.setTitle("Snake xenzia");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//specifies what happens when the user closes the window
     this.setResizable(false);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);//makes the contents appear on the centre of the screen
 }
}


