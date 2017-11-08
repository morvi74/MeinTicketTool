package application;

public class IMAssToMyGrp {
	
	private String tsLoaded;
	private String imNumber;
	private String title;
	private String masterChild;
	private String status;
	private String type;
	private String reportedCI;
	private String layer1;
	private int prio;
	private String impact;
	private String assignmentGroup;
	private String assignedTo;
	private String company;
	private String startTime;
	private String lastUpdateTime;
	
	public IMAssToMyGrp (String _tsLoaded, String _imNumber, String _title, String _masterChild,
			String _status, String _type, String _reportedCI, String _layer1, int _prio, 
			String _impact, String _assingmentGroup, String _assignedTo, String _company, 
			String _startTime, String _lastUpdateTime) {
		
		this.setTsLoaded(_tsLoaded);
		this.setImNumber(_imNumber);
		this.setTitle(_title);
		this.setMasterChild(_masterChild);
		this.setStatus(_status);
		this.setType(_type);
		this.setReportedCI(_reportedCI);
		this.setLayer1(_layer1);
		this.setPrio(_prio);
		this.setImpact(_impact);
		this.setAssignmentGroup(_assingmentGroup);
		this.setAssignedTo(_assignedTo);
		this.setCompany(_company);
		this.setStartTime(_startTime);
		this.setLastUpdateTime(_lastUpdateTime);
	}
	
	public IMAssToMyGrp() {
		// TODO Auto-generated constructor stub
	}

	public String getTsLoaded() {
		return tsLoaded;
	}

	public void setTsLoaded(String tsLoaded) {
		this.tsLoaded = tsLoaded;
	}

	public String getImNumber() {
		return imNumber;
	}

	public void setImNumber(String imNumber) {
		this.imNumber = imNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMasterChild() {
		return masterChild;
	}

	public void setMasterChild(String masterChild) {
		this.masterChild = masterChild;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
	
	public String getReportedCI() {
		return reportedCI;
	}

	public void setReportedCI(String reportedCI) {
		this.reportedCI = reportedCI;
	}

	public String getLayer1() {
		return layer1;
	}

	public void setLayer1(String layer1) {
		this.layer1 = layer1;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getAssignmentGroup() {
		return assignmentGroup;
	}

	public void setAssignmentGroup(String assignmentGroup) {
		this.assignmentGroup = assignmentGroup;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}
