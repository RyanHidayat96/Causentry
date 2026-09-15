package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgk extends zzmb implements zznn {
    private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
    private static final int $$d = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, 27, 2, 54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 199;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47361, 47412, 47422, 47408, 47411, 47417, 47348, 47407, 47375, 47401, 47406, 47421, 47413, 47391, 47414, 47423, 47415, 47410, 47376};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719586;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean b = true;

    /* synthetic */ zzgk(byte[] bArr) {
        super(zzgl.zzu);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r5 = r5 * 14
            int r5 = r5 + 84
            int r0 = 53 - r6
            byte[] r1 = com.google.android.gms.internal.measurement.zzgk.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgk.a(byte, int, short, java.lang.Object[]):void");
    }

    public final int zza() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iZzf = ((zzgl) this.zza).zzf();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iZzf;
    }

    public final zzgj zzb(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        zzgj zzgjVarZzg = ((zzgl) this.zza).zzg(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return zzgjVarZzg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List zzd() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Collections.unmodifiableList(((zzgl) this.zza).zzh());
            throw null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(((zzgl) this.zza).zzh());
        int i3 = asBinder + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return listUnmodifiableList;
    }

    public final List zzg() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List listUnmodifiableList = Collections.unmodifiableList(((zzgl) this.zza).zzk());
        int i4 = asBinder + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return listUnmodifiableList;
    }

    public final zzgk zzc(int i, zzgi zzgiVar) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzaX();
        ((zzgl) this.zza).zzt(i, (zzgj) zzgiVar.zzbc());
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final zzgk zze() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zzaX();
            ((zzgl) this.zza).zzu();
            obj.hashCode();
            throw null;
        }
        zzaX();
        ((zzgl) this.zza).zzu();
        int i3 = asBinder + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final zzgk zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzaX();
        ((zzgl) this.zza).zzv();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cArr2 != null) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Drawable.resolveOpacity(0, 0)), 2994 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - Color.green(0), 1182129903, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.combineMeasuredStates(0, 0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 252, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i6 = 33602;
            int i7 = 1687675375;
            if (b) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + i6), Process.getGidForName("") + 3086, Color.blue(0) + 26, -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i6 = 33602;
                    i7 = 1687675375;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i8 = $11 + 55;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 33602), 3085 - Color.green(0), 26 - View.combineMeasuredStates(0, 0), -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String zzh() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i4 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 44;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, i4, fadingEdgeLength, -459846511, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int packedPositionGroup2 = 651 - ExpandableListView.getPackedPositionGroup(0L);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 44;
            byte b4 = $$a[80];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) 52, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionGroup2, capsMode, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int tapTimeout = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                byte[] bArr = $$a;
                byte b5 = bArr[7];
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 15), bArr[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, tapTimeout, jumpTapTimeout, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = (int) Runtime.getRuntime().totalMemory();
            int i8 = ~((-4235981) | i7);
            int i9 = ~i7;
            int i10 = 1142053825 + ((i8 | (~(953151486 | i9))) * 920) + (((~((-952346317) | i9)) | 4235980) * 920) + (((~(i7 | 953151486)) | (~((-4235981) | i9)) | (~((-948110337) | i7))) * 920) + 1087650571;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.blue(0), 1610 - (KeyEvent.getMaxKeyCode() >> 16), View.resolveSizeAndState(0, 0, 0) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1087650571, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                    int tapTimeout2 = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iIndexOf = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte b6 = $$a[80];
                    Object[] objArr9 = new Object[1];
                    a(b6, (byte) 52, b6, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode2, tapTimeout2, iIndexOf, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), AndroidCharacter.getMirror('0') + 647, (ViewConfiguration.getScrollBarSize() >> 8) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myPid() >> 22) + 63406), 793 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 82 - ExpandableListView.getPackedPositionChild(0L)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int longPressTimeout = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                    byte[] bArr2 = $$a;
                    byte b7 = bArr2[7];
                    Object[] objArr11 = new Object[1];
                    a(b7, (byte) (b7 | 15), bArr2[80], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, longPressTimeout, doubleTapTimeout, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(null, null, 127 - KeyEvent.getDeadChar(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iAlpha = 651 - Color.alpha(0);
                        int i13 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b8 = $$a[80];
                        Object[] objArr14 = new Object[1];
                        a(b8, (byte) 52, b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iAlpha, i13, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int i14 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int fadingEdgeLength2 = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr15 = new Object[1];
                        a(b9, b10, b10, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, i14, fadingEdgeLength2, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode;
            int i21 = (~((-294947186) | i20)) | 9732128;
            int i22 = ~(iIdentityHashCode | (-6301319));
            int i23 = i17 + 593991769 + ((i21 | i22) * (-502)) + ((i22 | (~(i20 | (-285215058)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i26 = 0;
                while (i26 < strArr.length) {
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    asBinder = i27 % 128;
                    if (i27 % 2 == 0) {
                        arrayList.add(strArr[i26]);
                        i26 += 18;
                    } else {
                        arrayList.add(strArr[i26]);
                        i26++;
                    }
                }
            }
            int[] iArr = new int[i16];
            int i28 = i16 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i28) % 2) - 1], 1).show();
            Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ~new Random().nextInt(751050300);
            int i33 = i29 + ((((-1450826635) + (((~((-13369607) | i32)) | 16800416) * (-828))) + ((i32 | (-13369607)) * (-828))) - 1814868120);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr17[3])[0] = i35 ^ (i35 << 5);
        }
        String strZzm = ((zzgl) this.zza).zzm();
        int i36 = asBinder + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i36 % 128;
        if (i36 % 2 == 0) {
            return strZzm;
        }
        obj.hashCode();
        throw null;
    }

    private zzgk() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, int r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 + 67
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = com.google.android.gms.internal.measurement.zzgk.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgk.$$e(short, int, byte):java.lang.String");
    }
}
