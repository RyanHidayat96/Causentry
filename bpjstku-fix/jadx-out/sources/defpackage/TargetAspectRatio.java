package defpackage;

import defpackage.getSupportedSizes;
import defpackage.mapPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"LTargetAspectRatio;", "LgetEventTime;", "<init>", "()V", "LgetSupportedSizes;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "()LgetSupportedSizes;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TargetAspectRatio implements getEventTime {
    public static final TargetAspectRatio INSTANCE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private TargetAspectRatio() {
    }

    static {
        TargetAspectRatio targetAspectRatio = new TargetAspectRatio();
        INSTANCE = targetAspectRatio;
        final FileTransformFactory fileTransformFactory = targetAspectRatio.getKoin().b;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getSupportedSizes>() { // from class: com.bpjstku.util.analytics.impl.AnalyticsHelper$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [getSupportedSizes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getSupportedSizes invoke() {
                return fileTransformFactory.b(Reflection.getOrCreateKotlinClass(getSupportedSizes.class), this.$qualifier, this.$parameters);
            }

            {
                super(0);
            }
        });
    }

    public static getSupportedSizes TuitionPaymentFragmentbindingInflater1() {
        return (getSupportedSizes) TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    @Override // defpackage.getEventTime
    public final ZoomGestureDetectorZoomEvent getKoin() {
        return ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
    }
}
