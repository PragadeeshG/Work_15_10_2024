package com.test1;

public class AmbiguousResolutionFixConfig {
	private Integer beanConfigFileName;
	private String filesMatch;
	private String beanResolutionPriority;
	private String beanResolutionGroup;
	private String dependencyLevel2;
	private String dependencyLevel3;
	private String dependencyLevel4;
	private String dependencyLevel5;
	private String proxyBalancer;
	private String proxyPassMatch;
	private String proxyPass;
	private String proxyPassReverse;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AmbiguousResolutionFixConfig() {

	}

	public AmbiguousResolutionFixConfig(Integer beanConfigFileName, String filesMatch, String beanResolutionPriority,
			String beanResolutionGroup, String dependencyLevel2, String dependencyLevel3, String dependencyLevel4,
			String dependencyLevel5, String proxyBalancer, String proxyPassMatch, String proxyPass,
			String proxyPassReverse, String creationDate, String modifiedDate, String entityState) {
		super();
		this.beanConfigFileName = beanConfigFileName;
		this.filesMatch = filesMatch;
		this.beanResolutionPriority = beanResolutionPriority;
		this.beanResolutionGroup = beanResolutionGroup;
		this.dependencyLevel2 = dependencyLevel2;
		this.dependencyLevel3 = dependencyLevel3;
		this.dependencyLevel4 = dependencyLevel4;
		this.dependencyLevel5 = dependencyLevel5;
		this.proxyBalancer = proxyBalancer;
		this.proxyPassMatch = proxyPassMatch;
		this.proxyPass = proxyPass;
		this.proxyPassReverse = proxyPassReverse;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getBeanConfigFileName() {
		return beanConfigFileName;
	}

	public void setBeanConfigFileName(Integer beanConfigFileName) {
		this.beanConfigFileName = beanConfigFileName;
	}

	public String getFilesMatch() {
		return filesMatch;
	}

	public void setFilesMatch(String filesMatch) {
		this.filesMatch = filesMatch;
	}

	public String getBeanResolutionPriority() {
		return beanResolutionPriority;
	}

	public void setBeanResolutionPriority(String beanResolutionPriority) {
		this.beanResolutionPriority = beanResolutionPriority;
	}

	public String getBeanResolutionGroup() {
		return beanResolutionGroup;
	}

	public void setBeanResolutionGroup(String beanResolutionGroup) {
		this.beanResolutionGroup = beanResolutionGroup;
	}

	public String getDependencyLevel2() {
		return dependencyLevel2;
	}

	public void setDependencyLevel2(String dependencyLevel2) {
		this.dependencyLevel2 = dependencyLevel2;
	}

	public String getDependencyLevel3() {
		return dependencyLevel3;
	}

	public void setDependencyLevel3(String dependencyLevel3) {
		this.dependencyLevel3 = dependencyLevel3;
	}

	public String getDependencyLevel4() {
		return dependencyLevel4;
	}

	public void setDependencyLevel4(String dependencyLevel4) {
		this.dependencyLevel4 = dependencyLevel4;
	}

	public String getDependencyLevel5() {
		return dependencyLevel5;
	}

	public void setDependencyLevel5(String dependencyLevel5) {
		this.dependencyLevel5 = dependencyLevel5;
	}

	public String getProxyBalancer() {
		return proxyBalancer;
	}

	public void setProxyBalancer(String proxyBalancer) {
		this.proxyBalancer = proxyBalancer;
	}

	public String getProxyPassMatch() {
		return proxyPassMatch;
	}

	public void setProxyPassMatch(String proxyPassMatch) {
		this.proxyPassMatch = proxyPassMatch;
	}

	public String getProxyPass() {
		return proxyPass;
	}

	public void setProxyPass(String proxyPass) {
		this.proxyPass = proxyPass;
	}

	public String getProxyPassReverse() {
		return proxyPassReverse;
	}

	public void setProxyPassReverse(String proxyPassReverse) {
		this.proxyPassReverse = proxyPassReverse;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
