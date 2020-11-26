import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {

    Window() {

        setVisible(true);

        setLocation(100,100);
        setSize(400,300);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setTitle("ДЗ 008");

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton btn1 = new JButton("EXIT");
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btn2 = new JButton("EXIT TOO");
        panel.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse in");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse out");
            }
        };

        panel.addMouseListener(listener);
        add(panel,BorderLayout.SOUTH);



    }
}


