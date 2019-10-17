package lambdaExpression;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> 
{
	
	@Override
	public int compare(Student first, Student second) 
	{
		
		if(first.rollNo > second.rollNo) 
		{
			return 1;
			
		} else {
		return -1;
	}

}
	
	public int compare2(Student fir, Student sec) {
		
		if(fir.marks > sec.marks) {
			return 1;
		}else {
			return -1;
		}
		
		
	}
}
