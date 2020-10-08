import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportJoinReducer extends Reducer<GroupingAirportComparatorClass , Text, Text ,Text> {
    @Override
    protected void reduce(GroupingAirportComparatorClass key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text airraceInfo = new Text(iter.next());
        while (iter.hasNext()){
            Text
        }
    }

}
