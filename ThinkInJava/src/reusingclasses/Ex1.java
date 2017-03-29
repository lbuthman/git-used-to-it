package reusingclasses;

/**
 * Created by lbuthman on 3/28/17.
 * lazy initialization
 */
public class Ex1 {
    private String lazy;

    public String getLazy() {
        return this.lazy;
    }

    public void whoIsLazy(String s) {
        this.lazy = s;
        System.out.println(s + " is lazy");
    }

    public static void main(String[] args) {
        Ex1 e = new Ex1();
        System.out.println(e.getLazy());
        String s = "this boy ";
        e.whoIsLazy(s);
    }
}
