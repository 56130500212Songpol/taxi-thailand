import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class use for the GUI of MindReaderPrpject to show the components 
 * 
 * @author Songpol Rungswang
 * @version 29-03-2014
 **/
public class GUI  
{
    Counter c;
    MindReader mr;
    Score s;
    Random r;
    public GUI(){
        c = new Counter();
        mr = new MindReader();
        s = new Score();
        r = new Random();
        show();
    }

    /**
     * Main method here
     */
    public void show(){
        JFrame frame = new JFrame();
        frame.setSize(515, 350);
        frame.setTitle("MindReaderProject");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout(0,26,20));
        pane.setBackground(Color.RED);

        JPanel you = new JPanel();
        you.setLayout(new FlowLayout());
        JLabel jl = new JLabel("You:");
        Font myFont11 = new Font("SansSerif ", Font.BOLD, 36);
        jl.setFont(myFont11);
        jl.setForeground(Color.BLACK);
        you.add(jl);
        you.setBackground(Color.RED);

        JPanel you2 = new JPanel();
        you2.setLayout(new FlowLayout());
        final JLabel jl2 = new JLabel("0");
        jl2.setFont(myFont11);
        jl2.setForeground(Color.BLACK);
        you2.add(jl2);
        you2.setBackground(Color.RED);

        JPanel com = new JPanel();
        com.setLayout(new FlowLayout());
        JLabel jl3 = new JLabel("Computer:");
        jl3.setFont(myFont11);
        jl3.setForeground(Color.BLACK);
        com.add(jl3);
        com.setBackground(Color.RED);

        JPanel com2 = new JPanel();
        com2.setLayout(new FlowLayout());
        final JLabel jl4 = new JLabel("0");
        jl4.setFont(myFont11);
        jl4.setForeground(Color.BLACK);
        com2.add(jl4);
        com2.setBackground(Color.RED);

        pane.add(you);
        pane.add(you2);
        pane.add(com);
        pane.add(com2);

        JPanel pane22 = new JPanel();
        pane22.setLayout(new GridLayout(2,1));
        pane22.setBackground(Color.GREEN);

        JPanel pane221 = new JPanel();
        pane221.setLayout(new FlowLayout());
        final JLabel jl5 = new JLabel("?");
        Font myFont111 = new Font("SansSerif ", Font.BOLD, 37);
        jl5.setFont(myFont111);
        jl5.setForeground(Color.BLACK);
        pane221.add(jl5);
        pane221.setBackground(Color.GREEN);

        JPanel pane222 = new JPanel();
        pane222.setLayout(new FlowLayout());
        Font myFont2 = new Font("SansSerif ", Font.BOLD, 35);
        final JLabel jl6 = new JLabel("I've made my prediction");
        jl6.setFont(myFont2);
        jl6.setForeground(Color.BLACK);
        pane222.add(jl6);
        pane222.setBackground(Color.GREEN);

        pane22.add(pane221);
        pane22.add(pane222);

        JPanel pane3 = new JPanel();
        pane3.setLayout(new FlowLayout(0,100,25));
        pane3.setBackground(Color.BLUE);

        JPanel pane4 = new JPanel();
        pane4.setLayout(new FlowLayout());
        final JButton jl7 = new JButton("Head");
        Font myFont3 = new Font("SansSerif ", Font.BOLD, 25);
        jl7.setFont(myFont3);
        jl7.setBackground(Color.YELLOW);
        jl7.setForeground(Color.BLACK);
        pane4.add(jl7);

        JPanel pane5 = new JPanel();
        pane5.setLayout(new FlowLayout());
        final JButton jl8 = new JButton("Tail");
        jl8.setFont(myFont3);
        jl8.setBackground(Color.YELLOW);
        jl8.setForeground(Color.BLACK);
        pane5.add(jl8);

        pane3.add(pane4);
        pane3.add(pane5);

        frame.add(pane);
        frame.add(pane22);
        frame.add(pane3);
        frame.setVisible(true);

