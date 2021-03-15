package usantatecla.mastermind.views.console;

import java.util.List;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.utils.WithConsoleView;
import usantatecla.mastermind.views.MessageView;

public class ProposalView extends WithConsoleView {

	public void interact(ProposalController proposalController) {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(proposalController).read();
			error = proposalController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		this.showAttempts(proposalController);
		if (proposalController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (proposalController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
	}
	
	public void showAttempts(ProposalController proposalController) {
		this.console.writeln();
		new AttemptsView(proposalController).writeln();
		new SecretCombinationView(proposalController).writeln();
		for (int i = 0; i < proposalController.getAttempts(); i++) {
			new ProposedCombinationView(proposalController).write(i);
			new ResultView(proposalController).writeln(i);
		}
	}
}
