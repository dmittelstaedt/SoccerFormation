package de.dami.soccer;

import java.util.ArrayList;
import java.util.List;

import de.dami.soccer.logic.FormationAlgorithm;
import de.dami.soccer.model.Player;
import de.dami.soccer.utils.SimpleProperties;

public class Main {
	
	public static void main(String[] args) {
		
		if (args.length==2){
			List<Player> players = new ArrayList<Player>();
			SimpleProperties simpleProperties = new SimpleProperties();
			players = simpleProperties.readPlayersProperties(args[0]);
			System.out.println("Number of players: " + players.size());
			System.out.println("all players: " + players);
			FormationAlgorithm formatAlgo = new FormationAlgorithm(players,
					Integer.parseInt(args[1]));
			formatAlgo.calcFormation();
		} else{
			System.out.println("Usage: java -jar SoccerFormation.jar f n" +
					"\n" +
					"\n" +
					"f = players.properties \n" +
					"n = number of loops");
		}
	}
	
}
