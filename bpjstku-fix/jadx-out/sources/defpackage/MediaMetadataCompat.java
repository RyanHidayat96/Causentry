package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements fromMediaMetadata<Uri> {
    @Override // defpackage.fromMediaMetadata
    public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri uri, getStarRating getstarrating) {
        return TuitionPaymentFragmentbindingInflater1(uri, getstarrating);
    }

    private static String TuitionPaymentFragmentbindingInflater1(Uri uri, getStarRating getstarrating) {
        if (Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append('-');
            sb.append(getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources().getConfiguration()));
            return sb.toString();
        }
        return uri.toString();
    }
}
