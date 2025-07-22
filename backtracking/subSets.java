public class subSets {
   
    public static void findSubSets(String str, String ans, int i){
        if (i == str.length()){ // base case if i length equal to str length means depth is completed
            if(ans == ""){
                System.out.println("null sets");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // yes case
        findSubSets(str, ans+str.charAt(i), i+1);
        //No case
        findSubSets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        findSubSets(str, "", 0);
    }
}

