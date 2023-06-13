package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    int[] testN = {3,5,15,30,60};

    public List<String> fizzBuzz01(int n) {

        List<String> rtn = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(i % 15 == 0 ) {
                rtn.add("FizzBuzz");
            } else if(i % 3 == 0) {
                rtn.add("Fizz");
            } else if(i % 5 == 0) {
                rtn.add("Buzz");
            } else {
                rtn.add(String.valueOf(i));
            }
        }
        return rtn;
    }

    public void methodTest() {
        for(int i : testN) {
            System.out.println(fizzBuzz01(i));
            System.out.println("=================");
        }
    }
}
