package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.SimpleArrayMap;
import com.google.common.collect.ImmutableSet;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class zzqt {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asInterface;
    private static short[] b;
    private static final zzqr zza;
    private final zzqt zzb;
    private final SimpleArrayMap zzc;
    private boolean zzd = false;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$f = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {77, -106, 83, 4, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -32, -52, 9, -14, -14, 0, -17, -14, 43, -58, 2, -10, 34, -42, -25, 3, -21, 9, 13, -25, -25, -10, 3, -2, -14, -15, 7, -21, -14, 41, -46, -19, 3, -25, 13, -17, -13, 3, -9, -15, 36, -51, 4, -26, 0, 0, -17, -14, 42, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 6;
    private static final byte[] $$a = {94, 6, -99, -107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 41;
    private static int g = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f793a = 0;

    /* synthetic */ zzqt(zzqt zzqtVar, SimpleArrayMap simpleArrayMap, byte[] bArr) {
        if (zzqtVar != null && !zzqtVar.zzd) {
            throw new IllegalArgumentException();
        }
        this.zzb = zzqtVar;
        this.zzc = simpleArrayMap;
        int i = g + 67;
        d = i % 128;
        int i2 = i % 2;
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
    private static void c(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzqt.$$a
            int r6 = r6 * 3
            int r6 = r6 + 84
            int r5 = r5 * 15
            int r1 = 53 - r5
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqt.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 78
            int r6 = 82 - r6
            int r8 = r8 * 26
            int r0 = r8 + 53
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r1 = com.google.android.libraries.places.internal.zzqt.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 52
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqt.f(int, byte, short, java.lang.Object[]):void");
    }

    final zzqt zzb() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 37;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.zzd) {
            throw new IllegalStateException("Already frozen");
        }
        int i4 = i2 + 19;
        g = i4 % 128;
        int i5 = i4 % 2;
        this.zzd = true;
        zzqt zzqtVar = this.zzb;
        if (zzqtVar == null || !this.zzc.isEmpty()) {
            int i6 = d + 101;
            g = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }
        int i7 = g + 7;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        return zzqtVar;
    }

    public final boolean zzc() {
        int i = 2 % 2;
        int i2 = g + 45;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            zzqt zzqtVar = zzqs.zza;
            throw null;
        }
        if (this != zzqs.zza) {
            return false;
        }
        int i3 = g + 123;
        d = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SpanExtras<");
        int i2 = d + 99;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 % 2;
        }
        for (zzqt zzqtVar = this; zzqtVar != null; zzqtVar = zzqtVar.zzb) {
            int i4 = g + 91;
            d = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < zzqtVar.zzc.getSize(); i6++) {
                int i7 = d + 65;
                g = i7 % 128;
                int i8 = i7 % 2;
                sb.append(this.zzc.valueAt(i6));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static zzqt zza(zzqt zzqtVar, zzqt zzqtVar2) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (zzqtVar.zzc()) {
            return zzqtVar2;
        }
        if (zzqtVar2.zzc()) {
            int i4 = d + 109;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
            return zzqtVar;
        }
        ImmutableSet<zzqt> immutableSetB = ImmutableSet.b(zzqtVar, zzqtVar2);
        if (immutableSetB.isEmpty()) {
            return zzqs.zza;
        }
        if (immutableSetB.size() == 1) {
            return (zzqt) immutableSetB.iterator().next();
        }
        int size = 0;
        for (zzqt zzqtVar3 : immutableSetB) {
            do {
                size += zzqtVar3.zzc.getSize();
                zzqtVar3 = zzqtVar3.zzb;
            } while (zzqtVar3 != null);
        }
        if (size == 0) {
            int i6 = g + 25;
            d = i6 % 128;
            int i7 = i6 % 2;
            return zzqs.zza;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(size);
        Iterator<E> it = immutableSetB.iterator();
        while (true) {
            Object obj = null;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (!it.hasNext()) {
                return new zzqs(objArr3 == true ? 1 : 0, simpleArrayMap, objArr2 == true ? 1 : 0).zzb();
            }
            int i8 = d + 87;
            g = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            zzqt zzqtVar4 = (zzqt) it.next();
            do {
                int i9 = 0;
                while (true) {
                    SimpleArrayMap simpleArrayMap2 = zzqtVar4.zzc;
                    if (i9 < simpleArrayMap2.getSize()) {
                        if (simpleArrayMap.put((zzqr) simpleArrayMap2.keyAt(i9), simpleArrayMap2.valueAt(i9)) == null) {
                            int i10 = d + 81;
                            g = i10 % 128;
                            int i11 = i10 % 2;
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        Object objKeyAt = simpleArrayMap2.keyAt(i9);
                        if (objArr != true) {
                            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Duplicate bindings: %s", objKeyAt));
                        }
                        i9++;
                    }
                }
                zzqtVar4 = zzqtVar4.zzb;
            } while (zzqtVar4 != null);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    final boolean zzd(zzqr zzqrVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3111;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, keyRepeatTimeout, iIndexOf, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-1552925947) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 51, (short) ((-1) - Process.getGidForName("")), (byte) (ViewConfiguration.getEdgeSlop() >> 16), Gravity.getAbsoluteGravity(0, 0) + 940071515, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-1552925943) - View.getDefaultSize(0, 0), AndroidCharacter.getMirror('0') - 'c', (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (byte) TextUtils.getOffsetBefore("", 0), KeyEvent.keyCodeFromString("") + 940071537, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16820258);
            int iRed = 3111 - Color.red(0);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b4, b4, bArr[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, iRed, doubleTapTimeout, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042);
                int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(bArr2[132], bArr2[7], bArr2[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, i2, maximumDrawingCacheSize, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i5 = (-578370750) + (((~((-426532795) | iUptimeMillis)) | 136599336) * 1504) + ((~(iUptimeMillis | (-289933459))) * (-1504)) + 511807382;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[1], new int[]{i4}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e((ViewConfiguration.getJumpTapTimeout() >> 16) - 1552925938, (ViewConfiguration.getJumpTapTimeout() >> 16) - 51, (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 940071552 - Color.alpha(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-1552925938) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-51) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 940071568, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1810343606};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[12];
                Object[] objArr11 = new Object[1];
                f(b5, bArr3[32], b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[32];
                Object[] objArr12 = new Object[1];
                f(b6, bArr3[12], b6, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 43042);
                    int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112;
                    int doubleTapTimeout2 = 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr4[132], bArr4[7], bArr4[37], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, i8, doubleTapTimeout2, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e((-1552925947) - TextUtils.indexOf("", "", 0), (-51) - TextUtils.getCapsMode("", 0, 0), (short) ExpandableListView.getPackedPositionType(0L), (byte) (Process.myPid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 940071515, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e((-1552925943) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-51) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) TextUtils.indexOf("", ""), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 940071537 - TextUtils.indexOf("", "", 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cGreen = (char) (Color.green(0) + 43042);
                        int i9 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int mirror = 'F' - AndroidCharacter.getMirror('0');
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b7, b7, bArr5[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, i9, mirror, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cBlue = (char) (Color.blue(0) + 43042);
                        int i10 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iArgb = Color.argb(0, 0, 0, 0) + 22;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr18 = new Object[1];
                        c(b8, b9, b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, i10, iArgb, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
                throw null;
            }
            throw null;
        }
        int i11 = d + 121;
        g = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int i16 = ~System.identityHashCode(this);
        int i17 = i13 + (((1511855794 + (((~(i16 | (-1073873169))) | (~((-563873291) | i16))) * (-184))) + (((33642500 | (~((-597515791) | i16))) | (~((-1107515669) | i16))) * 184)) - 1702077040);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
        Object[] objArr19 = {new int[1], new int[]{i15}, new int[]{i14}, strArr3};
        if (!(!this.zzc.containsKey(zzqrVar))) {
            return true;
        }
        zzqt zzqtVar = this.zzb;
        if (zzqtVar != null && !(!zzqtVar.zzd(zzqrVar))) {
            int i20 = g + 27;
            d = i20 % 128;
            int i21 = i20 % 2;
            return true;
        }
        int i22 = ((int[]) objArr19[0])[0];
        int i23 = i22 * i22;
        int i24 = -(913116499 * i22);
        int i25 = (i23 & i24) + (i23 | i24);
        int i26 = -(i22 * (-802228641));
        int i27 = ((i25 ^ i26) + ((i26 & i25) << 1)) - (-910125553);
        int i28 = i27 >> 15;
        int i29 = ((((-262143) | i28) << 1) - (i28 ^ (-262143))) / 131072;
        int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
        int i31 = (i27 & i30) + (i30 | i27);
        int i32 = i27 >> 20;
        int i33 = (((i32 | (-8191)) << 1) - (i32 ^ (-8191))) / 4096;
        int i34 = -(((i33 & 1) + (i33 | 1)) ^ i31);
        int i35 = (i34 & 2) + (i34 | 2);
        int i36 = i35 >> 18;
        int i37 = (((i36 ^ (-32767)) + ((i36 & (-32767)) << 1)) / 16384) + 1;
        return 0 / (((-((i37 ^ 1) + ((i37 & 1) << 1))) & i35) * 196);
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 2267, 33 - (ViewConfiguration.getTouchSlop() >> 8), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                char c = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $11 + 67;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 3358 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", c) + 19, -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + 3358, AndroidCharacter.getMirror('0') - 30, -1054011043, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i6++;
                        }
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = $10 + 113;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2266, TextUtils.indexOf((CharSequence) "", '0', 0) + 34, 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i10 = $11 + 119;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i5;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55905 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 2855 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0, 0) + 13, -1529949196, false, $$g(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $10 + 113;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i15 = $10 + 69;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i17 = $10 + 97;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = b;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        asInterface = 1;
        TuitionPaymentFragmentbindingInflater1();
        zza = zzqr.zza(Boolean.class);
        int i = f793a + 9;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ zzqr zzf() {
        int i = 2 % 2;
        int i2 = d + 21;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        zzqr zzqrVar = zza;
        int i5 = i3 + 51;
        d = i5 % 128;
        int i6 = i5 % 2;
        return zzqrVar;
    }

    final boolean zze() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 5;
        g = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzd;
        int i5 = i2 + 11;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    final /* synthetic */ SimpleArrayMap zzg() {
        int i = 2 % 2;
        int i2 = d + 11;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        SimpleArrayMap simpleArrayMap = this.zzc;
        int i5 = i3 + 121;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return simpleArrayMap;
    }

    final /* synthetic */ boolean zzh() {
        int i = 2 % 2;
        int i2 = d + 9;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        boolean z = this.zzd;
        int i5 = i3 + 7;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1264253251;
        TuitionPaymentFragmentbindingInflater1 = -1934795564;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -803038790;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new byte[]{2, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 59, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 56, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 56, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 + 117
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzqt.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqt.$$g(byte, byte, int):java.lang.String");
    }
}
