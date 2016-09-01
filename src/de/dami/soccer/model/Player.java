package de.dami.soccer.model;

public class Player {
	
	private String name;
	private int running;
	private int technique;
	private int tactic;
	private int passing;		
	private int saving;
	private int shooting;
	private int tackling;
	
	public Player(String name, int running, int technique, int tactic,
			int passing, int saving, int shooting, int tackling) {
		this.name = name;
		this.running = running;
		this.technique = technique;
		this.tactic = tactic;
		this.passing = passing;
		this.saving = saving;
		this.shooting = shooting;
		this.tackling = tackling;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunning() {
		return running;
	}

	public void setRunning(int running) {
		this.running = running;
	}

	public int getTechnique() {
		return technique;
	}

	public void setTechnique(int technique) {
		this.technique = technique;
	}

	public int getTactic() {
		return tactic;
	}

	public void setTactic(int tactic) {
		this.tactic = tactic;
	}

	public int getPassing() {
		return passing;
	}

	public void setPassing(int passing) {
		this.passing = passing;
	}

	public int getSaving() {
		return saving;
	}

	public void setSaving(int saving) {
		this.saving = saving;
	}

	public int getShooting() {
		return shooting;
	}

	public void setShooting(int shooting) {
		this.shooting = shooting;
	}

	public int getTackling() {
		return tackling;
	}

	public void setTackling(int tackling) {
		this.tackling = tackling;
	}

	@Override
	public String toString() {
		return name;
	}

}
