import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class tournamentWithFinal extends Tournament {
	
	private finalMatch Finale;
	private ArrayList <Team > finalWinner = new ArrayList <Team > ();

			
	public tournamentWithFinal(String name)
	{
		super(name);
		Finale = null;
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList <Team > bestTwo()
	{
		
		int k = scoreRecord.indexOf(hTot);
		finalWinner.add(recTeam.get(k));
		scoreRecord.remove(k);
		recTeam.remove(k);
		hTot = Collections.max(this.scoreRecord);
		int k1 = scoreRecord.indexOf(hTot);
		finalWinner.add(recTeam.get(k1));
		scoreRecord.remove(k1);
		recTeam.remove(k1);
		
		return finalWinner;
	}
	
	
	

	
	public void playFinalMatch() 
	{	
		Random randNum = new Random();
		int scoreA = randNum.nextInt(3);
		int scoreB = randNum.nextInt(3);
		System.out.println("Final Match Score");
		System.out.println(finalWinner.get(0).getTeamName() + " Score:" + scoreA);
		System.out.println(finalWinner.get(1).getTeamName() + " Score:" + scoreB);
		Finale = new finalMatch (scoreA,scoreB,finalWinner.get(0),finalWinner.get(1)); 
	
	}
	//@Override
	public Team Winner()
	{
		return Finale.winner();
	}



	

}

//---- end-------------

/*
public ArrayList <Team > bestTwo()
{
	int n =0;
	for (int i=0;i<this.recTeam.size(); i++)
	{
		//System.out.println(i+"check0:"  );
		
		if (scoreRecord.get(i) == hTot && !finalWinner.contains(recTeam.get(i))  )
		{    
			
			finalWinner.add(recTeam.get(i));
			//System.out.println("check1:" + finalWinner.get(n).getTeamName() );
			scoreRecord.remove(i);
			
			recTeam.remove(i);
			hTot = Collections.max(this.scoreRecord);
			
			n++;
		}
	
	}
	//System.out.println("scoreRecord1:" + scoreRecord );
	//System.out.println("scoreRecord1:" + recTeam.get(0).getTeamName() );
	
    if(finalWinner.size()!=2 )
	{
    	for (int i=0;i<this.recTeam.size(); i++)
		{
			if (this.scoreRecord.get(i) == this.hTot)
			{
				finalWinner.add(this.recTeam.get(i));
				//System.out.println("check2:" + finalWinner.get(n).getTeamName() );
			}
		}
	}
	
	
	return finalWinner;
}*/