package com.google.android.gms.measurement.internal;

import android.R;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.SearchView9;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbf implements Parcelable.Creator {
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$d = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 104, -93, -37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 32;
    private static int b = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 64611;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 35255;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 14912;
    private static char TuitionPaymentFragmentbindingInflater1 = 63303;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r0 = r5 + 1
            int r7 = r7 + 4
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = com.google.android.gms.measurement.internal.zzbf.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r5
            r6 = r7
            goto L2b
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
        L2b:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzbf.c(short, short, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 83;
        b = i3 % 128;
        zzbe[] zzbeVarArr = new zzbe[i];
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return zzbeVarArr;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        b = i2 % 128;
        Bundle bundleCreateBundle = null;
        if (i2 % 2 != 0) {
            SafeParcelReader.validateObjectHeader(parcel);
            bundleCreateBundle.hashCode();
            throw null;
        }
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int i3 = b + 65;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 2) {
                int i5 = asInterface + 119;
                b = i5 % 128;
                int i6 = i5 % 2;
                SafeParcelReader.skipUnknownField(parcel, header);
                int i7 = asInterface + 37;
                b = i7 % 128;
                int i8 = i7 % 2;
            } else {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbe(bundleCreateBundle);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i4 = $10 + 87;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $11 + 109;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i3) + 47774);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 468;
                        int iResolveSizeAndState = View.resolveSizeAndState(i3, i3, i3) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, longPressTimeout, iResolveSizeAndState, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getLongPressTimeout() >> 16)), Process.getGidForName("") + 469, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2323 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i13 = $10 + 97;
            $11 = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x099c  */
    /* JADX WARN: Code duplicated, block: B:123:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:125:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:129:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:130:0x09ec  */
    /* JADX WARN: Code duplicated, block: B:133:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:134:0x0a0e  */
    public static Object[] b(Class cls, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object[] objArr;
        int i9;
        int i10;
        char c;
        int[] iArr;
        int i11;
        int i12;
        Class<?> cls2;
        int i13;
        String str;
        char c2;
        int i14;
        String string;
        int iB;
        int i15;
        int i16;
        Object obj;
        int i17;
        int i18;
        int i19;
        Object obj2;
        int i20 = 2 % 2;
        int i21 = b;
        int i22 = (i21 & 95) + (i21 | 95);
        asInterface = i22 % 128;
        if (i22 % 2 == 0) {
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        if ((i2 & 2) != 0) {
            String[][] strArr = new String[1][];
            try {
                char[] cArr = {50481, 6244, 44802, 64373, 48471, 28807, 23940, 17910, 43039, 24458};
                int i23 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i24 = (((i23 * 51) - 392) - (~(((i23 ^ i) | (i23 & i)) * (-50)))) - 1;
                int i25 = ~i23;
                int i26 = (i25 ^ (-9)) | (i25 & (-9));
                int i27 = ~((i26 ^ i) | (i26 & i));
                int i28 = ~i;
                int i29 = ((-9) ^ i28) | ((-9) & i28);
                int i30 = i29 | i23;
                int iB2 = SearchView9.b();
                int i31 = ~((435162975 ^ iB2) | (435162975 & iB2));
                int i32 = 1622818104 - (~(-(-(((((-502763360) ^ i31) | ((-502763360) & i31)) | (~(338136662 | iB2))) * (-880)))));
                int i33 = ~iB2;
                int i34 = ~((435162975 ^ i33) | (435162975 & i33));
                int i35 = ((-338136663) ^ i34) | ((-338136663) & i34);
                int i36 = ~(((-435162976) ^ iB2) | ((-435162976) & iB2));
                int i37 = -(-(((i35 ^ i36) | (i35 & i36)) * (-880)));
                int i38 = ((i32 | i37) << 1) - (i37 ^ i32);
                int i39 = -(-(i36 * 880));
                int i40 = (i38 & i39) + (i38 | i39);
                int iB3 = SearchView9.b();
                int i41 = ((1317111097 ^ iB3) | (1317111097 & iB3) | (-720143455)) * (-676);
                int i42 = (1860455395 ^ i41) + ((1860455395 & i41) << 1);
                int i43 = ~iB3;
                int i44 = ~((i43 ^ 1317111097) | (i43 & 1317111097));
                int i45 = (i42 - (~(-(-(((543948870 ^ i44) | (543948870 & i44)) * 676))))) - 1;
                int i46 = ~(((-720143455) & i43) | ((-720143455) ^ i43));
                int i47 = -(-(((~((1861059967 ^ iB3) | (iB3 & 1861059967))) | (176194584 ^ i46) | (i46 & 176194584)) * 676));
                if (i40 > (i45 & i47) + (i45 | i47)) {
                    int i48 = ~i30;
                    int i49 = -(-(50 % ((i48 & i27) | (i27 ^ i48))));
                    int i50 = ((i24 | i49) << 1) - (i49 ^ i24);
                    int i51 = ~i29;
                    int i52 = ~(((-9) ^ i23) | ((-9) & i23));
                    int i53 = (i51 & i52) | (i51 ^ i52);
                    int i54 = ~((i28 & i23) | (i28 ^ i23));
                    int i55 = -(-(50 / ((i54 & i53) | (i53 ^ i54))));
                    int i56 = (i50 & i55) + (i55 | i50);
                    Object[] objArr2 = new Object[1];
                    a(cArr, i56, objArr2);
                    obj = objArr2[0];
                } else {
                    int i57 = i24 + (((~i30) | i27) * 50);
                    int i58 = ~i;
                    int i59 = ~(((-9) ^ i58) | ((-9) & i58));
                    int i60 = ~(((-9) ^ i23) | ((-9) & i23));
                    int i61 = (i59 & i60) | (i59 ^ i60);
                    int i62 = ~(i58 | i23);
                    int i63 = i57 + (((i62 & i61) | (i61 ^ i62)) * 50);
                    Object[] objArr3 = new Object[1];
                    a(cArr, i63, objArr3);
                    obj = objArr3[0];
                }
                String str2 = (String) obj;
                int i64 = b;
                int i65 = ((i64 | 63) << 1) - (i64 ^ 63);
                asInterface = i65 % 128;
                int i66 = i65 % 2;
                Field declaredField = Class.class.getDeclaredField(str2);
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(cls);
                Class<?> cls3 = obj4.getClass();
                char[] cArr2 = {46240, 15652, 18455, 34544, 30500, 2794, 33939, 29686, 51555, 63409};
                int i67 = -Color.rgb(0, 0, 0);
                int i68 = asInterface;
                int i69 = (i68 & 93) + (i68 | 93);
                int i70 = i69 % 128;
                b = i70;
                if (i69 % 2 != 0) {
                    i17 = (i67 ^ 398) + ((i67 & 398) << 1);
                    i19 = ~i67;
                    int i71 = ~i;
                    i18 = ~((i71 & i19) | (i19 ^ i71));
                } else {
                    int i72 = i67 * 398;
                    i17 = ((i72 & (-1946159828)) << 1) + (i72 ^ (-1946159828));
                    int i73 = ~i67;
                    int i74 = ~i;
                    i18 = ~((i73 & i74) | (i73 ^ i74));
                    i19 = ~i67;
                }
                int i75 = ~((i19 & (-16777209)) | (i19 ^ (-16777209)));
                int i76 = (i75 & i18) | (i18 ^ i75);
                int i77 = ~i;
                int i78 = -(-((-397) * (i76 | (~((i77 & (-16777209)) | (i77 ^ (-16777209)))))));
                int i79 = (((i17 ^ i78) + ((i17 & i78) << 1)) - (~(-(-((~((~i67) | (-16777209))) * (-397)))))) - 1;
                int i80 = ~i67;
                int i81 = (i70 ^ 55) + ((i70 & 55) << 1);
                asInterface = i81 % 128;
                int i82 = i81 % 2;
                int i83 = ~((i80 & (-16777209)) | (i80 ^ (-16777209)));
                int i84 = (i83 & i) | (i ^ i83);
                if (i82 == 0) {
                    Object[] objArr4 = new Object[1];
                    a(cArr2, i79 % (397 >>> ((~((i67 & 16777208) | (16777208 ^ i67))) | i84)), objArr4);
                    Field declaredField2 = cls3.getDeclaredField((String) objArr4[0]);
                    declaredField2.setAccessible(true);
                    obj2 = declaredField2.get(obj4);
                } else {
                    Object[] objArr5 = new Object[1];
                    a(cArr2, i79 + (((~(i67 | 16777208)) | i84) * 397), objArr5);
                    Field declaredField3 = cls3.getDeclaredField((String) objArr5[0]);
                    declaredField3.setAccessible(true);
                    obj2 = declaredField3.get(obj4);
                }
                Number number = (Number) obj2;
                int i85 = b;
                int i86 = (i85 & 101) + (i85 | 101);
                asInterface = i86 % 128;
                int i87 = i86 % 2;
                try {
                    Object[] objArr6 = {Long.valueOf(number.longValue() & 281474976710655L), strArr};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cAlpha = (char) (41241 - Color.alpha(0));
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 1705;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 21;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        byte b3 = bArr[5];
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, (byte) (-b3), objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, deadChar, scrollBarSize, -107095506, false, (String) objArr7[0], new Class[]{Long.TYPE, String[][].class});
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6)).longValue();
                    long j = -824560330;
                    long j2 = -1;
                    long j3 = jLongValue ^ j2;
                    long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j4 = jElapsedRealtime ^ j2;
                    long j5 = (((long) (-830)) * j) + (((long) 832) * jLongValue) + (((long) (-831)) * (((j3 | j4) ^ j2) | (((j | jLongValue) | jElapsedRealtime) ^ j2))) + (((long) (-1662)) * (((j3 | j) | jElapsedRealtime) ^ j2)) + (((long) 831) * (((jElapsedRealtime | jLongValue) ^ j2) | (((j ^ j2) | j4) ^ j2) | ((j | jElapsedRealtime) ^ j2))) + ((long) (-1281456731));
                    int i88 = (int) (j5 >> 32);
                    try {
                        int i89 = (int) Runtime.getRuntime().totalMemory();
                        int i90 = i88 & (((((~(2096191365 | i89)) | R.string.config_systemDependencyInstaller) * (-566)) - 1803355834) + ((~(i89 | 2113230799)) * 566));
                        int i91 = (int) j5;
                        int i92 = (~((int) Runtime.getRuntime().freeMemory())) | 993320106;
                        int i93 = i90 | (i91 & (1172959118 + (i92 * 495) + (((~i92) | 723569834) * 495)));
                        if (i93 != 0) {
                            int i94 = asInterface;
                            int i95 = (i94 & 75) + (i94 | 75);
                            b = i95 % 128;
                            int i96 = i95 % 2;
                            int i97 = i93 ^ i;
                            String[] strArr2 = strArr[0];
                            String[] strArr3 = {cls.getName(), strArr2[0], strArr2[1], strArr2[2]};
                            Object[] objArr8 = new Object[4];
                            objArr8[0] = new int[1];
                            objArr8[1] = new int[]{i97};
                            objArr8[2] = new int[]{i};
                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                            int i98 = 1879698000 + (((~((-595195289) | iMaxMemory)) | 35701128) * 345) + (((~((-595195289) | (~iMaxMemory))) | 1074135042) * 345) + ((~(iMaxMemory | (-35701129))) * 345);
                            int iB4 = SearchView9.b();
                            int i99 = 880 + (i98 * (-107));
                            int i100 = ~(((-17) ^ i98) | ((-17) & i98));
                            int i101 = ~iB4;
                            int i102 = ~((i101 & i98) | (i101 ^ i98));
                            int i103 = ((i100 & i102) | (i100 ^ i102)) * (-108);
                            int i104 = (i99 ^ i103) + ((i103 & i99) << 1);
                            int i105 = ~(((-17) ^ iB4) | ((-17) & iB4));
                            int i106 = ~i98;
                            int i107 = i105 | (~((i106 & 16) | (i106 ^ 16)));
                            int i108 = ~((~iB4) | 16);
                            int i109 = ((i107 & i108) | (i107 ^ i108)) * 54;
                            int i110 = (i104 & i109) + (i109 | i104);
                            int i111 = ~i98;
                            int i112 = ~((i111 & 16) | (i111 ^ 16));
                            int i113 = i110 + (((iB4 & i112) | (iB4 ^ i112)) * 54);
                            int i114 = (i3 ^ i113) + ((i113 & i3) << 1);
                            int i115 = i114 << 13;
                            int i116 = ((~i114) & i115) | ((~i115) & i114);
                            int i117 = i116 >>> 17;
                            int i118 = (i116 | i117) & (~(i116 & i117));
                            int i119 = i118 << 5;
                            ((int[]) objArr8[0])[0] = ((~i118) & i119) | ((~i119) & i118);
                            objArr8[3] = strArr3;
                            return objArr8;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                Object[] objArr9 = {new PrintWriter(stringWriter)};
                                char[] cArr3 = {16281, 54238, 58994, 56395, 45657, 17278, 28383, 44662, 53074, 26671, 8611, 19236, 10426, 47331, 17905, 28151, 62176, 30333, 62041, 1865, 16432, 28599};
                                int i120 = b + 63;
                                asInterface = i120 % 128;
                                int i121 = i120 % 2;
                                Object[] objArr10 = new Object[1];
                                a(cArr3, 18 - (~(-View.resolveSize(0, 0))), objArr10);
                                Class<?> cls4 = Class.forName((String) objArr10[0]);
                                char[] cArr4 = {49089, 57457, 51151, 44696, 64822, 33579, 24840, 23526, 51831, 49599, 60523, 60788, 46265, 21443, 14971, 61360, 65022, 18207};
                                SearchView9.b();
                                SearchView9.b();
                                int iRgb = Color.rgb(0, 0, 0);
                                int i122 = (iRgb ^ 16777231) + ((iRgb & 16777231) << 1);
                                Object[] objArr11 = new Object[1];
                                a(cArr4, i122, objArr11);
                                String str3 = (String) objArr11[0];
                                int i123 = b;
                                int i124 = (i123 & 11) + (i123 | 11);
                                asInterface = i124 % 128;
                                int i125 = i124 % 2;
                                Method method = cls4.getMethod(str3, PrintWriter.class);
                                int i126 = asInterface + 37;
                                b = i126 % 128;
                                if (i126 % 2 != 0) {
                                    method.invoke(th, objArr9);
                                    string = stringWriter.toString();
                                    int i127 = 47 / 0;
                                } else {
                                    method.invoke(th, objArr9);
                                    string = stringWriter.toString();
                                }
                                c2 = 0;
                                i14 = 1;
                                String[] strArr4 = {cls.getName(), string};
                                Object[] objArr12 = new Object[4];
                                objArr12[c2] = new int[i14];
                                int[] iArr2 = new int[i14];
                                objArr12[i14] = iArr2;
                                int[] iArr3 = new int[i14];
                                objArr12[2] = iArr3;
                                iArr3[c2] = i;
                                iArr2[c2] = i ^ 31;
                                int i128 = 1282353148 + ((~(1660846034 | i)) * (-301)) + (((~((-1122924499) | i)) | (~((~i) | 582106960))) * (-301)) + (((~(i | (-582106961))) | (-1122924499)) * 301);
                                int i129 = asInterface + 71;
                                b = i129 % 128;
                                if (i129 % 2 != 0) {
                                    iB = SearchView9.b();
                                    int i130 = -(-i128);
                                    int i131 = -(((i130 | (-518)) << 1) - (i130 ^ (-518)));
                                    i15 = ((-8288) & i131) + (i131 | (-8288));
                                } else {
                                    iB = SearchView9.b();
                                    int i132 = i128 * (-518);
                                    i15 = (((-8288) | i132) << 1) - (i132 ^ (-8288));
                                }
                                int i133 = ~iB;
                                int i134 = ~((i133 & (-17)) | ((-17) ^ i133));
                                int i135 = i15 + (519 * ((i134 & i128) | (i128 ^ i134)));
                                int i136 = ~iB;
                                int i137 = (i136 & (-17)) | ((-17) ^ i136);
                                int i138 = (i128 ^ 16) | (i128 & 16);
                                int i139 = asInterface;
                                int i140 = (i139 ^ 21) + ((i139 & 21) << 1);
                                b = i140 % 128;
                                int i141 = i140 % 2;
                                int i142 = (~((i137 & i128) | (i137 ^ i128))) | (~((i138 & iB) | (i138 ^ iB)));
                                if (i141 != 0) {
                                    int i143 = i3 % ((i135 >>> ((-519) << i142)) >>> (518 - (~(-((~((iB & i128) | (i128 ^ iB))) | 16)))));
                                    int i144 = i143 * 78;
                                    int i145 = ((~i143) & i144) | ((~i144) & i143);
                                    int i146 = i145 % 27;
                                    i16 = ((~i145) & i146) | ((~i146) & i145);
                                } else {
                                    int i147 = -(-(i142 * (-519)));
                                    int i148 = ((i135 | i147) << 1) - (i147 ^ i135);
                                    int i149 = ~(iB | i128);
                                    int i150 = ((i149 & 16) | (i149 ^ 16)) * 519;
                                    int i151 = -(-((i148 & i150) + (i150 | i148)));
                                    int i152 = (i3 ^ i151) + ((i151 & i3) << 1);
                                    int i153 = i152 << 13;
                                    int i154 = (i153 | i152) & (~(i152 & i153));
                                    i16 = i154 ^ (i154 >>> 17);
                                }
                                ((int[]) objArr12[0])[0] = i16 ^ (i16 << 5);
                                objArr12[3] = strArr4;
                                return objArr12;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        } catch (Throwable unused) {
                            c2 = 0;
                            int i155 = -TextUtils.indexOf("", "", 0, 0);
                            i14 = 1;
                            int i156 = (i155 ^ 1) + ((i155 & 1) << 1);
                            Object[] objArr13 = new Object[1];
                            a(new char[]{19940, 25736, 34293, 43400}, i156, objArr13);
                            string = (String) objArr13[0];
                        }
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        int[] iArr4 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
        String[][] strArr5 = new String[1][];
        int i157 = b;
        int i158 = ((i157 | 17) << 1) - (i157 ^ 17);
        asInterface = i158 % 128;
        int i159 = i158 % 2;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i160 = (iCurrentTimeMillis | 343337308) & (~(iCurrentTimeMillis & 343337308));
        int i161 = asInterface;
        int i162 = ((i161 | 123) << 1) - (i161 ^ 123);
        b = i162 % 128;
        int i163 = i162 % 2;
        int i164 = (~i160) & i;
        int i165 = ~i;
        try {
            Object[] objArr14 = {Integer.valueOf(i164 | (i160 & i165)), iArr4, Integer.valueOf(i2), strArr5};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 43043);
                int size = 3111 - View.MeasureSpec.getSize(0);
                int mode = 22 - View.MeasureSpec.getMode(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                byte b5 = bArr2[5];
                Object[] objArr15 = new Object[1];
                c(b4, b5, (byte) (-b5), objArr15);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, size, mode, 974412207, false, (String) objArr15[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
            long j6 = -1221979783;
            long j7 = 433;
            long j8 = -1;
            long j9 = j6 ^ j8;
            long j10 = i;
            long j11 = (((long) (-432)) * j6) + (((long) 434) * jLongValue2) + ((((j9 | (j10 ^ j8)) | jLongValue2) ^ j8) * j7) + (((long) (-433)) * (j9 | (((jLongValue2 ^ j8) | j10) ^ j8))) + (j7 * (((j9 | j10) ^ j8) | ((j6 | jLongValue2) ^ j8))) + ((long) 1325713848);
            int i166 = ~Process.myTid();
            int i167 = ((int) (j11 >> 32)) & ((-1019427974) + (((~(i166 | (-1073807369))) | (~((-294162497) | i166))) * (-184)) + (((-2112855375) | (~(1818692878 | i166)) | (~(1039048006 | i166))) * 184) + 380019448);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i168 = ((int) j11) & (2132484707 + (((~((~iElapsedRealtime) | (-25174034))) | (~(1711236659 | iElapsedRealtime))) * (-302)) + ((~((-25174034) | iElapsedRealtime)) * (-604)) + (((~(iElapsedRealtime | 1686062626)) | 539558400) * 302));
            int i169 = (i167 & i168) | (i167 ^ i168);
            int i170 = (i169 | i160) & (~(i169 & i160));
            if (i170 != i) {
                String[] strArr6 = strArr5[0];
                int[] iArr5 = new int[1];
                int i171 = asInterface;
                int i172 = i171 + 125;
                b = i172 % 128;
                int i173 = i172 % 2;
                int[] iArr6 = {i170};
                int i174 = 82011494 + ((i | 521573527) * (-859)) + (((~(i165 | 521573527)) | (~((-100794500) | i))) * 859) + (((~((-1183457932) | i165)) | 1082663432) * 859);
                int i175 = i174 * (-163);
                int i176 = (2640 ^ i175) + ((i175 & 2640) << 1);
                int i177 = ~i;
                int i178 = ~((i177 & i174) | (i177 ^ i174));
                int i179 = (((i176 - (~(-(-(((i178 & 16) | (i178 ^ 16)) * (-328)))))) - 1) - (~((i | 16) * 164))) - 1;
                int i180 = ~i174;
                int i181 = ~(((-17) & i180) | ((-17) ^ i180));
                int i182 = ~(i180 | i);
                int i183 = (i182 & i181) | (i181 ^ i182);
                int i184 = (i165 ^ 16) | (i165 & 16);
                int i185 = ~((i184 & i174) | (i184 ^ i174));
                int i186 = -(-(((i183 & i185) | (i183 ^ i185)) * 164));
                int i187 = (i3 - (~(-(-(((i179 | i186) << 1) - (i186 ^ i179)))))) - 1;
                int i188 = i187 << 13;
                int i189 = ((~i187) & i188) | ((~i188) & i187);
                int i190 = i189 >>> 17;
                int i191 = (i189 | i190) & (~(i189 & i190));
                int i192 = i191 << 5;
                iArr5[0] = (i191 | i192) & (~(i191 & i192));
                Object[] objArr16 = {iArr5, iArr6, new int[]{i}, strArr6};
                int i193 = (i171 ^ 61) + ((i171 & 61) << 1);
                b = i193 % 128;
                int i194 = i193 % 2;
                return objArr16;
            }
            try {
                char[] cArr5 = {62975, 55095, 59016, 61134, 65273, 36348, 12223, 3344, 27508, 5638, 5883, 24949, 20383, 37560, 38466, 8692, 27261, 50276, 28031, 15373, 31456, 7112, 20041, 57357, 65335, 3827, 48918, 15367};
                int offsetAfter = TextUtils.getOffsetAfter("", 0);
                int i195 = b;
                int i196 = ((i195 | 47) << 1) - (i195 ^ 47);
                asInterface = i196 % 128;
                if (i196 % 2 == 0) {
                    i11 = (-344) / offsetAfter;
                    i12 = 63;
                } else {
                    i11 = offsetAfter * (-344);
                    i12 = -8944;
                }
                int i197 = i11 + i12;
                int i198 = ~offsetAfter;
                int i199 = ~((i198 ^ (-27)) | (i198 & (-27)));
                int i200 = ~offsetAfter;
                int i201 = ~((i200 ^ i) | (i200 & i));
                int i202 = -(-(((i199 & i201) | (i199 ^ i201)) * 345));
                int i203 = ((i197 | i202) << 1) - (i197 ^ i202);
                int i204 = ~(i198 | i165);
                int i205 = ~((offsetAfter & (-27)) | ((-27) ^ offsetAfter));
                int i206 = ((i205 & i204) | (i204 ^ i205)) * 345;
                int i207 = (i203 & i206) + (i206 | i203);
                int i208 = (i195 ^ 33) + ((i195 & 33) << 1);
                asInterface = i208 % 128;
                int i209 = i208 % 2;
                int i210 = i200 | (-27);
                int i211 = 345 * (~((i210 & i) | (i210 ^ i)));
                int i212 = (i207 & i211) + (i207 | i211);
                Object[] objArr17 = new Object[1];
                a(cArr5, i212, objArr17);
                String str4 = (String) objArr17[0];
                int i213 = b;
                int i214 = ((i213 | 19) << 1) - (i213 ^ 19);
                asInterface = i214 % 128;
                if (i214 % 2 == 0) {
                    cls2 = Class.forName(str4);
                    Object[] objArr18 = new Object[1];
                    a(new char[]{18728, 48371, 28614, 22195, 8889, 63009, 22402, 18684, 38836, 13091, 19503, 2426, 18715, 11719, 46168, 916, 26430, 15006, 61837, 20170}, TextUtils.indexOf((CharSequence) "", '\'', 1) * 2, objArr18);
                    str = (String) objArr18[0];
                    i13 = 0;
                } else {
                    cls2 = Class.forName(str4);
                    i13 = 0;
                    Object[] objArr19 = new Object[1];
                    a(new char[]{18728, 48371, 28614, 22195, 8889, 63009, 22402, 18684, 38836, 13091, 19503, 2426, 18715, 11719, 46168, 916, 26430, 15006, 61837, 20170}, 17 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr19);
                    str = (String) objArr19[0];
                }
                if (cls2.getMethod(str, new Class[i13]).invoke(null, null) != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 22878);
                        int iResolveSize = View.resolveSize(0, 0) + 594;
                        i4 = 16;
                        int keyRepeatTimeout = 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[5];
                        Object[] objArr20 = new Object[1];
                        c(b6, bArr3[7], (byte) (-b6), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, iResolveSize, keyRepeatTimeout, -1471475267, false, (String) objArr20[0], null);
                    } else {
                        i4 = 16;
                    }
                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                        i5 = (i & (-10)) | (i165 & 9);
                    }
                    if (i5 != i) {
                        int i215 = b;
                        int i216 = (i215 & 23) + (i215 | 23);
                        int i217 = i216 % 128;
                        asInterface = i217;
                        int i218 = i216 % 2;
                        int i219 = (i217 & 41) + (i217 | 41);
                        b = i219 % 128;
                        int i220 = i219 % 2;
                        i8 = i4;
                        i7 = 0;
                    } else {
                        int i221 = b;
                        i6 = ((i221 | 27) << 1) - (i221 ^ 27);
                        asInterface = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i222 = 4 / 5;
                        }
                        i7 = 0;
                        i8 = 0;
                    }
                    String[] strArr7 = new String[i7];
                    objArr = new Object[4];
                    objArr[i7] = new int[1];
                    int i223 = b;
                    i9 = i223 + 47;
                    asInterface = i9 % 128;
                    if (i9 % 2 == 0) {
                        objArr[i7] = new int[1];
                        objArr[5] = new int[i7];
                    } else {
                        objArr[1] = new int[1];
                        objArr[2] = new int[1];
                    }
                    i10 = ((i223 | 115) << 1) - (i223 ^ 115);
                    asInterface = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((int[]) objArr[5])[1] = i;
                        iArr = (int[]) objArr[1];
                        c = 0;
                    } else {
                        c = 0;
                        ((int[]) objArr[2])[0] = i;
                        iArr = (int[]) objArr[1];
                    }
                    iArr[c] = i5;
                    int i224 = 1489877946 + ((~(i165 | 1432270626)) * (-116)) + ((290108672 | i) * 116) + (((~((-1414922787) | i)) | 272760832) * 116);
                    int i225 = -(-i8);
                    int i226 = (i224 & i225) + (i225 | i224);
                    int iB5 = SearchView9.b();
                    int i227 = i226 * 483;
                    int i228 = -(-(i3 * 242));
                    int i229 = (i227 ^ i228) + ((i227 & i228) << 1);
                    int i230 = ~i226;
                    int i231 = ~i3;
                    int i232 = ~((i231 & i230) | (i230 ^ i231));
                    int i233 = ~i226;
                    int i234 = ~iB5;
                    int i235 = ~((i233 & i234) | (i233 ^ i234));
                    int i236 = ((i232 & i235) | (i232 ^ i235)) * (-241);
                    int i237 = ((i229 | i236) << 1) - (i236 ^ i229);
                    int i238 = ((i226 ^ i3) | (i226 & i3)) * (-482);
                    int i239 = (i234 & i230) | (i230 ^ i234);
                    int i240 = (i237 & i238) + (i238 | i237) + (((~((i239 & i3) | (i239 ^ i3))) | (~(i226 | (~i3)))) * 241);
                    int i241 = i240 << 13;
                    int i242 = (i241 | i240) & (~(i240 & i241));
                    int i243 = i242 >>> 17;
                    int i244 = ((~i242) & i243) | ((~i243) & i242);
                    ((int[]) objArr[0])[0] = i244 ^ (i244 << 5);
                    objArr[3] = strArr7;
                    return objArr;
                }
                i4 = 16;
            } catch (Exception unused2) {
            }
            i5 = i;
            if (i5 != i) {
                int i2110 = b;
                int i2111 = (i2110 & 23) + (i2110 | 23);
                int i2112 = i2111 % 128;
                asInterface = i2112;
                int i2113 = i2111 % 2;
                int i2114 = (i2112 & 41) + (i2112 | 41);
                b = i2114 % 128;
                int i2210 = i2114 % 2;
                i8 = i4;
                i7 = 0;
            } else {
                int i2211 = b;
                i6 = ((i2211 | 27) << 1) - (i2211 ^ 27);
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    int i2212 = 4 / 5;
                }
                i7 = 0;
                i8 = 0;
            }
            String[] strArr8 = new String[i7];
            objArr = new Object[4];
            objArr[i7] = new int[1];
            int i2213 = b;
            i9 = i2213 + 47;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                objArr[i7] = new int[1];
                objArr[5] = new int[i7];
            } else {
                objArr[1] = new int[1];
                objArr[2] = new int[1];
            }
            i10 = ((i2213 | 115) << 1) - (i2213 ^ 115);
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                ((int[]) objArr[5])[1] = i;
                iArr = (int[]) objArr[1];
                c = 0;
            } else {
                c = 0;
                ((int[]) objArr[2])[0] = i;
                iArr = (int[]) objArr[1];
            }
            iArr[c] = i5;
            int i2214 = 1489877946 + ((~(i165 | 1432270626)) * (-116)) + ((290108672 | i) * 116) + (((~((-1414922787) | i)) | 272760832) * 116);
            int i2215 = -(-i8);
            int i2216 = (i2214 & i2215) + (i2215 | i2214);
            int iB6 = SearchView9.b();
            int i2217 = i2216 * 483;
            int i2218 = -(-(i3 * 242));
            int i2219 = (i2217 ^ i2218) + ((i2217 & i2218) << 1);
            int i2310 = ~i2216;
            int i2311 = ~i3;
            int i2312 = ~((i2311 & i2310) | (i2310 ^ i2311));
            int i2313 = ~i2216;
            int i2314 = ~iB6;
            int i2315 = ~((i2313 & i2314) | (i2313 ^ i2314));
            int i2316 = ((i2312 & i2315) | (i2312 ^ i2315)) * (-241);
            int i2317 = ((i2219 | i2316) << 1) - (i2316 ^ i2219);
            int i2318 = ((i2216 ^ i3) | (i2216 & i3)) * (-482);
            int i2319 = (i2314 & i2310) | (i2310 ^ i2314);
            int i245 = (i2317 & i2318) + (i2318 | i2317) + (((~((i2319 & i3) | (i2319 ^ i3))) | (~(i2216 | (~i3)))) * 241);
            int i246 = i245 << 13;
            int i247 = (i246 | i245) & (~(i245 & i246));
            int i248 = i247 >>> 17;
            int i249 = ((~i247) & i248) | ((~i248) & i247);
            ((int[]) objArr[0])[0] = i249 ^ (i249 << 5);
            objArr[3] = strArr8;
            return objArr;
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 108
            byte[] r0 = com.google.android.gms.measurement.internal.zzbf.$$c
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r3 = r7
            r7 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzbf.$$e(short, int, int):java.lang.String");
    }
}
