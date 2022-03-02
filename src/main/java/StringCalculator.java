public class StringCalculator {

    public int Add(String numbers){
        int  result = 0;
        if (numbers == ""){
            return result;
        }

        String[] tokens = numbers.split(",");

        int numberOfNumbers = tokens.length;

        //limit to three
        if(numberOfNumbers > 3){
            numberOfNumbers = 3;
        }

        for(int i=0; i<numberOfNumbers; i++){
            result += Integer.parseInt(tokens[i]);
        }

        return result;
    }
}
