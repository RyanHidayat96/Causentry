package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import defpackage.CaptureBundlesCaptureBundleImpl;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class zza extends CaptureBundlesCaptureBundleImpl {
    private final float zza;
    private final float zzb;
    private final Context zzc;

    public zza(Context context, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.zza = 25.0f;
        this.zzb = 0.125f;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.zzc = applicationContext;
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        return Objects.equals(Float.valueOf(this.zza), Float.valueOf(zzaVar.zza)) && Objects.equals(Float.valueOf(this.zzb), Float.valueOf(zzaVar.zzb));
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return Objects.hash("com.google.android.libraries.places.widget.internal.photoviewer.BlurTransformation", Float.valueOf(this.zza), Float.valueOf(this.zzb));
    }

    @Override // defpackage.CaptureBundlesCaptureBundleImpl
    public final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmapPool, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        float width = bitmap.getWidth();
        float f = this.zzb;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(width * f), Math.round(bitmap.getHeight() * f), false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        RenderScript renderScriptCreate = RenderScript.create(this.zzc);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        try {
            scriptIntrinsicBlurCreate.setRadius(this.zza);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } finally {
            bitmapCreateScaledBitmap.recycle();
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
        }
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "");
        byte[] bytes = "blurred".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
        messageDigest.update((byte) (this.zza * 10.0f));
        messageDigest.update((byte) (this.zzb * 10.0f));
    }
}
