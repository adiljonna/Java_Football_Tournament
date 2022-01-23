import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//import java.awt.Color;


@SuppressWarnings("serial")
public class tournamentFrame extends JFrame implements ActionListener {

	JButton firstButtton;
	JButton secondButtton;
	JButton thirdButtton;
	JTextArea areaField;
	JTextArea areaField1;
	JTextArea areaField2;
	JTextField textField;
	JTextField textField1;
	JTextField textField3;
	JTextField textField4;
	tournamentWithFinal psi1  ;
	ArrayList <String> listTeamReg = new ArrayList <String>();
	final DefaultListModel<String> l1 = new DefaultListModel<>();
	JComboBox<String> cb; 
	JComboBox<String> cb1; 
	String[] JTeams ={"Lyon", "Toulouse","Bordeau"} ;
	int nthMatch =0;
	int checkfinal =0;
	String Data = " "; 
	String Data1 = " "; 
	String Data2 = " "; 
	Team JteamReg; 

	
	
	tournamentFrame(tournamentWithFinal psi1){
		
		this.psi1= psi1;
		this.setTitle("Tournamnet  " );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(600, 500);
		//this.setResizable(false);
		//this.setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
		//this.setLayout(new GridLayout(3,2));
		this.setLayout(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		//this.getContentPane().setBackground(new Color(123,50,250));
		
		
		
		
		thirdButtton = new JButton ();
		thirdButtton.setBounds(370,0,130,25);
		thirdButtton.addActionListener(this);
		//firstButtton.addActionListener(e -> System.out.println("Hello World"));
		thirdButtton.setText("Final Winner");
		thirdButtton.setFocusable(false);
		thirdButtton.setForeground(Color.green);
		thirdButtton.setBackground(Color.yellow);
		thirdButtton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		this.add(thirdButtton);
		
		//this.pack();
		
		areaField = new JTextArea();
		areaField.setBounds(30,80,130,170);
		this.add(areaField);
		areaField.setEditable(false); 
		
		areaField1 = new JTextArea();
		areaField1.setBounds(200,80,130,170);
		this.add(areaField1);
		areaField1.setEditable(false); 
		
		areaField2 = new JTextArea();
		areaField2.setBounds(370,80,100,170);
		this.add(areaField2);
		areaField2.setEditable(false); 
		
		textField = new JTextField();
		textField.setBounds(100,320,130,20);
		this.add(textField);
		
		
		textField1 = new JTextField();
		textField1.setBounds(100,360,130,20);
		this.add(textField1);
		
		
		
		firstButtton = new JButton ();
		firstButtton.setBounds(70,400,150,30);
		firstButtton.addActionListener(this);
		//firstButtton.addActionListener(e -> System.out.println("Hello World"));
		firstButtton.setText("Register Team");
		firstButtton.setFocusable(false);
		firstButtton.setForeground(Color.green);
		firstButtton.setBackground(Color.yellow);
		firstButtton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		this.add(firstButtton);
		//this.pack();
		
		textField3 = new JTextField();
		textField3.setBounds(400,330,90,20);
		this.add(textField3);
		textField3.setEditable(false);
		
		textField4 = new JTextField();
		textField4.setBounds(400,370,90,20);
		this.add(textField4);
		textField4.setEditable(false);
		
		cb=new JComboBox<String>();    
	    cb.setBounds(280, 330,90,20);    
	    this.add(cb); 
	    
	    cb1=new JComboBox<String>();    
	    cb1.setBounds(280, 370,90,20);    
	    this.add(cb1);
		 
	    
	    secondButtton = new JButton ();
		secondButtton.setBounds(300,400,150,30);
		secondButtton.addActionListener(this);
		//firstButtton.addActionListener(e -> System.out.println("Hello World"));
		secondButtton.setText("Play");
		secondButtton.setFocusable(false);
		secondButtton.setForeground(Color.green);
		secondButtton.setBackground(Color.yellow);
		secondButtton.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		this.add(secondButtton);
		secondButtton.setEnabled(false);
		thirdButtton.setEnabled(false);
		//this.pack();
		
	    
	   
		
		/* Combo Boxxes
		 *  String[] Teams ={"Lyon", "Toulouse","Bordeau"}
		 *  comboBox = new JComboBox(Teams);
		 *  comboBox.addActionListener(this);
		 *  comboBox.getSelectedItem();
		 */
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		
		
        	if (e.getSource()==firstButtton && !textField.getText().equals("") && !l1.contains(textField.getText())
        			&& !textField1.getText().equals(""))
        {
        	
        	JteamReg = new Team(textField.getText(), textField1.getText());
			psi1.invite(JteamReg);
			l1.addElement(textField.getText());
			//Data = Data + "\n " + l1.elementAt(l1.size()-1) +" (" +textField1.getText() + ")" ;
			Data = Data + "\n " + textField.getText() +" (" +textField1.getText() + ")" ;
			System.out.println(textField.getText() + "  "+textField1.getText() + "   Team Registered   " );
			areaField.setText( Data );
			
			cb.addItem(textField.getText() +" (" +textField1.getText() + ")");
			cb1.addItem(textField.getText() +" (" +textField1.getText() + ")");
			//cb.(Data );
			
			textField.setText(null);
			textField1.setText(null);
			
			if (l1.size()>1)
			{
			secondButtton.setEnabled(true);
			}
			if (l1.size()>2)
			{
				thirdButtton.setEnabled(true);
			}
		}
        	
		
		if (e.getSource()==secondButtton){
			
			
			firstButtton.setEnabled(false);
			if (checkfinal==0)
			{
			psi1.playAllMatches();}
			checkfinal = 1;
			
			
			if (!cb.getItemAt(cb.getSelectedIndex()).equals(cb1.getItemAt(cb1.getSelectedIndex())) 
					&& !Data1.contains(cb.getItemAt(cb.getSelectedIndex()) +" vs " + cb1.getItemAt(cb1.getSelectedIndex()))
					&& !Data1.contains(cb1.getItemAt(cb1.getSelectedIndex()) +" vs " + cb.getItemAt(cb.getSelectedIndex())))
			{
				textField3.setText(Integer.toString(psi1.playMatch.get(nthMatch).getScoreA()));
				textField4.setText(Integer.toString(psi1.playMatch.get(nthMatch).getScoreB()));
				System.out.println("Match Played: " + cb.getItemAt(cb.getSelectedIndex()) + " vs " + cb1.getItemAt(cb1.getSelectedIndex()));
				System.out.println("Scores " + psi1.playMatch.get(nthMatch).getScoreA() + "-"+ psi1.playMatch.get(nthMatch).getScoreB());
				
				
				
				Data1 = Data1 + "\n " + cb.getItemAt(cb.getSelectedIndex()) +" vs " + cb1.getItemAt(cb1.getSelectedIndex()) ;
				if (psi1.playMatch.get(nthMatch).winner()==null)
				{
					Data2 = Data2 + "\n " +  "Tie";
					System.out.println("Match is Tie " );
				} else
				{
					Data2 = Data2 + "\n " + psi1.playMatch.get(nthMatch).winner().getTeamName() ;
				    System.out.println("Winner is " +psi1.playMatch.get(nthMatch).winner().getTeamName());;
					
				}
				areaField1.setText( Data1 );
				areaField2.setText( Data2 );
				nthMatch += 1; 
			}
			
			/*
			String data = "Programming language Selected: "   
					   + cb.getItemAt(cb.getSelectedIndex());  
			label.setText(data);*/
			
			
		}
		
		if (e.getSource()==thirdButtton){
			if (checkfinal==0)
			{
			psi1.playAllMatches();}
		    
			psi1.savePoint();
			psi1.highTotal();
			areaField2.setText( " " );
			secondButtton.setEnabled(false);
			System.out.println("Winner Displayed");
		
			if (psi1.isTotMatch() )
			{
				ArrayList<Team> bestPerformers =  new ArrayList <Team >();
				bestPerformers =psi1.bestTwo();
				System.out.println("Best two Teams are :" +  bestPerformers.get(0).getTeamName()+ " and " + bestPerformers.get(1).getTeamName()  );
				System.out.println("points are :" + psi1.teamPoints( bestPerformers.get(0))+ "and" + psi1.teamPoints( bestPerformers.get(1))  );
				psi1.playFinalMatch();
				System.out.println("winner is :" + psi1.Winner().getTeamName()  );
				areaField2.setText( "\n   Finale :\n   " + bestPerformers.get(0).getTeamName()+ " vs " + bestPerformers.get(1).getTeamName() 
						+"\n   Final winner is :\n   " + psi1.Winner().getTeamName() );
	
				
			}
			thirdButtton.setEnabled(false);
			firstButtton.setEnabled(false);
		}
	}

}
