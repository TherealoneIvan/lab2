import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class GroupingAirportComparatorClass extends WritableComparator {
    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        KeyValueWritableComparable airportFirstPair = (KeyValueWritableComparable) a;
        KeyValueWritableComparable airportSecondPair = (KeyValueWritableComparable) b;
        return airportFirstPair.compareTo(airportSecondPair);
    }
}