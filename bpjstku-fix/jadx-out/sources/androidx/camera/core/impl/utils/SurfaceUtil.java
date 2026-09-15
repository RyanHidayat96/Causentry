package androidx.camera.core.impl.utils;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public class SurfaceUtil {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    public static final String JNI_LIB_NAME = "surface_util_jni";
    private static final String TAG = "SurfaceUtil";

    public static class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    private static void a(short s, int i, byte b, Object[] objArr) {
        int i2 = 106 - b;
        byte[] bArr = $$a;
        int i3 = 108 - i;
        byte[] bArr2 = new byte[21 - s];
        int i4 = 20 - s;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + i4) - 5;
        }
        while (true) {
            int i6 = i2;
            int i7 = i3;
            i5++;
            bArr2[i5] = (byte) i7;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                i3 = (i7 + bArr[i6]) - 5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = androidx.camera.core.impl.utils.SurfaceUtil.$$d
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 4
            int r6 = r6 + 84
            int r7 = r7 * 2
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L34
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L34:
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.SurfaceUtil.b(byte, short, byte, java.lang.Object[]):void");
    }

    public static native int[] nativeGetSurfaceInfo(Surface surface);

    static {
        byte[] bArr = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        $$d = bArr;
        $$e = 113;
        $$a = new byte[]{111, 40, 23, -13, 2, 5, -37, 1, 55, -4, 26, -16, -46, 67, -6, 18, -2, -52, 41, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, 20, -29, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, 3, 20, -44, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, -68};
        $$b = 15;
        byte b = (byte) 15;
        Object[] objArr = new Object[1];
        a(b, (byte) (b >>> 1), (byte) 102, objArr);
        String str = (String) objArr[0];
        ClassLoader classLoader = SurfaceUtil.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.getDefaultSize(0, 0) + 3414), 1559 - KeyEvent.normalizeMetaState(0), 'H' - AndroidCharacter.getMirror('0'), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {str, classLoader, false, 869877492, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 869877492};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
                int i = 3112 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iMyPid = (Process.myPid() >> 22) + 22;
                byte b2 = (byte) (bArr[37] - 1);
                byte b3 = b2;
                Object[] objArr4 = new Object[1];
                b(b2, b3, b3, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i, iMyPid, -675216362, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 519, Gravity.getAbsoluteGravity(0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i2 = ((int[]) objArr5[1])[0];
            int i3 = ((int[]) objArr5[2])[0];
            if (i3 == i2) {
                int i4 = ((int[]) objArr5[0])[0];
                int i5 = ((int[]) objArr5[2])[0];
                int i6 = ((int[]) objArr5[1])[0];
                String[] strArr = (String[]) objArr5[3];
                int[] iArr = {i5};
                int iMyTid = Process.myTid();
                int i7 = ~iMyTid;
                int i8 = i4 + 1567592858 + ((iMyTid | 1540151752) * 140) + (((~(1540151752 | i7)) | 1246226) * (-280)) + (((~(iMyTid | (-1246227))) | (~(164879706 | i7)) | 1376518272) * 140);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                Object[] objArr6 = {new int[1], new int[]{i6}, iArr, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr5[3];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        arrayList.add(str2);
                    }
                }
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                int i11 = ((int[]) objArr5[0])[0];
                int i12 = ((int[]) objArr5[2])[0];
                int i13 = ((int[]) objArr5[1])[0];
                String[] strArr3 = (String[]) objArr5[3];
                int i14 = ~((int) Process.getStartElapsedRealtime());
                int i15 = ~(293225493 | i14);
                int i16 = i11 + 1225076790 + ((i15 | 1411805965) * 764) + (((~(i14 | 1411805965)) | 22545424) * (-1528)) + ((1163671320 | i15) * 764);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                Object[] objArr7 = {new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                byte[] bArr2 = $$a;
                Object[] objArr8 = new Object[1];
                a((byte) (-bArr2[9]), bArr2[4], (byte) 97, objArr8);
                Class<?> cls = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                a((byte) (bArr2[7] - 1), bArr2[4], (byte) 81, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                a(bArr2[5], bArr2[4], (byte) 61, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                a(bArr2[21], bArr2[5], bArr2[35], objArr11);
                Object objInvoke = cls.getMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0]);
                Object[] objArr12 = new Object[1];
                a(bArr2[43], bArr2[4], (byte) (-bArr2[6]), objArr12);
                Class<?> cls4 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                a((byte) ($$b >>> 1), bArr2[5], bArr2[2], objArr13);
                Object objInvoke2 = cls4.getMethod((String) objArr13[0], new Class[0]).invoke(SurfaceUtil.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    byte b4 = bArr2[58];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    a(b4, (byte) (bArr2[7] - 1), b5, objArr14);
                    Method declaredMethod = cls.getDeclaredMethod((String) objArr14[0], cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, str, objInvoke2);
                    return;
                }
                byte b6 = bArr2[23];
                byte b7 = (byte) (bArr2[7] - 1);
                Object[] objArr15 = new Object[1];
                a(b6, b7, b7, objArr15);
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

    private SurfaceUtil() {
    }

    public static SurfaceInfo getSurfaceInfo(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.format = iArrNativeGetSurfaceInfo[0];
        surfaceInfo.width = iArrNativeGetSurfaceInfo[1];
        surfaceInfo.height = iArrNativeGetSurfaceInfo[2];
        return surfaceInfo;
    }
}
