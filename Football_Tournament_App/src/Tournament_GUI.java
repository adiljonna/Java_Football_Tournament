

//import javax.swing.JButton;
//import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

//import java.awt.FlowLayout;


public class Tournament_GUI {


	public static void main(String[] args) {
		
		tournamentWithFinal psi1  = new tournamentWithFinal ("Laliga2020");
		tournamentFrame myTournament = new tournamentFrame(psi1);
		
		
		JLabel myLabel = new JLabel("Tournament       " +   psi1.name);
		JLabel myLabel1 = new JLabel("Teams");
		JLabel myLabel2 = new JLabel("Matches");
		JLabel myLabel3 = new JLabel("Winner");
		JLabel myLabel4 = new JLabel("New Team");
		JLabel myLabel5 = new JLabel("Name");
		JLabel myLabel6 = new JLabel("Country");
		JLabel myLabel7 = new JLabel("New Match");
		JLabel myLabel8= new JLabel("Teams");
		JLabel myLabel9 = new JLabel("Scores");
		
		//myLabel.setText("Tour");
		myTournament.add(myLabel);
		myTournament.add(myLabel1);
		myTournament.add(myLabel2);
		myTournament.add(myLabel3);
		myTournament.add(myLabel4);
		myTournament.add(myLabel5);
		myTournament.add(myLabel6);
		myTournament.add(myLabel7);
		myTournament.add(myLabel8);
		myTournament.add(myLabel9);
		
		
		myLabel.setVerticalAlignment(SwingConstants.TOP);
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		myLabel.setBounds(130, 0, 250, 250);
		myLabel1.setBounds(70, 10, 150, 100);
		myLabel2.setBounds(245, 10, 150, 100);
		myLabel3.setBounds(395, 10, 150, 100);
		myLabel4.setBounds(70,230 , 150, 100);
		myLabel5.setBounds(30,280 , 150, 100);
		myLabel6.setBounds(30,320 , 150, 100);
		myLabel7.setBounds(270,230 , 150, 100);
		myLabel8.setBounds(300, 260,150, 100);
		myLabel9.setBounds(420, 260,150, 100);
		
		
		myLabel.setForeground(Color.BLACK);
		myLabel1.setForeground(Color.BLACK);
		myLabel2.setForeground(Color.BLACK);
		myLabel3.setForeground(Color.BLACK);
		myLabel4.setForeground(Color.BLACK);
		myLabel5.setForeground(Color.BLACK);
		myLabel6.setForeground(Color.BLACK);
		myLabel7.setForeground(Color.BLACK);
		myLabel8.setForeground(Color.BLACK);
		myLabel9.setForeground(Color.BLACK);
		/*FlowLayout fl = new FlowLayout();
		myTournament.getContentPane().setLayout(fl);
		myTournament.getContentPane().add(myLabel);
		myTournament.setVisible(true);*/
		myTournament.add(myLabel);
		//myTournament.pack(); //fit window according to size of components 
		
		
		
	}
}
	