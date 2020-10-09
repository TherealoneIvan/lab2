import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportJoinMapper extends Mapper<Text, Text, KeyValueWritableComparable , Text> {
    protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        String line = value.toString();
//        23
        String[] airraces = line.split(",");
        for (int i = 1 ; i < airraces.length ; i+=2) {
            context.write(new KeyValueWritableComparable(airraces[i - 1] , "1") ,
                    new Text(airraces[i]));
        }
    }
}
