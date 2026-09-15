package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.google.android.gms.internal.measurement.zzfb;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -56, 23, -36, 4, 11, 2, -20, 14, 16, -31, 16, -14, -6, 12, -10, -4, 4, 11, -20, 10, -7, 0, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -67, -3, 12, -15, 13, -10, -7, 18, -20, 10, -7, 0, 63, -55, -6, 1, -3, -12, 18, -12, 8, 1, -18, 13, 53, -23, -34, -16, 18, -9, -4, 39, -38, 1, -3, -12, 18, -12, 40, -31, -18, 13, 34, -35, -18, 10, -14, 12, -12, -6, 84, -80, 2, 10, 1, -7, 7, -12, 71, -1, -70, -6, 1, 2, -6, 8, 0, 63, -83, 12, 3, -19, 41, -35, 10, -2, -8, 71, -65, -2, -2, 4, -21, 8, -9, 79, -16, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 64, 10, -14, 11, -10, -4, 4, 35, -28, -2, -10, -7, 10, 2, -4, 3, -14, 48, -35, -18, 10, -7, 0, -13, 1, 62, -62, -5, -7, 1, 10, -2, -3, 6, -18, 0, -1, 18, 50, -52, -19, -7, 10, 10, 52, -20, -51, -7, 10, 10, 15, -19, -14, -5, 16, -14, 77, -14, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 65, -13, 1, 62, -52, -14, 9, -15, 2, 5, 4, 53, -73, 6, 2, -1, 6, -21, 74, -71, 4, -1, 2, 9, -14, -10, 73, -28, -37, 11, -7, 1, 24, -36, 13, -4, -2, -14, 77, -16, -13, 1, 62, -58, -9, -1, 7, -6, 6, 54, -52, -14, 9, -15, 2, 5, 4, 53, -63, 2, 6, -17, 16, -18, 8, 3, -15, 68, -67, 3, 10, -3, -3, -15, 68, -60, -6, -7, 14, -14, 3, 12, -12, Base64.padSymbol, -77, -1, 23, -8, 0, -13, 1, 62, -58, -9, -1, 7, -6, 6, 54, -57, -4, -10, 12, 2, 0, -19, 13, 54, -54, -16, 16, -19, 10, -5, -14, 4, 10, 5, -17, 68, -60, -6, -7, 14, -14, 3, 12, -12, Base64.padSymbol, -67, 10, -14, -2, 9, -11, -2, 14, -10, 10, -3, 54, -25, -36, -4, 6, 17, -34, 4, -4, 12, 64, -1, -34, -52, 3, 14, -14, 3, 12, -12, 24, -39, 10, -7, 11, 2, -16, 10, 5, 22, -22, -13, 10, -3, 2, 48};
    private static final int $$e = 204;
    private static final byte[] $$a = {22, 102, 43, -6, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 116;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {1176435720, 1141237187, -772912262, 1122798342, -1888586823, 18414796, -1041664644, 1671689868, -1162126380, -987153041, -1674734934, 10081379, 1608284045, -374272995, -1269550600, 890842457, -1834212402, 796179892};

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r5
            int r6 = 103 - r6
            int r7 = 207 - r7
            byte[] r1 = com.google.firebase.analytics.GoogleAnalyticsServerPreviewActivity.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r6 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.GoogleAnalyticsServerPreviewActivity.b(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 84
            int r6 = r6 + 4
            byte[] r0 = com.google.firebase.analytics.GoogleAnalyticsServerPreviewActivity.$$d
            int r1 = 99 - r7
            byte[] r1 = new byte[r1]
            int r7 = 98 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.GoogleAnalyticsServerPreviewActivity.c(short, int, int, java.lang.Object[]):void");
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i5;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", i5), 3291 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 75;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = -1870535734;
                    i5 = 0;
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
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionType(j), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 3290, 31 - TextUtils.getOffsetBefore("", 0), 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i9++;
                    iArr5 = iArr5;
                    j = 0;
                    i4 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i10 = $11 + 63;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 2 % 5;
        }
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i12 = 17;
            for (int i13 = 1; i12 > i13; i13 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2560 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-16777187) - Color.rgb(0, 0, 0), 683220507, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i12--;
            }
            int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 28879), 348 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 26, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:423:0x2a56  */
    /* JADX WARN: Code duplicated, block: B:424:0x2af3  */
    /* JADX WARN: Code duplicated, block: B:427:0x2b8f  */
    /* JADX WARN: Code duplicated, block: B:430:0x2bfe  */
    /* JADX WARN: Code duplicated, block: B:433:0x2c57  */
    /* JADX WARN: Code duplicated, block: B:435:0x2c60  */
    /* JADX WARN: Code duplicated, block: B:438:0x2d3a  */
    /* JADX WARN: Code duplicated, block: B:442:0x2dc2  */
    /* JADX WARN: Code duplicated, block: B:447:0x2e25  */
    /* JADX WARN: Code duplicated, block: B:450:0x2e79  */
    /* JADX WARN: Code duplicated, block: B:454:0x2ece  */
    /* JADX WARN: Code duplicated, block: B:455:0x2f39  */
    /* JADX WARN: Code duplicated, block: B:457:0x2f45  */
    /* JADX WARN: Code duplicated, block: B:460:0x2f49 A[LOOP:0: B:458:0x2f46->B:460:0x2f49, LOOP_END] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        int i;
        Object[] objArr3;
        int i2;
        String str3;
        Object[] objArr4;
        char c;
        int i3;
        String str4;
        Object[] objArr5;
        Object[] objArr6;
        int i4;
        Object[] objArr7;
        Object[] objArrB$7879113;
        String str5;
        Object[] objArr8;
        Object[] objArr9;
        CharSequence charSequence;
        int i5;
        int i6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object[] objArr10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i7;
        int i8;
        ArrayList arrayList;
        String[] strArr;
        int i9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i10 = 2 % 2;
        Object[] objArr11 = new Object[1];
        a(new int[]{1510398363, -1589644110, -1693146222, -1446315409, 1489713388, 1836351040, -651359955, -2083921789, 360959764, 116884096, -875255645, -1769916589, 1587768982, -1861835626}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr11);
        String str6 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(new int[]{1104733604, -1046733499, -825929892, -1386721466, 1041922899, 1347853857, -1559969902, 586873206, -1186415037, -1373952555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step2).substring(1, 3).length() + 13, objArr12);
        String str7 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(new int[]{-657196155, -1795519982, 1182392900, 913186435, -770750125, 71096835, 2090691034, -1602302801, 1699617152, 2066980556}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr13);
        String str8 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(new int[]{-874496026, 694909755, 399288329, 50039803, 925913655, -924376188, 2040246391, 820389950, 711669672, 1342797422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr14);
        String str9 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new int[]{2010821191, 2123943461, 2022602402, -106838148, 810006811, -589642640, 562558417, 714605481, -1009317249, -1671124650, 1985418612, 1807768071, 1014080956, 1798668265, -1082254888, 589983516}, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, objArr15);
        String str10 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new int[]{-1831068550, -1828641751, -1373424133, 1868612263, -282647230, -229555118, 1877174919, -382441204, 1510419579, 2034800069, -2009838191, -1761120002}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step6).substring(3, 4).codePointAt(0) - 99, objArr16);
        String str11 = (String) objArr16[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel = (char) (43041 - ImageFormat.getBitsPerPixel(0));
            int iRed = 3111 - Color.red(0);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 22;
            byte[] bArr = $$a;
            Object[] objArr17 = new Object[1];
            b(bArr[7], bArr[54], (short) 203, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel, iRed, iIndexOf, -1272852037, false, (String) objArr17[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char c2 = (char) (43042 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int threadPriority = 3111 - ((Process.getThreadPriority(0) + 20) >> 6);
                int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr2 = $$a;
                byte b = (byte) (bArr2[33] - 1);
                byte b2 = bArr2[54];
                Object[] objArr18 = new Object[1];
                b(b, b2, (short) (b2 | 132), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, threadPriority, iMakeMeasureSpec, 154975793, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            int i11 = ((int[]) objArr19[2])[0];
            int i12 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[3];
            int[] iArr = {i11};
            int i13 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i14 = 426838298 + (((~(1700787934 | i13)) | 4243524) * (-828)) + ((i13 | 1700787934) * (-828)) + 1398100373;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
            objArr = new Object[]{new int[1], new int[]{i12}, iArr, strArr2};
            str7 = str7;
            str9 = str9;
        } else {
            try {
                Object[] objArr20 = {null, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, 901237465};
                byte[] bArr3 = $$d;
                Object[] objArr21 = new Object[1];
                c((byte) (bArr3[113] - 1), bArr3[130], bArr3[156], objArr21);
                Class<?> cls = Class.forName((String) objArr21[0]);
                Object[] objArr22 = new Object[1];
                c(bArr3[22], bArr3[78], bArr3[401], objArr22);
                Object[] objArr23 = (Object[]) cls.getMethod((String) objArr22[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr20);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0'));
                    int i17 = 3112 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i18 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                    byte[] bArr4 = $$a;
                    byte b3 = (byte) (bArr4[33] - 1);
                    byte b4 = bArr4[54];
                    Object[] objArr24 = new Object[1];
                    b(b3, b4, (short) (b4 | 132), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, i17, i18, 154975793, false, (String) objArr24[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr23);
                try {
                    long jLongValue2 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 43043);
                        int keyRepeatTimeout = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int mirror = 'F' - AndroidCharacter.getMirror('0');
                        byte[] bArr5 = $$a;
                        Object[] objArr25 = new Object[1];
                        b(bArr5[7], bArr5[54], (short) ($$b - 2), objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, keyRepeatTimeout, mirror, -1269618118, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                        int packedPositionChild = 3110 - ExpandableListView.getPackedPositionChild(0L);
                        int i19 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                        byte[] bArr6 = $$a;
                        Object[] objArr26 = new Object[1];
                        b(bArr6[7], bArr6[54], (short) 203, objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mode, packedPositionChild, i19, -1272852037, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf2);
                    objArr = objArr23;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[2])[0];
        if (i21 != i20) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str12 : strArr3) {
                    arrayList2.add(str12);
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[3];
        int i25 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i26 = i22 + ((((~((-1095771353) | i25)) | 269385730) * 449) - 2060250810) + (((~((~i25) | (-1095771353))) | 269385730) * 449);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr[0])[0] = i28 ^ (i28 << 5);
        Object[] objArr27 = {new int[1], new int[]{i24}, new int[]{i23}, strArr4};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int i29 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int mode2 = 33 - View.MeasureSpec.getMode(0);
            byte[] bArr7 = $$a;
            Object[] objArr28 = new Object[1];
            b(bArr7[7], bArr7[54], (short) ($$b - 2), objArr28);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i29, mode2, -887667012, false, (String) objArr28[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int doubleTapTimeout = 2267 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 34;
                byte[] bArr8 = $$a;
                byte b5 = (byte) (bArr8[33] - 1);
                byte b6 = bArr8[54];
                Object[] objArr29 = new Object[1];
                b(b5, b6, (short) (b6 | 132), objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb, doubleTapTimeout, iLastIndexOf, -654680577, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr30[0])[0];
            int i31 = ((int[]) objArr30[3])[0];
            String[] strArr5 = (String[]) objArr30[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i32 = (-1983556511) + (((~startUptimeMillis) | 8913064) * 1324) + (((~(startUptimeMillis | 94988968)) | (~(713724347 | startUptimeMillis))) * (-1324)) + 206343294;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[2])[0] = i34 ^ (i34 << 5);
            str = str11;
            str2 = str7;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str10).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                str = str11;
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    str = str11;
                    int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                    int i36 = i35 % 2;
                    baseContext = null;
                } else {
                    str = str11;
                    str = str11;
                    baseContext = baseContext.getApplicationContext();
                }
            }
            str = str11;
            str = str11;
            str9 = str9;
            Object[] objArr31 = {baseContext, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, 625035612};
            byte[] bArr9 = $$d;
            Object[] objArr32 = new Object[1];
            c(bArr9[259], (short) (-bArr9[84]), bArr9[22], objArr32);
            Class<?> cls2 = Class.forName((String) objArr32[0]);
            byte b7 = bArr9[22];
            Object[] objArr33 = new Object[1];
            c(b7, (short) (b7 | 153), (byte) (bArr9[36] + 1), objArr33);
            Object[] objArr34 = (Object[]) cls2.getMethod((String) objArr33[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr31);
            if (baseContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int iBlue = 2267 - Color.blue(0);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 33;
                    byte[] bArr10 = $$a;
                    byte b8 = (byte) (bArr10[33] - 1);
                    byte b9 = bArr10[54];
                    Object[] objArr35 = new Object[1];
                    b(b8, b9, (short) (b9 | 132), objArr35);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(bitsPerPixel2, iBlue, trimmedLength, -654680577, false, (String) objArr35[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr34);
                try {
                    str2 = str7;
                    long jLongValue3 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int windowTouchSlop = 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i37 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                        byte[] bArr11 = $$a;
                        Object[] objArr36 = new Object[1];
                        b(bArr11[7], bArr11[54], (short) 203, objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cResolveSizeAndState, windowTouchSlop, i37, -874156483, false, (String) objArr36[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
                        int size = 33 - View.MeasureSpec.getSize(0);
                        byte[] bArr12 = $$a;
                        Object[] objArr37 = new Object[1];
                        b(bArr12[7], bArr12[54], (short) ($$b - 2), objArr37);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(absoluteGravity, iCombineMeasuredStates, size, -887667012, false, (String) objArr37[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr34 = objArr34;
                str9 = str9;
                str2 = str7;
            }
            objArr2 = objArr34;
        }
        int i38 = ((int[]) objArr2[3])[0];
        int i39 = ((int[]) objArr2[0])[0];
        if (i39 == i38) {
            Object[] objArr38 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i40 = ((int[]) objArr2[2])[0];
            int i41 = ((int[]) objArr2[0])[0];
            int i42 = ((int[]) objArr2[3])[0];
            String[] strArr6 = (String[]) objArr2[1];
            int i43 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i44 = ~i43;
            int i45 = i40 + 6062155 + ((i43 | 117983243) * 988) + (((~(123488431 | i44)) | 679719696) * (-1976)) + (((~(i43 | (-685224885))) | 117983243 | (~(685224884 | i44))) * 988);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            i = 0;
            ((int[]) objArr38[2])[0] = i47 ^ (i47 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr2[1];
            if (strArr7 != null) {
                for (String str13 : strArr7) {
                    arrayList3.add(str13);
                }
            }
            int[] iArr2 = new int[i39];
            int i48 = i39 - 1;
            iArr2[i48] = 1;
            Toast.makeText((Context) null, iArr2[((i39 * i48) % 2) - 1], 1).show();
            Object[] objArr39 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i49 = ((int[]) objArr2[2])[0];
            int i50 = ((int[]) objArr2[0])[0];
            int i51 = ((int[]) objArr2[3])[0];
            String[] strArr8 = (String[]) objArr2[1];
            int iMyUid = Process.myUid();
            int i52 = ~iMyUid;
            int i53 = i49 + ((((~(i52 | 748676866)) | ((~((-60036450) | i52)) | 50335841)) * (-397)) - 507084983) + ((iMyUid | 789312099) * 397);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            i = 0;
            ((int[]) objArr39[2])[0] = i55 ^ (i55 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b((char) (46400 - View.getDefaultSize(i, i)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 40, 18 - ImageFormat.getBitsPerPixel(i), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionType(0L)), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(obj, null);
            super.onCreate(bundle);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char maximumDrawingCacheSize = (char) (37567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int offsetBefore = 625 - TextUtils.getOffsetBefore("", 0);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
                Object[] objArr40 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(maximumDrawingCacheSize, offsetBefore, pressedStateDuration, -477065106, false, (String) objArr40[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null);
            long jLongValue4 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char mirror2 = (char) (AndroidCharacter.getMirror('0') + 37519);
                int iLastIndexOf2 = 624 - TextUtils.lastIndexOf("", '0', 0);
                int absoluteGravity2 = 14 - Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr13 = $$a;
                Object[] objArr41 = new Object[1];
                b(bArr13[7], bArr13[54], (short) 203, objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(mirror2, iLastIndexOf2, absoluteGravity2, -976899241, false, (String) objArr41[0], null);
            }
            if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) << 52) >>> 52)) >> 12)) {
                int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i56 % 128;
                int i57 = i56 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char cGreen = (char) (37567 - Color.green(0));
                    int iAxisFromString = 624 - MotionEvent.axisFromString("");
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                    byte[] bArr14 = $$a;
                    Object[] objArr42 = new Object[1];
                    b(bArr14[7], bArr14[54], (short) ($$b - 2), objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cGreen, iAxisFromString, edgeSlop, -973632554, false, (String) objArr42[0], null);
                }
                Object[] objArr43 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
                int i58 = ((int[]) objArr43[2])[0];
                int i59 = ((int[]) objArr43[0])[0];
                String[] strArr9 = (String[]) objArr43[3];
                int[] iArr3 = {i58};
                int iIdentityHashCode = System.identityHashCode(this);
                int i60 = (~((-1140731231) | iIdentityHashCode)) | 11798794;
                int i61 = ~((~iIdentityHashCode) | 1811939326);
                int i62 = (-1220763292) + ((i60 | i61) * (-470)) + (((~(iIdentityHashCode | (-1128932437))) | i61) * 470) + 643467952;
                int i63 = (i62 << 13) ^ i62;
                int i64 = i63 ^ (i63 >>> 17);
                ((int[]) objArr3[1])[0] = i64 ^ (i64 << 5);
                objArr3 = new Object[]{new int[]{i59}, new int[1], iArr3, strArr9};
                str6 = str6;
                i2 = 0;
                str2 = str2;
            } else {
                Context baseContext2 = getBaseContext();
                if (baseContext2 == null) {
                    baseContext2 = (Context) Class.forName(str10).getMethod(str, new Class[0]).invoke(null, null);
                }
                if (baseContext2 != null) {
                    baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
                }
                String str14 = str9;
                int iIntValue = ((Integer) Class.forName(str8).getMethod(str14, Object.class).invoke(null, this)).intValue();
                Object[] objArr44 = new Object[1];
                a(new int[]{1699138268, 905749746, 2046888247, 1013351057, -1514036724, -1953208718, 447519552, -2054203231, 1924962049, -1431126419, 1356536124, -372669189, -1199906947, -1104279980, -736141924, 1052689305, -699515071, -1867100363, 157374589, 1883873697, -1067638127, -2074846102, 107071893, -623777548, 533684232, -492699980, 862785818, -83996970, -1635872437, -156790457, -821353481, -592076144, 84208004, 1099168614}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 28, objArr44);
                String str15 = (String) objArr44[0];
                Object[] objArr45 = new Object[1];
                a(new int[]{-1392099245, -1979474179, -1535411127, 1950665584, -926683435, 1838392822, -1337687575, -882983820, 157676797, 1833423845, 1124806179, -313929751, -1666878542, 341422057, 886381328, 2133872856, 318129852, 123295070, 195665531, 1854470600, 808858281, 1811918406, 1467728522, 61254818, 962471014, -307906605, 16235618, 1090517164, -787890566, 997925393, -844678781, -1706534885, -1497605802, 317497242}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_bca_klikpay).substring(1, 3).length() + 62, objArr45);
                Object[] objArr46 = {baseContext2, new String[]{str15, (String) objArr45[0]}, Integer.valueOf(iIntValue), 17, 643467952};
                byte[] bArr15 = $$d;
                byte b10 = (byte) (-bArr15[217]);
                short s = (short) ($$e + 1);
                str9 = str14;
                Object[] objArr47 = new Object[1];
                c(b10, s, (byte) (s & 382), objArr47);
                Class<?> cls3 = Class.forName((String) objArr47[0]);
                short s2 = (short) 227;
                Object[] objArr48 = new Object[1];
                c(bArr15[8], s2, (byte) (s2 & 382), objArr48);
                Object[] objArr49 = (Object[]) cls3.getMethod((String) objArr48[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr46);
                int i65 = ((int[]) objArr49[0])[0];
                int i66 = ((int[]) objArr49[2])[0];
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char mirror3 = (char) (37615 - AndroidCharacter.getMirror('0'));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
                        byte[] bArr16 = $$a;
                        Object[] objArr50 = new Object[1];
                        b(bArr16[7], bArr16[54], (short) ($$b - 2), objArr50);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(mirror3, scrollDefaultDelay, touchSlop, -973632554, false, (String) objArr50[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, objArr49);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 37568);
                            int doubleTapTimeout2 = 625 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int trimmedLength2 = 14 - TextUtils.getTrimmedLength("");
                            byte[] bArr17 = $$a;
                            Object[] objArr51 = new Object[1];
                            b(bArr17[7], bArr17[54], (short) 203, objArr51);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cLastIndexOf2, doubleTapTimeout2, trimmedLength2, -976899241, false, (String) objArr51[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                            char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
                            int bitsPerPixel3 = 13 - ImageFormat.getBitsPerPixel(0);
                            Object[] objArr52 = new Object[1];
                            b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr52);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c4, iKeyCodeFromString, bitsPerPixel3, -477065106, false, (String) objArr52[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf6);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                } else {
                    str6 = str6;
                    objArr49 = objArr49;
                    str2 = str2;
                }
                objArr3 = objArr49;
                i2 = 0;
            }
            if (((int[]) objArr3[2])[i2] != ((int[]) objArr3[i2])[i2]) {
                int i67 = i2;
                ArrayList arrayList4 = new ArrayList();
                String[] strArr10 = (String[]) objArr3[3];
                if (strArr10 != null) {
                    for (int i68 = i67; i68 < strArr10.length; i68++) {
                        int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                        if (i69 % 2 == 0) {
                            arrayList4.add(strArr10[i68]);
                        } else {
                            arrayList4.add(strArr10[i68]);
                        }
                    }
                }
                throw null;
            }
            Object[] objArr53 = new Object[4];
            int[] iArr4 = new int[1];
            objArr53[i2] = iArr4;
            objArr53[1] = new int[1];
            int[] iArr5 = new int[1];
            objArr53[2] = iArr5;
            int i70 = ((int[]) objArr3[1])[i2];
            int i71 = ((int[]) objArr3[2])[i2];
            int i72 = ((int[]) objArr3[i2])[i2];
            String[] strArr11 = (String[]) objArr3[3];
            iArr5[i2] = i71;
            iArr4[i2] = i72;
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i73 = i70 + (-281883150) + (((~(iIdentityHashCode2 | 538228725)) | (-1822423032)) * 305) + (((~((~iIdentityHashCode2) | 538228725)) | (-1285509396)) * 305);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr53[1])[0] = i75 ^ (i75 << 5);
            objArr53[3] = strArr11;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                int i76 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i77 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                Object[] objArr54 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cResolveSize, i76, i77, -1048449946, false, (String) objArr54[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                    int iIndexOf2 = 921 - TextUtils.indexOf("", "");
                    int i78 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr18 = $$a;
                    byte b11 = (byte) (bArr18[33] - 1);
                    byte b12 = bArr18[54];
                    Object[] objArr55 = new Object[1];
                    b(b11, b12, (short) (b12 | 132), objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(packedPositionType, iIndexOf2, i78, -1142834547, false, (String) objArr55[0], null);
                }
                Object[] objArr56 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
                objArr4 = new Object[]{new int[1], new int[]{((int[]) objArr56[1])[0]}, (Object[]) objArr56[2], new int[]{((int[]) objArr56[3])[0]}, (String[]) objArr56[4]};
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step2).substring(35, 36).codePointAt(0) - 297234584;
                int i79 = ~iCodePointAt;
                int i80 = (((526674245 + (((~((-1026691493) | i79)) | 747388151) * (-602))) + ((((~(iCodePointAt | (-1026691493))) | 738201764) | (~(1035877879 | i79))) * (-301))) + ((~(i79 | 747388151)) * 301)) - 1054845477;
                int i81 = (i80 << 13) ^ i80;
                int i82 = i81 ^ (i81 >>> 17);
                ((int[]) objArr4[0])[0] = i82 ^ (i82 << 5);
                str3 = str2;
                c = 1;
                str8 = str8;
            } else {
                Context baseContext3 = getBaseContext();
                if (baseContext3 == null) {
                    baseContext3 = (Context) Class.forName(str10).getMethod(str, new Class[0]).invoke(null, null);
                }
                if (baseContext3 != null) {
                    baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
                }
                str9 = str9;
                Object[] objArr57 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue()), 0, -1054845477};
                byte[] bArr19 = $$d;
                Object[] objArr58 = new Object[1];
                c(bArr19[259], (short) 227, bArr19[83], objArr58);
                Class<?> cls4 = Class.forName((String) objArr58[0]);
                byte b13 = bArr19[22];
                Object[] objArr59 = new Object[1];
                c(b13, (short) (b13 | 262), (byte) (bArr19[36] + 1), objArr59);
                Object[] objArr60 = (Object[]) cls4.getMethod((String) objArr59[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr57);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char cArgb2 = (char) (31533 - Color.argb(0, 0, 0, 0));
                    int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iAxisFromString2 = 27 - MotionEvent.axisFromString("");
                    byte[] bArr20 = $$a;
                    byte b14 = (byte) (bArr20[33] - 1);
                    byte b15 = bArr20[54];
                    Object[] objArr61 = new Object[1];
                    b(b14, b15, (short) (b15 | 132), objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cArgb2, edgeSlop2, iAxisFromString2, -1142834547, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr60);
                try {
                    str3 = str2;
                    long jLongValue6 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 31533);
                        int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                        int size2 = 28 - View.MeasureSpec.getSize(0);
                        byte[] bArr21 = $$a;
                        Object[] objArr62 = new Object[1];
                        b(bArr21[7], bArr21[54], (short) ($$b - 2), objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf2, doubleTapTimeout3, size2, -778300370, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char cIndexOf3 = (char) (31533 - TextUtils.indexOf("", "", 0));
                        int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
                        int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 29;
                        Object[] objArr63 = new Object[1];
                        b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr63);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cIndexOf3, windowTouchSlop2, bitsPerPixel4, -1048449946, false, (String) objArr63[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf8);
                    objArr4 = objArr60;
                    c = 1;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            int i83 = ((int[]) objArr4[c])[0];
            int i84 = ((int[]) objArr4[3])[0];
            if (i84 == i83) {
                int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i85 % 128;
                int i86 = i85 % 2;
                int i87 = ((int[]) objArr4[0])[0];
                Object[] objArr64 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
                int i88 = (int) Runtime.getRuntime().totalMemory();
                int i89 = ~i88;
                int i90 = i87 + (-1128424400) + (((~((-1762129245) | i89)) | 11950399) * 226) + (((~(i89 | (-1761715265))) | (~((-11950400) | i88)) | 11536419) * (-113)) + ((~(i88 | (-1762129245))) * 113);
                int i91 = (i90 << 13) ^ i90;
                int i92 = i91 ^ (i91 >>> 17);
                i3 = 0;
                ((int[]) objArr64[0])[0] = i92 ^ (i92 << 5);
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr12 = (String[]) objArr4[4];
                if (strArr12 != null) {
                    for (String str16 : strArr12) {
                        arrayList5.add(str16);
                    }
                }
                int[] iArr6 = new int[i84];
                int i93 = i84 - 1;
                iArr6[i93] = 1;
                Toast.makeText((Context) null, iArr6[((i84 * i93) % 2) - 1], 1).show();
                int i94 = ((int[]) objArr4[0])[0];
                Object[] objArr65 = {new int[1], new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[]{((int[]) objArr4[3])[0]}, (String[]) objArr4[4]};
                int i95 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
                int i96 = ~i95;
                int i97 = i94 + (-2127116991) + (((~(1649414950 | i96)) | 86911057) * (-108)) + (((~(i96 | 124664693)) | (~((-124664694) | i95)) | 1611661314) * 54) + ((i95 | 1611661314) * 54);
                int i98 = (i97 << 13) ^ i97;
                int i99 = i98 ^ (i98 >>> 17);
                i3 = 0;
                ((int[]) objArr65[0])[0] = i99 ^ (i99 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cArgb3 = (char) Color.argb(i3, i3, i3, i3);
                int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                int gidForName = Process.getGidForName("") + 11;
                byte[] bArr22 = $$a;
                byte b16 = (byte) (bArr22[33] - 1);
                byte b17 = bArr22[54];
                Object[] objArr66 = new Object[1];
                b(b16, b17, (short) (b17 | 132), objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cArgb3, packedPositionGroup, gidForName, -1650998592, false, (String) objArr66[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null);
            long jLongValue7 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int gidForName2 = Process.getGidForName("") + 877;
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 10;
                byte[] bArr23 = $$a;
                Object[] objArr67 = new Object[1];
                b(bArr23[7], bArr23[54], (short) ($$b - 2), objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(touchSlop2, gidForName2, packedPositionType2, 2012020043, false, (String) objArr67[0], null);
            }
            if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char c5 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int i100 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 10;
                    byte[] bArr24 = $$a;
                    Object[] objArr68 = new Object[1];
                    b(bArr24[7], bArr24[54], (short) 203, objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c5, i100, packedPositionGroup2, 2012931276, false, (String) objArr68[0], null);
                }
                Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr69[0])[0]}, new int[1], new int[]{((int[]) objArr69[2])[0]}, (String[]) objArr69[3]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i101 = ~iIdentityHashCode3;
                int i102 = (-1414866884) + (((~((-863057600) | i101)) | 827327636) * (-1188));
                int i103 = (~(iIdentityHashCode3 | 863057599)) | 827327636;
                int i104 = ~(903367828 | i101);
                int i105 = ((i102 + ((i103 | i104) * 594)) + ((((~(863057599 | i101)) | (-939097792)) | i104) * 594)) - 1282447449;
                int i106 = (i105 << 13) ^ i105;
                int i107 = i106 ^ (i106 >>> 17);
                ((int[]) objArr5[1])[0] = i107 ^ (i107 << 5);
                str4 = str9;
            } else {
                Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    baseContext4 = (Context) Class.forName(str10).getMethod(str, new Class[0]).invoke(null, null);
                }
                if (baseContext4 != null) {
                    baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
                }
                str4 = str9;
                Object[] objArr70 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -1282447449};
                byte[] bArr25 = $$d;
                Object[] objArr71 = new Object[1];
                c(bArr25[259], (short) 314, (byte) 59, objArr71);
                Class<?> cls5 = Class.forName((String) objArr71[0]);
                byte b18 = bArr25[22];
                Object[] objArr72 = new Object[1];
                c(b18, (short) (b18 | 262), (byte) (bArr25[36] + 1), objArr72);
                Object[] objArr73 = (Object[]) cls5.getMethod((String) objArr72[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr70);
                if (baseContext4 != null) {
                    int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i108 % 128;
                    int i109 = i108 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char cIndexOf4 = (char) TextUtils.indexOf("", "");
                        int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                        int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        byte[] bArr26 = $$a;
                        Object[] objArr74 = new Object[1];
                        b(bArr26[7], bArr26[54], (short) 203, objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cIndexOf4, offsetAfter, edgeSlop3, 2012931276, false, (String) objArr74[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr73);
                    try {
                        long jLongValue8 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iMyTid = (Process.myTid() >> 22) + 876;
                            int iArgb = 10 - Color.argb(0, 0, 0, 0);
                            byte[] bArr27 = $$a;
                            Object[] objArr75 = new Object[1];
                            b(bArr27[7], bArr27[54], (short) ($$b - 2), objArr75);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollDefaultDelay2, iMyTid, iArgb, 2012020043, false, (String) objArr75[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                            char c6 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                            int i110 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int packedPositionChild2 = 9 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr28 = $$a;
                            byte b19 = (byte) (bArr28[33] - 1);
                            byte b20 = bArr28[54];
                            Object[] objArr76 = new Object[1];
                            b(b19, b20, (short) (b20 | 132), objArr76);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c6, i110, packedPositionChild2, -1650998592, false, (String) objArr76[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf10);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr73 = objArr73;
                }
                objArr5 = objArr73;
            }
            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[2])[0]) {
                throw null;
            }
            int i111 = ((int[]) objArr5[1])[0];
            Object[] objArr77 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int i112 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i113 = i111 + (-942559356) + (((~((-27931269) | i112)) | 68241497) * (-828)) + ((i112 | (-27931269)) * (-828)) + 1652253424;
            int i114 = i113 ^ (i113 << 13);
            int i115 = i114 ^ (i114 >>> 17);
            ((int[]) objArr77[1])[0] = i115 ^ (i115 << 5);
            int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i116 % 128;
            int i117 = i116 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iNormalizeMetaState = 651 - KeyEvent.normalizeMetaState(0);
                int i118 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43;
                byte[] bArr29 = $$a;
                Object[] objArr78 = new Object[1];
                b(bArr29[7], bArr29[54], (short) 62, objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(threadPriority2, iNormalizeMetaState, i118, -459846511, false, (String) objArr78[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null);
            long jLongValue9 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i119 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651;
                int i120 = 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr79 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(maximumFlingVelocity, i119, i120, -873460649, false, (String) objArr79[0], null);
            }
            if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null) << 52) >>> 52)) >> 12)) {
                int i121 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i121 % 128;
                int i122 = i121 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char gidForName3 = (char) (Process.getGidForName("") + 1);
                    int i123 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                    byte[] bArr30 = $$a;
                    byte b21 = (byte) (bArr30[33] - 1);
                    byte b22 = bArr30[54];
                    Object[] objArr80 = new Object[1];
                    b(b21, b22, (short) (b22 | 132), objArr80);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(gidForName3, i123, pressedStateDuration2, -1595579076, false, (String) objArr80[0], null);
                }
                Object[] objArr81 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
                objArr6 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i124 = ((int[]) objArr81[2])[0];
                int i125 = ((int[]) objArr81[0])[0];
                int iNextInt = new Random().nextInt(1491103328);
                int i126 = ((((-353373327) + (((~(301963385 | iNextInt)) | 33579522) * 104)) + ((~((~iNextInt) | (-30148713))) * (-104))) + ((iNextInt | 305394195) * 104)) - 158142571;
                int i127 = (i126 << 13) ^ i126;
                int i128 = i127 ^ (i127 >>> 17);
                ((int[]) objArr6[3])[0] = i128 ^ (i128 << 5);
                i4 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b((char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0) + 1611, ExpandableListView.getPackedPositionGroup(0L) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr82 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).newInstance(null), -158142571, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char cIndexOf5 = (char) TextUtils.indexOf("", "", 0, 0);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 651;
                    int i129 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43;
                    Object[] objArr83 = new Object[1];
                    b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf5, longPressTimeout, i129, 2075921419, false, (String) objArr83[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSize(0, 0), 695 - Color.red(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63406), 793 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).invoke(null, objArr82);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iIndexOf3 = 651 - TextUtils.indexOf("", "", 0);
                    int mode3 = View.MeasureSpec.getMode(0) + 44;
                    byte[] bArr31 = $$a;
                    byte b23 = (byte) (bArr31[33] - 1);
                    byte b24 = bArr31[54];
                    Object[] objArr84 = new Object[1];
                    b(b23, b24, (short) (b24 | 132), objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(keyRepeatDelay, iIndexOf3, mode3, -1595579076, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr6);
                try {
                    long jLongValue10 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 651;
                        int iBlue2 = Color.blue(0) + 44;
                        Object[] objArr85 = new Object[1];
                        b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr85);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(fadingEdgeLength, offsetBefore2, iBlue2, -873460649, false, (String) objArr85[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iArgb2 = 651 - Color.argb(0, 0, 0, 0);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 44;
                        byte[] bArr32 = $$a;
                        Object[] objArr86 = new Object[1];
                        b(bArr32[7], bArr32[54], (short) 62, objArr86);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(longPressTimeout2, iArgb2, iNormalizeMetaState2, -459846511, false, (String) objArr86[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf12);
                    i4 = 0;
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr6[2])[i4] != ((int[]) objArr6[i4])[i4]) {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr13 = (String[]) objArr6[1];
                if (strArr13 != null) {
                    for (int i130 = i4; i130 < strArr13.length; i130++) {
                        arrayList6.add(strArr13[i130]);
                    }
                }
                throw null;
            }
            Object[] objArr87 = new Object[4];
            int[] iArr7 = new int[1];
            objArr87[i4] = iArr7;
            int[] iArr8 = new int[1];
            objArr87[2] = iArr8;
            objArr87[3] = new int[1];
            int i131 = ((int[]) objArr6[3])[i4];
            int i132 = ((int[]) objArr6[2])[i4];
            int i133 = ((int[]) objArr6[i4])[i4];
            iArr8[i4] = i132;
            iArr7[i4] = i133;
            objArr87[1] = new String[i4];
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[i4]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i134 = i131 + 2135769442 + ((~(285011958 | layoutDirection)) * 623) + (((~layoutDirection) | 276825424) * (-623)) + (((~(layoutDirection | 282634096)) | (~(279203286 | layoutDirection)) | (-285011959)) * 623);
            int i135 = (i134 << 13) ^ i134;
            int i136 = i135 ^ (i135 >>> 17);
            ((int[]) objArr87[3])[0] = i136 ^ (i136 << 5);
            int i137 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i137 % 128;
            int i138 = i137 % 2;
            zzfb zzfbVarZza = zzfb.zza(this, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char mode4 = (char) View.MeasureSpec.getMode(0);
                int i139 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 15;
                byte[] bArr33 = $$a;
                Object[] objArr88 = new Object[1];
                b(bArr33[7], bArr33[54], (short) 203, objArr88);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(mode4, i139, packedPositionGroup3, 1357589585, false, (String) objArr88[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
            long jLongValue11 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iResolveSize = 1031 - View.resolveSize(0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16777231;
                byte[] bArr34 = $$a;
                Object[] objArr89 = new Object[1];
                b(bArr34[7], bArr34[54], (short) ($$b - 2), objArr89);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cKeyCodeFromString, iResolveSize, iRgb, 1344079056, false, (String) objArr89[0], null);
            }
            if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char mode5 = (char) View.MeasureSpec.getMode(0);
                    int mode6 = 1031 - View.MeasureSpec.getMode(0);
                    int size3 = View.MeasureSpec.getSize(0) + 15;
                    Object[] objArr90 = new Object[1];
                    b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr90);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(mode5, mode6, size3, 632103528, false, (String) objArr90[0], null);
                }
                Object[] objArr91 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
                objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i140 = ((int[]) objArr91[3])[0];
                int i141 = ((int[]) objArr91[1])[0];
                String[] strArr14 = (String[]) objArr91[0];
                int iNextInt2 = new Random().nextInt();
                int i142 = (((-32342713) + (((~iNextInt2) | 850892186) * 1444)) + (((~(iNextInt2 | (-525612313))) | ((~(769892482 | iNextInt2)) | 303306008)) * (-1444))) - 745455869;
                int i143 = (i142 << 13) ^ i142;
                int i144 = i143 ^ (i143 >>> 17);
                ((int[]) objArr7[2])[0] = i144 ^ (i144 << 5);
            } else {
                int iIntValue2 = ((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue();
                Object[] objArr92 = {165207859};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarSize() >> 8)), 1134 - TextUtils.getTrimmedLength(""), 18 - (ViewConfiguration.getTapTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr93 = {Integer.valueOf(iIntValue2), 0, -581620183, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).newInstance(objArr92), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char c7 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i145 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1032;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    byte[] bArr35 = $$a;
                    Object[] objArr94 = new Object[1];
                    b(bArr35[7], bArr35[54], (short) 203, objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(c7, i145, jumpTapTimeout, 1298546779, false, (String) objArr94[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 45993), 1117 - ExpandableListView.getPackedPositionType(0L), Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
                }
                objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).invoke(null, objArr93);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char gidForName4 = (char) (Process.getGidForName("") + 1);
                    int iMyTid2 = 1031 - (Process.myTid() >> 22);
                    int iMakeMeasureSpec2 = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr95 = new Object[1];
                    b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(gidForName4, iMyTid2, iMakeMeasureSpec2, 632103528, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr7);
                try {
                    long jLongValue12 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int iIndexOf4 = 1031 - TextUtils.indexOf("", "", 0, 0);
                        int i146 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14;
                        byte[] bArr36 = $$a;
                        Object[] objArr96 = new Object[1];
                        b(bArr36[7], bArr36[54], (short) ($$b - 2), objArr96);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(capsMode, iIndexOf4, i146, 1344079056, false, (String) objArr96[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char cIndexOf6 = (char) TextUtils.indexOf("", "");
                        int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                        int mode7 = View.MeasureSpec.getMode(0) + 15;
                        byte[] bArr37 = $$a;
                        Object[] objArr97 = new Object[1];
                        b(bArr37[7], bArr37[54], (short) 203, objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cIndexOf6, edgeSlop4, mode7, 1357589585, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            int i147 = ((int[]) objArr7[1])[0];
            int i148 = ((int[]) objArr7[3])[0];
            if (i148 != i147) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr15 = (String[]) objArr7[0];
                if (strArr15 != null) {
                    for (String str17 : strArr15) {
                        arrayList7.add(str17);
                    }
                }
                throw new RuntimeException(String.valueOf(i148));
            }
            Object[] objArr98 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i149 = ((int[]) objArr7[2])[0];
            int i150 = ((int[]) objArr7[3])[0];
            int i151 = ((int[]) objArr7[1])[0];
            String[] strArr16 = (String[]) objArr7[0];
            int i152 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i153 = ~i152;
            int i154 = ~((-300068670) | i153);
            int i155 = ~(55788499 | i152);
            int i156 = i149 + 1517103762 + ((i154 | i155) * 1150) + (((~((-55788500) | i153)) | i155) * (-575)) + (((~(i152 | (-300068670))) | (~(i153 | 300068669))) * 575);
            int i157 = (i156 << 13) ^ i156;
            int i158 = i157 ^ (i157 >>> 17);
            ((int[]) objArr98[2])[0] = i158 ^ (i158 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                int iArgb3 = Color.argb(0, 0, 0, 0) + 1755;
                int mode8 = View.MeasureSpec.getMode(0) + 23;
                byte[] bArr38 = $$a;
                byte b25 = (byte) (bArr38[33] - 1);
                byte b26 = bArr38[54];
                Object[] objArr99 = new Object[1];
                b(b25, b26, (short) (b26 | 132), objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cNormalizeMetaState, iArgb3, mode8, 986134021, false, (String) objArr99[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char c8 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                    int iLastIndexOf3 = 1754 - TextUtils.lastIndexOf("", '0', 0);
                    int threadPriority3 = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr39 = $$a;
                    Object[] objArr100 = new Object[1];
                    b(bArr39[7], bArr39[54], (short) ($$b - 2), objArr100);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c8, iLastIndexOf3, threadPriority3, 1599039318, false, (String) objArr100[0], null);
                }
                Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
                objArrB$7879113 = new Object[]{new int[]{((int[]) objArr101[0])[0]}, new int[]{((int[]) objArr101[1])[0]}, (Object[]) objArr101[2], new int[1], (String[]) objArr101[4]};
                int iNextInt3 = new Random().nextInt(1182179944);
                int i159 = ~iNextInt3;
                int i160 = 711695537 + (((~((-219484410) | i159)) | 219418688 | (~(6881983 | i159))) * (-1136)) + (((~((-219484410) | iNextInt3)) | (~(6881983 | iNextInt3)) | (~((-6816263) | i159))) * (-568)) + (((~(iNextInt3 | (-219418689))) | (~(i159 | (-6881984))) | (~(219484409 | i159))) * 568) + 1402649769;
                int i161 = (i160 << 13) ^ i160;
                int i162 = i161 ^ (i161 >>> 17);
                ((int[]) objArrB$7879113[3])[0] = i162 ^ (i162 << 5);
            } else {
                int iIntValue3 = ((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue();
                Object[] objArr102 = {165207859};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b((char) (Color.alpha(0) + 42049), Color.rgb(0, 0, 0) + 16778942, 28 - MotionEvent.axisFromString(""), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).newInstance(objArr102), 1402649769, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char absoluteGravity3 = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                    int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 1756;
                    int iRed2 = 23 - Color.red(0);
                    byte[] bArr40 = $$a;
                    Object[] objArr103 = new Object[1];
                    b(bArr40[7], bArr40[54], (short) ($$b - 2), objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(absoluteGravity3, packedPositionChild3, iRed2, 1599039318, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArrB$7879113);
                try {
                    long jLongValue13 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char capsMode2 = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                        int i163 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iMyTid3 = 23 - (Process.myTid() >> 22);
                        byte[] bArr41 = $$a;
                        Object[] objArr104 = new Object[1];
                        b(bArr41[7], bArr41[54], (short) 62, objArr104);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(capsMode2, i163, iMyTid3, 1596667560, false, (String) objArr104[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                        int pressedStateDuration3 = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iMakeMeasureSpec3 = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr42 = $$a;
                        byte b27 = (byte) (bArr42[33] - 1);
                        byte b28 = bArr42[54];
                        Object[] objArr105 = new Object[1];
                        b(b27, b28, (short) (b28 | 132), objArr105);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cResolveOpacity, pressedStateDuration3, iMakeMeasureSpec3, 986134021, false, (String) objArr105[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            int i164 = ((int[]) objArrB$7879113[1])[0];
            int i165 = ((int[]) objArrB$7879113[0])[0];
            if (i165 != i164) {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr17 = (String[]) objArrB$7879113[4];
                if (strArr17 != null) {
                    int i166 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i166 % 128;
                    int i167 = i166 % 2;
                    for (String str18 : strArr17) {
                        arrayList8.add(str18);
                    }
                }
                throw new RuntimeException(String.valueOf(i165));
            }
            int i168 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr106 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1206222045;
            int i169 = i168 + (((1332474231 + (((~length) | 351539914) * 1444)) + (((~(length | (-606407278))) | ((~(819009703 | length)) | 69468744)) * (-1444))) - 408748166);
            int i170 = (i169 << 13) ^ i169;
            int i171 = i170 ^ (i170 >>> 17);
            ((int[]) objArr106[3])[0] = i171 ^ (i171 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cIndexOf7 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 53894);
                int iKeyCodeFromString2 = 1320 - KeyEvent.keyCodeFromString("");
                int i172 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36;
                Object[] objArr107 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cIndexOf7, iKeyCodeFromString2, i172, -1433084963, false, (String) objArr107[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char threadPriority4 = (char) (53893 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 1320;
                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 36;
                    byte[] bArr43 = $$a;
                    Object[] objArr108 = new Object[1];
                    b(bArr43[7], bArr43[54], (short) ($$b - 2), objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(threadPriority4, iKeyCodeFromString3, touchSlop3, -1920778747, false, (String) objArr108[0], null);
                }
                Object[] objArr109 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
                objArr8 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i173 = ((int[]) objArr109[0])[0];
                int i174 = ((int[]) objArr109[3])[0];
                String[] strArr18 = (String[]) objArr109[2];
                int i175 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
                int i176 = (((1410641520 + (((-697048781) | i175) * 376)) + (((~((~i175) | 1033575446)) | (-1033838303)) * (-376))) + (((~(i175 | (-1033575447))) | 337052378) * 376)) - 1350832583;
                int i177 = (i176 << 13) ^ i176;
                int i178 = i177 ^ (i177 >>> 17);
                ((int[]) objArr8[1])[0] = i178 ^ (i178 << 5);
                str5 = str;
            } else {
                Context baseContext5 = getBaseContext();
                if (baseContext5 == null) {
                    baseContext5 = (Context) Class.forName(str10).getMethod(str5, new Class[0]).invoke(null, null);
                }
                if (baseContext5 != null) {
                    str5 = str;
                    if ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) {
                        str5 = str;
                        baseContext5 = null;
                    } else {
                        str5 = str;
                        str5 = str;
                        baseContext5 = baseContext5.getApplicationContext();
                    }
                }
                str5 = str;
                str5 = str;
                int iIntValue4 = ((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue();
                Object[] objArr110 = {165207859};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 47978), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1299, (ViewConfiguration.getWindowTouchSlop() >> 8) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr111 = {baseContext5, "com.bpjstku", -1350832583, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).newInstance(objArr110), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char cCombineMeasuredStates = (char) (53893 - View.combineMeasuredStates(0, 0));
                    int i179 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1320;
                    int pressedStateDuration4 = 36 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr44 = $$a;
                    Object[] objArr112 = new Object[1];
                    b(bArr44[7], bArr44[54], (short) ($$b - 2), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cCombineMeasuredStates, i179, pressedStateDuration4, 819724799, false, (String) objArr112[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 57877), 1394 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 75 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Boolean.TYPE});
                }
                Object[] objArr113 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).invoke(null, objArr111);
                if (baseContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char cAlpha = (char) (53893 - Color.alpha(0));
                        int iMyTid4 = 1320 - (Process.myTid() >> 22);
                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 36;
                        byte[] bArr45 = $$a;
                        Object[] objArr114 = new Object[1];
                        b(bArr45[7], bArr45[54], (short) ($$b - 2), objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cAlpha, iMyTid4, scrollDefaultDelay3, -1920778747, false, (String) objArr114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr113);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                            char cIndexOf8 = (char) (53893 - TextUtils.indexOf("", "", 0));
                            int iIndexOf5 = TextUtils.indexOf("", "") + 1320;
                            int iResolveOpacity = 36 - Drawable.resolveOpacity(0, 0);
                            byte[] bArr46 = $$a;
                            byte b29 = (byte) (bArr46[33] - 1);
                            byte b30 = bArr46[54];
                            Object[] objArr115 = new Object[1];
                            b(b29, b30, (short) (b30 | 132), objArr115);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cIndexOf8, iIndexOf5, iResolveOpacity, -1273706634, false, (String) objArr115[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                            char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 53893);
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1320;
                            int offsetAfter3 = 36 - TextUtils.getOffsetAfter("", 0);
                            Object[] objArr116 = new Object[1];
                            b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(jumpTapTimeout2, offsetAfter2, offsetAfter3, -1433084963, false, (String) objArr116[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf18);
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr113 = objArr113;
                }
                objArr8 = objArr113;
            }
            int i180 = ((int[]) objArr8[3])[0];
            int i181 = ((int[]) objArr8[0])[0];
            if (i181 != i180) {
                throw new RuntimeException(String.valueOf(i181));
            }
            Object[] objArr117 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i182 = ((int[]) objArr8[1])[0];
            int i183 = ((int[]) objArr8[0])[0];
            int i184 = ((int[]) objArr8[3])[0];
            String[] strArr19 = (String[]) objArr8[2];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i185 = ~iIdentityHashCode4;
            int i186 = i182 + (-1835187991) + (((~(i185 | 624145645)) | (-763363056) | (~((-607264770) | iIdentityHashCode4))) * 717) + (((~(iIdentityHashCode4 | 624145645)) | (~(i185 | (-607264770))) | (-763363056)) * 717);
            int i187 = (i186 << 13) ^ i186;
            int i188 = i187 ^ (i187 >>> 17);
            ((int[]) objArr117[1])[0] = i188 ^ (i188 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char c9 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int offsetBefore3 = 876 - TextUtils.getOffsetBefore("", 0);
                int i189 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr118 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c9, offsetBefore3, i189, 252381699, false, (String) objArr118[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null);
            long jLongValue15 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char c10 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                byte[] bArr47 = $$a;
                Object[] objArr119 = new Object[1];
                b(bArr47[7], bArr47[54], (short) 62, objArr119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c10, minimumFlingVelocity, doubleTapTimeout4, 2009631821, false, (String) objArr119[0], null);
            }
            if (j6 != ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) << 52) >>> 52)) >> 12)) {
                Context baseContext6 = getBaseContext();
                if (baseContext6 == null) {
                    baseContext6 = (Context) Class.forName(str10).getMethod(str5, new Class[0]).invoke(null, null);
                }
                if (baseContext6 != null) {
                    baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
                }
                Object[] objArr120 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue()), 1573177120};
                byte[] bArr48 = $$d;
                Object[] objArr121 = new Object[1];
                c(bArr48[259], (short) 353, (byte) (bArr48[247] - 1), objArr121);
                Class<?> cls6 = Class.forName((String) objArr121[0]);
                short s3 = (short) 227;
                Object[] objArr122 = new Object[1];
                c(bArr48[8], s3, (byte) (s3 & 382), objArr122);
                objArr9 = (Object[]) cls6.getMethod((String) objArr122[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr120);
                if (baseContext6 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char c11 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 876;
                        int i190 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b31 = (byte) ($$b & 191);
                        byte[] bArr49 = $$a;
                        Object[] objArr123 = new Object[1];
                        b(b31, bArr49[7], bArr49[9], objArr123);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c11, iCombineMeasuredStates2, i190, 256017550, false, (String) objArr123[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, objArr9);
                    try {
                        long jLongValue16 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char cAlpha2 = (char) Color.alpha(0);
                            int minimumFlingVelocity2 = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iMyPid = 10 - (Process.myPid() >> 22);
                            byte[] bArr50 = $$a;
                            Object[] objArr124 = new Object[1];
                            b(bArr50[7], bArr50[54], (short) 62, objArr124);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cAlpha2, minimumFlingVelocity2, iMyPid, 2009631821, false, (String) objArr124[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        charSequence = r9;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                            char capsMode3 = (char) TextUtils.getCapsMode(charSequence, 0, 0);
                            int iIndexOf6 = TextUtils.indexOf(charSequence, '0') + 877;
                            int offsetAfter4 = TextUtils.getOffsetAfter(charSequence, 0) + 10;
                            Object[] objArr125 = new Object[1];
                            b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr125);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(capsMode3, iIndexOf6, offsetAfter4, 252381699, false, (String) objArr125[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf20);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                }
                i5 = ((int[]) objArr9[2])[0];
                i6 = ((int[]) objArr9[0])[0];
                if (i6 == i5) {
                    int i191 = ((int[]) objArr9[1])[0];
                    Object[] objArr126 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                    int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).codePointAt(9) - 923154060;
                    int i192 = ~iCodePointAt2;
                    int i193 = ~((-1065548611) | i192);
                    int i194 = ~(1025238381 | iCodePointAt2);
                    int i195 = i191 + (-1663234392) + ((i193 | i194) * 1150) + (((~((-1025238382) | i192)) | i194) * (-575)) + (((~(iCodePointAt2 | (-1065548611))) | (~(i192 | 1065548610))) * 575);
                    int i196 = (i195 << 13) ^ i195;
                    int i197 = i196 ^ (i196 >>> 17);
                    ((int[]) objArr126[1])[0] = i197 ^ (i197 << 5);
                } else {
                    int[] iArr9 = new int[i6];
                    int i198 = i6 - 1;
                    iArr9[i198] = 1;
                    Toast.makeText((Context) null, iArr9[((i6 * i198) % 2) - 1], 1).show();
                    int i199 = ((int[]) objArr9[1])[0];
                    Object[] objArr127 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                    int i200 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi) | 424515567);
                    int i201 = i199 + (((272925194 | i200) * (-374)) - 1825106974) + ((i200 | 151590373) * 374);
                    int i202 = (i201 << 13) ^ i201;
                    int i203 = i202 ^ (i202 >>> 17);
                    ((int[]) objArr127[1])[0] = i203 ^ (i203 << 5);
                }
                zzfbVarZza.zze(getIntent());
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c12 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                    byte[] bArr51 = $$a;
                    Object[] objArr128 = new Object[1];
                    b((byte) (bArr51[2] - 1), bArr51[51], bArr51[9], objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c12, minimumFlingVelocity3, keyRepeatTimeout2, -1199417970, false, (String) objArr128[0], null);
                }
                j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int deadChar = 876 - KeyEvent.getDeadChar(0, 0);
                    int i204 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b32 = (byte) ($$b & 191);
                    byte[] bArr52 = $$a;
                    Object[] objArr129 = new Object[1];
                    b(b32, bArr52[14], bArr52[7], objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay2, deadChar, i204, 254769921, false, (String) objArr129[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c13 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iIndexOf7 = 10 - TextUtils.indexOf(charSequence, charSequence, 0, 0);
                        byte[] bArr53 = $$a;
                        Object[] objArr130 = new Object[1];
                        b(bArr53[44], bArr53[51], bArr53[7], objArr130);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c13, maxKeyCode, iIndexOf7, 1324201839, false, (String) objArr130[0], null);
                    }
                    Object[] objArr131 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                    objArr10 = new Object[]{new int[]{((int[]) objArr131[0])[0]}, new int[1], new int[]{((int[]) objArr131[2])[0]}, (String[]) objArr131[3]};
                    int i205 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_4).substring(5, 12).length() + 1805632995);
                    int i206 = (((((~((-538539671) | i205)) | 537466390) * (-241)) + 1215283682) + (((~(i205 | (-1073281))) | (-1035695832)) * 241)) - 1750453341;
                    int i207 = (i206 << 13) ^ i206;
                    int i208 = i207 ^ (i207 >>> 17);
                    ((int[]) objArr10[1])[0] = i208 ^ (i208 << 5);
                } else {
                    Object[] objArr132 = {Integer.valueOf(((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue()), -1750453341};
                    byte[] bArr54 = $$d;
                    Object[] objArr133 = new Object[1];
                    c(bArr54[259], (short) TypedValues.CycleType.TYPE_VISIBILITY, bArr54[5], objArr133);
                    Class<?> cls7 = Class.forName((String) objArr133[0]);
                    byte b33 = bArr54[22];
                    Object[] objArr134 = new Object[1];
                    c(b33, (short) (b33 | 153), (byte) (bArr54[36] + 1), objArr134);
                    objArr10 = (Object[]) cls7.getMethod((String) objArr134[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        int iLastIndexOf4 = 875 - TextUtils.lastIndexOf(charSequence, '0', 0, 0);
                        int iResolveSize2 = 10 - View.resolveSize(0, 0);
                        byte[] bArr55 = $$a;
                        Object[] objArr135 = new Object[1];
                        b(bArr55[44], bArr55[51], bArr55[7], objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iLastIndexOf4, iResolveSize2, 1324201839, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr10);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                            int doubleTapTimeout5 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i209 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte b34 = (byte) ($$b & 191);
                            byte[] bArr56 = $$a;
                            Object[] objArr136 = new Object[1];
                            b(b34, bArr56[14], bArr56[7], objArr136);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize2, doubleTapTimeout5, i209, 254769921, false, (String) objArr136[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf9 = (char) (TextUtils.indexOf(charSequence, '0', 0) + 1);
                            int offsetBefore4 = 876 - TextUtils.getOffsetBefore(charSequence, 0);
                            int iLastIndexOf5 = TextUtils.lastIndexOf(charSequence, '0', 0, 0) + 11;
                            byte[] bArr57 = $$a;
                            Object[] objArr137 = new Object[1];
                            b((byte) (bArr57[2] - 1), bArr57[51], bArr57[9], objArr137);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf9, offsetBefore4, iLastIndexOf5, -1199417970, false, (String) objArr137[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf22);
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
                i7 = ((int[]) objArr10[2])[0];
                i8 = ((int[]) objArr10[0])[0];
                if (i8 == i7) {
                    int i210 = ((int[]) objArr10[1])[0];
                    Object[] objArr138 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                    int iIdentityHashCode5 = System.identityHashCode(this);
                    int i211 = ~iIdentityHashCode5;
                    int i212 = (~((-718604305) | i211)) | 675610640;
                    int i213 = ~(iIdentityHashCode5 | 721287739);
                    int i214 = i210 + (-403557504) + ((i212 | i213) * (-713)) + (i213 * 1426) + ((~(678294075 | i211)) * 713);
                    int i215 = (i214 << 13) ^ i214;
                    int i216 = i215 ^ (i215 >>> 17);
                    ((int[]) objArr138[1])[0] = i216 ^ (i216 << 5);
                } else {
                    arrayList = new ArrayList();
                    strArr = (String[]) objArr10[3];
                    if (strArr != null) {
                        for (String str19 : strArr) {
                            arrayList.add(str19);
                        }
                    }
                    int[] iArr10 = new int[i8];
                    int i217 = i8 - 1;
                    iArr10[i217] = 1;
                    Toast.makeText((Context) null, iArr10[((i8 * i217) % 2) - 1], 1).show();
                    int i218 = ((int[]) objArr10[1])[0];
                    Object[] objArr139 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                    int iIdentityHashCode6 = System.identityHashCode(this);
                    int i219 = ~((-141773414) | iIdentityHashCode6);
                    int i220 = ~iIdentityHashCode6;
                    int i221 = i218 + (-1072094379) + ((i219 | (~(796884735 | i220))) * 497) + (((~(iIdentityHashCode6 | 796884735)) | (~((-695421552) | i220)) | 553648138) * 497);
                    int i222 = (i221 << 13) ^ i221;
                    int i223 = i222 ^ (i222 >>> 17);
                    ((int[]) objArr139[1])[0] = i223 ^ (i223 << 5);
                }
                finish();
            }
            int i224 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i224 % 128;
            int i225 = i224 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                char threadPriority5 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int maxKeyCode2 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                int i226 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b35 = (byte) ($$b & 191);
                byte[] bArr58 = $$a;
                Object[] objArr140 = new Object[1];
                b(b35, bArr58[7], bArr58[9], objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(threadPriority5, maxKeyCode2, i226, 256017550, false, (String) objArr140[0], null);
            }
            Object[] objArr141 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr141[0])[0]}, new int[1], new int[]{((int[]) objArr141[2])[0]}, (String[]) objArr141[3]};
            int i227 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i228 = ~i227;
            int i229 = 2042213060 + (((~((-9418253) | i228)) | 8815104) * 184) + ((i227 | (-50331630)) * (-184)) + ((~((-49728482) | i228)) * 184) + 1573177120;
            int i230 = (i229 << 13) ^ i229;
            int i231 = i230 ^ (i230 >>> 17);
            ((int[]) objArr9[1])[0] = i231 ^ (i231 << 5);
            charSequence = "";
            i5 = ((int[]) objArr9[2])[0];
            i6 = ((int[]) objArr9[0])[0];
            if (i6 == i5) {
                int i1910 = ((int[]) objArr9[1])[0];
                Object[] objArr1210 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                int iCodePointAt3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).codePointAt(9) - 923154060;
                int i1911 = ~iCodePointAt3;
                int i1912 = ~((-1065548611) | i1911);
                int i1913 = ~(1025238381 | iCodePointAt3);
                int i1914 = i1910 + (-1663234392) + ((i1912 | i1913) * 1150) + (((~((-1025238382) | i1911)) | i1913) * (-575)) + (((~(iCodePointAt3 | (-1065548611))) | (~(i1911 | 1065548610))) * 575);
                int i1915 = (i1914 << 13) ^ i1914;
                int i1916 = i1915 ^ (i1915 >>> 17);
                ((int[]) objArr1210[1])[0] = i1916 ^ (i1916 << 5);
            } else {
                int[] iArr11 = new int[i6];
                int i1917 = i6 - 1;
                iArr11[i1917] = 1;
                Toast.makeText((Context) null, iArr11[((i6 * i1917) % 2) - 1], 1).show();
                int i1918 = ((int[]) objArr9[1])[0];
                Object[] objArr1211 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                int i2010 = ~((~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi) | 424515567);
                int i2011 = i1918 + (((272925194 | i2010) * (-374)) - 1825106974) + ((i2010 | 151590373) * 374);
                int i2012 = (i2011 << 13) ^ i2011;
                int i2013 = i2012 ^ (i2012 >>> 17);
                ((int[]) objArr1211[1])[0] = i2013 ^ (i2013 << 5);
            }
            zzfbVarZza.zze(getIntent());
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c14 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                byte[] bArr59 = $$a;
                Object[] objArr1212 = new Object[1];
                b((byte) (bArr59[2] - 1), bArr59[51], bArr59[9], objArr1212);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c14, minimumFlingVelocity4, keyRepeatTimeout3, -1199417970, false, (String) objArr1212[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int deadChar2 = 876 - KeyEvent.getDeadChar(0, 0);
                int i2014 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b36 = (byte) ($$b & 191);
                byte[] bArr510 = $$a;
                Object[] objArr1213 = new Object[1];
                b(b36, bArr510[14], bArr510[7], objArr1213);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay3, deadChar2, i2014, 254769921, false, (String) objArr1213[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c15 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maxKeyCode3 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iIndexOf8 = 10 - TextUtils.indexOf(charSequence, charSequence, 0, 0);
                    byte[] bArr511 = $$a;
                    Object[] objArr1310 = new Object[1];
                    b(bArr511[44], bArr511[51], bArr511[7], objArr1310);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c15, maxKeyCode3, iIndexOf8, 1324201839, false, (String) objArr1310[0], null);
                }
                Object[] objArr1311 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                objArr10 = new Object[]{new int[]{((int[]) objArr1311[0])[0]}, new int[1], new int[]{((int[]) objArr1311[2])[0]}, (String[]) objArr1311[3]};
                int i2015 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_4).substring(5, 12).length() + 1805632995);
                int i2016 = (((((~((-538539671) | i2015)) | 537466390) * (-241)) + 1215283682) + (((~(i2015 | (-1073281))) | (-1035695832)) * 241)) - 1750453341;
                int i2017 = (i2016 << 13) ^ i2016;
                int i2018 = i2017 ^ (i2017 >>> 17);
                ((int[]) objArr10[1])[0] = i2018 ^ (i2018 << 5);
            } else {
                Object[] objArr1312 = {Integer.valueOf(((Integer) Class.forName(str8).getMethod(str4, Object.class).invoke(null, this)).intValue()), -1750453341};
                byte[] bArr512 = $$d;
                Object[] objArr1313 = new Object[1];
                c(bArr512[259], (short) TypedValues.CycleType.TYPE_VISIBILITY, bArr512[5], objArr1313);
                Class<?> cls8 = Class.forName((String) objArr1313[0]);
                byte b37 = bArr512[22];
                Object[] objArr1314 = new Object[1];
                c(b37, (short) (b37 | 153), (byte) (bArr512[36] + 1), objArr1314);
                objArr10 = (Object[]) cls8.getMethod((String) objArr1314[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr1312);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char defaultSize3 = (char) View.getDefaultSize(0, 0);
                    int iLastIndexOf6 = 875 - TextUtils.lastIndexOf(charSequence, '0', 0, 0);
                    int iResolveSize3 = 10 - View.resolveSize(0, 0);
                    byte[] bArr513 = $$a;
                    Object[] objArr1315 = new Object[1];
                    b(bArr513[44], bArr513[51], bArr513[7], objArr1315);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize3, iLastIndexOf6, iResolveSize3, 1324201839, false, (String) objArr1315[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr10);
                long jLongValue18 = ((Long) Class.forName(str6).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf23 = Long.valueOf(jLongValue18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize4 = (char) View.getDefaultSize(0, 0);
                    int doubleTapTimeout6 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i2019 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b38 = (byte) ($$b & 191);
                    byte[] bArr514 = $$a;
                    Object[] objArr1316 = new Object[1];
                    b(b38, bArr514[14], bArr514[7], objArr1316);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize4, doubleTapTimeout6, i2019, 254769921, false, (String) objArr1316[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf23);
                Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf10 = (char) (TextUtils.indexOf(charSequence, '0', 0) + 1);
                    int offsetBefore5 = 876 - TextUtils.getOffsetBefore(charSequence, 0);
                    int iLastIndexOf7 = TextUtils.lastIndexOf(charSequence, '0', 0, 0) + 11;
                    byte[] bArr515 = $$a;
                    Object[] objArr1317 = new Object[1];
                    b((byte) (bArr515[2] - 1), bArr515[51], bArr515[9], objArr1317);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf10, offsetBefore5, iLastIndexOf7, -1199417970, false, (String) objArr1317[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf24);
            }
            i7 = ((int[]) objArr10[2])[0];
            i8 = ((int[]) objArr10[0])[0];
            if (i8 == i7) {
                int i2110 = ((int[]) objArr10[1])[0];
                Object[] objArr1318 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i2111 = ~iIdentityHashCode7;
                int i2112 = (~((-718604305) | i2111)) | 675610640;
                int i2113 = ~(iIdentityHashCode7 | 721287739);
                int i2114 = i2110 + (-403557504) + ((i2112 | i2113) * (-713)) + (i2113 * 1426) + ((~(678294075 | i2111)) * 713);
                int i2115 = (i2114 << 13) ^ i2114;
                int i2116 = i2115 ^ (i2115 >>> 17);
                ((int[]) objArr1318[1])[0] = i2116 ^ (i2116 << 5);
            } else {
                arrayList = new ArrayList();
                strArr = (String[]) objArr10[3];
                if (strArr != null) {
                    while (i9 < strArr.length) {
                        arrayList.add(str19);
                    }
                }
                int[] iArr12 = new int[i8];
                int i2117 = i8 - 1;
                iArr12[i2117] = 1;
                Toast.makeText((Context) null, iArr12[((i8 * i2117) % 2) - 1], 1).show();
                int i2118 = ((int[]) objArr10[1])[0];
                Object[] objArr1319 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i2119 = ~((-141773414) | iIdentityHashCode8);
                int i2210 = ~iIdentityHashCode8;
                int i2211 = i2118 + (-1072094379) + ((i2119 | (~(796884735 | i2210))) * 497) + (((~(iIdentityHashCode8 | 796884735)) | (~((-695421552) | i2210)) | 553648138) * 497);
                int i2212 = (i2211 << 13) ^ i2211;
                int i2213 = i2212 ^ (i2212 >>> 17);
                ((int[]) objArr1319[1])[0] = i2213 ^ (i2213 << 5);
            }
            finish();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // android.app.Activity
    protected void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 46400), 40 - TextUtils.indexOf("", "", 0, 0), 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 46400), 39 - TextUtils.lastIndexOf("", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - Process.getGidForName("")), View.MeasureSpec.makeMeasureSpec(0, 0) + 40, TextUtils.getOffsetAfter("", 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46399), 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                return;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46400 - TextUtils.indexOf("", "")), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - Color.blue(0)), 41 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 'C' - AndroidCharacter.getMirror('0'), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            int i3 = 55 / 0;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 29944);
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
            byte[] bArr = $$a;
            byte b = (byte) (bArr[33] - 1);
            byte b2 = bArr[54];
            Object[] objArr2 = new Object[1];
            b(b, b2, (short) (b2 | 132), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, keyRepeatDelay, maximumFlingVelocity, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 1756;
                int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                b(bArr2[7], bArr2[54], (short) ($$b - 2), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, packedPositionChild2, longPressTimeout, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i3 = ~i2;
            int i4 = 853151397 + (((~(589920831 | i3)) | (-802523258) | (~((-589920832) | i2))) * (-564)) + ((~(i2 | (-587270202))) * 1128) + (((~((-802523258) | i3)) | 2650630) * 564) + 569871833;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            a(new int[]{-657196155, -1795519982, 1182392900, 913186435, -770750125, 71096835, 2090691034, -1602302801, 1699617152, 2066980556}, 16 - View.resolveSizeAndState(0, 0, 0), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(new int[]{-874496026, 694909755, 399288329, 50039803, 925913655, -924376188, 2040246391, 820389950, 711669672, 1342797422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_no_shopee_message).substring(3, 4).length() + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1482328662};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 42050), 1725 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 569871833);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                    int mode = View.MeasureSpec.getMode(0) + 23;
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    b(bArr3[7], bArr3[54], (short) ($$b - 2), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iIndexOf, mode, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    a(new int[]{1510398363, -1589644110, -1693146222, -1446315409, 1489713388, 1836351040, -651359955, -2083921789, 360959764, 116884096, -875255645, -1769916589, 1587768982, -1861835626}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 87, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    a(new int[]{1104733604, -1046733499, -825929892, -1386721466, 1041922899, 1347853857, -1559969902, 586873206, -1186415037, -1373952555}, TextUtils.getCapsMode("", 0, 0) + 15, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        b(bArr4[7], bArr4[54], (short) 62, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, iLastIndexOf, maximumFlingVelocity2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte[] bArr5 = $$a;
                        byte b3 = (byte) (bArr5[33] - 1);
                        byte b4 = bArr5[54];
                        Object[] objArr12 = new Object[1];
                        b(b3, b4, (short) (b4 | 132), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, absoluteGravity, iLastIndexOf2, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_1).substring(4, 5).length() - 515930998;
        int i12 = i11 + (((~(411788007 | length)) | (-1035736007)) * 262) + 1448813453 + (((~((~length) | 411788007)) | (-1035736007)) * 262);
        int i13 = (i12 << 13) ^ i12;
        int i14 = i13 ^ (i13 >>> 17);
        ((int[]) objArr13[3])[0] = i14 ^ (i14 << 5);
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        int i16 = i15 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
        int i17 = i15 % 2;
        int i18 = i16 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
        int i19 = i18 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
            int iMyTid = 15 - (Process.myTid() >> 22);
            byte[] bArr6 = $$a;
            Object[] objArr14 = new Object[1];
            b(bArr6[7], bArr6[54], (short) 203, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iCombineMeasuredStates, iMyTid, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        a(new int[]{1510398363, -1589644110, -1693146222, -1446315409, 1489713388, 1836351040, -651359955, -2083921789, 360959764, 116884096, -875255645, -1769916589, 1587768982, -1861835626}, 22 - View.combineMeasuredStates(0, 0), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        a(new int[]{1104733604, -1046733499, -825929892, -1386721466, 1041922899, 1347853857, -1559969902, 586873206, -1186415037, -1373952555}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int offsetAfter = 1031 - TextUtils.getOffsetAfter("", 0);
            int size = View.MeasureSpec.getSize(0) + 15;
            byte[] bArr7 = $$a;
            Object[] objArr17 = new Object[1];
            b(bArr7[7], bArr7[54], (short) ($$b - 2), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, offsetAfter, size, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int iIndexOf2 = 15 - TextUtils.indexOf("", "", 0, 0);
                Object[] objArr18 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity3, iResolveSizeAndState, iIndexOf2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr19[3])[0];
            int i21 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i23 = ~i22;
            int i24 = (((((~(308741758 | i23)) | (~(i22 | 553021928))) * 959) + 2041936129) + (((~(i22 | 308741758)) | (~(i23 | 553021928))) * 959)) - 945245523;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[2])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            a(new int[]{-657196155, -1795519982, 1182392900, 913186435, -770750125, 71096835, 2090691034, -1602302801, 1699617152, 2066980556}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(new int[]{-874496026, 694909755, 399288329, 50039803, 925913655, -924376188, 2040246391, 820389950, 711669672, 1342797422}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1482328662};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - TextUtils.getOffsetAfter("", 0)), 1134 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - Color.blue(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -945245523, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int absoluteGravity2 = 1031 - Gravity.getAbsoluteGravity(0, 0);
                int iMyTid2 = 15 - (Process.myTid() >> 22);
                byte[] bArr8 = $$a;
                Object[] objArr24 = new Object[1];
                b(bArr8[7], bArr8[54], (short) 203, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, absoluteGravity2, iMyTid2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTouchSlop() >> 8) + 45993), Drawable.resolveOpacity(0, 0) + 1117, 17 - (ViewConfiguration.getScrollBarSize() >> 8)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                int i27 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                Object[] objArr25 = new Object[1];
                b((byte) ($$b & 191), (byte) ($$a[51] - 1), (short) 62, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, iMakeMeasureSpec, i27, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                a(new int[]{1510398363, -1589644110, -1693146222, -1446315409, 1489713388, 1836351040, -651359955, -2083921789, 360959764, 116884096, -875255645, -1769916589, 1587768982, -1861835626}, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(new int[]{1104733604, -1046733499, -825929892, -1386721466, 1041922899, 1347853857, -1559969902, 586873206, -1186415037, -1373952555}, Gravity.getAbsoluteGravity(0, 0) + 15, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
                    byte[] bArr9 = $$a;
                    Object[] objArr28 = new Object[1];
                    b(bArr9[7], bArr9[54], (short) ($$b - 2), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionGroup, iAxisFromString, windowTouchSlop, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    byte[] bArr10 = $$a;
                    Object[] objArr29 = new Object[1];
                    b(bArr10[7], bArr10[54], (short) 203, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, iIndexOf3, scrollBarSize, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                int i29 = i28 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
            int i31 = i30 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i32 = ((int[]) objArr[2])[0];
            int i33 = ((int[]) objArr[3])[0];
            int i34 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i35 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 393492079;
            int i36 = i32 + 426874760 + (((~((~i35) | (-780206646))) | (-535926476)) * (-235)) + (((~((-780206646) | i35)) | (-535926476)) * (-470)) + (((~(i35 | (-243335682))) | (-1072797440)) * 235);
            int i37 = i36 ^ (i36 << 13);
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr30[2])[0] = i38 ^ (i38 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i39 % 128;
            int i40 = i39 % 2 != 0 ? 0 : 1;
            while (i40 < strArr4.length) {
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                if (i41 % 2 == 0) {
                    arrayList2.add(strArr4[i40]);
                    i40 += 13;
                } else {
                    arrayList2.add(strArr4[i40]);
                    i40++;
                }
            }
        }
        throw null;
    }

    @Override // android.app.Activity
    protected void onStart() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = com.google.firebase.analytics.GoogleAnalyticsServerPreviewActivity.$$c
            int r7 = r7 * 56
            int r7 = r7 + 66
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.GoogleAnalyticsServerPreviewActivity.$$g(byte, byte, byte):java.lang.String");
    }
}
