import javax.sound.midi.Soundbank;

public class Counter {
    //Recursion: the process of a function/method calling itself

    //Create a method that counts up from a start number to a finish number.

    void  countTo(int start, int stop) {
        //check if start value is greater than final value, then return an error is so.
        if (start >stop) {
            System.out.println("Start value must be less than final value. Please try again!");
            return;
        }
        // Print the value of start to the console
        System.out.println(start);
        start++;
        if (start<=stop) {
            countTo(start,stop);
        }
        return;

    }
    void countDown(int start, int stop) {
        if (start < stop) {
            System.out.println("Start value must be bigger than final value. Please try again!");
            return;
        }
        System.out.println(start);
        start--;
        if (start >= stop) {
            countDown(start, stop);
        }
        return;
    }

}

