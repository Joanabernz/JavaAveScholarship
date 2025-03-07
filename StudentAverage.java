import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentAverage extends JFrame {
    private JTextField IDtext;
    private JTextField NAMEText;
    private JTextField COURSEText;
    private JTextField YEARText;
    private JTextField SEMESTERText;
    private JTextField PROG2;
    private JTextField WEB;
    private JTextField INTROTOLI;
    private JTextField INFOMANG;
    private JTextField SCIETECHSOC;
    private JTextField PE;
    private JTextField NSTP;
    private JTextField DISMAT;
    private JLabel RESULT;
    private JButton CALBU;
    private JPanel MAINPANEL;
    private JButton proceedButton;


    public StudentAverage(){
        setTitle(" SCHOLARSHIP");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(MAINPANEL);

        CALBU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idnum = IDtext.getText();
                String name = NAMEText.getText();
                String cor = COURSEText.getText();
                String yr = YEARText.getText();
                String sem = SEMESTERText.getText();
                CAL();
                JOptionPane.showMessageDialog(StudentAverage.this,
                        "ID: " + idnum + "\n" +
                                "NAME: " + name + "\n" +
                                "COURSE " + cor+ "\n" +
                                "Year: " + yr + " " +
                                " Sem: " + sem + "\n \n \n" + "Average: " + RESULT.getText() );
            }
        });

        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int average = Integer.parseInt(RESULT.getText());
            if (average >= 90) {
                new scholarreg().setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(StudentAverage.this,
                        "You cannot avail a Scolarship Grant");

              }

            }
        });
    }
    public void CAL(){
        try{
            int intro = Integer.parseInt(INTROTOLI.getText());
            int prog2 = Integer.parseInt(PROG2.getText());
            int infom = Integer.parseInt(INFOMANG.getText());
            int disc = Integer.parseInt(DISMAT.getText());
            int websy = Integer.parseInt(WEB.getText());
            int ns1 = Integer.parseInt(SCIETECHSOC.getText());
            int pe2 = Integer.parseInt(PE.getText());
            int nstp = Integer.parseInt(NSTP.getText());
            int subt = intro + prog2 + infom + disc + websy + nstp + pe2 + ns1;
            int ave = subt / 8;
            RESULT.setText(String.valueOf(ave));
        }catch (NumberFormatException e){
            RESULT.setText("Valid Number");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentAverage().setVisible(true);
            }
        });
    }

}
