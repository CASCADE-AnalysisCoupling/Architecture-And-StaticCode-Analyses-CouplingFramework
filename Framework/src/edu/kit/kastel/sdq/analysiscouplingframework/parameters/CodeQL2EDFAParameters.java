package edu.kit.kastel.sdq.analysiscouplingframework.parameters;

public class CodeQL2EDFAParameters extends AbstractParameters {

	public String javaModelLocation;
	public String codeQLModelLocation;
	public String pcmJavaCorrespondenceModelLocation;
	public String codeQLResultLocation;
	public String parameterAnnotationModelLocation;
	public String dataDictionaryLocation;
	public String originBackupLocation;
	public String repositoryModelLocation;
	public String scarLocation;
	public String resultingValuesLocation;
	public String edfaCodeQLCorrespondencesLocation;
	public String scarCorrespondencesLocation;
	public String resultingValuesCorrespondencesLocation;
	public String codeQLConfigurationsLocation;

	public CodeQL2EDFAParameters(String okMessage, String notOkMessage, String policyStyle, String javaModelLocation,
			String codeQLModelLocation, String pcmJavaCorrespondenceModelLocation, String codeQLResultLocation,
			String parameterAnnotationModelLocation, String dataDictionaryLocation, String originBackupLocation,
			String repositoryModelLocation, String scarLocation, String resultingValuesLocation,
			String edfaCodeQLCorrespondencesLocation, String scarCorrespondencesLocation,
			String resultingValuesCorrespondencesLocation, String codeQLConfigurationsLocation) {
		super(okMessage, notOkMessage, policyStyle);
		this.javaModelLocation = javaModelLocation;
		this.codeQLModelLocation = codeQLModelLocation;
		this.pcmJavaCorrespondenceModelLocation = pcmJavaCorrespondenceModelLocation;
		this.codeQLResultLocation = codeQLResultLocation;
		this.parameterAnnotationModelLocation = parameterAnnotationModelLocation;
		this.dataDictionaryLocation = dataDictionaryLocation;
		this.originBackupLocation = originBackupLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.scarLocation = scarLocation;
		this.resultingValuesLocation = resultingValuesLocation;
		this.edfaCodeQLCorrespondencesLocation = edfaCodeQLCorrespondencesLocation;
		this.scarCorrespondencesLocation = scarCorrespondencesLocation;
		this.resultingValuesCorrespondencesLocation = resultingValuesCorrespondencesLocation;
		this.codeQLConfigurationsLocation = codeQLConfigurationsLocation;
	}
}
