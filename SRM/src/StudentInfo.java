
public class StudentInfo {
	private String studName;
	private int studID;
	private String studPhone;
	
	public StudentInfo(String studName, int studID, String studPhone) {
		super();
		this.studName = studName;
		this.studID = studID;
		this.studPhone = studPhone;
	}
	
	public void displayInfo(){
		System.out.println("Student Name: "+studName);
		System.out.println("Student ID: "+studID);
		System.out.println("Student Contact: "+studPhone);
		
	}
}
