import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class AirportJoinReducer extends Reducer<GroupingAirportComparatorClass , Text, Text ,Text> {
    public AirportJoinReducer() {
        super();
    }
}
