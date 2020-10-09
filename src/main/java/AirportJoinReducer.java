import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportJoinReducer extends Reducer<KeyValueWritableComparable , Text, Text ,Text> {
    @Override
    protected void reduce(KeyValueWritableComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
//        Text airraceInfo = new Text(iter.next());
        while (iter.hasNext()){
            Text airraceDelay = iter.next();
            context.write(new Text(String.valueOf(key.getAirportID())) , airraceDelay);
        }
    }

}
