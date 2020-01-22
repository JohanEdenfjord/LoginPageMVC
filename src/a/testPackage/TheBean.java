package a.testPackage;

public class TheBean {
	private String password, uname;
	
	private String[] users = {"johan","admin"};
	private String[] passes = {"johan","admin"};
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getUname() {
		return uname;
	}
	
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public boolean validate(){
		for(int i = 0; i < users.length; i++){
				if(uname.equals(users[i])){
					if(password.equals(passes[i])){
					return true;
				}else{
					return false;
				}
			
				}			
		}
		return false;
	}
	
	public void displayUserInformation(){
	
	
	}
	

}	

