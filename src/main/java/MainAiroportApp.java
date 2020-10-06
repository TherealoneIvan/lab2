import org.apache.hadoop.mapreduce.Job;

public class MainAiroportApp {
    public static void main(String arg[]) throws Exception{
        if (arg.length < 4){
            System.err.println("MainAiroportApp exeptiom");
            System.exit(1);
        }
//        gitwatch cheack???
        Job job = Job.getInstance();
    }
}
