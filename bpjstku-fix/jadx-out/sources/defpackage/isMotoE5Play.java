package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest;
import com.bpjstku.databinding.FragmentVocationalFillParticipantDataBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$bindingInflater$1;
import com.bpjstku.presentation.vocational.model.VocationRegistrationStep;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0015\u0010\u0013\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0011\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0017\u0010\t\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0015\u0010\u001a\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0015\u0010\u0016\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0015\u0010\"\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0017@\u0017X\u0097\f¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010\u0007\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R.\u0010.\u001a\u001c\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00020)8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010-"}, d2 = {"LisMotoE5Play;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentVocationalFillParticipantDataBinding;", "Llambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "Lcom/bpjstku/domain/vocation/model/Bank;", "d", "Lcom/bpjstku/domain/vocation/model/Bank;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "a", "Lcom/bpjstku/domain/user/model/SubscribedProgram;", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/user/model/User;", "LgetCurrentIndex;", "LRequestMonitor;", "asInterface", "LapplyQuirks;", "Lkotlin/Function2;", "Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;", "Lkotlin/jvm/functions/Function2;", "", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "notify"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isMotoE5Play extends AutoValue_ImmutableImageInfo<FragmentVocationalFillParticipantDataBinding> implements lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SubscribedProgram TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Bank TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: createFullYuvPrivYuvConfiguration
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return isMotoE5Play.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: FlashAvailabilityBufferUnderflowQuirk
        public static int b = 152872901;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: addAffectedDevice
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return isMotoE5Play.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: getExtraSupportedSurfaceCombinations
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return isMotoE5Play.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: FlashTooSlowQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return isMotoE5Play.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    @Override // defpackage.lambdanew0androidxcameracamera2internalcompatworkaroundRequestMonitorRequestCompleteListener
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getINotificationSideChannel() {
        return R.layout.fragment_vocational_fill_participant_data;
    }

    public isMotoE5Play() {
        final isMotoE5Play ismotoe5play = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = ismotoe5play;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2
            private static final byte[] $$c = {92, 126, -38, -95};
            private static final int $$f = 104;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {27, -8, 5, 78, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -55, -17, 6, -18, -1, 2, 1, 50, -67, 8, -23, 11, -17, 5, 4, -15, 58, -73, 1, 9, -6, -12, 5, -3, -21, 64, -41, -31, 9, -6, -12, 5, -3, -21, 74, -35, -34, -15, -4, 6, -3, -6, -12, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63};
            private static final int $$e = 212;
            private static final byte[] $$a = {65, -122, -65, 2, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = 56;
            private static int b = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3311072639248191174L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 3
                    int r6 = r6 + 97
                    int r8 = r8 + 4
                    byte[] r0 = com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2.$$a
                    int r7 = 11 - r7
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2b
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    int r8 = r8 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2b:
                    int r8 = -r8
                    int r6 = r6 + r8
                    int r6 = r6 + (-5)
                    r8 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2.a(short, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2.$$d
                    int r1 = 54 - r5
                    int r6 = r6 * 53
                    int r6 = r6 + 4
                    int r7 = r7 * 15
                    int r7 = 99 - r7
                    byte[] r1 = new byte[r1]
                    int r5 = 53 - r5
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r5
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r5) goto L24
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L24:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L28:
                    int r4 = -r4
                    int r6 = r6 + 1
                    int r7 = r7 + r4
                    int r7 = r7 + (-4)
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2.d(short, short, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $11 + 57;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64838), 1356 - Color.red(0), 38 - Color.argb(0, 0, 0, 0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 47773), View.MeasureSpec.getMode(0) + 468, (ViewConfiguration.getTapTimeout() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $10 + 55;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            /* JADX WARN: Type inference failed for: r0v53, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            private PreviewDelayWhenVideoCaptureIsBoundQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                LifecycleOwner lifecycleOwner = ismotoe5play;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
                    byte b2 = $$a[11];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 - 1), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMakeMeasureSpec, iIndexOf, -1199417970, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{15165, 53920, 15196, 35218, 26664, 57076, 12006, 15488, 22050, 6661, 64184, 17194, 57778, 58607, 20290, 53287, 29460, 29055, 8584, 26241, 36496, 50175, 45792, 64315, 6254, 44103}, (-1) - Process.getGidForName(""), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{34045, 6353, 33944, 17377, 64376, 19873, 46928, 42292, 59902, 53368, 27117, 56034, 24184, 11916, 56405, 18868, 52420, 47888, 45772}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                    int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0);
                    byte[] bArr = $$a;
                    byte b4 = (byte) (bArr[3] - 1);
                    byte b5 = bArr[8];
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, (byte) (b5 - 1), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, windowTouchSlop, iIndexOf2, 254769921, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i2 = b + 37;
                    TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                        int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[11];
                        Object[] objArr6 = new Object[1];
                        a(b6, (byte) (b6 + 3), (byte) (bArr2[8] - 1), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i4, iResolveSizeAndState, 1324201839, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = ~iIdentityHashCode;
                    int i6 = ((((-810060588) + ((17879056 | i5) * (-192))) + (((~(55762075 | i5)) | 78193248) * (-384))) + (((~(iIdentityHashCode | (-37883020))) | ((~(i5 | 133955323)) | (~((-78193249) | iIdentityHashCode)))) * DerHeader.TAG_CLASS_PRIVATE)) - 1996677735;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{13411, 34313, 13321, 56628, 21070, 58496, 2008, 5549, 22845, 20137, 49353, 27207, 61156, 45083, 30027, 63776, 31808, 9681, 7149, 20388}, Process.myPid() >> 22, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{45805, 30019, 45700, 11899, 33130, 14263, 60864, 65466, 57321, 48614, 5099, 32839, 26693, 17182, 42588, 4902, 64254, 54912, 51419, 42427}, '0' - AndroidCharacter.getMirror('0'), objArr9);
                    try {
                        Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1996677735};
                        byte[] bArr3 = $$d;
                        byte b7 = bArr3[94];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        d(b7, b8, b8, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b9 = bArr3[20];
                        byte b10 = b9;
                        Object[] objArr12 = new Object[1];
                        d(b9, b10, b10, objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            int iIndexOf3 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[11];
                            Object[] objArr13 = new Object[1];
                            a(b11, (byte) (b11 + 3), (byte) (bArr4[8] - 1), objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf3, iKeyCodeFromString, 1324201839, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            c(new char[]{15165, 53920, 15196, 35218, 26664, 57076, 12006, 15488, 22050, 6661, 64184, 17194, 57778, 58607, 20290, 53287, 29460, 29055, 8584, 26241, 36496, 50175, 45792, 64315, 6254, 44103}, ExpandableListView.getPackedPositionType(0L), objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{34045, 6353, 33944, 17377, 64376, 19873, 46928, 42292, 59902, 53368, 27117, 56034, 24184, 11916, 56405, 18868, 52420, 47888, 45772}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                                byte[] bArr5 = $$a;
                                byte b12 = (byte) (bArr5[3] - 1);
                                byte b13 = bArr5[8];
                                Object[] objArr16 = new Object[1];
                                a(b12, b13, (byte) (b13 - 1), objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, offsetAfter, trimmedLength, 254769921, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                                int iBlue = Color.blue(0) + 10;
                                byte b14 = $$a[11];
                                byte b15 = b14;
                                Object[] objArr17 = new Object[1];
                                a(b14, b15, (byte) (b15 - 1), objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, absoluteGravity, iBlue, -1199417970, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i9 = ((int[]) objArr[2])[0];
                int i10 = ((int[]) objArr[0])[0];
                if (i10 == i9) {
                    int i11 = ((int[]) objArr[1])[0];
                    Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i12 = i11 + ((((~((-434563) | iIdentityHashCode2)) | (-109033464)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1386214718) + ((~((~iIdentityHashCode2) | (-434563))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr18[1])[0] = i14 ^ (i14 << 5);
                    int i15 = TuitionPaymentFragmentbindingInflater1 + 83;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 3 / 2;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        for (String str : strArr) {
                            int i17 = b + 115;
                            TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                            int i18 = i17 % 2;
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i10];
                    int i19 = i10 - 1;
                    iArr[i19] = 1;
                    Toast.makeText((Context) null, iArr[((i10 * i19) % 2) - 1], 1).show();
                    int i20 = ((int[]) objArr[1])[0];
                    Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i21 = 981403968 + ((iIdentityHashCode3 | 459062781) * (-50));
                    int i22 = ~((-50861526) | iIdentityHashCode3);
                    int i23 = ~iIdentityHashCode3;
                    int i24 = i20 + i21 + ((i22 | (~(469614077 | i23))) * 50) + (((~(i23 | 459062781)) | (~(418752552 | i23)) | (-469614078)) * 50);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr19[1])[0] = i26 ^ (i26 << 5);
                }
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                return isQuickZoomEnabled.b(!(componentCallbacks instanceof getEventTime) ? ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b : ((getEventTime) componentCallbacks).getKoin(), new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
            }

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = b + 31;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                ?? TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i4 = TuitionPaymentFragmentbindingInflater1 + 119;
                b = i4 % 128;
                int i5 = i4 % 2;
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, short r7, byte r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    byte[] r0 = com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2.$$c
                    int r8 = r8 * 2
                    int r1 = r8 + 1
                    int r6 = r6 * 3
                    int r6 = r6 + 107
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2b:
                    int r6 = r6 + r7
                    int r7 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalFillParticipantDataFragment$special$$inlined$viewModel$default$2.$$g(byte, short, byte):java.lang.String");
            }
        });
    }

    /* JADX INFO: renamed from: isMotoE5Play$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LisMotoE5Play$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p0", "LisMotoE5Play;", "b", "(Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)LisMotoE5Play;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static isMotoE5Play b(VocationalRegistration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            isMotoE5Play ismotoe5play = new isMotoE5Play();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vocation_registration_data", p0);
            ismotoe5play.setArguments(bundle);
            return ismotoe5play;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentVocationalFillParticipantDataBinding> d() {
        return VocationalFillParticipantDataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentVocationalFillParticipantDataBinding fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Button button = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (vocationalRegistration != null) {
            TextInputLayout textInputLayout = INotificationSideChannelStub().tilExpertiseArea;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            retrieveConcurrentCameraIds.b(textInputLayout, vocationalRegistration.d);
            TextInputLayout textInputLayout2 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilWorkExperience;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            retrieveConcurrentCameraIds.b(textInputLayout2, vocationalRegistration.asInterface);
            TextInputLayout textInputLayout3 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFormalEducation;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            retrieveConcurrentCameraIds.b(textInputLayout3, vocationalRegistration.a);
            TextInputLayout textInputLayout4 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilNpwp;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
            retrieveConcurrentCameraIds.b(textInputLayout4, vocationalRegistration.g);
            TextInputLayout textInputLayout5 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilExpectedSalaries;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
            retrieveConcurrentCameraIds.b(textInputLayout5, vocationalRegistration.asBinder);
            TextInputLayout textInputLayout6 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
            retrieveConcurrentCameraIds.b(textInputLayout6, vocationalRegistration.onTransact);
            TextInputLayout textInputLayout7 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
            retrieveConcurrentCameraIds.b(textInputLayout7, vocationalRegistration.INotificationSideChannel);
            TextInputLayout textInputLayout8 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankBranchOffice;
            Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
            retrieveConcurrentCameraIds.b(textInputLayout8, vocationalRegistration.cancelAll);
            TextInputLayout textInputLayout9 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
            Bank bank = vocationalRegistration.notify;
            retrieveConcurrentCameraIds.b(textInputLayout9, bank != null ? bank.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            TextInputLayout textInputLayout10 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilIdentityNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
            String str = vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str.length() == 0) {
                User user = (User) this.g.getValue();
                str = user != null ? user.b : null;
                if (str == null) {
                    str = "";
                }
            }
            retrieveConcurrentCameraIds.b(textInputLayout10, str);
            TextInputLayout textInputLayout11 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFullName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
            String str2 = vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str2.length() == 0) {
                User user2 = (User) this.g.getValue();
                str2 = user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                if (str2 == null) {
                    str2 = "";
                }
            }
            retrieveConcurrentCameraIds.b(textInputLayout11, str2);
            TextInputLayout textInputLayout12 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilAddress;
            Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
            String str3 = vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3.length() == 0) {
                User user3 = (User) this.g.getValue();
                str3 = user3 != null ? user3.asBinder : null;
                if (str3 == null) {
                    str3 = "";
                }
            }
            retrieveConcurrentCameraIds.b(textInputLayout12, str3);
            TextInputLayout textInputLayout13 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilJamsostekIdNumber;
            Intrinsics.checkNotNullExpressionValue(textInputLayout13, "");
            String str4 = vocationalRegistration.b;
            if (str4.length() == 0) {
                User user4 = (User) this.g.getValue();
                SubscribedProgram subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1 = user4 != null ? register.TuitionPaymentFragmentspecialinlinedviewModeldefault1(user4) : null;
                this.TuitionPaymentFragmentbindingInflater1 = subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                str4 = subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? subscribedProgramTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                if (str4 == null) {
                    str4 = "";
                }
            }
            retrieveConcurrentCameraIds.b(textInputLayout13, str4);
        }
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilAddress.setError(null);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFormalEducation.setError(null);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFormalEducation.setErrorEnabled(false);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.edtExpectedSalaries.setError(null);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankName.setError(null);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankName.setErrorEnabled(false);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankBranchOffice.setError(null);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountNumber.setError(null);
        fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountName.setError(null);
        EditText editText = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilAddress.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilExpertiseArea.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText3 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilWorkExperience.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText4 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankName.getEditText();
        if (editText4 != null) {
            Intrinsics.checkNotNullParameter(editText4, "");
            editText4.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText5 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountName.getEditText();
        if (editText5 != null) {
            Intrinsics.checkNotNullParameter(editText5, "");
            editText5.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText6 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankBranchOffice.getEditText();
        if (editText6 != null) {
            Intrinsics.checkNotNullParameter(editText6, "");
            editText6.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        INotificationSideChannel();
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ExtraSupportedSurfaceCombinationsQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isMotoE5Play.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        EditText editText = INotificationSideChannelStub().tilJamsostekIdNumber.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: isSamsungS7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isMotoE5Play.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
        }
        EditText editText2 = INotificationSideChannelStub().tilFormalEducation.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: getSamsungS7ExtraCombinations
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isMotoE5Play.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        EditText editText3 = INotificationSideChannelStub().tilBankName.getEditText();
        if (editText3 != null) {
            editText3.setOnClickListener(new View.OnClickListener() { // from class: getExtraSupportedResolutions
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    isMotoE5Play.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
                }
            });
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdentityNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_invalid_field);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16), new accessconfigureInstanceInternal("^[0-9]{0,}$", string3)})));
        FragmentVocationalFillParticipantDataBinding fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout2 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout3 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout4 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilJamsostekIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        TextInputLayout textInputLayout5 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFormalEducation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string7 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
        TextInputLayout textInputLayout6 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        String string8 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout6, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string8))));
        TextInputLayout textInputLayout7 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
        String string9 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout7, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string9))));
        TextInputLayout textInputLayout8 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
        String string10 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout8, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string10))));
        TextInputLayout textInputLayout9 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankBranchOffice;
        Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
        String string11 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout9, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string11))));
        TextInputEditText textInputEditText = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.edtExpectedSalaries;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string12 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string12, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string12);
        String string13 = getString(R.string.error_invalid_field);
        Intrinsics.checkNotNullExpressionValue(string13, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal("^[0-9]{0,}$", string13)})));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() throws IllegalAccessException {
        boolean z;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - ExpandableListView.getPackedPositionGroup(0L)), Color.red(0) + 59, TextUtils.lastIndexOf("", '0', 0, 0) + 19, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37836), (-16777157) - Color.rgb(0, 0, 0), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 433;
        long j3 = -1;
        long j4 = 715598224075593877L ^ j3;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = (((long) (-432)) * 715598224075593877L) + (((long) 434) * 4803655273084192362L) + ((((j4 | (jIdentityHashCode ^ j3)) | 4803655273084192362L) ^ j3) * j2) + (((long) (-433)) * (j4 | (((j3 ^ 4803655273084192362L) | jIdentityHashCode) ^ j3))) + (j2 * (((j4 | jIdentityHashCode) ^ j3) | (j3 ^ 5471402746361782015L)));
        long j6 = j;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j6 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j6 = j5;
        }
        if (i4 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46400), 39 - TextUtils.indexOf((CharSequence) "", '0'), 19 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            z = false;
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        } else {
            z = false;
        }
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(z);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    public static /* synthetic */ VocationalRegistration b(isMotoE5Play ismotoe5play) {
        Bundle arguments = ismotoe5play.getArguments();
        if (arguments != null) {
            return (VocationalRegistration) arguments.getParcelable("vocation_registration_data");
        }
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isMotoE5Play ismotoe5play, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ismotoe5play.write();
            applyQuirks applyquirks = (applyQuirks) ismotoe5play.asInterface.getValue();
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list, "");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((Bank) it.next()));
            }
            applyquirks.b = arrayList;
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ismotoe5play.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ismotoe5play.write();
            String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str != null ? str : "", 0).show();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isMotoE5Play ismotoe5play, Bank bank) {
        Intrinsics.checkNotNullParameter(bank, "");
        TextInputLayout textInputLayout = ismotoe5play.INotificationSideChannelStub().tilBankName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        retrieveConcurrentCameraIds.b(textInputLayout, bank.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        ismotoe5play.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bank;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x015e  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(isMotoE5Play ismotoe5play, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ismotoe5play.write();
            if (((setMediaCapabilitiesForTranscoding) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).b <= 80.0f) {
                Context contextRequireContext = ismotoe5play.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String string = ismotoe5play.getString(R.string.message_account_similarity_error);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_LifecycleCameraRepository_Key.b(contextRequireContext, string);
                return;
            }
            MutableLiveData<VirtualCameraAdapter1<setMediaCapabilitiesForTranscoding>> mutableLiveData = ((PreviewDelayWhenVideoCaptureIsBoundQuirk) ismotoe5play.b.getValue()).b;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.postValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Function2<? super VocationRegistrationStep, ? super VocationalRegistration, Unit> function2 = ismotoe5play.asBinder;
            if (function2 != null) {
                VocationRegistrationStep vocationRegistrationStep = VocationRegistrationStep.STEP_2;
                FragmentVocationalFillParticipantDataBinding fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub = ismotoe5play.INotificationSideChannelStub();
                VocationalRegistration vocationalRegistration = (VocationalRegistration) ismotoe5play.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (vocationalRegistration != null) {
                    TextInputLayout textInputLayout = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilIdentityNumber;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                    vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    TextInputLayout textInputLayout2 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFullName;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout2);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    TextInputLayout textInputLayout3 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilAddress;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout3);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    vocationalRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    TextInputLayout textInputLayout4 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilJamsostekIdNumber;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout4);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault5, "");
                    vocationalRegistration.b = strTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    TextInputLayout textInputLayout5 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilExpertiseArea;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout5);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault6, "");
                    vocationalRegistration.d = strTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    TextInputLayout textInputLayout6 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilFormalEducation;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout6);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault7, "");
                    vocationalRegistration.a = strTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    TextInputLayout textInputLayout7 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilNpwp;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout7);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault8, "");
                    vocationalRegistration.g = strTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                    vocationalRegistration.notify = ismotoe5play.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    TextInputLayout textInputLayout8 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountName;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout8);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault9, "");
                    vocationalRegistration.onTransact = strTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                    TextInputLayout textInputLayout9 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankAccountNumber;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault10 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout9);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault10, "");
                    vocationalRegistration.INotificationSideChannel = strTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                    TextInputLayout textInputLayout10 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilBankBranchOffice;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault11 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout10);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault11, "");
                    vocationalRegistration.cancelAll = strTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                    TextInputLayout textInputLayout11 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilWorkExperience;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault12 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout11);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault12, "");
                    vocationalRegistration.asInterface = strTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                    TextInputLayout textInputLayout12 = fragmentVocationalFillParticipantDataBindingINotificationSideChannelStub.tilExpectedSalaries;
                    Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault13 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout12);
                    Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault13, "");
                    vocationalRegistration.asBinder = strTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                    User user = (User) ismotoe5play.g.getValue();
                    String str = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    if (str == null) {
                        str = "";
                    }
                    Intrinsics.checkNotNullParameter(str, "");
                    vocationalRegistration.RemoteActionCompatParcelizer = str;
                    User user2 = (User) ismotoe5play.g.getValue();
                    String str2 = user2 != null ? user2.notify : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Intrinsics.checkNotNullParameter(str2, "");
                    vocationalRegistration.INotificationSideChannelDefault = str2;
                    User user3 = (User) ismotoe5play.g.getValue();
                    String str3 = user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    Intrinsics.checkNotNullParameter(str3, "");
                    vocationalRegistration.INotificationSideChannelStubProxy = str3;
                    User user4 = (User) ismotoe5play.g.getValue();
                    String str4 = user4 != null ? user4.asInterface : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    Intrinsics.checkNotNullParameter(str4, "");
                    vocationalRegistration.cancel = str4;
                    SubscribedProgram subscribedProgram = ismotoe5play.TuitionPaymentFragmentbindingInflater1;
                    String str5 = subscribedProgram != null ? subscribedProgram.b : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    Intrinsics.checkNotNullParameter(str5, "");
                    vocationalRegistration.IconCompatParcelizer = str5;
                    vocationalRegistration.TuitionPaymentFragmentbindingInflater1 = ismotoe5play.TuitionPaymentFragmentbindingInflater1;
                    if (vocationalRegistration == null) {
                        vocationalRegistration = new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
                    }
                } else {
                    vocationalRegistration = new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
                }
                function2.invoke(vocationRegistrationStep, vocationalRegistration);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ismotoe5play.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ismotoe5play.write();
            String str6 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str6 != null ? str6 : "", 0).show();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(isMotoE5Play ismotoe5play, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getCurrentIndex getcurrentindex = (getCurrentIndex) ismotoe5play.a.getValue();
            FragmentManager childFragmentManager = ismotoe5play.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcurrentindex.show(childFragmentManager, getcurrentindex.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(isMotoE5Play ismotoe5play, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNull(view);
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, ismotoe5play.requireContext());
            RequestMonitor requestMonitor = (RequestMonitor) ismotoe5play.d.getValue();
            FragmentManager childFragmentManager = ismotoe5play.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(requestMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                requestMonitor.show(childFragmentManager, requestMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void b(isMotoE5Play ismotoe5play, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            applyQuirks applyquirks = (applyQuirks) ismotoe5play.asInterface.getValue();
            FragmentManager childFragmentManager = ismotoe5play.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(applyquirks.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                applyquirks.show(childFragmentManager, applyquirks.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isMotoE5Play ismotoe5play, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) ismotoe5play.b.getValue();
        TextInputLayout textInputLayout = ismotoe5play.INotificationSideChannelStub().tilBankAccountName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout);
        TextInputLayout textInputLayout2 = ismotoe5play.INotificationSideChannelStub().tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputLayout2);
        Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Intrinsics.checkNotNullParameter(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        MutableLiveData<VirtualCameraAdapter1<setMediaCapabilitiesForTranscoding>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AccountNameSimilarityRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault2))));
        final Function1 function1 = new Function1() { // from class: AutoFlashAEModeDisabler
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewDelayWhenVideoCaptureIsBoundQuirk, (setMediaCapabilitiesForTranscoding) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getCorrectedAeMode
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ExcludedSupportedSizesContainer
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj);
            }
        };
        derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CameraCharacteristicsProvider
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getCurrentIndex TuitionPaymentFragmentbindingInflater1(final isMotoE5Play ismotoe5play) {
        getCurrentIndex.Companion companion = getCurrentIndex.INSTANCE;
        User user = (User) ismotoe5play.g.getValue();
        List<SubscribedProgram> listEmptyList = user != null ? user.INotificationSideChannel : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return getCurrentIndex.Companion.TuitionPaymentFragmentbindingInflater1(listEmptyList, new Function1() { // from class: isAffectedModel
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isMotoE5Play.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (SubscribedProgram) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isMotoE5Play ismotoe5play, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TextInputLayout textInputLayout = ismotoe5play.INotificationSideChannelStub().tilFormalEducation;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        retrieveConcurrentCameraIds.b(textInputLayout, str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RequestMonitor TuitionPaymentFragmentspecialinlinedviewModeldefault3(final isMotoE5Play ismotoe5play) {
        RequestMonitor.Companion companion = RequestMonitor.INSTANCE;
        return RequestMonitor.Companion.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getMotoE5PlayExtraSupportedResolutions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isMotoE5Play.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (String) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(getViewLifecycleOwner(), new Observer() { // from class: createLevel3PrivPrivYuvSubsetConfiguration
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                isMotoE5Play.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue()).b.observe(this, new Observer() { // from class: supportExtraLevel3ConfigurationsSamsungDevice
            private static final byte[] $$c = {87, 51, -85, 78};
            private static final int $$f = 214;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {12, -88, 33, 118, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
            private static final int $$e = 248;
            private static final byte[] $$a = {68, -119, -76, 97, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
            private static final int $$b = 11;
            private static int asInterface = 0;
            private static int g = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2771688839126548875L;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 20071;
            private static char TuitionPaymentFragmentbindingInflater1 = 33008;
            private static char b = 29073;
            private static char d = 54115;

            private static void e(short s, short s2, int i, Object[] objArr) {
                int i2 = 115 - (i * 3);
                int i3 = 65 - s2;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[34 - s];
                int i4 = 33 - s;
                int i5 = -1;
                if (bArr == null) {
                    i2 = (i2 + i4) - 2;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i2;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i3++;
                        i2 = (i2 + bArr[i3]) - 2;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 52
                    int r8 = 53 - r8
                    int r6 = r6 * 52
                    int r6 = r6 + 4
                    byte[] r0 = defpackage.supportExtraLevel3ConfigurationsSamsungDevice.$$d
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L27
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    r3 = r0[r6]
                L27:
                    int r7 = r7 + r3
                    int r6 = r6 + 1
                    int r7 = r7 + (-10)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.supportExtraLevel3ConfigurationsSamsungDevice.f(byte, byte, short, java.lang.Object[]):void");
            }

            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 5;
                g = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    isMotoE5Play.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
                    obj2.hashCode();
                    throw null;
                }
                isMotoE5Play.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
                int i3 = g + 25;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $11 + 97;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 64838), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1355, ((Process.getThreadPriority(0) + 20) >> 6) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 47773), (-16776748) - Color.rgb(0, 0, 0), 13 - ((Process.getThreadPriority(0) + 20) >> 6), 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                int i6 = $11 + 95;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 0 / 0;
                }
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i4 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        return;
                    }
                    int i5 = $10 + 27;
                    $11 = i5 % 128;
                    int i6 = 58224;
                    char c = 1;
                    if (i5 % 2 == 0) {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        int i7 = oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr3[1] = cArr[0];
                        i2 = 1;
                    } else {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        i2 = 0;
                    }
                    while (i2 < 16) {
                        int i8 = $10 + 19;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        char c2 = cArr3[c];
                        char c3 = cArr3[i4];
                        int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                        int i11 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(d);
                            objArr2[2] = Integer.valueOf(i11);
                            objArr2[c] = Integer.valueOf(i10);
                            objArr2[i4] = Integer.valueOf(c2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char threadPriority = (char) (47773 - ((Process.getThreadPriority(i4) + 20) >> 6));
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 468;
                                int maxKeyCode = 13 - (KeyEvent.getMaxKeyCode() >> 16);
                                Class[] clsArr = new Class[4];
                                clsArr[i4] = Integer.TYPE;
                                clsArr[c] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, tapTimeout, maxKeyCode, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 47773), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 469, 13 - (ViewConfiguration.getScrollBarSize() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i2++;
                            int i12 = $11 + 59;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            i4 = 0;
                            c = 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2322 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 44 - ExpandableListView.getPackedPositionType(0L), -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 71701. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r45, int r46, int r47, int r48) {
                /*
                    Method dump skipped, instruction units count: 7170
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.supportExtraLevel3ConfigurationsSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r7, byte r8, int r9) {
                /*
                    int r9 = r9 + 107
                    int r8 = r8 * 3
                    int r8 = r8 + 4
                    int r7 = r7 * 4
                    int r7 = 1 - r7
                    byte[] r0 = defpackage.supportExtraLevel3ConfigurationsSamsungDevice.$$c
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r9
                    r4 = r2
                    r9 = r8
                    goto L28
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L28:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r9 = r9 + 1
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.supportExtraLevel3ConfigurationsSamsungDevice.$$g(int, byte, int):java.lang.String");
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        VocationalRegistration vocationalRegistration = (VocationalRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (vocationalRegistration != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = vocationalRegistration.notify;
            this.TuitionPaymentFragmentbindingInflater1 = vocationalRegistration.TuitionPaymentFragmentbindingInflater1;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isMotoE5Play ismotoe5play, SubscribedProgram subscribedProgram) {
        Intrinsics.checkNotNullParameter(subscribedProgram, "");
        ismotoe5play.TuitionPaymentFragmentbindingInflater1 = subscribedProgram;
        ismotoe5play.INotificationSideChannelStub().edtChooseJamsostekIdNumber.setText(subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TextInputLayout textInputLayout = ismotoe5play.INotificationSideChannelStub().tilJamsostekIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String str = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        retrieveConcurrentCameraIds.b(textInputLayout, str != null ? str : "");
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) this.b.getValue();
        if (previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue() instanceof VirtualCameraAdapter1.asBinder) {
            return;
        }
        MutableLiveData<VirtualCameraAdapter1<List<Bank>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.b(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: isMotorolaMotoG3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.b(previewDelayWhenVideoCaptureIsBoundQuirk, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ZslDisablerQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: shouldForceClose
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.asInterface(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ForceCloseCaptureSessionOnConfigured
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ applyQuirks TuitionPaymentFragmentspecialinlinedviewModeldefault2(final isMotoE5Play ismotoe5play) {
        applyQuirks.Companion companion = applyQuirks.INSTANCE;
        return applyQuirks.Companion.b(ismotoe5play.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Function1() { // from class: supportExtraLevel3ConfigurationsGoogleDevice
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isMotoE5Play.TuitionPaymentFragmentbindingInflater1(this.b, (Bank) obj);
            }
        });
    }
}
