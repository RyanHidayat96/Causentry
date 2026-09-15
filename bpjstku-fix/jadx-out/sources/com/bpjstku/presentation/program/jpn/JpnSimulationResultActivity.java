package com.bpjstku.presentation.program.jpn;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import com.bpjstku.databinding.ActivityJpnSimulationResultBinding;
import com.bpjstku.domain.simulation.model.JpSimulation;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.google.firebase.analytics.connector.internal.zzg;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00158\u0015X\u0094D¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/JpnSimulationResultActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityJpnSimulationResultBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/domain/simulation/model/JpSimulation;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/simulation/model/JpSimulation;", "TuitionPaymentFragmentbindingInflater1", "", "I", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpnSimulationResultActivity extends BindingBaseActivity<ActivityJpnSimulationResultBinding> {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int asBinder;
    private static long b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int b = R.layout.activity_jpn_simulation_result;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private JpSimulation TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {110, -73, -111, 99, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 5;
    private static int asInterface = 0;
    private static int g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f610a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = ~(i7 | i4);
        int i10 = i8 | i9;
        int i11 = ~i6;
        int i12 = (~((~i4) | i7 | i6)) | (~(i7 | i11 | i4));
        int i13 = i9 | (~(i11 | i));
        int i14 = i + i6 + i3 + ((-1696018712) * i5) + (2108813197 * i2);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i) - 2121662464) + (1221732374 * i6) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i3) + (39845888 * i5) + (227278848 * i2) + ((-1705377792) * i15);
        int i17 = ((i * 362004572) - 1408384217) + (i6 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i3 * 362004373) + (i5 * (-1290304248)) + (i2 * 155295761) + (i15 * (-60686336));
        if (i16 + (i17 * i17 * (-1680474112)) != 1) {
            return b(objArr);
        }
        int i18 = 2 % 2;
        int i19 = asInterface + 77;
        g = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            int r5 = 145 - r5
            byte[] r1 = com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r6 = r5
            r3 = r7
            goto L27
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r1[r6]
        L27:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.c(int, int, byte, java.lang.Object[]):void");
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityJpnSimulationResultBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 9;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            JpnSimulationResultActivity$bindingInflater$1 jpnSimulationResultActivity$bindingInflater$1 = JpnSimulationResultActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            obj.hashCode();
            throw null;
        }
        JpnSimulationResultActivity$bindingInflater$1 jpnSimulationResultActivity$bindingInflater$2 = JpnSimulationResultActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = g + 55;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return jpnSimulationResultActivity$bindingInflater$2;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        JpSimulation jpSimulation;
        int i = 2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            int i2 = asInterface + 7;
            g = i2 % 128;
            int i3 = i2 % 2;
            jpSimulation = (JpSimulation) intent.getParcelableExtra("jpn_result");
        } else {
            int i4 = asInterface + 79;
            g = i4 % 128;
            int i5 = i4 % 2;
            jpSimulation = null;
        }
        this.TuitionPaymentFragmentbindingInflater1 = jpSimulation;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = g + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        JpnSimulationResultActivity jpnSimulationResultActivity = this;
        Intrinsics.checkNotNullParameter(jpnSimulationResultActivity, "");
        jpnSimulationResultActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityJpnSimulationResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityJpnSimulationResultBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_simulation_pension_ansurance));
        int i4 = asInterface + 75;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = g + 115;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 21;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2187 - (ViewConfiguration.getLongPressTimeout() >> 16), 39 - ((byte) KeyEvent.getModifierMetaStateMask()), 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 33017);
                        int packedPositionChild = 3010 - ExpandableListView.getPackedPositionChild(0L);
                        int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                        byte b4 = (byte) ($$f & 11);
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionChild, packedPositionType, 321985076, false, $$i(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getSize(0) + 36505), Color.argb(0, 0, 0, 0) + 3376, 16 - TextUtils.indexOf((CharSequence) "", '0'), -968507904, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
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
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2186, View.resolveSize(0, 0) + 40, 841711447, false, $$i(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cGreen = (char) (Color.green(0) + 33017);
                    int iResolveOpacity = 3011 - Drawable.resolveOpacity(0, 0);
                    int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b10 = (byte) ($$f & 11);
                    byte b11 = (byte) (b10 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, iResolveOpacity, doubleTapTimeout, 321985076, false, $$i(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 36505), ((byte) KeyEvent.getModifierMetaStateMask()) + 3377, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, -968507904, false, $$i(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i7 = $10 + 107;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 1;
                byte b15 = (byte) (b14 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 3424 - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionGroup(0L) + 17, -968507904, false, $$i(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        int i2 = g + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i4 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i5 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            short s = (short) ($$b | 136);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(s, b2, (byte) (b2 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, i5, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(TextUtils.indexOf((CharSequence) "", '0') + 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_other).substring(16, 20).length() + 18, (char) (852 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53877), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) Color.green(0);
            int mirror = AndroidCharacter.getMirror('0') + 983;
            int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 89, b3, (byte) (b3 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, mirror, i6, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                short s2 = (short) ($$b | 32);
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c(s2, bArr[5], bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, offsetAfter, iNormalizeMetaState, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i9 = (-1330492805) + (((~((~iElapsedRealtime) | 185509969)) | 277877674) * 446) + (((~(iElapsedRealtime | 463387643)) | 151912465) * 446) + 2071935105;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(54 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-616773986};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46038), 1134 - (ViewConfiguration.getScrollBarSize() >> 8), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1602423211, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                    short s3 = (short) ($$b | 136);
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c(s3, b4, (byte) (b4 | 52), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, maximumDrawingCacheSize, scrollBarFadeDuration, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.alpha(0) + 45993), 1117 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "") + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                    short s4 = (short) ($$b | 32);
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c(s4, bArr2[5], bArr2[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i12, longPressTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (Color.blue(0) + 852), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(22 - Color.red(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53877), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
                        byte b5 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 89, b5, (byte) (b5 | 52), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(defaultSize, maximumFlingVelocity, packedPositionGroup, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
                        short s5 = (short) ($$b | 136);
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(s5, b6, (byte) (b6 | 52), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, i13, deadChar, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i19 = ~elapsedCpuTime;
            int i20 = i16 + 433629483 + (((~(195613742 | i19)) | (~((-439893913) | elapsedCpuTime))) * (-370)) + (((~(elapsedCpuTime | 195613742)) | (~(i19 | (-439893913))) | 25215014) * (-370)) + 739620588;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i23 = 0;
                while (i23 < strArr3.length) {
                    int i24 = g + 107;
                    asInterface = i24 % 128;
                    if (i24 % 2 != 0) {
                        arrayList.add(strArr3[i23]);
                        i23 += 83;
                    } else {
                        arrayList.add(strArr3[i23]);
                        i23++;
                    }
                }
            }
            int[] iArr = new int[i15];
            int i25 = i15 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i25) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i30 = ~i29;
            int i31 = i26 + (-1589575152) + (((~(200273482 | i30)) | 444553652) * 226) + (((~(i30 | 469762046)) | (~((-444553653) | i29)) | 175065088) * (-113)) + ((~(i29 | 200273482)) * 113);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[2])[0] = i33 ^ (i33 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
            int iIndexOf = 1755 - TextUtils.indexOf("", "");
            int iArgb = Color.argb(0, 0, 0, 0) + 23;
            short s6 = (short) ($$b | 32);
            byte b7 = $$a[7];
            Object[] objArr20 = new Object[1];
            c(s6, b7, (byte) (b7 | 37), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRgb, iIndexOf, iArgb, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i34 = g + 19;
            asInterface = i34 % 128;
            int i35 = i34 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                byte b8 = $$a[7];
                Object[] objArr21 = new Object[1];
                c((short) 89, b8, (byte) (b8 | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(minimumFlingVelocity, maximumFlingVelocity2, threadPriority, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i36 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i37 = (((-251538111) + (((~(i36 | 515701742)) | (~((-34654245) | i36))) * (-184))) + (((346824962 | (~((-381479207) | i36))) | (~(168876780 | i36))) * 184)) - 360655403;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(37 - View.MeasureSpec.getSize(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 17, Process.getGidForName("") + 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-616773986};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 42050), (ViewConfiguration.getLongPressTimeout() >> 16) + 1726, 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1433512371, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                int iNormalizeMetaState2 = 23 - KeyEvent.normalizeMetaState(0);
                byte b9 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 89, b9, (byte) (b9 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, iIndexOf2, iNormalizeMetaState2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1062).substring(0, 26).length() - 26, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_password_empty).substring(7, 8).codePointAt(0) + 742), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step2).substring(8, 9).codePointAt(0) - 88, 15 - Color.green(0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).codePointAt(0) + 53806), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c5 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iAlpha = 1755 - Color.alpha(0);
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 23;
                    short s7 = $$a[7];
                    byte b10 = (byte) s7;
                    Object[] objArr29 = new Object[1];
                    c(s7, b10, (byte) (b10 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c5, iAlpha, packedPositionType2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                    int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 23;
                    short s8 = (short) ($$b | 32);
                    byte b11 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c(s8, b11, (byte) (b11 | 37), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, iAxisFromString, longPressTimeout2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i41 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i41 == i40) {
            int i42 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iNextInt = new Random().nextInt(146947627);
            int i43 = i42 + ((~((-34244738) | iNextInt)) * 521) + 1959613552 + (((~((~iNextInt) | (-34244738))) | (-392076992)) * 521);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr31[3])[0] = i45 ^ (i45 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr5 != null) {
            int i46 = g + 89;
            asInterface = i46 % 128;
            for (int i47 = i46 % 2 != 0 ? 1 : 0; i47 < strArr5.length; i47++) {
                arrayList2.add(strArr5[i47]);
            }
        }
        Toast.makeText((Context) null, i41 / (((i41 - 1) * i41) % 2), 0).show();
        int i48 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i49 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i50 = ~i49;
        int i51 = ~(601542072 | i50);
        int i52 = i48 + (-635744959) + (((-939458559) | i51) * (-712)) + (((~(i49 | (-337916487))) | (~(i50 | 939458558))) * (-712)) + ((388939646 | i51) * 712);
        int i53 = (i52 << 13) ^ i52;
        int i54 = i53 ^ (i53 >>> 17);
        ((int[]) objArr32[3])[0] = i54 ^ (i54 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        g = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i5 = ~layoutDirection;
        if (i4 != (-613547480) + (((~((-986289852) | i5)) | 138449568) * 184) + ((layoutDirection | (-1004142592)) * (-184)) + ((~((-156302309) | i5)) * 184)) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        if (i6 != 1659651580 + (((~(i7 | 704156671)) | (-1878569984)) * (-160)) + (((~(i7 | (-1874899294))) | 704156671) * 160)) {
            throw null;
        }
        super.onResume();
        int i8 = asInterface + 103;
        g = i8 % 128;
        int i9 = i8 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1769099696
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
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ba, code lost:
    
        if (r1 != ((((-381073518) + (((~((-1041660014) | r2)) | (-1537395952)) * (-933))) + (((~(r2 | (-1537395952))) | 1101038722) * 933)) - 1978128048)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bc, code lost:
    
        super.onCreate(r8);
        r8 = com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.g + 27;
        com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.asInterface = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c9, code lost:
    
        r8 = (-832313820) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d2, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:
    
        r8 = (-1356016514) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r1 == ((((-22730376) + (((~((~r4) | 915582018)) | 17305897) * 446)) + (((~(r4 | 932887915)) | 68288578) * 446)) - 871504530)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008d, code lost:
    
        if (r1 == (((1906808148 + (((-880579016) | r4) * (-220))) + ((r4 | 1098984472) * 220)) - 154098860)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = ~java.lang.System.identityHashCode(r7);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.onCreate(android.os.Bundle):void");
    }

    static {
        asBinder = 0;
        g();
        INSTANCE = new Companion(null);
        int i = f610a + 41;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iCodePointAt = 918547380 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_offers).substring(9, 10).codePointAt(0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, 1099068367, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima3).substring(12, 18).codePointAt(2) + 439583515, iCodePointAt, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1099068367);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -2139933475, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentbindingInflater1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 413169464, 2139933476);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = asInterface + 121;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{45737, 65426, 10436, 21798, 34423, 12453, 32148, 44682, 56071, 1135, 46830, 58279, 11457, 22815, 35428, 13473, 25061, 37631, 57100, 2171, 47803, 59367, 25440, 11869, 63756, 34025, 22438, 57700, 44121, 32571, 2752, 54704, 26465, 12877, 64796, 35020, 23480, 45558, 64713, 11138, 22113, 34146, 13300, 32453, 44446, 55387, 1894, 46535, 57561, 12191, 23116, 35105, 14333, 45557, 64716, 11153, 22126, 34104, 13297, 32464, 44425, 55412, 1833, 46567, 57544, 12207, 23127, 35104, 14325};
        b = 5624421221763644584L;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jpn.JpnSimulationResultActivity.$$i(short, short, short):java.lang.String");
    }
}
