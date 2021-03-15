package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class ResumeController extends UseCaseController implements AcceptorController {

	public ResumeController(Session session) {
	    super(session);
	}
	
	public void resume(boolean isResumed) {
		if (isResumed){
			this.session.reset();
		} else {
		      this.session.next();
		}
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
