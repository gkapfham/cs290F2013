import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TeamAssignment 
{
    static final Map<Integer, String> STUDENTS = new HashMap<Integer, String>() {{
	    put(1, "Ballinger");
	    put(2, "Blake");
	    put(3, "Challener");
	    put(4, "Clive");
	    put(5, "Doughty");
	    put(6, "Graham");
	    put(7, "Hajduk");
	    put(8, "Harkema");
	    put(9, "Jordan");
	    put(10, "Kelly");
	    put(11, "King");
	    put(12, "Kotelyanskii");
	    put(13, "Landgrebe");
	    put(14, "MacMillan");
	    put(15, "Mong");
	    put(16, "Mukherjee");
	    put(17, "Regel");
	    put(18, "Wechter");
	    put(19, "Weisman");
	    put(20, "Weyant");
	}};

    public static void main(String[] args) {

	ArrayList<Integer> students = new ArrayList<Integer>();

	// populate the arraylist with the integers
	for(int i = 1; i <= 20; i++) {
	    Integer I = new Integer(i);
	    students.add(I);
	}

	// pick the ordering for the talks today
	ArrayList<Integer> studentsTodaysOrdering = (ArrayList<Integer>)students.clone();
	Collections.shuffle(studentsTodaysOrdering);
	System.out.println("Today's random ordering of the students: "); // + studentsTodaysOrdering);
	System.out.println();

	for(Integer studentToday : studentsTodaysOrdering) {

	    System.out.println(STUDENTS.get(studentToday));

	}

	System.out.println();

	System.out.println("These are the teams for today's laboratory assignment:");

	int i = 0;
	int team = 1;
	for(Integer studentToday : studentsTodaysOrdering) {

		if(i % 5 == 0) {
		
			System.out.println();
			System.out.println("Team " + team);
			team++;

		}

		System.out.println(STUDENTS.get(studentToday));

		i++;

	}

	}

}
