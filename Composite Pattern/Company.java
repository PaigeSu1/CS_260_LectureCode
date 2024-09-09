// This is the Client class, who is driving all of this design patter
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dev1 = new Developer(100, "Keanu Reeves", "Pro Developer");
        Developer dev2 = new Developer(101, "Arnold Schwarzenegger", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
          
        Manager man1 = new Manager(200, "Emma Watson", "SEO Manager");
        Manager man2 = new Manager(201, "Daniel Radcliffe", "Emma's Manager");
          
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);
      
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
	}

}
