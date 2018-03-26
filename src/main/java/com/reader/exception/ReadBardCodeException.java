package com.reader.exception;

/**
 * Created by andriusbaltrunas on 3/23/2018.
 */
public class ReadBardCodeException extends Exception {
    public ReadBardCodeException() {
        super();
    }

    public ReadBardCodeException(String message) {
        super(message);
    }

    public ReadBardCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadBardCodeException(Throwable cause) {
        super(cause);
    }
}
