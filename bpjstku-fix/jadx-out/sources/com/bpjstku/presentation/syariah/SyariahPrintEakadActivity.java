package com.bpjstku.presentation.syariah;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivitySyariahPrintEakadBinding;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.syariah.SyariahPrintEakadActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.material.button.MaterialButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getConfigs;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;
import retrofit2.ParameterHandler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahPrintEakadActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivitySyariahPrintEakadBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SyariahPrintEakadActivity extends BindingBaseActivity<ActivitySyariahPrintEakadBinding> {
    private static char[] TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: CameraCaptureSessionCompatBaseImpl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyariahPrintEakadActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private static final byte[] $$c = {7, 15, 25, 25};
    private static final int $$f = DerHeader.TAG_CLASS_PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 187;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i3;
        int i11 = ~(i10 | i5);
        int i12 = i8 | i11 | (~(i10 | i4));
        int i13 = (~((~i4) | i10)) | i8 | i11;
        int i14 = i5 + i3 + i + ((-369695973) * i6) + (1794320298 * i2);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i5) + 1478230016 + (776760710 * i3) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i) + (217841664 * i6) + ((-410517504) * i2) + ((-175177728) * i15);
        int i17 = ((i5 * 1872133577) - 2052485254) + (i3 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i * 1872134975) + (i6 * (-1328892763)) + (i2 * (-1296121642)) + (i15 * (-1691287552));
        int i18 = i16 + (i17 * i17 * (-1729036288));
        if (i18 != 1) {
            return i18 != 2 ? b(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahPrintEakadActivity.$$a
            int r8 = 53 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r7 = r7 + 1
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahPrintEakadActivity.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.syariah.SyariahPrintEakadActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/syariah/SyariahPrintEakadActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, SyariahPrintEakadActivity.class, new Pair[]{TuplesKt.to("worker_code", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivitySyariahPrintEakadBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        SyariahPrintEakadActivity$bindingInflater$1 syariahPrintEakadActivity$bindingInflater$1 = SyariahPrintEakadActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return syariahPrintEakadActivity$bindingInflater$1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        final SyariahPrintEakadActivity syariahPrintEakadActivity = (SyariahPrintEakadActivity) objArr[0];
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivitySyariahPrintEakadBinding) ((ViewBinding) syariahPrintEakadActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnPrintEakad;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraCaptureSessionCompatBaseImplCameraCaptureSessionCompatParamsApi21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                int iTuitionPaymentFragmentbindingInflater1 = zag.TuitionPaymentFragmentbindingInflater1();
                return (Unit) SyariahPrintEakadActivity.b(zag.TuitionPaymentFragmentbindingInflater1(), zag.TuitionPaymentFragmentbindingInflater1(), 201433860, objArr2, iTuitionPaymentFragmentbindingInflater1, -201433860, zag.TuitionPaymentFragmentbindingInflater1());
            }
        }));
        MaterialButton materialButton2 = ((ActivitySyariahPrintEakadBinding) ((ViewBinding) syariahPrintEakadActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnExit;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getStreamConfigurationMapCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SyariahPrintEakadActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        SyariahPrintEakadActivity syariahPrintEakadActivity = this;
        Intrinsics.checkNotNullParameter(syariahPrintEakadActivity, "");
        syariahPrintEakadActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((ActivitySyariahPrintEakadBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, "Layanan Syariah", true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
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

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        int i10 = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 9;
                $11 = i12 % 128;
                int i13 = i12 % i2;
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int deadChar = KeyEvent.getDeadChar(i4, i4) + 1270;
                        int iBlue = 18 - Color.blue(i4);
                        byte b = (byte) i10;
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, deadChar, iBlue, 407021364, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i11++;
                    i2 = 2;
                    i4 = 0;
                    i6 = 1;
                    i10 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            int i14 = $11 + 99;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 3225, 12 - MotionEvent.axisFromString(""), 2133916302, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i17 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - View.MeasureSpec.getSize(0)), 1755 - TextUtils.indexOf("", ""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, 387247676, false, $$i(b5, b6, (byte) (b6 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) (-1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - Color.green(0)), (-16775511) - Color.rgb(0, 0, 0), 20 - MotionEvent.axisFromString(""), -1434471773, false, $$i(b7, (byte) (b7 & 6), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            int i18 = $11 + 109;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i20 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i20, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            loop2: while (true) {
                setvideostabilizationmode.b = i;
                while (true) {
                    if (setvideostabilizationmode.b >= i7) {
                        break loop2;
                    }
                    int i21 = $11 + 61;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i7 << setvideostabilizationmode.b) % 1];
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                        i = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i22 = 0;
            loop4: while (true) {
                setvideostabilizationmode.b = i22;
                while (true) {
                    if (setvideostabilizationmode.b >= i7) {
                        break loop4;
                    }
                    int i23 = $11 + 79;
                    $10 = i23 % 128;
                    if (i23 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] * iArr[4]);
                        int i24 = setvideostabilizationmode.b;
                        setvideostabilizationmode.b = 0;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i22 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
            short s = $$a[7];
            byte b = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iIndexOf, iKeyCodeFromString, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 194, 11}, true, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 30, 4}, true, null, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i4 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int iResolveSize = 15 - View.resolveSize(0, 0);
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 52, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, iResolveSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int trimmedLength = 15 - TextUtils.getTrimmedLength("");
                short s2 = (short) 104;
                Object[] objArr6 = new Object[1];
                c(s2, (byte) (s2 >>> 1), $$a[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, maximumFlingVelocity, trimmedLength, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-2066272040) + ((~((-15836283) | i7)) * 979)) + ((iIdentityHashCode | 228443887) * (-979))) + (((~(iIdentityHashCode | (-15836283))) | (~(i7 | 228443887))) * 979)) - 834268772;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1908809472};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1134, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -834268772, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int iMakeMeasureSpec = 1031 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                    short s3 = $$a[7];
                    byte b3 = (byte) s3;
                    Object[] objArr12 = new Object[1];
                    c(s3, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iMakeMeasureSpec, iIndexOf2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.indexOf("", "")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    short s4 = (short) 104;
                    Object[] objArr13 = new Object[1];
                    c(s4, (byte) (s4 >>> 1), $$a[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i11, scrollBarFadeDuration, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{0, 22, 194, 11}, true, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{22, 15, 30, 4}, true, null, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int i12 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iAxisFromString = MotionEvent.axisFromString("") + 16;
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 52, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAxisFromString, i12, iAxisFromString, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                        int i13 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i14 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        short s5 = $$a[7];
                        byte b5 = (byte) s5;
                        Object[] objArr17 = new Object[1];
                        c(s5, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, i13, i14, 1357589585, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~(970563583 | iIdentityHashCode2);
            int i19 = i15 + (-2030494043) + ((675873897 | i18) * (-476)) + (i18 * 952) + ((~((~iIdentityHashCode2) | 970563583)) * 476);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[2])[0] = i21 ^ (i21 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                int i22 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                Object[] objArr19 = new Object[1];
                c((short) 104, (byte) 15, $$a[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout, i22, iCombineMeasuredStates, 986134021, false, (String) objArr19[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iMyTid = (Process.myTid() >> 22) + 1755;
                    int iResolveSize2 = View.resolveSize(0, 0) + 23;
                    byte b6 = $$a[7];
                    Object[] objArr20 = new Object[1];
                    c((short) 52, b6, b6, objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maxKeyCode, iMyTid, iResolveSize2, 1599039318, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i23 = ~iIdentityHashCode3;
                int i24 = (((1489642641 + (((~(28073683 | i23)) | 173252900) * 184)) + ((iIdentityHashCode3 | 16797841) * (-184))) + ((~((-184528743) | i23)) * 184)) - 2044214966;
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i26 ^ (i26 << 5);
            } else {
                Object[] objArr22 = new Object[1];
                e(new int[]{37, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr22);
                Class<?> cls4 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(new int[]{53, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr23);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr24 = {-1908809472};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 42049), 1726 - Drawable.resolveOpacity(0, 0), 28 - TextUtils.lastIndexOf("", '0', 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -2044214966);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                    int iResolveSize3 = View.resolveSize(0, 0) + 1755;
                    int i27 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b7 = $$a[7];
                    Object[] objArr25 = new Object[1];
                    c((short) 52, b7, b7, objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(jumpTapTimeout, iResolveSize3, i27, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr26 = new Object[1];
                    e(new int[]{0, 22, 194, 11}, true, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(new int[]{22, 15, 30, 4}, true, null, objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char c2 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int maximumFlingVelocity2 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iArgb = 23 - Color.argb(0, 0, 0, 0);
                        byte b8 = $$a[7];
                        Object[] objArr28 = new Object[1];
                        c((short) 141, b8, b8, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, maximumFlingVelocity2, iArgb, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cLastIndexOf2 = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                        int iAxisFromString2 = MotionEvent.axisFromString("") + 24;
                        Object[] objArr29 = new Object[1];
                        c((short) 104, (byte) 15, $$a[7], objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, iIndexOf3, iAxisFromString2, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i28 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
            int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
            if (i29 == i28) {
                int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
                Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
                int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 575037633;
                int i32 = ~((-281284227) | i31);
                int i33 = ~i31;
                int i34 = i30 + (-2108100255) + ((i32 | (~(352112351 | i33))) * 920) + (((~((-283430552) | i33)) | 281284226) * 920) + (((~(i31 | 352112351)) | (~((-281284227) | i33)) | (~((-2146326) | i31))) * 920);
                int i35 = (i34 << 13) ^ i34;
                int i36 = i35 ^ (i35 >>> 17);
                ((int[]) objArr30[3])[0] = i36 ^ (i36 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i29];
            int i37 = i29 - 1;
            iArr[i37] = 1;
            Toast.makeText((Context) null, iArr[((i29 * i37) % 2) - 1], 1).show();
            int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i39 = i38 + 950188177 + (((~(519096146 | iFreeMemory)) | 276488 | (~((-306493721) | iFreeMemory))) * (-744)) + (((~iFreeMemory) | 212878914) * 744) + ((iFreeMemory | (-276489)) * 744);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr31[3])[0] = i41 ^ (i41 << 5);
            int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i42 % 128;
            int i43 = i42 % 2;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            if (i3 != 1168966376 + (((~(1872317955 | i4)) | 270577964) * 168) + ((~((-270577965) | iIdentityHashCode)) * 168) + (((~(iIdentityHashCode | 2142895919)) | (~(i4 | (-1042330413))) | 771752448) * 168)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i6 = ~layoutDirection;
            if (i5 != 1679164088 + (((~(1772752623 | i6)) | (~((-942765081) | layoutDirection))) * 1900) + (((~(i6 | 942765080)) | (~(layoutDirection | (-1772752624)))) * (-950)) + (((~(layoutDirection | 942765080)) | (~(i6 | (-1772752624)))) * 950)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i7 != 865437702 + ((~(2041576695 | iIdentityHashCode2)) * (-301)) + (((~((-1622002808) | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | 957053157))) * (-301)) + (((~(iIdentityHashCode2 | (-957053158))) | (-1622002808)) * 301)) {
            throw new RuntimeException("1626993077");
        }
        super.onResume();
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        SyariahPrintEakadActivity syariahPrintEakadActivity = (SyariahPrintEakadActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i4 != ((979423790 + (((~((-311453226) | iNextInt)) | (~((-1141440769) | iNextInt))) * 69)) + (((~(iNextInt | (-1143933331))) | ((~((-313945788) | iNextInt)) | 2492562)) * (-69))) - 1637424556) {
            int i5 = (-1545879796) % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt2 = new Random().nextInt(759139604);
        int i7 = ~iNextInt2;
        if (i6 != 277781356 + (((~((-2078004235) | i7)) | 294719490) * 184) + ((iNextInt2 | (-2145377648)) * (-184)) + ((~((-362092904) | i7)) * 184)) {
            throw null;
        }
        super.onStart();
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 47 / 0;
        }
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[1]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i3 != 531663946 + ((~((~iIdentityHashCode) | (-154140803))) * 433) + (((~(1261503882 | iIdentityHashCode)) | (-431516340)) * (-433)) + (((~(iIdentityHashCode | (-431516340))) | 1107363080) * 433)) {
                throw null;
            }
        } else {
            int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iNextInt = new Random().nextInt();
            int i5 = ~iNextInt;
            if (i4 != (-156112046) + (((~((-268970563) | i5)) | (~((-576979109) | iNextInt)) | (~(1944907775 | iNextInt))) * 765) + (((~((-845949671) | i5)) | 268970562) * 1530) + (((~(iNextInt | (-845949671))) | (~(i5 | 1944907775))) * 765)) {
                throw null;
            }
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i6 != 376999830 + (((~((~startUptimeMillis) | (-441025922))) | (-2138030044)) * (-591)) + ((startUptimeMillis | (-441025922)) * 591)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            int[] iArr = new int[373010273];
            iArr[373010272] = 1;
            int i9 = (-459271328) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
            int i11 = i10 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(SyariahPrintEakadActivity syariahPrintEakadActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = syariahPrintEakadActivity.getIntent().getStringExtra("worker_code");
        Intrinsics.checkNotNull(stringExtra);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(SyariahPrintEakadActivity syariahPrintEakadActivity, View view) {
        Unit unit;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 == 0) {
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(syariahPrintEakadActivity, null, null, 110);
            syariahPrintEakadActivity.d_();
            unit = Unit.INSTANCE;
        } else {
            MainActivity.Companion companion2 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(syariahPrintEakadActivity, null, null, 6);
            syariahPrintEakadActivity.d_();
            unit = Unit.INSTANCE;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SyariahPrintEakadActivity syariahPrintEakadActivity = (SyariahPrintEakadActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        SyariahPrintEakadDetailActivity.Companion companion = SyariahPrintEakadDetailActivity.INSTANCE;
        SyariahPrintEakadDetailActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(syariahPrintEakadActivity, (String) syariahPrintEakadActivity.TuitionPaymentFragmentbindingInflater1.getValue());
        Unit unit = Unit.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahPrintEakadActivity syariahPrintEakadActivity, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = zag.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = zag.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = zag.TuitionPaymentFragmentbindingInflater1();
        return (Unit) b(iTuitionPaymentFragmentbindingInflater2, zag.TuitionPaymentFragmentbindingInflater1(), 201433860, new Object[]{syariahPrintEakadActivity, view}, iTuitionPaymentFragmentbindingInflater1, -201433860, iTuitionPaymentFragmentbindingInflater3);
    }

    static {
        asInterface = 0;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 119;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_syariah_print_eakad;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2068139411 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iTuitionPaymentFragmentbindingInflater1 = zag.TuitionPaymentFragmentbindingInflater1();
        int iB = ParameterHandler.AnonymousClass1.b();
        b(iTuitionPaymentFragmentbindingInflater1, 1577763895 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).length(), 527383188, new Object[]{this}, i, -527383187, iB);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iB = ParameterHandler.AnonymousClass1.b();
        b(ParameterHandler.AnonymousClass1.b(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_payment).substring(1, 7).codePointAt(0) - 791521824, -634717020, new Object[]{this}, iB, 634717022, ParameterHandler.AnonymousClass1.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59763, 59417, 59448, 59419, 59392, 59427, 59429, 59449, 59430, 59424, 59426, 59427, 59426, 59424, 59428, 59410, 59409, 59424, 59429, 59454, 59443, 59427, 59781, 59764, 59777, 59784, 59784, 59776, 59788, 59801, 59777, 59764, 59784, 59771, 59785, 59784, 59802, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, short r8, int r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.syariah.SyariahPrintEakadActivity.$$c
            int r8 = r8 + 99
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L20:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.syariah.SyariahPrintEakadActivity.$$i(byte, short, int):java.lang.String");
    }
}
