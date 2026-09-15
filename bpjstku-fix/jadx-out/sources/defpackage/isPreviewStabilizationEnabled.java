package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class isPreviewStabilizationEnabled {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i) {
        String resourceEntryName;
        if (context != null) {
            try {
                Resources resources = context.getResources();
                if (resources != null) {
                    resourceEntryName = resources.getResourceEntryName(i);
                } else {
                    resourceEntryName = null;
                }
            } catch (Resources.NotFoundException unused) {
                String string = Integer.toString(i, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "");
                return "0x".concat(String.valueOf(string));
            }
        } else {
            resourceEntryName = null;
        }
        if (resourceEntryName != null) {
            return resourceEntryName;
        }
        String string2 = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return "0x".concat(String.valueOf(string2));
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String simpleName = view.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }
}
