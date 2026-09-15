package com.bpjstku.presentation.vocational;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityVocationalDisabledBinding;
import com.bpjstku.databinding.ActivityVocationalTrainingDetilInformationBinding;
import com.bpjstku.presentation.vocational.VocationalDisabledActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ViewPortBuilder;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00118UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalDisabledActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVocationalDisabledBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "asBinder", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalDisabledActivity extends BindingBaseActivity<ActivityVocationalDisabledBinding> {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 116, 92, -78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 226;
    private static int asInterface = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | i;
        int i9 = (~(i7 | (~i3))) | (~((~i) | i7)) | (~(i | i6 | i3));
        int i10 = ~(i3 | i);
        int i11 = i + i6 + i5 + ((-813770285) * i4) + (135932771 * i2);
        int i12 = i11 * i11;
        int i13 = (526900465 * i) + 74317824 + ((-1745228167) * i6) + ((-249289968) * i8) + (2022838664 * i9) + ((-2022838664) * i10) + (277610496 * i5) + (1331953664 * i4) + ((-366739456) * i2) + ((-1308753920) * i12);
        int i14 = (i * 1149714451) + 247108311 + (i6 * 1149714091) + (i8 * (-720)) + (i9 * (-360)) + (i10 * 360) + (i5 * 1149713731) + (i4 * 1918847289) + (i2 * (-2006650391)) + (i12 * 460980224);
        return i13 + ((i14 * i14) * (-1418592256)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.presentation.vocational.VocationalDisabledActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalDisabledActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVocationalDisabledBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        VocationalDisabledActivity$bindingInflater$1 vocationalDisabledActivity$bindingInflater$1 = VocationalDisabledActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = b + 27;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return vocationalDisabledActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityVocationalDisabledBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnBack.setOnClickListener(new View.OnClickListener() { // from class: getVerifiedResolution
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VocationalDisabledActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        int i2 = b + 73;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        VocationalDisabledActivity vocationalDisabledActivity = this;
        Intrinsics.checkNotNullParameter(vocationalDisabledActivity, "");
        vocationalDisabledActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityVocationalDisabledBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityVocationalDisabledBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_vocational_program));
        int i4 = b + 107;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 119;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2187, 40 - Color.argb(0, 0, 0, 0), 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 33017);
                        int i7 = 3011 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iMyPid = (Process.myPid() >> 22) + 26;
                        byte b4 = (byte) ($$f & 11);
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, i7, iMyPid, 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36505), View.resolveSize(0, 0) + 3376, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -968507904, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), Drawable.resolveOpacity(0, 0) + 2187, (-16777176) - Color.rgb(0, 0, 0), 841711447, false, $$i(b8, b9, b9), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char windowTouchSlop = (char) (33017 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3011;
                            int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte b10 = (byte) ($$f & 11);
                            byte b11 = (byte) (b10 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, iCombineMeasuredStates, longPressTimeout, 321985076, false, $$i(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) 1;
                                byte b13 = (byte) (b12 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - (Process.myPid() >> 22)), 3376 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - 31, -968507904, false, $$i(b12, b13, b13), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i9 = $11 + 125;
        $10 = i9 % 128;
        int i10 = 2;
        if (i9 % 2 != 0) {
            int i11 = 2 % 5;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i12 = $10 + 33;
            $11 = i12 % 128;
            if (i12 % i10 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.getSize(0) + 3376, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -968507904, false, $$i(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                int i13 = 83 / 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    byte b16 = (byte) 1;
                    byte b17 = (byte) (b16 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36504), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3376, (ViewConfiguration.getScrollBarSize() >> 8) + 17, -968507904, false, $$i(b16, b17, b17), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
            i10 = 2;
        }
        objArr[0] = new String(cArr);
        int i14 = $11 + 113;
        $10 = i14 % 128;
        int i15 = i14 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws Throwable {
        Object[] objArr2;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 0;
        VocationalDisabledActivity vocationalDisabledActivity = (VocationalDisabledActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1031;
            int gidForName = Process.getGidForName("") + 16;
            byte b2 = $$a[7];
            short s = b2;
            Object[] objArr3 = new Object[1];
            c(s, (byte) (s | 52), b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, offsetBefore, gidForName, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_shopeepay_qris).substring(0, 5).length() + 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 52413), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_promo_amount).substring(4, 5).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_gross_amount_required).substring(5, 6).length() + 14, (char) (ViewConfiguration.getTouchSlop() >> 8), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
            int i3 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            short s2 = (short) 52;
            Object[] objArr6 = new Object[1];
            c(s2, (byte) s2, $$a[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, packedPositionType, i3, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr = $$a;
                Object[] objArr7 = new Object[1];
                c((short) 104, bArr[7], bArr[132], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, modifierMetaStateMask, keyRepeatTimeout, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr8[3])[0];
            int i5 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int iNextInt = new Random().nextInt(1139672653);
            int i6 = ~iNextInt;
            int i7 = (-2140082559) + (((~(601492890 | i6)) | 270626820) * 168) + ((~((-270626821) | iNextInt)) * 168) + (((~(iNextInt | 872119710)) | (~(i6 | (-845773061))) | 575146240) * 168) + 1335365709;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr2[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_3).substring(3, 4).length() + 36, TextUtils.lastIndexOf("", '0', 0) + 17, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44408), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 42, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_mandiri_bill).substring(0, 12).codePointAt(4) - 89, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_web).substring(1, 3).codePointAt(0) - 97), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, vocationalDisabledActivity)).intValue();
            try {
                Object[] objArr11 = {-586489565};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.green(0) + 46038), 1134 - KeyEvent.getDeadChar(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1335365709, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                    int iArgb = 15 - Color.argb(0, 0, 0, 0);
                    byte b3 = $$a[7];
                    short s3 = b3;
                    Object[] objArr13 = new Object[1];
                    c(s3, (byte) (s3 | 52), b3, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, maxKeyCode, iArgb, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 45994), 1117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (KeyEvent.getMaxKeyCode() >> 16) + 17), Boolean.TYPE});
                }
                objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1032;
                    int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr2 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) 104, bArr2[7], bArr2[132], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, iIndexOf, i10, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr2);
                try {
                    Object[] objArr15 = new Object[1];
                    e(TextUtils.indexOf("", "", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_alfamart).substring(1, 3).codePointAt(0) - 75, (char) (52416 - ImageFormat.getBitsPerPixel(0)), objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) View.MeasureSpec.getSize(0), objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                        int iBlue = 1031 - Color.blue(0);
                        int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        short s4 = (short) 52;
                        Object[] objArr17 = new Object[1];
                        c(s4, (byte) s4, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode2, iBlue, doubleTapTimeout, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iIndexOf2 = 1031 - TextUtils.indexOf("", "");
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
                        byte b4 = $$a[7];
                        short s5 = b4;
                        Object[] objArr18 = new Object[1];
                        c(s5, (byte) (s5 | 52), b4, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, iIndexOf2, iLastIndexOf, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr2[1])[0];
        int i12 = ((int[]) objArr2[3])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr2[0];
            if (strArr2 != null) {
                int i13 = b + 125;
                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                int i14 = i13 % 2;
                while (i < strArr2.length) {
                    int i15 = TuitionPaymentFragmentbindingInflater1 + 9;
                    b = i15 % 128;
                    if (i15 % 2 == 0) {
                        arrayList.add(strArr2[i]);
                        i += 126;
                    } else {
                        arrayList.add(strArr2[i]);
                        i++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i16 = TuitionPaymentFragmentbindingInflater1 + 25;
        b = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr2[2])[0];
        int i19 = ((int[]) objArr2[3])[0];
        int i20 = ((int[]) objArr2[1])[0];
        String[] strArr3 = (String[]) objArr2[0];
        int i21 = ~((int) Runtime.getRuntime().maxMemory());
        int i22 = i18 + 644797189 + (((~((-11572503) | i21)) | 255852672) * (-828)) + ((i21 | (-11572503)) * (-828)) + 992097064;
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr19[2])[0] = i24 ^ (i24 << 5);
        int i25 = TuitionPaymentFragmentbindingInflater1 + 19;
        b = i25 % 128;
        int i26 = i25 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
            int iIndexOf3 = TextUtils.indexOf("", "", 0) + 23;
            Object[] objArr20 = new Object[1];
            c((short) 104, (byte) 37, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarSize, doubleTapTimeout2, iIndexOf3, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                int threadPriority = 1755 - ((Process.getThreadPriority(0) + 20) >> 6);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 23;
                short s6 = (short) 52;
                Object[] objArr21 = new Object[1];
                c(s6, (byte) s6, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyTid, threadPriority, iNormalizeMetaState, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iMyUid = Process.myUid();
            int i27 = (((1875510709 + (((~(iMyUid | 35662270)) | (-176940156)) * (-668))) + ((35662270 | (~((-176940156) | iMyUid))) * 1336)) + ((iMyUid | (-143377474)) * 668)) - 355001444;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_6).substring(12, 13).length() + 44407), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 63, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 107), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, vocationalDisabledActivity)).intValue();
            Object[] objArr25 = {-586489565};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42049), View.getDefaultSize(0, 0) + 1726, View.resolveSizeAndState(0, 0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -355001444);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char size = (char) (29944 - View.MeasureSpec.getSize(0));
                int iArgb2 = Color.argb(0, 0, 0, 0) + 1755;
                int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                short s7 = (short) 52;
                Object[] objArr26 = new Object[1];
                c(s7, (byte) s7, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(size, iArgb2, trimmedLength, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.txt_checkout).substring(0, 15).codePointAt(4) - 107, TextUtils.lastIndexOf("", '0') + 23, (char) (52416 - Process.getGidForName("")), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).length() + 9, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_backend_liveness_is_not_configured).substring(0, 64).length() - 64), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int i30 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int threadPriority2 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr29 = new Object[1];
                    c((short) 141, (byte) 52, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf2, i30, threadPriority2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                    int capsMode3 = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    Object[] objArr30 = new Object[1];
                    c((short) 104, (byte) 37, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSizeAndState, capsMode3, minimumFlingVelocity, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i31 = b + 115;
                TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                int i32 = i31 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i34 == i33) {
            int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iNextInt2 = new Random().nextInt();
            int i36 = ~iNextInt2;
            int i37 = i35 + 1929060175 + (((~((-1058161127) | i36)) | (~(iNextInt2 | (-845558701)))) * 333) + (((~(iNextInt2 | (-1058161127))) | (~(i36 | (-845558701)))) * 333);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[3])[0] = i39 ^ (i39 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i34];
        int i40 = i34 - 1;
        iArr[i40] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i40) % 2) - 1], 1).show();
        int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int i42 = ~new Random().nextInt(1407083133);
        int i43 = i41 + (((~((-967554038) | i42)) | 285217348) * (-241)) + 1803122749 + (((~(i42 | (-682336690))) | (-1040168960)) * 241);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr32[3])[0] = i45 ^ (i45 << 5);
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -517728665
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.vocational.VocationalDisabledActivity.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.bpjstku.presentation.vocational.VocationalDisabledActivity.b = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.keyboardHidden
            r5 = 1941925759(0x73bf6f7f, float:3.033417E31)
            r5 = r5 | r4
            int r5 = r5 * (-676)
            r6 = -2014316296(0xffffffff87eff8f8, float:-3.6107054E-34)
            int r6 = r6 + r5
            int r5 = ~r4
            r7 = 826239870(0x313f6b7e, float:2.785526E-9)
            r7 = r7 | r5
            int r7 = ~r7
            r8 = -1941925760(0xffffffff8c409080, float:-1.4834626E-31)
            r7 = r7 | r8
            int r7 = r7 * 676
            int r6 = r6 + r7
            r7 = 1656227413(0x62b80655, float:1.6973286E21)
            r5 = r5 | r7
            int r5 = ~r5
            r7 = 285698346(0x1107692a, float:1.0682028E-28)
            r5 = r5 | r7
            r7 = -1115685890(0xffffffffbd7ffbfe, float:-0.062496178)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 676
            int r6 = r6 + r4
            if (r1 != r6) goto Lc7
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.util.Random r2 = new java.util.Random
            r2.<init>()
            int r2 = r2.nextInt()
            int r2 = ~r2
            r4 = -40821633(0xfffffffffd911c7f, float:-2.4110752E37)
            r4 = r4 | r2
            r5 = -2392577(0xffffffffffdb7dff, float:NaN)
            r5 = r5 | r2
            int r5 = ~r5
            r6 = 1756732963(0x68b59e23, float:6.8613235E24)
            r6 = r6 | r2
            r7 = 1795162019(0x6affffa3, float:1.5474165E26)
            r2 = r2 | r7
            int r2 = ~r2
            r2 = r2 | r5
            int r2 = r2 * (-184)
            r5 = 479161148(0x1c8f6b3c, float:9.490666E-22)
            int r5 = r5 + r2
            r2 = 38429056(0x24a6180, float:1.4868597E-37)
            int r4 = ~r4
            r2 = r2 | r4
            int r4 = ~r6
            r2 = r2 | r4
            int r2 = r2 * 184
            int r5 = r5 + r2
            r2 = -676084192(0xffffffffd7b3c620, float:-3.9532704E14)
            int r5 = r5 + r2
            if (r1 == r5) goto Lba
            r1 = -517728665(0xffffffffe1241667, float:-1.8918002E20)
            int[] r1 = new int[r1]
            r2 = -517728666(0xffffffffe1241666, float:-1.8918E20)
            r4 = 1
            r1[r2] = r4
            r2 = 2076821258(0x7bc9c70a, float:2.0953773E36)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
        Lba:
            super.onResume()
            int r1 = com.bpjstku.presentation.vocational.VocationalDisabledActivity.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.bpjstku.presentation.vocational.VocationalDisabledActivity.b = r2
            int r1 = r1 % r0
            return
        Lc7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalDisabledActivity.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00b0  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unable_to_parse_information).substring(0, 31).length() + 508892749;
            int i4 = ~length;
            if (i3 != (-481921204) + ((~(1292590801 | i4)) * 979) + ((length | 462603258) * (-979)) + (((~(length | 1292590801)) | (~(i4 | 462603258))) * 979)) {
                int[] iArr = new int[1335512229];
                iArr[1335512228] = 1;
                int i5 = (-740551244) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            if (i6 != (((~(1582384326 | i7)) | (-1921641770)) * 398) + 1592645122 + (((~((~i7) | 1582384326)) | (-1921641770)) * 398)) {
                int[] iArr2 = new int[1335512229];
                iArr2[1335512228] = 1;
                int i8 = (-740551244) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyUid = Process.myUid();
        if (i9 != ((((~((-629420161) | iMyUid)) | 1073743904) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 302615492) + ((~((~iMyUid) | (-629420161))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            int i10 = b + 39;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            if (i10 % 2 != 0) {
                int[] iArr3 = new int[211565235];
                iArr3[211565234] = 1;
                Toast.makeText((Context) null, iArr3[-1], 0).show();
            } else {
                int[] iArr4 = new int[211565235];
                iArr4[211565234] = 1;
                int i11 = 1392598646 % 2;
                Toast.makeText((Context) null, iArr4[-1], 1).show();
            }
        }
        super.onStart();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            if (i3 != (-1794545432) + (((~(902337034 | i4)) | 1107373281 | (~((-1732324578) | i4))) * (-744)) + (((~i4) | 277385738) * 744) + ((i4 | (-1107373282)) * 744)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iNextInt = new Random().nextInt(523644233);
            int i6 = ~(1038622463 | iNextInt);
            int i7 = ~iNextInt;
            if (i5 != (-410344520) + ((i6 | (~((-830479064) | i7))) * (-406)) + ((~(1039113983 | i7)) * (-406)) + (((~(iNextInt | (-208634921))) | (~((-1038622464) | i7))) * 406)) {
                throw null;
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iNextInt2 = new Random().nextInt();
        if (i8 != (((~((-95109259) | iNextInt2)) | 27344904) * (-566)) + 876402444 + ((~(iNextInt2 | (-67764355))) * 566)) {
            int i9 = b + 57;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            if (i9 % 2 != 0) {
                int[] iArr = new int[932236072];
                iArr[932236071] = 0;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[932236072];
                iArr2[932236071] = 1;
                int i10 = 648522520 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationalDisabledActivity vocationalDisabledActivity, View view) {
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            vocationalDisabledActivity.finish();
            ViewPortBuilder.b();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 91;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asInterface + 67;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 19;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return R.layout.activity_vocational_disabled;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentbindingInflater1 = ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1();
        b(1924514082, AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater3, iTuitionPaymentFragmentbindingInflater2, -1924514081);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = b + 89;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        b(1617024968, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step2).substring(0, 5).codePointAt(0) - 695482645, new Object[]{this, context}, ActivityVocationalTrainingDetilInformationBinding.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), AutoValue_CrashlyticsReport_CustomAttribute.TuitionPaymentFragmentbindingInflater1(), -1617024968);
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{32060, 13897, 60365, 40769, 20698, 1110, 47589, 27941, 9954, 55908, 36791, 17200, 62620, 43036, 23941, 4382, 51856, 32260, 13221, 59196, 39094, 19508, 45561, 64138, 9993, 21378, 39943, 51355, 29988, 41368, 59945, 5815, 17204, 36822, 14413, 25795, 37205, 7310, 22527, 35430, 65259, 12578, 26090, 55385, 3292, 18259, 48000, 61043, 8867, 38191, 51618, 15405, 28847, 45557, 64130, 9997, 21404, 39936, 51351, 30004, 41395, 59908, 5815, 17195, 36810, 14439, 25793, 37204, 56799};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 9078577334324230886L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = r6 + 109
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalDisabledActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalDisabledActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
