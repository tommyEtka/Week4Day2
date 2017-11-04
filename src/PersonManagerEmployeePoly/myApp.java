package PersonManagerEmployeePoly;


public class myApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person [] myList = new Person[3];
		myList[0] = new Person("John", "Paul");
		myList[1] = new Employee("Steve", "Jobs", "CEO");
		myList[2] = new Manager("Tim", "Cook", "Super CEO", 1000);

		for (int i = 0; i < myList.length; i++) {
			myList[i].printName();
		System.out.println(myList[i].getClass().getName());
		//finds out the package and the class it's in, this is what type of classes you have
		System.out.println(myList.getClass().getName());
		}

}}
