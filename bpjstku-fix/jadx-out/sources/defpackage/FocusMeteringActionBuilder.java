package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.google.android.libraries.places.internal.zzbla;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class FocusMeteringActionBuilder implements Camera<getMirroring, Bitmap> {
    private final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$d = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {32, 1, 70, -122, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 73;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 631205962586631017L;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r7 = r7 * 4
            int r7 = r7 + 84
            byte[] r1 = defpackage.FocusMeteringActionBuilder.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FocusMeteringActionBuilder.a(short, byte, int, java.lang.Object[]):void");
    }

    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(getMirroring getmirroring, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        int i3 = 2 % 2;
        int i4 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        Object obj = null;
        getMirroring getmirroring2 = getmirroring;
        if (i4 % 2 == 0) {
            ConcurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getmirroring2.asInterface(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            obj.hashCode();
            throw null;
        }
        ConcurrentCameraSingleCameraConfig concurrentCameraSingleCameraConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ConcurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getmirroring2.asInterface(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i5 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return concurrentCameraSingleCameraConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 3;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1356, (KeyEvent.getMaxKeyCode() >> 16) + 38, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47773), 468 - View.resolveSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 1;
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

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(getMirroring getmirroring, getTargetRotation gettargetrotation) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            byte[] bArr = $$a;
            byte b2 = bArr[1];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, threadPriority, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{8780, 32456, 34177, 59561, 8749, 16297, 2043, 11254, 9759, 15338, 959, 12270, 10843, 14140, 3897, 9055, 11905, 13176, 2855, 10029, 13009, 12148, 5859, 15579, 14083, 10392}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{208, 10887, 58795, 57673, 181, 27620, 26580, 8724, 1183, 28585, 25493, 9842, 2253, 25441, 28497, 10904, 3085, 26409, 27420}, Drawable.resolveOpacity(0, 0) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
            int i3 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 37), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, absoluteGravity, i3, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
                int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, (byte) (b7 | 89), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, i6, iMakeMeasureSpec, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[0])[0];
            objArr = new Object[]{new int[]{i7}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = (~(702521236 | i8)) | (-1071628255) | (~(915123662 | i8));
            int i10 = (-715148273) + (((~(iIdentityHashCode | (-546016645))) | i9) * 590) + (i9 * (-1180)) + (((~((-915123663) | i8)) | (~(i8 | (-702521237)))) * 590) + 22735499;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{27675, 21370, 22944, 50983, 27761, 4628, 56264, 1131, 26633, 5725, 57243, ' ', 25604, 6867, 54117, 3323, 24796, 7885, 55063, 2219}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{28767, 32363, 10291, 32378, 28726, 16128, 43592, 48441, 29719, 15177, 44573, 47466, 30831, 14221, 41686, 46519, 31912, 13255, 42629, 45566}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1961711551};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - View.MeasureSpec.makeMeasureSpec(0, 0)), KeyEvent.keyCodeFromString("") + 1726, 29 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 22735499, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                    int iArgb = Color.argb(0, 0, 0, 0) + 23;
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr11 = new Object[1];
                    a(b8, b9, (byte) (b9 | 89), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, absoluteGravity2, iArgb, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{8780, 32456, 34177, 59561, 8749, 16297, 2043, 11254, 9759, 15338, 959, 12270, 10843, 14140, 3897, 9055, 11905, 13176, 2855, 10029, 13009, 12148, 5859, 15579, 14083, 10392}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{208, 10887, 58795, 57673, 181, 27620, 26580, 8724, 1183, 28585, 25493, 9842, 2253, 25441, 28497, 10904, 3085, 26409, 27420}, KeyEvent.normalizeMetaState(0) + 1, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                        int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                        int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, (byte) (b11 | 37), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, deadChar, i13, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int i14 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iMyPid = 23 - (Process.myPid() >> 22);
                        byte[] bArr2 = $$a;
                        byte b12 = bArr2[1];
                        byte b13 = bArr2[7];
                        Object[] objArr15 = new Object[1];
                        a(b12, b13, b13, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, i14, iMyPid, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[0])[0];
            Object[] objArr16 = {new int[]{i18}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i19 = 81708591 + (((~((-490710823) | startUptimeMillis)) | 269713444 | (~((-278108397) | startUptimeMillis))) * (-754));
            int i20 = ~((-269713445) | startUptimeMillis);
            int i21 = ~startUptimeMillis;
            int i22 = i17 + i19 + ((i20 | (~((-8394953) | i21))) * (-754)) + ((i21 | (-490710823)) * 754);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr16[3])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i25 = b + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                int i26 = 2;
                int i27 = i25 % 2;
                int i28 = 0;
                while (i28 < strArr.length) {
                    int i29 = b + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                    if (i29 % i26 == 0) {
                        arrayList.add(strArr[i28]);
                        i28 += 126;
                    } else {
                        arrayList.add(strArr[i28]);
                        i28++;
                    }
                    i26 = 2;
                }
            }
            int[] iArr = new int[i16];
            int i30 = i16 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i30) % 2) - 1], 1).show();
            int i31 = ((int[]) objArr[3])[0];
            int i32 = ((int[]) objArr[0])[0];
            Object[] objArr17 = {new int[]{i32}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i33 = (-1534139455) + ((~(iIdentityHashCode2 | 708723118)) * 216);
            int i34 = ~iIdentityHashCode2;
            int i35 = i31 + i33 + ((1069446142 | i34) * (-216)) + (((~(i34 | 708723118)) | (-496120693)) * 216);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr17[3])[0] = i37 ^ (i37 << 5);
            int i38 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
            int i39 = i38 % 2;
        }
        return true;
    }

    public FocusMeteringActionBuilder(BitmapPool bitmapPool) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bitmapPool;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            byte[] r0 = defpackage.FocusMeteringActionBuilder.$$c
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 * 2
            int r8 = 107 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FocusMeteringActionBuilder.$$e(int, int, byte):java.lang.String");
    }
}
