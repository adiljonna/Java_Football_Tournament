import java.util.ArrayList;

public class tournamentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team Toulouse;
		Toulouse = new Team("Toulouse", "France" );
		
		Team Lyon;
		Lyon = new Team ("Lyon","France");
		
		Team Bordeaux;
		Bordeaux = new Team ("Bordeaux", "France");
		
		Team Paris;
		Paris = new Team ("Paris", "France");
		
		/*
		Match first_match;
		first_match = new Match (3,4, Toulouse, Lyon);
		
		Match second_match;
		second_match = new Match (2,6, Toulouse, Bordeaux);
		
		Match third_match;
		third_match = new Match (1,0, Lyon, Bordeaux);
		
		Match fourth_match;
		fourth_match = new Match (5,4, Toulouse, Paris);
		
		Match fifth_match;
		fifth_match = new Match (2,4, Lyon, Paris);
		
		Match sixth_Match;
		sixth_Match = new Match (2,3, Paris, Bordeaux); */
		
		
		tournamentWithFinal psi;
		psi = new tournamentWithFinal ("Laliga");
		
		psi.invite(Toulouse);
		psi.invite(Lyon);
		psi.invite(Bordeaux);
		psi.invite(Paris);
		
		/*
		psi.playMatches(first_match);
		psi.playMatches(second_match);
		psi.playMatches(third_match);
		psi.playMatches(fourth_match);
		psi.playMatches(fifth_match);
		psi.playMatches(sixth_Match);
		psi.playMatches(sixth_Match);*/
		
		
		
		System.out.println(Toulouse.getTeamName());
		System.out.println(Toulouse.getTeamCitiz());
		/*
		System.out.println("Match Between " + first_match.getTeamA().getTeamName()+ " and " + first_match.getTeamB(). getTeamName() + ":");
		System.out.println("Final score is " + first_match.getScoreA() +"-"+ first_match.getScoreB());
		System.out.println("Winner is "+ first_match.winner().getTeamName());*/
		
		psi.dispTeams();
		psi.playAllMatches();
		System.out.println("Total no. of matches played "+psi.playMatch.size());
		System.out.println("All matches played "+ psi.isTotMatch());
		//System.out.println(Toulouse.getTeamName() + " scored: " + psi.teamPoints(Toulouse ));
		//System.out.println(Lyon.getTeamName() + " scored: " + psi.teamPoints(Lyon ));
		//System.out.println(Bordeaux.getTeamName() + " scored: " + psi.teamPoints(Bordeaux ));
		//System.out.println(Paris.getTeamName() + " scored: " + psi.teamPoints(Paris ));
		psi.savePoint();
		psi.highTotal();
		//System.out.println(" Highest score: " + psi.highTotal());
		
		
		if (psi.isTotMatch()){
			
			//for (int i =0 ;i<psi.Winners().size();i++){
			//System.out.println(" Winner "+ (i+1) + " is " + psi.Winners().get(i).getTeamName());
			//}
		
		
		//finalMatch finaL1;
		//finaL1 = new finalMatch (4,4,  Bordeaux, Paris);
		
		//System.out.println("Winner is Team " + finaL1.winner().getTeamName());
		
		//tournamentWithFinal psi1;
		//psi1 = new tournamentWithFinal ("Laliga");
		
		ArrayList<Team> bestPerformers =  new ArrayList <Team >();
		bestPerformers=psi.bestTwo();
		System.out.println("Best two Teams are :" +  bestPerformers.get(0).getTeamName()+ " and " + bestPerformers.get(1).getTeamName()  );
		psi.playFinalMatch();
		System.out.println("winner is :" + psi.Winner().getTeamName()  );
		
			
		}
	}

}
