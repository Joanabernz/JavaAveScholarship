import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class scholarreg extends JFrame{
    private JTextField sem2;
    private JTextField units2;
    private JTextField lab2;
    private JTextField tuition2;
    private JTextField misc2;
    private JButton submitButton;
    private JPanel main2Panel;
    private JLabel fee;

    public scholarreg() {
setTitle(" Scholarship Registration");
setSize(500, 500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setContentPane(main2Panel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add();
                String sems = sem2.getText();
                String uni = units2.getText();
                JOptionPane.showMessageDialog(scholarreg.this,
                        " REGISTERED FOR SCHOLARSHIP GRANT" + " \n" +
                         sems +  " Semester" + "   " + " Number of Units: " + uni +
                        "\n" + fee.getText());
            }
        });
    }
    public  void add(){
        try{
            double tui2 = Double.parseDouble(tuition2.getText());
            double lab = Double.parseDouble(lab2.getText());
            double mi = Double.parseDouble(misc2.getText());
            double total = tui2 + lab + mi;


            fee.setText(String.valueOf(total));
        }catch (NumberFormatException e){
            fee.setText("Invalid");
        }
    }

    public static void main(String[] args) {
        new scholarreg().setVisible(true);
    }
}