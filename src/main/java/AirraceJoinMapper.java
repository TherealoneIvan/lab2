import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import javax.naming.Context;
import java.io.IOException;

public class AirraceJoinMapper extends Mapper<LongWritable, Text, KeyValueWritableComparable , Text> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] oneRaceInfo = line.split(",");
        String isCanceld = oneRaceInfo[19];
        String isDelay = oneRaceInfo[17];
        if (!isDelay.equals("0") && !isCanceld.equals("1") && !isDelay.equals("")
                && !isCanceld.equals("")) {
            int airoportID = Integer.parseInt(oneRaceInfo[14]);
            int delayTime = Integer.parseInt(isDelay);
            context.write(new KeyValueWritableComparable(airoportID, 1), new Text(isDelay));
        }
    }
}
