package com.bpjstku.data.lib;

import com.google.gson.JsonSyntaxException;
import defpackage.FileTransformFactory;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.getEventTime;
import defpackage.getImageFormat;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.mapPoint;
import defpackage.registerlambda1;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/lib/UnauthorizedInterceptor;", "Lokhttp3/Interceptor;", "LgetEventTime;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "p0", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lcom/bpjstku/data/lib/PreferenceManager;", "preferenceManager$delegate", "Lkotlin/Lazy;", "getPreferenceManager", "()Lcom/bpjstku/data/lib/PreferenceManager;", "preferenceManager", "Lregisterlambda1;", "userUseCase$delegate", "getUserUseCase", "()Lregisterlambda1;", "userUseCase"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnauthorizedInterceptor implements Interceptor, getEventTime {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: preferenceManager$delegate, reason: from kotlin metadata */
    private final Lazy preferenceManager;

    /* JADX INFO: renamed from: userUseCase$delegate, reason: from kotlin metadata */
    private final Lazy userUseCase;

    /* JADX WARN: Multi-variable type inference failed */
    public UnauthorizedInterceptor() {
        UnauthorizedInterceptor unauthorizedInterceptor = this;
        final FileTransformFactory fileTransformFactory = unauthorizedInterceptor.getKoin().b;
        final mapPoint mappoint = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.preferenceManager = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.data.lib.UnauthorizedInterceptor$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r0v1, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                return fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), mappoint, objArr);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final FileTransformFactory fileTransformFactory2 = unauthorizedInterceptor.getKoin().b;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.userUseCase = LazyKt.lazy(new Function0<registerlambda1>() { // from class: com.bpjstku.data.lib.UnauthorizedInterceptor$special$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, registerlambda1] */
            @Override // kotlin.jvm.functions.Function0
            public final registerlambda1 invoke() {
                return fileTransformFactory2.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), objArr2, objArr3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final PreferenceManager getPreferenceManager() {
        return (PreferenceManager) this.preferenceManager.getValue();
    }

    private final registerlambda1 getUserUseCase() {
        return (registerlambda1) this.userUseCase.getValue();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Response responseProceed = p0.proceed(p0.request());
        try {
            if (!responseProceed.isSuccessful() && responseProceed.code() == 406) {
                lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(new getImageFormat());
                return responseProceed;
            }
        } catch (JsonSyntaxException e2) {
            e2.printStackTrace();
        }
        return responseProceed;
    }

    @Override // defpackage.getEventTime
    public final ZoomGestureDetectorZoomEvent getKoin() {
        return ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
    }
}
