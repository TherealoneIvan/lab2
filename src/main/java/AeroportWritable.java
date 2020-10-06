import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AeroportWritable implements Writable {
    private IntWritable year , quarter , month , day_of_month , day_of_week , fl_num,
            origin_airoport_id , orig_airpor_seq_id , origin_city_id, dest_airoprt_id,
            cancelled_code;
    private Text fl_date , uniq_carrier , airlane_id , carrier , tail_num , wheels_on ,
            airr_time;
    private DoubleWritable arr_delay , arr_delay_new , cancelled , air_time , distance;

    public AeroportWritable(IntWritable year, IntWritable quarter, IntWritable month, IntWritable day_of_month, IntWritable day_of_week,
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
        this.origin_city_id = origin_cyti_id;
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

    public IntWritable getYear() {
        return year;
    }

    public void setYear(IntWritable year) {
        this.year = year;
    }

    public IntWritable getQuarter() {
        return quarter;
    }

    public void setQuarter(IntWritable quarter) {
        this.quarter = quarter;
    }

    public IntWritable getMonth() {
        return month;
    }

    public void setMonth(IntWritable month) {
        this.month = month;
    }

    public IntWritable getDay_of_month() {
        return day_of_month;
    }

    public void setDay_of_month(IntWritable day_of_month) {
        this.day_of_month = day_of_month;
    }

    public IntWritable getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(IntWritable day_of_week) {
        this.day_of_week = day_of_week;
    }

    public IntWritable getFl_num() {
        return fl_num;
    }

    public void setFl_num(IntWritable fl_num) {
        this.fl_num = fl_num;
    }

    public IntWritable getOrigin_airoport_id() {
        return origin_airoport_id;
    }

    public void setOrigin_airoport_id(IntWritable origin_airoport_id) {
        this.origin_airoport_id = origin_airoport_id;
    }

    public IntWritable getOrig_airpor_seq_id() {
        return orig_airpor_seq_id;
    }

    public void setOrig_airpor_seq_id(IntWritable orig_airpor_seq_id) {
        this.orig_airpor_seq_id = orig_airpor_seq_id;
    }

    public IntWritable getOrigin_city_id() {
        return origin_city_id;
    }

    public void setOrigin_city_id(IntWritable origin_city_id) {
        this.origin_city_id = origin_city_id;
    }

    public IntWritable getDest_airoprt_id() {
        return dest_airoprt_id;
    }

    public void setDest_airoprt_id(IntWritable dest_airoprt_id) {
        this.dest_airoprt_id = dest_airoprt_id;
    }

    public IntWritable getCancelled_code() {
        return cancelled_code;
    }

    public void setCancelled_code(IntWritable cancelled_code) {
        this.cancelled_code = cancelled_code;
    }

    public Text getFl_date() {
        return fl_date;
    }

    public void setFl_date(Text fl_date) {
        this.fl_date = fl_date;
    }

    public Text getUniq_carrier() {
        return uniq_carrier;
    }

    public void setUniq_carrier(Text uniq_carrier) {
        this.uniq_carrier = uniq_carrier;
    }

    public Text getAirlane_id() {
        return airlane_id;
    }

    public void setAirlane_id(Text airlane_id) {
        this.airlane_id = airlane_id;
    }

    public Text getCarrier() {
        return carrier;
    }

    public void setCarrier(Text carrier) {
        this.carrier = carrier;
    }

    public Text getTail_num() {
        return tail_num;
    }

    public void setTail_num(Text tail_num) {
        this.tail_num = tail_num;
    }

    public Text getWheels_on() {
        return wheels_on;
    }

    public void setWheels_on(Text wheels_on) {
        this.wheels_on = wheels_on;
    }

    public Text getAirr_time() {
        return airr_time;
    }

    public void setAirr_time(Text airr_time) {
        this.airr_time = airr_time;
    }

    public DoubleWritable getArr_delay() {
        return arr_delay;
    }

    public void setArr_delay(DoubleWritable arr_delay) {
        this.arr_delay = arr_delay;
    }

    public DoubleWritable getArr_delay_new() {
        return arr_delay_new;
    }

    public void setArr_delay_new(DoubleWritable arr_delay_new) {
        this.arr_delay_new = arr_delay_new;
    }

    public DoubleWritable getCancelled() {
        return cancelled;
    }

    public void setCancelled(DoubleWritable cancelled) {
        this.cancelled = cancelled;
    }

    public DoubleWritable getAir_time() {
        return air_time;
    }

    public void setAir_time(DoubleWritable air_time) {
        this.air_time = air_time;
    }

    public DoubleWritable getDistance() {
        return distance;
    }

    public void setDistance(DoubleWritable distance) {
        this.distance = distance;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        year.write(out);
        quarter.write(out);
        month.write(out);
        day_of_month.write(out);
        day_of_week.write(out);
        fl_num.write(out);
        origin_airoport_id.write(out);
        orig_airpor_seq_id.write(out);
    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}