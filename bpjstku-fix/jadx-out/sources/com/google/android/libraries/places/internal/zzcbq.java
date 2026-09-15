package com.google.android.libraries.places.internal;

import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzcbq {
    public static final /* synthetic */ int zza = 0;

    static {
        Logger.getLogger("okio.Okio");
    }

    public static final boolean zza(AssertionError assertionError) {
        String message;
        Intrinsics.checkNotNullParameter(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null)) ? false : true;
    }
}
