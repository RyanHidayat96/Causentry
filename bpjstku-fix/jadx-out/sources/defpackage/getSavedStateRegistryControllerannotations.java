package defpackage;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import defpackage.ensureViewModelStore;
import defpackage.mapPoint;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public final class getSavedStateRegistryControllerannotations implements getDeviceSurfaceManagerProvider<DigitalCardImageRequest, InputStream>, getEventTime {
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getSavedStateRegistryControllerannotations() {
        final FileTransformFactory fileTransformFactory = getKoin().b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ensureViewModelStore>() { // from class: com.bpjstku.domain.digitalcard.downloader.DigitalCardModelFactory$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [ensureViewModelStore, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ensureViewModelStore invoke() {
                return fileTransformFactory.b(Reflection.getOrCreateKotlinClass(ensureViewModelStore.class), this.$qualifier, this.$parameters);
            }

            {
                super(0);
            }
        });
    }

    @Override // defpackage.getDeviceSurfaceManagerProvider
    public final getSchedulerHandler<DigitalCardImageRequest, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
        Intrinsics.checkNotNullParameter(setcameraexecutor, "");
        return new menuHostHelperlambda0((ensureViewModelStore) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
    }

    @Override // defpackage.getEventTime
    public final ZoomGestureDetectorZoomEvent getKoin() {
        return ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
    }
}
