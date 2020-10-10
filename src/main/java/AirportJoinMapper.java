import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportJoinMapper extends Mapper<LongWritable, Text, KeyValueWritableComparable , Text> {
    protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] airraces = line.split(",");
        if (key.get() > 0) {
            int airaceID = Integer.parseInt(airraces[0]);
            context.write(new KeyValueWritableComparable(airaceID, 0),
                    new Text(airraces[1]));
        }
    }
}
