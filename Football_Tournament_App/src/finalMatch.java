import java.util.ArrayList;
import java.util.Random;

public class finalMatch extends Match {
	
	private int penalityA;
	private int penalityB;
	
	/*
	public finalMatch(int scoreA, int scoreB, Team teamA, Team teamB) {
		super(scoreA, scoreB, teamA, teamB);
		// TODO Auto-generated constructor stub
	}*/
	
	
	public finalMatch(int scoreA, int scoreB, Team teamA, Team teamB)
	{
		super(scoreA, scoreB, teamA, teamB);
	
		
		if (scoreA == scoreB)
		{
			Random randScore = new Random();
			ArrayList <Integer> penScrList = new ArrayList<Integer>();
			for (int i =0; i<=5; i++)
			{
				penScrList.add(i);
			}
			
			int penA = randScore.nextInt(penScrList.size());
			penalityA = penScrList.get(penA);
			penScrList.remove(penA);
			System.out.println(teamA.getTeamName() + " Penality Score:" + penalityA);
			int penB = randScore.nextInt(penScrList.size());
			penalityB = penScrList.get(penB);
			System.out.println(teamB.getTeamName() + " Penality Score:" + penalityB);
		}
		
	}
	@Override
    public Team winner()
    {
    	if (scoreA > scoreB)
    	{
    		return teamA;
    	} 
    	else if (scoreB>scoreA)
    	{
    		return teamB;
    	} 
    	else if  (penalityA>penalityB)
    	{
    		return teamA;
    	}
    	else
    	{
    		return teamB;
    	}
    }



	
}
