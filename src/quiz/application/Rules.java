package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quizo");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1.The quizzes consists of questions carefully designed to help you " +
                    "self-assess your comprehension of the information."+"<br><br>" +
                    "2.Each question in the quiz is of multiple-choice format. Read each question carefully, and click on the button next to your response that is based on the information. Each correct or incorrect response will result in appropriate feedback at the end of the screen in the Score card. <br><br>" +
                "3.After responding to a question, click on the Next Question button at the side to go to the next question. After responding to the 10th question, click on submit button." + "<br><br>" +
                "4.You can try for 50-50 Lifeline but you can use once in the quiz," + "<br><br>" +
                "5.The total score for the quiz is based on your responses to all questions. If you respond incorrectly to a question your quiz score will reflect it appropriately.However,your quiz will not be graded, if you skip a question or exit before responding to all the questions." + "<br><br>" +

            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
