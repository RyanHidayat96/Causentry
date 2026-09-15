package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.work.WorkInfo;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzaza extends zzazc {
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private static final byte[] $$c = {15, -9, 64, -81};
    private static final int $$f = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, -124, -78, 46, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -73, 10, -18, -4, 6, -10, -3, 60, -35, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 76, -35, -34, -15, -4, 6, -3, -6, -12, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 91;
    private static final byte[] $$a = {30, 17, -35, 104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 231;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60053, 60045, 60050, 60049, 60041, 60060, 60056, 60048, 60054, 60073, 60051, 60072, 60117, 60057, 60063, 60043, 60083, 60058, 60034, 60040, 60055, 60052, 60088, 60062, 60047};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57188;

    /* synthetic */ zzaza(byte[] bArr, int i, int i2, boolean z, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zzg = bArr;
        this.zzh = i2;
        this.zzj = 0;
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
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 107 - r8
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r0 = com.google.android.libraries.places.internal.zzaza.$$a
            int r6 = r6 * 2
            int r6 = r6 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzaza.$$d
            int r6 = r6 * 10
            int r1 = 63 - r6
            int r7 = r7 * 13
            int r7 = 97 - r7
            int r8 = r8 * 62
            int r8 = 65 - r8
            byte[] r1 = new byte[r1]
            int r6 = 62 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r7 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-4)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.d(short, short, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzA(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.zzl = i;
        zzO();
        if (i4 == 0) {
            throw null;
        }
    }

    public final byte zzD() throws IOException {
        int i = 2 % 2;
        int i2 = this.zzj;
        if (i2 == this.zzh) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i3 = b + 27;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        int i5 = i3 % 2;
        byte[] bArr = this.zzg;
        this.zzj = i2 + 1;
        byte b2 = bArr[i2];
        int i6 = i4 + 25;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return b2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r4 <= (r0 - r1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r3.zzj = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r4 <= (r0 << r1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzE(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzaza.b
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            if (r4 < 0) goto L2a
            int r2 = r2 + 33
            int r1 = r2 % 128
            com.google.android.libraries.places.internal.zzaza.b = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L1f
            int r0 = r3.zzh
            int r1 = r3.zzj
            int r0 = r0 << r1
            if (r4 > r0) goto L2a
            goto L26
        L1f:
            int r0 = r3.zzh
            int r1 = r3.zzj
            int r0 = r0 - r1
            if (r4 > r0) goto L2a
        L26:
            int r1 = r1 + r4
            r3.zzj = r1
            return
        L2a:
            if (r4 >= 0) goto L34
            com.google.android.libraries.places.internal.zzbar r4 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r4.<init>(r0)
            throw r4
        L34:
            com.google.android.libraries.places.internal.zzbar r4 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.zzE(int):void");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final void zzb(int i) throws zzbar {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 67;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (this.zzk != i) {
            throw new zzbar("Protocol message end-group tag did not match expected tag.");
        }
        int i6 = i3 + 51;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zza() throws IOException {
        int i = 2 % 2;
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) == 0) {
            throw new zzbar("Protocol message contained an invalid tag (zero).");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 57;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        b = i5 % 128;
        int i6 = i5 % 2;
        return iZzu;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzc(int i) throws IOException {
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        int i5 = i4 % 128;
        b = i5;
        int i6 = 0;
        if (i4 % 2 != 0 ? (i2 = i & 7) == 0 : (i2 = i & 124) == 0) {
            if (this.zzh - this.zzj >= 10) {
                while (i6 < 10) {
                    byte[] bArr = this.zzg;
                    int i7 = this.zzj;
                    this.zzj = i7 + 1;
                    if (bArr[i7] < 0) {
                        int i8 = b + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        int i9 = i8 % 2;
                        i6++;
                    }
                }
                throw new zzbar("CodedInputStream encountered a malformed varint.");
            }
            while (i6 < 10) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                b = i10 % 128;
                if (i10 % 2 == 0) {
                    zzD();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (zzD() < 0) {
                    i6++;
                }
            }
            throw new zzbar("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        int i11 = i5 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        int i12 = i11 % 2;
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 == 3) {
            zzK();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzJ();
            return false;
        }
        if (i2 != 5) {
            throw new zzbaq("Protocol message tag had invalid wire type.");
        }
        int i13 = i5 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
        if (i13 % 2 != 0) {
            zzE(2);
        } else {
            zzE(4);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final double zzd() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3111;
            int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[5], bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumFlingVelocity, capsMode, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{15, 2, 19, '\t', 22, 1, '\n', '\r', 24, 16, '\r', '\f', 19, 15, 20, 24, 7, 23, 21, 22, 7, '\b'}, (byte) (70 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777238, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{24, 21, 18, 16, 18, 24, 19, 14, 22, 18, 21, 20, 3, 7, 13887}, (byte) (KeyEvent.keyCodeFromString("") + 64), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
            int iNormalizeMetaState = 3111 - KeyEvent.normalizeMetaState(0);
            int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(tapTimeout, iNormalizeMetaState, i3, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int iBlue = 3111 - Color.blue(0);
                int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iBlue, i4, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((~((-336597121) | iIdentityHashCode)) | 565280) * 449) + 389158498 + (((~((~iIdentityHashCode) | (-336597121))) | 565280) * 449) + 1286980435;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{2, 18, 2, 16, '\n', 22, 15, 2, 7, '\n', '\r', 16, 24, 4, 3, '\r'}, (byte) (Color.blue(0) + 24), TextUtils.lastIndexOf("", '0', 0) + 17, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{4, '\f', 20, 3, 22, 4, 23, 19, 17, 18, 15, 14, 23, 22, '\r', 24}, (byte) (30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 16 - TextUtils.getTrimmedLength(""), objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1286980435};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[103];
                Object[] objArr11 = new Object[1];
                d(b6, b6, bArr3[9], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[9];
                Object[] objArr12 = new Object[1];
                d(b7, b7, bArr3[103], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (43042 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iCombineMeasuredStates = 3111 - View.combineMeasuredStates(0, 0);
                    int doubleTapTimeout = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr13 = new Object[1];
                    a(b8, b9, b9, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iCombineMeasuredStates, doubleTapTimeout, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{15, 2, 19, '\t', 22, 1, '\n', '\r', 24, 16, '\r', '\f', 19, 15, 20, 24, 7, 23, 21, 22, 7, '\b'}, (byte) (Process.getGidForName("") + 71), View.MeasureSpec.getSize(0) + 22, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{24, 21, 18, 16, 18, 24, 19, 14, 22, 18, 21, 20, 3, 7, 13887}, (byte) (63 - TextUtils.lastIndexOf("", '0', 0, 0)), Process.getGidForName("") + 16, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 3111;
                        int i10 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[7];
                        byte b11 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, windowTouchSlop, i10, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111;
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr5[7], bArr5[5], bArr5[40], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, fadingEdgeLength, i11, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                b = i14 % 128;
                while (true) {
                    int i15 = i14 % 2;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    arrayList.add(strArr2[i2]);
                    i2++;
                    i14 = b + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i19};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i21 = ~startUptimeMillis;
        int i22 = i18 + 1991439962 + (((~((-1602865877) | i21)) | (-102165583) | (~(1602865876 | startUptimeMillis))) * (-564)) + ((~(startUptimeMillis | (-1451019))) * 1128) + (((~((-102165583) | i21)) | (-1604316895)) * 564);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
        Object[] objArr18 = {new int[1], new int[]{i20}, iArr, strArr3};
        int i25 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
        int i26 = i25 % 2;
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final float zze() throws IOException {
        float fIntBitsToFloat;
        int i = 2 % 2;
        int i2 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            fIntBitsToFloat = Float.intBitsToFloat(zzx());
            int i3 = 50 / 0;
        } else {
            fIntBitsToFloat = Float.intBitsToFloat(zzx());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return fIntBitsToFloat;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzf() throws IOException {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzv();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jZzv = zzv();
        int i3 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return jZzv;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzg() throws IOException {
        int i = 2 % 2;
        int i2 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzv();
        }
        zzv();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzh() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iZzu = zzu();
        int i4 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iZzu;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzi() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i2 % 128;
        int i3 = i2 % 2;
        long jZzy = zzy();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        b = i4 % 128;
        int i5 = i4 % 2;
        return jZzy;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzj() throws IOException {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iZzx = zzx();
        int i4 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iZzx;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzk() throws IOException {
        int i = 2 % 2;
        if (zzv() != 0) {
            int i2 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzo() throws IOException {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzu();
        }
        zzu();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzp() throws IOException {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzu();
            throw null;
        }
        int iZzu = zzu();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i3 % 128;
        int i4 = i3 % 2;
        return iZzu;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzq() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        int iZzx = zzx();
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iZzx;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzr() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzy();
            obj.hashCode();
            throw null;
        }
        long jZzy = zzy();
        int i3 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return jZzy;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzs() throws IOException {
        int i = 2 % 2;
        int i2 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iZzM = zzM(zzu());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iZzM;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final long zzt() throws IOException {
        int i = 2 % 2;
        int i2 = b + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        long jZzN = zzN(zzv());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return jZzN;
        }
        throw null;
    }

    public final int zzx() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.zzj;
        if (this.zzh - i5 < 4) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i5 + 4;
        byte b2 = bArr[i5];
        int i6 = ((bArr[i5 + 3] & UByte.MAX_VALUE) << 24) | ((bArr[i5 + 1] & UByte.MAX_VALUE) << 8) | (b2 & UByte.MAX_VALUE) | ((bArr[i5 + 2] & UByte.MAX_VALUE) << 16);
        int i7 = i3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final long zzy() throws IOException {
        int i = 2 % 2;
        int i2 = b + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = this.zzj;
        if (this.zzh - i5 < 8) {
            throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i5 + 8;
        long j = ((((long) bArr[i5 + 6]) & 255) << 48) | ((((long) bArr[i5 + 5]) & 255) << 40) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((((long) bArr[i5 + 7]) & 255) << 56);
        int i6 = i3 + 47;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r2 = r4.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r5 > r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r1 = r1 + 5;
        com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
        r4.zzl = r5;
        zzO();
        r5 = com.google.android.libraries.places.internal.zzaza.b + 37;
        com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbar("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r5 = r5 + r4.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r5 < 0) goto L16;
     */
    @Override // com.google.android.libraries.places.internal.zzazc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzz(int r5) throws com.google.android.libraries.places.internal.zzbar {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzaza.b
            int r2 = r1 + 41
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L15
            r2 = 77
            int r2 = r2 / 0
            if (r5 < 0) goto L46
            goto L17
        L15:
            if (r5 < 0) goto L46
        L17:
            int r2 = r4.zzj
            int r5 = r5 + r2
            if (r5 < 0) goto L3e
            int r2 = r4.zzl
            if (r5 > r2) goto L36
            int r1 = r1 + 5
            int r3 = r1 % 128
            com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r1 = r1 % r0
            r4.zzl = r5
            r4.zzO()
            int r5 = com.google.android.libraries.places.internal.zzaza.b
            int r5 = r5 + 37
            int r1 = r5 % 128
            com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r5 = r5 % r0
            return r2
        L36:
            com.google.android.libraries.places.internal.zzbar r5 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r5.<init>(r0)
            throw r5
        L3e:
            com.google.android.libraries.places.internal.zzbar r5 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r0 = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter()."
            r5.<init>(r0)
            throw r5
        L46:
            com.google.android.libraries.places.internal.zzbar r5 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.zzz(int):int");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final String zzl() throws IOException {
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iZzu = zzu();
        if (iZzu > 0) {
            int i4 = this.zzh;
            int i5 = this.zzj;
            if (iZzu <= i4 - i5) {
                String str = new String(this.zzg, i5, iZzu, zzbap.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu != 0) {
            if (iZzu >= 0) {
                throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return "";
        }
        int i7 = 72 / 0;
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 <= (r2 - r3)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0 = com.google.android.libraries.places.internal.zzbcw.zzc(r4.zzg, r3, r1);
        r4.zzj += r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r1 <= (r2 + r3)) goto L11;
     */
    @Override // com.google.android.libraries.places.internal.zzazc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzm() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r4.zzu()
            if (r1 <= 0) goto L2f
            int r2 = com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r2 + 89
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzaza.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1c
            int r2 = r4.zzh
            int r3 = r4.zzj
            int r2 = r2 + r3
            if (r1 > r2) goto L2f
            goto L23
        L1c:
            int r2 = r4.zzh
            int r3 = r4.zzj
            int r2 = r2 - r3
            if (r1 > r2) goto L2f
        L23:
            byte[] r0 = r4.zzg
            java.lang.String r0 = com.google.android.libraries.places.internal.zzbcw.zzc(r0, r3, r1)
            int r2 = r4.zzj
            int r2 = r2 + r1
            r4.zzj = r2
            return r0
        L2f:
            if (r1 != 0) goto L3d
            int r1 = com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzaza.b = r2
            int r1 = r1 % r0
            java.lang.String r0 = ""
            return r0
        L3d:
            if (r1 > 0) goto L47
            com.google.android.libraries.places.internal.zzbar r0 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L47:
            com.google.android.libraries.places.internal.zzbar r0 = new com.google.android.libraries.places.internal.zzbar
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.zzm():java.lang.String");
    }

    final long zzw() throws IOException {
        int i = 2 % 2;
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        long j = 0;
        for (int i3 = i2 % 2 != 0 ? 1 : 0; i3 < 64; i3 += 7) {
            int i4 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            byte bZzD = zzD();
            j |= ((long) (bZzD & ByteCompanionObject.MAX_VALUE)) << i3;
            if ((bZzD & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw new zzbar("CodedInputStream encountered a malformed varint.");
    }

    public final int zzu() throws IOException {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = this.zzj;
        int i5 = this.zzh;
        if (i5 != i4) {
            byte[] bArr = this.zzg;
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                this.zzj = i6;
                return b2;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b2;
                if (i8 < 0) {
                    i = i8 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i2 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b3 = bArr[i11];
                            int i13 = (i12 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                int i14 = b + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                                int i15 = i14 % 2;
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                if (bArr[i9] >= 0) {
                                                    i7 = i4 + 10;
                                                    i = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i13;
                            }
                            i = i13;
                        }
                        i7 = i11;
                        int i16 = b + 103;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                        int i17 = i16 % 2;
                        i = i2;
                    }
                    i7 = i9;
                }
                this.zzj = i7;
                return i;
            }
        }
        return (int) zzw();
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final zzayz zzn() throws IOException {
        int i = 2 % 2;
        int i2 = b + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzu();
            throw null;
        }
        int iZzu = zzu();
        if (iZzu > 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.zzh;
            int i6 = this.zzj;
            if (iZzu <= i5 - i6) {
                zzayz zzayzVarZzh = zzayz.zzh(this.zzg, i6, iZzu);
                this.zzj += iZzu;
                int i7 = b + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
                return zzayzVarZzh;
            }
        }
        if (iZzu == 0) {
            return zzayz.zzb;
        }
        if (iZzu > 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            b = i9 % 128;
            int i10 = i9 % 2;
            int i11 = this.zzh;
            int i12 = this.zzj;
            if (iZzu <= i11 - i12) {
                int i13 = iZzu + i12;
                this.zzj = i13;
                return new zzayy(Arrays.copyOfRange(this.zzg, i12, i13));
            }
        }
        if (iZzu <= 0) {
            throw new zzbar("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzbar("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r3[r0] >= 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzv() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.zzv():long");
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 103;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (b3 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267, (Process.myPid() >> 22) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 3;
                        byte b6 = (byte) (b5 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 2266 - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                }
                i6++;
                i3 = 2;
                i5 = 3;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 3;
            byte b8 = (byte) (b7 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2267, 33 - View.resolveSizeAndState(0, 0, 0), -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i8 = $11 + 105;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49266);
                        int gidForName = Process.getGidForName("") + 3262;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 30;
                        byte b9 = (byte) ($$f & 3);
                        byte b10 = (byte) (b9 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, gidForName, iIndexOf, -127612708, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - (Process.myTid() >> 22)), 593 - MotionEvent.axisFromString(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                    } else {
                        int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            int i16 = $11 + 23;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                cArr4[i15] = (char) (cArr4[i15] ^ 6400);
                i15 += 88;
            } else {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r0 = r2 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r5.zzi = r0;
        r5.zzh = r2 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r0 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r5.zzi = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r2 > r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 > r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = r1 + 17;
        com.google.android.libraries.places.internal.zzaza.b = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzO() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzaza.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r1 + 11
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzaza.b = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1a
            int r2 = r5.zzh
            int r3 = r5.zzi
            int r2 = r2 + r3
            r5.zzh = r2
            int r3 = r5.zzl
            if (r2 <= r3) goto L3a
            goto L25
        L1a:
            int r2 = r5.zzh
            int r3 = r5.zzi
            int r2 = r2 + r3
            r5.zzh = r2
            int r3 = r5.zzl
            if (r2 <= r3) goto L3a
        L25:
            int r1 = r1 + 17
            int r4 = r1 % 128
            com.google.android.libraries.places.internal.zzaza.b = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L36
            int r0 = r2 / r3
        L30:
            r5.zzi = r0
            int r2 = r2 - r0
            r5.zzh = r2
            goto L39
        L36:
            int r0 = r2 - r3
            goto L30
        L39:
            return
        L3a:
            r0 = 0
            r5.zzi = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.zzO():void");
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final boolean zzB() throws IOException {
        int i = 2 % 2;
        int i2 = b + 125;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.zzj != this.zzh) {
            return false;
        }
        int i4 = i3 + 31;
        b = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzazc
    public final int zzC() {
        int i = 2 % 2;
        int i2 = b + 97;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = this.zzj;
        int i6 = i3 + 87;
        b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzaza.$$c
            int r6 = 116 - r6
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaza.$$g(int, short, int):java.lang.String");
    }
}
