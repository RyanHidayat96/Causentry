package com.nbs.nucleo.presentation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accesssetAnchoredZoomStartXp;
import defpackage.computeCropRectFromAspectRatio;
import defpackage.getFocusX;
import defpackage.initSession;
import defpackage.isLenovoTablet;
import defpackage.isSamsungFold2OrFold3;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003"}, d2 = {"Lcom/nbs/nucleo/presentation/BaseApplication;", "Landroidx/multidex/MultiDexApplication;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "attachBaseContext", "(Landroid/content/Context;)V", "", "LisLenovoTablet;", "TuitionPaymentFragmentbindingInflater1", "()Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onCreate"}, k = 1, mv = {2, 3, 0})
public abstract class BaseApplication extends MultiDexApplication {
    private static final byte[] $$d;
    private static final int $$e;
    private static final byte[] $$h = {29, -5, -24, -13};
    private static final int $$i = 139;
    private static int $10;
    private static int $11;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = 196 - r7
            int r8 = 53 - r8
            byte[] r0 = com.nbs.nucleo.presentation.BaseApplication.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleo.presentation.BaseApplication.d(int, int, byte, java.lang.Object[]):void");
    }

    public abstract List<isLenovoTablet> TuitionPaymentFragmentbindingInflater1();

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public BaseApplication() {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
        }
    }

    @Override // androidx.multidex.MultiDexApplication, android.app.Application
    public void onCreate() throws KoinAppAlreadyStartedException {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.onCreate();
            return;
        }
        int i = 2 % 2;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "");
        ExperimentalCameraProviderConfiguration.b(applicationContext);
        Function1<getFocusX, Unit> function1 = new Function1<getFocusX, Unit>() { // from class: com.nbs.nucleo.presentation.BaseApplication.onCreate.1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(getFocusX getfocusx) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(getfocusx);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getFocusX getfocusx) {
                accesssetAnchoredZoomStartXp.b(getfocusx, BaseApplication.this);
                getfocusx.TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseApplication.this.TuitionPaymentFragmentbindingInflater1());
            }

            {
                super(1);
            }
        };
        getFocusX.Companion companion = getFocusX.INSTANCE;
        final getFocusX getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        function1.invoke(getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (getFocusX.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.DEBUG) <= 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: org.koin.core.KoinApplication$createEagerInstances$duration$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ Unit invoke() {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return Unit.INSTANCE;
                }

                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                    getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1.b.b.b();
                }

                {
                    super(0);
                }
            };
            long jNanoTime = System.nanoTime();
            function0.invoke();
            double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
            isSamsungFold2OrFold3 issamsungfold2orfold3 = getFocusX.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("instances started in ");
            sb.append(dNanoTime);
            sb.append(" ms");
            issamsungfold2orfold3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.DEBUG, sb.toString());
        } else {
            getfocusxTuitionPaymentFragmentspecialinlinedviewModeldefault1.b.b.b();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context p0) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.attachBaseContext(p0);
            return;
        }
        int i = 2 % 2;
        super.attachBaseContext(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
            byte b2 = $$d[5];
            Object[] objArr2 = new Object[1];
            d(b2, (short) (b2 | 192), (byte) 15, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, modifierMetaStateMask, iLastIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((char) (Color.rgb(0, 0, 0) + 16782106), Process.myPid() >> 22, 22 - View.resolveSizeAndState(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((char) KeyEvent.normalizeMetaState(0), 22 - (KeyEvent.getMaxKeyCode() >> 16), '?' - AndroidCharacter.getMirror('0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
            int iGreen = Color.green(0) + 23;
            byte[] bArr = $$d;
            Object[] objArr5 = new Object[1];
            d(bArr[5], (short) 156, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, iGreen, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
                int iIndexOf2 = 1755 - TextUtils.indexOf("", "", 0, 0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                d(bArr2[5], (short) 104, bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf2, maximumFlingVelocity, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int i2 = ~((~new Random().nextInt(985101588)) | 739925548);
            int i3 = ((((202001952 | i2) * (-374)) - 868040847) + ((i2 | 537923596) * 374)) - 1906873542;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((char) TextUtils.getCapsMode("", 0, 0), 37 - Color.argb(0, 0, 0, 0), MotionEvent.axisFromString("") + 17, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((char) (TextUtils.getCapsMode("", 0, 0) + 34477), Color.alpha(0) + 53, TextUtils.getTrimmedLength("") + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1178577892};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.MeasureSpec.getSize(0)), 1726 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1906873542, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                    int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
                    byte[] bArr3 = $$d;
                    Object[] objArr11 = new Object[1];
                    d(bArr3[5], (short) 104, bArr3[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, maximumDrawingCacheSize, iLastIndexOf2, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    e((char) (4890 - (ViewConfiguration.getLongPressTimeout() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 22, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 15 - Gravity.getAbsoluteGravity(0, 0), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                        byte[] bArr4 = $$d;
                        Object[] objArr14 = new Object[1];
                        d(bArr4[5], (short) 156, bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, absoluteGravity, bitsPerPixel, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int i6 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b3 = $$d[5];
                        Object[] objArr15 = new Object[1];
                        d(b3, (short) (b3 | 192), (byte) 15, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(pressedStateDuration, iResolveSizeAndState, i6, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i7 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i8 != i7) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 17;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i8));
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iMyPid = Process.myPid();
        int i14 = ~iMyPid;
        int i15 = 283212549 + (((~((-551002431) | i14)) | 545497400) * (-1188));
        int i16 = (~(iMyPid | 551002430)) | 545497400;
        int i17 = ~(763604856 | i14);
        int i18 = i13 + i15 + ((i16 | i17) * 594) + (((~(551002430 | i14)) | (-769109887) | i17) * 594);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
            int iRgb = Color.rgb(0, 0, 0) + 16777231;
            byte[] bArr5 = $$d;
            Object[] objArr17 = new Object[1];
            d(bArr5[5], (short) 52, bArr5[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRgb, iNormalizeMetaState, iRgb, 1357589585, false, (String) objArr17[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr18 = new Object[1];
        e((char) (4890 - TextUtils.getTrimmedLength("")), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr18);
        Class<?> cls4 = Class.forName((String) objArr18[0]);
        Object[] objArr19 = new Object[1];
        e((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr19);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
            byte[] bArr6 = $$d;
            Object[] objArr20 = new Object[1];
            d(bArr6[5], (short) 104, bArr6[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity2, iCombineMeasuredStates, longPressTimeout, 1344079056, false, (String) objArr20[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iRgb2 = (-16776185) - Color.rgb(0, 0, 0);
                int iResolveSizeAndState2 = 15 - View.resolveSizeAndState(0, 0, 0);
                byte b4 = $$d[7];
                short s = b4;
                Object[] objArr21 = new Object[1];
                d(b4, s, (byte) (s | 52), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cCombineMeasuredStates, iRgb2, iResolveSizeAndState2, 632103528, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr22[3])[0];
            int i22 = ((int[]) objArr22[1])[0];
            String[] strArr2 = (String[]) objArr22[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = 1972551637 + ((~((~iIdentityHashCode) | (-135304343))) * (-116)) + ((384461088 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 140180918)) | 379584512) * 116) + 950527079;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[2])[0] = i25 ^ (i25 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 'U' - AndroidCharacter.getMirror('0'), KeyEvent.keyCodeFromString("") + 16, objArr23);
            Class<?> cls5 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e((char) (34477 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, objArr24);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1178577892};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46038), 1133 - TextUtils.lastIndexOf("", '0'), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr26 = {Integer.valueOf(iIntValue2), 0, 950527079, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cRed = (char) Color.red(0);
                int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
                byte[] bArr7 = $$d;
                Object[] objArr27 = new Object[1];
                d(bArr7[5], (short) 52, bArr7[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cRed, maxKeyCode, tapTimeout, 1298546779, false, (String) objArr27[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((Process.getThreadPriority(0) + 20) >> 6) + 45993), TextUtils.getCapsMode("", 0, 0) + 1117, ((Process.getThreadPriority(0) + 20) >> 6) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr26);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 15;
                byte b5 = $$d[7];
                short s2 = b5;
                Object[] objArr28 = new Object[1];
                d(b5, s2, (byte) (s2 | 52), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, jumpTapTimeout, offsetBefore, 632103528, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr29 = new Object[1];
                e((char) (TextUtils.lastIndexOf("", '0') + 4891), ViewConfiguration.getPressedStateDuration() >> 16, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr29);
                Class<?> cls6 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                e((char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr30);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                    int defaultSize = 15 - View.getDefaultSize(0, 0);
                    byte[] bArr8 = $$d;
                    Object[] objArr31 = new Object[1];
                    d(bArr8[5], (short) 104, bArr8[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(touchSlop2, edgeSlop, defaultSize, 1344079056, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                    int edgeSlop2 = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr9 = $$d;
                    Object[] objArr32 = new Object[1];
                    d(bArr9[5], (short) 52, bArr9[7], objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveSizeAndState, packedPositionType, edgeSlop2, 1357589585, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[3])[0];
        if (i27 == i26) {
            Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode2;
            int i32 = i28 + (-1783581583) + ((iIdentityHashCode2 | 14672177) * 140) + (((~(14672177 | i31)) | 220203528) * (-280)) + (((~(iIdentityHashCode2 | (-220203529))) | (~(229607992 | i31)) | 5267713) * 140);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr33[2])[0] = i34 ^ (i34 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr[0];
            if (strArr4 != null) {
                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                TuitionPaymentFragmentbindingInflater1 = i35 % 128;
                int i36 = i35 % 2;
                for (String str2 : strArr4) {
                    arrayList2.add(str2);
                }
            }
            int[] iArr = new int[i27];
            int i37 = i27 - 1;
            iArr[i37] = 1;
            Toast.makeText((Context) null, iArr[((i27 * i37) % 2) - 1], 1).show();
            Object[] objArr34 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr5 = (String[]) objArr[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i41 = ~((-990585383) | (~iUptimeMillis));
            int i42 = i38 + (((-1065072319) | i41 | (~(990585382 | iUptimeMillis))) * (-338)) + 1027089211 + (((~(iUptimeMillis | (-74486937))) | i41) * 338);
            int i43 = i42 ^ (i42 << 13);
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr34[2])[0] = i44 ^ (i44 << 5);
        }
        MultiDex.install(this);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ff  */
    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2187 - (Process.myTid() >> 22), 40 - View.resolveSize(0, 0), 841711447, false, $$j(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 33017), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3011, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 321985076, false, $$j(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getScrollBarSize() >> 8)), MotionEvent.axisFromString("") + 3377, 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -968507904, false, $$j(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $11 + 67;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 3376 - TextUtils.indexOf("", "", 0), View.resolveSize(0, 0) + 17, -968507904, false, $$j(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - View.MeasureSpec.getSize(0)), View.MeasureSpec.getSize(0) + 3376, (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, -968507904, false, $$j(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
        int i6 = $11 + 45;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            return;
        }
        $10 = 0;
        $11 = 1;
        $$d = new byte[]{73, 55, 58, 33, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        $$e = 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentbindingInflater1 = 1;
        b = new char[]{41703, 41776, 41298, 42876, 42377, 43991, 43506, 44608, 44073, 45677, 45272, 46749, 46303, 46349, 47906, 47435, 49003, 48541, 33754, 33249, 34309, 33877, 45561, 45096, 45645, 46180, 46735, 47297, 47848, 48422, 48953, 41317, 41856, 42400, 42965, 42505, 43049, 45558, 45093, 45658, 46197, 46802, 47304, 47853, 48410, 48955, 41258, 41919, 42413, 42959, 42512, 43049, 43609, 14168, 13965, 13540, 13015, 12325, 15968, 15445, 15264, 14777, 10184, 9522, 8977, 8530, 8358, 11909, 11516};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7281258707349622716L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$j(byte r7, short r8, short r9) {
        /*
            byte[] r0 = com.nbs.nucleo.presentation.BaseApplication.$$h
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r9 = r9 * 3
            int r9 = 115 - r9
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nbs.nucleo.presentation.BaseApplication.$$j(byte, short, short):java.lang.String");
    }
}
