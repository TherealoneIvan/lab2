import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import javax.naming.Context;
import java.io.IOException;

public class AirraceJoinMapper extends Mapper<LongWritable, Text, KeyValueWritableComparable , Text> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString().replace("\"" , "");
        String[] oneRaceInfo = line.split(",");
        String isDelay = oneRaceInfo[17];
        if (key.get() > 0) {
//            int isCanceld = Integer.parseInt(oneRaceInfo[19]);
            if () {
                int airoportID = Integer.parseInt(oneRaceInfo[14]);
                double delayTime = Double.parseDouble(isDelay);
                if (delayTime > 0)
                    context.write(new KeyValueWritableComparable(1, airoportID), new Text(String.valueOf(delayTime)));
            }
        }
    }
}
