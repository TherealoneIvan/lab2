import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class KeyValueWritableComparable implements WritableComparable<KeyValueWritableComparable> {
    private Text airportPartitionerKey;
    private Text airportID;
    public KeyValueWritableComparable(){
        airportPartitionerKey = new Text();
        airportID = new Text();
    }
    public KeyValueWritableComparable(Text airportPartitionerKey , Text airportID) {
        this.airportPartitionerKey = airportPartitionerKey;
        this.airportID = airportID;
    }

    public Text getAirportPartitionerKey() {
        return airportPartitionerKey;
    }
    public Text getAirportID() {
        return airportID;
    }
    @Override
    public int compareTo(KeyValueWritableComparable o) {
        if (this.airportID.compareTo(o.airportID) == 1)
            return 1;
        if (this.airportID.compareTo(o.airportID) == 0){
            return(this.airportPartitionerKey.compareTo(o.airportPartitionerKey));
        }
        return -1;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        airportPartitionerKey.write(out);
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
        
    }
    @Override
    public int hashCode() {
        return Objects.hash(airportPartitionerKey, airportID);
    }
}
