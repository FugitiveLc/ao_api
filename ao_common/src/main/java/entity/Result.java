package entity;

public class Result {

    private int code;
    private String msg;
    private Object data;

    public Result() {
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ResultEnum resultEnum, Object data) {
        this(resultEnum);
        this.data = data;
    }

    public Result(int code, String msg, Object data) {
        this(code, msg);
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
