package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class GameMemento {

	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;
	private int attempts;

	GameMemento(List<ProposedCombination> proposedCombinations, List<Result> results) {
		this.setProposedCombinations(new ArrayList<ProposedCombination>(proposedCombinations));
		this.setResults(new ArrayList<Result>(results));
		this.setAttempts(proposedCombinations.size());
	}

	public List<ProposedCombination> getProposedCombinations() {
		return this.proposedCombinations;
	}

	public void setProposedCombinations(List<ProposedCombination> proposedCombinations) {
		this.proposedCombinations = proposedCombinations;
	}
	
	public List<Result> getResults() {
		return this.results;
	}
	
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	public int getAttempts() {
		return this.attempts;
	}
	
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}  
}
