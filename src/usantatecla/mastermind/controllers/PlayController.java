package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.console.ProposalView;

public class PlayController extends UseCaseController implements AcceptorController {

	private ProposalController proposalController;
	private UndoController undoController;
	private RedoController redoController;

	public PlayController(Session session) {
		super(session);
		this.proposalController = new ProposalController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}

	public void undo() {
		this.undoController.undo();
	}

	public boolean isUndoable() {
		return this.undoController.isUndoable();
	}

	public void redo() {
		this.redoController.redo();
	}

	public boolean isRedoable() {
		return this.redoController.isRedoable();
	}

	public void proposeCombination() {
		new ProposalView().interact(this.proposalController);
		
	}

	public void showAttempts() {
		new ProposalView().showAttempts(this.proposalController);

	}
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}
