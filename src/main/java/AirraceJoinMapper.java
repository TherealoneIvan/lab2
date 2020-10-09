import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import javax.naming.Context;
import java.io.IOException;

public class AirraceJoinMapper extends Mapper<LongWritable, Text, KeyValueWritableComparable , Text> {

    @Override
    protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        String lines = value.toString();
        String[] airracesInfo = lines.split("\n");
        for (String races : airracesInfo){
            String[] oneRaceInfo = races.split(",");
            String isCanceld =  oneRaceInfo[19];
            String isDelay = oneRaceInfo[17];
            if (!isDelay.equals("0") && !isCanceld.equals("1") && !isDelay.equals("")
                    && !isCanceld.equals("")){
                int airoportID = 
                String airoportId = oneRaceInfo[14];
                context.write(new KeyValueWritableComparable(airoportId
                                , new Text("1")) , new Text(isDelay));
            }
        }
    }
}
