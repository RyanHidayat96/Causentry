package com.bpjstku.presentation.program.jkm;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJkmServiceBinding;
import com.bpjstku.di.ApiModuleKt;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.jkm.model.JkmService;
import com.bpjstku.presentation.program.ClaimChooseSegmentActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2;
import com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity;
import com.bpjstku.presentation.program.jkm.JkmServiceActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.getCaptureRequestOption;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.lambdapreCapture2;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/program/jkm/JkmServiceActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkmServiceBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Ljava/lang/String;", "LCamera2CameraControlImplExternalSyntheticLambda4;", "Lkotlin/Lazy;", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LlambdapreCapture2;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkmServiceActivity extends BindingBaseActivity<ActivityJkmServiceBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$a = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 210;
    private static int asBinder = 1;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f602a = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JkmServiceActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

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

    /* JADX WARN: Code duplicated, block: B:13:0x00f0  */
    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = i6 | i3;
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = ~i6;
        int i12 = i10 | (~(i11 | i5));
        int i13 = ~(i9 | i6);
        int i14 = i12 | i13;
        int i15 = (~(i5 | i11 | i3)) | i13;
        int i16 = i6 + i3 + i + (1881146393 * i2) + ((-1035018111) * i4);
        int i17 = i16 * i16;
        int i18 = ((i6 * (-1924067824)) - 304087040) + ((-1924067824) * i3) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i) + (1612709888 * i2) + ((-182452224) * i4) + ((-1611137024) * i17);
        int i19 = (i6 * (-928100048)) + 945860906 + (i3 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + ((-928100237) * i) + (i2 * (-1331189957)) + (i4 * 1329932787) + (i17 * 1550319616);
        int i20 = i18 + (i19 * i19 * 1690828800);
        if (i20 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i20 == 2) {
            int i21 = 2 % 2;
            int i22 = f602a + 115;
            g = i22 % 128;
            int i23 = i22 % 2;
            JkmServiceActivity$bindingInflater$1 jkmServiceActivity$bindingInflater$1 = JkmServiceActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            int i24 = f602a + 25;
            g = i24 % 128;
            int i25 = i24 % 2;
            return jkmServiceActivity$bindingInflater$1;
        }
        JkmServiceActivity jkmServiceActivity = (JkmServiceActivity) objArr[0];
        int i26 = 2 % 2;
        int i27 = g + 51;
        f602a = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i29 = ~elapsedCpuTime;
            if (i28 != 1168966376 + (((~(949324008 | i29)) | 117990929) * 168) + ((~((-117990930) | elapsedCpuTime)) * 168) + (((~(elapsedCpuTime | 1067314937)) | (~(i29 | (-119336466))) | 1345536) * 168)) {
                int[] iArr = new int[683318012];
                iArr[683318011] = 1;
                int i30 = 726240532 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i31 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i32 = ~i;
            if (i31 != ((((~((-443693254) | i32)) | 269494337) * (-241)) - 2063309225) + (((~(i32 | (-174198917))) | (-1543175134)) * 241)) {
                int[] iArr2 = new int[683318012];
                iArr2[683318011] = 1;
                int i33 = 726240532 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i34 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i35 = ~i;
        if (i34 != (-856319252) + (((~(i35 | 2108686300)) | 470369664) * (-828)) + ((i35 | 2108686300) * (-828)) + 2059432244) {
            throw new RuntimeException("343751102");
        }
        super.onResume();
        int i36 = g + 107;
        f602a = i36 % 128;
        int i37 = i36 % 2;
        return null;
    }

    private static void c(int i, byte b, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (b2 * 14) + 84;
        int i3 = 196 - i;
        byte[] bArr2 = new byte[b + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (b + (-i2)) - 11;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            i3++;
            bArr2[i5] = (byte) i2;
            if (i5 == b) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 11;
                i4 = i5;
            }
        }
    }

    public JkmServiceActivity() {
        final JkmServiceActivity jkmServiceActivity = this;
        this.b = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jkm.JkmServiceActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [Camera2CameraControlImplExternalSyntheticLambda4, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                ComponentCallbacks componentCallbacks = jkmServiceActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkm.JkmServiceActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jkm/JkmServiceActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) JkmServiceActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityJkmServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JkmServiceActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        int i2 = g + 123;
        f602a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
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
            int i3 = $10 + 5;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19473 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 2625, (ViewConfiguration.getFadingEdgeLength() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39422), 482 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 29;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 11;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39421), 481 - View.getDefaultSize(0, 0), MotionEvent.axisFromString("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - TextUtils.getOffsetAfter("", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, 36 - Process.getGidForName(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.b.getValue()).onTransact.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkmServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = f602a + 89;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JkmServiceActivity jkmServiceActivity = this;
        Intrinsics.checkNotNullParameter(jkmServiceActivity, "");
        jkmServiceActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityJkmServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityJkmServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.label_death_security));
        RecyclerView recyclerView = ((ActivityJkmServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvJkmService;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((lambdapreCapture2) this.TuitionPaymentFragmentbindingInflater1.getValue());
        int i2 = f602a + 99;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(p0, "PMI")) {
            getCaptureRequestOption.Companion companion = getCaptureRequestOption.INSTANCE;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE, "{\"source\":\"jmo\"}", ApiModuleKt.getClaimPmiSaltKey()));
            int i2 = g + 101;
            f602a = i2 % 128;
            int i3 = i2 % 2;
            return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i4 = g + 123;
        f602a = i4 % 128;
        int i5 = i4 % 2;
        getCaptureRequestOption.Companion companion2 = getCaptureRequestOption.INSTANCE;
        return getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCaptureRequestOption.INSTANCE.TuitionPaymentFragmentbindingInflater1("{\"source\":\"jmo\"}", ApiModuleKt.getClaimPmiSaltKey(), "PMI"));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29943 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
            int iRgb = Color.rgb(0, 0, 0) + 16777239;
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) 37, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, trimmedLength, iRgb, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int i2 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                Object[] objArr3 = new Object[1];
                c((short) 156, (byte) ($$b >>> 2), $$a[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, i2, packedPositionType, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i3 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i4 = ~(37943761 | i3);
            int i5 = (-1453601483) + ((i4 | 174658664) * 764) + (((~(i3 | 174658664)) | 190865) * (-1528)) + ((137096633 | i4) * 764) + 1800701516;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{1079, 61887, 61229, 58549, 53887, 53182, 50478, 45734, 43042, 42472, 37648, 34949, 34314, 29582, 26898, 26269}, (ViewConfiguration.getEdgeSlop() >> 16) + 62851, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{1076, 39024, 15530, 53480, 29965, 2393, 44447, 16859, 58973, 31405, 7924, 45846, 22386, 60295, 36807, 11391}, 40009 - Color.green(0), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-531636759};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 42049), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1800701516, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    Object[] objArr8 = new Object[1];
                    c((short) 156, (byte) ($$b >>> 2), $$a[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, scrollDefaultDelay, i8, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{1084, 15764, 30583, 43226, 58030, 9335, 24019, 38882, 51466, 753, 17653, 32291, 47088, 59733, 8971, 25841, 40512, 53257, 2447, 17239, 34098, 48773}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14759, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{1080, 1648, 190, 750, 3370, 3965, 2495, 3016, 5680, 4213, 4795, 7394, 7992, 6525, 7094}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_gojek_message).substring(35, 37).codePointAt(0) + 476, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollDefaultDelay2 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
                        short s = (short) 104;
                        Object[] objArr11 = new Object[1];
                        c(s, (byte) (s >>> 1), $$a[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay2, maximumDrawingCacheSize, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int mirror = AndroidCharacter.getMirror('0') - 25;
                        Object[] objArr12 = new Object[1];
                        c((short) 193, (byte) 37, $$a[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i9, mirror, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i12 = i10 + 2103040329 + (((~((-21766221) | (~i11))) | (~(190836205 | i11))) * (-272)) + (((~((-22929518) | i11)) | 1163297) * (-272)) + (((~(i11 | 22929517)) | 189672908) * 272);
        int i13 = (i12 << 13) ^ i12;
        int i14 = i13 ^ (i13 >>> 17);
        ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        int i15 = f602a;
        int i16 = i15 + 23;
        g = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i15 + 123;
        g = i18 % 128;
        int i19 = i18 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int i20 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
            int iMyPid = (Process.myPid() >> 22) + 15;
            short s2 = (short) ($$b >>> 2);
            Object[] objArr14 = new Object[1];
            c(s2, (byte) s2, $$a[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i20, iMyPid, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{1084, 15764, 30583, 43226, 58030, 9335, 24019, 38882, 51466, 753, 17653, 32291, 47088, 59733, 8971, 25841, 40512, 53257, 2447, 17239, 34098, 48773}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14759, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{1080, 1648, 190, 750, 3370, 3965, 2495, 3016, 5680, 4213, 4795, 7394, 7992, 6525, 7094}, TextUtils.lastIndexOf("", '0', 0) + 578, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int gidForName = 1030 - Process.getGidForName("");
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr17 = new Object[1];
            c((short) 156, (byte) ($$b >>> 2), $$a[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyTid, gidForName, iLastIndexOf, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i21 = f602a + 79;
            g = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int iMyPid2 = (Process.myPid() >> 22) + 1031;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                byte[] bArr = $$a;
                short s3 = bArr[7];
                Object[] objArr18 = new Object[1];
                c(s3, (byte) s3, bArr[5], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, iMyPid2, jumpTapTimeout, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr19[3])[0];
            int i24 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ((((-2140082559) + (((~(105675985 | iIdentityHashCode)) | 278102058) * 336)) + (((~(iIdentityHashCode | 349956155)) | 33821888) * (-168))) + (((~((~iIdentityHashCode) | 349956155)) | 105675985) * 168)) - 1948064377;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{1079, 61887, 61229, 58549, 53887, 53182, 50478, 45734, 43042, 42472, 37648, 34949, 34314, 29582, 26898, 26269}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 62815, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{1076, 39024, 15530, 53480, 29965, 2393, 44447, 16859, 58973, 31405, 7924, 45846, 22386, 60295, 36807, 11391}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 39892, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-531636759};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46038), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), 18 - Color.alpha(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1948064377, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                short s4 = (short) ($$b >>> 2);
                Object[] objArr24 = new Object[1];
                c(s4, (byte) s4, $$a[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMakeMeasureSpec, iResolveOpacity, threadPriority, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionType(0L)), 1118 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 17), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int i28 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i29 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                byte[] bArr2 = $$a;
                short s5 = bArr2[7];
                Object[] objArr26 = new Object[1];
                c(s5, (byte) s5, bArr2[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveOpacity, i28, i29, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{1084, 15764, 30583, 43226, 58030, 9335, 24019, 38882, 51466, 753, 17653, 32291, 47088, 59733, 8971, 25841, 40512, 53257, 2447, 17239, 34098, 48773}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 14748, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{1080, 1648, 190, 750, 3370, 3965, 2495, 3016, 5680, 4213, 4795, 7394, 7992, 6525, 7094}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 541, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                    int i30 = 1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int defaultSize = View.getDefaultSize(0, 0) + 15;
                    Object[] objArr29 = new Object[1];
                    c((short) 156, (byte) ($$b >>> 2), $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(capsMode2, i30, defaultSize, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int i31 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 16;
                    short s6 = (short) ($$b >>> 2);
                    Object[] objArr30 = new Object[1];
                    c(s6, (byte) s6, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode, i31, iIndexOf2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 == i32) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[3])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 601404329;
            int i37 = ~length;
            int i38 = i34 + (-1589575152) + (((~((-225292623) | i37)) | 18987547) * 226) + (((~(i37 | (-206307653))) | (~((-18987548) | length)) | 2577) * (-113)) + ((~(length | (-225292623))) * 113);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i41 = 0;
            while (i41 < strArr4.length) {
                int i42 = g + 41;
                f602a = i42 % 128;
                if (i42 % 2 == 0) {
                    arrayList2.add(strArr4[i41]);
                    i41 += 79;
                } else {
                    arrayList2.add(strArr4[i41]);
                    i41++;
                }
            }
        }
        int[] iArr = new int[i33];
        int i43 = i33 - 1;
        iArr[i43] = 1;
        Toast.makeText((Context) null, iArr[((i33 * i43) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iMyPid3 = Process.myPid();
        int i47 = i44 + (-1210876524) + (((-33898562) | iMyPid3) * (-627)) + (((~(59102433 | iMyPid3)) | 303382603) * (-627)) + (((~(iMyPid3 | 303382603)) | (~((~iMyPid3) | (-59102434)))) * 627);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr32[2])[0] = i49 ^ (i49 << 5);
        int i50 = g + 11;
        f602a = i50 % 128;
        int i51 = i50 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1325964126
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkm.JkmServiceActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ea, code lost:
    
        if (r1 == ((((~((~r3) | 2128543725)) * 130) - 1985038424) + (((~(r3 | 2128543725)) | 412627016) * 130))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ec, code lost:
    
        r1 = com.bpjstku.presentation.program.jkm.JkmServiceActivity.f602a + 13;
        com.bpjstku.presentation.program.jkm.JkmServiceActivity.g = r1 % 128;
        r1 = r1 % 2;
        r1 = new int[876906906];
        r1[876906905(0x34448999, float:1.830398E-7)] = 1;
        r3 = (-1082022134) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r1[-1], 1).show();
        r1 = com.bpjstku.presentation.program.jkm.JkmServiceActivity.f602a + 5;
        com.bpjstku.presentation.program.jkm.JkmServiceActivity.g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0115, code lost:
    
        super.onCreate(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0118, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0120, code lost:
    
        throw new java.lang.RuntimeException("195965998");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0071, code lost:
    
        if (r1 == ((((-1541134816) + (((-69501953) | r8) * (-627))) + (((~(1437437792 | r8)) | 607450249) * (-627))) + (((~(r8 | 607450249)) | (~((~r8) | (-1437437793)))) * 627))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a8, code lost:
    
        if (r1 == ((((-376243144) + ((~((~r8) | (-134218753))) * 433)) + (((~(1014574947 | r8)) | (-184587405)) * (-433))) + (((~(r8 | (-184587405))) | 880356195) * 433))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00aa, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = (java.lang.Object[]) null;
        r3 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1290241700;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkm.JkmServiceActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkmServiceActivity jkmServiceActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String string;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = f602a + 79;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                jkmServiceActivity.MediaBrowserCompat();
                int i3 = 26 / 0;
            } else {
                jkmServiceActivity.MediaBrowserCompat();
            }
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i4 = f602a + 123;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    jkmServiceActivity.IconCompatParcelizer();
                    ((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty();
                    obj.hashCode();
                    throw null;
                }
                jkmServiceActivity.IconCompatParcelizer();
                List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(!list.isEmpty())) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkmServiceActivity, "Data Segemen Tidak Tersedia", null);
                } else if (list.size() == 1) {
                    String upperCase = ((ClaimSegmenItem) list.get(0)).b.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (Intrinsics.areEqual(upperCase, "PMI")) {
                        getMaxImages getmaximages = getMaxImages.INSTANCE;
                        String strConnect = getMaxImages.connect();
                        jkmServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strConnect;
                        String lowerCase = ProgramType.JKM.getCode().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        String upperCase2 = upperCase.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(upperCase2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(strConnect);
                        sb.append("/");
                        sb.append(lowerCase);
                        sb.append("/");
                        sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        string = sb.toString();
                    } else {
                        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                        String strMediaBrowserCompat = getMaxImages.MediaBrowserCompat();
                        jkmServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strMediaBrowserCompat;
                        String lowerCase2 = ProgramType.JKM.getCode().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                        String upperCase3 = upperCase.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(upperCase3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strMediaBrowserCompat);
                        sb2.append("/");
                        sb2.append(lowerCase2);
                        sb2.append("/");
                        sb2.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                        string = sb2.toString();
                    }
                    String str = string;
                    WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                    String string2 = jkmServiceActivity.getString(R.string.label_title_claim_jkk);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkmServiceActivity, str, string2, 0, null, false, 56);
                    int i5 = f602a + 43;
                    g = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 % 5;
                    }
                } else {
                    ClaimChooseSegmentActivity.Companion companion2 = ClaimChooseSegmentActivity.INSTANCE;
                    ClaimChooseSegmentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkmServiceActivity, list, ProgramType.JKM.getCode());
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                jkmServiceActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(jkmServiceActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ lambdapreCapture2 TuitionPaymentFragmentbindingInflater1(final JkmServiceActivity jkmServiceActivity) {
        List listMutableListOf;
        int i = 2 % 2;
        JkmServiceActivity jkmServiceActivity2 = jkmServiceActivity;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (((Boolean) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], 905740350, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -905740340)).booleanValue()) {
            String string = jkmServiceActivity.getString(R.string.label_claim_jkm);
            Intrinsics.checkNotNullExpressionValue(string, "");
            JkmService jkmService = new JkmService(1, "Klaim Manfaat JKM", string, R.drawable.ic_eclaim);
            String string2 = jkmServiceActivity.getString(R.string.label_check_tracking_eclaim);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listMutableListOf = CollectionsKt.mutableListOf(jkmService, new JkmService(2, "Lacak Klaim JKM", string2, R.drawable.ic_tracking_claim));
            int i2 = f602a + 57;
            g = i2 % 128;
            int i3 = i2 % 2;
        } else {
            String string3 = jkmServiceActivity.getString(R.string.label_check_tracking_eclaim);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            listMutableListOf = CollectionsKt.mutableListOf(new JkmService(2, "Lacak Klaim JKM", string3, R.drawable.ic_tracking_claim));
        }
        return new lambdapreCapture2(jkmServiceActivity2, listMutableListOf, new Function1() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkmServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (JkmService) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkmServiceActivity jkmServiceActivity, JkmService jkmService) {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = f602a + 115;
        g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(jkmService, "");
        if (i4 == 0 ? (i = jkmService.TuitionPaymentFragmentbindingInflater1) == 1 : (i = jkmService.TuitionPaymentFragmentbindingInflater1) == 0) {
            JkmChoosenMembershipActivity.Companion companion = JkmChoosenMembershipActivity.INSTANCE;
            JkmChoosenMembershipActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jkmServiceActivity);
            int i5 = g + 125;
            f602a = i5 % 128;
            int i6 = i5 % 2;
            str = "claim_jkm";
        } else if (i != 2) {
            str = "";
        } else {
            ClaimTrackingActivity.Companion companion2 = ClaimTrackingActivity.INSTANCE;
            ClaimTrackingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkmServiceActivity);
            str = "tracking_claim_jkm";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_jht_program", str));
        Intrinsics.checkNotNullParameter(jkmServiceActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(JkmServiceActivity jkmServiceActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 47;
        f602a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                jkmServiceActivity.finish();
                ViewPortBuilder.b();
            } else {
                jkmServiceActivity.finish();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    static {
        d = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 55;
        d = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkmServiceBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1874995353, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1874995355);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -788503888, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 788503889)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f602a + 37;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f602a + 9;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -456517010, MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.timeout_message).substring(3, 4).length() - 205566561, 456517010);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 83;
        f602a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 79691017770806598L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = f602a + 105;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_jkm_service);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
