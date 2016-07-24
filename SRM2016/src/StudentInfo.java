
public class StudentInfo {
	private String studName;
	private int studID;
	private String studPhone;
	private String studEmail;
	
	public StudentInfo(String studName, int studID, String studPhone, String studEmail) {
		super();
		this.studName = studName;
		this.studID = studID;
		this.studPhone = studPhone;
		this.studEmail = studEmail;
	}
	
	public void displayInfo(){
		System.out.println("Student Name: "+studName);
		System.out.println("Student ID: "+studID);
		System.out.println("Student Contact: "+studPhone);
		System.out.println("Student Email: "+studEmail);
		
	}
}
