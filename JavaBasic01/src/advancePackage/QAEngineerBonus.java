package advancePackage;

public class QAEngineerBonus extends Employee {
	
	int bonus = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QAEngineerBonus qb = new QAEngineerBonus();
		System.out.println("QA Engineer's salary: " + qb.salary);
		System.out.println("QA Engineer's bonus: " + qb.bonus);

	}

}
