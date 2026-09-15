package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zzw extends GmsClient {
    private static final byte[] $$l = {14, 116, 92, -78};
    private static final int $$m = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {51, -5, 77, 89, 2, 31, -21, 54, 15, 12, 21, 15, -30, 57, 19, 11, 4, 35, -64, 64, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49};
    private static final int $$k = 45;
    private static final byte[] $$d = {74, 60, 122, -26, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$e = 75;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1232;
    private static char b = 63986;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 40365;
    private static char TuitionPaymentFragmentbindingInflater1 = 35847;

    public zzw(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 126, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.p001authapiphone.zzw.$$d
            int r5 = r5 * 4
            int r5 = r5 + 84
            int r7 = r7 * 52
            int r7 = 107 - r7
            int r6 = r6 * 15
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapiphone.zzw.f(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 16
            int r9 = r9 + 38
            byte[] r0 = com.google.android.gms.internal.p001authapiphone.zzw.$$j
            int r8 = r8 * 31
            int r8 = 115 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            int r7 = r7 + (-16)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapiphone.zzw.h(int, short, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Feature[] featureArr = zzac.zze;
        if (i3 == 0) {
            return featureArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (iInterfaceQueryLocalInterface instanceof zzh) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return (zzh) iInterfaceQueryLocalInterface;
        }
        zzh zzhVar = new zzh(iBinder);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zzhVar;
    }

    private static void g(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i4 = 1;
        int i5 = $10 + 1;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[i4] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i4];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[i4];
                char c3 = cArr3[c];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[i4] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 47773);
                        int iAlpha = 468 - Color.alpha(0);
                        int modifierMetaStateMask = 12 - ((byte) KeyEvent.getModifierMetaStateMask());
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[i4] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iAlpha, modifierMetaStateMask, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[i4] = cCharValue;
                    int i13 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 47774), 468 - Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "") + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i13 + 1;
                    i4 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                i2 = 1;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2324 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 44 - (Process.myPid() >> 22), -1312321721, false, $$n(b2, b3, b3), new Class[]{Object.class, Object.class});
            } else {
                i2 = 1;
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            i4 = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [boolean, int] */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3111;
            int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
            byte[] bArr = $$d;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            f(b2, b2, bArr[37], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionGroup, i3, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        g(new char[]{46328, 54328, 46060, 35135, 5974, 33720, 23722, 42625, 24546, 8285, 25701, 52370, 61987, 1318, 1258, 41757, 43935, 54057, 35498, 2456, 13287, 22670, 34153, 54341}, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        g(new char[]{64289, 17915, 61359, 1528, 10290, 26938, 42585, 748, 6236, 62738, 49604, 47600, 5663, 42598, 34560, 30145, 59358, 15276}, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSize = (char) (43042 - View.resolveSize(0, 0));
            int touchSlop = 3111 - (ViewConfiguration.getTouchSlop() >> 8);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
            byte[] bArr2 = $$d;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            f(b3, b3, bArr2[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, touchSlop, iCombineMeasuredStates, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
                int iArgb = Color.argb(0, 0, 0, 0) + 3111;
                int i4 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr3 = $$d;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                f(b4, bArr3[132], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, iArgb, i4, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int i7 = (int) Runtime.getRuntime().totalMemory();
            int i8 = ((((~((-551622423) | i7)) | 541071122) * (-566)) - 1286358802) + ((~(i7 | (-10551301))) * 566) + 1122968289;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
            int i11 = asInterface + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            g(new char[]{55955, 17509, 53997, 47435, 46336, 48957, 6496, 16963, 46321, 40745, 11957, 32437, 10320, 27343, 393, 31481, 7153, 26480}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            g(new char[]{64159, 48966, 63082, 23458, 18154, 3525, 53518, 43848, 11718, 53817, 19562, 15380, 20501, 13759, 39953, 21381, 63618, 7101}, Color.argb(0, 0, 0, 0) + 16, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1122968289};
                byte[] bArr4 = $$j;
                byte b5 = bArr4[35];
                Object[] objArr11 = new Object[1];
                h(b5, (byte) (b5 + 1), bArr4[54], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = (byte) (bArr4[49] - 1);
                byte b7 = bArr4[54];
                Object[] objArr12 = new Object[1];
                h(b6, b7, (byte) (b7 - 1), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (43042 - KeyEvent.keyCodeFromString(""));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 3112;
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
                    byte[] bArr5 = $$d;
                    byte b8 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    f(b8, bArr5[132], b8, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, iLastIndexOf, windowTouchSlop, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    g(new char[]{46328, 54328, 46060, 35135, 5974, 33720, 23722, 42625, 24546, 8285, 25701, 52370, 61987, 1318, 1258, 41757, 43935, 54057, 35498, 2456, 13287, 22670, 34153, 54341}, ExpandableListView.getPackedPositionType(0L) + 22, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    g(new char[]{64289, 17915, 61359, 1528, 10290, 26938, 42585, 748, 6236, 62738, 49604, 47600, 5663, 42598, 34560, 30145, 59358, 15276}, Color.red(0) + 15, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                        int windowTouchSlop2 = 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iArgb2 = 22 - Color.argb(0, 0, 0, 0);
                        byte[] bArr6 = $$d;
                        byte b9 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        f(b9, b9, bArr6[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, windowTouchSlop2, iArgb2, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) (43042 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i13 = 3112 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iAlpha = Color.alpha(0) + 22;
                        byte[] bArr7 = $$d;
                        byte b10 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        f(b10, b10, bArr7[37], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i13, iAlpha, -1272852037, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                    asInterface = i14 % 128;
                    if (i14 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 94;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        asInterface = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int i20 = ~((int) Process.getElapsedCpuTime());
        int i21 = i17 + 644749314 + (((~(i20 | 352270698)) | (-1426030075)) * (-160)) + (((~(i20 | (-1352760761))) | 352270698) * 160);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        Object obj = new Object[]{new int[1], new int[]{i19}, new int[]{i18}, strArr3}[0];
        ((int[]) obj)[0] = i23 ^ (i23 << 5);
        int i24 = ((int[]) obj)[0];
        int i25 = ((i24 * i24) - (~(-(540101549 * i24)))) - 1;
        int i26 = -(i24 * 1432160917);
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        int i28 = (i27 & 143792705) + (143792705 | i27);
        int i29 = i28 >> 18;
        int i30 = (i28 - (~((((i29 & (-32767)) + (i29 | (-32767))) / 16384) + 1))) - 1;
        int i31 = i28 >> 23;
        int i32 = ((i31 ^ (-1023)) + ((i31 & (-1023)) << 1)) / 512;
        int i33 = (-(i30 ^ (((i32 | 1) << 1) - (i32 ^ 1)))) + 6;
        int i34 = i33 >> 23;
        int i35 = ((i34 & (-1023)) + (i34 | (-1023))) / 512;
        int i36 = (i35 & 1) + (i35 | 1);
        return 10698 / ((i33 & (-((i36 & 1) + (i36 | 1)))) * 1783);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return 12451000;
        }
        int i3 = 44 / 0;
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
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
    private static java.lang.String $$n(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.p001authapiphone.zzw.$$l
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = 108 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapiphone.zzw.$$n(byte, int, short):java.lang.String");
    }
}
