public class Scholarship {

	public static void main(String[] args) {
		double gpa = 3.8;
		int extracurriculars = 4;
		int serviceHours = 60;
		int scholarshipLevel = 0;
				
		if (gpa < 3.8) {
		    scholarshipLevel = 0;
		} else {
		    scholarshipLevel = 1;
		    if (extracurriculars >= 2) {
		        scholarshipLevel += 1;
		    } 
		    if (serviceHours >= 50) {
		        scholarshipLevel += 1;
		    }
		}
		System.out.println(scholarshipLevel);
	}

}
