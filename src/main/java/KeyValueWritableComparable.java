import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class KeyValueWritableComparable implements WritableComparable<KeyValueWritableComparable> {
    private int airportPartitionerKey;
    private Text airportID;

    public  int getAirportPartitionerKey() {
        return airportPartitionerKey;
    }

    public int getAirraceKey() {
        return airportID;
    }
//    @Override
    public int compareTo(KeyValueWritableComparable o) {
        if (this.airportID > o.airportID)
            return 1;
        if (this.airportID == o.airportID){
            return(this.airportPartitionerKey > o.airportPartitionerKey ? 1 : 0);
        }
        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(airportPartitionerKey);
        out.writeInt(airportID);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        airportPartitionerKey = in.readInt();
        airportID = in.readInt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyValueWritableComparable that = (KeyValueWritableComparable) o;
        return airportPartitionerKey == that.airportPartitionerKey &&
                airportID == that.airportID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportPartitionerKey, airportID);
    }
}
