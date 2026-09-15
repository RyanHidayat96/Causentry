package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class isInitialized implements traceExecutionState {
    private final File TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private getInputSize b;
    private static final byte[] $$d = {104, 27, -72, 120, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 73, -3, -16, 1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 128;
    private static final byte[] $$a = {2, -84, 82, -15, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 187;
    private final getInitializeFuture TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getInitializeFuture();
    private final lambdainitInternal0androidxcameracoreCameraX TuitionPaymentFragmentbindingInflater1 = new lambdainitInternal0androidxcameracoreCameraX();

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.isInitialized.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r1 = 53 - r6
            int r8 = r8 * 52
            int r8 = 55 - r8
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isInitialized.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r8 = r8 * 5
            int r0 = 53 - r8
            int r6 = r6 * 47
            int r6 = r6 + 4
            byte[] r1 = defpackage.isInitialized.$$d
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + 3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isInitialized.c(int, byte, int, java.lang.Object[]):void");
    }

    @Deprecated
    isInitialized(File file, long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
    }

    private getInputSize b() throws IOException {
        getInputSize getinputsize;
        synchronized (this) {
            if (this.b == null) {
                this.b = getInputSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            getinputsize = this.b;
        }
        return getinputsize;
    }

    @Override // defpackage.traceExecutionState
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCameraControl getcameracontrol) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcameracontrol);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(getcameracontrol);
        }
        try {
            getInputSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2B = b().b(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2B != null) {
                return tuitionPaymentFragmentspecialinlinedviewModeldefault2B.b[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v53, types: [boolean, int] */
    @Override // defpackage.traceExecutionState
    public final void b(getCameraControl getcameracontrol, traceExecutionState.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        getInitializeFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1;
        Object[] objArr;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcameracontrol);
        getInitializeFuture getinitializefuture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (getinitializefuture) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 = getinitializefuture.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 == null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 = getinitializefuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                getinitializefuture.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1);
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1.b.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(getcameracontrol);
            }
            try {
                getInputSize getinputsizeB = b();
                if (getinputsizeB.b(strTuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
                    getInputSize.b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getinputsizeB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                        StringBuilder sb = new StringBuilder("Had two simultaneous puts for: ");
                        sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        throw new IllegalStateException(sb.toString());
                    }
                    try {
                        if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                            getInputSize.b(getInputSize.this, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                                int trimmedLength = TextUtils.getTrimmedLength("") + 921;
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                                byte b = $$a[37];
                                Object[] objArr2 = new Object[1];
                                a((byte) 52, b, b, objArr2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, trimmedLength, capsMode, -1048449946, false, (String) objArr2[0], null);
                            }
                            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cAlpha = (char) (31533 - Color.alpha(0));
                                int iMyTid = (Process.myTid() >> 22) + 921;
                                int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte[] bArr = $$a;
                                byte b2 = bArr[80];
                                Object[] objArr3 = new Object[1];
                                a(b2, b2, bArr[37], objArr3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iMyTid, keyRepeatDelay, -778300370, false, (String) objArr3[0], null);
                            }
                            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                                    int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                                    byte[] bArr2 = $$a;
                                    byte b3 = bArr2[33];
                                    byte b4 = bArr2[80];
                                    Object[] objArr4 = new Object[1];
                                    a(b3, b4, b4, objArr4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iKeyCodeFromString, modifierMetaStateMask, -1142834547, false, (String) objArr4[0], null);
                                }
                                Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                objArr = new Object[]{new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
                                int iNextInt = new Random().nextInt();
                                int i = (~((-1068900724) | iNextInt)) | 704651552;
                                int i2 = (-1996094901) + (i * 992) + ((i | (~((~iNextInt) | 1069428091))) * (-496)) + ((iNextInt | 705178920) * 496) + 646558680;
                                int i3 = (i2 << 13) ^ i2;
                                int i4 = i3 ^ (i3 >>> 17);
                                ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
                            } else {
                                Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                                if (applicationContext != null) {
                                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                                }
                                try {
                                    Object[] objArr6 = {applicationContext, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2)).intValue()), 0, 646558680};
                                    byte[] bArr3 = $$d;
                                    byte b5 = bArr3[50];
                                    byte b6 = (byte) (b5 - 1);
                                    Object[] objArr7 = new Object[1];
                                    c(b6, b6, b5, objArr7);
                                    Class<?> cls = Class.forName((String) objArr7[0]);
                                    byte b7 = bArr3[50];
                                    byte b8 = b7;
                                    Object[] objArr8 = new Object[1];
                                    c(b7, b8, (byte) (b8 - 1), objArr8);
                                    objArr = (Object[]) cls.getMethod((String) objArr8[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                                        int i5 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        byte[] bArr4 = $$a;
                                        byte b9 = bArr4[33];
                                        byte b10 = bArr4[80];
                                        Object[] objArr9 = new Object[1];
                                        a(b9, b10, b10, objArr9);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf, i5, -1142834547, false, (String) objArr9[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                    try {
                                        long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                                            int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                                            byte[] bArr5 = $$a;
                                            byte b11 = bArr5[80];
                                            Object[] objArr10 = new Object[1];
                                            a(b11, b11, bArr5[37], objArr10);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, iLastIndexOf2, scrollBarSize, -778300370, false, (String) objArr10[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                                            int iIndexOf = TextUtils.indexOf("", "") + 921;
                                            int iAlpha = Color.alpha(0) + 28;
                                            byte b12 = $$a[37];
                                            Object[] objArr11 = new Object[1];
                                            a((byte) 52, b12, b12, objArr11);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, iAlpha, -1048449946, false, (String) objArr11[0], null);
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
                            if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
                                int i6 = ((int[]) objArr[0])[0];
                                Object[] objArr12 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i7 = i6 + (-398041160) + (((~((-547092765) | iIdentityHashCode)) | 151836) * 345) + (((~((-547092765) | (~iIdentityHashCode))) | 1226835043) * 345) + ((~(iIdentityHashCode | (-151837))) * 345);
                                int i8 = (i7 << 13) ^ i7;
                                int i9 = i8 ^ (i8 >>> 17);
                                Object obj = objArr12[0];
                                ((int[]) obj)[0] = i9 ^ (i9 << 5);
                                int i10 = ((int[]) obj)[0];
                                int i11 = i10 * i10;
                                int i12 = -(780021806 * i10);
                                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                                int i14 = -(i10 * 1936589832);
                                int i15 = (i13 & i14) + (i14 | i13);
                                int i16 = (i15 ^ 244154073) + ((244154073 & i15) << 1);
                                int i17 = i16 >> 18;
                                int i18 = ((i17 & (-32767)) + (i17 | (-32767))) / 16384;
                                int i19 = -(((i16 - (~(((i18 | 1) << 1) - (i18 ^ 1)))) - 1) ^ ((((i16 >> 19) - 16383) / 8192) + 1));
                                int i20 = ((i19 | 2) << 1) - (i19 ^ 2);
                                int i21 = i20 >> 16;
                                int i22 = (((-131071) & i21) + (i21 | (-131071))) / 65536;
                                int i23 = (i22 & 1) + (i22 | 1);
                                bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = 2198 / (((-((i23 & 1) + (i23 | 1))) & i20) * 1099);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                String[] strArr = (String[]) objArr[4];
                                if (strArr != null) {
                                    for (String str : strArr) {
                                        arrayList.add(str);
                                    }
                                }
                                throw new NullPointerException();
                            }
                        }
                        if (!bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
                            bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                        }
                    } catch (Throwable th2) {
                        if (!bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
                            try {
                                bVarTuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused3) {
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } catch (Throwable th3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            throw th3;
        }
    }
}
