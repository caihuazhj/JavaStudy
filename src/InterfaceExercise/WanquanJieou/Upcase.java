package InterfaceExercise.WanquanJieou;

public class Upcase extends Processer {
    String process(Object input){
        //向上转型
        return ((String) input).toUpperCase();
    }
}
