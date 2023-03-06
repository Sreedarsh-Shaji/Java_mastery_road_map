import java.util.List;

public class Class4 {
}

class DemoClass1<T>{

    //Would Only accept a List that contains each element the child of T
    void addAverage(List<? extends T> num){

    }

    // Would only accept a List that contains an element parent of T
    void addAverage2(List<? super T> num2){

    }

}