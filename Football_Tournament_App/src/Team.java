
public class Team {
	
	private String teamName;
	private String teamCitiz;
	
	
	//public Team (){}
	public Team(String teamName, String teamCitiz ){
		
		this.setTeamName(teamName);
		this.setTeamCitiz(teamCitiz);
	}
	
	public void setTeamName (String teamName) {
    	
		this.teamName = teamName;
    }
	
	public String getTeamName(){
		
		return teamName;

	}
	
	public void setTeamCitiz (String teamCitiz) {
    	
		this.teamCitiz = teamCitiz;
    }
	
	public String getTeamCitiz(){
		
		return teamCitiz;

	}
}
