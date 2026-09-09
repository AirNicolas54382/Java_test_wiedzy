import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JTextField text;

    JCheckBox checkbox;

    ButtonGroup group = new ButtonGroup();
    JRadioButton sprzatac;
    JRadioButton gotowac;
    JRadioButton prac;

    JComboBox combobox;

    MyFrame() {
       JFrame frame = new JFrame();
       JLabel label = new JLabel();
       JLabel Tekst1 = new JLabel();
       JLabel Tekst2 = new JLabel();
       JLabel Tekst3 = new JLabel();
       JLabel Tekst4 = new JLabel();
       JPanel panel = new JPanel();
       JPanel radiopanel = new JPanel();
       checkbox = new JCheckBox();
       text = new JTextField();
       sprzatac = new JRadioButton("sprzątanie");
        gotowac = new JRadioButton("gotowanie");
        prac = new JRadioButton("pranie");
        group.add(sprzatac);
        group.add(gotowac);
        group.add(prac);
        String[] box = {"oddychanie", "mruganie", "stanie"};
        combobox = new JComboBox(box);
       Border border = LineBorder.createBlackLineBorder();

       label.setText("Test wiedzy!!!");
       label.setVerticalAlignment(JLabel.TOP);
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setFont(new Font("MV Boli", Font.PLAIN, 35));
       label.setOpaque(true);
       label.setBackground(Color.darkGray);
       label.setForeground(Color.WHITE);

       text.setVisible(true);
       text.setPreferredSize(new Dimension(250, 40));
       text.setOpaque(true);

       panel.setVisible(true);
       panel.setSize(600, 400);
       panel.setBackground(Color.GRAY);
       panel.setVisible(true);
       panel.setOpaque(true);
       panel.setBorder(border);
       panel.setBounds(400, 70, 400, 400);
       panel.setLayout(new GridLayout(4,2, 10, 10));

        Tekst1.setText("Autor: ");
        Tekst1.setForeground(Color.WHITE);
        Tekst1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        Tekst1.setHorizontalAlignment(SwingConstants.CENTER);
        Tekst2.setText("Zaznacz:    ");
        Tekst2.setForeground(Color.WHITE);
        Tekst2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        Tekst2.setHorizontalAlignment(SwingConstants.CENTER);
        Tekst3.setText("Co najgorsze?");
        Tekst3.setForeground(Color.WHITE);
        Tekst3.setFont(new Font("MV Boli", Font.PLAIN, 20));
        Tekst3.setHorizontalAlignment(SwingConstants.CENTER);
        Tekst4.setText("Co najdrudniejsze?");
        Tekst4.setForeground(Color.WHITE);
        Tekst4.setFont(new Font("MV Boli", Font.PLAIN, 20));
        Tekst4.setHorizontalAlignment(SwingConstants.CENTER);

       button = new JButton();
       button.setBounds(400, 500, 400, 100);
       button.addActionListener(this);
       button.setText("Zakończ");
       button.setFont(new Font("Consolas", Font.PLAIN,35));

       checkbox.setText("Nie jestem robotem");
       checkbox.setPreferredSize(new Dimension(250, 40));

       radiopanel.add(sprzatac);
       radiopanel.add(gotowac);
       radiopanel.add(prac);
       radiopanel.setLayout(new GridLayout(3,1));



       panel.add(Tekst1);
       panel.add(text);
       panel.add(Tekst2);
       panel.add(checkbox);
       panel.add(Tekst3);
       panel.add(radiopanel);
       panel.add(Tekst4);
       panel.add(combobox);
       label.add(button);


       label.add(panel);
       frame.pack();
       frame.setSize(1200, 700);
       frame.add(label);
       frame.setVisible(true);

   }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(text.getText());
            System.out.println("Pytanie 1: ");
            if(Objects.equals(text.getText(), "Mikolaj")){
                System.out.println("Brawo, prawidlowa odpowiedz! autorem jest Mikolaj");
            }else{
                System.out.println("Bledna odpowiedz");
                System.out.println("Prawidlowa odpowiedz: Mikolaj");
            }
            System.out.println("Pytanie 2: ");
            if(checkbox.isSelected()==true){
                System.out.println("Brawo, prawidlowa odpowiedz, nie jesteś robotem!");
            }else{
                System.out.println("Bledna odpowiedz");
                System.out.println("Prawidlowa odpowiedz: Nie jesteś robotem!");
            }
            System.out.println("Pytanie 3: ");
            if(sprzatac.isSelected()==true){
                System.out.println("Brawo, prawidlowa odpowiedz!! nie lubisz sprzatać!!");
            } else if (gotowac.isSelected()==true) {
                System.out.println("Bledna odpowiedz");
                System.out.println("Prawidlowa odpowiedz: nie lubisz sprzatać!!");
            }else if (prac.isSelected()==true){
                System.out.println("Bledna odpowiedz");
                System.out.println("Prawidlowa odpowiedz: nie lubisz sprzatać!!");
            }
            System.out.println("Pytanie 4: ");
            if(combobox.getSelectedItem()=="oddychanie"){
                System.out.println("Bledna odpowiedz");
                System.out.println("Prawidlowa odpowiedz: Najtrudniejsze jest stanie!!");
            }else if(combobox.getSelectedItem()=="mruganie"){
                System.out.println("Bledna odpowiedz");
                System.out.println("Prawidlowa odpowiedz: Najtrudniejsze jest stanie!!");
            }else if (combobox.getSelectedItem()=="stanie"){
                System.out.println("Brawo, prawidlowa odpowiedz! najtrudniejsze jest stanie!!");
            }

        }
    }
}
