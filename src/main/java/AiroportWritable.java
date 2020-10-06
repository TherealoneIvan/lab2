import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportWritable implements Writable {
    private IntWritable year , quarter , month , day_of_month , day_of_week , fl_num,
            origin_airoport_id , orig_airpor_seq_id , origin_cyti_id , dest_airoprt_id,
            ;
    private Text fl_date , uniq_carrier , airlane_id , carrier , tail_num , wheels_on ,
            airr_time , 

    @Override
    public void write(DataOutput out) throws IOException {

    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}
