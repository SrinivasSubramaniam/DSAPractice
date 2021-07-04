package personalPracticeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class P53_SortingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ScoreNew> ar=new ArrayList<ScoreNew>();
		ar.add(new ScoreNew(33,"Rumpa",3.68));
		ar.add(new ScoreNew(85,"Ashis",3.85));
		ar.add(new ScoreNew(56,"Samiha",3.75));
		ar.add(new ScoreNew(19,"Samiha",3.75));
		ar.add(new ScoreNew(22,"Fahim",3.76));
		
		Collections.sort(ar,new SortCustom());
		for (ScoreNew scoreNew : ar) {
			System.out.println(scoreNew);
		}
		System.out.println(ar.get(0).getId());
	}

}
