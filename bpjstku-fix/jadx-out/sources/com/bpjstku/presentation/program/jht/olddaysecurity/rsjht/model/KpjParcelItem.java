package com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bpjstku.domain.jht.model.JhtBalance;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/rsjht/model/KpjParcelItem;", "Landroid/os/Parcelable;", "", "Lcom/bpjstku/domain/jht/model/JhtBalance;", "p0", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KpjParcelItem implements Parcelable {
    public static final Parcelable.Creator<KpjParcelItem> CREATOR;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final List<JhtBalance> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$d = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {25, 5, -88, -44, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 243;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static int b = 0;

    private static void c(byte b2, short s, int i, Object[] objArr) {
        int i2 = s * 3;
        int i3 = 84 - (b2 * 3);
        int i4 = 3 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 11;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            int i8 = i4 + 1;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i8]) - 11;
                i4 = i8;
                i6 = i7;
            }
        }
    }

    public KpjParcelItem(List<JhtBalance> list) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
    }

    public final String toString() throws Throwable {
        int iIntValue;
        int i = 2 % 2;
        List<JhtBalance> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 40, 19 - Drawable.resolveOpacity(0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        a(new int[]{0, 22, 157, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new int[]{22, 15, 0, 3}, true, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 449;
        long j2 = -1;
        long j3 = ((j2 ^ 1347957702687215930L) | 749299472054743057L) ^ j2;
        long j4 = j2 ^ 749299472054743057L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = (((long) 450) * 1347957702687215930L) + (((long) (-448)) * 749299472054743057L) + ((j3 | (((j4 | 1347957702687215930L) | jIdentityHashCode) ^ j2)) * j) + (((long) (-1347)) * j3) + (j * (j3 | (((j4 | (jIdentityHashCode ^ j2)) | 1347957702687215930L) ^ j2)));
        int i4 = 0;
        long j6 = jLongValue;
        try {
            while (i4 != 10) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                g = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 59 - KeyEvent.keyCodeFromString(""), KeyEvent.normalizeMetaState(i2) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                int i8 = i2;
                long j7 = j6;
                while (true) {
                    int i9 = i2;
                    while (i9 != 8) {
                        int i10 = g + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        if (i10 % 2 != 0) {
                            i7 = (((((int) (j7 << i9)) & 4349) * (i7 / 4)) + (i7 % 8)) / i7;
                            i9 += 122;
                        } else {
                            i7 = (((((int) (j7 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                            i9++;
                        }
                        i8 = i8;
                    }
                    int i11 = i8;
                    if (i11 != 0) {
                        break;
                    }
                    i8 = i11 + 1;
                    j7 = j5;
                    i2 = 0;
                }
                if (i7 == i3) {
                    StringBuilder sb = new StringBuilder("KpjParcelItem(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
                    sb.append(list);
                    sb.append(")");
                    return sb.toString();
                }
                j6 -= 1024;
                i4++;
                i2 = 0;
            }
            Object[] objArr3 = {-547322398};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.red(0) + 46038), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1134, 18 - KeyEvent.keyCodeFromString(""), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -1213110614, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, iRgb, capsMode, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 45993), Color.red(0) + 1117, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            if (((int[]) objArr6[3])[0] != ((int[]) objArr6[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                        g = i12 % 128;
                        int i13 = i12 % 2;
                        arrayList.add(str);
                    }
                }
                throw null;
            }
            StringBuilder sb2 = new StringBuilder("KpjParcelItem(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
            sb2.append(list);
            sb2.append(")");
            return sb2.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        Object[] objArr7 = new Object[1];
        a(new int[]{37, 16, 0, 5}, false, new byte[]{1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr7);
        Class<?> cls2 = Class.forName((String) objArr7[0]);
        Object[] objArr8 = new Object[1];
        a(new int[]{53, 16, 141, 13}, false, new byte[]{1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}, objArr8);
        iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1270 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 19, 407021364, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $10 + 21;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                int i11 = $11 + 1;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.rgb(0, 0, 0) + 16780441, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, 2133916302, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8)), 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, 387247676, false, $$e(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getTouchSlop() >> 8)), 1705 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20 - MotionEvent.axisFromString(""), -1434471773, false, $$e(b8, b9, (byte) (b9 | 6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i16 = $11 + 77;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i18;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i19 = $10 + 27;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[5]);
                        setvideostabilizationmode.b++;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i18 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = g + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r6 instanceof com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 7;
        com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem.g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r1 + 125
            int r3 = r2 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem.g = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 72
            int r2 = r2 / r4
            if (r5 != r6) goto L23
            goto L18
        L16:
            if (r5 != r6) goto L23
        L18:
            int r1 = r1 + 7
            int r6 = r1 % 128
            com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem.g = r6
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            return r4
        L22:
            return r3
        L23:
            boolean r0 = r6 instanceof com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem
            if (r0 != 0) goto L28
            return r4
        L28:
            com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem r6 = (com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem) r6
            java.util.List<com.bpjstku.domain.jht.model.JhtBalance> r0 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.List<com.bpjstku.domain.jht.model.JhtBalance> r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L35
            return r4
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.rsjht.model.KpjParcelItem.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        List<JhtBalance> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list != null) {
            return list.hashCode();
        }
        int i2 = g;
        int i3 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = g + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        List<JhtBalance> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list == null) {
            int i4 = g + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            p0.writeInt(0);
            return;
        }
        p0.writeInt(1);
        p0.writeInt(list.size());
        Iterator<JhtBalance> it = list.iterator();
        while (!(!it.hasNext())) {
            int i6 = g + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            it.next().writeToParcel(p0, p1);
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        g = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 46 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59764, 59407, 59405, 59395, 59398, 59394, 59400, 59885, 59872, 59397, 59878, 59862, 59400, 59416, 59419, 59394, 59405, 59902, 59903, 59393, 59405, 59407, 59707, 59757, 59747, 59758, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59703, 59773, 59768, 59751, 59746, 59744, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59766, 59893, 59888, 59888, 59400, 59878, 59882, 59900, 59889, 59881, 59885, 59901, 59898, 59903, 59896, 59898};
    }

    private static String $$e(byte b2, byte b3, short s) {
        int i = (b3 * 4) + 4;
        int i2 = b2 * 3;
        int i3 = s + 99;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i3 = (-i) + i2;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i3;
            i4 = i5;
            i3 = (-bArr[i]) + i6;
            i++;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<KpjParcelItem> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KpjParcelItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(JhtBalance.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new KpjParcelItem(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KpjParcelItem[] newArray(int i) {
            return new KpjParcelItem[i];
        }
    }
}
