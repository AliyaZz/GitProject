import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalcGD extends JFrame {
    private JTextField fa,fb,fc;
    private JLabel result;
    public CalcGD(){
        super("Calculator");
        super.setBounds(0,0,1800,900);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont = super.getContentPane();
        cont.setLayout(new GridLayout(4,2,5,10));
        JLabel ta = new JLabel("Enter a");
        fa = new JTextField("",1);
        JLabel tb = new JLabel("Enter b");
        fb = new JTextField("",1);
        JLabel tc = new JLabel("Enter c");
        fc = new JTextField("",1);
        cont.add(ta);
        cont.add(fa);
        cont.add(tb);
        cont.add(fb);
        cont.add(tc);
        cont.add(fc);


        JButton but = new JButton("Calculate");
        but.addActionListener(new butevent());
        cont.add(but);
        result = new JLabel("Result: ");
        cont.add(result);
    }

    class butevent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int aa = Integer.parseInt(fa.getText());
            int bb = Integer.parseInt(fb.getText());
            int cc = Integer.parseInt(fc.getText());

            New q = new New();
            ArrayList<Double> mas = q.kv(aa,bb,cc);
            if (mas.size()==0){
                result.setText("There are no roots of the equation");
            } else {
                String xx = new String();
                xx = "Result:";
                for (int y = 0; y < mas.size(); y++) {
                    xx = xx + "x" + (y + 1) + " = " + mas.get(y);

                }
                result.setText(xx);
            }
        }
    }
}
