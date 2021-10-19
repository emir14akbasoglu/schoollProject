package schoollProject;

public class Student extends Person  {
	private  String professionField;
	private  int schollLevel;
	private String studentClass;
	private int schollNumber;
	public Student() {
		super();
	}
	public Student(String professionField, int schollLevel, String studentClass, int schollNumber) {
		super();
		this.professionField = professionField;
		this.schollLevel = schollLevel;
		this.studentClass = studentClass;
		this.schollNumber = schollNumber;
	}
	public String getProfessionField() {
		return professionField;
	}
	public void setProfessionField(String professionField) {
		this.professionField = professionField;
	}
	public int getSchollLevel() {
		return schollLevel;
	}
	public void setSchollLevel(int schollLevel) {
		this.schollLevel = schollLevel;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public int getSchollNumber() {
		return schollNumber;
	}
	public void setSchollNumber(int schollNumber) {
		this.schollNumber = schollNumber;
	}
	

}
