package com.bpjstku.presentation.program.jkk;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityJkkServiceBinding;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.jkk.model.JkkService;
import com.bpjstku.presentation.program.ClaimChooseSegmentActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.tracking.ClaimTrackingActivity;
import com.bpjstku.presentation.program.jkk.JkkServiceActivity;
import com.bpjstku.presentation.report.ReportAccidentActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.util.constant.ProgramType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.measurement.internal.zzny;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13;
import defpackage.CameraUseCaseAdapter;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getTheme;
import defpackage.initSession;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
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
import okhttp3.tls.internal.der.DerHeader;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0011\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/program/jkk/JkkServiceActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJkkServiceBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/lang/String;", "LCamera2CameraControlImplExternalSyntheticLambda4;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "LCamera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkkServiceActivity extends BindingBaseActivity<ActivityJkkServiceBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {48, -119, -71, 110, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 119;
    private static int asBinder = 0;
    private static int g = 0;
    private static int asInterface = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: lambdapreCapture6androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JkkServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

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

    public static /* synthetic */ Object b(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i5);
        int i12 = i6 | i11;
        int i13 = (~(i6 | i5)) | (~(i7 | i8 | i9)) | i11 | (~(i3 | i6));
        int i14 = i3 + i5 + i + (1272450877 * i4) + ((-51365948) * i2);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i5) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i) + ((-1881145344) * i4) + ((-578813952) * i2) + ((-124846080) * i15);
        int i17 = (i3 * 1187242746) + 1002376400 + (i5 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i * 1187242569) + (i4 * (-1484311963)) + (i2 * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        if (i18 != 1) {
            return i18 != 2 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i19 = 2 % 2;
        int i20 = asInterface + 121;
        g = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r7
            int r8 = r8 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = com.bpjstku.presentation.program.jkk.JkkServiceActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkServiceActivity.c(byte, byte, int, java.lang.Object[]):void");
    }

    public JkkServiceActivity() {
        final JkkServiceActivity jkkServiceActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jkk.JkkServiceActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [Camera2CameraControlImplExternalSyntheticLambda4, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                ComponentCallbacks componentCallbacks = jkkServiceActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jkk.JkkServiceActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/program/jkk/JkkServiceActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) JkkServiceActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJkkServiceBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        JkkServiceActivity$bindingInflater$1 jkkServiceActivity$bindingInflater$1 = JkkServiceActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = g + 79;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return jkkServiceActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityJkkServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lambdapreCapture8androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JkkServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
            }
        });
        int i2 = asInterface + 109;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).onTransact.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: lambdapreCapture7androidxcameracamera2internalCamera2CapturePipelineScreenFlashTask
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkkServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = g + 1;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        JkkServiceActivity jkkServiceActivity = this;
        Intrinsics.checkNotNullParameter(jkkServiceActivity, "");
        jkkServiceActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityJkkServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityJkkServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.label_work_accident_security));
        RecyclerView recyclerView = ((ActivityJkkServiceBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvJkkService;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13) this.TuitionPaymentFragmentbindingInflater1.getValue());
        int i2 = g + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0179  */
    /* JADX WARN: Code duplicated, block: B:37:0x017a  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 3291 - TextUtils.indexOf("", "", 0, 0), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1199271174, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 44, -450685997, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        if (i3 > 0) {
            int i7 = $10 + 87;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $11 + 57;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            int i10 = $11 + 31;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 651, TextUtils.lastIndexOf("", '0', 0) + 45, -450685997, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r4 = defpackage.getCaptureRequestOption.INSTANCE;
        r0 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r4 = defpackage.getCaptureRequestOption.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.getCaptureRequestOption.INSTANCE.TuitionPaymentFragmentbindingInflater1("{\"source\":\"jmo\"}", com.bpjstku.di.ApiModuleKt.getClaimPmiSaltKey(), "PMI"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r4 = defpackage.getCaptureRequestOption.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        return defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.getCaptureRequestOption.INSTANCE, "{\"source\":\"jmo\"}", com.bpjstku.di.ApiModuleKt.getClaimPmiSaltKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(defpackage.getCaptureRequestOption.INSTANCE.TuitionPaymentFragmentbindingInflater1("{\"source\":\"jmo\"}", com.bpjstku.di.ApiModuleKt.getClaimPmiSaltKey(), "PMI"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, "PMI") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, "PMI") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4 = com.bpjstku.presentation.program.jkk.JkkServiceActivity.g + 103;
        com.bpjstku.presentation.program.jkk.JkkServiceActivity.asInterface = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jkk.JkkServiceActivity.g
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.bpjstku.presentation.program.jkk.JkkServiceActivity.asInterface = r2
            int r1 = r1 % r0
            java.lang.String r2 = "{\"source\":\"jmo\"}"
            java.lang.String r3 = "PMI"
            if (r1 != 0) goto L1d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            r1 = 59
            int r1 = r1 / 0
            if (r4 == 0) goto L54
            goto L23
        L1d:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r4 == 0) goto L54
        L23:
            int r4 = com.bpjstku.presentation.program.jkk.JkkServiceActivity.g
            int r4 = r4 + 103
            int r1 = r4 % 128
            com.bpjstku.presentation.program.jkk.JkkServiceActivity.asInterface = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L43
            getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1 r4 = defpackage.getCaptureRequestOption.INSTANCE
            getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1 r4 = defpackage.getCaptureRequestOption.INSTANCE
            java.lang.String r0 = com.bpjstku.di.ApiModuleKt.getClaimPmiSaltKey()
            java.lang.String r4 = r4.TuitionPaymentFragmentbindingInflater1(r2, r0, r3)
            java.lang.String r4 = defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4)
            r0 = 72
            int r0 = r0 / 0
            goto L53
        L43:
            getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1 r4 = defpackage.getCaptureRequestOption.INSTANCE
            getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1 r4 = defpackage.getCaptureRequestOption.INSTANCE
            java.lang.String r0 = com.bpjstku.di.ApiModuleKt.getClaimPmiSaltKey()
            java.lang.String r4 = r4.TuitionPaymentFragmentbindingInflater1(r2, r0, r3)
            java.lang.String r4 = defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4)
        L53:
            return r4
        L54:
            getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1 r4 = defpackage.getCaptureRequestOption.INSTANCE
            getCaptureRequestOption$TuitionPaymentFragmentbindingInflater1 r4 = defpackage.getCaptureRequestOption.INSTANCE
            java.lang.String r0 = com.bpjstku.di.ApiModuleKt.getClaimPmiSaltKey()
            java.lang.String r4 = defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4, r2, r0)
            java.lang.String r4 = defpackage.getCaptureRequestOption.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkServiceActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.String):java.lang.String");
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr2;
        int i = 0;
        JkkServiceActivity jkkServiceActivity = (JkkServiceActivity) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = asInterface + 21;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                int i4 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr3 = new Object[1];
                c(b, (byte) (b | 15), bArr[28], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, i5, 986134021, false, (String) objArr3[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
            int i6 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr4 = new Object[1];
            c(b2, (byte) (b2 | 15), bArr2[28], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, i6, iLastIndexOf, 986134021, false, (String) objArr4[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                c(b3, b4, (short) (b4 | 36), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iRgb, fadingEdgeLength, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr6[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i7}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iMyUid = Process.myUid();
            int i8 = (((-1987310087) + (((~(666667473 | iMyUid)) | 272633866) * 576)) + (((~((~iMyUid) | 939301339)) | 606636033) * 576)) - 646517634;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            e(true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 194, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 100, new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, objArr7);
            Class<?> cls = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 162, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).codePointAt(23) - 81, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_status_title).substring(1, 3).codePointAt(0) - 88, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr8);
            int iIntValue = ((Integer) cls.getMethod((String) objArr8[0], Object.class).invoke(null, jkkServiceActivity)).intValue();
            try {
                Object[] objArr9 = {-1855409447};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1727, 29 - View.MeasureSpec.getSize(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1230165502, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 1756;
                    int mirror = AndroidCharacter.getMirror('0') - 25;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr10 = new Object[1];
                    c(b5, b6, (short) (b6 | 36), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, bitsPerPixel2, mirror, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 159, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 15 - Color.green(0), new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).codePointAt(0) + 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_alfamart).substring(19, 20).length() + 14, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr12);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                        int size = View.MeasureSpec.getSize(0) + 1755;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        c(b7, b8, (short) (b8 | 88), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, size, trimmedLength, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                        int size2 = View.MeasureSpec.getSize(0) + 23;
                        byte[] bArr3 = $$a;
                        byte b9 = bArr3[7];
                        Object[] objArr14 = new Object[1];
                        c(b9, (byte) (b9 | 15), bArr3[28], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay, jumpTapTimeout, size2, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        if (((int[]) objArrB$7879113[0])[0] != ((int[]) objArrB$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                while (i < strArr.length) {
                    int i11 = asInterface + 45;
                    g = i11 % 128;
                    int i12 = i11 % 2;
                    arrayList.add(strArr[i]);
                    i++;
                }
            }
            throw null;
        }
        int i13 = ((int[]) objArrB$7879113[3])[0];
        int i14 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr15 = {new int[]{i14}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int i15 = ~((int) Runtime.getRuntime().totalMemory());
        int i16 = i13 + (-2060979615) + ((1039479550 | i15) * 184) + (((~(i15 | 894509308)) | 502542910) * 184);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr15[3])[0] = i18 ^ (i18 << 5);
        int i19 = asInterface + 97;
        g = i19 % 128;
        int i20 = i19 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int size3 = View.MeasureSpec.getSize(0) + 15;
            byte b10 = $$a[7];
            byte b11 = b10;
            Object[] objArr16 = new Object[1];
            c(b10, b11, (short) (b11 | 140), objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iMakeMeasureSpec, size3, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        e(false, 194 - TextUtils.indexOf((CharSequence) "", '0', 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 85, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(true, 200 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message).substring(0, 25).length() - 12, new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iBlue = 1031 - Color.blue(0);
            int i21 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
            byte b12 = $$a[7];
            byte b13 = b12;
            Object[] objArr19 = new Object[1];
            c(b12, b13, (short) (b13 | 36), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, iBlue, i21, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i22 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                int gidForName = 14 - Process.getGidForName("");
                Object[] objArr20 = new Object[1];
                c($$a[5], (byte) ($$b & 188), (short) DerHeader.TAG_CLASS_PRIVATE, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(threadPriority, i22, gidForName, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr21[3])[0];
            int i24 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i25 = ~iUptimeMillis;
            int i26 = (((1949181278 + ((~((-18172586) | i25)) * 979)) + ((iUptimeMillis | 226107584) * (-979))) + (((~(iUptimeMillis | (-18172586))) | (~(i25 | 226107584))) * 979)) - 232050430;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[2])[0] = i28 ^ (i28 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 96, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(true, 198 - ((Process.getThreadPriority(0) + 20) >> 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 100, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 108, new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, jkkServiceActivity)).intValue();
            Object[] objArr24 = {-1855409447};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1133, 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, -232050430, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int trimmedLength2 = TextUtils.getTrimmedLength("") + 1031;
                int fadingEdgeLength2 = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b14 = $$a[7];
                byte b15 = b14;
                Object[] objArr26 = new Object[1];
                c(b14, b15, (short) (b15 | 140), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cCombineMeasuredStates, trimmedLength2, fadingEdgeLength2, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - Process.getGidForName("")), 1117 - KeyEvent.normalizeMetaState(0), 17 - ExpandableListView.getPackedPositionGroup(0L)), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 1032;
                int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                Object[] objArr27 = new Object[1];
                c($$a[5], (byte) ($$b & 188), (short) DerHeader.TAG_CLASS_PRIVATE, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay2, bitsPerPixel3, packedPositionType, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr2);
            try {
                Object[] objArr28 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_try_again).substring(0, 14).codePointAt(5) + 90, 21 - ExpandableListView.getPackedPositionChild(0L), 14 - TextUtils.lastIndexOf("", '0', 0), new char[]{65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(true, 199 - (Process.myPid() >> 22), 16 + Process.getGidForName(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 23, new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iMyTid = 15 - (Process.myTid() >> 22);
                    byte b16 = $$a[7];
                    byte b17 = b16;
                    Object[] objArr30 = new Object[1];
                    c(b16, b17, (short) (b17 | 36), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, iIndexOf, iMyTid, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iMakeMeasureSpec2 = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int absoluteGravity2 = 15 + Gravity.getAbsoluteGravity(0, 0);
                    byte b18 = $$a[7];
                    byte b19 = b18;
                    Object[] objArr31 = new Object[1];
                    c(b18, b19, (short) (b19 | 140), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf2, iMakeMeasureSpec2, absoluteGravity2, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                int i29 = asInterface + 13;
                g = i29 % 128;
                int i30 = i29 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr2[1])[0];
        int i32 = ((int[]) objArr2[3])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[0];
            if (strArr3 != null) {
                while (i < strArr3.length) {
                    arrayList2.add(strArr3[i]);
                    i++;
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        int i33 = asInterface + 93;
        g = i33 % 128;
        int i34 = i33 % 2;
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i35 = ((int[]) objArr2[2])[0];
        int i36 = ((int[]) objArr2[3])[0];
        int i37 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[0];
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i38 = ~iUptimeMillis2;
        int i39 = i35 + (-566703820) + (((~((-576868604) | i38)) | (-332588434)) * (-602)) + (((~(iUptimeMillis2 | (-576868604))) | 538972266 | (~((-294692097) | i38))) * (-301)) + ((~(i38 | (-332588434))) * 301);
        int i40 = (i39 << 13) ^ i39;
        int i41 = i40 ^ (i40 >>> 17);
        ((int[]) objArr32[2])[0] = i41 ^ (i41 << 5);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0096  */
    /* JADX WARN: Code duplicated, block: B:12:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0083  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~(1765310154 | iIdentityHashCode);
            int i6 = ~iIdentityHashCode;
            int i7 = i5 | (~(935322611 | i6));
            int i8 = ~((-1765310155) | i6);
            if (i4 != 1507876400 + ((i7 | i8) * (-516)) + (((~(iIdentityHashCode | (-377979186))) | (~((-557343427) | i6))) * 516) + ((557343426 | i8) * 516)) {
                i = g + 89;
                asInterface = i % 128;
                if (i % 2 == 0) {
                    int[] iArr = new int[765835054];
                    iArr[765835053] = 1;
                    Toast.makeText((Context) null, iArr[-1], 1).show();
                } else {
                    int[] iArr2 = new int[765835054];
                    iArr2[765835053] = 1;
                    int i9 = (-1564928746) % 2;
                    Toast.makeText((Context) null, iArr2[-1], 1).show();
                }
                int i10 = g + 79;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            int i12 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iMyTid = Process.myTid();
            int i13 = ~iMyTid;
            int i14 = ~(677622920 | i13);
            if (i12 != (-1937995800) + (((-2046820320) | i14) * (-712)) + (((~(iMyTid | (-1369197400))) | (~(i13 | 2046820319))) * (-712)) + ((1507610463 | i14) * 712)) {
                i = g + 89;
                asInterface = i % 128;
                if (i % 2 == 0) {
                    int[] iArr3 = new int[765835054];
                    iArr3[765835053] = 1;
                    Toast.makeText((Context) null, iArr3[-1], 1).show();
                } else {
                    int[] iArr4 = new int[765835054];
                    iArr4[765835053] = 1;
                    int i15 = (-1564928746) % 2;
                    Toast.makeText((Context) null, iArr4[-1], 1).show();
                }
                int i16 = g + 79;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        int i18 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i20 = (-1853491672) + ((1639232002 | i19) * 614);
        int i21 = ~i19;
        if (i18 != i20 + (((~((-470993840) | i21)) | 1081858 | (~(2108062125 | i21))) * (-1228)) + (((~(i21 | 2109143983)) | (~((-469911982) | i21))) * 614)) {
            throw new RuntimeException("1240181461");
        }
        super.onResume();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f0, code lost:
    
        if (r1 != ((((-1127335788) + (((~(r2 | 1727329207)) | ((~((-583291302) | r3)) | (-1995764664))) * (-68))) + ((~((-268435457) | r3)) * (-68))) + (((~((-1727329208) | r3)) | (-851726758)) * 68))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f2, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.program.jkk.JkkServiceActivity.g + 81;
        com.bpjstku.presentation.program.jkk.JkkServiceActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        r0 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0103, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0104, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010c, code lost:
    
        throw new java.lang.RuntimeException("238423312");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0076, code lost:
    
        if (r1 == ((r9 + ((r7 | (~(r8 | (-1107370778)))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET)) + (((~(r6 | (-1107370778))) | (~(2078142299 | r8))) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009d, code lost:
    
        if (r1 == ((961634840 + (((~((-1376297058) | r6)) | 546309514) * (-756))) + (((~r6) | (-1376297058)) * 756))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkServiceActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i5 = ~(1409214463 | iNextInt);
        if (i4 != 1529022296 + ((21381844 | i5) * (-476)) + (i5 * 952) + ((~((~iNextInt) | 1409214463)) * 476)) {
            int i6 = (-1338989474) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i9 = (-739699272) + ((1359295770 | i8) * 614);
        int i10 = ~i8;
        if (i7 != i9 + (((~((-895102012) | i10)) | 285221914 | (~(1683953953 | i10))) * (-1228)) + (((~(i10 | 1969175867)) | (~((-609880098) | i10))) * 614)) {
            int i11 = 575513570 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i12 = g + 125;
        asInterface = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13 TuitionPaymentFragmentspecialinlinedviewModeldefault1(final JkkServiceActivity jkkServiceActivity) {
        List listMutableListOf;
        int i;
        int i2 = 2 % 2;
        JkkServiceActivity jkkServiceActivity2 = jkkServiceActivity;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        if (getMaxImages.setInternalConnectionCallback()) {
            String string = jkkServiceActivity.getString(R.string.label_claim_jkk);
            Intrinsics.checkNotNullExpressionValue(string, "");
            JkkService jkkService = new JkkService(2, "Klaim Manfaat JKK", string, R.drawable.ic_eclaim);
            String string2 = jkkServiceActivity.getString(R.string.label_check_tracking_eclaim);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listMutableListOf = CollectionsKt.mutableListOf(jkkService, new JkkService(3, "Lacak Klaim JKK", string2, R.drawable.ic_tracking_claim));
            i = g + 115;
        } else {
            String string3 = jkkServiceActivity.getString(R.string.label_report_jkk);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            JkkService jkkService2 = new JkkService(1, "Pelaporan Kecelakaan Kerja", string3, R.drawable.ic_icon_work_accident);
            String string4 = jkkServiceActivity.getString(R.string.label_check_tracking_eclaim);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            listMutableListOf = CollectionsKt.mutableListOf(jkkService2, new JkkService(3, "Lacak Klaim JKK", string4, R.drawable.ic_tracking_claim));
            i = g + 43;
        }
        asInterface = i % 128;
        int i3 = i % 2;
        return new Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda13(jkkServiceActivity2, listMutableListOf, new Function1() { // from class: Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkkServiceActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (JkkService) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkkServiceActivity jkkServiceActivity, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                jkkServiceActivity.finish();
                ViewPortBuilder.b();
            } else {
                jkkServiceActivity.finish();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(JkkServiceActivity jkkServiceActivity, JkkService jkkService) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jkkService, "");
        int i2 = jkkService.b;
        if (i2 != 1) {
            int i3 = g;
            int i4 = i3 + 23;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 2) {
                JkkChooseMembershipActivity.Companion companion = JkkChooseMembershipActivity.INSTANCE;
                JkkChooseMembershipActivity.Companion.b(jkkServiceActivity);
                str = "claim_jkk";
            } else if (i2 != 3) {
                int i6 = i3 + 109;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                str = "";
            } else {
                ClaimTrackingActivity.Companion companion2 = ClaimTrackingActivity.INSTANCE;
                ClaimTrackingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkServiceActivity);
                str = "tracking_claim_jkk";
            }
        } else {
            ReportAccidentActivity.Companion companion3 = ReportAccidentActivity.INSTANCE;
            ReportAccidentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkServiceActivity);
            str = "tracking_report_jkk";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_jht_program", str));
        Intrinsics.checkNotNullParameter(jkkServiceActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        Unit unit = Unit.INSTANCE;
        int i8 = g + 9;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(JkkServiceActivity jkkServiceActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String string;
        int i = 2 % 2;
        int i2 = g + 75;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            jkkServiceActivity.MediaBrowserCompat();
            int i3 = asInterface + 33;
            g = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 3;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            jkkServiceActivity.IconCompatParcelizer();
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (list.isEmpty()) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkServiceActivity, "Data Segemen Tidak Tersedia", null);
            } else if (list.size() == 1) {
                int i5 = g + 69;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                String upperCase = ((ClaimSegmenItem) list.get(0)).b.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (Intrinsics.areEqual(upperCase, "PMI")) {
                    getMaxImages getmaximages = getMaxImages.INSTANCE;
                    String strConnect = getMaxImages.connect();
                    jkkServiceActivity.b = strConnect;
                    String lowerCase = ProgramType.JKK.getCode().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    String upperCase2 = upperCase.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(upperCase2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strConnect);
                    sb.append("/");
                    sb.append(lowerCase);
                    sb.append("/");
                    sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    string = sb.toString();
                } else {
                    getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                    String strMediaBrowserCompat = getMaxImages.MediaBrowserCompat();
                    jkkServiceActivity.b = strMediaBrowserCompat;
                    String lowerCase2 = ProgramType.JKK.getCode().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    String upperCase3 = upperCase.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(upperCase3);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strMediaBrowserCompat);
                    sb2.append("/");
                    sb2.append(lowerCase2);
                    sb2.append("/");
                    sb2.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    string = sb2.toString();
                }
                String str = string;
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                String string2 = jkkServiceActivity.getString(R.string.label_title_claim_jkk);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkServiceActivity, str, string2, 0, null, false, 56);
            } else {
                ClaimChooseSegmentActivity.Companion companion2 = ClaimChooseSegmentActivity.INSTANCE;
                ClaimChooseSegmentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jkkServiceActivity, list, ProgramType.JKK.getCode());
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            jkkServiceActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(jkkServiceActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 37;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_jkk_service;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        b(getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1462781488, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1462781489, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int length = 576514618 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_1).substring(1, 3).length();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2013536974, new Object[]{this}, zzny.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -311917404, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 1595521719, 311917406, length);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_alfamart).substring(19, 20).length() + 1666065291, new Object[]{this, context}, (-2141858975) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7), -957951227, getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 957951227, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722494;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        JkkServiceActivity jkkServiceActivity = (JkkServiceActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        int i5 = g + 89;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r7, byte r8, int r9) {
        /*
            int r7 = r7 + 4
            int r9 = r9 + 119
            byte[] r0 = com.bpjstku.presentation.program.jkk.JkkServiceActivity.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkServiceActivity.$$i(int, byte, int):java.lang.String");
    }
}
