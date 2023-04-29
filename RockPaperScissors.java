import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        int t ,num1,num2;
        String s=JOptionPane.showInputDialog(null, "How many times you want to play?");
        t=Integer.parseInt(s);
        while (t > 0) {
            num1 = random.nextInt(3);
            String str=JOptionPane.showInputDialog(null,  "0->Rock\n1->Paper\n2->Scissors\nEnter your choice: ");
            num2 = Integer.parseInt(str);
            if (num1 == 0 && num2 == 1)
                JOptionPane.showMessageDialog(null,"You win!!");
            else if (num1 == 0 && num2 == 2)
                JOptionPane.showMessageDialog(null,"Computer win!!");
            else if (num1 == 1 && num2 == 0)
                JOptionPane.showMessageDialog(null,"Computer win!!");
            else if (num1 == 1 && num2 == 2)
                JOptionPane.showMessageDialog(null,"You win!!");
            else if (num1 == 2 && num2 == 0)
                JOptionPane.showMessageDialog(null,"You win!!");
            else if (num1 == 2 && num2 == 1)
                JOptionPane.showMessageDialog(null,"Computer win!!");
            else
                JOptionPane.showMessageDialog(null,"Draw!!");
            t-=1;
            switch (num1) {
                case 0:
                    JOptionPane.showMessageDialog(null,"Computer plays Rock!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"Computer plays Paper!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Computer plays Scissor!");
                    break;
            }
        }
    }
}
