package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
import com.bpjstku.data.jht.model.request.ClaimCheckBankBpuReactivationRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.databinding.FragmentClaimOldDataSecurityFundProcessBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.jht.model.BenefitDetail;
import com.bpjstku.domain.jht.model.JhtEligibility;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityFundProcessFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.DecorContentParent;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getExtendedConfig;
import defpackage.getFocusY;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0015\u0010\f\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0018\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0017\u0010\u0010\u001a\u0004\u0018\u00010#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001e0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010\u0014\u001a\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010'R.\u0010-\u001a\u001c\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00020(8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010,"}, d2 = {"LopenCaptureSession;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentClaimOldDataSecurityFundProcessBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelDefault", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "cancel", "INotificationSideChannel", "LgetStringOrNull;", "a", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCamera2CameraControlImplExternalSyntheticLambda4;", "asBinder", "Lkotlin/Lazy;", "LgetExtendedConfig;", "asInterface", "b", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/jht/model/BenefitDetail;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/jht/model/BenefitDetail;", "", "Ljava/lang/String;", "d", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "", "Ljava/util/List;", "", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "notify"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class openCaptureSession extends AutoValue_ImmutableImageInfo<FragmentClaimOldDataSecurityFundProcessBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String d;
    private BenefitDetail TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final List<String> g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CodeNamePair asInterface;

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return R.layout.fragment_claim_old_data_security_fund_process;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public openCaptureSession() {
        final openCaptureSession opencapturesession = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityFundProcessFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = opencapturesession;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
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
        final openCaptureSession opencapturesession2 = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityFundProcessFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = opencapturesession2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.b = LazyKt.lazy(new Function0<getExtendedConfig>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityFundProcessFragment$special$$inlined$sharedViewModel$default$2
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {58, -51, 54, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 190;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static long b = 1071765204397469411L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 2
                    int r7 = 84 - r7
                    int r9 = r9 + 4
                    int r8 = r8 * 15
                    int r8 = r8 + 38
                    byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityFundProcessFragment$special$$inlined$sharedViewModel$default$2.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r7 = r9
                    r5 = r2
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L2a:
                    int r9 = r9 + r3
                    int r9 = r9 + (-11)
                    int r7 = r7 + 1
                    r3 = r5
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDataSecurityFundProcessFragment$special$$inlined$sharedViewModel$default$2.a(byte, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:47:0x0197  */
            /* JADX WARN: Code duplicated, block: B:48:0x0198  */
            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                Object obj;
                Throwable cause;
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (true) {
                    obj = null;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i3 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 19472), 2624 - View.MeasureSpec.getMode(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                        try {
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 481, 37 - TextUtils.getOffsetAfter("", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause2 = th.getCause();
                            if (cause2 == null) {
                                throw th;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th2) {
                        Throwable cause3 = th2.getCause();
                        if (cause3 == null) {
                            throw th2;
                        }
                        throw cause3;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                int i4 = $10 + 95;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i6 = $11 + 61;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39421), (ViewConfiguration.getJumpTapTimeout() >> 16) + 481, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        obj.hashCode();
                        throw null;
                    }
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39421), TextUtils.getCapsMode("", 0, 0) + 481, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th3) {
                        cause = th3.getCause();
                        if (cause != null) {
                            throw th3;
                        }
                        throw cause;
                    }
                    cause = th3.getCause();
                    if (cause != null) {
                        throw th3;
                    }
                    throw cause;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Type inference failed for: r0v32, types: [androidx.lifecycle.ViewModel, getExtendedConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ getExtendedConfig invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                int i4 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                    int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, keyRepeatTimeout, longPressTimeout, 986134021, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{34713, 253, 35146, 4555, 39483, 8838, 43806, 13371, 48335, 17736, 52728, 22066, 56965, 26596, 57430, 26840, 61733, 31136, 530, 35686, 5063, 40020}, 34667 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{34717, 50323, 407, 20125, 35735, 51390, 5558, 21147, 40869, 56486, 6610, 26305, 41925, 57550, 11775}, Color.green(0) + 17159, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int i5 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int gidForName = 22 - Process.getGidForName("");
                    byte[] bArr = $$a;
                    byte b4 = bArr[7];
                    byte b5 = bArr[28];
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, (byte) (b5 | 36), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, i5, gidForName, 1596667560, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                        int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[7];
                        byte b7 = bArr2[28];
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, (byte) (b7 | 88), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, packedPositionGroup, 1599039318, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[0])[0];
                    objArr = new Object[]{new int[]{i6}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i7 = ((1203717843 + (((~iIdentityHashCode) | 303304250) * 1324)) + (((~(iIdentityHashCode | (-99283078))) | (~(311885503 | iIdentityHashCode))) * (-1324))) - 1769174963;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{34706, 19982, 5280, 56156, 41354, 26727, 15891, 1207, 52007, 37273, 22605, 12028, 62623, 47911, 33247, 18508}, 51607 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{34705, 19625, 4599, 58889, 43864, 32664, 17586, 2546, 56856, 41796, 30617, 15575, 455, 54822, 39802, 28550}, TextUtils.getTrimmedLength("") + 52021, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr10 = {-930725579};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - TextUtils.getOffsetAfter("", 0)), 1726 - View.combineMeasuredStates(0, 0), 29 - View.MeasureSpec.getMode(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1364808927);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                            int iBlue = 1755 - Color.blue(0);
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                            byte[] bArr3 = $$a;
                            byte b8 = bArr3[7];
                            byte b9 = bArr3[28];
                            Object[] objArr11 = new Object[1];
                            a(b8, b9, (byte) (b9 | 88), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout2, iBlue, capsMode, 1599039318, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(new char[]{34713, 253, 35146, 4555, 39483, 8838, 43806, 13371, 48335, 17736, 52728, 22066, 56965, 26596, 57430, 26840, 61733, 31136, 530, 35686, 5063, 40020}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34667, objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(new char[]{34717, 50323, 407, 20125, 35735, 51390, 5558, 21147, 40869, 56486, 6610, 26305, 41925, 57550, 11775}, 17159 - Color.red(0), objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char mirror = (char) (29992 - AndroidCharacter.getMirror('0'));
                                int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1756;
                                int i11 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                byte[] bArr4 = $$a;
                                byte b10 = bArr4[7];
                                byte b11 = bArr4[28];
                                Object[] objArr14 = new Object[1];
                                a(b10, b11, (byte) (b11 | 36), objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, i10, i11, 1596667560, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char capsMode2 = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                                int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                                byte b12 = $$a[7];
                                byte b13 = b12;
                                Object[] objArr15 = new Object[1];
                                a(b12, b13, b13, objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode2, offsetBefore, fadingEdgeLength, 986134021, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                            objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
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
                if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    while (i4 < strArr.length) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        if (i12 % 2 != 0) {
                            arrayList.add(strArr[i4]);
                            i4 += 65;
                        } else {
                            arrayList.add(strArr[i4]);
                            i4++;
                        }
                    }
                    throw null;
                }
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((int[]) objArr[3])[0];
                int i16 = ((int[]) objArr[0])[0];
                Object[] objArr16 = {new int[]{i16}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i17 = ~iUptimeMillis;
                int i18 = i15 + 1353485922 + (((-156504657) | i17) * (-369)) + (((~((-914614447) | i17)) | (-702012021)) * (-369)) + (((~(iUptimeMillis | 914614446)) | (-1071119103) | (~(i17 | (-545507365)))) * 369);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                if (i21 % 2 == 0) {
                    return getFocusY.b(opencapturesession2, Reflection.getOrCreateKotlinClass(getExtendedConfig.class), this.$qualifier, function0, this.$parameters);
                }
                getFocusY.b(opencapturesession2, Reflection.getOrCreateKotlinClass(getExtendedConfig.class), this.$qualifier, function0, this.$parameters);
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: tryOpenCameraDevice
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getExtendedConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            }
        });
        this.d = "";
        this.a = LazyKt.lazy(new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((Camera2CameraControlImplExternalSyntheticLambda4) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).INotificationSideChannelDefault.b();
            }
        });
        this.g = CollectionsKt.listOf((Object[]) new String[]{"0000000000000000", "1111111111111111", "2222222222222222", "3333333333333333", "4444444444444444", "5555555555555555", "6666666666666666", "7777777777777777", "8888888888888888", "9999999999999999", "000000000000000", "111111111111111", "222222222222222", "333333333333333", "444444444444444", "555555555555555", "666666666666666", "777777777777777", "888888888888888", "999999999999999"});
    }

    /* JADX INFO: renamed from: openCaptureSession$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LopenCaptureSession$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LopenCaptureSession;", "TuitionPaymentFragmentbindingInflater1", "()LopenCaptureSession;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static openCaptureSession TuitionPaymentFragmentbindingInflater1() {
            return new openCaptureSession();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDataSecurityFundProcessBinding> d() {
        return ClaimOldDataSecurityFundProcessFragment$bindingInflater$1.b;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        final FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilNPWP;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_npwp_max_length);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub));
            }
        }, string))));
        TextInputLayout textInputLayout2 = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankAccountNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.error_bank_account_number_invalid);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string3), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string4, 1, 16)})));
        TextInputLayout textInputLayout4 = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankAccountName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub = INotificationSideChannelStub();
        fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankName.setEndIconOnClickListener(new View.OnClickListener() { // from class: setPrimary
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                openCaptureSession.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub, view);
            }
        });
        MaterialButton materialButton = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: tryForceOpenCameraDevice
            private static final byte[] $$c = {110, -73, -111, 99};
            private static final int $$f = 254;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {70, -114, 113, 8, -4, 11, 11, 19, 10, -6, 22, -38, 39, 21, 1, 22, -8, -52, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57};
            private static final int $$e = 118;
            private static final byte[] $$a = {102, -96, -78, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 164;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int d = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {60040, 60059, 60063, 60117, 60053, 60073, 60042, 60072, 60047, 60045, 60054, 60046, 60056, 60079, 60062, 60048, 60090, 60044, 60050, 59746, 60061, 59744, 59747, 60058, 60052, 60060, 60049, 60055, 59745, 60088, 60041, 60057, 60043, 60034, 60051, 60083};
            private static char b = 57191;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 14
                    int r7 = 98 - r7
                    byte[] r0 = defpackage.tryForceOpenCameraDevice.$$a
                    int r1 = 53 - r6
                    int r5 = r5 + 4
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L29
                L15:
                    r3 = r2
                L16:
                    int r5 = r5 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L25:
                    r4 = r0[r5]
                    int r3 = r3 + 1
                L29:
                    int r7 = r7 + r4
                    int r7 = r7 + (-10)
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tryForceOpenCameraDevice.a(int, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(int r5, byte r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = defpackage.tryForceOpenCameraDevice.$$d
                    int r5 = r5 * 52
                    int r5 = 55 - r5
                    int r6 = r6 * 30
                    int r6 = 114 - r6
                    int r7 = r7 * 2
                    int r1 = r7 + 53
                    byte[] r1 = new byte[r1]
                    int r7 = r7 + 52
                    r2 = 0
                    if (r0 != 0) goto L18
                    r4 = r7
                    r3 = r2
                    goto L2c
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r5 = r5 + 1
                    int r3 = r3 + 1
                    r4 = r0[r5]
                L2c:
                    int r6 = r6 + r4
                    int r6 = r6 + (-9)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tryForceOpenCameraDevice.e(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0239  */
            /* JADX WARN: Code duplicated, block: B:27:0x023b  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                d = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 921;
                    int i4 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, (byte) (b2 & 52), bArr[80], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iResolveSizeAndState, i4, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{22, 5, 0, ' ', 30, 24, 3, 4, 30, 6, 1, '\t', 30, 3, 14, 20, 11, 28, 28, 25, '\r', 16}, (byte) (Color.alpha(0) + 58), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{15, 26, 20, '#', 2, '\f', 3, 0, 17, 20, 26, '\t', 22, 6, 13851}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27), Process.getGidForName("") + 16, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                    int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 28;
                    byte[] bArr2 = $$a;
                    Object[] objArr5 = new Object[1];
                    a(bArr2[7], bArr2[80], bArr2[37], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, longPressTimeout, trimmedLength, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) 51, bArr3[33], bArr3[37], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarSize, touchSlop, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i7 = 119615935 + (((~(1572715471 | iUptimeMillis)) | 201364172) * (-756)) + (((~iUptimeMillis) | 1572715471) * 756) + 722682154;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{22, 5, 0, ' ', 30, 24, 3, 4, 20, '#', '!', 2, 17, '\r', 6, 20, 6, 21, '\t', ' ', 16, 31, ' ', '\f', 20, 5}, (byte) (View.resolveSizeAndState(0, 0, 0) + 87), 26 - TextUtils.indexOf("", "", 0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{17, 6, 13820, 13820, 16, 2, '\n', 14, 13822, 13822, 24, 21, 17, 18, 6, 20, 28, 0}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 20), KeyEvent.keyCodeFromString("") + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                            d = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 97 / 0;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    applicationContext = null;
                                }
                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{29, 20, 11, 21, '\t', '!', 22, 5, 27, 1, '\t', 31, 2, 6, 16, '\b'}, (byte) (45 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{20, 0, 16, 2, 6, 20, '\t', ' ', 5, 29, 4, 30, 24, 25, '\b', 20}, (byte) ((Process.myTid() >> 22) + 99), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 722682154};
                        byte[] bArr4 = $$d;
                        byte b3 = bArr4[14];
                        byte b4 = bArr4[89];
                        Object[] objArr13 = new Object[1];
                        e(b3, b4, b4, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b5 = bArr4[89];
                        Object[] objArr14 = new Object[1];
                        e(b5, bArr4[14], b5, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int iRed = Color.red(0) + 921;
                            int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr15 = new Object[1];
                            a((byte) 51, bArr5[33], bArr5[37], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iRed, iMakeMeasureSpec, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{22, 5, 0, ' ', 30, 24, 3, 4, 30, 6, 1, '\t', 30, 3, 14, 20, 11, 28, 28, 25, '\r', 16}, (byte) (58 - View.MeasureSpec.getMode(0)), TextUtils.indexOf("", "", 0) + 22, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{15, 26, 20, '#', 2, '\f', 3, 0, 17, 20, 26, '\t', 22, 6, 13851}, (byte) (28 - View.MeasureSpec.getMode(0)), 15 - ExpandableListView.getPackedPositionGroup(0L), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                                int scrollBarFadeDuration = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte[] bArr6 = $$a;
                                Object[] objArr18 = new Object[1];
                                a(bArr6[7], bArr6[80], bArr6[37], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, keyRepeatTimeout, scrollBarFadeDuration, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 921;
                                int scrollBarSize2 = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                                byte[] bArr7 = $$a;
                                byte b6 = bArr7[7];
                                Object[] objArr19 = new Object[1];
                                a(b6, (byte) (b6 & 52), bArr7[80], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, capsMode, scrollBarSize2, -1048449946, false, (String) objArr19[0], null);
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
                if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    for (String str : strArr) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                        d = i12 % 128;
                        int i13 = i12 % 2;
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i14 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i15 = i14 + 2139271263 + ((~((~iIdentityHashCode) | 1568517527)) * (-116)) + ((494513431 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | (-1279566213))) | 205562116) * 116);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr20[0])[0] = i17 ^ (i17 << 5);
                return openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub, this, (View) obj);
            }

            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                int i5 = 1770390596;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $10 + 45;
                        $11 = i7 % 128;
                        int i8 = i7 % i3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 2266 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.rgb(0, 0, 0) + 16777249, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i6++;
                            i3 = 2;
                            i5 = 1770390596;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 2267 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        int i9 = $10 + 79;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b2);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            } else {
                                try {
                                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b7 = (byte) 1;
                                        byte b8 = (byte) (b7 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 3261 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                        int i11 = $10 + 91;
                                        $11 = i11 % 128;
                                        int i12 = i11 % 2;
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            byte b9 = (byte) 3;
                                            byte b10 = (byte) (b9 - 3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 595, 17 - View.resolveSize(0, 0), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i14 = $11 + 75;
                                        $10 = i14 % 128;
                                        int i15 = i14 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                    } else {
                                        int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        }
                    }
                    for (int i20 = 0; i20 < i; i20++) {
                        int i21 = $10 + 21;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                        cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }

            private static String $$g(byte b2, int i, int i2) {
                int i3 = i2 * 3;
                int i4 = b2 + 113;
                int i5 = 4 - (i * 3);
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[1 - i3];
                int i6 = 0 - i3;
                int i7 = -1;
                if (bArr == null) {
                    i5++;
                    i4 += i5;
                    i7 = -1;
                }
                while (true) {
                    int i8 = i7 + 1;
                    bArr2[i8] = (byte) i4;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    byte b3 = bArr[i5];
                    i5++;
                    i4 = b3 + i4;
                    i7 = i8;
                }
            }
        }));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_step_third_claim_jht", "submit_claim_jht_step_third_npwp_bank_account"));
        Intrinsics.checkNotNullParameter("submit_claim_jht_step_third_npwp_bank_account", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_claim_jht_step_third_npwp_bank_account", mapMutableMapOf);
        Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        EditText editText = INotificationSideChannelStub().tilBankAccountName.getEditText();
        String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
        EditText editText2 = INotificationSideChannelStub().tilBankAccountNumber.getEditText();
        String string2 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
        CodeNamePair codeNamePair = this.asInterface;
        String str = codeNamePair != null ? codeNamePair.b : null;
        if (str == null) {
            str = "";
        }
        CodeNamePair codeNamePair2 = this.asInterface;
        String str2 = codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CheckBankAccountRequest(str, str2 != null ? str2 : "", string, string2));
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(openCaptureSession opencapturesession, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Double dValueOf;
        String str2;
        Double dValueOf2;
        String str3;
        Double dValueOf3;
        String str4;
        Double dValueOf4;
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String str5;
        boolean z = false;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            opencapturesession.IconCompatParcelizer();
            str = "loading_claim_jht_step_third_npwp_bank_account_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            opencapturesession.write();
            JhtEligibility jhtEligibility = (JhtEligibility) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            BenefitDetail benefitDetail = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str6 = benefitDetail != null ? benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            Intrinsics.checkNotNull(str6);
            double d = 0.0d;
            if (str6.length() == 0) {
                dValueOf = Double.valueOf(0.0d);
            } else {
                BenefitDetail benefitDetail2 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                dValueOf = (benefitDetail2 == null || (str2 = benefitDetail2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) ? null : Double.valueOf(Double.parseDouble(str2));
            }
            BenefitDetail benefitDetail3 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            String str7 = benefitDetail3 != null ? benefitDetail3.g : null;
            Intrinsics.checkNotNull(str7);
            if (str7.length() == 0) {
                dValueOf2 = Double.valueOf(0.0d);
            } else {
                BenefitDetail benefitDetail4 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                dValueOf2 = (benefitDetail4 == null || (str3 = benefitDetail4.g) == null) ? null : Double.valueOf(Double.parseDouble(str3));
            }
            BenefitDetail benefitDetail5 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            String str8 = benefitDetail5 != null ? benefitDetail5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            Intrinsics.checkNotNull(str8);
            if (str8.length() == 0) {
                dValueOf3 = Double.valueOf(0.0d);
            } else {
                BenefitDetail benefitDetail6 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                dValueOf3 = (benefitDetail6 == null || (str4 = benefitDetail6.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : Double.valueOf(Double.parseDouble(str4));
            }
            Intrinsics.checkNotNull(dValueOf);
            double dDoubleValue = dValueOf.doubleValue();
            Intrinsics.checkNotNull(dValueOf2);
            double dDoubleValue2 = dValueOf2.doubleValue();
            BenefitDetail benefitDetail7 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            String str9 = benefitDetail7 != null ? benefitDetail7.d : null;
            Intrinsics.checkNotNull(str9);
            if (str9.length() != 0) {
                BenefitDetail benefitDetail8 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                if (benefitDetail8 == null || (str5 = benefitDetail8.d) == null) {
                    dValueOf4 = null;
                } else {
                    d = Double.parseDouble(str5);
                    dValueOf4 = Double.valueOf(d);
                }
            } else {
                dValueOf4 = Double.valueOf(d);
            }
            Intrinsics.checkNotNull(dValueOf3);
            double dDoubleValue3 = dValueOf3.doubleValue();
            Intrinsics.checkNotNull(dValueOf4);
            double dDoubleValue4 = dValueOf4.doubleValue();
            if (jhtEligibility.b) {
                opencapturesession.d = jhtEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                IndividualDataClaim individualDataClaim = (IndividualDataClaim) opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (individualDataClaim != null) {
                    EditText editText = opencapturesession.INotificationSideChannelStub().tilNPWP.getEditText();
                    String strValueOf5 = String.valueOf(editText != null ? editText.getText() : null);
                    CodeNamePair codeNamePair = opencapturesession.asInterface;
                    String str10 = codeNamePair != null ? codeNamePair.b : null;
                    String str11 = str10 == null ? "" : str10;
                    CodeNamePair codeNamePair2 = opencapturesession.asInterface;
                    String str12 = codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    String str13 = str12 == null ? "" : str12;
                    EditText editText2 = opencapturesession.INotificationSideChannelStub().tilBankAccountName.getEditText();
                    String string = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                    EditText editText3 = opencapturesession.INotificationSideChannelStub().tilBankAccountNumber.getEditText();
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                    String str14 = jhtEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    BenefitDetail benefitDetail9 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str15 = benefitDetail9 != null ? benefitDetail9.INotificationSideChannel : null;
                    Intrinsics.checkNotNull(str15);
                    if (str15.length() == 0) {
                        strValueOf = "0.00";
                    } else {
                        BenefitDetail benefitDetail10 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf = String.valueOf(benefitDetail10 != null ? benefitDetail10.INotificationSideChannel : null);
                    }
                    BenefitDetail benefitDetail11 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str16 = benefitDetail11 != null ? benefitDetail11.cancel : null;
                    Intrinsics.checkNotNull(str16);
                    if (str16.length() == 0) {
                        strValueOf2 = "0.00";
                    } else {
                        BenefitDetail benefitDetail12 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf2 = String.valueOf(benefitDetail12 != null ? benefitDetail12.cancel : null);
                    }
                    BenefitDetail benefitDetail13 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str17 = benefitDetail13 != null ? benefitDetail13.RemoteActionCompatParcelizer : null;
                    Intrinsics.checkNotNull(str17);
                    if (str17.length() == 0) {
                        strValueOf3 = "0.00";
                    } else {
                        BenefitDetail benefitDetail14 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf3 = String.valueOf(benefitDetail14 != null ? benefitDetail14.RemoteActionCompatParcelizer : null);
                    }
                    BenefitDetail benefitDetail15 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str18 = benefitDetail15 != null ? benefitDetail15.INotificationSideChannelStub : null;
                    Intrinsics.checkNotNull(str18);
                    if (str18.length() == 0) {
                        strValueOf4 = "0.00";
                    } else {
                        BenefitDetail benefitDetail16 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf4 = String.valueOf(benefitDetail16 != null ? benefitDetail16.INotificationSideChannelStub : null);
                    }
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, strValueOf5, null, null, null, "BANK", str11, str13, string2, string, null, null, null, null, null, null, null, null, str14, false, null, null, null, null, null, null, null, null, String.valueOf(dDoubleValue + dDoubleValue2), String.valueOf(dDoubleValue3 + dDoubleValue4), strValueOf, strValueOf2, strValueOf3, strValueOf4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -16840833, -253, 127, null);
                } else {
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                }
                IndividualDataClaim individualDataClaim2 = (IndividualDataClaim) opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (!Intrinsics.areEqual(String.valueOf(individualDataClaim2 != null ? individualDataClaim2.MediaBrowserCompatMediaBrowserImplApi211 : null), "Y")) {
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                    lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, z, 2, defaultConstructorMarker);
                    Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                    lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
                } else {
                    final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    IndividualDataClaim individualDataClaim3 = (IndividualDataClaim) opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    String strValueOf6 = String.valueOf(individualDataClaim3 != null ? individualDataClaim3.asInterface : null);
                    CodeNamePair codeNamePair3 = opencapturesession.asInterface;
                    String str19 = codeNamePair3 != null ? codeNamePair3.b : null;
                    if (str19 == null) {
                        str19 = "";
                    }
                    Intrinsics.checkNotNullParameter(strValueOf6, "");
                    Intrinsics.checkNotNullParameter(str19, "");
                    ClaimCheckBankBpuReactivationRequest claimCheckBankBpuReactivationRequest = new ClaimCheckBankBpuReactivationRequest(strValueOf6, str19);
                    MutableLiveData<VirtualCameraAdapter1<ClaimCheckBankBpuReactivationResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.asInterface;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(claimCheckBankBpuReactivationRequest)));
                    final Function1 function1 = new Function1() { // from class: Camera2CameraImpl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4, (ClaimCheckBankBpuReactivationResponse) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: getCameraManager
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: r8lambdaDM1g7HWFh_MhdVoV_qEN1ujSY5w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Camera2CameraControlImplExternalSyntheticLambda4.d(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: checkAndAttachRepeatingSurface
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            str = "success_claim_jht_step_third_npwp_bank_account_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            opencapturesession.write();
            getCameraState.Companion bVar2 = getCameraState.INSTANCE;
            String strValueOf7 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string3 = opencapturesession.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf7, string3);
            FragmentManager childFragmentManager = opencapturesession.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            str = "failure_claim_jht_step_third_npwp_bank_account_result";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_third", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBinding) {
        EditText editText = fragmentClaimOldDataSecurityFundProcessBinding.tilNPWP.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        String str = strValueOf;
        if (str.length() == 0 || StringsKt.isBlank(str) || strValueOf == null) {
            return true;
        }
        int length = strValueOf.length();
        return 15 <= length && length < 17;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(openCaptureSession opencapturesession, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        double d;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_benefit_detail_third_step", "loading_benefit_detail_third_step"));
            Intrinsics.checkNotNullParameter("loading_benefit_detail_third_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_benefit_detail_third_step", mapMutableMapOf);
            opencapturesession.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_benefit_detail_third_step", "success_benefit_detail_third_step"));
            Intrinsics.checkNotNullParameter("success_benefit_detail_third_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_benefit_detail_third_step", mapMutableMapOf2);
            opencapturesession.write();
            BenefitDetail benefitDetail = (BenefitDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(benefitDetail, "");
            opencapturesession.TuitionPaymentFragmentbindingInflater1 = benefitDetail;
            Double dValueOf = null;
            String str2 = benefitDetail != null ? benefitDetail.cancelAll : null;
            Intrinsics.checkNotNull(str2);
            if (str2.length() != 0) {
                BenefitDetail benefitDetail2 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                d = (benefitDetail2 == null || (str = benefitDetail2.cancelAll) == null) ? 0.0d : Double.parseDouble(str);
                if (dValueOf != null) {
                    if (dValueOf.doubleValue() >= 5.0E7d) {
                        opencapturesession.INotificationSideChannelStub().tvClaimNonSalariedWorkerInfo1.setVisibility(0);
                        return;
                    } else {
                        opencapturesession.INotificationSideChannelStub().tvClaimNonSalariedWorkerInfo1.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            dValueOf = Double.valueOf(d);
            if (dValueOf != null) {
                if (dValueOf.doubleValue() >= 5.0E7d) {
                    opencapturesession.INotificationSideChannelStub().tvClaimNonSalariedWorkerInfo1.setVisibility(0);
                    return;
                } else {
                    opencapturesession.INotificationSideChannelStub().tvClaimNonSalariedWorkerInfo1.setVisibility(8);
                    return;
                }
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_benefit_detail_third_step", "failure_benefit_detail_third_step"));
            Intrinsics.checkNotNullParameter("failure_benefit_detail_third_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_benefit_detail_third_step", mapMutableMapOf3);
            opencapturesession.write();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = opencapturesession.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = opencapturesession.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Terjadi kesalahan", string2, null, 112);
            FragmentManager childFragmentManager = opencapturesession.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    public static /* synthetic */ void b(final openCaptureSession opencapturesession, final FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getExposureControl.Companion bVar = getExposureControl.INSTANCE;
            getExposureControl getexposurecontrolTuitionPaymentFragmentbindingInflater1 = getExposureControl.Companion.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: updateCaptureSessionConfig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, fragmentClaimOldDataSecurityFundProcessBinding, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = opencapturesession.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getexposurecontrolTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getexposurecontrolTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, getexposurecontrolTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        openCaptureSession opencapturesession = this;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(opencapturesession, new Camera2CameraImplExternalSyntheticLambda11(this));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(opencapturesession, new Observer() { // from class: Camera2CameraImplExternalSyntheticLambda13
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface.observe(opencapturesession, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: Camera2CameraImplExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(openCaptureSession opencapturesession, FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBinding, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        opencapturesession.asInterface = codeNamePair;
        EditText editText = fragmentClaimOldDataSecurityFundProcessBinding.tilBankName.getEditText();
        if (editText != null) {
            editText.setText(codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBinding, final openCaptureSession opencapturesession, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        EditText editText = fragmentClaimOldDataSecurityFundProcessBinding.tilNPWP.getEditText();
        if (String.valueOf(editText != null ? editText.getText() : null).length() > 0) {
            EditText editText2 = fragmentClaimOldDataSecurityFundProcessBinding.tilNPWP.getEditText();
            int length = String.valueOf(editText2 != null ? editText2.getText() : null).length();
            if (15 > length || length >= 17) {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = opencapturesession.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Anda mengisi NPWP belum sesuai", "Pastikan Anda mengisi NPWP dengan benar", string, new Function0() { // from class: submitCaptureRequests
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                }, 96);
                opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getstringornullB;
                if (getstringornullB != null) {
                    FragmentManager childFragmentManager = opencapturesession.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            } else {
                EditText editText3 = fragmentClaimOldDataSecurityFundProcessBinding.tilNPWP.getEditText();
                if (Camera2CameraControlExternalSyntheticLambda5.b(String.valueOf(editText3 != null ? editText3.getText() : null), opencapturesession.g)) {
                    getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
                    String string2 = opencapturesession.getString(R.string.action_back);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    getStringOrNull getstringornullB2 = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Anda mengisi NPWP belum sesuai", "Pastikan Anda mengisi NPWP dengan benar", string2, new Function0() { // from class: setActiveResumingMode
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return openCaptureSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    }, 96);
                    opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getstringornullB2;
                    if (getstringornullB2 != null) {
                        FragmentManager childFragmentManager2 = opencapturesession.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                        Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                        if (childFragmentManager2.findFragmentByTag(getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                            getstringornullB2.show(childFragmentManager2, getstringornullB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                } else {
                    opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
        } else {
            getStringOrNull.Companion companion3 = getStringOrNull.INSTANCE;
            String string3 = opencapturesession.getString(R.string.title_npwp_null);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = opencapturesession.getString(R.string.notif_npwp);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = opencapturesession.getString(R.string.action_ok_continue);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: traceInternalState
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return openCaptureSession.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }, opencapturesession.getString(R.string.action_return), new Function0() { // from class: setExtendedConfig
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
            opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            FragmentManager childFragmentManager3 = opencapturesession.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            Intrinsics.checkNotNullParameter(childFragmentManager3, "");
            if (childFragmentManager3.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager3, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(openCaptureSession opencapturesession) {
        getStringOrNull getstringornull = opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(openCaptureSession opencapturesession) {
        getStringOrNull getstringornull = opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(openCaptureSession opencapturesession) {
        opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        FragmentClaimOldDataSecurityFundProcessBinding fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (individualDataClaim != null) {
            String str = individualDataClaim.asInterface;
        }
        camera2CameraControlImplExternalSyntheticLambda4.b();
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem = (JhtClaimEmployeeDataItem) this.a.getValue();
        if (jhtClaimEmployeeDataItem != null) {
            EditText editText = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankName.getEditText();
            if (editText != null) {
                editText.setText(jhtClaimEmployeeDataItem.getBankName());
            }
            EditText editText2 = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankAccountName.getEditText();
            if (editText2 != null) {
                editText2.setText(jhtClaimEmployeeDataItem.getAccountBankName());
            }
            EditText editText3 = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilBankAccountNumber.getEditText();
            if (editText3 != null) {
                editText3.setText(jhtClaimEmployeeDataItem.getAccountBankNumber());
            }
            EditText editText4 = fragmentClaimOldDataSecurityFundProcessBindingINotificationSideChannelStub.tilNPWP.getEditText();
            if (editText4 != null) {
                editText4.setText(Intrinsics.areEqual(jhtClaimEmployeeDataItem.getNpwp(), "000000000000000") ? "" : jhtClaimEmployeeDataItem.getNpwp());
            }
        }
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem2 = (JhtClaimEmployeeDataItem) this.a.getValue();
        Intrinsics.checkNotNull(jhtClaimEmployeeDataItem2);
        String accountBankName = jhtClaimEmployeeDataItem2.getAccountBankName();
        if (accountBankName == null || accountBankName.length() == 0) {
            return;
        }
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem3 = (JhtClaimEmployeeDataItem) this.a.getValue();
        String strValueOf = String.valueOf(jhtClaimEmployeeDataItem3 != null ? jhtClaimEmployeeDataItem3.getBankCode() : null);
        JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem4 = (JhtClaimEmployeeDataItem) this.a.getValue();
        this.asInterface = new CodeNamePair(strValueOf, String.valueOf(jhtClaimEmployeeDataItem4 != null ? jhtClaimEmployeeDataItem4.getBankName() : null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(openCaptureSession opencapturesession, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Double dValueOf;
        String str2;
        Double dValueOf2;
        String str3;
        Double dValueOf3;
        String str4;
        Double dValueOf4;
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String str5;
        boolean z = false;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_bank_bpu_third_step", "loading_check_bank_bpu_third_step"));
            Intrinsics.checkNotNullParameter("loading_check_bank_bpu_third_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_check_bank_bpu_third_step", mapMutableMapOf);
            opencapturesession.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_check_bank_bpu_third_step", "success_check_bank_bpu_third_step"));
            Intrinsics.checkNotNullParameter("success_check_bank_bpu_third_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_check_bank_bpu_third_step", mapMutableMapOf2);
            opencapturesession.write();
            ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse = (ClaimCheckBankBpuReactivationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            BenefitDetail benefitDetail = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str6 = benefitDetail != null ? benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            Intrinsics.checkNotNull(str6);
            double d = 0.0d;
            if (str6.length() == 0) {
                dValueOf = Double.valueOf(0.0d);
            } else {
                BenefitDetail benefitDetail2 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                dValueOf = (benefitDetail2 == null || (str2 = benefitDetail2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) ? null : Double.valueOf(Double.parseDouble(str2));
            }
            BenefitDetail benefitDetail3 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            String str7 = benefitDetail3 != null ? benefitDetail3.g : null;
            Intrinsics.checkNotNull(str7);
            if (str7.length() == 0) {
                dValueOf2 = Double.valueOf(0.0d);
            } else {
                BenefitDetail benefitDetail4 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                dValueOf2 = (benefitDetail4 == null || (str3 = benefitDetail4.g) == null) ? null : Double.valueOf(Double.parseDouble(str3));
            }
            BenefitDetail benefitDetail5 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            String str8 = benefitDetail5 != null ? benefitDetail5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            Intrinsics.checkNotNull(str8);
            if (str8.length() == 0) {
                dValueOf3 = Double.valueOf(0.0d);
            } else {
                BenefitDetail benefitDetail6 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                dValueOf3 = (benefitDetail6 == null || (str4 = benefitDetail6.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : Double.valueOf(Double.parseDouble(str4));
            }
            Intrinsics.checkNotNull(dValueOf);
            double dDoubleValue = dValueOf.doubleValue();
            Intrinsics.checkNotNull(dValueOf2);
            double dDoubleValue2 = dValueOf2.doubleValue();
            BenefitDetail benefitDetail7 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
            String str9 = benefitDetail7 != null ? benefitDetail7.d : null;
            Intrinsics.checkNotNull(str9);
            if (str9.length() != 0) {
                BenefitDetail benefitDetail8 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                if (benefitDetail8 == null || (str5 = benefitDetail8.d) == null) {
                    dValueOf4 = null;
                } else {
                    d = Double.parseDouble(str5);
                    dValueOf4 = Double.valueOf(d);
                }
            } else {
                dValueOf4 = Double.valueOf(d);
            }
            Intrinsics.checkNotNull(dValueOf3);
            double dDoubleValue3 = dValueOf3.doubleValue();
            Intrinsics.checkNotNull(dValueOf4);
            double dDoubleValue4 = dValueOf4.doubleValue();
            if (claimCheckBankBpuReactivationResponse.getIsSuccessful()) {
                IndividualDataClaim individualDataClaim = (IndividualDataClaim) opencapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (individualDataClaim != null) {
                    boolean eligibleReaktivasi = claimCheckBankBpuReactivationResponse.getEligibleReaktivasi();
                    String listBankEligible = claimCheckBankBpuReactivationResponse.getListBankEligible();
                    EditText editText = opencapturesession.INotificationSideChannelStub().tilNPWP.getEditText();
                    String strValueOf5 = String.valueOf(editText != null ? editText.getText() : null);
                    CodeNamePair codeNamePair = opencapturesession.asInterface;
                    String str10 = codeNamePair != null ? codeNamePair.b : null;
                    String str11 = str10 == null ? "" : str10;
                    CodeNamePair codeNamePair2 = opencapturesession.asInterface;
                    String str12 = codeNamePair2 != null ? codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    String str13 = str12 == null ? "" : str12;
                    EditText editText2 = opencapturesession.INotificationSideChannelStub().tilBankAccountName.getEditText();
                    String string = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                    EditText editText3 = opencapturesession.INotificationSideChannelStub().tilBankAccountNumber.getEditText();
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
                    String str14 = opencapturesession.d;
                    BenefitDetail benefitDetail9 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str15 = benefitDetail9 != null ? benefitDetail9.INotificationSideChannel : null;
                    Intrinsics.checkNotNull(str15);
                    if (str15.length() == 0) {
                        strValueOf = "0.00";
                    } else {
                        BenefitDetail benefitDetail10 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf = String.valueOf(benefitDetail10 != null ? benefitDetail10.INotificationSideChannel : null);
                    }
                    BenefitDetail benefitDetail11 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str16 = benefitDetail11 != null ? benefitDetail11.cancel : null;
                    Intrinsics.checkNotNull(str16);
                    if (str16.length() == 0) {
                        strValueOf2 = "0.00";
                    } else {
                        BenefitDetail benefitDetail12 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf2 = String.valueOf(benefitDetail12 != null ? benefitDetail12.cancel : null);
                    }
                    BenefitDetail benefitDetail13 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str17 = benefitDetail13 != null ? benefitDetail13.RemoteActionCompatParcelizer : null;
                    Intrinsics.checkNotNull(str17);
                    if (str17.length() == 0) {
                        strValueOf3 = "0.00";
                    } else {
                        BenefitDetail benefitDetail14 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf3 = String.valueOf(benefitDetail14 != null ? benefitDetail14.RemoteActionCompatParcelizer : null);
                    }
                    BenefitDetail benefitDetail15 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                    String str18 = benefitDetail15 != null ? benefitDetail15.INotificationSideChannelStub : null;
                    Intrinsics.checkNotNull(str18);
                    if (str18.length() == 0) {
                        strValueOf4 = "0.00";
                    } else {
                        BenefitDetail benefitDetail16 = opencapturesession.TuitionPaymentFragmentbindingInflater1;
                        strValueOf4 = String.valueOf(benefitDetail16 != null ? benefitDetail16.INotificationSideChannelStub : null);
                    }
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, strValueOf5, null, null, null, "BANK", str11, str13, string2, string, null, null, null, null, null, null, null, null, str14, false, null, null, null, null, null, null, null, null, String.valueOf(dDoubleValue + dDoubleValue2), String.valueOf(dDoubleValue3 + dDoubleValue4), strValueOf, strValueOf2, strValueOf3, strValueOf4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eligibleReaktivasi, null, listBankEligible, null, null, null, null, null, -16840833, 2147483395, 125, null);
                } else {
                    individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                }
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, z, 2, defaultConstructorMarker);
                Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
            }
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                opencapturesession.write();
                getCameraState.Companion bVar2 = getCameraState.INSTANCE;
                String strValueOf6 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string3 = opencapturesession.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_alert, "", strValueOf6, string3);
                FragmentManager childFragmentManager = opencapturesession.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                str = "failure_claim_jht_step_third_check_bank_bpu_result";
            }
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_third", str));
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf3);
            return Unit.INSTANCE;
        }
        str = "";
        TargetAspectRatio targetAspectRatio4 = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf4 = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_third", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf4);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        EditText editText = INotificationSideChannelStub().tilBankAccountName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }
}
