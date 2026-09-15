package defpackage;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class createPacket {
    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
            return fileExtensionFromUrl;
        }
        if (str.contains(".")) {
            return str.substring(str.lastIndexOf(".") + 1, str.length());
        }
        return "";
    }
}
