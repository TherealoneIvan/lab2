import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirraceWritable implements Writable {
    private Text airoport_name;
    public AirraceWritable(){
        airoport_name = new Text("");
    }
    public AirraceWritable(Text code , Text airoport_name){
        this.airoport_name = airoport_name;
    }

    public Text getAiroport_name() {
        return airoport_name;
    }

    public void setAiroport_name(Text airoport_name) {
        this.airoport_name = airoport_name;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        airoport_name.write(out);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        airoport_name.readFields(in);
    }
}
