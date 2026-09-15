package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.appsflyer.internal.AFa1tSDK;
import com.google.android.gms.internal.auth.zzgx;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private static final byte[] $$c = {57, -56, 23, -36};
    private static final int $$f = 211;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.appsflyer.MultipleInstallBroadcastReceiver.$$a
            int r8 = r8 + 4
            int r6 = 103 - r6
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L29:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.MultipleInstallBroadcastReceiver.c(byte, int, short, java.lang.Object[]):void");
    }

    private static void d(short s, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$d;
        int i = 115 - b2;
        int i2 = 497 - s;
        byte[] bArr2 = new byte[74 - b3];
        int i3 = 73 - b3;
        int i4 = -1;
        if (bArr == null) {
            i = (i2 + (-i)) - 2;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i5 = i;
            i = (i5 + (-bArr[i2])) - 2;
            i2++;
        }
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8328), (Process.myTid() >> 22) + 1235, 35 - Color.blue(0), -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2764 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43325), 254 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (AndroidCharacter.getMirror('0') + 65152), View.MeasureSpec.getSize(0) + 2891, 17 - ((Process.getThreadPriority(0) + 20) >> 6), 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 101;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x1766  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        Object[] objArr3;
        Object obj;
        Context applicationContext;
        Object[] objArr4;
        Object[] objArr5;
        Context applicationContext2;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        int i;
        Context applicationContext3;
        Object[] objArr9;
        Object[] objArr10;
        int i2;
        int i3;
        Object[] objArr11;
        Object[] objArr12;
        Object[] objArr13;
        int i4;
        Object[] objArr14;
        int i5;
        Object[] objArr15;
        Context context2;
        Object[] objArr16;
        String stringExtra;
        int i6 = 2 % 2;
        Object[] objArr17 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{60507, 32961, 27652, 48983}, (char) Color.green(0), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{49393, 63196, 40936, 20416, 21826, 32497, 4053, 63193, 32822, 40785, 49955, 52733, 31057, 4901, 31348, 9198, 48205, 50191, 65049, 37979, 46035, 28331}, objArr17);
        String str = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{17736, 60298, 37728, 43361}, (char) (24979 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1626049093 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{58665, 50678, 40945, 46971, 61141, 29167, 4273, 8085, 42908, 57876, 28789, 58051, 54586, 13730, 24713}, objArr18);
        String str2 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{43387, 37447, 49356, 4885}, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5569), ViewConfiguration.getTapTimeout() >> 16, new char[]{3440, 19559, 6781, 30754, 21209, 44100, 34876, 49355, 48515, 30035, 55133, 29962, 56210, 21330, 41439, 49623}, objArr19);
        String str3 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{11722, 10825, 61400, 47698}, (char) (ExpandableListView.getPackedPositionChild(0L) + 21232), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{59135, 41747, 54219, 17671, 31475, 55340, 6594, 39308, 62951, 43445, 33852, 61296, 50735, 3846, 51061, 33749}, objArr20);
        String str4 = (String) objArr20[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 37568);
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 626;
            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[51] - 1);
            byte b3 = bArr[7];
            Object[] objArr21 = new Object[1];
            c(b2, b3, b3, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, packedPositionChild2, packedPositionGroup, -477065106, false, (String) objArr21[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (37567 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int fadingEdgeLength = 625 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int tapTimeout = 14 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr2 = $$a;
            Object[] objArr22 = new Object[1];
            c(bArr2[54], (byte) 52, bArr2[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, fadingEdgeLength, tapTimeout, -976899241, false, (String) objArr22[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) (37567 - TextUtils.getTrimmedLength(""));
                int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                byte b4 = (byte) 52;
                Object[] objArr23 = new Object[1];
                c($$a[54], b4, b4, objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, i7, iIndexOf, -973632554, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr24[2])[0];
            int i9 = ((int[]) objArr24[0])[0];
            String[] strArr = (String[]) objArr24[3];
            int[] iArr = {i8};
            int[] iArr2 = {i9};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i10 = (~((-1740400420) | iUptimeMillis)) | 78913825;
            int i11 = ~((~iUptimeMillis) | 1744824295);
            int i12 = 258530206 + ((i10 | i11) * (-470)) + (((~(iUptimeMillis | (-1661486595))) | i11) * 470) + 414178203;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
            c = 0;
        } else {
            Context applicationContext4 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            int iIntValue = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{34766, 161, 42445, 34266}, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), View.combineMeasuredStates(0, 0), new char[]{45323, 44925, 47174, 21531, 10021, 64201, 43028, 22362, 38485, 47546, 12519, 59780, 39746, 42928, 655, 50025, 17754, 1141, 37642, 53088, 8545, 50683, 8722, 59389, 64589, 6724, 58791, 6789, 1752, 22862, 18516, 29779, 3765, 13564, 23679, 13503, 21161, 20596, 45692, 32030, 10391, 51345, 10224, 21719, 56548, 8261, 23772, 22953, 836, 61133, 4349, 10934, 27581, 33866, 62210, 4519, 4180, 19364, 40822, 58212, 50473, 63617, 18332, 19636}, objArr25);
            String str5 = (String) objArr25[0];
            Object[] objArr26 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{35201, 61954, 4336, 41297}, (char) ExpandableListView.getPackedPositionType(0L), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{58809, 34879, 62199, 55415, 56833, 16568, 7062, 51905, 48522, 26732, 18151, 51381, 25021, 64910, 16244, 30556, 18624, 47466, 1772, 28343, 801, 36991, 54210, 30391, 22440, 27185, 41909, 20277, 28220, 12849, 37469, 18656, 35079, 61622, 28609, 63202, 50003, 33006, 910, 3973, 26821, 32639, 42855, 37824, 11973, 3171, 58463, 15758, 4836, 33320, 36742, 40017, 31610, 47812, 50557, 36923, 35105, 48544, 7520, 62300, 29649, 17494, 26637, 63812}, objArr26);
            try {
                Object[] objArr27 = {applicationContext4, new String[]{str5, (String) objArr26[0]}, Integer.valueOf(iIntValue), 17, 414178203};
                byte[] bArr3 = $$d;
                Object[] objArr28 = new Object[1];
                d((short) 493, bArr3[61], bArr3[167], objArr28);
                Class<?> cls = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                d((short) 437, bArr3[48], bArr3[340], objArr29);
                Object[] objArr30 = (Object[]) cls.getMethod((String) objArr29[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr27);
                int i15 = ((int[]) objArr30[0])[0];
                int i16 = ((int[]) objArr30[2])[0];
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 37568);
                        int i17 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                        int windowTouchSlop = 14 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b5 = (byte) 52;
                        Object[] objArr31 = new Object[1];
                        c($$a[54], b5, b5, objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i17, windowTouchSlop, -973632554, false, (String) objArr31[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr30);
                    try {
                        long jLongValue2 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (37567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 625;
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 14;
                            byte[] bArr4 = $$a;
                            Object[] objArr32 = new Object[1];
                            c(bArr4[54], (byte) 52, bArr4[7], objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iIndexOf2, iResolveOpacity, -976899241, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength2 = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 625;
                            int iRgb = Color.rgb(0, 0, 0) + 16777230;
                            byte[] bArr5 = $$a;
                            byte b6 = (byte) (bArr5[51] - 1);
                            byte b7 = bArr5[7];
                            Object[] objArr33 = new Object[1];
                            c(b6, b7, b7, objArr33);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength2, deadChar, iRgb, -477065106, false, (String) objArr33[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr30 = objArr30;
                }
                objArr = objArr30;
                c = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[c])[c];
        int i19 = ((int[]) objArr[2])[c];
        if (i19 == i18) {
            objArr2 = new Object[4];
            int[] iArr3 = new int[1];
            objArr2[c] = iArr3;
            objArr2[1] = new int[1];
            int[] iArr4 = new int[1];
            objArr2[2] = iArr4;
            int i20 = ((int[]) objArr[1])[c];
            int i21 = ((int[]) objArr[2])[c];
            int i22 = ((int[]) objArr[c])[c];
            String[] strArr2 = (String[]) objArr[3];
            iArr4[c] = i21;
            iArr3[c] = i22;
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = ~((-979015608) | (~iIdentityHashCode));
            int i24 = i20 + ((90176 | i23 | (~(979015607 | iIdentityHashCode))) * (-338)) + 1854217608 + (((~(iIdentityHashCode | 979105783)) | i23) * 338);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
            objArr2[3] = strArr2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str6 : strArr3) {
                    arrayList.add(str6);
                }
            }
            int[] iArr5 = new int[i19];
            int i27 = i19 - 1;
            iArr5[i27] = 1;
            Toast.makeText((Context) null, iArr5[((i19 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            String[] strArr4 = (String[]) objArr[3];
            int iMyPid = Process.myPid();
            int i31 = i28 + (-2135153266) + ((~((~iMyPid) | (-2146369))) * 433) + (((~((-1720663224) | iMyPid)) | (-103074898)) * (-433)) + (((~(iMyPid | (-103074898))) | (-1722809592)) * 433);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr2[1])[0] = i33 ^ (i33 << 5);
            objArr2 = new Object[]{new int[]{i30}, new int[1], new int[]{i29}, strArr4};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatDelay = (char) (43042 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
            byte[] bArr6 = $$a;
            Object[] objArr34 = new Object[1];
            c(bArr6[54], (byte) 52, bArr6[7], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatDelay, maxKeyCode, iNormalizeMetaState, -1272852037, false, (String) objArr34[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 43042);
                int longPressTimeout2 = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr35 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, longPressTimeout2, modifierMetaStateMask, 154975793, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            int i34 = ((int[]) objArr36[2])[0];
            int i35 = ((int[]) objArr36[1])[0];
            String[] strArr5 = (String[]) objArr36[3];
            int[] iArr6 = {i35};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i36 = (-1063725006) + (((~((-145246346) | (~iIdentityHashCode2))) | (-1559785114)) * (-591)) + ((iIdentityHashCode2 | (-145246346)) * 591) + 724526322;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr3[0])[0] = i38 ^ (i38 << 5);
            objArr3 = new Object[]{new int[1], iArr6, new int[]{i34}, strArr5};
            objArr2 = objArr2;
        } else {
            Object[] objArr37 = {null, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 724526322};
            byte[] bArr7 = $$d;
            Object[] objArr38 = new Object[1];
            d((short) 385, bArr7[93], bArr7[7], objArr38);
            Class<?> cls2 = Class.forName((String) objArr38[0]);
            Object[] objArr39 = new Object[1];
            d((short) 323, bArr7[48], bArr7[450], objArr39);
            Object[] objArr40 = (Object[]) cls2.getMethod((String) objArr39[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3112;
                int mode = 22 - View.MeasureSpec.getMode(0);
                Object[] objArr41 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb, iIndexOf3, mode, 154975793, false, (String) objArr41[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr40);
            try {
                long jLongValue3 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cResolveSizeAndState = (char) (43042 - View.resolveSizeAndState(0, 0, 0));
                    int iArgb = 3111 - Color.argb(0, 0, 0, 0);
                    int i39 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b8 = (byte) 52;
                    Object[] objArr42 = new Object[1];
                    c($$a[54], b8, b8, objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSizeAndState, iArgb, i39, -1269618118, false, (String) objArr42[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char cCombineMeasuredStates2 = (char) (43042 - View.combineMeasuredStates(0, 0));
                    int iIndexOf4 = TextUtils.indexOf("", "") + 3111;
                    int i40 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                    byte[] bArr8 = $$a;
                    Object[] objArr43 = new Object[1];
                    c(bArr8[54], (byte) 52, bArr8[7], objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cCombineMeasuredStates2, iIndexOf4, i40, -1272852037, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                objArr3 = objArr40;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i41 = ((int[]) objArr3[1])[0];
        int i42 = ((int[]) objArr3[2])[0];
        if (i42 != i41) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr6 = (String[]) objArr3[3];
            if (strArr6 != null) {
                for (String str7 : strArr6) {
                    arrayList2.add(str7);
                }
            }
            throw new RuntimeException(String.valueOf(i42));
        }
        int i43 = ((int[]) objArr3[0])[0];
        int i44 = ((int[]) objArr3[2])[0];
        int i45 = ((int[]) objArr3[1])[0];
        String[] strArr7 = (String[]) objArr3[3];
        int[] iArr7 = {i45};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i46 = i43 + 176979026 + (((~(615591832 | iIdentityHashCode3)) | (-1694478235) | (~(1089439626 | iIdentityHashCode3))) * (-744)) + (((~iIdentityHashCode3) | 10553224) * 744) + ((iIdentityHashCode3 | 1694478234) * 744);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr[0])[0] = i48 ^ (i48 << 5);
        Object[] objArr44 = {new int[1], iArr7, new int[]{i44}, strArr7};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int i49 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
            int threadPriority = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b9 = (byte) 52;
            Object[] objArr45 = new Object[1];
            c($$a[54], b9, b9, objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(gidForName, i49, threadPriority, -887667012, false, (String) objArr45[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                int i50 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                int i51 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr46 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, i50, i51, -654680577, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr4 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i52 = ((int[]) objArr47[0])[0];
            int i53 = ((int[]) objArr47[3])[0];
            String[] strArr8 = (String[]) objArr47[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i54 = ~(260830263 | iIdentityHashCode4);
            int i55 = ~iIdentityHashCode4;
            int i56 = 1842812353 + ((i54 | (~(i55 | (-1061)))) * (-406)) + ((~(1069544639 | i55)) * (-406)) + (((~(iIdentityHashCode4 | (-1069543580))) | (~((-260830264) | i55))) * 406) + 960148772;
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            ((int[]) objArr4[2])[0] = i58 ^ (i58 << 5);
            objArr44 = objArr44;
        } else {
            if (context != null) {
                int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i59 % 128;
                if (i59 % 2 == 0) {
                    boolean z = context instanceof ContextWrapper;
                    throw null;
                }
                if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
                    obj = null;
                    applicationContext = null;
                } else {
                    applicationContext = context.getApplicationContext();
                    obj = null;
                }
            } else {
                obj = null;
                applicationContext = context;
            }
            Object[] objArr48 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(obj, this)).intValue()), 0, 960148772};
            byte[] bArr9 = $$d;
            Object[] objArr49 = new Object[1];
            d((short) 286, bArr9[195], (byte) (-bArr9[49]), objArr49);
            Class<?> cls3 = Class.forName((String) objArr49[0]);
            Object[] objArr50 = new Object[1];
            d((short) 233, bArr9[48], bArr9[340], objArr50);
            Object[] objArr51 = (Object[]) cls3.getMethod((String) objArr50[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iMyPid2 = 2267 - (Process.myPid() >> 22);
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 33;
                    Object[] objArr52 = new Object[1];
                    c($$a[54], (byte) 37, (short) ($$b & 380), objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iMyPid2, threadPriority2, -654680577, false, (String) objArr52[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr51);
                try {
                    long jLongValue4 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i60 = 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i61 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr10 = $$a;
                        Object[] objArr53 = new Object[1];
                        c(bArr10[54], (byte) 52, bArr10[7], objArr53);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c4, i60, i61, -874156483, false, (String) objArr53[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iResolveOpacity2 = 2267 - Drawable.resolveOpacity(0, 0);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 33;
                        byte b10 = (byte) 52;
                        Object[] objArr54 = new Object[1];
                        c($$a[54], b10, b10, objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cResolveOpacity, iResolveOpacity2, edgeSlop, -887667012, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr51 = objArr51;
                objArr44 = objArr44;
            }
            objArr4 = objArr51;
        }
        int i62 = ((int[]) objArr4[3])[0];
        int i63 = ((int[]) objArr4[0])[0];
        if (i63 == i62) {
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i64 = ((int[]) objArr4[2])[0];
            int i65 = ((int[]) objArr4[0])[0];
            int i66 = ((int[]) objArr4[3])[0];
            String[] strArr9 = (String[]) objArr4[1];
            int iMyUid = Process.myUid();
            int i67 = ~iMyUid;
            int i68 = i64 + 631343089 + (((~(225919192 | i67)) | (-1040154109)) * 98) + (((~(i67 | (-1034632509))) | 225919192 | (~(1034632508 | iMyUid))) * (-49)) + (((~(iMyUid | 225919192)) | 5521600) * 49);
            int i69 = (i68 << 13) ^ i68;
            int i70 = i69 ^ (i69 >>> 17);
            ((int[]) objArr5[2])[0] = i70 ^ (i70 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr10 = (String[]) objArr4[1];
            if (strArr10 != null) {
                for (String str8 : strArr10) {
                    arrayList3.add(str8);
                }
            }
            Toast.makeText((Context) null, i63 / (((i63 - 1) * i63) % 2), 0).show();
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i71 = ((int[]) objArr4[2])[0];
            int i72 = ((int[]) objArr4[0])[0];
            int i73 = ((int[]) objArr4[3])[0];
            String[] strArr11 = (String[]) objArr4[1];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i74 = ~iIdentityHashCode5;
            int i75 = ~(505058895 | i74);
            int i76 = i71 + (-857352117) + ((90128 | i75) * (-712)) + (((~(iIdentityHashCode5 | 505149023)) | (~(i74 | (-90129)))) * (-712)) + (((-303654421) | i75) * 712);
            int i77 = (i76 << 13) ^ i76;
            int i78 = i77 ^ (i77 >>> 17);
            ((int[]) objArr5[2])[0] = i78 ^ (i78 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char cMyPid = (char) (53893 - (Process.myPid() >> 22));
            int iLastIndexOf = 1319 - TextUtils.lastIndexOf("", '0', 0);
            int i79 = 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr11 = $$a;
            byte b11 = (byte) (bArr11[51] - 1);
            byte b12 = bArr11[7];
            Object[] objArr55 = new Object[1];
            c(b11, b12, b12, objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cMyPid, iLastIndexOf, i79, -1433084963, false, (String) objArr55[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char offsetAfter = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                int iLastIndexOf2 = 1319 - TextUtils.lastIndexOf("", '0', 0, 0);
                int mirror = AndroidCharacter.getMirror('0') - '\f';
                byte b13 = (byte) 52;
                Object[] objArr56 = new Object[1];
                c($$a[54], b13, b13, objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(offsetAfter, iLastIndexOf2, mirror, -1920778747, false, (String) objArr56[0], null);
            }
            Object[] objArr57 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
            objArr6 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i80 = ((int[]) objArr57[0])[0];
            int i81 = ((int[]) objArr57[3])[0];
            String[] strArr12 = (String[]) objArr57[2];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i82 = ~elapsedCpuTime;
            int i83 = ((((-586038848) + (((~(800169710 | i82)) | 570458114) * 220)) + (((~(i82 | 572625410)) | 798002414) * (-440))) + ((elapsedCpuTime | 800169710) * 220)) - 1987997142;
            int i84 = (i83 << 13) ^ i83;
            int i85 = i84 ^ (i84 >>> 17);
            ((int[]) objArr6[1])[0] = i85 ^ (i85 << 5);
            objArr5 = objArr5;
        } else {
            if (context != null) {
                int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i86 % 128;
                int i87 = i86 % 2;
                applicationContext2 = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext2 = context;
            }
            int iIntValue2 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr58 = {1884624733};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b((char) (47977 - View.MeasureSpec.getMode(0)), 1300 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 21, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr59 = {applicationContext2, "com.bpjstku", -1987997142, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).newInstance(objArr58), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char longPressTimeout3 = (char) (53893 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1320;
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 36;
                    byte b14 = (byte) 52;
                    Object[] objArr60 = new Object[1];
                    c($$a[54], b14, b14, objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(longPressTimeout3, doubleTapTimeout, threadPriority3, 819724799, false, (String) objArr60[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - Color.argb(0, 0, 0, 0)), 1394 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 75), Boolean.TYPE});
                }
                Object[] objArr61 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr59);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char scrollBarSize = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int iKeyCodeFromString = 1320 - KeyEvent.keyCodeFromString("");
                        int iAxisFromString = MotionEvent.axisFromString("") + 37;
                        byte b15 = (byte) 52;
                        Object[] objArr62 = new Object[1];
                        c($$a[54], b15, b15, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(scrollBarSize, iKeyCodeFromString, iAxisFromString, -1920778747, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr61);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 53892);
                            int i88 = 1320 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iGreen = 36 - Color.green(0);
                            Object[] objArr63 = new Object[1];
                            c($$a[54], (byte) 37, (short) ($$b & 380), objArr63);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c5, i88, iGreen, -1273706634, false, (String) objArr63[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char gidForName2 = (char) (Process.getGidForName("") + 53894);
                            int iKeyCodeFromString2 = 1320 - KeyEvent.keyCodeFromString("");
                            int packedPositionChild3 = 35 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr12 = $$a;
                            byte b16 = (byte) (bArr12[51] - 1);
                            byte b17 = bArr12[7];
                            Object[] objArr64 = new Object[1];
                            c(b16, b17, b17, objArr64);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(gidForName2, iKeyCodeFromString2, packedPositionChild3, -1433084963, false, (String) objArr64[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr61 = objArr61;
                    objArr5 = objArr5;
                }
                objArr6 = objArr61;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr6[0])[0] != ((int[]) objArr6[3])[0]) {
            throw null;
        }
        Object[] objArr65 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i89 = ((int[]) objArr6[1])[0];
        int i90 = ((int[]) objArr6[0])[0];
        int i91 = ((int[]) objArr6[3])[0];
        String[] strArr13 = (String[]) objArr6[2];
        int iNextInt = new Random().nextInt();
        int i92 = ~iNextInt;
        int i93 = ~(952877691 | i92);
        int i94 = i89 + (-1683071424) + ((2366468 | i93) * (-712)) + (((~(iNextInt | 955244159)) | (~(i92 | (-2366469)))) * (-712)) + (((-417750134) | i93) * 712);
        int i95 = (i94 << 13) ^ i94;
        int i96 = i95 ^ (i95 >>> 17);
        ((int[]) objArr65[1])[0] = i96 ^ (i96 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char packedPositionChild4 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iIndexOf5 = 1031 - TextUtils.indexOf("", "");
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
            byte[] bArr13 = $$a;
            Object[] objArr66 = new Object[1];
            c(bArr13[54], (byte) 52, bArr13[7], objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(packedPositionChild4, iIndexOf5, jumpTapTimeout, 1357589585, false, (String) objArr66[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char c6 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
            int mode2 = View.MeasureSpec.getMode(0) + 1031;
            int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
            byte b18 = (byte) 52;
            Object[] objArr67 = new Object[1];
            c($$a[54], b18, b18, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c6, mode2, bitsPerPixel, 1344079056, false, (String) objArr67[0], null);
        }
        if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) << 52) >>> 52)) >> 12)) {
            int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i97 % 128;
            int i98 = i97 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cBlue = (char) Color.blue(0);
                int iLastIndexOf3 = 1030 - TextUtils.lastIndexOf("", '0');
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 15;
                byte[] bArr14 = $$a;
                byte b19 = (byte) (bArr14[51] - 1);
                byte b20 = bArr14[7];
                Object[] objArr68 = new Object[1];
                c(b19, b20, b20, objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cBlue, iLastIndexOf3, iKeyCodeFromString3, 632103528, false, (String) objArr68[0], null);
            }
            Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i99 = ((int[]) objArr69[3])[0];
            int i100 = ((int[]) objArr69[1])[0];
            String[] strArr14 = (String[]) objArr69[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i101 = ~iIdentityHashCode6;
            int i102 = ((((-430921747) + (((~(iIdentityHashCode6 | (-283443540))) | ((~((-252734637) | i101)) | 8454466)) * (-68))) + ((~((-274989074) | i101)) * (-68))) + (((~(283443539 | i101)) | (-527723710)) * 68)) - 547305377;
            int i103 = (i102 << 13) ^ i102;
            int i104 = i103 ^ (i103 >>> 17);
            ((int[]) objArr7[2])[0] = i104 ^ (i104 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr70 = {1884624733};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 46038), 1134 - View.MeasureSpec.getSize(0), 18 - ((Process.getThreadPriority(0) + 20) >> 6), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr71 = {Integer.valueOf(iIntValue3), 0, -547305377, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).newInstance(objArr70), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "");
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 1032;
                int packedPositionGroup2 = 15 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr15 = $$a;
                Object[] objArr72 = new Object[1];
                c(bArr15[54], (byte) 52, bArr15[7], objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf2, bitsPerPixel2, packedPositionGroup2, 1298546779, false, (String) objArr72[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (KeyEvent.getMaxKeyCode() >> 16)), 1117 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - TextUtils.indexOf("", "", 0)), Boolean.TYPE});
            }
            Object[] objArr73 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr71);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char bitsPerPixel3 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                int i105 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                byte[] bArr16 = $$a;
                byte b21 = (byte) (bArr16[51] - 1);
                byte b22 = bArr16[7];
                Object[] objArr74 = new Object[1];
                c(b21, b22, b22, objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(bitsPerPixel3, absoluteGravity, i105, 632103528, false, (String) objArr74[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr73);
            try {
                long jLongValue7 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char mode3 = (char) View.MeasureSpec.getMode(0);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1031;
                    int iAlpha = 15 - Color.alpha(0);
                    byte b23 = (byte) 52;
                    Object[] objArr75 = new Object[1];
                    c($$a[54], b23, b23, objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(mode3, absoluteGravity2, iAlpha, 1344079056, false, (String) objArr75[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char cGreen = (char) Color.green(0);
                    int gidForName3 = Process.getGidForName("") + 1032;
                    int i106 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr17 = $$a;
                    Object[] objArr76 = new Object[1];
                    c(bArr17[54], (byte) 52, bArr17[7], objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cGreen, gidForName3, i106, 1357589585, false, (String) objArr76[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                objArr7 = objArr73;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i107 = ((int[]) objArr7[1])[0];
        int i108 = ((int[]) objArr7[3])[0];
        if (i108 == i107) {
            objArr8 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i109 = ((int[]) objArr7[2])[0];
            int i110 = ((int[]) objArr7[3])[0];
            int i111 = ((int[]) objArr7[1])[0];
            String[] strArr15 = (String[]) objArr7[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i112 = ~iIdentityHashCode7;
            int i113 = i109 + 433629483 + (((~((-226544491) | i112)) | (~((-17735680) | iIdentityHashCode7))) * (-370)) + (((~(iIdentityHashCode7 | (-226544491))) | (~(i112 | (-17735680))) | (-227467264)) * (-370)) + 1736458240;
            int i114 = (i113 << 13) ^ i113;
            int i115 = i114 ^ (i114 >>> 17);
            i = 0;
            ((int[]) objArr8[2])[0] = i115 ^ (i115 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr16 = (String[]) objArr7[0];
            if (strArr16 != null) {
                for (String str9 : strArr16) {
                    arrayList4.add(str9);
                }
            }
            int[] iArr8 = new int[i108];
            int i116 = i108 - 1;
            iArr8[i116] = 1;
            Toast.makeText((Context) null, iArr8[((i108 * i116) % 2) - 1], 1).show();
            objArr8 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i117 = ((int[]) objArr7[2])[0];
            int i118 = ((int[]) objArr7[3])[0];
            int i119 = ((int[]) objArr7[1])[0];
            String[] strArr17 = (String[]) objArr7[0];
            int iMyTid = Process.myTid();
            int i120 = ~iMyTid;
            int i121 = i117 + 145236435 + (((~((-617310337) | i120)) | (-373030167)) * (-602)) + (((~(iMyTid | (-617310337))) | 549453952 | (~((-305173783) | i120))) * (-301)) + ((~(i120 | (-373030167))) * 301);
            int i122 = (i121 << 13) ^ i121;
            int i123 = i122 ^ (i122 >>> 17);
            i = 0;
            ((int[]) objArr8[2])[0] = i123 ^ (i123 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char deadChar2 = (char) KeyEvent.getDeadChar(i, i);
            int i124 = (CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1)) + 876;
            int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 10;
            Object[] objArr77 = new Object[1];
            c($$a[54], (byte) 37, (short) ($$b & 380), objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(deadChar2, i124, iKeyCodeFromString4, -1650998592, false, (String) objArr77[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b24 = (byte) 52;
            Object[] objArr78 = new Object[1];
            c($$a[54], b24, b24, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(tapTimeout2, maximumDrawingCacheSize, minimumFlingVelocity, 2012020043, false, (String) objArr78[0], null);
        }
        if (j3 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char c7 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iRgb2 = Color.rgb(0, 0, 0) + 16778092;
                int iGreen2 = Color.green(0) + 10;
                byte[] bArr18 = $$a;
                Object[] objArr79 = new Object[1];
                c(bArr18[54], (byte) 52, bArr18[7], objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c7, iRgb2, iGreen2, 2012931276, false, (String) objArr79[0], null);
            }
            Object[] objArr80 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr80[0])[0]}, new int[1], new int[]{((int[]) objArr80[2])[0]}, (String[]) objArr80[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i125 = ~iIdentityHashCode8;
            int i126 = (~(835585824 | i125)) | 70326485;
            int i127 = ~(iIdentityHashCode8 | (-30016257));
            int i128 = ((i126 | i127) * (-252)) + 582715264 + ((i127 | (~(i125 | 905912309))) * 252) + 872930421;
            int i129 = (i128 << 13) ^ i128;
            int i130 = i129 ^ (i129 >>> 17);
            ((int[]) objArr9[1])[0] = i130 ^ (i130 << 5);
        } else {
            if (context == null) {
                applicationContext3 = context;
            } else if (context instanceof ContextWrapper) {
                int i131 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i131 % 128;
                int i132 = i131 % 2;
                if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext3 = context.getApplicationContext();
                } else {
                    applicationContext3 = null;
                }
            } else {
                applicationContext3 = context.getApplicationContext();
            }
            Object[] objArr81 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 872930421};
            byte[] bArr19 = $$d;
            Object[] objArr82 = new Object[1];
            d((short) 181, bArr19[46], (byte) (-bArr19[359]), objArr82);
            Class<?> cls4 = Class.forName((String) objArr82[0]);
            Object[] objArr83 = new Object[1];
            d((short) 437, bArr19[48], bArr19[340], objArr83);
            Object[] objArr84 = (Object[]) cls4.getMethod((String) objArr83[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr81);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 876;
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                    byte[] bArr20 = $$a;
                    Object[] objArr85 = new Object[1];
                    c(bArr20[54], (byte) 52, bArr20[7], objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cNormalizeMetaState, trimmedLength2, doubleTapTimeout2, 2012931276, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr84);
                try {
                    long jLongValue9 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int bitsPerPixel4 = 875 - ImageFormat.getBitsPerPixel(0);
                        int mode4 = 10 - View.MeasureSpec.getMode(0);
                        byte b25 = (byte) 52;
                        Object[] objArr86 = new Object[1];
                        c($$a[54], b25, b25, objArr86);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(pressedStateDuration, bitsPerPixel4, mode4, 2012020043, false, (String) objArr86[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                        int gidForName4 = Process.getGidForName("") + 877;
                        int iRgb3 = Color.rgb(0, 0, 0) + 16777226;
                        Object[] objArr87 = new Object[1];
                        c($$a[54], (byte) 37, (short) ($$b & 380), objArr87);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cArgb2, gidForName4, iRgb3, -1650998592, false, (String) objArr87[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr84 = objArr84;
            }
            objArr9 = objArr84;
        }
        int i133 = ((int[]) objArr9[2])[0];
        int i134 = ((int[]) objArr9[0])[0];
        if (i134 == i133) {
            int i135 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iNextInt2 = new Random().nextInt();
            int i136 = i135 + 885891590 + (((~((-271591938) | (~iNextInt2))) | 231281708) * (-591)) + ((iNextInt2 | (-271591938)) * 591);
            int i137 = (i136 << 13) ^ i136;
            int i138 = i137 ^ (i137 >>> 17);
            i3 = 0;
            ((int[]) objArr10[1])[0] = i138 ^ (i138 << 5);
            i2 = 1;
        } else {
            int[] iArr9 = new int[i134];
            int i139 = i134 - 1;
            iArr9[i139] = 1;
            Toast.makeText((Context) null, iArr9[((i134 * i139) % 2) - 1], 1).show();
            int i140 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iMyPid3 = Process.myPid();
            int i141 = 1384952868 + (((~((-291618335) | iMyPid3)) | 6334472 | (~((-251308106) | iMyPid3))) * (-754));
            int i142 = ~((-6334473) | iMyPid3);
            int i143 = ~iMyPid3;
            int i144 = i140 + i141 + ((i142 | (~((-244973634) | i143))) * (-754)) + ((i143 | (-291618335)) * 754);
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            i2 = 1;
            i3 = 0;
            ((int[]) objArr10[1])[0] = i146 ^ (i146 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', i3) + i2);
            int iKeyCodeFromString5 = 876 - KeyEvent.keyCodeFromString("");
            int iIndexOf6 = 10 - TextUtils.indexOf("", "", i3, i3);
            byte[] bArr21 = $$a;
            Object[] objArr88 = new Object[1];
            c(bArr21[51], bArr21[9], (short) 141, objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cIndexOf3, iKeyCodeFromString5, iIndexOf6, -1199417970, false, (String) objArr88[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
            int iIndexOf7 = TextUtils.indexOf("", "", 0) + 10;
            byte[] bArr22 = $$a;
            byte b26 = bArr22[14];
            byte b27 = bArr22[7];
            Object[] objArr89 = new Object[1];
            c(b26, b27, (short) (b27 | 151), objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(jumpTapTimeout2, touchSlop, iIndexOf7, 254769921, false, (String) objArr89[0], null);
        }
        if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cIndexOf4 = (char) TextUtils.indexOf("", "");
                int i147 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i148 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                byte[] bArr23 = $$a;
                byte b28 = bArr23[51];
                byte b29 = bArr23[41];
                Object[] objArr90 = new Object[1];
                c(b28, b29, (short) (b29 | 144), objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf4, i147, i148, 1324201839, false, (String) objArr90[0], null);
            }
            Object[] objArr91 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr91[0])[0]}, new int[1], new int[]{((int[]) objArr91[2])[0]}, (String[]) objArr91[3]};
            int iMyUid2 = Process.myUid();
            int i149 = 1858126516 + (((~(56507313 | iMyUid2)) | 75579398) * 336) + (((~(iMyUid2 | 96817542)) | 35269169) * (-168)) + (((~((~iMyUid2) | 96817542)) | 56507313) * 168) + 1229585812;
            int i150 = (i149 << 13) ^ i149;
            int i151 = i150 ^ (i150 >>> 17);
            ((int[]) objArr11[1])[0] = i151 ^ (i151 << 5);
        } else {
            Object[] objArr92 = {Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 1229585812};
            byte[] bArr24 = $$d;
            Object[] objArr93 = new Object[1];
            d((short) 158, bArr24[58], bArr24[46], objArr93);
            Class<?> cls5 = Class.forName((String) objArr93[0]);
            Object[] objArr94 = new Object[1];
            d((short) 323, bArr24[48], bArr24[450], objArr94);
            objArr11 = (Object[]) cls5.getMethod((String) objArr94[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr92);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char c8 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int i152 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                byte[] bArr25 = $$a;
                byte b30 = bArr25[51];
                byte b31 = bArr25[41];
                Object[] objArr95 = new Object[1];
                c(b30, b31, (short) (b31 | 144), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c8, i152, pressedStateDuration2, 1324201839, false, (String) objArr95[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr11);
            try {
                long jLongValue11 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char trimmedLength3 = (char) TextUtils.getTrimmedLength("");
                    int scrollBarSize2 = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i153 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr26 = $$a;
                    byte b32 = bArr26[14];
                    byte b33 = bArr26[7];
                    Object[] objArr96 = new Object[1];
                    c(b32, b33, (short) (b33 | 151), objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(trimmedLength3, scrollBarSize2, i153, 254769921, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf8 = 876 - TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf9 = TextUtils.indexOf("", "", 0) + 10;
                    byte[] bArr27 = $$a;
                    Object[] objArr97 = new Object[1];
                    c(bArr27[51], bArr27[9], (short) 141, objArr97);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(scrollBarSize3, iIndexOf8, iIndexOf9, -1199417970, false, (String) objArr97[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i154 = ((int[]) objArr11[2])[0];
        int i155 = ((int[]) objArr11[0])[0];
        if (i155 != i154) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr18 = (String[]) objArr11[3];
            if (strArr18 != null) {
                int i156 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i156 % 128;
                int i157 = i156 % 2;
                for (String str10 : strArr18) {
                    arrayList5.add(str10);
                }
            }
            throw new RuntimeException(String.valueOf(i155));
        }
        int i158 = ((int[]) objArr11[1])[0];
        Object[] objArr98 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
        int i159 = ~Process.myTid();
        int i160 = i158 + (-1378968676) + ((~((-33689649) | i159)) * 52) + (((~(75099789 | i159)) | (~(34789560 | i159)) | (-108789438)) * (-52)) + (((~(i159 | (-75099790))) | 1099912) * 52);
        int i161 = (i160 << 13) ^ i160;
        int i162 = i161 ^ (i161 >>> 17);
        ((int[]) objArr98[1])[0] = i162 ^ (i162 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
            int pressedStateDuration4 = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr28 = $$a;
            byte b34 = (byte) (bArr28[51] - 1);
            byte b35 = bArr28[7];
            Object[] objArr99 = new Object[1];
            c(b34, b35, b35, objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(pressedStateDuration3, scrollBarSize4, pressedStateDuration4, 252381699, false, (String) objArr99[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i163 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iMyPid4 = (Process.myPid() >> 22) + 10;
            Object[] objArr100 = new Object[1];
            c($$a[54], (byte) 52, (short) 158, objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(keyRepeatTimeout, i163, iMyPid4, 2009631821, false, (String) objArr100[0], null);
        }
        if (j5 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            int i164 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i164 % 128;
            int i165 = i164 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int packedPositionChild5 = 875 - ExpandableListView.getPackedPositionChild(0L);
                int minimumFlingVelocity2 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b36 = $$a[7];
                byte b37 = b36;
                Object[] objArr101 = new Object[1];
                c(b36, b37, (short) (b37 | 210), objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(keyRepeatTimeout2, packedPositionChild5, minimumFlingVelocity2, 256017550, false, (String) objArr101[0], null);
            }
            Object[] objArr102 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr12 = new Object[]{new int[]{((int[]) objArr102[0])[0]}, new int[1], new int[]{((int[]) objArr102[2])[0]}, (String[]) objArr102[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i166 = ((((-981816544) + (((~((-200036268) | iIdentityHashCode9)) | 40388137) * 345)) + (((~((-200036268) | (~iIdentityHashCode9))) | (-200114176)) * 345)) + ((~(iIdentityHashCode9 | (-40388138))) * 345)) - 762674199;
            int i167 = (i166 << 13) ^ i166;
            int i168 = i167 ^ (i167 >>> 17);
            ((int[]) objArr12[1])[0] = i168 ^ (i168 << 5);
        } else {
            Context applicationContext5 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr103 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), -762674199};
            short s = (short) ($$e - 4);
            byte[] bArr29 = $$d;
            Object[] objArr104 = new Object[1];
            d(s, (byte) (-bArr29[359]), bArr29[119], objArr104);
            Class<?> cls6 = Class.forName((String) objArr104[0]);
            Object[] objArr105 = new Object[1];
            d((short) 233, bArr29[48], bArr29[340], objArr105);
            Object[] objArr106 = (Object[]) cls6.getMethod((String) objArr105[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr103);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int bitsPerPixel5 = 875 - ImageFormat.getBitsPerPixel(0);
                    int gidForName5 = 9 - Process.getGidForName("");
                    byte b38 = $$a[7];
                    byte b39 = b38;
                    Object[] objArr107 = new Object[1];
                    c(b38, b39, (short) (b39 | 210), objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cResolveSize, bitsPerPixel5, gidForName5, 256017550, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr106);
                try {
                    long jLongValue13 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int defaultSize = 876 - View.getDefaultSize(0, 0);
                        int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                        Object[] objArr108 = new Object[1];
                        c($$a[54], (byte) 52, (short) 158, objArr108);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cIndexOf5, defaultSize, minimumFlingVelocity3, 2009631821, false, (String) objArr108[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char cResolveSize2 = (char) View.resolveSize(0, 0);
                        int mirror2 = AndroidCharacter.getMirror('0') + 828;
                        int deadChar3 = 10 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr30 = $$a;
                        byte b40 = (byte) (bArr30[51] - 1);
                        byte b41 = bArr30[7];
                        Object[] objArr109 = new Object[1];
                        c(b40, b41, b41, objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cResolveSize2, mirror2, deadChar3, 252381699, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                objArr106 = objArr106;
            }
            objArr12 = objArr106;
        }
        if (((int[]) objArr12[0])[0] != ((int[]) objArr12[2])[0]) {
            throw null;
        }
        int i169 = ((int[]) objArr12[1])[0];
        Object[] objArr110 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
        int i170 = ~System.identityHashCode(this);
        int i171 = i169 + (-1090580920) + (((-541065221) | i170) * 494) + (((~(i170 | (-787229840))) | 532639467) * 494);
        int i172 = (i171 << 13) ^ i171;
        int i173 = i172 ^ (i172 >>> 17);
        ((int[]) objArr110[1])[0] = i173 ^ (i173 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char c9 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int modifierMetaStateMask2 = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
            int iResolveSizeAndState = 44 - View.resolveSizeAndState(0, 0, 0);
            Object[] objArr111 = new Object[1];
            c($$a[54], (byte) 52, (short) 158, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c9, modifierMetaStateMask2, iResolveSizeAndState, -459846511, false, (String) objArr111[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iMyPid5 = 651 - (Process.myPid() >> 22);
            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 44;
            byte[] bArr31 = $$a;
            byte b42 = (byte) (bArr31[51] - 1);
            byte b43 = bArr31[7];
            Object[] objArr112 = new Object[1];
            c(b42, b43, b43, objArr112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(maximumDrawingCacheSize2, iMyPid5, iResolveOpacity3, -873460649, false, (String) objArr112[0], null);
        }
        if (j6 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cResolveSize3 = (char) View.resolveSize(0, 0);
                int doubleTapTimeout3 = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i174 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr113 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cResolveSize3, doubleTapTimeout3, i174, -1595579076, false, (String) objArr113[0], null);
            }
            Object[] objArr114 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr13 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i175 = ((int[]) objArr114[2])[0];
            int i176 = ((int[]) objArr114[0])[0];
            int i177 = ~(System.identityHashCode(this) | 137068197);
            int i178 = (((-266099631) | i177) * (-658)) + 1518789675 + ((i177 | (-268402608)) * 658) + 522682995;
            int i179 = (i178 << 13) ^ i178;
            int i180 = i179 ^ (i179 >>> 17);
            ((int[]) objArr13[3])[0] = i180 ^ (i180 << 5);
            i4 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 1610 - View.getDefaultSize(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr115 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).newInstance(null), 522682995, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                int mirror3 = '\\' - AndroidCharacter.getMirror('0');
                byte[] bArr32 = $$a;
                byte b44 = (byte) (bArr32[51] - 1);
                byte b45 = bArr32[7];
                Object[] objArr116 = new Object[1];
                c(b44, b45, b45, objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cNormalizeMetaState2, iCombineMeasuredStates, mirror3, 2075921419, false, (String) objArr116[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 696 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 99 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 793, 83 - (ViewConfiguration.getTouchSlop() >> 8)), Integer.TYPE, Integer.TYPE});
            }
            objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).invoke(null, objArr115);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                char cResolveSize4 = (char) View.resolveSize(0, 0);
                int iResolveSize = 651 - View.resolveSize(0, 0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44;
                Object[] objArr117 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cResolveSize4, iResolveSize, scrollDefaultDelay, -1595579076, false, (String) objArr117[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr13);
            try {
                long jLongValue15 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                    byte[] bArr33 = $$a;
                    byte b46 = (byte) (bArr33[51] - 1);
                    byte b47 = bArr33[7];
                    Object[] objArr118 = new Object[1];
                    c(b46, b47, b47, objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cLastIndexOf2, iLastIndexOf4, keyRepeatDelay2, -873460649, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char c10 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int maximumDrawingCacheSize3 = 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iResolveOpacity4 = 44 - Drawable.resolveOpacity(0, 0);
                    Object[] objArr119 = new Object[1];
                    c($$a[54], (byte) 52, (short) 158, objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c10, maximumDrawingCacheSize3, iResolveOpacity4, -459846511, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                i4 = 0;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i181 = ((int[]) objArr13[i4])[i4];
        int i182 = ((int[]) objArr13[2])[i4];
        if (i182 == i181) {
            objArr14 = new Object[4];
            int[] iArr10 = new int[1];
            objArr14[i4] = iArr10;
            int[] iArr11 = new int[1];
            objArr14[2] = iArr11;
            objArr14[3] = new int[1];
            int i183 = ((int[]) objArr13[3])[i4];
            int i184 = ((int[]) objArr13[2])[i4];
            int i185 = ((int[]) objArr13[i4])[i4];
            iArr11[i4] = i184;
            iArr10[i4] = i185;
            objArr14[1] = new String[i4];
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i186 = ~((-506418347) | iIdentityHashCode10);
            int i187 = ~iIdentityHashCode10;
            int i188 = i183 + 1973282289 + ((i186 | (~((-502987537) | i187))) * (-1808)) + (((~((-33883307) | iIdentityHashCode10)) | (~(i187 | (-30452497)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode10 | 502987536)) | 472535040 | (~(506418346 | i187))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            i5 = 0;
            ((int[]) objArr14[3])[0] = i190 ^ (i190 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr19 = (String[]) objArr13[1];
            if (strArr19 != null) {
                int i191 = 0;
                while (i191 < strArr19.length) {
                    int i192 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i192 % 128;
                    if (i192 % 2 != 0) {
                        arrayList6.add(strArr19[i191]);
                        i191 += 46;
                    } else {
                        arrayList6.add(strArr19[i191]);
                        i191++;
                    }
                }
            }
            Toast.makeText((Context) null, i182 / (((i182 - 1) * i182) % 2), 0).show();
            objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i193 = ((int[]) objArr13[3])[0];
            int i194 = ((int[]) objArr13[2])[0];
            int i195 = ((int[]) objArr13[0])[0];
            int i196 = ~System.identityHashCode(this);
            int i197 = i193 + (((~((-373090991) | i196)) | 3435178) * (-241)) + 552977010 + (((~(i196 | (-369655813))) | (-373095359)) * 241);
            int i198 = i197 ^ (i197 << 13);
            int i199 = i198 ^ (i198 >>> 17);
            i5 = 0;
            ((int[]) objArr14[3])[0] = i199 ^ (i199 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char threadPriority4 = (char) (((Process.getThreadPriority(i5) + 20) >> 6) + 29944);
            int packedPositionChild6 = 1754 - ExpandableListView.getPackedPositionChild(0L);
            int pressedStateDuration5 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
            Object[] objArr120 = new Object[1];
            c($$a[54], (byte) 37, (short) ($$b & 380), objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(threadPriority4, packedPositionChild6, pressedStateDuration5, 986134021, false, (String) objArr120[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
                int defaultSize2 = 1755 - View.getDefaultSize(0, 0);
                int iIndexOf10 = 23 - TextUtils.indexOf("", "", 0, 0);
                byte b48 = (byte) 52;
                Object[] objArr121 = new Object[1];
                c($$a[54], b48, b48, objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(maximumFlingVelocity, defaultSize2, iIndexOf10, 1599039318, false, (String) objArr121[0], null);
            }
            Object[] objArr122 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr15 = new Object[]{new int[]{((int[]) objArr122[0])[0]}, new int[]{((int[]) objArr122[1])[0]}, (Object[]) objArr122[2], new int[1], (String[]) objArr122[4]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i200 = 560645739 + (((~((-1037867758) | iIdentityHashCode11)) | 823167137 | (~((-825265332) | iIdentityHashCode11))) * (-754));
            int i201 = ~((-823167138) | iIdentityHashCode11);
            int i202 = ~iIdentityHashCode11;
            int i203 = i200 + ((i201 | (~((-2098195) | i202))) * (-754)) + ((i202 | (-1037867758)) * 754) + 2049701219;
            int i204 = (i203 << 13) ^ i203;
            int i205 = i204 ^ (i204 >>> 17);
            ((int[]) objArr15[3])[0] = i205 ^ (i205 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr123 = {1884624733};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b((char) (View.MeasureSpec.getSize(0) + 42049), 1727 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue4, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).newInstance(objArr123), 2049701219);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                int gidForName6 = 1754 - Process.getGidForName("");
                int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                byte b49 = (byte) 52;
                Object[] objArr124 = new Object[1];
                c($$a[54], b49, b49, objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cRgb, gidForName6, tapTimeout3, 1599039318, false, (String) objArr124[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                long jLongValue16 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                    int i206 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                    int bitsPerPixel6 = ImageFormat.getBitsPerPixel(0) + 24;
                    Object[] objArr125 = new Object[1];
                    c($$a[54], (byte) 52, (short) 158, objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(size, i206, bitsPerPixel6, 1596667560, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cRgb2 = (char) ((-16747272) - Color.rgb(0, 0, 0));
                    int i207 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                    int iIndexOf11 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                    Object[] objArr126 = new Object[1];
                    c($$a[54], (byte) 37, (short) ($$b & 380), objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cRgb2, i207, iIndexOf11, 986134021, false, (String) objArr126[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                objArr15 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i208 = ((int[]) objArr15[1])[0];
        int i209 = ((int[]) objArr15[0])[0];
        if (i209 != i208) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr20 = (String[]) objArr15[4];
            if (strArr20 != null) {
                for (String str11 : strArr20) {
                    arrayList7.add(str11);
                }
            }
            throw new RuntimeException(String.valueOf(i209));
        }
        int i210 = ((int[]) objArr15[3])[0];
        Object[] objArr127 = {new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i211 = i210 + 1213990237 + (((~(iUptimeMillis2 | 737478072)) | 524875646) * (-668)) + ((737478072 | (~(524875646 | iUptimeMillis2))) * 1336) + ((iUptimeMillis2 | 1073608702) * 668);
        int i212 = (i211 << 13) ^ i211;
        int i213 = i212 ^ (i212 >>> 17);
        ((int[]) objArr127[3])[0] = i213 ^ (i213 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char c11 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
            int i214 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
            byte[] bArr34 = $$a;
            byte b50 = (byte) (bArr34[51] - 1);
            byte b51 = bArr34[7];
            Object[] objArr128 = new Object[1];
            c(b50, b51, b51, objArr128);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(c11, windowTouchSlop2, i214, -1048449946, false, (String) objArr128[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cResolveOpacity2 = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                int iKeyCodeFromString6 = KeyEvent.keyCodeFromString("") + 921;
                int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr129 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cResolveOpacity2, iKeyCodeFromString6, iMakeMeasureSpec, -1142834547, false, (String) objArr129[0], null);
            }
            Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr16 = new Object[]{new int[1], new int[]{((int[]) objArr130[1])[0]}, (Object[]) objArr130[2], new int[]{((int[]) objArr130[3])[0]}, (String[]) objArr130[4]};
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i215 = (((-1758855642) + (((-271909979) | iIdentityHashCode12) * (-381))) + (((~((~iIdentityHashCode12) | 1288227105)) | (-1346194524)) * 381)) - 2143387019;
            int i216 = (i215 << 13) ^ i215;
            int i217 = i216 ^ (i216 >>> 17);
            ((int[]) objArr16[0])[0] = i217 ^ (i217 << 5);
            context2 = context;
        } else {
            context2 = context;
            Object[] objArr131 = {context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2, Integer.valueOf(((Integer) Class.forName(str3).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 1633093763};
            byte[] bArr35 = $$d;
            Object[] objArr132 = new Object[1];
            d((short) (-bArr35[319]), (byte) (bArr35[134] - 1), bArr35[431], objArr132);
            Class<?> cls7 = Class.forName((String) objArr132[0]);
            Object[] objArr133 = new Object[1];
            d(bArr35[46], bArr35[48], bArr35[340], objArr133);
            objArr16 = (Object[]) cls7.getMethod((String) objArr133[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr131);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char gidForName7 = (char) (31532 - Process.getGidForName(""));
                int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iAlpha2 = Color.alpha(0) + 28;
                Object[] objArr134 = new Object[1];
                c($$a[54], (byte) 37, (short) ($$b & 380), objArr134);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(gidForName7, edgeSlop2, iAlpha2, -1142834547, false, (String) objArr134[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr16);
            try {
                long jLongValue17 = ((Long) Class.forName(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char scrollDefaultDelay2 = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int fadingEdgeLength3 = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i218 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b52 = (byte) 52;
                    Object[] objArr135 = new Object[1];
                    c($$a[54], b52, b52, objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(scrollDefaultDelay2, fadingEdgeLength3, i218, -778300370, false, (String) objArr135[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                    int scrollBarSize5 = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i219 = 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte[] bArr36 = $$a;
                    byte b53 = (byte) (bArr36[51] - 1);
                    byte b54 = bArr36[7];
                    Object[] objArr136 = new Object[1];
                    c(b53, b54, b54, objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cMakeMeasureSpec, scrollBarSize5, i219, -1048449946, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr16[3])[0] != ((int[]) objArr16[1])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr21 = (String[]) objArr16[4];
            if (strArr21 != null) {
                int i220 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i220 % 128;
                for (int i221 = i220 % 2 == 0 ? 1 : 0; i221 < strArr21.length; i221++) {
                    arrayList8.add(strArr21[i221]);
                }
            }
            throw null;
        }
        int i222 = ((int[]) objArr16[0])[0];
        Object[] objArr137 = {new int[1], new int[]{((int[]) objArr16[1])[0]}, (Object[]) objArr16[2], new int[]{((int[]) objArr16[3])[0]}, (String[]) objArr16[4]};
        int iIdentityHashCode13 = System.identityHashCode(this);
        int i223 = i222 + ((((~((-878322758) | iIdentityHashCode13)) | 1704961) * (-283)) - 2038383690) + ((~(iIdentityHashCode13 | (-876617797))) * 283);
        int i224 = (i223 << 13) ^ i223;
        int i225 = i224 ^ (i224 >>> 17);
        Object obj2 = objArr137[0];
        ((int[]) obj2)[0] = i225 ^ (i225 << 5);
        if (intent != null) {
            int i226 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i226 % 128;
            int i227 = i226 % 2;
            try {
                int i228 = ((int[]) objArr5[2])[0];
                int i229 = i228 * i228;
                int i230 = -(850948322 * i228);
                int i231 = (i229 ^ i230) + ((i229 & i230) << 1);
                int i232 = -(i228 * (-1103403822));
                int i233 = ((i231 ^ i232) + ((i232 & i231) << 1)) - (-965165476);
                int i234 = i233 >> 20;
                int i235 = ((i234 & (-8191)) + (i234 | (-8191))) / 4096;
                int i236 = (i233 - (~((i235 ^ 1) + ((i235 & 1) << 1)))) - 1;
                int i237 = i233 >> 28;
                int i238 = ((i237 & (-31)) + (i237 | (-31))) / 16;
                int i239 = (-(i236 ^ ((i238 ^ 1) + ((i238 & 1) << 1)))) + 5;
                int i240 = i239 >> 20;
                int i241 = ((i240 & (-8191)) + (i240 | (-8191))) / 4096;
                int i242 = (i241 ^ 1) + ((i241 & 1) << 1);
                int i243 = 1116180 / ((i239 & (-((i242 ^ 1) + ((i242 & 1) << 1)))) * 1908);
                int i244 = ((int[]) objArr14[3])[0];
                int i245 = i244 * i244;
                int i246 = -(1922547507 * i244);
                int i247 = ((i245 | i246) << 1) - (i245 ^ i246);
                int i248 = -(i244 * (-1161340847));
                int i249 = (i247 & i248) + (i248 | i247);
                int i250 = (i249 ^ (-1215807740)) + (((-1215807740) & i249) << 1);
                int i251 = i250 >> 20;
                int i252 = ((i251 ^ (-8191)) + ((i251 & (-8191)) << 1)) / 4096;
                int i253 = (i250 - (~((i252 ^ 1) + ((i252 & 1) << 1)))) - 1;
                int i254 = ((i250 >> 29) - 15) / 8;
                int i255 = -(i253 ^ ((i254 ^ 1) + ((i254 & 1) << 1)));
                int i256 = ((i255 | 2) << 1) - (i255 ^ 2);
                int i257 = i256 >> 15;
                int i258 = (((-262143) & i257) + (i257 | (-262143))) / 131072;
                int i259 = i243 + (1532440 / (((-((((i258 | 1) << 1) - (i258 ^ 1)) + 1)) & i256) * 842));
                int i260 = ((int[]) obj2)[0];
                int i261 = i260 * i260;
                int i262 = -(528741957 * i260);
                int i263 = (i261 & i262) + (i261 | i262);
                int i264 = -(i260 * (-1392224425));
                int i265 = (i263 ^ i264) + ((i264 & i263) << 1);
                int i266 = (i265 ^ (-883831356)) + (((-883831356) & i265) << 1);
                int i267 = i266 >> 25;
                int i268 = (((i267 | (-255)) << 1) - (i267 ^ (-255))) / 128;
                int i269 = (i266 - (~((i268 & 1) + (i268 | 1)))) - 1;
                int i270 = i266 >> 19;
                int i271 = ((i270 ^ (-16383)) + ((i270 & (-16383)) << 1)) / 8192;
                int i272 = -(i269 ^ (((i271 | 1) << 1) - (i271 ^ 1)));
                int i273 = ((i272 | 9) << 1) - (i272 ^ 9);
                int i274 = i273 >> 23;
                int i275 = (((i274 | (-1023)) << 1) - (i274 ^ (-1023))) / 512;
                stringExtra = intent.getStringExtra("23;23;28;27;referrer".substring(i259 + ((-950040) / (((-(((i275 ^ 1) + ((i275 & 1) << 1)) + 1)) & i273) * 104))));
            } catch (Throwable th3) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th3);
                stringExtra = null;
            }
            if (stringExtra != null) {
                int i276 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i276 % 128;
                int i277 = i276 % 2;
                SharedPreferences sharedPreferencesC_ = AFa1tSDK.c_(context);
                int i278 = ((int[]) objArr2[1])[0];
                int i279 = ((i278 * i278) - (~(-(683012609 * i278)))) - 1;
                int i280 = -(i278 * 731240687);
                int i281 = ((i279 ^ i280) + ((i280 & i279) << 1)) - 2107643840;
                int i282 = ((i281 >> 27) - 63) / 32;
                int i283 = (i282 & 1) + (i282 | 1);
                int i284 = -((i282 + 1) ^ (((i281 | i283) << 1) - (i283 ^ i281)));
                int i285 = (i284 & 5) + (i284 | 5);
                int i286 = i285 >> 25;
                int i287 = (((i286 | (-255)) << 1) - (i286 ^ (-255))) / 128;
                int i288 = (i287 ^ 1) + ((i287 & 1) << 1);
                if (sharedPreferencesC_.getString("12/30/referrer".substring(49800 / (((-(((i288 | 1) << 1) - (i288 ^ 1))) & i285) * 1660)), null) != null) {
                    int i289 = ((int[]) objArr65[1])[0];
                    int i290 = i289 * i289;
                    int i291 = -(36252817 * i289);
                    int i292 = ((((i290 | i291) << 1) - (i290 ^ i291)) - (~(-(i289 * (-711260583))))) - 1;
                    int i293 = ((i292 | (-1021571207)) << 1) - ((-1021571207) ^ i292);
                    int i294 = i293 >> 25;
                    int i295 = ((i294 ^ (-255)) + ((i294 & (-255)) << 1)) / 128;
                    int i296 = (i295 & 1) + (i295 | 1);
                    int i297 = (i293 & i296) + (i296 | i293);
                    int i298 = i293 >> 21;
                    int i299 = ((i298 & (-4095)) + (i298 | (-4095))) / 2048;
                    int i300 = -((((i299 | 1) << 1) - (i299 ^ 1)) ^ i297);
                    int i301 = (i300 ^ 3) + ((i300 & 3) << 1);
                    int i302 = i301 >> 26;
                    int i303 = ((i302 ^ ComposerKt.defaultsKey) + ((i302 & ComposerKt.defaultsKey) << 1)) / 64;
                    int i304 = ((i303 | 1) << 1) - (i303 ^ 1);
                    ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, (1373314374 / (((-((i304 ^ 1) + ((i304 & 1) << 1))) & i301) * 3)) + 478989531, (int) System.currentTimeMillis())).getMediationNetwork(context2, stringExtra);
                    return;
                }
            }
            AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
            int i305 = ((int[]) objArr98[1])[0];
            int i306 = i305 * i305;
            int i307 = -(1334885932 * i305);
            int i308 = (((i306 ^ i307) + ((i306 & i307) << 1)) - (~(-(i305 * (-982067204))))) - 1;
            int i309 = (i308 ^ 126925200) + ((126925200 & i308) << 1);
            int i310 = i309 >> 25;
            int i311 = ((((i310 | (-255)) << 1) - (i310 ^ (-255))) / 128) + 1;
            int i312 = (i309 & i311) + (i309 | i311);
            int i313 = i309 >> 15;
            int i314 = (((-262143) & i313) + (i313 | (-262143))) / 131072;
            int i315 = (-(i312 ^ ((i314 & 1) + (i314 | 1)))) + 6;
            int i316 = i315 >> 24;
            int i317 = ((i316 & (-511)) + (i316 | (-511))) / 256;
            int i318 = (i317 ^ 1) + ((i317 & 1) << 1);
            ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], ((-1782381696) / ((i315 & (-((i318 & 1) + (i318 | 1)))) * 2)) - 483048209, 631580017, (int) System.currentTimeMillis())).b_(context2, intent);
            PackageManager packageManager = context.getPackageManager();
            int i319 = ((int[]) objArr8[2])[0];
            int i320 = i319 * i319;
            int i321 = -(58566337 * i319);
            int i322 = (i320 & i321) + (i320 | i321);
            int i323 = -(i319 * (-1310680253));
            int i324 = (((i322 | i323) << 1) - (i323 ^ i322)) - 1929542652;
            int i325 = (((i324 >> 27) - 63) / 32) + 1;
            int i326 = ((i324 | i325) << 1) - (i325 ^ i324);
            int i327 = i324 >> 22;
            int i328 = ((i327 & (-2047)) + (i327 | (-2047))) / 1024;
            int i329 = (-(((i328 ^ 1) + ((i328 & 1) << 1)) ^ i326)) + 4;
            int i330 = i329 >> 27;
            Intent intent2 = new Intent("9\\19\\11\\6\\4\\com.android.vending.INSTALL_REFERRER".substring(60624 / ((i329 & (-((((i330 & (-63)) + (i330 | (-63))) / 32) + 2))) * 1263)));
            int i331 = ((int[]) objArr44[0])[0];
            int i332 = i331 * i331;
            int i333 = -(1254381434 * i331);
            int i334 = (i332 ^ i333) + ((i332 & i333) << 1);
            int i335 = -(i331 * 1307056758);
            int i336 = ((i334 ^ i335) + ((i335 & i334) << 1)) - 1823641536;
            int i337 = i336 >> 25;
            int i338 = (((i337 & (-255)) + (i337 | (-255))) / 128) + 1;
            int i339 = (i336 ^ i338) + ((i338 & i336) << 1);
            int i340 = i336 >> 26;
            int i341 = ((i340 ^ ComposerKt.defaultsKey) + ((i340 & ComposerKt.defaultsKey) << 1)) / 64;
            int i342 = -(i339 ^ (((i341 | 1) << 1) - (i341 ^ 1)));
            int i343 = (i342 ^ 7) + ((i342 & 7) << 1);
            int i344 = i343 >> 23;
            int i345 = ((i344 & (-1023)) + (i344 | (-1023))) / 512;
            int i346 = 8975232 / (((-(((i345 ^ 1) + ((i345 & 1) << 1)) + 1)) & i343) * 1484);
            int i347 = ((int[]) objArr10[1])[0];
            int i348 = ((((i347 * i347) - (~(-(2025151106 * i347)))) - 1) - (~(-(i347 * 777261944)))) - 1;
            int i349 = ((i348 | 1169470985) << 1) - (1169470985 ^ i348);
            int i350 = i349 >> 23;
            int i351 = ((i350 & (-1023)) + (i350 | (-1023))) / 512;
            int i352 = i351 & 1;
            int i353 = (i351 | 1) + i352;
            int i354 = -(((i349 & i353) + (i353 | i349)) ^ ((i351 ^ 1) + (i352 << 1)));
            int i355 = ((i354 | 6) << 1) - (i354 ^ 6);
            int i356 = i355 >> 18;
            int i357 = (((i356 & (-32767)) + (i356 | (-32767))) / 16384) + 1;
            int i358 = i346 + (456192 / (((-(((i357 | 1) << 1) - (i357 ^ 1))) & i355) * 1408));
            int i359 = ((int[]) objArr110[1])[0];
            int i360 = i359 * i359;
            int i361 = -(478702673 * i359);
            int i362 = (((i360 ^ i361) + ((i360 & i361) << 1)) - (~(-(i359 * 78739115)))) - 178357757;
            int i363 = i362 >> 16;
            int i364 = ((((-131071) ^ i363) + ((i363 & (-131071)) << 1)) / 65536) + 1;
            int i365 = ((i362 | i364) << 1) - (i364 ^ i362);
            int i366 = i362 >> 17;
            int i367 = ((((-65535) | i366) << 1) - (i366 ^ (-65535))) / 32768;
            int i368 = -(i365 ^ (((i367 | 1) << 1) - (i367 ^ 1)));
            int i369 = (i368 & 3) + (i368 | 3);
            int i370 = i369 >> 29;
            int i371 = ((i370 ^ (-15)) + ((i370 & (-15)) << 1)) / 8;
            int i372 = ((i371 | 1) << 1) - (i371 ^ 1);
            for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent2, i358 + ((-4896612) / (((-(((i372 | 1) << 1) - (i372 ^ 1))) & i369) * 1778)))) {
                String action = intent.getAction();
                if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                    int i373 = ((int[]) objArr127[3])[0];
                    int i374 = i373 * i373;
                    int i375 = -(754717179 * i373);
                    int i376 = (i374 & i375) + (i374 | i375);
                    int i377 = -(i373 * 923949315);
                    int i378 = (i376 & i377) + (i377 | i376);
                    int i379 = (i378 ^ (-1809853183)) + (((-1809853183) & i378) << 1);
                    int i380 = i379 >> 21;
                    int i381 = ((i380 ^ (-4095)) + ((i380 & (-4095)) << 1)) / 2048;
                    int i382 = (i379 - (~((i381 ^ 1) + ((i381 & 1) << 1)))) - 1;
                    int i383 = i379 >> 17;
                    int i384 = -(i382 ^ (((((-65535) & i383) + (i383 | (-65535))) / 32768) + 1));
                    int i385 = ((i384 | 5) << 1) - (i384 ^ 5);
                    StringBuilder sb = new StringBuilder("6;trigger onReceive: class: ".substring(18340 / (((-((((i385 >> 27) - 63) / 32) + 2)) & i385) * 1834)));
                    sb.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.afInfoLog(sb.toString());
                    try {
                        ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context2, intent);
                    } catch (Throwable th4) {
                        StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                        sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                        AFLogger.afErrorLog(sb2.toString(), th4);
                    }
                }
            }
        }
    }

    static {
        byte[] bArr = new byte[549];
        System.arraycopy("\u0019\u0005¨Ôø?º\u000b\u0002üí\tñ\u000fëHÃùø\rñ\u0002\u000bó<Æï\u0005\tí\tøÿùCæÏ\u0005\tí\tøÿùM»\u0000ï\u001fìðþ\bøÿ\u0018ã\u0002\u0004õÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö?\tò\tü\u0001ðÿ\u001aëðü\u0007ö@Ïñ\bð\u0001\u0004\u0003ê\u0013\u0000ò\u0006ñ\u000füòû\u000búú\nø\u0000\u0000\u0000ïúý\u0001\u000b\u000fñô\u0004\u0013å\u0004íý\u0001\u000b\u0011ëòú\u000eðýÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õø\u0010÷ù\bùù\u0005\u001cÙ\u0006ø\të\rñ?ò\u0000=Åöþ\u0006ù\u00055Ëñ\bð\u0001\u0004\u00034ÅøøCÃùø\rñ\u0002\u000bó<¿ÿÿ\u0000ó\u0013ç\u000bô\bøÿ\r÷\u0003üü5²þ\fþÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007öA\fï)Ú\nø\u0000 àïúý\u0001\u000b\u001dØ\tì\t\u0019Ü\týÿ\u0015ìù\bóö/Õ\nì\u0000.Ù\u0005ñ\u0005\u0000ÿ>ÎÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö@Êÿ\u0003\u0017óóõ\u000e\u0004\u000bëð\u0002\u0001õÿ\tøÿ#Ù\u0006õ\u000e\u000bëð\u0002\u0001õÿ\tøÿ#Ù\u0006õ$Ùø\rñ\u0002\u000bó9ñ\bð\u0001\u0004\u00034¹ü\u0003þÿûüD¶@\u0004¿\u0006ÿù\u00061Úïë\tù\u0005\"Ò\u0000û\rëNñÝ\nó\tøÿ\u001cíæ\n\u0006õø,Ò\u000føø\u0006õøÿ\u0001\t\u0000ø\u0006ó\u0001ù\u0000\u0001ù\u0007ÿì\u000b\u0002ì(Ü\tý÷\u0006ýý\u0003ê\u0007ö@".getBytes("ISO-8859-1"), 0, bArr, 0, 549);
        $$d = bArr;
        $$e = 89;
        $$a = new byte[]{119, -102, -34, -3, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        $$b = 235;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        b = -6377398940819159759L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 35224;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.appsflyer.MultipleInstallBroadcastReceiver.$$c
            int r9 = 104 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.MultipleInstallBroadcastReceiver.$$g(byte, int, short):java.lang.String");
    }
}
