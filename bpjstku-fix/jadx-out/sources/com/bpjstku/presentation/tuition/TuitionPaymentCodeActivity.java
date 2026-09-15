package com.bpjstku.presentation.tuition;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.databinding.ActivityTuitionPaymentCodeBinding;
import com.bpjstku.domain.tuition.model.TuitionPayment;
import com.bpjstku.presentation.tuition.TuitionPaymentCodeActivity;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import defpackage.CameraManagerCompatBaseImplCameraManagerCompatParamsApi21;
import defpackage.CameraUseCaseAdapter;
import defpackage.LayoutSettings;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.setSurfaceAspectRatio;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionPaymentCodeActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTuitionPaymentCodeBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/tuition/model/TuitionPayment;", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentbindingInflater1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionPaymentCodeActivity extends BindingBaseActivity<ActivityTuitionPaymentCodeBinding> {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int g;
    private static final byte[] $$c = {81, 125, 2, 46};
    private static final int $$f = 188;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, 11, -9, -106, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 189;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f646a = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new CameraManagerCompatBaseImplCameraManagerCompatParamsApi21(this));

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.activity_tuition_payment_code;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r6
            int r5 = r5 * 14
            int r5 = 98 - r5
            byte[] r1 = com.bpjstku.presentation.tuition.TuitionPaymentCodeActivity.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r5 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r7]
        L27:
            int r3 = -r3
            int r7 = r7 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentCodeActivity.c(byte, int, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        TuitionPaymentCodeActivity tuitionPaymentCodeActivity = (TuitionPaymentCodeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f646a + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = tuitionPaymentCodeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i6 = i3 + 121;
        f646a = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTuitionPaymentCodeBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        f646a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TuitionPaymentCodeActivity$bindingInflater$1 tuitionPaymentCodeActivity$bindingInflater$1 = TuitionPaymentCodeActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
            obj.hashCode();
            throw null;
        }
        TuitionPaymentCodeActivity$bindingInflater$1 tuitionPaymentCodeActivity$bindingInflater$2 = TuitionPaymentCodeActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i3 = f646a + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return tuitionPaymentCodeActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        f646a = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentCodeActivity tuitionPaymentCodeActivity = this;
        Intrinsics.checkNotNullParameter(tuitionPaymentCodeActivity, "");
        tuitionPaymentCodeActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityTuitionPaymentCodeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityTuitionPaymentCodeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_payment_code));
        ActivityTuitionPaymentCodeBinding activityTuitionPaymentCodeBinding = (ActivityTuitionPaymentCodeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TuitionPayment tuitionPayment = (TuitionPayment) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (tuitionPayment != null) {
            activityTuitionPaymentCodeBinding.tvPaymentCode.setText(tuitionPayment.b);
            activityTuitionPaymentCodeBinding.tvValuePaymentSummary.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (tuitionPayment.TuitionPaymentFragmentbindingInflater1 > 0.0d) {
                AppCompatTextView appCompatTextView = activityTuitionPaymentCodeBinding.tvValueJKKTuituion;
                appCompatTextView.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(tuitionPayment.TuitionPaymentFragmentbindingInflater1));
                Intrinsics.checkNotNull(appCompatTextView);
                appCompatTextView.setVisibility(0);
                AppCompatTextView appCompatTextView2 = activityTuitionPaymentCodeBinding.tvJKKTuituionLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                appCompatTextView2.setVisibility(0);
                View view = activityTuitionPaymentCodeBinding.viewLineJKK;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView3 = activityTuitionPaymentCodeBinding.tvValueJKKTuituion;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                appCompatTextView3.setVisibility(8);
                AppCompatTextView appCompatTextView4 = activityTuitionPaymentCodeBinding.tvJKKTuituionLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                appCompatTextView4.setVisibility(8);
                View view2 = activityTuitionPaymentCodeBinding.viewLineJKK;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(8);
            }
            if (tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0.0d) {
                AppCompatTextView appCompatTextView5 = activityTuitionPaymentCodeBinding.tvValueJKMTuituion;
                appCompatTextView5.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                Intrinsics.checkNotNull(appCompatTextView5);
                appCompatTextView5.setVisibility(0);
                AppCompatTextView appCompatTextView6 = activityTuitionPaymentCodeBinding.tvJKMTuituionLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
                appCompatTextView6.setVisibility(0);
                View view3 = activityTuitionPaymentCodeBinding.viewLineJKM;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                view3.setVisibility(0);
            } else {
                AppCompatTextView appCompatTextView7 = activityTuitionPaymentCodeBinding.tvValueJKMTuituion;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
                appCompatTextView7.setVisibility(8);
                AppCompatTextView appCompatTextView8 = activityTuitionPaymentCodeBinding.tvJKMTuituionLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "");
                appCompatTextView8.setVisibility(8);
                View view4 = activityTuitionPaymentCodeBinding.viewLineJKM;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                view4.setVisibility(8);
            }
            if (tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0.0d) {
                AppCompatTextView appCompatTextView9 = activityTuitionPaymentCodeBinding.tvValueJHTTuituion;
                appCompatTextView9.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                Intrinsics.checkNotNull(appCompatTextView9);
                appCompatTextView9.setVisibility(0);
                AppCompatTextView appCompatTextView10 = activityTuitionPaymentCodeBinding.tvJHTTuituionLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView10, "");
                appCompatTextView10.setVisibility(0);
                View view5 = activityTuitionPaymentCodeBinding.viewLineJHT;
                Intrinsics.checkNotNullExpressionValue(view5, "");
                view5.setVisibility(0);
                return;
            }
            AppCompatTextView appCompatTextView11 = activityTuitionPaymentCodeBinding.tvValueJHTTuituion;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView11, "");
            appCompatTextView11.setVisibility(8);
            AppCompatTextView appCompatTextView12 = activityTuitionPaymentCodeBinding.tvJHTTuituionLabel;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView12, "");
            appCompatTextView12.setVisibility(8);
            View view6 = activityTuitionPaymentCodeBinding.viewLineJHT;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            view6.setVisibility(8);
            int i4 = f646a + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityTuitionPaymentCodeBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnPaymentMethod.setOnClickListener(new View.OnClickListener() { // from class: StreamConfigurationMapCompat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuitionPaymentCodeActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        int i2 = f646a + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = f646a + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = f646a + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i5;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", i5), KeyEvent.getDeadChar(i5, i5) + 3291, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, 1948206109, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $10 + 3;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iArr6 != null) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i10]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + i4), 3291 - (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, 1948206109, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i10++;
                iArr6 = iArr6;
                i4 = 1;
            }
            iArr6 = iArr2;
        }
        char c = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i11 = 17;
            for (int i12 = 1; i11 > i12; i12 = 1) {
                int i13 = $11 + 109;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i11];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2559 - ExpandableListView.getPackedPositionType(0L), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 683220507, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i11--;
            }
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 28879), 348 - TextUtils.indexOf("", "", 0, 0), 24 - MotionEvent.axisFromString(""), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
            int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 24;
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 14), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, i2, iLastIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                byte b3 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b2, b3, (short) (b3 | 37), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, doubleTapTimeout, iIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i4 = (-724793013) + (((-399785547) | i3) * 614);
            int i5 = ~i3;
            int i6 = i4 + (((~((-979920455) | i5)) | 673726468 | (~((-767318029) | i5))) * (-1228)) + (((~(i5 | (-93591561))) | (~((-306193987) | i5))) * 614) + 418332026;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{1543973640, 2060732381, -1852831620, -1336948831, -1447228063, -1406288027, 1111696590, 1557999907, -117832527, 1692079848}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 100, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-1390778343, -1036154695, -843275957, 1652073103, 1718739642, -343337288, 1560338976, -2112529750, 365319580, 1756234397}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 91, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-557600790};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42048), 1726 - TextUtils.getTrimmedLength(""), 28 - ImageFormat.getBitsPerPixel(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 418332026);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                    int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    byte b5 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (short) (b5 | 37), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, jumpTapTimeout, maximumDrawingCacheSize, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{1756616673, -1621434785, 1600924895, -159894764, 417186444, 156008727, -114207966, 1527909310, -40540995, -489204697, -826006392, -926639622, 391757925, 205262742}, 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{1295607697, -1240487180, 1996458323, -407696564, 636497113, 1513807736, -283412422, -598906253, -1158764821, -1299675239}, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int iIndexOf2 = 1754 - TextUtils.indexOf((CharSequence) "", '0');
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[5];
                        byte b7 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b6, b7, (short) (b7 | 89), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, iIndexOf2, iKeyCodeFromString, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                        int i9 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[5];
                        Object[] objArr12 = new Object[1];
                        c(b8, (byte) (b8 | 14), bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, i9, i10, 986134021, false, (String) objArr12[0], null);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                f646a = i13 % 128;
                for (int i14 = i13 % 2 != 0 ? 0 : 1; i14 < strArr.length; i14++) {
                    arrayList.add(strArr[i14]);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gb_t_ev_connector_type).substring(0, 4).codePointAt(1) - 246417321;
        int i16 = ~iCodePointAt;
        int i17 = i15 + (-1572350714) + (((~(i16 | (-345389238))) | 557991663) * (-1042)) + (((-345389238) | iCodePointAt) * 521) + (((~(iCodePointAt | (-557991664))) | 557860426 | (~(i16 | (-345258001)))) * 521);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iBlue = 1031 - Color.blue(0);
            int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
            byte[] bArr6 = $$a;
            byte b9 = bArr6[5];
            byte b10 = bArr6[7];
            Object[] objArr14 = new Object[1];
            c(b9, b10, (short) (b10 | 141), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iBlue, i20, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new int[]{1756616673, -1621434785, 1600924895, -159894764, 417186444, 156008727, -114207966, 1527909310, -40540995, -489204697, -826006392, -926639622, 391757925, 205262742}, TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new int[]{1295607697, -1240487180, 1996458323, -407696564, 636497113, 1513807736, -283412422, -598906253, -1158764821, -1299675239}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_not_enabled).substring(11, 12).length() + 14, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cBlue = (char) Color.blue(0);
            int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
            byte[] bArr7 = $$a;
            byte b11 = bArr7[5];
            byte b12 = bArr7[7];
            Object[] objArr17 = new Object[1];
            c(b11, b12, (short) (b12 | 37), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, trimmedLength, iNormalizeMetaState, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int absoluteGravity2 = 1031 - Gravity.getAbsoluteGravity(0, 0);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
                byte b13 = $$a[7];
                Object[] objArr18 = new Object[1];
                c(b13, (byte) (b13 | 52), (short) ($$b + 4), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, absoluteGravity2, threadPriority, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr19[3])[0];
            int i22 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i23 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i24 = (((-1753597967) + (((~(i23 | 937072119)) | (~((-625606754) | i23))) * (-184))) + (((277872768 | (~((-903479522) | i23))) | (~(659199351 | i23))) * 184)) - 1267762889;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[2])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new int[]{1543973640, 2060732381, -1852831620, -1336948831, -1447228063, -1406288027, 1111696590, 1557999907, -117832527, 1692079848}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).codePointAt(0) - 81, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new int[]{-1390778343, -1036154695, -843275957, 1652073103, 1718739642, -343337288, 1560338976, -2112529750, 365319580, 1756234397}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-557600790};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 46038), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), 18 - (ViewConfiguration.getEdgeSlop() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 618308031, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int i27 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr8 = $$a;
                byte b14 = bArr8[5];
                byte b15 = bArr8[7];
                Object[] objArr24 = new Object[1];
                c(b14, b15, (short) (b15 | 141), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(trimmedLength2, i27, offsetBefore, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45994), TextUtils.lastIndexOf("", '0', 0) + 1118, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                int i28 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 15;
                byte b16 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b16, (byte) (b16 | 52), (short) ($$b + 4), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity3, i28, iResolveSizeAndState, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new int[]{1756616673, -1621434785, 1600924895, -159894764, 417186444, 156008727, -114207966, 1527909310, -40540995, -489204697, -826006392, -926639622, 391757925, 205262742}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step5).substring(0, 3).length() + 19, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new int[]{1295607697, -1240487180, 1996458323, -407696564, 636497113, 1513807736, -283412422, -598906253, -1158764821, -1299675239}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.email_instruction).substring(8, 9).codePointAt(0) - 95, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                    int mode = View.MeasureSpec.getMode(0) + 15;
                    byte[] bArr9 = $$a;
                    byte b17 = bArr9[5];
                    byte b18 = bArr9[7];
                    Object[] objArr28 = new Object[1];
                    c(b17, b18, (short) (b18 | 37), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, jumpTapTimeout2, mode, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf3 = TextUtils.indexOf("", "") + 1031;
                    int iIndexOf4 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr10 = $$a;
                    byte b19 = bArr10[5];
                    byte b20 = bArr10[7];
                    Object[] objArr29 = new Object[1];
                    c(b19, b20, (short) (b20 | 141), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumFlingVelocity2, iIndexOf3, iIndexOf4, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 == i29) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[3])[0];
            int i33 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i34 = i31 + (-1111539135) + (((~(1031154336 | iIdentityHashCode)) | 41981206 | (~((-786874167) | iIdentityHashCode))) * (-744)) + (((~iIdentityHashCode) | 286261376) * 744) + ((iIdentityHashCode | (-41981207)) * 744);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr30[2])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i37 = f646a + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i37 % 128;
            for (int i38 = i37 % 2 != 0 ? 1 : 0; i38 < strArr4.length; i38++) {
                int i39 = f646a + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39 % 128;
                int i40 = i39 % 2;
                arrayList2.add(strArr4[i38]);
            }
        }
        Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i44 = i41 + 1050066804 + ((~((-67658273) | iIdentityHashCode2)) * 623) + (((~iIdentityHashCode2) | 172361797) * (-623)) + (((~(iIdentityHashCode2 | 174491847)) | (~((-69788323) | iIdentityHashCode2)) | 67658272) * 623);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr31[2])[0] = i46 ^ (i46 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        TuitionPaymentCodeActivity tuitionPaymentCodeActivity = (TuitionPaymentCodeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        f646a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i4 != ((((~((-499280226) | startElapsedRealtime)) | 218234912) * (-566)) - 1863078936) + ((~(startElapsedRealtime | (-281045314))) * 566)) {
            throw null;
        }
        int i5 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i6 = (int) Runtime.getRuntime().totalMemory();
        int i7 = ~i6;
        if (i5 != (-1020104468) + (((~(1641551965 | i7)) | 371270818) * 184) + ((i6 | 1075318784) * (-184)) + ((~((-937504000) | i7)) * 184)) {
            throw null;
        }
        super.onResume();
        int i8 = f646a + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        f646a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 1632769682;
        int i5 = 1283770824 + (((~((-600339197) | iCodePointAt)) | 20971728 | (~((-1430326740) | iCodePointAt))) * (-754));
        int i6 = ~((-20971729) | iCodePointAt);
        int i7 = ~iCodePointAt;
        if (i4 != i5 + ((i6 | (~((-1409355012) | i7))) * (-754)) + ((i7 | (-600339197)) * 754)) {
            throw new RuntimeException("1301230746");
        }
        int i8 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != ((159221532 + (((~((-131998762) | iIdentityHashCode)) | 31072289) * 1504)) + ((~(iIdentityHashCode | (-100926473))) * (-1504))) - 1363215264) {
            int i9 = (-1396817088) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i10 = f646a + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 48 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f646a + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt(610362129);
        if (i4 != 2007683688 + ((848880987 | iNextInt) * 376) + (((~((~iNextInt) | 148320070)) | 839434265) * (-376)) + (((~(iNextInt | (-148320071))) | (-978307614)) * 376)) {
            throw null;
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i5 != (((-1193462180) + (((~((-1520994865) | iIdentityHashCode)) | 436242976) * 576)) + (((~((~iIdentityHashCode) | (-1084751889))) | 621818124) * 576)) - 2127116288) {
            int i6 = 1211449622 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i7 = f646a + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ TuitionPayment TuitionPaymentFragmentbindingInflater1(TuitionPaymentCodeActivity tuitionPaymentCodeActivity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        f646a = i2 % 128;
        int i3 = i2 % 2;
        TuitionPayment tuitionPayment = (TuitionPayment) tuitionPaymentCodeActivity.getIntent().getParcelableExtra("tuition_payment");
        int i4 = f646a + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return tuitionPayment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(TuitionPaymentCodeActivity tuitionPaymentCodeActivity, View view) {
        int i = 2 % 2;
        int i2 = f646a + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                TuitionPaymentCodeActivity tuitionPaymentCodeActivity2 = tuitionPaymentCodeActivity;
                Intrinsics.checkNotNullParameter(tuitionPaymentCodeActivity2, "");
                Intrinsics.checkNotNullParameter("https://api-dev.bpjsketenagakerjaan.go.id/neo-bpjstku-dev/id/informasi-pembayaran-bpu", "");
                WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
                WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentCodeActivity2, "https://api-dev.bpjsketenagakerjaan.go.id/neo-bpjstku-dev/id/informasi-pembayaran-bpu", "");
                ViewPortBuilder.b();
                return;
            }
            TuitionPaymentCodeActivity tuitionPaymentCodeActivity3 = tuitionPaymentCodeActivity;
            Intrinsics.checkNotNullParameter(tuitionPaymentCodeActivity3, "");
            Intrinsics.checkNotNullParameter("https://api-dev.bpjsketenagakerjaan.go.id/neo-bpjstku-dev/id/informasi-pembayaran-bpu", "");
            WebviewFaqCustomActivity.Companion companion2 = WebviewFaqCustomActivity.INSTANCE;
            WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentCodeActivity3, "https://api-dev.bpjsketenagakerjaan.go.id/neo-bpjstku-dev/id/informasi-pembayaran-bpu", "");
            ViewPortBuilder.b();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~i;
        int i11 = i9 | (~(i7 | i10 | i6));
        int i12 = (~(i | i8)) | i7 | (~(i10 | i6));
        int i13 = i3 + i6 + i5 + (1112421973 * i4) + ((-1897213938) * i2);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i3) - 781189120) + ((-1395624931) * i6) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i5) + ((-1446510592) * i4) + (892338176 * i2) + ((-1657864192) * i14);
        int i16 = (i3 * 2010092721) + 1217064380 + (i6 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i5 * 2010091741) + (i4 * (-1378896031)) + (i2 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i18 = 2 % 2;
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        f646a = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    static {
        g = 0;
        g();
        INSTANCE = new Companion(null);
        int i = d + 115;
        g = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentbindingInflater1 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 909613781, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, -909613780)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), -317280900, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, 317280900);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        f646a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        f646a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        f646a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentbindingInflater1 = setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 498914289;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentbindingInflater1, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), 46955694, setSurfaceAspectRatio.Companion.TuitionPaymentFragmentbindingInflater1(), length, new Object[]{this}, -46955692);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f646a + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        f646a = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new int[]{785678764, -68328565, -1821402547, -1038299635, 1210362542, -1270031108, 1040753315, -1622087416, 1780734149, 1556082457, -1950850755, -35292049, 788705254, 273435048, -671726050, -291027283, -130892570, -5263733};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 * 56
            int r8 = r8 + 66
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = com.bpjstku.presentation.tuition.TuitionPaymentCodeActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentCodeActivity.$$i(int, byte, short):java.lang.String");
    }
}
