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
        String isCanceld = oneRaceInfo[19];
        String isDelay = oneRaceInfo[17];
        if (!isDelay.equals("0") && !isCanceld.equals("1") && !isDelay.equals("")
                && !isCanceld.equals("")) {
            if (!oneRaceInfo[14].equals("DEST_AIRPORT_ID")) {
                int airoportID = Integer.parseInt(oneRaceInfo[14]);
//                int delayTime = .parseInt(isDelay);
                context.write(new KeyValueWritableComparable( 1 , airoportID ), new Text(isDelay));
            }
        }
    }
}
