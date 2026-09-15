package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.databinding.FragmentSalariedWorkerPasswordBinding;
import com.bpjstku.domain.registration.general.model.ValidationType;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.initSession;
import defpackage.mapPoint;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0017\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0015\u0010\u0019\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u001a\u0010\n\u001a\u00020 8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001e\u0010\"R.\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010&"}, d2 = {"LsetColorScheme;", "LimageAnalysisFormat;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerPasswordBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Z", "LgetUntrustedCreatorPackageName;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "notify", "TuitionPaymentFragmentbindingInflater1", "LsetSplitTrack;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/data/lib/PreferenceManager;", "b", "", "asInterface", "Ljava/lang/String;", "a", "asBinder", "d", "", "I", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setColorScheme extends imageAnalysisFormat<FragmentSalariedWorkerPasswordBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int INotificationSideChannel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationType.values().length];
            try {
                iArr[ValidationType.LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationType.UPPER_LOWER_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationType.DIGIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationType.SPECIAL_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
    }

    public static final /* synthetic */ FragmentSalariedWorkerPasswordBinding TuitionPaymentFragmentbindingInflater1(setColorScheme setcolorscheme) {
        return setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX INFO: renamed from: setColorScheme$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetColorScheme$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LsetColorScheme;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LsetColorScheme;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setColorScheme TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new setColorScheme();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public setColorScheme() {
        final setColorScheme setcolorscheme = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = setcolorscheme.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2
            private static final byte[] $$c = {12, 11, -9, -106};
            private static final int $$d = 110;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 39;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7646485179136431111L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r5 = 145 - r5
                    byte[] r0 = com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2.$$a
                    int r1 = r6 + 1
                    int r7 = r7 * 14
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r5
                    r4 = r2
                    goto L24
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L22:
                    r3 = r0[r5]
                L24:
                    int r5 = r5 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2.c(short, short, int, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $11 + 87;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16842054), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1356, View.combineMeasuredStates(0, 0) + 38, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 47773), KeyEvent.keyCodeFromString("") + 468, 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $11 + 53;
                        $10 = i6 % 128;
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

            /* JADX WARN: Type inference failed for: r1v5, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                ?? B = getFocusY.b(setcolorscheme, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return B;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22351. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            public static java.lang.Object[] b(android.content.Context r29, int r30, int r31, int r32) {
                /*
                    Method dump skipped, instruction units count: 2235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2.b(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r7, int r8, short r9) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 107
                    byte[] r0 = com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2.$$c
                    int r8 = r8 * 3
                    int r8 = 1 - r8
                    int r9 = r9 * 2
                    int r9 = r9 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r9
                    r4 = r2
                    goto L29
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L24:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L29:
                    int r9 = -r9
                    int r7 = r7 + r9
                    int r9 = r3 + 1
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2.$$e(short, int, short):java.lang.String");
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: setDefaultShareMenuItemEnabled
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.getValue();
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new SalariedWorkerPasswordFragment$special$$inlined$viewModel$default$1(this));
        final setColorScheme setcolorscheme2 = this;
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerPasswordFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = setcolorscheme2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = lazy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
        this.INotificationSideChannel = R.layout.fragment_salaried_worker_password;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.INotificationSideChannel;
    }

    @Override // defpackage.imageAnalysisFormat
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerPasswordBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return SalariedWorkerPasswordFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentSalariedWorkerPasswordBinding fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        MaterialButton materialButton = fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setCloseButtonPosition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        EditText editText = fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tilPassword.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new b());
        }
        EditText editText2 = fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new TuitionPaymentFragmentbindingInflater1());
        }
    }

    public static final class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strValueOf = String.valueOf(charSequence);
            setSplitTrack setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setColorScheme.this);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault2.b.setValue(strValueOf);
            setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strValueOf));
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws IllegalAccessException {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 46401), 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1513912262, false, "b", null);
            }
            int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37836), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - KeyEvent.keyCodeFromString("")), 58 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 18 - View.getDefaultSize(0, 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = 220;
            long j3 = -1;
            long jNextInt = new Random().nextInt(2076762591);
            long j4 = jNextInt ^ j3;
            long j5 = (((long) 221) * 481396678891517752L) + (((long) (-219)) * 5037856818268268487L) + (((((j3 ^ 481396678891517752L) | (j3 ^ 5037856818268268487L)) ^ j3) | ((j4 | 5183172304098162687L) ^ j3)) * j2) + (((long) (-440)) * (((j4 | 5037856818268268487L) ^ j3) | 481396678891517752L)) + (j2 * (5183172304098162687L | jNextInt));
            long j6 = j;
            int i3 = 0;
            while (true) {
                for (int i4 = 0; i4 != 8; i4++) {
                    i2 = (((((int) (j6 >> i4)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                }
                if (i3 != 0) {
                    break;
                }
                i3++;
                j6 = j5;
            }
            if (i2 != i) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46400), Color.argb(0, 0, 0, 0) + 40, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw null;
            }
            String string = StringsKt.trim((CharSequence) String.valueOf(editable)).toString();
            EditText editText = setColorScheme.TuitionPaymentFragmentbindingInflater1(setColorScheme.this).tilPassword.getEditText();
            setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setColorScheme.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        EditText editText = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.getEditText();
        return Intrinsics.areEqual(String.valueOf(editText2 != null ? editText2.getText() : null), strValueOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setColorScheme setcolorscheme, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        if (!bool.booleanValue()) {
            setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setError(setcolorscheme.getString(R.string.error_unmatch_password));
            setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        } else {
            setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setError(null);
            setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setColorScheme setcolorscheme, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setcolorscheme.IconCompatParcelizer();
            str = "loading_registration_account_step_fifth_result";
        } else {
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setcolorscheme.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setcolorscheme.TuitionPaymentFragmentbindingInflater1.getValue();
                if (registeredMemberRegistration != null) {
                    EditText editText = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                }
                RegistrationSuccessActivity.Companion companion = RegistrationSuccessActivity.INSTANCE;
                Context contextRequireContext = setcolorscheme.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                BaseActivity baseActivity = setcolorscheme.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
                str = "success_registration_account_step_fifth_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setcolorscheme.write();
                setColorScheme setcolorscheme2 = setcolorscheme;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(setcolorscheme2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity2 = (BaseActivity) setcolorscheme2.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
                }
                str = "failure_registration_account_step_fifth_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setcolorscheme.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setColorScheme setcolorscheme, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        setcolorscheme.a = String.valueOf(userLocationComplete.b);
        setcolorscheme.d = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        setcolorscheme.g = str;
        setcolorscheme.asBinder = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        setcolorscheme.asInterface = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        setcolorscheme.cancelAll = str4;
        String str5 = setcolorscheme.a;
        String str6 = setcolorscheme.d;
        String str7 = setcolorscheme.g;
        String str8 = setcolorscheme.asBinder;
        String str9 = setcolorscheme.asInterface;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setColorScheme setcolorscheme) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) setcolorscheme.b.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            setcolorscheme.a = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            setcolorscheme.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            setcolorscheme.g = camera2CameraControlExternalSyntheticLambda4B.b;
            setcolorscheme.asBinder = camera2CameraControlExternalSyntheticLambda4B.g;
            setcolorscheme.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            setcolorscheme.cancelAll = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = setcolorscheme.a;
            String str2 = setcolorscheme.d;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            setcolorscheme.a = "0.0";
            setcolorscheme.d = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final setColorScheme setcolorscheme, FragmentSalariedWorkerPasswordBinding fragmentSalariedWorkerPasswordBinding, View view) {
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Citizenship citizenship;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, setcolorscheme.requireContext());
        fragmentSalariedWorkerPasswordBinding.salariedWorkerPasswordContainer.requestFocus();
        if (setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setcolorscheme.TuitionPaymentFragmentbindingInflater1.getValue();
            String strName = null;
            if (registeredMemberRegistration != null) {
                EditText editText = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
                registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
            } else {
                registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            }
            ((getUntrustedCreatorPackageName) setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.setValue(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setcolorscheme.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registeredMemberRegistration2 != null && (citizenship = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                strName = citizenship.name();
            }
            if (Intrinsics.areEqual(strName, "WNI")) {
                ((getUntrustedCreatorPackageName) setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            } else {
                Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: setExitAnimations
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, task);
                    }
                }));
            }
        } else {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pastikan Kata Sandi Anda Sesuai", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setColorScheme setcolorscheme, Task task) {
        CharSequence charSequence;
        RegisteredMemberRegistration registeredMemberRegistration;
        String string;
        String str;
        String str2;
        String string2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0 || (registeredMemberRegistration = (RegisteredMemberRegistration) setcolorscheme.TuitionPaymentFragmentbindingInflater1.getValue()) == null) {
            return;
        }
        Citizenship citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String upperCase = "-";
        if (Intrinsics.areEqual(citizenship != null ? citizenship.name() : null, "WNA")) {
            MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (Intrinsics.areEqual(membershipType != null ? membershipType.name() : null, "PU")) {
                setSplitTrack setsplittrack = (setSplitTrack) setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                String str5 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str6 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                if (str6 != null) {
                    String lowerCase = str6.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (lowerCase != null) {
                        string2 = StringsKt.trim((CharSequence) lowerCase).toString();
                    } else {
                        string2 = null;
                    }
                } else {
                    string2 = null;
                }
                String strName = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name();
                String strName2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2.name();
                String str7 = registeredMemberRegistration.d;
                String str8 = registeredMemberRegistration.asBinder;
                if (Intrinsics.areEqual(registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name(), "WNI")) {
                    String str9 = registeredMemberRegistration.asInterface;
                    if (str9 != null) {
                        upperCase = str9.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        str3 = upperCase;
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = upperCase;
                }
                String str10 = registeredMemberRegistration.g;
                EditText editText = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
                String string3 = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
                String str11 = (String) task.getResult();
                String str12 = registeredMemberRegistration.notify;
                if (Intrinsics.areEqual(registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name(), "WNA")) {
                    String str13 = registeredMemberRegistration.asInterface;
                    if (str13 != null) {
                        String upperCase2 = str13.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        str4 = upperCase2;
                    } else {
                        str4 = null;
                    }
                } else {
                    str4 = "";
                }
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new RegisterRequest(str5, string2, strName, strName2, str7, str8, str3, str10, str4, string3, str11, str12, String.valueOf(registeredMemberRegistration.INotificationSideChannel), String.valueOf(setcolorscheme.a), String.valueOf(setcolorscheme.d), setcolorscheme.g));
                return;
            }
        }
        setSplitTrack setsplittrack2 = (setSplitTrack) setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        String str14 = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str15 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str16 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
        if (str16 != null) {
            String lowerCase2 = str16.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (lowerCase2 != null) {
                string = StringsKt.trim((CharSequence) lowerCase2).toString();
            } else {
                string = null;
            }
        } else {
            string = null;
        }
        Citizenship citizenship2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strName3 = citizenship2 != null ? citizenship2.name() : null;
        MembershipType membershipType2 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strName4 = membershipType2 != null ? membershipType2.name() : null;
        String str17 = registeredMemberRegistration.d;
        String str18 = registeredMemberRegistration.asBinder;
        Citizenship citizenship3 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Intrinsics.areEqual(citizenship3 != null ? citizenship3.name() : null, "WNI")) {
            String str19 = registeredMemberRegistration.asInterface;
            if (str19 != null) {
                upperCase = str19.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                str = upperCase;
            } else {
                str = null;
            }
        } else {
            str = upperCase;
        }
        String str20 = registeredMemberRegistration.g;
        EditText editText2 = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
        String string4 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
        String str21 = (String) task.getResult();
        String str22 = registeredMemberRegistration.notify;
        Citizenship citizenship4 = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (Intrinsics.areEqual(citizenship4 != null ? citizenship4.name() : null, "WNA")) {
            String str23 = registeredMemberRegistration.asInterface;
            if (str23 != null) {
                String upperCase3 = str23.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                str2 = upperCase3;
            } else {
                str2 = null;
            }
        } else {
            str2 = "";
        }
        String strValueOf = String.valueOf(registeredMemberRegistration.INotificationSideChannel);
        File file = registeredMemberRegistration.INotificationSideChannelStubProxy;
        File file2 = registeredMemberRegistration.INotificationSideChannelStub;
        File file3 = registeredMemberRegistration.RemoteActionCompatParcelizer;
        File file4 = registeredMemberRegistration.INotificationSideChannelStubProxy;
        String strValueOf2 = String.valueOf(setcolorscheme.d);
        String strValueOf3 = String.valueOf(setcolorscheme.a);
        String str24 = setcolorscheme.g;
        String str25 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str25, "");
        String str26 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str26, "");
        setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str14, new NewRegisterRequest(str15, string, strName3, strName4, str17, str18, str, str20, str2, string4, str21, str22, strValueOf, "Y", file, file2, file3, file4, strValueOf3, strValueOf2, str24, str25, str26));
    }

    public static final /* synthetic */ setSplitTrack TuitionPaymentFragmentspecialinlinedviewModeldefault2(setColorScheme setcolorscheme) {
        return (setSplitTrack) setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).write.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setInstantAppsEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setInitialActivityHeightPx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStub.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setInitialActivityWidthPx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Map) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setSendToExternalDefaultHandlerEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancel.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setColorScheme setcolorscheme, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setcolorscheme.IconCompatParcelizer();
            str = "loading_registration_account_step_fifth_result";
        } else {
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setcolorscheme.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setcolorscheme.TuitionPaymentFragmentbindingInflater1.getValue();
                if (registeredMemberRegistration != null) {
                    EditText editText = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                }
                RegistrationSuccessActivity.Companion companion = RegistrationSuccessActivity.INSTANCE;
                Context contextRequireContext = setcolorscheme.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                BaseActivity baseActivity = setcolorscheme.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
                str = "success_registration_account_step_fifth_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setcolorscheme.write();
                setColorScheme setcolorscheme2 = setcolorscheme;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(setcolorscheme2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity2 = (BaseActivity) setcolorscheme2.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
                }
                str = "failure_registration_account_step_fifth_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setcolorscheme.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setColorScheme setcolorscheme, Map map) {
        Intrinsics.checkNotNull(map);
        FragmentSalariedWorkerPasswordBinding fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (Map.Entry entry : map.entrySet()) {
            ValidationType validationType = (ValidationType) entry.getKey();
            Drawable drawable = ContextCompat.getDrawable(setcolorscheme.requireContext(), ((Boolean) entry.getValue()).booleanValue() ? R.drawable.ic_check_active : R.drawable.ic_check_inactive);
            int i = WhenMappings.$EnumSwitchMapping$0[validationType.ordinal()];
            if (i == 1) {
                fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvLengthValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (i == 2) {
                fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvUpperLowerValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (i == 3) {
                fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                fragmentSalariedWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setColorScheme setcolorscheme, Boolean bool) {
        setcolorscheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1().btnConfirmation.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        TextInputLayout textInputLayout = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Maksimal harus 20 karakter", null, 20), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: setDownloadButtonEnabled
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        }, string2)})));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String str;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: setPendingSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setDefaultColorSchemeParams
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setColorScheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.cancelAll) == null || str.length() <= 0) {
            return;
        }
        EditText editText = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
        if (editText != null) {
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
            editText.setText(registeredMemberRegistration2 != null ? registeredMemberRegistration2.cancelAll : null);
        }
        EditText editText2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
            editText2.setText(registeredMemberRegistration3 != null ? registeredMemberRegistration3.cancelAll : null);
        }
    }
}
