package com.bpjstku.presentation.account.setting.addkpj;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.Editable;
import android.text.TextUtils;
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
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.view.OnBackPressedCallback;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAddKpjBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda3;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.accessconfigureInstanceInternal;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.removeTabAt;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.selectTab;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0016\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0015\u0010\u000b\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/account/setting/addkpj/AddKpjActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityAddKpjBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "cancelAll", "b", "asInterface", "a", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/util/constant/MembershipType;", "Lcom/bpjstku/util/constant/MembershipType;", "Lcom/bpjstku/util/constant/Citizenship;", "Lcom/bpjstku/util/constant/Citizenship;", "LIntegerRes;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddKpjActivity extends BindingReactiveFormActivity<ActivityAddKpjBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;
    private static long g;
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asBinder;
    private static final byte[] $$c = {114, -115, 48, 84};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {27, -8, 5, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 110;
    private static int asBinder = 0;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f458a = 1;
    private MembershipType b = MembershipType.PU;
    private Citizenship TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Citizenship.WNI;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MembershipType.values().length];
            try {
                iArr[MembershipType.BPU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipType.PU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i5;
        int i8 = ~(i7 | i3 | i4);
        int i9 = (~((~i4) | i3)) | (~(i3 | i5));
        int i10 = i3 + i5 + i6 + (32217706 * i) + (238734613 * i2);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i3) - 528416768) + (677943110 * i5) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i6) + ((-154927104) * i) + ((-131989504) * i2) + ((-1876361216) * i11);
        int i13 = ((i3 * 1127137324) - 440746823) + (i5 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i6 * 1127136485) + (976419026 * i) + (i2 * 1106960329) + (i11 * 279773184);
        int i14 = i12 + (i13 * i13 * (-1943076864));
        if (i14 != 1) {
            if (i14 != 2) {
                return i14 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
            }
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        AddKpjActivity addKpjActivity = (AddKpjActivity) objArr[0];
        int i15 = 2 % 2;
        int i16 = f458a + 111;
        asInterface = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            if (i17 != (-410628888) + (((~(1097476652 | startUptimeMillis)) | 244417873) * 104) + ((~((~startUptimeMillis) | (-1074405417))) * (-104)) + ((startUptimeMillis | 267489109) * 104)) {
                throw null;
            }
        } else {
            int i18 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i19 = 47045352 + ((i | 711328008) * 988);
            int i20 = ~i;
            if (i18 != i19 + (((~(980812040 | i20)) | (-2080283616)) * (-1976)) + (((~(i | 1810799583)) | 711328008 | (~((-1810799584) | i20))) * 988)) {
                throw null;
            }
        }
        int i21 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i22 = (~((-1615502561) | iMyTid)) | 541755488;
        int i23 = ~((~iMyTid) | 2037300476);
        if (i21 != (-493902436) + ((i22 | i23) * (-470)) + (((~(iMyTid | (-1073747073))) | i23) * 470)) {
            int i24 = 523499646 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i25 = f458a + 105;
        asInterface = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = r7 + 4
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/account/setting/addkpj/AddKpjActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, AddKpjActivity.class, new Pair[0]);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AddKpjActivity() {
        final AddKpjActivity addKpjActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = addKpjActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asBinder = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = addKpjActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityAddKpjBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        f458a = i2 % 128;
        int i3 = i2 % 2;
        AddKpjActivity$bindingInflater$1 addKpjActivity$bindingInflater$1 = AddKpjActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = f458a + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return addKpjActivity$bindingInflater$1;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(g ^ (-2687588926731523482L), cArr, i);
        int i3 = 4;
        abortcapture.b = 4;
        int i4 = $11 + 97;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (abortcapture.b < cArrB.length) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
            int i8 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 64839), View.resolveSize(0, 0) + 1356, 37 - TextUtils.indexOf((CharSequence) "", '0'), 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47774), ExpandableListView.getPackedPositionGroup(0L) + 468, 12 - TextUtils.indexOf((CharSequence) "", '0'), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = 4;
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

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = f458a + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            INotificationSideChannelStub().tilChooseCitizenship.getEditText();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EditText editText = INotificationSideChannelStub().tilChooseCitizenship.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: removeAllTabs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        EditText editText2 = INotificationSideChannelStub().tilChooseSegment.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: removeTab
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        INotificationSideChannelStub().btnSave.setOnClickListener(new View.OnClickListener() { // from class: removeOnMenuVisibilityListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddKpjActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        int i3 = f458a + 43;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036 A[PHI: r2
  0x0036: PHI (r2v8 IntegerRes) = (r2v5 IntegerRes), (r2v11 IntegerRes) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r2 r4
  0x0031: PHI (r2v6 IntegerRes) = (r2v5 IntegerRes), (r2v11 IntegerRes) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r4v1 com.bpjstku.util.constant.Citizenship) = (r4v0 com.bpjstku.util.constant.Citizenship), (r4v5 com.bpjstku.util.constant.Citizenship) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        IntegerRes integerRes;
        Citizenship citizenship;
        String strName;
        Editable text;
        AddKpjActivity addKpjActivity = (AddKpjActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f458a + 49;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            integerRes = (IntegerRes) addKpjActivity.asBinder.getValue();
            citizenship = addKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = 38 / 0;
            if (citizenship != null) {
                strName = citizenship.name();
            } else {
                strName = null;
            }
        } else {
            integerRes = (IntegerRes) addKpjActivity.asBinder.getValue();
            citizenship = addKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (citizenship != null) {
                strName = citizenship.name();
            } else {
                strName = null;
            }
        }
        String str = "";
        if (strName == null) {
            int i4 = f458a + 25;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            strName = "";
        }
        EditText editText = addKpjActivity.INotificationSideChannelStub().tilIdentityNumber.getEditText();
        if (editText != null) {
            int i6 = f458a + 47;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        String string = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
        MembershipType membershipType = addKpjActivity.b;
        String strName2 = membershipType != null ? membershipType.name() : null;
        if (strName2 == null) {
            int i8 = asInterface + 93;
            f458a = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str = strName2;
        }
        integerRes.TuitionPaymentFragmentbindingInflater1(strName, string, str);
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((IntegerRes) this.asBinder.getValue()).g.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: onMenuKeyEvent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddKpjActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = asInterface + 105;
        f458a = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends OnBackPressedCallback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super(true);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            AddKpjActivity.this.finish();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        AddKpjActivity addKpjActivity = this;
        Intrinsics.checkNotNullParameter(addKpjActivity, "");
        addKpjActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_add_kpj));
        EditText editText = INotificationSideChannelStub().tilIdentityNumber.getEditText();
        if (editText != null) {
            int i2 = f458a + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault3(editText);
            int i4 = asInterface + 67;
            f458a = i4 % 128;
            int i5 = i4 % 2;
        }
        getOnBackPressedDispatcher().addCallback(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i6 = f458a + 47;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = f458a + 45;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
                int i4 = asInterface + 47;
                f458a = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = f458a + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Button button = INotificationSideChannelStub().btnSave;
            Intrinsics.checkNotNullExpressionValue(button, "");
            Button button2 = button;
            Intrinsics.checkNotNullParameter(button2, "");
            button2.setEnabled(true);
        } else {
            Button button3 = INotificationSideChannelStub().btnSave;
            Intrinsics.checkNotNullExpressionValue(button3, "");
            Button button4 = button3;
            Intrinsics.checkNotNullParameter(button4, "");
            button4.setEnabled(false);
        }
        int i3 = f458a + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        f458a = i2 % 128;
        int i3 = i2 % 2;
        Button button = INotificationSideChannelStub().btnSave;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
        int i4 = f458a + 65;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdentityNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_bpjs_number_alphanumeric);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, Camera2CameraControlExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2)})));
        TextInputLayout textInputLayout2 = INotificationSideChannelStub().tilChooseCitizenship;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = INotificationSideChannelStub().tilChooseSegment;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        int i2 = f458a + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = f458a + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, bArr[5], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, scrollBarFadeDuration, scrollDefaultDelay, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{32402, 32404, 40025, 32499, 31835, 40109, 22675, 56108, 63393, 5454, 53815, 19476, 27717, 35816, 19217, 50613, 58111, 140, 64751, 16167, 23439, 30992, 30251, 45121, 53309, 61404}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{14428, 60963, 2153, 14393, 8061, 3096, 52390, 47112, 45427, 34293, 17927, 12110, 10881, 6989, 57187, 42676, 42017, 36901, 26830}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama6).substring(9, 10).length(), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
            int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b3, (short) (b3 | 51), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, packedPositionGroup, scrollBarSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f458a + 95;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                Object[] objArr6 = new Object[1];
                c((byte) 52, (short) 103, $$a[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, keyRepeatTimeout, i6, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ~System.identityHashCode(this);
            int i10 = ((1997055981 + ((~((-69937938) | i9)) * (-783))) + (((~(i9 | (-103530450))) | (-347810620)) * 783)) - 1480883335;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{26183, 15871, 3692, 26157, 62035, 57289, 51892, 21815, 61237, 22048, 16391, 49756, 29848, 51422, 55641, 19351, 64032, 17376, 28363, 45351}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{28519, 44821, 32397, 28430, 35497, 19750, 47686, 11714, 58959, 50383, 12531, 47793, 32151, 23163, 43416, 13180, 62256, 53521, 7723, 51669}, 1 - TextUtils.indexOf("", ""), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1992609690};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46038), 1135 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1480883335, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iAxisFromString = 14 - MotionEvent.axisFromString("");
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(b4, bArr2[5], b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, threadPriority, iAxisFromString, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.resolveSizeAndState(0, 0, 0) + 45993), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1116, View.MeasureSpec.getSize(0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                    Object[] objArr13 = new Object[1];
                    c((byte) 52, (short) 103, $$a[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, doubleTapTimeout, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{32402, 32404, 40025, 32499, 31835, 40109, 22675, 56108, 63393, 5454, 53815, 19476, 27717, 35816, 19217, 50613, 58111, 140, 64751, 16167, 23439, 30992, 30251, 45121, 53309, 61404}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{14428, 60963, 2153, 14393, 8061, 3096, 52390, 47112, 45427, 34293, 17927, 12110, 10881, 6989, 57187, 42676, 42017, 36901, 26830}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_primary_cta_text).substring(0, 6).codePointAt(5) - 115, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int scrollBarSize2 = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr16 = new Object[1];
                        c(b6, (short) (b6 | 51), b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout2, scrollBarSize2, iCombineMeasuredStates, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int iRed = Color.red(0) + 1031;
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 15;
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(b7, bArr3[5], b7, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAlpha, iRed, iCombineMeasuredStates2, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_4).substring(4, 5).length() - 2041684142;
            int i18 = i15 + 1578509993 + (((~(211319906 | length)) | (-455600077)) * (-964)) + (((~((~length) | 211319906)) | (-532676591)) * (-964));
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i21 = i14 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i21) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[3])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i25 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 488981342);
            int i26 = i22 + 1507168261 + ((~((-137494729) | i25)) * 52) + (((~(399081267 | i25)) | (~(154801097 | i25)) | (-536575996)) * (-52)) + (((~(i25 | (-399081268))) | 17306369) * 52);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr19[2])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29944);
            int i29 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
            byte[] bArr4 = $$a;
            Object[] objArr20 = new Object[1];
            c((byte) (bArr4[33] - 1), (short) 103, bArr4[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, i29, iLastIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c = (char) (29943 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iIndexOf2 = TextUtils.indexOf("", "") + 1755;
                int iIndexOf3 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                byte b8 = $$a[7];
                byte b9 = b8;
                Object[] objArr21 = new Object[1];
                c(b9, (short) (b9 | 51), b8, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, iIndexOf2, iIndexOf3, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode;
            int i31 = 1034181517 + (((~((-365399375) | i30)) | (-152796949)) * (-602)) + (((~(iIdentityHashCode | (-365399375))) | 348422218 | (~((-135819793) | i30))) * (-301)) + ((~(i30 | (-152796949))) * 301) + 430722637;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i33 ^ (i33 << 5);
            int i34 = asInterface + 99;
            f458a = i34 % 128;
            int i35 = i34 % 2;
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{26183, 15871, 3692, 26157, 62035, 57289, 51892, 21815, 61237, 22048, 16391, 49756, 29848, 51422, 55641, 19351, 64032, 17376, 28363, 45351}, 1 - Color.red(0), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{28519, 44821, 32397, 28430, 35497, 19750, 47686, 11714, 58959, 50383, 12531, 47793, 32151, 23163, 43416, 13180, 62256, 53521, 7723, 51669}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_eye_closed).substring(0, 28).length() - 27, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1992609690};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1726 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 430722637);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i36 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int i37 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                byte b10 = $$a[7];
                byte b11 = b10;
                Object[] objArr26 = new Object[1];
                c(b11, (short) (b11 | 51), b10, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay, i36, i37, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{32402, 32404, 40025, 32499, 31835, 40109, 22675, 56108, 63393, 5454, 53815, 19476, 27717, 35816, 19217, 50613, 58111, 140, 64751, 16167, 23439, 30992, 30251, 45121, 53309, 61404}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copy_payment_code).substring(9, 10).length(), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{14428, 60963, 2153, 14393, 8061, 3096, 52390, 47112, 45427, 34293, 17927, 12110, 10881, 6989, 57187, 42676, 42017, 36901, 26830}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_card_number).substring(11, 12).codePointAt(0) - 31, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                    int iKeyCodeFromString = 1755 - KeyEvent.keyCodeFromString("");
                    int iRed2 = Color.red(0) + 23;
                    byte b12 = $$a[7];
                    byte b13 = b12;
                    Object[] objArr29 = new Object[1];
                    c(b13, (short) (b13 | 140), b12, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetBefore, iKeyCodeFromString, iRed2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                    int iMyPid = 1755 - (Process.myPid() >> 22);
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                    byte[] bArr5 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((byte) (bArr5[33] - 1), (short) 103, bArr5[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask2, iMyPid, iIndexOf4, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i39 != i38) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr5 != null) {
                for (String str2 : strArr5) {
                    arrayList2.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i39));
        }
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i41 = i40 + (((~((-194997516) | iIdentityHashCode2)) | 177458213) * 262) + 1404854849 + (((~((~iIdentityHashCode2) | (-194997516))) | 177458213) * 262);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr31[3])[0] = i43 ^ (i43 << 5);
        int i44 = f458a + 23;
        asInterface = i44 % 128;
        if (i44 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1382505882
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i4 = ~i3;
        if (i2 != 1194213808 + (((~(i3 | (-1629941997))) | (~((-243795474) | i4)) | 1073783016) * (-68)) + ((~((-556158981) | i4)) * (-68)) + (((~(1629941996 | i4)) | (-799954454)) * 68)) {
            int i5 = asInterface + 65;
            f458a = i5 % 128;
            if (i5 % 2 == 0) {
                int[] iArr = new int[1657576929];
                iArr[1657576928] = 0;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1657576929];
                iArr2[1657576928] = 1;
                int i6 = (-517398048) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = ~iIdentityHashCode;
        int i9 = ~(888934873 | i8);
        if (i7 != 1792992812 + ((1073816066 | i9) * (-712)) + (((~(iIdentityHashCode | 1962750939)) | (~(i8 | (-1073816067)))) * (-712)) + (((-1690121092) | i9) * 712)) {
            int i10 = f458a + 7;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            int[] iArr3 = new int[2011245887];
            iArr3[2011245886] = 1;
            int i12 = (-1428420542) % 2;
            Toast.makeText((Context) null, iArr3[-1], 1).show();
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AddKpjActivity addKpjActivity, Citizenship citizenship) {
        String strName;
        int i = 2 % 2;
        addKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = citizenship;
        EditText editText = addKpjActivity.INotificationSideChannelStub().tilChooseCitizenship.getEditText();
        if (editText != null) {
            int i2 = f458a + 91;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Citizenship citizenship2 = addKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (citizenship2 != null) {
                strName = citizenship2.name();
                int i4 = f458a + 31;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 3;
                }
            } else {
                strName = null;
            }
            editText.setText(strName);
        }
        EditText editText2 = addKpjActivity.INotificationSideChannelStub().tilChooseSegment.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setText("");
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final AddKpjActivity addKpjActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            selectTab.Companion companion = selectTab.INSTANCE;
            selectTab selecttabTuitionPaymentFragmentspecialinlinedviewModeldefault3 = selectTab.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addKpjActivity.b, addKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: onKeyShortcut
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (MembershipType) obj);
                }
            });
            FragmentManager supportFragmentManager = addKpjActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            selecttabTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, selecttabTuitionPaymentFragmentspecialinlinedviewModeldefault3.getTag());
            ViewPortBuilder.b();
            int i2 = f458a + 67;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 90 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r5
  0x0035: PHI (r5v4 com.bpjstku.util.constant.MembershipType) = (r5v3 com.bpjstku.util.constant.MembershipType), (r5v5 com.bpjstku.util.constant.MembershipType) binds: [B:10:0x0033, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i;
        MembershipType membershipType;
        String strName;
        AddKpjActivity addKpjActivity = (AddKpjActivity) objArr[0];
        int i2 = 2 % 2;
        addKpjActivity.b = (MembershipType) objArr[1];
        EditText editText = addKpjActivity.INotificationSideChannelStub().tilChooseSegment.getEditText();
        String string = null;
        if (editText != null) {
            int i3 = f458a + 75;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                membershipType = addKpjActivity.b;
                int i4 = 19 / 0;
                if (membershipType != null) {
                    strName = membershipType.name();
                } else {
                    strName = null;
                }
            } else {
                membershipType = addKpjActivity.b;
                if (membershipType != null) {
                    strName = membershipType.name();
                } else {
                    strName = null;
                }
            }
            editText.setText(strName);
        }
        MembershipType membershipType2 = addKpjActivity.b;
        TextInputLayout textInputLayout = addKpjActivity.INotificationSideChannelStub().tilIdentityNumber;
        if (membershipType2 != null) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[membershipType2.ordinal()];
            if (i5 == 1) {
                string = addKpjActivity.getString(R.string.label_nik);
                i = f458a + 115;
                asInterface = i % 128;
            } else if (i5 != 2) {
                string = addKpjActivity.getString(R.string.label_identity_number);
            } else {
                string = addKpjActivity.getString(R.string.label_jamsostek_no);
                i = asInterface + 49;
                f458a = i % 128;
            }
            int i6 = i % 2;
        }
        textInputLayout.setHint(string);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0227  */
    /* JADX WARN: Code duplicated, block: B:80:0x0258  */
    /* JADX WARN: Code duplicated, block: B:88:0x0297 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:3:0x000c, B:5:0x003e, B:7:0x004d, B:9:0x0053, B:13:0x0074, B:17:0x0084, B:24:0x00a9, B:88:0x0297, B:29:0x00b6, B:30:0x00cf, B:40:0x0102, B:39:0x00ec, B:42:0x016e, B:48:0x0188, B:49:0x0199, B:50:0x019e, B:51:0x01b4, B:53:0x01ca, B:55:0x01d0, B:58:0x01fe, B:62:0x020d, B:67:0x021e, B:79:0x0253, B:82:0x025b, B:86:0x026f, B:87:0x0282, B:70:0x0231, B:71:0x0235, B:73:0x023b, B:75:0x0249, B:65:0x0218, B:14:0x007c, B:89:0x02f8), top: B:94:0x000c }] */
    public static /* synthetic */ void b(AddKpjActivity addKpjActivity, View view) {
        String strName;
        Boolean boolValueOf;
        Toast toastMakeText;
        List<SubscribedProgram> list;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            boolean z = true;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_add_kpj", "save_add_kpj"));
            Intrinsics.checkNotNullParameter(addKpjActivity, "");
            Intrinsics.checkNotNullParameter("save_add_kpj", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("save_add_kpj", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("save_add_kpj", mapMutableMapOf);
            if (addKpjActivity.RemoteActionCompatParcelizer()) {
                EditText editText = addKpjActivity.INotificationSideChannelStub().tilIdentityNumber.getEditText();
                int length = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString().length();
                MembershipType membershipType = addKpjActivity.b;
                if (membershipType != null) {
                    int i2 = asInterface + 3;
                    f458a = i2 % 128;
                    if (i2 % 2 == 0) {
                        strName = membershipType.name();
                        int i3 = 69 / 0;
                    } else {
                        strName = membershipType.name();
                    }
                } else {
                    strName = null;
                }
                if (strName != null) {
                    int iHashCode = strName.hashCode();
                    if (iHashCode != 2565) {
                        if (iHashCode != 65991) {
                            if (iHashCode == 79340 && strName.equals("PMI")) {
                                if (length < 6 || length > 16) {
                                    String string = addKpjActivity.getString(R.string.label_min_identity_number);
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                                } else {
                                    b(new Object[]{addKpjActivity}, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1956549589 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), -1203560811, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1203560811, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).length() - 60226162);
                                }
                            }
                        } else if (strName.equals("BPU")) {
                            int i4 = f458a + 17;
                            asInterface = i4 % 128;
                            if (i4 % 2 == 0 ? length == 16 : length == 75) {
                                b(new Object[]{addKpjActivity}, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1956549589, -1203560811, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1203560811, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).length() - 60226162);
                                int i5 = f458a + 117;
                                asInterface = i5 % 128;
                                int i6 = i5 % 2;
                            } else {
                                String string2 = addKpjActivity.getString(R.string.label_min_nik);
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                            }
                        }
                    } else if (strName.equals("PU")) {
                        if (length != 11) {
                            int i7 = asInterface + 65;
                            f458a = i7 % 128;
                            if (i7 % 2 == 0) {
                                String string3 = addKpjActivity.getString(R.string.label_min_kpj);
                                Intrinsics.checkNotNullExpressionValue(string3, "");
                                toastMakeText = Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 1);
                                toastMakeText.show();
                            } else {
                                String string4 = addKpjActivity.getString(R.string.label_min_kpj);
                                Intrinsics.checkNotNullExpressionValue(string4, "");
                                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
                            }
                        } else {
                            IntegerRes integerRes = (IntegerRes) addKpjActivity.asBinder.getValue();
                            EditText editText2 = addKpjActivity.INotificationSideChannelStub().tilIdentityNumber.getEditText();
                            String string5 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
                            MembershipType membershipType2 = addKpjActivity.b;
                            Intrinsics.checkNotNull(membershipType2);
                            String strName2 = membershipType2.name();
                            Intrinsics.checkNotNullParameter(string5, "");
                            Intrinsics.checkNotNullParameter(strName2, "");
                            User userAsBinder = integerRes.TuitionPaymentFragmentbindingInflater1.asBinder();
                            if (userAsBinder != null) {
                                int i8 = asInterface + 17;
                                f458a = i8 % 128;
                                int i9 = i8 % 2;
                                List<SubscribedProgram> list2 = userAsBinder.INotificationSideChannel;
                                if (list2 != null) {
                                    int i10 = asInterface + 79;
                                    f458a = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        list = list2;
                                        int i11 = 9 / 0;
                                        if (!(!(list instanceof Collection))) {
                                            if (list.isEmpty()) {
                                                int i12 = f458a + 25;
                                                asInterface = i12 % 128;
                                                int i13 = i12 % 2;
                                            }
                                            z = false;
                                            break;
                                        }
                                        boolValueOf = Boolean.valueOf(z);
                                    } else {
                                        list = list2;
                                        if (list instanceof Collection) {
                                            if (list.isEmpty()) {
                                                int i14 = f458a + 25;
                                                asInterface = i14 % 128;
                                                int i15 = i14 % 2;
                                            }
                                            z = false;
                                            break;
                                        }
                                        boolValueOf = Boolean.valueOf(z);
                                    }
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                        SubscribedProgram subscribedProgram = (SubscribedProgram) it.next();
                                        if (StringsKt.equals(subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2, string5, true) && StringsKt.equals(subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault1, strName2, true)) {
                                            break;
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z);
                                } else {
                                    boolValueOf = null;
                                }
                            } else {
                                boolValueOf = null;
                            }
                            if (boolValueOf != null) {
                                if (boolValueOf.booleanValue()) {
                                    int i16 = asInterface + 53;
                                    f458a = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        String string6 = addKpjActivity.getString(R.string.error_message_kpj_already_exist);
                                        Intrinsics.checkNotNullExpressionValue(string6, "");
                                        toastMakeText = Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string6, 0);
                                        toastMakeText.show();
                                    } else {
                                        String string7 = addKpjActivity.getString(R.string.error_message_kpj_already_exist);
                                        Intrinsics.checkNotNullExpressionValue(string7, "");
                                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string7, 0).show();
                                    }
                                } else {
                                    b(new Object[]{addKpjActivity}, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1956549589 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), -1203560811, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1203560811, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).length() - 60226162);
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final AddKpjActivity addKpjActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            removeTabAt.Companion companion = removeTabAt.INSTANCE;
            removeTabAt removetabatB = removeTabAt.Companion.b(addKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Function1() { // from class: openOptionsMenu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddKpjActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Citizenship) obj);
                }
            });
            FragmentManager supportFragmentManager = addKpjActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            removetabatB.show(supportFragmentManager, removetabatB.getTag());
            ViewPortBuilder.b();
            int i2 = asInterface + 51;
            f458a = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    /* JADX WARN: Code duplicated, block: B:16:0x008d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AddKpjActivity addKpjActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = f458a;
        int i3 = i2 + 99;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0) {
            int i5 = 13 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                addKpjActivity.MediaBrowserCompat();
                str = "loading_save_add_kpj_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i6 = i2 + 83;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                addKpjActivity.IconCompatParcelizer();
                String string = addKpjActivity.getString(R.string.message_add_kpj_succeed);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
                addKpjActivity.finish();
                ((ActivityResultContractsPickVisualMediaMediaCapabilities) addKpjActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(addKpjActivity, null, false, 6);
                addKpjActivity.d_();
                str = "success_save_add_kpj_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i8 = i4 + 27;
                f458a = i8 % 128;
                int i9 = i8 % 2;
                addKpjActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                str = "failure_save_add_kpj_result";
            } else {
                addKpjActivity.IconCompatParcelizer();
                str = "";
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            addKpjActivity.MediaBrowserCompat();
            str = "loading_save_add_kpj_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i10 = i2 + 83;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            addKpjActivity.IconCompatParcelizer();
            String string2 = addKpjActivity.getString(R.string.message_add_kpj_succeed);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
            addKpjActivity.finish();
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) addKpjActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(addKpjActivity, null, false, 6);
            addKpjActivity.d_();
            str = "success_save_add_kpj_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i12 = i4 + 27;
            f458a = i12 % 128;
            int i13 = i12 % 2;
            addKpjActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            str = "failure_save_add_kpj_result";
        } else {
            addKpjActivity.IconCompatParcelizer();
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_save_add_kpj_result", str));
        Intrinsics.checkNotNullParameter(addKpjActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AddKpjActivity addKpjActivity, MembershipType membershipType) {
        return (Unit) b(new Object[]{addKpjActivity, membershipType}, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 509668669, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -509668667, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 59;
        d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final void cancelAll() throws IllegalAccessException {
        b(new Object[]{this}, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1956549589 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), -1203560811, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1203560811, (-60226162) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).length());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        f458a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        f458a = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_add_kpj;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        f458a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        f458a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        b(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_due_amount).substring(8, 9).length() - 1436386888, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1755881214, 479306106 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4), 1755881215, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        b(new Object[]{this}, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 816178604, 1033775990, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1033775987, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    static void g() {
        g = -3843539664814798799L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        AddKpjActivity addKpjActivity = (AddKpjActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 35;
        f458a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 63;
        f458a = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 2
            int r8 = 107 - r8
            byte[] r1 = com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity.$$i(int, int, int):java.lang.String");
    }
}