        jl7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    c.add("Head");
                    System.out.println("Your click : "+e.getActionCommand());
                    System.out.println("My prediction : "+mr.predict());
                    System.out.println("Random prediction : "+r.predict());
                    mr.test();
                    System.out.println("NEXT : "+c.getNext());
                    jl5.setText("Head");
                    if(c.getSize()>4){
                        System.out.println("On My Predict");
                        if(e.getActionCommand().equals(mr.predict())){
                            System.out.println("I'm Right");
                            System.out.println();
                            jl6.setText("I'm right!");
                            s.setComputerScores();
                        }else{
                            System.out.println("I'm Wrong");
                            System.out.println();
                            jl6.setText("Missed.");
                            s.setPlayerScores();
                        }
                    }else{
                        System.out.println("On Random Predict");
                        if(e.getActionCommand().equals(r.predict())){
                            System.out.println("I'm Right");
                            System.out.println();
                            jl6.setText("I'm right!");
                            s.setComputerScores();
                        }else{
                            System.out.println("I'm Wrong");
                            System.out.println();
                            jl6.setText("Missed.");
                            s.setPlayerScores();
                        }
                    }
                    final Timer ti = new Timer(0, null);
                    ti.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ti.start();
                                jl5.setText("?");
                                jl6.setText("I've made my prediction");
                                ti.stop();
                                try {Thread.sleep(1500);}
                                catch(Exception ev){}
                            }
                        });
                    ti.start();
                    jl2.setText(""+s.getPlayerScores());
                    jl4.setText(""+s.getComputerScores());
                    //if(s.getPlayerScores() == 25 || s.getComputerScores() == 25){
                        if(s.getPlayerScores() == 25){
                            jl5.setText("YOU WIN");
                            jl6.setText("I LOSE");
                            ti.stop();
                            jl7.removeActionListener(this);
                            jl8.removeActionListener(this);
                        }
                        if(s.getComputerScores() == 25){
                            jl5.setText("YOU LOSE");
                            jl6.setText("I WIN");
                            ti.stop();
                            jl7.removeActionListener(this);
                            jl8.removeActionListener(this);
                        }
                    
                }
            });
        jl8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    c.add("Tail");
                    //System.out.println(c.getHT(c.size));
                    System.out.println("Your click : "+e.getActionCommand());
                    System.out.println("My prediction : "+mr.predict());
                    System.out.println("Random prediction : "+r.predict());
                    mr.test();
                    System.out.println("NEXT : "+c.getNext());
                    jl5.setText("Tail");
                    if(c.getSize() > 4){
                        System.out.println("On My Predict");
                        if(e.getActionCommand().equals(mr.predict())){
                            System.out.println("I'm Right");
                            System.out.println();
                            jl6.setText("I'm right!");
                            s.setComputerScores();
                        }else{
                            System.out.println("I'm Wrong");
                            System.out.println();
                            jl6.setText("Missed.");
                            s.setPlayerScores();
                        }
                    }else{
                        System.out.println("On Random Predict");
                        if(e.getActionCommand().equals(r.predict())){
                            System.out.println("I'm Right");
                            System.out.println();
                            jl6.setText("I'm right!");
                            s.setComputerScores();
                        }else{
                            System.out.println("I'm Wrong");
                            System.out.println();
                            jl6.setText("Missed.");
                            s.setPlayerScores();
                        }
                    }
                    final Timer ti = new Timer(0, null);
                    ti.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ti.start();
                                jl5.setText("?");
                                jl6.setText("I've made my prediction");
                                ti.stop();
                                try {Thread.sleep(1500);}
                                catch(Exception ev){}
                            }
                        });
                    ti.start();
                    jl2.setText(""+s.getPlayerScores());
                    jl4.setText(""+s.getComputerScores());
                    //if(s.getPlayerScores() == 25 || s.getComputerScores() == 25){
                        if(s.getPlayerScores() == 25){
                            jl5.setText("YOU WIN");
                            jl6.setText("I LOSE");
                            ti.stop();
                            jl7.removeActionListener(this);
                            jl8.removeActionListener(this);
                        }
                        if(s.getComputerScores() == 25){
                            jl5.setText("YOU LOSE");
                            jl6.setText("I WIN");
                            ti.stop();
                            jl7.removeActionListener(this);
                            jl8.removeActionListener(this);
                        }
                    
                }
            });
    }
}

