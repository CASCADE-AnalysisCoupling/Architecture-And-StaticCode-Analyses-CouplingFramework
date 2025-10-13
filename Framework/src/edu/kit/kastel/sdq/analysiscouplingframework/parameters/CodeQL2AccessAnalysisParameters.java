package edu.kit.kastel.sdq.analysiscouplingframework.parameters;

public class CodeQL2AccessAnalysisParameters extends AbstractParameters {

	public String javaModelLocation;
	public String codeQLModelLocation;
	public String correspondenceModelLocation;
	public String resultFileLocation;
	public String repositoryModelLocation;
	public String confidentialitySpecificationLocation;
	public String originBackupLocation;
	public String scarLocation;
	public String resultingValuesLocation;
	public String accessAnalysisCorrespondencesLocation;
	public String scarCorrespondencesLocation;
	public String resultingValuesCorrespondencesLocation;
	public String codeQL_Configurations_Location;

	public CodeQL2AccessAnalysisParameters(String okMessage, String notOkMessage, String policyStyle,
			String javaModelLocation, String codeQLModelLocation, String correspondenceModelLocation,
			String resultFileLocation, String repositoryModelLocation, String confidentialitySpecificationLocation,
			String originBackupLocation, String scarLocation, String resultingValuesLocation,
			String accessAnalysisCorrespondencesLocation, String scarCorrespondencesLocation,
			String resultingValuesCorrespondencesLocation, String codeQL_Configurations_Location) {
		super(okMessage, notOkMessage, policyStyle);		
		this.javaModelLocation = javaModelLocation;
		this.codeQLModelLocation = codeQLModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.resultFileLocation = resultFileLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.confidentialitySpecificationLocation = confidentialitySpecificationLocation;
		this.originBackupLocation = originBackupLocation;
		this.scarLocation = scarLocation;
		this.resultingValuesLocation = resultingValuesLocation;
		this.accessAnalysisCorrespondencesLocation = accessAnalysisCorrespondencesLocation;
		this.scarCorrespondencesLocation = scarCorrespondencesLocation;
		this.resultingValuesCorrespondencesLocation = resultingValuesCorrespondencesLocation;
		this.codeQL_Configurations_Location = codeQL_Configurations_Location;
	}
}
