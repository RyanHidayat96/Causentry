package com.bpjstku.presentation.bsu;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.bsu.model.request.CheckEligibleBsuRequest;
import com.bpjstku.data.bsu.model.response.CheckEligibleBsuResponse;
import com.bpjstku.data.bsu.model.response.DataAccountBalanceEmployee;
import com.bpjstku.data.bsu.model.response.DataEmployee;
import com.bpjstku.data.bsu.model.response.DataEmployeeOffice;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityCheckEligibleBsuJmoBinding;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity;
import com.bpjstku.presentation.bsu.model.CheckEligibleResult;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.gms.internal.mlkit_common.zzin;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.dispatchOnCreate;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0015\u0010\u0015\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/bsu/CheckEligibleBsuJmoActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityCheckEligibleBsuJmoBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LdispatchOnCreate;", "Lcom/bpjstku/domain/user/model/User;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckEligibleBsuJmoActivity extends BindingReactiveFormActivity<ActivityCheckEligibleBsuJmoBinding> {
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char asBinder;
    private static char asInterface;
    private static int cancelAll;
    private static char d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: WindowDecorActionBarTabImpl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CheckEligibleBsuJmoActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {73, 55, 58, 33};
    private static final int $$f = 138;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {92, 126, -38, -95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 199;
    private static int cancel = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f472a = 0;
    private static int g = 1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | i;
        int i9 = ~i3;
        int i10 = i7 | i;
        int i11 = (~(i6 | i9 | i)) | (~(i10 | i3));
        int i12 = (~i10) | (~(i9 | (~i)));
        int i13 = i + i3 + i4 + (1353909401 * i5) + ((-1351514252) * i2);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i) + 799145984 + ((-1483212659) * i3) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i4) + (337379328 * i5) + ((-1540358144) * i2) + (669122560 * i14);
        int i16 = ((i * 521834465) - 1171472169) + (i3 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i4 * 521834041) + (i5 * 1123214353) + (i2 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        if (i17 != 1) {
            return i17 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        final CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity = (CheckEligibleBsuJmoActivity) objArr[0];
        int i18 = 2 % 2;
        MutableLiveData<VirtualCameraAdapter1<CheckEligibleBsuResponse>> mutableLiveData = ((dispatchOnCreate) checkEligibleBsuJmoActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: setTitleOptionalHint
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibleBsuJmoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity.$$a
            int r9 = r9 + 1
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = 144 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    public CheckEligibleBsuJmoActivity() {
        final CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = checkEligibleBsuJmoActivity;
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
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<dispatchOnCreate>() { // from class: com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, dispatchOnCreate] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ dispatchOnCreate invoke() {
                LifecycleOwner lifecycleOwner = checkEligibleBsuJmoActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(dispatchOnCreate.class);
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
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityCheckEligibleBsuJmoBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 25;
        f472a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CheckEligibleBsuJmoActivity$bindingInflater$1 checkEligibleBsuJmoActivity$bindingInflater$1 = CheckEligibleBsuJmoActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            obj.hashCode();
            throw null;
        }
        CheckEligibleBsuJmoActivity$bindingInflater$1 checkEligibleBsuJmoActivity$bindingInflater$2 = CheckEligibleBsuJmoActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = f472a + 11;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return checkEligibleBsuJmoActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = INotificationSideChannelStub().btnCheckEligibleBsu;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onSubMenuSelected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckEligibleBsuJmoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        int i2 = g + 83;
        f472a = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10 + 93;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) asInterface) ^ 8611973335120459638L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47773), 469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(d)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47773), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 468, 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $11 + 21;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), View.getDefaultSize(0, 0) + 2323, 44 - View.resolveSize(0, 0), -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i9 = $11 + 19;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Object obj = null;
        if (user != null) {
            int i2 = g + 11;
            f472a = i2 % 128;
            int i3 = i2 % 2;
            str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf == null || strValueOf.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "session habis", 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            d_();
            int i4 = g + 115;
            f472a = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = f472a + 95;
        g = i2 % 128;
        String str2 = null;
        if (i2 % 2 == 0) {
            INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText("Cek Status BSU");
            INotificationSideChannelStub().tilMothersName.getEditText();
            str2.hashCode();
            throw null;
        }
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText("Cek Status BSU");
        ActivityCheckEligibleBsuJmoBinding activityCheckEligibleBsuJmoBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = activityCheckEligibleBsuJmoBindingINotificationSideChannelStub.tilMothersName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = activityCheckEligibleBsuJmoBindingINotificationSideChannelStub.tilPhoneNumber.getEditText();
        if (editText2 != null) {
            User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            if (user != null) {
                int i3 = f472a + 45;
                g = i3 % 128;
                if (i3 % 2 == 0) {
                    str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i4 = 26 / 0;
                } else {
                    str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            } else {
                str = null;
            }
            editText2.setText(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(str)));
        }
        EditText editText3 = activityCheckEligibleBsuJmoBindingINotificationSideChannelStub.tilIdNumberParticipant.getEditText();
        if (editText3 != null) {
            int i5 = g + 11;
            f472a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            User user2 = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            editText3.setText(String.valueOf(user2 != null ? user2.b : null));
        }
        EditText editText4 = activityCheckEligibleBsuJmoBindingINotificationSideChannelStub.tilFullName.getEditText();
        if (editText4 != null) {
            int i6 = f472a + 61;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            User user3 = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            editText4.setText(String.valueOf(user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null));
        }
        EditText editText5 = activityCheckEligibleBsuJmoBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText5 != null) {
            User user4 = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            editText5.setText(String.valueOf(user4 != null ? user4.asInterface : null));
        }
        EditText editText6 = activityCheckEligibleBsuJmoBindingINotificationSideChannelStub.tilEmail.getEditText();
        if (editText6 != null) {
            User user5 = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            editText6.setText(String.valueOf(user5 != null ? user5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = g + 21;
        f472a = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnCheckEligibleBsu;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
        int i4 = g + 115;
        f472a = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = g + 75;
        f472a = i2 % 128;
        if (i2 % 2 != 0) {
            Button button = INotificationSideChannelStub().btnCheckEligibleBsu;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(false);
        } else {
            Button button3 = INotificationSideChannelStub().btnCheckEligibleBsu;
            Intrinsics.checkNotNullExpressionValue(button3, "");
            Button button4 = button3;
            Intrinsics.checkNotNullParameter(button4, "");
            button4.setEnabled(true);
        }
        int i3 = g + 117;
        f472a = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilMothersName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object obj = null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, 3, null))));
        int i2 = g + 7;
        f472a = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f472a + 61;
        g = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = g + 73;
                f472a = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 0;
        CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity = (CheckEligibleBsuJmoActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = g + 107;
        f472a = i3 % 128;
        int i4 = i3 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int i5 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iAxisFromString = 14 - MotionEvent.axisFromString("");
            byte b = $$a[132];
            Object[] objArr3 = new Object[1];
            c(b, (short) (b | 140), (byte) 52, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, i5, iAxisFromString, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{42824, 42428, 64336, 14346, 33411, 53617, 35995, 34909, 14276, 13496, 40262, 36843, 8534, 61198, 10681, 40322, 44172, 29773, 24796, 32332, 54321, 34801, 37839, 30761}, 22 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{50396, 32654, 3903, 36876, 46423, 19777, 39632, 17583, 17037, 32198, 28596, 8045, 6834, 2230, 39068, 50934, 51196, 60234}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iGreen = Color.green(0) + 1031;
            int i6 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
            byte b2 = $$a[132];
            Object[] objArr6 = new Object[1];
            c(b2, (short) (b2 | 88), (byte) 52, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iGreen, i6, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = f472a + 79;
            g = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                int iGreen2 = Color.green(0) + 15;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b4, (short) (b4 | 37), b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i9, iGreen2, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i10 = ((int[]) objArr8[3])[0];
            int i11 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i12 = ~startUptimeMillis;
            int i13 = ((((-758781224) + (((~(i12 | (-680657959))) | 924938128) * (-1042))) + (((-680657959) | startUptimeMillis) * 521)) + ((((~(startUptimeMillis | (-924938129))) | 388066192) | (~(i12 | (-143786023)))) * 521)) - 1517198298;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr2[2])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{28447, 43860, 59328, 26210, 3992, 25071, 11272, 43243, 63519, 52304, 33715, 10624, 13571, 1280, 13930, 8684, 36602, 3794}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{62792, 10880, 57777, 31102, 43944, 20860, 43884, 53741, 32166, 22500, 9228, 13272, 25352, 33146, 63415, 26326, 56927, 42858}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, checkEligibleBsuJmoActivity)).intValue();
            try {
                Object[] objArr11 = {-433213104};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 46038), ExpandableListView.getPackedPositionType(0L) + 1134, 18 - Color.red(0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, -1517198298, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                    int iGreen3 = Color.green(0) + 15;
                    byte b5 = $$a[132];
                    Object[] objArr13 = new Object[1];
                    c(b5, (short) (b5 | 140), (byte) 52, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode2, absoluteGravity, iGreen3, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 45993), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1116, 17 - TextUtils.getCapsMode("", 0, 0)), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 15;
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr14 = new Object[1];
                    c(b7, (short) (b7 | 37), b6, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, jumpTapTimeout, absoluteGravity2, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{42824, 42428, 64336, 14346, 33411, 53617, 35995, 34909, 14276, 13496, 40262, 36843, 8534, 61198, 10681, 40322, 44172, 29773, 24796, 32332, 54321, 34801, 37839, 30761}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_klik_bca).substring(4, 5).length() + 21, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{50396, 32654, 3903, 36876, 46423, 19777, 39632, 17583, 17037, 32198, 28596, 8045, 6834, 2230, 39068, 50934, 51196, 60234}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.install_gojek_message).substring(0, 8).length() + 7, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                        int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b8 = $$a[132];
                        Object[] objArr17 = new Object[1];
                        c(b8, (short) (b8 | 88), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iResolveSizeAndState, iLastIndexOf, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                        byte b9 = $$a[132];
                        Object[] objArr18 = new Object[1];
                        c(b9, (short) (b9 | 140), (byte) 52, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, iIndexOf, touchSlop, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i16 = f472a + 21;
                    g = i16 % 128;
                    int i17 = i16 % 2;
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
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i18 = g + 109;
                f472a = i18 % 128;
                int i19 = i18 % 2;
                while (i < strArr2.length) {
                    arrayList.add(strArr2[i]);
                    i++;
                }
            }
            throw null;
        }
        int i20 = f472a + 11;
        g = i20 % 128;
        int i21 = i20 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i22 = ((int[]) objArr2[2])[0];
        int i23 = ((int[]) objArr2[3])[0];
        int i24 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int iMyUid = Process.myUid();
        int i25 = i22 + 1735288292 + (((~(iMyUid | 768712731)) | 302126240) * 305) + (((~((~iMyUid) | 768712731)) | 524432561) * 305);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr19[2])[0] = i27 ^ (i27 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
            int i28 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
            int i29 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b10 = $$a[132];
            short s = (short) (b10 | 36);
            Object[] objArr20 = new Object[1];
            c(b10, s, (byte) s, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, i28, i29, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                byte b11 = $$a[132];
                Object[] objArr21 = new Object[1];
                c(b11, (short) (b11 | 88), (byte) 52, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumDrawingCacheSize, iIndexOf2, trimmedLength, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i30 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i30}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i31 = ~((-1024869894) | iFreeMemory);
            int i32 = ~iFreeMemory;
            int i33 = ((((-1167566783) + ((i31 | (~((-812267468) | i32))) * (-1808))) + (((~((-219430917) | iFreeMemory)) | (~(i32 | (-6828491)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iFreeMemory | 812267467)) | 805438977) | (~(1024869893 | i32))) * TypedValues.Custom.TYPE_BOOLEAN)) - 953092007;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{28447, 43860, 59328, 26210, 3992, 25071, 11272, 43243, 63519, 52304, 33715, 10624, 13571, 1280, 13930, 8684, 36602, 3794}, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{62792, 10880, 57777, 31102, 43944, 20860, 43884, 53741, 32166, 22500, 9228, 13272, 25352, 33146, 63415, 26326, 56927, 42858}, Process.getGidForName("") + 17, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, checkEligibleBsuJmoActivity)).intValue();
            Object[] objArr25 = {-433213104};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42049), TextUtils.getCapsMode("", 0, 0) + 1726, View.MeasureSpec.getSize(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -953092007);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29944);
                int iMyPid = (Process.myPid() >> 22) + 1755;
                int i36 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                byte b12 = $$a[132];
                Object[] objArr26 = new Object[1];
                c(b12, (short) (b12 | 88), (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize2, iMyPid, i36, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{42824, 42428, 64336, 14346, 33411, 53617, 35995, 34909, 14276, 13496, 40262, 36843, 8534, 61198, 10681, 40322, 44172, 29773, 24796, 32332, 54321, 34801, 37839, 30761}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).length() - 21, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{50396, 32654, 3903, 36876, 46423, 19777, 39632, 17583, 17037, 32198, 28596, 8045, 6834, 2230, 39068, 50934, 51196, 60234}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cArgb = (char) (29944 - Color.argb(0, 0, 0, 0));
                    int i37 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iAxisFromString2 = 22 - MotionEvent.axisFromString("");
                    byte[] bArr = $$a;
                    byte b13 = bArr[132];
                    short s2 = bArr[7];
                    Object[] objArr29 = new Object[1];
                    c(b13, s2, (byte) (s2 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb, i37, iAxisFromString2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char capsMode3 = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                    int i38 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b14 = $$a[132];
                    short s3 = (short) (b14 | 36);
                    Object[] objArr30 = new Object[1];
                    c(b14, s3, (byte) s3, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode3, i38, scrollDefaultDelay, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr4 != null) {
                while (i < strArr4.length) {
                    arrayList2.add(strArr4[i]);
                    i++;
                }
            }
            throw null;
        }
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        Object[] objArr31 = {new int[]{i40}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iMyPid2 = Process.myPid();
        int i41 = ~iMyPid2;
        int i42 = ~(1019550057 | i41);
        int i43 = i39 + 1121338545 + (((-1021123440) | i42) * (-712)) + (((~(iMyPid2 | (-1573383))) | (~(i41 | 1021123439))) * (-712)) + ((806947631 | i42) * 712);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr31[3])[0] = i45 ^ (i45 << 5);
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String nomorRekening;
        String namaBank;
        String kodeDivisi;
        String mssisdn;
        String name;
        String nomorIdentitas;
        int i = 2 % 2;
        String tglLahir = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = g + 109;
            f472a = i2 % 128;
            if (i2 % 2 != 0) {
                checkEligibleBsuJmoActivity.MediaBrowserCompat();
                tglLahir.hashCode();
                throw null;
            }
            checkEligibleBsuJmoActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = f472a + 99;
            g = i3 % 128;
            if (i3 % 2 == 0) {
                ((CheckEligibleBsuResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAccountBalanceEmployee();
                throw null;
            }
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            DataAccountBalanceEmployee dataAccountBalanceEmployee = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAccountBalanceEmployee();
            String kodeBank = dataAccountBalanceEmployee != null ? dataAccountBalanceEmployee.getKodeBank() : null;
            DataAccountBalanceEmployee dataAccountBalanceEmployee2 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAccountBalanceEmployee();
            String namaRekening = dataAccountBalanceEmployee2 != null ? dataAccountBalanceEmployee2.getNamaRekening() : null;
            DataAccountBalanceEmployee dataAccountBalanceEmployee3 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAccountBalanceEmployee();
            if (dataAccountBalanceEmployee3 != null) {
                int i4 = g + 11;
                f472a = i4 % 128;
                if (i4 % 2 != 0) {
                    nomorRekening = dataAccountBalanceEmployee3.getNomorRekening();
                    int i5 = 86 / 0;
                } else {
                    nomorRekening = dataAccountBalanceEmployee3.getNomorRekening();
                }
            } else {
                nomorRekening = null;
            }
            DataAccountBalanceEmployee dataAccountBalanceEmployee4 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataAccountBalanceEmployee();
            if (dataAccountBalanceEmployee4 != null) {
                int i6 = f472a + 99;
                g = i6 % 128;
                int i7 = i6 % 2;
                namaBank = dataAccountBalanceEmployee4.getNamaBank();
            } else {
                namaBank = null;
            }
            DataAccountBalanceEmployee dataAccountBalanceEmployee5 = new DataAccountBalanceEmployee(kodeBank, namaBank, namaRekening, nomorRekening);
            DataEmployeeOffice dataKantor = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataKantor();
            if (dataKantor != null) {
                int i8 = g + 95;
                f472a = i8 % 128;
                int i9 = i8 % 2;
                kodeDivisi = dataKantor.getKodeDivisi();
            } else {
                kodeDivisi = null;
            }
            DataEmployeeOffice dataKantor2 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataKantor();
            String kodeKepesertaan = dataKantor2 != null ? dataKantor2.getKodeKepesertaan() : null;
            DataEmployeeOffice dataKantor3 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataKantor();
            String kodePerusahaan = dataKantor3 != null ? dataKantor3.getKodePerusahaan() : null;
            DataEmployeeOffice dataKantor4 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataKantor();
            String kodeTk = dataKantor4 != null ? dataKantor4.getKodeTk() : null;
            DataEmployeeOffice dataKantor5 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataKantor();
            DataEmployeeOffice dataEmployeeOffice = new DataEmployeeOffice(kodeDivisi, kodeKepesertaan, kodePerusahaan, kodeTk, dataKantor5 != null ? dataKantor5.getKpj() : null);
            DataEmployee dataEmployee = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            String chId = dataEmployee != null ? dataEmployee.getChId() : null;
            DataEmployee dataEmployee2 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            String namaIbu = dataEmployee2 != null ? dataEmployee2.getNamaIbu() : null;
            DataEmployee dataEmployee3 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            String email = dataEmployee3 != null ? dataEmployee3.getEmail() : null;
            DataEmployee dataEmployee4 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            if (dataEmployee4 != null) {
                int i10 = g + 111;
                f472a = i10 % 128;
                if (i10 % 2 != 0) {
                    dataEmployee4.getMssisdn();
                    throw null;
                }
                mssisdn = dataEmployee4.getMssisdn();
            } else {
                mssisdn = null;
            }
            DataEmployee dataEmployee5 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            if (dataEmployee5 != null) {
                int i11 = f472a + 123;
                g = i11 % 128;
                if (i11 % 2 == 0) {
                    dataEmployee5.getName();
                    tglLahir.hashCode();
                    throw null;
                }
                name = dataEmployee5.getName();
            } else {
                name = null;
            }
            DataEmployee dataEmployee6 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            String nomorPegawai = dataEmployee6 != null ? dataEmployee6.getNomorPegawai() : null;
            DataEmployee dataEmployee7 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            if (dataEmployee7 != null) {
                int i12 = f472a + 5;
                g = i12 % 128;
                int i13 = i12 % 2;
                nomorIdentitas = dataEmployee7.getNomorIdentitas();
            } else {
                nomorIdentitas = null;
            }
            DataEmployee dataEmployee8 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            String statusEligible = dataEmployee8 != null ? dataEmployee8.getStatusEligible() : null;
            DataEmployee dataEmployee9 = ((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDataEmployee();
            if (dataEmployee9 != null) {
                int i14 = f472a + 93;
                g = i14 % 128;
                if (i14 % 2 == 0) {
                    tglLahir = dataEmployee9.getTglLahir();
                    int i15 = 43 / 0;
                } else {
                    tglLahir = dataEmployee9.getTglLahir();
                }
            }
            CheckEligibleResult checkEligibleResult = new CheckEligibleResult(String.valueOf(((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode()), String.valueOf(((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessageCode()), String.valueOf(((CheckEligibleBsuResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage()), new DataEmployee(chId, namaIbu, email, mssisdn, name, nomorPegawai, nomorIdentitas, statusEligible, tglLahir), dataAccountBalanceEmployee5, dataEmployeeOffice);
            CheckEligibleBsuResultActivity.Companion companion = CheckEligibleBsuResultActivity.INSTANCE;
            CheckEligibleBsuResultActivity.Companion.b(checkEligibleBsuJmoActivity, checkEligibleResult);
            checkEligibleBsuJmoActivity.d_();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkEligibleBsuJmoActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity) {
        User userAsBinder;
        int i = 2 % 2;
        int i2 = g + 51;
        f472a = i2 % 128;
        if (i2 % 2 != 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) checkEligibleBsuJmoActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i3 = 41 / 0;
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) checkEligibleBsuJmoActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i4 = g + 29;
        f472a = i4 % 128;
        if (i4 % 2 == 0) {
            return userAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity, View view) {
        String str;
        String str2;
        CharSequence charSequenceTrim;
        CharSequence charSequenceTrim2;
        Editable text;
        Editable text2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        dispatchOnCreate dispatchoncreate = (dispatchOnCreate) checkEligibleBsuJmoActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        User user = (User) checkEligibleBsuJmoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        Object obj = null;
        if (user != null) {
            str = user.b;
            int i2 = f472a + 61;
            g = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        User user2 = (User) checkEligibleBsuJmoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (user2 != null) {
            int i4 = f472a + 33;
            g = i4 % 128;
            int i5 = i4 % 2;
            str2 = user2.asInterface;
            int i6 = f472a + 3;
            g = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str2 = null;
        }
        String strValueOf2 = String.valueOf(str2);
        User user3 = (User) checkEligibleBsuJmoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String strValueOf3 = String.valueOf(user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        User user4 = (User) checkEligibleBsuJmoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(user4 != null ? user4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null));
        EditText editText = checkEligibleBsuJmoActivity.INotificationSideChannelStub().tilMothersName.getEditText();
        if (editText == null || (text2 = editText.getText()) == null) {
            int i8 = g + 37;
            f472a = i8 % 128;
            int i9 = i8 % 2;
            charSequenceTrim = null;
        } else {
            int i10 = g + 89;
            f472a = i10 % 128;
            if (i10 % 2 != 0) {
                StringsKt.trim(text2);
                obj.hashCode();
                throw null;
            }
            charSequenceTrim = StringsKt.trim(text2);
            int i11 = f472a + 3;
            g = i11 % 128;
            int i12 = i11 % 2;
        }
        String strValueOf4 = String.valueOf(charSequenceTrim);
        EditText editText2 = checkEligibleBsuJmoActivity.INotificationSideChannelStub().tilEmail.getEditText();
        if (editText2 == null || (text = editText2.getText()) == null) {
            charSequenceTrim2 = null;
        } else {
            int i13 = f472a + 119;
            g = i13 % 128;
            if (i13 % 2 == 0) {
                StringsKt.trim(text);
                throw null;
            }
            charSequenceTrim2 = StringsKt.trim(text);
        }
        Intrinsics.checkNotNullParameter(new CheckEligibleBsuRequest(strValueOf, strValueOf2, strValueOf3, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, strValueOf4, String.valueOf(charSequenceTrim2)), "");
        MutableLiveData<VirtualCameraAdapter1<CheckEligibleBsuResponse>> mutableLiveData = dispatchoncreate.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        new VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        throw null;
    }

    static {
        cancelAll = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancel + 17;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 1;
        f472a = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_check_eligible_bsu_jmo;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f472a + 23;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        b(-2084405764, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2084405765, iTuitionPaymentFragmentbindingInflater2, iTuitionPaymentFragmentbindingInflater3, new Object[]{this}, iTuitionPaymentFragmentbindingInflater1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2 % 2;
        int i2 = g + 93;
        f472a = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int i4 = g + 111;
        f472a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(-1478197013, 686028576 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 1478197013, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int i = 2 % 2;
        int i2 = g + 17;
        f472a = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = f472a + 43;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 75;
        f472a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        b(148065325, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -148065323, iTuitionPaymentFragmentbindingInflater2, iTuitionPaymentFragmentbindingInflater3, new Object[]{this, context}, iTuitionPaymentFragmentbindingInflater1);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 3851;
        d = (char) 38845;
        asInterface = (char) 10374;
        asBinder = (char) 41976;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        CheckEligibleBsuJmoActivity checkEligibleBsuJmoActivity = (CheckEligibleBsuJmoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f472a + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = g + 123;
        f472a = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
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
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity.$$c
            int r6 = r6 * 4
            int r6 = 108 - r6
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.bsu.CheckEligibleBsuJmoActivity.$$i(int, short, short):java.lang.String");
    }
}
