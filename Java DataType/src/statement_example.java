
import java.util.Scanner;

public class statement_example {
	
	private String coursename; //name of the course this "statement_example" class represent
								//instance variable
		public statement_example (String name){//constructor initialize "CourseName"
			coursename = name; //initialize "CourseName" //constructor for courseName
		} //end of constructor
		
		public void setCourseName(String name){ //method to set the coursename
			coursename = name; //store the coursename
		} //end of setCourseName
		
		public String getCourseName(){ //method to retrieve the coursename
			return coursename;
		} //end method getCourseName
		
		public void dispalyMessage(){ //display a welcome message for this program users
			System.out.printf("welcome to coursename for \n%s\n\n", getCourseName());
			//getCourseName get the name of course
		}//end of method displayMessage
		
		public void averageGrade(){//determine average grade
			Scanner input = new Scanner (System.in);//create a scanner object
			
			int total;//sum of grade
			int grade;//grade value
			int gradeCount;//number of grade entered
			double average;//number of decimel(floating point) for average
			
			//initialization start
			total = 0;//total initialize
			gradeCount = 0;//initialize loop count
			
			//processing start
			System.out.print("enter grade or -1 to quit");//prompt for input
			grade = input.nextInt();// and read from user
			
			while (grade != -1){//loop until sentinel value read from user
				
				total = total+grade;//add grade to total
				gradeCount = gradeCount +1;//increment counter
				
				//prompt for input and read next grade from user
				System.out.println("enter grade or -1 to quit");
				grade = input.nextInt();
			}//end while
			
			if (gradeCount !=0){  //termination phase if user entered at least one grade... 
				average = (double) total / gradeCount;//calculate average of all grade entered 
			
				//display total and average (with two digits of precision)
				System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCount, total);
			
				System.out.printf("class average is %.2f\n", average);
			}//end if
			
			else //no grade were entered, so output appropriate message
				System.out.println("no grade were entered");
			}
		}
	


