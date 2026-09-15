package com.bpjstku.util.utils;

import android.content.Context;
import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import defpackage.getSavedStateRegistryControllerannotations;
import defpackage.getUseCaseConfigFactoryProvider;
import defpackage.onSuggestedStreamSpecUpdated;
import defpackage.setCameraExecutor;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/util/utils/BpjstkuGlideModule;", "LonSuggestedStreamSpecUpdated;", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bumptech/glide/Glide;", "p1", "Lcom/bumptech/glide/Registry;", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lcom/bumptech/glide/Registry;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BpjstkuGlideModule extends onSuggestedStreamSpecUpdated {
    @Override // defpackage.setSensorToBufferTransformMatrix, defpackage.setViewPortCropRect
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, Glide p1, Registry p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, p1, p2);
        getSavedStateRegistryControllerannotations getsavedstateregistrycontrollerannotations = new getSavedStateRegistryControllerannotations();
        getUseCaseConfigFactoryProvider getusecaseconfigfactoryprovider = p2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (getusecaseconfigfactoryprovider) {
            setCameraExecutor setcameraexecutor = getusecaseconfigfactoryprovider.TuitionPaymentFragmentbindingInflater1;
            synchronized (setcameraexecutor) {
                setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DigitalCardImageRequest.class, InputStream.class, getsavedstateregistrycontrollerannotations, false);
            }
            getusecaseconfigfactoryprovider.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
        }
    }
}
