package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zbbi extends zbbf implements List, RandomAccess {
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final zbbl zba;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$f = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 83, 49, -116, -10, 6, 3, -14, 24, -28, 28, -19, -15, -1, 9, -7, 0};
    private static final int $$e = 202;
    private static final byte[] $$a = {115, 98, 19, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 57;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int b = 0;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zba = new zbbg(zbbj.zba, 0);
        int i = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    zbbi() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r8 = 103 - r8
            int r9 = r9 * 52
            int r9 = r9 + 1
            byte[] r0 = com.google.android.gms.internal.p000authapi.zbbi.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbbi.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 13
            int r0 = 14 - r8
            byte[] r1 = com.google.android.gms.internal.p000authapi.zbbi.$$d
            int r6 = r6 + 4
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r8 = 13 - r8
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L27:
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbbi.d(int, short, byte, java.lang.Object[]):void");
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (indexOf(obj) < 0) {
            return false;
        }
        int i4 = asBinder + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 2 % 2;
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = asInterface + 75;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        int i5 = asBinder + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (obj == null) {
            int i5 = i2 + 89;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                int i8 = asBinder;
                int i9 = i8 + 59;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                int i11 = i8 + 67;
                asInterface = i11 % 128;
                if (i11 % 2 != 0) {
                    return i7;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zbbl zbblVarZbk = zbk(0);
        int i4 = asBinder + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zbblVarZbk;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (obj == null) {
            return -1;
        }
        int i3 = asBinder + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        for (int size = size() - 1; size >= 0; size--) {
            int i5 = asInterface + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (obj.equals(get(size))) {
                int i7 = asBinder + 103;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                return size;
            }
        }
        int i9 = asBinder + 11;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zbbl zbblVarZbk = zbk(0);
        int i4 = asBinder + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zbblVarZbk;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    static zbbi zbj(Object[] objArr, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (i == 0) {
            int i3 = asBinder + 111;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return zbbj.zba;
            }
            zbbi zbbiVar = zbbj.zba;
            obj.hashCode();
            throw null;
        }
        zbbj zbbjVar = new zbbj(objArr, i);
        int i4 = asBinder + 35;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zbbjVar;
        }
        obj.hashCode();
        throw null;
    }

    public static zbbi zbi(Collection collection) {
        int i = 2 % 2;
        Object obj = null;
        if (collection instanceof zbbf) {
            zbbi zbbiVarZbe = ((zbbf) collection).zbe();
            if (!zbbiVarZbe.zbf()) {
                return zbbiVarZbe;
            }
            int i2 = asBinder + 95;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] array = zbbiVarZbe.toArray();
                return zbj(array, array.length);
            }
            Object[] array2 = zbbiVarZbe.toArray();
            zbj(array2, array2.length);
            obj.hashCode();
            throw null;
        }
        Object[] array3 = collection.toArray();
        int length = array3.length;
        int i3 = 0;
        while (i3 < length) {
            if (array3[i3] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 9);
                sb.append("at index ");
                sb.append(i3);
                throw new NullPointerException(sb.toString());
            }
            int i4 = asInterface + 103;
            asBinder = i4 % 128;
            i3 = i4 % 2 != 0 ? i3 + 119 : i3 + 1;
        }
        zbbi zbbiVarZbj = zbj(array3, array3.length);
        int i5 = asInterface + 49;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return zbbiVarZbj;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = iterator();
            Iterator it2 = list.iterator();
            while (it.hasNext()) {
                if (!it2.hasNext()) {
                    return false;
                }
                if (!Objects.equals(it.next(), it2.next())) {
                    int i2 = asBinder + 11;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
            }
            return !it2.hasNext();
        }
        int i4 = asInterface + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = asInterface + 107;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            if (!Objects.equals(get(i6), list.get(i6))) {
                int i9 = asInterface + 97;
                asBinder = i9 % 128;
                return i9 % 2 != 0;
            }
        }
        return true;
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 55;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMyTid = (char) (8328 - (Process.myTid() >> 22));
                    int iResolveSize = View.resolveSize(0, 0) + 1235;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 35;
                    byte b2 = (byte) ($$f & 3);
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iResolveSize, jumpTapTimeout, -653973969, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0), 2763 - TextUtils.indexOf((CharSequence) "", '0', 0), Process.getGidForName("") + 15, 1504416861, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 254 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 65201), 2892 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - KeyEvent.keyCodeFromString(""), 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i5 = $10 + 95;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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

    public /* synthetic */ List subList(int i, int i2) throws Throwable {
        Object[] objArr;
        int i3 = 2 % 2;
        int i4 = asBinder + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 4), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iCombineMeasuredStates, pressedStateDuration, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{45879, 39542, 31908, 61348}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{19704, 3577, 44012, 61613, 4482, 2268, 20905, 54359, 32518, 26993, 18613, 30628, 14935, 21480, 58593, 53962, 18381, 8190, 11226, 17931, 45136, 19051}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{38095, 34645, 57995, 31952}, (char) (53474 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-1954065004) - View.resolveSizeAndState(0, 0, 0), new char[]{12949, 1801, 18366, 5616, 25251, 49568, 11311, 48600, 12520, 18248, 2275, 4124, 53886, 37529, 49284}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[2], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, windowTouchSlop, scrollBarSize, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = asInterface + 47;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                int i8 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, absoluteGravity, i8, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = (((((~(i9 | (-158539334))) | ((~((-198849563) | i9)) | 156374016)) * (-397)) - 1761161036) + ((iIdentityHashCode | (-44640864)) * 397)) - 752849438;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{14906, 32793, 20944, 13327}, (char) (3921 - Color.green(0)), Color.argb(0, 0, 0, 0), new char[]{49031, 16707, 56484, 56578, 25141, 59821, 10373, 28608, 55322, 28471, 39636, 3876, 30157, 17087, 26786, 30708, 44715, 37718, 62906, 33400, 34239, 14918, 12197, 21749, 30500, 9546}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{53570, 65400, 41654, 9866}, (char) (ExpandableListView.getPackedPositionChild(0L) + 35491), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{43102, 14593, 9180, 19424, 55438, 46161, 498, 5770, 44654, 8835, 21598, 5012, 29630, 60902, 33258, 4179, 10955, 11151}, objArr9);
            Method method = cls2.getMethod((String) objArr9[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                int i13 = asInterface + 33;
                asBinder = i13 % 128;
                int i14 = i13 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), -752849438};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[13];
                byte b7 = bArr3[16];
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = (byte) (-bArr3[13]);
                Object[] objArr12 = new Object[1];
                d((byte) 12, b8, b8, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int iResolveSize = 876 - View.resolveSize(0, 0);
                        int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        a(b9, b10, b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iResolveSize, keyRepeatTimeout, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{45879, 39542, 31908, 61348}, (char) View.combineMeasuredStates(0, 0), View.combineMeasuredStates(0, 0), new char[]{19704, 3577, 44012, 61613, 4482, 2268, 20905, 54359, 32518, 26993, 18613, 30628, 14935, 21480, 58593, 53962, 18381, 8190, 11226, 17931, 45136, 19051}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{38095, 34645, 57995, 31952}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53474), (-1954065003) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{12949, 1801, 18366, 5616, 25251, 49568, 11311, 48600, 12520, 18248, 2275, 4124, 53886, 37529, 49284}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
                            int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[5];
                            Object[] objArr17 = new Object[1];
                            a(b11, bArr4[2], b11, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, bitsPerPixel, longPressTimeout, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cBlue = (char) Color.blue(0);
                            int iIndexOf = 876 - TextUtils.indexOf("", "");
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[5];
                            Object[] objArr18 = new Object[1];
                            a(b12, (byte) (b12 + 4), bArr5[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, iIndexOf, scrollBarFadeDuration, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i15 = asInterface + 113;
                        asBinder = i15 % 128;
                        int i16 = i15 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        new int[1][0] = i18;
        new int[1][0] = i19;
        int i20 = i17 + 550622960 + (((~((-50930178) | i)) | (~((~i) | (-10619949)))) * (-318)) + (((~(991798161 | i)) | (-1002418110)) * (-318)) + (((~((-991798162) | i)) | 951487932) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        int[] iArr = {i22 ^ (i22 << 5)};
        return zbh(i, i2);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    /* JADX INFO: renamed from: zba */
    public final zbbk iterator() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zbbl zbblVarZbk = zbk(0);
        int i4 = asInterface + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zbblVarZbk;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    int zbg(Object[] objArr, int i) {
        int i2 = 2 % 2;
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = asBinder + 113;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                objArr[i3] = get(i3);
                i3 += 58;
            } else {
                objArr[i3] = get(i3);
                i3++;
            }
            int i5 = asInterface + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        return size;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zbbl zbblVarZbk = zbk(i);
        int i5 = asBinder + 1;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return zbblVarZbk;
    }

    public zbbi zbh(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        zbbc.zbc(i, i2, size());
        int i6 = i2 - i;
        Object obj = null;
        if (i6 == size()) {
            int i7 = asInterface + 33;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }
        if (i6 != 0) {
            return new zbbh(this, i, i6);
        }
        int i8 = asBinder + 1;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        zbbi zbbiVar = zbbj.zba;
        int i10 = asBinder + 13;
        asInterface = i10 % 128;
        if (i10 % 2 != 0) {
            return zbbiVar;
        }
        obj.hashCode();
        throw null;
    }

    public final zbbl zbk(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zbbc.zbb(i, size(), FirebaseAnalytics.Param.INDEX);
        Object obj = null;
        if (!isEmpty()) {
            zbbg zbbgVar = new zbbg(this, i);
            int i5 = asBinder + 93;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return zbbgVar;
            }
            throw null;
        }
        int i6 = asInterface + 45;
        int i7 = i6 % 128;
        asBinder = i7;
        int i8 = i6 % 2;
        zbbl zbblVar = zba;
        int i9 = i7 + 23;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            return zbblVar;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    @Deprecated
    public final zbbi zbe() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 4370;
    }

    private static String $$g(byte b2, int i, short s) {
        int i2 = s + 4;
        int i3 = i * 3;
        byte[] bArr = $$c;
        int i4 = 104 - b2;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            i2++;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i2];
        }
    }
}
