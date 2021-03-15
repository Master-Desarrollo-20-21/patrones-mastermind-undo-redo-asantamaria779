package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.controllers.UseCaseController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

	private UseCaseController controller;
	
	SecretCombinationView (ProposalController proposalController) {
		this.controller = proposalController;
	}
	
	SecretCombinationView (StartController startController) {
		this.controller = startController;
	}
	
	void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
}
