import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
  static final int SCREEN_WIDTH=600;
  static final int SCREEN_HEIGHT=600;
    static final int UNIT_SIZE=25;//Size of objects in the game screen
    static final int GAME_UNITS=(SCREEN_WIDTH *SCREEN_HEIGHT)/UNIT_SIZE; //No. of elements that can fit in screen
    static final int DELAY =70; //speed of the snake movement
    final int x[] =new int[GAME_UNITS];//holds game-units on x-axis
    final int y[] =new int[GAME_UNITS];//holds game-units on y-axis
    int bodyParts=5; //initially the snake starts with 5 pieces
    int applesEaten;
    int appleX; //apple appears on the x-axis
    int appleY;//apple appears on y-axis
    char direction='R';//snake starts moving in right direction
    Boolean running;
    Timer timer;
    Random random;
    public void startGame(){

    }
    public void paintComponent(Graphics g){

    }
public  void draw(){

}
public void move(){

}
public void checkApple(){

}
public void checkCollision(){

}
public void gameOver(Graphics g){

}
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public  class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
}
