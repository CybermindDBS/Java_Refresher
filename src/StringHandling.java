public class StringHandling {
    public static void main(String[] args) {
        String str = "Hello";
        str = String.valueOf("11,22,33");
        String arr[] = str.split(",");
        str = String.join("-", arr);
        System.out.println(str);

//        String Useful Methods:
//        String.format();
//        String.join();

//        Note:
//        use equals() method instead of '==' for checking Strings or Wrapper classes

        int num = 10;
        double value = 3.14159;
        String formattedString = String.format("The number is %d and the value is %.2f", num, value);

//         Methods:
//        str.length();
//        str.split();
//        str.equals();
//        str.equalsIgnoreCase();
//        str.toLowerCase();
//        str.toUpperCase();
//        str.charAt();
//        str.contains();
//        str.endsWith();
//        str.indexOf();
//        str.lastIndexOf();
//        str.isEmpty();
//        str.lines();
//        str.matches();
//        str.repeat();
//        str.replace();
//        str.replaceAll();
//        str.replaceFirst();
//        str.startsWith();
//        str.substring();
//        str.toCharArray();

        StringBuilder sb = new StringBuilder();
//        sb.append();
//        sb.delete();
//        sb.deleteCharAt();
//        sb.indexOf();
//        sb.insert();
//        sb.lastIndexOf();
//        sb.replace();
//        sb.reverse();
//        sb.setCharAt();
//        sb.charAt()
    }
}