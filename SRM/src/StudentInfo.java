
public class StudentInfo {
	private String studName;
	private int studID;
	private String studPhone;
	private String email;
	
	public StudentInfo(String studName, int studID, String studPhone, String email) {
		super();
		this.studName = studName;
		this.studID = studID;
		this.studPhone = studPhone;
		this.email = email;
	}
	

	public void displayInfo(){
		System.out.println("Student Name: "+studName);
		System.out.println("Student ID: "+studID);
		System.out.println("Student Contact: "+studPhone);
		System.out.println("Student Email: "+email);
		
	}
}
