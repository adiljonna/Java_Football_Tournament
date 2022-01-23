import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tournament {
	
	private ArrayList <Team> invitedTeams = new  ArrayList <Team> ();
	protected ArrayList <Match> playMatch =new ArrayList<Match>();
	protected ArrayList <Integer > scoreRecord =new ArrayList<Integer>();
	protected ArrayList <Team > recTeam =new ArrayList<Team>();
	String name;
	private int nTeams;
	private int nMatch;
	protected int hTot;
	private static int winP = 3;
	private static int drawP = 1;
	private  static int losP = 0;
	private static int errP = 0;
	
	//------- consturctor------------------
	public Tournament(String name)
	{
		this.setName( name);	
	}
	
	//--------------end----------------
	
	
	//------------- gettters and setters--------------
	
	public void setName(String name) {this.name = name;}
	public String getName(){return this.name;}
	
	//------------------end------------------------
	//public void 
	
	public void invite(Team teamReg)
	{
		if  (!invitedTeams.contains(teamReg) && teamReg!=null)
		{
			invitedTeams.add(teamReg);
		}
		nTeams = invitedTeams.size();
	}
	
	
	public void dispTeams()
	{
		for (Team i : invitedTeams )
		{
			System.out.println("Team "+ invitedTeams.indexOf(i) + " : " + i.getTeamName());
		}
	
	 }
	
	

	public void playMatches(Match newMatch)
	{
		if (!playMatch.contains(newMatch))
		{
			playMatch.add(newMatch);
		}	
		nMatch = playMatch.size();
	}
	
	public void playAllMatches (){
		
		int scoreB =0;
		int scoreA  = 0;
		for (int i= 0; i<nTeams-1; i++)
		{
			for (int j= nTeams-1; j>i; j--)
			{
				Random randNum = new Random();
				scoreA = randNum.nextInt(5);
				scoreB = randNum.nextInt(5);
				//System.out.println("i,j"+ i + j  );
				Match Matchi = new Match (scoreA,scoreB,invitedTeams.get(i),invitedTeams.get(j) );
				playMatches(Matchi);
				Matchi = null;
			}
		}
		
	}
	
	
	public boolean isTotMatch ()
	{		
		return (nMatch== (nTeams*(nTeams-1))/2);
	}
	
	public int teamPoints(Team rTeam)
	{
		int k = 0;
		
		for (Match i :playMatch) 
		{
			if (i.winner () == null  )
			{
				if (i.getTeamA().equals( rTeam ) || i.getTeamB().equals( rTeam ) )
					k = k + drawP;
			}
			else if (i.winner ().equals( rTeam) )
				{
					k = k + winP;
				} 
			else 
				{
					k = k + losP;
				}
		}
		this.scoreRecord.add(k);
		this.recTeam.add (rTeam);
		return k;
		
	}
	public void savePoint()
	{
			for (Team i : invitedTeams )
			{
				int kk = this.teamPoints(i);
			}
	}
	public void highTotal() 
	{
		hTot = Collections.max(this.scoreRecord);
		//return hTot ;
	}
	
	
	public ArrayList <Team > Winners()
	{
		ArrayList <Team > WinnerList = new ArrayList <Team > ();
		for(Team k :invitedTeams)
		{
			if( this.scoreRecord.get(invitedTeams.indexOf(k)) == hTot)
			{
				WinnerList.add(this.recTeam.get(invitedTeams.indexOf(k)));
			}
		}	 
	
		
		return WinnerList ;
	}
	

		
	



	
	
}
	

