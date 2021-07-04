package personalPracticeProblems;

import java.util.Comparator;

public class SortCustom implements Comparator<ScoreNew> {

	@Override
	public int compare(ScoreNew a, ScoreNew b) {
		if (a.score==b.score)
		{
			if (a.name.equals(b.name))
			{
				return a.id-b.id;
			}else
			{
				return a.name.compareTo(b.name);
			}
		}else{
		if(b.score-a.score>0)
		{
			return 1;
		}else
		{
			return -1;
		}
		}
	}


}
