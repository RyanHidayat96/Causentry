package com.google.android.libraries.places.internal;

import android.net.Uri;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
final class zzpt implements Function1 {
    final /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk zza;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Uri uri = ((FetchResolvedPhotoUriResponse) obj).getUri();
        if (uri == null) {
            this.zza.resumeWith(Result.m8024constructorimpl(com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza));
        } else {
            this.zza.resumeWith(Result.m8024constructorimpl(new com.google.android.libraries.places.widget.internal.placedetails.zzbl(uri)));
        }
        return Unit.INSTANCE;
    }

    zzpt(MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.zza = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
    }
}
