import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class KeyWritableComparable implements WritableComparable {
    private static final int airportKey = 0;
    private static final int airraceKey = 1;
    @Override
    public int compareTo(Object o) {
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
