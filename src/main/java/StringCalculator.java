public class StringCalculator {

    public int Add(String numbers){
        int  result = 0;
        if (numbers == ""){
            return result;
        }

        String[] tokens = numbers.split(",");

        for(int i = 0; i<3; i++){
            result += Integer.parseInt(tokens[i]);
        }

        return result;
    }
}
