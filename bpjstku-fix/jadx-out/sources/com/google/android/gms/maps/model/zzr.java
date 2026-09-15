package com.google.android.gms.maps.model;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class zzr implements Parcelable.Creator {
    private static final byte[] $$c = {84, 10, 24, -102};
    private static final int $$d = 39;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -115, 48, 84};
    private static final int $$b = 52;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6672363159181406692L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r6 = r6 * 4
            int r6 = 98 - r6
            byte[] r0 = com.google.android.gms.maps.model.zzr.$$a
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzr.b(int, byte, int, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        PinConfig[] pinConfigArr = new PinConfig[i];
        if (i3 % 2 != 0) {
            int i5 = 40 / 0;
        }
        int i6 = i4 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
        return pinConfigArr;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
            i = 1;
        } else {
            iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
            i = 0;
        }
        int i4 = i;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        PinConfig.Glyph glyph = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                int i7 = TuitionPaymentFragmentbindingInflater1;
                int i8 = i7 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                int i9 = i8 % 2;
                if (fieldId == 3) {
                    i = SafeParcelReader.readInt(parcel, header);
                } else if (fieldId != 4) {
                    int i10 = i7 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % 2;
                    SafeParcelReader.skipUnknownField(parcel, header);
                    int i12 = TuitionPaymentFragmentbindingInflater1 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    glyph = (PinConfig.Glyph) SafeParcelReader.createParcelable(parcel, header, PinConfig.Glyph.CREATOR);
                    int i14 = TuitionPaymentFragmentbindingInflater1 + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                }
            } else {
                i4 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PinConfig(i4, i, glyph);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
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
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 64838), 1355 - TextUtils.lastIndexOf("", '0', 0), 38 - TextUtils.getOffsetBefore("", 0), 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0, 0)), 468 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 13 - TextUtils.getCapsMode("", 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 123;
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
        int i8 = $10 + 95;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 24 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0451  */
    /* JADX WARN: Code duplicated, block: B:101:0x0458  */
    /* JADX WARN: Code duplicated, block: B:104:0x046e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0474  */
    /* JADX WARN: Code duplicated, block: B:110:0x0483  */
    /* JADX WARN: Code duplicated, block: B:123:0x0502  */
    /* JADX WARN: Code duplicated, block: B:124:0x0518  */
    /* JADX WARN: Code duplicated, block: B:80:0x0389 A[Catch: Exception -> 0x04a2, TRY_LEAVE, TryCatch #9 {Exception -> 0x04a2, blocks: (B:66:0x0344, B:69:0x0371, B:71:0x0378, B:80:0x0389, B:86:0x03c2, B:89:0x03d9, B:92:0x03fe, B:94:0x0427, B:108:0x047c, B:109:0x0482, B:113:0x0494, B:114:0x0497, B:118:0x049b, B:119:0x04a1, B:77:0x0380, B:81:0x0393, B:85:0x03b4, B:111:0x0486, B:93:0x0408), top: B:151:0x0344, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x03d9 A[Catch: Exception -> 0x04a2, TRY_ENTER, TryCatch #9 {Exception -> 0x04a2, blocks: (B:66:0x0344, B:69:0x0371, B:71:0x0378, B:80:0x0389, B:86:0x03c2, B:89:0x03d9, B:92:0x03fe, B:94:0x0427, B:108:0x047c, B:109:0x0482, B:113:0x0494, B:114:0x0497, B:118:0x049b, B:119:0x04a1, B:77:0x0380, B:81:0x0393, B:85:0x03b4, B:111:0x0486, B:93:0x0408), top: B:151:0x0344, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x03fe A[Catch: Exception -> 0x04a2, TRY_LEAVE, TryCatch #9 {Exception -> 0x04a2, blocks: (B:66:0x0344, B:69:0x0371, B:71:0x0378, B:80:0x0389, B:86:0x03c2, B:89:0x03d9, B:92:0x03fe, B:94:0x0427, B:108:0x047c, B:109:0x0482, B:113:0x0494, B:114:0x0497, B:118:0x049b, B:119:0x04a1, B:77:0x0380, B:81:0x0393, B:85:0x03b4, B:111:0x0486, B:93:0x0408), top: B:151:0x0344, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x042f  */
    /* JADX WARN: Code duplicated, block: B:98:0x043b  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        String line;
        Object[] objArr;
        char c;
        String[] strArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        char c2;
        String[] strArr2;
        Object[] objArr3;
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line2;
        char[] cArr;
        float length;
        int i10;
        boolean zEquals;
        File file;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        boolean zEquals2;
        int i11;
        int i12;
        int i13;
        int i14;
        String[] strArr3;
        int[] iArr;
        int i15;
        char[] cArr2;
        int jumpTapTimeout;
        int i16;
        String str;
        Object obj;
        int i17 = 2 % 2;
        zzir.TuitionPaymentFragmentbindingInflater1();
        try {
            String[] strArr4 = new String[2];
            char[] cArr3 = {23484, 23509, 238, 9447, 24088, 5480, 51766, 5800, 30819, 46841, 52243, 34642, 30729, 18646, 31279, 59698, 61034, 55986, 59489, 23334, 7272, 27793, 34392};
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout();
            int i18 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr4 = new Object[1];
            a(cArr3, keyRepeatTimeout >> 16, objArr4);
            strArr4[0] = (String) objArr4[0];
            char[] cArr4 = {12864, 12855, 29919, 20676, 23575, 34915, 41921, 5258, 58745, 49875, 52785, 6761, 4607, 15591, 30730, 29730, 34714, 44696, 59969, 50744, 30085, 6327};
            int i20 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i21 = i20 * 399;
            int i22 = (i21 ^ 399) + ((i21 & 399) << 1);
            int i23 = ~i20;
            int i24 = (i23 & 1) | (i23 ^ 1);
            int i25 = ((-2) ^ i20) | ((-2) & i20);
            int i26 = -(-(((~i24) | (~i25) | (~(((-2) ^ i) | ((-2) & i)))) * 398));
            int i27 = (i22 ^ i26) + ((i22 & i26) << 1);
            int i28 = TuitionPaymentFragmentbindingInflater1;
            int i29 = (i28 ^ 77) + ((i28 & 77) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = i27 + ((-1194) * ((i20 ^ 1) | (i20 & 1)));
            int i32 = ~i;
            int i33 = (i32 & (-2)) | ((-2) ^ i32);
            int i34 = ((i28 | 93) << 1) - (i28 ^ 93);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
            if (i34 % 2 == 0) {
                throw null;
            }
            int i35 = ~i33;
            int i36 = ~i24;
            int i37 = (i35 & i36) | (i35 ^ i36);
            int i38 = i25 ^ (-1);
            int i39 = -(-(398 * ((i37 & i38) | (i37 ^ i38))));
            int i40 = (i31 & i39) + (i39 | i31);
            Object[] objArr5 = new Object[1];
            a(cArr4, i40, objArr5);
            strArr4[1] = (String) objArr5[0];
            int i41 = 0;
            while (true) {
                if (i41 >= 2) {
                    i5 = i;
                    break;
                }
                int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i43 = (i42 ^ 63) + ((i42 & 63) << 1);
                TuitionPaymentFragmentbindingInflater1 = i43 % 128;
                if (i43 % 2 != 0) {
                    str = strArr4[i41];
                    Object[] objArr6 = new Object[1];
                    a(new char[]{4110, 4207, 59127, 49891, 20430, 984, 33161, 1886, 28356, 20732, 56806, 37308, 13233, 44750, 27572, 65470, 42451, 15527, 63879, 19845}, (byte) KeyEvent.getModifierMetaStateMask(), objArr6);
                    obj = objArr6[0];
                } else {
                    str = strArr4[i41];
                    int i44 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                    int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
                    Object[] objArr7 = new Object[1];
                    a(new char[]{4110, 4207, 59127, 49891, 20430, 984, 33161, 1886, 28356, 20732, 56806, 37308, 13233, 44750, 27572, 65470, 42451, 15527, 63879, 19845}, i45, objArr7);
                    obj = objArr7[0];
                }
                Class<?> cls = Class.forName((String) obj);
                if (!(!((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue())) {
                    i3 = ~(i & 1);
                    i4 = i | 1;
                    i5 = i3 & i4;
                    break;
                }
                i41++;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c3 = (char) (2420 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2845;
                    int i46 = 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr8 = new Object[1];
                    b(b, b2, b2, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, longPressTimeout, i46, -501222268, false, (String) objArr8[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = -1133126468;
                long j2 = -1;
                long j3 = ((j ^ j2) | jLongValue) ^ j2;
                long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                long j4 = 70;
                long j5 = (((long) 71) * j) + (((long) (-69)) * jLongValue) + (((long) (-140)) * (j3 | ((jLongValue | jElapsedRealtime) ^ j2))) + ((((j | jLongValue) | jElapsedRealtime) ^ j2) * j4) + (j4 * ((j2 ^ (jElapsedRealtime | j)) | j3 | (((jLongValue ^ j2) | j) ^ j2))) + ((long) (-26060218));
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i47 = ~iMaxMemory;
                int i48 = ((int) (j5 >> 32)) & (917113914 + (((~(iMaxMemory | (-1267142877))) | (~(1607440892 | i47)) | 1250299992) * (-68)) + ((~((-16842885) | i47)) * (-68)) + (((~(1267142876 | i47)) | 1590598008) * 68));
                int i49 = ~i;
                int i50 = ((int) j5) & ((-181435207) + (((~((-1495012174) | i49)) | 57785763) * (-328)) + ((57785763 | i) * 164) + (((~(1495012173 | i)) | 39955618 | (~((-1477182029) | i49))) * 164));
                int i51 = (i48 & i50) | (i48 ^ i50);
                int i52 = (i & (-11)) | (i49 & 10);
                int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i54 = (i53 ^ 101) + ((i53 & 101) << 1);
                TuitionPaymentFragmentbindingInflater1 = i54 % 128;
                if (i54 % 2 != 0) {
                    int i55 = -i51;
                    i6 = ((i55 & i51) | (i51 ^ i55)) >> 125;
                } else {
                    int i56 = ((-2) & i51) | ((~i51) & 1);
                    int i57 = -i56;
                    i6 = ((i56 & i57) | (i56 ^ i57)) >> 31;
                }
                int i58 = i53 + 59;
                TuitionPaymentFragmentbindingInflater1 = i58 % 128;
                if (i58 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i59 = (~i6) & i52;
                int i60 = i6 & i;
                int i61 = (i60 & i59) | (i59 ^ i60);
                int i62 = ((~i5) & i) | (i5 & i49);
                int i63 = -i62;
                int i64 = ((i62 & i63) | (i62 ^ i63)) >> 31;
                int i65 = i61 & (~i64);
                int i66 = i64 & i5;
                int i67 = (i65 ^ i66) | (i65 & i66);
                try {
                    Object[] objArr9 = new Object[1];
                    a(new char[]{4883, 4924, 2926, 12135, 16787, 48100, 33492, 2334, 55033, 48487, 54183, 10717, 12461, 17217, 26038, 18408, 42703, 53561, 63440, 62890, 21716, 26459, 39422, 25477, 51962, 62735, 11019, 36961, 30724, 33963, 48409, 3666, 60985, 10958, 20279, 48209, 39975, 47243, 53598, 10789, 12890, 20143, 25447, 22557}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr9);
                    File file2 = new File((String) objArr9[0]);
                    if (file2.canRead()) {
                        FileReader fileReader3 = new FileReader(file2);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                        TuitionPaymentFragmentbindingInflater1 = i68 % 128;
                        try {
                            if (i68 % 2 != 0) {
                                line = bufferedReader3.readLine();
                                cArr2 = new char[]{56518, 56488, 59530, 52383, 8754, 27318, 5636};
                                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                                i16 = 100;
                            } else {
                                line = bufferedReader3.readLine();
                                cArr2 = new char[]{56518, 56488, 59530, 52383, 8754, 27318, 5636};
                                jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                                i16 = 16;
                            }
                            int i69 = TuitionPaymentFragmentbindingInflater1 + 17;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                            int i70 = i69 % 2;
                            Object[] objArr10 = new Object[1];
                            a(cArr2, jumpTapTimeout >> i16, objArr10);
                            if (!(!line.equals((String) objArr10[0]))) {
                                fileReader3.close();
                                bufferedReader3.close();
                                int i71 = TuitionPaymentFragmentbindingInflater1;
                                int i72 = (i71 ^ 89) + ((i71 & 89) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i72 % 128;
                                int i73 = i72 % 2;
                                line = null;
                            } else {
                                int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                                TuitionPaymentFragmentbindingInflater1 = i74 % 128;
                                int i75 = i74 % 2;
                                fileReader3.close();
                                bufferedReader3.close();
                                int i76 = TuitionPaymentFragmentbindingInflater1;
                                int i77 = ((i76 | 113) << 1) - (i76 ^ 113);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i77 % 128;
                                int i78 = i77 % 2;
                            }
                        } catch (Throwable th) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th;
                        }
                    } else {
                        int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i80 = ((i79 | 37) << 1) - (i79 ^ 37);
                        TuitionPaymentFragmentbindingInflater1 = i80 % 128;
                        int i81 = i80 % 2;
                        int i82 = ((i79 | 43) << 1) - (i79 ^ 43);
                        TuitionPaymentFragmentbindingInflater1 = i82 % 128;
                        if (i82 % 2 != 0) {
                            int i83 = 2 / 3;
                        }
                        line = null;
                    }
                } catch (Exception unused) {
                }
                try {
                    Object[] objArr11 = new Object[1];
                    a(new char[]{57911, 57880, 56160, 65386, 37998, 8962, 29628, 56552, 19971, 27949, 1607, 45356, 49556, 37637, 45127, 57176, 22525, 316, 8737, 27977, 42424, 46876, 19464, 64383, 15326, 9473, 65265, 2218, 35106, 21732, 26861, 38591, 7939, 64215, 39616}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr11);
                    File file3 = new File((String) objArr11[0]);
                    int i84 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i85 = (i84 & 29) + (i84 | 29);
                    TuitionPaymentFragmentbindingInflater1 = i85 % 128;
                    if (i85 % 2 != 0) {
                        int i86 = 98 / 0;
                        if (file3.canRead()) {
                            fileReader = new FileReader(file3);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                line2 = bufferedReader.readLine();
                                cArr = new char[]{26040, 25993, 43060, 32038, 57971};
                                length = PointF.length(0.0f, 0.0f);
                                int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i10 = ((i87 | 91) << 1) - (i87 ^ 91);
                                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    Object[] objArr12 = new Object[1];
                                    a(cArr, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), objArr12);
                                    line2.equals((String) objArr12[0]);
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                int i88 = (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1));
                                Object[] objArr13 = new Object[1];
                                a(cArr, i88, objArr13);
                                zEquals = line2.equals((String) objArr13[0]);
                                fileReader.close();
                                bufferedReader.close();
                                int i89 = TuitionPaymentFragmentbindingInflater1;
                                int i90 = (i89 ^ 111) + ((i89 & 111) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i90 % 128;
                                int i91 = i90 % 2;
                                if (zEquals) {
                                    Object[] objArr14 = new Object[1];
                                    a(new char[]{32430, 32385, 64423, 57262, 13855, 40670, 61289, 32402, 62403, 19886, 42027, 3303, 23824, 45960, 4666, 25298, 52082, 8688, 32860, 53392, 14697, 38802, 61042, 18111, 42823, 1478, 23687, 46427, 5561, 29794, 51842, 11119, 33687, 55830, 14519, 39275, 61833, 18498, 42697, 3843}, Drawable.resolveOpacity(0, 0), objArr14);
                                    file = new File((String) objArr14[0]);
                                    if (!file.canRead()) {
                                        fileReader2 = new FileReader(file);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        try {
                                            String line3 = bufferedReader2.readLine();
                                            Object[] objArr15 = new Object[1];
                                            a(new char[]{26040, 25993, 43060, 32038, 57971}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr15);
                                            zEquals2 = line3.equals((String) objArr15[0]);
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            if (zEquals2) {
                                                i11 = TuitionPaymentFragmentbindingInflater1;
                                                int i92 = i11 + 11;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i92 % 128;
                                                int i93 = i92 % 2;
                                                if (line != null) {
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                    i12 = ((i11 | 117) << 1) - (i11 ^ 117);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                                    if (i12 % 2 == 0) {
                                                        i14 = (i & (-90)) | (i49 & 89);
                                                        i13 = 1;
                                                    } else {
                                                        i13 = 1;
                                                        i14 = i ^ 20;
                                                    }
                                                    strArr3 = new String[i13];
                                                    strArr3[0] = line;
                                                    iArr = (int[]) objArr[0];
                                                    i15 = i11 + 115;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                                                    if (i15 % 2 == 0) {
                                                        iArr[1] = i14;
                                                        objArr[0] = strArr3;
                                                    } else {
                                                        iArr[0] = i14;
                                                        objArr[1] = strArr3;
                                                    }
                                                    c = 0;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            throw th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th3;
                            }
                        }
                        int i94 = ((int[]) objArr[c])[c];
                        int i95 = ((~i67) & i) | (i67 & i49);
                        int i96 = (i95 | (-i95)) >> 31;
                        int i97 = (~i96) & i94;
                        int i98 = TuitionPaymentFragmentbindingInflater1;
                        int i99 = (i98 & 17) + (i98 | 17);
                        int i100 = i99 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i100;
                        int i101 = i99 % 2;
                        int i102 = i67 & i96;
                        int i103 = (i102 & i97) | (i97 ^ i102);
                        strArr = (String[]) objArr[1];
                        objArr2 = new Object[2];
                        int i104 = (i94 & i49) | ((~i94) & i);
                        int i105 = -i104;
                        i7 = (((i104 & i105) | (i104 ^ i105)) >> 31) & 1;
                        i8 = (i100 ^ 79) + ((i100 & 79) << 1);
                        int i106 = i8 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i106;
                        if (i8 % 2 != 0) {
                            int i107 = -i7;
                            int i108 = ~(((i107 & i7) | (i7 ^ i107)) % 2);
                            i9 = 1;
                            objArr2[i7] = null;
                            objArr2[i108 & 1] = strArr;
                            strArr2 = (String[]) objArr2[1];
                            objArr3 = new Object[2];
                            c2 = 0;
                        } else {
                            i9 = 1;
                            int i109 = -i7;
                            int i110 = (~(((i109 & i7) | (i7 ^ i109)) >> 31)) & 1;
                            objArr2[i7] = null;
                            objArr2[i110] = strArr;
                            c2 = 0;
                            strArr2 = (String[]) objArr2[0];
                            objArr3 = new Object[4];
                        }
                        int[] iArr2 = new int[i9];
                        objArr3[c2] = iArr2;
                        int[] iArr3 = new int[i9];
                        objArr3[i9] = iArr3;
                        int[] iArr4 = new int[i9];
                        objArr3[2] = iArr4;
                        int i111 = i ^ i103;
                        int i112 = -i111;
                        int i113 = (((i111 & i112) | (i111 ^ i112)) >> 31) & 16;
                        iArr2[0] = i;
                        iArr4[0] = i103;
                        int i114 = i106 + 13;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i114 % 128;
                        int i115 = i114 % 2;
                        objArr3[3] = strArr2;
                        int i116 = (-935357970) + ((~(366946941 | i)) * 623) + ((272629768 | i49) * (-623)) + (((~(299633240 | i)) | (-366946942) | (~(339943469 | i))) * 623);
                        int i117 = ((i113 * 46) - (~(-(-(i116 * 46))))) - 1;
                        int i118 = ~i116;
                        int i119 = -(-(((~(i118 | i49)) | i113) * (-90)));
                        int i120 = ((i117 | i119) << 1) - (i117 ^ i119);
                        int i121 = ~((~i116) | i);
                        int i122 = ~((i116 & i113) | (i113 ^ i116));
                        int i123 = i120 + (((i121 & i122) | (i121 ^ i122)) * (-45));
                        int i124 = ~((~i113) | i);
                        int i125 = (i124 & i118) | (i118 ^ i124);
                        int i126 = ~((i49 ^ i113) | (i49 & i113));
                        int i127 = -(-(((i125 & i126) | (i125 ^ i126)) * 45));
                        int i128 = i2 + (((i123 | i127) << 1) - (i127 ^ i123));
                        int i129 = i128 << 13;
                        int i130 = (i128 | i129) & (~(i128 & i129));
                        int i131 = i130 >>> 17;
                        int i132 = ((~i130) & i131) | ((~i131) & i130);
                        int i133 = i132 << 5;
                        iArr3[0] = (i132 | i133) & (~(i132 & i133));
                        return objArr3;
                    }
                    if (file3.canRead()) {
                        fileReader = new FileReader(file3);
                        bufferedReader = new BufferedReader(fileReader);
                        line2 = bufferedReader.readLine();
                        cArr = new char[]{26040, 25993, 43060, 32038, 57971};
                        length = PointF.length(0.0f, 0.0f);
                        int i810 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i10 = ((i810 | 91) << 1) - (i810 ^ 91);
                        TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object[] objArr16 = new Object[1];
                            a(cArr, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), objArr16);
                            line2.equals((String) objArr16[0]);
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        int i811 = (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1));
                        Object[] objArr17 = new Object[1];
                        a(cArr, i811, objArr17);
                        zEquals = line2.equals((String) objArr17[0]);
                        fileReader.close();
                        bufferedReader.close();
                        int i812 = TuitionPaymentFragmentbindingInflater1;
                        int i910 = (i812 ^ 111) + ((i812 & 111) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i910 % 128;
                        int i911 = i910 % 2;
                        if (zEquals) {
                            Object[] objArr18 = new Object[1];
                            a(new char[]{32430, 32385, 64423, 57262, 13855, 40670, 61289, 32402, 62403, 19886, 42027, 3303, 23824, 45960, 4666, 25298, 52082, 8688, 32860, 53392, 14697, 38802, 61042, 18111, 42823, 1478, 23687, 46427, 5561, 29794, 51842, 11119, 33687, 55830, 14519, 39275, 61833, 18498, 42697, 3843}, Drawable.resolveOpacity(0, 0), objArr18);
                            file = new File((String) objArr18[0]);
                            if (!file.canRead()) {
                                fileReader2 = new FileReader(file);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                String line4 = bufferedReader2.readLine();
                                Object[] objArr19 = new Object[1];
                                a(new char[]{26040, 25993, 43060, 32038, 57971}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr19);
                                zEquals2 = line4.equals((String) objArr19[0]);
                                fileReader2.close();
                                bufferedReader2.close();
                                if (zEquals2) {
                                    i11 = TuitionPaymentFragmentbindingInflater1;
                                    int i912 = i11 + 11;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i912 % 128;
                                    int i913 = i912 % 2;
                                    if (line != null) {
                                        objArr = new Object[2];
                                        objArr[0] = new int[1];
                                        i12 = ((i11 | 117) << 1) - (i11 ^ 117);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            i14 = (i & (-90)) | (i49 & 89);
                                            i13 = 1;
                                        } else {
                                            i13 = 1;
                                            i14 = i ^ 20;
                                        }
                                        strArr3 = new String[i13];
                                        strArr3[0] = line;
                                        iArr = (int[]) objArr[0];
                                        i15 = i11 + 115;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            iArr[1] = i14;
                                            objArr[0] = strArr3;
                                        } else {
                                            iArr[0] = i14;
                                            objArr[1] = strArr3;
                                        }
                                        c = 0;
                                    }
                                }
                            }
                        }
                        int i914 = ((int[]) objArr[c])[c];
                        int i915 = ((~i67) & i) | (i67 & i49);
                        int i916 = (i915 | (-i915)) >> 31;
                        int i917 = (~i916) & i914;
                        int i918 = TuitionPaymentFragmentbindingInflater1;
                        int i919 = (i918 & 17) + (i918 | 17);
                        int i1010 = i919 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1010;
                        int i1011 = i919 % 2;
                        int i1012 = i67 & i916;
                        int i1013 = (i1012 & i917) | (i917 ^ i1012);
                        strArr = (String[]) objArr[1];
                        objArr2 = new Object[2];
                        int i1014 = (i914 & i49) | ((~i914) & i);
                        int i1015 = -i1014;
                        i7 = (((i1014 & i1015) | (i1014 ^ i1015)) >> 31) & 1;
                        i8 = (i1010 ^ 79) + ((i1010 & 79) << 1);
                        int i1016 = i8 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i1016;
                        if (i8 % 2 != 0) {
                            int i1017 = -i7;
                            int i1018 = ~(((i1017 & i7) | (i7 ^ i1017)) % 2);
                            i9 = 1;
                            objArr2[i7] = null;
                            objArr2[i1018 & 1] = strArr;
                            strArr2 = (String[]) objArr2[1];
                            objArr3 = new Object[2];
                            c2 = 0;
                        } else {
                            i9 = 1;
                            int i1019 = -i7;
                            int i1110 = (~(((i1019 & i7) | (i7 ^ i1019)) >> 31)) & 1;
                            objArr2[i7] = null;
                            objArr2[i1110] = strArr;
                            c2 = 0;
                            strArr2 = (String[]) objArr2[0];
                            objArr3 = new Object[4];
                        }
                        int[] iArr5 = new int[i9];
                        objArr3[c2] = iArr5;
                        int[] iArr6 = new int[i9];
                        objArr3[i9] = iArr6;
                        int[] iArr7 = new int[i9];
                        objArr3[2] = iArr7;
                        int i1111 = i ^ i1013;
                        int i1112 = -i1111;
                        int i1113 = (((i1111 & i1112) | (i1111 ^ i1112)) >> 31) & 16;
                        iArr5[0] = i;
                        iArr7[0] = i1013;
                        int i1114 = i1016 + 13;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1114 % 128;
                        int i1115 = i1114 % 2;
                        objArr3[3] = strArr2;
                        int i1116 = (-935357970) + ((~(366946941 | i)) * 623) + ((272629768 | i49) * (-623)) + (((~(299633240 | i)) | (-366946942) | (~(339943469 | i))) * 623);
                        int i1117 = ((i1113 * 46) - (~(-(-(i1116 * 46))))) - 1;
                        int i1118 = ~i1116;
                        int i1119 = -(-(((~(i1118 | i49)) | i1113) * (-90)));
                        int i1210 = ((i1117 | i1119) << 1) - (i1117 ^ i1119);
                        int i1211 = ~((~i1116) | i);
                        int i1212 = ~((i1116 & i1113) | (i1113 ^ i1116));
                        int i1213 = i1210 + (((i1211 & i1212) | (i1211 ^ i1212)) * (-45));
                        int i1214 = ~((~i1113) | i);
                        int i1215 = (i1214 & i1118) | (i1118 ^ i1214);
                        int i1216 = ~((i49 ^ i1113) | (i49 & i1113));
                        int i1217 = -(-(((i1215 & i1216) | (i1215 ^ i1216)) * 45));
                        int i1218 = i2 + (((i1213 | i1217) << 1) - (i1217 ^ i1213));
                        int i1219 = i1218 << 13;
                        int i134 = (i1218 | i1219) & (~(i1218 & i1219));
                        int i135 = i134 >>> 17;
                        int i136 = ((~i134) & i135) | ((~i135) & i134);
                        int i137 = i136 << 5;
                        iArr6[0] = (i136 | i137) & (~(i136 & i137));
                        return objArr3;
                    }
                } catch (Exception unused2) {
                }
                c = 0;
                int i138 = TuitionPaymentFragmentbindingInflater1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i138 % 128;
                int i139 = i138 % 2;
                objArr = new Object[]{new int[]{i}, new String[0]};
                int i9110 = ((int[]) objArr[c])[c];
                int i9111 = ((~i67) & i) | (i67 & i49);
                int i9112 = (i9111 | (-i9111)) >> 31;
                int i9113 = (~i9112) & i9110;
                int i9114 = TuitionPaymentFragmentbindingInflater1;
                int i9115 = (i9114 & 17) + (i9114 | 17);
                int i10110 = i9115 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10110;
                int i10111 = i9115 % 2;
                int i10112 = i67 & i9112;
                int i10113 = (i10112 & i9113) | (i9113 ^ i10112);
                strArr = (String[]) objArr[1];
                objArr2 = new Object[2];
                int i10114 = (i9110 & i49) | ((~i9110) & i);
                int i10115 = -i10114;
                i7 = (((i10114 & i10115) | (i10114 ^ i10115)) >> 31) & 1;
                i8 = (i10110 ^ 79) + ((i10110 & 79) << 1);
                int i10116 = i8 % 128;
                TuitionPaymentFragmentbindingInflater1 = i10116;
                if (i8 % 2 != 0) {
                    int i10117 = -i7;
                    int i10118 = ~(((i10117 & i7) | (i7 ^ i10117)) % 2);
                    i9 = 1;
                    objArr2[i7] = null;
                    objArr2[i10118 & 1] = strArr;
                    strArr2 = (String[]) objArr2[1];
                    objArr3 = new Object[2];
                    c2 = 0;
                } else {
                    i9 = 1;
                    int i10119 = -i7;
                    int i11110 = (~(((i10119 & i7) | (i7 ^ i10119)) >> 31)) & 1;
                    objArr2[i7] = null;
                    objArr2[i11110] = strArr;
                    c2 = 0;
                    strArr2 = (String[]) objArr2[0];
                    objArr3 = new Object[4];
                }
                int[] iArr8 = new int[i9];
                objArr3[c2] = iArr8;
                int[] iArr9 = new int[i9];
                objArr3[i9] = iArr9;
                int[] iArr10 = new int[i9];
                objArr3[2] = iArr10;
                int i11111 = i ^ i10113;
                int i11112 = -i11111;
                int i11113 = (((i11111 & i11112) | (i11111 ^ i11112)) >> 31) & 16;
                iArr8[0] = i;
                iArr10[0] = i10113;
                int i11114 = i10116 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11114 % 128;
                int i11115 = i11114 % 2;
                objArr3[3] = strArr2;
                int i11116 = (-935357970) + ((~(366946941 | i)) * 623) + ((272629768 | i49) * (-623)) + (((~(299633240 | i)) | (-366946942) | (~(339943469 | i))) * 623);
                int i11117 = ((i11113 * 46) - (~(-(-(i11116 * 46))))) - 1;
                int i11118 = ~i11116;
                int i11119 = -(-(((~(i11118 | i49)) | i11113) * (-90)));
                int i12110 = ((i11117 | i11119) << 1) - (i11117 ^ i11119);
                int i12111 = ~((~i11116) | i);
                int i12112 = ~((i11116 & i11113) | (i11113 ^ i11116));
                int i12113 = i12110 + (((i12111 & i12112) | (i12111 ^ i12112)) * (-45));
                int i12114 = ~((~i11113) | i);
                int i12115 = (i12114 & i11118) | (i11118 ^ i12114);
                int i12116 = ~((i49 ^ i11113) | (i49 & i11113));
                int i12117 = -(-(((i12115 & i12116) | (i12115 ^ i12116)) * 45));
                int i12118 = i2 + (((i12113 | i12117) << 1) - (i12117 ^ i12113));
                int i12119 = i12118 << 13;
                int i1310 = (i12118 | i12119) & (~(i12118 & i12119));
                int i1311 = i1310 >>> 17;
                int i1312 = ((~i1310) & i1311) | ((~i1311) & i1310);
                int i1313 = i1312 << 5;
                iArr9[0] = (i1312 | i1313) & (~(i1312 & i1313));
                return objArr3;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        } catch (Exception unused3) {
            i3 = ~(i & 2);
            i4 = i | 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, byte r8, short r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 107
            byte[] r0 = com.google.android.gms.maps.model.zzr.$$c
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzr.$$e(byte, byte, short):java.lang.String");
    }
}
