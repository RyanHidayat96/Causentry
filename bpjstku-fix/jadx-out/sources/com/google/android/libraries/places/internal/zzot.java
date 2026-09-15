package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.setDefaultCaptureConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzot extends setDefaultCaptureConfig {
    private final ImageView zza;
    private final Function1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzot(ImageView imageView, Function1 function1) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "");
        this.zza = imageView;
        this.zzb = function1;
    }

    @Override // defpackage.setDefaultCaptureConfig, defpackage.setBackpressureStrategy, defpackage.setDefaultResolution
    public final void onLoadFailed(Drawable drawable) {
        Function1 function1 = this.zzb;
        if (function1 != null) {
            function1.invoke(this.zza);
        }
    }

    @Override // defpackage.setDefaultCaptureConfig
    public final /* synthetic */ void setResource(Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        this.zza.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzos
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.setImageBitmap(bitmap);
            }
        });
    }
}
