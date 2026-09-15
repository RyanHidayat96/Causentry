package androidx.p005navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/NavUriUtils;", "", "<init>", "()V", "", "p0", "p1", "encode", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "decode", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "parse", "(Ljava/lang/String;)Landroid/net/Uri;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavUriUtils {
    public static final NavUriUtils INSTANCE = new NavUriUtils();

    private NavUriUtils() {
    }

    public static /* synthetic */ String encode$default(NavUriUtils navUriUtils, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return navUriUtils.encode(str, str2);
    }

    public final String encode(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        String strEncode = Uri.encode(p0, p1);
        Intrinsics.checkNotNullExpressionValue(strEncode, "");
        return strEncode;
    }

    public final String decode(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        String strDecode = Uri.decode(p0);
        Intrinsics.checkNotNullExpressionValue(strDecode, "");
        return strDecode;
    }

    public final Uri parse(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Uri uri = Uri.parse(p0);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        return uri;
    }
}
