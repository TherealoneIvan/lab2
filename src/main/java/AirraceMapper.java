import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

import javax.naming.Context;
import java.io.IOException;

public class AirraceMapper extends Mapper <LongWritable, Text, TextPair , Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

    }
}
