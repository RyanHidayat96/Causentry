package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemProgramChosenBinding;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import defpackage.EncoderImplByteBufferInput;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.getConfigs;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMeasurementService extends Service implements zznp {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int $10 = 0;
    private static int $11 = 1;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private zznt zza;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 103 - r5
            int r6 = r6 + 4
            int r0 = 53 - r7
            byte[] r1 = com.google.android.gms.measurement.AppMeasurementService.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementService.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            byte[] r1 = com.google.android.gms.measurement.AppMeasurementService.$$d
            int r6 = 586 - r6
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L1f:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L28:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-2)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementService.d(int, short, short, java.lang.Object[]):void");
    }

    private final zznt zzd() {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.zza == null) {
            this.zza = new zznt(this);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
        }
        zznt zzntVar = this.zza;
        int i6 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return zzntVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zznt zzntVarZzd = zzd();
        if (i3 != 0) {
            return zzntVarZzd.zzd(intent);
        }
        zzntVarZzd.zzd(intent);
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 119;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 4;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2624, 12 - ExpandableListView.getPackedPositionChild(0L), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.alpha(0) + 481, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 481, 37 - (Process.myTid() >> 22), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:240:0x1765  */
    @Override // android.app.Service
    public final void onCreate() throws Throwable {
        String str;
        Object[] objArr;
        String str2;
        String str3;
        Object[] objArr2;
        int i;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        String str4;
        Object[] objArr3;
        int i2;
        String str5;
        String str6;
        Object[] objArr4;
        char c;
        String str7;
        Object[] objArr5;
        int i3;
        String str8;
        Object[] objArr6;
        String str9;
        char c2;
        int i4;
        String str10;
        Object[] objArr7;
        Object[] objArr8;
        String str11;
        Object[] objArr9;
        int i5;
        int i6;
        Object[] objArr10;
        int i7 = 2 % 2;
        Object[] objArr11 = new Object[1];
        a(new char[]{49715, 4375, 25696, 48033, 36497, 56812, 12596, 1105, 23397, 44706, 64978, 53464, 9263, 31502, 20092, 40370, 61583, 51146, 6968, 28172, 48493, 37054}, 54059 - ExpandableListView.getPackedPositionType(0L), objArr11);
        char c3 = 0;
        String str12 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(new char[]{49719, 10067, 2281, 29285, 22421, 47382, 41656, 34811, 59743, 53990, 13436, 6537, 807, 25782, 18881}, 58733 - (Process.myPid() >> 22), objArr12);
        String str13 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(new char[]{49720, 16020, 15210, 14278, 12512, 11645, 10713, 10925, 9997, 9123, 7303, 6406, 5621, 5725, 4885, 4086}, 64679 - ((Process.getThreadPriority(0) + 20) >> 6), objArr13);
        String str14 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(new char[]{49723, 7769, 31465, 22385, 45978, 35856, 59580, 50466, 8546, 32212, 24183, 47871, 38693, 62366, 52260, 10422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 56395, objArr14);
        String str15 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new char[]{49715, 48677, 14852, 46699, 12889, 44614, 10912, 42707, 8955, 40643, 6872, 38767, 4927, 36724, 2936, 34636, 948, 65426, 31716, 63472, 29682, 60471, 26630, 58376, 24683, 56391}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima3).substring(12, 18).codePointAt(3) + 31659, objArr15);
        String str16 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new char[]{49713, 43206, 6114, 33411, 27059, 54361, 17248, 11828, 38186, 971, 61172, 21904, 49341, 44894, 6760, 33044, 27693, 56013}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27361, objArr16);
        String str17 = (String) objArr16[0];
        int i8 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        if (i8 != ((581977968 + (((-132458824) | (~(962446366 | startUptimeMillis))) * (-948))) + ((~((~startUptimeMillis) | (-111159618))) * (-948))) - 128777268) {
            throw null;
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        String str18 = str13;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i10 = (-1700727236) + (((~(688245153 | iUptimeMillis)) | 1890810811) * 672);
        int i11 = ~iUptimeMillis;
        if (i9 != i10 + (((~(iUptimeMillis | 1890810811)) | (~((-688245154) | i11))) * (-672)) + (((~((-1890810812) | i11)) | 1353855514) * 672)) {
            int i12 = 968007888 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
            int mirror = AndroidCharacter.getMirror('0') + 873;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[88] - 1);
            short s = bArr[7];
            Object[] objArr17 = new Object[1];
            c(b2, s, (byte) (s | 52), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, mirror, offsetBefore, -1048449946, false, (String) objArr17[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                int mode = View.MeasureSpec.getMode(0) + 921;
                int defaultSize = 28 - View.getDefaultSize(0, 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[91];
                short s2 = bArr2[7];
                Object[] objArr18 = new Object[1];
                c(b3, s2, (byte) (s2 | 15), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, mode, defaultSize, -1142834547, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            str = "";
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr19[1])[0]}, (Object[]) objArr19[2], new int[]{((int[]) objArr19[3])[0]}, (String[]) objArr19[4]};
            int iNextInt = new Random().nextInt(2010905363);
            int i13 = ~iNextInt;
            int i14 = (((81443043 + (((~((-894134231) | i13)) | 876766916) * 168)) + ((~((-876766917) | iNextInt)) * 168)) + (((~(iNextInt | (-17367315))) | ((~(i13 | (-879945414))) | 3178497)) * 168)) - 509689172;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
            str15 = str15;
        } else {
            str = "";
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str16).getMethod(str17, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str14).getMethod(str15, Object.class).invoke(null, this)).intValue();
            int i17 = b + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr20 = {baseContext, Integer.valueOf(iIntValue), 0, -509689172};
                byte[] bArr3 = $$d;
                Object[] objArr21 = new Object[1];
                d((short) 582, bArr3[1], (byte) ($$e - 4), objArr21);
                Class<?> cls = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                d((short) 544, bArr3[5], bArr3[515], objArr22);
                Object[] objArr23 = (Object[]) cls.getMethod((String) objArr22[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr20);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int i19 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                    int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr4 = $$a;
                    byte b4 = bArr4[91];
                    short s3 = bArr4[7];
                    Object[] objArr24 = new Object[1];
                    c(b4, s3, (byte) (s3 | 15), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, i19, bitsPerPixel, -1142834547, false, (String) objArr24[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr23);
                try {
                    long jLongValue = ((Long) Class.forName(str12).getDeclaredMethod(str18, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                        int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int iRed = 28 - Color.red(0);
                        byte[] bArr5 = $$a;
                        Object[] objArr25 = new Object[1];
                        c(bArr5[91], (short) 37, bArr5[7], objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, packedPositionGroup, iRed, -778300370, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int fadingEdgeLength = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int trimmedLength = TextUtils.getTrimmedLength(str) + 28;
                        byte[] bArr6 = $$a;
                        byte b5 = (byte) (bArr6[88] - 1);
                        short s4 = bArr6[7];
                        Object[] objArr26 = new Object[1];
                        c(b5, s4, (byte) (s4 | 52), objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, fadingEdgeLength, trimmedLength, -1048449946, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr23;
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
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 != i20) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str19 : strArr) {
                    arrayList.add(str19);
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i22 = ((int[]) objArr[0])[0];
        Object[] objArr27 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iNextInt2 = new Random().nextInt();
        int i23 = i22 + 1369993399 + (((~(iNextInt2 | 817650756)) | (-956428888)) * (-668)) + ((817650756 | (~((-956428888) | iNextInt2))) * 1336) + ((iNextInt2 | (-151101972)) * 668);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr27[0])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c5 = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 625;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
            byte[] bArr7 = $$a;
            byte b6 = (byte) (bArr7[88] - 1);
            short s5 = bArr7[7];
            Object[] objArr28 = new Object[1];
            c(b6, s5, (byte) (s5 | 52), objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, packedPositionGroup2, modifierMetaStateMask, -477065106, false, (String) objArr28[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str12).getDeclaredMethod(str18, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cRed = (char) (Color.red(0) + 37567);
            int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
            int iLastIndexOf = 13 - TextUtils.lastIndexOf(str, '0', 0);
            byte[] bArr8 = $$a;
            Object[] objArr29 = new Object[1];
            c(bArr8[91], (short) 89, bArr8[7], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRed, tapTimeout, iLastIndexOf, -976899241, false, (String) objArr29[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cBlue = (char) (Color.blue(0) + 37567);
                int packedPositionType2 = 625 - ExpandableListView.getPackedPositionType(0L);
                int keyRepeatDelay = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr9 = $$a;
                Object[] objArr30 = new Object[1];
                c(bArr9[91], (short) 37, bArr9[7], objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, packedPositionType2, keyRepeatDelay, -973632554, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            int i26 = ((int[]) objArr31[2])[0];
            int i27 = ((int[]) objArr31[0])[0];
            String[] strArr2 = (String[]) objArr31[3];
            int[] iArr = {i27};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_prima).substring(0, 4).codePointAt(1) - 1777797580;
            int i28 = ((((-1515036000) + (((~((-1370552023) | iCodePointAt)) | (-1538520823)) * (-502))) + ((~((~iCodePointAt) | (-1085334725))) * (-502))) + (((~(iCodePointAt | (-453186099))) | (-1370552023)) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1001483803;
            int i29 = i28 ^ (i28 << 13);
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
            objArr2 = new Object[]{iArr, new int[1], new int[]{i26}, strArr2};
            str17 = str17;
            str3 = str;
            str2 = str15;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str16).getMethod(str17, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                b = i31 % 128;
                if (i31 % 2 != 0) {
                    boolean z = baseContext2 instanceof ContextWrapper;
                    throw null;
                }
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            str2 = str15;
            int iIntValue2 = ((Integer) Class.forName(str14).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr32 = new Object[1];
            a(new char[]{49760, 59626, 38798, 17060, 26951, 5217, 49946, 61039, 38019, 17393, 28310, 5400, 49259, 61198, 39461, 16532, 28597, 6862, 49646, 60496, 39715, 17988, 27803, 7147, 50831, 60912, 38978, 18220, 29261, 6463, 51072, 62120, 39371, 17486, 29498, 7772, 50551, 62354, 40612, 17816, 28860, 7938, 51748, 61813, 40904, 19182, 29143, 7412, 52035, 63023, 40256, 18484, 30338, 7595, 51454, 63307, 41523, 18783, 29812, 8927, 51708, 62621, 41958, 20051}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_token_no).substring(0, 16).length() + 10957, objArr32);
            String str20 = (String) objArr32[0];
            Object[] objArr33 = new Object[1];
            a(new char[]{49713, 36302, 24012, 11667, 64918, 19862, 7646, 60814, 48607, 3537, 56704, 44527, 32235, 52665, 40418, 28085, 15792, 36268, 23982, 11686, 64931, 19876, 7562, 60895, 48520, 3539, 56706, 44484, 32205, 52674, 40397, 28105, 15819, 36269, 24061, 11764, 65010, 19878, 7613, 60907, 48616, 3506, 56758, 44315, 32025, 52511, 40215, 27922, 15643, 36188, 23809, 11532, 64852, 19719, 7487, 60731, 48489, 3425, 56626, 44329, 32127, 52523, 40226, 28023}, 20477 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr33);
            Object[] objArr34 = {baseContext2, new String[]{str20, (String) objArr33[0]}, Integer.valueOf(iIntValue2), 17, -1001483803};
            byte[] bArr10 = $$d;
            Object[] objArr35 = new Object[1];
            d((short) 492, bArr10[1], (byte) (-bArr10[214]), objArr35);
            Class<?> cls2 = Class.forName((String) objArr35[0]);
            Object[] objArr36 = new Object[1];
            d((short) 434, bArr10[5], bArr10[515], objArr36);
            Object[] objArr37 = (Object[]) cls2.getMethod((String) objArr36[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr34);
            int i32 = ((int[]) objArr37[0])[0];
            int i33 = ((int[]) objArr37[2])[0];
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c6 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37566);
                    int minimumFlingVelocity = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                    byte[] bArr11 = $$a;
                    Object[] objArr38 = new Object[1];
                    c(bArr11[91], (short) 37, bArr11[7], objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c6, minimumFlingVelocity, threadPriority, -973632554, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr37);
                try {
                    long jLongValue3 = ((Long) Class.forName(str12).getDeclaredMethod(str18, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char c7 = (char) (37567 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 625;
                        int mode2 = 14 - View.MeasureSpec.getMode(0);
                        byte[] bArr12 = $$a;
                        Object[] objArr39 = new Object[1];
                        c(bArr12[91], (short) 89, bArr12[7], objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c7, touchSlop, mode2, -976899241, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        str3 = str;
                        char cIndexOf = (char) (TextUtils.indexOf(str3, str3, 0, 0) + 37567);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 625;
                        int iCombineMeasuredStates = 14 - View.combineMeasuredStates(0, 0);
                        byte[] bArr13 = $$a;
                        byte b7 = (byte) (bArr13[88] - 1);
                        short s6 = bArr13[7];
                        Object[] objArr40 = new Object[1];
                        c(b7, s6, (byte) (s6 | 52), objArr40);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, touchSlop2, iCombineMeasuredStates, -477065106, false, (String) objArr40[0], null);
                    } else {
                        str3 = str;
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr37 = objArr37;
                str17 = str17;
                str3 = str;
            }
            objArr2 = objArr37;
            c3 = 0;
        }
        int i34 = ((int[]) objArr2[c3])[c3];
        int i35 = ((int[]) objArr2[2])[c3];
        if (i35 == i34) {
            Object[] objArr41 = new Object[4];
            int[] iArr2 = new int[1];
            objArr41[c3] = iArr2;
            objArr41[1] = new int[1];
            int[] iArr3 = new int[1];
            objArr41[2] = iArr3;
            int i36 = ((int[]) objArr2[1])[c3];
            int i37 = ((int[]) objArr2[2])[c3];
            int i38 = ((int[]) objArr2[c3])[c3];
            String[] strArr3 = (String[]) objArr2[3];
            iArr3[c3] = i37;
            iArr2[c3] = i38;
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i39 = i36 + 723513704 + ((~((~iUptimeMillis2) | 1743517928)) * (-116)) + ((652980392 | iUptimeMillis2) * 116) + (((~(iUptimeMillis2 | (-1170757729))) | 80220192) * 116);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr41[1])[0] = i41 ^ (i41 << 5);
            objArr41[3] = strArr3;
            i = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[3];
            if (strArr4 != null) {
                for (String str21 : strArr4) {
                    arrayList2.add(str21);
                }
            }
            int[] iArr4 = new int[i35];
            int i42 = i35 - 1;
            iArr4[i42] = 1;
            Toast.makeText((Context) null, iArr4[((i35 * i42) % 2) - 1], 1).show();
            int i43 = ((int[]) objArr2[1])[0];
            int i44 = ((int[]) objArr2[2])[0];
            int i45 = ((int[]) objArr2[0])[0];
            String[] strArr5 = (String[]) objArr2[3];
            int[] iArr5 = {i44};
            int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i47 = i43 + (-281883150) + (((~(i46 | 718071173)) | (-1810884488)) * 305) + (((~((~i46) | 718071173)) | (-1105666948)) * 305);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            i = 0;
            ((int[]) objArr[1])[0] = i49 ^ (i49 << 5);
            Object[] objArr42 = {new int[]{i45}, new int[1], iArr5, strArr5};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf(str3, '0', i, i) + 29945);
            int i50 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
            byte[] bArr14 = $$a;
            byte b8 = bArr14[91];
            short s7 = bArr14[7];
            Object[] objArr43 = new Object[1];
            c(b8, s7, (byte) (s7 | 15), objArr43);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, i50, modifierMetaStateMask2, 986134021, false, (String) objArr43[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char mirror2 = (char) (AndroidCharacter.getMirror('0') + 29896);
                int i51 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iMyPid = (Process.myPid() >> 22) + 23;
                byte[] bArr15 = $$a;
                Object[] objArr44 = new Object[1];
                c(bArr15[91], (short) 37, bArr15[7], objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(mirror2, i51, iMyPid, 1599039318, false, (String) objArr44[0], null);
            }
            Object[] objArr45 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            Object[] objArr46 = {new int[]{((int[]) objArr45[0])[0]}, new int[]{((int[]) objArr45[1])[0]}, (Object[]) objArr45[2], new int[1], (String[]) objArr45[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i52 = (-1144866607) + (((~((-53843957) | iIdentityHashCode)) | 20190788) * 336) + (((~(iIdentityHashCode | 158758469)) | (-192411638)) * (-168)) + (((~((~iIdentityHashCode) | 158758469)) | (-53843957)) * 168) + 1032850725;
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr46[3])[0] = i54 ^ (i54 << 5);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = objArr46;
            str18 = str18;
        } else {
            int iIntValue3 = ((Integer) Class.forName(str14).getMethod(str2, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr47 = {204618136};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), View.resolveSize(0, 0) + 1726, ((byte) KeyEvent.getModifierMetaStateMask()) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).newInstance(objArr47), 1032850725, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char maximumFlingVelocity = (char) (29944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                    byte[] bArr16 = $$a;
                    Object[] objArr48 = new Object[1];
                    c(bArr16[91], (short) 37, bArr16[7], objArr48);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(maximumFlingVelocity, iResolveSizeAndState, pressedStateDuration, 1599039318, false, (String) objArr48[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    long jLongValue4 = ((Long) Class.forName(str12).getDeclaredMethod(str18, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                        int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int keyRepeatDelay2 = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr17 = $$a;
                        Object[] objArr49 = new Object[1];
                        c(bArr17[91], (short) ($$b + 3), bArr17[7], objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cMakeMeasureSpec, longPressTimeout, keyRepeatDelay2, 1596667560, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str3, '0', 0) + 29945);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                        int iLastIndexOf2 = TextUtils.lastIndexOf(str3, '0') + 24;
                        byte[] bArr18 = $$a;
                        byte b9 = bArr18[91];
                        short s8 = bArr18[7];
                        Object[] objArr50 = new Object[1];
                        c(b9, s8, (byte) (s8 | 15), objArr50);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cLastIndexOf2, keyRepeatTimeout, iLastIndexOf2, 986134021, false, (String) objArr50[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr6 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr6 != null) {
                for (String str22 : strArr6) {
                    arrayList3.add(str22);
                }
            }
            throw null;
        }
        int i55 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr51 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int i56 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i57 = ~i56;
        int i58 = i55 + 1353485922 + ((190836013 | i57) * (-369)) + (((~((-22948142) | i57)) | 189654284) * (-369)) + (((~(i56 | 22948141)) | 167887872 | (~(i57 | (-1181730)))) * 369);
        int i59 = (i58 << 13) ^ i58;
        int i60 = i59 ^ (i59 >>> 17);
        ((int[]) objArr51[3])[0] = i60 ^ (i60 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char cRgb = (char) ((-16734174) - Color.rgb(0, 0, 0));
            int size = 3111 - View.MeasureSpec.getSize(0);
            int gidForName = Process.getGidForName(str3) + 23;
            byte[] bArr19 = $$a;
            Object[] objArr52 = new Object[1];
            c(bArr19[91], (short) 89, bArr19[7], objArr52);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cRgb, size, gidForName, -1272852037, false, (String) objArr52[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
            int i61 = b + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i61 % 128;
            int i62 = i61 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cIndexOf2 = (char) (43042 - TextUtils.indexOf(str3, str3));
                int mode3 = View.MeasureSpec.getMode(0) + 3111;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                byte[] bArr20 = $$a;
                byte b10 = bArr20[91];
                short s9 = bArr20[7];
                Object[] objArr53 = new Object[1];
                c(b10, s9, (byte) (s9 | 15), objArr53);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf2, mode3, deadChar, 154975793, false, (String) objArr53[0], null);
            }
            Object[] objArr54 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
            int i63 = ((int[]) objArr54[2])[0];
            int i64 = ((int[]) objArr54[1])[0];
            String[] strArr7 = (String[]) objArr54[3];
            int[] iArr6 = {i64};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i65 = (-1793361802) + ((1369387218 | iIdentityHashCode2) * 614);
            int i66 = ~iIdentityHashCode2;
            int i67 = ((i65 + ((((~((-185136105) | i66)) | 17313984) | (~(1519895354 | i66))) * (-1228))) + (((~(i66 | 1537209338)) | (~((-167822121) | i66))) * 614)) - 1291450539;
            int i68 = (i67 << 13) ^ i67;
            int i69 = i68 ^ (i68 >>> 17);
            ((int[]) objArr3[0])[0] = i69 ^ (i69 << 5);
            objArr3 = new Object[]{new int[1], iArr6, new int[]{i63}, strArr7};
            str4 = str18;
        } else {
            Object[] objArr55 = {null, Integer.valueOf(((Integer) Class.forName(str14).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -1291450539};
            short s10 = (short) ($$e | 340);
            byte[] bArr21 = $$d;
            Object[] objArr56 = new Object[1];
            d(s10, bArr21[1], (byte) 118, objArr56);
            Class<?> cls3 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            d((short) 544, bArr21[5], bArr21[515], objArr57);
            Object[] objArr58 = (Object[]) cls3.getMethod((String) objArr57[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr55);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c8 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3111;
                int iLastIndexOf3 = 21 - TextUtils.lastIndexOf(str3, '0', 0);
                byte[] bArr22 = $$a;
                byte b11 = bArr22[91];
                short s11 = bArr22[7];
                Object[] objArr59 = new Object[1];
                c(b11, s11, (byte) (s11 | 15), objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c8, maximumDrawingCacheSize, iLastIndexOf3, 154975793, false, (String) objArr59[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr58);
            try {
                str4 = str18;
                long jLongValue5 = ((Long) Class.forName(str12).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char minimumFlingVelocity2 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042);
                    int iLastIndexOf4 = 3110 - TextUtils.lastIndexOf(str3, '0');
                    int i70 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                    byte[] bArr23 = $$a;
                    Object[] objArr60 = new Object[1];
                    c(bArr23[91], (short) 37, bArr23[7], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(minimumFlingVelocity2, iLastIndexOf4, i70, -1269618118, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString(str3) + 43043);
                    int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) str3, '0', 0, 0);
                    int offsetBefore2 = 22 - TextUtils.getOffsetBefore(str3, 0);
                    byte[] bArr24 = $$a;
                    Object[] objArr61 = new Object[1];
                    c(bArr24[91], (short) 89, bArr24[7], objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cAxisFromString, iIndexOf, offsetBefore2, -1272852037, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf8);
                objArr3 = objArr58;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i71 = ((int[]) objArr3[1])[0];
        int i72 = ((int[]) objArr3[2])[0];
        if (i72 == i71) {
            int i73 = ((int[]) objArr3[0])[0];
            int i74 = ((int[]) objArr3[2])[0];
            int i75 = ((int[]) objArr3[1])[0];
            String[] strArr8 = (String[]) objArr3[3];
            int[] iArr7 = {i75};
            int i76 = (int) Runtime.getRuntime().totalMemory();
            int i77 = i73 + 129931234 + (((~((~i76) | (-33702561))) | (~(1073708769 | i76))) * (-302)) + ((~((-33702561) | i76)) * (-604)) + (((~(i76 | 1040006209)) | 408683520) * 302);
            int i78 = (i77 << 13) ^ i77;
            int i79 = i78 ^ (i78 >>> 17);
            ((int[]) objArr[0])[0] = i79 ^ (i79 << 5);
            Object[] objArr62 = {new int[1], iArr7, new int[]{i74}, strArr8};
            i2 = 0;
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArr3[3];
            if (strArr9 != null) {
                int i80 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                b = i80 % 128;
                int i81 = i80 % 2;
                for (String str23 : strArr9) {
                    arrayList4.add(str23);
                }
            }
            Toast.makeText((Context) null, i72 / (((i72 - 1) * i72) % 2), 0).show();
            int i82 = ((int[]) objArr3[0])[0];
            int i83 = ((int[]) objArr3[2])[0];
            int i84 = ((int[]) objArr3[1])[0];
            String[] strArr10 = (String[]) objArr3[3];
            int[] iArr8 = {i83};
            int[] iArr9 = {i84};
            int i85 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            int i86 = ~i85;
            int i87 = i82 + 966946146 + ((497423921 | i86) * (-757)) + ((~((-1113104577) | i85)) * 1514) + (((~(i85 | 1610528497)) | (~(i86 | (-1207607538))) | 94502961) * 757);
            int i88 = (i87 << 13) ^ i87;
            int i89 = i88 ^ (i88 >>> 17);
            i2 = 0;
            ((int[]) objArr[0])[0] = i89 ^ (i89 << 5);
            Object[] objArr63 = {new int[1], iArr9, iArr8, strArr10};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cArgb2 = (char) Color.argb(i2, i2, i2, i2);
            int maximumDrawingCacheSize2 = 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i90 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr25 = $$a;
            Object[] objArr64 = new Object[1];
            c(bArr25[91], (short) 37, bArr25[7], objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cArgb2, maximumDrawingCacheSize2, i90, -887667012, false, (String) objArr64[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str3, '0', 0, 0));
                int i91 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266;
                int scrollDefaultDelay = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr26 = $$a;
                byte b12 = bArr26[91];
                short s12 = bArr26[7];
                Object[] objArr65 = new Object[1];
                c(b12, s12, (byte) (s12 | 15), objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cIndexOf3, i91, scrollDefaultDelay, -654680577, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
            objArr4 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i92 = ((int[]) objArr66[0])[0];
            int i93 = ((int[]) objArr66[3])[0];
            String[] strArr11 = (String[]) objArr66[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i94 = (-884857683) + (((~((~iIdentityHashCode3) | (-117616644))) | (~(531888099 | iIdentityHashCode3))) * (-302)) + ((~((-117616644) | iIdentityHashCode3)) * (-604)) + (((~(iIdentityHashCode3 | 414271456)) | 137446240) * 302) + 988537205;
            int i95 = (i94 << 13) ^ i94;
            int i96 = i95 ^ (i95 >>> 17);
            ((int[]) objArr4[2])[0] = i96 ^ (i96 << 5);
            str6 = str4;
            str5 = str17;
            c = 3;
            str12 = str12;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                str5 = str17;
                baseContext3 = (Context) Class.forName(str16).getMethod(str5, new Class[0]).invoke(null, null);
            } else {
                str5 = str17;
            }
            if (baseContext3 != null) {
                int i97 = b + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i97 % 128;
                int i98 = i97 % 2;
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            Object[] objArr67 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str14).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 988537205};
            byte[] bArr27 = $$d;
            Object[] objArr68 = new Object[1];
            d((short) 264, bArr27[1], (byte) ($$e | 65), objArr68);
            Class<?> cls4 = Class.forName((String) objArr68[0]);
            Object[] objArr69 = new Object[1];
            d((short) 157, bArr27[111], bArr27[5], objArr69);
            Object[] objArr70 = (Object[]) cls4.getMethod((String) objArr69[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr67);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int iIndexOf2 = 2266 - TextUtils.indexOf((CharSequence) str3, '0', 0);
                    int iMyPid2 = (Process.myPid() >> 22) + 33;
                    byte[] bArr28 = $$a;
                    byte b13 = bArr28[91];
                    short s13 = bArr28[7];
                    Object[] objArr71 = new Object[1];
                    c(b13, s13, (byte) (s13 | 15), objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cResolveOpacity, iIndexOf2, iMyPid2, -654680577, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArr70);
                try {
                    str6 = str4;
                    long jLongValue6 = ((Long) Class.forName(str12).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                        char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str3, '0') + 1);
                        int size2 = 2267 - View.MeasureSpec.getSize(0);
                        int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 33;
                        byte[] bArr29 = $$a;
                        Object[] objArr72 = new Object[1];
                        c(bArr29[91], (short) 89, bArr29[7], objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cIndexOf4, size2, touchSlop3, -874156483, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                        char c9 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int offsetBefore3 = TextUtils.getOffsetBefore(str3, 0) + 2267;
                        int iLastIndexOf5 = 32 - TextUtils.lastIndexOf(str3, '0');
                        byte[] bArr30 = $$a;
                        Object[] objArr73 = new Object[1];
                        c(bArr30[91], (short) 37, bArr30[7], objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c9, offsetBefore3, iLastIndexOf5, -887667012, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                str12 = str12;
                objArr70 = objArr70;
                str6 = str4;
            }
            objArr4 = objArr70;
            c = 3;
        }
        int i99 = ((int[]) objArr4[c])[0];
        int i100 = ((int[]) objArr4[0])[0];
        if (i100 == i99) {
            Object[] objArr74 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i101 = ((int[]) objArr4[2])[0];
            int i102 = ((int[]) objArr4[0])[0];
            int i103 = ((int[]) objArr4[3])[0];
            String[] strArr12 = (String[]) objArr4[1];
            int i104 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i105 = i101 + ((((~((-175943289) | i104)) | 172532240) * (-283)) - 1904270317) + ((~(i104 | (-3411049))) * 283);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr74[2])[0] = i107 ^ (i107 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr4[1];
            if (strArr13 != null) {
                for (String str24 : strArr13) {
                    arrayList5.add(str24);
                }
            }
            int[] iArr10 = new int[i100];
            int i108 = i100 - 1;
            iArr10[i108] = 1;
            Toast.makeText((Context) null, iArr10[((i100 * i108) % 2) - 1], 1).show();
            Object[] objArr75 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i109 = ((int[]) objArr4[2])[0];
            int i110 = ((int[]) objArr4[0])[0];
            int i111 = ((int[]) objArr4[3])[0];
            String[] strArr14 = (String[]) objArr4[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i112 = ~iIdentityHashCode4;
            int i113 = (-1149648359) + (((~((-30604288) | i112)) | 194659) * (-1188));
            int i114 = (~(iIdentityHashCode4 | 30604287)) | 194659;
            int i115 = ~(839317603 | i112);
            int i116 = i109 + i113 + ((i114 | i115) * 594) + (((~(30604287 | i112)) | (-869727232) | i115) * 594);
            int i117 = (i116 << 13) ^ i116;
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr75[2])[0] = i118 ^ (i118 << 5);
        }
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char mirror3 = (char) (AndroidCharacter.getMirror('0') + 53845);
            int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1321;
            int i119 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35;
            byte[] bArr31 = $$a;
            byte b14 = (byte) (bArr31[88] - 1);
            short s14 = bArr31[7];
            Object[] objArr76 = new Object[1];
            c(b14, s14, (byte) (s14 | 52), objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(mirror3, modifierMetaStateMask3, i119, -1433084963, false, (String) objArr76[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char c10 = (char) (53893 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int iResolveOpacity = 1320 - Drawable.resolveOpacity(0, 0);
                int iIndexOf3 = TextUtils.indexOf(str3, str3) + 36;
                byte[] bArr32 = $$a;
                Object[] objArr77 = new Object[1];
                c(bArr32[91], (short) 37, bArr32[7], objArr77);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c10, iResolveOpacity, iIndexOf3, -1920778747, false, (String) objArr77[0], null);
            }
            Object[] objArr78 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
            objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i120 = ((int[]) objArr78[0])[0];
            int i121 = ((int[]) objArr78[3])[0];
            String[] strArr15 = (String[]) objArr78[2];
            int iNextInt3 = new Random().nextInt(1585159613);
            int i122 = (((1410641520 + (((-1099816175) | iNextInt3) * 376)) + (((~((~iNextInt3) | 136030627)) | (-1235222000)) * (-376))) + (((~(iNextInt3 | (-136030628))) | 1234597197) * 376)) - 571110905;
            int i123 = (i122 << 13) ^ i122;
            int i124 = i123 ^ (i123 >>> 17);
            ((int[]) objArr5[1])[0] = i124 ^ (i124 << 5);
            str2 = str2;
            str7 = str6;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str16).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                if (baseContext4 instanceof ContextWrapper) {
                    int i125 = b + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i125 % 128;
                    int i126 = i125 % 2;
                    if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                        baseContext4 = baseContext4.getApplicationContext();
                    } else {
                        baseContext4 = null;
                    }
                } else {
                    baseContext4 = baseContext4.getApplicationContext();
                }
            }
            int iIntValue4 = ((Integer) Class.forName(str14).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr79 = {271728612};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b((char) (47977 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1300 - (ViewConfiguration.getWindowTouchSlop() >> 8), 20 - Color.argb(0, 0, 0, 0), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr80 = {baseContext4, "com.bpjstku", -571110905, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).newInstance(objArr79), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char trimmedLength2 = (char) (53893 - TextUtils.getTrimmedLength(str3));
                int iIndexOf4 = 1319 - TextUtils.indexOf((CharSequence) str3, '0');
                int doubleTapTimeout = 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr33 = $$a;
                Object[] objArr81 = new Object[1];
                c(bArr33[91], (short) 37, bArr33[7], objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(trimmedLength2, iIndexOf4, doubleTapTimeout, 819724799, false, (String) objArr81[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57878), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1393, (ViewConfiguration.getWindowTouchSlop() >> 8) + 75), Boolean.TYPE});
            }
            Object[] objArr82 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).invoke(null, objArr80);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char fadingEdgeLength2 = (char) (53893 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int iKeyCodeFromString = 1320 - KeyEvent.keyCodeFromString(str3);
                    int iMyTid = (Process.myTid() >> 22) + 36;
                    byte[] bArr34 = $$a;
                    Object[] objArr83 = new Object[1];
                    c(bArr34[91], (short) 37, bArr34[7], objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(fadingEdgeLength2, iKeyCodeFromString, iMyTid, -1920778747, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr82);
                try {
                    str7 = str6;
                    long jLongValue7 = ((Long) Class.forName(str12).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 53893);
                        int iCombineMeasuredStates2 = 1320 - View.combineMeasuredStates(0, 0);
                        int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 36;
                        byte[] bArr35 = $$a;
                        byte b15 = bArr35[91];
                        short s15 = bArr35[7];
                        Object[] objArr84 = new Object[1];
                        c(b15, s15, (byte) (s15 | 15), objArr84);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cAlpha, iCombineMeasuredStates2, packedPositionType3, -1273706634, false, (String) objArr84[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char size3 = (char) (53893 - View.MeasureSpec.getSize(0));
                        int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 1320;
                        int fadingEdgeLength3 = 36 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr36 = $$a;
                        byte b16 = (byte) (bArr36[88] - 1);
                        short s16 = bArr36[7];
                        Object[] objArr85 = new Object[1];
                        c(b16, s16, (byte) (s16 | 52), objArr85);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(size3, packedPositionType4, fadingEdgeLength3, -1433084963, false, (String) objArr85[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                str2 = str2;
                str7 = str6;
                objArr82 = objArr82;
            }
            objArr5 = objArr82;
        }
        int i127 = ((int[]) objArr5[3])[0];
        int i128 = ((int[]) objArr5[0])[0];
        if (i128 == i127) {
            Object[] objArr86 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i129 = ((int[]) objArr5[1])[0];
            int i130 = ((int[]) objArr5[0])[0];
            int i131 = ((int[]) objArr5[3])[0];
            String[] strArr16 = (String[]) objArr5[2];
            int i132 = ~((int) Runtime.getRuntime().totalMemory());
            int i133 = ~(847038941 | i132);
            int i134 = i129 + (-1211579116) + ((i133 | 523588883) * 764) + (((~(i132 | 523588883)) | 541624524) * (-1528)) + ((759798990 | i133) * 764);
            int i135 = (i134 << 13) ^ i134;
            int i136 = i135 ^ (i135 >>> 17);
            ((int[]) objArr86[1])[0] = i136 ^ (i136 << 5);
            i3 = 0;
        } else {
            int[] iArr11 = new int[i128];
            int i137 = i128 - 1;
            iArr11[i137] = 1;
            Toast.makeText((Context) null, iArr11[((i128 * i137) % 2) - 1], 1).show();
            Object[] objArr87 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i138 = ((int[]) objArr5[1])[0];
            int i139 = ((int[]) objArr5[0])[0];
            int i140 = ((int[]) objArr5[3])[0];
            String[] strArr17 = (String[]) objArr5[2];
            int i141 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i142 = ~i141;
            int i143 = i138 + 1512867794 + ((929375621 | i142) * (-757)) + ((~((-134797419) | i141)) * 1514) + (((~(i141 | 1064173039)) | (~(i142 | (-441252204))) | 306454785) * 757);
            int i144 = (i143 << 13) ^ i143;
            int i145 = i144 ^ (i144 >>> 17);
            i3 = 0;
            ((int[]) objArr87[1])[0] = i145 ^ (i145 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(i3, i3);
            int iCombineMeasuredStates3 = 876 - View.combineMeasuredStates(i3, i3);
            int iLastIndexOf6 = TextUtils.lastIndexOf(str3, '0') + 11;
            byte[] bArr37 = $$a;
            byte b17 = bArr37[91];
            short s17 = bArr37[7];
            Object[] objArr88 = new Object[1];
            c(b17, s17, (byte) (s17 | 15), objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cMakeMeasureSpec2, iCombineMeasuredStates3, iLastIndexOf6, -1650998592, false, (String) objArr88[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str12).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
            int i146 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i147 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr38 = $$a;
            Object[] objArr89 = new Object[1];
            c(bArr38[91], (short) 37, bArr38[7], objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cResolveOpacity2, i146, i147, 2012020043, false, (String) objArr89[0], null);
        }
        if (j2 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char cResolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16778092;
                int i148 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte[] bArr39 = $$a;
                Object[] objArr90 = new Object[1];
                c(bArr39[91], (short) 89, bArr39[7], objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cResolveOpacity3, iRgb, i148, 2012931276, false, (String) objArr90[0], null);
            }
            Object[] objArr91 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
            Object[] objArr92 = {new int[]{((int[]) objArr91[0])[0]}, new int[1], new int[]{((int[]) objArr91[2])[0]}, (String[]) objArr91[3]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 241886277;
            int i149 = ~length;
            int i150 = ((((-551601278) + (((~((-394691618) | i149)) | 354381388) * (-865))) + ((~(length | 394691617)) * 865)) + (((~(354381388 | i149)) | (~(i149 | 394691617))) * 865)) - 383521432;
            int i151 = (i150 << 13) ^ i150;
            int i152 = i151 ^ (i151 >>> 17);
            ((int[]) objArr92[1])[0] = i152 ^ (i152 << 5);
            objArr6 = objArr92;
            str9 = str7;
            str8 = str2;
            c2 = 2;
            str5 = str5;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str16).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            str8 = str2;
            Object[] objArr93 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str14).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, -383521432};
            byte[] bArr40 = $$d;
            Object[] objArr94 = new Object[1];
            d((short) 157, bArr40[1], bArr40[104], objArr94);
            Class<?> cls5 = Class.forName((String) objArr94[0]);
            Object[] objArr95 = new Object[1];
            d((short) 434, bArr40[5], bArr40[515], objArr95);
            objArr6 = (Object[]) cls5.getMethod((String) objArr95[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr93);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char c11 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 876;
                    int iLastIndexOf7 = TextUtils.lastIndexOf(str3, '0', 0) + 11;
                    byte[] bArr41 = $$a;
                    Object[] objArr96 = new Object[1];
                    c(bArr41[91], (short) 89, bArr41[7], objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c11, iCombineMeasuredStates4, iLastIndexOf7, 2012931276, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr6);
                try {
                    str9 = str7;
                    long jLongValue9 = ((Long) Class.forName(str12).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                        int threadPriority2 = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr42 = $$a;
                        Object[] objArr97 = new Object[1];
                        c(bArr42[91], (short) 37, bArr42[7], objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cMyPid, iMakeMeasureSpec, threadPriority2, 2012020043, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char c12 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i153 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr43 = $$a;
                        byte b18 = bArr43[91];
                        short s18 = bArr43[7];
                        Object[] objArr98 = new Object[1];
                        c(b18, s18, (byte) (s18 | 15), objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c12, i153, windowTouchSlop, -1650998592, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr6 = objArr6;
                str5 = str5;
                str9 = str7;
            }
            c2 = 2;
        }
        int i154 = ((int[]) objArr6[c2])[0];
        int i155 = ((int[]) objArr6[0])[0];
        if (i155 == i154) {
            int i156 = ((int[]) objArr6[1])[0];
            Object[] objArr99 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i157 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i158 = ~i157;
            int i159 = i156 + (-1200049796) + (((~((-4329537) | i158)) | 44639765) * 220) + (((~(i158 | (-357716169))) | 398026397) * (-440)) + ((i157 | (-4329537)) * 220);
            int i160 = (i159 << 13) ^ i159;
            int i161 = i160 ^ (i160 >>> 17);
            i4 = 0;
            ((int[]) objArr99[1])[0] = i161 ^ (i161 << 5);
        } else {
            Toast.makeText((Context) null, i155 / (((i155 - 1) * i155) % 2), 0).show();
            int i162 = ((int[]) objArr6[1])[0];
            Object[] objArr100 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i163 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i164 = i162 + ((~(i163 | (-708267129))) * TypedValues.CycleType.TYPE_EASING) + 1347801280 + (((~((~i163) | (-708267129))) | 76030469) * TypedValues.CycleType.TYPE_EASING);
            int i165 = i164 ^ (i164 << 13);
            int i166 = i165 ^ (i165 >>> 17);
            i4 = 0;
            ((int[]) objArr100[1])[0] = i166 ^ (i166 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(i4, i4);
            int iArgb = Color.argb(i4, i4, i4, i4) + 876;
            int iCombineMeasuredStates5 = 10 - View.combineMeasuredStates(i4, i4);
            Object[] objArr101 = new Object[1];
            c($$a[88], (short) 193, (byte) 42, objArr101);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cCombineMeasuredStates, iArgb, iCombineMeasuredStates5, -1199417970, false, (String) objArr101[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str12).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iAxisFromString = MotionEvent.axisFromString(str3) + 877;
            int i167 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte b19 = $$a[14];
            Object[] objArr102 = new Object[1];
            c(b19, (short) (b19 | 200), (byte) 52, objArr102);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cResolveSizeAndState, iAxisFromString, i167, 254769921, false, (String) objArr102[0], null);
        }
        if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) str3, '0') + 1);
                int maximumDrawingCacheSize3 = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i168 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr44 = $$a;
                Object[] objArr103 = new Object[1];
                c(bArr44[88], (short) ($$b | 65), bArr44[81], objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cIndexOf5, maximumDrawingCacheSize3, i168, 1324201839, false, (String) objArr103[0], null);
            }
            Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr104[0])[0]}, new int[1], new int[]{((int[]) objArr104[2])[0]}, (String[]) objArr104[3]};
            int i169 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i170 = ~i169;
            int i171 = ((2070192700 + (((~(129750742 | i170)) | (~((-170060972) | i169))) * (-370))) + ((((~(i169 | 129750742)) | (~(i170 | (-170060972)))) | 93917780) * (-370))) - 1113773655;
            int i172 = (i171 << 13) ^ i171;
            int i173 = i172 ^ (i172 >>> 17);
            ((int[]) objArr7[1])[0] = i173 ^ (i173 << 5);
            str10 = str9;
        } else {
            Object[] objArr105 = {Integer.valueOf(((Integer) Class.forName(str14).getMethod(str8, Object.class).invoke(null, this)).intValue()), -1503613887};
            byte[] bArr45 = $$d;
            Object[] objArr106 = new Object[1];
            d((short) 88, bArr45[1], (byte) (-bArr45[82]), objArr106);
            Class<?> cls6 = Class.forName((String) objArr106[0]);
            byte b20 = bArr45[515];
            Object[] objArr107 = new Object[1];
            d(b20, bArr45[5], b20, objArr107);
            Object[] objArr108 = (Object[]) cls6.getMethod((String) objArr107[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr105);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char size4 = (char) View.MeasureSpec.getSize(0);
                int modifierMetaStateMask4 = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                int trimmedLength3 = TextUtils.getTrimmedLength(str3) + 10;
                byte[] bArr46 = $$a;
                Object[] objArr109 = new Object[1];
                c(bArr46[88], (short) ($$b | 65), bArr46[81], objArr109);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(size4, modifierMetaStateMask4, trimmedLength3, 1324201839, false, (String) objArr109[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr108);
            try {
                str10 = str9;
                long jLongValue11 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i174 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                    int iAlpha = 10 - Color.alpha(0);
                    byte b21 = $$a[14];
                    Object[] objArr110 = new Object[1];
                    c(b21, (short) (b21 | 200), (byte) 52, objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(scrollBarSize2, i174, iAlpha, 254769921, false, (String) objArr110[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 877;
                    int i175 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                    Object[] objArr111 = new Object[1];
                    c($$a[88], (short) 193, (byte) 42, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cMakeMeasureSpec3, bitsPerPixel2, i175, -1199417970, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf16);
                objArr7 = objArr108;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i176 = ((int[]) objArr7[2])[0];
        int i177 = ((int[]) objArr7[0])[0];
        if (i177 != i176) {
            int i178 = 0;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr18 = (String[]) objArr7[3];
            if (strArr18 != null) {
                int i179 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                b = i179 % 128;
                int i180 = 2;
                int i181 = i179 % 2;
                while (i178 < strArr18.length) {
                    int i182 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    b = i182 % 128;
                    if (i182 % i180 != 0) {
                        arrayList6.add(strArr18[i178]);
                        i178 += 101;
                    } else {
                        arrayList6.add(strArr18[i178]);
                        i178++;
                    }
                    i180 = 2;
                }
            }
            throw new RuntimeException(String.valueOf(i177));
        }
        int i183 = ((int[]) objArr7[1])[0];
        Object[] objArr112 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
        int i184 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        int i185 = i183 + ((((-875256932) + (((~i184) | 276825569) * 1324)) + (((~(i184 | (-779743247))) | (~(820053475 | i184))) * (-1324))) - 529266036);
        int i186 = (i185 << 13) ^ i185;
        int i187 = i186 ^ (i186 >>> 17);
        ((int[]) objArr112[1])[0] = i187 ^ (i187 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
            char maximumDrawingCacheSize4 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str3) + 876;
            int iIndexOf5 = 10 - TextUtils.indexOf(str3, str3, 0, 0);
            byte[] bArr47 = $$a;
            byte b22 = (byte) (bArr47[88] - 1);
            short s19 = bArr47[7];
            Object[] objArr113 = new Object[1];
            c(b22, s19, (byte) (s19 | 52), objArr113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(maximumDrawingCacheSize4, iKeyCodeFromString2, iIndexOf5, 252381699, false, (String) objArr113[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
            char c13 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iResolveSize = 876 - View.resolveSize(0, 0);
            int iMyPid3 = (Process.myPid() >> 22) + 10;
            byte[] bArr48 = $$a;
            Object[] objArr114 = new Object[1];
            c(bArr48[91], (short) ($$b + 3), bArr48[7], objArr114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c13, iResolveSize, iMyPid3, 2009631821, false, (String) objArr114[0], null);
        }
        if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char modifierMetaStateMask5 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int doubleTapTimeout2 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                byte b23 = $$a[7];
                short s20 = (short) (b23 | 210);
                Object[] objArr115 = new Object[1];
                c(b23, s20, (byte) (s20 >>> 2), objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(modifierMetaStateMask5, doubleTapTimeout2, edgeSlop, 256017550, false, (String) objArr115[0], null);
            }
            Object[] objArr116 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr116[0])[0]}, new int[1], new int[]{((int[]) objArr116[2])[0]}, (String[]) objArr116[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i188 = 326794788 + (((~((-966038615) | iElapsedRealtime)) | 925728385) * (-318));
            int i189 = ~(925728385 | iElapsedRealtime);
            int i190 = ~iElapsedRealtime;
            int i191 = i188 + ((i189 | (~((-103377538) | i190))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iElapsedRealtime | (-103377538))) | (~(1069416151 | i190))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1220928081;
            int i192 = (i191 << 13) ^ i191;
            int i193 = i192 ^ (i192 >>> 17);
            ((int[]) objArr8[1])[0] = i193 ^ (i193 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str16).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr117 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str14).getMethod(str8, Object.class).invoke(null, this)).intValue()), 1220928081};
            byte[] bArr49 = $$d;
            Object[] objArr118 = new Object[1];
            d(bArr49[5], bArr49[1], (byte) (-bArr49[105]), objArr118);
            Class<?> cls7 = Class.forName((String) objArr118[0]);
            Object[] objArr119 = new Object[1];
            d((short) 434, bArr49[5], bArr49[515], objArr119);
            objArr8 = (Object[]) cls7.getMethod((String) objArr119[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr117);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char offsetBefore4 = (char) TextUtils.getOffsetBefore(str3, 0);
                    int iRgb2 = Color.rgb(0, 0, 0) + 16778092;
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                    byte b24 = $$a[7];
                    short s21 = (short) (b24 | 210);
                    Object[] objArr120 = new Object[1];
                    c(b24, s21, (byte) (s21 >>> 2), objArr120);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(offsetBefore4, iRgb2, threadPriority3, 256017550, false, (String) objArr120[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, objArr8);
                try {
                    long jLongValue13 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char c14 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int trimmedLength4 = 876 - TextUtils.getTrimmedLength(str3);
                        int iGreen = Color.green(0) + 10;
                        byte[] bArr50 = $$a;
                        Object[] objArr121 = new Object[1];
                        c(bArr50[91], (short) ($$b + 3), bArr50[7], objArr121);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c14, trimmedLength4, iGreen, 2009631821, false, (String) objArr121[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                        char cLastIndexOf3 = (char) (TextUtils.lastIndexOf(str3, '0', 0) + 1);
                        int iLastIndexOf8 = 875 - TextUtils.lastIndexOf(str3, '0', 0, 0);
                        int i194 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                        byte[] bArr51 = $$a;
                        byte b25 = (byte) (bArr51[88] - 1);
                        short s22 = bArr51[7];
                        Object[] objArr122 = new Object[1];
                        c(b25, s22, (byte) (s22 | 52), objArr122);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cLastIndexOf3, iLastIndexOf8, i194, 252381699, false, (String) objArr122[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
        }
        int i195 = ((int[]) objArr8[2])[0];
        int i196 = ((int[]) objArr8[0])[0];
        if (i196 == i195) {
            int i197 = ((int[]) objArr8[1])[0];
            Object[] objArr123 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            str11 = "currentApplication";
            int i198 = (~((Context) Class.forName("android.app.ActivityThread").getMethod(str11, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels) | 590241425;
            int i199 = i197 + (-404452396) + (i198 * 495) + (((~i198) | 52958721) * 495);
            int i200 = i199 ^ (i199 << 13);
            int i201 = i200 ^ (i200 >>> 17);
            ((int[]) objArr123[1])[0] = i201 ^ (i201 << 5);
        } else {
            str11 = r14;
            int[] iArr12 = new int[i196];
            int i202 = i196 - 1;
            iArr12[i202] = 1;
            Toast.makeText((Context) null, iArr12[((i196 * i202) % 2) - 1], 1).show();
            int i203 = ((int[]) objArr8[1])[0];
            Object[] objArr124 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i204 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str11, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i205 = ~(450721738 | i204);
            int i206 = i203 + (-1308724370) + (((-452950016) | i205) * (-814)) + ((i205 | (~((~i204) | 410411509)) | 408183232) * 407) + (((~(i204 | (-410411510))) | (~((-450721739) | i204)) | 408183232) * 407);
            int i207 = (i206 << 13) ^ i206;
            int i208 = i207 ^ (i207 >>> 17);
            ((int[]) objArr124[1])[0] = i208 ^ (i208 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
            char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int scrollBarFadeDuration = 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i209 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr52 = $$a;
            Object[] objArr125 = new Object[1];
            c(bArr52[91], (short) ($$b + 3), bArr52[7], objArr125);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(keyRepeatDelay3, scrollBarFadeDuration, i209, -459846511, false, (String) objArr125[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
            char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf(str3, '0'));
            int i210 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 651;
            int windowTouchSlop2 = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr53 = $$a;
            byte b26 = (byte) (bArr53[88] - 1);
            short s23 = bArr53[7];
            Object[] objArr126 = new Object[1];
            c(b26, s23, (byte) (s23 | 52), objArr126);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cLastIndexOf4, i210, windowTouchSlop2, -873460649, false, (String) objArr126[0], null);
        }
        if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char size5 = (char) View.MeasureSpec.getSize(0);
                int fadingEdgeLength4 = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int modifierMetaStateMask6 = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                byte[] bArr54 = $$a;
                byte b27 = bArr54[91];
                short s24 = bArr54[7];
                Object[] objArr127 = new Object[1];
                c(b27, s24, (byte) (s24 | 15), objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(size5, fadingEdgeLength4, modifierMetaStateMask6, -1595579076, false, (String) objArr127[0], null);
            }
            Object[] objArr128 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).get(null);
            objArr9 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i211 = ((int[]) objArr128[2])[0];
            int i212 = ((int[]) objArr128[0])[0];
            int i213 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str11, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i214 = (((-1972715175) + (((~(634789344 | i213)) | 34103834) * 576)) + (((~((~i213) | 668893178)) | 604116320) * 576)) - 1299173637;
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            ((int[]) objArr9[3])[0] = i216 ^ (i216 << 5);
            i5 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) str3, '0') + 1611, 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr129 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).newInstance(null), 531854459, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char cLastIndexOf5 = (char) (TextUtils.lastIndexOf(str3, '0') + 1);
                int bitsPerPixel3 = 650 - ImageFormat.getBitsPerPixel(0);
                int tapTimeout2 = 44 - (ViewConfiguration.getTapTimeout() >> 16);
                byte[] bArr55 = $$a;
                byte b28 = (byte) (bArr55[88] - 1);
                short s25 = bArr55[7];
                Object[] objArr130 = new Object[1];
                c(b28, s25, (byte) (s25 | 52), objArr130);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cLastIndexOf5, bitsPerPixel3, tapTimeout2, 2075921419, false, (String) objArr130[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.argb(0, 0, 0, 0) + 695, 98 - View.resolveSize(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - ExpandableListView.getPackedPositionChild(0L)), 794 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 84 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).invoke(null, objArr129);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cMakeMeasureSpec4 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iAlpha2 = 651 - Color.alpha(0);
                int iAxisFromString2 = MotionEvent.axisFromString(str3) + 45;
                byte[] bArr56 = $$a;
                byte b29 = bArr56[91];
                short s26 = bArr56[7];
                Object[] objArr131 = new Object[1];
                c(b29, s26, (byte) (s26 | 15), objArr131);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cMakeMeasureSpec4, iAlpha2, iAxisFromString2, -1595579076, false, (String) objArr131[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, objArr9);
            try {
                long jLongValue15 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char c15 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int fadingEdgeLength5 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 651;
                    int iIndexOf6 = 43 - TextUtils.indexOf((CharSequence) str3, '0');
                    byte[] bArr57 = $$a;
                    byte b30 = (byte) (bArr57[88] - 1);
                    short s27 = bArr57[7];
                    Object[] objArr132 = new Object[1];
                    c(b30, s27, (byte) (s27 | 52), objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c15, fadingEdgeLength5, iIndexOf6, -873460649, false, (String) objArr132[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter(str3, 0);
                    int iMyPid4 = (Process.myPid() >> 22) + 651;
                    int scrollBarSize3 = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte[] bArr58 = $$a;
                    Object[] objArr133 = new Object[1];
                    c(bArr58[91], (short) ($$b + 3), bArr58[7], objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(offsetAfter, iMyPid4, scrollBarSize3, -459846511, false, (String) objArr133[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf20);
                i5 = 0;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i217 = ((int[]) objArr9[i5])[i5];
        int i218 = ((int[]) objArr9[2])[i5];
        if (i218 == i217) {
            Object[] objArr134 = new Object[4];
            int[] iArr13 = new int[1];
            objArr134[i5] = iArr13;
            int[] iArr14 = new int[1];
            objArr134[2] = iArr14;
            objArr134[3] = new int[1];
            int i219 = ((int[]) objArr9[3])[i5];
            int i220 = ((int[]) objArr9[2])[i5];
            int i221 = ((int[]) objArr9[i5])[i5];
            iArr14[i5] = i220;
            iArr13[i5] = i221;
            objArr134[1] = new String[i5];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i222 = i219 + (-1771931177) + (((~((-4230157) | iIdentityHashCode5)) | (~((~iIdentityHashCode5) | (-799347)))) * (-318)) + (((~(1044483212 | iIdentityHashCode5)) | (-1045282559)) * (-318)) + (((~(iIdentityHashCode5 | (-1044483213))) | 1041052402) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i223 = (i222 << 13) ^ i222;
            int i224 = i223 ^ (i223 >>> 17);
            i6 = 0;
            ((int[]) objArr134[3])[0] = i224 ^ (i224 << 5);
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr19 = (String[]) objArr9[1];
            if (strArr19 != null) {
                for (String str25 : strArr19) {
                    arrayList7.add(str25);
                }
            }
            Toast.makeText((Context) null, i218 / (((i218 - 1) * i218) % 2), 0).show();
            Object[] objArr135 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i225 = ((int[]) objArr9[3])[0];
            int i226 = ((int[]) objArr9[2])[0];
            int i227 = ((int[]) objArr9[0])[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i228 = i225 + 1821354007 + (((~elapsedCpuTime) | 5532334) * 1444) + (((~(elapsedCpuTime | (-537988299))) | (~(541419108 | elapsedCpuTime)) | 1050762) * (-1444)) + 300621426;
            int i229 = i228 ^ (i228 << 13);
            int i230 = i229 ^ (i229 >>> 17);
            i6 = 0;
            ((int[]) objArr135[3])[0] = i230 ^ (i230 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int bitsPerPixel4 = 1030 - ImageFormat.getBitsPerPixel(i6);
            int packedPositionType5 = 15 - ExpandableListView.getPackedPositionType(0L);
            byte[] bArr59 = $$a;
            Object[] objArr136 = new Object[1];
            c(bArr59[91], (short) 89, bArr59[7], objArr136);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(keyRepeatTimeout2, bitsPerPixel4, packedPositionType5, 1357589585, false, (String) objArr136[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char gidForName2 = (char) (Process.getGidForName(str3) + 1);
            int doubleTapTimeout3 = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int pressedStateDuration2 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr60 = $$a;
            Object[] objArr137 = new Object[1];
            c(bArr60[91], (short) 37, bArr60[7], objArr137);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(gidForName2, doubleTapTimeout3, pressedStateDuration2, 1344079056, false, (String) objArr137[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) << 52) >>> 52)) >> 12)) {
            int i231 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            b = i231 % 128;
            int i232 = i231 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char cIndexOf6 = (char) TextUtils.indexOf(str3, str3);
                int iGreen2 = 1031 - Color.green(0);
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str3) + 15;
                byte[] bArr61 = $$a;
                byte b31 = (byte) (bArr61[88] - 1);
                short s28 = bArr61[7];
                Object[] objArr138 = new Object[1];
                c(b31, s28, (byte) (s28 | 52), objArr138);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cIndexOf6, iGreen2, iKeyCodeFromString3, 632103528, false, (String) objArr138[0], null);
            }
            Object[] objArr139 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
            objArr10 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i233 = ((int[]) objArr139[3])[0];
            int i234 = ((int[]) objArr139[1])[0];
            String[] strArr20 = (String[]) objArr139[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i235 = ~iIdentityHashCode6;
            int i236 = 939527929 + ((~(984347579 | i235)) * (-560)) + ((~(iIdentityHashCode6 | 1052769275)) * (-560)) + (((~((-740067410) | i235)) | 671645713) * 560) + 510279075;
            int i237 = (i236 << 13) ^ i236;
            int i238 = i237 ^ (i237 >>> 17);
            ((int[]) objArr10[2])[0] = i238 ^ (i238 << 5);
        } else {
            int iIntValue5 = ((Integer) Class.forName(str14).getMethod(str8, Object.class).invoke(null, this)).intValue();
            Object[] objArr140 = {271728612};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b((char) (46038 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.getCapsMode(str3, 0, 0) + 1134, 18 - (KeyEvent.getMaxKeyCode() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr141 = {Integer.valueOf(iIntValue5), 0, 510279075, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).newInstance(objArr140), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cAxisFromString2 = (char) (MotionEvent.axisFromString(str3) + 1);
                int i239 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iMyPid5 = 15 - (Process.myPid() >> 22);
                byte[] bArr62 = $$a;
                Object[] objArr142 = new Object[1];
                c(bArr62[91], (short) 89, bArr62[7], objArr142);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cAxisFromString2, i239, iMyPid5, 1298546779, false, (String) objArr142[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1117 - Color.argb(0, 0, 0, 0), 17 - View.resolveSizeAndState(0, 0, 0)), Boolean.TYPE});
            }
            objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).invoke(null, objArr141);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char modifierMetaStateMask7 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int capsMode = TextUtils.getCapsMode(str3, 0, 0) + 1031;
                int windowTouchSlop3 = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr63 = $$a;
                byte b32 = (byte) (bArr63[88] - 1);
                short s29 = bArr63[7];
                Object[] objArr143 = new Object[1];
                c(b32, s29, (byte) (s29 | 52), objArr143);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(modifierMetaStateMask7, capsMode, windowTouchSlop3, 632103528, false, (String) objArr143[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr10);
            try {
                long jLongValue17 = ((Long) Class.forName(str12).getDeclaredMethod(str10, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char cMyPid2 = (char) (Process.myPid() >> 22);
                    int iResolveSize2 = View.resolveSize(0, 0) + 1031;
                    int offsetAfter2 = TextUtils.getOffsetAfter(str3, 0) + 15;
                    byte[] bArr64 = $$a;
                    Object[] objArr144 = new Object[1];
                    c(bArr64[91], (short) 37, bArr64[7], objArr144);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cMyPid2, iResolveSize2, offsetAfter2, 1344079056, false, (String) objArr144[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char bitsPerPixel5 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int size6 = View.MeasureSpec.getSize(0) + 1031;
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 15;
                    byte[] bArr65 = $$a;
                    Object[] objArr145 = new Object[1];
                    c(bArr65[91], (short) 89, bArr65[7], objArr145);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(bitsPerPixel5, size6, iArgb2, 1357589585, false, (String) objArr145[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                int i240 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                b = i240 % 128;
                int i241 = i240 % 2;
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i242 = ((int[]) objArr10[1])[0];
        int i243 = ((int[]) objArr10[3])[0];
        if (i243 == i242) {
            Object[] objArr146 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i244 = ((int[]) objArr10[2])[0];
            int i245 = ((int[]) objArr10[3])[0];
            int i246 = ((int[]) objArr10[1])[0];
            String[] strArr21 = (String[]) objArr10[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i247 = ~iIdentityHashCode7;
            int i248 = i244 + (-2140082559) + (((~(380559374 | i247)) | 554699632) * 168) + ((~((-554699633) | iIdentityHashCode7)) * 168) + (((~(iIdentityHashCode7 | 935259006)) | (~(i247 | (-624839545))) | 70139912) * 168);
            int i249 = (i248 << 13) ^ i248;
            int i250 = i249 ^ (i249 >>> 17);
            ((int[]) objArr146[2])[0] = i250 ^ (i250 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr22 = (String[]) objArr10[0];
            if (strArr22 != null) {
                for (String str26 : strArr22) {
                    arrayList8.add(str26);
                }
            }
            int[] iArr15 = new int[i243];
            int i251 = i243 - 1;
            iArr15[i251] = 1;
            Toast.makeText((Context) null, iArr15[((i243 * i251) % 2) - 1], 1).show();
            Object[] objArr147 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i252 = ((int[]) objArr10[2])[0];
            int i253 = ((int[]) objArr10[3])[0];
            int i254 = ((int[]) objArr10[1])[0];
            String[] strArr23 = (String[]) objArr10[0];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i255 = ~iIdentityHashCode8;
            int i256 = i252 + (((~((-264202) | i255)) | (~(244177385 | iIdentityHashCode8))) * 988) + 610787781 + (((~(iIdentityHashCode8 | (-366986))) | 102784 | (~(i255 | 244177385))) * 988);
            int i257 = (i256 << 13) ^ i256;
            int i258 = i257 ^ (i257 >>> 17);
            ((int[]) objArr147[2])[0] = i258 ^ (i258 << 5);
        }
        zzd().zza();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zznt.zzi(intent);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i4 % 128;
        int i5 = i4 % 2;
        zzd().zzc(intent, i, i2);
        int i6 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzd();
        zznt.zzj(intent);
        int i4 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean zza(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean zStopSelfResult = stopSelfResult(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i5 % 128;
        int i6 = i5 % 2;
        return zStopSelfResult;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzb(JobParameters jobParameters, boolean z) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzc(Intent intent) {
        int i = 2 % 2;
        int i2 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AppMeasurementReceiver.completeWakefulIntent(intent);
        if (i3 == 0) {
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzd().zzb();
        super.onDestroy();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        int i3 = 0;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[91];
                short s = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, s, (byte) (s | 15), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iCombineMeasuredStates, scrollDefaultDelay, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            obj.hashCode();
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
            int i4 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[91];
            short s2 = bArr2[7];
            Object[] objArr3 = new Object[1];
            c(b3, s2, (byte) (s2 | 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, i4, iMakeMeasureSpec, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                byte[] bArr3 = $$a;
                Object[] objArr4 = new Object[1];
                c(bArr3[91], (short) 37, bArr3[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, fadingEdgeLength, i5, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr5[0])[0];
            objArrB$5f1425da = new Object[]{new int[]{i6}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = ((((-2033273165) + (((~(546169807 | startUptimeMillis)) | 8651206) * (-502))) + ((~((~startUptimeMillis) | 767423439)) * (-502))) + (((~(startUptimeMillis | (-758772234))) | 546169807) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1882641438;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            a(new char[]{49720, 16020, 15210, 14278, 12512, 11645, 10713, 10925, 9997, 9123, 7303, 6406, 5621, 5725, 4885, 4086}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 64564, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(new char[]{49723, 7769, 31465, 22385, 45978, 35856, 59580, 50466, 8546, 32212, 24183, 47871, 38693, 62366, 52260, 10422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_general_network_error).substring(0, 37).length() + 56394, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {836098489};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 42050), 1725 - TextUtils.lastIndexOf("", '0', 0), 29 - TextUtils.getOffsetAfter("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = ItemProgramChosenBinding.b$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), -1882641438);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 29945);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1755;
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    c(bArr4[91], (short) 37, bArr4[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, iKeyCodeFromString, iIndexOf, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    a(new char[]{49715, 4375, 25696, 48033, 36497, 56812, 12596, 1105, 23397, 44706, 64978, 53464, 9263, 31502, 20092, 40370, 61583, 51146, 6968, 28172, 48493, 37054}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 54059, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    a(new char[]{49719, 10067, 2281, 29285, 22421, 47382, 41656, 34811, 59743, 53990, 13436, 6537, 807, 25782, 18881}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 58697, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29943);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c(bArr5[91], (short) ($$b + 3), bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf2, iLastIndexOf, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char size = (char) (29944 - View.MeasureSpec.getSize(0));
                        int i10 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                        byte[] bArr6 = $$a;
                        byte b4 = bArr6[91];
                        short s3 = bArr6[7];
                        Object[] objArr13 = new Object[1];
                        c(b4, s3, (byte) (s3 | 15), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, i10, maximumFlingVelocity, 986134021, false, (String) objArr13[0], null);
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
        int i11 = ((int[]) objArrB$5f1425da[1])[0];
        int i12 = ((int[]) objArrB$5f1425da[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$5f1425da[4];
            if (strArr != null) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                b = i13 % 128;
                int i14 = i13 % 2;
                while (i3 < strArr.length) {
                    arrayList.add(strArr[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i15 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArrB$5f1425da[3])[0];
        int i18 = ((int[]) objArrB$5f1425da[0])[0];
        Object[] objArr14 = {new int[]{i18}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int i19 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i20 = (-1627285407) + ((~(i19 | 489782316)) * 216);
        int i21 = ~i19;
        int i22 = i17 + i20 + ((498433534 | i21) * (-216)) + (((~(i21 | 489782316)) | (-277179891)) * 216);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        b = i25 % 128;
        int i26 = i25 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
            int i27 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 16;
            byte[] bArr7 = $$a;
            Object[] objArr15 = new Object[1];
            c(bArr7[91], (short) 89, bArr7[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask, i27, iIndexOf3, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr16 = new Object[1];
        a(new char[]{49715, 4375, 25696, 48033, 36497, 56812, 12596, 1105, 23397, 44706, 64978, 53464, 9263, 31502, 20092, 40370, 61583, 51146, 6968, 28172, 48493, 37054}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 54023, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        a(new char[]{49719, 10067, 2281, 29285, 22421, 47382, 41656, 34811, 59743, 53990, 13436, 6537, 807, 25782, 18881}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58732, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
            byte[] bArr8 = $$a;
            Object[] objArr18 = new Object[1];
            c(bArr8[91], (short) 37, bArr8[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, iMakeMeasureSpec2, packedPositionChild, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i28 = b + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iAlpha = 1031 - Color.alpha(0);
                int i30 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                byte[] bArr9 = $$a;
                byte b5 = (byte) (bArr9[88] - 1);
                short s4 = bArr9[7];
                Object[] objArr19 = new Object[1];
                c(b5, s4, (byte) (s4 | 52), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(fadingEdgeLength2, iAlpha, i30, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr20[3])[0];
            int i32 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i33 = ((((~(318306222 | iIdentityHashCode)) | 6815744) * 449) - 395717288) + (((~((~iIdentityHashCode) | 318306222)) | 6815744) * 449) + 823606154;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            a(new char[]{49720, 16020, 15210, 14278, 12512, 11645, 10713, 10925, 9997, 9123, 7303, 6406, 5621, 5725, 4885, 4086}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64678, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a(new char[]{49723, 7769, 31465, 22385, 45978, 35856, 59580, 50466, 8546, 32212, 24183, 47871, 38693, 62366, 52260, 10422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 56420, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {836098489};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46037), 1134 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 823606154, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte[] bArr10 = $$a;
                Object[] objArr25 = new Object[1];
                c(bArr10[91], (short) 89, bArr10[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, pressedStateDuration, mirror, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (Process.myTid() >> 22)), Color.rgb(0, 0, 0) + 16778333, AndroidCharacter.getMirror('0') - 31), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr11 = $$a;
                byte b6 = (byte) (bArr11[88] - 1);
                short s5 = bArr11[7];
                Object[] objArr26 = new Object[1];
                c(b6, s5, (byte) (s5 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maxKeyCode, iLastIndexOf2, maximumDrawingCacheSize, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                a(new char[]{49715, 4375, 25696, 48033, 36497, 56812, 12596, 1105, 23397, 44706, 64978, 53464, 9263, 31502, 20092, 40370, 61583, 51146, 6968, 28172, 48493, 37054}, Color.argb(0, 0, 0, 0) + 54059, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(new char[]{49719, 10067, 2281, 29285, 22421, 47382, 41656, 34811, 59743, 53990, 13436, 6537, 807, 25782, 18881}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 58624, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int scrollBarSize = 1031 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i36 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                    byte[] bArr12 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr12[91], (short) 37, bArr12[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, scrollBarSize, i36, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                    byte[] bArr13 = $$a;
                    Object[] objArr30 = new Object[1];
                    c(bArr13[91], (short) 89, bArr13[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(capsMode, iResolveOpacity, absoluteGravity, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i37 = ((int[]) objArr[1])[0];
        int i38 = ((int[]) objArr[3])[0];
        if (i38 != i37) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i3 < strArr3.length) {
                    arrayList2.add(strArr3[i3]);
                    i3++;
                }
            }
            throw new RuntimeException(String.valueOf(i38));
        }
        int i39 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i39 % 128;
        int i40 = i39 % 2;
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i44 = ~iIdentityHashCode2;
        int i45 = i41 + ((((~(764092207 | i44)) | (~(iIdentityHashCode2 | 1008372377))) * 959) - 769231073) + (((~(iIdentityHashCode2 | 764092207)) | (~(i44 | 1008372377))) * 959);
        int i46 = i45 ^ (i45 << 13);
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr31[2])[0] = i47 ^ (i47 << 5);
    }

    static {
        byte[] bArr = new byte[642];
        System.arraycopy("\u0007\u000f\u0019\u0019ò\u0000=Åöþ\u0006ù\u00055¿ÿÿ\u0000óDÉò\u0000þüÿ>¹\r÷\u0000ùø\rñ\u0002\u000bó<²þ\u000bÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö@ò\u0000=Êð\u0004õý\u0007ôEÈ\u0001ë\u00111¹\u000eù÷\u0001\tíý\tý÷@¿ü\tý÷<º\u000bð\u0001ÿÿù\f5éÒÿ\u0006ûõ\u0003\u0019ëð\u0001ÿÿù\fÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö?ò\u0000=Åöþ\u0006ù\u00055Æûõ\u000b\u0001ÿì\f5Éï\u000fì\túñ\u0003\t\u0004îCÃùø\rñ\u0002\u000bó<¿ü\tý÷<éÏ\u000fì\túñ\u0003\t\u0004î\u001fëóÿûüNÏìðþ\bøÿHÝÍ\u000fõøNÐá\u0001þûøÿ1Ìþ\b\u0000÷ÿ\u0006õøNÐá\u0001þûøÿ\u001cóí\u0007\u0006ñøNàË\nû\u0006ýñò\u0000=Åöþ\u0006ù\u00055Æûõ\u000b\u0001ÿì\f5Éï\u000fì\túñ\u0003\t\u0004îCÃùø\rñ\u0002\u000bó<¿ü\tý÷<ëÊÿ\u0003\u0017óóõ\u000e\u0004\u001aÏ\u000fì\túñ\u0003\t\u0004î\u001fëóÿûü\u0013\nìðþ\bøÿ\r\u0018Í\u000fõø\u0013\u000bá\u0001þûøÿ1Ìþ\b\u0000÷ÿ\u0006õøNñò\u0000=Êð\u0004õý\u0007ôEÈ\u0001ë\u00111¶\u0005\n\u0000ë\tøÿ>Öå\n\u0000ë\tøÿ(áë\u0011\fÝ\u0003û\u000b?þÝË\u0002\rñ\u0002\u000bó\u0017Ø\tø\n\u0001ï\t\u0004\u0015éò\tü\u0001.ûò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034ÅøøC¿\nïûC¿ü\tý÷<²þ\u0006Ý\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007öAò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034¿\në\rñ\u0007\u0006ó<È\u0001ë\ró\u0005\u0004ö\u0004ñBßêë\rñ\u0007\u0006ó'àó\u0005õ\b\u0001íLê".getBytes("ISO-8859-1"), 0, bArr, 0, 642);
        $$d = bArr;
        $$e = 42;
        $$a = new byte[]{109, 7, 114, -90, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 138;
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentbindingInflater1 = -3451104714605368503L;
    }
}
