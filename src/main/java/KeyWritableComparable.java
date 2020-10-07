import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class KeyWritableComparable implements WritableComparable {
    private int airportKey = 0;
    private int airraceKey = 1;

    public  int getAirportKey() {
        return airportKey;
    }

    public int getAirraceKey() {
        return airraceKey;
    }
//    @Override
    public int compareTo(KeyWritableComparable o) {
        int thisAiroportKey = this.airportKey;
        int thisAirraceKey = this.airraceKey;
        return (thisAiroportKey >= o.airportKey ? -1 : (thisAirraceKey > o.airraceKey ? 0 : 1));
//        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(airportKey);
        out.writeInt(airraceKey);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        airportKey = in.readInt();
        airraceKey = in.readInt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyWritableComparable that = (KeyWritableComparable) o;
        return airportKey == that.airportKey &&
                airraceKey == that.airraceKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportKey, airraceKey);
    }
}
