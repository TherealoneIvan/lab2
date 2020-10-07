import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class KeyWritableComparable implements WritableComparable {
    private int airportKey = 0;
    private int airraceKey = 1;

    public  int getAirportKey() {
        return airportKey;
    }

    public int getAirraceKey() {
        return airraceKey;
    }

    @Override
    public int compareTo(KeyWritableComparable o) {
        int thisAiroportKey = this.airportKey;
        int thisAirraceKey = this.airraceKey;
        if (this.airportKey == o.airportKey){
            return (this.airraceKey > o.airraceKey ? -1 
        }
        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(airportKey);
        out.writeInt(airraceKey);
    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}
