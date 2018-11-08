package sh.planen;

public class NichtEingeladenException extends Exception {

	public NichtEingeladenException() {
		super("Dieser Gast ist nicht willkommen!");
	}
}
