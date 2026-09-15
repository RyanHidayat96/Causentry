package com.google.android.gms.measurement.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.point.PointDataStore;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgu extends zzjf {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzgs zzd;
    private final zzgs zze;
    private final zzgs zzf;
    private final zzgs zzg;
    private final zzgs zzh;
    private final zzgs zzi;
    private final zzgs zzj;
    private final zzgs zzk;
    private final zzgs zzl;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$d = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -59, 10, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 240;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = -6377398940819159759L;
    private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 63867;

    zzgu(zzic zzicVar) {
        super(zzicVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgs(this, 6, false, false);
        this.zze = new zzgs(this, 6, true, false);
        this.zzf = new zzgs(this, 6, false, true);
        this.zzg = new zzgs(this, 5, false, false);
        this.zzh = new zzgs(this, 5, true, false);
        this.zzi = new zzgs(this, 5, false, true);
        this.zzj = new zzgs(this, 4, false, false);
        this.zzk = new zzgs(this, 3, false, false);
        this.zzl = new zzgs(this, 2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r6 = 144 - r6
            int r0 = 53 - r7
            byte[] r1 = com.google.android.gms.measurement.internal.zzgu.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgu.a(int, int, short, java.lang.Object[]):void");
    }

    protected final String zzn() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzu.zzc().zzb();
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    static String zzq(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            String strSubstring = str.substring(0, iLastIndexOf);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return strSubstring;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i4 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        int i7 = i4 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }

    protected final void zzm(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        if ((!z) && Log.isLoggable(zzn(), i)) {
            Log.println(i, zzn(), zzo(false, str, obj, obj2, obj3));
        }
        if (!z2) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            if (i >= 5) {
                Preconditions.checkNotNull(str);
                zzhz zzhzVarZzi = this.zzu.zzi();
                if (zzhzVarZzi == null) {
                    Log.println(6, zzn(), "Scheduler not set. Not logging error/warn");
                    return;
                }
                if (!zzhzVarZzi.zzv()) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        Log.println(15, zzn(), "Scheduler not initialized. Not logging error/warn");
                        return;
                    } else {
                        Log.println(6, zzn(), "Scheduler not initialized. Not logging error/warn");
                        return;
                    }
                }
                if (i >= 9) {
                    i = 8;
                }
                zzhzVarZzi.zzj(new zzgr(this, i, str, obj, obj2, obj3));
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
    }

    static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        String strZzp = zzp(z, obj);
        String strZzp2 = zzp(z, obj2);
        String strZzp3 = zzp(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZzp)) {
            sb.append(str2);
            sb.append(strZzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZzp2);
        }
        if (!TextUtils.isEmpty(strZzp3)) {
            sb.append(str3);
            sb.append(strZzp3);
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
        }
        return sb.toString();
    }

    static String zzp(boolean z, Object obj) {
        String className;
        int i = 2 % 2;
        if (obj == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        Object obj2 = null;
        if (!(!(obj instanceof Long))) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            int i5 = i4 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
            int i6 = i4 % 2;
            if (!z) {
                int i7 = i5 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                if (i7 % 2 != 0) {
                    return obj.toString();
                }
                obj.toString();
                obj2.hashCode();
                throw null;
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (!(!(obj instanceof Boolean))) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof zzgt) {
                return ((zzgt) obj).zza();
            }
            if (!z) {
                return obj.toString();
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return "-";
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strZzq = zzq(zzic.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(strZzq)) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                if (i10 % 2 != 0) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                sb2.append(": ");
                sb2.append(stackTraceElement);
                throw null;
            }
        }
        return sb2.toString();
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i3 = $10 + 27;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $11 + 89;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 8328), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1235, Color.green(0) + 35, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2764 - (ViewConfiguration.getEdgeSlop() >> 16), 13 - TextUtils.lastIndexOf("", '0', 0), 1504416861, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43324), 254 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 65200), (ViewConfiguration.getTouchSlop() >> 8) + 2891, 17 - TextUtils.indexOf("", "", 0), 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i7 = $10 + 33;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final zzgs zzd() throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
            int i3 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr2 = new Object[1];
            a((short) 141, (byte) 15, $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iIndexOf, i3, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{46797, 42843, 43511, 4372}, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionType(0L), new char[]{23314, 20585, 33265, 16952, 16331, 230, 25916, 8264, 737, 13520, 6098, 62876, 59611, 6074, 28970, 5858, 34457, 48895, 29395, 63164, 65203, 25837}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{23665, 37096, 40104, 12190}, (char) (40604 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-1466898341) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{52044, 28392, 27293, 11946, 55141, 35703, 28245, 38130, 10667, 16106, 3638, 64541, 30666, 24740, 42586}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((short) 104, bArr[7], bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollDefaultDelay, fadingEdgeLength, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                int mode = 23 - View.MeasureSpec.getMode(0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((short) 52, bArr2[7], bArr2[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatTimeout, mode, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{i4}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((1373915064 + (((-579430662) | iIdentityHashCode) * (-381))) + (((~((~iIdentityHashCode) | (-653094158))) | 359929418) * 381)) - 1325117432;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{57666, 43577, 22224, 30690}, (char) (Gravity.getAbsoluteGravity(0, 0) + 57942), (-1) - Process.getGidForName(""), new char[]{7041, 44441, 17532, 46958, 58151, 12151, 59034, 44197, 46444, 39503, 9319, 40754, 6818, 13365, 29219, 43270}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{13462, 37615, 6353, 12517}, (char) (58647 - ExpandableListView.getPackedPositionChild(0L)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{1729, 21304, 24607, 64180, 36262, 46632, 28334, 10956, 52708, 40426, 28230, 57098, 30840, 14619, 39031, 53582}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1776093721};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 42050), 1726 - TextUtils.indexOf("", "", 0), 29 - (ViewConfiguration.getTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1250100119, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) (Color.blue(0) + 29944);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                    int i8 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr11 = new Object[1];
                    a((short) 52, bArr3[7], bArr3[5], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, iMakeMeasureSpec, i8, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{46797, 42843, 43511, 4372}, (char) (KeyEvent.getMaxKeyCode() >> 16), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), new char[]{23314, 20585, 33265, 16952, 16331, 230, 25916, 8264, 737, 13520, 6098, 62876, 59611, 6074, 28970, 5858, 34457, 48895, 29395, 63164, 65203, 25837}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{23665, 37096, 40104, 12190}, (char) (40604 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) - 1466898340, new char[]{52044, 28392, 27293, 11946, 55141, 35703, 28245, 38130, 10667, 16106, 3638, 64541, 30666, 24740, 42586}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                        int iAlpha = Color.alpha(0) + 1755;
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((short) 104, bArr4[7], bArr4[5], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iAlpha, iMakeMeasureSpec2, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                        int i10 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Object[] objArr15 = new Object[1];
                        a((short) 141, (byte) 15, $$a[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyTid, i9, i10, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                    int i12 = i11 % 2;
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                    if (i13 % 2 == 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 40;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        Object[] objArr16 = {new int[]{i15}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = (-2089561447) + (((~(801029443 | iIdentityHashCode2)) | (-588427018)) * 672);
        int i17 = ~iIdentityHashCode2;
        int i18 = i14 + i16 + (((~(iIdentityHashCode2 | (-588427018))) | (~((-801029444) | i17))) * (-672)) + (((~(588427017 | i17)) | (-801029964)) * 672);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
            byte[] bArr5 = $$a;
            Object[] objArr17 = new Object[1];
            a((short) 104, bArr5[7], bArr5[5], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, edgeSlop, keyRepeatDelay, -459846511, false, (String) objArr17[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr18 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{46797, 42843, 43511, 4372}, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{23314, 20585, 33265, 16952, 16331, 230, 25916, 8264, 737, 13520, 6098, 62876, 59611, 6074, 28970, 5858, 34457, 48895, 29395, 63164, 65203, 25837}, objArr18);
        Class<?> cls4 = Class.forName((String) objArr18[0]);
        Object[] objArr19 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{23665, 37096, 40104, 12190}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40603), Color.green(0) - 1466898340, new char[]{52044, 28392, 27293, 11946, 55141, 35703, 28245, 38130, 10667, 16106, 3638, 64541, 30666, 24740, 42586}, objArr19);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iArgb = Color.argb(0, 0, 0, 0) + 651;
            int iMyTid = 44 - (Process.myTid() >> 22);
            byte b2 = $$a[7];
            short s = b2;
            Object[] objArr20 = new Object[1];
            a(s, (byte) (s | 52), b2, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iArgb, iMyTid, -873460649, false, (String) objArr20[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651;
                int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr21 = new Object[1];
                a((short) 141, (byte) 15, $$a[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(capsMode, minimumFlingVelocity, pressedStateDuration, -1595579076, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i23 = ((int[]) objArr22[2])[0];
            int i24 = ((int[]) objArr22[0])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode3;
            int i26 = ((((-30627000) + (((~((-349430632) | i25)) | (-345999822)) * (-602))) + ((((~(iIdentityHashCode3 | (-349430632))) | 4219426) | (~((-788617) | i25))) * (-301))) + ((~(i25 | (-345999822))) * 301)) - 7967107;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr[3])[0] = i28 ^ (i28 << 5);
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 1610 - TextUtils.getTrimmedLength(""), 26 - Color.alpha(0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr23 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(null), -7967107, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int i29 = 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int maximumDrawingCacheSize = 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b3 = $$a[7];
                short s2 = b3;
                Object[] objArr24 = new Object[1];
                a(s2, (byte) (s2 | 52), b3, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, i29, maximumDrawingCacheSize, 2075921419, false, (String) objArr24[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 694 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.lastIndexOf("", '0', 0, 0) + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63406), (ViewConfiguration.getTouchSlop() >> 8) + 793, TextUtils.getOffsetBefore("", 0) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c5 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 651;
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                Object[] objArr25 = new Object[1];
                a((short) 141, (byte) 15, $$a[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c5, capsMode2, windowTouchSlop, -1595579076, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{46797, 42843, 43511, 4372}, (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetAfter("", 0), new char[]{23314, 20585, 33265, 16952, 16331, 230, 25916, 8264, 737, 13520, 6098, 62876, 59611, 6074, 28970, 5858, 34457, 48895, 29395, 63164, 65203, 25837}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{23665, 37096, 40104, 12190}, (char) (40604 - TextUtils.indexOf("", "", 0, 0)), Gravity.getAbsoluteGravity(0, 0) - 1466898340, new char[]{52044, 28392, 27293, 11946, 55141, 35703, 28245, 38130, 10667, 16106, 3638, 64541, 30666, 24740, 42586}, objArr27);
                long jLongValue4 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c6 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int iGreen = 651 - Color.green(0);
                    int iCombineMeasuredStates = 44 - View.combineMeasuredStates(0, 0);
                    byte b4 = $$a[7];
                    short s3 = b4;
                    Object[] objArr28 = new Object[1];
                    a(s3, (byte) (s3 | 52), b4, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c6, iGreen, iCombineMeasuredStates, -873460649, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iMakeMeasureSpec3 = 651 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i30 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44;
                    byte[] bArr6 = $$a;
                    Object[] objArr29 = new Object[1];
                    a((short) 104, bArr6[7], bArr6[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(doubleTapTimeout, iMakeMeasureSpec3, i30, -459846511, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
            Object[] objArr30 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i31 = ((int[]) objArr[3])[0];
            int i32 = ((int[]) objArr[2])[0];
            int i33 = ((int[]) objArr[0])[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode4;
            int i35 = i31 + (-1153956197) + (((~(137070338 | i34)) | (-142600095)) * 98) + (((~(i34 | (-140501149))) | 137070338 | (~(140501148 | iIdentityHashCode4))) * (-49)) + (((~(iIdentityHashCode4 | 137070338)) | 2098946) * 49);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr30[3])[0] = i37 ^ (i37 << 5);
            zzgs zzgsVar = this.zzf;
            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
            int i39 = i38 % 2;
            return zzgsVar;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr2 = (String[]) objArr[1];
        if (strArr2 != null) {
            int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i40 % 128;
            int i41 = 2;
            int i42 = i40 % 2;
            while (i2 < strArr2.length) {
                int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
                int i44 = i43 % i41;
                arrayList2.add(strArr2[i2]);
                i2++;
                i41 = 2;
            }
        }
        throw null;
    }

    protected static Object zzl(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            return null;
        }
        zzgt zzgtVar = new zzgt(str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzgtVar;
        }
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    protected final boolean zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final zzgs zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        zzgs zzgsVar = this.zzd;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return zzgsVar;
    }

    public final zzgs zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zze;
        }
        throw null;
    }

    public final zzgs zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        zzgs zzgsVar = this.zzg;
        int i5 = i3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return zzgsVar;
    }

    public final zzgs zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzgs zzgsVar = this.zzh;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return zzgsVar;
    }

    public final zzgs zzh() {
        zzgs zzgsVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            zzgsVar = this.zzi;
            int i4 = 85 / 0;
        } else {
            zzgsVar = this.zzi;
        }
        int i5 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return zzgsVar;
    }

    public final zzgs zzi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        zzgs zzgsVar = this.zzj;
        int i4 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzgsVar;
        }
        throw null;
    }

    public final zzgs zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzk;
        }
        throw null;
    }

    public final zzgs zzk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        zzgs zzgsVar = this.zzl;
        int i4 = i2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzgsVar;
        }
        throw null;
    }

    final /* synthetic */ char zzr() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        char c = this.zza;
        int i5 = i3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzs(char c) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.zza = c;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ long zzt() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.zzb;
        int i4 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    final /* synthetic */ void zzu(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        this.zzb = 133005L;
        int i5 = i3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r1 = com.google.android.gms.measurement.internal.zzgu.$$c
            int r6 = r6 + 102
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgu.$$e(short, byte, short):java.lang.String");
    }
}
