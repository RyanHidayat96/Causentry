package id.vida.algos.luma;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes7.dex */
public class Luminance {
    private static final byte[] $$d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Luminance f1006a;
    private static final int $$e = 218;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -14, 3, 7, 4, -26, 16, 46, -67, 6, -18, 2, 52, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, 52, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, 52, -42, -38, -3, 4, -10, 2, -3, -20, 29, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, 52, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, -8, 9, -8, 19, -34, 2, -21, 12, -22, -12, 68};
    private static final int $$b = 230;

    static {
        byte[] bArr = {99, -43, -44, -62, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        $$d = bArr;
        byte b = (byte) (-1);
        byte b2 = (byte) (b + 1);
        Object[] objArr = new Object[1];
        b(b, b2, b2, objArr);
        String str = (String) objArr[0];
        ClassLoader classLoader = Luminance.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3413), (KeyEvent.getMaxKeyCode() >> 16) + 1559, 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {str, classLoader, false, -1259673291, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1259673291};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                int iIndexOf = TextUtils.indexOf("", "") + 22;
                byte b3 = bArr[7];
                byte b4 = (byte) (b3 + 1);
                Object[] objArr4 = new Object[1];
                c(b3, b4, b4, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, offsetBefore, iIndexOf, -675216362, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 518 - ((Process.getThreadPriority(0) + 20) >> 6), Color.red(0) + 76), Integer.TYPE});
            }
            Object[] objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr5[1])[0];
            int i2 = ((int[]) objArr5[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr5[0])[0];
                int i4 = ((int[]) objArr5[2])[0];
                int i5 = ((int[]) objArr5[1])[0];
                String[] strArr = (String[]) objArr5[3];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i6 = i3 + ((((-1140544862) + (((~((-1086633210) | iMaxMemory)) | 12845097) * 576)) + (((~((~iMaxMemory) | (-1073788113))) | 605553152) * 576)) - 1191158720);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                Object[] objArr6 = {new int[1], new int[]{i5}, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr5[3];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        arrayList.add(str2);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i9 = ((int[]) objArr5[0])[0];
                int i10 = ((int[]) objArr5[2])[0];
                int i11 = ((int[]) objArr5[1])[0];
                String[] strArr3 = (String[]) objArr5[3];
                int[] iArr = {i10};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i12 = ~((-176477202) | iFreeMemory);
                int i13 = ~iFreeMemory;
                int i14 = i9 + (-801915102) + ((i12 | (~(1528554257 | i13))) * (-1808)) + (((~((-167821330) | iFreeMemory)) | (~(i13 | 1537210129))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iFreeMemory | (-1528554258))) | 8655872 | (~(176477201 | i13))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                Object[] objArr7 = {new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                byte[] bArr2 = $$a;
                byte b5 = bArr2[14];
                Object[] objArr8 = new Object[1];
                b(b5, b5, (byte) (bArr2[101] + 1), objArr8);
                Class<?> cls = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b((byte) (-bArr2[13]), bArr2[14], (byte) (bArr2[9] + 1), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                b((byte) (-bArr2[53]), bArr2[14], bArr2[101], objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b((byte) (bArr2[15] + 1), (byte) (-bArr2[36]), bArr2[12], objArr11);
                Object objInvoke = cls.getMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0]);
                Object[] objArr12 = new Object[1];
                b((byte) 62, bArr2[14], (byte) (-bArr2[19]), objArr12);
                Class<?> cls4 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                b((byte) 76, (byte) (-bArr2[36]), (byte) (-bArr2[56]), objArr13);
                Object objInvoke2 = cls4.getMethod((String) objArr13[0], new Class[0]).invoke(Luminance.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Object[] objArr14 = new Object[1];
                    b((byte) (bArr2[0] + 1), (byte) 0, bArr2[6], objArr14);
                    Method declaredMethod = cls.getDeclaredMethod((String) objArr14[0], cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, str, objInvoke2);
                    return;
                }
                Object[] objArr15 = new Object[1];
                b((byte) 99, (byte) 0, (byte) (-bArr2[40]), objArr15);
                Method declaredMethod2 = cls.getDeclaredMethod((String) objArr15[0], cls2, cls3);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(objInvoke, objInvoke2, str);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } catch (Throwable th) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }

    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3 = 108 - i;
        byte[] bArr = $$a;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i2 + 4];
        int i5 = i2 + 3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (i5 + (-i4)) - 5;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = i7;
            i3 = (i3 + (-bArr[i8])) - 5;
            i4 = i8;
        }
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
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r8 = r8 * 4
            int r8 = r8 + 53
            int r6 = r6 + 4
            byte[] r0 = id.vida.algos.luma.Luminance.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: id.vida.algos.luma.Luminance.c(short, short, byte, java.lang.Object[]):void");
    }

    public static native synchronized LuminanceResult calc(Bitmap bitmap, int i);

    public static LuminanceResult calculate(Bitmap bitmap) {
        return calc(bitmap, 80);
    }

    public static Luminance getInstance() {
        Luminance luminance;
        synchronized (Luminance.class) {
            if (f1006a == null) {
                f1006a = new Luminance();
            }
            luminance = f1006a;
        }
        return luminance;
    }
}
