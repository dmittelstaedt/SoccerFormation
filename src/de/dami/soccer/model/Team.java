package de.dami.soccer.model;

import java.util.ArrayList;
import java.util.List;

import de.dami.soccer.constant.Multiplicator;

public class Team {
	
	private String name;
	private List<Player> players;
	private double tot_power;	
	private int tot_running;
	private int tot_technique;
	private int tot_tactic;
	private int tot_passing;		
	private int tot_saving;
	private int tot_shooting;
	private int tot_tackling;
	
	public Team() {
		players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(Player player) {
		players.remove(player);
	}
	
	public void removeAllPlayers() {
		players.clear();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public double getTot_power() {
		tot_power = getTot_running() * Multiplicator.RUNNING +
				getTot_technique() * Multiplicator.TECHNIQUE +
				getTot_tactic() * Multiplicator.TACTIC +
				getTot_passing() * Multiplicator.PASSING +
				getTot_saving() * Multiplicator.SAVING +
				getTot_shooting() * Multiplicator.SHOOTING +
				getTot_tackling() * Multiplicator.TACKLING;
		return tot_power;
	}
	
	private void setTot_power(double total_power) {
		this.tot_power = total_power;
	}
	
	public int getTot_running() {
		tot_running = 0;
		for (Player player : players) {
			tot_running = tot_running + player.getRunning();
		}
		return tot_running;
	}
	
	private void setTot_running(int total_running) {
		this.tot_running = total_running;
	}
	
	public int getTot_technique() {
		tot_technique = 0;
		for (Player player : players) {
			tot_technique = tot_technique + player.getTechnique();
		}
		return tot_technique;
	}
	
	private void setTot_technique(int tot_technique) {
		this.tot_technique = tot_technique;
	}
	
	public int getTot_tactic() {
		tot_tactic = 0;
		for (Player player : players) {
			tot_tactic = tot_tactic + player.getTactic();
		}
		return tot_tactic;
	}
	
	private void setTot_tactic(int tot_tactic) {
		this.tot_tactic = tot_tactic;
	}
	
	public int getTot_passing() {
		tot_passing = 0;
		for (Player player : players) {
			tot_passing = tot_passing + player.getPassing();
		}
		return tot_passing;
	}
	
	private void setTot_passing(int tot_passing) {
		this.tot_passing = tot_passing;
	}
	
	public int getTot_saving() {
		tot_saving = 0;
		for (Player player : players) {
			tot_saving = tot_saving + player.getSaving();
		}
		return tot_saving;
	}
	
	private void setTot_saving(int tot_saving) {
		this.tot_saving = tot_saving;
	}
	
	public int getTot_shooting() {
		tot_shooting = 0;
		for (Player player : players) {
			tot_shooting = tot_shooting + player.getShooting();
		}
		return tot_shooting;
	}
	
	private void setTot_shooting(int tot_shooting) {
		this.tot_shooting = tot_shooting;
	}
	
	public int getTot_tackling() {
		tot_tackling = 0;
		for (Player player : players) {
			tot_tackling = tot_tackling + player.getTackling();
		}
		return tot_tackling;
	}
	
	private void setTot_tackling(int tot_tackling) {
		this.tot_tackling = tot_tackling;
	}
	

	@Override
	public String toString() {
		return players.toString();
	}
	
}
