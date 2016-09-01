package de.damit.soccer.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import de.dami.soccer.model.Player;

public class SimpleProperties {
	
	public List<Player> readPlayersProperties(String filename){
		
		List<Player> players = new ArrayList<Player>();
		
		Properties properties = new Properties();
		InputStream input = null;
		
		try {
			System.out.println("Reading players from file: " + filename);
			input = new FileInputStream(filename);
			properties.load(input);
			if (Integer.parseInt(properties.getProperty("david")) == 1){
				Player david = new Player("David", 8, 8, 9, 8, 7, 8, 7);
				players.add(david);
			}
			if (Integer.parseInt(properties.getProperty("frank")) == 1){
				Player frank = new Player("Frank", 9, 8, 7, 7, 7, 8, 8);
				players.add(frank);
			}
			if (Integer.parseInt(properties.getProperty("niko")) == 1){
				Player niko = new Player("Niko", 9, 7, 7, 7, 8, 7, 8);
				players.add(niko);
			}
			if (Integer.parseInt(properties.getProperty("christoph")) == 1){
				Player christoph = new Player("Christoph", 6, 9, 8, 8, 5, 9, 6);
				players.add(christoph);
			}
			if (Integer.parseInt(properties.getProperty("jorge")) == 1){
				Player jorge = new Player("Jorge", 7, 7, 8, 8, 8, 6, 7);
				players.add(jorge);
			}
			if (Integer.parseInt(properties.getProperty("hannes")) == 1){
				Player hannes = new Player("Hannes", 8, 8, 8, 6, 7, 5, 8);
				players.add(hannes);
			}
			if (Integer.parseInt(properties.getProperty("fred")) == 1){
				Player fred = new Player("Fred", 7, 7, 7, 7, 9, 6, 7);
				players.add(fred);
			}
			if (Integer.parseInt(properties.getProperty("gerald")) == 1){
				Player gerald = new Player("Gerald", 8, 7, 7, 7, 7, 5, 8);
				players.add(gerald);
			}
			if (Integer.parseInt(properties.getProperty("steffen")) == 1){
				Player steffen = new Player("Steffen", 7, 6, 8, 7, 7, 7, 6);
				players.add(steffen);
			}
			if (Integer.parseInt(properties.getProperty("cyrill")) == 1){
				Player cyrill = new Player("Cyrill", 6, 7, 6, 6, 8, 8, 7);
				players.add(cyrill);
			}
			if (Integer.parseInt(properties.getProperty("felix")) == 1){
				Player felix = new Player("Felix", 7, 6, 8, 6, 6, 6, 6);
				players.add(felix);
			}
			if (Integer.parseInt(properties.getProperty("oliver")) == 1){
				Player oliver = new Player("Oliver", 7, 6, 7, 6, 6, 6, 7);
				players.add(oliver);
			}
			if (Integer.parseInt(properties.getProperty("robert")) == 1){
				Player robert = new Player("Robert", 5, 5, 7, 6, 6, 5, 8);
				players.add(robert);
			}
			if (Integer.parseInt(properties.getProperty("christoph_o")) == 1){
				Player christoph_o = new Player("Christoph O", 7, 5, 5, 6, 7, 4, 7);
				players.add(christoph_o);
			}
			if (Integer.parseInt(properties.getProperty("veit")) == 1){
				Player veit = new Player("Veit", 6, 4, 5, 6, 7, 5, 6);
				players.add(veit);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(input!=null) {
				try {
					input.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		
		return players;
	}

}
