package InterfaceExercise.WanquanJieou;

import javax.annotation.processing.Processor;
import java.util.Arrays;

public class Splitter extends Processer{
    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}