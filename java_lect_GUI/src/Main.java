import java.awt.*;
import java.awt.event.*;
import java.applet.*; // для TestBoxDemo

class AppGraph extends Frame
{
    public AppGraph(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {System.exit(0);}
        });

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                int []mx = new int [4];
                int []my = new int [4];

                int x = me.getX();
                int y = me.getY();

                mx[0] = x-10; my[0] = y;
                mx[1] = x;    my[1] = y-15;
                mx[2] = x +10;my[2] = y;
                mx[3] = x;    my[3] = y+15;

                Graphics g = getGraphics();
                g.setColor(new Color(100,120,0));
                g.fillPolygon(mx,my,4);

            }
        });
    }

    public void paint(Graphics g){
        setForeground(Color.red);
        g.drawLine(70,50,80, 120);
        g.fillRect(230, 100, 120, 80);
        g.drawOval(400,100,100, 70);
    }

}


class TextFieldDemo extends Applet implements ActionListener{
    TextField tf1, tf2;

    public void init(){
        tf1 = new TextField();
        tf2 = new TextField(20);
        Button btn = new Button("Перенести");
        add(tf1);
        add(tf2);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String s =  tf1.getText();
        tf2.setText(s);
    }


}

public class Main {

    public static void main(String[] args) {
            AppGraph f = new AppGraph();
            f.setSize(800,500);
            f.setTitle("Демонстранция графики");
            f.setBackground(Color.CYAN);
            f.setVisible(true);

    }
}

//awt, swing - графические библиотеки.
//Component add (Component comp)
// Flowlayour
// Текстовая метка - Label. Label(); Label(String str);
// label.set/getText();

// Кнопки
// Button
// Button(); Button(String str);
/*
* Button.getLabel setLabel
* ActionEvent
* ActionListener
* actionPerformed
*
*
* Текстовые поля (Textedit...etc)
*
* TextField; TextField(); TextField(String defaultText); TextField(int numChar); -- Шринна текстового поля(в символах)
* TextField(String str, int numChar) ...
*
* */
