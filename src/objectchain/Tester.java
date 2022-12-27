package objectchain;
import java.io.*;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	//every time the user select "yes to enter a new value it will repet all the while loop in the program "

	public static void main(String[] args) {
		
	// changing the integer to a string and add them together 
		System.out.println("===========adding integer and string================");
		int num1 = 5;
	    int num2 = 6;
		Integer totalsum = num1 + num2 ;
		String e = Integer.toString(totalsum);
		
		
		String name= "adnan " + totalsum ;
		System.out.println("the name and number is "+name);
		
	    System.out.println("===================================================\n\n");
		
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////////			
		boolean p = true ;
		boolean pp = true ;
		boolean ppp = true ;
		boolean i = true ;
		
		

       // this project having object chain and the for each together
        Scanner sc = new Scanner(System.in);
		ArrayList<Department> departmentA = new ArrayList<Department>();
        Stack<String> historylist = new Stack<>();
		while(i) {
		School school1 = new School();
		System.out.println("============shcool program================");
		System.out.println("welcome to object chaining system");
		System.out.println("Select 1 to Enter the program");
		System.out.println("Select 2 to exit from the program ");
		System.out.println("Select 3 to get the History and to get a .txt file");
		System.out.println("Select 4 to have fixed constractor ");
		System.out.println("Select 5 to have constractor Enterd by the user");


		// this while loop will keep repating  every time the user choose to enter a new value for department
		int select = sc.nextInt();
		String selectt = Integer.toString(select);
		historylist.push(selectt);
		if (select == 1) {
		System.out.println("Please Enter School Name : ");
		school1.setName(sc.nextLine());
		System.out.println("Please Enter School ID : ");
		school1.setId(sc.nextInt());
		while(p) {
	
			Department dep = new Department();
			System.out.println("Please Enter Department Name : ");
			String depname = sc.next();
			dep.setName(depname);
			historylist.push(depname);
			System.out.println("Please Enter Department size : ");
			// the down code I have done casting to push the input into the Stack after that i get it back as History list 
			int depsize = sc.nextInt();
			String depsizee = Integer.toString(depsize);
			historylist.push(depsizee);
			dep.setdSize(depsize);
			// the upper code I have done casting to push the input into the Stack after that i get it back as History list
			System.out.println("Please Enter Department location : ");
			// this will keep repating every time the user will choose to enter a new value for teacher
			dep.setLocation(sc.next());
			while(pp) {
				// this while will keep repating every time the user choose to enter a new value for student 
				Teacher t = new Teacher();
				System.out.println("Please Enter Teacher name : ");
				String teachername = sc.next();
				t.setName(teachername);
				historylist.push(teachername);
				System.out.println("Please Enter Teacher ID : ");
				int teacherid = sc.nextInt();
				t.setId(teacherid);
				String teacheridd = Integer.toString(teacherid);
				historylist.push(teacheridd);
				while(ppp) {
					Student st = new Student();
					System.out.println("Please Enter Student name : ");
					String studentname = sc.next();
					st.setName(studentname);
					historylist.push(studentname);
					System.out.println("Please Enter Student ID : ");
				    int studentid = sc.nextInt();
				    String studentidd = Integer.toString(studentid);
					st.setId(studentid);
					historylist.push(studentidd);
					System.out.println("Please Enter Course name : ");
					String coursename = sc.next();
					st.course1.setName(coursename);
					historylist.push(coursename);
					System.out.println("Please Enter Course Type : ");
					String coursetype = sc.next();
					st.course1.setType(coursetype);
					historylist.push(coursetype);
					System.out.println("Please Enter math Mark : ");
					int mathmark = sc.nextInt();
					String mathmarkk = Integer.toString(mathmark);
					st.course1.markCourse.setMathMark(mathmark);
					historylist.push(mathmarkk);
					System.out.println("Please Enter physics Mark : ");
					int phy = sc.nextInt();
					String phyy = Integer.toString(phy);
					st.course1.markCourse.setPhysics(phy);
					historylist.push(phyy);
					
					
					
					
					
					t.studentList.add(st);
					System.out.println("Do You want another Student?? yes / no ");
					String newstudent = sc.next();
					if (newstudent.equals("yes"))
					{
						
					}
					else if (newstudent.equals("no"))
					{
						ppp = false ;
					}
				}
				dep.teacherList.add(t);
				
				System.out.println("Do You want another Teacher??? yes / no ");
				String newteacher = sc.next();
				if (newteacher.equals("yes"))
				{
					
				}
				else if (newteacher.equals("no"))
				{
					pp = false;
				}
			}
			departmentA.add(dep);
			System.out.println("Do you want to addd new department??? yes / no :");
			String newdepartment = sc.next();
			if (newdepartment.equals("yes"))
			{
				
			}
			else if (newdepartment.equals("no"))
					{
				         p = false ;
					}
				
                // the for each 
			else if (select == 8) 
				System.out.println("=========== School Details ============");
				System.out.println(">> School name is :" + school1.getName());
		     	System.out.println(">> School id is :" + school1.getId());
				      for( Department department :departmentA) {
				    	  System.out.println("================== department Details =====================");
					System.out.println("Department name is " + department.getName());
					System.out.println("Department Size is " + department.getdSize());
					
					for(Teacher t : department.teacherList) {
						System.out.println("================== Teacher Details =====================");
						System.out.println(">> Teacher name is : " + t.getName());
						System.out.println(">> Teacher id is : :" + t.getId());
						System.out.println("================== Student List =====================");
						       for(Student s : t.studentList) {
							System.out.println("================== Student Details =====================");
							System.out.println(">> Student name is : " + s.getName());
							System.out.println(">> Student id is : :" + s.getId());
							System.out.println(">> Course name is : " + s.course1.getName());
							System.out.println(">> Course type is : :" + s.course1.getType());
							System.out.println(">> mathMark is : " + s.course1.markCourse.getMathMark());
							System.out.println(">> physics mark is : :" + s.course1.markCourse.getPhysics());
						}
					
					}
					
					
				}
				

			
		}
			
        }
		else if (select == 3)
		{
			System.out.println("the input history is ");
			for (String v : historylist)
			{
				System.out.println(v);
			}
			
			try {
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
				writer.write("\nthis is your history list ");
				for (String v : historylist) {
					writer.write("\n"+v);
				}
				writer.close();
				}catch (IOException o) {
					o.printStackTrace();
				}
			
			
		}
		else if (select ==2 ) 
		{
			i = false ;
			System.out.println("the program is closed");
		}
		else if (select == 4)
		{

			System.out.println("=======constractor==============");
			Farm f = new Farm(" majid ","hisham ","adnan"); 
			
			System.out.println("============constractor program================");
		}
		else if (select == 5)
		{
			// constructer with user input 
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter the Animal name");
			String animal=sr.next();
			System.out.println("Enter the Animal age");
			int animalage=sr.nextInt();
		    Animal o = new Animal(animal,animalage);
		    System.out.println("===================================================\n\n");
		}
		else if (select == 6)
		{
			
			
		}
		}
		sc.close();
    
}
}
