package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        new HistogramDisplay(histogram).execute();
    }
    
}
