package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.tasks.CancellationToken;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfz {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final zzmg zza;
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$d = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {80, -8, 43, 65};
    private static final int $$b = 108;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    private static void c(byte b, byte b2, byte b3, Object[] objArr) {
        int i = 103 - b2;
        int i2 = b * 4;
        int i3 = 3 - (b3 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = i4 + (-i3);
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            int i7 = i3 + 1;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i += -bArr[i7];
                i3 = i7;
                i5 = i6;
            }
        }
    }

    protected final CancellationToken zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        CancellationToken cancellationToken = this.zza.getCancellationToken();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return cancellationToken;
    }

    protected abstract Map zzc();

    protected abstract String zzd();

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 71;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0), 2187 - ((Process.getThreadPriority(0) + 20) >> 6), 40 - KeyEvent.getDeadChar(0, 0), 841711447, false, $$e(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.getDefaultSize(0, 0)), AndroidCharacter.getMirror('0') + 2963, (Process.myPid() >> 22) + 26, 321985076, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 36505), ((Process.getThreadPriority(0) + 20) >> 6) + 3376, 16 - TextUtils.lastIndexOf("", '0'), -968507904, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 87;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "") + 3376, ExpandableListView.getPackedPositionType(0L) + 17, -968507904, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            try {
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36505), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3376, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, -968507904, false, $$e(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    protected zzfz(zzmg zzmgVar) {
        this.zza = zzmgVar;
    }

    protected final zzmg zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzmg zzmgVar = this.zza;
        int i5 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return zzmgVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:128:0x0ae2 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0bee A[LOOP:2: B:123:0x0ad0->B:133:0x0bee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:140:0x0c41 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0cb5 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:151:0x0d2f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0d32  */
    /* JADX WARN: Code duplicated, block: B:161:0x0df5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0e08 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0e10  */
    /* JADX WARN: Code duplicated, block: B:172:0x0e13 A[Catch: all -> 0x0e5c, IOException -> 0x0e5f, TRY_LEAVE, TryCatch #29 {IOException -> 0x0e5f, all -> 0x0e5c, blocks: (B:158:0x0deb, B:159:0x0dee, B:164:0x0dfa, B:166:0x0e00, B:168:0x0e0a, B:172:0x0e13), top: B:579:0x0deb }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0e34 A[LOOP:22: B:171:0x0e11->B:175:0x0e34, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0e49  */
    /* JADX WARN: Code duplicated, block: B:181:0x0e4b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0e51  */
    /* JADX WARN: Code duplicated, block: B:185:0x0e59  */
    /* JADX WARN: Code duplicated, block: B:201:0x0eb6 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0f34  */
    /* JADX WARN: Code duplicated, block: B:206:0x0f3a  */
    /* JADX WARN: Code duplicated, block: B:209:0x1008  */
    /* JADX WARN: Code duplicated, block: B:210:0x102b  */
    /* JADX WARN: Code duplicated, block: B:214:0x10a2  */
    /* JADX WARN: Code duplicated, block: B:217:0x10b1 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x1187 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x1269  */
    /* JADX WARN: Code duplicated, block: B:233:0x126d  */
    /* JADX WARN: Code duplicated, block: B:241:0x12f2  */
    /* JADX WARN: Code duplicated, block: B:246:0x12fd A[Catch: all -> 0x136c, IOException -> 0x1378, TryCatch #32 {IOException -> 0x1378, all -> 0x136c, blocks: (B:238:0x12e8, B:239:0x12eb, B:244:0x12f7, B:246:0x12fd, B:248:0x1308, B:252:0x1312), top: B:573:0x12e8 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x1306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x1308 A[Catch: all -> 0x136c, IOException -> 0x1378, TryCatch #32 {IOException -> 0x1378, all -> 0x136c, blocks: (B:238:0x12e8, B:239:0x12eb, B:244:0x12f7, B:246:0x12fd, B:248:0x1308, B:252:0x1312), top: B:573:0x12e8 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x130f  */
    /* JADX WARN: Code duplicated, block: B:252:0x1312 A[Catch: all -> 0x136c, IOException -> 0x1378, TRY_LEAVE, TryCatch #32 {IOException -> 0x1378, all -> 0x136c, blocks: (B:238:0x12e8, B:239:0x12eb, B:244:0x12f7, B:246:0x12fd, B:248:0x1308, B:252:0x1312), top: B:573:0x12e8 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x1339 A[LOOP:18: B:251:0x1310->B:255:0x1339, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x135d  */
    /* JADX WARN: Code duplicated, block: B:263:0x135f  */
    /* JADX WARN: Code duplicated, block: B:266:0x1365  */
    /* JADX WARN: Code duplicated, block: B:277:0x137d  */
    /* JADX WARN: Code duplicated, block: B:280:0x1398  */
    /* JADX WARN: Code duplicated, block: B:283:0x1475  */
    /* JADX WARN: Code duplicated, block: B:286:0x1484 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x1572 A[LOOP:4: B:281:0x1472->B:291:0x1572, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x164d  */
    /* JADX WARN: Code duplicated, block: B:300:0x1668 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x1760 A[LOOP:5: B:295:0x164a->B:305:0x1760, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x1790 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x1871 A[Catch: all -> 0x01f3, TRY_ENTER, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:316:0x1883 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x1969  */
    /* JADX WARN: Code duplicated, block: B:321:0x1970  */
    /* JADX WARN: Code duplicated, block: B:325:0x19b1 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x19ff A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x1a17 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x1af5  */
    /* JADX WARN: Code duplicated, block: B:335:0x1afb  */
    /* JADX WARN: Code duplicated, block: B:338:0x2825  */
    /* JADX WARN: Code duplicated, block: B:340:0x2831  */
    /* JADX WARN: Code duplicated, block: B:343:0x2843 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x288b  */
    /* JADX WARN: Code duplicated, block: B:347:0x289d  */
    /* JADX WARN: Code duplicated, block: B:350:0x28b1 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x28f5  */
    /* JADX WARN: Code duplicated, block: B:355:0x290a  */
    /* JADX WARN: Code duplicated, block: B:367:0x293c  */
    /* JADX WARN: Code duplicated, block: B:369:0x2995  */
    /* JADX WARN: Code duplicated, block: B:370:0x29a0  */
    /* JADX WARN: Code duplicated, block: B:372:0x29f0  */
    /* JADX WARN: Code duplicated, block: B:377:0x2a64  */
    /* JADX WARN: Code duplicated, block: B:378:0x2a79  */
    /* JADX WARN: Code duplicated, block: B:383:0x2ae2 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:386:0x2b2b  */
    /* JADX WARN: Code duplicated, block: B:387:0x2b2e A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:389:0x2b46 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:399:0x303a  */
    /* JADX WARN: Code duplicated, block: B:402:0x3049 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:407:0x3143  */
    /* JADX WARN: Code duplicated, block: B:410:0x3179 A[Catch: all -> 0x01f3, TRY_ENTER, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:412:0x3186 A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:419:0x326a  */
    /* JADX WARN: Code duplicated, block: B:426:0x34bd  */
    /* JADX WARN: Code duplicated, block: B:428:0x34cd  */
    /* JADX WARN: Code duplicated, block: B:438:0x34ff  */
    /* JADX WARN: Code duplicated, block: B:443:0x350c  */
    /* JADX WARN: Code duplicated, block: B:444:0x3520 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:445:0x3522  */
    /* JADX WARN: Code duplicated, block: B:447:0x3529  */
    /* JADX WARN: Code duplicated, block: B:449:0x352c  */
    /* JADX WARN: Code duplicated, block: B:455:0x354e A[LOOP:12: B:448:0x352a->B:455:0x354e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:463:0x358e  */
    /* JADX WARN: Code duplicated, block: B:464:0x359a  */
    /* JADX WARN: Code duplicated, block: B:488:0x3680 A[Catch: all -> 0x3750, TryCatch #28 {all -> 0x3750, blocks: (B:486:0x3673, B:488:0x3680, B:489:0x36bb), top: B:563:0x3673, outer: #19 }] */
    /* JADX WARN: Code duplicated, block: B:493:0x374b A[Catch: Exception -> 0x3759, TryCatch #19 {Exception -> 0x3759, blocks: (B:485:0x3616, B:491:0x3706, B:493:0x374b, B:496:0x3751, B:498:0x3757, B:499:0x3758, B:486:0x3673, B:488:0x3680, B:489:0x36bb), top: B:550:0x3616, inners: #28 }] */
    /* JADX WARN: Code duplicated, block: B:494:0x374e  */
    /* JADX WARN: Code duplicated, block: B:504:0x37ad A[Catch: all -> 0x01f3, TryCatch #15 {all -> 0x01f3, blocks: (B:6:0x00e2, B:8:0x00ef, B:9:0x0129, B:21:0x0285, B:23:0x0292, B:24:0x02ce, B:31:0x03f1, B:33:0x03fe, B:34:0x0438, B:68:0x071d, B:70:0x0723, B:71:0x075f, B:126:0x0ad5, B:128:0x0ae2, B:129:0x0b1c, B:138:0x0c34, B:140:0x0c41, B:141:0x0c82, B:199:0x0ea9, B:201:0x0eb6, B:202:0x0efa, B:215:0x10a4, B:217:0x10b1, B:218:0x10f4, B:226:0x117a, B:228:0x1187, B:229:0x11c7, B:284:0x1477, B:286:0x1484, B:287:0x14be, B:298:0x165b, B:300:0x1668, B:301:0x16a9, B:308:0x178a, B:310:0x1790, B:311:0x17c8, B:314:0x1871, B:316:0x1883, B:317:0x18c3, B:323:0x19a4, B:325:0x19b1, B:326:0x19f6, B:328:0x19ff, B:330:0x1a17, B:331:0x1a5a, B:381:0x2ad5, B:383:0x2ae2, B:384:0x2b22, B:400:0x303c, B:402:0x3049, B:403:0x3088, B:410:0x3179, B:412:0x3186, B:413:0x31c4, B:502:0x37a0, B:504:0x37ad, B:505:0x37eb, B:387:0x2b2e, B:389:0x2b46, B:390:0x2b8f, B:341:0x2836, B:343:0x2843, B:345:0x288f, B:348:0x28a4, B:350:0x28b1, B:352:0x28f7, B:144:0x0ca8, B:146:0x0cb5, B:147:0x0cf4, B:44:0x0597, B:46:0x05a4, B:47:0x05e7, B:58:0x069e, B:60:0x06ab, B:61:0x06f0), top: B:544:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:507:0x388e  */
    /* JADX WARN: Code duplicated, block: B:557:0x35ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x12dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0ddf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x34e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0be3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x0bf5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x1114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x156b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x157e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x1772 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x1757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x3277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x3137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x3256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x326f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x326f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x3602 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x34dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x35a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x35eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x35d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x35d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x358a A[EDGE_INSN: B:607:0x358a->B:461:0x358a BREAK  A[LOOP:9: B:435:0x34f8->B:460:0x357e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x355f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x3565 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x2a2a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x135b A[EDGE_INSN: B:622:0x135b->B:261:0x135b BREAK  A[LOOP:15: B:239:0x12eb->B:260:0x1358], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x134b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x1349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0e47 A[EDGE_INSN: B:631:0x0e47->B:179:0x0e47 BREAK  A[LOOP:19: B:159:0x0dee->B:632:0x0dee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0e0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0e00 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0e41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0e3f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0e3d A[SYNTHETIC] */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
        String str;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        BufferedInputStream bufferedInputStream;
        int i12;
        long j;
        BufferedInputStream bufferedInputStream2;
        int i13;
        long j2;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        String[] strArr;
        int i17;
        int i18;
        int i19;
        int i20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2;
        int i21;
        String str3;
        byte[] bytes;
        int length;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i22;
        byte[] bArr2;
        int i23;
        int i24;
        boolean z;
        int i25;
        int i26;
        int i27;
        int i28;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        String lowerCase;
        Object[] objArr;
        int i29;
        String[] strArr2;
        int i30;
        int i31;
        int scrollBarSize;
        int i32;
        int i33;
        int keyRepeatDelay;
        int i34;
        int offsetAfter;
        char c;
        int i35;
        int i36;
        int i37;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        long j3;
        long j4;
        int i38;
        int i39;
        String str4;
        byte[] bytes2;
        int length2;
        BufferedInputStream bufferedInputStream5;
        BufferedInputStream bufferedInputStream6;
        int i40;
        int i41;
        byte[] bArr3;
        int i42;
        int i43;
        boolean z2;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        String[] strArr3;
        int i49;
        int i50;
        int i51;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i52;
        int i53;
        int i54;
        int i55;
        String[] strArr4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        long j5;
        long j6;
        long j7;
        int i56;
        int iNextInt;
        int i57;
        int i58;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Object objInvoke;
        String[][] strArr5;
        StringBuilder sb;
        int i59;
        int i60;
        int i61;
        Object[] objArr2;
        String[] strArr6;
        int i62;
        int i63;
        String[] strArr7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        String str5;
        int i64;
        int i65;
        int iB;
        int i66;
        int i67;
        int i68;
        int i69;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objInvoke2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i70;
        String[][] strArr8;
        char c2;
        int i71;
        int i72;
        int i73;
        String[] strArr9;
        int i74;
        int i75;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        int i76;
        int i77;
        String str6;
        String[] strArr10;
        int length3;
        int i78;
        byte[] bytes3;
        int length4;
        BufferedInputStream bufferedInputStream7;
        String[][] strArr11;
        String[] strArr12;
        String str7;
        int i79;
        BufferedInputStream bufferedInputStream8;
        BufferedInputStream bufferedInputStream9;
        int i80;
        byte[] bArr4;
        int i81;
        int i82;
        boolean z3;
        int i83;
        int i84;
        int i85;
        String[] strArr13;
        int i86;
        int i87;
        int i88;
        int i89;
        String[] strArr14;
        int i90;
        int i91;
        String str8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        String[] strArr15;
        int i92;
        int i93;
        int i94;
        Object[] objArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        int i95;
        int i96;
        int i97;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        int i98;
        int i99;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        String[] strArr16;
        int i100;
        int i101;
        String[] strArr17;
        int i102;
        int i103;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        int i104;
        int i105;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        String str9;
        Object[] objArr4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        int i106;
        int i107;
        int i108;
        int iFreeMemory;
        int i109;
        int i110;
        int i111 = 2 % 2;
        int i112 = 0;
        int i113 = -TextUtils.indexOf("", "", 0, 0);
        int i114 = 1;
        Object[] objArr5 = new Object[1];
        a((i113 & 908) + (i113 | 908), Color.green(0) + 8, (char) (35491 - (~(-ExpandableListView.getPackedPositionType(0L)))), objArr5);
        String str10 = (String) objArr5[0];
        new ArrayList();
        int i115 = -1;
        int i116 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1;
        int i117 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        Object[] objArr6 = new Object[1];
        a(i116, (i117 & 26) + (i117 | 26), (char) TextUtils.getOffsetAfter("", 0), objArr6);
        String str11 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 27, 24 - (~TextUtils.indexOf("", "")), (char) TextUtils.indexOf("", "", 0, 0), objArr7);
        String str12 = (String) objArr7[0];
        int i118 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        Object[] objArr8 = new Object[1];
        a((i118 ^ 51) + ((i118 & 51) << 1), 17 - (~(-Color.red(0))), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr8);
        String str13 = (String) objArr8[0];
        int i119 = -(-AndroidCharacter.getMirror('0'));
        int i120 = (i119 & 22) + (i119 | 22);
        int i121 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i122 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        Object[] objArr9 = new Object[1];
        a(i120, ((i121 | 28) << 1) - (i121 ^ 28), (char) ((i122 ^ 34100) + ((i122 & 34100) << 1)), objArr9);
        String[] strArr18 = {str11, str12, str13, (String) objArr9[0]};
        int i123 = 0;
        while (true) {
            if (i123 >= 4) {
                str = str10;
                i4 = i;
                break;
            }
            try {
                Object[] objArr10 = {strArr18[i123]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char mode = (char) View.MeasureSpec.getMode(i112);
                    int i124 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int offsetBefore = 8 - TextUtils.getOffsetBefore("", i112);
                    byte b = (byte) i112;
                    byte b2 = (byte) (b + 5);
                    Object[] objArr11 = new Object[i114];
                    c(b, b2, (byte) (b2 - 5), objArr11);
                    String str14 = (String) objArr11[i112];
                    Class[] clsArr = new Class[i114];
                    clsArr[i112] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(mode, i124, offsetBefore, 410748506, false, str14, clsArr);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr10)).longValue();
                long j8 = 546789414;
                str = str10;
                long j9 = i115;
                long j10 = jLongValue ^ j9;
                long j11 = i;
                long j12 = j11 ^ j9;
                long j13 = (((long) 50) * j8) + (((long) (-97)) * jLongValue) + (((long) 98) * (((j10 | j12) ^ j9) | ((j10 | j8) ^ j9))) + (((long) (-49)) * (j10 | (((j8 ^ j9) | j12) ^ j9) | ((j8 | j11) ^ j9))) + (((long) 49) * (((j8 | jLongValue) ^ j9) | ((j10 | j11) ^ j9))) + ((long) (-747707651));
                int i125 = ~i;
                int i126 = ((int) (j13 >> 32)) & ((-377400092) + ((657841118 | i125) * (-757)) + ((~((-138420225) | i)) * 1514) + (((~((-779385293) | i125)) | 640965068 | (~(796261342 | i))) * 757));
                int i127 = ~(724002698 | i125);
                int i128 = ~(713223711 | i);
                int i129 = ((int) j13) & (334239082 + ((i127 | i128) * 1150) + (((~((-713223712) | i125)) | i128) * (-575)) + (((~(i125 | (-724002699))) | (~(724002698 | i))) * 575));
                if (((i126 & i129) | (i126 ^ i129)) != 0) {
                    int i130 = ((i123 | 190) << 1) - (i123 ^ 190);
                    i4 = (i130 | i) & (~(i & i130));
                    break;
                }
                i123++;
                str10 = str;
                i112 = 0;
                i115 = -1;
                i114 = 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i131 = -Process.getGidForName("");
        int i132 = 11 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
        int i133 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        Object[] objArr12 = new Object[1];
        a((i131 & 97) + (i131 | 97), i132, (char) ((i133 & 1) + (i133 | 1)), objArr12);
        String str15 = (String) objArr12[0];
        int gidForName = Process.getGidForName("") + 111;
        int iGreen = Color.green(0) + 13;
        int i134 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
        Object[] objArr13 = new Object[1];
        a(gidForName, iGreen, (char) ((i134 & 38072) + (i134 | 38072)), objArr13);
        String str16 = (String) objArr13[0];
        int iAxisFromString = MotionEvent.axisFromString("") + 124;
        int i135 = 17 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16));
        int i136 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        Object[] objArr14 = new Object[1];
        a(iAxisFromString, i135, (char) ((i136 ^ 52670) + ((i136 & 52670) << 1)), objArr14);
        String[] strArr19 = {str15, str16, (String) objArr14[0]};
        int i137 = 0;
        while (true) {
            if (i137 >= 3) {
                i5 = i;
                break;
            }
            Object[] objArr15 = {strArr19[i137]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iArgb = Color.argb(0, 0, 0, 0) + 993;
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 9;
                byte b3 = (byte) 0;
                Object[] objArr16 = new Object[1];
                c(b3, (byte) (b3 | 6), b3, objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(windowTouchSlop, iArgb, packedPositionChild, 349342683, false, (String) objArr16[0], new Class[]{String.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr15)).longValue();
            long j14 = -593828624;
            String[] strArr20 = strArr19;
            int i138 = i137;
            long j15 = -1;
            long j16 = ((j14 ^ j15) | jLongValue2) ^ j15;
            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            long j17 = startElapsedRealtime ^ j15;
            long j18 = (((long) 595) * j14) + (((long) (-1187)) * jLongValue2) + (((long) (-1188)) * (j16 | ((j17 | jLongValue2) ^ j15)));
            long j19 = 594;
            long j20 = jLongValue2 ^ j15;
            long j21 = j16 | ((startElapsedRealtime | j20) ^ j15);
            long j22 = (j17 | j14) ^ j15;
            long j23 = j18 + ((j21 | j22) * j19) + (j19 * ((j15 ^ (j20 | j14)) | ((j20 | j17) ^ j15) | j22)) + ((long) (-253249981));
            int i139 = (int) Runtime.getRuntime().totalMemory();
            int i140 = ~i139;
            int i141 = ((int) (j23 >> 32)) & (599668634 + (((~(387935266 | i140)) | (~((-320220195) | i139))) * (-831)) + ((~(2145381871 | i139)) * (-1662)) + (((~(i139 | (-387935267))) | (~(i140 | (-1825161678))) | (~(1825161677 | i139))) * 831));
            int i142 = ~((-1998257610) | i);
            int i143 = ~i;
            int i144 = i142 | (~(859483276 | i143));
            int i145 = ~(1998257609 | i143);
            int i146 = ((int) j23) & (2054777161 + ((i144 | i145) * (-516)) + (((~((-857386121) | i)) | (~(i143 | (-2097157)))) * 516) + ((2097156 | i145) * 516));
            if (((i141 & i146) | (i141 ^ i146)) != 0) {
                i5 = i ^ (i138 + 270);
                break;
            }
            i137 = ((i138 | 1) << 1) - (i138 ^ 1);
            int i147 = TuitionPaymentFragmentbindingInflater1;
            int i148 = (i147 ^ 25) + ((i147 & 25) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i148 % 128;
            int i149 = i148 % 2;
            strArr19 = strArr20;
        }
        int i150 = i ^ i4;
        int i151 = -i150;
        int i152 = ((i150 & i151) | (i150 ^ i151)) >> 31;
        int i153 = i5 & (~i152);
        int i154 = i4 & i152;
        int i155 = (i154 & i153) | (i153 ^ i154);
        int i156 = -Gravity.getAbsoluteGravity(0, 0);
        Object[] objArr17 = new Object[1];
        a((i156 & 141) + (i156 | 141), 13 - (~(-TextUtils.getCapsMode("", 0, 0))), (char) View.MeasureSpec.getSize(0), objArr17);
        Object[] objArr18 = {(String) objArr17[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int iMyPid = (Process.myPid() >> 22) + 993;
            int iRgb = Color.rgb(0, 0, 0) + 16777224;
            byte b4 = (byte) 0;
            byte b5 = b4;
            Object[] objArr19 = new Object[1];
            c(b4, b5, b5, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cResolveSize, iMyPid, iRgb, -545305915, false, (String) objArr19[0], new Class[]{String.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr18)).longValue();
        long j24 = 181182143;
        long j25 = 70;
        long j26 = -68;
        long j27 = (j25 * j24) + (j26 * jLongValue3);
        long j28 = 69;
        long j29 = -1;
        long j30 = j24 ^ j29;
        long j31 = jLongValue3 ^ j29;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j32 = -69;
        long j33 = j27 + (((((j30 | j31) | jMaxMemory) ^ j29) | (((j24 | jLongValue3) | jMaxMemory) ^ j29)) * j28) + ((((j30 | jLongValue3) ^ j29) | ((j30 | jMaxMemory) ^ j29) | ((jMaxMemory | jLongValue3) ^ j29)) * j32) + (((j31 | j24) ^ j29) * j28) + ((long) 439277141);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i157 = ~startUptimeMillis;
        int i158 = ((int) (j33 >> 32)) & (2012704074 + ((~((-1759176394) | i157)) * (-560)) + ((~(startUptimeMillis | (-679486529))) * (-560)) + (((~((-1098564492) | i157)) | 18874626) * 560));
        int iNextInt2 = new Random().nextInt(599563712);
        int i159 = ~iNextInt2;
        int i160 = ((int) j33) & ((-1501838082) + (((~((-1193667895) | i159)) | (~(1731198271 | iNextInt2))) * (-831)) + ((~((-67125281) | iNextInt2)) * (-1662)) + (((~(iNextInt2 | 1193667894)) | (~(i159 | (-1664072992))) | (~(1664072991 | iNextInt2))) * 831));
        if (((i158 & i160) | (i158 ^ i160)) != 0) {
            int i161 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i161 % 128;
            if (i161 % 2 != 0) {
                i6 = i;
                i10 = i6 & (-5116);
                i11 = (~i6) & 5115;
                i7 = i10 | i11;
            } else {
                i6 = i;
                i8 = ~(i6 & 266);
                i9 = i6 | 266;
                i7 = i8 & i9;
            }
        } else {
            i6 = i;
            int i162 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i163 = i162 * (-433);
            int i164 = (i163 ^ (-33264)) + ((i163 & (-33264)) << 1);
            int i165 = ~i162;
            int i166 = ~i6;
            int i167 = i164 + (((~((i165 & i166) | (i165 ^ i166))) | (~((-155) | i6))) * 217);
            int i168 = ~i162;
            int i169 = -(-(((~((i168 & i6) | (i168 ^ i6))) | (~((i168 ^ (-155)) | (i168 & (-155))))) * 217));
            int i170 = (i167 & i169) + (i169 | i167);
            int i171 = ~(((-155) & i166) | ((-155) ^ i166));
            int i172 = (i170 - (~(((i162 & i171) | (i162 ^ i171)) * 217))) - 1;
            int i173 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr20 = new Object[1];
            a(i172, (i173 & 23) + (i173 | 23), (char) ((-TextUtils.lastIndexOf("", '0')) - 1), objArr20);
            Object[] objArr21 = {(String) objArr20[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char packedPositionType = (char) (33602 - ExpandableListView.getPackedPositionType(0L));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                int mode2 = View.MeasureSpec.getMode(0) + 26;
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 + 5);
                Object[] objArr22 = new Object[1];
                c(b6, b7, (byte) (b7 - 5), objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(packedPositionType, scrollBarFadeDuration, mode2, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
            }
            String str17 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr21);
            if (str17 == null || str17.isEmpty()) {
                int iAxisFromString2 = MotionEvent.axisFromString("") + 180;
                int i174 = 71 - (~(-AndroidCharacter.getMirror('0')));
                int i175 = TuitionPaymentFragmentbindingInflater1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i175 % 128;
                int i176 = i175 % 2;
                int i177 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i178 = (i177 * 765) - 37806993;
                int i179 = ~((~i6) | i177);
                int i180 = -(-(((i179 & 24759) | (i179 ^ 24759)) * 764));
                int i181 = (i178 & i180) + (i178 | i180);
                int i182 = ~i177;
                int i183 = ~(i182 | 24759);
                int i184 = ~((i166 & 24759) | (i166 ^ 24759));
                int i185 = -(-(((i183 & i184) | (i183 ^ i184)) * (-1528)));
                int i186 = (i181 & i185) + (i185 | i181);
                int i187 = ~(i182 | 24759);
                int i188 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                TuitionPaymentFragmentbindingInflater1 = i188 % 128;
                if (i188 % 2 == 0) {
                    int i189 = ~(((-24760) ^ i177) | ((-24760) & i177));
                    int i190 = (i187 & i189) | (i187 ^ i189);
                    int i191 = ~((i177 & i166) | (i166 ^ i177));
                    Object[] objArr23 = new Object[1];
                    a(iAxisFromString2, i174, (char) (i186 - (764 / ((i191 & i190) | (i190 ^ i191)))), objArr23);
                    obj = objArr23[0];
                } else {
                    int i192 = ~(((-24760) ^ i177) | ((-24760) & i177));
                    char c3 = (char) (i186 + (((~((i177 & i166) | (i166 ^ i177))) | (i187 ^ i192) | (i187 & i192)) * 764));
                    Object[] objArr24 = new Object[1];
                    a(iAxisFromString2, i174, c3, objArr24);
                    obj = objArr24[0];
                }
                Object[] objArr25 = {(String) obj};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char tapTimeout = (char) (33602 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i193 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3084;
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 26;
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 5);
                    Object[] objArr26 = new Object[1];
                    c(b8, b9, (byte) (b9 - 5), objArr26);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(tapTimeout, i193, packedPositionType2, 1411172903, false, (String) objArr26[0], new Class[]{String.class});
                }
                String str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr25);
                if (str18 == null || str18.isEmpty()) {
                    i7 = i6;
                } else {
                    i8 = ~(i6 & 267);
                    i9 = i6 | 267;
                    i7 = i8 & i9;
                }
            } else {
                i10 = i6 & (-268);
                i11 = (~i6) & 267;
                i7 = i10 | i11;
            }
        }
        int i194 = (~i155) & i6;
        int i195 = ~i6;
        int i196 = i194 | (i155 & i195);
        int i197 = -i196;
        int i198 = ((i196 & i197) | (i196 ^ i197)) >> 31;
        int i199 = (i7 & (~i198)) | (i155 & i198);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char bitsPerPixel = (char) (56826 - ImageFormat.getBitsPerPixel(0));
            int size = 2814 - View.MeasureSpec.getSize(0);
            int iAlpha = 9 - Color.alpha(0);
            byte b10 = (byte) 0;
            byte b11 = (byte) (b10 + 5);
            Object[] objArr27 = new Object[1];
            c(b10, b11, (byte) (b11 - 5), objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(bitsPerPixel, size, iAlpha, -1639816125, false, (String) objArr27[0], new Class[0]);
        }
        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, null)).longValue();
        long j34 = 832323281;
        long j35 = -754;
        long j36 = j34 ^ j29;
        long j37 = j36 | jLongValue4;
        int i200 = i195;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j38 = (((long) 755) * j34) + (((long) (-753)) * jLongValue4) + (((j37 ^ j29) | ((j36 | jElapsedRealtime) ^ j29) | ((jLongValue4 | jElapsedRealtime) ^ j29)) * j35);
        long j39 = (j37 | jElapsedRealtime) ^ j29;
        long j40 = jElapsedRealtime ^ j29;
        long j41 = j38 + (j35 * (j39 | ((jLongValue4 | (j34 | j40)) ^ j29))) + (((long) 754) * (j36 | j40)) + ((long) 1281033225);
        int i201 = ((int) (j41 >> 32)) & ((-1806459486) + ((353453076 | i6) * 614) + (((~(1337078560 | i200)) | 268518420 | (~(i200 | (-1520662325)))) * (-1228)) + (((~(1605596980 | i200)) | (~(i200 | (-1252143905)))) * 614));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i202 = ~iUptimeMillis;
        int i203 = ((int) j41) & (1829943261 + (((~(2051992232 | i202)) | (~(614765822 | iUptimeMillis))) * 333) + (((~(iUptimeMillis | 2051992232)) | (~(i202 | 614765822))) * 333));
        int i204 = (i201 & i203) | (i201 ^ i203);
        int i205 = -(-((i204 ^ (-1)) + (i204 << 1)));
        int i206 = (i205 & 200) + (i205 | 200);
        int i207 = ((~i206) & i6) | (i206 & i200);
        int i208 = (i204 | (-i204)) >> 31;
        int i209 = (~i208) & i6;
        int i210 = i208 & i207;
        int i211 = (i210 & i209) | (i209 ^ i210);
        int i212 = i6 ^ i199;
        int i213 = -i212;
        int i214 = ((i212 & i213) | (i212 ^ i213)) >> 31;
        int i215 = (i199 & i214) | (i211 & (~i214));
        int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
        int i216 = ~((~keyRepeatDelay2) | 203);
        int i217 = (keyRepeatDelay2 * (-1975)) + 200767 + (((i216 & i6) | (i6 ^ i216)) * 988);
        int i218 = ~(((-204) & keyRepeatDelay2) | ((-204) ^ keyRepeatDelay2));
        int i219 = ~(i200 | keyRepeatDelay2);
        int i220 = -(-(((i218 & i219) | (i218 ^ i219)) * (-1976)));
        int i221 = ((i217 | i220) << 1) - (i217 ^ i220);
        int i222 = ~keyRepeatDelay2;
        int i223 = (~((i222 & 203) | (i222 ^ 203))) | (~(((-204) & i6) | ((-204) ^ i6)));
        int i224 = ~i6;
        int i225 = ~((i224 ^ 203) | (i224 & 203));
        int i226 = (i221 - (~(-(-(((i223 & i225) | (i223 ^ i225)) * 988))))) - 1;
        int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
        int i227 = (keyRepeatDelay3 ^ 20) + ((keyRepeatDelay3 & 20) << 1);
        int i228 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
        Object[] objArr28 = new Object[1];
        a(i226, i227, (char) ((i228 & 15942) + (i228 | 15942)), objArr28);
        String str19 = (String) objArr28[0];
        int i229 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
        int i230 = ((i229 | 223) << 1) - (i229 ^ 223);
        int i231 = -View.MeasureSpec.makeMeasureSpec(0, 0);
        Object[] objArr29 = new Object[1];
        a(i230, ((i231 | 6) << 1) - (i231 ^ 6), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr29);
        byte[] bytes4 = ((String) objArr29[0]).getBytes();
        int length5 = bytes4.length;
        if (length5 == 0) {
            i12 = i224;
            j = j29;
            i13 = 1;
        } else {
            try {
                bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str19));
                int i232 = 4096;
                try {
                    try {
                        byte[] bArr5 = new byte[4096];
                        int i233 = 0;
                        while (true) {
                            int i234 = bufferedInputStream2.read(bArr5, 0, i232);
                            if (i234 <= 0) {
                                break;
                            }
                            int i235 = 0;
                            while (i233 < length5 && i235 < i234) {
                                if (bArr5[i235] == bytes4[i233]) {
                                    i233++;
                                } else {
                                    if (i233 != 0) {
                                        int i236 = (-2) - (i233 ^ (-1));
                                        while (true) {
                                            if (i236 <= 0) {
                                                i224 = i224;
                                                bArr5 = bArr5;
                                                j2 = j29;
                                                i14 = i234;
                                                i233 = 0;
                                                break;
                                            }
                                            int i237 = 0;
                                            while (true) {
                                                if (i237 >= i236) {
                                                    i224 = i224;
                                                    bArr5 = bArr5;
                                                    j2 = j29;
                                                    i14 = i234;
                                                    i233 = i236;
                                                    break;
                                                }
                                                byte b12 = bytes4[i237];
                                                bArr = bArr5;
                                                int i238 = -i236;
                                                int i239 = (i233 ^ i238) + ((i238 & i233) << 1);
                                                i15 = i233;
                                                int iB2 = com.google.android.gms.internal.measurement.zzdm.b();
                                                i16 = i234;
                                                i12 = i224;
                                                int i240 = (i237 * (-743)) + (i239 * (-743));
                                                int i241 = (i237 ^ i239) | (i237 & i239);
                                                j = j29;
                                                int i242 = ~i241;
                                                int i243 = ~((i237 ^ iB2) | (i237 & iB2));
                                                int i244 = ((i242 ^ i243) | (i242 & i243) | (~(i239 | iB2))) * (-744);
                                                int i245 = (i240 ^ i244) + ((i244 & i240) << 1);
                                                int i246 = ~iB2;
                                                int i247 = ~((~i239) | (~i237));
                                                try {
                                                    if (b12 != bytes4[((i245 + (((i247 & i246) | (i246 ^ i247)) * 744)) - (~(((i241 & iB2) | (i241 ^ iB2)) * 744))) - 1]) {
                                                        break;
                                                    }
                                                    i237++;
                                                    bArr5 = bArr;
                                                    i233 = i15;
                                                    i234 = i16;
                                                    i224 = i12;
                                                    j29 = j;
                                                } catch (IOException unused) {
                                                    if (bufferedInputStream2 != null) {
                                                        try {
                                                            bufferedInputStream2.close();
                                                        } catch (IOException unused2) {
                                                        }
                                                    }
                                                    i13 = 0;
                                                    int i248 = (~(i6 & 262)) & (i6 | 262);
                                                    int i249 = -i13;
                                                    int i250 = ((i13 & i249) | (i13 ^ i249)) >> 31;
                                                    int i251 = (~i250) & i6;
                                                    int i252 = i250 & i248;
                                                    int i253 = (i252 & i251) | (i251 ^ i252);
                                                    int i254 = i6 ^ i215;
                                                    int i255 = -i254;
                                                    int i256 = ((i254 & i255) | (i254 ^ i255)) >> 31;
                                                    int i257 = i253 & (~i256);
                                                    int i258 = i215 & i256;
                                                    int i259 = (i258 & i257) | (i257 ^ i258);
                                                    int i260 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    Object[] objArr30 = new Object[1];
                                                    a((i260 & 228) + (i260 | 228), 30 - (~ExpandableListView.getPackedPositionGroup(0L)), (char) (19920 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr30);
                                                    String str20 = (String) objArr30[0];
                                                    int i261 = 259 - (~(ViewConfiguration.getScrollBarSize() >> 8));
                                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                    Object[] objArr31 = new Object[1];
                                                    a(i261, ((iNormalizeMetaState | 23) << 1) - (iNormalizeMetaState ^ 23), (char) View.MeasureSpec.getMode(0), objArr31);
                                                    String str21 = (String) objArr31[0];
                                                    int i262 = 283 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                    int i263 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    Object[] objArr32 = new Object[1];
                                                    a(i262, (i263 ^ 28) + ((i263 & 28) << 1), (char) (Process.myTid() >> 22), objArr32);
                                                    String str22 = (String) objArr32[0];
                                                    int mode3 = 311 - View.MeasureSpec.getMode(0);
                                                    int i264 = 13 - (~(-(Process.myPid() >> 22)));
                                                    int i265 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                    Object[] objArr33 = new Object[1];
                                                    a(mode3, i264, (char) ((i265 & 31054) + (i265 | 31054)), objArr33);
                                                    strArr = new String[]{str20, str21, str22, (String) objArr33[0]};
                                                    i17 = 0;
                                                    while (true) {
                                                        if (i17 < 4) {
                                                            i18 = i6;
                                                            break;
                                                        }
                                                        Object[] objArr34 = {strArr[i17]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                                                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 993;
                                                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 8;
                                                            byte b13 = (byte) 0;
                                                            Object[] objArr35 = new Object[1];
                                                            c(b13, (byte) (b13 | 6), b13, objArr35);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(touchSlop, iIndexOf, iMakeMeasureSpec, 349342683, false, (String) objArr35[0], new Class[]{String.class});
                                                        }
                                                        long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr34)).longValue();
                                                        long j42 = 154729033;
                                                        long j43 = j42 ^ j;
                                                        i106 = i17;
                                                        long j44 = (((long) ((int) Runtime.getRuntime().totalMemory())) | jLongValue5) ^ j;
                                                        long j45 = (((long) (-109)) * j42) + (((long) 111) * jLongValue5) + (((long) (-220)) * (j43 | j44)) + (((long) 220) * (((j42 | jLongValue5) ^ j) | j44)) + (((long) 110) * ((((jLongValue5 ^ j) | j42) ^ j) | ((j43 | jLongValue5) ^ j))) + ((long) (-1001807638));
                                                        int i266 = TuitionPaymentFragmentbindingInflater1;
                                                        int i267 = ((i266 | 83) << 1) - (i266 ^ 83);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i267 % 128;
                                                        int i268 = i267 % 2;
                                                        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                                        int i269 = ~startUptimeMillis2;
                                                        int i270 = (~(952845099 | i269)) | (-2043373356);
                                                        int i271 = ~(startUptimeMillis2 | (-814367530));
                                                        i107 = ((int) (j45 >> 32)) & ((-2133981854) + ((i270 | i271) * (-502)) + ((i271 | (~(i269 | (-1090528257)))) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                        i108 = (int) j45;
                                                        iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                                        i109 = ~(1324691429 | iFreeMemory);
                                                        i110 = ~iFreeMemory;
                                                        if ((i107 | (i108 & ((-2038855459) + ((i109 | (~((-1207959586) | i110))) * 920) + (((~(1320494565 | i110)) | (-1324691430)) * 920) + (((~(iFreeMemory | (-1207959586))) | (~(1324691429 | i110)) | (~((-4196865) | iFreeMemory))) * 920)))) != 0) {
                                                            i18 = (((i106 | 252) << 1) - (i106 ^ 252)) ^ i6;
                                                            break;
                                                        }
                                                        i17 = i106 + 1;
                                                    }
                                                    int i272 = i6 ^ i259;
                                                    int i273 = (i272 | (-i272)) >> 31;
                                                    int i274 = i18 & (~i273);
                                                    int i275 = i259 & i273;
                                                    int i276 = (i275 & i274) | (i274 ^ i275);
                                                    i19 = 324 - (~ExpandableListView.getPackedPositionGroup(0L));
                                                    i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                                                    TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                                                    if (i20 % 2 == 0) {
                                                        int i277 = -Color.blue(1);
                                                        Object[] objArr36 = new Object[1];
                                                        a(i19, (i277 ^ 13) + ((i277 & 13) << 1), (char) View.MeasureSpec.getSize(1), objArr36);
                                                        Object[] objArr37 = {(String) objArr36[0]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                                                            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33602);
                                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3086;
                                                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26;
                                                            byte b14 = (byte) 0;
                                                            byte b15 = (byte) (b14 + 5);
                                                            Object[] objArr38 = new Object[1];
                                                            c(b14, b15, (byte) (b15 - 5), objArr38);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cMakeMeasureSpec, iLastIndexOf, maximumFlingVelocity, 1411172903, false, (String) objArr38[0], new Class[]{String.class});
                                                        }
                                                        str2 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr37);
                                                    } else {
                                                        int i278 = -(-Color.blue(0));
                                                        Object[] objArr39 = new Object[1];
                                                        a(i19, (i278 & 13) + (i278 | 13), (char) View.MeasureSpec.getSize(0), objArr39);
                                                        Object[] objArr40 = {(String) objArr39[0]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char cCombineMeasuredStates = (char) (33602 - View.combineMeasuredStates(0, 0));
                                                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 3085;
                                                            int i279 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                                                            byte b16 = (byte) 0;
                                                            byte b17 = (byte) (b16 + 5);
                                                            Object[] objArr41 = new Object[1];
                                                            c(b16, b17, (byte) (b17 - 5), objArr41);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iNormalizeMetaState2, i279, 1411172903, false, (String) objArr41[0], new Class[]{String.class});
                                                        }
                                                        str2 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr40);
                                                    }
                                                    if (str2 != null) {
                                                        objArr4 = new Object[1];
                                                        a(337 - (~(-Color.red(0))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (char) (35086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr4);
                                                        if (!(!str2.contains((String) objArr4[0]))) {
                                                            i21 = i6 ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                                                        } else {
                                                            i21 = i6;
                                                        }
                                                    } else {
                                                        i21 = i6;
                                                    }
                                                    int i280 = i6 ^ i276;
                                                    int i281 = -i280;
                                                    int i282 = ((i280 & i281) | (i280 ^ i281)) >> 31;
                                                    int i283 = i21 & (~i282);
                                                    int i284 = i276 & i282;
                                                    int i285 = (i284 & i283) | (i283 ^ i284);
                                                    int i286 = -(-ExpandableListView.getPackedPositionType(0L));
                                                    int i287 = ((i286 | 347) << 1) - (i286 ^ 347);
                                                    int iMyTid = Process.myTid() >> 22;
                                                    int iB3 = com.google.android.gms.internal.measurement.zzdm.b();
                                                    int i288 = iMyTid * (-405);
                                                    int i289 = ~(((-18) ^ iB3) | ((-18) & iB3));
                                                    int i290 = ~iB3;
                                                    int i291 = (i290 & iMyTid) | (i290 ^ iMyTid);
                                                    int i292 = ~((i291 & 17) | (i291 ^ 17));
                                                    int i293 = (i288 & 6919) + (i288 | 6919) + (((i289 & i292) | (i289 ^ i292)) * (-406));
                                                    int i294 = ~iB3;
                                                    int i295 = ((-18) & i294) | ((-18) ^ i294);
                                                    int i296 = (~((i295 & iMyTid) | (i295 ^ iMyTid))) * (-406);
                                                    int i297 = ((i293 | i296) << 1) - (i296 ^ i293);
                                                    int i298 = ~iMyTid;
                                                    int i299 = -(-(((~((i298 & iB3) | (i298 ^ iB3))) | (~(i294 | 17))) * 406));
                                                    Object[] objArr42 = new Object[1];
                                                    a(i287, (i297 & i299) + (i299 | i297), (char) (43487 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr42);
                                                    str3 = (String) objArr42[0];
                                                    Object[] objArr43 = new Object[1];
                                                    a(364 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.myTid() >> 22) + 6, (char) TextUtils.getOffsetAfter("", 0), objArr43);
                                                    bytes = ((String) objArr43[0]).getBytes();
                                                    length = bytes.length;
                                                    if (length == 0) {
                                                        i200 = i200;
                                                        i22 = (i6 & (-252)) | (i200 & 251);
                                                    } else {
                                                        try {
                                                            bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str3));
                                                            try {
                                                                bArr2 = new byte[4096];
                                                                i23 = 0;
                                                                while (true) {
                                                                    i24 = bufferedInputStream4.read(bArr2, 0, 4096);
                                                                    if (i24 > 0) {
                                                                        break;
                                                                    }
                                                                    i25 = 0;
                                                                    while (i23 < length) {
                                                                        if (bArr2[i25] == bytes[i23]) {
                                                                            i23 = ((i23 & 1) << 1) + (i23 ^ 1);
                                                                        } else if (i23 != 0) {
                                                                            i26 = (-2) - (i23 ^ (-1));
                                                                            while (true) {
                                                                                if (i26 > 0) {
                                                                                    i23 = 0;
                                                                                    break;
                                                                                }
                                                                                i27 = 0;
                                                                                while (true) {
                                                                                    if (i27 < i26) {
                                                                                        i23 = i26;
                                                                                        break;
                                                                                    }
                                                                                    i28 = -i26;
                                                                                    if (bytes[i27] != bytes[((((i23 | i28) << 1) - (i28 ^ i23)) - (~i27)) - 1]) {
                                                                                        break;
                                                                                    }
                                                                                    i27 = (i27 ^ (-123)) + ((i27 & (-123)) << 1) + 124;
                                                                                }
                                                                                int i300 = ((i26 | (-95)) << 1) - (i26 ^ (-95));
                                                                                i26 = (i300 ^ 94) + ((i300 & 94) << 1);
                                                                            }
                                                                        }
                                                                        i25 = (i25 | 1) + (i25 & 1);
                                                                    }
                                                                }
                                                                if (i23 == length) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                try {
                                                                    bufferedInputStream4.close();
                                                                } catch (IOException unused3) {
                                                                }
                                                                if (z) {
                                                                    i200 = i200;
                                                                    i22 = (i6 & (-252)) | (i200 & 251);
                                                                } else {
                                                                    i200 = i200;
                                                                    i22 = i6;
                                                                }
                                                            } catch (IOException unused4) {
                                                                if (bufferedInputStream4 != null) {
                                                                    try {
                                                                        bufferedInputStream4.close();
                                                                    } catch (IOException unused5) {
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                bufferedInputStream3 = bufferedInputStream4;
                                                                if (bufferedInputStream3 != null) {
                                                                    try {
                                                                        bufferedInputStream3.close();
                                                                    } catch (IOException unused6) {
                                                                    }
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (IOException unused7) {
                                                            bufferedInputStream4 = null;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            bufferedInputStream3 = null;
                                                        }
                                                    }
                                                    int i301 = ((~i285) & i6) | (i285 & i200);
                                                    int i302 = -i301;
                                                    int i303 = ((i301 & i302) | (i301 ^ i302)) >> 31;
                                                    int i304 = (i285 & i303) | (i22 & (~i303));
                                                    int i305 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 369;
                                                    int i306 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                    Object[] objArr44 = new Object[1];
                                                    a(i305, (i306 & 23) + (i306 | 23), (char) KeyEvent.keyCodeFromString(""), objArr44);
                                                    Object[] objArr45 = {(String) objArr44[0]};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 33602);
                                                        int mirror = 3133 - AndroidCharacter.getMirror('0');
                                                        int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                        byte b18 = (byte) 0;
                                                        byte b19 = (byte) (b18 + 5);
                                                        Object[] objArr46 = new Object[1];
                                                        c(b18, b19, (byte) (b19 - 5), objArr46);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, mirror, threadPriority, 1411172903, false, (String) objArr46[0], new Class[]{String.class});
                                                    }
                                                    lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr45)).toLowerCase();
                                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 394;
                                                    int mirror2 = AndroidCharacter.getMirror('0') - ',';
                                                    int i307 = -Color.rgb(0, 0, 0);
                                                    objArr = new Object[1];
                                                    a(iLastIndexOf2, mirror2, (char) ((i307 ^ (-16757401)) + ((i307 & (-16757401)) << 1)), objArr);
                                                    if (lowerCase.contains((String) objArr[0])) {
                                                        i29 = (i6 & (-265)) | (i200 & 264);
                                                    } else {
                                                        i29 = i6;
                                                    }
                                                    int i308 = i6 ^ i304;
                                                    int i309 = -i308;
                                                    int i310 = ((i308 & i309) | (i308 ^ i309)) >> 31;
                                                    int i311 = (i304 & i310) | (i29 & (~i310));
                                                    strArr2 = new String[6];
                                                    int i312 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                    int i313 = (i312 & 397) + (i312 | 397);
                                                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                                                    int i314 = (iNormalizeMetaState3 ^ 42) + ((iNormalizeMetaState3 & 42) << 1);
                                                    int i315 = TuitionPaymentFragmentbindingInflater1 + 97;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i315 % 128;
                                                    int i316 = i315 % 2;
                                                    Object[] objArr47 = new Object[1];
                                                    a(i313, i314, (char) ((-2) - ((-TextUtils.lastIndexOf("", '0', 0)) ^ (-1))), objArr47);
                                                    strArr2[0] = (String) objArr47[0];
                                                    int iRed = Color.red(0);
                                                    int i317 = (iRed ^ 439) + ((iRed & 439) << 1);
                                                    int i318 = -View.MeasureSpec.getMode(0);
                                                    Object[] objArr48 = new Object[1];
                                                    a(i317, (i318 ^ 40) + ((i318 & 40) << 1), (char) Color.alpha(0), objArr48);
                                                    strArr2[1] = (String) objArr48[0];
                                                    int iGreen2 = Color.green(0);
                                                    int i319 = (iGreen2 & 479) + (iGreen2 | 479);
                                                    int i320 = -(-(Process.myPid() >> 22));
                                                    Object[] objArr49 = new Object[1];
                                                    a(i319, (i320 & 27) + (i320 | 27), (char) View.MeasureSpec.getSize(0), objArr49);
                                                    strArr2[2] = (String) objArr49[0];
                                                    int i321 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    i30 = ((i321 | TypedValues.PositionType.TYPE_SIZE_PERCENT) << 1) - (i321 ^ TypedValues.PositionType.TYPE_SIZE_PERCENT);
                                                    int i322 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                    i31 = (i322 ^ 28) + ((i322 & 28) << 1);
                                                    scrollBarSize = ViewConfiguration.getScrollBarSize();
                                                    int i323 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    i32 = (i323 & 9) + (i323 | 9);
                                                    TuitionPaymentFragmentbindingInflater1 = i32 % 128;
                                                    if (i32 % 2 == 0) {
                                                        Object[] objArr50 = new Object[1];
                                                        a(i30, i31, (char) (scrollBarSize + 40), objArr50);
                                                        i33 = 0;
                                                        strArr2[3] = (String) objArr50[0];
                                                        keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >>> 90) * 29149;
                                                        offsetAfter = TextUtils.getOffsetAfter("", 0) * 21;
                                                        c = 3;
                                                        i35 = 20901;
                                                        i34 = 1;
                                                    } else {
                                                        i33 = 0;
                                                        Object[] objArr51 = new Object[1];
                                                        a(i30, i31, (char) (scrollBarSize >> 8), objArr51);
                                                        strArr2[3] = (String) objArr51[0];
                                                        keyRepeatDelay = 532 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))));
                                                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0);
                                                        i34 = 1;
                                                        offsetAfter = ((offsetAfter2 | 27) << 1) - (offsetAfter2 ^ 27);
                                                        c = 4;
                                                        i35 = 13854;
                                                    }
                                                    int i324 = -(TypedValue.complexToFraction(i33, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i33, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    char c4 = (char) (((i35 | i324) << i34) - (i35 ^ i324));
                                                    Object[] objArr52 = new Object[i34];
                                                    a(keyRepeatDelay, offsetAfter, c4, objArr52);
                                                    strArr2[c] = (String) objArr52[i33];
                                                    int i325 = -(-TextUtils.lastIndexOf("", '0'));
                                                    Object[] objArr53 = new Object[1];
                                                    a((i325 & 561) + (i325 | 561), 26 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19927), objArr53);
                                                    strArr2[5] = (String) objArr53[0];
                                                    i36 = 0;
                                                    while (true) {
                                                        if (i36 < 6) {
                                                            i37 = i6;
                                                            break;
                                                        }
                                                        Object[] objArr54 = {strArr2[i36]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                                                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 33602);
                                                            int scrollBarSize2 = 3085 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                            int iMakeMeasureSpec2 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            byte b20 = (byte) 0;
                                                            byte b21 = (byte) (b20 + 5);
                                                            Object[] objArr55 = new Object[1];
                                                            c(b20, b21, (byte) (b21 - 5), objArr55);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(maxKeyCode, scrollBarSize2, iMakeMeasureSpec2, 1411172903, false, (String) objArr55[0], new Class[]{String.class});
                                                        }
                                                        str9 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr54);
                                                        if (str9 == null) {
                                                        }
                                                        i36 = ((i36 & 1) << 1) + (i36 ^ 1);
                                                    }
                                                    int i326 = i6 ^ i311;
                                                    int i327 = -i326;
                                                    int i328 = ((i326 & i327) | (i326 ^ i327)) >> 31;
                                                    int i329 = i37 & (~i328);
                                                    int i330 = i311 & i328;
                                                    int i331 = (i330 & i329) | (i329 ^ i330);
                                                    int i332 = -View.resolveSizeAndState(0, 0, 0);
                                                    Object[] objArr56 = new Object[1];
                                                    a((i332 ^ 347) + ((i332 & 347) << 1), TextUtils.getTrimmedLength("") + 17, (char) (43486 - (~Color.argb(0, 0, 0, 0))), objArr56);
                                                    String str23 = (String) objArr56[0];
                                                    int i333 = -Gravity.getAbsoluteGravity(0, 0);
                                                    int i334 = (i333 & 587) + (i333 | 587);
                                                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                    Object[] objArr57 = new Object[1];
                                                    a(i334, ((fadingEdgeLength | 6) << 1) - (fadingEdgeLength ^ 6), (char) (40767 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))))), objArr57);
                                                    Object[] objArr58 = {str23, (String) objArr57[0]};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char cBlue = (char) Color.blue(0);
                                                        int iAxisFromString3 = MotionEvent.axisFromString("") + 2386;
                                                        int trimmedLength = TextUtils.getTrimmedLength("") + 32;
                                                        byte b22 = (byte) 0;
                                                        byte b23 = (byte) (b22 + 5);
                                                        Object[] objArr59 = new Object[1];
                                                        c(b22, b23, (byte) (b23 - 5), objArr59);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iAxisFromString3, trimmedLength, -1207062455, false, (String) objArr59[0], new Class[]{String.class, String.class});
                                                    }
                                                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr58)).longValue();
                                                    long j46 = -65613040;
                                                    j3 = 302;
                                                    j4 = -301;
                                                    long jMyPid = Process.myPid();
                                                    long j47 = (((long) (-300)) * j46) + (j3 * jLongValue6) + ((((j46 | jLongValue6) | jMyPid) ^ j) * j4);
                                                    long j48 = jLongValue6 ^ j;
                                                    long j49 = j47 + ((((j48 | jMyPid) ^ j) | (((jMyPid ^ j) | j46) ^ j)) * j4) + (((long) 301) * (j48 | (((j46 ^ j) | jMyPid) ^ j))) + ((long) 2042656368);
                                                    int iMyPid2 = Process.myPid();
                                                    int i335 = ~iMyPid2;
                                                    int i336 = (~(1200508297 | i335)) | (-1741643212);
                                                    int i337 = ~(iMyPid2 | (-1116097674));
                                                    i38 = ((int) (j49 >> 32)) & (((i336 | i337) * (-252)) + 629801178 + ((i337 | (~(i335 | (-541134915)))) * 252));
                                                    int i338 = ~(((int) SystemClock.uptimeMillis()) | 170982501);
                                                    i39 = ((int) j49) & (1000300699 + ((1608208911 | i338) * (-220)) + ((i338 | 1439367690) * 220) + 347803142);
                                                    if (((i38 & i39) | (i38 ^ i39)) != 0) {
                                                        i40 = i6 ^ 260;
                                                    } else {
                                                        int i339 = 592 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                                                        int i340 = -TextUtils.indexOf("", "");
                                                        int i341 = (i340 ^ 13) + ((i340 & 13) << 1);
                                                        int i342 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                        Object[] objArr60 = new Object[1];
                                                        a(i339, i341, (char) (((i342 | 33899) << 1) - (i342 ^ 33899)), objArr60);
                                                        str4 = (String) objArr60[0];
                                                        int i343 = -View.MeasureSpec.getSize(0);
                                                        int i344 = (i343 ^ TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + ((i343 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) << 1);
                                                        int i345 = -View.MeasureSpec.getMode(0);
                                                        int i346 = (i345 ^ 9) + ((i345 & 9) << 1);
                                                        int i347 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                        Object[] objArr61 = new Object[1];
                                                        a(i344, i346, (char) (((i347 | 62115) << 1) - (i347 ^ 62115)), objArr61);
                                                        bytes2 = ((String) objArr61[0]).getBytes();
                                                        length2 = bytes2.length;
                                                        if (length2 == 0) {
                                                            i40 = (~(i6 & 261)) & (i6 | 261);
                                                        } else {
                                                            try {
                                                                bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str4));
                                                                i41 = 4096;
                                                                try {
                                                                    bArr3 = new byte[4096];
                                                                    i42 = 0;
                                                                    while (true) {
                                                                        i43 = bufferedInputStream6.read(bArr3, 0, i41);
                                                                        if (i43 > 0) {
                                                                            break;
                                                                        }
                                                                        i44 = 0;
                                                                        while (i42 < length2) {
                                                                            if (bArr3[i44] == bytes2[i42]) {
                                                                                if (i42 != 0) {
                                                                                    i45 = (i42 ^ (-1)) + (i42 << 1);
                                                                                    while (true) {
                                                                                        if (i45 > 0) {
                                                                                            i42 = 0;
                                                                                            break;
                                                                                        }
                                                                                        i46 = 0;
                                                                                        while (true) {
                                                                                            if (i46 < i45) {
                                                                                                i42 = i45;
                                                                                                break;
                                                                                            }
                                                                                            i47 = -i45;
                                                                                            if (bytes2[i46] != bytes2[(((i42 | i47) << 1) - (i47 ^ i42)) + i46]) {
                                                                                                break;
                                                                                            }
                                                                                            int i348 = ((i46 | (-37)) << 1) - (i46 ^ (-37));
                                                                                            i46 = (i348 ^ 38) + ((i348 & 38) << 1);
                                                                                        }
                                                                                        int i349 = TuitionPaymentFragmentbindingInflater1;
                                                                                        int i350 = (i349 ^ 71) + ((i349 & 71) << 1);
                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i350 % 128;
                                                                                        int i351 = i350 % 2;
                                                                                        i45 = (i45 << 1) + (~i45);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i42 = ((i42 | 1) << 1) - (i42 ^ 1);
                                                                            }
                                                                            i44 = ((i44 | 1) << 1) - (i44 ^ 1);
                                                                        }
                                                                        i41 = 4096;
                                                                    }
                                                                    if (i42 == length2) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    try {
                                                                        bufferedInputStream6.close();
                                                                    } catch (IOException unused8) {
                                                                    }
                                                                    if (z2) {
                                                                        i40 = (~(i6 & 261)) & (i6 | 261);
                                                                    } else {
                                                                        i40 = i6;
                                                                    }
                                                                } catch (IOException unused9) {
                                                                    if (bufferedInputStream6 != null) {
                                                                        try {
                                                                            bufferedInputStream6.close();
                                                                        } catch (IOException unused10) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    bufferedInputStream5 = bufferedInputStream6;
                                                                    if (bufferedInputStream5 != null) {
                                                                        try {
                                                                            bufferedInputStream5.close();
                                                                        } catch (IOException unused11) {
                                                                        }
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (IOException unused12) {
                                                                bufferedInputStream6 = null;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                bufferedInputStream5 = null;
                                                            }
                                                        }
                                                    }
                                                    int i352 = (~(i6 & i331)) & (i6 | i331);
                                                    int i353 = -i352;
                                                    int i354 = ((i352 & i353) | (i352 ^ i353)) >> 31;
                                                    int i355 = i40 & (~i354);
                                                    int i356 = i331 & i354;
                                                    i48 = (i356 & i355) | (i355 ^ i356);
                                                    if ((i2 & 8) == 0) {
                                                        int i357 = -View.MeasureSpec.getMode(0);
                                                        int i358 = (i12 ^ i357) | (i12 & i357);
                                                        int i359 = (i357 * (-51)) + 32595 + ((~((i358 & 615) | (i358 ^ 615))) * 52);
                                                        int i360 = ~(((-616) & i200) | ((-616) ^ i200));
                                                        int i361 = ~((-616) | i357);
                                                        int i362 = (i360 & i361) | (i360 ^ i361);
                                                        int i363 = ~((i200 ^ i357) | (i200 & i357));
                                                        int i364 = ((i362 & i363) | (i362 ^ i363)) * (-52);
                                                        int i365 = (i359 ^ i364) + ((i359 & i364) << 1);
                                                        int i366 = ~i357;
                                                        int i367 = ~((i366 & i12) | (i366 ^ i12));
                                                        int i368 = ~i357;
                                                        int i369 = ~((i368 & 615) | (i368 ^ 615));
                                                        int i370 = i365 + (((i369 & i367) | (i367 ^ i369)) * 52);
                                                        int i371 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                        int i372 = (i371 & 43) + (i371 | 43);
                                                        int i373 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                                        Object[] objArr62 = new Object[1];
                                                        a(i370, i372, (char) ((i373 ^ 3180) + ((i373 & 3180) << 1)), objArr62);
                                                        String str24 = (String) objArr62[0];
                                                        int i374 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                        int i375 = (i374 & 658) + (i374 | 658);
                                                        int i376 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                                                        Object[] objArr63 = new Object[1];
                                                        a(i375, (i376 ^ 41) + ((i376 & 41) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr63);
                                                        String str25 = (String) objArr63[0];
                                                        int i377 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                        int i378 = (i377 & TypedValues.TransitionType.TYPE_DURATION) + (i377 | TypedValues.TransitionType.TYPE_DURATION);
                                                        int i379 = -View.resolveSizeAndState(0, 0, 0);
                                                        Object[] objArr64 = new Object[1];
                                                        a(i378, (i379 ^ 38) + ((i379 & 38) << 1), (char) (64805 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr64);
                                                        strArr17 = new String[]{str24, str25, (String) objArr64[0]};
                                                        i102 = 0;
                                                        while (true) {
                                                            if (i102 < 3) {
                                                                i103 = i6;
                                                                break;
                                                            }
                                                            Object[] objArr65 = {strArr17[i102]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                                                                int gidForName2 = Process.getGidForName("") + 994;
                                                                int mirror3 = AndroidCharacter.getMirror('0') - '(';
                                                                byte b24 = (byte) 0;
                                                                Object[] objArr66 = new Object[1];
                                                                c(b24, (byte) (b24 | 6), b24, objArr66);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cCombineMeasuredStates2, gidForName2, mirror3, 349342683, false, (String) objArr66[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr65)).longValue();
                                                            long j50 = 1255860125;
                                                            long j51 = jLongValue7 ^ j;
                                                            long jMyPid2 = ((long) Process.myPid()) ^ j;
                                                            long j52 = 933;
                                                            long j53 = (((long) 934) * j50) + (((long) (-932)) * jLongValue7) + (((long) (-933)) * (j51 | (((j50 ^ j) | jMyPid2) ^ j))) + ((((j51 | jMyPid2) ^ j) | ((j51 | j50) ^ j)) * j52) + (j52 * ((j50 | jLongValue7) ^ j)) + ((long) (-2102938730));
                                                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                            int i380 = 224158758 + (((-1999346868) | elapsedCpuTime) * (-50));
                                                            int i381 = ~(1999347123 | elapsedCpuTime);
                                                            int i382 = ~elapsedCpuTime;
                                                            i104 = ((int) (j53 >> 32)) & (i380 + ((i381 | (~((-1140953107) | i382))) * 50) + (((~(i382 | (-1999346868))) | (~(858394017 | i382)) | 1140953106) * 50));
                                                            i105 = ((int) j53) & ((-901429351) + (((~((-227416264) | i200)) | (~(1664642673 | i6))) * 217) + (((~((-227416264) | i6)) | 210112646) * 217) + (((~(1664642673 | i200)) | 227416263) * 217));
                                                            if (((i104 & i105) | (i104 ^ i105)) != 0) {
                                                                int i383 = i102 + 280;
                                                                i103 = ((~i383) & i6) | (i383 & i200);
                                                                break;
                                                            }
                                                            int i384 = (i102 & (-104)) + (i102 | (-104));
                                                            i102 = (i384 & 105) + (i384 | 105);
                                                        }
                                                        int i385 = (~(i6 & i48)) & (i6 | i48);
                                                        int i386 = -i385;
                                                        int i387 = ((i385 & i386) | (i385 ^ i386)) >> 31;
                                                        int i388 = i103 & (~i387);
                                                        int i389 = i48 & i387;
                                                        i48 = (i389 & i388) | (i388 ^ i389);
                                                    }
                                                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 738;
                                                    int threadPriority2 = (Process.getThreadPriority(0) + 20) >> 6;
                                                    int iB4 = com.google.android.gms.internal.measurement.zzdm.b();
                                                    int i390 = ~threadPriority2;
                                                    int i391 = ~(iB4 | 41);
                                                    int i392 = (threadPriority2 * (-109)) + 4551 + (((i391 & i390) | (i390 ^ i391)) * (-220));
                                                    int i393 = ~((threadPriority2 ^ 41) | (threadPriority2 & 41));
                                                    int i394 = ~((iB4 & 41) | (iB4 ^ 41));
                                                    int i395 = (i392 - (~(-(-(((i394 & i393) | (i393 ^ i394)) * 220))))) - 1;
                                                    int i396 = ~((i390 & 41) | (i390 ^ 41));
                                                    int i397 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    int i398 = ((i397 | 11) << 1) - (i397 ^ 11);
                                                    TuitionPaymentFragmentbindingInflater1 = i398 % 128;
                                                    int i399 = i398 % 2;
                                                    int i400 = ~((threadPriority2 & (-42)) | ((-42) ^ threadPriority2));
                                                    int i401 = i396 ^ i400;
                                                    Object[] objArr67 = new Object[1];
                                                    a(iLastIndexOf3, (i395 - (~(-(-(110 * ((i400 & i396) | i401)))))) - 1, (char) (3238 - (ViewConfiguration.getTouchSlop() >> 8)), objArr67);
                                                    int i402 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    int i403 = ((i402 | 33) << 1) - (i402 ^ 33);
                                                    TuitionPaymentFragmentbindingInflater1 = i403 % 128;
                                                    int i404 = i403 % 2;
                                                    int iMyPid3 = (Process.myPid() >> 22) + 778;
                                                    int i405 = 28 - (~(-TextUtils.indexOf((CharSequence) "", '0')));
                                                    int i406 = -View.MeasureSpec.getSize(0);
                                                    Object[] objArr68 = new Object[1];
                                                    a(iMyPid3, i405, (char) ((i406 & 23235) + (i406 | 23235)), objArr68);
                                                    strArr3 = new String[]{(String) objArr67[0], (String) objArr68[0]};
                                                    i49 = 0;
                                                    while (true) {
                                                        if (i49 < 2) {
                                                            i50 = i6;
                                                            break;
                                                        }
                                                        int i407 = TuitionPaymentFragmentbindingInflater1;
                                                        int i408 = (i407 & 47) + (i407 | 47);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i408 % 128;
                                                        int i409 = i408 % 2;
                                                        Object[] objArr69 = {strArr3[i49]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                                            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int i410 = 993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i411 = 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            byte b25 = (byte) 0;
                                                            Object[] objArr70 = new Object[1];
                                                            c(b25, (byte) (b25 | 6), b25, objArr70);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(maximumFlingVelocity2, i410, i411, 349342683, false, (String) objArr70[0], new Class[]{String.class});
                                                        }
                                                        long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr69)).longValue();
                                                        long j54 = 1125942368;
                                                        long j55 = j54 ^ j;
                                                        strArr16 = strArr3;
                                                        long j56 = i6;
                                                        long j57 = (((long) 236) * j54) + (((long) 471) * jLongValue8) + (((long) (-235)) * (jLongValue8 | ((j55 | (j56 ^ j)) ^ j))) + (((long) (-470)) * (jLongValue8 | ((j55 | j56) ^ j))) + (((long) 235) * (((j56 | (jLongValue8 | j55)) ^ j) | (((jLongValue8 ^ j) | j54) ^ j))) + ((long) (-1973020973));
                                                        i100 = ((int) (j57 >> 32)) & ((-1344671705) + ((~((-335806467) | i200)) * (-783)) + (((~(1100692472 | i200)) | (-336533939)) * 783));
                                                        int i412 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i413 = (i412 & 29) + (i412 | 29);
                                                        TuitionPaymentFragmentbindingInflater1 = i413 % 128;
                                                        int i414 = i413 % 2;
                                                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                                        int i415 = ~iMaxMemory;
                                                        i101 = ((int) j57) & ((-1667685763) + ((iMaxMemory | 537166085) * 988) + (((~((-486242939) | i415)) | 72425552) * (-1976)) + (((~(iMaxMemory | 950983471)) | 537166085 | (~((-950983472) | i415))) * 988));
                                                        if (((i100 & i101) | (i100 ^ i101)) != 0) {
                                                            int i416 = i49 + 288;
                                                            i50 = (~(i6 & i416)) & (i6 | i416);
                                                            break;
                                                        }
                                                        int i417 = (i49 & (-58)) + (i49 | (-58));
                                                        i49 = ((i417 | 59) << 1) - (i417 ^ 59);
                                                        strArr3 = strArr16;
                                                    }
                                                    int i418 = (~(i6 & i48)) & (i6 | i48);
                                                    int i419 = -i418;
                                                    int i420 = ((i418 & i419) | (i418 ^ i419)) >> 31;
                                                    int i421 = i50 & (~i420);
                                                    int i422 = i48 & i420;
                                                    i51 = (i422 & i421) | (i421 ^ i422);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                                        int maximumFlingVelocity3 = 3526 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                                                        byte b26 = (byte) 0;
                                                        byte b27 = (byte) (b26 + 5);
                                                        Object[] objArr71 = new Object[1];
                                                        c(b26, b27, (byte) (b27 - 5), objArr71);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maximumFlingVelocity3, iIndexOf2, 980946500, false, (String) objArr71[0], new Class[0]);
                                                    }
                                                    long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null)).longValue();
                                                    long j58 = 1401976968;
                                                    long j59 = (((long) 491) * j58) + (((long) (-489)) * jLongValue9);
                                                    long j60 = j58 ^ j;
                                                    long j61 = jLongValue9 ^ j;
                                                    long j62 = (int) Runtime.getRuntime().totalMemory();
                                                    long j63 = 490;
                                                    long j64 = j59 + (((long) (-490)) * (j60 | j61 | (j62 ^ j))) + ((((j61 | j62) ^ j) | ((j58 | j61) ^ j)) * j63) + (j63 * j60) + ((long) (-1582299606));
                                                    i52 = ((int) (j64 >> 32)) & ((-2620534) + ((~((-710324823) | i200)) * 52) + (((~((-1786705623) | i200)) | (~(1071035262 | i200)) | 1076380800) * (-52)) + (((~(1786705622 | i200)) | 360710440) * 52));
                                                    int i423 = ~((-639441944) | i6);
                                                    i53 = ((int) j64) & (861093121 + ((570757121 | i423) * (-280)) + ((i423 | (~(2076668353 | i6))) * 140) + (((~((-68684823) | i6)) | (~((-570757122) | i200)) | (~(2145353175 | i200))) * 140));
                                                    if (((i52 & i53) | (i52 ^ i53)) != 1) {
                                                        Object[] objArr72 = {1};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                            int maximumFlingVelocity4 = 2673 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 17;
                                                            byte b28 = (byte) 0;
                                                            byte b29 = (byte) (b28 + 5);
                                                            Object[] objArr73 = new Object[1];
                                                            c(b28, b29, (byte) (b29 - 5), objArr73);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode2, maximumFlingVelocity4, iLastIndexOf4, -1409439630, false, (String) objArr73[0], new Class[]{Integer.TYPE});
                                                        }
                                                        long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr72)).longValue();
                                                        long j65 = 1228553582;
                                                        long j66 = j65 ^ j;
                                                        long j67 = jLongValue10 ^ j;
                                                        i54 = i200;
                                                        j5 = i6;
                                                        j6 = j5 ^ j;
                                                        j7 = (j28 * j65) + (((long) (-67)) * jLongValue10) + (((((j66 | j67) | j6) ^ j) | ((j65 | jLongValue10) ^ j) | ((jLongValue10 | j5) ^ j)) * j26) + (((jLongValue10 | (j66 | j6)) ^ j) * j26) + (((long) 68) * (((j67 | j6) ^ j) | j66)) + ((long) 639145098);
                                                        i56 = ((int) (j7 >> 32)) & (1623859006 + (((~((-294261001) | i54)) | (~(1403663226 | i6))) * (-302)) + ((~((-294261001) | i6)) * (-604)) + (((~(1109402226 | i6)) | 1075839042) * 302));
                                                        iNextInt = new Random().nextInt(314607323);
                                                        if ((i56 | (((int) j7) & ((-162096932) + ((~((~iNextInt) | (-361267274))) * 433) + (((~(1971906041 | iNextInt)) | (-534679632)) * (-433)) + (((~(iNextInt | (-534679632))) | 1610638768) * 433)))) != 0) {
                                                            i57 = (~(i6 & 220)) & (i6 | 220);
                                                        } else {
                                                            i57 = i6;
                                                        }
                                                        int i424 = i6 ^ i51;
                                                        int i425 = (i424 | (-i424)) >> 31;
                                                        int i426 = i57 & (~i425);
                                                        int i427 = i51 & i425;
                                                        i58 = (i427 & i426) | (i426 ^ i427);
                                                        int i428 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        Object[] objArr74 = new Object[1];
                                                        a((i428 & 370) + (i428 | 370), 22 - (~(-(-TextUtils.indexOf("", "")))), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr74);
                                                        Object[] objArr75 = {(String) objArr74[0]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                            char c5 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33602);
                                                            int i429 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3086;
                                                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                                                            byte b30 = (byte) 0;
                                                            byte b31 = (byte) (b30 + 5);
                                                            Object[] objArr76 = new Object[1];
                                                            c(b30, b31, (byte) (b31 - 5), objArr76);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, i429, doubleTapTimeout, 1411172903, false, (String) objArr76[0], new Class[]{String.class});
                                                        }
                                                        objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr75);
                                                        if (objInvoke != null) {
                                                            Object[] objArr77 = {objInvoke, 42};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                                                char offsetAfter3 = (char) TextUtils.getOffsetAfter("", 0);
                                                                int iIndexOf3 = 3392 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                int trimmedLength2 = TextUtils.getTrimmedLength("") + 9;
                                                                byte b32 = (byte) 0;
                                                                byte b33 = (byte) (b32 + 5);
                                                                Object[] objArr78 = new Object[1];
                                                                c(b32, b33, (byte) (b33 - 5), objArr78);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(offsetAfter3, iIndexOf3, trimmedLength2, 1203525406, false, (String) objArr78[0], new Class[]{String.class, Integer.TYPE});
                                                            }
                                                            long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr77)).longValue();
                                                            long j68 = 1627048369;
                                                            long j69 = 253;
                                                            long j70 = (j69 * j68) + (j69 * jLongValue11);
                                                            long j71 = -252;
                                                            long j72 = jLongValue11 ^ j;
                                                            long j73 = ((j68 ^ j) | j72) ^ j;
                                                            long jUptimeMillis = (int) SystemClock.uptimeMillis();
                                                            long j74 = j72 | (jUptimeMillis ^ j);
                                                            long j75 = jLongValue11 | j68;
                                                            long j76 = (jUptimeMillis | j75) ^ j;
                                                            long j77 = j70 + ((j73 | (j74 ^ j) | j76) * j71) + (j71 * j75) + (((long) 252) * (((j74 | j68) ^ j) | j76)) + ((long) (-1629118246));
                                                            int i430 = ~((-1342279809) | i6);
                                                            i98 = ((int) (j77 >> 32)) & ((-1188348406) + ((19399976 | i430) * (-476)) + (i430 * 952) + ((~((-1342279809) | i54)) * 476));
                                                            i99 = ((int) j77) & ((-635053948) + (((-77595926) | i6) * (-627)) + (((~((-1532992225) | i6)) | 1324748661) * (-627)) + (((~(1532992224 | i54)) | (~(1324748661 | i6))) * 627));
                                                            if (((i99 & i98) | (i98 ^ i99)) == 1986687685) {
                                                                i62 = 0;
                                                                strArr6 = null;
                                                            } else {
                                                                int iResolveOpacity = 370 - Drawable.resolveOpacity(0, 0);
                                                                int iResolveSize = View.resolveSize(0, 0);
                                                                Object[] objArr79 = new Object[1];
                                                                a(iResolveOpacity, (iResolveSize ^ 23) + ((iResolveSize & 23) << 1), (char) KeyEvent.keyCodeFromString(""), objArr79);
                                                                String str26 = (String) objArr79[0];
                                                                int iIndexOf4 = TextUtils.indexOf("", "") + 808;
                                                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                                                                int i431 = -AndroidCharacter.getMirror('0');
                                                                char c6 = (char) ((i431 & 48) + (i431 | 48));
                                                                Object[] objArr80 = new Object[1];
                                                                a(iIndexOf4, minimumFlingVelocity, c6, objArr80);
                                                                String str27 = (String) objArr80[0];
                                                                int i432 = -ExpandableListView.getPackedPositionGroup(0L);
                                                                int i433 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                Object[] objArr81 = new Object[1];
                                                                a(((i432 | 818) << 1) - (i432 ^ 818), (i433 & 7) + (i433 | 7), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr81);
                                                                String str28 = (String) objArr81[0];
                                                                int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                Object[] objArr82 = new Object[1];
                                                                a((fadingEdgeLength2 & 825) + (fadingEdgeLength2 | 825), 8 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), (char) KeyEvent.getDeadChar(0, 0), objArr82);
                                                                int i434 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                int i435 = ((i434 | 832) << 1) - (i434 ^ 832);
                                                                int i436 = -Color.alpha(0);
                                                                Object[] objArr83 = new Object[1];
                                                                a(i435, (i436 & 17) + (i436 | 17), (char) TextUtils.indexOf("", ""), objArr83);
                                                                String str29 = (String) objArr83[0];
                                                                int i437 = 849 - (~(-Color.blue(0)));
                                                                int i438 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                int i439 = i438 * 569;
                                                                int i440 = (i439 ^ 3983) + ((i439 & 3983) << 1);
                                                                int i441 = ~i438;
                                                                int i442 = ~((i441 ^ (-8)) | (i441 & (-8)));
                                                                int i443 = ~((i441 ^ i12) | (i441 & i12));
                                                                int i444 = (i442 & i443) | (i442 ^ i443);
                                                                int i445 = ~(((-8) ^ i12) | ((-8) & i12));
                                                                int i446 = ((i444 & i445) | (i444 ^ i445)) * (-1136);
                                                                int i447 = ((i440 | i446) << 1) - (i440 ^ i446);
                                                                int i448 = ~((i441 & i6) | (i441 ^ i6));
                                                                int i449 = ~(((-8) ^ i6) | ((-8) & i6));
                                                                int i450 = (i448 & i449) | (i448 ^ i449);
                                                                int i451 = i54 | i438;
                                                                int i452 = ~((i451 & 7) | (i451 ^ 7));
                                                                int i453 = -(-(((i450 & i452) | (i450 ^ i452)) * (-568)));
                                                                int i454 = ((i447 | i453) << 1) - (i453 ^ i447);
                                                                int i455 = ~((i54 ^ i438) | (i54 & i438));
                                                                int i456 = ~((i12 ^ 7) | (i12 & 7));
                                                                int i457 = ~i438;
                                                                int i458 = (i457 & (-8)) | (i457 ^ (-8));
                                                                int i459 = (i454 - (~(-(-(((~((i458 & i6) | (i458 ^ i6))) | ((i455 & i456) | (i455 ^ i456))) * 568))))) - 1;
                                                                int i460 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                                Object[] objArr84 = new Object[1];
                                                                a(i437, i459, (char) ((i460 ^ 42790) + ((i460 & 42790) << 1)), objArr84);
                                                                String str30 = (String) objArr84[0];
                                                                int i461 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                                int i462 = ((i461 | 856) << 1) - (i461 ^ 856);
                                                                int i463 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                int iB5 = com.google.android.gms.internal.measurement.zzdm.b();
                                                                int i464 = i463 * 881;
                                                                int i465 = ((i464 | 5286) << 1) - (i464 ^ 5286);
                                                                int i466 = ~i463;
                                                                int i467 = ~((i466 & (-7)) | (i466 ^ (-7)));
                                                                int i468 = ~i463;
                                                                int i469 = (i465 - (~(-(-((((~((i468 ^ iB5) | (i468 & iB5))) | i467) | (~(((-7) ^ iB5) | ((-7) & iB5)))) * (-880)))))) - 1;
                                                                int i470 = ~((~iB5) | i468);
                                                                int i471 = (i470 & 6) | (i470 ^ 6);
                                                                int i472 = (i463 & iB5) | (i463 ^ iB5);
                                                                int i473 = ~i472;
                                                                int i474 = -(-(((i473 & i471) | (i471 ^ i473)) * (-880)));
                                                                int i475 = (i469 & i474) + (i474 | i469);
                                                                int i476 = (~i472) * 880;
                                                                int i477 = (i475 & i476) + (i476 | i475);
                                                                int iRgb2 = Color.rgb(0, 0, 0);
                                                                Object[] objArr85 = new Object[1];
                                                                a(i462, i477, (char) (((iRgb2 | 16777216) << 1) - (iRgb2 ^ 16777216)), objArr85);
                                                                String str31 = (String) objArr85[0];
                                                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                                Object[] objArr86 = new Object[1];
                                                                a((packedPositionGroup ^ 864) + ((packedPositionGroup & 864) << 1), 11 - Color.alpha(0), (char) (19729 - (~(-Color.green(0)))), objArr86);
                                                                String str32 = (String) objArr86[0];
                                                                int i478 = 874 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                                                                int i479 = -(-Color.argb(0, 0, 0, 0));
                                                                int i480 = (i479 & 14) + (i479 | 14);
                                                                int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                                                int i481 = (touchSlop2 * (-495)) - 22889295;
                                                                int i482 = ~touchSlop2;
                                                                int i483 = ~(i482 | (-46242));
                                                                int i484 = ~((i482 ^ i6) | (i482 & i6));
                                                                int i485 = ((i483 ^ i484) | (i483 & i484)) * 992;
                                                                int i486 = (i481 & i485) + (i485 | i481);
                                                                int i487 = ~(((-46242) & i482) | (i482 ^ (-46242)));
                                                                int i488 = ~((~touchSlop2) | i6);
                                                                int i489 = (i487 & i488) | (i487 ^ i488);
                                                                int i490 = (i12 ^ touchSlop2) | (i12 & touchSlop2);
                                                                char c7 = (char) (i486 + ((i489 | (~((i490 & 46241) | (i490 ^ 46241)))) * (-496)) + (((i6 ^ 46241) | (i6 & 46241)) * 496));
                                                                Object[] objArr87 = new Object[1];
                                                                a(i478, i480, c7, objArr87);
                                                                int i491 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 889;
                                                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                                                int iB6 = com.google.android.gms.internal.measurement.zzdm.b();
                                                                int i492 = ~(((-17) ^ iKeyCodeFromString) | ((-17) & iKeyCodeFromString));
                                                                int i493 = ~iKeyCodeFromString;
                                                                int i494 = ~(i493 | 16 | iB6);
                                                                int i495 = (((iKeyCodeFromString * (-500)) - 8000) - (~(-(-(((i492 & i494) | (i492 ^ i494)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1;
                                                                int i496 = (~(((-17) & i493) | (i493 ^ (-17)))) * 1002;
                                                                int i497 = ~iKeyCodeFromString;
                                                                int i498 = ~iB6;
                                                                int i499 = (i497 & i498) | (i497 ^ i498);
                                                                Object[] objArr88 = new Object[1];
                                                                a(i491, ((((i495 | i496) << 1) - (i495 ^ i496)) - (~(-(-((~((i499 & 16) | (i499 ^ 16))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16097), objArr88);
                                                                String str33 = (String) objArr88[0];
                                                                int iRgb3 = Color.rgb(0, 0, 0) + 16778121;
                                                                int i500 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                                int i501 = ((i500 | 4) << 1) - (i500 ^ 4);
                                                                int i502 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                                Object[] objArr89 = new Object[1];
                                                                a(iRgb3, i501, (char) (((i502 | 33182) << 1) - (i502 ^ 33182)), objArr89);
                                                                String str34 = (String) objArr89[0];
                                                                int i503 = -TextUtils.indexOf("", "");
                                                                int i504 = (i503 ^ 916) + ((i503 & 916) << 1);
                                                                int i505 = -KeyEvent.normalizeMetaState(0);
                                                                int i506 = ((i505 | 22) << 1) - (i505 ^ 22);
                                                                int i507 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                                                Object[] objArr90 = new Object[1];
                                                                a(i504, i506, (char) ((i507 & 8999) + (i507 | 8999)), objArr90);
                                                                String str35 = (String) objArr90[0];
                                                                int i508 = -Color.red(0);
                                                                int i509 = ((i508 | 938) << 1) - (i508 ^ 938);
                                                                int i510 = -KeyEvent.normalizeMetaState(0);
                                                                int i511 = (i510 ^ 25) + ((i510 & 25) << 1);
                                                                int iLastIndexOf5 = TextUtils.lastIndexOf("", '0');
                                                                int iB7 = com.google.android.gms.internal.measurement.zzdm.b();
                                                                int i512 = (iLastIndexOf5 * 758) - 30106188;
                                                                int i513 = ~iB7;
                                                                int i514 = -(-(((iLastIndexOf5 ^ i513) | (i513 & iLastIndexOf5)) * (-757)));
                                                                int i515 = (i512 ^ i514) + ((i512 & i514) << 1);
                                                                int i516 = (-39824) | iLastIndexOf5;
                                                                int i517 = i515 + ((~((i516 & iB7) | (i516 ^ iB7))) * 1514);
                                                                int i518 = ~iLastIndexOf5;
                                                                int i519 = ~((i518 ^ (-39824)) | (i518 & (-39824)));
                                                                int i520 = ~iB7;
                                                                int i521 = (iLastIndexOf5 & 39823) | (iLastIndexOf5 ^ 39823);
                                                                char c8 = (char) ((i517 - (~((((~(((-39824) ^ i520) | (i520 & (-39824)))) | i519) | (~((i521 & iB7) | (i521 ^ iB7)))) * 757))) - 1);
                                                                Object[] objArr91 = new Object[1];
                                                                a(i509, i511, c8, objArr91);
                                                                String str36 = (String) objArr91[0];
                                                                int i522 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                                Object[] objArr92 = new Object[1];
                                                                a((i522 ^ 963) + ((i522 & 963) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 28, (char) Color.green(0), objArr92);
                                                                String str37 = (String) objArr92[0];
                                                                int i523 = -(-Drawable.resolveOpacity(0, 0));
                                                                int i524 = (i523 & 991) + (i523 | 991);
                                                                int i525 = 10 - (~(-Color.red(0)));
                                                                int i526 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                Object[] objArr93 = new Object[1];
                                                                a(i524, i525, (char) ((i526 & 1) + (i526 | 1)), objArr93);
                                                                String str38 = (String) objArr93[0];
                                                                int i527 = 1003 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                int i528 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                                Object[] objArr94 = new Object[1];
                                                                a(i527, ((i528 | 7) << 1) - (i528 ^ 7), (char) ExpandableListView.getPackedPositionGroup(0L), objArr94);
                                                                String str39 = (String) objArr94[0];
                                                                Object[] objArr95 = new Object[1];
                                                                a(1008 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), 4 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr95);
                                                                String str40 = (String) objArr95[0];
                                                                int i529 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                Object[] objArr96 = new Object[1];
                                                                a((i529 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + (i529 | PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW), 5 - (~Color.red(0)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr96);
                                                                int iRgb4 = Color.rgb(0, 0, 0) + 16778238;
                                                                int i530 = -TextUtils.getOffsetBefore("", 0);
                                                                int i531 = (i530 & 16) + (i530 | 16);
                                                                int i532 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                int iB8 = com.google.android.gms.internal.measurement.zzdm.b();
                                                                int i533 = i532 * 302;
                                                                int i534 = (i533 & 15473583) + (i533 | 15473583);
                                                                int i535 = ~i532;
                                                                int i536 = ~iB8;
                                                                int i537 = ~((i535 ^ i536) | (i535 & i536));
                                                                int i538 = -(-(((i537 ^ 25661) | (i537 & 25661)) * (-602)));
                                                                int i539 = ((i534 | i538) << 1) - (i538 ^ i534);
                                                                int i540 = ~((i535 ^ (-25662)) | (i535 & (-25662)));
                                                                int i541 = ~i532;
                                                                int i542 = -(-(((~(i532 | i536 | 25661)) | i540 | (~((iB8 & i541) | (i541 ^ iB8)))) * (-301)));
                                                                int i543 = (i539 ^ i542) + ((i542 & i539) << 1);
                                                                int i544 = -(-((~(i536 | 25661)) * 301));
                                                                char c9 = (char) ((i543 ^ i544) + ((i544 & i543) << 1));
                                                                Object[] objArr97 = new Object[1];
                                                                a(iRgb4, i531, c9, objArr97);
                                                                String str41 = (String) objArr97[0];
                                                                int i545 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                int i546 = ((i545 | 857) << 1) - (i545 ^ 857);
                                                                int i547 = -Color.green(0);
                                                                Object[] objArr98 = new Object[1];
                                                                a(i546, (i547 & 7) + (i547 | 7), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr98);
                                                                String str42 = (String) objArr98[0];
                                                                int i548 = -View.MeasureSpec.getSize(0);
                                                                int i549 = ((i548 | 825) << 1) - (i548 ^ 825);
                                                                int i550 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i551 = ((i550 | 9) << 1) - (i550 ^ 9);
                                                                int i552 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                Object[] objArr99 = new Object[1];
                                                                a(i549, i551, (char) ((i552 & 1) + (i552 | 1)), objArr99);
                                                                int offsetAfter4 = TextUtils.getOffsetAfter("", 0) + 1038;
                                                                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                                                                int i553 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                Object[] objArr100 = new Object[1];
                                                                a(offsetAfter4, doubleTapTimeout2, (char) ((i553 & 3459) + (i553 | 3459)), objArr100);
                                                                String str43 = (String) objArr100[0];
                                                                int i554 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                int i555 = ((i554 | 1052) << 1) - (i554 ^ 1052);
                                                                int i556 = -Color.argb(0, 0, 0, 0);
                                                                int i557 = ((i556 | 1) << 1) - (i556 ^ 1);
                                                                int i558 = -TextUtils.lastIndexOf("", '0');
                                                                Object[] objArr101 = new Object[1];
                                                                a(i555, i557, (char) ((i558 & 1153) + (i558 | 1153)), objArr101);
                                                                int iMyTid2 = Process.myTid() >> 22;
                                                                int i559 = (iMyTid2 & 1053) + (iMyTid2 | 1053);
                                                                int i560 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8;
                                                                int i561 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                                Object[] objArr102 = new Object[1];
                                                                a(i559, i560, (char) ((i561 ^ 480) + ((i561 & 480) << 1)), objArr102);
                                                                String str44 = (String) objArr102[0];
                                                                int i562 = 1060 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                                                                int i563 = -Color.green(0);
                                                                Object[] objArr103 = new Object[1];
                                                                a(i562, ((i563 | 1) << 1) - (i563 ^ 1), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr103);
                                                                int i564 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i565 = ((i564 | 1064) << 1) - (i564 ^ 1064);
                                                                int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16;
                                                                int i566 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                Object[] objArr104 = new Object[1];
                                                                a(i565, keyRepeatDelay4, (char) ((i566 ^ 59327) + ((i566 & 59327) << 1)), objArr104);
                                                                String str45 = (String) objArr104[0];
                                                                int i567 = 904 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                                                int i568 = -(Process.myTid() >> 22);
                                                                int i569 = (i568 ^ 3) + ((i568 & 3) << 1);
                                                                int i570 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                Object[] objArr105 = new Object[1];
                                                                a(i567, i569, (char) ((i570 ^ 33183) + ((i570 & 33183) << 1)), objArr105);
                                                                String str46 = (String) objArr105[0];
                                                                int iRed2 = Color.red(0);
                                                                int i571 = (iRed2 ^ 850) + ((iRed2 & 850) << 1);
                                                                int i572 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                int i573 = (i572 & 6) + (i572 | 6);
                                                                int i574 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                Object[] objArr106 = new Object[1];
                                                                a(i571, i573, (char) ((i574 & 42790) + (i574 | 42790)), objArr106);
                                                                String str47 = (String) objArr106[0];
                                                                int maximumFlingVelocity5 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                                Object[] objArr107 = new Object[1];
                                                                a(((maximumFlingVelocity5 | 1079) << 1) - (maximumFlingVelocity5 ^ 1079), 7 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), (char) TextUtils.indexOf("", "", 0, 0), objArr107);
                                                                String str48 = (String) objArr107[0];
                                                                int i575 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                int i576 = (i575 ^ 864) + ((i575 & 864) << 1);
                                                                int i577 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                int i578 = (i577 ^ 11) + ((i577 & 11) << 1);
                                                                int i579 = -KeyEvent.getDeadChar(0, 0);
                                                                char c10 = (char) ((i579 & 19730) + (i579 | 19730));
                                                                Object[] objArr108 = new Object[1];
                                                                a(i576, i578, c10, objArr108);
                                                                String str49 = (String) objArr108[0];
                                                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                                int i580 = (iResolveSizeAndState & 875) + (iResolveSizeAndState | 875);
                                                                int capsMode = TextUtils.getCapsMode("", 0, 0);
                                                                int i581 = (capsMode ^ 14) + ((capsMode & 14) << 1);
                                                                int doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                                j = j;
                                                                Object[] objArr109 = new Object[1];
                                                                a(i580, i581, (char) ((doubleTapTimeout3 ^ 46241) + ((doubleTapTimeout3 & 46241) << 1)), objArr109);
                                                                int i582 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                char mirror4 = AndroidCharacter.getMirror('0');
                                                                Object[] objArr110 = new Object[1];
                                                                a(((i582 | 1087) << 1) - (i582 ^ 1087), ((mirror4 | (-28)) << 1) - (mirror4 ^ (-28)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr110);
                                                                String str50 = (String) objArr110[0];
                                                                int i583 = 1106 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                                                                int i584 = -KeyEvent.keyCodeFromString("");
                                                                int iB9 = com.google.android.gms.internal.measurement.zzdm.b();
                                                                int i585 = i584 * TypedValues.Custom.TYPE_DIMENSION;
                                                                int i586 = ((i585 | (-17157)) << 1) - (i585 ^ (-17157));
                                                                int i587 = ~i584;
                                                                int i588 = ~((i587 ^ iB9) | (i587 & iB9));
                                                                int i589 = ~iB9;
                                                                int i590 = ~((i589 ^ 19) | (i589 & 19));
                                                                int i591 = -(-(((i588 & i590) | (i588 ^ i590)) * (-1808)));
                                                                int i592 = (i586 & i591) + (i586 | i591);
                                                                int i593 = (i587 ^ (-20)) | (i587 & (-20));
                                                                int i594 = ~((i593 & iB9) | (i593 ^ iB9));
                                                                int i595 = ~iB9;
                                                                int i596 = ~((i595 & i584) | (i595 ^ i584) | 19);
                                                                int i597 = (i592 - (~(((i594 & i596) | (i594 ^ i596)) * TypedValues.Custom.TYPE_BOOLEAN))) - 1;
                                                                int i598 = (~(iB9 | (-20))) | (~(i587 | 19));
                                                                int i599 = ~((i584 & i589) | (i589 ^ i584));
                                                                int i600 = i597 + (((i599 & i598) | (i598 ^ i599)) * TypedValues.Custom.TYPE_BOOLEAN);
                                                                int keyRepeatDelay5 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                                Object[] objArr111 = new Object[1];
                                                                a(i583, i600, (char) ((keyRepeatDelay5 ^ 63607) + ((keyRepeatDelay5 & 63607) << 1)), objArr111);
                                                                String str51 = (String) objArr111[0];
                                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1126;
                                                                int i601 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                Object[] objArr112 = new Object[1];
                                                                a(iCombineMeasuredStates, (i601 & 31) + (i601 | 31), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr112);
                                                                String str52 = (String) objArr112[0];
                                                                int i602 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                                Object[] objArr113 = new Object[1];
                                                                a((i602 ^ 1157) + ((i602 & 1157) << 1), TextUtils.getTrimmedLength("") + 26, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 34125), objArr113);
                                                                String str53 = (String) objArr113[0];
                                                                Object[] objArr114 = new Object[1];
                                                                a(1183 - TextUtils.getCapsMode("", 0, 0), 22 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) TextUtils.getTrimmedLength(""), objArr114);
                                                                String str54 = (String) objArr114[0];
                                                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                                                int i603 = (absoluteGravity & 1206) + (absoluteGravity | 1206);
                                                                int i604 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                int i605 = -Gravity.getAbsoluteGravity(0, 0);
                                                                Object[] objArr115 = new Object[1];
                                                                a(i603, (i604 & 33) + (i604 | 33), (char) (((i605 | 34703) << 1) - (i605 ^ 34703)), objArr115);
                                                                int defaultSize = View.getDefaultSize(0, 0);
                                                                int i606 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                int i607 = ((i606 | 13) << 1) - (i606 ^ 13);
                                                                int i608 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                Object[] objArr116 = new Object[1];
                                                                a(((defaultSize | 1239) << 1) - (defaultSize ^ 1239), i607, (char) ((i608 ^ (-1)) + (i608 << 1)), objArr116);
                                                                String str55 = (String) objArr116[0];
                                                                int iRed3 = 818 - Color.red(0);
                                                                int i609 = -KeyEvent.keyCodeFromString("");
                                                                int iB10 = com.google.android.gms.internal.measurement.zzdm.b();
                                                                int i610 = (i609 * 758) - 5292;
                                                                int i611 = ~iB10;
                                                                int i612 = -(-(((i609 ^ i611) | (i609 & i611)) * (-757)));
                                                                int i613 = (((i610 | i612) << 1) - (i610 ^ i612)) + ((~(((-8) ^ i609) | ((-8) & i609) | iB10)) * 1514);
                                                                int i614 = ~i609;
                                                                int i615 = ~((i614 & (-8)) | (i614 ^ (-8)));
                                                                int i616 = ~((i611 & (-8)) | ((-8) ^ i611));
                                                                int i617 = (i615 & i616) | (i615 ^ i616);
                                                                int i618 = i609 | 7;
                                                                int i619 = ~((i618 & iB10) | (i618 ^ iB10));
                                                                int i620 = -(-(((i619 & i617) | (i617 ^ i619)) * 757));
                                                                Object[] objArr117 = new Object[1];
                                                                a(iRed3, (i613 ^ i620) + ((i620 & i613) << 1), (char) Gravity.getAbsoluteGravity(0, 0), objArr117);
                                                                int iIndexOf5 = TextUtils.indexOf("", "", 0, 0);
                                                                int i621 = ((iIndexOf5 | 1252) << 1) - (iIndexOf5 ^ 1252);
                                                                int i622 = -KeyEvent.getDeadChar(0, 0);
                                                                int i623 = (i622 & 30) + (i622 | 30);
                                                                int maximumFlingVelocity6 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                                Object[] objArr118 = new Object[1];
                                                                a(i621, i623, (char) (((maximumFlingVelocity6 | 41563) << 1) - (maximumFlingVelocity6 ^ 41563)), objArr118);
                                                                int i624 = -Color.rgb(0, 0, 0);
                                                                Object[] objArr119 = new Object[1];
                                                                a((i624 ^ (-16775934)) + ((i624 & (-16775934)) << 1), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14063 - (~(-(Process.myTid() >> 22)))), objArr119);
                                                                String str56 = (String) objArr119[0];
                                                                int i625 = TuitionPaymentFragmentbindingInflater1;
                                                                int i626 = ((i625 | 33) << 1) - (i625 ^ 33);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i626 % 128;
                                                                int i627 = i626 % 2;
                                                                String[] strArr21 = {(String) objArr118[0], str56};
                                                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1293;
                                                                int i628 = 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int scrollBarSize3 = ViewConfiguration.getScrollBarSize() >> 8;
                                                                Object[] objArr120 = new Object[1];
                                                                a(maximumDrawingCacheSize, i628, (char) ((scrollBarSize3 & 16502) + (scrollBarSize3 | 16502)), objArr120);
                                                                String str57 = (String) objArr120[0];
                                                                int packedPositionType3 = 1312 - ExpandableListView.getPackedPositionType(0L);
                                                                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 6;
                                                                int i629 = -Color.green(0);
                                                                Object[] objArr121 = new Object[1];
                                                                a(packedPositionType3, bitsPerPixel2, (char) (((i629 | 56418) << 1) - (i629 ^ 56418)), objArr121);
                                                                int i630 = 1316 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                                                int i631 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i632 = (i631 ^ 20) + ((i631 & 20) << 1);
                                                                int i633 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                Object[] objArr122 = new Object[1];
                                                                a(i630, i632, (char) ((i633 & 41835) + (i633 | 41835)), objArr122);
                                                                int threadPriority3 = Process.getThreadPriority(0);
                                                                int i634 = -(-((((threadPriority3 | 20) << 1) - (threadPriority3 ^ 20)) >> 6));
                                                                int i635 = ((i634 | 1336) << 1) - (i634 ^ 1336);
                                                                int i636 = -(-TextUtils.getCapsMode("", 0, 0));
                                                                int i637 = (i636 ^ 16) + ((i636 & 16) << 1);
                                                                int keyRepeatDelay6 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                                int i638 = (keyRepeatDelay6 * (-1335)) - 36049349;
                                                                int i639 = (keyRepeatDelay6 ^ i6) | (keyRepeatDelay6 & i6);
                                                                int i640 = -(-(((~i639) | (-54048)) * (-668)));
                                                                int i641 = ((i638 | i640) << 1) - (i638 ^ i640);
                                                                int i642 = ~((-54048) | i6);
                                                                int i643 = ((keyRepeatDelay6 & i642) | (keyRepeatDelay6 ^ i642)) * 1336;
                                                                int i644 = (i641 & i643) + (i643 | i641);
                                                                int i645 = -(-(((i639 ^ (-54048)) | (i639 & (-54048))) * 668));
                                                                char c11 = (char) ((i644 ^ i645) + ((i645 & i644) << 1));
                                                                Object[] objArr123 = new Object[1];
                                                                a(i635, i637, c11, objArr123);
                                                                int i646 = 1351 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
                                                                int i647 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                                int i648 = ((i647 | 19) << 1) - (i647 ^ 19);
                                                                int i649 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                Object[] objArr124 = new Object[1];
                                                                a(i646, i648, (char) (((i649 | 8108) << 1) - (i649 ^ 8108)), objArr124);
                                                                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1371;
                                                                int i650 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                                int i651 = (i650 & 19) + (i650 | 19);
                                                                int i652 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                Object[] objArr125 = new Object[1];
                                                                a(windowTouchSlop2, i651, (char) ((i652 ^ 48916) + ((i652 & 48916) << 1)), objArr125);
                                                                int i653 = -Color.red(0);
                                                                int i654 = (i653 & 1390) + (i653 | 1390);
                                                                int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                                Object[] objArr126 = new Object[1];
                                                                a(i654, ((scrollBarFadeDuration2 | 23) << 1) - (scrollBarFadeDuration2 ^ 23), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr126);
                                                                int i655 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                                int i656 = ((i655 | 1414) << 1) - (i655 ^ 1414);
                                                                int i657 = -TextUtils.getTrimmedLength("");
                                                                int i658 = ((i657 | 21) << 1) - (i657 ^ 21);
                                                                int threadPriority4 = Process.getThreadPriority(0);
                                                                char c12 = (char) (45738 - (~(-(((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6))));
                                                                Object[] objArr127 = new Object[1];
                                                                a(i656, i658, c12, objArr127);
                                                                int i659 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                int i660 = -Color.rgb(0, 0, 0);
                                                                Object[] objArr128 = new Object[1];
                                                                a((i659 & 1434) + (i659 | 1434), (i660 & (-16777192)) + (i660 | (-16777192)), (char) View.resolveSizeAndState(0, 0, 0), objArr128);
                                                                String str58 = str;
                                                                int i661 = -TextUtils.indexOf("", "");
                                                                int i662 = (i661 ^ 1458) + ((i661 & 1458) << 1);
                                                                int i663 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                int i664 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                Object[] objArr129 = new Object[1];
                                                                a(i662, i663, (char) ((i664 & 1) + (i664 | 1)), objArr129);
                                                                int i665 = 1485 - (~Color.red(0));
                                                                int i666 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i667 = (i666 ^ 26) + ((i666 & 26) << 1);
                                                                int i668 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                Object[] objArr130 = new Object[1];
                                                                a(i665, i667, (char) ((i668 ^ (-1)) + (i668 << 1)), objArr130);
                                                                int i669 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                int i670 = (i669 & 1513) + (i669 | 1513);
                                                                int i671 = -(-TextUtils.indexOf("", "", 0));
                                                                Object[] objArr131 = new Object[1];
                                                                a(i670, (i671 ^ 31) + ((i671 & 31) << 1), (char) (6270 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr131);
                                                                int i672 = -(-ExpandableListView.getPackedPositionChild(0L));
                                                                int i673 = (i672 ^ 1545) + ((i672 & 1545) << 1);
                                                                int i674 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                int i675 = (i674 ^ 28) + ((i674 & 28) << 1);
                                                                int i676 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                Object[] objArr132 = new Object[1];
                                                                a(i673, i675, (char) ((i676 & 13095) + (i676 | 13095)), objArr132);
                                                                int i677 = 1570 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                                int i678 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                Object[] objArr133 = new Object[1];
                                                                a(i677, (i678 ^ 33) + ((i678 & 33) << 1), (char) ((-2) - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr133);
                                                                strArr5 = new String[][]{new String[]{str26, str27, str28, (String) objArr82[0]}, new String[]{str29, str30, str31, str32, (String) objArr87[0]}, new String[]{str33, str34, str, str35, str36, str37}, new String[]{str38, str39, str40, (String) objArr96[0]}, new String[]{str41, str42, (String) objArr99[0]}, new String[]{str43, (String) objArr101[0]}, new String[]{str44, (String) objArr103[0]}, new String[]{str45, str46, str47, str48, str49, (String) objArr109[0]}, new String[]{str50, str51, str52, str53, str54, (String) objArr115[0], str}, new String[]{str55, (String) objArr117[0]}, strArr21, new String[]{str57, (String) objArr121[0]}, new String[]{(String) objArr122[0]}, new String[]{(String) objArr123[0]}, new String[]{(String) objArr124[0]}, new String[]{(String) objArr125[0]}, new String[]{(String) objArr126[0]}, new String[]{(String) objArr127[0]}, new String[]{(String) objArr128[0], str58}, new String[]{(String) objArr129[0], str58}, new String[]{(String) objArr130[0], str58}, new String[]{(String) objArr131[0], str58}, new String[]{(String) objArr132[0], str58}, new String[]{(String) objArr133[0], str58}};
                                                                int i679 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                int i680 = ((i679 | 1603) << 1) - (i679 ^ 1603);
                                                                int i681 = -(Process.myPid() >> 22);
                                                                int i682 = -KeyEvent.normalizeMetaState(0);
                                                                Object[] objArr134 = new Object[1];
                                                                a(i680, ((i681 | 1) << 1) - (i681 ^ 1), (char) ((i682 & 62047) + (i682 | 62047)), objArr134);
                                                                sb = new StringBuilder((String) objArr134[0]);
                                                                i59 = i6;
                                                                i60 = 0;
                                                                i61 = 0;
                                                                while (i60 < 24) {
                                                                    i63 = TuitionPaymentFragmentbindingInflater1 + 51;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i63 % 128;
                                                                    if (i63 % 2 != 0) {
                                                                        String[] strArr22 = strArr5[i60];
                                                                        Object[] objArr135 = {strArr22[1]};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                            char cNormalizeMetaState = (char) (33602 - KeyEvent.normalizeMetaState(0));
                                                                            int iResolveSizeAndState2 = 3085 - View.resolveSizeAndState(0, 0, 0);
                                                                            int i683 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                                                                            byte b34 = (byte) 0;
                                                                            byte b35 = (byte) (b34 + 5);
                                                                            Object[] objArr136 = new Object[1];
                                                                            c(b34, b35, (byte) (b35 - 5), objArr136);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState, iResolveSizeAndState2, i683, 1411172903, false, (String) objArr136[0], new Class[]{String.class});
                                                                        }
                                                                        str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr135);
                                                                        strArr7 = strArr22;
                                                                        strArr5 = strArr5;
                                                                    } else {
                                                                        i58 = i58;
                                                                        strArr7 = strArr5[i60];
                                                                        Object[] objArr137 = {strArr7[0]};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                            char cAlpha = (char) (33602 - Color.alpha(0));
                                                                            int maximumFlingVelocity7 = 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                            int iAxisFromString4 = 25 - MotionEvent.axisFromString("");
                                                                            byte b36 = (byte) 0;
                                                                            byte b37 = (byte) (b36 + 5);
                                                                            Object[] objArr138 = new Object[1];
                                                                            c(b36, b37, (byte) (b37 - 5), objArr138);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, maximumFlingVelocity7, iAxisFromString4, 1411172903, false, (String) objArr138[0], new Class[]{String.class});
                                                                        }
                                                                        str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr137);
                                                                    }
                                                                    String[] strArr23 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                                                                    if (str5 == null) {
                                                                    }
                                                                    i60 = (i60 | 1) + (i60 & 1);
                                                                    i58 = i58;
                                                                    strArr5 = strArr5;
                                                                }
                                                                int i684 = i58;
                                                                Object[] objArr139 = new Object[1];
                                                                a(1606 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), -TextUtils.indexOf((CharSequence) "", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr139);
                                                                sb.append((String) objArr139[0]);
                                                                objArr2 = new Object[2];
                                                                if (i61 > 2) {
                                                                    objArr2[0] = new int[1];
                                                                    String[] strArr24 = {sb.toString()};
                                                                    ((int[]) objArr2[0])[0] = i59;
                                                                    objArr2[1] = strArr24;
                                                                } else {
                                                                    objArr2[0] = new int[]{i6};
                                                                    objArr2[1] = new String[0];
                                                                }
                                                                int i685 = ((int[]) objArr2[0])[0];
                                                                int i686 = (~(i6 & i684)) & (i6 | i684);
                                                                int i687 = -i686;
                                                                int i688 = ((i686 & i687) | (i686 ^ i687)) >> 31;
                                                                int i689 = i685 & (~i688);
                                                                int i690 = i684 & i688;
                                                                strArr6 = (String[]) objArr2[1];
                                                                i58 = (i689 & i690) | (i689 ^ i690);
                                                                i62 = 0;
                                                            }
                                                        } else {
                                                            int iResolveOpacity2 = 370 - Drawable.resolveOpacity(0, 0);
                                                            int iResolveSize2 = View.resolveSize(0, 0);
                                                            Object[] objArr710 = new Object[1];
                                                            a(iResolveOpacity2, (iResolveSize2 ^ 23) + ((iResolveSize2 & 23) << 1), (char) KeyEvent.keyCodeFromString(""), objArr710);
                                                            String str210 = (String) objArr710[0];
                                                            int iIndexOf6 = TextUtils.indexOf("", "") + 808;
                                                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                                                            int i4310 = -AndroidCharacter.getMirror('0');
                                                            char c13 = (char) ((i4310 & 48) + (i4310 | 48));
                                                            Object[] objArr810 = new Object[1];
                                                            a(iIndexOf6, minimumFlingVelocity2, c13, objArr810);
                                                            String str211 = (String) objArr810[0];
                                                            int i4311 = -ExpandableListView.getPackedPositionGroup(0L);
                                                            int i4312 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                            Object[] objArr811 = new Object[1];
                                                            a(((i4311 | 818) << 1) - (i4311 ^ 818), (i4312 & 7) + (i4312 | 7), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr811);
                                                            String str212 = (String) objArr811[0];
                                                            int fadingEdgeLength3 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                            Object[] objArr812 = new Object[1];
                                                            a((fadingEdgeLength3 & 825) + (fadingEdgeLength3 | 825), 8 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), (char) KeyEvent.getDeadChar(0, 0), objArr812);
                                                            int i4313 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                            int i4314 = ((i4313 | 832) << 1) - (i4313 ^ 832);
                                                            int i4315 = -Color.alpha(0);
                                                            Object[] objArr813 = new Object[1];
                                                            a(i4314, (i4315 & 17) + (i4315 | 17), (char) TextUtils.indexOf("", ""), objArr813);
                                                            String str213 = (String) objArr813[0];
                                                            int i4316 = 849 - (~(-Color.blue(0)));
                                                            int i4317 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i4318 = i4317 * 569;
                                                            int i4410 = (i4318 ^ 3983) + ((i4318 & 3983) << 1);
                                                            int i4411 = ~i4317;
                                                            int i4412 = ~((i4411 ^ (-8)) | (i4411 & (-8)));
                                                            int i4413 = ~((i4411 ^ i12) | (i4411 & i12));
                                                            int i4414 = (i4412 & i4413) | (i4412 ^ i4413);
                                                            int i4415 = ~(((-8) ^ i12) | ((-8) & i12));
                                                            int i4416 = ((i4414 & i4415) | (i4414 ^ i4415)) * (-1136);
                                                            int i4417 = ((i4410 | i4416) << 1) - (i4410 ^ i4416);
                                                            int i4418 = ~((i4411 & i6) | (i4411 ^ i6));
                                                            int i4419 = ~(((-8) ^ i6) | ((-8) & i6));
                                                            int i4510 = (i4418 & i4419) | (i4418 ^ i4419);
                                                            int i4511 = i54 | i4317;
                                                            int i4512 = ~((i4511 & 7) | (i4511 ^ 7));
                                                            int i4513 = -(-(((i4510 & i4512) | (i4510 ^ i4512)) * (-568)));
                                                            int i4514 = ((i4417 | i4513) << 1) - (i4513 ^ i4417);
                                                            int i4515 = ~((i54 ^ i4317) | (i54 & i4317));
                                                            int i4516 = ~((i12 ^ 7) | (i12 & 7));
                                                            int i4517 = ~i4317;
                                                            int i4518 = (i4517 & (-8)) | (i4517 ^ (-8));
                                                            int i4519 = (i4514 - (~(-(-(((~((i4518 & i6) | (i4518 ^ i6))) | ((i4515 & i4516) | (i4515 ^ i4516))) * 568))))) - 1;
                                                            int i4610 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                            Object[] objArr814 = new Object[1];
                                                            a(i4316, i4519, (char) ((i4610 ^ 42790) + ((i4610 & 42790) << 1)), objArr814);
                                                            String str310 = (String) objArr814[0];
                                                            int i4611 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                            int i4612 = ((i4611 | 856) << 1) - (i4611 ^ 856);
                                                            int i4613 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                            int iB11 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i4614 = i4613 * 881;
                                                            int i4615 = ((i4614 | 5286) << 1) - (i4614 ^ 5286);
                                                            int i4616 = ~i4613;
                                                            int i4617 = ~((i4616 & (-7)) | (i4616 ^ (-7)));
                                                            int i4618 = ~i4613;
                                                            int i4619 = (i4615 - (~(-(-((((~((i4618 ^ iB11) | (i4618 & iB11))) | i4617) | (~(((-7) ^ iB11) | ((-7) & iB11)))) * (-880)))))) - 1;
                                                            int i4710 = ~((~iB11) | i4618);
                                                            int i4711 = (i4710 & 6) | (i4710 ^ 6);
                                                            int i4712 = (i4613 & iB11) | (i4613 ^ iB11);
                                                            int i4713 = ~i4712;
                                                            int i4714 = -(-(((i4713 & i4711) | (i4711 ^ i4713)) * (-880)));
                                                            int i4715 = (i4619 & i4714) + (i4714 | i4619);
                                                            int i4716 = (~i4712) * 880;
                                                            int i4717 = (i4715 & i4716) + (i4716 | i4715);
                                                            int iRgb5 = Color.rgb(0, 0, 0);
                                                            Object[] objArr815 = new Object[1];
                                                            a(i4612, i4717, (char) (((iRgb5 | 16777216) << 1) - (iRgb5 ^ 16777216)), objArr815);
                                                            String str311 = (String) objArr815[0];
                                                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                                                            Object[] objArr816 = new Object[1];
                                                            a((packedPositionGroup2 ^ 864) + ((packedPositionGroup2 & 864) << 1), 11 - Color.alpha(0), (char) (19729 - (~(-Color.green(0)))), objArr816);
                                                            String str312 = (String) objArr816[0];
                                                            int i4718 = 874 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                                                            int i4719 = -(-Color.argb(0, 0, 0, 0));
                                                            int i4810 = (i4719 & 14) + (i4719 | 14);
                                                            int touchSlop3 = ViewConfiguration.getTouchSlop() >> 8;
                                                            int i4811 = (touchSlop3 * (-495)) - 22889295;
                                                            int i4812 = ~touchSlop3;
                                                            int i4813 = ~(i4812 | (-46242));
                                                            int i4814 = ~((i4812 ^ i6) | (i4812 & i6));
                                                            int i4815 = ((i4813 ^ i4814) | (i4813 & i4814)) * 992;
                                                            int i4816 = (i4811 & i4815) + (i4815 | i4811);
                                                            int i4817 = ~(((-46242) & i4812) | (i4812 ^ (-46242)));
                                                            int i4818 = ~((~touchSlop3) | i6);
                                                            int i4819 = (i4817 & i4818) | (i4817 ^ i4818);
                                                            int i4910 = (i12 ^ touchSlop3) | (i12 & touchSlop3);
                                                            char c14 = (char) (i4816 + ((i4819 | (~((i4910 & 46241) | (i4910 ^ 46241)))) * (-496)) + (((i6 ^ 46241) | (i6 & 46241)) * 496));
                                                            Object[] objArr817 = new Object[1];
                                                            a(i4718, i4810, c14, objArr817);
                                                            int i4911 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 889;
                                                            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("");
                                                            int iB12 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i4912 = ~(((-17) ^ iKeyCodeFromString2) | ((-17) & iKeyCodeFromString2));
                                                            int i4913 = ~iKeyCodeFromString2;
                                                            int i4914 = ~(i4913 | 16 | iB12);
                                                            int i4915 = (((iKeyCodeFromString2 * (-500)) - 8000) - (~(-(-(((i4912 & i4914) | (i4912 ^ i4914)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1;
                                                            int i4916 = (~(((-17) & i4913) | (i4913 ^ (-17)))) * 1002;
                                                            int i4917 = ~iKeyCodeFromString2;
                                                            int i4918 = ~iB12;
                                                            int i4919 = (i4917 & i4918) | (i4917 ^ i4918);
                                                            Object[] objArr818 = new Object[1];
                                                            a(i4911, ((((i4915 | i4916) << 1) - (i4915 ^ i4916)) - (~(-(-((~((i4919 & 16) | (i4919 ^ 16))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16097), objArr818);
                                                            String str313 = (String) objArr818[0];
                                                            int iRgb6 = Color.rgb(0, 0, 0) + 16778121;
                                                            int i5010 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                            int i5011 = ((i5010 | 4) << 1) - (i5010 ^ 4);
                                                            int i5012 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                            Object[] objArr819 = new Object[1];
                                                            a(iRgb6, i5011, (char) (((i5012 | 33182) << 1) - (i5012 ^ 33182)), objArr819);
                                                            String str314 = (String) objArr819[0];
                                                            int i5013 = -TextUtils.indexOf("", "");
                                                            int i5014 = (i5013 ^ 916) + ((i5013 & 916) << 1);
                                                            int i5015 = -KeyEvent.normalizeMetaState(0);
                                                            int i5016 = ((i5015 | 22) << 1) - (i5015 ^ 22);
                                                            int i5017 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                                            Object[] objArr910 = new Object[1];
                                                            a(i5014, i5016, (char) ((i5017 & 8999) + (i5017 | 8999)), objArr910);
                                                            String str315 = (String) objArr910[0];
                                                            int i5018 = -Color.red(0);
                                                            int i5019 = ((i5018 | 938) << 1) - (i5018 ^ 938);
                                                            int i5110 = -KeyEvent.normalizeMetaState(0);
                                                            int i5111 = (i5110 ^ 25) + ((i5110 & 25) << 1);
                                                            int iLastIndexOf6 = TextUtils.lastIndexOf("", '0');
                                                            int iB13 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i5112 = (iLastIndexOf6 * 758) - 30106188;
                                                            int i5113 = ~iB13;
                                                            int i5114 = -(-(((iLastIndexOf6 ^ i5113) | (i5113 & iLastIndexOf6)) * (-757)));
                                                            int i5115 = (i5112 ^ i5114) + ((i5112 & i5114) << 1);
                                                            int i5116 = (-39824) | iLastIndexOf6;
                                                            int i5117 = i5115 + ((~((i5116 & iB13) | (i5116 ^ iB13))) * 1514);
                                                            int i5118 = ~iLastIndexOf6;
                                                            int i5119 = ~((i5118 ^ (-39824)) | (i5118 & (-39824)));
                                                            int i5210 = ~iB13;
                                                            int i5211 = (iLastIndexOf6 & 39823) | (iLastIndexOf6 ^ 39823);
                                                            char c15 = (char) ((i5117 - (~((((~(((-39824) ^ i5210) | (i5210 & (-39824)))) | i5119) | (~((i5211 & iB13) | (i5211 ^ iB13)))) * 757))) - 1);
                                                            Object[] objArr911 = new Object[1];
                                                            a(i5019, i5111, c15, objArr911);
                                                            String str316 = (String) objArr911[0];
                                                            int i5212 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                            Object[] objArr912 = new Object[1];
                                                            a((i5212 ^ 963) + ((i5212 & 963) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 28, (char) Color.green(0), objArr912);
                                                            String str317 = (String) objArr912[0];
                                                            int i5213 = -(-Drawable.resolveOpacity(0, 0));
                                                            int i5214 = (i5213 & 991) + (i5213 | 991);
                                                            int i5215 = 10 - (~(-Color.red(0)));
                                                            int i5216 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            Object[] objArr913 = new Object[1];
                                                            a(i5214, i5215, (char) ((i5216 & 1) + (i5216 | 1)), objArr913);
                                                            String str318 = (String) objArr913[0];
                                                            int i5217 = 1003 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int i5218 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                            Object[] objArr914 = new Object[1];
                                                            a(i5217, ((i5218 | 7) << 1) - (i5218 ^ 7), (char) ExpandableListView.getPackedPositionGroup(0L), objArr914);
                                                            String str319 = (String) objArr914[0];
                                                            Object[] objArr915 = new Object[1];
                                                            a(1008 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), 4 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr915);
                                                            String str410 = (String) objArr915[0];
                                                            int i5219 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            Object[] objArr916 = new Object[1];
                                                            a((i5219 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + (i5219 | PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW), 5 - (~Color.red(0)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr916);
                                                            int iRgb7 = Color.rgb(0, 0, 0) + 16778238;
                                                            int i5310 = -TextUtils.getOffsetBefore("", 0);
                                                            int i5311 = (i5310 & 16) + (i5310 | 16);
                                                            int i5312 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int iB14 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i5313 = i5312 * 302;
                                                            int i5314 = (i5313 & 15473583) + (i5313 | 15473583);
                                                            int i5315 = ~i5312;
                                                            int i5316 = ~iB14;
                                                            int i5317 = ~((i5315 ^ i5316) | (i5315 & i5316));
                                                            int i5318 = -(-(((i5317 ^ 25661) | (i5317 & 25661)) * (-602)));
                                                            int i5319 = ((i5314 | i5318) << 1) - (i5318 ^ i5314);
                                                            int i5410 = ~((i5315 ^ (-25662)) | (i5315 & (-25662)));
                                                            int i5411 = ~i5312;
                                                            int i5412 = -(-(((~(i5312 | i5316 | 25661)) | i5410 | (~((iB14 & i5411) | (i5411 ^ iB14)))) * (-301)));
                                                            int i5413 = (i5319 ^ i5412) + ((i5412 & i5319) << 1);
                                                            int i5414 = -(-((~(i5316 | 25661)) * 301));
                                                            char c16 = (char) ((i5413 ^ i5414) + ((i5414 & i5413) << 1));
                                                            Object[] objArr917 = new Object[1];
                                                            a(iRgb7, i5311, c16, objArr917);
                                                            String str411 = (String) objArr917[0];
                                                            int i5415 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            int i5416 = ((i5415 | 857) << 1) - (i5415 ^ 857);
                                                            int i5417 = -Color.green(0);
                                                            Object[] objArr918 = new Object[1];
                                                            a(i5416, (i5417 & 7) + (i5417 | 7), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr918);
                                                            String str412 = (String) objArr918[0];
                                                            int i5418 = -View.MeasureSpec.getSize(0);
                                                            int i5419 = ((i5418 | 825) << 1) - (i5418 ^ 825);
                                                            int i5510 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            int i5511 = ((i5510 | 9) << 1) - (i5510 ^ 9);
                                                            int i5512 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                            Object[] objArr919 = new Object[1];
                                                            a(i5419, i5511, (char) ((i5512 & 1) + (i5512 | 1)), objArr919);
                                                            int offsetAfter5 = TextUtils.getOffsetAfter("", 0) + 1038;
                                                            int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                                                            int i5513 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                            Object[] objArr1010 = new Object[1];
                                                            a(offsetAfter5, doubleTapTimeout4, (char) ((i5513 & 3459) + (i5513 | 3459)), objArr1010);
                                                            String str413 = (String) objArr1010[0];
                                                            int i5514 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                            int i5515 = ((i5514 | 1052) << 1) - (i5514 ^ 1052);
                                                            int i5516 = -Color.argb(0, 0, 0, 0);
                                                            int i5517 = ((i5516 | 1) << 1) - (i5516 ^ 1);
                                                            int i5518 = -TextUtils.lastIndexOf("", '0');
                                                            Object[] objArr1011 = new Object[1];
                                                            a(i5515, i5517, (char) ((i5518 & 1153) + (i5518 | 1153)), objArr1011);
                                                            int iMyTid3 = Process.myTid() >> 22;
                                                            int i5519 = (iMyTid3 & 1053) + (iMyTid3 | 1053);
                                                            int i5610 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8;
                                                            int i5611 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                            Object[] objArr1012 = new Object[1];
                                                            a(i5519, i5610, (char) ((i5611 ^ 480) + ((i5611 & 480) << 1)), objArr1012);
                                                            String str414 = (String) objArr1012[0];
                                                            int i5612 = 1060 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                                                            int i5613 = -Color.green(0);
                                                            Object[] objArr1013 = new Object[1];
                                                            a(i5612, ((i5613 | 1) << 1) - (i5613 ^ 1), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr1013);
                                                            int i5614 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            int i5615 = ((i5614 | 1064) << 1) - (i5614 ^ 1064);
                                                            int keyRepeatDelay7 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16;
                                                            int i5616 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            Object[] objArr1014 = new Object[1];
                                                            a(i5615, keyRepeatDelay7, (char) ((i5616 ^ 59327) + ((i5616 & 59327) << 1)), objArr1014);
                                                            String str415 = (String) objArr1014[0];
                                                            int i5617 = 904 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                                            int i5618 = -(Process.myTid() >> 22);
                                                            int i5619 = (i5618 ^ 3) + ((i5618 & 3) << 1);
                                                            int i5710 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            Object[] objArr1015 = new Object[1];
                                                            a(i5617, i5619, (char) ((i5710 ^ 33183) + ((i5710 & 33183) << 1)), objArr1015);
                                                            String str416 = (String) objArr1015[0];
                                                            int iRed4 = Color.red(0);
                                                            int i5711 = (iRed4 ^ 850) + ((iRed4 & 850) << 1);
                                                            int i5712 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int i5713 = (i5712 & 6) + (i5712 | 6);
                                                            int i5714 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                            Object[] objArr1016 = new Object[1];
                                                            a(i5711, i5713, (char) ((i5714 & 42790) + (i5714 | 42790)), objArr1016);
                                                            String str417 = (String) objArr1016[0];
                                                            int maximumFlingVelocity8 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                            Object[] objArr1017 = new Object[1];
                                                            a(((maximumFlingVelocity8 | 1079) << 1) - (maximumFlingVelocity8 ^ 1079), 7 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), (char) TextUtils.indexOf("", "", 0, 0), objArr1017);
                                                            String str418 = (String) objArr1017[0];
                                                            int i5715 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                            int i5716 = (i5715 ^ 864) + ((i5715 & 864) << 1);
                                                            int i5717 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                            int i5718 = (i5717 ^ 11) + ((i5717 & 11) << 1);
                                                            int i5719 = -KeyEvent.getDeadChar(0, 0);
                                                            char c17 = (char) ((i5719 & 19730) + (i5719 | 19730));
                                                            Object[] objArr1018 = new Object[1];
                                                            a(i5716, i5718, c17, objArr1018);
                                                            String str419 = (String) objArr1018[0];
                                                            int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0);
                                                            int i5810 = (iResolveSizeAndState3 & 875) + (iResolveSizeAndState3 | 875);
                                                            int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                                                            int i5811 = (capsMode2 ^ 14) + ((capsMode2 & 14) << 1);
                                                            int doubleTapTimeout5 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                            j = j;
                                                            Object[] objArr1019 = new Object[1];
                                                            a(i5810, i5811, (char) ((doubleTapTimeout5 ^ 46241) + ((doubleTapTimeout5 & 46241) << 1)), objArr1019);
                                                            int i5812 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                            char mirror5 = AndroidCharacter.getMirror('0');
                                                            Object[] objArr1110 = new Object[1];
                                                            a(((i5812 | 1087) << 1) - (i5812 ^ 1087), ((mirror5 | (-28)) << 1) - (mirror5 ^ (-28)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1110);
                                                            String str59 = (String) objArr1110[0];
                                                            int i5813 = 1106 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                                                            int i5814 = -KeyEvent.keyCodeFromString("");
                                                            int iB15 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i5815 = i5814 * TypedValues.Custom.TYPE_DIMENSION;
                                                            int i5816 = ((i5815 | (-17157)) << 1) - (i5815 ^ (-17157));
                                                            int i5817 = ~i5814;
                                                            int i5818 = ~((i5817 ^ iB15) | (i5817 & iB15));
                                                            int i5819 = ~iB15;
                                                            int i5910 = ~((i5819 ^ 19) | (i5819 & 19));
                                                            int i5911 = -(-(((i5818 & i5910) | (i5818 ^ i5910)) * (-1808)));
                                                            int i5912 = (i5816 & i5911) + (i5816 | i5911);
                                                            int i5913 = (i5817 ^ (-20)) | (i5817 & (-20));
                                                            int i5914 = ~((i5913 & iB15) | (i5913 ^ iB15));
                                                            int i5915 = ~iB15;
                                                            int i5916 = ~((i5915 & i5814) | (i5915 ^ i5814) | 19);
                                                            int i5917 = (i5912 - (~(((i5914 & i5916) | (i5914 ^ i5916)) * TypedValues.Custom.TYPE_BOOLEAN))) - 1;
                                                            int i5918 = (~(iB15 | (-20))) | (~(i5817 | 19));
                                                            int i5919 = ~((i5814 & i5819) | (i5819 ^ i5814));
                                                            int i6010 = i5917 + (((i5919 & i5918) | (i5918 ^ i5919)) * TypedValues.Custom.TYPE_BOOLEAN);
                                                            int keyRepeatDelay8 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                            Object[] objArr1111 = new Object[1];
                                                            a(i5813, i6010, (char) ((keyRepeatDelay8 ^ 63607) + ((keyRepeatDelay8 & 63607) << 1)), objArr1111);
                                                            String str510 = (String) objArr1111[0];
                                                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 1126;
                                                            int i6011 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                            Object[] objArr1112 = new Object[1];
                                                            a(iCombineMeasuredStates2, (i6011 & 31) + (i6011 | 31), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr1112);
                                                            String str511 = (String) objArr1112[0];
                                                            int i6012 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                            Object[] objArr1113 = new Object[1];
                                                            a((i6012 ^ 1157) + ((i6012 & 1157) << 1), TextUtils.getTrimmedLength("") + 26, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 34125), objArr1113);
                                                            String str512 = (String) objArr1113[0];
                                                            Object[] objArr1114 = new Object[1];
                                                            a(1183 - TextUtils.getCapsMode("", 0, 0), 22 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) TextUtils.getTrimmedLength(""), objArr1114);
                                                            String str513 = (String) objArr1114[0];
                                                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                                                            int i6013 = (absoluteGravity2 & 1206) + (absoluteGravity2 | 1206);
                                                            int i6014 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                            int i6015 = -Gravity.getAbsoluteGravity(0, 0);
                                                            Object[] objArr1115 = new Object[1];
                                                            a(i6013, (i6014 & 33) + (i6014 | 33), (char) (((i6015 | 34703) << 1) - (i6015 ^ 34703)), objArr1115);
                                                            int defaultSize2 = View.getDefaultSize(0, 0);
                                                            int i6016 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i6017 = ((i6016 | 13) << 1) - (i6016 ^ 13);
                                                            int i6018 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                            Object[] objArr1116 = new Object[1];
                                                            a(((defaultSize2 | 1239) << 1) - (defaultSize2 ^ 1239), i6017, (char) ((i6018 ^ (-1)) + (i6018 << 1)), objArr1116);
                                                            String str514 = (String) objArr1116[0];
                                                            int iRed5 = 818 - Color.red(0);
                                                            int i6019 = -KeyEvent.keyCodeFromString("");
                                                            int iB16 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i6110 = (i6019 * 758) - 5292;
                                                            int i6111 = ~iB16;
                                                            int i6112 = -(-(((i6019 ^ i6111) | (i6019 & i6111)) * (-757)));
                                                            int i6113 = (((i6110 | i6112) << 1) - (i6110 ^ i6112)) + ((~(((-8) ^ i6019) | ((-8) & i6019) | iB16)) * 1514);
                                                            int i6114 = ~i6019;
                                                            int i6115 = ~((i6114 & (-8)) | (i6114 ^ (-8)));
                                                            int i6116 = ~((i6111 & (-8)) | ((-8) ^ i6111));
                                                            int i6117 = (i6115 & i6116) | (i6115 ^ i6116);
                                                            int i6118 = i6019 | 7;
                                                            int i6119 = ~((i6118 & iB16) | (i6118 ^ iB16));
                                                            int i6210 = -(-(((i6119 & i6117) | (i6117 ^ i6119)) * 757));
                                                            Object[] objArr1117 = new Object[1];
                                                            a(iRed5, (i6113 ^ i6210) + ((i6210 & i6113) << 1), (char) Gravity.getAbsoluteGravity(0, 0), objArr1117);
                                                            int iIndexOf7 = TextUtils.indexOf("", "", 0, 0);
                                                            int i6211 = ((iIndexOf7 | 1252) << 1) - (iIndexOf7 ^ 1252);
                                                            int i6212 = -KeyEvent.getDeadChar(0, 0);
                                                            int i6213 = (i6212 & 30) + (i6212 | 30);
                                                            int maximumFlingVelocity9 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                            Object[] objArr1118 = new Object[1];
                                                            a(i6211, i6213, (char) (((maximumFlingVelocity9 | 41563) << 1) - (maximumFlingVelocity9 ^ 41563)), objArr1118);
                                                            int i6214 = -Color.rgb(0, 0, 0);
                                                            Object[] objArr1119 = new Object[1];
                                                            a((i6214 ^ (-16775934)) + ((i6214 & (-16775934)) << 1), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14063 - (~(-(Process.myTid() >> 22)))), objArr1119);
                                                            String str515 = (String) objArr1119[0];
                                                            int i6215 = TuitionPaymentFragmentbindingInflater1;
                                                            int i6216 = ((i6215 | 33) << 1) - (i6215 ^ 33);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6216 % 128;
                                                            int i6217 = i6216 % 2;
                                                            String[] strArr25 = {(String) objArr1118[0], str515};
                                                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1293;
                                                            int i6218 = 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            int scrollBarSize4 = ViewConfiguration.getScrollBarSize() >> 8;
                                                            Object[] objArr1210 = new Object[1];
                                                            a(maximumDrawingCacheSize2, i6218, (char) ((scrollBarSize4 & 16502) + (scrollBarSize4 | 16502)), objArr1210);
                                                            String str516 = (String) objArr1210[0];
                                                            int packedPositionType4 = 1312 - ExpandableListView.getPackedPositionType(0L);
                                                            int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 6;
                                                            int i6219 = -Color.green(0);
                                                            Object[] objArr1211 = new Object[1];
                                                            a(packedPositionType4, bitsPerPixel3, (char) (((i6219 | 56418) << 1) - (i6219 ^ 56418)), objArr1211);
                                                            int i6310 = 1316 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                                            int i6311 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            int i6312 = (i6311 ^ 20) + ((i6311 & 20) << 1);
                                                            int i6313 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                            Object[] objArr1212 = new Object[1];
                                                            a(i6310, i6312, (char) ((i6313 & 41835) + (i6313 | 41835)), objArr1212);
                                                            int threadPriority5 = Process.getThreadPriority(0);
                                                            int i6314 = -(-((((threadPriority5 | 20) << 1) - (threadPriority5 ^ 20)) >> 6));
                                                            int i6315 = ((i6314 | 1336) << 1) - (i6314 ^ 1336);
                                                            int i6316 = -(-TextUtils.getCapsMode("", 0, 0));
                                                            int i6317 = (i6316 ^ 16) + ((i6316 & 16) << 1);
                                                            int keyRepeatDelay9 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                            int i6318 = (keyRepeatDelay9 * (-1335)) - 36049349;
                                                            int i6319 = (keyRepeatDelay9 ^ i6) | (keyRepeatDelay9 & i6);
                                                            int i6410 = -(-(((~i6319) | (-54048)) * (-668)));
                                                            int i6411 = ((i6318 | i6410) << 1) - (i6318 ^ i6410);
                                                            int i6412 = ~((-54048) | i6);
                                                            int i6413 = ((keyRepeatDelay9 & i6412) | (keyRepeatDelay9 ^ i6412)) * 1336;
                                                            int i6414 = (i6411 & i6413) + (i6413 | i6411);
                                                            int i6415 = -(-(((i6319 ^ (-54048)) | (i6319 & (-54048))) * 668));
                                                            char c18 = (char) ((i6414 ^ i6415) + ((i6415 & i6414) << 1));
                                                            Object[] objArr1213 = new Object[1];
                                                            a(i6315, i6317, c18, objArr1213);
                                                            int i6416 = 1351 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
                                                            int i6417 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                            int i6418 = ((i6417 | 19) << 1) - (i6417 ^ 19);
                                                            int i6419 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            Object[] objArr1214 = new Object[1];
                                                            a(i6416, i6418, (char) (((i6419 | 8108) << 1) - (i6419 ^ 8108)), objArr1214);
                                                            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1371;
                                                            int i6510 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                            int i6511 = (i6510 & 19) + (i6510 | 19);
                                                            int i6512 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            Object[] objArr1215 = new Object[1];
                                                            a(windowTouchSlop3, i6511, (char) ((i6512 ^ 48916) + ((i6512 & 48916) << 1)), objArr1215);
                                                            int i6513 = -Color.red(0);
                                                            int i6514 = (i6513 & 1390) + (i6513 | 1390);
                                                            int scrollBarFadeDuration3 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                            Object[] objArr1216 = new Object[1];
                                                            a(i6514, ((scrollBarFadeDuration3 | 23) << 1) - (scrollBarFadeDuration3 ^ 23), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr1216);
                                                            int i6515 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                            int i6516 = ((i6515 | 1414) << 1) - (i6515 ^ 1414);
                                                            int i6517 = -TextUtils.getTrimmedLength("");
                                                            int i6518 = ((i6517 | 21) << 1) - (i6517 ^ 21);
                                                            int threadPriority6 = Process.getThreadPriority(0);
                                                            char c19 = (char) (45738 - (~(-(((threadPriority6 & 20) + (threadPriority6 | 20)) >> 6))));
                                                            Object[] objArr1217 = new Object[1];
                                                            a(i6516, i6518, c19, objArr1217);
                                                            int i6519 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            int i6610 = -Color.rgb(0, 0, 0);
                                                            Object[] objArr1218 = new Object[1];
                                                            a((i6519 & 1434) + (i6519 | 1434), (i6610 & (-16777192)) + (i6610 | (-16777192)), (char) View.resolveSizeAndState(0, 0, 0), objArr1218);
                                                            String str517 = str;
                                                            int i6611 = -TextUtils.indexOf("", "");
                                                            int i6612 = (i6611 ^ 1458) + ((i6611 & 1458) << 1);
                                                            int i6613 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i6614 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            Object[] objArr1219 = new Object[1];
                                                            a(i6612, i6613, (char) ((i6614 & 1) + (i6614 | 1)), objArr1219);
                                                            int i6615 = 1485 - (~Color.red(0));
                                                            int i6616 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            int i6617 = (i6616 ^ 26) + ((i6616 & 26) << 1);
                                                            int i6618 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            Object[] objArr1310 = new Object[1];
                                                            a(i6615, i6617, (char) ((i6618 ^ (-1)) + (i6618 << 1)), objArr1310);
                                                            int i6619 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                            int i6710 = (i6619 & 1513) + (i6619 | 1513);
                                                            int i6711 = -(-TextUtils.indexOf("", "", 0));
                                                            Object[] objArr1311 = new Object[1];
                                                            a(i6710, (i6711 ^ 31) + ((i6711 & 31) << 1), (char) (6270 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr1311);
                                                            int i6712 = -(-ExpandableListView.getPackedPositionChild(0L));
                                                            int i6713 = (i6712 ^ 1545) + ((i6712 & 1545) << 1);
                                                            int i6714 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            int i6715 = (i6714 ^ 28) + ((i6714 & 28) << 1);
                                                            int i6716 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                            Object[] objArr1312 = new Object[1];
                                                            a(i6713, i6715, (char) ((i6716 & 13095) + (i6716 | 13095)), objArr1312);
                                                            int i6717 = 1570 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                            int i6718 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            Object[] objArr1313 = new Object[1];
                                                            a(i6717, (i6718 ^ 33) + ((i6718 & 33) << 1), (char) ((-2) - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr1313);
                                                            strArr5 = new String[][]{new String[]{str210, str211, str212, (String) objArr812[0]}, new String[]{str213, str310, str311, str312, (String) objArr817[0]}, new String[]{str313, str314, str, str315, str316, str317}, new String[]{str318, str319, str410, (String) objArr916[0]}, new String[]{str411, str412, (String) objArr919[0]}, new String[]{str413, (String) objArr1011[0]}, new String[]{str414, (String) objArr1013[0]}, new String[]{str415, str416, str417, str418, str419, (String) objArr1019[0]}, new String[]{str59, str510, str511, str512, str513, (String) objArr1115[0], str}, new String[]{str514, (String) objArr1117[0]}, strArr25, new String[]{str516, (String) objArr1211[0]}, new String[]{(String) objArr1212[0]}, new String[]{(String) objArr1213[0]}, new String[]{(String) objArr1214[0]}, new String[]{(String) objArr1215[0]}, new String[]{(String) objArr1216[0]}, new String[]{(String) objArr1217[0]}, new String[]{(String) objArr1218[0], str517}, new String[]{(String) objArr1219[0], str517}, new String[]{(String) objArr1310[0], str517}, new String[]{(String) objArr1311[0], str517}, new String[]{(String) objArr1312[0], str517}, new String[]{(String) objArr1313[0], str517}};
                                                            int i6719 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                            int i6810 = ((i6719 | 1603) << 1) - (i6719 ^ 1603);
                                                            int i6811 = -(Process.myPid() >> 22);
                                                            int i6812 = -KeyEvent.normalizeMetaState(0);
                                                            Object[] objArr1314 = new Object[1];
                                                            a(i6810, ((i6811 | 1) << 1) - (i6811 ^ 1), (char) ((i6812 & 62047) + (i6812 | 62047)), objArr1314);
                                                            sb = new StringBuilder((String) objArr1314[0]);
                                                            i59 = i6;
                                                            i60 = 0;
                                                            i61 = 0;
                                                            while (i60 < 24) {
                                                                i63 = TuitionPaymentFragmentbindingInflater1 + 51;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i63 % 128;
                                                                if (i63 % 2 != 0) {
                                                                    String[] strArr26 = strArr5[i60];
                                                                    Object[] objArr1315 = {strArr26[1]};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                        char cNormalizeMetaState2 = (char) (33602 - KeyEvent.normalizeMetaState(0));
                                                                        int iResolveSizeAndState4 = 3085 - View.resolveSizeAndState(0, 0, 0);
                                                                        int i6813 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                                                                        byte b38 = (byte) 0;
                                                                        byte b39 = (byte) (b38 + 5);
                                                                        Object[] objArr1316 = new Object[1];
                                                                        c(b38, b39, (byte) (b39 - 5), objArr1316);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState2, iResolveSizeAndState4, i6813, 1411172903, false, (String) objArr1316[0], new Class[]{String.class});
                                                                    }
                                                                    str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr1315);
                                                                    strArr7 = strArr26;
                                                                    strArr5 = strArr5;
                                                                } else {
                                                                    i58 = i58;
                                                                    strArr7 = strArr5[i60];
                                                                    Object[] objArr1317 = {strArr7[0]};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                        char cAlpha2 = (char) (33602 - Color.alpha(0));
                                                                        int maximumFlingVelocity10 = 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                        int iAxisFromString5 = 25 - MotionEvent.axisFromString("");
                                                                        byte b310 = (byte) 0;
                                                                        byte b311 = (byte) (b310 + 5);
                                                                        Object[] objArr1318 = new Object[1];
                                                                        c(b310, b311, (byte) (b311 - 5), objArr1318);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha2, maximumFlingVelocity10, iAxisFromString5, 1411172903, false, (String) objArr1318[0], new Class[]{String.class});
                                                                    }
                                                                    str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr1317);
                                                                }
                                                                String[] strArr27 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                                                                if (str5 == null) {
                                                                }
                                                                i60 = (i60 | 1) + (i60 & 1);
                                                                i58 = i58;
                                                                strArr5 = strArr5;
                                                            }
                                                            int i6814 = i58;
                                                            Object[] objArr1319 = new Object[1];
                                                            a(1606 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), -TextUtils.indexOf((CharSequence) "", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1319);
                                                            sb.append((String) objArr1319[0]);
                                                            objArr2 = new Object[2];
                                                            if (i61 > 2) {
                                                                objArr2[0] = new int[1];
                                                                String[] strArr28 = {sb.toString()};
                                                                ((int[]) objArr2[0])[0] = i59;
                                                                objArr2[1] = strArr28;
                                                            } else {
                                                                objArr2[0] = new int[]{i6};
                                                                objArr2[1] = new String[0];
                                                            }
                                                            int i6815 = ((int[]) objArr2[0])[0];
                                                            int i6816 = (~(i6 & i6814)) & (i6 | i6814);
                                                            int i6817 = -i6816;
                                                            int i6818 = ((i6816 & i6817) | (i6816 ^ i6817)) >> 31;
                                                            int i6819 = i6815 & (~i6818);
                                                            int i691 = i6814 & i6818;
                                                            strArr6 = (String[]) objArr2[1];
                                                            i58 = (i6819 & i691) | (i6819 ^ i691);
                                                            i62 = 0;
                                                        }
                                                        int i692 = -View.combineMeasuredStates(i62, i62);
                                                        int i693 = -Gravity.getAbsoluteGravity(i62, i62);
                                                        Object[] objArr140 = new Object[1];
                                                        a((i692 & 889) + (i692 | 889), ((i693 | 16) << 1) - (i693 ^ 16), (char) (16098 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr140);
                                                        Object[] objArr141 = {(String) objArr140[0]};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 33602);
                                                            int gidForName3 = 3084 - Process.getGidForName("");
                                                            int size2 = 26 - View.MeasureSpec.getSize(0);
                                                            byte b40 = (byte) 0;
                                                            byte b41 = (byte) (b40 + 5);
                                                            Object[] objArr142 = new Object[1];
                                                            c(b40, b41, (byte) (b41 - 5), objArr142);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(pressedStateDuration, gidForName3, size2, 1411172903, false, (String) objArr142[0], new Class[]{String.class});
                                                        }
                                                        objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr141);
                                                        if (objInvoke2 == null) {
                                                            i70 = 0;
                                                        } else {
                                                            Object[] objArr143 = {objInvoke2, 42};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                char c20 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 3394;
                                                                int i694 = 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                byte b42 = (byte) 0;
                                                                byte b43 = (byte) (b42 + 5);
                                                                Object[] objArr144 = new Object[1];
                                                                c(b42, b43, (byte) (b43 - 5), objArr144);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c20, modifierMetaStateMask, i694, 1203525406, false, (String) objArr144[0], new Class[]{String.class, Integer.TYPE});
                                                            }
                                                            long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr143)).longValue();
                                                            long j78 = 159092201;
                                                            long j79 = j78 ^ j;
                                                            long j80 = (((long) 303) * j78) + (j4 * jLongValue12) + (((long) (-302)) * ((((j79 | j6) | jLongValue12) ^ j) | (((j78 | jLongValue12) | j5) ^ j))) + (((long) (-604)) * (((j79 | jLongValue12) | j5) ^ j)) + ((((jLongValue12 | j5) ^ j) | ((j78 | (jLongValue12 ^ j)) ^ j)) * j3) + ((long) (-161162078));
                                                            int i695 = ((int) (j80 >> 32)) & (((38375124 + (((-88220177) | i6) * (-381))) + (((~((-399237682) | i54)) | 2059261421) * 381)) - 747851312);
                                                            int i696 = (int) j80;
                                                            int i697 = ~(673038927 | i54);
                                                            int i698 = ~(764187482 | i6);
                                                            int i699 = i696 & (334239082 + ((i697 | i698) * 1150) + (((~((-764187483) | i54)) | i698) * (-575)) + (((~(673038927 | i6)) | (~((-673038928) | i54))) * 575));
                                                            i70 = (i695 & i699) | (i695 ^ i699);
                                                        }
                                                        if (i70 != 1986687685) {
                                                            i89 = 19;
                                                            int i700 = -(-Color.alpha(0));
                                                            int i701 = ((i700 | 1608) << 1) - (i700 ^ 1608);
                                                            int i702 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                                                            int i703 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                            Object[] objArr145 = new Object[1];
                                                            a(i701, i702, (char) ((i703 ^ 44735) + ((i703 & 44735) << 1)), objArr145);
                                                            int i704 = -(-View.MeasureSpec.getMode(0));
                                                            int i705 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                            Object[] objArr146 = new Object[1];
                                                            a(((i704 | 1622) << 1) - (i704 ^ 1622), (i705 ^ 25) + ((i705 & 25) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr146);
                                                            int i706 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                            int iB17 = com.google.android.gms.internal.measurement.zzdm.b();
                                                            int i707 = i706 * 471;
                                                            int i708 = ((i707 | 776208) << 1) - (i707 ^ 776208);
                                                            int i709 = ((i706 ^ 1648) | (i706 & 1648)) * (-470);
                                                            int i710 = ((i708 | i709) << 1) - (i709 ^ i708);
                                                            int i711 = ~i706;
                                                            int i712 = ~((i711 & (-1649)) | (i711 ^ (-1649)));
                                                            int i713 = ~(((-1649) & iB17) | ((-1649) ^ iB17));
                                                            int i714 = (i712 & i713) | (i712 ^ i713);
                                                            int i715 = ~iB17;
                                                            int i716 = (i715 & i706) | (i715 ^ i706);
                                                            int i717 = i710 + ((i714 | (~(i716 | 1648))) * (-470));
                                                            int i718 = i706 | (-1649);
                                                            int i719 = ((~((i718 & iB17) | (i718 ^ iB17))) | (~((i716 ^ 1648) | (i716 & 1648)))) * 470;
                                                            int i720 = (i717 ^ i719) + ((i719 & i717) << 1);
                                                            int i721 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                                                            int i722 = -View.MeasureSpec.getMode(0);
                                                            Object[] objArr147 = new Object[1];
                                                            a(i720, ((i721 | 17) << 1) - (i721 ^ 17), (char) (((i722 | 15464) << 1) - (i722 ^ 15464)), objArr147);
                                                            int i723 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i724 = (i723 & 1666) + (i723 | 1666);
                                                            int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                            Object[] objArr148 = new Object[1];
                                                            a(i724, (maximumDrawingCacheSize3 & 17) + (maximumDrawingCacheSize3 | 17), (char) (52498 - (~(-ExpandableListView.getPackedPositionGroup(0L)))), objArr148);
                                                            int i725 = -Process.getGidForName("");
                                                            int i726 = (i725 & 1681) + (i725 | 1681);
                                                            int i727 = -TextUtils.getCapsMode("", 0, 0);
                                                            int i728 = ((i727 | 15) << 1) - (i727 ^ 15);
                                                            byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                                                            int i729 = modifierMetaStateMask2 * (-1965);
                                                            int i730 = (i729 & 984) + (i729 | 984);
                                                            int i731 = -(-((modifierMetaStateMask2 | (-2)) * 983));
                                                            int i732 = (i730 & i731) + (i731 | i730);
                                                            int i733 = ~modifierMetaStateMask2;
                                                            int i734 = ~(((-2) & i54) | ((-2) ^ i54));
                                                            int i735 = ((i734 & i733) | (i733 ^ i734)) * (-983);
                                                            int i736 = ~modifierMetaStateMask2;
                                                            int i737 = ~((i736 & i12) | (i736 ^ i12));
                                                            int i738 = ~((i733 & 1) | (i733 ^ 1));
                                                            char c21 = (char) ((((i732 & i735) + (i735 | i732)) - (~(((i737 & i738) | (i737 ^ i738)) * 983))) - 1);
                                                            Object[] objArr149 = new Object[1];
                                                            a(i726, i728, c21, objArr149);
                                                            int jumpTapTimeout = 1697 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            int i739 = -(-TextUtils.lastIndexOf("", '0', 0));
                                                            Object[] objArr150 = new Object[1];
                                                            a(jumpTapTimeout, ((i739 | 38) << 1) - (i739 ^ 38), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31641), objArr150);
                                                            Object[] objArr151 = new Object[1];
                                                            a(1733 - (~(-(-KeyEvent.normalizeMetaState(0)))), 11 - TextUtils.lastIndexOf("", '0'), (char) ((-2) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr151);
                                                            int i740 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                            int i741 = ((i740 | 1746) << 1) - (i740 ^ 1746);
                                                            int i742 = -View.resolveSize(0, 0);
                                                            int i743 = (i742 ^ 13) + ((i742 & 13) << 1);
                                                            int i744 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                            Object[] objArr152 = new Object[1];
                                                            a(i741, i743, (char) ((i744 ^ 43626) + ((i744 & 43626) << 1)), objArr152);
                                                            int i745 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                            Object[] objArr153 = new Object[1];
                                                            a(((i745 | 1759) << 1) - (i745 ^ 1759), Color.red(0) + 22, (char) (Process.getGidForName("") + 46850), objArr153);
                                                            int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0');
                                                            Object[] objArr154 = new Object[1];
                                                            a(((iIndexOf8 | 1782) << 1) - (iIndexOf8 ^ 1782), 31 - Color.red(0), (char) (16415 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr154);
                                                            int i746 = 1810 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                                                            int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                            Object[] objArr155 = new Object[1];
                                                            a(i746, (iIndexOf9 & 13) + (iIndexOf9 | 13), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr155);
                                                            int i747 = 1823 - (~(-Color.alpha(0)));
                                                            int i748 = -(Process.myTid() >> 22);
                                                            Object[] objArr156 = new Object[1];
                                                            a(i747, (i748 ^ 12) + ((i748 & 12) << 1), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0, 0)))), objArr156);
                                                            int i749 = -(-View.getDefaultSize(0, 0));
                                                            int i750 = ((i749 | 1836) << 1) - (i749 ^ 1836);
                                                            int i751 = -KeyEvent.keyCodeFromString("");
                                                            Object[] objArr157 = new Object[1];
                                                            a(i750, (i751 & 12) + (i751 | 12), (char) (48531 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr157);
                                                            int i752 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 - (-1);
                                                            TuitionPaymentFragmentbindingInflater1 = i752 % 128;
                                                            int i753 = i752 % 2;
                                                            int i754 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                            int i755 = -(-Color.alpha(0));
                                                            Object[] objArr158 = new Object[1];
                                                            a((i754 ^ 1848) + ((i754 & 1848) << 1), (i755 & 12) + (i755 | 12), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr158);
                                                            int i756 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                            int i757 = (i756 & 1860) + (i756 | 1860);
                                                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 12;
                                                            int i758 = -(-TextUtils.getTrimmedLength(""));
                                                            Object[] objArr159 = new Object[1];
                                                            a(i757, offsetBefore2, (char) ((i758 ^ 33292) + ((i758 & 33292) << 1)), objArr159);
                                                            int scrollBarSize5 = 1872 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                            int iIndexOf10 = TextUtils.indexOf("", "");
                                                            Object[] objArr160 = new Object[1];
                                                            a(scrollBarSize5, ((iIndexOf10 | 14) << 1) - (iIndexOf10 ^ 14), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr160);
                                                            int i759 = 1885 - (~(ViewConfiguration.getTouchSlop() >> 8));
                                                            int i760 = -(-KeyEvent.normalizeMetaState(0));
                                                            Object[] objArr161 = new Object[1];
                                                            a(i759, (i760 & 12) + (i760 | 12), (char) (ImageFormat.getBitsPerPixel(0) + 63669), objArr161);
                                                            int i761 = -Color.blue(0);
                                                            int i762 = (i761 ^ 1898) + ((i761 & 1898) << 1);
                                                            int i763 = (-25) - (~AndroidCharacter.getMirror('0'));
                                                            int i764 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            Object[] objArr162 = new Object[1];
                                                            a(i762, i763, (char) (((i764 | 20446) << 1) - (i764 ^ 20446)), objArr162);
                                                            Object[] objArr163 = new Object[1];
                                                            a(1922 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, (char) ExpandableListView.getPackedPositionType(0L), objArr163);
                                                            strArr14 = new String[]{(String) objArr145[0], (String) objArr146[0], (String) objArr147[0], (String) objArr148[0], (String) objArr149[0], (String) objArr150[0], (String) objArr151[0], (String) objArr152[0], (String) objArr153[0], (String) objArr154[0], (String) objArr155[0], (String) objArr156[0], (String) objArr157[0], (String) objArr158[0], (String) objArr159[0], (String) objArr160[0], (String) objArr161[0], (String) objArr162[0], (String) objArr163[0]};
                                                            i90 = 0;
                                                            while (true) {
                                                                if (i90 < i89) {
                                                                    i91 = -1;
                                                                    break;
                                                                }
                                                                str8 = strArr14[i90];
                                                                Object[] objArr164 = {str8};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                    int i765 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 994;
                                                                    int iResolveSizeAndState5 = View.resolveSizeAndState(0, 0, 0) + 8;
                                                                    byte b44 = (byte) 0;
                                                                    byte b45 = b44;
                                                                    Object[] objArr165 = new Object[1];
                                                                    c(b44, b45, b45, objArr165);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(longPressTimeout, i765, iResolveSizeAndState5, -545305915, false, (String) objArr165[0], new Class[]{String.class});
                                                                }
                                                                long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr164)).longValue();
                                                                long j81 = -817352035;
                                                                strArr15 = strArr14;
                                                                long j82 = (((long) (-523)) * j81) + (((long) 263) * jLongValue13);
                                                                long j83 = 262;
                                                                long j84 = ((j81 ^ j) | jLongValue13) ^ j;
                                                                long j85 = jLongValue13 ^ j;
                                                                long j86 = (j81 | j85) ^ j;
                                                                i92 = i90;
                                                                long j87 = j82 + ((j84 | j86 | ((j85 | j5) ^ j)) * j83) + (((long) (-786)) * j86) + (j83 * (((j85 | j6) ^ j) | j84 | j86)) + ((long) 1437811319);
                                                                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                                                int i766 = ~iMaxMemory2;
                                                                i93 = ((int) (j87 >> 32)) & ((-2055567968) + (((~(1585316151 | i766)) | (-1272424734)) * 226) + (((~(i766 | (-25274377))) | (~(1272424733 | iMaxMemory2)) | 338165794) * (-113)) + ((~(iMaxMemory2 | 1585316151)) * 113));
                                                                i94 = ((int) j87) & ((-1687905466) + (((~(1572609481 | i54)) | 135383071) * (-90)) + (((~(1572609481 | i6)) | 1437341120) * (-45)) + ((1572609481 | (~((-135383072) | i6)) | (~(i54 | 135383071))) * 45));
                                                                if (((i93 & i94) | (i93 ^ i94)) != 0) {
                                                                    int i767 = TuitionPaymentFragmentbindingInflater1 + 89;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i767 % 128;
                                                                    int i768 = i767 % 2;
                                                                } else {
                                                                    objArr3 = new Object[1];
                                                                    a(1871 - (~(-(-(Process.myTid() >> 22)))), 13 - (~(-Drawable.resolveOpacity(0, 0))), (char) ((-2) - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr3);
                                                                    if (!str8.equals((String) objArr3[0])) {
                                                                        Object[] objArr166 = {str8};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                                                            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                                                            int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 994;
                                                                            int i769 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7;
                                                                            byte b46 = (byte) 0;
                                                                            Object[] objArr167 = new Object[1];
                                                                            c(b46, (byte) (b46 | 6), b46, objArr167);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild2, bitsPerPixel4, i769, 349342683, false, (String) objArr167[0], new Class[]{String.class});
                                                                        }
                                                                        long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr166)).longValue();
                                                                        long j88 = 220991009;
                                                                        long j89 = -560;
                                                                        long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                                        long j90 = jElapsedRealtime2 ^ j;
                                                                        long j91 = (((long) (-559)) * j88) + (((long) 561) * jLongValue14) + (((j90 | j88) ^ j) * j89) + (j89 * ((((jLongValue14 ^ j) | j88) | jElapsedRealtime2) ^ j)) + (((long) 560) * (((j90 | jLongValue14) ^ j) | (((j88 ^ j) | jLongValue14) ^ j))) + ((long) (-1068069614));
                                                                        i95 = ((int) (j91 >> 32)) & (((1754752898 + (((~((-212446470) | i54)) | 1649672880) * (-828))) + (((-212446470) | i54) * (-828))) - 187982804);
                                                                        i96 = ((int) j91) & (492788852 + ((~((-143753282) | i54)) * 433) + (((~((-1902256019) | i6)) | (-955484868)) * (-433)) + (((~((-955484868) | i6)) | (-2046009300)) * 433));
                                                                        if (((i95 & i96) | (i95 ^ i96)) != 0) {
                                                                            int i770 = TuitionPaymentFragmentbindingInflater1;
                                                                            i97 = (i770 ^ 7) + ((i770 & 7) << 1);
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i97 % 128;
                                                                            if (i97 % 2 != 0) {
                                                                                Object obj2 = null;
                                                                                obj2.hashCode();
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    }
                                                                    i90 = i92 + 1;
                                                                    strArr14 = strArr15;
                                                                    i89 = 19;
                                                                }
                                                                i91 = i92;
                                                                break;
                                                            }
                                                            int i771 = (i91 ^ 130) + ((i91 & 130) << 1);
                                                            int i772 = (i771 & i54) | ((~i771) & i6);
                                                            int i773 = ~i91;
                                                            int i774 = -i773;
                                                            int i775 = ((i773 & i774) | (i773 ^ i774)) >> 31;
                                                            int i776 = ~i775;
                                                            int i777 = TuitionPaymentFragmentbindingInflater1;
                                                            int i778 = (i777 & 109) + (i777 | 109);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i778 % 128;
                                                            int i779 = i778 % 2;
                                                            int i780 = i776 & i6;
                                                            int i781 = i772 & i775;
                                                            int i782 = (i781 & i780) | (i780 ^ i781);
                                                            int i783 = i6 ^ i58;
                                                            int i784 = -i783;
                                                            int i785 = ((i783 & i784) | (i783 ^ i784)) >> 31;
                                                            int i786 = i782 & (~i785);
                                                            int i787 = i58 & i785;
                                                            i58 = (i787 & i786) | (i786 ^ i787);
                                                        }
                                                        int iGreen3 = Color.green(0) + 1950;
                                                        int i788 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        Object[] objArr168 = new Object[1];
                                                        a(iGreen3, ((i788 | 14) << 1) - (i788 ^ 14), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr168);
                                                        String str60 = (String) objArr168[0];
                                                        int i789 = 1964 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                        int i790 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                                        Object[] objArr169 = new Object[1];
                                                        a(i789, (i790 & 5) + (i790 | 5), (char) ExpandableListView.getPackedPositionGroup(0L), objArr169);
                                                        Object[] objArr170 = new Object[1];
                                                        a(1968 - TextUtils.getOffsetBefore("", 0), 14 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) (28352 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0))))), objArr170);
                                                        String str61 = (String) objArr170[0];
                                                        int i791 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                        int i792 = ((i791 | 1983) << 1) - (i791 ^ 1983);
                                                        int i793 = 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        int threadPriority7 = Process.getThreadPriority(0);
                                                        Object[] objArr171 = new Object[1];
                                                        a(i792, i793, (char) (((threadPriority7 ^ 20) + ((threadPriority7 & 20) << 1)) >> 6), objArr171);
                                                        String str62 = (String) objArr171[0];
                                                        int i794 = -(-Color.blue(0));
                                                        int i795 = (i794 & 2002) + (i794 | 2002);
                                                        int i796 = -(-KeyEvent.normalizeMetaState(0));
                                                        Object[] objArr172 = new Object[1];
                                                        a(i795, ((i796 | 14) << 1) - (i796 ^ 14), (char) ExpandableListView.getPackedPositionGroup(0L), objArr172);
                                                        int i797 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        int i798 = ((i797 | 2016) << 1) - (i797 ^ 2016);
                                                        int i799 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                        Object[] objArr173 = new Object[1];
                                                        a(i798, ((i799 | 22) << 1) - (i799 ^ 22), (char) (45322 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr173);
                                                        String str63 = (String) objArr173[0];
                                                        int iLastIndexOf7 = TextUtils.lastIndexOf("", '0') + 2038;
                                                        int i800 = -Color.red(0);
                                                        Object[] objArr174 = new Object[1];
                                                        a(iLastIndexOf7, ((i800 | 10) << 1) - (i800 ^ 10), (char) (10184 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr174);
                                                        Object[] objArr175 = new Object[1];
                                                        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2046, 10 - (~KeyEvent.getDeadChar(0, 0)), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr175);
                                                        int i801 = 586 - (~(-(-ExpandableListView.getPackedPositionType(0L))));
                                                        int deadChar = KeyEvent.getDeadChar(0, 0);
                                                        int i802 = ((deadChar | 6) << 1) - (6 ^ deadChar);
                                                        int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                                                        int i803 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                                                        TuitionPaymentFragmentbindingInflater1 = i803 % 128;
                                                        int i804 = i803 % 2;
                                                        Object[] objArr176 = new Object[1];
                                                        a(i801, i802, (char) (40768 - packedPositionGroup3), objArr176);
                                                        String[] strArr29 = {(String) objArr175[0], (String) objArr176[0]};
                                                        int iLastIndexOf8 = TextUtils.lastIndexOf("", '0', 0, 0);
                                                        int i805 = (iLastIndexOf8 & 2059) + (iLastIndexOf8 | 2059);
                                                        int i806 = -KeyEvent.getDeadChar(0, 0);
                                                        int i807 = (i806 & 28) + (i806 | 28);
                                                        int i808 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                        Object[] objArr177 = new Object[1];
                                                        a(i805, i807, (char) ((i808 & 15453) + (i808 | 15453)), objArr177);
                                                        String str64 = (String) objArr177[0];
                                                        int i809 = 2036 - (~(-(Process.myTid() >> 22)));
                                                        int bitsPerPixel5 = 9 - ImageFormat.getBitsPerPixel(0);
                                                        int i810 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        Object[] objArr178 = new Object[1];
                                                        a(i809, bitsPerPixel5, (char) (((i810 | 10184) << 1) - (i810 ^ 10184)), objArr178);
                                                        c2 = 0;
                                                        strArr8 = new String[][]{new String[]{str60, (String) objArr169[0]}, new String[]{str61, str62, (String) objArr172[0]}, new String[]{str63, (String) objArr174[0]}, strArr29, new String[]{str64, (String) objArr178[0]}};
                                                        i71 = 0;
                                                        i72 = 5;
                                                        i73 = -1;
                                                        loop7: while (true) {
                                                            if (i71 < i72) {
                                                                strArr9 = strArr6;
                                                                i74 = i6;
                                                                break;
                                                            }
                                                            String[] strArr30 = strArr8[i71];
                                                            str6 = strArr30[c2];
                                                            strArr10 = (String[]) Arrays.copyOfRange(strArr30, 1, strArr30.length);
                                                            length3 = strArr10.length;
                                                            i78 = 0;
                                                            while (true) {
                                                                if (i78 < length3) {
                                                                    i73 = (i73 & (-20)) + (i73 | (-20)) + 21;
                                                                    bytes3 = strArr10[i78].getBytes();
                                                                    length4 = bytes3.length;
                                                                    if (length4 == 0) {
                                                                        strArr9 = strArr6;
                                                                    } else {
                                                                        try {
                                                                            bufferedInputStream9 = new BufferedInputStream(new FileInputStream(str6));
                                                                            i80 = 4096;
                                                                            strArr11 = strArr8;
                                                                            try {
                                                                                try {
                                                                                    bArr4 = new byte[4096];
                                                                                    strArr12 = strArr10;
                                                                                    str7 = str6;
                                                                                    i79 = length3;
                                                                                    i81 = 0;
                                                                                    try {
                                                                                        while (true) {
                                                                                            try {
                                                                                                i82 = bufferedInputStream9.read(bArr4, 0, i80);
                                                                                                if (i82 > 0) {
                                                                                                    break;
                                                                                                }
                                                                                                i83 = 0;
                                                                                                while (i81 < length4) {
                                                                                                    byte[] bArr6 = bArr4;
                                                                                                    if (bArr4[i83] == bytes3[i81]) {
                                                                                                        int i811 = TuitionPaymentFragmentbindingInflater1 + 103;
                                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i811 % 128;
                                                                                                        int i812 = i811 % 2;
                                                                                                        i81 = (i81 ^ (-97)) + ((i81 & (-97)) << 1) + 98;
                                                                                                    } else {
                                                                                                        if (i81 != 0) {
                                                                                                            i84 = (i81 ^ (-1)) + (i81 << 1);
                                                                                                            while (true) {
                                                                                                                if (i84 > 0) {
                                                                                                                    i85 = i82;
                                                                                                                    strArr13 = strArr6;
                                                                                                                    i81 = 0;
                                                                                                                    break;
                                                                                                                }
                                                                                                                i86 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i86 < i84) {
                                                                                                                        i85 = i82;
                                                                                                                        strArr13 = strArr6;
                                                                                                                        i81 = i84;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    i87 = i82;
                                                                                                                    strArr9 = strArr6;
                                                                                                                    int i813 = -i84;
                                                                                                                    i88 = ((i81 | i813) << 1) - (i813 ^ i81);
                                                                                                                    try {
                                                                                                                        if (bytes3[i86] != bytes3[(i88 & i86) + (i88 | i86)]) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        int i814 = (i86 ^ (-29)) + ((i86 & (-29)) << 1);
                                                                                                                        i86 = (i814 & 30) + (i814 | 30);
                                                                                                                        i82 = i87;
                                                                                                                        strArr6 = strArr9;
                                                                                                                    } catch (IOException unused13) {
                                                                                                                    }
                                                                                                                }
                                                                                                                i84 = (-2) - (~i84);
                                                                                                                i82 = i87;
                                                                                                                strArr6 = strArr9;
                                                                                                            }
                                                                                                        }
                                                                                                        bArr4 = bArr6;
                                                                                                        i82 = i85;
                                                                                                        strArr6 = strArr13;
                                                                                                    }
                                                                                                    i85 = i82;
                                                                                                    strArr13 = strArr6;
                                                                                                    i83 = (i83 & 1) + (i83 | 1);
                                                                                                    bArr4 = bArr6;
                                                                                                    i82 = i85;
                                                                                                    strArr6 = strArr13;
                                                                                                }
                                                                                                bArr4 = bArr4;
                                                                                                strArr6 = strArr6;
                                                                                                i80 = 4096;
                                                                                            } catch (IOException unused14) {
                                                                                                strArr9 = strArr6;
                                                                                            }
                                                                                            bufferedInputStream8 = bufferedInputStream9;
                                                                                            if (bufferedInputStream8 != null) {
                                                                                                try {
                                                                                                    bufferedInputStream8.close();
                                                                                                } catch (IOException unused15) {
                                                                                                }
                                                                                            }
                                                                                            int i815 = ((i78 | (-38)) << 1) - (i78 ^ (-38));
                                                                                            i78 = ((i815 | 39) << 1) - (i815 ^ 39);
                                                                                            strArr10 = strArr12;
                                                                                            strArr8 = strArr11;
                                                                                            str6 = str7;
                                                                                            length3 = i79;
                                                                                            strArr6 = strArr9;
                                                                                        }
                                                                                        bufferedInputStream9.close();
                                                                                    } catch (IOException unused16) {
                                                                                    }
                                                                                    strArr9 = strArr6;
                                                                                    if (i81 == length4) {
                                                                                        int i816 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                                                                                        TuitionPaymentFragmentbindingInflater1 = i816 % 128;
                                                                                        int i817 = i816 % 2;
                                                                                        z3 = true;
                                                                                    } else {
                                                                                        z3 = false;
                                                                                    }
                                                                                    if (z3) {
                                                                                        int i818 = ((i78 | (-38)) << 1) - (i78 ^ (-38));
                                                                                        i78 = ((i818 | 39) << 1) - (i818 ^ 39);
                                                                                        strArr10 = strArr12;
                                                                                        strArr8 = strArr11;
                                                                                        str6 = str7;
                                                                                        length3 = i79;
                                                                                        strArr6 = strArr9;
                                                                                    }
                                                                                } catch (IOException unused17) {
                                                                                    strArr12 = strArr10;
                                                                                    str7 = str6;
                                                                                    i79 = length3;
                                                                                }
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                bufferedInputStream7 = bufferedInputStream9;
                                                                                if (bufferedInputStream7 != null) {
                                                                                    try {
                                                                                        bufferedInputStream7.close();
                                                                                    } catch (IOException unused18) {
                                                                                    }
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (IOException unused19) {
                                                                            strArr11 = strArr8;
                                                                            strArr12 = strArr10;
                                                                            str7 = str6;
                                                                            i79 = length3;
                                                                            strArr9 = strArr6;
                                                                            bufferedInputStream8 = null;
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            bufferedInputStream7 = null;
                                                                        }
                                                                    }
                                                                    int i819 = (i73 ^ 170) + ((i73 & 170) << 1);
                                                                    i74 = (i819 & i54) | ((~i819) & i6);
                                                                    break loop7;
                                                                }
                                                                String[][] strArr31 = strArr8;
                                                                int i820 = (i71 & 117) + (i71 | 117);
                                                                i71 = ((i820 | (-116)) << 1) - (i820 ^ (-116));
                                                                strArr8 = strArr31;
                                                                i72 = 5;
                                                                c2 = 0;
                                                            }
                                                        }
                                                        int i821 = i6 ^ i58;
                                                        int i822 = -i821;
                                                        int i823 = ((i821 & i822) | (i821 ^ i822)) >> 31;
                                                        int i824 = i74 & (~i823);
                                                        int i825 = i58 & i823;
                                                        int i826 = (i824 ^ i825) | (i825 & i824);
                                                        try {
                                                            int i827 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            Object[] objArr179 = new Object[1];
                                                            a(((i827 | 2086) << 1) - (i827 ^ 2086), TextUtils.indexOf((CharSequence) "", '0', 0) + 14, (char) (22786 - (~(ViewConfiguration.getWindowTouchSlop() >> 8))), objArr179);
                                                            String str65 = (String) objArr179[0];
                                                            int i828 = -(Process.myTid() >> 22);
                                                            int i829 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            Object[] objArr180 = new Object[1];
                                                            a((i828 & 2099) + (i828 | 2099), (i829 ^ 8) + ((i829 & 8) << 1), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr180);
                                                            try {
                                                                Object[] objArr181 = {str65, (String) objArr180[0]};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                                                                    int gidForName4 = 2384 - Process.getGidForName("");
                                                                    int mode4 = 32 - View.MeasureSpec.getMode(0);
                                                                    byte b47 = (byte) 0;
                                                                    byte b48 = (byte) (b47 + 5);
                                                                    Object[] objArr182 = new Object[1];
                                                                    c(b47, b48, (byte) (b48 - 5), objArr182);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, gidForName4, mode4, -1207062455, false, (String) objArr182[0], new Class[]{String.class, String.class});
                                                                }
                                                                long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr181)).longValue();
                                                                long j92 = 1493501756;
                                                                long j93 = 371;
                                                                long j94 = (j93 * j92) + (j93 * jLongValue15);
                                                                long j95 = -370;
                                                                long j96 = jLongValue15 ^ j;
                                                                long j97 = j92 ^ j;
                                                                long j98 = (jLongValue15 | j92) ^ j;
                                                                long j99 = j94 + ((((j96 | j6) ^ j) | ((j97 | j5) ^ j)) * j95) + (j95 * (((j97 | j6) ^ j) | ((j96 | j5) ^ j) | j98)) + (((long) 370) * j98) + ((long) 483541572);
                                                                int i830 = (int) (j99 >> 32);
                                                                int iMyTid4 = Process.myTid();
                                                                i76 = i830 & (1191372174 + (((~((-1830098075) | iMyTid4)) | 392871663) * (-964)) + (((~((~iMyTid4) | (-1830098075))) | 83891338) * (-964)));
                                                                int i831 = (~(21657318 | i54)) | (-1432354536);
                                                                int i832 = ~((-4871875) | i6);
                                                                i77 = ((int) j99) & ((((i831 | i832) * (-252)) - 1613316619) + ((i832 | (~((-1410697218) | i54))) * 252));
                                                                if (((i76 & i77) | (i76 ^ i77)) != 0) {
                                                                    i75 = i6 ^ 150;
                                                                } else {
                                                                    i75 = i6;
                                                                }
                                                                int i833 = ((~i826) & i6) | (i826 & i54);
                                                                int i834 = (i833 | (-i833)) >> 31;
                                                                int i835 = i75 & (~i834);
                                                                int i836 = i826 & i834;
                                                                int i837 = (i835 & i836) | (i835 ^ i836);
                                                                int i838 = 2106 - (~(-(-View.combineMeasuredStates(0, 0))));
                                                                int minimumFlingVelocity3 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                                int i839 = (minimumFlingVelocity3 ^ 47) + ((minimumFlingVelocity3 & 47) << 1);
                                                                int i840 = -ExpandableListView.getPackedPositionGroup(0L);
                                                                Object[] objArr183 = new Object[1];
                                                                a(i838, i839, (char) (((i840 | 60657) << 1) - (i840 ^ 60657)), objArr183);
                                                                Object[] objArr184 = {(String) objArr183[0]};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                                    char c22 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                                                    int packedPositionType5 = ExpandableListView.getPackedPositionType(0L) + 993;
                                                                    int iMyTid5 = 8 - (Process.myTid() >> 22);
                                                                    byte b49 = (byte) 0;
                                                                    byte b50 = (byte) (b49 + 5);
                                                                    Object[] objArr185 = new Object[1];
                                                                    c(b49, b50, (byte) (b50 - 5), objArr185);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c22, packedPositionType5, iMyTid5, 410748506, false, (String) objArr185[0], new Class[]{String.class});
                                                                }
                                                                long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr184)).longValue();
                                                                long j100 = 322034871;
                                                                long j101 = ((j100 ^ j) | jLongValue16) ^ j;
                                                                long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                                long j102 = (((long) 71) * j100) + (j32 * jLongValue16) + (((long) (-140)) * (((jLongValue16 | startUptimeMillis3) ^ j) | j101)) + ((((j100 | jLongValue16) | startUptimeMillis3) ^ j) * j25) + (((((jLongValue16 ^ j) | j100) ^ j) | j101 | ((j100 | startUptimeMillis3) ^ j)) * j25) + ((long) (-522953108));
                                                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                                int i841 = ((int) (j102 >> 32)) & (1520786966 + (((~((~elapsedCpuTime2) | (-667774246))) | 42478885) * 529) + (((~(elapsedCpuTime2 | (-667774246))) | (-2105000657)) * 529));
                                                                int i842 = ((int) j102) & ((((~((-226814364) | i6)) * TypedValues.CycleType.TYPE_EASING) - 528465271) + (((~((-226814364) | i54)) | (-1302719904)) * TypedValues.CycleType.TYPE_EASING));
                                                                int i843 = ((i841 & i842) | (i841 ^ i842)) * 263;
                                                                int i844 = i6 ^ i837;
                                                                int i845 = -i844;
                                                                int i846 = ((i844 & i845) | (i844 ^ i845)) >> 31;
                                                                int i847 = (i843 | i6) & (~(i6 & i843)) & (~i846);
                                                                int i848 = i837 & i846;
                                                                i51 = (i848 & i847) | (i847 ^ i848);
                                                                strArr4 = strArr9;
                                                                i55 = 5;
                                                            } catch (Throwable th8) {
                                                                Throwable cause2 = th8.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th8;
                                                            }
                                                        } catch (Exception unused20) {
                                                            i75 = (~(i6 & 151)) & (i6 | 151);
                                                        }
                                                    } else {
                                                        i54 = i200;
                                                        i55 = 5;
                                                        strArr4 = null;
                                                    }
                                                    Object[] objArr186 = new Object[i55];
                                                    objArr186[0] = new int[1];
                                                    objArr186[1] = new int[]{i51};
                                                    objArr186[3] = new int[]{i6};
                                                    int i849 = (i54 & i51) | ((~i51) & i6);
                                                    objArr186[4] = strArr4;
                                                    objArr186[2] = null;
                                                    int i850 = ~((~Process.myTid()) | 328270449);
                                                    int i851 = -(-((((((26214993 | i850) * (-374)) + 1688961585) + ((i850 | 302055456) * 374)) - (~(-(-(((i849 | (-i849)) >> 31) & 16))))) - 1));
                                                    int i852 = (i3 & i851) + (i3 | i851);
                                                    int i853 = i852 << 13;
                                                    int i854 = (i853 | i852) & (~(i852 & i853));
                                                    int i855 = i854 >>> 17;
                                                    int i856 = (i854 | i855) & (~(i854 & i855));
                                                    int i857 = i856 << 5;
                                                    ((int[]) objArr186[0])[0] = ((~i856) & i857) | ((~i857) & i856);
                                                    return objArr186;
                                                }
                                            }
                                            int i858 = i236 + 60;
                                            i236 = ((i858 | (-61)) << 1) - (i858 ^ (-61));
                                            bArr5 = bArr;
                                            i233 = i15;
                                            i234 = i16;
                                            i224 = i12;
                                            j29 = j;
                                        }
                                    }
                                    bArr5 = bArr5;
                                    i234 = i14;
                                    i224 = i224;
                                    j29 = j2;
                                }
                                j2 = j29;
                                i14 = i234;
                                i235 = ((i235 | 1) << 1) - (i235 ^ 1);
                                bArr5 = bArr5;
                                i234 = i14;
                                i224 = i224;
                                j29 = j2;
                            }
                            bArr5 = bArr5;
                            i233 = i233;
                            i224 = i224;
                            j29 = j29;
                            i232 = 4096;
                        }
                        i12 = i224;
                        j = j29;
                        i13 = i233 == length5 ? 1 : 0;
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused21) {
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused22) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused23) {
                    i12 = i224;
                    j = j29;
                }
            } catch (IOException unused24) {
                i12 = i224;
                j = j29;
                bufferedInputStream2 = null;
            } catch (Throwable th10) {
                th = th10;
                bufferedInputStream = null;
            }
        }
        int i2410 = (~(i6 & 262)) & (i6 | 262);
        int i2411 = -i13;
        int i2510 = ((i13 & i2411) | (i13 ^ i2411)) >> 31;
        int i2511 = (~i2510) & i6;
        int i2512 = i2510 & i2410;
        int i2513 = (i2512 & i2511) | (i2511 ^ i2512);
        int i2514 = i6 ^ i215;
        int i2515 = -i2514;
        int i2516 = ((i2514 & i2515) | (i2514 ^ i2515)) >> 31;
        int i2517 = i2513 & (~i2516);
        int i2518 = i215 & i2516;
        int i2519 = (i2518 & i2517) | (i2517 ^ i2518);
        int i2610 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        Object[] objArr310 = new Object[1];
        a((i2610 & 228) + (i2610 | 228), 30 - (~ExpandableListView.getPackedPositionGroup(0L)), (char) (19920 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr310);
        String str214 = (String) objArr310[0];
        int i2611 = 259 - (~(ViewConfiguration.getScrollBarSize() >> 8));
        int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0);
        Object[] objArr311 = new Object[1];
        a(i2611, ((iNormalizeMetaState4 | 23) << 1) - (iNormalizeMetaState4 ^ 23), (char) View.MeasureSpec.getMode(0), objArr311);
        String str215 = (String) objArr311[0];
        int i2612 = 283 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
        int i2613 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
        Object[] objArr312 = new Object[1];
        a(i2612, (i2613 ^ 28) + ((i2613 & 28) << 1), (char) (Process.myTid() >> 22), objArr312);
        String str216 = (String) objArr312[0];
        int mode5 = 311 - View.MeasureSpec.getMode(0);
        int i2614 = 13 - (~(-(Process.myPid() >> 22)));
        int i2615 = -(ViewConfiguration.getScrollBarSize() >> 8);
        Object[] objArr313 = new Object[1];
        a(mode5, i2614, (char) ((i2615 & 31054) + (i2615 | 31054)), objArr313);
        strArr = new String[]{str214, str215, str216, (String) objArr313[0]};
        i17 = 0;
        while (true) {
            if (i17 < 4) {
                i18 = i6;
                break;
            }
            Object[] objArr314 = {strArr[i17]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iIndexOf11 = TextUtils.indexOf("", "", 0, 0) + 993;
                int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 8;
                byte b110 = (byte) 0;
                Object[] objArr315 = new Object[1];
                c(b110, (byte) (b110 | 6), b110, objArr315);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(touchSlop4, iIndexOf11, iMakeMeasureSpec3, 349342683, false, (String) objArr315[0], new Class[]{String.class});
            }
            long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr314)).longValue();
            long j410 = 154729033;
            long j411 = j410 ^ j;
            i106 = i17;
            long j412 = (((long) ((int) Runtime.getRuntime().totalMemory())) | jLongValue17) ^ j;
            long j413 = (((long) (-109)) * j410) + (((long) 111) * jLongValue17) + (((long) (-220)) * (j411 | j412)) + (((long) 220) * (((j410 | jLongValue17) ^ j) | j412)) + (((long) 110) * ((((jLongValue17 ^ j) | j410) ^ j) | ((j411 | jLongValue17) ^ j))) + ((long) (-1001807638));
            int i2616 = TuitionPaymentFragmentbindingInflater1;
            int i2617 = ((i2616 | 83) << 1) - (i2616 ^ 83);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2617 % 128;
            int i2618 = i2617 % 2;
            int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
            int i2619 = ~startUptimeMillis4;
            int i2710 = (~(952845099 | i2619)) | (-2043373356);
            int i2711 = ~(startUptimeMillis4 | (-814367530));
            i107 = ((int) (j413 >> 32)) & ((-2133981854) + ((i2710 | i2711) * (-502)) + ((i2711 | (~(i2619 | (-1090528257)))) * TypedValues.PositionType.TYPE_DRAWPATH));
            i108 = (int) j413;
            iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            i109 = ~(1324691429 | iFreeMemory);
            i110 = ~iFreeMemory;
            if ((i107 | (i108 & ((-2038855459) + ((i109 | (~((-1207959586) | i110))) * 920) + (((~(1320494565 | i110)) | (-1324691430)) * 920) + (((~(iFreeMemory | (-1207959586))) | (~(1324691429 | i110)) | (~((-4196865) | iFreeMemory))) * 920)))) != 0) {
                i18 = (((i106 | 252) << 1) - (i106 ^ 252)) ^ i6;
                break;
            }
            i17 = i106 + 1;
        }
        int i2712 = i6 ^ i2519;
        int i2713 = (i2712 | (-i2712)) >> 31;
        int i2714 = i18 & (~i2713);
        int i2715 = i2519 & i2713;
        int i2716 = (i2715 & i2714) | (i2714 ^ i2715);
        i19 = 324 - (~ExpandableListView.getPackedPositionGroup(0L));
        i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        if (i20 % 2 == 0) {
            int i2717 = -Color.blue(1);
            Object[] objArr316 = new Object[1];
            a(i19, (i2717 ^ 13) + ((i2717 & 13) << 1), (char) View.MeasureSpec.getSize(1), objArr316);
            Object[] objArr317 = {(String) objArr316[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cMakeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33602);
                int iLastIndexOf9 = TextUtils.lastIndexOf("", '0', 0) + 3086;
                int maximumFlingVelocity11 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26;
                byte b111 = (byte) 0;
                byte b112 = (byte) (b111 + 5);
                Object[] objArr318 = new Object[1];
                c(b111, b112, (byte) (b112 - 5), objArr318);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cMakeMeasureSpec2, iLastIndexOf9, maximumFlingVelocity11, 1411172903, false, (String) objArr318[0], new Class[]{String.class});
            }
            str2 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr317);
        } else {
            int i2718 = -(-Color.blue(0));
            Object[] objArr319 = new Object[1];
            a(i19, (i2718 & 13) + (i2718 | 13), (char) View.MeasureSpec.getSize(0), objArr319);
            Object[] objArr410 = {(String) objArr319[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cCombineMeasuredStates3 = (char) (33602 - View.combineMeasuredStates(0, 0));
                int iNormalizeMetaState5 = KeyEvent.normalizeMetaState(0) + 3085;
                int i2719 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                byte b113 = (byte) 0;
                byte b114 = (byte) (b113 + 5);
                Object[] objArr411 = new Object[1];
                c(b113, b114, (byte) (b114 - 5), objArr411);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates3, iNormalizeMetaState5, i2719, 1411172903, false, (String) objArr411[0], new Class[]{String.class});
            }
            str2 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr410);
        }
        if (str2 != null) {
            objArr4 = new Object[1];
            a(337 - (~(-Color.red(0))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (char) (35086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr4);
            if (!(!str2.contains((String) objArr4[0]))) {
                i21 = i6 ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
            } else {
                i21 = i6;
            }
        } else {
            i21 = i6;
        }
        int i2810 = i6 ^ i2716;
        int i2811 = -i2810;
        int i2812 = ((i2810 & i2811) | (i2810 ^ i2811)) >> 31;
        int i2813 = i21 & (~i2812);
        int i2814 = i2716 & i2812;
        int i2815 = (i2814 & i2813) | (i2813 ^ i2814);
        int i2816 = -(-ExpandableListView.getPackedPositionType(0L));
        int i2817 = ((i2816 | 347) << 1) - (i2816 ^ 347);
        int iMyTid6 = Process.myTid() >> 22;
        int iB18 = com.google.android.gms.internal.measurement.zzdm.b();
        int i2818 = iMyTid6 * (-405);
        int i2819 = ~(((-18) ^ iB18) | ((-18) & iB18));
        int i2910 = ~iB18;
        int i2911 = (i2910 & iMyTid6) | (i2910 ^ iMyTid6);
        int i2912 = ~((i2911 & 17) | (i2911 ^ 17));
        int i2913 = (i2818 & 6919) + (i2818 | 6919) + (((i2819 & i2912) | (i2819 ^ i2912)) * (-406));
        int i2914 = ~iB18;
        int i2915 = ((-18) & i2914) | ((-18) ^ i2914);
        int i2916 = (~((i2915 & iMyTid6) | (i2915 ^ iMyTid6))) * (-406);
        int i2917 = ((i2913 | i2916) << 1) - (i2916 ^ i2913);
        int i2918 = ~iMyTid6;
        int i2919 = -(-(((~((i2918 & iB18) | (i2918 ^ iB18))) | (~(i2914 | 17))) * 406));
        Object[] objArr412 = new Object[1];
        a(i2817, (i2917 & i2919) + (i2919 | i2917), (char) (43487 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr412);
        str3 = (String) objArr412[0];
        Object[] objArr413 = new Object[1];
        a(364 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.myTid() >> 22) + 6, (char) TextUtils.getOffsetAfter("", 0), objArr413);
        bytes = ((String) objArr413[0]).getBytes();
        length = bytes.length;
        if (length == 0) {
            i200 = i200;
            i22 = (i6 & (-252)) | (i200 & 251);
        } else {
            bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str3));
            bArr2 = new byte[4096];
            i23 = 0;
            while (true) {
                i24 = bufferedInputStream4.read(bArr2, 0, 4096);
                if (i24 > 0) {
                    break;
                    break;
                }
                i25 = 0;
                while (i23 < length && i25 < i24) {
                    if (bArr2[i25] == bytes[i23]) {
                        i23 = ((i23 & 1) << 1) + (i23 ^ 1);
                    } else if (i23 != 0) {
                        i26 = (-2) - (i23 ^ (-1));
                        while (true) {
                            if (i26 > 0) {
                                i23 = 0;
                                break;
                                break;
                            }
                            i27 = 0;
                            while (true) {
                                if (i27 < i26) {
                                    i23 = i26;
                                    break;
                                    break;
                                }
                                i28 = -i26;
                                if (bytes[i27] != bytes[((((i23 | i28) << 1) - (i28 ^ i23)) - (~i27)) - 1]) {
                                    break;
                                }
                                i27 = (i27 ^ (-123)) + ((i27 & (-123)) << 1) + 124;
                            }
                            int i3010 = ((i26 | (-95)) << 1) - (i26 ^ (-95));
                            i26 = (i3010 ^ 94) + ((i3010 & 94) << 1);
                        }
                    }
                    i25 = (i25 | 1) + (i25 & 1);
                }
            }
            if (i23 == length) {
                z = true;
            } else {
                z = false;
            }
            bufferedInputStream4.close();
            if (z) {
                i200 = i200;
                i22 = (i6 & (-252)) | (i200 & 251);
            } else {
                i200 = i200;
                i22 = i6;
            }
        }
        int i3011 = ((~i2815) & i6) | (i2815 & i200);
        int i3012 = -i3011;
        int i3013 = ((i3011 & i3012) | (i3011 ^ i3012)) >> 31;
        int i3014 = (i2815 & i3013) | (i22 & (~i3013));
        int i3015 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 369;
        int i3016 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
        Object[] objArr414 = new Object[1];
        a(i3015, (i3016 & 23) + (i3016 | 23), (char) KeyEvent.keyCodeFromString(""), objArr414);
        Object[] objArr415 = {(String) objArr414[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString2 = (char) (KeyEvent.keyCodeFromString("") + 33602);
            int mirror6 = 3133 - AndroidCharacter.getMirror('0');
            int threadPriority8 = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b115 = (byte) 0;
            byte b116 = (byte) (b115 + 5);
            Object[] objArr416 = new Object[1];
            c(b115, b116, (byte) (b116 - 5), objArr416);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString2, mirror6, threadPriority8, 1411172903, false, (String) objArr416[0], new Class[]{String.class});
        }
        lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr415)).toLowerCase();
        int iLastIndexOf10 = TextUtils.lastIndexOf("", '0', 0) + 394;
        int mirror7 = AndroidCharacter.getMirror('0') - ',';
        int i3017 = -Color.rgb(0, 0, 0);
        objArr = new Object[1];
        a(iLastIndexOf10, mirror7, (char) ((i3017 ^ (-16757401)) + ((i3017 & (-16757401)) << 1)), objArr);
        if (lowerCase.contains((String) objArr[0])) {
            i29 = (i6 & (-265)) | (i200 & 264);
        } else {
            i29 = i6;
        }
        int i3018 = i6 ^ i3014;
        int i3019 = -i3018;
        int i3110 = ((i3018 & i3019) | (i3018 ^ i3019)) >> 31;
        int i3111 = (i3014 & i3110) | (i29 & (~i3110));
        strArr2 = new String[6];
        int i3112 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
        int i3113 = (i3112 & 397) + (i3112 | 397);
        int iNormalizeMetaState6 = KeyEvent.normalizeMetaState(0);
        int i3114 = (iNormalizeMetaState6 ^ 42) + ((iNormalizeMetaState6 & 42) << 1);
        int i3115 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3115 % 128;
        int i3116 = i3115 % 2;
        Object[] objArr417 = new Object[1];
        a(i3113, i3114, (char) ((-2) - ((-TextUtils.lastIndexOf("", '0', 0)) ^ (-1))), objArr417);
        strArr2[0] = (String) objArr417[0];
        int iRed6 = Color.red(0);
        int i3117 = (iRed6 ^ 439) + ((iRed6 & 439) << 1);
        int i3118 = -View.MeasureSpec.getMode(0);
        Object[] objArr418 = new Object[1];
        a(i3117, (i3118 ^ 40) + ((i3118 & 40) << 1), (char) Color.alpha(0), objArr418);
        strArr2[1] = (String) objArr418[0];
        int iGreen4 = Color.green(0);
        int i3119 = (iGreen4 & 479) + (iGreen4 | 479);
        int i3210 = -(-(Process.myPid() >> 22));
        Object[] objArr419 = new Object[1];
        a(i3119, (i3210 & 27) + (i3210 | 27), (char) View.MeasureSpec.getSize(0), objArr419);
        strArr2[2] = (String) objArr419[0];
        int i3211 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        i30 = ((i3211 | TypedValues.PositionType.TYPE_SIZE_PERCENT) << 1) - (i3211 ^ TypedValues.PositionType.TYPE_SIZE_PERCENT);
        int i3212 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
        i31 = (i3212 ^ 28) + ((i3212 & 28) << 1);
        scrollBarSize = ViewConfiguration.getScrollBarSize();
        int i3213 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        i32 = (i3213 & 9) + (i3213 | 9);
        TuitionPaymentFragmentbindingInflater1 = i32 % 128;
        if (i32 % 2 == 0) {
            Object[] objArr510 = new Object[1];
            a(i30, i31, (char) (scrollBarSize + 40), objArr510);
            i33 = 0;
            strArr2[3] = (String) objArr510[0];
            keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >>> 90) * 29149;
            offsetAfter = TextUtils.getOffsetAfter("", 0) * 21;
            c = 3;
            i35 = 20901;
            i34 = 1;
        } else {
            i33 = 0;
            Object[] objArr511 = new Object[1];
            a(i30, i31, (char) (scrollBarSize >> 8), objArr511);
            strArr2[3] = (String) objArr511[0];
            keyRepeatDelay = 532 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))));
            int offsetAfter6 = TextUtils.getOffsetAfter("", 0);
            i34 = 1;
            offsetAfter = ((offsetAfter6 | 27) << 1) - (offsetAfter6 ^ 27);
            c = 4;
            i35 = 13854;
        }
        int i3214 = -(TypedValue.complexToFraction(i33, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i33, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        char c23 = (char) (((i35 | i3214) << i34) - (i35 ^ i3214));
        Object[] objArr512 = new Object[i34];
        a(keyRepeatDelay, offsetAfter, c23, objArr512);
        strArr2[c] = (String) objArr512[i33];
        int i3215 = -(-TextUtils.lastIndexOf("", '0'));
        Object[] objArr513 = new Object[1];
        a((i3215 & 561) + (i3215 | 561), 26 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19927), objArr513);
        strArr2[5] = (String) objArr513[0];
        i36 = 0;
        while (true) {
            if (i36 < 6) {
                i37 = i6;
                break;
            }
            Object[] objArr514 = {strArr2[i36]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char maxKeyCode3 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 33602);
                int scrollBarSize6 = 3085 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iMakeMeasureSpec4 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b210 = (byte) 0;
                byte b211 = (byte) (b210 + 5);
                Object[] objArr515 = new Object[1];
                c(b210, b211, (byte) (b211 - 5), objArr515);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(maxKeyCode3, scrollBarSize6, iMakeMeasureSpec4, 1411172903, false, (String) objArr515[0], new Class[]{String.class});
            }
            str9 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr514);
            if (str9 == null && !str9.isEmpty()) {
                i37 = (~(i6 & 265)) & (i6 | 265);
                break;
            }
            i36 = ((i36 & 1) << 1) + (i36 ^ 1);
        }
        int i3216 = i6 ^ i3111;
        int i3217 = -i3216;
        int i3218 = ((i3216 & i3217) | (i3216 ^ i3217)) >> 31;
        int i3219 = i37 & (~i3218);
        int i3310 = i3111 & i3218;
        int i3311 = (i3310 & i3219) | (i3219 ^ i3310);
        int i3312 = -View.resolveSizeAndState(0, 0, 0);
        Object[] objArr516 = new Object[1];
        a((i3312 ^ 347) + ((i3312 & 347) << 1), TextUtils.getTrimmedLength("") + 17, (char) (43486 - (~Color.argb(0, 0, 0, 0))), objArr516);
        String str217 = (String) objArr516[0];
        int i3313 = -Gravity.getAbsoluteGravity(0, 0);
        int i3314 = (i3313 & 587) + (i3313 | 587);
        int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength() >> 16;
        Object[] objArr517 = new Object[1];
        a(i3314, ((fadingEdgeLength4 | 6) << 1) - (fadingEdgeLength4 ^ 6), (char) (40767 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))))), objArr517);
        Object[] objArr518 = {str217, (String) objArr517[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            char cBlue2 = (char) Color.blue(0);
            int iAxisFromString6 = MotionEvent.axisFromString("") + 2386;
            int trimmedLength3 = TextUtils.getTrimmedLength("") + 32;
            byte b212 = (byte) 0;
            byte b213 = (byte) (b212 + 5);
            Object[] objArr519 = new Object[1];
            c(b212, b213, (byte) (b213 - 5), objArr519);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue2, iAxisFromString6, trimmedLength3, -1207062455, false, (String) objArr519[0], new Class[]{String.class, String.class});
        }
        long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr518)).longValue();
        long j414 = -65613040;
        j3 = 302;
        j4 = -301;
        long jMyPid3 = Process.myPid();
        long j415 = (((long) (-300)) * j414) + (j3 * jLongValue18) + ((((j414 | jLongValue18) | jMyPid3) ^ j) * j4);
        long j416 = jLongValue18 ^ j;
        long j417 = j415 + ((((j416 | jMyPid3) ^ j) | (((jMyPid3 ^ j) | j414) ^ j)) * j4) + (((long) 301) * (j416 | (((j414 ^ j) | jMyPid3) ^ j))) + ((long) 2042656368);
        int iMyPid4 = Process.myPid();
        int i3315 = ~iMyPid4;
        int i3316 = (~(1200508297 | i3315)) | (-1741643212);
        int i3317 = ~(iMyPid4 | (-1116097674));
        i38 = ((int) (j417 >> 32)) & (((i3316 | i3317) * (-252)) + 629801178 + ((i3317 | (~(i3315 | (-541134915)))) * 252));
        int i3318 = ~(((int) SystemClock.uptimeMillis()) | 170982501);
        i39 = ((int) j417) & (1000300699 + ((1608208911 | i3318) * (-220)) + ((i3318 | 1439367690) * 220) + 347803142);
        if (((i38 & i39) | (i38 ^ i39)) != 0) {
            i40 = i6 ^ 260;
        } else {
            int i3319 = 592 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
            int i3410 = -TextUtils.indexOf("", "");
            int i3411 = (i3410 ^ 13) + ((i3410 & 13) << 1);
            int i3412 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            Object[] objArr610 = new Object[1];
            a(i3319, i3411, (char) (((i3412 | 33899) << 1) - (i3412 ^ 33899)), objArr610);
            str4 = (String) objArr610[0];
            int i3413 = -View.MeasureSpec.getSize(0);
            int i3414 = (i3413 ^ TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + ((i3413 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) << 1);
            int i3415 = -View.MeasureSpec.getMode(0);
            int i3416 = (i3415 ^ 9) + ((i3415 & 9) << 1);
            int i3417 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr611 = new Object[1];
            a(i3414, i3416, (char) (((i3417 | 62115) << 1) - (i3417 ^ 62115)), objArr611);
            bytes2 = ((String) objArr611[0]).getBytes();
            length2 = bytes2.length;
            if (length2 == 0) {
                i40 = (~(i6 & 261)) & (i6 | 261);
            } else {
                bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str4));
                i41 = 4096;
                bArr3 = new byte[4096];
                i42 = 0;
                while (true) {
                    i43 = bufferedInputStream6.read(bArr3, 0, i41);
                    if (i43 > 0) {
                        break;
                        break;
                    }
                    i44 = 0;
                    while (i42 < length2 && i44 < i43) {
                        if (bArr3[i44] == bytes2[i42]) {
                            if (i42 != 0) {
                                i45 = (i42 ^ (-1)) + (i42 << 1);
                                while (true) {
                                    if (i45 > 0) {
                                        i42 = 0;
                                        break;
                                        break;
                                    }
                                    i46 = 0;
                                    while (true) {
                                        if (i46 < i45) {
                                            i42 = i45;
                                            break;
                                            break;
                                        }
                                        i47 = -i45;
                                        if (bytes2[i46] != bytes2[(((i42 | i47) << 1) - (i47 ^ i42)) + i46]) {
                                            break;
                                        }
                                        int i3418 = ((i46 | (-37)) << 1) - (i46 ^ (-37));
                                        i46 = (i3418 ^ 38) + ((i3418 & 38) << 1);
                                    }
                                    int i3419 = TuitionPaymentFragmentbindingInflater1;
                                    int i3510 = (i3419 ^ 71) + ((i3419 & 71) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3510 % 128;
                                    int i3511 = i3510 % 2;
                                    i45 = (i45 << 1) + (~i45);
                                }
                            }
                        } else {
                            i42 = ((i42 | 1) << 1) - (i42 ^ 1);
                        }
                        i44 = ((i44 | 1) << 1) - (i44 ^ 1);
                    }
                    i41 = 4096;
                }
                if (i42 == length2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bufferedInputStream6.close();
                if (z2) {
                    i40 = (~(i6 & 261)) & (i6 | 261);
                } else {
                    i40 = i6;
                }
            }
        }
        int i3512 = (~(i6 & i3311)) & (i6 | i3311);
        int i3513 = -i3512;
        int i3514 = ((i3512 & i3513) | (i3512 ^ i3513)) >> 31;
        int i3515 = i40 & (~i3514);
        int i3516 = i3311 & i3514;
        i48 = (i3516 & i3515) | (i3515 ^ i3516);
        if ((i2 & 8) == 0) {
            int i3517 = -View.MeasureSpec.getMode(0);
            int i3518 = (i12 ^ i3517) | (i12 & i3517);
            int i3519 = (i3517 * (-51)) + 32595 + ((~((i3518 & 615) | (i3518 ^ 615))) * 52);
            int i3610 = ~(((-616) & i200) | ((-616) ^ i200));
            int i3611 = ~((-616) | i3517);
            int i3612 = (i3610 & i3611) | (i3610 ^ i3611);
            int i3613 = ~((i200 ^ i3517) | (i200 & i3517));
            int i3614 = ((i3612 & i3613) | (i3612 ^ i3613)) * (-52);
            int i3615 = (i3519 ^ i3614) + ((i3519 & i3614) << 1);
            int i3616 = ~i3517;
            int i3617 = ~((i3616 & i12) | (i3616 ^ i12));
            int i3618 = ~i3517;
            int i3619 = ~((i3618 & 615) | (i3618 ^ 615));
            int i3710 = i3615 + (((i3619 & i3617) | (i3617 ^ i3619)) * 52);
            int i3711 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
            int i3712 = (i3711 & 43) + (i3711 | 43);
            int i3713 = -(-((Process.getThreadPriority(0) + 20) >> 6));
            Object[] objArr612 = new Object[1];
            a(i3710, i3712, (char) ((i3713 ^ 3180) + ((i3713 & 3180) << 1)), objArr612);
            String str218 = (String) objArr612[0];
            int i3714 = -(-ExpandableListView.getPackedPositionGroup(0L));
            int i3715 = (i3714 & 658) + (i3714 | 658);
            int i3716 = -(-(KeyEvent.getMaxKeyCode() >> 16));
            Object[] objArr613 = new Object[1];
            a(i3715, (i3716 ^ 41) + ((i3716 & 41) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr613);
            String str219 = (String) objArr613[0];
            int i3717 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int i3718 = (i3717 & TypedValues.TransitionType.TYPE_DURATION) + (i3717 | TypedValues.TransitionType.TYPE_DURATION);
            int i3719 = -View.resolveSizeAndState(0, 0, 0);
            Object[] objArr614 = new Object[1];
            a(i3718, (i3719 ^ 38) + ((i3719 & 38) << 1), (char) (64805 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr614);
            strArr17 = new String[]{str218, str219, (String) objArr614[0]};
            i102 = 0;
            while (true) {
                if (i102 < 3) {
                    i103 = i6;
                    break;
                }
                Object[] objArr615 = {strArr17[i102]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cCombineMeasuredStates4 = (char) View.combineMeasuredStates(0, 0);
                    int gidForName5 = Process.getGidForName("") + 994;
                    int mirror8 = AndroidCharacter.getMirror('0') - '(';
                    byte b214 = (byte) 0;
                    Object[] objArr616 = new Object[1];
                    c(b214, (byte) (b214 | 6), b214, objArr616);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cCombineMeasuredStates4, gidForName5, mirror8, 349342683, false, (String) objArr616[0], new Class[]{String.class});
                }
                long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr615)).longValue();
                long j510 = 1255860125;
                long j511 = jLongValue19 ^ j;
                long jMyPid4 = ((long) Process.myPid()) ^ j;
                long j512 = 933;
                long j513 = (((long) 934) * j510) + (((long) (-932)) * jLongValue19) + (((long) (-933)) * (j511 | (((j510 ^ j) | jMyPid4) ^ j))) + ((((j511 | jMyPid4) ^ j) | ((j511 | j510) ^ j)) * j512) + (j512 * ((j510 | jLongValue19) ^ j)) + ((long) (-2102938730));
                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                int i3810 = 224158758 + (((-1999346868) | elapsedCpuTime3) * (-50));
                int i3811 = ~(1999347123 | elapsedCpuTime3);
                int i3812 = ~elapsedCpuTime3;
                i104 = ((int) (j513 >> 32)) & (i3810 + ((i3811 | (~((-1140953107) | i3812))) * 50) + (((~(i3812 | (-1999346868))) | (~(858394017 | i3812)) | 1140953106) * 50));
                i105 = ((int) j513) & ((-901429351) + (((~((-227416264) | i200)) | (~(1664642673 | i6))) * 217) + (((~((-227416264) | i6)) | 210112646) * 217) + (((~(1664642673 | i200)) | 227416263) * 217));
                if (((i104 & i105) | (i104 ^ i105)) != 0) {
                    int i3813 = i102 + 280;
                    i103 = ((~i3813) & i6) | (i3813 & i200);
                    break;
                }
                int i3814 = (i102 & (-104)) + (i102 | (-104));
                i102 = (i3814 & 105) + (i3814 | 105);
            }
            int i3815 = (~(i6 & i48)) & (i6 | i48);
            int i3816 = -i3815;
            int i3817 = ((i3815 & i3816) | (i3815 ^ i3816)) >> 31;
            int i3818 = i103 & (~i3817);
            int i3819 = i48 & i3817;
            i48 = (i3819 & i3818) | (i3818 ^ i3819);
        }
        int iLastIndexOf11 = TextUtils.lastIndexOf("", '0') + 738;
        int threadPriority9 = (Process.getThreadPriority(0) + 20) >> 6;
        int iB19 = com.google.android.gms.internal.measurement.zzdm.b();
        int i3910 = ~threadPriority9;
        int i3911 = ~(iB19 | 41);
        int i3912 = (threadPriority9 * (-109)) + 4551 + (((i3911 & i3910) | (i3910 ^ i3911)) * (-220));
        int i3913 = ~((threadPriority9 ^ 41) | (threadPriority9 & 41));
        int i3914 = ~((iB19 & 41) | (iB19 ^ 41));
        int i3915 = (i3912 - (~(-(-(((i3914 & i3913) | (i3913 ^ i3914)) * 220))))) - 1;
        int i3916 = ~((i3910 & 41) | (i3910 ^ 41));
        int i3917 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3918 = ((i3917 | 11) << 1) - (i3917 ^ 11);
        TuitionPaymentFragmentbindingInflater1 = i3918 % 128;
        int i3919 = i3918 % 2;
        int i4010 = ~((threadPriority9 & (-42)) | ((-42) ^ threadPriority9));
        int i4011 = i3916 ^ i4010;
        Object[] objArr617 = new Object[1];
        a(iLastIndexOf11, (i3915 - (~(-(-(110 * ((i4010 & i3916) | i4011)))))) - 1, (char) (3238 - (ViewConfiguration.getTouchSlop() >> 8)), objArr617);
        int i4012 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4013 = ((i4012 | 33) << 1) - (i4012 ^ 33);
        TuitionPaymentFragmentbindingInflater1 = i4013 % 128;
        int i4014 = i4013 % 2;
        int iMyPid5 = (Process.myPid() >> 22) + 778;
        int i4015 = 28 - (~(-TextUtils.indexOf((CharSequence) "", '0')));
        int i4016 = -View.MeasureSpec.getSize(0);
        Object[] objArr618 = new Object[1];
        a(iMyPid5, i4015, (char) ((i4016 & 23235) + (i4016 | 23235)), objArr618);
        strArr3 = new String[]{(String) objArr617[0], (String) objArr618[0]};
        i49 = 0;
        while (true) {
            if (i49 < 2) {
                i50 = i6;
                break;
            }
            int i4017 = TuitionPaymentFragmentbindingInflater1;
            int i4018 = (i4017 & 47) + (i4017 | 47);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4018 % 128;
            int i4019 = i4018 % 2;
            Object[] objArr619 = {strArr3[i49]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char maximumFlingVelocity12 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i4110 = 993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i4111 = 9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b215 = (byte) 0;
                Object[] objArr711 = new Object[1];
                c(b215, (byte) (b215 | 6), b215, objArr711);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(maximumFlingVelocity12, i4110, i4111, 349342683, false, (String) objArr711[0], new Class[]{String.class});
            }
            long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr619)).longValue();
            long j514 = 1125942368;
            long j515 = j514 ^ j;
            strArr16 = strArr3;
            long j516 = i6;
            long j517 = (((long) 236) * j514) + (((long) 471) * jLongValue20) + (((long) (-235)) * (jLongValue20 | ((j515 | (j516 ^ j)) ^ j))) + (((long) (-470)) * (jLongValue20 | ((j515 | j516) ^ j))) + (((long) 235) * (((j516 | (jLongValue20 | j515)) ^ j) | (((jLongValue20 ^ j) | j514) ^ j))) + ((long) (-1973020973));
            i100 = ((int) (j517 >> 32)) & ((-1344671705) + ((~((-335806467) | i200)) * (-783)) + (((~(1100692472 | i200)) | (-336533939)) * 783));
            int i4112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4113 = (i4112 & 29) + (i4112 | 29);
            TuitionPaymentFragmentbindingInflater1 = i4113 % 128;
            int i4114 = i4113 % 2;
            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
            int i4115 = ~iMaxMemory3;
            i101 = ((int) j517) & ((-1667685763) + ((iMaxMemory3 | 537166085) * 988) + (((~((-486242939) | i4115)) | 72425552) * (-1976)) + (((~(iMaxMemory3 | 950983471)) | 537166085 | (~((-950983472) | i4115))) * 988));
            if (((i100 & i101) | (i100 ^ i101)) != 0) {
                int i4116 = i49 + 288;
                i50 = (~(i6 & i4116)) & (i6 | i4116);
                break;
            }
            int i4117 = (i49 & (-58)) + (i49 | (-58));
            i49 = ((i4117 | 59) << 1) - (i4117 ^ 59);
            strArr3 = strArr16;
        }
        int i4118 = (~(i6 & i48)) & (i6 | i48);
        int i4119 = -i4118;
        int i4210 = ((i4118 & i4119) | (i4118 ^ i4119)) >> 31;
        int i4211 = i50 & (~i4210);
        int i4212 = i48 & i4210;
        i51 = (i4212 & i4211) | (i4211 ^ i4212);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
            int maximumFlingVelocity13 = 3526 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iIndexOf12 = TextUtils.indexOf("", "", 0, 0) + 23;
            byte b216 = (byte) 0;
            byte b217 = (byte) (b216 + 5);
            Object[] objArr712 = new Object[1];
            c(b216, b217, (byte) (b217 - 5), objArr712);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf3, maximumFlingVelocity13, iIndexOf12, 980946500, false, (String) objArr712[0], new Class[0]);
        }
        long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null)).longValue();
        long j518 = 1401976968;
        long j519 = (((long) 491) * j518) + (((long) (-489)) * jLongValue21);
        long j610 = j518 ^ j;
        long j611 = jLongValue21 ^ j;
        long j612 = (int) Runtime.getRuntime().totalMemory();
        long j613 = 490;
        long j614 = j519 + (((long) (-490)) * (j610 | j611 | (j612 ^ j))) + ((((j611 | j612) ^ j) | ((j518 | j611) ^ j)) * j613) + (j613 * j610) + ((long) (-1582299606));
        i52 = ((int) (j614 >> 32)) & ((-2620534) + ((~((-710324823) | i200)) * 52) + (((~((-1786705623) | i200)) | (~(1071035262 | i200)) | 1076380800) * (-52)) + (((~(1786705622 | i200)) | 360710440) * 52));
        int i4213 = ~((-639441944) | i6);
        i53 = ((int) j614) & (861093121 + ((570757121 | i4213) * (-280)) + ((i4213 | (~(2076668353 | i6))) * 140) + (((~((-68684823) | i6)) | (~((-570757122) | i200)) | (~(2145353175 | i200))) * 140));
        if (((i52 & i53) | (i52 ^ i53)) != 1) {
            Object[] objArr713 = {1};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char maxKeyCode4 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int maximumFlingVelocity14 = 2673 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iLastIndexOf12 = TextUtils.lastIndexOf("", '0', 0, 0) + 17;
                byte b218 = (byte) 0;
                byte b219 = (byte) (b218 + 5);
                Object[] objArr714 = new Object[1];
                c(b218, b219, (byte) (b219 - 5), objArr714);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode4, maximumFlingVelocity14, iLastIndexOf12, -1409439630, false, (String) objArr714[0], new Class[]{Integer.TYPE});
            }
            long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr713)).longValue();
            long j615 = 1228553582;
            long j616 = j615 ^ j;
            long j617 = jLongValue110 ^ j;
            i54 = i200;
            j5 = i6;
            j6 = j5 ^ j;
            j7 = (j28 * j615) + (((long) (-67)) * jLongValue110) + (((((j616 | j617) | j6) ^ j) | ((j615 | jLongValue110) ^ j) | ((jLongValue110 | j5) ^ j)) * j26) + (((jLongValue110 | (j616 | j6)) ^ j) * j26) + (((long) 68) * (((j617 | j6) ^ j) | j616)) + ((long) 639145098);
            i56 = ((int) (j7 >> 32)) & (1623859006 + (((~((-294261001) | i54)) | (~(1403663226 | i6))) * (-302)) + ((~((-294261001) | i6)) * (-604)) + (((~(1109402226 | i6)) | 1075839042) * 302));
            iNextInt = new Random().nextInt(314607323);
            if ((i56 | (((int) j7) & ((-162096932) + ((~((~iNextInt) | (-361267274))) * 433) + (((~(1971906041 | iNextInt)) | (-534679632)) * (-433)) + (((~(iNextInt | (-534679632))) | 1610638768) * 433)))) != 0) {
                i57 = (~(i6 & 220)) & (i6 | 220);
            } else {
                i57 = i6;
            }
            int i4214 = i6 ^ i51;
            int i4215 = (i4214 | (-i4214)) >> 31;
            int i4216 = i57 & (~i4215);
            int i4217 = i51 & i4215;
            i58 = (i4217 & i4216) | (i4216 ^ i4217);
            int i4218 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr715 = new Object[1];
            a((i4218 & 370) + (i4218 | 370), 22 - (~(-(-TextUtils.indexOf("", "")))), (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr715);
            Object[] objArr716 = {(String) objArr715[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c24 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33602);
                int i4219 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3086;
                int doubleTapTimeout6 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                byte b312 = (byte) 0;
                byte b313 = (byte) (b312 + 5);
                Object[] objArr717 = new Object[1];
                c(b312, b313, (byte) (b313 - 5), objArr717);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c24, i4219, doubleTapTimeout6, 1411172903, false, (String) objArr717[0], new Class[]{String.class});
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr716);
            if (objInvoke != null) {
                Object[] objArr718 = {objInvoke, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char offsetAfter7 = (char) TextUtils.getOffsetAfter("", 0);
                    int iIndexOf13 = 3392 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int trimmedLength4 = TextUtils.getTrimmedLength("") + 9;
                    byte b314 = (byte) 0;
                    byte b315 = (byte) (b314 + 5);
                    Object[] objArr719 = new Object[1];
                    c(b314, b315, (byte) (b315 - 5), objArr719);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(offsetAfter7, iIndexOf13, trimmedLength4, 1203525406, false, (String) objArr719[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr718)).longValue();
                long j618 = 1627048369;
                long j619 = 253;
                long j710 = (j619 * j618) + (j619 * jLongValue111);
                long j711 = -252;
                long j712 = jLongValue111 ^ j;
                long j713 = ((j618 ^ j) | j712) ^ j;
                long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                long j714 = j712 | (jUptimeMillis2 ^ j);
                long j715 = jLongValue111 | j618;
                long j716 = (jUptimeMillis2 | j715) ^ j;
                long j717 = j710 + ((j713 | (j714 ^ j) | j716) * j711) + (j711 * j715) + (((long) 252) * (((j714 | j618) ^ j) | j716)) + ((long) (-1629118246));
                int i4319 = ~((-1342279809) | i6);
                i98 = ((int) (j717 >> 32)) & ((-1188348406) + ((19399976 | i4319) * (-476)) + (i4319 * 952) + ((~((-1342279809) | i54)) * 476));
                i99 = ((int) j717) & ((-635053948) + (((-77595926) | i6) * (-627)) + (((~((-1532992225) | i6)) | 1324748661) * (-627)) + (((~(1532992224 | i54)) | (~(1324748661 | i6))) * 627));
                if (((i99 & i98) | (i98 ^ i99)) == 1986687685) {
                    i62 = 0;
                    strArr6 = null;
                } else {
                    int iResolveOpacity3 = 370 - Drawable.resolveOpacity(0, 0);
                    int iResolveSize3 = View.resolveSize(0, 0);
                    Object[] objArr7110 = new Object[1];
                    a(iResolveOpacity3, (iResolveSize3 ^ 23) + ((iResolveSize3 & 23) << 1), (char) KeyEvent.keyCodeFromString(""), objArr7110);
                    String str2110 = (String) objArr7110[0];
                    int iIndexOf14 = TextUtils.indexOf("", "") + 808;
                    int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                    int i43110 = -AndroidCharacter.getMirror('0');
                    char c110 = (char) ((i43110 & 48) + (i43110 | 48));
                    Object[] objArr8110 = new Object[1];
                    a(iIndexOf14, minimumFlingVelocity4, c110, objArr8110);
                    String str2111 = (String) objArr8110[0];
                    int i43111 = -ExpandableListView.getPackedPositionGroup(0L);
                    int i43112 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr8111 = new Object[1];
                    a(((i43111 | 818) << 1) - (i43111 ^ 818), (i43112 & 7) + (i43112 | 7), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8111);
                    String str2112 = (String) objArr8111[0];
                    int fadingEdgeLength5 = ViewConfiguration.getFadingEdgeLength() >> 16;
                    Object[] objArr8112 = new Object[1];
                    a((fadingEdgeLength5 & 825) + (fadingEdgeLength5 | 825), 8 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), (char) KeyEvent.getDeadChar(0, 0), objArr8112);
                    int i43113 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int i43114 = ((i43113 | 832) << 1) - (i43113 ^ 832);
                    int i43115 = -Color.alpha(0);
                    Object[] objArr8113 = new Object[1];
                    a(i43114, (i43115 & 17) + (i43115 | 17), (char) TextUtils.indexOf("", ""), objArr8113);
                    String str2113 = (String) objArr8113[0];
                    int i43116 = 849 - (~(-Color.blue(0)));
                    int i43117 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i43118 = i43117 * 569;
                    int i44110 = (i43118 ^ 3983) + ((i43118 & 3983) << 1);
                    int i44111 = ~i43117;
                    int i44112 = ~((i44111 ^ (-8)) | (i44111 & (-8)));
                    int i44113 = ~((i44111 ^ i12) | (i44111 & i12));
                    int i44114 = (i44112 & i44113) | (i44112 ^ i44113);
                    int i44115 = ~(((-8) ^ i12) | ((-8) & i12));
                    int i44116 = ((i44114 & i44115) | (i44114 ^ i44115)) * (-1136);
                    int i44117 = ((i44110 | i44116) << 1) - (i44110 ^ i44116);
                    int i44118 = ~((i44111 & i6) | (i44111 ^ i6));
                    int i44119 = ~(((-8) ^ i6) | ((-8) & i6));
                    int i45110 = (i44118 & i44119) | (i44118 ^ i44119);
                    int i45111 = i54 | i43117;
                    int i45112 = ~((i45111 & 7) | (i45111 ^ 7));
                    int i45113 = -(-(((i45110 & i45112) | (i45110 ^ i45112)) * (-568)));
                    int i45114 = ((i44117 | i45113) << 1) - (i45113 ^ i44117);
                    int i45115 = ~((i54 ^ i43117) | (i54 & i43117));
                    int i45116 = ~((i12 ^ 7) | (i12 & 7));
                    int i45117 = ~i43117;
                    int i45118 = (i45117 & (-8)) | (i45117 ^ (-8));
                    int i45119 = (i45114 - (~(-(-(((~((i45118 & i6) | (i45118 ^ i6))) | ((i45115 & i45116) | (i45115 ^ i45116))) * 568))))) - 1;
                    int i46110 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    Object[] objArr8114 = new Object[1];
                    a(i43116, i45119, (char) ((i46110 ^ 42790) + ((i46110 & 42790) << 1)), objArr8114);
                    String str3110 = (String) objArr8114[0];
                    int i46111 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i46112 = ((i46111 | 856) << 1) - (i46111 ^ 856);
                    int i46113 = -((byte) KeyEvent.getModifierMetaStateMask());
                    int iB110 = com.google.android.gms.internal.measurement.zzdm.b();
                    int i46114 = i46113 * 881;
                    int i46115 = ((i46114 | 5286) << 1) - (i46114 ^ 5286);
                    int i46116 = ~i46113;
                    int i46117 = ~((i46116 & (-7)) | (i46116 ^ (-7)));
                    int i46118 = ~i46113;
                    int i46119 = (i46115 - (~(-(-((((~((i46118 ^ iB110) | (i46118 & iB110))) | i46117) | (~(((-7) ^ iB110) | ((-7) & iB110)))) * (-880)))))) - 1;
                    int i47110 = ~((~iB110) | i46118);
                    int i47111 = (i47110 & 6) | (i47110 ^ 6);
                    int i47112 = (i46113 & iB110) | (i46113 ^ iB110);
                    int i47113 = ~i47112;
                    int i47114 = -(-(((i47113 & i47111) | (i47111 ^ i47113)) * (-880)));
                    int i47115 = (i46119 & i47114) + (i47114 | i46119);
                    int i47116 = (~i47112) * 880;
                    int i47117 = (i47115 & i47116) + (i47116 | i47115);
                    int iRgb8 = Color.rgb(0, 0, 0);
                    Object[] objArr8115 = new Object[1];
                    a(i46112, i47117, (char) (((iRgb8 | 16777216) << 1) - (iRgb8 ^ 16777216)), objArr8115);
                    String str3111 = (String) objArr8115[0];
                    int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr8116 = new Object[1];
                    a((packedPositionGroup4 ^ 864) + ((packedPositionGroup4 & 864) << 1), 11 - Color.alpha(0), (char) (19729 - (~(-Color.green(0)))), objArr8116);
                    String str3112 = (String) objArr8116[0];
                    int i47118 = 874 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                    int i47119 = -(-Color.argb(0, 0, 0, 0));
                    int i48110 = (i47119 & 14) + (i47119 | 14);
                    int touchSlop5 = ViewConfiguration.getTouchSlop() >> 8;
                    int i48111 = (touchSlop5 * (-495)) - 22889295;
                    int i48112 = ~touchSlop5;
                    int i48113 = ~(i48112 | (-46242));
                    int i48114 = ~((i48112 ^ i6) | (i48112 & i6));
                    int i48115 = ((i48113 ^ i48114) | (i48113 & i48114)) * 992;
                    int i48116 = (i48111 & i48115) + (i48115 | i48111);
                    int i48117 = ~(((-46242) & i48112) | (i48112 ^ (-46242)));
                    int i48118 = ~((~touchSlop5) | i6);
                    int i48119 = (i48117 & i48118) | (i48117 ^ i48118);
                    int i49110 = (i12 ^ touchSlop5) | (i12 & touchSlop5);
                    char c111 = (char) (i48116 + ((i48119 | (~((i49110 & 46241) | (i49110 ^ 46241)))) * (-496)) + (((i6 ^ 46241) | (i6 & 46241)) * 496));
                    Object[] objArr8117 = new Object[1];
                    a(i47118, i48110, c111, objArr8117);
                    int i49111 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 889;
                    int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("");
                    int iB111 = com.google.android.gms.internal.measurement.zzdm.b();
                    int i49112 = ~(((-17) ^ iKeyCodeFromString3) | ((-17) & iKeyCodeFromString3));
                    int i49113 = ~iKeyCodeFromString3;
                    int i49114 = ~(i49113 | 16 | iB111);
                    int i49115 = (((iKeyCodeFromString3 * (-500)) - 8000) - (~(-(-(((i49112 & i49114) | (i49112 ^ i49114)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1;
                    int i49116 = (~(((-17) & i49113) | (i49113 ^ (-17)))) * 1002;
                    int i49117 = ~iKeyCodeFromString3;
                    int i49118 = ~iB111;
                    int i49119 = (i49117 & i49118) | (i49117 ^ i49118);
                    Object[] objArr8118 = new Object[1];
                    a(i49111, ((((i49115 | i49116) << 1) - (i49115 ^ i49116)) - (~(-(-((~((i49119 & 16) | (i49119 ^ 16))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16097), objArr8118);
                    String str3113 = (String) objArr8118[0];
                    int iRgb9 = Color.rgb(0, 0, 0) + 16778121;
                    int i50110 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i50111 = ((i50110 | 4) << 1) - (i50110 ^ 4);
                    int i50112 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    Object[] objArr8119 = new Object[1];
                    a(iRgb9, i50111, (char) (((i50112 | 33182) << 1) - (i50112 ^ 33182)), objArr8119);
                    String str3114 = (String) objArr8119[0];
                    int i50113 = -TextUtils.indexOf("", "");
                    int i50114 = (i50113 ^ 916) + ((i50113 & 916) << 1);
                    int i50115 = -KeyEvent.normalizeMetaState(0);
                    int i50116 = ((i50115 | 22) << 1) - (i50115 ^ 22);
                    int i50117 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    Object[] objArr9110 = new Object[1];
                    a(i50114, i50116, (char) ((i50117 & 8999) + (i50117 | 8999)), objArr9110);
                    String str3115 = (String) objArr9110[0];
                    int i50118 = -Color.red(0);
                    int i50119 = ((i50118 | 938) << 1) - (i50118 ^ 938);
                    int i51110 = -KeyEvent.normalizeMetaState(0);
                    int i51111 = (i51110 ^ 25) + ((i51110 & 25) << 1);
                    int iLastIndexOf13 = TextUtils.lastIndexOf("", '0');
                    int iB112 = com.google.android.gms.internal.measurement.zzdm.b();
                    int i51112 = (iLastIndexOf13 * 758) - 30106188;
                    int i51113 = ~iB112;
                    int i51114 = -(-(((iLastIndexOf13 ^ i51113) | (i51113 & iLastIndexOf13)) * (-757)));
                    int i51115 = (i51112 ^ i51114) + ((i51112 & i51114) << 1);
                    int i51116 = (-39824) | iLastIndexOf13;
                    int i51117 = i51115 + ((~((i51116 & iB112) | (i51116 ^ iB112))) * 1514);
                    int i51118 = ~iLastIndexOf13;
                    int i51119 = ~((i51118 ^ (-39824)) | (i51118 & (-39824)));
                    int i52110 = ~iB112;
                    int i52111 = (iLastIndexOf13 & 39823) | (iLastIndexOf13 ^ 39823);
                    char c112 = (char) ((i51117 - (~((((~(((-39824) ^ i52110) | (i52110 & (-39824)))) | i51119) | (~((i52111 & iB112) | (i52111 ^ iB112)))) * 757))) - 1);
                    Object[] objArr9111 = new Object[1];
                    a(i50119, i51111, c112, objArr9111);
                    String str3116 = (String) objArr9111[0];
                    int i52112 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    Object[] objArr9112 = new Object[1];
                    a((i52112 ^ 963) + ((i52112 & 963) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 28, (char) Color.green(0), objArr9112);
                    String str3117 = (String) objArr9112[0];
                    int i52113 = -(-Drawable.resolveOpacity(0, 0));
                    int i52114 = (i52113 & 991) + (i52113 | 991);
                    int i52115 = 10 - (~(-Color.red(0)));
                    int i52116 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    Object[] objArr9113 = new Object[1];
                    a(i52114, i52115, (char) ((i52116 & 1) + (i52116 | 1)), objArr9113);
                    String str3118 = (String) objArr9113[0];
                    int i52117 = 1003 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i52118 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    Object[] objArr9114 = new Object[1];
                    a(i52117, ((i52118 | 7) << 1) - (i52118 ^ 7), (char) ExpandableListView.getPackedPositionGroup(0L), objArr9114);
                    String str3119 = (String) objArr9114[0];
                    Object[] objArr9115 = new Object[1];
                    a(1008 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), 4 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9115);
                    String str4110 = (String) objArr9115[0];
                    int i52119 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr9116 = new Object[1];
                    a((i52119 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + (i52119 | PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW), 5 - (~Color.red(0)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr9116);
                    int iRgb10 = Color.rgb(0, 0, 0) + 16778238;
                    int i53110 = -TextUtils.getOffsetBefore("", 0);
                    int i53111 = (i53110 & 16) + (i53110 | 16);
                    int i53112 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iB113 = com.google.android.gms.internal.measurement.zzdm.b();
                    int i53113 = i53112 * 302;
                    int i53114 = (i53113 & 15473583) + (i53113 | 15473583);
                    int i53115 = ~i53112;
                    int i53116 = ~iB113;
                    int i53117 = ~((i53115 ^ i53116) | (i53115 & i53116));
                    int i53118 = -(-(((i53117 ^ 25661) | (i53117 & 25661)) * (-602)));
                    int i53119 = ((i53114 | i53118) << 1) - (i53118 ^ i53114);
                    int i54110 = ~((i53115 ^ (-25662)) | (i53115 & (-25662)));
                    int i54111 = ~i53112;
                    int i54112 = -(-(((~(i53112 | i53116 | 25661)) | i54110 | (~((iB113 & i54111) | (i54111 ^ iB113)))) * (-301)));
                    int i54113 = (i53119 ^ i54112) + ((i54112 & i53119) << 1);
                    int i54114 = -(-((~(i53116 | 25661)) * 301));
                    char c113 = (char) ((i54113 ^ i54114) + ((i54114 & i54113) << 1));
                    Object[] objArr9117 = new Object[1];
                    a(iRgb10, i53111, c113, objArr9117);
                    String str4111 = (String) objArr9117[0];
                    int i54115 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i54116 = ((i54115 | 857) << 1) - (i54115 ^ 857);
                    int i54117 = -Color.green(0);
                    Object[] objArr9118 = new Object[1];
                    a(i54116, (i54117 & 7) + (i54117 | 7), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9118);
                    String str4112 = (String) objArr9118[0];
                    int i54118 = -View.MeasureSpec.getSize(0);
                    int i54119 = ((i54118 | 825) << 1) - (i54118 ^ 825);
                    int i55110 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i55111 = ((i55110 | 9) << 1) - (i55110 ^ 9);
                    int i55112 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr9119 = new Object[1];
                    a(i54119, i55111, (char) ((i55112 & 1) + (i55112 | 1)), objArr9119);
                    int offsetAfter8 = TextUtils.getOffsetAfter("", 0) + 1038;
                    int doubleTapTimeout7 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                    int i55113 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr10110 = new Object[1];
                    a(offsetAfter8, doubleTapTimeout7, (char) ((i55113 & 3459) + (i55113 | 3459)), objArr10110);
                    String str4113 = (String) objArr10110[0];
                    int i55114 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    int i55115 = ((i55114 | 1052) << 1) - (i55114 ^ 1052);
                    int i55116 = -Color.argb(0, 0, 0, 0);
                    int i55117 = ((i55116 | 1) << 1) - (i55116 ^ 1);
                    int i55118 = -TextUtils.lastIndexOf("", '0');
                    Object[] objArr10111 = new Object[1];
                    a(i55115, i55117, (char) ((i55118 & 1153) + (i55118 | 1153)), objArr10111);
                    int iMyTid7 = Process.myTid() >> 22;
                    int i55119 = (iMyTid7 & 1053) + (iMyTid7 | 1053);
                    int i56110 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8;
                    int i56111 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    Object[] objArr10112 = new Object[1];
                    a(i55119, i56110, (char) ((i56111 ^ 480) + ((i56111 & 480) << 1)), objArr10112);
                    String str4114 = (String) objArr10112[0];
                    int i56112 = 1060 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                    int i56113 = -Color.green(0);
                    Object[] objArr10113 = new Object[1];
                    a(i56112, ((i56113 | 1) << 1) - (i56113 ^ 1), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr10113);
                    int i56114 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i56115 = ((i56114 | 1064) << 1) - (i56114 ^ 1064);
                    int keyRepeatDelay10 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16;
                    int i56116 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr10114 = new Object[1];
                    a(i56115, keyRepeatDelay10, (char) ((i56116 ^ 59327) + ((i56116 & 59327) << 1)), objArr10114);
                    String str4115 = (String) objArr10114[0];
                    int i56117 = 904 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                    int i56118 = -(Process.myTid() >> 22);
                    int i56119 = (i56118 ^ 3) + ((i56118 & 3) << 1);
                    int i57110 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    Object[] objArr10115 = new Object[1];
                    a(i56117, i56119, (char) ((i57110 ^ 33183) + ((i57110 & 33183) << 1)), objArr10115);
                    String str4116 = (String) objArr10115[0];
                    int iRed7 = Color.red(0);
                    int i57111 = (iRed7 ^ 850) + ((iRed7 & 850) << 1);
                    int i57112 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i57113 = (i57112 & 6) + (i57112 | 6);
                    int i57114 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    Object[] objArr10116 = new Object[1];
                    a(i57111, i57113, (char) ((i57114 & 42790) + (i57114 | 42790)), objArr10116);
                    String str4117 = (String) objArr10116[0];
                    int maximumFlingVelocity15 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    Object[] objArr10117 = new Object[1];
                    a(((maximumFlingVelocity15 | 1079) << 1) - (maximumFlingVelocity15 ^ 1079), 7 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), (char) TextUtils.indexOf("", "", 0, 0), objArr10117);
                    String str4118 = (String) objArr10117[0];
                    int i57115 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i57116 = (i57115 ^ 864) + ((i57115 & 864) << 1);
                    int i57117 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i57118 = (i57117 ^ 11) + ((i57117 & 11) << 1);
                    int i57119 = -KeyEvent.getDeadChar(0, 0);
                    char c114 = (char) ((i57119 & 19730) + (i57119 | 19730));
                    Object[] objArr10118 = new Object[1];
                    a(i57116, i57118, c114, objArr10118);
                    String str4119 = (String) objArr10118[0];
                    int iResolveSizeAndState6 = View.resolveSizeAndState(0, 0, 0);
                    int i58110 = (iResolveSizeAndState6 & 875) + (iResolveSizeAndState6 | 875);
                    int capsMode3 = TextUtils.getCapsMode("", 0, 0);
                    int i58111 = (capsMode3 ^ 14) + ((capsMode3 & 14) << 1);
                    int doubleTapTimeout8 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                    j = j;
                    Object[] objArr10119 = new Object[1];
                    a(i58110, i58111, (char) ((doubleTapTimeout8 ^ 46241) + ((doubleTapTimeout8 & 46241) << 1)), objArr10119);
                    int i58112 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    char mirror9 = AndroidCharacter.getMirror('0');
                    Object[] objArr11110 = new Object[1];
                    a(((i58112 | 1087) << 1) - (i58112 ^ 1087), ((mirror9 | (-28)) << 1) - (mirror9 ^ (-28)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr11110);
                    String str518 = (String) objArr11110[0];
                    int i58113 = 1106 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                    int i58114 = -KeyEvent.keyCodeFromString("");
                    int iB114 = com.google.android.gms.internal.measurement.zzdm.b();
                    int i58115 = i58114 * TypedValues.Custom.TYPE_DIMENSION;
                    int i58116 = ((i58115 | (-17157)) << 1) - (i58115 ^ (-17157));
                    int i58117 = ~i58114;
                    int i58118 = ~((i58117 ^ iB114) | (i58117 & iB114));
                    int i58119 = ~iB114;
                    int i59110 = ~((i58119 ^ 19) | (i58119 & 19));
                    int i59111 = -(-(((i58118 & i59110) | (i58118 ^ i59110)) * (-1808)));
                    int i59112 = (i58116 & i59111) + (i58116 | i59111);
                    int i59113 = (i58117 ^ (-20)) | (i58117 & (-20));
                    int i59114 = ~((i59113 & iB114) | (i59113 ^ iB114));
                    int i59115 = ~iB114;
                    int i59116 = ~((i59115 & i58114) | (i59115 ^ i58114) | 19);
                    int i59117 = (i59112 - (~(((i59114 & i59116) | (i59114 ^ i59116)) * TypedValues.Custom.TYPE_BOOLEAN))) - 1;
                    int i59118 = (~(iB114 | (-20))) | (~(i58117 | 19));
                    int i59119 = ~((i58114 & i58119) | (i58119 ^ i58114));
                    int i60110 = i59117 + (((i59119 & i59118) | (i59118 ^ i59119)) * TypedValues.Custom.TYPE_BOOLEAN);
                    int keyRepeatDelay11 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    Object[] objArr11111 = new Object[1];
                    a(i58113, i60110, (char) ((keyRepeatDelay11 ^ 63607) + ((keyRepeatDelay11 & 63607) << 1)), objArr11111);
                    String str519 = (String) objArr11111[0];
                    int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 1126;
                    int i60111 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                    Object[] objArr11112 = new Object[1];
                    a(iCombineMeasuredStates3, (i60111 & 31) + (i60111 | 31), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr11112);
                    String str5110 = (String) objArr11112[0];
                    int i60112 = -(-ExpandableListView.getPackedPositionGroup(0L));
                    Object[] objArr11113 = new Object[1];
                    a((i60112 ^ 1157) + ((i60112 & 1157) << 1), TextUtils.getTrimmedLength("") + 26, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 34125), objArr11113);
                    String str5111 = (String) objArr11113[0];
                    Object[] objArr11114 = new Object[1];
                    a(1183 - TextUtils.getCapsMode("", 0, 0), 22 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) TextUtils.getTrimmedLength(""), objArr11114);
                    String str5112 = (String) objArr11114[0];
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0);
                    int i60113 = (absoluteGravity3 & 1206) + (absoluteGravity3 | 1206);
                    int i60114 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i60115 = -Gravity.getAbsoluteGravity(0, 0);
                    Object[] objArr11115 = new Object[1];
                    a(i60113, (i60114 & 33) + (i60114 | 33), (char) (((i60115 | 34703) << 1) - (i60115 ^ 34703)), objArr11115);
                    int defaultSize3 = View.getDefaultSize(0, 0);
                    int i60116 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i60117 = ((i60116 | 13) << 1) - (i60116 ^ 13);
                    int i60118 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr11116 = new Object[1];
                    a(((defaultSize3 | 1239) << 1) - (defaultSize3 ^ 1239), i60117, (char) ((i60118 ^ (-1)) + (i60118 << 1)), objArr11116);
                    String str5113 = (String) objArr11116[0];
                    int iRed8 = 818 - Color.red(0);
                    int i60119 = -KeyEvent.keyCodeFromString("");
                    int iB115 = com.google.android.gms.internal.measurement.zzdm.b();
                    int i61110 = (i60119 * 758) - 5292;
                    int i61111 = ~iB115;
                    int i61112 = -(-(((i60119 ^ i61111) | (i60119 & i61111)) * (-757)));
                    int i61113 = (((i61110 | i61112) << 1) - (i61110 ^ i61112)) + ((~(((-8) ^ i60119) | ((-8) & i60119) | iB115)) * 1514);
                    int i61114 = ~i60119;
                    int i61115 = ~((i61114 & (-8)) | (i61114 ^ (-8)));
                    int i61116 = ~((i61111 & (-8)) | ((-8) ^ i61111));
                    int i61117 = (i61115 & i61116) | (i61115 ^ i61116);
                    int i61118 = i60119 | 7;
                    int i61119 = ~((i61118 & iB115) | (i61118 ^ iB115));
                    int i62110 = -(-(((i61119 & i61117) | (i61117 ^ i61119)) * 757));
                    Object[] objArr11117 = new Object[1];
                    a(iRed8, (i61113 ^ i62110) + ((i62110 & i61113) << 1), (char) Gravity.getAbsoluteGravity(0, 0), objArr11117);
                    int iIndexOf15 = TextUtils.indexOf("", "", 0, 0);
                    int i62111 = ((iIndexOf15 | 1252) << 1) - (iIndexOf15 ^ 1252);
                    int i62112 = -KeyEvent.getDeadChar(0, 0);
                    int i62113 = (i62112 & 30) + (i62112 | 30);
                    int maximumFlingVelocity16 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    Object[] objArr11118 = new Object[1];
                    a(i62111, i62113, (char) (((maximumFlingVelocity16 | 41563) << 1) - (maximumFlingVelocity16 ^ 41563)), objArr11118);
                    int i62114 = -Color.rgb(0, 0, 0);
                    Object[] objArr11119 = new Object[1];
                    a((i62114 ^ (-16775934)) + ((i62114 & (-16775934)) << 1), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14063 - (~(-(Process.myTid() >> 22)))), objArr11119);
                    String str5114 = (String) objArr11119[0];
                    int i62115 = TuitionPaymentFragmentbindingInflater1;
                    int i62116 = ((i62115 | 33) << 1) - (i62115 ^ 33);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i62116 % 128;
                    int i62117 = i62116 % 2;
                    String[] strArr210 = {(String) objArr11118[0], str5114};
                    int maximumDrawingCacheSize4 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1293;
                    int i62118 = 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int scrollBarSize7 = ViewConfiguration.getScrollBarSize() >> 8;
                    Object[] objArr12110 = new Object[1];
                    a(maximumDrawingCacheSize4, i62118, (char) ((scrollBarSize7 & 16502) + (scrollBarSize7 | 16502)), objArr12110);
                    String str5115 = (String) objArr12110[0];
                    int packedPositionType6 = 1312 - ExpandableListView.getPackedPositionType(0L);
                    int bitsPerPixel6 = ImageFormat.getBitsPerPixel(0) + 6;
                    int i62119 = -Color.green(0);
                    Object[] objArr12111 = new Object[1];
                    a(packedPositionType6, bitsPerPixel6, (char) (((i62119 | 56418) << 1) - (i62119 ^ 56418)), objArr12111);
                    int i63110 = 1316 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                    int i63111 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i63112 = (i63111 ^ 20) + ((i63111 & 20) << 1);
                    int i63113 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    Object[] objArr12112 = new Object[1];
                    a(i63110, i63112, (char) ((i63113 & 41835) + (i63113 | 41835)), objArr12112);
                    int threadPriority10 = Process.getThreadPriority(0);
                    int i63114 = -(-((((threadPriority10 | 20) << 1) - (threadPriority10 ^ 20)) >> 6));
                    int i63115 = ((i63114 | 1336) << 1) - (i63114 ^ 1336);
                    int i63116 = -(-TextUtils.getCapsMode("", 0, 0));
                    int i63117 = (i63116 ^ 16) + ((i63116 & 16) << 1);
                    int keyRepeatDelay12 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int i63118 = (keyRepeatDelay12 * (-1335)) - 36049349;
                    int i63119 = (keyRepeatDelay12 ^ i6) | (keyRepeatDelay12 & i6);
                    int i64110 = -(-(((~i63119) | (-54048)) * (-668)));
                    int i64111 = ((i63118 | i64110) << 1) - (i63118 ^ i64110);
                    int i64112 = ~((-54048) | i6);
                    int i64113 = ((keyRepeatDelay12 & i64112) | (keyRepeatDelay12 ^ i64112)) * 1336;
                    int i64114 = (i64111 & i64113) + (i64113 | i64111);
                    int i64115 = -(-(((i63119 ^ (-54048)) | (i63119 & (-54048))) * 668));
                    char c115 = (char) ((i64114 ^ i64115) + ((i64115 & i64114) << 1));
                    Object[] objArr12113 = new Object[1];
                    a(i63115, i63117, c115, objArr12113);
                    int i64116 = 1351 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
                    int i64117 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                    int i64118 = ((i64117 | 19) << 1) - (i64117 ^ 19);
                    int i64119 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr12114 = new Object[1];
                    a(i64116, i64118, (char) (((i64119 | 8108) << 1) - (i64119 ^ 8108)), objArr12114);
                    int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1371;
                    int i65110 = -(-ExpandableListView.getPackedPositionGroup(0L));
                    int i65111 = (i65110 & 19) + (i65110 | 19);
                    int i65112 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr12115 = new Object[1];
                    a(windowTouchSlop4, i65111, (char) ((i65112 ^ 48916) + ((i65112 & 48916) << 1)), objArr12115);
                    int i65113 = -Color.red(0);
                    int i65114 = (i65113 & 1390) + (i65113 | 1390);
                    int scrollBarFadeDuration4 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    Object[] objArr12116 = new Object[1];
                    a(i65114, ((scrollBarFadeDuration4 | 23) << 1) - (scrollBarFadeDuration4 ^ 23), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr12116);
                    int i65115 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i65116 = ((i65115 | 1414) << 1) - (i65115 ^ 1414);
                    int i65117 = -TextUtils.getTrimmedLength("");
                    int i65118 = ((i65117 | 21) << 1) - (i65117 ^ 21);
                    int threadPriority11 = Process.getThreadPriority(0);
                    char c116 = (char) (45738 - (~(-(((threadPriority11 & 20) + (threadPriority11 | 20)) >> 6))));
                    Object[] objArr12117 = new Object[1];
                    a(i65116, i65118, c116, objArr12117);
                    int i65119 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int i66110 = -Color.rgb(0, 0, 0);
                    Object[] objArr12118 = new Object[1];
                    a((i65119 & 1434) + (i65119 | 1434), (i66110 & (-16777192)) + (i66110 | (-16777192)), (char) View.resolveSizeAndState(0, 0, 0), objArr12118);
                    String str5116 = str;
                    int i66111 = -TextUtils.indexOf("", "");
                    int i66112 = (i66111 ^ 1458) + ((i66111 & 1458) << 1);
                    int i66113 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i66114 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr12119 = new Object[1];
                    a(i66112, i66113, (char) ((i66114 & 1) + (i66114 | 1)), objArr12119);
                    int i66115 = 1485 - (~Color.red(0));
                    int i66116 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i66117 = (i66116 ^ 26) + ((i66116 & 26) << 1);
                    int i66118 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr13110 = new Object[1];
                    a(i66115, i66117, (char) ((i66118 ^ (-1)) + (i66118 << 1)), objArr13110);
                    int i66119 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i67110 = (i66119 & 1513) + (i66119 | 1513);
                    int i67111 = -(-TextUtils.indexOf("", "", 0));
                    Object[] objArr13111 = new Object[1];
                    a(i67110, (i67111 ^ 31) + ((i67111 & 31) << 1), (char) (6270 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr13111);
                    int i67112 = -(-ExpandableListView.getPackedPositionChild(0L));
                    int i67113 = (i67112 ^ 1545) + ((i67112 & 1545) << 1);
                    int i67114 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i67115 = (i67114 ^ 28) + ((i67114 & 28) << 1);
                    int i67116 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr13112 = new Object[1];
                    a(i67113, i67115, (char) ((i67116 & 13095) + (i67116 | 13095)), objArr13112);
                    int i67117 = 1570 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i67118 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr13113 = new Object[1];
                    a(i67117, (i67118 ^ 33) + ((i67118 & 33) << 1), (char) ((-2) - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr13113);
                    strArr5 = new String[][]{new String[]{str2110, str2111, str2112, (String) objArr8112[0]}, new String[]{str2113, str3110, str3111, str3112, (String) objArr8117[0]}, new String[]{str3113, str3114, str, str3115, str3116, str3117}, new String[]{str3118, str3119, str4110, (String) objArr9116[0]}, new String[]{str4111, str4112, (String) objArr9119[0]}, new String[]{str4113, (String) objArr10111[0]}, new String[]{str4114, (String) objArr10113[0]}, new String[]{str4115, str4116, str4117, str4118, str4119, (String) objArr10119[0]}, new String[]{str518, str519, str5110, str5111, str5112, (String) objArr11115[0], str}, new String[]{str5113, (String) objArr11117[0]}, strArr210, new String[]{str5115, (String) objArr12111[0]}, new String[]{(String) objArr12112[0]}, new String[]{(String) objArr12113[0]}, new String[]{(String) objArr12114[0]}, new String[]{(String) objArr12115[0]}, new String[]{(String) objArr12116[0]}, new String[]{(String) objArr12117[0]}, new String[]{(String) objArr12118[0], str5116}, new String[]{(String) objArr12119[0], str5116}, new String[]{(String) objArr13110[0], str5116}, new String[]{(String) objArr13111[0], str5116}, new String[]{(String) objArr13112[0], str5116}, new String[]{(String) objArr13113[0], str5116}};
                    int i67119 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i68110 = ((i67119 | 1603) << 1) - (i67119 ^ 1603);
                    int i68111 = -(Process.myPid() >> 22);
                    int i68112 = -KeyEvent.normalizeMetaState(0);
                    Object[] objArr13114 = new Object[1];
                    a(i68110, ((i68111 | 1) << 1) - (i68111 ^ 1), (char) ((i68112 & 62047) + (i68112 | 62047)), objArr13114);
                    sb = new StringBuilder((String) objArr13114[0]);
                    i59 = i6;
                    i60 = 0;
                    i61 = 0;
                    while (i60 < 24) {
                        i63 = TuitionPaymentFragmentbindingInflater1 + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i63 % 128;
                        if (i63 % 2 != 0) {
                            String[] strArr211 = strArr5[i60];
                            Object[] objArr13115 = {strArr211[1]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char cNormalizeMetaState3 = (char) (33602 - KeyEvent.normalizeMetaState(0));
                                int iResolveSizeAndState7 = 3085 - View.resolveSizeAndState(0, 0, 0);
                                int i68113 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                                byte b316 = (byte) 0;
                                byte b317 = (byte) (b316 + 5);
                                Object[] objArr13116 = new Object[1];
                                c(b316, b317, (byte) (b317 - 5), objArr13116);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState3, iResolveSizeAndState7, i68113, 1411172903, false, (String) objArr13116[0], new Class[]{String.class});
                            }
                            str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr13115);
                            strArr7 = strArr211;
                            strArr5 = strArr5;
                        } else {
                            i58 = i58;
                            strArr7 = strArr5[i60];
                            Object[] objArr13117 = {strArr7[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cAlpha3 = (char) (33602 - Color.alpha(0));
                                int maximumFlingVelocity17 = 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int iAxisFromString7 = 25 - MotionEvent.axisFromString("");
                                byte b318 = (byte) 0;
                                byte b319 = (byte) (b318 + 5);
                                Object[] objArr13118 = new Object[1];
                                c(b318, b319, (byte) (b319 - 5), objArr13118);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha3, maximumFlingVelocity17, iAxisFromString7, 1411172903, false, (String) objArr13118[0], new Class[]{String.class});
                            }
                            str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr13117);
                        }
                        String[] strArr212 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                        if (str5 == null && !str5.isEmpty()) {
                            int i859 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i860 = (i859 & 35) + (i859 | 35);
                            TuitionPaymentFragmentbindingInflater1 = i860 % 128;
                            int i861 = i860 % 2;
                            if (strArr7.length != 1) {
                                int length6 = strArr212.length;
                                int i862 = 0;
                                while (true) {
                                    if (i862 < length6) {
                                        if (str5.contains(strArr212[i862])) {
                                            int i863 = i60 + 10;
                                            i59 = ((~i863) & i6) | (i863 & i54);
                                            i64 = i61 + 1;
                                            if (i64 > 1) {
                                                int i864 = 1604 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                int keyRepeatDelay13 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                int i865 = (keyRepeatDelay13 ^ 2) + ((keyRepeatDelay13 & 2) << 1);
                                                int i866 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                iB = com.google.android.gms.internal.measurement.zzdm.b();
                                                int i867 = i866 * (-523);
                                                i66 = (i867 ^ 12360211) + ((i867 & 12360211) << 1);
                                                int i868 = ~i866;
                                                int i869 = (i868 ^ 46997) | (i868 & 46997);
                                                int i870 = ~i869;
                                                int i871 = ~(((-46998) ^ i866) | ((-46998) & i866));
                                                i67 = (i870 ^ i871) | (i871 & i870);
                                                i68 = TuitionPaymentFragmentbindingInflater1 + 75;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i68 % 128;
                                                if (i68 % 2 != 0) {
                                                    i69 = i66 << (262 % (i67 | (~((-46998) | iB))));
                                                } else {
                                                    int i872 = ~(((-46998) ^ iB) | ((-46998) & iB));
                                                    i69 = (i66 - (~(-(-(((i67 ^ i872) | (i67 & i872)) * 262))))) - 1;
                                                }
                                                int i873 = i69 + ((-786) * (~(((-46998) ^ i866) | ((-46998) & i866))));
                                                int i874 = ~iB;
                                                int i875 = (~(((-46998) & i874) | ((-46998) ^ i874))) | (~i869);
                                                int i876 = ~((i866 & (-46998)) | ((-46998) ^ i866));
                                                int i877 = ((i876 & i875) | (i875 ^ i876)) * 262;
                                                char c25 = (char) (((i873 | i877) << 1) - (i873 ^ i877));
                                                Object[] objArr187 = new Object[1];
                                                a(i864, i865, c25, objArr187);
                                                i65 = 0;
                                                sb.append((String) objArr187[0]);
                                            } else {
                                                i65 = 0;
                                            }
                                            sb.append(strArr7[i65]);
                                            int i878 = -Color.argb(i65, i65, i65, i65);
                                            int i879 = (i878 ^ 1606) + ((i878 & 1606) << 1);
                                            int i880 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            Object[] objArr188 = new Object[1];
                                            a(i879, (i880 ^ 1) + ((i880 & 1) << 1), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr188);
                                            sb.append((String) objArr188[0]);
                                            sb.append(str5);
                                            i61 = i64;
                                        } else {
                                            i862++;
                                        }
                                    }
                                }
                            } else {
                                int i8610 = i60 + 10;
                                i59 = ((~i8610) & i6) | (i8610 & i54);
                                i64 = i61 + 1;
                                if (i64 > 1) {
                                    int i8611 = 1604 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                    int keyRepeatDelay14 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    int i8612 = (keyRepeatDelay14 ^ 2) + ((keyRepeatDelay14 & 2) << 1);
                                    int i8613 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    iB = com.google.android.gms.internal.measurement.zzdm.b();
                                    int i8614 = i8613 * (-523);
                                    i66 = (i8614 ^ 12360211) + ((i8614 & 12360211) << 1);
                                    int i8615 = ~i8613;
                                    int i8616 = (i8615 ^ 46997) | (i8615 & 46997);
                                    int i8710 = ~i8616;
                                    int i8711 = ~(((-46998) ^ i8613) | ((-46998) & i8613));
                                    i67 = (i8710 ^ i8711) | (i8711 & i8710);
                                    i68 = TuitionPaymentFragmentbindingInflater1 + 75;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i68 % 128;
                                    if (i68 % 2 != 0) {
                                        i69 = i66 << (262 % (i67 | (~((-46998) | iB))));
                                    } else {
                                        int i8712 = ~(((-46998) ^ iB) | ((-46998) & iB));
                                        i69 = (i66 - (~(-(-(((i67 ^ i8712) | (i67 & i8712)) * 262))))) - 1;
                                    }
                                    int i8713 = i69 + ((-786) * (~(((-46998) ^ i8613) | ((-46998) & i8613))));
                                    int i8714 = ~iB;
                                    int i8715 = (~(((-46998) & i8714) | ((-46998) ^ i8714))) | (~i8616);
                                    int i8716 = ~((i8613 & (-46998)) | ((-46998) ^ i8613));
                                    int i8717 = ((i8716 & i8715) | (i8715 ^ i8716)) * 262;
                                    char c26 = (char) (((i8713 | i8717) << 1) - (i8713 ^ i8717));
                                    Object[] objArr189 = new Object[1];
                                    a(i8611, i8612, c26, objArr189);
                                    i65 = 0;
                                    sb.append((String) objArr189[0]);
                                } else {
                                    i65 = 0;
                                }
                                sb.append(strArr7[i65]);
                                int i8718 = -Color.argb(i65, i65, i65, i65);
                                int i8719 = (i8718 ^ 1606) + ((i8718 & 1606) << 1);
                                int i881 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                Object[] objArr1810 = new Object[1];
                                a(i8719, (i881 ^ 1) + ((i881 & 1) << 1), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr1810);
                                sb.append((String) objArr1810[0]);
                                sb.append(str5);
                                i61 = i64;
                            }
                        }
                        i60 = (i60 | 1) + (i60 & 1);
                        i58 = i58;
                        strArr5 = strArr5;
                    }
                    int i68114 = i58;
                    Object[] objArr13119 = new Object[1];
                    a(1606 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), -TextUtils.indexOf((CharSequence) "", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr13119);
                    sb.append((String) objArr13119[0]);
                    objArr2 = new Object[2];
                    if (i61 > 2) {
                        objArr2[0] = new int[1];
                        String[] strArr213 = {sb.toString()};
                        ((int[]) objArr2[0])[0] = i59;
                        objArr2[1] = strArr213;
                    } else {
                        objArr2[0] = new int[]{i6};
                        objArr2[1] = new String[0];
                    }
                    int i68115 = ((int[]) objArr2[0])[0];
                    int i68116 = (~(i6 & i68114)) & (i6 | i68114);
                    int i68117 = -i68116;
                    int i68118 = ((i68116 & i68117) | (i68116 ^ i68117)) >> 31;
                    int i68119 = i68115 & (~i68118);
                    int i6910 = i68114 & i68118;
                    strArr6 = (String[]) objArr2[1];
                    i58 = (i68119 & i6910) | (i68119 ^ i6910);
                    i62 = 0;
                }
            } else {
                int iResolveOpacity4 = 370 - Drawable.resolveOpacity(0, 0);
                int iResolveSize4 = View.resolveSize(0, 0);
                Object[] objArr7111 = new Object[1];
                a(iResolveOpacity4, (iResolveSize4 ^ 23) + ((iResolveSize4 & 23) << 1), (char) KeyEvent.keyCodeFromString(""), objArr7111);
                String str2114 = (String) objArr7111[0];
                int iIndexOf16 = TextUtils.indexOf("", "") + 808;
                int minimumFlingVelocity5 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                int i43119 = -AndroidCharacter.getMirror('0');
                char c117 = (char) ((i43119 & 48) + (i43119 | 48));
                Object[] objArr81110 = new Object[1];
                a(iIndexOf16, minimumFlingVelocity5, c117, objArr81110);
                String str2115 = (String) objArr81110[0];
                int i431110 = -ExpandableListView.getPackedPositionGroup(0L);
                int i431111 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr81111 = new Object[1];
                a(((i431110 | 818) << 1) - (i431110 ^ 818), (i431111 & 7) + (i431111 | 7), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr81111);
                String str2116 = (String) objArr81111[0];
                int fadingEdgeLength6 = ViewConfiguration.getFadingEdgeLength() >> 16;
                Object[] objArr81112 = new Object[1];
                a((fadingEdgeLength6 & 825) + (fadingEdgeLength6 | 825), 8 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), (char) KeyEvent.getDeadChar(0, 0), objArr81112);
                int i431112 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int i431113 = ((i431112 | 832) << 1) - (i431112 ^ 832);
                int i431114 = -Color.alpha(0);
                Object[] objArr81113 = new Object[1];
                a(i431113, (i431114 & 17) + (i431114 | 17), (char) TextUtils.indexOf("", ""), objArr81113);
                String str2117 = (String) objArr81113[0];
                int i431115 = 849 - (~(-Color.blue(0)));
                int i431116 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i431117 = i431116 * 569;
                int i441110 = (i431117 ^ 3983) + ((i431117 & 3983) << 1);
                int i441111 = ~i431116;
                int i441112 = ~((i441111 ^ (-8)) | (i441111 & (-8)));
                int i441113 = ~((i441111 ^ i12) | (i441111 & i12));
                int i441114 = (i441112 & i441113) | (i441112 ^ i441113);
                int i441115 = ~(((-8) ^ i12) | ((-8) & i12));
                int i441116 = ((i441114 & i441115) | (i441114 ^ i441115)) * (-1136);
                int i441117 = ((i441110 | i441116) << 1) - (i441110 ^ i441116);
                int i441118 = ~((i441111 & i6) | (i441111 ^ i6));
                int i441119 = ~(((-8) ^ i6) | ((-8) & i6));
                int i451110 = (i441118 & i441119) | (i441118 ^ i441119);
                int i451111 = i54 | i431116;
                int i451112 = ~((i451111 & 7) | (i451111 ^ 7));
                int i451113 = -(-(((i451110 & i451112) | (i451110 ^ i451112)) * (-568)));
                int i451114 = ((i441117 | i451113) << 1) - (i451113 ^ i441117);
                int i451115 = ~((i54 ^ i431116) | (i54 & i431116));
                int i451116 = ~((i12 ^ 7) | (i12 & 7));
                int i451117 = ~i431116;
                int i451118 = (i451117 & (-8)) | (i451117 ^ (-8));
                int i451119 = (i451114 - (~(-(-(((~((i451118 & i6) | (i451118 ^ i6))) | ((i451115 & i451116) | (i451115 ^ i451116))) * 568))))) - 1;
                int i461110 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                Object[] objArr81114 = new Object[1];
                a(i431115, i451119, (char) ((i461110 ^ 42790) + ((i461110 & 42790) << 1)), objArr81114);
                String str31110 = (String) objArr81114[0];
                int i461111 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int i461112 = ((i461111 | 856) << 1) - (i461111 ^ 856);
                int i461113 = -((byte) KeyEvent.getModifierMetaStateMask());
                int iB116 = com.google.android.gms.internal.measurement.zzdm.b();
                int i461114 = i461113 * 881;
                int i461115 = ((i461114 | 5286) << 1) - (i461114 ^ 5286);
                int i461116 = ~i461113;
                int i461117 = ~((i461116 & (-7)) | (i461116 ^ (-7)));
                int i461118 = ~i461113;
                int i461119 = (i461115 - (~(-(-((((~((i461118 ^ iB116) | (i461118 & iB116))) | i461117) | (~(((-7) ^ iB116) | ((-7) & iB116)))) * (-880)))))) - 1;
                int i471110 = ~((~iB116) | i461118);
                int i471111 = (i471110 & 6) | (i471110 ^ 6);
                int i471112 = (i461113 & iB116) | (i461113 ^ iB116);
                int i471113 = ~i471112;
                int i471114 = -(-(((i471113 & i471111) | (i471111 ^ i471113)) * (-880)));
                int i471115 = (i461119 & i471114) + (i471114 | i461119);
                int i471116 = (~i471112) * 880;
                int i471117 = (i471115 & i471116) + (i471116 | i471115);
                int iRgb11 = Color.rgb(0, 0, 0);
                Object[] objArr81115 = new Object[1];
                a(i461112, i471117, (char) (((iRgb11 | 16777216) << 1) - (iRgb11 ^ 16777216)), objArr81115);
                String str31111 = (String) objArr81115[0];
                int packedPositionGroup5 = ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr81116 = new Object[1];
                a((packedPositionGroup5 ^ 864) + ((packedPositionGroup5 & 864) << 1), 11 - Color.alpha(0), (char) (19729 - (~(-Color.green(0)))), objArr81116);
                String str31112 = (String) objArr81116[0];
                int i471118 = 874 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                int i471119 = -(-Color.argb(0, 0, 0, 0));
                int i481110 = (i471119 & 14) + (i471119 | 14);
                int touchSlop6 = ViewConfiguration.getTouchSlop() >> 8;
                int i481111 = (touchSlop6 * (-495)) - 22889295;
                int i481112 = ~touchSlop6;
                int i481113 = ~(i481112 | (-46242));
                int i481114 = ~((i481112 ^ i6) | (i481112 & i6));
                int i481115 = ((i481113 ^ i481114) | (i481113 & i481114)) * 992;
                int i481116 = (i481111 & i481115) + (i481115 | i481111);
                int i481117 = ~(((-46242) & i481112) | (i481112 ^ (-46242)));
                int i481118 = ~((~touchSlop6) | i6);
                int i481119 = (i481117 & i481118) | (i481117 ^ i481118);
                int i491110 = (i12 ^ touchSlop6) | (i12 & touchSlop6);
                char c118 = (char) (i481116 + ((i481119 | (~((i491110 & 46241) | (i491110 ^ 46241)))) * (-496)) + (((i6 ^ 46241) | (i6 & 46241)) * 496));
                Object[] objArr81117 = new Object[1];
                a(i471118, i481110, c118, objArr81117);
                int i491111 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 889;
                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("");
                int iB117 = com.google.android.gms.internal.measurement.zzdm.b();
                int i491112 = ~(((-17) ^ iKeyCodeFromString4) | ((-17) & iKeyCodeFromString4));
                int i491113 = ~iKeyCodeFromString4;
                int i491114 = ~(i491113 | 16 | iB117);
                int i491115 = (((iKeyCodeFromString4 * (-500)) - 8000) - (~(-(-(((i491112 & i491114) | (i491112 ^ i491114)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1;
                int i491116 = (~(((-17) & i491113) | (i491113 ^ (-17)))) * 1002;
                int i491117 = ~iKeyCodeFromString4;
                int i491118 = ~iB117;
                int i491119 = (i491117 & i491118) | (i491117 ^ i491118);
                Object[] objArr81118 = new Object[1];
                a(i491111, ((((i491115 | i491116) << 1) - (i491115 ^ i491116)) - (~(-(-((~((i491119 & 16) | (i491119 ^ 16))) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16097), objArr81118);
                String str31113 = (String) objArr81118[0];
                int iRgb12 = Color.rgb(0, 0, 0) + 16778121;
                int i501110 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i501111 = ((i501110 | 4) << 1) - (i501110 ^ 4);
                int i501112 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                Object[] objArr81119 = new Object[1];
                a(iRgb12, i501111, (char) (((i501112 | 33182) << 1) - (i501112 ^ 33182)), objArr81119);
                String str31114 = (String) objArr81119[0];
                int i501113 = -TextUtils.indexOf("", "");
                int i501114 = (i501113 ^ 916) + ((i501113 & 916) << 1);
                int i501115 = -KeyEvent.normalizeMetaState(0);
                int i501116 = ((i501115 | 22) << 1) - (i501115 ^ 22);
                int i501117 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                Object[] objArr91110 = new Object[1];
                a(i501114, i501116, (char) ((i501117 & 8999) + (i501117 | 8999)), objArr91110);
                String str31115 = (String) objArr91110[0];
                int i501118 = -Color.red(0);
                int i501119 = ((i501118 | 938) << 1) - (i501118 ^ 938);
                int i511110 = -KeyEvent.normalizeMetaState(0);
                int i511111 = (i511110 ^ 25) + ((i511110 & 25) << 1);
                int iLastIndexOf14 = TextUtils.lastIndexOf("", '0');
                int iB118 = com.google.android.gms.internal.measurement.zzdm.b();
                int i511112 = (iLastIndexOf14 * 758) - 30106188;
                int i511113 = ~iB118;
                int i511114 = -(-(((iLastIndexOf14 ^ i511113) | (i511113 & iLastIndexOf14)) * (-757)));
                int i511115 = (i511112 ^ i511114) + ((i511112 & i511114) << 1);
                int i511116 = (-39824) | iLastIndexOf14;
                int i511117 = i511115 + ((~((i511116 & iB118) | (i511116 ^ iB118))) * 1514);
                int i511118 = ~iLastIndexOf14;
                int i511119 = ~((i511118 ^ (-39824)) | (i511118 & (-39824)));
                int i521110 = ~iB118;
                int i521111 = (iLastIndexOf14 & 39823) | (iLastIndexOf14 ^ 39823);
                char c119 = (char) ((i511117 - (~((((~(((-39824) ^ i521110) | (i521110 & (-39824)))) | i511119) | (~((i521111 & iB118) | (i521111 ^ iB118)))) * 757))) - 1);
                Object[] objArr91111 = new Object[1];
                a(i501119, i511111, c119, objArr91111);
                String str31116 = (String) objArr91111[0];
                int i521112 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                Object[] objArr91112 = new Object[1];
                a((i521112 ^ 963) + ((i521112 & 963) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 28, (char) Color.green(0), objArr91112);
                String str31117 = (String) objArr91112[0];
                int i521113 = -(-Drawable.resolveOpacity(0, 0));
                int i521114 = (i521113 & 991) + (i521113 | 991);
                int i521115 = 10 - (~(-Color.red(0)));
                int i521116 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr91113 = new Object[1];
                a(i521114, i521115, (char) ((i521116 & 1) + (i521116 | 1)), objArr91113);
                String str31118 = (String) objArr91113[0];
                int i521117 = 1003 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i521118 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                Object[] objArr91114 = new Object[1];
                a(i521117, ((i521118 | 7) << 1) - (i521118 ^ 7), (char) ExpandableListView.getPackedPositionGroup(0L), objArr91114);
                String str31119 = (String) objArr91114[0];
                Object[] objArr91115 = new Object[1];
                a(1008 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), 4 - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr91115);
                String str41110 = (String) objArr91115[0];
                int i521119 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr91116 = new Object[1];
                a((i521119 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + (i521119 | PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW), 5 - (~Color.red(0)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr91116);
                int iRgb13 = Color.rgb(0, 0, 0) + 16778238;
                int i531110 = -TextUtils.getOffsetBefore("", 0);
                int i531111 = (i531110 & 16) + (i531110 | 16);
                int i531112 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iB119 = com.google.android.gms.internal.measurement.zzdm.b();
                int i531113 = i531112 * 302;
                int i531114 = (i531113 & 15473583) + (i531113 | 15473583);
                int i531115 = ~i531112;
                int i531116 = ~iB119;
                int i531117 = ~((i531115 ^ i531116) | (i531115 & i531116));
                int i531118 = -(-(((i531117 ^ 25661) | (i531117 & 25661)) * (-602)));
                int i531119 = ((i531114 | i531118) << 1) - (i531118 ^ i531114);
                int i541110 = ~((i531115 ^ (-25662)) | (i531115 & (-25662)));
                int i541111 = ~i531112;
                int i541112 = -(-(((~(i531112 | i531116 | 25661)) | i541110 | (~((iB119 & i541111) | (i541111 ^ iB119)))) * (-301)));
                int i541113 = (i531119 ^ i541112) + ((i541112 & i531119) << 1);
                int i541114 = -(-((~(i531116 | 25661)) * 301));
                char c1110 = (char) ((i541113 ^ i541114) + ((i541114 & i541113) << 1));
                Object[] objArr91117 = new Object[1];
                a(iRgb13, i531111, c1110, objArr91117);
                String str41111 = (String) objArr91117[0];
                int i541115 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i541116 = ((i541115 | 857) << 1) - (i541115 ^ 857);
                int i541117 = -Color.green(0);
                Object[] objArr91118 = new Object[1];
                a(i541116, (i541117 & 7) + (i541117 | 7), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr91118);
                String str41112 = (String) objArr91118[0];
                int i541118 = -View.MeasureSpec.getSize(0);
                int i541119 = ((i541118 | 825) << 1) - (i541118 ^ 825);
                int i551110 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i551111 = ((i551110 | 9) << 1) - (i551110 ^ 9);
                int i551112 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr91119 = new Object[1];
                a(i541119, i551111, (char) ((i551112 & 1) + (i551112 | 1)), objArr91119);
                int offsetAfter9 = TextUtils.getOffsetAfter("", 0) + 1038;
                int doubleTapTimeout9 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                int i551113 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr101110 = new Object[1];
                a(offsetAfter9, doubleTapTimeout9, (char) ((i551113 & 3459) + (i551113 | 3459)), objArr101110);
                String str41113 = (String) objArr101110[0];
                int i551114 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i551115 = ((i551114 | 1052) << 1) - (i551114 ^ 1052);
                int i551116 = -Color.argb(0, 0, 0, 0);
                int i551117 = ((i551116 | 1) << 1) - (i551116 ^ 1);
                int i551118 = -TextUtils.lastIndexOf("", '0');
                Object[] objArr101111 = new Object[1];
                a(i551115, i551117, (char) ((i551118 & 1153) + (i551118 | 1153)), objArr101111);
                int iMyTid8 = Process.myTid() >> 22;
                int i551119 = (iMyTid8 & 1053) + (iMyTid8 | 1053);
                int i561110 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8;
                int i561111 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                Object[] objArr101112 = new Object[1];
                a(i551119, i561110, (char) ((i561111 ^ 480) + ((i561111 & 480) << 1)), objArr101112);
                String str41114 = (String) objArr101112[0];
                int i561112 = 1060 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                int i561113 = -Color.green(0);
                Object[] objArr101113 = new Object[1];
                a(i561112, ((i561113 | 1) << 1) - (i561113 ^ 1), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr101113);
                int i561114 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i561115 = ((i561114 | 1064) << 1) - (i561114 ^ 1064);
                int keyRepeatDelay15 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16;
                int i561116 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                Object[] objArr101114 = new Object[1];
                a(i561115, keyRepeatDelay15, (char) ((i561116 ^ 59327) + ((i561116 & 59327) << 1)), objArr101114);
                String str41115 = (String) objArr101114[0];
                int i561117 = 904 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                int i561118 = -(Process.myTid() >> 22);
                int i561119 = (i561118 ^ 3) + ((i561118 & 3) << 1);
                int i571110 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr101115 = new Object[1];
                a(i561117, i561119, (char) ((i571110 ^ 33183) + ((i571110 & 33183) << 1)), objArr101115);
                String str41116 = (String) objArr101115[0];
                int iRed9 = Color.red(0);
                int i571111 = (iRed9 ^ 850) + ((iRed9 & 850) << 1);
                int i571112 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i571113 = (i571112 & 6) + (i571112 | 6);
                int i571114 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr101116 = new Object[1];
                a(i571111, i571113, (char) ((i571114 & 42790) + (i571114 | 42790)), objArr101116);
                String str41117 = (String) objArr101116[0];
                int maximumFlingVelocity18 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                Object[] objArr101117 = new Object[1];
                a(((maximumFlingVelocity18 | 1079) << 1) - (maximumFlingVelocity18 ^ 1079), 7 - (~(-(-Gravity.getAbsoluteGravity(0, 0)))), (char) TextUtils.indexOf("", "", 0, 0), objArr101117);
                String str41118 = (String) objArr101117[0];
                int i571115 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int i571116 = (i571115 ^ 864) + ((i571115 & 864) << 1);
                int i571117 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i571118 = (i571117 ^ 11) + ((i571117 & 11) << 1);
                int i571119 = -KeyEvent.getDeadChar(0, 0);
                char c1111 = (char) ((i571119 & 19730) + (i571119 | 19730));
                Object[] objArr101118 = new Object[1];
                a(i571116, i571118, c1111, objArr101118);
                String str41119 = (String) objArr101118[0];
                int iResolveSizeAndState8 = View.resolveSizeAndState(0, 0, 0);
                int i581110 = (iResolveSizeAndState8 & 875) + (iResolveSizeAndState8 | 875);
                int capsMode4 = TextUtils.getCapsMode("", 0, 0);
                int i581111 = (capsMode4 ^ 14) + ((capsMode4 & 14) << 1);
                int doubleTapTimeout10 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                j = j;
                Object[] objArr101119 = new Object[1];
                a(i581110, i581111, (char) ((doubleTapTimeout10 ^ 46241) + ((doubleTapTimeout10 & 46241) << 1)), objArr101119);
                int i581112 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                char mirror10 = AndroidCharacter.getMirror('0');
                Object[] objArr111110 = new Object[1];
                a(((i581112 | 1087) << 1) - (i581112 ^ 1087), ((mirror10 | (-28)) << 1) - (mirror10 ^ (-28)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr111110);
                String str5117 = (String) objArr111110[0];
                int i581113 = 1106 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                int i581114 = -KeyEvent.keyCodeFromString("");
                int iB1110 = com.google.android.gms.internal.measurement.zzdm.b();
                int i581115 = i581114 * TypedValues.Custom.TYPE_DIMENSION;
                int i581116 = ((i581115 | (-17157)) << 1) - (i581115 ^ (-17157));
                int i581117 = ~i581114;
                int i581118 = ~((i581117 ^ iB1110) | (i581117 & iB1110));
                int i581119 = ~iB1110;
                int i591110 = ~((i581119 ^ 19) | (i581119 & 19));
                int i591111 = -(-(((i581118 & i591110) | (i581118 ^ i591110)) * (-1808)));
                int i591112 = (i581116 & i591111) + (i581116 | i591111);
                int i591113 = (i581117 ^ (-20)) | (i581117 & (-20));
                int i591114 = ~((i591113 & iB1110) | (i591113 ^ iB1110));
                int i591115 = ~iB1110;
                int i591116 = ~((i591115 & i581114) | (i591115 ^ i581114) | 19);
                int i591117 = (i591112 - (~(((i591114 & i591116) | (i591114 ^ i591116)) * TypedValues.Custom.TYPE_BOOLEAN))) - 1;
                int i591118 = (~(iB1110 | (-20))) | (~(i581117 | 19));
                int i591119 = ~((i581114 & i581119) | (i581119 ^ i581114));
                int i601110 = i591117 + (((i591119 & i591118) | (i591118 ^ i591119)) * TypedValues.Custom.TYPE_BOOLEAN);
                int keyRepeatDelay16 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                Object[] objArr111111 = new Object[1];
                a(i581113, i601110, (char) ((keyRepeatDelay16 ^ 63607) + ((keyRepeatDelay16 & 63607) << 1)), objArr111111);
                String str5118 = (String) objArr111111[0];
                int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 1126;
                int i601111 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                Object[] objArr111112 = new Object[1];
                a(iCombineMeasuredStates4, (i601111 & 31) + (i601111 | 31), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr111112);
                String str5119 = (String) objArr111112[0];
                int i601112 = -(-ExpandableListView.getPackedPositionGroup(0L));
                Object[] objArr111113 = new Object[1];
                a((i601112 ^ 1157) + ((i601112 & 1157) << 1), TextUtils.getTrimmedLength("") + 26, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 34125), objArr111113);
                String str51110 = (String) objArr111113[0];
                Object[] objArr111114 = new Object[1];
                a(1183 - TextUtils.getCapsMode("", 0, 0), 22 - (~(-(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) TextUtils.getTrimmedLength(""), objArr111114);
                String str51111 = (String) objArr111114[0];
                int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0);
                int i601113 = (absoluteGravity4 & 1206) + (absoluteGravity4 | 1206);
                int i601114 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i601115 = -Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr111115 = new Object[1];
                a(i601113, (i601114 & 33) + (i601114 | 33), (char) (((i601115 | 34703) << 1) - (i601115 ^ 34703)), objArr111115);
                int defaultSize4 = View.getDefaultSize(0, 0);
                int i601116 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i601117 = ((i601116 | 13) << 1) - (i601116 ^ 13);
                int i601118 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr111116 = new Object[1];
                a(((defaultSize4 | 1239) << 1) - (defaultSize4 ^ 1239), i601117, (char) ((i601118 ^ (-1)) + (i601118 << 1)), objArr111116);
                String str51112 = (String) objArr111116[0];
                int iRed10 = 818 - Color.red(0);
                int i601119 = -KeyEvent.keyCodeFromString("");
                int iB1111 = com.google.android.gms.internal.measurement.zzdm.b();
                int i611110 = (i601119 * 758) - 5292;
                int i611111 = ~iB1111;
                int i611112 = -(-(((i601119 ^ i611111) | (i601119 & i611111)) * (-757)));
                int i611113 = (((i611110 | i611112) << 1) - (i611110 ^ i611112)) + ((~(((-8) ^ i601119) | ((-8) & i601119) | iB1111)) * 1514);
                int i611114 = ~i601119;
                int i611115 = ~((i611114 & (-8)) | (i611114 ^ (-8)));
                int i611116 = ~((i611111 & (-8)) | ((-8) ^ i611111));
                int i611117 = (i611115 & i611116) | (i611115 ^ i611116);
                int i611118 = i601119 | 7;
                int i611119 = ~((i611118 & iB1111) | (i611118 ^ iB1111));
                int i621110 = -(-(((i611119 & i611117) | (i611117 ^ i611119)) * 757));
                Object[] objArr111117 = new Object[1];
                a(iRed10, (i611113 ^ i621110) + ((i621110 & i611113) << 1), (char) Gravity.getAbsoluteGravity(0, 0), objArr111117);
                int iIndexOf17 = TextUtils.indexOf("", "", 0, 0);
                int i621111 = ((iIndexOf17 | 1252) << 1) - (iIndexOf17 ^ 1252);
                int i621112 = -KeyEvent.getDeadChar(0, 0);
                int i621113 = (i621112 & 30) + (i621112 | 30);
                int maximumFlingVelocity19 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                Object[] objArr111118 = new Object[1];
                a(i621111, i621113, (char) (((maximumFlingVelocity19 | 41563) << 1) - (maximumFlingVelocity19 ^ 41563)), objArr111118);
                int i621114 = -Color.rgb(0, 0, 0);
                Object[] objArr111119 = new Object[1];
                a((i621114 ^ (-16775934)) + ((i621114 & (-16775934)) << 1), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (14063 - (~(-(Process.myTid() >> 22)))), objArr111119);
                String str51113 = (String) objArr111119[0];
                int i621115 = TuitionPaymentFragmentbindingInflater1;
                int i621116 = ((i621115 | 33) << 1) - (i621115 ^ 33);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i621116 % 128;
                int i621117 = i621116 % 2;
                String[] strArr214 = {(String) objArr111118[0], str51113};
                int maximumDrawingCacheSize5 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1293;
                int i621118 = 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int scrollBarSize8 = ViewConfiguration.getScrollBarSize() >> 8;
                Object[] objArr121110 = new Object[1];
                a(maximumDrawingCacheSize5, i621118, (char) ((scrollBarSize8 & 16502) + (scrollBarSize8 | 16502)), objArr121110);
                String str51114 = (String) objArr121110[0];
                int packedPositionType7 = 1312 - ExpandableListView.getPackedPositionType(0L);
                int bitsPerPixel7 = ImageFormat.getBitsPerPixel(0) + 6;
                int i621119 = -Color.green(0);
                Object[] objArr121111 = new Object[1];
                a(packedPositionType7, bitsPerPixel7, (char) (((i621119 | 56418) << 1) - (i621119 ^ 56418)), objArr121111);
                int i631110 = 1316 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                int i631111 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i631112 = (i631111 ^ 20) + ((i631111 & 20) << 1);
                int i631113 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                Object[] objArr121112 = new Object[1];
                a(i631110, i631112, (char) ((i631113 & 41835) + (i631113 | 41835)), objArr121112);
                int threadPriority12 = Process.getThreadPriority(0);
                int i631114 = -(-((((threadPriority12 | 20) << 1) - (threadPriority12 ^ 20)) >> 6));
                int i631115 = ((i631114 | 1336) << 1) - (i631114 ^ 1336);
                int i631116 = -(-TextUtils.getCapsMode("", 0, 0));
                int i631117 = (i631116 ^ 16) + ((i631116 & 16) << 1);
                int keyRepeatDelay17 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                int i631118 = (keyRepeatDelay17 * (-1335)) - 36049349;
                int i631119 = (keyRepeatDelay17 ^ i6) | (keyRepeatDelay17 & i6);
                int i641110 = -(-(((~i631119) | (-54048)) * (-668)));
                int i641111 = ((i631118 | i641110) << 1) - (i631118 ^ i641110);
                int i641112 = ~((-54048) | i6);
                int i641113 = ((keyRepeatDelay17 & i641112) | (keyRepeatDelay17 ^ i641112)) * 1336;
                int i641114 = (i641111 & i641113) + (i641113 | i641111);
                int i641115 = -(-(((i631119 ^ (-54048)) | (i631119 & (-54048))) * 668));
                char c1112 = (char) ((i641114 ^ i641115) + ((i641115 & i641114) << 1));
                Object[] objArr121113 = new Object[1];
                a(i631115, i631117, c1112, objArr121113);
                int i641116 = 1351 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
                int i641117 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                int i641118 = ((i641117 | 19) << 1) - (i641117 ^ 19);
                int i641119 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr121114 = new Object[1];
                a(i641116, i641118, (char) (((i641119 | 8108) << 1) - (i641119 ^ 8108)), objArr121114);
                int windowTouchSlop5 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1371;
                int i651110 = -(-ExpandableListView.getPackedPositionGroup(0L));
                int i651111 = (i651110 & 19) + (i651110 | 19);
                int i651112 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr121115 = new Object[1];
                a(windowTouchSlop5, i651111, (char) ((i651112 ^ 48916) + ((i651112 & 48916) << 1)), objArr121115);
                int i651113 = -Color.red(0);
                int i651114 = (i651113 & 1390) + (i651113 | 1390);
                int scrollBarFadeDuration5 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                Object[] objArr121116 = new Object[1];
                a(i651114, ((scrollBarFadeDuration5 | 23) << 1) - (scrollBarFadeDuration5 ^ 23), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr121116);
                int i651115 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int i651116 = ((i651115 | 1414) << 1) - (i651115 ^ 1414);
                int i651117 = -TextUtils.getTrimmedLength("");
                int i651118 = ((i651117 | 21) << 1) - (i651117 ^ 21);
                int threadPriority13 = Process.getThreadPriority(0);
                char c1113 = (char) (45738 - (~(-(((threadPriority13 & 20) + (threadPriority13 | 20)) >> 6))));
                Object[] objArr121117 = new Object[1];
                a(i651116, i651118, c1113, objArr121117);
                int i651119 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                int i661110 = -Color.rgb(0, 0, 0);
                Object[] objArr121118 = new Object[1];
                a((i651119 & 1434) + (i651119 | 1434), (i661110 & (-16777192)) + (i661110 | (-16777192)), (char) View.resolveSizeAndState(0, 0, 0), objArr121118);
                String str51115 = str;
                int i661111 = -TextUtils.indexOf("", "");
                int i661112 = (i661111 ^ 1458) + ((i661111 & 1458) << 1);
                int i661113 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i661114 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                Object[] objArr121119 = new Object[1];
                a(i661112, i661113, (char) ((i661114 & 1) + (i661114 | 1)), objArr121119);
                int i661115 = 1485 - (~Color.red(0));
                int i661116 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i661117 = (i661116 ^ 26) + ((i661116 & 26) << 1);
                int i661118 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr131110 = new Object[1];
                a(i661115, i661117, (char) ((i661118 ^ (-1)) + (i661118 << 1)), objArr131110);
                int i661119 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i671110 = (i661119 & 1513) + (i661119 | 1513);
                int i671111 = -(-TextUtils.indexOf("", "", 0));
                Object[] objArr131111 = new Object[1];
                a(i671110, (i671111 ^ 31) + ((i671111 & 31) << 1), (char) (6270 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr131111);
                int i671112 = -(-ExpandableListView.getPackedPositionChild(0L));
                int i671113 = (i671112 ^ 1545) + ((i671112 & 1545) << 1);
                int i671114 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i671115 = (i671114 ^ 28) + ((i671114 & 28) << 1);
                int i671116 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr131112 = new Object[1];
                a(i671113, i671115, (char) ((i671116 & 13095) + (i671116 | 13095)), objArr131112);
                int i671117 = 1570 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int i671118 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr131113 = new Object[1];
                a(i671117, (i671118 ^ 33) + ((i671118 & 33) << 1), (char) ((-2) - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr131113);
                strArr5 = new String[][]{new String[]{str2114, str2115, str2116, (String) objArr81112[0]}, new String[]{str2117, str31110, str31111, str31112, (String) objArr81117[0]}, new String[]{str31113, str31114, str, str31115, str31116, str31117}, new String[]{str31118, str31119, str41110, (String) objArr91116[0]}, new String[]{str41111, str41112, (String) objArr91119[0]}, new String[]{str41113, (String) objArr101111[0]}, new String[]{str41114, (String) objArr101113[0]}, new String[]{str41115, str41116, str41117, str41118, str41119, (String) objArr101119[0]}, new String[]{str5117, str5118, str5119, str51110, str51111, (String) objArr111115[0], str}, new String[]{str51112, (String) objArr111117[0]}, strArr214, new String[]{str51114, (String) objArr121111[0]}, new String[]{(String) objArr121112[0]}, new String[]{(String) objArr121113[0]}, new String[]{(String) objArr121114[0]}, new String[]{(String) objArr121115[0]}, new String[]{(String) objArr121116[0]}, new String[]{(String) objArr121117[0]}, new String[]{(String) objArr121118[0], str51115}, new String[]{(String) objArr121119[0], str51115}, new String[]{(String) objArr131110[0], str51115}, new String[]{(String) objArr131111[0], str51115}, new String[]{(String) objArr131112[0], str51115}, new String[]{(String) objArr131113[0], str51115}};
                int i671119 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i681110 = ((i671119 | 1603) << 1) - (i671119 ^ 1603);
                int i681111 = -(Process.myPid() >> 22);
                int i681112 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr131114 = new Object[1];
                a(i681110, ((i681111 | 1) << 1) - (i681111 ^ 1), (char) ((i681112 & 62047) + (i681112 | 62047)), objArr131114);
                sb = new StringBuilder((String) objArr131114[0]);
                i59 = i6;
                i60 = 0;
                i61 = 0;
                while (i60 < 24) {
                    i63 = TuitionPaymentFragmentbindingInflater1 + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i63 % 128;
                    if (i63 % 2 != 0) {
                        String[] strArr215 = strArr5[i60];
                        Object[] objArr131115 = {strArr215[1]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char cNormalizeMetaState4 = (char) (33602 - KeyEvent.normalizeMetaState(0));
                            int iResolveSizeAndState9 = 3085 - View.resolveSizeAndState(0, 0, 0);
                            int i681113 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                            byte b3110 = (byte) 0;
                            byte b3111 = (byte) (b3110 + 5);
                            Object[] objArr131116 = new Object[1];
                            c(b3110, b3111, (byte) (b3111 - 5), objArr131116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState4, iResolveSizeAndState9, i681113, 1411172903, false, (String) objArr131116[0], new Class[]{String.class});
                        }
                        str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr131115);
                        strArr7 = strArr215;
                        strArr5 = strArr5;
                    } else {
                        i58 = i58;
                        strArr7 = strArr5[i60];
                        Object[] objArr131117 = {strArr7[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cAlpha4 = (char) (33602 - Color.alpha(0));
                            int maximumFlingVelocity110 = 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iAxisFromString8 = 25 - MotionEvent.axisFromString("");
                            byte b3112 = (byte) 0;
                            byte b3113 = (byte) (b3112 + 5);
                            Object[] objArr131118 = new Object[1];
                            c(b3112, b3113, (byte) (b3113 - 5), objArr131118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha4, maximumFlingVelocity110, iAxisFromString8, 1411172903, false, (String) objArr131118[0], new Class[]{String.class});
                        }
                        str5 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr131117);
                    }
                    String[] strArr216 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                    if (str5 == null) {
                    }
                    i60 = (i60 | 1) + (i60 & 1);
                    i58 = i58;
                    strArr5 = strArr5;
                }
                int i681114 = i58;
                Object[] objArr131119 = new Object[1];
                a(1606 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), -TextUtils.indexOf((CharSequence) "", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr131119);
                sb.append((String) objArr131119[0]);
                objArr2 = new Object[2];
                if (i61 > 2) {
                    objArr2[0] = new int[1];
                    String[] strArr217 = {sb.toString()};
                    ((int[]) objArr2[0])[0] = i59;
                    objArr2[1] = strArr217;
                } else {
                    objArr2[0] = new int[]{i6};
                    objArr2[1] = new String[0];
                }
                int i681115 = ((int[]) objArr2[0])[0];
                int i681116 = (~(i6 & i681114)) & (i6 | i681114);
                int i681117 = -i681116;
                int i681118 = ((i681116 & i681117) | (i681116 ^ i681117)) >> 31;
                int i681119 = i681115 & (~i681118);
                int i6911 = i681114 & i681118;
                strArr6 = (String[]) objArr2[1];
                i58 = (i681119 & i6911) | (i681119 ^ i6911);
                i62 = 0;
            }
            int i6912 = -View.combineMeasuredStates(i62, i62);
            int i6913 = -Gravity.getAbsoluteGravity(i62, i62);
            Object[] objArr1410 = new Object[1];
            a((i6912 & 889) + (i6912 | 889), ((i6913 | 16) << 1) - (i6913 ^ 16), (char) (16098 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), objArr1410);
            Object[] objArr1411 = {(String) objArr1410[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 33602);
                int gidForName6 = 3084 - Process.getGidForName("");
                int size3 = 26 - View.MeasureSpec.getSize(0);
                byte b410 = (byte) 0;
                byte b411 = (byte) (b410 + 5);
                Object[] objArr1412 = new Object[1];
                c(b410, b411, (byte) (b411 - 5), objArr1412);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(pressedStateDuration2, gidForName6, size3, 1411172903, false, (String) objArr1412[0], new Class[]{String.class});
            }
            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr1411);
            if (objInvoke2 == null) {
                i70 = 0;
            } else {
                Object[] objArr1413 = {objInvoke2, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c27 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3394;
                    int i6914 = 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b412 = (byte) 0;
                    byte b413 = (byte) (b412 + 5);
                    Object[] objArr1414 = new Object[1];
                    c(b412, b413, (byte) (b413 - 5), objArr1414);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c27, modifierMetaStateMask3, i6914, 1203525406, false, (String) objArr1414[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr1413)).longValue();
                long j718 = 159092201;
                long j719 = j718 ^ j;
                long j810 = (((long) 303) * j718) + (j4 * jLongValue112) + (((long) (-302)) * ((((j719 | j6) | jLongValue112) ^ j) | (((j718 | jLongValue112) | j5) ^ j))) + (((long) (-604)) * (((j719 | jLongValue112) | j5) ^ j)) + ((((jLongValue112 | j5) ^ j) | ((j718 | (jLongValue112 ^ j)) ^ j)) * j3) + ((long) (-161162078));
                int i6915 = ((int) (j810 >> 32)) & (((38375124 + (((-88220177) | i6) * (-381))) + (((~((-399237682) | i54)) | 2059261421) * 381)) - 747851312);
                int i6916 = (int) j810;
                int i6917 = ~(673038927 | i54);
                int i6918 = ~(764187482 | i6);
                int i6919 = i6916 & (334239082 + ((i6917 | i6918) * 1150) + (((~((-764187483) | i54)) | i6918) * (-575)) + (((~(673038927 | i6)) | (~((-673038928) | i54))) * 575));
                i70 = (i6915 & i6919) | (i6915 ^ i6919);
            }
            if (i70 != 1986687685 && i70 != -1514516938) {
                i89 = 19;
                int i7010 = -(-Color.alpha(0));
                int i7011 = ((i7010 | 1608) << 1) - (i7010 ^ 1608);
                int i7012 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                int i7013 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr1415 = new Object[1];
                a(i7011, i7012, (char) ((i7013 ^ 44735) + ((i7013 & 44735) << 1)), objArr1415);
                int i7014 = -(-View.MeasureSpec.getMode(0));
                int i7015 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr1416 = new Object[1];
                a(((i7014 | 1622) << 1) - (i7014 ^ 1622), (i7015 ^ 25) + ((i7015 & 25) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1416);
                int i7016 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iB120 = com.google.android.gms.internal.measurement.zzdm.b();
                int i7017 = i7016 * 471;
                int i7018 = ((i7017 | 776208) << 1) - (i7017 ^ 776208);
                int i7019 = ((i7016 ^ 1648) | (i7016 & 1648)) * (-470);
                int i7110 = ((i7018 | i7019) << 1) - (i7019 ^ i7018);
                int i7111 = ~i7016;
                int i7112 = ~((i7111 & (-1649)) | (i7111 ^ (-1649)));
                int i7113 = ~(((-1649) & iB120) | ((-1649) ^ iB120));
                int i7114 = (i7112 & i7113) | (i7112 ^ i7113);
                int i7115 = ~iB120;
                int i7116 = (i7115 & i7016) | (i7115 ^ i7016);
                int i7117 = i7110 + ((i7114 | (~(i7116 | 1648))) * (-470));
                int i7118 = i7016 | (-1649);
                int i7119 = ((~((i7118 & iB120) | (i7118 ^ iB120))) | (~((i7116 ^ 1648) | (i7116 & 1648)))) * 470;
                int i7210 = (i7117 ^ i7119) + ((i7119 & i7117) << 1);
                int i7211 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                int i7212 = -View.MeasureSpec.getMode(0);
                Object[] objArr1417 = new Object[1];
                a(i7210, ((i7211 | 17) << 1) - (i7211 ^ 17), (char) (((i7212 | 15464) << 1) - (i7212 ^ 15464)), objArr1417);
                int i7213 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i7214 = (i7213 & 1666) + (i7213 | 1666);
                int maximumDrawingCacheSize6 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                Object[] objArr1418 = new Object[1];
                a(i7214, (maximumDrawingCacheSize6 & 17) + (maximumDrawingCacheSize6 | 17), (char) (52498 - (~(-ExpandableListView.getPackedPositionGroup(0L)))), objArr1418);
                int i7215 = -Process.getGidForName("");
                int i7216 = (i7215 & 1681) + (i7215 | 1681);
                int i7217 = -TextUtils.getCapsMode("", 0, 0);
                int i7218 = ((i7217 | 15) << 1) - (i7217 ^ 15);
                byte modifierMetaStateMask4 = (byte) KeyEvent.getModifierMetaStateMask();
                int i7219 = modifierMetaStateMask4 * (-1965);
                int i7310 = (i7219 & 984) + (i7219 | 984);
                int i7311 = -(-((modifierMetaStateMask4 | (-2)) * 983));
                int i7312 = (i7310 & i7311) + (i7311 | i7310);
                int i7313 = ~modifierMetaStateMask4;
                int i7314 = ~(((-2) & i54) | ((-2) ^ i54));
                int i7315 = ((i7314 & i7313) | (i7313 ^ i7314)) * (-983);
                int i7316 = ~modifierMetaStateMask4;
                int i7317 = ~((i7316 & i12) | (i7316 ^ i12));
                int i7318 = ~((i7313 & 1) | (i7313 ^ 1));
                char c28 = (char) ((((i7312 & i7315) + (i7315 | i7312)) - (~(((i7317 & i7318) | (i7317 ^ i7318)) * 983))) - 1);
                Object[] objArr1419 = new Object[1];
                a(i7216, i7218, c28, objArr1419);
                int jumpTapTimeout2 = 1697 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i7319 = -(-TextUtils.lastIndexOf("", '0', 0));
                Object[] objArr1510 = new Object[1];
                a(jumpTapTimeout2, ((i7319 | 38) << 1) - (i7319 ^ 38), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31641), objArr1510);
                Object[] objArr1511 = new Object[1];
                a(1733 - (~(-(-KeyEvent.normalizeMetaState(0)))), 11 - TextUtils.lastIndexOf("", '0'), (char) ((-2) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr1511);
                int i7410 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i7411 = ((i7410 | 1746) << 1) - (i7410 ^ 1746);
                int i7412 = -View.resolveSize(0, 0);
                int i7413 = (i7412 ^ 13) + ((i7412 & 13) << 1);
                int i7414 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                Object[] objArr1512 = new Object[1];
                a(i7411, i7413, (char) ((i7414 ^ 43626) + ((i7414 & 43626) << 1)), objArr1512);
                int i7415 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                Object[] objArr1513 = new Object[1];
                a(((i7415 | 1759) << 1) - (i7415 ^ 1759), Color.red(0) + 22, (char) (Process.getGidForName("") + 46850), objArr1513);
                int iIndexOf18 = TextUtils.indexOf((CharSequence) "", '0');
                Object[] objArr1514 = new Object[1];
                a(((iIndexOf18 | 1782) << 1) - (iIndexOf18 ^ 1782), 31 - Color.red(0), (char) (16415 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr1514);
                int i7416 = 1810 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                int iIndexOf19 = TextUtils.indexOf((CharSequence) "", '0', 0);
                Object[] objArr1515 = new Object[1];
                a(i7416, (iIndexOf19 & 13) + (iIndexOf19 | 13), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr1515);
                int i7417 = 1823 - (~(-Color.alpha(0)));
                int i7418 = -(Process.myTid() >> 22);
                Object[] objArr1516 = new Object[1];
                a(i7417, (i7418 ^ 12) + ((i7418 & 12) << 1), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0, 0)))), objArr1516);
                int i7419 = -(-View.getDefaultSize(0, 0));
                int i7510 = ((i7419 | 1836) << 1) - (i7419 ^ 1836);
                int i7511 = -KeyEvent.keyCodeFromString("");
                Object[] objArr1517 = new Object[1];
                a(i7510, (i7511 & 12) + (i7511 | 12), (char) (48531 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16))), objArr1517);
                int i7512 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 - (-1);
                TuitionPaymentFragmentbindingInflater1 = i7512 % 128;
                int i7513 = i7512 % 2;
                int i7514 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int i7515 = -(-Color.alpha(0));
                Object[] objArr1518 = new Object[1];
                a((i7514 ^ 1848) + ((i7514 & 1848) << 1), (i7515 & 12) + (i7515 | 12), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1518);
                int i7516 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                int i7517 = (i7516 & 1860) + (i7516 | 1860);
                int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 12;
                int i7518 = -(-TextUtils.getTrimmedLength(""));
                Object[] objArr1519 = new Object[1];
                a(i7517, offsetBefore3, (char) ((i7518 ^ 33292) + ((i7518 & 33292) << 1)), objArr1519);
                int scrollBarSize9 = 1872 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iIndexOf110 = TextUtils.indexOf("", "");
                Object[] objArr1610 = new Object[1];
                a(scrollBarSize9, ((iIndexOf110 | 14) << 1) - (iIndexOf110 ^ 14), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr1610);
                int i7519 = 1885 - (~(ViewConfiguration.getTouchSlop() >> 8));
                int i7610 = -(-KeyEvent.normalizeMetaState(0));
                Object[] objArr1611 = new Object[1];
                a(i7519, (i7610 & 12) + (i7610 | 12), (char) (ImageFormat.getBitsPerPixel(0) + 63669), objArr1611);
                int i7611 = -Color.blue(0);
                int i7612 = (i7611 ^ 1898) + ((i7611 & 1898) << 1);
                int i7613 = (-25) - (~AndroidCharacter.getMirror('0'));
                int i7614 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr1612 = new Object[1];
                a(i7612, i7613, (char) (((i7614 | 20446) << 1) - (i7614 ^ 20446)), objArr1612);
                Object[] objArr1613 = new Object[1];
                a(1922 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, (char) ExpandableListView.getPackedPositionType(0L), objArr1613);
                strArr14 = new String[]{(String) objArr1415[0], (String) objArr1416[0], (String) objArr1417[0], (String) objArr1418[0], (String) objArr1419[0], (String) objArr1510[0], (String) objArr1511[0], (String) objArr1512[0], (String) objArr1513[0], (String) objArr1514[0], (String) objArr1515[0], (String) objArr1516[0], (String) objArr1517[0], (String) objArr1518[0], (String) objArr1519[0], (String) objArr1610[0], (String) objArr1611[0], (String) objArr1612[0], (String) objArr1613[0]};
                i90 = 0;
                while (true) {
                    if (i90 < i89) {
                        i91 = -1;
                        break;
                    }
                    str8 = strArr14[i90];
                    Object[] objArr1614 = {str8};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i7615 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 994;
                        int iResolveSizeAndState10 = View.resolveSizeAndState(0, 0, 0) + 8;
                        byte b414 = (byte) 0;
                        byte b415 = b414;
                        Object[] objArr1615 = new Object[1];
                        c(b414, b415, b415, objArr1615);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(longPressTimeout2, i7615, iResolveSizeAndState10, -545305915, false, (String) objArr1615[0], new Class[]{String.class});
                    }
                    long jLongValue113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr1614)).longValue();
                    long j811 = -817352035;
                    strArr15 = strArr14;
                    long j812 = (((long) (-523)) * j811) + (((long) 263) * jLongValue113);
                    long j813 = 262;
                    long j814 = ((j811 ^ j) | jLongValue113) ^ j;
                    long j815 = jLongValue113 ^ j;
                    long j816 = (j811 | j815) ^ j;
                    i92 = i90;
                    long j817 = j812 + ((j814 | j816 | ((j815 | j5) ^ j)) * j813) + (((long) (-786)) * j816) + (j813 * (((j815 | j6) ^ j) | j814 | j816)) + ((long) 1437811319);
                    int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
                    int i7616 = ~iMaxMemory4;
                    i93 = ((int) (j817 >> 32)) & ((-2055567968) + (((~(1585316151 | i7616)) | (-1272424734)) * 226) + (((~(i7616 | (-25274377))) | (~(1272424733 | iMaxMemory4)) | 338165794) * (-113)) + ((~(iMaxMemory4 | 1585316151)) * 113));
                    i94 = ((int) j817) & ((-1687905466) + (((~(1572609481 | i54)) | 135383071) * (-90)) + (((~(1572609481 | i6)) | 1437341120) * (-45)) + ((1572609481 | (~((-135383072) | i6)) | (~(i54 | 135383071))) * 45));
                    if (((i93 & i94) | (i93 ^ i94)) != 0) {
                        int i7617 = TuitionPaymentFragmentbindingInflater1 + 89;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7617 % 128;
                        int i7618 = i7617 % 2;
                    } else {
                        objArr3 = new Object[1];
                        a(1871 - (~(-(-(Process.myTid() >> 22)))), 13 - (~(-Drawable.resolveOpacity(0, 0))), (char) ((-2) - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr3);
                        if (!str8.equals((String) objArr3[0])) {
                            Object[] objArr1616 = {str8};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                char packedPositionChild3 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                int bitsPerPixel8 = ImageFormat.getBitsPerPixel(0) + 994;
                                int i7619 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7;
                                byte b416 = (byte) 0;
                                Object[] objArr1617 = new Object[1];
                                c(b416, (byte) (b416 | 6), b416, objArr1617);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild3, bitsPerPixel8, i7619, 349342683, false, (String) objArr1617[0], new Class[]{String.class});
                            }
                            long jLongValue114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr1616)).longValue();
                            long j818 = 220991009;
                            long j819 = -560;
                            long jElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                            long j910 = jElapsedRealtime3 ^ j;
                            long j911 = (((long) (-559)) * j818) + (((long) 561) * jLongValue114) + (((j910 | j818) ^ j) * j819) + (j819 * ((((jLongValue114 ^ j) | j818) | jElapsedRealtime3) ^ j)) + (((long) 560) * (((j910 | jLongValue114) ^ j) | (((j818 ^ j) | jLongValue114) ^ j))) + ((long) (-1068069614));
                            i95 = ((int) (j911 >> 32)) & (((1754752898 + (((~((-212446470) | i54)) | 1649672880) * (-828))) + (((-212446470) | i54) * (-828))) - 187982804);
                            i96 = ((int) j911) & (492788852 + ((~((-143753282) | i54)) * 433) + (((~((-1902256019) | i6)) | (-955484868)) * (-433)) + (((~((-955484868) | i6)) | (-2046009300)) * 433));
                            if (((i95 & i96) | (i95 ^ i96)) != 0) {
                                int i7710 = TuitionPaymentFragmentbindingInflater1;
                                i97 = (i7710 ^ 7) + ((i7710 & 7) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i97 % 128;
                                if (i97 % 2 != 0) {
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            }
                        }
                        i90 = i92 + 1;
                        strArr14 = strArr15;
                        i89 = 19;
                    }
                    i91 = i92;
                    break;
                }
                int i7711 = (i91 ^ 130) + ((i91 & 130) << 1);
                int i7712 = (i7711 & i54) | ((~i7711) & i6);
                int i7713 = ~i91;
                int i7714 = -i7713;
                int i7715 = ((i7713 & i7714) | (i7713 ^ i7714)) >> 31;
                int i7716 = ~i7715;
                int i7717 = TuitionPaymentFragmentbindingInflater1;
                int i7718 = (i7717 & 109) + (i7717 | 109);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7718 % 128;
                int i7719 = i7718 % 2;
                int i7810 = i7716 & i6;
                int i7811 = i7712 & i7715;
                int i7812 = (i7811 & i7810) | (i7810 ^ i7811);
                int i7813 = i6 ^ i58;
                int i7814 = -i7813;
                int i7815 = ((i7813 & i7814) | (i7813 ^ i7814)) >> 31;
                int i7816 = i7812 & (~i7815);
                int i7817 = i58 & i7815;
                i58 = (i7817 & i7816) | (i7816 ^ i7817);
            }
            int iGreen5 = Color.green(0) + 1950;
            int i7818 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr1618 = new Object[1];
            a(iGreen5, ((i7818 | 14) << 1) - (i7818 ^ 14), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr1618);
            String str66 = (String) objArr1618[0];
            int i7819 = 1964 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i7910 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
            Object[] objArr1619 = new Object[1];
            a(i7819, (i7910 & 5) + (i7910 | 5), (char) ExpandableListView.getPackedPositionGroup(0L), objArr1619);
            Object[] objArr1710 = new Object[1];
            a(1968 - TextUtils.getOffsetBefore("", 0), 14 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) (28352 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0))))), objArr1710);
            String str67 = (String) objArr1710[0];
            int i7911 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i7912 = ((i7911 | 1983) << 1) - (i7911 ^ 1983);
            int i7913 = 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int threadPriority14 = Process.getThreadPriority(0);
            Object[] objArr1711 = new Object[1];
            a(i7912, i7913, (char) (((threadPriority14 ^ 20) + ((threadPriority14 & 20) << 1)) >> 6), objArr1711);
            String str68 = (String) objArr1711[0];
            int i7914 = -(-Color.blue(0));
            int i7915 = (i7914 & 2002) + (i7914 | 2002);
            int i7916 = -(-KeyEvent.normalizeMetaState(0));
            Object[] objArr1712 = new Object[1];
            a(i7915, ((i7916 | 14) << 1) - (i7916 ^ 14), (char) ExpandableListView.getPackedPositionGroup(0L), objArr1712);
            int i7917 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
            int i7918 = ((i7917 | 2016) << 1) - (i7917 ^ 2016);
            int i7919 = -(-TextUtils.indexOf((CharSequence) "", '0'));
            Object[] objArr1713 = new Object[1];
            a(i7918, ((i7919 | 22) << 1) - (i7919 ^ 22), (char) (45322 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr1713);
            String str69 = (String) objArr1713[0];
            int iLastIndexOf15 = TextUtils.lastIndexOf("", '0') + 2038;
            int i8010 = -Color.red(0);
            Object[] objArr1714 = new Object[1];
            a(iLastIndexOf15, ((i8010 | 10) << 1) - (i8010 ^ 10), (char) (10184 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr1714);
            Object[] objArr1715 = new Object[1];
            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2046, 10 - (~KeyEvent.getDeadChar(0, 0)), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr1715);
            int i8011 = 586 - (~(-(-ExpandableListView.getPackedPositionType(0L))));
            int deadChar2 = KeyEvent.getDeadChar(0, 0);
            int i8012 = ((deadChar2 | 6) << 1) - (6 ^ deadChar2);
            int packedPositionGroup6 = ExpandableListView.getPackedPositionGroup(0L);
            int i8013 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            TuitionPaymentFragmentbindingInflater1 = i8013 % 128;
            int i8014 = i8013 % 2;
            Object[] objArr1716 = new Object[1];
            a(i8011, i8012, (char) (40768 - packedPositionGroup6), objArr1716);
            String[] strArr218 = {(String) objArr1715[0], (String) objArr1716[0]};
            int iLastIndexOf16 = TextUtils.lastIndexOf("", '0', 0, 0);
            int i8015 = (iLastIndexOf16 & 2059) + (iLastIndexOf16 | 2059);
            int i8016 = -KeyEvent.getDeadChar(0, 0);
            int i8017 = (i8016 & 28) + (i8016 | 28);
            int i8018 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            Object[] objArr1717 = new Object[1];
            a(i8015, i8017, (char) ((i8018 & 15453) + (i8018 | 15453)), objArr1717);
            String str610 = (String) objArr1717[0];
            int i8019 = 2036 - (~(-(Process.myTid() >> 22)));
            int bitsPerPixel9 = 9 - ImageFormat.getBitsPerPixel(0);
            int i8110 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            Object[] objArr1718 = new Object[1];
            a(i8019, bitsPerPixel9, (char) (((i8110 | 10184) << 1) - (i8110 ^ 10184)), objArr1718);
            c2 = 0;
            strArr8 = new String[][]{new String[]{str66, (String) objArr1619[0]}, new String[]{str67, str68, (String) objArr1712[0]}, new String[]{str69, (String) objArr1714[0]}, strArr218, new String[]{str610, (String) objArr1718[0]}};
            i71 = 0;
            i72 = 5;
            i73 = -1;
            loop7: while (true) {
                if (i71 < i72) {
                    strArr9 = strArr6;
                    i74 = i6;
                    break;
                }
                String[] strArr32 = strArr8[i71];
                str6 = strArr32[c2];
                strArr10 = (String[]) Arrays.copyOfRange(strArr32, 1, strArr32.length);
                length3 = strArr10.length;
                i78 = 0;
                while (true) {
                    if (i78 < length3) {
                        i73 = (i73 & (-20)) + (i73 | (-20)) + 21;
                        bytes3 = strArr10[i78].getBytes();
                        length4 = bytes3.length;
                        if (length4 == 0) {
                            strArr9 = strArr6;
                        } else {
                            bufferedInputStream9 = new BufferedInputStream(new FileInputStream(str6));
                            i80 = 4096;
                            strArr11 = strArr8;
                            bArr4 = new byte[4096];
                            strArr12 = strArr10;
                            str7 = str6;
                            i79 = length3;
                            i81 = 0;
                            while (true) {
                                i82 = bufferedInputStream9.read(bArr4, 0, i80);
                                if (i82 > 0) {
                                    break;
                                    break;
                                }
                                i83 = 0;
                                while (i81 < length4 && i83 < i82) {
                                    byte[] bArr7 = bArr4;
                                    if (bArr4[i83] == bytes3[i81]) {
                                        int i8111 = TuitionPaymentFragmentbindingInflater1 + 103;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8111 % 128;
                                        int i8112 = i8111 % 2;
                                        i81 = (i81 ^ (-97)) + ((i81 & (-97)) << 1) + 98;
                                    } else {
                                        if (i81 != 0) {
                                            i84 = (i81 ^ (-1)) + (i81 << 1);
                                            while (true) {
                                                if (i84 > 0) {
                                                    i85 = i82;
                                                    strArr13 = strArr6;
                                                    i81 = 0;
                                                    break;
                                                    break;
                                                }
                                                i86 = 0;
                                                while (true) {
                                                    if (i86 < i84) {
                                                        i85 = i82;
                                                        strArr13 = strArr6;
                                                        i81 = i84;
                                                        break;
                                                        break;
                                                    }
                                                    i87 = i82;
                                                    strArr9 = strArr6;
                                                    int i8113 = -i84;
                                                    i88 = ((i81 | i8113) << 1) - (i8113 ^ i81);
                                                    if (bytes3[i86] != bytes3[(i88 & i86) + (i88 | i86)]) {
                                                        break;
                                                    }
                                                    int i8114 = (i86 ^ (-29)) + ((i86 & (-29)) << 1);
                                                    i86 = (i8114 & 30) + (i8114 | 30);
                                                    i82 = i87;
                                                    strArr6 = strArr9;
                                                }
                                                i84 = (-2) - (~i84);
                                                i82 = i87;
                                                strArr6 = strArr9;
                                            }
                                        }
                                        bArr4 = bArr7;
                                        i82 = i85;
                                        strArr6 = strArr13;
                                    }
                                    i85 = i82;
                                    strArr13 = strArr6;
                                    i83 = (i83 & 1) + (i83 | 1);
                                    bArr4 = bArr7;
                                    i82 = i85;
                                    strArr6 = strArr13;
                                }
                                bArr4 = bArr4;
                                strArr6 = strArr6;
                                i80 = 4096;
                                bufferedInputStream8 = bufferedInputStream9;
                                if (bufferedInputStream8 != null) {
                                    bufferedInputStream8.close();
                                }
                                int i8115 = ((i78 | (-38)) << 1) - (i78 ^ (-38));
                                i78 = ((i8115 | 39) << 1) - (i8115 ^ 39);
                                strArr10 = strArr12;
                                strArr8 = strArr11;
                                str6 = str7;
                                length3 = i79;
                                strArr6 = strArr9;
                            }
                            strArr9 = strArr6;
                            if (i81 == length4) {
                                int i8116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                                TuitionPaymentFragmentbindingInflater1 = i8116 % 128;
                                int i8117 = i8116 % 2;
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bufferedInputStream9.close();
                            if (z3) {
                                int i8118 = ((i78 | (-38)) << 1) - (i78 ^ (-38));
                                i78 = ((i8118 | 39) << 1) - (i8118 ^ 39);
                                strArr10 = strArr12;
                                strArr8 = strArr11;
                                str6 = str7;
                                length3 = i79;
                                strArr6 = strArr9;
                            }
                        }
                        int i8119 = (i73 ^ 170) + ((i73 & 170) << 1);
                        i74 = (i8119 & i54) | ((~i8119) & i6);
                        break loop7;
                    }
                    String[][] strArr33 = strArr8;
                    int i8210 = (i71 & 117) + (i71 | 117);
                    i71 = ((i8210 | (-116)) << 1) - (i8210 ^ (-116));
                    strArr8 = strArr33;
                    i72 = 5;
                    c2 = 0;
                }
            }
            int i8211 = i6 ^ i58;
            int i8212 = -i8211;
            int i8213 = ((i8211 & i8212) | (i8211 ^ i8212)) >> 31;
            int i8214 = i74 & (~i8213);
            int i8215 = i58 & i8213;
            int i8216 = (i8214 ^ i8215) | (i8215 & i8214);
            int i8217 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            Object[] objArr1719 = new Object[1];
            a(((i8217 | 2086) << 1) - (i8217 ^ 2086), TextUtils.indexOf((CharSequence) "", '0', 0) + 14, (char) (22786 - (~(ViewConfiguration.getWindowTouchSlop() >> 8))), objArr1719);
            String str611 = (String) objArr1719[0];
            int i8218 = -(Process.myTid() >> 22);
            int i8219 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            Object[] objArr1811 = new Object[1];
            a((i8218 & 2099) + (i8218 | 2099), (i8219 ^ 8) + ((i8219 & 8) << 1), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1811);
            Object[] objArr1812 = {str611, (String) objArr1811[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf4 = (char) TextUtils.indexOf("", "");
                int gidForName7 = 2384 - Process.getGidForName("");
                int mode6 = 32 - View.MeasureSpec.getMode(0);
                byte b417 = (byte) 0;
                byte b418 = (byte) (b417 + 5);
                Object[] objArr1813 = new Object[1];
                c(b417, b418, (byte) (b418 - 5), objArr1813);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf4, gidForName7, mode6, -1207062455, false, (String) objArr1813[0], new Class[]{String.class, String.class});
            }
            long jLongValue115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr1812)).longValue();
            long j912 = 1493501756;
            long j913 = 371;
            long j914 = (j913 * j912) + (j913 * jLongValue115);
            long j915 = -370;
            long j916 = jLongValue115 ^ j;
            long j917 = j912 ^ j;
            long j918 = (jLongValue115 | j912) ^ j;
            long j919 = j914 + ((((j916 | j6) ^ j) | ((j917 | j5) ^ j)) * j915) + (j915 * (((j917 | j6) ^ j) | ((j916 | j5) ^ j) | j918)) + (((long) 370) * j918) + ((long) 483541572);
            int i8310 = (int) (j919 >> 32);
            int iMyTid9 = Process.myTid();
            i76 = i8310 & (1191372174 + (((~((-1830098075) | iMyTid9)) | 392871663) * (-964)) + (((~((~iMyTid9) | (-1830098075))) | 83891338) * (-964)));
            int i8311 = (~(21657318 | i54)) | (-1432354536);
            int i8312 = ~((-4871875) | i6);
            i77 = ((int) j919) & ((((i8311 | i8312) * (-252)) - 1613316619) + ((i8312 | (~((-1410697218) | i54))) * 252));
            if (((i76 & i77) | (i76 ^ i77)) != 0) {
                i75 = i6 ^ 150;
            } else {
                i75 = i6;
            }
            int i8313 = ((~i8216) & i6) | (i8216 & i54);
            int i8314 = (i8313 | (-i8313)) >> 31;
            int i8315 = i75 & (~i8314);
            int i8316 = i8216 & i8314;
            int i8317 = (i8315 & i8316) | (i8315 ^ i8316);
            int i8318 = 2106 - (~(-(-View.combineMeasuredStates(0, 0))));
            int minimumFlingVelocity6 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int i8319 = (minimumFlingVelocity6 ^ 47) + ((minimumFlingVelocity6 & 47) << 1);
            int i8410 = -ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr1814 = new Object[1];
            a(i8318, i8319, (char) (((i8410 | 60657) << 1) - (i8410 ^ 60657)), objArr1814);
            Object[] objArr1815 = {(String) objArr1814[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c29 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int packedPositionType8 = ExpandableListView.getPackedPositionType(0L) + 993;
                int iMyTid10 = 8 - (Process.myTid() >> 22);
                byte b419 = (byte) 0;
                byte b51 = (byte) (b419 + 5);
                Object[] objArr1816 = new Object[1];
                c(b419, b51, (byte) (b51 - 5), objArr1816);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c29, packedPositionType8, iMyTid10, 410748506, false, (String) objArr1816[0], new Class[]{String.class});
            }
            long jLongValue116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr1815)).longValue();
            long j103 = 322034871;
            long j104 = ((j103 ^ j) | jLongValue116) ^ j;
            long startUptimeMillis5 = (int) Process.getStartUptimeMillis();
            long j105 = (((long) 71) * j103) + (j32 * jLongValue116) + (((long) (-140)) * (((jLongValue116 | startUptimeMillis5) ^ j) | j104)) + ((((j103 | jLongValue116) | startUptimeMillis5) ^ j) * j25) + (((((jLongValue116 ^ j) | j103) ^ j) | j104 | ((j103 | startUptimeMillis5) ^ j)) * j25) + ((long) (-522953108));
            int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
            int i8411 = ((int) (j105 >> 32)) & (1520786966 + (((~((~elapsedCpuTime4) | (-667774246))) | 42478885) * 529) + (((~(elapsedCpuTime4 | (-667774246))) | (-2105000657)) * 529));
            int i8412 = ((int) j105) & ((((~((-226814364) | i6)) * TypedValues.CycleType.TYPE_EASING) - 528465271) + (((~((-226814364) | i54)) | (-1302719904)) * TypedValues.CycleType.TYPE_EASING));
            int i8413 = ((i8411 & i8412) | (i8411 ^ i8412)) * 263;
            int i8414 = i6 ^ i8317;
            int i8415 = -i8414;
            int i8416 = ((i8414 & i8415) | (i8414 ^ i8415)) >> 31;
            int i8417 = (i8413 | i6) & (~(i6 & i8413)) & (~i8416);
            int i8418 = i8317 & i8416;
            i51 = (i8418 & i8417) | (i8417 ^ i8418);
            strArr4 = strArr9;
            i55 = 5;
        } else {
            i54 = i200;
            i55 = 5;
            strArr4 = null;
        }
        Object[] objArr1817 = new Object[i55];
        objArr1817[0] = new int[1];
        objArr1817[1] = new int[]{i51};
        objArr1817[3] = new int[]{i6};
        int i8419 = (i54 & i51) | ((~i51) & i6);
        objArr1817[4] = strArr4;
        objArr1817[2] = null;
        int i8510 = ~((~Process.myTid()) | 328270449);
        int i8511 = -(-((((((26214993 | i8510) * (-374)) + 1688961585) + ((i8510 | 302055456) * 374)) - (~(-(-(((i8419 | (-i8419)) >> 31) & 16))))) - 1));
        int i8512 = (i3 & i8511) + (i3 | i8511);
        int i8513 = i8512 << 13;
        int i8514 = (i8513 | i8512) & (~(i8512 & i8513));
        int i8515 = i8514 >>> 17;
        int i8516 = (i8514 | i8515) & (~(i8514 & i8515));
        int i8517 = i8516 << 5;
        ((int[]) objArr1817[0])[0] = ((~i8516) & i8517) | ((~i8517) & i8516);
        return objArr1817;
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("±³»è¥Ù¯Ú\u0099ó\u0083«\u008d\u0093÷\u0080áxëjÕUß_É43\u0013=\u001d'\b\u0010ø\u001aþ\u0004Ù\u000eßx¯b\u0093l\u008fV\u009c@}Jo´Y±³»è¥Ù¯Ú\u0099ó\u0083«\u008d\u0093÷\u0080áxëjÕUß_É43\u0013=\f'\u0005\u0010ì\u001aé\u0004ã\u000eÈx¬b¾l\u009fV\u0098@x±³»è¥Ù¯Ú\u0099ó\u0083«\u008d\u0093÷\u0080áxëjÕUß_É43\u0013=\u000f'\u0015\u0010ò\u001aï4\u0080>Ì ö*ì\u001cÀ\u0006\u0092\b r»dZnSPjZ0L\b¶\u0010¸#¢;\u0095É\u009fÖ\u0081ü\u008b÷ý°ç\u009dé®Ó«Å[ÏZ1};f±³»é¥È¯Ï\u0099ó\u0083¨\u008d\u009b÷Âálë~ÕSß\\%\u000b/Q1p;w\rK\u0017\u0007\u0019-c9u\u008a\u007fÄAöKû]\u0094|\rvAhfbqT\u0003N\u0000@&:},ð&ô\u0018Ï\u0012ý\u0004\u0094þ\u0097ð\u0086ê³ÝV×S±³»è¥Ý¯Ø\u0099½\u0083ã\u008dÒ÷\u008fálëyÕUßBÉ:3#±î»ã¥\u0092¯Î\u0099³\u0083£\u008d\u0088÷ÂánëiÕXß^É33%=\u0018'3\u0010ò\u001aé\u0004È\u000eóx¸b¢l\u008fVÝÑYÛTÅ%Ïyù\u0004ã\u0014í?\u0097u\u0081Ù\u008bÞµï¿é©\u0084S\u0092]¯G\u0084pEz^d\u007fnD\u0018\u000f\u0002\u0015\f86i\u008fõ\u0085¹\u009b\u0083\u0091\u0099§î½ï³×É\u0085ß6Õ#ë\u0018áE÷v\rc\u0003X\u0019D.¸$ä:\u00890\u0085±þ»å¥Û¯Â\u0099³\u0083´ücö/è\u0015â\u000fÔxÎyÀAº\u0013¬®¦µ\u0098\u0082\u0092Ó\u0084â~ùpÁjÉ]\u001aW\u0011IAC\u00125i/q!Y\u001b\u0011\r¯\u0007³ù\u0082ó\u0088åþßóÑÀ±³»ÿ¥Å¯ß\u0099¨\u0083©\u008d\u0091÷Ãá~ëeÕRß\u0003É23)=\u0011'\u0019\u0010Ê\u001aÁ\u0004\u0091\u000eÜx®b£l\u008c±³»ÿ¥Å¯ß\u0099¨\u0083©\u008d\u0091÷ÃápëeÕ^ß\u0003É03%=\u001e'\u0002\u0010ù\u001aá\u0004É\u000eúx\u0091b¼l\u008eV\u0083@lJ\"´O¾CÈýÂ¦Ü\u0097Ö\u0094à½úìô×\u008eÏ\u0098'\u0092%¬\u0007¦\u0007°aJv±î»ã¥\u0092¯Î\u0099©\u0083¥\u008d\u0090÷\u0088á2ëdÕSß_É(8ÿ2ä,Ð&Ò\u0010´\nï\u0004\u009f~\u0084he\u0018l\u0012#\f\u0011\u0006\u001c0`*<$E^ZH¯B¶|\u0090v\u008a`ð\u009aç\u0094Æ\u008eÞ¹0±ò»é¥Ñ¯Ù\u0099¯\u0083ª±î»ã¥\u0092¯Ü\u0099®\u0083£\u008d\u0098÷\u0099á\u007fëxÕ\u0012ßAÉ=3\"=\t'\n\u0010ý\u001aï\u0004È\u000eÙx®b©l\u008eü\u009cö\u008eèµâ²±ì»é¥Î¯ß\u0099µ\u0083¿\u008d\u0088÷ÂáoëuÕOß\u0002É>3(=R'\b\u0010ù\u001aî\u0004É\u000eËxòb«l\u008cV\u0099@2Jj´]¾G¨9\u0092\u0013\u009c\u001b\u0086\u001cóéýÓçÎÑÉÛ²Å¨Ï\u00999\u009e#y-~±ì»é¥Î¯ß\u0099µ\u0083¿\u008d\u0088÷ÂáoëuÕOß\u0002É>3(=R'\b\u0010ù\u001aî\u0004É\u000eËxòb«l\u008cV\u0099@2Jj´]¾G¨9\u0092\u0013\u009c\u001b\u0086\u001cóéýÓçÊÑÉÛ²Å¨Ï\u00939\u009e±ì»é¥Î¯ß\u0099µ\u0083¿\u008d\u0088÷ÂáoëuÕOß\u0002É>3(=R'\b\u0010ù\u001aî\u0004É\u000eËxòb¾l\u0093VÂ@\u007fJ}´U±ì»é¥Î¯ß\u0099µ\u0083¿\u008d\u0088÷ÂáoëuÕOß\u0002É>3(=R'\b\u0010ù\u001aî\u0004É\u000eËxòb¾l\u0093VÂ@pJm´_\u0087ò\u008d÷\u0093Ð\u0099Á¯«µ¡»\u0096ÁÜ×qÝkãQé\u001cÿ \u00056\u000bL\u0011\u0016&ç,ð2×8ÕNìT Z\u008d`Üvo|q\u0082Aü4ö1è\u0016â\u0007ÔmÎgÀPº\u001a¬·¦\u00ad\u0098\u0097\u0092Ú\u0084æ~ðp\u008ajÐ]!W6I\u0011C\u00135*/f!K\u001b\u001a\r©\u0007ºù\u0087.ª$®:\u00930\u0094\u0006ï\u001cê5ß?\u0090!¢+¯\u001dÓ\u0007\u008f\týsïe\u0014o\u0015Q<[%MCCIIMWp]wk\u0018q\u001a\u007f:\u0005<\u0013Ë½ß·\u0093©©£³\u0095Ä\u008fÅ\u0081ýû¯í\u0016ç\u0012Ù1Ó-ÅU?W1\u007f+r\u001c\u009b\u0016Ï\b§\u0002©tÞnÄ`ÿZ÷L\u0003FM¸#²9¤C\u009eT\u0090u\u008amÿ¯ñ\u0093ëµÝ²×ÆÉÅÃâ5®/\u001a!\u0001\u001b\"±³»ú¥Ù¯Â\u0099¸\u0083£\u008d\u008e÷ÃápëeÕ^ß\u001aÉh3c=\u0014'\u001b\u0010³\u001aí\u0004É\u000eÈxµb£lÒV\u009c@nJe´Q¾M¨.\u00925\u009cR\u0086\u001bóõýâçØÑÃÛ«Å¿ÏÒ9\u009f#sL\u0095FÜXÿRäd\u009e~\u0085p¨\nå\u001cV\u0016C(x\"<4NÎEÀ2Ú=í\u0095çÂùíóé\u0085\u0095\u009f\u0087\u0091ª«¥½I·OIhC$U\ro\u0003a4{.\u000eÕ\u0000Ý\u001aé,¤&\u00898\u0085½\u0015·Y©c£y\u0095\u000e\u008f\u000f\u00817ûeíÖçÃÙøÓ¼ÅÎ?Å1¹+¦\u001cU\u0016_\b~\u0002Ut\u001bn\u0003`>Z&LåFÃ¸ô²þ¤\u009f\u009e\u0098\u0090¼\u008a«ÿYñOë7Ýi×\nÉ\u001aÃt59/Õëpá*ÿ\u000bõ\fÃ0Ùf×Q\u00adF»«±à\u008f\u0096\u0085\u0081\u0093öiûg\u0091}ÌJ3@ ^\nT\u000b\"l8j6M\fY\u001a¶\u0010¬î\u009aäÁòíÈì±Û»é¥Ò¯Õ\u0099±\u0083£\u008d\u0088÷\u0085ásëb±é»â¥×¯Â\u0099³\u0083»\u008d\u0092±ÿ»ä¥Î¯Ã\u0099±\u0083¥\u008d\u0089÷\u0081±î»ã¥\u0092¯Ü\u0099®\u0083£\u008d\u0098÷\u0099á\u007fëxÕ\u0012ßHÉ93:=\u0015'\u000f\u0010ù\u0016Ì\u001cÈ\u0002õ\bò>Â$Ü*ª±û»é¥Ò¯É\u0099®\u0083¥\u008d\u009füéöûèÀâÛÔ¼Î·À\u008dº¡¬v¦&\u0098\u0018\u0005Z\u000fH\u0011s\u001bh-\u000f7\u00049>C\u0012UÅ_\u0095a«kÒ}Ë\u0087Ù\u008f\f\u0085\u0001\u009bp\u0091>§L½A³zÉ{ß\u009dÕ\u009aëðá£÷Ñ\rÊ\u0003û\u0019â0p:w$H;]1E/m%d\u0013\u0019\t\u001c\u00077}:\u0092ú\u0098Û\u0086ë\u008c«º© \u009e®µÔ¿ÂRÈFö~ü+ê\u001d\u0010\u0004\u001e)\u0004k3ø9Ã'é-ä[\u0096A\u008e*S l>V4P\u0002=\u0018+\u0016\u0016lBzÁpÆNùD\u0082R°¨·¦\u009b¼\u008e\u008bf\u0081\"\u009fT\u0095Mã ùb÷\nÍZÛ¤±Ý»â¥Ø¯Þ\u0099³\u0083¥\u008d\u0098÷ÌáOëHÕwß\fÉ>39=\u0015'\u0000\u0010è\u001a¬\u0004Ú\u000eÃx®bìl\u0084VÔ@*JS´\n¾\u0018±î»ã¥\u0092¯Ä\u0099½\u0083¾\u008d\u0098÷\u009bá}ë~ÕY±û»ã¥Ð¯È\u0099º\u0083¥\u008d\u008f÷\u0084±ê»î¥Ó¯Ô\u0099ä\u0083ú±î»í¥Ò¯Ï\u0099´\u0083¹ÕÓßÞÁ¯Ëáý\u0093ç\u009eé¥\u0093¤\u0085B\u008fE±/»s\u00ad\u0013W\u0010Y/C5¼m¶`¨\u0011¢D\u0094:\u008e=\u0080\u0011ú\nìóæ¡ØÎÒÊÄ²>ºµ/°\u000fº\u0002¤s®>\u0098X\u0082N\u008chö\u007fà\u0098±¬VP\\]B,Hp~\u0017d\u001bj.\u00106\u0006\u008c\fÂ2ð8ý.\u0086Ô\u0087Ú¡À¦±ú»ù¥Ð¯À\u0099\u0083\u0083´\u008dÄ÷Ú±î»ã¥\u0092¯Î\u0099©\u0083¥\u008d\u0090÷\u0088á2ëjÕUßBÉ;3)=\u000e'\u001c\u0010î\u001aå\u0004Ò\u000eØI\u008cC\u009e]¥W¾aÙ{Òuè\u000f´\u0019\u0018\u0013\u001f- 't1LË^Åeß~è\u0099â\u0092ü¨±û»é¥Ò¯É\u0099®\u0083¥\u008d\u009f÷³ádë4Õ\nß\u0003É/3(=\u0017'3\u0010ä\u001a´\u0004\u008a\u000e\u0083x»b©l\u0092V\u0089@nJe´_¾s¨$\u0092t\u009cJ4·>¥ \u009e*\u0085\u001câ\u0006é\bÓr\u008fd7n/P\u001fZ\u0007L|¶e¸o¢S\u0095´\u009f«\u0081ß\u008b\u0087ýõçîéÕÓÒÅ9Ï#±û»é¥Ò¯É\u0099®\u0083¥\u008d\u009f÷ÃájënÕSßTÉd3z=\f'C\u0010ê\u001aî\u0004Ó\u000eÔxäbúl\u008c6t<l\"\\(D\u001e?\u0004&\n\\p\u0010f÷lèRìXÄN£´«º\u009c \u008d\u0097v\u009d\\\u0083K\u0089\u001bÿeålë\u0014Ñ\u0006ÇýÍæ3Á9Ê/°\u0015\u009c\u001b\u008b\u0001Ût%±î»ã¥\u0092¯Î\u0099³\u0083£\u008d\u0088÷\u0080ásëmÕXßIÉ.\u0013µ\u0019¸\u0007É\r\u0095;è!ø/ÓUÞC*I6w\u0000}\u0012k)\u0091u\u009fR\u0085^²«¸³¦É¬\u0091ÚîÀùÎÀôÒâ5è'\u0016\u0015\u001c\u001e\ni0c\u0087-\u008d\u0012\u0093(\u0099.¯CµU»hÁ1×\u0094ÝÄãúñ\u0098û\u0095åäï¸ÙßÃÓÍæ·þ¡D«\u001e\u0095#\u009f)\u0089ZsV}kgcPÄZ\u0093D®m\u008ag\u008by\u00adsºE\u0093\u0012\u009e\u0018\u0089\u0006¾\f³:\u0099 Ô.áTäBYH\u0016v2|*jB\u0090\n\u009eg\u0084u³\u0098¹\u0097§¤bòhövÎ|ÆJíP»^\u0094$Ý2n8r\u0006J\f]\u001a(à6î\u001aô\u0000®A¤Eº}°u\u0086^\u009c\u0013\u00926ènþÖôÁÊûÀåÖ¯,\u0083\"±8\u00ad\u000fU\u0005R\u001bq\u000eù\u0004ý\u001aÅ\u0010Í&æ<«2\u008eHÖ^dT{jL`gv,\u008c=\u0082\u0006\u0098\u000b¯á¥ì»Ñ±î»ã¥\u0092¯Ç\u0099¹\u0083¾\u008d\u0092÷\u0089ápë\"Õ]ßBÉ83>=\u0013'\u0005\u0010ø\u001a¢\u0004Í\u000eÉx±b¹l\u0098\u0003E\tH\u00179\u001de+\u00181\b?#EiSÆYÂgúmò{Ù\u0081\u0086\u008f¡\u0095£¢h¨I¶v¼jÊ\u0012±î»ã¥\u0092¯Ã\u0099¸\u0083¡\u008dÒ÷\u008eáiëeÕPßHÉr3*=\u0015'\u0002\u0010û\u001aé\u0004Î\u000eÜx®b¥l\u0092V\u0098±î»ã¥\u0092¯Ü\u0099®\u0083£\u008d\u0098÷\u0099á\u007fëxÕ\u0012ßNÉ)3%=\u0010'\b\u0010²\u001aê\u0004Õ\u000eÂx»b©l\u008eV\u009c@nJe´R¾X±î»ã¥\u0092¯ß\u0099¥\u0083¿\u008d\u0088÷\u0089áqë\"Õ^ßYÉ53 =\u0018'B\u0010ú\u001aå\u0004Ò\u000eËx¹b¾l\u008cV\u009e@uJb´H©\u0091£\u009c½í· \u0081Ú\u009bÀ\u0095÷ïöù\u000eó,Í&Ç+ÑW+\u001d%a?f\b\u008a\u0002\u009f\u001c§\u0016ý`ÅzÚtíNôX\u0006R\u0001¬3¦!°J\u008a]\u0084w\u0082É\u0088Ä\u0096µ\u009cýª\u009e°\u0085¾¿Ä¤ÒIØ\u0005æyì~ú\u0012\u0000\u0007\u000e?\u0014e#Ý)Â7õ=ìK\u009eQ\u0099_«e¹sRyE\u0087o±î»ã¥\u0092¯Ú\u0099¹\u0083¢\u008d\u0098÷\u0083ánëSÕXß@É73!=R'\u000e\u0010é\u001aå\u0004Ð\u000eÈxòbªl\u0095V\u0082@{Ji´N¾\\¨.\u0092%\u009c\u0012\u0086\u0018Cë\u0006%\f9±¦±µ\u001f\f\u0015W\u000bf\u0001e7L-\u0002#&Y>OÖEì{óqúg\u0093\u009d\u0096±³»è¥Ù¯Ú\u0099ó\u0083¿\u008d\u0093÷\u008fáwëiÕHß\u0003É>3-=\u000f'\t\u0010þ\u001aí\u0004Ò\u000eÈx\u0083b«l\u0099V\u0082@eJh\u008dÛ\u0087\u0080\u0099±\u0093²¥\u009b¿×±ûËçÝ\u001f×\u0001é ãkõS\u000fA\u0001z\u001b},\u0090| vûhÊbÉTàN¬@\u0080:\u009c,d&z\u0018[\u0012\u0010\u0004>þ:ð\u0002ê\nÝë±³»ÿ¥Å¯ß\u0099ó\u0083½\u008d\u0099÷\u0081áiëSÕHß^É=3/=\u0019Ê*ÀfÞ\\ÔFâ1ø0ö\b\u008cZ\u009aé\u0090ü®Ç¤\u009a²©H¼F\u0087\\\u0096kZax\u007fDuY\u0003)\u0019:\u0017\u0006-*;á1ðÏÇÅÀÓ¢é\u008aç\u0094ý\u0090\u0088h\u0086`\u009c\u000bªF *±³»è¥Ù¯Ú\u0099ó\u0083®\u008d\u008f÷\u0098áCëkÕLß_\u001bÙ\u0011\u0082\u000f³\u0005°3\u0099)Ä'å]òK)A\u0012\u007f?u+cS\u0006²\fé\u0012Ø\u0018Û.ò4¾:\u0092@\u008eVv\\hbIh\u0002~?\u0084>\u008a\t\u0090\u000b§ò\u00adá³Ù¹ÈÏ¯Õ©ñ¬ûàåÚïÀÙ·Ã¶Í\u008e·Ü¡o«z\u0095A\u009f\u001c\u0089/s:}\u0001g\u0011PðZçDÅNÜ8¯\"·,\u0086\u0016\u0081\u0000\\\nyôMþZèmÒ Ü\f±³»è¥Ù¯Ú\u0099ó\u0083®\u008d\u008f÷\u0098á}ëoÕ_ßI±³»è¥Ù¯Ú\u0099ó\u0083®\u008d\u008f÷\u0098á{ëuÕNßC\f'\u0006|\u0018M\u0012N$g>:0\u001bJ\f\\åVýhÏbÖ±³»è¥Ù¯Ú\u0099ó\u0083®\u008d\u008f÷\u0098ásë~ÕUßI3¿9ä'Õ-Ö\u001bÿ\u0001¢\u000f\u0083u\u0094cfimWC]G±³»è¥Ù¯Ú\u0099ó\u0083®\u008d\u008f÷\u0098álëkÕ]ßEÉ,3/I\u0007C\\]mWnaG{\u001au;\u000f,\u0019÷\u0013Ñ-å'ýþmô6ê\u0003à\u0006ÖcÌ=ÂF¸]®µ¤¼\u009a\u008e\u0090\u009d\u0086ã|örÑh\u009d_lU*K\u0000A]7`-a#V\u0019Y±³»á¥Ò¯Ø\u0099ó\u0083»\u008d\u0095÷\u0082áxëcÕKß_És3\u000e=\u000f'\u0018\u0010Ï\u001aä\u0004Ý\u000eÞx¹b¨lºV\u0083@pJh´Y¾^±³»ü¥Î¯Ã\u0099¿\u0083ã\u008d\u0095÷\u0083álëcÕNßXÉ/±¬»ê¥Ú¯\u008c\u0099æßrÕ=Ë\u000fÁ\u0002÷~í\"ãN\u0099H\u008f±\u0085«»Ò±\u0080§ü]ýSÎ±û»þ¥Ý¯À\u0099°\u0083£\u008d\u009f÷Âá{ëcÕPßHÉ:3%=\u000f'\u0004\u0010²\u001aÿ\u0004Ó±ð»å¥Þ¯ë\u0099\u0090\u0083\u0089\u008d¯÷³á~ë\u007fÕHß\u0002É/3#\u0000¸\nâ\u0014Ã\u001eÄ(ø2ª<\u0092F\u0083P~ZfdhnDx8\u0082#\u008c\u0012\u0096\u0004¡ä«©µÏ¿ÊÉ»\u00966\u009c(\u0082\u0001\u0088\u0001¾g¤pªUÐGÆ¿Ì·±³»é¥È¯Ï\u0099ó\u0083¡\u008d\u0093÷\u0099árëxÕO\u008dí\u0087¶\u0099\u0083\u0093\u0086¥ã¿½±ÆËÝÝ5×<é\u000eã\u001dõc\u000fv\u0001Q\u001b\u001d,ì&¶8\u00922ÝDã^âPÒjÁ|lv*\u0088\u000f\u0082\u001eè°âÿüÍöÀÀ¼ÚàÔ\u009c®\u009f¸j²f\u008cQ\u0086I\u00900±Û»ã¥Ð¯È\u0099º\u0083¥\u008d\u008f÷\u0084]BW\u0019I,C)uLo\u0012a`\u001bt\r\u009e\u0007\u009e9â3\u00ad%ßßÒÑëËôü\u0001ö\u0018è>âr\u0094N\u008eH\u0080\u007fº2¬Ý¦ÒX®R²DÀ~\u0093pàjô\u001f\u000e\u0011\u000f\u000b\"=+7D)O#yÕ3Ï\u0080Á\u0098û í¨çÄ\u0099Ð\u0093è".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7239574842106231692L;
    }

    private static String $$e(int i, byte b, int i2) {
        int i3 = (i2 * 2) + 4;
        byte[] bArr = $$c;
        int i4 = i * 4;
        int i5 = 115 - (b * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i5 = i3 + (-i6);
        }
        while (true) {
            int i8 = i3;
            int i9 = i5;
            i7++;
            bArr2[i7] = (byte) i9;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 = i8 + 1;
            i5 = i9 + (-bArr[i8]);
        }
    }
}
