package cdac.java.q5.users;

public class Admin {
	
	public static String adminUId = "admin";
	public static String adminPass = "admin";
	private String adminLoginId;
	private String adminPwd;
	
	public Admin(String adminLoginId, String adminPwd) {
		super();
		this.adminLoginId = adminLoginId;
		this.adminPwd = adminPwd;
	}
	
	public String getAdminLoginId() {
		return adminLoginId;
	}
	public void setAdminLoginId(String adminLoginId) {
		this.adminLoginId = adminLoginId;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
}
