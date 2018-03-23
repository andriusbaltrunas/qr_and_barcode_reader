package com.reader.exception;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class ReadQRCodeException extends Exception {
    public ReadQRCodeException() {
        super();
    }

    public ReadQRCodeException(String message) {
        super(message);
    }

    public ReadQRCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadQRCodeException(Throwable cause) {
        super(cause);
    }
}
