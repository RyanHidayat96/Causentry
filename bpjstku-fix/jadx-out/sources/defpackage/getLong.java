package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class getLong implements getString<Integer, Uri> {
    @Override // defpackage.getString
    public final /* bridge */ /* synthetic */ Uri TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num, getStarRating getstarrating) {
        int iIntValue = num.intValue();
        if (!TuitionPaymentFragmentbindingInflater1(iIntValue, getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            return null;
        }
        StringBuilder sb = new StringBuilder("android.resource://");
        sb.append(getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getPackageName());
        sb.append('/');
        sb.append(iIntValue);
        return Uri.parse(sb.toString());
    }

    private static boolean TuitionPaymentFragmentbindingInflater1(int i, Context context) {
        try {
            return context.getResources().getResourceEntryName(i) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
