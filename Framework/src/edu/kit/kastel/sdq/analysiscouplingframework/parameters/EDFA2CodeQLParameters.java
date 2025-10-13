package edu.kit.kastel.sdq.analysiscouplingframework.parameters;

public class EDFA2CodeQLParameters extends AbstractParameters {

	public String repositoryPath;
	public String parameterAnnotationModelPath;
	public String dataDictionaryModelPath;
	public String edfa_Configurations_Path;
	public String codeBasePackageName;
	public String javaModelPath;
	public String codeQLModelPath;
	public String codeQLConfigurations_Path;
	public String pcmCorrespondenceModelPath;
	public String codeQLQueryFolderPath;
	public String edfaCodeQLCorrespondenceModelPath;

	public EDFA2CodeQLParameters(String okMessage, String notOkMessage, String policyStyle, String repositoryPath,
			String parameterAnnotationModelPath, String dataDictionaryModelPath, String edfa_Configurations_Path,
			String codeBasePackageName, String javaModelPath, String codeQLModelPath, String codeQLConfigurations_Path,
			String pcmCorrespondenceModelPath, String codeQLQueryFolderPath, String edfaCodeQLCorrespondenceModelPath) {
		super(okMessage, notOkMessage, policyStyle);
		this.repositoryPath = repositoryPath;
		this.parameterAnnotationModelPath = parameterAnnotationModelPath;
		this.dataDictionaryModelPath = dataDictionaryModelPath;
		this.edfa_Configurations_Path = edfa_Configurations_Path;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.codeQLModelPath = codeQLModelPath;
		this.codeQLConfigurations_Path = codeQLConfigurations_Path;
		this.pcmCorrespondenceModelPath = pcmCorrespondenceModelPath;
		this.codeQLQueryFolderPath = codeQLQueryFolderPath;
		this.edfaCodeQLCorrespondenceModelPath = edfaCodeQLCorrespondenceModelPath;
	}
}
