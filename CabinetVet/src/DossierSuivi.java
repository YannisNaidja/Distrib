
public class DossierSuivi implements DossierSuiviInt {
	
	String Description;
	
	public DossierSuivi(String d) {
		this.Description = d;
	}
	 public String getDesc() {
		return this.Description;
	}
	void setDesc(String s) {
		this.Description = s;		
	}
	@Override
	public void setDesc() {
		// TODO Auto-generated method stub
		
	}

}
