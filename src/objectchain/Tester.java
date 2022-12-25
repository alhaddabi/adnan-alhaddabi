package objectchain;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		boolean p = true ;
		boolean pp = true ;
		boolean ppp = true ;

		ArrayList<Department> departmentA = new ArrayList<Department>();
		Scanner sc = new Scanner(System.in);
		School school1 = new School();
		System.out.println("welcome to object chaining system");
		System.out.println("Please Enter School Name : ");
		school1.setName(sc.nextLine());
		System.out.println("Please Enter School ID : ");
		school1.setId(sc.nextInt());
		while(p) {
	
			Department dep = new Department();
			System.out.println("Please Enter Department Name : ");
			dep.setName(sc.next());
			System.out.println("Please Enter Department size : ");
			dep.setdSize(sc.nextInt());
			System.out.println("Please Enter Department location : ");
			dep.setLocation(sc.next());
			while(pp) {
				
				Teacher t = new Teacher();
				System.out.println("Please Enter Teacher name : ");
				t.setName(sc.next());
				System.out.println("Please Enter Teacher ID : ");
				t.setId(sc.nextInt());
				while(ppp) {
					Student st = new Student();
					System.out.println("Please Enter Student name : ");
					st.setName(sc.next());
					System.out.println("Please Enter Student ID : ");
					st.setId(sc.nextInt());
					System.out.println("Please Enter Course name : ");
					st.course1.setName(sc.next());
					System.out.println("Please Enter Course Type : ");
					st.course1.setType(sc.next());
					System.out.println("Please Enter math Mark : ");
					st.course1.markCourse.setMathMark(sc.nextInt());
					System.out.println("Please Enter physics Mark : ");
					st.course1.markCourse.setPhysics(sc.nextInt());
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
//			departmentA.add(dep);
//			System.out.println("Do you want to addd new department??? yes / no :");
//			String newdepartment = sc.next();
//			if (newdepartment.equals("yes"))
//			{
//				
//			}
//			else if (newdepartment.equals("no"))
//					{
//				         p = false ;
//					}
				

				System.out.println("=========== School Details ============");
				System.out.println(">> School name is :" + school1.getName());
		     	System.out.println(">> School id is :" + school1.getId());
				      for( Department department :departmentA) {
					System.out.println("============= Department name is " + department.getName()+" ============");
					System.out.println("============= Department Size is " + department.getdSize());
					
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
			sc.close();
		}
		
}
