import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportJoinMapper extends Mapper<LongWritable, Text, KeyValueWritableComparable , Text> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString().replace("\"" , "");
        String[] airraces = line.split(",");
        for (int i = 1 ; i < airraces.length; i++) {
            String [] parsecLine = airraces[i].split(",");
            int airaceID = Integer.parseInt(parsecLine[0]);
            context.write(new KeyValueWritableComparable(airaceID ,
                            1) , new Text(airraces[1]));
        }
    }
}
