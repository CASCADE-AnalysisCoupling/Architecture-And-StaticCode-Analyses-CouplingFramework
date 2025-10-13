package edu.kit.kastel.sdq.analysiscouplingframework.parameters;

public class AccessAnalysis2CodeQLParameters extends AbstractParameters {

	public String repositoryPath;
	public String confidentialityModelPath;
	public String codeBasePackageName;
	public String javaModelPath;
	public String codeQLModelPath;
	public String correspondenceModelPath;
	public String codeQLQueryFolderPath;
	public String accessAnalysisCodeQLCorrespondenceModelPath;

	public AccessAnalysis2CodeQLParameters(String okMessage, String notOkMessage, String repositoryPath,
			String confidentialityModelPath, String codeBasePackageName, String javaModelPath, String codeQLModelPath,
			String correspondenceModelPath, String codeQLQueryFolderPath, String policyStyle,
			String accessAnalysisCodeQLCorrespondenceModelPath) {
		super(okMessage, notOkMessage, policyStyle);
		this.repositoryPath = repositoryPath;
		this.confidentialityModelPath = confidentialityModelPath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.codeQLModelPath = codeQLModelPath;
		this.correspondenceModelPath = correspondenceModelPath;
		this.codeQLQueryFolderPath = codeQLQueryFolderPath;		
		this.accessAnalysisCodeQLCorrespondenceModelPath = accessAnalysisCodeQLCorrespondenceModelPath;
	}
}
