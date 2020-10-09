import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class KeyValueWritableComparable implements WritableComparable<KeyValueWritableComparable> {
    private int airportPartitionerKey;
    private int airportID;
//    public KeyValueWritableComparable(){
//        airportPartitionerKey = new Text();
//        airportID = new Text();
//    }
//    public KeyValueWritableComparable(Text airportPartitionerKey , Text airportID) {
//        this.airportPartitionerKey = airportPartitionerKey;
//        this.airportID = airportID;
//    }

    public int getAirportPartitionerKey() {
        return airportPartitionerKey;
    }
    public int getAirportID() {
        return airportID;
    }
    @Override
    public int compareTo(KeyValueWritableComparable o) {
        if (this.airportPartitionerKey > o.airportPartitionerKey)
            return 1;
        if (this.airportPartitionerKey == o.airportPartitionerKey) {
            if (this.airportID > o.airportID)
                return 1;
        }
        return -1;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out
        airportID.write(out);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        airportPartitionerKey.readFields(in);
        airportID.readFields(in);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyValueWritableComparable that = (KeyValueWritableComparable) o;
        return Objects.equals(airportPartitionerKey, that.airportPartitionerKey) &&
                Objects.equals(airportID, that.airportID);
    }

    @Override
    public String toString() {
        return "KeyValueWritableComparable{" +
                "airportPartitionerKey='" + airportPartitionerKey + '\'' +
                ", airportID='" + airportID + '\'' +
                '}';
    }
    public int compare(KeyValueWritableComparable a , KeyValueWritableComparable b){
        return a.compareTo(b);
    }
    @Override
    public int hashCode() {
        return Objects.hash(airportPartitionerKey, airportID);
    }
}
