package defpackage;

import android.content.Context;
import com.bpjstku.presentation.membership.login.LoginActivity;
import defpackage.mapPoint;
import defpackage.registerlambda1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0007\u001a\u00020\t8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LsetCaptureRequestTemplate;", "LgetEventTime;", "<init>", "()V", "", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)V", "Lregisterlambda1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setCaptureRequestTemplate implements getEventTime {
    public static final setCaptureRequestTemplate INSTANCE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static final Lazy TuitionPaymentFragmentbindingInflater1;

    private setCaptureRequestTemplate() {
    }

    static {
        setCaptureRequestTemplate setcapturerequesttemplate = new setCaptureRequestTemplate();
        INSTANCE = setcapturerequesttemplate;
        final FileTransformFactory fileTransformFactory = setcapturerequesttemplate.getKoin().b;
        TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<registerlambda1>() { // from class: com.bpjstku.util.utils.DecryptionFailureHandler$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, registerlambda1] */
            @Override // kotlin.jvm.functions.Function0
            public final registerlambda1 invoke() {
                return fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), this.$qualifier, this.$parameters);
            }

            {
                super(0);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        LoginActivity.Companion companion = LoginActivity.INSTANCE;
        Intrinsics.checkNotNull(context);
        LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, null, true, 2);
        return Unit.INSTANCE;
    }

    @Override // defpackage.getEventTime
    public final ZoomGestureDetectorZoomEvent getKoin() {
        return ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
    }

    public static void TuitionPaymentFragmentbindingInflater1(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            Lazy lazy = TuitionPaymentFragmentbindingInflater1;
            if (((registerlambda1) lazy.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1() != null) {
                try {
                    ((registerlambda1) lazy.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } catch (Exception e2) {
                    e2.getMessage();
                }
                final Context applicationContext = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getApplicationContext();
                Intrinsics.checkNotNull(applicationContext);
                accesssetAnchoredZoomStartYp.TuitionPaymentFragmentspecialinlinedviewModeldefault1(applicationContext, new Function1() { // from class: setDeviceStateCallback
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return setCaptureRequestTemplate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(applicationContext, (Context) obj);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
