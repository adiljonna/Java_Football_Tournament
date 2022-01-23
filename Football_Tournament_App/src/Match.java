
public class Match {
	protected int scoreA;
	protected int scoreB;
	protected Team teamA;
	protected Team teamB;
	
	
	// ------ Constructor ------------------------
	public Match( int scoreA, int scoreB,Team teamA,  Team teamB  ){
		
		
		this. setScoreA( scoreA);
		this.setScoreB(scoreB);
		this.setTeamA(teamA);
		this.setTeamB(teamB);
	}
	
	
	//------------------- end -----------------
	
	// -------------- setter and getter --------------
	public void setScoreA (int scoreA){
		this.scoreA = scoreA;
	}
	
	public int getScoreA (){
		return scoreA;
	}
	
	public void setScoreB (int scoreB){
		this.scoreB = scoreB;
	}
	
	public int getScoreB (){
		return scoreB;
	}
	
	public void setTeamA (Team teamA){
		this.teamA = teamA;
	}
	
	public Team getTeamA (){
		return teamA;
	}
	
	public void setTeamB (Team teamB){
		this.teamB = teamB;
	}
	
	public Team getTeamB (){
		return teamB;
	}
	
	//---------------end------
	
	public Team winner (){
		
		if (this.getScoreA() >this.getScoreB()) {
			return this.getTeamA();
		}
		else if (this.getScoreA() < this.getScoreB()) {
			return this.getTeamB();
			} 
		else {return null;}
		
	}
}
