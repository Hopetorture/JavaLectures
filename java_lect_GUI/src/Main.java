import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

import java.applet.*; // для TestBoxDemo

import java.util.*; //BorderLayoutDemo

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

class BorderLayoutDemo extends Applet{
    BorderLayoutDemo(){init();}
    public void init(){
        String txt = "Это - средняя\n область апплета. в\n ней текстовая область";
        setLayout(new BorderLayout());
        add(new Button("Топ"), BorderLayout.NORTH);
        add(new Button("Left"), BorderLayout.WEST);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Label("Эта строка внизу"), BorderLayout.SOUTH);
        add(new TextArea(txt), BorderLayout.CENTER);
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
*
* Текстовая область TextArea
* TextArea(); TextArea(int numLimes, int numCols);
* TextArea(String text, int numLines, int numCols, int sBars);
* TextArea.SCROLLBARS_BOTH
*                    _NONE
*                    _VERTICAL_ONLY
*                    HORIZONTAL_ONLY
* 10. Менеджер компоновки.
*     Flowlayout, BorderLayout.
*
*     Container.setLayout(LayoutManager obj) -> void
*     .getPrefferedSize();
*     .getMinimumSize();
*
*     Менеджер компоновки - FlowLayout
*     FlowLayout();
*
*     ---  BorderLayout
*     void add(Component comp, int region)
*     BorderLayout.NORTH
*                 .EAST
*                 .WEST
*                 .SOUTH
*                 .CENTER
*     */

/*
* Grid Layout
* CardLayout
* GridBagLayout
*
* */