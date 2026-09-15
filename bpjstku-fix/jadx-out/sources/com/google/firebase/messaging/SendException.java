package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class SendException extends Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    SendException(String str) {
        super(str);
        this.errorCode = parseErrorCode(str);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    private int parseErrorCode(String str) {
        byte b;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (!lowerCase.equals("service_not_available")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1290953729:
                if (!lowerCase.equals("toomanymessages")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -920906446:
                if (!lowerCase.equals("invalid_parameters")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -617027085:
                if (!lowerCase.equals("messagetoobig")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -95047692:
                if (!lowerCase.equals("missing_to")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 3;
        }
        if (b == 1) {
            return 4;
        }
        if (b != 2) {
            if (b == 3) {
                return 2;
            }
            if (b != 4) {
                return 0;
            }
        }
        return 1;
    }
}
