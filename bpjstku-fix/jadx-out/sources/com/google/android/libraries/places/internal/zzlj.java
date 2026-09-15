package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlj {
    public static String zzb(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public static int zza(String str) {
        byte b;
        if (str == null) {
            return 13;
        }
        switch (str.hashCode()) {
            case -1698126997:
                if (!str.equals("REQUEST_DENIED")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1125000185:
                if (!str.equals("INVALID_REQUEST")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -813482689:
                if (!str.equals("ZERO_RESULTS")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 2524:
                if (!str.equals("OK")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1023286998:
                if (!str.equals("NOT_FOUND")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1831775833:
                if (!str.equals("OVER_QUERY_LIMIT")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return 0;
        }
        if (b == 2) {
            return PlacesStatusCodes.OVER_QUERY_LIMIT;
        }
        if (b == 3) {
            return PlacesStatusCodes.REQUEST_DENIED;
        }
        if (b == 4) {
            return PlacesStatusCodes.INVALID_REQUEST;
        }
        if (b != 5) {
            return 13;
        }
        return PlacesStatusCodes.NOT_FOUND;
    }
}
