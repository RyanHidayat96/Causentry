package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class getMediaMetadata implements getString<Uri, File> {
    @Override // defpackage.getString
    public final /* synthetic */ File TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, getStarRating getstarrating) {
        return TuitionPaymentFragmentbindingInflater1(uri);
    }

    private static File TuitionPaymentFragmentbindingInflater1(Uri uri) {
        if (!b(uri)) {
            return null;
        }
        if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            return null;
        }
        return new File(uri.toString());
    }

    private static boolean b(Uri uri) {
        String scheme;
        if (!getRatingType.b(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, "file"))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(uri) != null) {
                return true;
            }
        }
        return false;
    }
}
