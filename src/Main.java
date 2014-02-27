import java.util.ArrayList;
import java.util.Iterator;


public class Main {
private ArrayList<Student> students= new ArrayList<Student>();
private ArrayList<Team> teams= new ArrayList<Team>();
	public Main() {
		//ADD YOURSELF HERE with your Name, github email, and github username
		Student sean = new Student("Sean Grano", "seangrano@yahoo.com", "SeanGrano");
		sean.canNotMeet(Day.FRIDAY);
		sean.canNotMeet(Day.MONDAY);
		sean.preferTimeToMeet(Time.NIGHT); // Choose Day/Night/Either
		addStudent(sean);
		
		//Add yourself below here, Do not delete other Users
		
	
		
		
		
		
		//finish add 
		printAllStudents();
	}

	public static void main(String[] args) {
      new Main();
	}
	
	private void addStudent(Student s){
		students.add(s);		
	}
	private void addStudentToTeam(Student s, int team){
		teams.get(team).addStudent(s);
	}

	private void printAllStudents(){
		Iterator<Student> i=students.iterator();
		while(i.hasNext()){
			i.next().printInfo();
		}
	}
}
