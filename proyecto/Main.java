package proyecto; 
import javax.swing.*; 

public class Main extends JFrame{

    JButton uno; 

    public Main(){
        setLayout(null);

    }
    public static void main(String args[]){
        Main interfaz = new Main(); 
        interfaz.setBounds(0,0,400,400);
        interfaz.setVisible(true);
        interfaz.setResizable(false); 
        interfaz.setLocationRelativeTo(null);
    }
}