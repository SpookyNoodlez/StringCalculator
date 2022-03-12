import static java.lang.Character.isDigit;

public class StringCalculator {

    public int Add(String numbers) throws Exception {
        int  result = 0;
        if (numbers == ""){
            return result;
        }
        //If first character is a number, no delimiter is assumed to have been specified
        String[] tokens;
        if (isDigit(numbers.charAt(0))){
            tokens = numbers.split(",|\n");
        }
        else{
            char delimiter = numbers.charAt(0);
            numbers = numbers.substring(2);
            tokens = numbers.split(String.valueOf(delimiter));
        }

        int numberOfNumbers = tokens.length;

        for(int i=0; i<numberOfNumbers; i++){
            //disallow negative numbers
            if (Integer.parseInt(tokens[i]) < 0){
                throw new Exception("Negatives not allowed "+tokens[i]);
            }
            result += Integer.parseInt(tokens[i]);
        }

        return result;
    }
}
