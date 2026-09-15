package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.appsflyer.internal.AFg1xSDK;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzic;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class AppMeasurementContentProvider extends ContentProvider {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementContentProvider.$$a
            int r7 = r7 + 84
            int r9 = r9 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r8]
            r6 = r3
            r3 = r7
            r7 = r6
        L25:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementContentProvider.b(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 497 - r5
            int r7 = r7 + 1
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementContentProvider.$$d
            int r6 = r6 + 76
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            int r5 = r5 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementContentProvider.c(short, int, int, java.lang.Object[]):void");
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0188  */
    /* JADX WARN: Code duplicated, block: B:39:0x0189  */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 103;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19520 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getTouchSlop() >> 8) + 2624, 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.indexOf("", "", 0, 0)), View.getDefaultSize(0, 0) + 481, MotionEvent.axisFromString("") + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 480 - TextUtils.lastIndexOf("", '0'), (-16777179) - Color.rgb(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 481, Color.rgb(0, 0, 0) + 16777253, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:104:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:106:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:111:0x0b06 A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:120:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:121:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:124:0x0c13  */
    /* JADX WARN: Code duplicated, block: B:128:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0cdd  */
    /* JADX WARN: Code duplicated, block: B:131:0x0ce9  */
    /* JADX WARN: Code duplicated, block: B:134:0x0ced A[LOOP:5: B:132:0x0cea->B:134:0x0ced, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0d88  */
    /* JADX WARN: Code duplicated, block: B:141:0x0ded  */
    /* JADX WARN: Code duplicated, block: B:142:0x0e35  */
    /* JADX WARN: Code duplicated, block: B:145:0x0e4c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0e5f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0f15  */
    /* JADX WARN: Code duplicated, block: B:154:0x0f9d  */
    /* JADX WARN: Code duplicated, block: B:159:0x1009  */
    /* JADX WARN: Code duplicated, block: B:162:0x105e  */
    /* JADX WARN: Code duplicated, block: B:166:0x10b5  */
    /* JADX WARN: Code duplicated, block: B:167:0x1129  */
    /* JADX WARN: Code duplicated, block: B:169:0x1135  */
    /* JADX WARN: Code duplicated, block: B:172:0x1139 A[LOOP:4: B:170:0x1136->B:172:0x1139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x11d4  */
    /* JADX WARN: Code duplicated, block: B:179:0x123e  */
    /* JADX WARN: Code duplicated, block: B:180:0x1283  */
    /* JADX WARN: Code duplicated, block: B:183:0x1298  */
    /* JADX WARN: Code duplicated, block: B:185:0x12a1  */
    /* JADX WARN: Code duplicated, block: B:188:0x134b  */
    /* JADX WARN: Code duplicated, block: B:190:0x1361  */
    /* JADX WARN: Code duplicated, block: B:196:0x1371  */
    /* JADX WARN: Code duplicated, block: B:200:0x13ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x1408  */
    /* JADX WARN: Code duplicated, block: B:207:0x146e  */
    /* JADX WARN: Code duplicated, block: B:208:0x14af  */
    /* JADX WARN: Code duplicated, block: B:211:0x14c7  */
    /* JADX WARN: Code duplicated, block: B:215:0x151a  */
    /* JADX WARN: Code duplicated, block: B:219:0x152f  */
    /* JADX WARN: Code duplicated, block: B:221:0x15a8  */
    /* JADX WARN: Code duplicated, block: B:224:0x15fa  */
    /* JADX WARN: Code duplicated, block: B:226:0x1603  */
    /* JADX WARN: Code duplicated, block: B:229:0x16cc  */
    /* JADX WARN: Code duplicated, block: B:231:0x16e0  */
    /* JADX WARN: Code duplicated, block: B:237:0x16fa  */
    /* JADX WARN: Code duplicated, block: B:242:0x179b  */
    /* JADX WARN: Code duplicated, block: B:247:0x1803  */
    /* JADX WARN: Code duplicated, block: B:248:0x1845  */
    /* JADX WARN: Code duplicated, block: B:251:0x185f  */
    /* JADX WARN: Code duplicated, block: B:255:0x18c1  */
    /* JADX WARN: Code duplicated, block: B:257:0x1946  */
    /* JADX WARN: Code duplicated, block: B:260:0x1992  */
    /* JADX WARN: Code duplicated, block: B:262:0x199b  */
    /* JADX WARN: Code duplicated, block: B:265:0x1a58  */
    /* JADX WARN: Code duplicated, block: B:269:0x1af5  */
    /* JADX WARN: Code duplicated, block: B:274:0x1b61  */
    /* JADX WARN: Code duplicated, block: B:275:0x1ba6  */
    /* JADX WARN: Code duplicated, block: B:278:0x1bc1  */
    /* JADX WARN: Code duplicated, block: B:282:0x1c1e  */
    /* JADX WARN: Code duplicated, block: B:284:0x1c89  */
    /* JADX WARN: Code duplicated, block: B:287:0x1cf4  */
    /* JADX WARN: Code duplicated, block: B:288:0x1d3c  */
    /* JADX WARN: Code duplicated, block: B:291:0x1d56  */
    /* JADX WARN: Code duplicated, block: B:293:0x1d5f  */
    /* JADX WARN: Code duplicated, block: B:295:0x1e0c  */
    /* JADX WARN: Code duplicated, block: B:298:0x1e15 A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x1e6e A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x1f11  */
    /* JADX WARN: Code duplicated, block: B:310:0x1f7d  */
    /* JADX WARN: Code duplicated, block: B:313:0x1fd8  */
    /* JADX WARN: Code duplicated, block: B:317:0x202e  */
    /* JADX WARN: Code duplicated, block: B:318:0x208e  */
    /* JADX WARN: Code duplicated, block: B:320:0x209a  */
    /* JADX WARN: Code duplicated, block: B:323:0x209e  */
    /* JADX WARN: Code duplicated, block: B:330:0x213b  */
    /* JADX WARN: Code duplicated, block: B:333:0x218c  */
    /* JADX WARN: Code duplicated, block: B:335:0x2195  */
    /* JADX WARN: Code duplicated, block: B:338:0x2254  */
    /* JADX WARN: Code duplicated, block: B:340:0x2268  */
    /* JADX WARN: Code duplicated, block: B:346:0x2278  */
    /* JADX WARN: Code duplicated, block: B:350:0x22b3 A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x2326 A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:356:0x23ba  */
    /* JADX WARN: Code duplicated, block: B:358:0x23c3  */
    /* JADX WARN: Code duplicated, block: B:363:0x242d  */
    /* JADX WARN: Code duplicated, block: B:364:0x2478  */
    /* JADX WARN: Code duplicated, block: B:367:0x2492  */
    /* JADX WARN: Code duplicated, block: B:371:0x24e6  */
    /* JADX WARN: Code duplicated, block: B:375:0x24fd  */
    /* JADX WARN: Code duplicated, block: B:377:0x256f  */
    /* JADX WARN: Code duplicated, block: B:380:0x25dc  */
    /* JADX WARN: Code duplicated, block: B:381:0x2623  */
    /* JADX WARN: Code duplicated, block: B:384:0x263a  */
    /* JADX WARN: Code duplicated, block: B:386:0x2643  */
    /* JADX WARN: Code duplicated, block: B:388:0x26f6  */
    /* JADX WARN: Code duplicated, block: B:390:0x270a  */
    /* JADX WARN: Code duplicated, block: B:396:0x2724  */
    /* JADX WARN: Code duplicated, block: B:401:0x280e  */
    /* JADX WARN: Code duplicated, block: B:403:0x2817  */
    /* JADX WARN: Code duplicated, block: B:408:0x2883  */
    /* JADX WARN: Code duplicated, block: B:411:0x28d9  */
    /* JADX WARN: Code duplicated, block: B:418:0x293e  */
    /* JADX WARN: Code duplicated, block: B:420:0x29ac  */
    /* JADX WARN: Code duplicated, block: B:423:0x2a13  */
    /* JADX WARN: Code duplicated, block: B:424:0x2a58  */
    /* JADX WARN: Code duplicated, block: B:427:0x2a6d  */
    /* JADX WARN: Code duplicated, block: B:429:0x2a76  */
    /* JADX WARN: Code duplicated, block: B:432:0x2b2d  */
    /* JADX WARN: Code duplicated, block: B:434:0x2b41  */
    /* JADX WARN: Code duplicated, block: B:440:0x2b51  */
    /* JADX WARN: Code duplicated, block: B:444:0x2be9  */
    /* JADX WARN: Code duplicated, block: B:446:0x2bf2  */
    /* JADX WARN: Code duplicated, block: B:451:0x2c5c  */
    /* JADX WARN: Code duplicated, block: B:454:0x2cb1  */
    /* JADX WARN: Code duplicated, block: B:460:0x2d02  */
    /* JADX WARN: Code duplicated, block: B:462:0x31d6  */
    /* JADX WARN: Code duplicated, block: B:464:0x31e0  */
    /* JADX WARN: Code duplicated, block: B:466:0x31ed  */
    /* JADX WARN: Code duplicated, block: B:469:0x31fb A[LOOP:0: B:467:0x31f8->B:469:0x31fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:472:0x320d  */
    /* JADX WARN: Code duplicated, block: B:476:0x3215  */
    /* JADX WARN: Code duplicated, block: B:478:0x3222  */
    /* JADX WARN: Code duplicated, block: B:481:0x3226 A[LOOP:2: B:479:0x3223->B:481:0x3226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:486:0x3236  */
    /* JADX WARN: Code duplicated, block: B:488:0x3243  */
    /* JADX WARN: Code duplicated, block: B:491:0x3247 A[LOOP:3: B:489:0x3244->B:491:0x3247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:496:0x325f  */
    /* JADX WARN: Code duplicated, block: B:509:0x3284  */
    /* JADX WARN: Code duplicated, block: B:511:0x3291 A[LOOP:7: B:511:0x3291->B:513:0x3294, LOOP_START, PHI: r4
  0x3291: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:510:0x328f, B:513:0x3294] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:513:0x3294 A[LOOP:7: B:511:0x3291->B:513:0x3294, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:550:0x20b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x20aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x050c  */
    /* JADX WARN: Code duplicated, block: B:61:0x056f  */
    /* JADX WARN: Code duplicated, block: B:62:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x068c  */
    /* JADX WARN: Code duplicated, block: B:72:0x06be A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0722 A[Catch: all -> 0x327b, TryCatch #12 {all -> 0x327b, blocks: (B:348:0x229e, B:350:0x22b3, B:351:0x22e9, B:353:0x2326, B:354:0x23ae, B:296:0x1e0f, B:298:0x1e15, B:299:0x1e43, B:301:0x1e6e, B:302:0x1efe, B:109:0x0af1, B:111:0x0b06, B:112:0x0b38, B:70:0x06a9, B:72:0x06be, B:73:0x06f0, B:75:0x0722, B:76:0x079b), top: B:546:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x0819  */
    /* JADX WARN: Code duplicated, block: B:87:0x086b  */
    /* JADX WARN: Code duplicated, block: B:91:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0933  */
    /* JADX WARN: Code duplicated, block: B:94:0x093e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0942 A[LOOP:6: B:95:0x093f->B:97:0x0942, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v548, types: [boolean, int] */
    @Override // android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        Object[] objArr;
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        String[] strArr;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object[] objArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        int i4;
        int i5;
        ArrayList arrayList2;
        String[] strArr2;
        Object[] objArr4;
        int i6;
        int i7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        Object[] objArr5;
        int i8;
        int i9;
        ArrayList arrayList3;
        String[] strArr3;
        Object[] objArr6;
        int i10;
        int i11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object[] objArr7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        int i12;
        int i13;
        ArrayList arrayList4;
        String[] strArr4;
        Object[] objArr8;
        int i14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        long j3;
        long jLongValue3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        String str;
        Context applicationContext;
        Object[] objArr9;
        Object[] objArr10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        int i15;
        int i16;
        Object[] objArr11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Context applicationContext2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
        Object[] objArr12;
        int i17;
        int i18;
        ArrayList arrayList5;
        String[] strArr5;
        int i19;
        Object[] objArr13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
        Object[] objArr14;
        ArrayList arrayList6;
        String[] strArr6;
        int i20;
        Object[] objArr15;
        Context context;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33;
        long j4;
        long jLongValue4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36;
        Object[] objArr16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39;
        int i21;
        int i22;
        int i23;
        ArrayList arrayList7;
        String[] strArr7;
        Object[] objArr17;
        int i24;
        int i25;
        int i26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40;
        Context applicationContext3;
        String str2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42;
        Object[] objArr18;
        Object[] objArr19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45;
        Object[] objArr20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46;
        long j5;
        long jLongValue5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47;
        Context applicationContext4;
        Object[] objArr21;
        int i27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50;
        int i28;
        int i29;
        int i30;
        ArrayList arrayList8;
        String[] strArr8;
        int i31;
        Object[] objArr22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51;
        long j6;
        long jLongValue6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52;
        Context applicationContext5;
        Object[] objArr23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55;
        int i32;
        int i33;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65;
        int i34 = 2 % 2;
        Object[] objArr24 = new Object[1];
        a(new char[]{4166, 65508, 53017, 57170, 44796, 48687, 36429, 40370, 27936, 32065, 19659, 23579, 11330, 15261, 2853, 7009, 60058, 64025, 51809, 55711, 43456, 47485}, 61358 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr24);
        String str3 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        a(new char[]{4162, 2050, 8404, 22668, 29040, 26927, 33269, 47498, 53770, 51927, 58001, 7024, 13090, 11263, 17340}, 6217 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr25);
        String str4 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        a(new char[]{4173, 41021, 28839, 311, 53733, 25132, 12964, 49940, 37784, 9306, 62650, 34071, 21904, 58988, 46840, 18303}, TextUtils.lastIndexOf("", '0', 0) + 45180, objArr26);
        String str5 = (String) objArr26[0];
        Object[] objArr27 = new Object[1];
        a(new char[]{4174, 51068, 48700, 38388, 19631, 9333, 6953, 62183, 43415, 33137, 30754, 12282, 1680, 65147, 54577, 36083}, 55102 - Process.getGidForName(""), objArr27);
        String str6 = (String) objArr27[0];
        Object[] objArr28 = new Object[1];
        a(new char[]{4166, 3620, 11417, 19218, 27132, 34927, 42701, 50418, 58158, 386, 8213, 24230, 32122, 39885, 47525, 55341, 63105, 5491, 13305, 21065, 28919, 28350, 36107, 43913, 51838, 59622}, (ViewConfiguration.getTapTimeout() >> 16) + 7789, objArr28);
        String str7 = (String) objArr28[0];
        Object[] objArr29 = new Object[1];
        a(new char[]{4164, 22333, 40587, 50712, 3582, 30050, 48329, 58479, 11055, 37552, 55837, 395, 18800, 45285, 63553, 16335, 26296, 44566}, 18287 - Color.argb(0, 0, 0, 0), objArr29);
        String str8 = (String) objArr29[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            int iGreen = 2267 - Color.green(0);
            int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte b = $$a[7];
            short s = b;
            Object[] objArr30 = new Object[1];
            b(b, s, (byte) (s | 52), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(capsMode, iGreen, iIndexOf, -887667012, false, (String) objArr30[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) == -1) {
            Context applicationContext6 = (Context) Class.forName(str7).getMethod(str8, new Class[0]).invoke(null, null);
            if (applicationContext6 != null) {
                applicationContext6 = ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) ? null : applicationContext6.getApplicationContext();
            }
            try {
                Object[] objArr31 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 823506069};
                short s2 = (short) 494;
                byte[] bArr = $$d;
                Object[] objArr32 = new Object[1];
                c(s2, (byte) (s2 & 55), (byte) (-bArr[2]), objArr32);
                Class<?> cls = Class.forName((String) objArr32[0]);
                Object[] objArr33 = new Object[1];
                c((short) 455, bArr[67], (byte) (-bArr[3]), objArr33);
                objArr = (Object[]) cls.getMethod((String) objArr33[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr31);
                if (applicationContext6 != null) {
                    int i35 = TuitionPaymentFragmentbindingInflater1 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
                    try {
                        if (i35 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                                int packedPositionType = 33 - ExpandableListView.getPackedPositionType(0L);
                                byte b2 = $$a[7];
                                Object[] objArr34 = new Object[1];
                                b(b2, (short) (b2 | 52), (byte) ($$b + 2), objArr34);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(doubleTapTimeout, iCombineMeasuredStates, packedPositionType, -654680577, false, (String) objArr34[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr);
                            long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[1]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue7);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                                char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', 0);
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33;
                                byte b3 = $$a[7];
                                Object[] objArr35 = new Object[1];
                                b(b3, (short) (b3 | 89), (byte) 52, objArr35);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c, iLastIndexOf, maximumDrawingCacheSize, -874156483, false, (String) objArr35[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue7 << 31);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                                int absoluteGravity2 = 33 - Gravity.getAbsoluteGravity(0, 0);
                                byte b4 = $$a[7];
                                short s3 = b4;
                                Object[] objArr36 = new Object[1];
                                b(b4, s3, (byte) (s3 | 52), objArr36);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(windowTouchSlop, absoluteGravity, absoluteGravity2, -887667012, false, (String) objArr36[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf2);
                        } else {
                            str8 = str8;
                            str7 = str7;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int iMyTid = (Process.myTid() >> 22) + 2267;
                                int size = View.MeasureSpec.getSize(0) + 33;
                                byte b5 = $$a[7];
                                Object[] objArr37 = new Object[1];
                                b(b5, (short) (b5 | 52), (byte) ($$b + 2), objArr37);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(offsetBefore, iMyTid, size, -654680577, false, (String) objArr37[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr);
                            long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue8);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int iIndexOf2 = 2267 - TextUtils.indexOf("", "", 0, 0);
                                int mode = 33 - View.MeasureSpec.getMode(0);
                                byte b6 = $$a[7];
                                Object[] objArr38 = new Object[1];
                                b(b6, (short) (b6 | 89), (byte) 52, objArr38);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(threadPriority, iIndexOf2, mode, -874156483, false, (String) objArr38[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue8 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int iGreen2 = 2267 - Color.green(0);
                                int i36 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                                byte b7 = $$a[7];
                                short s4 = b7;
                                Object[] objArr39 = new Object[1];
                                b(b7, s4, (byte) (s4 | 52), objArr39);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(c2, iGreen2, i36, -887667012, false, (String) objArr39[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf4);
                        }
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                i = ((int[]) objArr[3])[0];
                i2 = ((int[]) objArr[0])[0];
                if (i2 == i) {
                    arrayList = new ArrayList();
                    strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        for (String str9 : strArr) {
                            arrayList.add(str9);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i2));
                }
                objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i37 = ((int[]) objArr[2])[0];
                int i38 = ((int[]) objArr[0])[0];
                int i39 = ((int[]) objArr[3])[0];
                String[] strArr9 = (String[]) objArr[1];
                int iIdentityHashCode = System.identityHashCode(this);
                int i40 = i37 + (((~((-43394324) | iIdentityHashCode)) | 33693699) * (-283)) + 1754095540 + ((~(iIdentityHashCode | (-9700625))) * 283);
                int i41 = (i40 << 13) ^ i40;
                int i42 = i41 ^ (i41 >>> 17);
                ((int[]) objArr2[2])[0] = i42 ^ (i42 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int edgeSlop = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    byte b8 = $$a[7];
                    Object[] objArr40 = new Object[1];
                    b(b8, (short) (b8 | 89), (byte) 52, objArr40);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, edgeSlop, jumpTapTimeout, 1357589585, false, (String) objArr40[0], null);
                }
                j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1032;
                    int iRgb = Color.rgb(0, 0, 0) + 16777231;
                    byte b9 = $$a[7];
                    short s5 = b9;
                    Object[] objArr41 = new Object[1];
                    b(b9, s5, (byte) (s5 | 52), objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iLastIndexOf2, iRgb, 1344079056, false, (String) objArr41[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i43 = TuitionPaymentFragmentbindingInflater1 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i43 % 128;
                    int i44 = i43 % 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iResolveSize = View.resolveSize(0, 0) + 1031;
                        int iIndexOf3 = 15 - TextUtils.indexOf("", "", 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr42 = new Object[1];
                        b((byte) (bArr2[205] + 1), (short) 141, bArr2[7], objArr42);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c4, iResolveSize, iIndexOf3, 632103528, false, (String) objArr42[0], null);
                    }
                    Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
                    objArr3 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i45 = ((int[]) objArr43[3])[0];
                    int i46 = ((int[]) objArr43[1])[0];
                    String[] strArr10 = (String[]) objArr43[0];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i47 = ~iIdentityHashCode2;
                    int i48 = (((817647641 + ((~(301863384 | i47)) * (-560))) + ((~(iIdentityHashCode2 | 335460350)) * (-560))) + (((~((-57583215) | i47)) | 23986248) * 560)) - 1312433477;
                    int i49 = (i48 << 13) ^ i48;
                    int i50 = i49 ^ (i49 >>> 17);
                    ((int[]) objArr3[2])[0] = i50 ^ (i50 << 5);
                } else {
                    int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr44 = {-122827147};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), 1133 - TextUtils.lastIndexOf("", '0', 0), 18 - ExpandableListView.getPackedPositionGroup(0L), 807763283, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr45 = {Integer.valueOf(iIntValue), 0, -1312433477, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr44), false};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c5 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i51 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                            int i52 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                            byte b10 = $$a[7];
                            Object[] objArr46 = new Object[1];
                            b(b10, (short) (b10 | 89), (byte) 52, objArr46);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c5, i51, i52, 1298546779, false, (String) objArr46[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45993), 1116 - ExpandableListView.getPackedPositionChild(0L), 17 - Color.green(0)), Boolean.TYPE});
                        }
                        objArr3 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr3 = $$a;
                            Object[] objArr47 = new Object[1];
                            b((byte) (bArr3[205] + 1), (short) 141, bArr3[7], objArr47);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, maximumFlingVelocity, iMakeMeasureSpec, 632103528, false, (String) objArr47[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr3);
                        try {
                            long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf5 = Long.valueOf(jLongValue9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cGreen = (char) Color.green(0);
                                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                                int gidForName = Process.getGidForName("") + 16;
                                byte b11 = $$a[7];
                                short s6 = b11;
                                Object[] objArr48 = new Object[1];
                                b(b11, s6, (byte) (s6 | 52), objArr48);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, iIndexOf4, gidForName, 1344079056, false, (String) objArr48[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf5);
                            Long lValueOf6 = Long.valueOf(jLongValue9 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                int i53 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte b12 = $$a[7];
                                Object[] objArr49 = new Object[1];
                                b(b12, (short) (b12 | 89), (byte) 52, objArr49);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, i53, scrollBarFadeDuration, 1357589585, false, (String) objArr49[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf6);
                        } catch (Exception unused2) {
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
                i4 = ((int[]) objArr3[1])[0];
                i5 = ((int[]) objArr3[3])[0];
                if (i5 == i4) {
                    objArr4 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i54 = ((int[]) objArr3[2])[0];
                    int i55 = ((int[]) objArr3[3])[0];
                    int i56 = ((int[]) objArr3[1])[0];
                    String[] strArr11 = (String[]) objArr3[0];
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i57 = ~iIdentityHashCode3;
                    int i58 = i54 + (((~(287119874 | i57)) | (~((-531400045) | iIdentityHashCode3)) | (~(i57 | 531400044))) * 959) + 1127980948 + (((~(iIdentityHashCode3 | 531400044)) | (~(i57 | (-531400045))) | (~(287119874 | iIdentityHashCode3))) * 959);
                    int i59 = (i58 << 13) ^ i58;
                    int i60 = i59 ^ (i59 >>> 17);
                    i6 = 0;
                    ((int[]) objArr4[2])[0] = i60 ^ (i60 << 5);
                } else {
                    arrayList2 = new ArrayList();
                    strArr2 = (String[]) objArr3[0];
                    if (strArr2 != null) {
                        for (String str10 : strArr2) {
                            arrayList2.add(str10);
                        }
                    }
                    int[] iArr = new int[i5];
                    int i61 = i5 - 1;
                    iArr[i61] = 1;
                    Toast.makeText((Context) null, iArr[((i5 * i61) % 2) - 1], 1).show();
                    objArr4 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i62 = ((int[]) objArr3[2])[0];
                    int i63 = ((int[]) objArr3[3])[0];
                    int i64 = ((int[]) objArr3[1])[0];
                    String[] strArr12 = (String[]) objArr3[0];
                    int i65 = ~(((int) Process.getElapsedCpuTime()) | (-749884320));
                    int i66 = i62 + (((-1072955296) | i65) * (-196)) + 1501037801 + ((i65 | 323070976) * 196);
                    int i67 = (i66 << 13) ^ i66;
                    int i68 = i67 ^ (i67 >>> 17);
                    i6 = 0;
                    ((int[]) objArr4[2])[0] = i68 ^ (i68 << 5);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char cArgb = (char) (Color.argb(i6, i6, i6, i6) + 29944);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                    int scrollBarSize = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b13 = $$a[7];
                    Object[] objArr50 = new Object[1];
                    b(b13, (short) (b13 | 52), (byte) ($$b + 2), objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cArgb, keyRepeatDelay, scrollBarSize, 986134021, false, (String) objArr50[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                        int i69 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i70 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b14 = $$a[7];
                        short s7 = b14;
                        Object[] objArr51 = new Object[1];
                        b(b14, s7, (byte) (s7 | 52), objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(defaultSize, i69, i70, 1599039318, false, (String) objArr51[0], null);
                    }
                    Object[] objArr52 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).get(null);
                    objArr5 = new Object[]{new int[]{((int[]) objArr52[0])[0]}, new int[]{((int[]) objArr52[1])[0]}, (Object[]) objArr52[2], new int[1], (String[]) objArr52[4]};
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i71 = ~((-857501607) | (~iIdentityHashCode4));
                    int i72 = (((((-930901999) | i71) | (~(857501606 | iIdentityHashCode4))) * (-338)) - 899660629) + (((~(iIdentityHashCode4 | (-73400393))) | i71) * 338) + 212715320;
                    int i73 = (i72 << 13) ^ i72;
                    int i74 = i73 ^ (i73 >>> 17);
                    ((int[]) objArr5[3])[0] = i74 ^ (i74 << 5);
                } else {
                    int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
                    Object[] objArr53 = {-122827147};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionGroup(0L)), 1726 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr53), 212715320, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char c6 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                        int iCombineMeasuredStates2 = 1755 - View.combineMeasuredStates(0, 0);
                        int i75 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                        byte b15 = $$a[7];
                        short s8 = b15;
                        Object[] objArr54 = new Object[1];
                        b(b15, s8, (byte) (s8 | 52), objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c6, iCombineMeasuredStates2, i75, 1599039318, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1755;
                            int iIndexOf5 = TextUtils.indexOf("", "", 0) + 23;
                            byte b16 = $$a[7];
                            Object[] objArr55 = new Object[1];
                            b(b16, (short) (b16 | 141), (byte) 52, objArr55);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState, packedPositionType2, iIndexOf5, 1596667560, false, (String) objArr55[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue10 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 24;
                            byte b17 = $$a[7];
                            Object[] objArr56 = new Object[1];
                            b(b17, (short) (b17 | 52), (byte) ($$b + 2), objArr56);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf2, fadingEdgeLength, iLastIndexOf3, 986134021, false, (String) objArr56[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf8);
                        objArr5 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                }
                i8 = ((int[]) objArr5[1])[0];
                i9 = ((int[]) objArr5[0])[0];
                if (i9 == i8) {
                    int i76 = ((int[]) objArr5[3])[0];
                    objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
                    int i77 = ~new Random().nextInt();
                    int i78 = i76 + 629872956 + (((~((-195683440) | i77)) | (-16918987)) * (-983)) + (((~(i77 | (-16918987))) | 133504) * 983);
                    int i79 = (i78 << 13) ^ i78;
                    int i80 = i79 ^ (i79 >>> 17);
                    i10 = 0;
                    ((int[]) objArr6[3])[0] = i80 ^ (i80 << 5);
                } else {
                    arrayList3 = new ArrayList();
                    strArr3 = (String[]) objArr5[4];
                    if (strArr3 != null) {
                        for (String str11 : strArr3) {
                            arrayList3.add(str11);
                        }
                    }
                    Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
                    int i81 = ((int[]) objArr5[3])[0];
                    objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
                    int iIdentityHashCode5 = System.identityHashCode(this);
                    int i82 = ~iIdentityHashCode5;
                    int i83 = i81 + (-1144866607) + (((~(830390204 | i82)) | 234897474) * 168) + ((~((-234897475) | iIdentityHashCode5)) * 168) + (((~(iIdentityHashCode5 | 1065287678)) | (~(i82 | (-1042992631))) | 808095156) * 168);
                    int i84 = (i83 << 13) ^ i83;
                    int i85 = i84 ^ (i84 >>> 17);
                    i10 = 0;
                    ((int[]) objArr6[3])[0] = i85 ^ (i85 << 5);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cArgb2 = (char) Color.argb(i10, i10, i10, i10);
                    int iMyPid = (Process.myPid() >> 22) + 876;
                    int iResolveOpacity = Drawable.resolveOpacity(i10, i10) + 10;
                    byte[] bArr4 = $$a;
                    Object[] objArr57 = new Object[1];
                    b(bArr4[205], (short) 193, bArr4[9], objArr57);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb2, iMyPid, iResolveOpacity, -1199417970, false, (String) objArr57[0], null);
                }
                j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
                jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 876;
                    int edgeSlop2 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr5 = $$a;
                    Object[] objArr58 = new Object[1];
                    b(bArr5[33], (short) 203, bArr5[7], objArr58);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, iResolveOpacity2, edgeSlop2, 254769921, false, (String) objArr58[0], null);
                }
                if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                    TuitionPaymentFragmentbindingInflater1 = i86 % 128;
                    int i87 = i86 % 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                        int iIndexOf6 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                        int i88 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        Object[] objArr59 = new Object[1];
                        b(bArr6[205], (short) 203, bArr6[41], objArr59);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cLastIndexOf3, iIndexOf6, i88, 1324201839, false, (String) objArr59[0], null);
                    }
                    Object[] objArr60 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).get(null);
                    objArr7 = new Object[]{new int[]{((int[]) objArr60[0])[0]}, new int[1], new int[]{((int[]) objArr60[2])[0]}, (String[]) objArr60[3]};
                    int iNextInt = new Random().nextInt();
                    int i89 = (((((~(834263083 | iNextInt)) | (-93926956)) * 262) + 1608192996) + (((~((~iNextInt) | 834263083)) | (-93926956)) * 262)) - 760904938;
                    int i90 = (i89 << 13) ^ i89;
                    int i91 = i90 ^ (i90 >>> 17);
                    ((int[]) objArr7[1])[0] = i91 ^ (i91 << 5);
                } else {
                    Object[] objArr61 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -760904938};
                    byte[] bArr7 = $$d;
                    Object[] objArr62 = new Object[1];
                    c((short) 418, bArr7[6], (byte) (-bArr7[183]), objArr62);
                    Class<?> cls2 = Class.forName((String) objArr62[0]);
                    Object[] objArr63 = new Object[1];
                    c((short) 455, bArr7[67], (byte) (-bArr7[3]), objArr63);
                    objArr7 = (Object[]) cls2.getMethod((String) objArr63[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 10;
                        byte[] bArr8 = $$a;
                        Object[] objArr64 = new Object[1];
                        b(bArr8[205], (short) 203, bArr8[41], objArr64);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf4, modifierMetaStateMask, iCombineMeasuredStates3, 1324201839, false, (String) objArr64[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr7);
                    try {
                        long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                            char cRed = (char) Color.red(0);
                            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                            int iAlpha = Color.alpha(0) + 10;
                            byte[] bArr9 = $$a;
                            Object[] objArr65 = new Object[1];
                            b(bArr9[33], (short) 203, bArr9[7], objArr65);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cRed, fadingEdgeLength2, iAlpha, 254769921, false, (String) objArr65[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue11 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 876;
                            int defaultSize2 = 10 - View.getDefaultSize(0, 0);
                            byte[] bArr10 = $$a;
                            Object[] objArr66 = new Object[1];
                            b(bArr10[205], (short) 193, bArr10[9], objArr66);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(tapTimeout, trimmedLength, defaultSize2, -1199417970, false, (String) objArr66[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf10);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                i12 = ((int[]) objArr7[2])[0];
                i13 = ((int[]) objArr7[0])[0];
                if (i13 == i12) {
                    int i92 = ((int[]) objArr7[1])[0];
                    objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode6 = System.identityHashCode(this);
                    int i93 = ~iIdentityHashCode6;
                    int i94 = (-2133339090) + (((~((-684299995) | i93)) | 671122570) * (-1188));
                    int i95 = (~(iIdentityHashCode6 | 684299994)) | 671122570;
                    int i96 = ~(724610223 | i93);
                    int i97 = i92 + i94 + ((i95 | i96) * 594) + (((~(684299994 | i93)) | (-737787648) | i96) * 594);
                    int i98 = (i97 << 13) ^ i97;
                    int i99 = i98 ^ (i98 >>> 17);
                    ((int[]) objArr8[1])[0] = i99 ^ (i99 << 5);
                } else {
                    arrayList4 = new ArrayList();
                    strArr4 = (String[]) objArr7[3];
                    if (strArr4 != null) {
                        for (String str12 : strArr4) {
                            int i100 = TuitionPaymentFragmentbindingInflater1 + 101;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i100 % 128;
                            int i101 = i100 % 2;
                            arrayList4.add(str12);
                        }
                    }
                    int[] iArr2 = new int[i13];
                    int i102 = i13 - 1;
                    iArr2[i102] = 1;
                    Toast.makeText((Context) null, iArr2[((i13 * i102) % 2) - 1], 1).show();
                    int i103 = ((int[]) objArr7[1])[0];
                    objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode7 = System.identityHashCode(this);
                    int i104 = ~((-83957271) | iIdentityHashCode7);
                    int i105 = ~iIdentityHashCode7;
                    int i106 = i103 + 258053622 + ((i104 | (~(266288991 | i105))) * 497) + (((~(iIdentityHashCode7 | 266288991)) | (~((-222641951) | i105)) | 138684680) * 497);
                    int i107 = (i106 << 13) ^ i106;
                    int i108 = i107 ^ (i107 >>> 17);
                    ((int[]) objArr8[1])[0] = i108 ^ (i108 << 5);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i109 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                    byte[] bArr11 = $$a;
                    Object[] objArr67 = new Object[1];
                    b((byte) (bArr11[205] + 1), (short) 141, bArr11[7], objArr67);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(edgeSlop3, scrollDefaultDelay, i109, 252381699, false, (String) objArr67[0], null);
                }
                j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
                jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                    int i110 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                    int i111 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b18 = $$a[7];
                    Object[] objArr68 = new Object[1];
                    b(b18, (short) (b18 | 141), (byte) 52, objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf3, i110, i111, 2009631821, false, (String) objArr68[0], null);
                }
                if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int mode2 = View.MeasureSpec.getMode(0) + 876;
                        int iLastIndexOf4 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr12 = $$a;
                        Object[] objArr69 = new Object[1];
                        b(bArr12[54], (short) 210, bArr12[7], objArr69);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(maximumFlingVelocity2, mode2, iLastIndexOf4, 256017550, false, (String) objArr69[0], null);
                    }
                    Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
                    objArr10 = new Object[]{new int[]{((int[]) objArr70[0])[0]}, new int[1], new int[]{((int[]) objArr70[2])[0]}, (String[]) objArr70[3]};
                    int iIdentityHashCode8 = System.identityHashCode(this);
                    int i112 = (-557685300) + (((~((-2174081) | iIdentityHashCode8)) | 42484309) * (-756)) + (((~iIdentityHashCode8) | (-2174081)) * 756) + 1361490002;
                    int i113 = (i112 << 13) ^ i112;
                    int i114 = i113 ^ (i113 >>> 17);
                    ((int[]) objArr10[1])[0] = i114 ^ (i114 << 5);
                    str = str8;
                } else {
                    str = str8;
                    applicationContext = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if ((applicationContext instanceof ContextWrapper) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    }
                    Object[] objArr71 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1361490002};
                    byte[] bArr13 = $$d;
                    Object[] objArr72 = new Object[1];
                    c((short) 398, bArr13[482], (byte) (-bArr13[365]), objArr72);
                    Class<?> cls3 = Class.forName((String) objArr72[0]);
                    Object[] objArr73 = new Object[1];
                    c((short) 350, bArr13[67], bArr13[117], objArr73);
                    objArr9 = (Object[]) cls3.getMethod((String) objArr73[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr71);
                    if (applicationContext != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int iNormalizeMetaState = 876 - KeyEvent.normalizeMetaState(0);
                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 10;
                            byte[] bArr14 = $$a;
                            Object[] objArr74 = new Object[1];
                            b(bArr14[54], (short) 210, bArr14[7], objArr74);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cAlpha, iNormalizeMetaState, offsetBefore2, 256017550, false, (String) objArr74[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr9);
                        try {
                            long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf11 = Long.valueOf(jLongValue12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                                char c7 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 10;
                                byte b19 = $$a[7];
                                Object[] objArr75 = new Object[1];
                                b(b19, (short) (b19 | 141), (byte) 52, objArr75);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c7, packedPositionChild, packedPositionType3, 2009631821, false, (String) objArr75[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf11);
                            Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                                char c8 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                int iMyTid2 = (Process.myTid() >> 22) + 876;
                                int iAlpha2 = 10 - Color.alpha(0);
                                byte[] bArr15 = $$a;
                                Object[] objArr76 = new Object[1];
                                b((byte) (bArr15[205] + 1), (short) 141, bArr15[7], objArr76);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c8, iMyTid2, iAlpha2, 252381699, false, (String) objArr76[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf12);
                        } catch (Exception unused5) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr9 = objArr9;
                    }
                    objArr10 = objArr9;
                }
                i15 = ((int[]) objArr10[2])[0];
                i16 = ((int[]) objArr10[0])[0];
                if (i16 == i15) {
                    throw new RuntimeException(String.valueOf(i16));
                }
                int i115 = ((int[]) objArr10[1])[0];
                objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i116 = 692849236 + (((~(3762324 | startUptimeMillis)) | 36547904) * 672);
                int i117 = ~startUptimeMillis;
                int i118 = i115 + i116 + (((~(startUptimeMillis | 36547904)) | (~((-3762325) | i117))) * (-672)) + (((~((-36547905) | i117)) | 33850688) * 672);
                int i119 = (i118 << 13) ^ i118;
                int i120 = i119 ^ (i119 >>> 17);
                ((int[]) objArr11[1])[0] = i120 ^ (i120 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 31533);
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 921;
                    int i121 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr16 = $$a;
                    Object[] objArr77 = new Object[1];
                    b((byte) (bArr16[205] + 1), (short) 141, bArr16[7], objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cMyTid, iNormalizeMetaState2, i121, -1048449946, false, (String) objArr77[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                        char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int i122 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                        byte b20 = $$a[7];
                        Object[] objArr78 = new Object[1];
                        b(b20, (short) (b20 | 52), (byte) ($$b + 2), objArr78);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(jumpTapTimeout2, i122, modifierMetaStateMask2, -1142834547, false, (String) objArr78[0], null);
                    }
                    Object[] objArr79 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
                    objArr12 = new Object[]{new int[1], new int[]{((int[]) objArr79[1])[0]}, (Object[]) objArr79[2], new int[]{((int[]) objArr79[3])[0]}, (String[]) objArr79[4]};
                    int iIdentityHashCode9 = System.identityHashCode(this);
                    int i123 = (-487265255) + ((iIdentityHashCode9 | 349030297) * (-50));
                    int i124 = ~((-348161793) | iIdentityHashCode9);
                    int i125 = ~iIdentityHashCode9;
                    int i126 = ((i123 + ((i124 | (~((-1076887555) | i125))) * 50)) + (((~(i125 | 349030297)) | ((~((-1425049347) | i125)) | 1076887554)) * 50)) - 1159280180;
                    int i127 = (i126 << 13) ^ i126;
                    int i128 = i127 ^ (i127 >>> 17);
                    ((int[]) objArr12[0])[0] = i128 ^ (i128 << 5);
                    objArr11 = objArr11;
                } else {
                    applicationContext2 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
                    if (applicationContext2 != null) {
                        int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                        TuitionPaymentFragmentbindingInflater1 = i129 % 128;
                        int i130 = i129 % 2;
                        if ((applicationContext2 instanceof ContextWrapper) || ((ContextWrapper) applicationContext2).getBaseContext() != null) {
                            applicationContext2 = applicationContext2.getApplicationContext();
                        } else {
                            applicationContext2 = null;
                        }
                    }
                    Object[] objArr80 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1159280180};
                    byte[] bArr17 = $$d;
                    Object[] objArr81 = new Object[1];
                    c((short) 298, bArr17[482], (byte) (-bArr17[43]), objArr81);
                    Class<?> cls4 = Class.forName((String) objArr81[0]);
                    Object[] objArr82 = new Object[1];
                    c((short) 263, bArr17[67], bArr17[117], objArr82);
                    Object[] objArr83 = (Object[]) cls4.getMethod((String) objArr82[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr80);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char cRed2 = (char) (31533 - Color.red(0));
                        int iAlpha3 = 921 - Color.alpha(0);
                        int iIndexOf7 = 28 - TextUtils.indexOf("", "");
                        byte b21 = $$a[7];
                        Object[] objArr84 = new Object[1];
                        b(b21, (short) (b21 | 52), (byte) ($$b + 2), objArr84);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cRed2, iAlpha3, iIndexOf7, -1142834547, false, (String) objArr84[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr83);
                    try {
                        long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
                            byte b22 = $$a[7];
                            short s9 = b22;
                            Object[] objArr85 = new Object[1];
                            b(b22, s9, (byte) (s9 | 52), objArr85);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(pressedStateDuration, offsetAfter, deadChar, -778300370, false, (String) objArr85[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                            int i131 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int i132 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                            byte[] bArr18 = $$a;
                            Object[] objArr86 = new Object[1];
                            b((byte) (bArr18[205] + 1), (short) 141, bArr18[7], objArr86);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(pressedStateDuration2, i131, i132, -1048449946, false, (String) objArr86[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf14);
                        objArr12 = objArr83;
                    } catch (Exception unused6) {
                        throw new RuntimeException();
                    }
                }
                i17 = ((int[]) objArr12[1])[0];
                i18 = ((int[]) objArr12[3])[0];
                if (i18 == i17) {
                    arrayList5 = new ArrayList();
                    strArr5 = (String[]) objArr12[4];
                    if (strArr5 != null) {
                        for (String str13 : strArr5) {
                            arrayList5.add(str13);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i18));
                }
                int i133 = TuitionPaymentFragmentbindingInflater1 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i133 % 128;
                int i134 = i133 % 2;
                int i135 = ((int[]) objArr12[0])[0];
                objArr13 = new Object[]{new int[1], new int[]{((int[]) objArr12[1])[0]}, (Object[]) objArr12[2], new int[]{((int[]) objArr12[3])[0]}, (String[]) objArr12[4]};
                int i136 = ~((int) Process.getElapsedCpuTime());
                int i137 = ~(997535860 | i136);
                int i138 = i135 + (-1760628733) + ((i137 | 776543783) * 764) + (((~(i136 | 776543783)) | 288628816) * (-1528)) + ((356265555 | i137) * 764);
                int i139 = (i138 << 13) ^ i138;
                int i140 = i139 ^ (i139 >>> 17);
                ((int[]) objArr13[0])[0] = i140 ^ (i140 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 42994);
                    int offsetAfter2 = 3111 - TextUtils.getOffsetAfter("", 0);
                    int iLastIndexOf5 = 21 - TextUtils.lastIndexOf("", '0');
                    byte b23 = $$a[7];
                    Object[] objArr87 = new Object[1];
                    b(b23, (short) (b23 | 89), (byte) 52, objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(mirror, offsetAfter2, iLastIndexOf5, -1272852037, false, (String) objArr87[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char keyRepeatTimeout = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int maximumFlingVelocity3 = 3111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                        byte b24 = $$a[7];
                        Object[] objArr88 = new Object[1];
                        b(b24, (short) (b24 | 52), (byte) ($$b + 2), objArr88);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(keyRepeatTimeout, maximumFlingVelocity3, iMakeMeasureSpec2, 154975793, false, (String) objArr88[0], null);
                    }
                    Object[] objArr89 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
                    int i141 = ((int[]) objArr89[2])[0];
                    int i142 = ((int[]) objArr89[1])[0];
                    String[] strArr13 = (String[]) objArr89[3];
                    int[] iArr3 = {i141};
                    int[] iArr4 = {i142};
                    int iMyTid3 = Process.myTid();
                    int i143 = (((1517469222 + (((~((~iMyTid3) | (-468351545))) | 1236679914) * (-235))) + (((~((-468351545) | iMyTid3)) | 1236679914) * (-470))) + (((~(iMyTid3 | (-306725393))) | 1075053762) * 235)) - 937393304;
                    int i144 = (i143 << 13) ^ i143;
                    int i145 = i144 ^ (i144 >>> 17);
                    ((int[]) objArr14[0])[0] = i145 ^ (i145 << 5);
                    objArr14 = new Object[]{new int[1], iArr4, iArr3, strArr13};
                    objArr13 = objArr13;
                } else {
                    Object[] objArr90 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -937393304};
                    byte[] bArr19 = $$d;
                    Object[] objArr91 = new Object[1];
                    c((short) 211, bArr19[482], (byte) ($$e + 2), objArr91);
                    Class<?> cls5 = Class.forName((String) objArr91[0]);
                    Object[] objArr92 = new Object[1];
                    c((short) 263, bArr19[67], bArr19[117], objArr92);
                    Object[] objArr93 = (Object[]) cls5.getMethod((String) objArr92[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr90);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char cIndexOf4 = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iIndexOf8 = 3110 - TextUtils.indexOf((CharSequence) "", '0');
                        int iIndexOf9 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b25 = $$a[7];
                        Object[] objArr94 = new Object[1];
                        b(b25, (short) (b25 | 52), (byte) ($$b + 2), objArr94);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf4, iIndexOf8, iIndexOf9, 154975793, false, (String) objArr94[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr93);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                            char cIndexOf5 = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0'));
                            int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', 0, 0) + 3112;
                            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 22;
                            byte b26 = $$a[7];
                            short s10 = b26;
                            Object[] objArr95 = new Object[1];
                            b(b26, s10, (byte) (s10 | 52), objArr95);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cIndexOf5, iLastIndexOf6, deadChar2, -1269618118, false, (String) objArr95[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                            char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 43042);
                            int i146 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int iLastIndexOf7 = TextUtils.lastIndexOf("", '0') + 23;
                            byte b27 = $$a[7];
                            Object[] objArr96 = new Object[1];
                            b(b27, (short) (b27 | 89), (byte) 52, objArr96);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(trimmedLength2, i146, iLastIndexOf7, -1272852037, false, (String) objArr96[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf16);
                        objArr14 = objArr93;
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                }
                if (((int[]) objArr14[2])[0] == ((int[]) objArr14[1])[0]) {
                    arrayList6 = new ArrayList();
                    strArr6 = (String[]) objArr14[3];
                    if (strArr6 != null) {
                        for (String str14 : strArr6) {
                            arrayList6.add(str14);
                        }
                    }
                    throw null;
                }
                int i147 = ((int[]) objArr14[0])[0];
                int i148 = ((int[]) objArr14[2])[0];
                int i149 = ((int[]) objArr14[1])[0];
                String[] strArr14 = (String[]) objArr14[3];
                int[] iArr5 = {i149};
                int i150 = (~((int) Runtime.getRuntime().freeMemory())) | 869421610;
                int i151 = i147 + 788966329 + (i150 * 495) + (((~i150) | 834813992) * 495);
                int i152 = (i151 << 13) ^ i151;
                int i153 = i152 ^ (i152 >>> 17);
                ((int[]) objArr15[0])[0] = i153 ^ (i153 << 5);
                objArr15 = new Object[]{new int[1], iArr5, new int[]{i148}, strArr14};
                context = getContext();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char cLastIndexOf5 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 651;
                    int i154 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
                    byte b28 = $$a[7];
                    Object[] objArr97 = new Object[1];
                    b(b28, (short) (b28 | 141), (byte) 52, objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cLastIndexOf5, tapTimeout2, i154, -459846511, false, (String) objArr97[0], null);
                }
                j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null);
                jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iMyPid2 = (Process.myPid() >> 22) + 651;
                    int iIndexOf10 = 44 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr20 = $$a;
                    Object[] objArr98 = new Object[1];
                    b((byte) (bArr20[205] + 1), (short) 141, bArr20[7], objArr98);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cCombineMeasuredStates, iMyPid2, iIndexOf10, -873460649, false, (String) objArr98[0], null);
                }
                if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
                        int i155 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                        byte b29 = $$a[7];
                        Object[] objArr99 = new Object[1];
                        b(b29, (short) (b29 | 52), (byte) ($$b + 2), objArr99);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cNormalizeMetaState2, doubleTapTimeout2, i155, -1595579076, false, (String) objArr99[0], null);
                    }
                    Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
                    objArr16 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i156 = ((int[]) objArr100[2])[0];
                    int i157 = ((int[]) objArr100[0])[0];
                    int i158 = ~((int) Process.getStartElapsedRealtime());
                    int i159 = (-2113049387) + ((~((-69339394) | i158)) * (-783)) + (((~(i158 | (-70659946))) | (-74090756)) * 783) + 1222607733;
                    int i160 = (i159 << 13) ^ i159;
                    int i161 = i160 ^ (i160 >>> 17);
                    ((int[]) objArr16[3])[0] = i161 ^ (i161 << 5);
                    i21 = 0;
                } else {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b((char) (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0') + 1611, 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr101 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).newInstance(null), 1222607733, 0};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int iIndexOf11 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i162 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte[] bArr21 = $$a;
                        Object[] objArr102 = new Object[1];
                        b((byte) (bArr21[205] + 1), (short) 141, bArr21[7], objArr102);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cAxisFromString, iIndexOf11, i162, 2075921419, false, (String) objArr102[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-16776521) - Color.rgb(0, 0, 0), 98 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 63406), TextUtils.getOffsetBefore("", 0) + 793, ImageFormat.getBitsPerPixel(0) + 84), Integer.TYPE, Integer.TYPE});
                    }
                    objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).invoke(null, objArr101);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char c9 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int gidForName2 = Process.getGidForName("") + 652;
                        int i163 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43;
                        byte b30 = $$a[7];
                        Object[] objArr103 = new Object[1];
                        b(b30, (short) (b30 | 52), (byte) ($$b + 2), objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c9, gidForName2, i163, -1595579076, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr16);
                    try {
                        long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                            char cIndexOf6 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                            int i164 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iIndexOf12 = TextUtils.indexOf("", "", 0, 0) + 44;
                            byte[] bArr22 = $$a;
                            Object[] objArr104 = new Object[1];
                            b((byte) (bArr22[205] + 1), (short) 141, bArr22[7], objArr104);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf6, i164, iIndexOf12, -873460649, false, (String) objArr104[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char doubleTapTimeout3 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iMyPid3 = 651 - (Process.myPid() >> 22);
                            int iNormalizeMetaState3 = 44 - KeyEvent.normalizeMetaState(0);
                            byte b31 = $$a[7];
                            Object[] objArr105 = new Object[1];
                            b(b31, (short) (b31 | 141), (byte) 52, objArr105);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(doubleTapTimeout3, iMyPid3, iNormalizeMetaState3, -459846511, false, (String) objArr105[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf18);
                        i21 = 0;
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                }
                i22 = ((int[]) objArr16[i21])[i21];
                i23 = ((int[]) objArr16[2])[i21];
                if (i23 == i22) {
                    objArr17 = new Object[4];
                    int[] iArr6 = new int[1];
                    objArr17[i21] = iArr6;
                    int[] iArr7 = new int[1];
                    objArr17[2] = iArr7;
                    objArr17[3] = new int[1];
                    int i165 = ((int[]) objArr16[3])[i21];
                    int i166 = ((int[]) objArr16[2])[i21];
                    int i167 = ((int[]) objArr16[i21])[i21];
                    iArr7[i21] = i166;
                    iArr6[i21] = i167;
                    objArr17[1] = new String[i21];
                    int iIdentityHashCode10 = System.identityHashCode(this);
                    int i168 = i165 + ((~((~iIdentityHashCode10) | 47971039)) * 130) + 1876516439 + (((~(iIdentityHashCode10 | 47971039)) | 33562689) * 130);
                    int i169 = (i168 << 13) ^ i168;
                    int i170 = i169 ^ (i169 >>> 17);
                    i24 = 0;
                    ((int[]) objArr17[3])[0] = i170 ^ (i170 << 5);
                } else {
                    arrayList7 = new ArrayList();
                    strArr7 = (String[]) objArr16[1];
                    if (strArr7 != null) {
                        i25 = 0;
                        while (i25 < strArr7.length) {
                            i26 = TuitionPaymentFragmentbindingInflater1 + 27;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                            if (i26 % 2 == 0) {
                                arrayList7.add(strArr7[i25]);
                                i25 += 101;
                            } else {
                                arrayList7.add(strArr7[i25]);
                                i25++;
                            }
                        }
                    }
                    Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
                    objArr17 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i171 = ((int[]) objArr16[3])[0];
                    int i172 = ((int[]) objArr16[2])[0];
                    int i173 = ((int[]) objArr16[0])[0];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i174 = ~iUptimeMillis;
                    int i175 = (~((-1057936867) | i174)) | 17072546;
                    int i176 = ~(iUptimeMillis | (-13641737));
                    int i177 = i171 + (-16085691) + ((i175 | i176) * (-502)) + ((i176 | (~(i174 | (-1040864321)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                    int i178 = i177 ^ (i177 << 13);
                    int i179 = i178 ^ (i178 >>> 17);
                    i24 = 0;
                    ((int[]) objArr17[3])[0] = i179 ^ (i179 << 5);
                }
                Preconditions.checkNotNull(context);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char cLastIndexOf6 = (char) (53892 - TextUtils.lastIndexOf("", '0', i24, i24));
                    int packedPositionType4 = 1320 - ExpandableListView.getPackedPositionType(0L);
                    int capsMode2 = 36 - TextUtils.getCapsMode("", i24, i24);
                    byte[] bArr23 = $$a;
                    Object[] objArr106 = new Object[1];
                    b((byte) (bArr23[205] + 1), (short) 141, bArr23[7], objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cLastIndexOf6, packedPositionType4, capsMode2, -1433084963, false, (String) objArr106[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char cResolveSizeAndState = (char) (53893 - View.resolveSizeAndState(0, 0, 0));
                        int iIndexOf13 = 1320 - TextUtils.indexOf("", "");
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36;
                        byte b32 = $$a[7];
                        short s11 = b32;
                        Object[] objArr107 = new Object[1];
                        b(b32, s11, (byte) (s11 | 52), objArr107);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cResolveSizeAndState, iIndexOf13, maximumDrawingCacheSize2, -1920778747, false, (String) objArr107[0], null);
                    }
                    Object[] objArr108 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).get(null);
                    objArr19 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i180 = ((int[]) objArr108[0])[0];
                    int i181 = ((int[]) objArr108[3])[0];
                    String[] strArr15 = (String[]) objArr108[2];
                    int iMyUid = Process.myUid();
                    int i182 = (-573607116) + ((773971694 | iMyUid) * 614);
                    int i183 = ~iMyUid;
                    int i184 = ((i182 + ((((~((-365455396) | i183)) | 67127330) | (~(1005172429 | i183))) * (-1228))) + (((~(i183 | 1072299759)) | (~((-298328066) | i183))) * 614)) - 892335802;
                    int i185 = (i184 << 13) ^ i184;
                    int i186 = i185 ^ (i185 >>> 17);
                    ((int[]) objArr19[1])[0] = i186 ^ (i186 << 5);
                    objArr17 = objArr17;
                    str2 = str6;
                } else {
                    applicationContext3 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
                    if (applicationContext3 != null) {
                        if ((applicationContext3 instanceof ContextWrapper) || ((ContextWrapper) applicationContext3).getBaseContext() != null) {
                            applicationContext3 = applicationContext3.getApplicationContext();
                        } else {
                            applicationContext3 = null;
                        }
                    }
                    str2 = str6;
                    int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                    Object[] objArr109 = {-1197904234};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47976), 1300 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr110 = {applicationContext3, "com.bpjstku", -892335802, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(objArr109), false};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char c10 = (char) (53894 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iRgb2 = (-16775896) - Color.rgb(0, 0, 0);
                        int i187 = 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b33 = $$a[7];
                        short s12 = b33;
                        Object[] objArr111 = new Object[1];
                        b(b33, s12, (byte) (s12 | 52), objArr111);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c10, iRgb2, i187, 819724799, false, (String) objArr111[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57879 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1394, 75 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                    }
                    objArr18 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr110);
                    if (applicationContext3 != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                            char c11 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53892);
                            int packedPositionType5 = 1320 - ExpandableListView.getPackedPositionType(0L);
                            int iRed = Color.red(0) + 36;
                            byte b34 = $$a[7];
                            short s13 = b34;
                            Object[] objArr112 = new Object[1];
                            b(b34, s13, (byte) (s13 | 52), objArr112);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c11, packedPositionType5, iRed, -1920778747, false, (String) objArr112[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr18);
                        try {
                            long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf19 = Long.valueOf(jLongValue16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 53894);
                                int iResolveSize2 = 1320 - View.resolveSize(0, 0);
                                int i188 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte b35 = $$a[7];
                                Object[] objArr113 = new Object[1];
                                b(b35, (short) (b35 | 52), (byte) ($$b + 2), objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(bitsPerPixel, iResolveSize2, i188, -1273706634, false, (String) objArr113[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf19);
                            Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                                char jumpTapTimeout3 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 53893);
                                int iRgb3 = Color.rgb(0, 0, 0) + 16778536;
                                int iLastIndexOf8 = TextUtils.lastIndexOf("", '0') + 37;
                                byte[] bArr24 = $$a;
                                Object[] objArr114 = new Object[1];
                                b((byte) (bArr24[205] + 1), (short) 141, bArr24[7], objArr114);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(jumpTapTimeout3, iRgb3, iLastIndexOf8, -1433084963, false, (String) objArr114[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf20);
                        } catch (Exception unused9) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr18 = objArr18;
                        objArr17 = objArr17;
                    }
                    objArr19 = objArr18;
                }
                if (((int[]) objArr19[0])[0] == ((int[]) objArr19[3])[0]) {
                    throw null;
                }
                objArr20 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i189 = ((int[]) objArr19[1])[0];
                int i190 = ((int[]) objArr19[0])[0];
                int i191 = ((int[]) objArr19[3])[0];
                String[] strArr16 = (String[]) objArr19[2];
                int iNextInt2 = new Random().nextInt(106400069);
                int i192 = i189 + 583274754 + (((~((~iNextInt2) | 19527917)) | (-1370095344)) * 529) + (((~(iNextInt2 | 19527917)) | (-1351099908)) * 529);
                int i193 = (i192 << 13) ^ i192;
                int i194 = i193 ^ (i193 >>> 17);
                ((int[]) objArr20[1])[0] = i194 ^ (i194 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char cLastIndexOf7 = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 625;
                    int threadPriority2 = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr25 = $$a;
                    Object[] objArr115 = new Object[1];
                    b((byte) (bArr25[205] + 1), (short) 141, bArr25[7], objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cLastIndexOf7, capsMode3, threadPriority2, -477065106, false, (String) objArr115[0], null);
                }
                j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
                jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char cIndexOf7 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37568);
                    int mode3 = View.MeasureSpec.getMode(0) + 625;
                    int i195 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b36 = $$a[7];
                    Object[] objArr116 = new Object[1];
                    b(b36, (short) (b36 | 89), (byte) 52, objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cIndexOf7, mode3, i195, -976899241, false, (String) objArr116[0], null);
                }
                if (j5 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char cIndexOf8 = (char) (TextUtils.indexOf("", "", 0) + 37567);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
                        int iMyTid4 = 14 - (Process.myTid() >> 22);
                        byte b37 = $$a[7];
                        short s14 = b37;
                        Object[] objArr117 = new Object[1];
                        b(b37, s14, (byte) (s14 | 52), objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf8, iKeyCodeFromString, iMyTid4, -973632554, false, (String) objArr117[0], null);
                    }
                    Object[] objArr118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).get(null);
                    int i196 = ((int[]) objArr118[2])[0];
                    int i197 = ((int[]) objArr118[0])[0];
                    String[] strArr17 = (String[]) objArr118[3];
                    int[] iArr8 = {i196};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i198 = ~startElapsedRealtime;
                    int i199 = (-1785902040) + ((~(1049309681 | i198)) * (-560)) + ((~(startElapsedRealtime | (-2147847))) * (-560)) + (((~(774428439 | i198)) | 277029088) * 560) + 287124942;
                    int i200 = (i199 << 13) ^ i199;
                    int i201 = i200 ^ (i200 >>> 17);
                    ((int[]) objArr21[1])[0] = i201 ^ (i201 << 5);
                    objArr21 = new Object[]{new int[]{i197}, new int[1], iArr8, strArr17};
                    i27 = 0;
                } else {
                    applicationContext4 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
                    if (applicationContext4 != null) {
                        int i202 = TuitionPaymentFragmentbindingInflater1 + 1;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i202 % 128;
                        int i203 = i202 % 2;
                        if ((applicationContext4 instanceof ContextWrapper) || ((ContextWrapper) applicationContext4).getBaseContext() != null) {
                            applicationContext4 = applicationContext4.getApplicationContext();
                        } else {
                            applicationContext4 = null;
                        }
                    }
                    int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                    Object[] objArr119 = new Object[1];
                    a(new char[]{4117, 18619, 41395, 6829, 29602, 44184, 1431, 32478, 55254, 12416, 27131, 49825, 15342, 38119, 52696, 9861, 40832, 63647, 20883, 35385, 58214, 23677, 46454, 60954, 18202, 41025, 6415, 29269, 43816, 1142, 32061, 54841, 3902, 26719, 49415, 14869, 37650, 52203, 9449, 40361, 63145, 12275, 35017, 57804, 23181, 45959, 60586, 17829, 48886, 6078, 28861, 43485, 647, 31634, 54419, 3386, 26214, 57198, 14457, 37158, 51737, 8980, 40027, 62722}, TextUtils.indexOf("", "", 0) + 22777, objArr119);
                    String str15 = (String) objArr119[0];
                    Object[] objArr120 = new Object[1];
                    a(new char[]{4164, 18101, 48549, 5320, 19419, 41645, 6647, 28853, 42970, 7882, 30057, 44084, 806, 31298, 53515, 2094, 32549, 54839, 3335, 25629, 56046, 12799, 26787, 57284, 13965, 28072, 50411, 15295, 37504, 51609, 8292, 38770, 52862, 9494, 40020, 62255, 10815, 33117, 63572, 12048, 34285, 64681, 21407, 35520, 57812, 22692, 36798, 59017, 23950, 46279, 60264, 17015, 47385, 4188, 18262, 48672, 5484, 19546, 41755, 6674, 28850, 42992, 7883, 30092}, 22260 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr120);
                    Object[] objArr121 = {applicationContext4, new String[]{str15, (String) objArr120[0]}, Integer.valueOf(iIntValue4), 17, 287124942};
                    byte[] bArr26 = $$d;
                    Object[] objArr122 = new Object[1];
                    c((short) 93, bArr26[482], bArr26[117], objArr122);
                    Class<?> cls6 = Class.forName((String) objArr122[0]);
                    Object[] objArr123 = new Object[1];
                    c(bArr26[85], bArr26[467], bArr26[6], objArr123);
                    objArr21 = (Object[]) cls6.getMethod((String) objArr123[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr121);
                    int i204 = ((int[]) objArr21[0])[0];
                    int i205 = ((int[]) objArr21[2])[0];
                    if (applicationContext4 != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                            char keyRepeatTimeout2 = (char) (37567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int offsetAfter3 = 625 - TextUtils.getOffsetAfter("", 0);
                            int i206 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b38 = $$a[7];
                            short s15 = b38;
                            Object[] objArr124 = new Object[1];
                            b(b38, s15, (byte) (s15 | 52), objArr124);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(keyRepeatTimeout2, offsetAfter3, i206, -973632554, false, (String) objArr124[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr21);
                        try {
                            long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf21 = Long.valueOf(jLongValue17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                                char cIndexOf9 = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
                                int iArgb = Color.argb(0, 0, 0, 0) + 625;
                                int iResolveSize3 = View.resolveSize(0, 0) + 14;
                                byte b39 = $$a[7];
                                Object[] objArr125 = new Object[1];
                                b(b39, (short) (b39 | 89), (byte) 52, objArr125);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cIndexOf9, iArgb, iResolveSize3, -976899241, false, (String) objArr125[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf21);
                            Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                                char c12 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                                int defaultSize3 = View.getDefaultSize(0, 0) + 625;
                                int scrollBarFadeDuration2 = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte[] bArr27 = $$a;
                                Object[] objArr126 = new Object[1];
                                b((byte) (bArr27[205] + 1), (short) 141, bArr27[7], objArr126);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c12, defaultSize3, scrollBarFadeDuration2, -477065106, false, (String) objArr126[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf22);
                        } catch (Exception unused10) {
                            throw new RuntimeException();
                        }
                    }
                    i27 = 0;
                }
                i28 = ((int[]) objArr21[i27])[i27];
                i29 = ((int[]) objArr21[2])[i27];
                if (i29 == i28) {
                    i30 = i27;
                    arrayList8 = new ArrayList();
                    strArr8 = (String[]) objArr21[3];
                    if (strArr8 != null) {
                        int i207 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
                        TuitionPaymentFragmentbindingInflater1 = i207 % 128;
                        int i208 = i207 % 2;
                        for (i31 = i30; i31 < strArr8.length; i31++) {
                            arrayList8.add(strArr8[i31]);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i29));
                }
                objArr22 = new Object[4];
                int[] iArr9 = new int[1];
                objArr22[i27] = iArr9;
                objArr22[1] = new int[1];
                int[] iArr10 = new int[1];
                objArr22[2] = iArr10;
                int i209 = ((int[]) objArr21[1])[i27];
                int i210 = ((int[]) objArr21[2])[i27];
                int i211 = ((int[]) objArr21[i27])[i27];
                String[] strArr18 = (String[]) objArr21[3];
                iArr10[i27] = i210;
                iArr9[i27] = i211;
                int i212 = (int) Runtime.getRuntime().totalMemory();
                int i213 = i209 + ((((~((-268513441) | i212)) | 1082310720) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 629300568) + ((~((~i212) | (-268513441))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i214 = (i213 << 13) ^ i213;
                int i215 = i214 ^ (i214 >>> 17);
                ((int[]) objArr22[1])[0] = i215 ^ (i215 << 5);
                objArr22[3] = strArr18;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char packedPositionType6 = (char) ExpandableListView.getPackedPositionType(0L);
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 876;
                    int pressedStateDuration3 = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b40 = $$a[7];
                    Object[] objArr127 = new Object[1];
                    b(b40, (short) (b40 | 52), (byte) ($$b + 2), objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(packedPositionType6, iKeyCodeFromString2, pressedStateDuration3, -1650998592, false, (String) objArr127[0], null);
                }
                j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
                jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char c13 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int doubleTapTimeout4 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 10;
                    byte b41 = $$a[7];
                    short s16 = b41;
                    Object[] objArr128 = new Object[1];
                    b(b41, s16, (byte) (s16 | 52), objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c13, doubleTapTimeout4, iNormalizeMetaState4, 2012020043, false, (String) objArr128[0], null);
                }
                if (j6 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 877;
                        int i216 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                        byte b42 = $$a[7];
                        Object[] objArr129 = new Object[1];
                        b(b42, (short) (b42 | 89), (byte) 52, objArr129);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(deadChar3, bitsPerPixel2, i216, 2012931276, false, (String) objArr129[0], null);
                    }
                    Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                    objArr23 = new Object[]{new int[]{((int[]) objArr130[0])[0]}, new int[1], new int[]{((int[]) objArr130[2])[0]}, (String[]) objArr130[3]};
                    int iIdentityHashCode11 = System.identityHashCode(this);
                    int i217 = ~iIdentityHashCode11;
                    int i218 = ((((-2099172442) + (((~(136185150 | i217)) | (~((-1705005) | iIdentityHashCode11))) * (-831))) + ((~(178200383 | iIdentityHashCode11)) * (-1662))) + (((~(iIdentityHashCode11 | (-136185151))) | ((~(i217 | (-176495380))) | (~(176495379 | iIdentityHashCode11)))) * 831)) - 1183273683;
                    int i219 = (i218 << 13) ^ i218;
                    int i220 = i219 ^ (i219 >>> 17);
                    ((int[]) objArr23[1])[0] = i220 ^ (i220 << 5);
                } else {
                    applicationContext5 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
                    if (applicationContext5 != null) {
                        if ((applicationContext5 instanceof ContextWrapper) || ((ContextWrapper) applicationContext5).getBaseContext() != null) {
                            applicationContext5 = applicationContext5.getApplicationContext();
                        } else {
                            applicationContext5 = null;
                        }
                    }
                    Object[] objArr131 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -1183273683};
                    byte[] bArr28 = $$d;
                    byte b43 = bArr28[85];
                    Object[] objArr132 = new Object[1];
                    c(b43, bArr28[67], b43, objArr132);
                    Class<?> cls7 = Class.forName((String) objArr132[0]);
                    Object[] objArr133 = new Object[1];
                    c(bArr28[6], bArr28[67], bArr28[117], objArr133);
                    objArr23 = (Object[]) cls7.getMethod((String) objArr133[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr131);
                    if (applicationContext5 != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                            char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                            int i221 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int offsetBefore3 = 10 - TextUtils.getOffsetBefore("", 0);
                            byte b44 = $$a[7];
                            Object[] objArr134 = new Object[1];
                            b(b44, (short) (b44 | 89), (byte) 52, objArr134);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cAxisFromString2, i221, offsetBefore3, 2012931276, false, (String) objArr134[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, objArr23);
                        try {
                            long jLongValue18 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf23 = Long.valueOf(jLongValue18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                                char c14 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 876;
                                int iGreen3 = Color.green(0) + 10;
                                byte b45 = $$a[7];
                                short s17 = b45;
                                Object[] objArr135 = new Object[1];
                                b(b45, s17, (byte) (s17 | 52), objArr135);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c14, iCombineMeasuredStates4, iGreen3, 2012020043, false, (String) objArr135[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf23);
                            Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                                char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
                                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 876;
                                int size2 = View.MeasureSpec.getSize(0) + 10;
                                byte b46 = $$a[7];
                                Object[] objArr136 = new Object[1];
                                b(b46, (short) (b46 | 52), (byte) ($$b + 2), objArr136);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(trimmedLength3, iKeyCodeFromString3, size2, -1650998592, false, (String) objArr136[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf24);
                        } catch (Exception unused11) {
                            throw new RuntimeException();
                        }
                    }
                }
                i32 = ((int[]) objArr23[2])[0];
                i33 = ((int[]) objArr23[0])[0];
                if (i33 == i32) {
                    throw new RuntimeException(String.valueOf(i33));
                }
                int i222 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                TuitionPaymentFragmentbindingInflater1 = i222 % 128;
                int i223 = i222 % 2;
                int i224 = ((int[]) objArr23[1])[0];
                Object[] objArr137 = {new int[]{((int[]) objArr23[0])[0]}, new int[1], new int[]{((int[]) objArr23[2])[0]}, (String[]) objArr23[3]};
                int iMyTid5 = Process.myTid();
                int i225 = ~iMyTid5;
                int i226 = (-2106707358) + (((~((-481858569) | i225)) | 471367688) * (-1188));
                int i227 = (~(iMyTid5 | 481858568)) | 471367688;
                int i228 = ~(522168797 | i225);
                int i229 = i224 + i226 + ((i227 | i228) * 594) + (((~(481858568 | i225)) | (-532659678) | i228) * 594);
                int i230 = i229 ^ (i229 << 13);
                int i231 = i230 ^ (i230 >>> 17);
                ((int[]) objArr137[1])[0] = i231 ^ (i231 << 5);
                zzic.zzy(context, null, null);
                int i232 = ((int[]) objArr2[2])[0];
                int i233 = i232 * i232;
                int i234 = -(2000879497 * i232);
                int i235 = ((((i233 | i234) << 1) - (i233 ^ i234)) - (~(-(i232 * 730132573)))) - 1;
                int i236 = (i235 ^ 2082001065) + ((2082001065 & i235) << 1);
                int i237 = i236 >> 15;
                int i238 = ((((-262143) | i237) << 1) - (i237 ^ (-262143))) / 131072;
                int i239 = i238 & 1;
                int i240 = (i238 | 1) + i239;
                int i241 = -(((i236 & i240) + (i236 | i240)) ^ ((i238 ^ 1) + (i239 << 1)));
                int i242 = (i241 ^ 2) + ((i241 & 2) << 1);
                int i243 = ((i242 >> 21) - 4095) / 2048;
                int i244 = ((i243 | 1) << 1) - (i243 ^ 1);
                int i245 = 1081024 / (((-((i244 ^ 1) + ((i244 & 1) << 1))) & i242) * PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
                int i246 = ((int[]) objArr4[2])[0];
                int i247 = i246 * i246;
                int i248 = -(1871517888 * i246);
                int i249 = (i247 ^ i248) + ((i247 & i248) << 1);
                int i250 = -(i246 * 1580665982);
                int i251 = (i249 ^ i250) + ((i250 & i249) << 1);
                int i252 = (i251 & (-1776894271)) + ((-1776894271) | i251);
                int i253 = i252 >> 29;
                int i254 = ((i253 & (-15)) + (i253 | (-15))) / 8;
                int i255 = (i254 & 1) + (i254 | 1);
                int i256 = (i252 & i255) + (i255 | i252);
                int i257 = i252 >> 23;
                int i258 = (((i257 | (-1023)) << 1) - (i257 ^ (-1023))) / 512;
                int i259 = -((((i258 | 1) << 1) - (i258 ^ 1)) ^ i256);
                int i260 = (i259 ^ 8) + ((i259 & 8) << 1);
                int i261 = i260 >> 15;
                int i262 = ((((-262143) | i261) << 1) - (i261 ^ (-262143))) / 131072;
                int i263 = (i262 ^ 1) + ((i262 & 1) << 1);
                int i264 = i245 + (2284080 / (((-((i263 & 1) + (i263 | 1))) & i260) * 307));
                int i265 = ((int[]) objArr6[3])[0];
                int i266 = i265 * i265;
                int i267 = -(449622682 * i265);
                int i268 = (((i266 ^ i267) + ((i266 & i267) << 1)) - (~(-(i265 * 1689830550)))) - 1;
                int i269 = (i268 & (-1411945920)) + ((-1411945920) | i268);
                int i270 = ((i269 >> 26) + ComposerKt.defaultsKey) / 64;
                int i271 = ((i270 | 1) << 1) - (i270 ^ 1);
                int i272 = (i269 ^ i271) + ((i271 & i269) << 1);
                int i273 = i269 >> 24;
                int i274 = ((i273 ^ (-511)) + ((i273 & (-511)) << 1)) / 256;
                int i275 = -(i272 ^ (((i274 | 1) << 1) - (i274 ^ 1)));
                int i276 = (i275 ^ 1) + ((i275 & 1) << 1);
                int i277 = i276 >> 22;
                int i278 = (((i277 | (-2047)) << 1) - (i277 ^ (-2047))) / 1024;
                int i279 = ((i278 | 1) << 1) - (i278 ^ 1);
                int i280 = i264 + (735539 / (((-((i279 ^ 1) + ((i279 & 1) << 1))) & i276) * 883));
                int i281 = ((int[]) objArr8[1])[0];
                int i282 = ((i281 * i281) - (~(-(364649934 * i281)))) - 1;
                int i283 = -(i281 * 250304328);
                int i284 = (i282 & i283) + (i283 | i282);
                int i285 = ((i284 | 168839033) << 1) - (168839033 ^ i284);
                int i286 = ((i285 >> 16) - 131071) / 65536;
                int i287 = (i286 ^ 1) + ((i286 & 1) << 1);
                int i288 = ((i285 | i287) << 1) - (i287 ^ i285);
                int i289 = i285 >> 18;
                int i290 = ((i289 ^ (-32767)) + ((i289 & (-32767)) << 1)) / 16384;
                int i291 = (-(i288 ^ ((i290 & 1) + (i290 | 1)))) + 1;
                int i292 = i291 >> 19;
                int i293 = ((i292 & (-16383)) + (i292 | (-16383))) / 8192;
                int i294 = (i293 ^ 1) + ((i293 & 1) << 1);
                int i295 = i280 + (1241660 / ((i291 & (-(((i294 | 1) << 1) - (i294 ^ 1)))) * 1810));
                int i296 = ((int[]) objArr11[1])[0];
                int i297 = i296 * i296;
                int i298 = -(1605791257 * i296);
                int i299 = (i297 ^ i298) + ((i297 & i298) << 1);
                int i300 = -(i296 * 286326967);
                int i301 = ((i299 & i300) + (i300 | i299)) - 573187520;
                int i302 = i301 >> 27;
                int i303 = (((i302 | (-63)) << 1) - (i302 ^ (-63))) / 32;
                int i304 = (i303 ^ 1) + ((i303 & 1) << 1);
                int i305 = (i301 ^ i304) + ((i304 & i301) << 1);
                int i306 = ((i301 >> 22) - 2047) / 1024;
                int i307 = -(i305 ^ ((i306 ^ 1) + ((i306 & 1) << 1)));
                int i308 = (i307 & 1) + (i307 | 1);
                int i309 = i308 >> 18;
                int i310 = ((i309 ^ (-32767)) + ((i309 & (-32767)) << 1)) / 16384;
                int i311 = i295 + (35821 / (((-(((i310 ^ 1) + ((i310 & 1) << 1)) + 1)) & i308) * TypedValues.AttributesType.TYPE_EASING));
                int i312 = ((int[]) objArr13[0])[0];
                int i313 = i312 * i312;
                int i314 = -(1139361524 * i312);
                int i315 = ((i313 | i314) << 1) - (i313 ^ i314);
                int i316 = -(i312 * (-944775272));
                int i317 = ((i315 | i316) << 1) - (i316 ^ i315);
                int i318 = (i317 ^ (-934709468)) + (((-934709468) & i317) << 1);
                int i319 = i318 >> 27;
                int i320 = ((i319 ^ (-63)) + ((i319 & (-63)) << 1)) / 32;
                int i321 = ((i320 | 1) << 1) - (i320 ^ 1);
                int i322 = ((i318 | i321) << 1) - (i321 ^ i318);
                int i323 = i318 >> 18;
                int i324 = ((i323 ^ (-32767)) + ((i323 & (-32767)) << 1)) / 16384;
                int i325 = -(((i324 & 1) + (i324 | 1)) ^ i322);
                int i326 = ((i325 | 5) << 1) - (i325 ^ 5);
                int i327 = ((i326 >> 25) - 255) / 128;
                int i328 = i311 + (2615715 / (((-((((i327 | 1) << 1) - (i327 ^ 1)) + 1)) & i326) * 1571));
                int i329 = ((int[]) objArr15[0])[0];
                int i330 = ((((i329 * i329) - (~(-(1145451007 * i329)))) - 1) - (~(-(i329 * (-775213731))))) - 1;
                int i331 = (i330 & 1735350852) + (i330 | 1735350852);
                int i332 = (((i331 >> 24) - 511) / 256) + 1;
                int i333 = ((i331 | i332) << 1) - (i332 ^ i331);
                int i334 = i331 >> 21;
                int i335 = ((i334 ^ (-4095)) + ((i334 & (-4095)) << 1)) / 2048;
                int i336 = -(((i335 ^ 1) + ((i335 & 1) << 1)) ^ i333);
                int i337 = ((i336 | 4) << 1) - (i336 ^ 4);
                int i338 = i337 >> 26;
                int i339 = ((i338 & ComposerKt.defaultsKey) + (i338 | ComposerKt.defaultsKey)) / 64;
                int i340 = (i339 ^ 1) + ((i339 & 1) << 1);
                int i341 = i328 + (4427280 / (((-((i340 ^ 1) + ((i340 & 1) << 1))) & i337) * 1287));
                int i342 = ((int[]) objArr17[3])[0];
                int i343 = i342 * i342;
                int i344 = -(568211885 * i342);
                int i345 = (i343 & i344) + (i343 | i344);
                int i346 = -(i342 * 1503018847);
                int i347 = ((i345 ^ i346) + ((i346 & i345) << 1)) - 586738140;
                int i348 = i347 >> 23;
                int i349 = (((i348 | (-1023)) << 1) - (i348 ^ (-1023))) / 512;
                int i350 = (i349 & 1) + (i349 | 1);
                int i351 = (i347 ^ i350) + ((i350 & i347) << 1);
                int i352 = ((i347 >> 27) - 63) / 32;
                int i353 = -(i351 ^ (((i352 | 1) << 1) - (i352 ^ 1)));
                int i354 = (i353 ^ 3) + ((i353 & 3) << 1);
                int i355 = i354 >> 28;
                int i356 = ((i355 ^ (-31)) + ((i355 & (-31)) << 1)) / 16;
                int i357 = ((i356 | 1) << 1) - (i356 ^ 1);
                int i358 = i341 + (5259555 / (((-(((i357 | 1) << 1) - (i357 ^ 1))) & i354) * 1981));
                int i359 = ((int[]) objArr20[1])[0];
                int i360 = ((i359 * i359) - (~(-(955485807 * i359)))) - 1;
                int i361 = -(i359 * 1518457851);
                int i362 = (i360 & i361) + (i361 | i360);
                int i363 = (i362 & 900617465) + (900617465 | i362);
                int i364 = i363 >> 18;
                int i365 = ((i364 ^ (-32767)) + ((i364 & (-32767)) << 1)) / 16384;
                int i366 = (i363 - (~(((i365 | 1) << 1) - (i365 ^ 1)))) - 1;
                int i367 = i363 >> 26;
                int i368 = ((i367 & ComposerKt.defaultsKey) + (i367 | ComposerKt.defaultsKey)) / 64;
                int i369 = -(i366 ^ ((i368 & 1) + (i368 | 1)));
                int i370 = (i369 ^ 1) + ((i369 & 1) << 1);
                int i371 = i370 >> 22;
                int i372 = i358 + (138798 / (((-((((i371 & (-2047)) + (i371 | (-2047))) / 1024) + 2)) & i370) * 1402));
                int i373 = ((int[]) objArr22[1])[0];
                int i374 = i373 * i373;
                int i375 = -(1830334448 * i373);
                int i376 = (i374 & i375) + (i374 | i375);
                int i377 = -(i373 * 186537636);
                int i378 = (i376 & i377) + (i377 | i376);
                int i379 = (i378 ^ (-1527721628)) + (((-1527721628) & i378) << 1);
                int i380 = (((i379 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
                int i381 = -(((((i379 >> 29) - 15) / 8) + 1) ^ ((i379 ^ i380) + ((i380 & i379) << 1)));
                int i382 = (i381 ^ 3) + ((i381 & 3) << 1);
                int i383 = i382 >> 21;
                int i384 = ((i383 & (-4095)) + (i383 | (-4095))) / 2048;
                int i385 = (i384 & 1) + (i384 | 1);
                int i386 = i372 + (1507920 / (((-((i385 & 1) + (i385 | 1))) & i382) * 976));
                int i387 = ((int[]) objArr137[1])[0];
                int i388 = i387 * i387;
                int i389 = -(815249158 * i387);
                int i390 = (i388 ^ i389) + ((i388 & i389) << 1);
                int i391 = -(i387 * (-366004978));
                int i392 = (((i390 | i391) << 1) - (i391 ^ i390)) - 2044118940;
                int i393 = i392 >> 26;
                int i394 = (((i393 | ComposerKt.defaultsKey) << 1) - (i393 ^ ComposerKt.defaultsKey)) / 64;
                int i395 = (i394 ^ 1) + ((i394 & 1) << 1);
                int i396 = (i392 ^ i395) + ((i395 & i392) << 1);
                int i397 = i392 >> 28;
                int i398 = (((i397 | (-31)) << 1) - (i397 ^ (-31))) / 16;
                int i399 = (-(((i398 ^ 1) + ((i398 & 1) << 1)) ^ i396)) + 5;
                int i400 = i399 >> 20;
                int i401 = ((i400 & (-8191)) + (i400 | (-8191))) / 4096;
                int i402 = (i401 ^ 1) + ((i401 & 1) << 1);
                return i386 + ((-36336080) / ((i399 & (-((i402 & 1) + (i402 | 1)))) * 1256));
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iIndexOf14 = 2267 - TextUtils.indexOf("", "");
            int iMyPid4 = (Process.myPid() >> 22) + 33;
            byte b47 = $$a[7];
            Object[] objArr138 = new Object[1];
            b(b47, (short) (b47 | 52), (byte) ($$b + 2), objArr138);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(scrollDefaultDelay2, iIndexOf14, iMyPid4, -654680577, false, (String) objArr138[0], null);
        }
        Object[] objArr139 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
        objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
        int i403 = ((int[]) objArr139[0])[0];
        int i404 = ((int[]) objArr139[3])[0];
        String[] strArr19 = (String[]) objArr139[1];
        int i405 = (int) Runtime.getRuntime().totalMemory();
        int i406 = ~i405;
        int i407 = (-1872761009) + (((~((-1012768427) | i406)) | (-204055111)) * (-602)) + (((~(i405 | (-1012768427))) | 810818728 | (~((-2105413) | i406))) * (-301)) + ((~(i406 | (-204055111))) * 301) + 823506069;
        int i408 = i407 ^ (i407 << 13);
        int i409 = i408 ^ (i408 >>> 17);
        ((int[]) objArr[2])[0] = i409 ^ (i409 << 5);
        str8 = str8;
        str7 = str7;
        i = ((int[]) objArr[3])[0];
        i2 = ((int[]) objArr[0])[0];
        if (i2 == i) {
            arrayList = new ArrayList();
            strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    arrayList.add(str9);
                }
            }
            throw new RuntimeException(String.valueOf(i2));
        }
        objArr2 = new Object[]{new int[]{i38}, strArr9, new int[1], new int[]{i39}};
        int i3100 = ((int[]) objArr[2])[0];
        int i3101 = ((int[]) objArr[0])[0];
        int i3102 = ((int[]) objArr[3])[0];
        String[] strArr20 = (String[]) objArr[1];
        int iIdentityHashCode12 = System.identityHashCode(this);
        int i410 = i3100 + (((~((-43394324) | iIdentityHashCode12)) | 33693699) * (-283)) + 1754095540 + ((~(iIdentityHashCode12 | (-9700625))) * 283);
        int i411 = (i410 << 13) ^ i410;
        int i412 = i411 ^ (i411 >>> 17);
        ((int[]) objArr2[2])[0] = i412 ^ (i412 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int edgeSlop4 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
            int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
            byte b48 = $$a[7];
            Object[] objArr410 = new Object[1];
            b(b48, (short) (b48 | 89), (byte) 52, objArr410);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec2, edgeSlop4, jumpTapTimeout4, 1357589585, false, (String) objArr410[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c15 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iLastIndexOf9 = TextUtils.lastIndexOf("", '0') + 1032;
            int iRgb4 = Color.rgb(0, 0, 0) + 16777231;
            byte b49 = $$a[7];
            short s18 = b49;
            Object[] objArr411 = new Object[1];
            b(b49, s18, (byte) (s18 | 52), objArr411);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c15, iLastIndexOf9, iRgb4, 1344079056, false, (String) objArr411[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i413 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i413 % 128;
            int i414 = i413 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char c16 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iResolveSize4 = View.resolveSize(0, 0) + 1031;
                int iIndexOf15 = 15 - TextUtils.indexOf("", "", 0);
                byte[] bArr29 = $$a;
                Object[] objArr412 = new Object[1];
                b((byte) (bArr29[205] + 1), (short) 141, bArr29[7], objArr412);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c16, iResolveSize4, iIndexOf15, 632103528, false, (String) objArr412[0], null);
            }
            Object[] objArr413 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
            objArr3 = new Object[]{strArr10, new int[]{i46}, new int[1], new int[]{i45}};
            int i415 = ((int[]) objArr413[3])[0];
            int i416 = ((int[]) objArr413[1])[0];
            String[] strArr110 = (String[]) objArr413[0];
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i417 = ~iIdentityHashCode13;
            int i418 = (((817647641 + ((~(301863384 | i417)) * (-560))) + ((~(iIdentityHashCode13 | 335460350)) * (-560))) + (((~((-57583215) | i417)) | 23986248) * 560)) - 1312433477;
            int i419 = (i418 << 13) ^ i418;
            int i510 = i419 ^ (i419 >>> 17);
            ((int[]) objArr3[2])[0] = i510 ^ (i510 << 5);
        } else {
            int iIntValue5 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr414 = {-122827147};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), 1133 - TextUtils.lastIndexOf("", '0', 0), 18 - ExpandableListView.getPackedPositionGroup(0L), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr415 = {Integer.valueOf(iIntValue5), 0, -1312433477, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr414), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c17 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i511 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                int i512 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                byte b110 = $$a[7];
                Object[] objArr416 = new Object[1];
                b(b110, (short) (b110 | 89), (byte) 52, objArr416);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c17, i511, i512, 1298546779, false, (String) objArr416[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45993), 1116 - ExpandableListView.getPackedPositionChild(0L), 17 - Color.green(0)), Boolean.TYPE});
            }
            objArr3 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr415);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cIndexOf10 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int maximumFlingVelocity4 = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iMakeMeasureSpec3 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr30 = $$a;
                Object[] objArr417 = new Object[1];
                b((byte) (bArr30[205] + 1), (short) 141, bArr30[7], objArr417);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf10, maximumFlingVelocity4, iMakeMeasureSpec3, 632103528, false, (String) objArr417[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr3);
            long jLongValue19 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf25 = Long.valueOf(jLongValue19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cGreen2 = (char) Color.green(0);
                int iIndexOf16 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                int gidForName3 = Process.getGidForName("") + 16;
                byte b111 = $$a[7];
                short s19 = b111;
                Object[] objArr418 = new Object[1];
                b(b111, s19, (byte) (s19 | 52), objArr418);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen2, iIndexOf16, gidForName3, 1344079056, false, (String) objArr418[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf25);
            Long lValueOf26 = Long.valueOf(jLongValue19 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cLastIndexOf8 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int i513 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int scrollBarFadeDuration3 = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b112 = $$a[7];
                Object[] objArr419 = new Object[1];
                b(b112, (short) (b112 | 89), (byte) 52, objArr419);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf8, i513, scrollBarFadeDuration3, 1357589585, false, (String) objArr419[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf26);
        }
        i4 = ((int[]) objArr3[1])[0];
        i5 = ((int[]) objArr3[3])[0];
        if (i5 == i4) {
            objArr4 = new Object[]{strArr11, new int[]{i56}, new int[1], new int[]{i55}};
            int i514 = ((int[]) objArr3[2])[0];
            int i515 = ((int[]) objArr3[3])[0];
            int i516 = ((int[]) objArr3[1])[0];
            String[] strArr111 = (String[]) objArr3[0];
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i517 = ~iIdentityHashCode14;
            int i518 = i514 + (((~(287119874 | i517)) | (~((-531400045) | iIdentityHashCode14)) | (~(i517 | 531400044))) * 959) + 1127980948 + (((~(iIdentityHashCode14 | 531400044)) | (~(i517 | (-531400045))) | (~(287119874 | iIdentityHashCode14))) * 959);
            int i519 = (i518 << 13) ^ i518;
            int i610 = i519 ^ (i519 >>> 17);
            i6 = 0;
            ((int[]) objArr4[2])[0] = i610 ^ (i610 << 5);
        } else {
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr3[0];
            if (strArr2 != null) {
                while (i7 < strArr2.length) {
                    arrayList2.add(str10);
                }
            }
            int[] iArr11 = new int[i5];
            int i611 = i5 - 1;
            iArr11[i611] = 1;
            Toast.makeText((Context) null, iArr11[((i5 * i611) % 2) - 1], 1).show();
            objArr4 = new Object[]{strArr12, new int[]{i64}, new int[1], new int[]{i63}};
            int i612 = ((int[]) objArr3[2])[0];
            int i613 = ((int[]) objArr3[3])[0];
            int i614 = ((int[]) objArr3[1])[0];
            String[] strArr112 = (String[]) objArr3[0];
            int i615 = ~(((int) Process.getElapsedCpuTime()) | (-749884320));
            int i616 = i612 + (((-1072955296) | i615) * (-196)) + 1501037801 + ((i615 | 323070976) * 196);
            int i617 = (i616 << 13) ^ i616;
            int i618 = i617 ^ (i617 >>> 17);
            i6 = 0;
            ((int[]) objArr4[2])[0] = i618 ^ (i618 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cArgb3 = (char) (Color.argb(i6, i6, i6, i6) + 29944);
            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
            int scrollBarSize2 = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b113 = $$a[7];
            Object[] objArr510 = new Object[1];
            b(b113, (short) (b113 | 52), (byte) ($$b + 2), objArr510);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cArgb3, keyRepeatDelay2, scrollBarSize2, 986134021, false, (String) objArr510[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char defaultSize4 = (char) (View.getDefaultSize(0, 0) + 29944);
                int i619 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i710 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b114 = $$a[7];
                short s20 = b114;
                Object[] objArr511 = new Object[1];
                b(b114, s20, (byte) (s20 | 52), objArr511);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(defaultSize4, i619, i710, 1599039318, false, (String) objArr511[0], null);
            }
            Object[] objArr512 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr512[0])[0]}, new int[]{((int[]) objArr512[1])[0]}, (Object[]) objArr512[2], new int[1], (String[]) objArr512[4]};
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i711 = ~((-857501607) | (~iIdentityHashCode15));
            int i712 = (((((-930901999) | i711) | (~(857501606 | iIdentityHashCode15))) * (-338)) - 899660629) + (((~(iIdentityHashCode15 | (-73400393))) | i711) * 338) + 212715320;
            int i713 = (i712 << 13) ^ i712;
            int i714 = i713 ^ (i713 >>> 17);
            ((int[]) objArr5[3])[0] = i714 ^ (i714 << 5);
        } else {
            int iIntValue6 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr513 = {-122827147};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (42049 - ExpandableListView.getPackedPositionGroup(0L)), 1726 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879114 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue6, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr513), 212715320, false, true);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c18 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                int iCombineMeasuredStates5 = 1755 - View.combineMeasuredStates(0, 0);
                int i715 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                byte b115 = $$a[7];
                short s21 = b115;
                Object[] objArr514 = new Object[1];
                b(b115, s21, (byte) (s21 | 52), objArr514);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c18, iCombineMeasuredStates5, i715, 1599039318, false, (String) objArr514[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879114);
            long jLongValue110 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf27 = Long.valueOf(jLongValue110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cNormalizeMetaState3 = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                int packedPositionType7 = ExpandableListView.getPackedPositionType(0L) + 1755;
                int iIndexOf17 = TextUtils.indexOf("", "", 0) + 23;
                byte b116 = $$a[7];
                Object[] objArr515 = new Object[1];
                b(b116, (short) (b116 | 141), (byte) 52, objArr515);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState3, packedPositionType7, iIndexOf17, 1596667560, false, (String) objArr515[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf27);
            Long lValueOf28 = Long.valueOf(jLongValue110 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf9 = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                int iLastIndexOf10 = TextUtils.lastIndexOf("", '0') + 24;
                byte b117 = $$a[7];
                Object[] objArr516 = new Object[1];
                b(b117, (short) (b117 | 52), (byte) ($$b + 2), objArr516);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf9, fadingEdgeLength3, iLastIndexOf10, 986134021, false, (String) objArr516[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf28);
            objArr5 = objArrTuitionPaymentFragmentbindingInflater1$7879114;
        }
        i8 = ((int[]) objArr5[1])[0];
        i9 = ((int[]) objArr5[0])[0];
        if (i9 == i8) {
            int i716 = ((int[]) objArr5[3])[0];
            objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int i717 = ~new Random().nextInt();
            int i718 = i716 + 629872956 + (((~((-195683440) | i717)) | (-16918987)) * (-983)) + (((~(i717 | (-16918987))) | 133504) * 983);
            int i719 = (i718 << 13) ^ i718;
            int i810 = i719 ^ (i719 >>> 17);
            i10 = 0;
            ((int[]) objArr6[3])[0] = i810 ^ (i810 << 5);
        } else {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArr5[4];
            if (strArr3 != null) {
                while (i11 < strArr3.length) {
                    arrayList3.add(str11);
                }
            }
            Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
            int i811 = ((int[]) objArr5[3])[0];
            objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iIdentityHashCode16 = System.identityHashCode(this);
            int i812 = ~iIdentityHashCode16;
            int i813 = i811 + (-1144866607) + (((~(830390204 | i812)) | 234897474) * 168) + ((~((-234897475) | iIdentityHashCode16)) * 168) + (((~(iIdentityHashCode16 | 1065287678)) | (~(i812 | (-1042992631))) | 808095156) * 168);
            int i814 = (i813 << 13) ^ i813;
            int i815 = i814 ^ (i814 >>> 17);
            i10 = 0;
            ((int[]) objArr6[3])[0] = i815 ^ (i815 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char cArgb4 = (char) Color.argb(i10, i10, i10, i10);
            int iMyPid5 = (Process.myPid() >> 22) + 876;
            int iResolveOpacity3 = Drawable.resolveOpacity(i10, i10) + 10;
            byte[] bArr31 = $$a;
            Object[] objArr517 = new Object[1];
            b(bArr31[205], (short) 193, bArr31[9], objArr517);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb4, iMyPid5, iResolveOpacity3, -1199417970, false, (String) objArr517[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
        jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char cIndexOf11 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int iResolveOpacity4 = Drawable.resolveOpacity(0, 0) + 876;
            int edgeSlop5 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr32 = $$a;
            Object[] objArr518 = new Object[1];
            b(bArr32[33], (short) 203, bArr32[7], objArr518);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf11, iResolveOpacity4, edgeSlop5, 254769921, false, (String) objArr518[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
            int i816 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentbindingInflater1 = i816 % 128;
            int i817 = i816 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char cLastIndexOf10 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int iIndexOf18 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                int i818 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr33 = $$a;
                Object[] objArr519 = new Object[1];
                b(bArr33[205], (short) 203, bArr33[41], objArr519);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cLastIndexOf10, iIndexOf18, i818, 1324201839, false, (String) objArr519[0], null);
            }
            Object[] objArr610 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr610[0])[0]}, new int[1], new int[]{((int[]) objArr610[2])[0]}, (String[]) objArr610[3]};
            int iNextInt3 = new Random().nextInt();
            int i819 = (((((~(834263083 | iNextInt3)) | (-93926956)) * 262) + 1608192996) + (((~((~iNextInt3) | 834263083)) | (-93926956)) * 262)) - 760904938;
            int i910 = (i819 << 13) ^ i819;
            int i911 = i910 ^ (i910 >>> 17);
            ((int[]) objArr7[1])[0] = i911 ^ (i911 << 5);
        } else {
            Object[] objArr611 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -760904938};
            byte[] bArr34 = $$d;
            Object[] objArr612 = new Object[1];
            c((short) 418, bArr34[6], (byte) (-bArr34[183]), objArr612);
            Class<?> cls8 = Class.forName((String) objArr612[0]);
            Object[] objArr613 = new Object[1];
            c((short) 455, bArr34[67], (byte) (-bArr34[3]), objArr613);
            objArr7 = (Object[]) cls8.getMethod((String) objArr613[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr611);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char cLastIndexOf11 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int modifierMetaStateMask3 = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iCombineMeasuredStates6 = View.combineMeasuredStates(0, 0) + 10;
                byte[] bArr35 = $$a;
                Object[] objArr614 = new Object[1];
                b(bArr35[205], (short) 203, bArr35[41], objArr614);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf11, modifierMetaStateMask3, iCombineMeasuredStates6, 1324201839, false, (String) objArr614[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr7);
            long jLongValue111 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf29 = Long.valueOf(jLongValue111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cRed3 = (char) Color.red(0);
                int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                int iAlpha4 = Color.alpha(0) + 10;
                byte[] bArr36 = $$a;
                Object[] objArr615 = new Object[1];
                b(bArr36[33], (short) 203, bArr36[7], objArr615);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cRed3, fadingEdgeLength4, iAlpha4, 254769921, false, (String) objArr615[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf29);
            Long lValueOf110 = Long.valueOf(jLongValue111 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int trimmedLength4 = TextUtils.getTrimmedLength("") + 876;
                int defaultSize5 = 10 - View.getDefaultSize(0, 0);
                byte[] bArr110 = $$a;
                Object[] objArr616 = new Object[1];
                b(bArr110[205], (short) 193, bArr110[9], objArr616);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(tapTimeout3, trimmedLength4, defaultSize5, -1199417970, false, (String) objArr616[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf110);
        }
        i12 = ((int[]) objArr7[2])[0];
        i13 = ((int[]) objArr7[0])[0];
        if (i13 == i12) {
            int i912 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode17 = System.identityHashCode(this);
            int i913 = ~iIdentityHashCode17;
            int i914 = (-2133339090) + (((~((-684299995) | i913)) | 671122570) * (-1188));
            int i915 = (~(iIdentityHashCode17 | 684299994)) | 671122570;
            int i916 = ~(724610223 | i913);
            int i917 = i912 + i914 + ((i915 | i916) * 594) + (((~(684299994 | i913)) | (-737787648) | i916) * 594);
            int i918 = (i917 << 13) ^ i917;
            int i919 = i918 ^ (i918 >>> 17);
            ((int[]) objArr8[1])[0] = i919 ^ (i919 << 5);
        } else {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr7[3];
            if (strArr4 != null) {
                while (i14 < strArr4.length) {
                    int i1010 = TuitionPaymentFragmentbindingInflater1 + 101;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1010 % 128;
                    int i1011 = i1010 % 2;
                    arrayList4.add(str12);
                }
            }
            int[] iArr12 = new int[i13];
            int i1012 = i13 - 1;
            iArr12[i1012] = 1;
            Toast.makeText((Context) null, iArr12[((i13 * i1012) % 2) - 1], 1).show();
            int i1013 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode18 = System.identityHashCode(this);
            int i1014 = ~((-83957271) | iIdentityHashCode18);
            int i1015 = ~iIdentityHashCode18;
            int i1016 = i1013 + 258053622 + ((i1014 | (~(266288991 | i1015))) * 497) + (((~(iIdentityHashCode18 | 266288991)) | (~((-222641951) | i1015)) | 138684680) * 497);
            int i1017 = (i1016 << 13) ^ i1016;
            int i1018 = i1017 ^ (i1017 >>> 17);
            ((int[]) objArr8[1])[0] = i1018 ^ (i1018 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char edgeSlop6 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int scrollDefaultDelay3 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i1019 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
            byte[] bArr111 = $$a;
            Object[] objArr617 = new Object[1];
            b((byte) (bArr111[205] + 1), (short) 141, bArr111[7], objArr617);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(edgeSlop6, scrollDefaultDelay3, i1019, 252381699, false, (String) objArr617[0], null);
        }
        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cIndexOf12 = (char) TextUtils.indexOf("", "", 0, 0);
            int i1110 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
            int i1111 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b118 = $$a[7];
            Object[] objArr618 = new Object[1];
            b(b118, (short) (b118 | 141), (byte) 52, objArr618);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf12, i1110, i1111, 2009631821, false, (String) objArr618[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char maximumFlingVelocity5 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int mode4 = View.MeasureSpec.getMode(0) + 876;
                int iLastIndexOf11 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                byte[] bArr112 = $$a;
                Object[] objArr619 = new Object[1];
                b(bArr112[54], (short) 210, bArr112[7], objArr619);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(maximumFlingVelocity5, mode4, iLastIndexOf11, 256017550, false, (String) objArr619[0], null);
            }
            Object[] objArr710 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr710[0])[0]}, new int[1], new int[]{((int[]) objArr710[2])[0]}, (String[]) objArr710[3]};
            int iIdentityHashCode19 = System.identityHashCode(this);
            int i1112 = (-557685300) + (((~((-2174081) | iIdentityHashCode19)) | 42484309) * (-756)) + (((~iIdentityHashCode19) | (-2174081)) * 756) + 1361490002;
            int i1113 = (i1112 << 13) ^ i1112;
            int i1114 = i1113 ^ (i1113 >>> 17);
            ((int[]) objArr10[1])[0] = i1114 ^ (i1114 << 5);
            str = str8;
        } else {
            str = str8;
            applicationContext = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr711 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1361490002};
            byte[] bArr113 = $$d;
            Object[] objArr712 = new Object[1];
            c((short) 398, bArr113[482], (byte) (-bArr113[365]), objArr712);
            Class<?> cls9 = Class.forName((String) objArr712[0]);
            Object[] objArr713 = new Object[1];
            c((short) 350, bArr113[67], bArr113[117], objArr713);
            objArr9 = (Object[]) cls9.getMethod((String) objArr713[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr711);
            if (applicationContext != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cAlpha2 = (char) Color.alpha(0);
                    int iNormalizeMetaState5 = 876 - KeyEvent.normalizeMetaState(0);
                    int offsetBefore4 = TextUtils.getOffsetBefore("", 0) + 10;
                    byte[] bArr114 = $$a;
                    Object[] objArr714 = new Object[1];
                    b(bArr114[54], (short) 210, bArr114[7], objArr714);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cAlpha2, iNormalizeMetaState5, offsetBefore4, 256017550, false, (String) objArr714[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr9);
                long jLongValue112 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf111 = Long.valueOf(jLongValue112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char c19 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int packedPositionChild2 = 875 - ExpandableListView.getPackedPositionChild(0L);
                    int packedPositionType8 = ExpandableListView.getPackedPositionType(0L) + 10;
                    byte b119 = $$a[7];
                    Object[] objArr715 = new Object[1];
                    b(b119, (short) (b119 | 141), (byte) 52, objArr715);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c19, packedPositionChild2, packedPositionType8, 2009631821, false, (String) objArr715[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf111);
                Long lValueOf112 = Long.valueOf(jLongValue112 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c20 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int iMyTid6 = (Process.myTid() >> 22) + 876;
                    int iAlpha5 = 10 - Color.alpha(0);
                    byte[] bArr115 = $$a;
                    Object[] objArr716 = new Object[1];
                    b((byte) (bArr115[205] + 1), (short) 141, bArr115[7], objArr716);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c20, iMyTid6, iAlpha5, 252381699, false, (String) objArr716[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf112);
            } else {
                objArr9 = objArr9;
            }
            objArr10 = objArr9;
        }
        i15 = ((int[]) objArr10[2])[0];
        i16 = ((int[]) objArr10[0])[0];
        if (i16 == i15) {
            throw new RuntimeException(String.valueOf(i16));
        }
        int i1115 = ((int[]) objArr10[1])[0];
        objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
        int i1116 = 692849236 + (((~(3762324 | startUptimeMillis2)) | 36547904) * 672);
        int i1117 = ~startUptimeMillis2;
        int i1118 = i1115 + i1116 + (((~(startUptimeMillis2 | 36547904)) | (~((-3762325) | i1117))) * (-672)) + (((~((-36547905) | i1117)) | 33850688) * 672);
        int i1119 = (i1118 << 13) ^ i1118;
        int i1210 = i1119 ^ (i1119 >>> 17);
        ((int[]) objArr11[1])[0] = i1210 ^ (i1210 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cMyTid2 = (char) ((Process.myTid() >> 22) + 31533);
            int iNormalizeMetaState6 = KeyEvent.normalizeMetaState(0) + 921;
            int i1211 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr116 = $$a;
            Object[] objArr717 = new Object[1];
            b((byte) (bArr116[205] + 1), (short) 141, bArr116[7], objArr717);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cMyTid2, iNormalizeMetaState6, i1211, -1048449946, false, (String) objArr717[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char jumpTapTimeout5 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                int i1212 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                byte b210 = $$a[7];
                Object[] objArr718 = new Object[1];
                b(b210, (short) (b210 | 52), (byte) ($$b + 2), objArr718);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(jumpTapTimeout5, i1212, modifierMetaStateMask4, -1142834547, false, (String) objArr718[0], null);
            }
            Object[] objArr719 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr12 = new Object[]{new int[1], new int[]{((int[]) objArr719[1])[0]}, (Object[]) objArr719[2], new int[]{((int[]) objArr719[3])[0]}, (String[]) objArr719[4]};
            int iIdentityHashCode20 = System.identityHashCode(this);
            int i1213 = (-487265255) + ((iIdentityHashCode20 | 349030297) * (-50));
            int i1214 = ~((-348161793) | iIdentityHashCode20);
            int i1215 = ~iIdentityHashCode20;
            int i1216 = ((i1213 + ((i1214 | (~((-1076887555) | i1215))) * 50)) + (((~(i1215 | 349030297)) | ((~((-1425049347) | i1215)) | 1076887554)) * 50)) - 1159280180;
            int i1217 = (i1216 << 13) ^ i1216;
            int i1218 = i1217 ^ (i1217 >>> 17);
            ((int[]) objArr12[0])[0] = i1218 ^ (i1218 << 5);
            objArr11 = objArr11;
        } else {
            applicationContext2 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                int i1219 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                TuitionPaymentFragmentbindingInflater1 = i1219 % 128;
                int i1310 = i1219 % 2;
                if (applicationContext2 instanceof ContextWrapper) {
                    applicationContext2 = applicationContext2.getApplicationContext();
                } else {
                    applicationContext2 = applicationContext2.getApplicationContext();
                }
            }
            Object[] objArr810 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1159280180};
            byte[] bArr117 = $$d;
            Object[] objArr811 = new Object[1];
            c((short) 298, bArr117[482], (byte) (-bArr117[43]), objArr811);
            Class<?> cls10 = Class.forName((String) objArr811[0]);
            Object[] objArr812 = new Object[1];
            c((short) 263, bArr117[67], bArr117[117], objArr812);
            Object[] objArr813 = (Object[]) cls10.getMethod((String) objArr812[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr810);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char cRed4 = (char) (31533 - Color.red(0));
                int iAlpha6 = 921 - Color.alpha(0);
                int iIndexOf19 = 28 - TextUtils.indexOf("", "");
                byte b211 = $$a[7];
                Object[] objArr814 = new Object[1];
                b(b211, (short) (b211 | 52), (byte) ($$b + 2), objArr814);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cRed4, iAlpha6, iIndexOf19, -1142834547, false, (String) objArr814[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr813);
            long jLongValue113 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf113 = Long.valueOf(jLongValue113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char pressedStateDuration4 = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int offsetAfter4 = 921 - TextUtils.getOffsetAfter("", 0);
                int deadChar4 = KeyEvent.getDeadChar(0, 0) + 28;
                byte b212 = $$a[7];
                short s22 = b212;
                Object[] objArr815 = new Object[1];
                b(b212, s22, (byte) (s22 | 52), objArr815);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(pressedStateDuration4, offsetAfter4, deadChar4, -778300370, false, (String) objArr815[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf113);
            Long lValueOf114 = Long.valueOf(jLongValue113 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char pressedStateDuration5 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31533);
                int i1311 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i1312 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                byte[] bArr118 = $$a;
                Object[] objArr816 = new Object[1];
                b((byte) (bArr118[205] + 1), (short) 141, bArr118[7], objArr816);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(pressedStateDuration5, i1311, i1312, -1048449946, false, (String) objArr816[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf114);
            objArr12 = objArr813;
        }
        i17 = ((int[]) objArr12[1])[0];
        i18 = ((int[]) objArr12[3])[0];
        if (i18 == i17) {
            arrayList5 = new ArrayList();
            strArr5 = (String[]) objArr12[4];
            if (strArr5 != null) {
                while (i19 < strArr5.length) {
                    arrayList5.add(str13);
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        int i1313 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1313 % 128;
        int i1314 = i1313 % 2;
        int i1315 = ((int[]) objArr12[0])[0];
        objArr13 = new Object[]{new int[1], new int[]{((int[]) objArr12[1])[0]}, (Object[]) objArr12[2], new int[]{((int[]) objArr12[3])[0]}, (String[]) objArr12[4]};
        int i1316 = ~((int) Process.getElapsedCpuTime());
        int i1317 = ~(997535860 | i1316);
        int i1318 = i1315 + (-1760628733) + ((i1317 | 776543783) * 764) + (((~(i1316 | 776543783)) | 288628816) * (-1528)) + ((356265555 | i1317) * 764);
        int i1319 = (i1318 << 13) ^ i1318;
        int i1410 = i1319 ^ (i1319 >>> 17);
        ((int[]) objArr13[0])[0] = i1410 ^ (i1410 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char mirror2 = (char) (AndroidCharacter.getMirror('0') + 42994);
            int offsetAfter5 = 3111 - TextUtils.getOffsetAfter("", 0);
            int iLastIndexOf12 = 21 - TextUtils.lastIndexOf("", '0');
            byte b213 = $$a[7];
            Object[] objArr817 = new Object[1];
            b(b213, (short) (b213 | 89), (byte) 52, objArr817);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(mirror2, offsetAfter5, iLastIndexOf12, -1272852037, false, (String) objArr817[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char keyRepeatTimeout3 = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int maximumFlingVelocity6 = 3111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                byte b214 = $$a[7];
                Object[] objArr818 = new Object[1];
                b(b214, (short) (b214 | 52), (byte) ($$b + 2), objArr818);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(keyRepeatTimeout3, maximumFlingVelocity6, iMakeMeasureSpec4, 154975793, false, (String) objArr818[0], null);
            }
            Object[] objArr819 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            int i1411 = ((int[]) objArr819[2])[0];
            int i1412 = ((int[]) objArr819[1])[0];
            String[] strArr113 = (String[]) objArr819[3];
            int[] iArr13 = {i1411};
            int[] iArr14 = {i1412};
            int iMyTid7 = Process.myTid();
            int i1413 = (((1517469222 + (((~((~iMyTid7) | (-468351545))) | 1236679914) * (-235))) + (((~((-468351545) | iMyTid7)) | 1236679914) * (-470))) + (((~(iMyTid7 | (-306725393))) | 1075053762) * 235)) - 937393304;
            int i1414 = (i1413 << 13) ^ i1413;
            int i1415 = i1414 ^ (i1414 >>> 17);
            ((int[]) objArr14[0])[0] = i1415 ^ (i1415 << 5);
            objArr14 = new Object[]{new int[1], iArr14, iArr13, strArr113};
            objArr13 = objArr13;
        } else {
            Object[] objArr910 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -937393304};
            byte[] bArr119 = $$d;
            Object[] objArr911 = new Object[1];
            c((short) 211, bArr119[482], (byte) ($$e + 2), objArr911);
            Class<?> cls11 = Class.forName((String) objArr911[0]);
            Object[] objArr912 = new Object[1];
            c((short) 263, bArr119[67], bArr119[117], objArr912);
            Object[] objArr913 = (Object[]) cls11.getMethod((String) objArr912[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr910);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cIndexOf13 = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iIndexOf20 = 3110 - TextUtils.indexOf((CharSequence) "", '0');
                int iIndexOf21 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b215 = $$a[7];
                Object[] objArr914 = new Object[1];
                b(b215, (short) (b215 | 52), (byte) ($$b + 2), objArr914);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf13, iIndexOf20, iIndexOf21, 154975793, false, (String) objArr914[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr913);
            long jLongValue114 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf115 = Long.valueOf(jLongValue114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char cIndexOf14 = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0'));
                int iLastIndexOf13 = TextUtils.lastIndexOf("", '0', 0, 0) + 3112;
                int deadChar5 = KeyEvent.getDeadChar(0, 0) + 22;
                byte b216 = $$a[7];
                short s110 = b216;
                Object[] objArr915 = new Object[1];
                b(b216, s110, (byte) (s110 | 52), objArr915);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cIndexOf14, iLastIndexOf13, deadChar5, -1269618118, false, (String) objArr915[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf115);
            Long lValueOf116 = Long.valueOf(jLongValue114 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char trimmedLength5 = (char) (TextUtils.getTrimmedLength("") + 43042);
                int i1416 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iLastIndexOf14 = TextUtils.lastIndexOf("", '0') + 23;
                byte b217 = $$a[7];
                Object[] objArr916 = new Object[1];
                b(b217, (short) (b217 | 89), (byte) 52, objArr916);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(trimmedLength5, i1416, iLastIndexOf14, -1272852037, false, (String) objArr916[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf116);
            objArr14 = objArr913;
        }
        if (((int[]) objArr14[2])[0] == ((int[]) objArr14[1])[0]) {
            arrayList6 = new ArrayList();
            strArr6 = (String[]) objArr14[3];
            if (strArr6 != null) {
                while (i20 < strArr6.length) {
                    arrayList6.add(str14);
                }
            }
            throw null;
        }
        int i1417 = ((int[]) objArr14[0])[0];
        int i1418 = ((int[]) objArr14[2])[0];
        int i1419 = ((int[]) objArr14[1])[0];
        String[] strArr114 = (String[]) objArr14[3];
        int[] iArr15 = {i1419};
        int i1510 = (~((int) Runtime.getRuntime().freeMemory())) | 869421610;
        int i1511 = i1417 + 788966329 + (i1510 * 495) + (((~i1510) | 834813992) * 495);
        int i1512 = (i1511 << 13) ^ i1511;
        int i1513 = i1512 ^ (i1512 >>> 17);
        ((int[]) objArr15[0])[0] = i1513 ^ (i1513 << 5);
        objArr15 = new Object[]{new int[1], iArr15, new int[]{i1418}, strArr114};
        context = getContext();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char cLastIndexOf12 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 651;
            int i1514 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
            byte b218 = $$a[7];
            Object[] objArr917 = new Object[1];
            b(b218, (short) (b218 | 141), (byte) 52, objArr917);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cLastIndexOf12, tapTimeout4, i1514, -459846511, false, (String) objArr917[0], null);
        }
        j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null);
        jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
            int iMyPid6 = (Process.myPid() >> 22) + 651;
            int iIndexOf110 = 44 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr210 = $$a;
            Object[] objArr918 = new Object[1];
            b((byte) (bArr210[205] + 1), (short) 141, bArr210[7], objArr918);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cCombineMeasuredStates2, iMyPid6, iIndexOf110, -873460649, false, (String) objArr918[0], null);
        }
        if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char cNormalizeMetaState4 = (char) KeyEvent.normalizeMetaState(0);
                int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
                int i1515 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                byte b219 = $$a[7];
                Object[] objArr919 = new Object[1];
                b(b219, (short) (b219 | 52), (byte) ($$b + 2), objArr919);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cNormalizeMetaState4, doubleTapTimeout5, i1515, -1595579076, false, (String) objArr919[0], null);
            }
            Object[] objArr1010 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr16 = new Object[]{new int[]{i157}, new String[0], new int[]{i156}, new int[1]};
            int i1516 = ((int[]) objArr1010[2])[0];
            int i1517 = ((int[]) objArr1010[0])[0];
            int i1518 = ~((int) Process.getStartElapsedRealtime());
            int i1519 = (-2113049387) + ((~((-69339394) | i1518)) * (-783)) + (((~(i1518 | (-70659946))) | (-74090756)) * 783) + 1222607733;
            int i1610 = (i1519 << 13) ^ i1519;
            int i1611 = i1610 ^ (i1610 >>> 17);
            ((int[]) objArr16[3])[0] = i1611 ^ (i1611 << 5);
            i21 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b((char) (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0') + 1611, 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr1011 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).newInstance(null), 1222607733, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char cAxisFromString3 = (char) (MotionEvent.axisFromString("") + 1);
                int iIndexOf111 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int i1612 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr211 = $$a;
                Object[] objArr1012 = new Object[1];
                b((byte) (bArr211[205] + 1), (short) 141, bArr211[7], objArr1012);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cAxisFromString3, iIndexOf111, i1612, 2075921419, false, (String) objArr1012[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-16776521) - Color.rgb(0, 0, 0), 98 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 63406), TextUtils.getOffsetBefore("", 0) + 793, ImageFormat.getBitsPerPixel(0) + 84), Integer.TYPE, Integer.TYPE});
            }
            objArr16 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).invoke(null, objArr1011);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char c21 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int gidForName4 = Process.getGidForName("") + 652;
                int i1613 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43;
                byte b310 = $$a[7];
                Object[] objArr1013 = new Object[1];
                b(b310, (short) (b310 | 52), (byte) ($$b + 2), objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c21, gidForName4, i1613, -1595579076, false, (String) objArr1013[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr16);
            long jLongValue115 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf117 = Long.valueOf(jLongValue115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cIndexOf15 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int i1614 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iIndexOf112 = TextUtils.indexOf("", "", 0, 0) + 44;
                byte[] bArr212 = $$a;
                Object[] objArr1014 = new Object[1];
                b((byte) (bArr212[205] + 1), (short) 141, bArr212[7], objArr1014);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cIndexOf15, i1614, iIndexOf112, -873460649, false, (String) objArr1014[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf117);
            Long lValueOf118 = Long.valueOf(jLongValue115 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char doubleTapTimeout6 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iMyPid7 = 651 - (Process.myPid() >> 22);
                int iNormalizeMetaState7 = 44 - KeyEvent.normalizeMetaState(0);
                byte b311 = $$a[7];
                Object[] objArr1015 = new Object[1];
                b(b311, (short) (b311 | 141), (byte) 52, objArr1015);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(doubleTapTimeout6, iMyPid7, iNormalizeMetaState7, -459846511, false, (String) objArr1015[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf118);
            i21 = 0;
        }
        i22 = ((int[]) objArr16[i21])[i21];
        i23 = ((int[]) objArr16[2])[i21];
        if (i23 == i22) {
            objArr17 = new Object[4];
            int[] iArr16 = new int[1];
            objArr17[i21] = iArr16;
            int[] iArr17 = new int[1];
            objArr17[2] = iArr17;
            objArr17[3] = new int[1];
            int i1615 = ((int[]) objArr16[3])[i21];
            int i1616 = ((int[]) objArr16[2])[i21];
            int i1617 = ((int[]) objArr16[i21])[i21];
            iArr17[i21] = i1616;
            iArr16[i21] = i1617;
            objArr17[1] = new String[i21];
            int iIdentityHashCode110 = System.identityHashCode(this);
            int i1618 = i1615 + ((~((~iIdentityHashCode110) | 47971039)) * 130) + 1876516439 + (((~(iIdentityHashCode110 | 47971039)) | 33562689) * 130);
            int i1619 = (i1618 << 13) ^ i1618;
            int i1710 = i1619 ^ (i1619 >>> 17);
            i24 = 0;
            ((int[]) objArr17[3])[0] = i1710 ^ (i1710 << 5);
        } else {
            arrayList7 = new ArrayList();
            strArr7 = (String[]) objArr16[1];
            if (strArr7 != null) {
                i25 = 0;
                while (i25 < strArr7.length) {
                    i26 = TuitionPaymentFragmentbindingInflater1 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                    if (i26 % 2 == 0) {
                        arrayList7.add(strArr7[i25]);
                        i25 += 101;
                    } else {
                        arrayList7.add(strArr7[i25]);
                        i25++;
                    }
                }
            }
            Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
            objArr17 = new Object[]{new int[]{i173}, new String[0], new int[]{i172}, new int[1]};
            int i1711 = ((int[]) objArr16[3])[0];
            int i1712 = ((int[]) objArr16[2])[0];
            int i1713 = ((int[]) objArr16[0])[0];
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i1714 = ~iUptimeMillis2;
            int i1715 = (~((-1057936867) | i1714)) | 17072546;
            int i1716 = ~(iUptimeMillis2 | (-13641737));
            int i1717 = i1711 + (-16085691) + ((i1715 | i1716) * (-502)) + ((i1716 | (~(i1714 | (-1040864321)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i1718 = i1717 ^ (i1717 << 13);
            int i1719 = i1718 ^ (i1718 >>> 17);
            i24 = 0;
            ((int[]) objArr17[3])[0] = i1719 ^ (i1719 << 5);
        }
        Preconditions.checkNotNull(context);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cLastIndexOf13 = (char) (53892 - TextUtils.lastIndexOf("", '0', i24, i24));
            int packedPositionType9 = 1320 - ExpandableListView.getPackedPositionType(0L);
            int capsMode4 = 36 - TextUtils.getCapsMode("", i24, i24);
            byte[] bArr213 = $$a;
            Object[] objArr1016 = new Object[1];
            b((byte) (bArr213[205] + 1), (short) 141, bArr213[7], objArr1016);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cLastIndexOf13, packedPositionType9, capsMode4, -1433084963, false, (String) objArr1016[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char cResolveSizeAndState2 = (char) (53893 - View.resolveSizeAndState(0, 0, 0));
                int iIndexOf113 = 1320 - TextUtils.indexOf("", "");
                int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36;
                byte b312 = $$a[7];
                short s111 = b312;
                Object[] objArr1017 = new Object[1];
                b(b312, s111, (byte) (s111 | 52), objArr1017);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cResolveSizeAndState2, iIndexOf113, maximumDrawingCacheSize3, -1920778747, false, (String) objArr1017[0], null);
            }
            Object[] objArr1018 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).get(null);
            objArr19 = new Object[]{new int[]{i180}, new int[1], strArr15, new int[]{i181}};
            int i1810 = ((int[]) objArr1018[0])[0];
            int i1811 = ((int[]) objArr1018[3])[0];
            String[] strArr115 = (String[]) objArr1018[2];
            int iMyUid2 = Process.myUid();
            int i1812 = (-573607116) + ((773971694 | iMyUid2) * 614);
            int i1813 = ~iMyUid2;
            int i1814 = ((i1812 + ((((~((-365455396) | i1813)) | 67127330) | (~(1005172429 | i1813))) * (-1228))) + (((~(i1813 | 1072299759)) | (~((-298328066) | i1813))) * 614)) - 892335802;
            int i1815 = (i1814 << 13) ^ i1814;
            int i1816 = i1815 ^ (i1815 >>> 17);
            ((int[]) objArr19[1])[0] = i1816 ^ (i1816 << 5);
            objArr17 = objArr17;
            str2 = str6;
        } else {
            applicationContext3 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext3 != null) {
                if (applicationContext3 instanceof ContextWrapper) {
                    applicationContext3 = applicationContext3.getApplicationContext();
                } else {
                    applicationContext3 = applicationContext3.getApplicationContext();
                }
            }
            str2 = str6;
            int iIntValue7 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr1019 = {-1197904234};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47976), 1300 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr1110 = {applicationContext3, "com.bpjstku", -892335802, Integer.valueOf(iIntValue7), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(objArr1019), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char c110 = (char) (53894 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iRgb5 = (-16775896) - Color.rgb(0, 0, 0);
                int i1817 = 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b313 = $$a[7];
                short s112 = b313;
                Object[] objArr1111 = new Object[1];
                b(b313, s112, (byte) (s112 | 52), objArr1111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c110, iRgb5, i1817, 819724799, false, (String) objArr1111[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57879 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1394, 75 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
            }
            objArr18 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr1110);
            if (applicationContext3 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char c111 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53892);
                    int packedPositionType10 = 1320 - ExpandableListView.getPackedPositionType(0L);
                    int iRed2 = Color.red(0) + 36;
                    byte b314 = $$a[7];
                    short s113 = b314;
                    Object[] objArr1112 = new Object[1];
                    b(b314, s113, (byte) (s113 | 52), objArr1112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c111, packedPositionType10, iRed2, -1920778747, false, (String) objArr1112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr18);
                long jLongValue116 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf119 = Long.valueOf(jLongValue116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 53894);
                    int iResolveSize5 = 1320 - View.resolveSize(0, 0);
                    int i1818 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b315 = $$a[7];
                    Object[] objArr1113 = new Object[1];
                    b(b315, (short) (b315 | 52), (byte) ($$b + 2), objArr1113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(bitsPerPixel3, iResolveSize5, i1818, -1273706634, false, (String) objArr1113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf119);
                Long lValueOf210 = Long.valueOf(jLongValue116 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char jumpTapTimeout6 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 53893);
                    int iRgb6 = Color.rgb(0, 0, 0) + 16778536;
                    int iLastIndexOf15 = TextUtils.lastIndexOf("", '0') + 37;
                    byte[] bArr214 = $$a;
                    Object[] objArr1114 = new Object[1];
                    b((byte) (bArr214[205] + 1), (short) 141, bArr214[7], objArr1114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(jumpTapTimeout6, iRgb6, iLastIndexOf15, -1433084963, false, (String) objArr1114[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf210);
            } else {
                objArr18 = objArr18;
                objArr17 = objArr17;
            }
            objArr19 = objArr18;
        }
        if (((int[]) objArr19[0])[0] == ((int[]) objArr19[3])[0]) {
            throw null;
        }
        objArr20 = new Object[]{new int[]{i190}, new int[1], strArr16, new int[]{i191}};
        int i1819 = ((int[]) objArr19[1])[0];
        int i1910 = ((int[]) objArr19[0])[0];
        int i1911 = ((int[]) objArr19[3])[0];
        String[] strArr116 = (String[]) objArr19[2];
        int iNextInt4 = new Random().nextInt(106400069);
        int i1912 = i1819 + 583274754 + (((~((~iNextInt4) | 19527917)) | (-1370095344)) * 529) + (((~(iNextInt4 | 19527917)) | (-1351099908)) * 529);
        int i1913 = (i1912 << 13) ^ i1912;
        int i1914 = i1913 ^ (i1913 >>> 17);
        ((int[]) objArr20[1])[0] = i1914 ^ (i1914 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cLastIndexOf14 = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
            int capsMode5 = TextUtils.getCapsMode("", 0, 0) + 625;
            int threadPriority3 = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr215 = $$a;
            Object[] objArr1115 = new Object[1];
            b((byte) (bArr215[205] + 1), (short) 141, bArr215[7], objArr1115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cLastIndexOf14, capsMode5, threadPriority3, -477065106, false, (String) objArr1115[0], null);
        }
        j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char cIndexOf16 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37568);
            int mode5 = View.MeasureSpec.getMode(0) + 625;
            int i1915 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b316 = $$a[7];
            Object[] objArr1116 = new Object[1];
            b(b316, (short) (b316 | 89), (byte) 52, objArr1116);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cIndexOf16, mode5, i1915, -976899241, false, (String) objArr1116[0], null);
        }
        if (j5 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char cIndexOf17 = (char) (TextUtils.indexOf("", "", 0) + 37567);
                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 625;
                int iMyTid8 = 14 - (Process.myTid() >> 22);
                byte b317 = $$a[7];
                short s114 = b317;
                Object[] objArr1117 = new Object[1];
                b(b317, s114, (byte) (s114 | 52), objArr1117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf17, iKeyCodeFromString4, iMyTid8, -973632554, false, (String) objArr1117[0], null);
            }
            Object[] objArr1118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).get(null);
            int i1916 = ((int[]) objArr1118[2])[0];
            int i1917 = ((int[]) objArr1118[0])[0];
            String[] strArr117 = (String[]) objArr1118[3];
            int[] iArr18 = {i1916};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i1918 = ~startElapsedRealtime2;
            int i1919 = (-1785902040) + ((~(1049309681 | i1918)) * (-560)) + ((~(startElapsedRealtime2 | (-2147847))) * (-560)) + (((~(774428439 | i1918)) | 277029088) * 560) + 287124942;
            int i2010 = (i1919 << 13) ^ i1919;
            int i2011 = i2010 ^ (i2010 >>> 17);
            ((int[]) objArr21[1])[0] = i2011 ^ (i2011 << 5);
            objArr21 = new Object[]{new int[]{i1917}, new int[1], iArr18, strArr117};
            i27 = 0;
        } else {
            applicationContext4 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                int i2012 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2012 % 128;
                int i2013 = i2012 % 2;
                if (applicationContext4 instanceof ContextWrapper) {
                    applicationContext4 = applicationContext4.getApplicationContext();
                } else {
                    applicationContext4 = applicationContext4.getApplicationContext();
                }
            }
            int iIntValue8 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr1119 = new Object[1];
            a(new char[]{4117, 18619, 41395, 6829, 29602, 44184, 1431, 32478, 55254, 12416, 27131, 49825, 15342, 38119, 52696, 9861, 40832, 63647, 20883, 35385, 58214, 23677, 46454, 60954, 18202, 41025, 6415, 29269, 43816, 1142, 32061, 54841, 3902, 26719, 49415, 14869, 37650, 52203, 9449, 40361, 63145, 12275, 35017, 57804, 23181, 45959, 60586, 17829, 48886, 6078, 28861, 43485, 647, 31634, 54419, 3386, 26214, 57198, 14457, 37158, 51737, 8980, 40027, 62722}, TextUtils.indexOf("", "", 0) + 22777, objArr1119);
            String str16 = (String) objArr1119[0];
            Object[] objArr1210 = new Object[1];
            a(new char[]{4164, 18101, 48549, 5320, 19419, 41645, 6647, 28853, 42970, 7882, 30057, 44084, 806, 31298, 53515, 2094, 32549, 54839, 3335, 25629, 56046, 12799, 26787, 57284, 13965, 28072, 50411, 15295, 37504, 51609, 8292, 38770, 52862, 9494, 40020, 62255, 10815, 33117, 63572, 12048, 34285, 64681, 21407, 35520, 57812, 22692, 36798, 59017, 23950, 46279, 60264, 17015, 47385, 4188, 18262, 48672, 5484, 19546, 41755, 6674, 28850, 42992, 7883, 30092}, 22260 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr1210);
            Object[] objArr1211 = {applicationContext4, new String[]{str16, (String) objArr1210[0]}, Integer.valueOf(iIntValue8), 17, 287124942};
            byte[] bArr216 = $$d;
            Object[] objArr1212 = new Object[1];
            c((short) 93, bArr216[482], bArr216[117], objArr1212);
            Class<?> cls12 = Class.forName((String) objArr1212[0]);
            Object[] objArr1213 = new Object[1];
            c(bArr216[85], bArr216[467], bArr216[6], objArr1213);
            objArr21 = (Object[]) cls12.getMethod((String) objArr1213[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1211);
            int i2014 = ((int[]) objArr21[0])[0];
            int i2015 = ((int[]) objArr21[2])[0];
            if (applicationContext4 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char keyRepeatTimeout4 = (char) (37567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int offsetAfter6 = 625 - TextUtils.getOffsetAfter("", 0);
                    int i2016 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b318 = $$a[7];
                    short s115 = b318;
                    Object[] objArr1214 = new Object[1];
                    b(b318, s115, (byte) (s115 | 52), objArr1214);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(keyRepeatTimeout4, offsetAfter6, i2016, -973632554, false, (String) objArr1214[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr21);
                long jLongValue117 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf211 = Long.valueOf(jLongValue117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cIndexOf18 = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 625;
                    int iResolveSize6 = View.resolveSize(0, 0) + 14;
                    byte b319 = $$a[7];
                    Object[] objArr1215 = new Object[1];
                    b(b319, (short) (b319 | 89), (byte) 52, objArr1215);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cIndexOf18, iArgb2, iResolveSize6, -976899241, false, (String) objArr1215[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf211);
                Long lValueOf212 = Long.valueOf(jLongValue117 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char c112 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                    int defaultSize6 = View.getDefaultSize(0, 0) + 625;
                    int scrollBarFadeDuration4 = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr217 = $$a;
                    Object[] objArr1216 = new Object[1];
                    b((byte) (bArr217[205] + 1), (short) 141, bArr217[7], objArr1216);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c112, defaultSize6, scrollBarFadeDuration4, -477065106, false, (String) objArr1216[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf212);
            }
            i27 = 0;
        }
        i28 = ((int[]) objArr21[i27])[i27];
        i29 = ((int[]) objArr21[2])[i27];
        if (i29 == i28) {
            i30 = i27;
            arrayList8 = new ArrayList();
            strArr8 = (String[]) objArr21[3];
            if (strArr8 != null) {
                int i2017 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
                TuitionPaymentFragmentbindingInflater1 = i2017 % 128;
                int i2018 = i2017 % 2;
                while (i31 < strArr8.length) {
                    arrayList8.add(strArr8[i31]);
                }
            }
            throw new RuntimeException(String.valueOf(i29));
        }
        objArr22 = new Object[4];
        int[] iArr19 = new int[1];
        objArr22[i27] = iArr19;
        objArr22[1] = new int[1];
        int[] iArr110 = new int[1];
        objArr22[2] = iArr110;
        int i2019 = ((int[]) objArr21[1])[i27];
        int i2110 = ((int[]) objArr21[2])[i27];
        int i2111 = ((int[]) objArr21[i27])[i27];
        String[] strArr118 = (String[]) objArr21[3];
        iArr110[i27] = i2110;
        iArr19[i27] = i2111;
        int i2112 = (int) Runtime.getRuntime().totalMemory();
        int i2113 = i2019 + ((((~((-268513441) | i2112)) | 1082310720) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 629300568) + ((~((~i2112) | (-268513441))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
        int i2114 = (i2113 << 13) ^ i2113;
        int i2115 = i2114 ^ (i2114 >>> 17);
        ((int[]) objArr22[1])[0] = i2115 ^ (i2115 << 5);
        objArr22[3] = strArr118;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char packedPositionType11 = (char) ExpandableListView.getPackedPositionType(0L);
            int iKeyCodeFromString5 = KeyEvent.keyCodeFromString("") + 876;
            int pressedStateDuration6 = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b410 = $$a[7];
            Object[] objArr1217 = new Object[1];
            b(b410, (short) (b410 | 52), (byte) ($$b + 2), objArr1217);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(packedPositionType11, iKeyCodeFromString5, pressedStateDuration6, -1650998592, false, (String) objArr1217[0], null);
        }
        j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char c113 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int doubleTapTimeout7 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iNormalizeMetaState8 = KeyEvent.normalizeMetaState(0) + 10;
            byte b411 = $$a[7];
            short s116 = b411;
            Object[] objArr1218 = new Object[1];
            b(b411, s116, (byte) (s116 | 52), objArr1218);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c113, doubleTapTimeout7, iNormalizeMetaState8, 2012020043, false, (String) objArr1218[0], null);
        }
        if (j6 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char deadChar6 = (char) KeyEvent.getDeadChar(0, 0);
                int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 877;
                int i2116 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                byte b412 = $$a[7];
                Object[] objArr1219 = new Object[1];
                b(b412, (short) (b412 | 89), (byte) 52, objArr1219);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(deadChar6, bitsPerPixel4, i2116, 2012931276, false, (String) objArr1219[0], null);
            }
            Object[] objArr1310 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
            objArr23 = new Object[]{new int[]{((int[]) objArr1310[0])[0]}, new int[1], new int[]{((int[]) objArr1310[2])[0]}, (String[]) objArr1310[3]};
            int iIdentityHashCode111 = System.identityHashCode(this);
            int i2117 = ~iIdentityHashCode111;
            int i2118 = ((((-2099172442) + (((~(136185150 | i2117)) | (~((-1705005) | iIdentityHashCode111))) * (-831))) + ((~(178200383 | iIdentityHashCode111)) * (-1662))) + (((~(iIdentityHashCode111 | (-136185151))) | ((~(i2117 | (-176495380))) | (~(176495379 | iIdentityHashCode111)))) * 831)) - 1183273683;
            int i2119 = (i2118 << 13) ^ i2118;
            int i2210 = i2119 ^ (i2119 >>> 17);
            ((int[]) objArr23[1])[0] = i2210 ^ (i2210 << 5);
        } else {
            applicationContext5 = (Context) Class.forName(str7).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                if (applicationContext5 instanceof ContextWrapper) {
                    applicationContext5 = applicationContext5.getApplicationContext();
                } else {
                    applicationContext5 = applicationContext5.getApplicationContext();
                }
            }
            Object[] objArr1311 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -1183273683};
            byte[] bArr218 = $$d;
            byte b413 = bArr218[85];
            Object[] objArr1312 = new Object[1];
            c(b413, bArr218[67], b413, objArr1312);
            Class<?> cls13 = Class.forName((String) objArr1312[0]);
            Object[] objArr1313 = new Object[1];
            c(bArr218[6], bArr218[67], bArr218[117], objArr1313);
            objArr23 = (Object[]) cls13.getMethod((String) objArr1313[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1311);
            if (applicationContext5 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char cAxisFromString4 = (char) ((-1) - MotionEvent.axisFromString(""));
                    int i2211 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int offsetBefore5 = 10 - TextUtils.getOffsetBefore("", 0);
                    byte b414 = $$a[7];
                    Object[] objArr1314 = new Object[1];
                    b(b414, (short) (b414 | 89), (byte) 52, objArr1314);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cAxisFromString4, i2211, offsetBefore5, 2012931276, false, (String) objArr1314[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, objArr23);
                long jLongValue118 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf213 = Long.valueOf(jLongValue118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char c114 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iCombineMeasuredStates7 = View.combineMeasuredStates(0, 0) + 876;
                    int iGreen4 = Color.green(0) + 10;
                    byte b415 = $$a[7];
                    short s117 = b415;
                    Object[] objArr1315 = new Object[1];
                    b(b415, s117, (byte) (s117 | 52), objArr1315);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c114, iCombineMeasuredStates7, iGreen4, 2012020043, false, (String) objArr1315[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, lValueOf213);
                Long lValueOf214 = Long.valueOf(jLongValue118 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char trimmedLength6 = (char) TextUtils.getTrimmedLength("");
                    int iKeyCodeFromString6 = KeyEvent.keyCodeFromString("") + 876;
                    int size3 = View.MeasureSpec.getSize(0) + 10;
                    byte b416 = $$a[7];
                    Object[] objArr1316 = new Object[1];
                    b(b416, (short) (b416 | 52), (byte) ($$b + 2), objArr1316);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(trimmedLength6, iKeyCodeFromString6, size3, -1650998592, false, (String) objArr1316[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf214);
            }
        }
        i32 = ((int[]) objArr23[2])[0];
        i33 = ((int[]) objArr23[0])[0];
        if (i33 == i32) {
            throw new RuntimeException(String.valueOf(i33));
        }
        int i2212 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2212 % 128;
        int i2213 = i2212 % 2;
        int i2214 = ((int[]) objArr23[1])[0];
        Object[] objArr1317 = {new int[]{((int[]) objArr23[0])[0]}, new int[1], new int[]{((int[]) objArr23[2])[0]}, (String[]) objArr23[3]};
        int iMyTid9 = Process.myTid();
        int i2215 = ~iMyTid9;
        int i2216 = (-2106707358) + (((~((-481858569) | i2215)) | 471367688) * (-1188));
        int i2217 = (~(iMyTid9 | 481858568)) | 471367688;
        int i2218 = ~(522168797 | i2215);
        int i2219 = i2214 + i2216 + ((i2217 | i2218) * 594) + (((~(481858568 | i2215)) | (-532659678) | i2218) * 594);
        int i2310 = i2219 ^ (i2219 << 13);
        int i2311 = i2310 ^ (i2310 >>> 17);
        ((int[]) objArr1317[1])[0] = i2311 ^ (i2311 << 5);
        zzic.zzy(context, null, null);
        int i2312 = ((int[]) objArr2[2])[0];
        int i2313 = i2312 * i2312;
        int i2314 = -(2000879497 * i2312);
        int i2315 = ((((i2313 | i2314) << 1) - (i2313 ^ i2314)) - (~(-(i2312 * 730132573)))) - 1;
        int i2316 = (i2315 ^ 2082001065) + ((2082001065 & i2315) << 1);
        int i2317 = i2316 >> 15;
        int i2318 = ((((-262143) | i2317) << 1) - (i2317 ^ (-262143))) / 131072;
        int i2319 = i2318 & 1;
        int i2410 = (i2318 | 1) + i2319;
        int i2411 = -(((i2316 & i2410) + (i2316 | i2410)) ^ ((i2318 ^ 1) + (i2319 << 1)));
        int i2412 = (i2411 ^ 2) + ((i2411 & 2) << 1);
        int i2413 = ((i2412 >> 21) - 4095) / 2048;
        int i2414 = ((i2413 | 1) << 1) - (i2413 ^ 1);
        int i2415 = 1081024 / (((-((i2414 ^ 1) + ((i2414 & 1) << 1))) & i2412) * PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
        int i2416 = ((int[]) objArr4[2])[0];
        int i2417 = i2416 * i2416;
        int i2418 = -(1871517888 * i2416);
        int i2419 = (i2417 ^ i2418) + ((i2417 & i2418) << 1);
        int i2510 = -(i2416 * 1580665982);
        int i2511 = (i2419 ^ i2510) + ((i2510 & i2419) << 1);
        int i2512 = (i2511 & (-1776894271)) + ((-1776894271) | i2511);
        int i2513 = i2512 >> 29;
        int i2514 = ((i2513 & (-15)) + (i2513 | (-15))) / 8;
        int i2515 = (i2514 & 1) + (i2514 | 1);
        int i2516 = (i2512 & i2515) + (i2515 | i2512);
        int i2517 = i2512 >> 23;
        int i2518 = (((i2517 | (-1023)) << 1) - (i2517 ^ (-1023))) / 512;
        int i2519 = -((((i2518 | 1) << 1) - (i2518 ^ 1)) ^ i2516);
        int i2610 = (i2519 ^ 8) + ((i2519 & 8) << 1);
        int i2611 = i2610 >> 15;
        int i2612 = ((((-262143) | i2611) << 1) - (i2611 ^ (-262143))) / 131072;
        int i2613 = (i2612 ^ 1) + ((i2612 & 1) << 1);
        int i2614 = i2415 + (2284080 / (((-((i2613 & 1) + (i2613 | 1))) & i2610) * 307));
        int i2615 = ((int[]) objArr6[3])[0];
        int i2616 = i2615 * i2615;
        int i2617 = -(449622682 * i2615);
        int i2618 = (((i2616 ^ i2617) + ((i2616 & i2617) << 1)) - (~(-(i2615 * 1689830550)))) - 1;
        int i2619 = (i2618 & (-1411945920)) + ((-1411945920) | i2618);
        int i2710 = ((i2619 >> 26) + ComposerKt.defaultsKey) / 64;
        int i2711 = ((i2710 | 1) << 1) - (i2710 ^ 1);
        int i2712 = (i2619 ^ i2711) + ((i2711 & i2619) << 1);
        int i2713 = i2619 >> 24;
        int i2714 = ((i2713 ^ (-511)) + ((i2713 & (-511)) << 1)) / 256;
        int i2715 = -(i2712 ^ (((i2714 | 1) << 1) - (i2714 ^ 1)));
        int i2716 = (i2715 ^ 1) + ((i2715 & 1) << 1);
        int i2717 = i2716 >> 22;
        int i2718 = (((i2717 | (-2047)) << 1) - (i2717 ^ (-2047))) / 1024;
        int i2719 = ((i2718 | 1) << 1) - (i2718 ^ 1);
        int i2810 = i2614 + (735539 / (((-((i2719 ^ 1) + ((i2719 & 1) << 1))) & i2716) * 883));
        int i2811 = ((int[]) objArr8[1])[0];
        int i2812 = ((i2811 * i2811) - (~(-(364649934 * i2811)))) - 1;
        int i2813 = -(i2811 * 250304328);
        int i2814 = (i2812 & i2813) + (i2813 | i2812);
        int i2815 = ((i2814 | 168839033) << 1) - (168839033 ^ i2814);
        int i2816 = ((i2815 >> 16) - 131071) / 65536;
        int i2817 = (i2816 ^ 1) + ((i2816 & 1) << 1);
        int i2818 = ((i2815 | i2817) << 1) - (i2817 ^ i2815);
        int i2819 = i2815 >> 18;
        int i2910 = ((i2819 ^ (-32767)) + ((i2819 & (-32767)) << 1)) / 16384;
        int i2911 = (-(i2818 ^ ((i2910 & 1) + (i2910 | 1)))) + 1;
        int i2912 = i2911 >> 19;
        int i2913 = ((i2912 & (-16383)) + (i2912 | (-16383))) / 8192;
        int i2914 = (i2913 ^ 1) + ((i2913 & 1) << 1);
        int i2915 = i2810 + (1241660 / ((i2911 & (-(((i2914 | 1) << 1) - (i2914 ^ 1)))) * 1810));
        int i2916 = ((int[]) objArr11[1])[0];
        int i2917 = i2916 * i2916;
        int i2918 = -(1605791257 * i2916);
        int i2919 = (i2917 ^ i2918) + ((i2917 & i2918) << 1);
        int i3010 = -(i2916 * 286326967);
        int i3011 = ((i2919 & i3010) + (i3010 | i2919)) - 573187520;
        int i3012 = i3011 >> 27;
        int i3013 = (((i3012 | (-63)) << 1) - (i3012 ^ (-63))) / 32;
        int i3014 = (i3013 ^ 1) + ((i3013 & 1) << 1);
        int i3015 = (i3011 ^ i3014) + ((i3014 & i3011) << 1);
        int i3016 = ((i3011 >> 22) - 2047) / 1024;
        int i3017 = -(i3015 ^ ((i3016 ^ 1) + ((i3016 & 1) << 1)));
        int i3018 = (i3017 & 1) + (i3017 | 1);
        int i3019 = i3018 >> 18;
        int i3110 = ((i3019 ^ (-32767)) + ((i3019 & (-32767)) << 1)) / 16384;
        int i3111 = i2915 + (35821 / (((-(((i3110 ^ 1) + ((i3110 & 1) << 1)) + 1)) & i3018) * TypedValues.AttributesType.TYPE_EASING));
        int i3112 = ((int[]) objArr13[0])[0];
        int i3113 = i3112 * i3112;
        int i3114 = -(1139361524 * i3112);
        int i3115 = ((i3113 | i3114) << 1) - (i3113 ^ i3114);
        int i3116 = -(i3112 * (-944775272));
        int i3117 = ((i3115 | i3116) << 1) - (i3116 ^ i3115);
        int i3118 = (i3117 ^ (-934709468)) + (((-934709468) & i3117) << 1);
        int i3119 = i3118 >> 27;
        int i3210 = ((i3119 ^ (-63)) + ((i3119 & (-63)) << 1)) / 32;
        int i3211 = ((i3210 | 1) << 1) - (i3210 ^ 1);
        int i3212 = ((i3118 | i3211) << 1) - (i3211 ^ i3118);
        int i3213 = i3118 >> 18;
        int i3214 = ((i3213 ^ (-32767)) + ((i3213 & (-32767)) << 1)) / 16384;
        int i3215 = -(((i3214 & 1) + (i3214 | 1)) ^ i3212);
        int i3216 = ((i3215 | 5) << 1) - (i3215 ^ 5);
        int i3217 = ((i3216 >> 25) - 255) / 128;
        int i3218 = i3111 + (2615715 / (((-((((i3217 | 1) << 1) - (i3217 ^ 1)) + 1)) & i3216) * 1571));
        int i3219 = ((int[]) objArr15[0])[0];
        int i3310 = ((((i3219 * i3219) - (~(-(1145451007 * i3219)))) - 1) - (~(-(i3219 * (-775213731))))) - 1;
        int i3311 = (i3310 & 1735350852) + (i3310 | 1735350852);
        int i3312 = (((i3311 >> 24) - 511) / 256) + 1;
        int i3313 = ((i3311 | i3312) << 1) - (i3312 ^ i3311);
        int i3314 = i3311 >> 21;
        int i3315 = ((i3314 ^ (-4095)) + ((i3314 & (-4095)) << 1)) / 2048;
        int i3316 = -(((i3315 ^ 1) + ((i3315 & 1) << 1)) ^ i3313);
        int i3317 = ((i3316 | 4) << 1) - (i3316 ^ 4);
        int i3318 = i3317 >> 26;
        int i3319 = ((i3318 & ComposerKt.defaultsKey) + (i3318 | ComposerKt.defaultsKey)) / 64;
        int i3410 = (i3319 ^ 1) + ((i3319 & 1) << 1);
        int i3411 = i3218 + (4427280 / (((-((i3410 ^ 1) + ((i3410 & 1) << 1))) & i3317) * 1287));
        int i3412 = ((int[]) objArr17[3])[0];
        int i3413 = i3412 * i3412;
        int i3414 = -(568211885 * i3412);
        int i3415 = (i3413 & i3414) + (i3413 | i3414);
        int i3416 = -(i3412 * 1503018847);
        int i3417 = ((i3415 ^ i3416) + ((i3416 & i3415) << 1)) - 586738140;
        int i3418 = i3417 >> 23;
        int i3419 = (((i3418 | (-1023)) << 1) - (i3418 ^ (-1023))) / 512;
        int i3510 = (i3419 & 1) + (i3419 | 1);
        int i3511 = (i3417 ^ i3510) + ((i3510 & i3417) << 1);
        int i3512 = ((i3417 >> 27) - 63) / 32;
        int i3513 = -(i3511 ^ (((i3512 | 1) << 1) - (i3512 ^ 1)));
        int i3514 = (i3513 ^ 3) + ((i3513 & 3) << 1);
        int i3515 = i3514 >> 28;
        int i3516 = ((i3515 ^ (-31)) + ((i3515 & (-31)) << 1)) / 16;
        int i3517 = ((i3516 | 1) << 1) - (i3516 ^ 1);
        int i3518 = i3411 + (5259555 / (((-(((i3517 | 1) << 1) - (i3517 ^ 1))) & i3514) * 1981));
        int i3519 = ((int[]) objArr20[1])[0];
        int i3610 = ((i3519 * i3519) - (~(-(955485807 * i3519)))) - 1;
        int i3611 = -(i3519 * 1518457851);
        int i3612 = (i3610 & i3611) + (i3611 | i3610);
        int i3613 = (i3612 & 900617465) + (900617465 | i3612);
        int i3614 = i3613 >> 18;
        int i3615 = ((i3614 ^ (-32767)) + ((i3614 & (-32767)) << 1)) / 16384;
        int i3616 = (i3613 - (~(((i3615 | 1) << 1) - (i3615 ^ 1)))) - 1;
        int i3617 = i3613 >> 26;
        int i3618 = ((i3617 & ComposerKt.defaultsKey) + (i3617 | ComposerKt.defaultsKey)) / 64;
        int i3619 = -(i3616 ^ ((i3618 & 1) + (i3618 | 1)));
        int i3710 = (i3619 ^ 1) + ((i3619 & 1) << 1);
        int i3711 = i3710 >> 22;
        int i3712 = i3518 + (138798 / (((-((((i3711 & (-2047)) + (i3711 | (-2047))) / 1024) + 2)) & i3710) * 1402));
        int i3713 = ((int[]) objArr22[1])[0];
        int i3714 = i3713 * i3713;
        int i3715 = -(1830334448 * i3713);
        int i3716 = (i3714 & i3715) + (i3714 | i3715);
        int i3717 = -(i3713 * 186537636);
        int i3718 = (i3716 & i3717) + (i3717 | i3716);
        int i3719 = (i3718 ^ (-1527721628)) + (((-1527721628) & i3718) << 1);
        int i3810 = (((i3719 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
        int i3811 = -(((((i3719 >> 29) - 15) / 8) + 1) ^ ((i3719 ^ i3810) + ((i3810 & i3719) << 1)));
        int i3812 = (i3811 ^ 3) + ((i3811 & 3) << 1);
        int i3813 = i3812 >> 21;
        int i3814 = ((i3813 & (-4095)) + (i3813 | (-4095))) / 2048;
        int i3815 = (i3814 & 1) + (i3814 | 1);
        int i3816 = i3712 + (1507920 / (((-((i3815 & 1) + (i3815 | 1))) & i3812) * 976));
        int i3817 = ((int[]) objArr1317[1])[0];
        int i3818 = i3817 * i3817;
        int i3819 = -(815249158 * i3817);
        int i3910 = (i3818 ^ i3819) + ((i3818 & i3819) << 1);
        int i3911 = -(i3817 * (-366004978));
        int i3912 = (((i3910 | i3911) << 1) - (i3911 ^ i3910)) - 2044118940;
        int i3913 = i3912 >> 26;
        int i3914 = (((i3913 | ComposerKt.defaultsKey) << 1) - (i3913 ^ ComposerKt.defaultsKey)) / 64;
        int i3915 = (i3914 ^ 1) + ((i3914 & 1) << 1);
        int i3916 = (i3912 ^ i3915) + ((i3915 & i3912) << 1);
        int i3917 = i3912 >> 28;
        int i3918 = (((i3917 | (-31)) << 1) - (i3917 ^ (-31))) / 16;
        int i3919 = (-(((i3918 ^ 1) + ((i3918 & 1) << 1)) ^ i3916)) + 5;
        int i4010 = i3919 >> 20;
        int i4011 = ((i4010 & (-8191)) + (i4010 | (-8191))) / 4096;
        int i4012 = (i4011 ^ 1) + ((i4011 & 1) << 1);
        return i3816 + ((-36336080) / ((i3919 & (-((i4012 & 1) + (i4012 | 1)))) * 1256));
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    static {
        byte[] bArr = new byte[550];
        System.arraycopy("\u007f+ÙÛ\u000bï\u0000\u0001\u0007ûó@\u0002Ëû\u0001ïú\rñBºø\f\u0007é\u0013-\u0002êÑ\té(ëí\fñú\u0013ýô\u0005Ý\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õø\u0010÷ù\bùù\u0005\u001cÙ\u0006ø\të\rñ?éæ\bøÿ)Ù\tõõ\u000fý\u001fÝï\r\u0000í\u0003ûò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034ÅøøCÃùø\rñ\u0002\u000bó<¿ÿÿ\u0000ó\u0013úò\u0000þüÿ>²þ\fþÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007öAò\u0000=Áúø\u0000\týü\u0005íÿþ\u00111Ëìø\t\t3ëÌø\t\t\u000eìñú\u000fñLñÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö@ò\u0000=Åöþ\u0006ù\u00055Æûõ\u000b\u0001ÿì\f5Éï\u000fì\túñ\u0003\t\u0004îCÃùø\rñ\u0002\u000bó<¿ü\tý÷<éÏ\u000fì\túñ\u0003\t\u0004î\u001fëóÿûüNÏìðþ\bøÿHÝÍ\u000fõøNÐá\u0001þûøÿ1Ìþ\b\u0000÷ÿ\u0006õøNÐá\u0001þûøÿ\u001cóí\u0007\u0006ñøNàË\nû\u0006ýñò\u0000=Êð\u0004õý\u0007ôEÈ\u0001ë\u00111·\u0000\fñB¿ü\tý÷<º\u000bòú\u000eðýD×ã\n\u0001ë\r\u001fÝí\u000b\u0004ü\u000fã\u0002\u0004õñô\u0004\u0013å\u0004íý\u0001\u000b\u0016êñ\u000bø\u0000ñ+Ë\u0002\rñ\u0002\u000bó\u0017Ø\tø\n\u0001ï\t\u0004\u0015éò\tü\u0001-Ý\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö?".getBytes("ISO-8859-1"), 0, bArr, 0, 550);
        $$d = bArr;
        $$e = 116;
        $$a = new byte[]{27, -8, 5, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 35;
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -7473539370631120580L;
    }
}
