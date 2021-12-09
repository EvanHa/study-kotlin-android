// Data Class
// 데이터 저장이 목적

/*
public class JavaObject {
    private String s;

    JavaObject(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    // copy
    // toString
    // hashCode 등등 생략
}
*/

data class JavaObject(val s: String) {}

fun main(args: Array<String>) {

}
