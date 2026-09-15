package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    private DevelopmentPlatform developmentPlatform = null;
    private static final byte[] $$c = {94, -1, 37, -59};
    private static final int $$f = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -102, -34, -3, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 152;
    private static final byte[] $$a = {51, -99, -8, -59, 2, -10, 10};
    private static final int $$b = 170;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {709861542, 182344856, 1750585331, 1384854307, 475854095, 1024222094, -1535237594, -401824403, -1891291879, 1646447569, 825376817, 724709019, 570856667, -606085231, 823953474, 187948898, -59361723, -1085135744};

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = 4 - r6
            int r7 = r7 * 2
            int r7 = 111 - r7
            byte[] r1 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.$$a
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            int r6 = 3 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.a(short, int, short, java.lang.Object[]):void");
    }

    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3 = i + 84;
        int i4 = s * 52;
        byte[] bArr = $$d;
        int i5 = (i2 * 52) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i3 = (i3 + (-i4)) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i5];
                i5++;
                i3 = (i3 + (-b2)) - 11;
            }
        }
    }

    static /* synthetic */ Context access$300(DevelopmentPlatformProvider developmentPlatformProvider) {
        int i = 2 % 2;
        int i2 = b + 113;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        Context context = developmentPlatformProvider.context;
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        int i6 = i3 + 7;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            return context;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$400(DevelopmentPlatformProvider developmentPlatformProvider, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAssetFileExists = developmentPlatformProvider.assetFileExists(str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return zAssetFileExists;
    }

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    public String getDevelopmentPlatform() {
        int i = 2 % 2;
        int i2 = b + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = initDevelopmentPlatform().developmentPlatform;
        int i4 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String getDevelopmentPlatformVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        b = i2 % 128;
        int i3 = i2 % 2;
        String str = initDevelopmentPlatform().developmentPlatformVersion;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public static boolean isUnity(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, TypedValues.Custom.S_STRING) == 0) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        b = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: loaded from: classes6.dex */
    class DevelopmentPlatform {
        private final String developmentPlatform;
        private final String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.access$300(DevelopmentPlatformProvider.this), DevelopmentPlatformProvider.UNITY_VERSION_FIELD, TypedValues.Custom.S_STRING);
            if (resourcesIdentifier != 0) {
                this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
                String string = DevelopmentPlatformProvider.access$300(DevelopmentPlatformProvider.this).getResources().getString(resourcesIdentifier);
                this.developmentPlatformVersion = string;
                Logger.getLogger().v("Unity Editor version is: ".concat(String.valueOf(string)));
                return;
            }
            if (DevelopmentPlatformProvider.access$400(DevelopmentPlatformProvider.this, DevelopmentPlatformProvider.FLUTTER_ASSET_FILE)) {
                this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                this.developmentPlatformVersion = null;
                Logger.getLogger().v("Development platform is: Flutter");
            } else {
                this.developmentPlatform = null;
                this.developmentPlatformVersion = null;
            }
        }
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentbindingInflater1;
        int i3 = -1870535734;
        float f = 0.0f;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 97;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr3[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                        int iIndexOf = 3290 - TextUtils.indexOf((CharSequence) "", '0', i5, i5);
                        int iIndexOf2 = 31 - TextUtils.indexOf("", "", i5);
                        byte b2 = (byte) ($$c[1] + 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iIndexOf2, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = -1870535734;
                    f = 0.0f;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 61;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = TuitionPaymentFragmentbindingInflater1;
        if (iArr6 != null) {
            int i11 = $11 + 39;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr6[i12]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int deadChar = 3291 - KeyEvent.getDeadChar(0, 0);
                    int iBlue = 31 - Color.blue(0);
                    byte b4 = (byte) ($$c[i4] + i4);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, deadChar, iBlue, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr2[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i12++;
                iArr6 = iArr6;
                i4 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        int i13 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $10 + 115;
            $11 = i14 % 128;
            int i15 = i14 % i13;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            for (int i17 = 1; i16 > i17; i17 = 1) {
                int i18 = $11 + 17;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i16];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2559;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 29;
                    byte b6 = (byte) (-$$c[1]);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, offsetAfter, iNormalizeMetaState, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i16--;
            }
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28880 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 348 - View.MeasureSpec.getMode(0), 25 - View.MeasureSpec.makeMeasureSpec(0, 0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i13 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private boolean assetFileExists(String str) throws Throwable {
        int length;
        int i;
        boolean z;
        int i2;
        String string;
        Method method;
        Method[] declaredMethods;
        int length2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (str != null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            b = i5 % 128;
            if (i5 % 2 == 0) {
                length = str.length();
                int i6 = 79 / 0;
            } else {
                length = str.length();
            }
        } else {
            length = 0;
        }
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        Method[] methodArr = {AssetManager.class.getMethod((String) objArr[0], String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 2823;
            int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$d;
            byte b4 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b4, bArr[5], b4, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, capsMode, packedPositionGroup, 1814927978, false, (String) objArr2[0], null);
        }
        int i7 = 14;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            b = i8 % 128;
            if (i8 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2823 - TextUtils.indexOf("", "", 0), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredMethods();
                length2 = declaredMethods.length;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 2823, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredMethods();
                length2 = declaredMethods.length;
            }
            int i9 = 0;
            while (i9 < length2) {
                Method method2 = declaredMethods[i9];
                try {
                    int[] iArr = new int[i7];
                    // fill-array-data instruction
                    iArr[0] = 616231241;
                    iArr[1] = -901338603;
                    iArr[2] = 281046485;
                    iArr[3] = -541267334;
                    iArr[4] = -889020791;
                    iArr[5] = -1741254912;
                    iArr[6] = 1667154489;
                    iArr[7] = -809548829;
                    iArr[8] = 1832199642;
                    iArr[9] = -1563424366;
                    iArr[10] = 1358434698;
                    iArr[11] = 409660870;
                    iArr[12] = 1933427920;
                    iArr[13] = 1226335660;
                    Object[] objArr3 = new Object[1];
                    d(iArr, (Process.myPid() >> 22) + 24, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[i4]);
                    Object[] objArr4 = new Object[1];
                    d(new int[]{926776934, 1445276578, -1869803150, -1905415344, -1069754666, 408468875, -1768055277, -220174623}, (Process.myPid() >> 22) + 12, objArr4);
                    int iIntValue = ((Integer) cls.getMethod((String) objArr4[i4], null).invoke(method2, null)).intValue();
                    Object[] objArr5 = new Object[1];
                    objArr5[i4] = Integer.valueOf(iIntValue);
                    Object[] objArr6 = new Object[1];
                    d(new int[]{1929453495, -419584057, -2088919168, -383379745, 147657166, 894209203, 1534406717, -164968646, 6034273, 66481841, 1726533980, 418063876, 756022306, -336612709, -1452348055, 256398440}, ImageFormat.getBitsPerPixel(i4) + 27, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[i4]);
                    Object[] objArr7 = new Object[1];
                    d(new int[]{-1698087344, 890333363, -1960462708, 662252345, 842568699, 1773680387}, 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        d(new int[]{616231241, -901338603, 281046485, -541267334, -889020791, -1741254912, 1667154489, -809548829, 1832199642, -1563424366, 1358434698, 409660870, 1933427920, 1226335660}, Color.blue(0) + 24, objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        d(new int[]{-317390117, 1401918316, 140069857, -612472321, 1351463759, -1065346148, 339876913, 37695241, -1454704643, -1042600908}, ExpandableListView.getPackedPositionType(0L) + 13, objArr9);
                        if (cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                            Object[] objArr10 = new Object[1];
                            d(new int[]{616231241, -901338603, 281046485, -541267334, -889020791, -1741254912, 1667154489, -809548829, 1832199642, -1563424366, 1358434698, 409660870, 1933427920, 1226335660}, 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            d(new int[]{1410759811, -1206796034, -1458090399, -2037042938, 545706295, -141339390, -940327170, 788903539, -696766567, -321906960, -620440591, 1562627256}, 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                            if (objArr12.length == 2) {
                                int i10 = b + 61;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                int i11 = i10 % 2;
                                if (Long.TYPE.equals(objArr12[0])) {
                                    Object[] objArr13 = new Object[1];
                                    d(new int[]{616231241, -901338603, 281046485, -541267334, -889020791, -1741254912, 1667154489, -809548829, 1832199642, -1563424366, 1358434698, 409660870, 1933427920, 1226335660}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, objArr13);
                                    if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                            int iGreen = 2823 - Color.green(0);
                                            int i12 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            byte[] bArr2 = $$d;
                                            byte b5 = bArr2[7];
                                            Object[] objArr14 = new Object[1];
                                            c(b5, bArr2[5], b5, objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, iGreen, i12, 1814927978, false, (String) objArr14[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                                            int deadChar = 2823 - KeyEvent.getDeadChar(0, 0);
                                            int i13 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            byte[] bArr3 = $$d;
                                            byte b6 = bArr3[7];
                                            Object[] objArr15 = new Object[1];
                                            c(b6, bArr3[5], b6, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar, i13, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        try {
                                            Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                                int iIndexOf = TextUtils.indexOf("", "", 0) + 2823;
                                                int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 22;
                                                byte[] bArr4 = $$d;
                                                Object[] objArr17 = new Object[1];
                                                c(bArr4[10], bArr4[7], bArr4[5], objArr17);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iIndexOf, offsetBefore2, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i9++;
                    i4 = 0;
                    i7 = 14;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iMakeMeasureSpec = 2823 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int minimumFlingVelocity2 = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr5 = $$d;
            byte b7 = bArr5[7];
            Object[] objArr18 = new Object[1];
            c(b7, bArr5[5], b7, objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iMakeMeasureSpec, minimumFlingVelocity2, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int defaultSize = View.getDefaultSize(0, 0) + 2823;
            int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr6 = $$d;
            Object[] objArr20 = new Object[1];
            c((byte) 14, bArr6[7], bArr6[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, defaultSize, maxKeyCode, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37658);
            int i14 = 2721 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i15 = 20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr7 = $$d;
            Object[] objArr22 = new Object[1];
            c((byte) 14, bArr7[7], bArr7[5], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, i14, i15, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j = -1633679881;
        long j2 = (((long) 141) * j) + (((long) (-279)) * jLongValue);
        long j3 = 140;
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        long j4 = -1;
        long j5 = (j ^ j4) | jLongValue;
        long j6 = elapsedCpuTime ^ j4;
        long j7 = j2 + ((jLongValue | elapsedCpuTime) * j3) + (((long) (-280)) * ((j5 ^ j4) | ((j6 | jLongValue) ^ j4))) + (j3 * (((j5 | elapsedCpuTime) ^ j4) | (((jLongValue ^ j4) | j) ^ j4) | ((j6 | j) ^ j4))) + ((long) (-176725964));
        int iMyTid = Process.myTid();
        int i16 = ((int) (j7 >> 32)) & (803771306 + (((~((-1141490006) | iMyTid)) | (-1437193558)) * (-502)) + ((~((~iMyTid) | (-1141457153))) * (-502)) + (((~(iMyTid | (-295736406))) | (-1141490006)) * TypedValues.PositionType.TYPE_DRAWPATH));
        int iMyPid = Process.myPid();
        int i17 = ~(1394565113 | iMyPid);
        int i18 = ~iMyPid;
        int i19 = i16 | (((int) j7) & ((-554362225) + ((i17 | (~((-34231729) | i18))) * (-406)) + ((~((-8429569) | i18)) * (-406)) + (((~(iMyPid | 42661296)) | (~((-1394565114) | i18))) * 406)));
        int i20 = i19 >>> 24;
        int i21 = i19 & ViewCompat.MEASURED_SIZE_MASK;
        if (i20 != 0) {
            int i22 = b + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
            i = 2;
            int i23 = i22 % 2;
            z = true;
        } else {
            i = 2;
            z = false;
        }
        if (z) {
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            b = i24 % 128;
            int i25 = i24 % i;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!z || i21 >= 1 || (method = methodArr[i21]) == null) {
            string = null;
        } else {
            int i26 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
            int i27 = i26 % 2;
            string = method.toString();
        }
        arrayList.add(string);
        if ((i20 + 6) * i2 != 0) {
            int[] iArr2 = new int[length];
            int i28 = length - 1;
            iArr2[i28] = 1;
            Toast.makeText((Context) null, iArr2[((length * i28) % 2) - 1], 1).show();
        }
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
            int i3 = b + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
        }
        DevelopmentPlatform developmentPlatform = this.developmentPlatform;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        b = i5 % 128;
        int i6 = i5 % 2;
        return developmentPlatform;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, byte r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.$$c
            int r7 = r7 * 56
            int r7 = r7 + 66
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2d:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.$$g(short, int, byte):java.lang.String");
    }
}
