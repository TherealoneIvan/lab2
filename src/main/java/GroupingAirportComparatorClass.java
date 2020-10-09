import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class GroupingAirportComparatorClass extends RawComparator {
    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        KeyValueWritableComparable airportFirstPair = (KeyValueWritableComparable) a;
        KeyValueWritableComparable airportSecondPair = (KeyValueWritableComparable) b;
        return airportFirstPair.getAirportID().compareTo(airportSecondPair.getAirportID());
    }
}