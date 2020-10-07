import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import javax.naming.Context;
import java.io.IOException;

public class AirraceMapper extends Mapper<LongWritable, Text, LongWritable , Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] values = value.toString().replaceAll("\"\"" , "" ).split(DATA_SEPARATOR);
        if ()
    }
}
