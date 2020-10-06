import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirraceWritable implements Writable {
    private IntWritable code;
    private Text airoport_name;
    public AirraceWritable(){
        code = new IntWritable(0);
        airoport_name = new Text("");
    }
    public AirraceWritable(IntWritable code , Text airoport_name){
        this.code = code;
        this.airoport_name = airoport_name;
    }


    @Override
    public void write(DataOutput out) throws IOException {
        code.write(out);
        airoport_name.write(out);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        code.readFields(in);
        airoport_name.readFields(in);
    }
}
