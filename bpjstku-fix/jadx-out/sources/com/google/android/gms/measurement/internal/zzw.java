package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.measurement.zzqp;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zzw extends BroadcastReceiver {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final zzic zza;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = 16;
    private static int $10 = 0;
    private static int $11 = 1;

    public zzw(zzic zzicVar) {
        this.zza = zzicVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzw.$$a
            int r7 = r7 + 4
            int r1 = r6 + 1
            int r5 = r5 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r5
            r5 = r6
            r3 = r2
            goto L25
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
        L25:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzw.b(short, int, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, short s, Object[] objArr) {
        int i3 = i + 84;
        byte[] bArr = $$d;
        int i4 = 528 - i2;
        byte[] bArr2 = new byte[s + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (s + (-i3)) - 2;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i4])) - 2;
            i4++;
            i5 = i6;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj2 = null;
        int i4 = 3;
        if (cArr2 != null) {
            int i5 = $10;
            int i6 = i5 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = i5 + 123;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2267 - (ViewConfiguration.getFadingEdgeLength() >> 16), 33 - (KeyEvent.getMaxKeyCode() >> 16), -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i10++;
                    i4 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 3;
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2267 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    int i11 = $10 + 93;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 2;
                        byte b7 = (byte) (b6 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 49268), 3262 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -127612708, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 22878), 594 - View.combineMeasuredStates(0, 0), 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    final /* synthetic */ void zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzx().zzh(((Long) zzfy.zzC.zzb(null)).longValue());
            throw null;
        }
        this.zza.zzx().zzh(((Long) zzfy.zzC.zzb(null)).longValue());
        int i3 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:471:0x2f8c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Context context2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        int i2;
        Object[] objArr8;
        String str;
        Object[] objArr9;
        Object[] objArr10;
        int i3;
        Object[] objArr11;
        Context applicationContext;
        Object[] objArr12;
        Object[] objArr13;
        char c;
        Object[] objArr14;
        int i4;
        Object[] objArr15;
        Object[] objArr16;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
        Object[] objArr17 = new Object[1];
        a(new char[]{28, 30, 30, 5, 0, 19, 30, '!', 7, 1, 2, 26, 19, Typography.quote, 25, 22, 11, 29, 19, 3, '\n', 5}, (byte) (108 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 21 - TextUtils.indexOf((CharSequence) "", '0'), objArr17);
        String str2 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a(new char[]{20, 22, 27, 6, 1, 25, 5, '#', 18, 25, 22, 27, 23, 0, 13825}, (byte) (Color.red(0) + 2), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr18);
        String str3 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{'\f', 26, 0, 26, '!', 20, 28, 30, 31, '!', 21, 23, Typography.quote, 25, 23, 1}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 123), TextUtils.indexOf((CharSequence) "", '0') + 17, objArr19);
        String str4 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{23, 30, 22, 31, 24, 22, Typography.quote, 28, 18, 30, '#', '\r', 19, 5, 31, 23}, (byte) (Color.blue(0) + 84), 16 - Color.red(0), objArr20);
        String str5 = (String) objArr20[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int defaultSize = View.getDefaultSize(0, 0) + 1031;
            int defaultSize2 = View.getDefaultSize(0, 0) + 15;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr21 = new Object[1];
            b(b, (byte) (b | 52), bArr[5], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, defaultSize, defaultSize2, 1357589585, false, (String) objArr21[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
            int scrollBarFadeDuration2 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b2 = $$a[7];
            byte b3 = (byte) (b2 | 52);
            Object[] objArr22 = new Object[1];
            b(b2, b3, (short) (b3 - 1), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, maxKeyCode, scrollBarFadeDuration2, 1344079056, false, (String) objArr22[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) Color.blue(0);
                int i10 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                byte[] bArr2 = $$a;
                byte b4 = (byte) (bArr2[205] + 1);
                byte b5 = bArr2[7];
                Object[] objArr23 = new Object[1];
                b(b4, b5, (short) (b5 | 103), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, i10, i11, 632103528, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr24[3])[0];
            int i13 = ((int[]) objArr24[1])[0];
            String[] strArr = (String[]) objArr24[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i14 = ((((-1880546060) + ((~((-42013847) | startElapsedRealtime)) * (-301))) + (((~(716125695 | startElapsedRealtime)) | (~((~startElapsedRealtime) | 960405865))) * (-301))) + (((~(startElapsedRealtime | (-960405866))) | 716125695) * 301)) - 631844527;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr[2])[0] = i16 ^ (i16 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr25 = {-475062085};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1133 - TextUtils.lastIndexOf("", '0', 0, 0), MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr26 = {Integer.valueOf(iIntValue), 0, -631844527, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr25), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int i17 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr27 = new Object[1];
                    b(b6, (byte) (b6 | 52), bArr3[5], objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, i17, keyRepeatDelay, 1298546779, false, (String) objArr27[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.getTrimmedLength("") + 1117, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr26);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int mirror = 1079 - AndroidCharacter.getMirror('0');
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 15;
                    byte[] bArr4 = $$a;
                    byte b7 = (byte) (bArr4[205] + 1);
                    byte b8 = bArr4[7];
                    Object[] objArr28 = new Object[1];
                    b(b7, b8, (short) (b8 | 103), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, mirror, offsetAfter, 632103528, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    long jLongValue2 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i18 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                        byte b9 = $$a[7];
                        byte b10 = (byte) (b9 | 52);
                        Object[] objArr29 = new Object[1];
                        b(b9, b10, (short) (b10 - 1), objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, keyRepeatTimeout, i18, 1344079056, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                        int longPressTimeout2 = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        Object[] objArr30 = new Object[1];
                        b(b11, (byte) (b11 | 52), bArr5[5], objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cArgb, absoluteGravity, longPressTimeout2, 1357589585, false, (String) objArr30[0], null);
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
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[3])[0];
        if (i20 == i19) {
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[3])[0];
            int i23 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = ~(1073659774 | iIdentityHashCode);
            int i25 = i21 + 1951558253 + ((680396808 | i24) * (-476)) + (i24 * 952) + ((~((~iIdentityHashCode) | 1073659774)) * 476);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            i = 0;
            ((int[]) objArr2[2])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str6 : strArr3) {
                    arrayList.add(str6);
                }
            }
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i31 = (-186909669) + (((~((-729240505) | iIdentityHashCode2)) | 484960334) * (-318));
            int i32 = ~(484960334 | iIdentityHashCode2);
            int i33 = ~iIdentityHashCode2;
            int i34 = i28 + i31 + ((i32 | (~((-343976007) | i33))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode2 | (-343976007))) | (~(1073216510 | i33))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            i = 0;
            ((int[]) objArr2[2])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int iAlpha = 625 - Color.alpha(i);
            int iRgb = (-16777202) - Color.rgb(i, i, i);
            byte[] bArr6 = $$a;
            byte b12 = (byte) (bArr6[205] + 1);
            byte b13 = bArr6[7];
            Object[] objArr31 = new Object[1];
            b(b12, b13, (short) (b13 | 103), objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(doubleTapTimeout, iAlpha, iRgb, -477065106, false, (String) objArr31[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
            int deadChar = 14 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr7 = $$a;
            byte b14 = bArr7[7];
            Object[] objArr32 = new Object[1];
            b(b14, (byte) (b14 | 52), bArr7[5], objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(bitsPerPixel, iResolveSizeAndState, deadChar, -976899241, false, (String) objArr32[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                int iIndexOf = TextUtils.indexOf("", "") + 625;
                int modifierMetaStateMask = 13 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b15 = $$a[7];
                byte b16 = (byte) (b15 | 52);
                Object[] objArr33 = new Object[1];
                b(b15, b16, (short) (b16 - 1), objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, iIndexOf, modifierMetaStateMask, -973632554, false, (String) objArr33[0], null);
            }
            Object[] objArr34 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i37 = ((int[]) objArr34[2])[0];
            int i38 = ((int[]) objArr34[0])[0];
            String[] strArr5 = (String[]) objArr34[3];
            int[] iArr = {i37};
            int iMyTid = Process.myTid();
            int i39 = ~iMyTid;
            int i40 = (-1111696980) + (((~((-758399109) | i39)) | (~((-4294657) | iMyTid)) | (~((-302645249) | iMyTid))) * 765) + (((~((-762693765) | i39)) | 758399108) * 1530) + (((~(iMyTid | (-762693765))) | (~(i39 | (-302645249)))) * 765) + 190237504;
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr3[1])[0] = i42 ^ (i42 << 5);
            objArr3 = new Object[]{new int[]{i38}, new int[1], iArr, strArr5};
            context2 = context;
        } else {
            context2 = context;
            Context applicationContext2 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            int iIntValue2 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr35 = new Object[1];
            a(new char[]{'\r', 25, 26, 25, 27, 30, 26, 28, 1, 27, 28, '\r', 13903, 13903, 28, '\f', '\b', 24, 25, 21, '\f', '\n', '\t', 30, 18, 7, ' ', 27, 17, 31, '\t', 2, 0, 27, '\t', 1, 13819, 13819, '\f', 27, 28, '\r', '\t', 14, 31, 25, 14, 17, 28, 6, '\f', 27, '\t', 14, '\t', 31, '\t', 21, '\t', ' ', 31, 27, '\t', 31}, (byte) (Drawable.resolveOpacity(0, 0) + 80), 64 - TextUtils.getTrimmedLength(""), objArr35);
            String str7 = (String) objArr35[0];
            Object[] objArr36 = new Object[1];
            a(new char[]{6, 29, '!', 29, 16, 22, 30, '\t', 25, 31, '\t', Typography.quote, 25, '\r', 26, 7, '\r', 19, 25, 15, '\f', '\n', 26, 28, ' ', '\t', 3, '\t', 15, 1, '\t', 21, '\t', 3, 14, 28, 7, 20, 25, 6, '\r', 25, 26, 28, 7, '\t', 13739, 13739, 5, '\t', 13733, 13733, ' ', '\t', 19, '\r', 7, 29, '\b', '\t', 28, 6, 28, 26}, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1), 64 - (Process.myPid() >> 22), objArr36);
            String[] strArr6 = {str7, (String) objArr36[0]};
            int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
            TuitionPaymentFragmentbindingInflater1 = i43 % 128;
            int i44 = i43 % 2;
            try {
                Object[] objArr37 = {applicationContext2, strArr6, Integer.valueOf(iIntValue2), 17, 190237504};
                byte[] bArr8 = $$d;
                Object[] objArr38 = new Object[1];
                c(bArr8[58], (short) 524, (byte) (-bArr8[227]), objArr38);
                Class<?> cls = Class.forName((String) objArr38[0]);
                byte b17 = bArr8[5];
                Object[] objArr39 = new Object[1];
                c(b17, (short) (b17 | 485), bArr8[112], objArr39);
                Object[] objArr40 = (Object[]) cls.getMethod((String) objArr39[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
                int i45 = ((int[]) objArr40[0])[0];
                int i46 = ((int[]) objArr40[2])[0];
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char maximumDrawingCacheSize = (char) (37567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i47 = 626 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i48 = 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b18 = $$a[7];
                        byte b19 = (byte) (b18 | 52);
                        Object[] objArr41 = new Object[1];
                        b(b18, b19, (short) (b19 - 1), objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize, i47, i48, -973632554, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr40);
                    try {
                        long jLongValue4 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue4);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 37567);
                            int iArgb = 625 - Color.argb(0, 0, 0, 0);
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                            byte[] bArr9 = $$a;
                            byte b20 = bArr9[7];
                            Object[] objArr42 = new Object[1];
                            b(b20, (byte) (b20 | 52), bArr9[5], objArr42);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionGroup, iArgb, iIndexOf2, -976899241, false, (String) objArr42[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 625;
                            int iGreen = 14 - Color.green(0);
                            byte[] bArr10 = $$a;
                            byte b21 = (byte) (bArr10[205] + 1);
                            byte b22 = bArr10[7];
                            Object[] objArr43 = new Object[1];
                            b(b21, b22, (short) (b22 | 103), objArr43);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(tapTimeout, pressedStateDuration, iGreen, -477065106, false, (String) objArr43[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr40 = objArr40;
                }
                objArr3 = objArr40;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr3[2])[0] != ((int[]) objArr3[0])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr7 = (String[]) objArr3[3];
            if (strArr7 != null) {
                for (String str8 : strArr7) {
                    int i49 = TuitionPaymentFragmentbindingInflater1 + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i49 % 128;
                    int i50 = i49 % 2;
                    arrayList2.add(str8);
                }
            }
            throw null;
        }
        int i51 = ((int[]) objArr3[1])[0];
        int i52 = ((int[]) objArr3[2])[0];
        int i53 = ((int[]) objArr3[0])[0];
        String[] strArr8 = (String[]) objArr3[3];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i54 = ~iIdentityHashCode3;
        int i55 = i51 + (-1484626900) + ((89838734 | i54) * (-757)) + ((~((-1644241009) | iIdentityHashCode3)) * 1514) + (((~(iIdentityHashCode3 | 1734079742)) | (~(i54 | (-1733899387))) | 89658378) * 757);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr[1])[0] = i57 ^ (i57 << 5);
        Object[] objArr44 = {new int[]{i53}, new int[1], new int[]{i52}, strArr8};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43042);
            int i58 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
            int packedPositionChild2 = 21 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr11 = $$a;
            byte b23 = bArr11[7];
            Object[] objArr45 = new Object[1];
            b(b23, (byte) (b23 | 52), bArr11[5], objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(doubleTapTimeout2, i58, packedPositionChild2, -1272852037, false, (String) objArr45[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43041);
                int iResolveSizeAndState2 = 3111 - View.resolveSizeAndState(0, 0, 0);
                int i59 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                byte b24 = $$a[7];
                byte b25 = (byte) (b24 | 37);
                Object[] objArr46 = new Object[1];
                b(b24, b25, (short) (b25 | 66), objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c3, iResolveSizeAndState2, i59, 154975793, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).get(null);
            int i60 = ((int[]) objArr47[2])[0];
            int i61 = ((int[]) objArr47[1])[0];
            String[] strArr9 = (String[]) objArr47[3];
            int[] iArr2 = {i60};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i62 = ~startUptimeMillis;
            int i63 = (-1132074222) + (((~(1604288287 | i62)) | 100743171) * 220) + (((~(i62 | 1444641055)) | 260390403) * (-440)) + ((startUptimeMillis | 1604288287) * 220) + 2085705391;
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr4[0])[0] = i65 ^ (i65 << 5);
            objArr4 = new Object[]{new int[1], new int[]{i61}, iArr2, strArr9};
            objArr44 = objArr44;
        } else {
            Object[] objArr48 = {null, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 2085705391};
            byte[] bArr12 = $$d;
            short s = (short) 433;
            Object[] objArr49 = new Object[1];
            c(bArr12[58], s, (byte) (s & 124), objArr49);
            Class<?> cls2 = Class.forName((String) objArr49[0]);
            byte b26 = bArr12[5];
            Object[] objArr50 = new Object[1];
            c(b26, (short) (b26 | 485), bArr12[112], objArr50);
            Object[] objArr51 = (Object[]) cls2.getMethod((String) objArr50[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char minimumFlingVelocity = (char) (43042 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3111;
                int modifierMetaStateMask2 = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                byte b27 = $$a[7];
                byte b28 = (byte) (b27 | 37);
                Object[] objArr52 = new Object[1];
                b(b27, b28, (short) (b28 | 66), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(minimumFlingVelocity, keyRepeatTimeout2, modifierMetaStateMask2, 154975793, false, (String) objArr52[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, objArr51);
            try {
                long jLongValue5 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char c4 = (char) (43043 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int maximumFlingVelocity = 3111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 23;
                    byte b29 = $$a[7];
                    byte b30 = (byte) (b29 | 52);
                    Object[] objArr53 = new Object[1];
                    b(b29, b30, (short) (b30 - 1), objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c4, maximumFlingVelocity, bitsPerPixel2, -1269618118, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char maxKeyCode2 = (char) (43042 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iRgb2 = (-16774105) - Color.rgb(0, 0, 0);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                    byte[] bArr13 = $$a;
                    byte b31 = bArr13[7];
                    Object[] objArr54 = new Object[1];
                    b(b31, (byte) (b31 | 52), bArr13[5], objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(maxKeyCode2, iRgb2, iMakeMeasureSpec, -1272852037, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf6);
                objArr4 = objArr51;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i66 = ((int[]) objArr4[1])[0];
        int i67 = ((int[]) objArr4[2])[0];
        if (i67 != i66) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr10 = (String[]) objArr4[3];
            if (strArr10 != null) {
                for (String str9 : strArr10) {
                    arrayList3.add(str9);
                }
            }
            throw new RuntimeException(String.valueOf(i67));
        }
        int i68 = ((int[]) objArr4[0])[0];
        int i69 = ((int[]) objArr4[2])[0];
        int i70 = ((int[]) objArr4[1])[0];
        String[] strArr11 = (String[]) objArr4[3];
        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
        int i71 = i68 + 610867510 + (((~((~startUptimeMillis2) | (-542773905))) | (~(1702868702 | startUptimeMillis2))) * (-302)) + ((~((-542773905) | startUptimeMillis2)) * (-604)) + (((~(startUptimeMillis2 | 1160094798)) | 1157932042) * 302);
        int i72 = (i71 << 13) ^ i71;
        int i73 = i72 ^ (i72 >>> 17);
        ((int[]) objArr[0])[0] = i73 ^ (i73 << 5);
        Object[] objArr55 = {new int[1], new int[]{i70}, new int[]{i69}, strArr11};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            char windowTouchSlop = (char) (31533 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int i74 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf3 = TextUtils.indexOf("", "") + 28;
            byte[] bArr14 = $$a;
            byte b32 = (byte) (bArr14[205] + 1);
            byte b33 = bArr14[7];
            Object[] objArr56 = new Object[1];
            b(b32, b33, (short) (b33 | 103), objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(windowTouchSlop, i74, iIndexOf3, -1048449946, false, (String) objArr56[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char c5 = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i75 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int packedPositionChild3 = 27 - ExpandableListView.getPackedPositionChild(0L);
                byte b34 = $$a[7];
                byte b35 = (byte) (b34 | 37);
                Object[] objArr57 = new Object[1];
                b(b34, b35, (short) (b35 | 66), objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c5, i75, packedPositionChild3, -1142834547, false, (String) objArr57[0], null);
            }
            Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
            objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr58[1])[0]}, (Object[]) objArr58[2], new int[]{((int[]) objArr58[3])[0]}, (String[]) objArr58[4]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i76 = 1953390499 + (((~((-1643752634) | startElapsedRealtime2)) | 29401248) * 104) + ((~((~startElapsedRealtime2) | 1744678395)) * (-104)) + ((startElapsedRealtime2 | 130327010) * 104) + 1554902923;
            int i77 = (i76 << 13) ^ i76;
            int i78 = i77 ^ (i77 >>> 17);
            ((int[]) objArr5[0])[0] = i78 ^ (i78 << 5);
            objArr55 = objArr55;
        } else {
            Object[] objArr59 = {context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1554902923};
            byte[] bArr15 = $$d;
            Object[] objArr60 = new Object[1];
            c(bArr15[58], (short) 385, bArr15[358], objArr60);
            Class<?> cls3 = Class.forName((String) objArr60[0]);
            byte b36 = bArr15[5];
            Object[] objArr61 = new Object[1];
            c(b36, (short) (b36 | 330), bArr15[31], objArr61);
            Object[] objArr62 = (Object[]) cls3.getMethod((String) objArr61[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr59);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char absoluteGravity2 = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                int i79 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int mirror2 = 'L' - AndroidCharacter.getMirror('0');
                byte b37 = $$a[7];
                byte b38 = (byte) (b37 | 37);
                Object[] objArr63 = new Object[1];
                b(b37, b38, (short) (b38 | 66), objArr63);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(absoluteGravity2, i79, mirror2, -1142834547, false, (String) objArr63[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, objArr62);
            try {
                long jLongValue6 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                    int iMyTid2 = 921 - (Process.myTid() >> 22);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                    byte b39 = $$a[7];
                    byte b40 = (byte) (b39 | 52);
                    Object[] objArr64 = new Object[1];
                    b(b39, b40, (short) (b40 - 1), objArr64);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(packedPositionType, iMyTid2, iLastIndexOf, -778300370, false, (String) objArr64[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                    int keyRepeatDelay2 = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i80 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr16 = $$a;
                    byte b41 = (byte) (bArr16[205] + 1);
                    byte b42 = bArr16[7];
                    Object[] objArr65 = new Object[1];
                    b(b41, b42, (short) (b42 | 103), objArr65);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(pressedStateDuration2, keyRepeatDelay2, i80, -1048449946, false, (String) objArr65[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf8);
                objArr5 = objArr62;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr5[3])[0] != ((int[]) objArr5[1])[0]) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr12 = (String[]) objArr5[4];
            if (strArr12 != null) {
                int i81 = TuitionPaymentFragmentbindingInflater1 + 9;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i81 % 128;
                int i82 = i81 % 2;
                for (String str10 : strArr12) {
                    arrayList4.add(str10);
                }
            }
            throw null;
        }
        int i83 = ((int[]) objArr5[0])[0];
        Object[] objArr66 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
        int i84 = i83 + 440064755 + (((-1631398148) | startUptimeMillis3) * 376) + (((~((~startUptimeMillis3) | 625842892)) | (-1702738896)) * (-376)) + (((~(startUptimeMillis3 | (-625842893))) | 1148236751) * 376);
        int i85 = (i84 << 13) ^ i84;
        int i86 = i85 ^ (i85 >>> 17);
        ((int[]) objArr66[0])[0] = i86 ^ (i86 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
            int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
            byte b43 = $$a[7];
            byte b44 = (byte) (b43 | 37);
            Object[] objArr67 = new Object[1];
            b(b43, b44, (short) (b44 | 66), objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cResolveSizeAndState, jumpTapTimeout, doubleTapTimeout3, 986134021, false, (String) objArr67[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cBlue2 = (char) (Color.blue(0) + 29944);
                int mirror3 = 1803 - AndroidCharacter.getMirror('0');
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                byte b45 = $$a[7];
                byte b46 = (byte) (b45 | 52);
                Object[] objArr68 = new Object[1];
                b(b45, b46, (short) (b46 - 1), objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cBlue2, mirror3, jumpTapTimeout2, 1599039318, false, (String) objArr68[0], null);
            }
            Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr69[0])[0]}, new int[]{((int[]) objArr69[1])[0]}, (Object[]) objArr69[2], new int[1], (String[]) objArr69[4]};
            int iMyUid = Process.myUid();
            int i87 = ~iMyUid;
            int i88 = (((1770160449 + ((iMyUid | 159194017) * 140)) + (((~(159194017 | i87)) | 33742872) * (-280))) + (((~(iMyUid | (-33742873))) | ((~(53408408 | i87)) | 139528481)) * 140)) - 1895217650;
            int i89 = (i88 << 13) ^ i88;
            int i90 = i89 ^ (i89 >>> 17);
            ((int[]) objArr6[3])[0] = i90 ^ (i90 << 5);
            objArr66 = objArr66;
        } else {
            int iIntValue3 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr70 = {-475062085};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (42049 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1726, ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(objArr70), -1895217650, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                int jumpTapTimeout3 = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int maximumFlingVelocity2 = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b47 = $$a[7];
                byte b48 = (byte) (b47 | 52);
                Object[] objArr71 = new Object[1];
                b(b47, b48, (short) (b48 - 1), objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(offsetBefore, jumpTapTimeout3, maximumFlingVelocity2, 1599039318, false, (String) objArr71[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                long jLongValue7 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
                    int tapTimeout2 = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i91 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                    byte b49 = $$a[7];
                    Object[] objArr72 = new Object[1];
                    b(b49, (byte) (b49 | 52), (short) 140, objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(packedPositionType2, tapTimeout2, i91, 1596667560, false, (String) objArr72[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                    int keyRepeatDelay3 = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int tapTimeout3 = 23 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b50 = $$a[7];
                    byte b51 = (byte) (b50 | 37);
                    Object[] objArr73 = new Object[1];
                    b(b50, b51, (short) (b51 | 66), objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(packedPositionGroup2, keyRepeatDelay3, tapTimeout3, 986134021, false, (String) objArr73[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf10);
                objArr6 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i92 = ((int[]) objArr6[1])[0];
        int i93 = ((int[]) objArr6[0])[0];
        if (i93 == i92) {
            int i94 = ((int[]) objArr6[3])[0];
            objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i95 = i94 + 631833220 + (((~(iIdentityHashCode4 | 719559459)) | 336856264) * 305) + (((~((~iIdentityHashCode4) | 719559459)) | 506957033) * 305);
            int i96 = (i95 << 13) ^ i95;
            int i97 = i96 ^ (i96 >>> 17);
            i2 = 0;
            ((int[]) objArr7[3])[0] = i97 ^ (i97 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr6[4];
            if (strArr13 != null) {
                for (String str11 : strArr13) {
                    arrayList5.add(str11);
                }
            }
            Toast.makeText((Context) null, i93 / (((i93 - 1) * i93) % 2), 0).show();
            int i98 = ((int[]) objArr6[3])[0];
            objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int i99 = ~((~((int) Runtime.getRuntime().freeMemory())) | (-795834128));
            int i100 = i98 + ((((-1065350992) | i99) * (-970)) - 1824061799) + ((i99 | 269516864) * 970);
            int i101 = (i100 << 13) ^ i100;
            int i102 = i101 ^ (i101 >>> 17);
            i2 = 0;
            ((int[]) objArr7[3])[0] = i102 ^ (i102 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char c6 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53892);
            int iGreen2 = 1320 - Color.green(i2);
            int iRed = Color.red(i2) + 36;
            byte[] bArr17 = $$a;
            byte b52 = (byte) (bArr17[205] + 1);
            byte b53 = bArr17[7];
            Object[] objArr74 = new Object[1];
            b(b52, b53, (short) (b53 | 103), objArr74);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c6, iGreen2, iRed, -1433084963, false, (String) objArr74[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) != -1) {
            int i103 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i103 % 128;
            int i104 = i103 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char offsetAfter2 = (char) (TextUtils.getOffsetAfter("", 0) + 53893);
                int iIndexOf4 = 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 36;
                byte b54 = $$a[7];
                byte b55 = (byte) (b54 | 52);
                Object[] objArr75 = new Object[1];
                b(b54, b55, (short) (b55 - 1), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(offsetAfter2, iIndexOf4, longPressTimeout3, -1920778747, false, (String) objArr75[0], null);
            }
            Object[] objArr76 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
            objArr8 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i105 = ((int[]) objArr76[0])[0];
            int i106 = ((int[]) objArr76[3])[0];
            String[] strArr14 = (String[]) objArr76[2];
            int i107 = ~(System.identityHashCode(this) | 1018487047);
            int i108 = 1654273492 + (((-352140778) | i107) * (-220)) + ((i107 | (-1023278576)) * 220) + 2085053632;
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            ((int[]) objArr8[1])[0] = i110 ^ (i110 << 5);
            objArr7 = objArr7;
        } else {
            Context applicationContext3 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            int iIntValue4 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            Object[] objArr77 = {-475062085};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 47977), 1300 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr78 = {applicationContext3, "com.bpjstku", 747271804, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).newInstance(objArr77), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char pressedStateDuration3 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
                int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 1321;
                int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36;
                byte b56 = $$a[7];
                byte b57 = (byte) (b56 | 52);
                Object[] objArr79 = new Object[1];
                b(b56, b57, (short) (b57 - 1), objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(pressedStateDuration3, packedPositionChild4, keyRepeatTimeout3, 819724799, false, (String) objArr79[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57878), ((Process.getThreadPriority(0) + 20) >> 6) + 1394, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 76), Boolean.TYPE});
            }
            Object[] objArr80 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).invoke(null, objArr78);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char pressedStateDuration4 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
                    int gidForName = Process.getGidForName("") + 1321;
                    int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 37;
                    byte b58 = $$a[7];
                    byte b59 = (byte) (b58 | 52);
                    Object[] objArr81 = new Object[1];
                    b(b58, b59, (short) (b59 - 1), objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(pressedStateDuration4, gidForName, bitsPerPixel3, -1920778747, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr80);
                try {
                    long jLongValue8 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char cResolveSizeAndState2 = (char) (53893 - View.resolveSizeAndState(0, 0, 0));
                        int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L) + 1321;
                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36;
                        byte b60 = $$a[7];
                        byte b61 = (byte) (b60 | 37);
                        Object[] objArr82 = new Object[1];
                        b(b60, b61, (short) (b61 | 66), objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cResolveSizeAndState2, packedPositionChild5, minimumFlingVelocity2, -1273706634, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char tapTimeout4 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 53893);
                        int i111 = 1321 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 37;
                        byte[] bArr18 = $$a;
                        byte b62 = (byte) (bArr18[205] + 1);
                        byte b63 = bArr18[7];
                        Object[] objArr83 = new Object[1];
                        b(b62, b63, (short) (b63 | 103), objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(tapTimeout4, i111, iLastIndexOf2, -1433084963, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr80 = objArr80;
                objArr7 = objArr7;
            }
            objArr8 = objArr80;
        }
        int i112 = ((int[]) objArr8[3])[0];
        int i113 = ((int[]) objArr8[0])[0];
        if (i113 != i112) {
            throw new RuntimeException(String.valueOf(i113));
        }
        Object[] objArr84 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i114 = ((int[]) objArr8[1])[0];
        int i115 = ((int[]) objArr8[0])[0];
        int i116 = ((int[]) objArr8[3])[0];
        String[] strArr15 = (String[]) objArr8[2];
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i117 = i114 + (((~((-389506230) | iIdentityHashCode5)) | 760077966) * 398) + 698618170 + (((~((~iIdentityHashCode5) | (-389506230))) | 760077966) * 398);
        int i118 = (i117 << 13) ^ i117;
        int i119 = i118 ^ (i118 >>> 17);
        ((int[]) objArr84[1])[0] = i119 ^ (i119 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
            byte b64 = $$a[7];
            byte b65 = (byte) (b64 | 37);
            Object[] objArr85 = new Object[1];
            b(b64, b65, (short) (b65 | 66), objArr85);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cKeyCodeFromString, iLastIndexOf3, scrollBarSize, -1650998592, false, (String) objArr85[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char cGreen = (char) Color.green(0);
            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
            byte b66 = $$a[7];
            byte b67 = (byte) (b66 | 52);
            Object[] objArr86 = new Object[1];
            b(b66, b67, (short) (b67 - 1), objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cGreen, windowTouchSlop2, maximumDrawingCacheSize2, 2012020043, false, (String) objArr86[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) << 52) >>> 52)) >> 12)) {
            int i120 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            TuitionPaymentFragmentbindingInflater1 = i120 % 128;
            int i121 = i120 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                int iAxisFromString = MotionEvent.axisFromString("") + 877;
                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                byte[] bArr19 = $$a;
                byte b68 = bArr19[7];
                Object[] objArr87 = new Object[1];
                b(b68, (byte) (b68 | 52), bArr19[5], objArr87);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cKeyCodeFromString2, iAxisFromString, trimmedLength, 2012931276, false, (String) objArr87[0], null);
            }
            Object[] objArr88 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr88[0])[0]}, new int[1], new int[]{((int[]) objArr88[2])[0]}, (String[]) objArr88[3]};
            int i122 = ~(System.identityHashCode(this) | 151869704);
            int i123 = (((((-262871612) | i122) * (-658)) + 223750100) + ((i122 | (-263150396)) * 658)) - 732074486;
            int i124 = (i123 << 13) ^ i123;
            int i125 = i124 ^ (i124 >>> 17);
            ((int[]) objArr9[1])[0] = i125 ^ (i125 << 5);
            str = str3;
        } else {
            Context applicationContext4 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            Object[] objArr89 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -732074486};
            byte[] bArr20 = $$d;
            Object[] objArr90 = new Object[1];
            c(bArr20[58], (short) 293, (byte) (bArr20[29] - 1), objArr90);
            Class<?> cls4 = Class.forName((String) objArr90[0]);
            byte b69 = bArr20[5];
            Object[] objArr91 = new Object[1];
            c(b69, (short) (b69 | 244), bArr20[112], objArr91);
            Object[] objArr92 = (Object[]) cls4.getMethod((String) objArr91[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr89);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char c7 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                    int offsetBefore2 = 10 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr21 = $$a;
                    byte b70 = bArr21[7];
                    Object[] objArr93 = new Object[1];
                    b(b70, (byte) (b70 | 52), bArr21[5], objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c7, iIndexOf5, offsetBefore2, 2012931276, false, (String) objArr93[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr92);
                try {
                    str = str3;
                    long jLongValue10 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iBlue = 876 - Color.blue(0);
                        int i126 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b71 = $$a[7];
                        byte b72 = (byte) (b71 | 52);
                        Object[] objArr94 = new Object[1];
                        b(b71, b72, (short) (b72 - 1), objArr94);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(edgeSlop, iBlue, i126, 2012020043, false, (String) objArr94[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char c8 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int scrollBarFadeDuration3 = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                        byte b73 = $$a[7];
                        byte b74 = (byte) (b73 | 37);
                        Object[] objArr95 = new Object[1];
                        b(b73, b74, (short) (b74 | 66), objArr95);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c8, scrollBarFadeDuration3, iMakeMeasureSpec2, -1650998592, false, (String) objArr95[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                str = str3;
                objArr92 = objArr92;
            }
            objArr9 = objArr92;
        }
        int i127 = ((int[]) objArr9[2])[0];
        int i128 = ((int[]) objArr9[0])[0];
        if (i128 == i127) {
            int i129 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iNextInt = new Random().nextInt();
            int i130 = ~iNextInt;
            int i131 = i129 + (-1499309700) + (((~(761766796 | i130)) | (-802077026) | (~((-761766797) | iNextInt))) * (-564)) + ((~(iNextInt | (-759603457))) * 1128) + (((~((-802077026) | i130)) | 2163340) * 564);
            int i132 = (i131 << 13) ^ i131;
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr10[1])[0] = i133 ^ (i133 << 5);
            i3 = 0;
        } else {
            int[] iArr3 = new int[i128];
            int i134 = i128 - 1;
            iArr3[i134] = 1;
            Toast.makeText((Context) null, iArr3[((i128 * i134) % 2) - 1], 1).show();
            int i135 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i136 = ~iElapsedRealtime;
            int i137 = (-482271852) + (((~((-40912999) | i136)) | (~((-269431706) | iElapsedRealtime))) * 520);
            int i138 = ~(269431705 | i136);
            int i139 = ~(iElapsedRealtime | 309741934);
            int i140 = i135 + i137 + ((i138 | i139) * (-1040)) + ((i139 | (~(i136 | (-309741935))) | (-310344704)) * 520);
            int i141 = (i140 << 13) ^ i140;
            int i142 = i141 ^ (i141 >>> 17);
            i3 = 0;
            ((int[]) objArr10[1])[0] = i142 ^ (i142 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char deadChar2 = (char) KeyEvent.getDeadChar(i3, i3);
            int iIndexOf6 = 875 - TextUtils.indexOf((CharSequence) "", '0');
            int iArgb2 = Color.argb(i3, i3, i3, i3) + 10;
            byte[] bArr22 = $$a;
            Object[] objArr96 = new Object[1];
            b(bArr22[205], bArr22[9], (short) DerHeader.TAG_CLASS_PRIVATE, objArr96);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(deadChar2, iIndexOf6, iArgb2, -1199417970, false, (String) objArr96[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
            int i143 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int modifierMetaStateMask3 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr23 = $$a;
            byte b75 = bArr23[33];
            byte b76 = bArr23[7];
            Object[] objArr97 = new Object[1];
            b(b75, b76, (short) (b76 | 202), objArr97);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(packedPositionType3, i143, modifierMetaStateMask3, 254769921, false, (String) objArr97[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int defaultSize3 = 876 - View.getDefaultSize(0, 0);
                int iIndexOf7 = 10 - TextUtils.indexOf("", "", 0);
                byte[] bArr24 = $$a;
                Object[] objArr98 = new Object[1];
                b(bArr24[205], bArr24[41], (short) 202, objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cResolveSize, defaultSize3, iIndexOf7, 1324201839, false, (String) objArr98[0], null);
            }
            Object[] objArr99 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr99[0])[0]}, new int[1], new int[]{((int[]) objArr99[2])[0]}, (String[]) objArr99[3]};
            int i144 = ~(((int) Runtime.getRuntime().maxMemory()) | 694602876);
            int i145 = (((((-261716700) | i144) * (-658)) + 1239857756) + ((i144 | (-805306112)) * 658)) - 1170917891;
            int i146 = (i145 << 13) ^ i145;
            int i147 = i146 ^ (i146 >>> 17);
            ((int[]) objArr11[1])[0] = i147 ^ (i147 << 5);
        } else {
            Object[] objArr100 = {Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), -1170917891};
            byte[] bArr25 = $$d;
            byte b77 = bArr25[58];
            short s2 = (short) DerHeader.TAG_CLASS_PRIVATE;
            Object[] objArr101 = new Object[1];
            c(b77, s2, (byte) (-bArr25[522]), objArr101);
            Class<?> cls5 = Class.forName((String) objArr101[0]);
            byte b78 = bArr25[5];
            Object[] objArr102 = new Object[1];
            c(b78, (short) (b78 | 330), bArr25[31], objArr102);
            Object[] objArr103 = (Object[]) cls5.getMethod((String) objArr102[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr100);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char c9 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i148 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i149 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr26 = $$a;
                Object[] objArr104 = new Object[1];
                b(bArr26[205], bArr26[41], (short) 202, objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c9, i148, i149, 1324201839, false, (String) objArr104[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr103);
            try {
                long jLongValue12 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char packedPositionType4 = (char) ExpandableListView.getPackedPositionType(0L);
                    int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                    int iMyTid3 = 10 - (Process.myTid() >> 22);
                    byte[] bArr27 = $$a;
                    byte b79 = bArr27[33];
                    byte b80 = bArr27[7];
                    Object[] objArr105 = new Object[1];
                    b(b79, b80, (short) (b80 | 202), objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(packedPositionType4, minimumFlingVelocity3, iMyTid3, 254769921, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                    int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr28 = $$a;
                    Object[] objArr106 = new Object[1];
                    b(bArr28[205], bArr28[9], s2, objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cAlpha, edgeSlop2, iResolveOpacity, -1199417970, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
                objArr11 = objArr103;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr11[0])[0] != ((int[]) objArr11[2])[0]) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr16 = (String[]) objArr11[3];
            if (strArr16 != null) {
                for (String str12 : strArr16) {
                    arrayList6.add(str12);
                }
            }
            throw null;
        }
        int i150 = ((int[]) objArr11[1])[0];
        Object[] objArr107 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i151 = i150 + 1805950972 + (((~((~iUptimeMillis) | (-537133585))) | (~((-234941452) | iUptimeMillis))) * (-302)) + ((~((-537133585) | iUptimeMillis)) * (-604)) + (((~(iUptimeMillis | (-772075036))) | (-1047326716)) * 302);
        int i152 = (i151 << 13) ^ i151;
        int i153 = i152 ^ (i152 >>> 17);
        ((int[]) objArr107[1])[0] = i153 ^ (i153 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
            int iResolveOpacity2 = 876 - Drawable.resolveOpacity(0, 0);
            int i154 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr29 = $$a;
            byte b81 = (byte) (bArr29[205] + 1);
            byte b82 = bArr29[7];
            Object[] objArr108 = new Object[1];
            b(b81, b82, (short) (b82 | 103), objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(deadChar3, iResolveOpacity2, i154, 252381699, false, (String) objArr108[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char c10 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iAxisFromString2 = MotionEvent.axisFromString("") + 877;
            int i155 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte b83 = $$a[7];
            Object[] objArr109 = new Object[1];
            b(b83, (byte) (b83 | 52), (short) 140, objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c10, iAxisFromString2, i155, 2009631821, false, (String) objArr109[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char keyRepeatTimeout4 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int windowTouchSlop3 = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                byte[] bArr30 = $$a;
                byte b84 = bArr30[54];
                byte b85 = bArr30[7];
                Object[] objArr110 = new Object[1];
                b(b84, b85, (short) (b85 | 209), objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(keyRepeatTimeout4, windowTouchSlop3, maximumDrawingCacheSize3, 256017550, false, (String) objArr110[0], null);
            }
            Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr12 = new Object[]{new int[]{((int[]) objArr111[0])[0]}, new int[1], new int[]{((int[]) objArr111[2])[0]}, (String[]) objArr111[3]};
            int iMyTid4 = Process.myTid();
            int i156 = (-110414582) + (((~((~iMyTid4) | 501964568)) | 33816643) * 529) + (((~(iMyTid4 | 501964568)) | 461654339) * 529) + 226106824;
            int i157 = (i156 << 13) ^ i156;
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr12[1])[0] = i158 ^ (i158 << 5);
            applicationContext = context;
        } else {
            applicationContext = context;
            Context applicationContext5 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            Object[] objArr112 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 226106824};
            byte[] bArr31 = $$d;
            Object[] objArr113 = new Object[1];
            c(bArr31[179], (short) 141, bArr31[14], objArr113);
            Class<?> cls6 = Class.forName((String) objArr113[0]);
            byte b86 = bArr31[5];
            Object[] objArr114 = new Object[1];
            c(b86, (short) (b86 | 123), bArr31[112], objArr114);
            Object[] objArr115 = (Object[]) cls6.getMethod((String) objArr114[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int maxKeyCode3 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                    int i159 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr32 = $$a;
                    byte b87 = bArr32[54];
                    byte b88 = bArr32[7];
                    Object[] objArr116 = new Object[1];
                    b(b87, b88, (short) (b88 | 209), objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf2, maxKeyCode3, i159, 256017550, false, (String) objArr116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr115);
                try {
                    long jLongValue14 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char mirror4 = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 876;
                        int scrollBarFadeDuration4 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b89 = $$a[7];
                        Object[] objArr117 = new Object[1];
                        b(b89, (byte) (b89 | 52), (short) 140, objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(mirror4, iResolveOpacity3, scrollBarFadeDuration4, 2009631821, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                        int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                        int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                        byte[] bArr33 = $$a;
                        byte b90 = (byte) (bArr33[205] + 1);
                        byte b91 = bArr33[7];
                        Object[] objArr118 = new Object[1];
                        b(b90, b91, (short) (b91 | 103), objArr118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf3, iIndexOf8, jumpTapTimeout4, 252381699, false, (String) objArr118[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr115 = objArr115;
            }
            objArr12 = objArr115;
        }
        int i160 = ((int[]) objArr12[2])[0];
        int i161 = ((int[]) objArr12[0])[0];
        if (i161 != i160) {
            throw new RuntimeException(String.valueOf(i161));
        }
        int i162 = ((int[]) objArr12[1])[0];
        Object[] objArr119 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
        int i163 = ~((-78194183) | startElapsedRealtime3);
        int i164 = ~startElapsedRealtime3;
        int i165 = i162 + 1688766182 + ((i163 | (~(921679743 | i164))) * 497) + (((~(startElapsedRealtime3 | 921679743)) | (~((-883795791) | i164)) | 805601608) * 497);
        int i166 = (i165 << 13) ^ i165;
        int i167 = i166 ^ (i166 >>> 17);
        ((int[]) objArr119[1])[0] = i167 ^ (i167 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char cResolveSizeAndState3 = (char) View.resolveSizeAndState(0, 0, 0);
            int iResolveSize = View.resolveSize(0, 0) + 651;
            int iMyPid = 44 - (Process.myPid() >> 22);
            byte b92 = $$a[7];
            Object[] objArr120 = new Object[1];
            b(b92, (byte) (b92 | 52), (short) 140, objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cResolveSizeAndState3, iResolveSize, iMyPid, -459846511, false, (String) objArr120[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char cGreen2 = (char) Color.green(0);
            int iAxisFromString3 = 650 - MotionEvent.axisFromString("");
            int maximumDrawingCacheSize4 = 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr34 = $$a;
            byte b93 = (byte) (bArr34[205] + 1);
            byte b94 = bArr34[7];
            Object[] objArr121 = new Object[1];
            b(b93, b94, (short) (b94 | 103), objArr121);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cGreen2, iAxisFromString3, maximumDrawingCacheSize4, -873460649, false, (String) objArr121[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char c11 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int pressedStateDuration5 = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                int threadPriority = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b95 = $$a[7];
                byte b96 = (byte) (b95 | 37);
                Object[] objArr122 = new Object[1];
                b(b95, b96, (short) (b96 | 66), objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c11, pressedStateDuration5, threadPriority, -1595579076, false, (String) objArr122[0], null);
            }
            Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr13 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i168 = ((int[]) objArr123[2])[0];
            int i169 = ((int[]) objArr123[0])[0];
            int i170 = ~((int) Process.getElapsedCpuTime());
            int i171 = ~(15725987 | i170);
            int i172 = 740345789 + ((i171 | (-12295178)) * 764) + (((~(i170 | (-12295178))) | 11244545) * (-1528)) + (((-5532075) | i171) * 764) + 754614616;
            int i173 = (i172 << 13) ^ i172;
            int i174 = i173 ^ (i173 >>> 17);
            ((int[]) objArr13[3])[0] = i174 ^ (i174 << 5);
            c = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) Drawable.resolveOpacity(0, 0), 1609 - ExpandableListView.getPackedPositionChild(0L), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr124 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(null), 754614616, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char packedPositionType5 = (char) ExpandableListView.getPackedPositionType(0L);
                int iGreen3 = Color.green(0) + 651;
                int gidForName2 = Process.getGidForName("") + 45;
                byte[] bArr35 = $$a;
                byte b97 = (byte) (bArr35[205] + 1);
                byte b98 = bArr35[7];
                Object[] objArr125 = new Object[1];
                b(b97, b98, (short) (b98 | 103), objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(packedPositionType5, iGreen3, gidForName2, 2075921419, false, (String) objArr125[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), 695 - Color.blue(0), View.combineMeasuredStates(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 793 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 83 - View.MeasureSpec.getMode(0)), Integer.TYPE, Integer.TYPE});
            }
            objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).invoke(null, objArr124);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i175 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 650;
                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 44;
                byte b99 = $$a[7];
                byte b100 = (byte) (b99 | 37);
                Object[] objArr126 = new Object[1];
                b(b99, b100, (short) (b100 | 66), objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(scrollDefaultDelay, i175, edgeSlop3, -1595579076, false, (String) objArr126[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr13);
            try {
                long jLongValue16 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int i176 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                    int packedPositionType6 = ExpandableListView.getPackedPositionType(0L) + 44;
                    byte[] bArr36 = $$a;
                    byte b101 = (byte) (bArr36[205] + 1);
                    byte b102 = bArr36[7];
                    Object[] objArr127 = new Object[1];
                    b(b101, b102, (short) (b102 | 103), objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(threadPriority2, i176, packedPositionType6, -873460649, false, (String) objArr127[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 651;
                    int iRgb3 = (-16777172) - Color.rgb(0, 0, 0);
                    byte b103 = $$a[7];
                    Object[] objArr128 = new Object[1];
                    b(b103, (byte) (b103 | 52), (short) 140, objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cLastIndexOf2, threadPriority3, iRgb3, -459846511, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                c = 0;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i177 = ((int[]) objArr13[c])[c];
        int i178 = ((int[]) objArr13[2])[c];
        if (i178 == i177) {
            int i179 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentbindingInflater1 = i179 % 128;
            int i180 = i179 % 2;
            Object[] objArr129 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i181 = ((int[]) objArr13[3])[0];
            int i182 = ((int[]) objArr13[2])[0];
            int i183 = ((int[]) objArr13[0])[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i184 = i181 + 1745876209 + (((~(868208169 | iIdentityHashCode6)) | 12422 | (~((-864777360) | iIdentityHashCode6))) * (-744)) + (((~iIdentityHashCode6) | 3443232) * 744) + ((iIdentityHashCode6 | (-12423)) * 744);
            int i185 = i184 ^ (i184 << 13);
            int i186 = i185 ^ (i185 >>> 17);
            ((int[]) objArr129[3])[0] = i186 ^ (i186 << 5);
            objArr14 = objArr129;
            i4 = 0;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr13[1];
            if (strArr17 != null) {
                for (String str13 : strArr17) {
                    arrayList7.add(str13);
                }
            }
            Toast.makeText((Context) null, i178 / (((i178 - 1) * i178) % 2), 0).show();
            objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i187 = ((int[]) objArr13[3])[0];
            int i188 = ((int[]) objArr13[2])[0];
            int i189 = ((int[]) objArr13[0])[0];
            int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
            int i190 = ~startElapsedRealtime4;
            int i191 = ~(980055916 | i190);
            int i192 = i187 + (-1584053663) + (((-981368831) | i191) * (-712)) + (((~(startElapsedRealtime4 | (-1312915))) | (~(i190 | 981368830))) * (-712)) + ((976625106 | i191) * 712);
            int i193 = i192 ^ (i192 << 13);
            int i194 = i193 ^ (i193 >>> 17);
            i4 = 0;
            ((int[]) objArr14[3])[0] = i194 ^ (i194 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char offsetAfter3 = (char) TextUtils.getOffsetAfter("", i4);
            int size = View.MeasureSpec.getSize(i4) + 2267;
            int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 33;
            byte b104 = $$a[7];
            byte b105 = (byte) (b104 | 52);
            Object[] objArr130 = new Object[1];
            b(b104, b105, (short) (b105 - 1), objArr130);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(offsetAfter3, size, windowTouchSlop4, -887667012, false, (String) objArr130[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char packedPositionChild6 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int defaultSize4 = 2267 - View.getDefaultSize(0, 0);
                int iRgb4 = (-16777183) - Color.rgb(0, 0, 0);
                byte b106 = $$a[7];
                byte b107 = (byte) (b106 | 37);
                Object[] objArr131 = new Object[1];
                b(b106, b107, (short) (b107 | 66), objArr131);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(packedPositionChild6, defaultSize4, iRgb4, -654680577, false, (String) objArr131[0], null);
            }
            Object[] objArr132 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr15 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i195 = ((int[]) objArr132[0])[0];
            int i196 = ((int[]) objArr132[3])[0];
            String[] strArr18 = (String[]) objArr132[1];
            int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
            int i197 = ~startUptimeMillis4;
            int i198 = ((((((~(160022704 | i197)) | (~((-968736021) | startUptimeMillis4))) | (~(i197 | 968736020))) * 959) - 1669108186) + (((~(startUptimeMillis4 | 968736020)) | ((~(i197 | (-968736021))) | (~(160022704 | startUptimeMillis4)))) * 959)) - 943720749;
            int i199 = (i198 << 13) ^ i198;
            int i200 = i199 ^ (i199 >>> 17);
            ((int[]) objArr15[2])[0] = i200 ^ (i200 << 5);
        } else {
            if (applicationContext != null) {
                int i201 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                TuitionPaymentFragmentbindingInflater1 = i201 % 128;
                if (i201 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            Object[] objArr133 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, -943720749};
            byte[] bArr37 = $$d;
            byte b108 = bArr37[58];
            short s3 = (short) (-bArr37[496]);
            Object[] objArr134 = new Object[1];
            c(b108, s3, (byte) s3, objArr134);
            Class<?> cls7 = Class.forName((String) objArr134[0]);
            byte b109 = bArr37[497];
            short s4 = bArr37[5];
            Object[] objArr135 = new Object[1];
            c(b109, s4, (byte) s4, objArr135);
            objArr15 = (Object[]) cls7.getMethod((String) objArr135[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr133);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char c12 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                    int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 34;
                    byte b110 = $$a[7];
                    byte b111 = (byte) (b110 | 37);
                    Object[] objArr136 = new Object[1];
                    b(b110, b111, (short) (b111 | 66), objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c12, scrollBarSize2, bitsPerPixel4, -654680577, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr15);
                try {
                    long jLongValue17 = ((Long) Class.forName(str2).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                        int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                        int deadChar4 = KeyEvent.getDeadChar(0, 0) + 33;
                        byte[] bArr38 = $$a;
                        byte b112 = bArr38[7];
                        Object[] objArr137 = new Object[1];
                        b(b112, (byte) (b112 | 52), bArr38[5], objArr137);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(trimmedLength2, scrollBarSize3, deadChar4, -874156483, false, (String) objArr137[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char cIndexOf4 = (char) TextUtils.indexOf("", "");
                        int i202 = 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int scrollBarSize4 = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b113 = $$a[7];
                        byte b114 = (byte) (b113 | 52);
                        Object[] objArr138 = new Object[1];
                        b(b113, b114, (short) (b114 - 1), objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cIndexOf4, i202, scrollBarSize4, -887667012, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i203 = ((int[]) objArr15[3])[0];
        int i204 = ((int[]) objArr15[0])[0];
        if (i204 == i203) {
            objArr16 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i205 = ((int[]) objArr15[2])[0];
            int i206 = ((int[]) objArr15[0])[0];
            int i207 = ((int[]) objArr15[3])[0];
            String[] strArr19 = (String[]) objArr15[1];
            int i208 = (int) Runtime.getRuntime().totalMemory();
            int i209 = ~i208;
            int i210 = i205 + 1145604711 + (((~((-370386965) | i209)) | (-438326352) | (~(370386964 | i208))) * (-564)) + ((~(i208 | (-136336460))) * 1128) + (((~((-438326352) | i209)) | (-506723424)) * 564);
            int i211 = (i210 << 13) ^ i210;
            int i212 = i211 ^ (i211 >>> 17);
            ((int[]) objArr16[2])[0] = i212 ^ (i212 << 5);
            i5 = 2;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr15[1];
            if (strArr20 != null) {
                for (String str14 : strArr20) {
                    arrayList8.add(str14);
                }
            }
            Toast.makeText((Context) null, i204 / (((i204 - 1) * i204) % 2), 0).show();
            objArr16 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i213 = ((int[]) objArr15[2])[0];
            int i214 = ((int[]) objArr15[0])[0];
            int i215 = ((int[]) objArr15[3])[0];
            String[] strArr21 = (String[]) objArr15[1];
            int iMyPid2 = Process.myPid();
            int i216 = i213 + ((((~((-105422850) | iMyPid2)) | 696468034) * 449) - 1939542242) + (((~((~iMyPid2) | (-105422850))) | 696468034) * 449);
            int i217 = (i216 << 13) ^ i216;
            int i218 = i217 ^ (i217 >>> 17);
            i5 = 2;
            ((int[]) objArr16[2])[0] = i218 ^ (i218 << 5);
        }
        if (intent == null) {
            int i219 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i219 % 128;
            int i220 = i219 % i5;
            zzgs zzgsVarZze = this.zza.zzaV().zze();
            String strConcat = "2,20,".concat("App receiver called with null intent");
            int i221 = ((int[]) objArr10[1])[0];
            int i222 = i221 * i221;
            int i223 = -(1290849067 * i221);
            int i224 = ((i222 | i223) << 1) - (i222 ^ i223);
            int i225 = -(i221 * 252227891);
            int i226 = ((i224 | i225) << 1) - (i225 ^ i224);
            int i227 = ((i226 | 2144455841) << 1) - (2144455841 ^ i226);
            int i228 = ((i227 >> 27) - 63) / 32;
            int i229 = (i228 & 1) + (i228 | 1);
            int i230 = (i227 ^ i229) + ((i229 & i227) << 1);
            int i231 = ((i227 >> 24) - 511) / 256;
            int i232 = (-(i230 ^ ((i231 & 1) + (i231 | 1)))) + 8;
            int i233 = ((i232 >> 29) - 15) / 8;
            zzgsVarZze.zza(strConcat.substring(75520 / ((i232 & (-(((i233 & 1) + (i233 | 1)) + 1))) * 1888)));
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.zza.zzaV().zze().zza("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            int i234 = ((int[]) objArr55[0])[0];
            int i235 = ((i234 * i234) - (~(-(1754290899 * i234)))) - 1;
            int i236 = -(i234 * 39534965);
            int i237 = (i235 ^ i236) + ((i235 & i236) << 1);
            int i238 = (i237 & (-85592816)) + ((-85592816) | i237);
            int i239 = i238 >> 27;
            int i240 = ((i239 & (-63)) + (i239 | (-63))) / 32;
            int i241 = (i238 - (~(((i240 | 1) << 1) - (i240 ^ 1)))) - 1;
            int i242 = i238 >> 29;
            int i243 = ((i242 ^ (-15)) + ((i242 & (-15)) << 1)) / 8;
            int i244 = -(i241 ^ ((i243 ^ 1) + ((i243 & 1) << 1)));
            int i245 = (i244 ^ 6) + ((i244 & 6) << 1);
            int i246 = i245 >> 15;
            int i247 = (((i246 ^ (-262143)) + ((i246 & (-262143)) << 1)) / 131072) + 1;
            int i248 = 2142903564 / (((-((i247 ^ 1) + ((i247 & 1) << 1))) & i245) * 2);
            int i249 = ((int[]) objArr7[3])[0];
            int i250 = ((((i249 * i249) - (~(-(824070938 * i249)))) - 1) - (~(-(i249 * 2052194876)))) - 1;
            int i251 = ((i250 | (-353595847)) << 1) - (i250 ^ (-353595847));
            int i252 = i251 >> 21;
            int i253 = ((i252 ^ (-4095)) + ((i252 & (-4095)) << 1)) / 2048;
            int i254 = (i253 & 1) + (i253 | 1);
            int i255 = (i251 ^ i254) + ((i254 & i251) << 1);
            int i256 = i251 >> 17;
            int i257 = -(i255 ^ ((((i256 ^ (-65535)) + ((i256 & (-65535)) << 1)) / 32768) + 1));
            int i258 = (i257 & 2) + (i257 | 2);
            int i259 = i258 >> 18;
            int i260 = (((i259 | (-32767)) << 1) - (i259 ^ (-32767))) / 16384;
            int i261 = (i260 & 1) + (i260 | 1);
            if (iHashCode != i248 + (1319006904 / (((-(((i261 | 1) << 1) - (i261 ^ 1))) & i258) * 4)) + 936432224) {
                i6 = -1;
            } else {
                String strConcat2 = "22|31|15|22|".concat("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                int i262 = ((int[]) objArr107[1])[0];
                int i263 = i262 * i262;
                int i264 = -(170893793 * i262);
                int i265 = (i263 & i264) + (i263 | i264);
                int i266 = -(i262 * 1837465123);
                int i267 = (i265 & i266) + (i266 | i265);
                int i268 = (i267 & (-2140520444)) + ((-2140520444) | i267);
                int i269 = i268 >> 17;
                int i270 = ((((i269 | (-65535)) << 1) - (i269 ^ (-65535))) / 32768) + 1;
                int i271 = ((i268 | i270) << 1) - (i270 ^ i268);
                int i272 = ((i268 >> 23) - 1023) / 512;
                int i273 = -(i271 ^ (((i272 | 1) << 1) - (i272 ^ 1)));
                int i274 = ((i273 | 6) << 1) - (i273 ^ 6);
                int i275 = ((i274 >> 26) + ComposerKt.defaultsKey) / 64;
                if (action.equals(strConcat2.substring(113040 / (((-(((i275 & 1) + (i275 | 1)) + 1)) & i274) * 1570)))) {
                    int i276 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                    TuitionPaymentFragmentbindingInflater1 = i276 % 128;
                    int i277 = i276 % 2;
                    int i278 = ((int[]) objArr44[1])[0];
                    int i279 = i278 * i278;
                    int i280 = -(715646067 * i278);
                    int i281 = (((i279 & i280) + (i279 | i280)) - (~(-(i278 * (-1147158345))))) - 1;
                    int i282 = (i281 ^ 536267449) + ((536267449 & i281) << 1);
                    int i283 = i282 >> 28;
                    int i284 = ((i283 & (-31)) + (i283 | (-31))) / 16;
                    int i285 = (i284 ^ 1) + ((i284 & 1) << 1);
                    int i286 = (i282 & i285) + (i285 | i282);
                    int i287 = i282 >> 19;
                    int i288 = (((i287 | (-16383)) << 1) - (i287 ^ (-16383))) / 8192;
                    int i289 = -((((i288 | 1) << 1) - (i288 ^ 1)) ^ i286);
                    int i290 = (i289 & 4) + (i289 | 4);
                    int i291 = i290 >> 29;
                    int i292 = ((i291 & (-15)) + (i291 | (-15))) / 8;
                    int i293 = (i292 & 1) + (i292 | 1);
                    i6 = 2484 / (((-((i293 ^ 1) + ((i293 & 1) << 1))) & i290) * 621);
                } else {
                    i6 = -1;
                }
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            int i294 = ((int[]) objArr66[0])[0];
            int i295 = ((i294 * i294) - (~(-(1441795546 * i294)))) - 1;
            int i296 = -(i294 * (-1289487512));
            int i297 = (((i295 | i296) << 1) - (i295 ^ i296)) - (-94989633);
            int i298 = i297 >> 26;
            int i299 = (((i298 | ComposerKt.defaultsKey) << 1) - (i298 ^ ComposerKt.defaultsKey)) / 64;
            int i300 = (-(((i297 - (~(((i299 | 1) << 1) - (i299 ^ 1)))) - 1) ^ ((((i297 >> 20) - 8191) / 4096) + 1))) + 1;
            int i301 = i300 >> 20;
            int i302 = 799240 / ((i300 & (-((((i301 ^ (-8191)) + ((i301 & (-8191)) << 1)) / 4096) + 2))) * 1060);
            int i303 = ((int[]) objArr84[1])[0];
            int i304 = i303 * i303;
            int i305 = -(1926224525 * i303);
            int i306 = (i304 & i305) + (i304 | i305);
            int i307 = -(i303 * (-750489465));
            int i308 = (i306 ^ i307) + ((i307 & i306) << 1);
            int i309 = ((i308 | (-1337381276)) << 1) - ((-1337381276) ^ i308);
            int i310 = i309 >> 18;
            int i311 = ((i310 & (-32767)) + (i310 | (-32767))) / 16384;
            int i312 = ((i311 | 1) << 1) - (i311 ^ 1);
            int i313 = ((i309 | i312) << 1) - (i312 ^ i309);
            int i314 = i309 >> 16;
            int i315 = ((i314 ^ (-131071)) + (((-131071) & i314) << 1)) / 65536;
            int i316 = -(((i315 & 1) + (i315 | 1)) ^ i313);
            int i317 = (i316 ^ 3) + ((i316 & 3) << 1);
            int i318 = i317 >> 25;
            int i319 = ((i318 ^ (-255)) + ((i318 & (-255)) << 1)) / 128;
            int i320 = (i319 ^ 1) + ((i319 & 1) << 1);
            i6 = i302 + ((-2004132) / (((-((i320 & 1) + (i320 | 1))) & i317) * 886));
        } else {
            i6 = -1;
        }
        if (i6 == 0) {
            zzic zzicVar = this.zza;
            zzqp.zza();
            if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
                zzicVar.zzaV().zzk().zza("App receiver notified triggers are available");
                zzicVar.zzaW().zzj(new zzu(zzicVar));
                return;
            }
            return;
        }
        int i321 = ((int[]) objArr2[2])[0];
        int i322 = i321 * i321;
        int i323 = -(1777540515 * i321);
        int i324 = (i322 & i323) + (i322 | i323);
        int i325 = -(i321 * (-1543904315));
        int i326 = (i324 & i325) + (i325 | i324);
        int i327 = (i326 & 178552464) + (178552464 | i326);
        int i328 = i327 >> 26;
        int i329 = ((i328 ^ ComposerKt.defaultsKey) + ((i328 & ComposerKt.defaultsKey) << 1)) / 64;
        int i330 = (i329 & 1) + (i329 | 1);
        int i331 = (i327 ^ i330) + ((i330 & i327) << 1);
        int i332 = ((i327 >> 18) - 32767) / 16384;
        int i333 = -(i331 ^ ((i332 & 1) + (i332 | 1)));
        int i334 = (i333 ^ 5) + ((i333 & 5) << 1);
        int i335 = i334 >> 25;
        int i336 = ((i335 & (-255)) + (i335 | (-255))) / 128;
        int i337 = (i336 ^ 1) + ((i336 & 1) << 1);
        if (i6 != 1220 / (((-(((i337 | 1) << 1) - (i337 ^ 1))) & i334) * 244)) {
            this.zza.zzaV().zze().zza("App receiver called with unknown action");
            return;
        }
        zzic zzicVar2 = this.zza;
        zzgs zzgsVarZzk = zzicVar2.zzaV().zzk();
        String strConcat3 = "22|10|".concat("[sgtm] App Receiver notified batches are available");
        int i338 = ((int[]) objArr119[1])[0];
        int i339 = ((i338 * i338) - (~(-(625246552 * i338)))) - 1;
        int i340 = -(i338 * (-865465426));
        int i341 = (i339 ^ i340) + ((i340 & i339) << 1);
        int i342 = (i341 ^ 1400235785) + ((1400235785 & i341) << 1);
        int i343 = i342 >> 19;
        int i344 = ((i343 & (-16383)) + (i343 | (-16383))) / 8192;
        int i345 = (i342 - (~(((i344 | 1) << 1) - (i344 ^ 1)))) - 1;
        int i346 = i342 >> 27;
        int i347 = -(i345 ^ (((((i346 | (-63)) << 1) - (i346 ^ (-63))) / 32) + 1));
        int i348 = (i347 & 8) + (i347 | 8);
        int i349 = i348 >> 16;
        int i350 = ((i349 & (-131071)) + (i349 | (-131071))) / 65536;
        int i351 = (i350 ^ 1) + ((i350 & 1) << 1);
        int i352 = 2650624 / (((-((i351 ^ 1) + ((i351 & 1) << 1))) & i348) * 1984);
        int i353 = ((int[]) objArr14[3])[0];
        int i354 = i353 * i353;
        int i355 = -(1389846270 * i353);
        int i356 = (i354 ^ i355) + ((i354 & i355) << 1);
        int i357 = -(i353 * 838232258);
        int i358 = ((i356 ^ i357) + ((i357 & i356) << 1)) - 514391040;
        int i359 = i358 >> 25;
        int i360 = (((i359 ^ (-255)) + ((i359 & (-255)) << 1)) / 128) + 1;
        int i361 = (i358 ^ i360) + ((i360 & i358) << 1);
        int i362 = ((i358 >> 28) - 31) / 16;
        int i363 = -(i361 ^ (((i362 | 1) << 1) - (i362 ^ 1)));
        int i364 = (i363 ^ 8) + ((i363 & 8) << 1);
        int i365 = i364 >> 20;
        int i366 = (((i365 | (-8191)) << 1) - (i365 ^ (-8191))) / 4096;
        int i367 = (i366 ^ 1) + ((i366 & 1) << 1);
        int i368 = i352 + (2030184 / (((-(((i367 | 1) << 1) - (i367 ^ 1))) & i364) * 351));
        int i369 = ((int[]) objArr16[2])[0];
        int i370 = i369 * i369;
        int i371 = -(1179153622 * i369);
        int i372 = (((i370 ^ i371) + ((i370 & i371) << 1)) - (~(-(i369 * (-2069223884))))) - 1;
        int i373 = ((i372 | 1362315033) << 1) - (1362315033 ^ i372);
        int i374 = i373 >> 24;
        int i375 = ((i374 & (-511)) + (i374 | (-511))) / 256;
        int i376 = (i375 ^ 1) + ((i375 & 1) << 1);
        int i377 = ((i373 | i376) << 1) - (i376 ^ i373);
        int i378 = i373 >> 23;
        int i379 = (((i378 | (-1023)) << 1) - (i378 ^ (-1023))) / 512;
        int i380 = -(((i379 & 1) + (i379 | 1)) ^ i377);
        int i381 = (i380 & 8) + (i380 | 8);
        int i382 = i381 >> 17;
        int i383 = ((i382 & (-65535)) + (i382 | (-65535))) / 32768;
        int i384 = (i383 ^ 1) + ((i383 & 1) << 1);
        zzgsVarZzk.zza(strConcat3.substring(i368 + ((-2850016) / (((-((i384 ^ 1) + ((i384 & 1) << 1))) & i381) * TypedValues.CycleType.TYPE_ALPHA))));
        zzicVar2.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza();
            }
        });
    }

    static {
        byte[] bArr = new byte[528];
        System.arraycopy("]³\u0002=ò\u0000=Ëïþû\u000bøñ\u0012ñBÃùø\rñ\u0002\u000bó<ëùß2µ%\r÷%áùã.¶$\r÷Ý\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007öAò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034À\u0001\u0005î\u000fí\u0007\u0002ðC¼\u0002\tüüðCÃùø\rñ\u0002\u000bó<²þ\f\u0007ò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034ÅøøCÃùø\rñ\u0002\u000bó<¿ÿÿ\u0000ó\u0013ç\u000bô\bøÿ\rúò\u0000þüÿ>²þ\rüÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õø\u0010÷ù\bùù\u0005\u001cÙ\u0006ø\të\rñ?ò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034À\u0001\u0005î\u000fí\u0007\u0002ðC¼\u0002\tüüðCÃùø\rñ\u0002\u000bó<²þ\u0016ï\u000bÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö?ò\u0000=Êð\u0004õý\u0007ôEÈ\u0001ë\u0011ý÷ù\bùù\u00057ëÜí\tñ\u000bóù4Òÿø\u0011üí/Üõø\rñ.×ù\bùù\u0005\u0000ï#Ý\tõ\u0003ù\u0005#Ôû\nö\u0004ñLÀÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö@ò\u0000=È\u0001ë\u0011ûó\u00067Ëñ\bð\u0001\u0004\u00034ºû\u0006=Ãùø\rñ\u0002\u000bó<Èó\u0000\nöù>¹\u000eòý\t5ÚÛ\u0006\u0015ë\u0002ì\"îòý\t?º\u0005ñ\bö\u0005\u001eÍ\u000fõøNñ".getBytes("ISO-8859-1"), 0, bArr, 0, 528);
        $$d = bArr;
        $$e = 81;
        $$a = new byte[]{42, -104, -68, 105, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 100;
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{60041, 60052, 60045, 60098, 60048, 60054, 60108, 60105, 60111, 60043, 60107, 60056, 60083, 60104, 60049, 60099, 60110, 60051, 60050, 60062, 60072, 60055, 60034, 60088, 60058, 60061, 60106, 60109, 60047, 60073, 60060, 60040, 60117, 60057, 60053, 60063};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57191;
    }

    private static String $$g(int i, int i2, byte b) {
        int i3 = 3 - (b * 3);
        int i4 = 116 - i;
        int i5 = i2 * 2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i3;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i7];
            i3 = i7;
            i6 = i8;
        }
    }
}
