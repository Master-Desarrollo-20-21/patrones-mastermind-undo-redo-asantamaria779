package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class UndoController extends UseCaseController {

  UndoController(Session session) {
    super(session);
  }

  void undo() {
    this.session.undo();
  }

  boolean isUndoable() {
    return this.session.isUndoable();
  }

}