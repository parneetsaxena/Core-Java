package foundations.problems;


public class EnumHTTPStatus {
    enum Status{
        OK(200, "OK"),
        NOT_FOUND(404,"Not Found"),
        INTERNAL_SERVER_ERROR(500,"Internal Server Error"),
        BAD_REQUEST(400,"Bad Request");
        final int code;
        final String message;
        Status(int c, String m){
            code = c;
            message = m;

        }

    }

    public static void main(String[] args) {
        Status stat = Status.NOT_FOUND;
        System.out.println("Status: "+stat);
        System.out.println(stat.code + " "+stat.message);


    }

}
