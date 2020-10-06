import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements Writable {
    private IntWritable year;
    private 
    @Override
    public void write(DataOutput out) throws IOException {

    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}
//YEAR — год
//        QUARTER - квартал
//        MONTH - месяц
//        DAY_OF_MONTH — день месяца
//        DAY_OF_WEEK - день недели
//        FL_DATE
//        - дата перелета
//        UNIQUE_CARRIER — ID авиакомпании
//        AIRLINE_ID — ID авиакомпании в классификации US DOT
//        CARRIER
//        - ID авиакомпании в классификации IATA
//        TAIL_NUM
//        FL_NUM — ID рейса
//        ORIGIN_AIRPORT_ID - ID авиапорта
//        ORIGIN_AIRPORT_SEQ_ID - ID авиапорта в классификации US DOT
//        ORIGIN_CITY_MARKET_ID - код группы аэропортов относящихся к одному
//        городу
//        DEST_AIRPORT_ID — ID города авиапорта
//        DEST_AEROPORT_ID — Идентификатор аэропорта
//        WHEELS_ON — время приземления (в локальном времени hhmm)
//        ARR_TIME - время прибытия (в локальном времени hhmm)
//        ARR_DELAY — разница в минутах между расчетным временем приземления и
//        реальным (может быть отрицательной)
//        ARR_DELAY_NEW - разница в минутах между расчетным временем
//        приземления и реальным (>=0)
//        CANCELLED — признак отмены рейса (1 в случае отмены)
//        CANCELLATION_CODE — код причины отмены
//        AIR_TIME - время в полете в минутах
//        DISTANCE - расстояние в милях