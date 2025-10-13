package edu.kit.kastel.sdq.analysiscouplingframework.parameters;

public abstract class AbstractParameters {

	public String okMessage;
	public String notOkMessage;
	public String policyStyle;

	public AbstractParameters(String okMessage, String notOkMessage, String policyStyle) {
		this.okMessage = okMessage;
		this.notOkMessage = notOkMessage;
		this.policyStyle = policyStyle;
	}
}
