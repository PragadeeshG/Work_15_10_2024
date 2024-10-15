package com.test1;

public class AmbiguousResolutionException {
	private Integer beanConfigFileName;
	private Integer beanConfigPassword;
	private String singletonBeans;
	private Integer proxyBeans;
	private String mainCert;
	private String certType;
	private String trustoreType;
	private String staticSync;
	private String isSerializable;
	private String isImmutable;
	private String remarks;

	public AmbiguousResolutionException() {

	}

	public AmbiguousResolutionException(Integer beanConfigFileName, Integer beanConfigPassword, String singletonBeans,
			Integer proxyBeans, String mainCert, String certType, String trustoreType, String staticSync,
			String isSerializable, String isImmutable, String remarks) {
		super();
		this.beanConfigFileName = beanConfigFileName;
		this.beanConfigPassword = beanConfigPassword;
		this.singletonBeans = singletonBeans;
		this.proxyBeans = proxyBeans;
		this.mainCert = mainCert;
		this.certType = certType;
		this.trustoreType = trustoreType;
		this.staticSync = staticSync;
		this.isSerializable = isSerializable;
		this.isImmutable = isImmutable;
		this.remarks = remarks;
	}

	public Integer getBeanConfigFileName() {
		return beanConfigFileName;
	}

	public void setBeanConfigFileName(Integer beanConfigFileName) {
		this.beanConfigFileName = beanConfigFileName;
	}

	public Integer getBeanConfigPassword() {
		return beanConfigPassword;
	}

	public void setBeanConfigPassword(Integer beanConfigPassword) {
		this.beanConfigPassword = beanConfigPassword;
	}

	public String getSingletonBeans() {
		return singletonBeans;
	}

	public void setSingletonBeans(String singletonBeans) {
		this.singletonBeans = singletonBeans;
	}

	public Integer getProxyBeans() {
		return proxyBeans;
	}

	public void setProxyBeans(Integer proxyBeans) {
		this.proxyBeans = proxyBeans;
	}

	public String getMainCert() {
		return mainCert;
	}

	public void setMainCert(String mainCert) {
		this.mainCert = mainCert;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getTrustoreType() {
		return trustoreType;
	}

	public void setTrustoreType(String trustoreType) {
		this.trustoreType = trustoreType;
	}

	public String getStaticSync() {
		return staticSync;
	}

	public void setStaticSync(String staticSync) {
		this.staticSync = staticSync;
	}

	public String getIsSerializable() {
		return isSerializable;
	}

	public void setIsSerializable(String isSerializable) {
		this.isSerializable = isSerializable;
	}

	public String getIsImmutable() {
		return isImmutable;
	}

	public void setIsImmutable(String isImmutable) {
		this.isImmutable = isImmutable;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
