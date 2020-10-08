import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportJoinPartitioner extends Partitioner<Text, Text> {
    public AirportJoinPartitioner() {
        super();
    }

    @Override
    public int getPartition(Text text, Text text2, int numPartitions) {
        return 0;
    }
}
