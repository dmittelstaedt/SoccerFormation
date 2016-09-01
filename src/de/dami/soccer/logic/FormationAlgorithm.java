package de.dami.soccer.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import de.dami.soccer.model.Player;
import de.dami.soccer.model.Team;

public class FormationAlgorithm {
	
	private List<Player> players;
	private Team teamHome;
	private Team teamAway;
	private Team best_teamHome;
	private Team best_teamAway;
	private int tot_loop_number;
	
	public FormationAlgorithm(List<Player> players, int tot_loop_number) {
		this.players = players;
		this.teamHome = new Team();
		this.teamAway = new Team();
		this.best_teamHome = new Team();
		this.best_teamAway = new Team();
		this.tot_loop_number = tot_loop_number;
	}
	
	public void calcFormation() {
		
		int loop_number = 0;
		
		for (int j=0; j<tot_loop_number; j++) {
			
			List<Player> players_copy = new ArrayList<Player>(players.size());
			for (Player player : players){
				players_copy.add(player);
			}
			
			long seed = System.currentTimeMillis();
			Collections.shuffle(players_copy, new Random(seed));
			
			int org_players_size = players_copy.size();
			
			for (int i=0; i<org_players_size; i++){
				if ((i % 2) == 0 ) {
					teamHome.addPlayer(players_copy.get(0));
				} else {
					teamAway.addPlayer(players_copy.get(0));
				}
				players_copy.remove(0);
			}
			
			if (j==0) {
				for (Player player : teamHome.getPlayers()){
					best_teamHome.addPlayer(player);
				}
				for (Player player : teamAway.getPlayers()){
					best_teamAway.addPlayer(player);
				}
			}
			
			double diff = teamHome.getTot_power() - teamAway.getTot_power();
			double diff_best = best_teamHome.getTot_power() - best_teamAway.getTot_power();
			
			if (Math.abs(diff) < Math.abs(diff_best)){
				best_teamHome.removeAllPlayers();
				for (Player player : teamHome.getPlayers()){
					best_teamHome.addPlayer(player);
				}
				best_teamAway.removeAllPlayers();
				for (Player player : teamAway.getPlayers()){
					best_teamAway.addPlayer(player);
				}
				loop_number = j;
			}
			
			teamHome.removeAllPlayers();
			teamAway.removeAllPlayers();
		}
		
		System.out.println("Home team: " + best_teamHome.toString());
		System.out.println("Total strength: " + best_teamHome.getTot_power());
		System.out.println("Away team: " + best_teamAway.toString());
		System.out.println("Total strength: " + best_teamAway.getTot_power());
		System.out.println("Number of loops: " + loop_number + "/" + tot_loop_number);
	}
	
}
