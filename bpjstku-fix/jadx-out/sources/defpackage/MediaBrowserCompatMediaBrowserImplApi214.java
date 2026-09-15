package defpackage;

import android.content.Context;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplApi214 {
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$f = 121;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {60, 80, 13, 34, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 204;
    private static final byte[] $$a = {109, 7, 114, -90, 2, -15, 36, -17, -2, -8, 10, -6, 2, 28, -37, 8, -9};
    private static final int $$b = 52;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-532396918, -589264073, 410500979, 64291398, -409781352, 587179363, -552008951, -1460928488, -282870204, 1340707129, -443894273, -8245843, 1006766298, 1918678979, 928878249, 130696046, -728393288, 2145984747};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = 14 - r7
            int r9 = r9 * 3
            int r9 = r9 + 103
            byte[] r0 = defpackage.MediaBrowserCompatMediaBrowserImplApi214.$$a
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2f:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatMediaBrowserImplApi214.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r9 = 103 - r9
            int r8 = r8 * 52
            int r8 = r8 + 1
            byte[] r0 = defpackage.MediaBrowserCompatMediaBrowserImplApi214.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatMediaBrowserImplApi214.b(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0244  */
    /* JADX WARN: Code duplicated, block: B:36:0x0292  */
    /* JADX WARN: Code duplicated, block: B:40:0x02eb A[Catch: all -> 0x0597, TryCatch #2 {all -> 0x0597, blocks: (B:38:0x02d6, B:40:0x02eb, B:41:0x0337, B:55:0x039c, B:57:0x03a9, B:58:0x03f0, B:60:0x040b, B:61:0x0456), top: B:112:0x02d6 }] */
    static byte[] TuitionPaymentFragmentbindingInflater1(Context context) throws Throwable {
        Method method;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte b = (byte) 0;
        byte b2 = b;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b, b2, b3, objArr);
        Method method2 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr2 = new Object[1];
        a(b, b2, b3, objArr2);
        Method[] methodArr = {method2, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        int i2 = 16;
        int i3 = 5;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int defaultSize = View.getDefaultSize(0, 0) + 2823;
            int iRgb = Color.rgb(0, 0, 0) + 16777238;
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            b(bArr[7], (byte) (-bArr[5]), bArr[54], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, defaultSize, iRgb, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2822 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTapTimeout() >> 16) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    int i5 = TuitionPaymentFragmentbindingInflater1 + i3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        Method method3 = declaredMethods[i4];
                        throw null;
                    }
                    Method method4 = declaredMethods[i4];
                    try {
                        Object[] objArr4 = new Object[1];
                        c(new int[]{-1379091539, -36580759, 1958431431, -1406256942, 1217494254, 1042782140, -3700356, -280120209, -1587493684, -1082240836, -1359663065, 1043860573, 930952064, -1858721476}, View.MeasureSpec.getMode(0) + 24, objArr4);
                        Class<?> cls3 = Class.forName((String) objArr4[0]);
                        Object[] objArr5 = new Object[1];
                        c(new int[]{-2085087653, -738348263, -1343527305, -754305753, -249890781, -1262642479, 548062975, -1499720925}, (ViewConfiguration.getMaximumFlingVelocity() >> i2) + 12, objArr5);
                        Object[] objArr6 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr5[0], null).invoke(method4, null)).intValue())};
                        int[] iArr = new int[i2];
                        // fill-array-data instruction
                        iArr[0] = -385140417;
                        iArr[1] = -1424789637;
                        iArr[2] = 204612448;
                        iArr[3] = 1444384838;
                        iArr[4] = -1069183852;
                        iArr[5] = -582122732;
                        iArr[6] = 1472927511;
                        iArr[7] = 478410906;
                        iArr[8] = -794418755;
                        iArr[9] = 451052134;
                        iArr[10] = 35863724;
                        iArr[11] = 1950553160;
                        iArr[12] = 1144311235;
                        iArr[13] = 442742048;
                        iArr[14] = -1450605452;
                        iArr[15] = 1761882232;
                        Object[] objArr7 = new Object[1];
                        c(iArr, 26 - (ViewConfiguration.getKeyRepeatDelay() >> i2), objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        c(new int[]{-1940178428, 768127883, -823254648, -1681138987, 1436399485, 975225517}, TextUtils.lastIndexOf("", '0') + 9, objArr8);
                        if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            int i6 = TuitionPaymentFragmentbindingInflater1 + 65;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                            int i7 = i6 % 2;
                            Class cls5 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            c(new int[]{-1379091539, -36580759, 1958431431, -1406256942, 1217494254, 1042782140, -3700356, -280120209, -1587493684, -1082240836, -1359663065, 1043860573, 930952064, -1858721476}, 24 - Color.blue(0), objArr9);
                            Class<?> cls6 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            c(new int[]{-1107273886, -523675986, -156479531, 865066379, -111501026, 334139406, -1189296001, 482695325, -1355588750, -1270464609}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, objArr10);
                            if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method4, null))) {
                                Object[] objArr11 = new Object[1];
                                c(new int[]{-1379091539, -36580759, 1958431431, -1406256942, 1217494254, 1042782140, -3700356, -280120209, -1587493684, -1082240836, -1359663065, 1043860573, 930952064, -1858721476}, 24 - TextUtils.getOffsetAfter("", 0), objArr11);
                                Class<?> cls7 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                c(new int[]{-1368467176, -1333717185, -851625199, -98602413, 835475494, 2004051922, 1391396339, 1328933052, -387483866, -1002877278, -2059440949, 141102513}, TextUtils.lastIndexOf("", '0', 0, 0) + 18, objArr12);
                                Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method4, null);
                                if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        Object[] objArr14 = new Object[1];
                                        c(new int[]{-1379091539, -36580759, 1958431431, -1406256942, 1217494254, 1042782140, -3700356, -280120209, -1587493684, -1082240836, -1359663065, 1043860573, 930952064, -1858721476}, 69 << TextUtils.indexOf((CharSequence) "", '\n', 1, 1), objArr14);
                                        if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cMyTid = (char) (Process.myTid() >> 22);
                                                int iCombineMeasuredStates = 2823 - View.combineMeasuredStates(0, 0);
                                                int edgeSlop = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte[] bArr2 = $$d;
                                                Object[] objArr15 = new Object[1];
                                                b(bArr2[7], (byte) (-bArr2[5]), bArr2[54], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iCombineMeasuredStates, edgeSlop, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2823;
                                                int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr3 = $$d;
                                                Object[] objArr16 = new Object[1];
                                                b(bArr3[7], (byte) (-bArr3[5]), bArr3[54], objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iResolveOpacity, offsetAfter, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            try {
                                                Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                                                    int i10 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b4 = (byte) (-bArr4[5]);
                                                    byte b5 = bArr4[7];
                                                    Object[] objArr18 = new Object[1];
                                                    b(b4, b5, b5, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration2, i9, i10, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        Object[] objArr19 = new Object[1];
                                        c(new int[]{-1379091539, -36580759, 1958431431, -1406256942, 1217494254, 1042782140, -3700356, -280120209, -1587493684, -1082240836, -1359663065, 1043860573, 930952064, -1858721476}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, objArr19);
                                        if (Class.forName((String) objArr19[0]).equals(objArr13[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cMyTid2 = (char) (Process.myTid() >> 22);
                                                int iCombineMeasuredStates2 = 2823 - View.combineMeasuredStates(0, 0);
                                                int edgeSlop2 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte[] bArr5 = $$d;
                                                Object[] objArr110 = new Object[1];
                                                b(bArr5[7], (byte) (-bArr5[5]), bArr5[54], objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid2, iCombineMeasuredStates2, edgeSlop2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method4);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                                                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 2823;
                                                int offsetAfter2 = 22 - TextUtils.getOffsetAfter("", 0);
                                                byte[] bArr6 = $$d;
                                                Object[] objArr111 = new Object[1];
                                                b(bArr6[7], (byte) (-bArr6[5]), bArr6[54], objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild2, iResolveOpacity2, offsetAfter2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                                                int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                                                byte[] bArr7 = $$d;
                                                byte b6 = (byte) (-bArr7[5]);
                                                byte b7 = bArr7[7];
                                                Object[] objArr113 = new Object[1];
                                                b(b6, b7, b7, objArr113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration3, i11, i12, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i4++;
                        i2 = 16;
                        i3 = 5;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int tapTimeout = 2823 - (ViewConfiguration.getTapTimeout() >> 16);
            int size = 22 - View.MeasureSpec.getSize(0);
            byte[] bArr8 = $$d;
            Object[] objArr20 = new Object[1];
            b(bArr8[7], (byte) (-bArr8[5]), bArr8[54], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, tapTimeout, size, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
            int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 23;
            byte[] bArr9 = $$d;
            byte b8 = (byte) (-bArr9[5]);
            byte b9 = bArr9[7];
            Object[] objArr22 = new Object[1];
            b(b8, b9, (byte) (b9 + 5), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, touchSlop, packedPositionChild3, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionGroup = (char) (37657 - ExpandableListView.getPackedPositionGroup(0L));
            int iRgb2 = Color.rgb(0, 0, 0) + 16779936;
            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 19;
            byte[] bArr10 = $$d;
            byte b10 = (byte) (-bArr10[5]);
            byte b11 = bArr10[7];
            Object[] objArr24 = new Object[1];
            b(b10, b11, (byte) (b11 + 5), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, iRgb2, touchSlop2, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -921470459;
        long j2 = (((long) (-523)) * j) + (((long) 263) * jLongValue);
        long j3 = 262;
        long j4 = -1;
        long j5 = ((j ^ j4) | jLongValue) ^ j4;
        long j6 = jLongValue ^ j4;
        long j7 = (j | j6) ^ j4;
        long jMyTid = Process.myTid();
        long j8 = j2 + ((j5 | j7 | ((j6 | jMyTid) ^ j4)) * j3) + (((long) (-786)) * j7) + (j3 * ((((jMyTid ^ j4) | j6) ^ j4) | j5 | j7)) + ((long) (-888935386));
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i13 = ~((-1477648428) | iElapsedRealtime);
        int i14 = ~iElapsedRealtime;
        int i15 = ((int) (j8 >> 32)) & (52132379 + ((i13 | (~((-84148305) | i14))) * 497) + (((~(iElapsedRealtime | (-84148305))) | (~(124570320 | i14)) | (-1602218748)) * 497));
        int iMyPid = Process.myPid();
        int i16 = i15 | (((int) j8) & (1690222983 + ((1407598495 | (~iMyPid)) * (-490)) + (((~(iMyPid | 331751327)) | 1075847168) * 490) + 516910884));
        int i17 = i16 >>> 24;
        int i18 = i16 & ViewCompat.MEASURED_SIZE_MASK;
        int i19 = i17 != 0 ? 1 : 0;
        arrayList.add(((i19 ^ 1) == 0 && i18 < 2 && (method = methodArr[i18]) != null) ? method.toString() : null);
        if ((i17 + 6) * i19 != 0) {
            throw new RuntimeException("0");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                int length2 = signatureArr.length;
                int i20 = 0;
                while (i20 < length2) {
                    byteArrayOutputStream.write(signatureArr[i20].toByteArray());
                    i20++;
                    int i21 = TuitionPaymentFragmentbindingInflater1 + 1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 5 % 2;
                    }
                }
                Bytes bytesB = Bytes.b(byteArrayOutputStream.toByteArray());
                byte[] bArr11 = bytesB.factory.b(new BytesTransformer.TuitionPaymentFragmentbindingInflater1("SHA-256").b(bytesB.byteArray, bytesB.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesB.byteOrder).byteArray;
                byteArrayOutputStream.close();
                return bArr11;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                        throw th4;
                    }
                }
            }
        } catch (Exception e2) {
            throw new IllegalStateException("could not get apk signature hash", e2);
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        int i5 = -1870535734;
        int i6 = -1;
        int i7 = 1;
        char c = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = $11 + 69;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i6;
                        byte b2 = (byte) (-b);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 3291 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 31, 1948206109, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i10++;
                    j = 0;
                    i5 = -1870535734;
                    i6 = -1;
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
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        char c2 = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr3 = new Object[i7];
                    objArr3[c] = Integer.valueOf(iArr5[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (-b3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), AndroidCharacter.getMirror(c2) + 3243, (ViewConfiguration.getPressedStateDuration() >> 16) + 31, 1948206109, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i11++;
                    c2 = '0';
                    i7 = 1;
                    c = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i12 = $11 + 19;
            $10 = i12 % 128;
            i2 = 2;
            int i13 = i12 % 2;
            iArr5 = iArr6;
            i3 = 0;
        } else {
            i2 = 2;
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        sessionConfigValidatingBuilder.b = i2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i3] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2559 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.alpha(0) + 29, 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
                int i16 = $11 + 79;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 2 / 5;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 28880), ExpandableListView.getPackedPositionChild(0L) + 349, 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = defpackage.MediaBrowserCompatMediaBrowserImplApi214.$$c
            int r6 = r6 + 4
            int r7 = r7 * 56
            int r7 = 122 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatMediaBrowserImplApi214.$$g(byte, byte, short):java.lang.String");
    }
}
