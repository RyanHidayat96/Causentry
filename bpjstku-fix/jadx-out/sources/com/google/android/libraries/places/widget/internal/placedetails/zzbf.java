package com.google.android.libraries.places.widget.internal.placedetails;

import android.net.Uri;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
final class zzbf implements Function1 {
    final /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk zza;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Uri uri = ((FetchResolvedPhotoUriResponse) obj).getUri();
        if (uri == null) {
            this.zza.resumeWith(Result.m8024constructorimpl(zzbo.zza));
        } else {
            this.zza.resumeWith(Result.m8024constructorimpl(new zzbl(uri)));
        }
        return Unit.INSTANCE;
    }

    zzbf(MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.zza = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
    }
}
