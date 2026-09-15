package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
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
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzfm implements ObjectEncoder {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    static final zzfm zza;
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;
    private static final byte[] $$c = {27, 65, -33, 120};
    private static final int $$f = 80;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {17, 104, 102, -28, -15, -18, 11, -21, -7, -5, -7, -29, 5, 23, -56, 7, -32, 12, -11, -20, -3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 57};
    private static final int $$e = 79;
    private static final byte[] $$a = {27, -8, 5, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 188;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new zzfm();
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = builder2.withProperty(zzcqVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = builder3.withProperty(zzcqVar3.zzb()).build();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = 53 - r6
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_face.zzfm.$$a
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r7 = r7 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzfm.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 17
            int r5 = 20 - r5
            int r7 = r7 * 21
            int r7 = 105 - r7
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzfm.$$d
            int r6 = r6 * 35
            int r1 = r6 + 18
            byte[] r1 = new byte[r1]
            int r6 = r6 + 17
            r2 = -1
            if (r0 != 0) goto L18
            r3 = r2
            r2 = r5
            goto L33
        L18:
            r4 = r7
            r7 = r5
            r5 = r4
        L1b:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r6) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2b:
            int r7 = r7 + 1
            r3 = r0[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L33:
            int r7 = -r7
            int r5 = r5 + r7
            int r5 = r5 + (-10)
            r7 = r2
            r2 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzfm.d(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 111;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 5;
        }
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 1356, 38 - View.resolveSize(0, 0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 468 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) ((Process.myTid() >> 22) + 37567);
            int i2 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iResolveSize = 14 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, i2, iResolveSize, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{35027, 34994, 41414, 21857, 16654, 33133, 43256, 24388, 23448, 37605, 5162, 60949, 12020, 52739, 9996, 56244, 61894, 15143, 51826, 2278, 50222, 5243, 40630, 30144, 38660, 16759}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{1518, 1419, 15050, 52847, 60667, 3355, 1288, 54064, 54969, 2535, 47578, 25117, 41923, 21791, 35518, 22503, 31979, 41015, 26515}, TextUtils.getOffsetAfter("", 0) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37568);
            int i3 = 626 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i4 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i3, i4, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                int modifierMetaStateMask = 624 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, modifierMetaStateMask, i5, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = 378411976 + (((~((-1779755701) | i8)) | 34867732) * 168) + ((~((-34867733) | iIdentityHashCode)) * 168) + (((~(iIdentityHashCode | (-1744887969))) | (~(i8 | (-43982421))) | 9114688) * 168) + 213264712;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{40715, 40810, 43138, 23589, 42453, 15899, 19491, 57394, 19520, 39841, 61681, 20835, 14626, 51012, 50057, 25791, 58918, 12915, 11945, 47004, 54253, 7445, 31349, 51872, 33003, 18480, 17687, 7768, 28082, 48096}, TextUtils.indexOf("", "", 0, 0) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{17042, 17137, 16796, 46368, 54482, 56996, 15666, 141, 37331, 29347, 33264, 45491, 58538, 11841, 45700, 33863, 15261, 56180, 24504, 22307, 3693, 62487}, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{55545, 55443, 64594, 2298, 64522, 50674, 5614, 7112, 3059, 53115, 43321, 43737, 32470, 37829, 39527, 40722, 41446, 26299, 30581, 19554}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{34315, 34402, 54627, 8654, 41772, 10730, 19163, 63455, 21851, 58954, 63001, 18137, 8203, 47806, 50546, 29460, 65316, 20372, 10305, 41085}, (Process.myPid() >> 22) + 1, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{50797, 50783, 41398, 21786, 55499, 4705, 12607, 52315, 5416, 37525, 36335, 32018, 24604, 52845, 48771, 18637, 48996, 15178, 21408, 39849, 35530, 5234, 1835, 59093, 55788, 16720, 14414, 12854, 13520, 45708, 60727, 7513, 930, 61371, 40581, 26677, 24436, 55442, 46015, 47897, 43544, 13350, 25809, 34469, 63843, 24862, 6641, 53664, 54407, 21034, 52498, 15497, 9148, 36691, 65093, 2097, 32397, 63679, 37739, 23318, 19884, 54755, 17537, 42602, 39187, 1689, 31139, 61774}, (Process.myPid() >> 22) + 1, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{21721, 21690, 26261, 37437, 23422, 39559, 45704, 17642, 34765, 21989, 3676, 62882, 62196, 2378, 15714, 49195, 11728, 64570, 53264, 4889, 6267, 54103, 33948, 28210, 19288, 34423, 48040, 47827, 42595, 30120, 28288, 38368, 37142, 10433, 7487, 57477, 52672, 8118, 12303, 13216, 14505, 62293, 59199, 3655, 27523, 42601, 39444, 22815, 18018, 38236, 20133, 46142, 45392, 18471, 32243, 32984, 60527, 16276, 4317, 54263, 57154, 4762, 50992, 11917, 2980, 49640, 64016, 31227}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 213264712};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[24];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr15 = new Object[1];
                d(b6, b7, b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr4[24];
                byte b9 = (byte) (b8 - 1);
                byte b10 = b8;
                Object[] objArr16 = new Object[1];
                d(b9, b10, b10, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i14 = ((int[]) objArr17[0])[0];
                int i15 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 37567);
                        int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                        int packedPositionChild = 13 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        a(b11, b11, bArr5[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, tapTimeout, packedPositionChild, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new char[]{35027, 34994, 41414, 21857, 16654, 33133, 43256, 24388, 23448, 37605, 5162, 60949, 12020, 52739, 9996, 56244, 61894, 15143, 51826, 2278, 50222, 5243, 40630, 30144, 38660, 16759}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new char[]{1518, 1419, 15050, 52847, 60667, 3355, 1288, 54064, 54969, 2535, 47578, 25117, 41923, 21791, 35518, 22503, 31979, 41015, 26515}, Color.blue(0) + 1, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
                            int threadPriority = 625 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int defaultSize = 14 - View.getDefaultSize(0, 0);
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[7];
                            byte b13 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            a(b12, b13, b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, threadPriority, defaultSize, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            int longPressTimeout = 625 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 14;
                            byte[] bArr7 = $$a;
                            byte b14 = bArr7[5];
                            byte b15 = bArr7[7];
                            Object[] objArr22 = new Object[1];
                            a(b14, b14, b15, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, longPressTimeout, absoluteGravity, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[2])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[1])[0];
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = ~((-1208157377) | iIdentityHashCode2);
            int i22 = i18 + 876335216 + ((69263926 | i21) * (-476)) + (i21 * 952) + ((~((~iIdentityHashCode2) | (-1208157377))) * 476);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[1])[0] = i24 ^ (i24 << 5);
            Object[] objArr23 = {new int[]{i20}, new int[1], new int[]{i19}, strArr3};
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr4 = (String[]) objArr[3];
        if (strArr4 != null) {
            int i25 = 0;
            while (i25 < strArr4.length) {
                int i26 = b + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                if (i26 % 2 != 0) {
                    arrayList.add(strArr4[i25]);
                    i25 += 76;
                } else {
                    arrayList.add(strArr4[i25]);
                    i25++;
                }
            }
        }
        int[] iArr2 = new int[i17];
        int i27 = i17 - 1;
        iArr2[i27] = 1;
        Toast.makeText((Context) null, iArr2[((i17 * i27) % 2) - 1], 1).show();
        int i28 = ((int[]) objArr[1])[0];
        int i29 = ((int[]) objArr[2])[0];
        int i30 = ((int[]) objArr[0])[0];
        String[] strArr5 = (String[]) objArr[3];
        int iMyUid = Process.myUid();
        int i31 = ~iMyUid;
        int i32 = i28 + (-1928389976) + (((~(1800348282 | i31)) | 2147460) * 184) + ((iMyUid | 1779105904) * (-184)) + ((~((-23389839) | i31)) * 184);
        int i33 = (i32 << 13) ^ i32;
        int i34 = i33 ^ (i33 >>> 17);
        ((int[]) objArr[1])[0] = i34 ^ (i34 << 5);
        Object[] objArr24 = {new int[]{i30}, new int[1], new int[]{i29}, strArr5};
        throw null;
    }

    private zzfm() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -7888751622866198865L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzfm.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = 107 - r6
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            r3 = -1
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            goto L2b
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            r4 = r0[r6]
        L2b:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzfm.$$g(int, int, int):java.lang.String");
    }
}
