import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Main implements ActionListener{
	private static JFrame frame;
	private static JLabel first;
	private static JTextField fField;
	private static JLabel second;
	private static JTextField sField;
	private static JButton button;
	private static JLabel op;
	private static JTextField opField;
	private static JButton button1;
	//private static JLabel answer;
	private static JTextField answerField;
	private static JLabel showAnswer;
	//private static JSpinner spinner;
	double ans;
	int x;
	int y;
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setLayout(null);
		frame.setTitle("Rechner");
		frame.setBackground(Color.red);
		frame.getContentPane().setBackground(Color.cyan);
		
		first = new JLabel("Enter number");
		first.setBounds(10,30,150,25);
		first.setForeground(Color.blue);
		frame.add(first);
		
		fField = new JTextField(20);
		fField.setBounds(130,30,70,25);
		frame.add(fField);
		
		op = new JLabel("Enter operator");
		op.setBounds(10,60,150,25);
		op.setForeground(Color.blue);
		frame.add(op);
		
		opField = new JTextField(20);
		opField.setBounds(130,60,70,25);
		frame.add(opField);
		
		second = new JLabel("Enter number");
		second.setBounds(10,90,150,25);
		second.setForeground(Color.blue);
		frame.add(second);
		
		sField = new JTextField(20);
		sField.setBounds(130,90,70,25);
		frame.add(sField);
		
		button = new JButton("=");
		button.setBounds(130,120,40,25);
		button.addActionListener(new Main());
		button.setForeground(Color.blue);
		frame.add(button);
		
		button1 = new JButton("reset");
		button1.setBounds(170,120,70,25);
		button1.addActionListener(new Main());
		button1.setForeground(Color.blue);
		frame.add(button1);
		
		/*answer = new JLabel("");
		answer.setBounds(130,150,165,25);
		answer.setForeground(Color.blue);
		frame.add(answer);*/
		
		showAnswer = new JLabel("Answer");
		showAnswer.setBounds(10,150,150,25);
		showAnswer.setForeground(Color.blue);
		frame.add(showAnswer);
		
		answerField = new JTextField(20);
		answerField.setBounds(130,150,70,25);
		frame.add(answerField);
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == button1) {
			 fField.setText("");
			 sField.setText("");
			 opField.setText("");
			 answerField.setText("");
		 }
		
		
		
		
		 x = Integer.parseInt(fField.getText());
		 y = Integer.parseInt(sField.getText());
		 String operator = opField.getText();
		 switch(operator) {
		 case "+":
			 ans = x + y;
			 answerField.setText(""+ans);
			 break;
			 
		 case "-":
			 ans = x - y;
			 answerField.setText(""+ans);
			 break;
			 
		 case "/":
			 ans = x / y;
			 answerField.setText(""+ans);
			 break;
			 
		 case "*":
			 ans = x * y;
			 answerField.setText(""+ans);
			 break;
			 
		 case "%":
			 ans = x % y;
			 answerField.setText(""+ans);
			 break;
			 
			 default:
				 answerField.setText("Try again");
				 break;
		 }
		 /*if(e.getSource() == button1) {
			 Main main = null;
			this.remove(main);
			 main = new Main();
		 }*/
		
	}
	/*private void remove(Main main) {
		// TODO Auto-generated method stub
		
	}*/
}