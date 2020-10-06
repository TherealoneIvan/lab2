import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AiroportWritable implements Writable {
    private IntWritable year , quarter , month , day_of_month , day_of_week , fl_num,
            origin_airoport_id , orig_airpor_seq_id , origin_cyti_id , dest_airoprt_id,
            cancelled_code;
    private Text fl_date , uniq_carrier , airlane_id , carrier , tail_num , wheels_on ,
            airr_time;
    private DoubleWritable arr_delay , arr_delay_new , cancelled , air_time , distance;

    public AiroportWritable(IntWritable year, IntWritable quarter, IntWritable month, IntWritable day_of_month, IntWritable day_of_week,
                            IntWritable fl_num, IntWritable origin_airoport_id, IntWritable orig_airpor_seq_id, IntWritable origin_cyti_id,
                            IntWritable dest_airoprt_id, IntWritable cancelled_code, Text fl_date, Text uniq_carrier, Text airlane_id, Text carrier,
                            Text tail_num, Text wheels_on, Text airr_time, DoubleWritable arr_delay, DoubleWritable arr_delay_new, DoubleWritable cancelled,
                            DoubleWritable air_time, DoubleWritable distance) {
        this.year = year;
        this.quarter = quarter;
        this.month = month;
        this.day_of_month = day_of_month;
        this.day_of_week = day_of_week;
        this.fl_num = fl_num;
        this.origin_airoport_id = origin_airoport_id;
        this.orig_airpor_seq_id = orig_airpor_seq_id;
        this.origin_cyti_id = origin_cyti_id;
        this.dest_airoprt_id = dest_airoprt_id;
        this.cancelled_code = cancelled_code;
        this.fl_date = fl_date;
        this.uniq_carrier = uniq_carrier;
        this.airlane_id = airlane_id;
        this.carrier = carrier;
        this.tail_num = tail_num;
        this.wheels_on = wheels_on;
        this.airr_time = airr_time;
        this.arr_delay = arr_delay;
        this.arr_delay_new = arr_delay_new;
        this.cancelled = cancelled;
        this.air_time = air_time;
        this.distance = distance;
    }

    
    @Override
    public void write(DataOutput out) throws IOException {

    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}
