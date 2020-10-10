import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportJoinPartitioner extends Partitioner<KeyValueWritableComparable, Text> {
    @Override
    public int getPartition(KeyValueWritableComparable keyValueWritableComparable, Text text, int numReduceTasks) {
        return (keyValueWritableComparable.getAirportID().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}
