public class Hello {

    String message;
    int num;
    //주석추가

    public Hello() {
        this("안녕하세");
    }

    public Hello(String message) {
        this.message = message;
    }

    public String say() {
        return message;
    }

}
