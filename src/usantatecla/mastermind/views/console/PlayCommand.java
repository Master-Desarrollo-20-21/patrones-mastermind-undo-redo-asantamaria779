package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

class PlayCommand extends Command {

  PlayCommand(PlayController playController) {
    super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
  }

  @Override
  protected void execute() {
	this.playController.proposeCombination();
  }

  @Override
  protected boolean isActive() {
    return true;
  }

}
