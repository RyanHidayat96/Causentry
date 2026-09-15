package com.google.android.gms.location;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zzat implements Parcelable.Creator {
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, 125, 2, 46, 8, 25, -24, 29, 8, 22, 13, -4, 15, 15, 3, -20, 37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 61;
    private static final byte[] $$a = {84, 10, 24, -102, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 3;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int[] b = {1322098559, 1180166208, 313537971, -2021343038, -870579717, -30129752, -696485079, -1472640770, 1973061901, -2104493520, -877644941, -1499614471, -1395469202, -1406332057, -941474231, -1336537341, -957246431, 69049346};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.location.zzat.$$a
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzat.a(int, short, byte, java.lang.Object[]):void");
    }

    private static void d(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = b2 * 39;
        int i2 = (b4 * 13) + 4;
        byte[] bArr = $$d;
        int i3 = (b3 * 19) + 84;
        byte[] bArr2 = new byte[i + 14];
        int i4 = i + 13;
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = (i2 + i4) - 10;
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
                i3 = (i7 + bArr[i6]) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0046 A[SYNTHETIC] */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int header;
        int fieldId;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            if (i9 % 2 == 0) {
                header = SafeParcelReader.readHeader(parcel);
                fieldId = SafeParcelReader.getFieldId(header);
                if (fieldId != 0) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i2 = i + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (fieldId != 4) {
                            i6 = SafeParcelReader.readInt(parcel, header);
                        } else if (fieldId != 3) {
                            i3 = i + 97;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                            if (i3 % 2 != 0) {
                                if (fieldId != 2) {
                                    SafeParcelReader.skipUnknownField(parcel, header);
                                } else {
                                    i8 = SafeParcelReader.readInt(parcel, header);
                                }
                            } else if (fieldId != 4) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                i8 = SafeParcelReader.readInt(parcel, header);
                            }
                        } else {
                            i7 = SafeParcelReader.readInt(parcel, header);
                        }
                    } else if (fieldId != 2) {
                        i6 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId != 3) {
                        i3 = i + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (fieldId != 2) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                i8 = SafeParcelReader.readInt(parcel, header);
                            }
                        } else if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            i8 = SafeParcelReader.readInt(parcel, header);
                        }
                    } else {
                        i7 = SafeParcelReader.readInt(parcel, header);
                    }
                } else {
                    i5 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                header = SafeParcelReader.readHeader(parcel);
                fieldId = SafeParcelReader.getFieldId(header);
                if (fieldId != 1) {
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i2 = i + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (fieldId != 4) {
                            i6 = SafeParcelReader.readInt(parcel, header);
                        } else if (fieldId != 3) {
                            i3 = i + 97;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                            if (i3 % 2 != 0) {
                                if (fieldId != 2) {
                                    SafeParcelReader.skipUnknownField(parcel, header);
                                } else {
                                    i8 = SafeParcelReader.readInt(parcel, header);
                                }
                            } else if (fieldId != 4) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                i8 = SafeParcelReader.readInt(parcel, header);
                            }
                        } else {
                            i7 = SafeParcelReader.readInt(parcel, header);
                        }
                    } else if (fieldId != 2) {
                        i6 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId != 3) {
                        i3 = i + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                        if (i3 % 2 != 0) {
                            if (fieldId != 2) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                i8 = SafeParcelReader.readInt(parcel, header);
                            }
                        } else if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            i8 = SafeParcelReader.readInt(parcel, header);
                        }
                    } else {
                        i7 = SafeParcelReader.readInt(parcel, header);
                    }
                } else {
                    i5 = SafeParcelReader.readInt(parcel, header);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzas(i5, i6, i7, i8);
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 11;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), 3291 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0) + 32, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    int i9 = $11 + 61;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[i5] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3291 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 31, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                i4 = 1;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        int i13 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 53;
            $11 = i14 % 128;
            int i15 = i14 % i13;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                int i18 = $10 + 59;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 2559, 29 - View.getDefaultSize(0, 0), 683220507, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28878), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 348, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i13 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) (31533 - View.MeasureSpec.getMode(0));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
            byte b2 = $$a[37];
            Object[] objArr2 = new Object[1];
            a(b2, b2, (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, absoluteGravity, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{-1173959925, -1464581195, -1812641807, 1805152602, 1407716191, -1210762083, 439015088, 1487253729, 1385293916, -111365500, -1201211290, 1629687350, 1842992436, -113533198}, ExpandableListView.getPackedPositionGroup(0L) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{-1046815097, 1571475065, -497474862, 2140166374, -1196843262, 1630035690, -1507289546, 1975739469, -115360575, 1172220140}, 15 - View.MeasureSpec.getMode(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 921;
            int jumpTapTimeout = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, bArr[37], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iIndexOf2, jumpTapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
                int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b4, b4, bArr2[33], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, maximumDrawingCacheSize, keyRepeatDelay, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i5 = ((((-1295959271) + (((~((~i) | (-18892955))) | (~(1572326811 | i))) * (-302))) + ((~((-18892955) | i)) * (-604))) + (((~(1553433857 | i)) | 1351681025) * 302)) - 284010255;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{-1497074016, -2102764880, 837678940, -265564405, -228636439, -1746699935, 1938465121, -920017604, 622490659, 1105833599, 1556543024, 184698430, 1932719329, -1116553169, 504057090, 278633610}, TextUtils.getCapsMode("", 0, 0) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{1830783364, -683852463, 1569912156, -2141370739, -2033698364, -1445443512, -322506587, 1276829650, -835334232, 2143938137, -127903024, -294616987}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -284010255};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[50];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr11 = new Object[1];
                d(b6, b7, (byte) (b7 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr3[50];
                byte b9 = b8;
                Object[] objArr12 = new Object[1];
                d(b9, (byte) (b9 - 1), b8, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumDrawingCacheSize2 = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[80];
                    byte b11 = bArr4[33];
                    Object[] objArr13 = new Object[1];
                    a(b10, b10, b11, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize2, trimmedLength, modifierMetaStateMask, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new int[]{-1173959925, -1464581195, -1812641807, 1805152602, 1407716191, -1210762083, 439015088, 1487253729, 1385293916, -111365500, -1201211290, 1629687350, 1842992436, -113533198}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new int[]{-1046815097, 1571475065, -497474862, 2140166374, -1196843262, 1630035690, -1507289546, 1975739469, -115360575, 1172220140}, View.combineMeasuredStates(0, 0) + 15, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iBlue = Color.blue(0) + 921;
                        int i11 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[80];
                        Object[] objArr16 = new Object[1];
                        a(b12, bArr5[37], b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iBlue, i11, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int i12 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iMyTid = (Process.myTid() >> 22) + 28;
                        byte b13 = $$a[37];
                        Object[] objArr17 = new Object[1];
                        a(b13, b13, (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, i12, iMyTid, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    int i14 = i13 % 2;
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
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i18 = i17 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[3])[0];
            int i22 = ((int[]) objArr[1])[0];
            new int[1][0] = i21;
            new int[1][0] = i22;
            int i23 = ~((-1399603280) | i);
            int i24 = ~i;
            int i25 = i20 + 1363779421 + ((i23 | (~(1467895375 | i24))) * (-406)) + ((~((-1093419012) | i24)) * (-406)) + (((~((-374476365) | i)) | (~(i24 | 1399603279))) * 406);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            int[] iArr = {i27 ^ (i27 << 5)};
            int i28 = i17 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
            int i29 = i28 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i30 = ((int[]) objArr[0])[0];
            Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode;
            int i32 = i30 + 1162263559 + ((iIdentityHashCode | 1063217766) * 140) + (((~(1063217766 | i31)) | 33809) * (-280)) + (((~(iIdentityHashCode | (-33810))) | (~(710861877 | i31)) | 352389698) * 140);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr18[0])[0] = i34 ^ (i34 << 5);
        }
        return new zzas[i];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 56
            int r7 = r7 + 66
            byte[] r0 = com.google.android.gms.location.zzat.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzat.$$g(int, byte, int):java.lang.String");
    }
}
