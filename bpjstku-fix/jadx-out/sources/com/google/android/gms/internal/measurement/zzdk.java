package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdk extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzco zzc;
    final /* synthetic */ zzfb zzd;
    private static final byte[] $$c = {83, -90, 68, -23};
    private static final int $$f = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -1, 37, -59, 8, 25, -39, 47, 11, 13, 2, -24, 55, 16, 3, 0, 25, -18, 28, 21, -2, 11, 15, -17, 28, 6, 27, -5, 15, -8, 29, 6, 28, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 242;
    private static final byte[] $$a = {1, 115, -83, 116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 68;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1500837734484341552L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
    private static char b = 34097;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdk(zzfb zzfbVar, String str, String str2, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zzd = zzfbVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzdk.$$a
            int r8 = r8 * 15
            int r8 = 53 - r8
            int r7 = r7 * 3
            int r7 = r7 + 84
            int r9 = 92 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-11)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdk.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 29
            int r5 = 32 - r5
            byte[] r0 = com.google.android.gms.internal.measurement.zzdk.$$d
            int r6 = r6 * 19
            int r6 = r6 + 84
            int r7 = r7 * 23
            int r1 = r7 + 30
            byte[] r1 = new byte[r1]
            int r7 = r7 + 29
            r2 = -1
            if (r0 != 0) goto L18
            r6 = r5
            r3 = r7
            goto L2f
        L18:
            r4 = r6
            r6 = r5
            r5 = r4
        L1b:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2b:
            int r6 = r6 + 1
            r3 = r0[r6]
        L2f:
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdk.d(byte, short, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
            int i5 = $10 + 119;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) (8328 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1236;
                    int i7 = 35 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b2 = (byte) ($$f - 3);
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iIndexOf, i7, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int iResolveSizeAndState = 2764 - View.resolveSizeAndState(0, 0, 0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                    byte b4 = (byte) ($$f - 5);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, iResolveSizeAndState, maxKeyCode, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (Process.myTid() >> 22)), 253 - ExpandableListView.getPackedPositionGroup(0L), 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 65200);
                    int i8 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2890;
                    int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18;
                    byte b6 = (byte) ($$f - 4);
                    byte b7 = (byte) (b6 - 1);
                    String str$$g = $$g(b6, b7, b7);
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, i8, i9, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i10 = $10 + 97;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i3 = i2;
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

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        this.zzc.zzb(null);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzcr zzcrVar = (zzcr) Preconditions.checkNotNull(this.zzd.zzQ());
        String str = this.zza;
        String str2 = this.zzb;
        zzco zzcoVar = this.zzc;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[0];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 88), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, longPressTimeout, i4, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{30209, 30965, 59012, 45994}, new char[]{20984, 36076, 34606, 32139}, (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, new char[]{31585, 34975, 29448, 13525, 33165, 3969, 59973, 57871, 30927, 15617, 61119, 36767, 17744, 61733, 11811, 4480, 42789, 29338, 23178, 16954, 12923, 20387}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{30209, 30965, 59012, 45994}, new char[]{31018, 392, 20402, 34009}, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 55631), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1308522375, new char[]{40242, 33003, 37240, 2308, 2754, 45128, 9150, 8556, 39837, 21047, 29277, 53628, 53980, 53737, 13218}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte b4 = $$a[7];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iCombineMeasuredStates, iLastIndexOf, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, absoluteGravity, iResolveOpacity, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i7 = ~System.identityHashCode(this);
            int i8 = ((2087188660 + (((~(i7 | 53477058)) | 12582957) * (-160))) + (((~(i7 | 13166829)) | 53477058) * 160)) - 1501769590;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{30209, 30965, 59012, 45994}, new char[]{47947, 4448, 32267, 2824}, (char) (2174 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Gravity.getAbsoluteGravity(0, 0), new char[]{51650, 57089, 3163, 36032, 2665, 51967, 11436, 47035, 62386, 22924, 39314, 15153, 61295, 5726, 22764, 12135, 64676, 49075, 486, 51491, 53795, 53283, 37627, 6309, 20089, 22470}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{30209, 30965, 59012, 45994}, new char[]{30514, 21337, 34202, 58060}, (char) (52357 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{27676, 42241, 65061, 31817, 43278, 50705, 6445, 26279, 37610, 37278, 58626, 62745, 55790, 1646, 65325, 8591, 57530, 49002}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{30209, 30965, 59012, 45994}, new char[]{3127, 13013, 54797, 4834}, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 58071), AndroidCharacter.getMirror('0') - '0', new char[]{17342, 50004, 58850, 18119, 5891, 26393, 1091, 2550, 52798, 59527, 43733, 58795, 58475, 16822, 20392, 55371}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{30209, 30965, 59012, 45994}, new char[]{55495, 10873, 27546, 40876}, (char) (44139 - Color.argb(0, 0, 0, 0)), ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{8516, 61231, 7559, 19534, 59326, 47459, 63855, 62087, 57973, 60230, 22919, 60371, 43308, 62070, 47291, 37476}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentbindingInflater1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1501769590};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[66];
                Object[] objArr13 = new Object[1];
                d(b8, b8, bArr2[15], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[15];
                Object[] objArr14 = new Object[1];
                d(b9, b9, bArr2[66], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                    int i14 = i13 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                        int i15 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, b11, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iIndexOf, i15, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{30209, 30965, 59012, 45994}, new char[]{20984, 36076, 34606, 32139}, (char) Gravity.getAbsoluteGravity(0, 0), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{31585, 34975, 29448, 13525, 33165, 3969, 59973, 57871, 30927, 15617, 61119, 36767, 17744, 61733, 11811, 4480, 42789, 29338, 23178, 16954, 12923, 20387}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{30209, 30965, 59012, 45994}, new char[]{31018, 392, 20402, 34009}, (char) (55631 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1308522375, new char[]{40242, 33003, 37240, 2308, 2754, 45128, 9150, 8556, 39837, 21047, 29277, 53628, 53980, 53737, 13218}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 10;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr19 = new Object[1];
                            a(b12, b13, (byte) (b13 | 52), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, packedPositionChild, iResolveOpacity2, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i16 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[7];
                            byte b15 = bArr3[0];
                            Object[] objArr20 = new Object[1];
                            a(b14, b15, (byte) (b15 | 88), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i16, longPressTimeout2, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                        TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                        int i18 = i17 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[0])[0];
        if (i20 == i19) {
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            TuitionPaymentFragmentbindingInflater1 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i24 = ~(465051436 | startElapsedRealtime);
            int i25 = i23 + (-1625416444) + (((-469311360) | i24) * (-814)) + ((i24 | (~((~startElapsedRealtime) | 424741207)) | 420481284) * 407) + (((~(startElapsedRealtime | (-424741208))) | (~((-465051437) | startElapsedRealtime)) | 420481284) * 407);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[1])[0] = i27 ^ (i27 << 5);
        } else {
            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
            int i28 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyUid = Process.myUid();
            int i29 = i28 + (((~(iMyUid | 967240834)) | (-926930606)) * 56) + 643716508 + (((~((~iMyUid) | (-926930606))) | 967240834) * 56);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr22[1])[0] = i31 ^ (i31 << 5);
            int i32 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i32 % 128;
            int i33 = i32 % 2;
        }
        zzcrVar.getConditionalUserProperties(str, str2, zzcoVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r6 = 104 - r6
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = com.google.android.gms.internal.measurement.zzdk.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdk.$$g(byte, int, short):java.lang.String");
    }
}
