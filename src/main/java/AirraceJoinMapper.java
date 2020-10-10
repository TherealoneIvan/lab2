import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import javax.naming.Context;
import java.io.IOException;

public class AirraceJoinMapper extends Mapper<LongWritable, Text, KeyValueWritableComparable , Text> {

    @Override
    protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] oneRaceInfo = line.split(",");
//        String isDelay = oneRaceInfo[17];
        if (key.get() > 0) {
//            int isCanceld = Integer.parseInt(oneRaceInfo[19]);

            if (!oneRaceInfo[14].equals("") && !oneRaceInfo[17].equals("")) {
                int airoportID = Integer.parseInt(oneRaceInfo[14]);
                System.out.println(airoportID);
                double delayTime = Double.parseDouble(oneRaceInfo[17]);
                if (delayTime > 0)
                    context.write(new KeyValueWritableComparable(1, airoportID), new Text(String.valueOf(delayTime)));
            }
        }
    }
}
