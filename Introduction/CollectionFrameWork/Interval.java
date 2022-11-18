package CollectionFrameWork;
import java.util.*;

//Interview question 
// we are given non overlapping intervals and sorted according to start time
// insert a new interval merge if necessary
public class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        if(intervals == null) 
        {
            intervals = new ArrayList<Interval>();
            intervals.add(newInterval);
            return intervals;
        }
        else if(intervals.size() == 0) 
        {
            intervals.add(newInterval);
            return intervals;
        }
        
        Interval toInsert = newInterval;
        int i;
        for(i = 0; i < intervals.size(); i++)
        {
            Interval current = intervals.get(i);
            if(current.end < toInsert.start) 
            {
                i++;
                continue;
            }
            else if(current.start > toInsert.end) {
                intervals.add(i,toInsert);
                break;
            }
            else {
                toInsert.start = Math.min(toInsert.start,current.start);
                toInsert.end = Math.max(toInsert.end, current.end);
                intervals.remove(i);

            }
            
        }

        if(i == intervals.size()){
            intervals.add(toInsert);
        }

        return intervals;
    }
}