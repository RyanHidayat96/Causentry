package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class getBundle implements getString<Uri, Uri> {
    @Override // defpackage.getString
    public final /* synthetic */ Uri TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, getStarRating getstarrating) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(uri, getstarrating);
    }

    private static Uri TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri uri, getStarRating getstarrating) throws PackageManager.NameNotFoundException {
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException("Invalid android.resource URI: ".concat(String.valueOf(uri)).toString());
        }
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append(authority);
        sb.append('/');
        sb.append(identifier);
        return Uri.parse(sb.toString());
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri) {
        String authority;
        return Intrinsics.areEqual(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !StringsKt.isBlank(authority) && uri.getPathSegments().size() == 2;
    }
}
