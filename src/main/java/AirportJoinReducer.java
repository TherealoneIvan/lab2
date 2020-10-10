import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportJoinReducer extends Reducer<KeyValueWritableComparable , Text, Text ,Text> {
    @Override
    protected void reduce(KeyValueWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text airport = new Text(iter.next());
        Text airraceDelay = iter.next();
        int cnt = 1;
        double delay = Double.parseDouble(String.valueOf(airraceDelay));
        double maxDelay = 0;
        double minDelay = 0;
        while (iter.hasNext()) {
            airraceDelay = iter.next();
            context.write(airport,
                    new Text(airraceInfo.toString() + " " + airraceDelay.toString()));
        }
    }
}
