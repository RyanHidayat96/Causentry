package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.gms.tasks.OnFailureListener;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class zzbg implements OnFailureListener {
    final /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk zza;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        exc.printStackTrace();
        Unit unit = Unit.INSTANCE;
        new StringBuilder(String.valueOf(unit).length() + 38);
        Objects.toString(unit);
        this.zza.resumeWith(Result.m8024constructorimpl(zzbk.zza));
    }

    zzbg(MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.zza = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
    }
}
