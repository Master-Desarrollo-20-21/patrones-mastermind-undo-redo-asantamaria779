package usantatecla.mastermind.views;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSE_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	PROPOSE_COMMAND("Propose combination"),
	UNDO_COMMAND("Undo previous Proposal"), 
	REDO_COMMAND("Redo previous Proposal"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-(");

	private String message;
	
	private MessageView(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
