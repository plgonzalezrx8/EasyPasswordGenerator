package passwordGenerator;




public class RandomString {

    // function to generate a random string of length n
    static String getAlphaNumericString(
            int n,
            boolean numbers,
            boolean uppercases,
            boolean lowercases,
            boolean symbols) {

        String alphaNumericString;
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvxyz";
        String nums = "0123456789";
        String symbs = "!@#$%^&*(){}";
        StringBuilder generator = new StringBuilder();
        StringBuilder result = new StringBuilder();

        //add selected items to the String pool
        if(numbers) {
            generator.append(nums);
        }

        if(uppercases){
            generator.append(upper);
        }

        if(lowercases){
            generator.append(lower);
        }

        if(symbols){
            generator.append(symbs);
        }

        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (generator.length() * Math.random());
            //add Character one by one to the generated String
            result.append(generator.toString().charAt(index));


        }

        return result.toString();





    }



}
