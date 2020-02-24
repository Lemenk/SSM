package top.lemenk.exception;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.exception
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/24 12:56
 * @Description: 自定义异常类
 */

public class SystemException extends Exception {

    //存储异常信息
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SystemException(String message) {
        this.message = message;
    }
}
