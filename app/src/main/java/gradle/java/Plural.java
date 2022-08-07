package gradle.java;

public class Plural {
    public Boolean isPlural(int n){
        if(n == 0) {
            return true;
        } else if(n == .5) {
            return true;
        } else if (n == 1) {
            return false;
        } else if (n >= 2) {
            return true;
        }
        return false;

    }
}

