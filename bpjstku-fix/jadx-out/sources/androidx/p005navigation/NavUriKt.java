package androidx.p005navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p0", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "NavUri", "(Ljava/lang/String;)Landroid/net/Uri;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavUriKt {
    public static final Uri NavUri(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return NavUriUtils.INSTANCE.parse(str);
    }
}
