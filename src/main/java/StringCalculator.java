public class StringCalculator {

    public int Add(String numbers){
        int  result = 0;
        if (numbers == ""){
            return result;
        }

        String[] tokens = numbers.split(",|\n");

        int numberOfNumbers = tokens.length;

        for(int i=0; i<numberOfNumbers; i++){
            result += Integer.parseInt(tokens[i]);
        }

        return result;
    }
}
