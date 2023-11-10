package Done;
import javax.swing.JOptionPane;

public class onlineGame {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your name: "); 
        String age = JOptionPane.showInputDialog("Input your Age: ");

        String[] sex = {"Male", "Female"};
        String gender = (String) JOptionPane.showInputDialog(null, "What's your gender: ", null, JOptionPane.QUESTION_MESSAGE, null, sex, sex[0]);
        System.out.println(gender);

        String[] gameModes = {"Shooting", "Racing", "Battle Arena", "Real-Time Strategy", "Survival"};
        String gMode = (String) JOptionPane.showInputDialog(null, "Choose a Game Mode: ", null, JOptionPane.QUESTION_MESSAGE, null, gameModes, gameModes[0]);
        System.out.println(gMode);

        String why = JOptionPane.showInputDialog("Why did you choose this mode? ");

        JOptionPane.showMessageDialog(null, "Name: " + name + "\n Age: " + age + "\n Gender: " + gender + "\n Game Mode: " + gMode + "\n \n Why this Mode? \n" + "\""+why+"\"" );
    }
}