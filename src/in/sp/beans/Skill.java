package in.sp.beans;

public class Skill {
	String web;
	String cloud;
	String Ai;
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getAi() {
		return Ai;
	}
	public void setAi(String ai) {
		Ai = ai;
	}
	public void display1() {
		System.out.println("web : " +web);
		System.out.println("cloud no : " +cloud);
		System.out.println("Ai :" +Ai);
	}

	

}
