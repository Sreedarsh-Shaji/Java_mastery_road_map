public class Class3 {

    public static void main(String[] args) {
        NumberHandler<Float> num = new NumberHandler();

        //This would throw an error as the genric class only accepts number
        //NumberHandler<String> std = new NumberHandler<String>();
    }

}

class NumberHandler<T extends Number>{



}