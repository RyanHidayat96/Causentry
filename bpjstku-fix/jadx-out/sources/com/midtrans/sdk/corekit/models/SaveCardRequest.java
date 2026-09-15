package com.midtrans.sdk.corekit.models;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SaveCardRequest implements Serializable {

    @SerializedName("status_code")
    private String code;

    @SerializedName("cardhash")
    private String maskedCard;

    @SerializedName("token_id")
    private String savedTokenId;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;
    private String type;
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$d = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {87, 51, -85, 78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 20;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8385992391384086111L;

    private static void c(int i, short s, byte b2, Object[] objArr) {
        int i2 = 84 - (s * 4);
        byte[] bArr = $$a;
        int i3 = 3 - (b2 * 2);
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 53];
        int i5 = i4 + 52;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i3 + i2) - 11;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + bArr[i8]) - 11;
            i3 = i8;
            i6 = i7;
        }
    }

    public void setSavedTokenId(String str) throws Throwable {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - ((Process.getThreadPriority(0) + 20) >> 6)), 40 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        char c = '0';
        Object[] objArr = new Object[1];
        a(new char[]{20458, 20363, 52114, 38853, 65249, 30536, 18167, 25489, 16225, 23217, 55251, 62185, 44621, 43447, 25845, 33128, 7487, 14675, 62859, 4218, 35863, 34895, 33423, 44828, 31741, 1795}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(new char[]{10030, 10059, 63791, 42362, 61919, 15927, 18892, 10988, 22457, 26626, 55533, 48106, 50819, 39706, 27529, 51248, 30187, 3058, 64164}, -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 881;
        long j2 = (j * 4039150544321929699L) + (j * (-1941893369579970712L));
        long j3 = -880;
        long j4 = -1;
        long j5 = j4 ^ 4039150544321929699L;
        long j6 = j4 ^ (-1941893369579970712L);
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j7 = j2 + ((((j5 | j6) ^ j4) | ((j5 | jMaxMemory) ^ j4) | ((j6 | jMaxMemory) ^ j4)) * j3);
        long j8 = ((j5 | (jMaxMemory ^ j4)) ^ j4) | (-1941893369579970712L);
        long j9 = (jMaxMemory | 4039150544321929699L) ^ j4;
        long j10 = j7 + (j3 * (j8 | j9)) + (((long) 880) * j9);
        int i3 = b + 85;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        long j11 = jLongValue;
        while (true) {
            if (i5 == 10) {
                int length = str != null ? str.length() : 0;
                try {
                    Object[] objArr3 = {2001428567};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 45990), 1135 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 18 - Color.alpha(0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, -368119032, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int iRed = Color.red(0) + 1031;
                        int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iRed, iResolveOpacity, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.alpha(0)), 1118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - TextUtils.indexOf("", "", 0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    if (((int[]) objArr6[3])[0] == ((int[]) objArr6[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i6 = b + 111;
                        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                        int i7 = i6 % 2;
                        for (String str2 : strArr) {
                            arrayList.add(str2);
                        }
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37835 - TextUtils.indexOf("", c, 0)), Color.rgb(0, 0, 0) + 16777275, 18 - ExpandableListView.getPackedPositionType(0L), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i9 = 0;
            long j12 = j11;
            while (true) {
                for (int i10 = 0; i10 != 8; i10++) {
                    i8 = (((((int) (j12 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                }
                if (i9 != 0) {
                    break;
                }
                int i11 = TuitionPaymentFragmentbindingInflater1 + 63;
                b = i11 % 128;
                int i12 = i11 % 2;
                i9++;
                j12 = j10;
            }
            if (i8 == i2) {
                break;
            }
            int i13 = TuitionPaymentFragmentbindingInflater1 + 5;
            b = i13 % 128;
            j11 = i13 % 2 == 0 ? j11 / 1024 : j11 - 1024;
            i5++;
            c = '0';
        }
        this.savedTokenId = str;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 83;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 27;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char defaultSize = (char) (64838 - View.getDefaultSize(0, 0));
                    int iNormalizeMetaState = 1356 - KeyEvent.normalizeMetaState(0);
                    int mode = 38 - View.MeasureSpec.getMode(0);
                    byte b2 = $$c[0];
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iNormalizeMetaState, mode, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 47773), Drawable.resolveOpacity(0, 0) + 468, 12 - TextUtils.lastIndexOf("", '0', 0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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

    public SaveCardRequest() {
    }

    public SaveCardRequest(String str, String str2, String str3) {
        this.type = str3;
        this.savedTokenId = str;
        this.maskedCard = str2;
    }

    public String getCode() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.code;
        int i4 = i2 + 77;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return str;
    }

    public String getMaskedCard() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 53;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.maskedCard;
        int i5 = i2 + 73;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getSavedTokenId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 7;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.savedTokenId;
        int i5 = i2 + 59;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public String getTransactionId() {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionId;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public String getType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCode(String str) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.code = str;
        if (i4 != 0) {
            int i5 = 59 / 0;
        }
        int i6 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setMaskedCard(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        this.maskedCard = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setTransactionId(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 63;
        b = i3 % 128;
        int i4 = i3 % 2;
        this.transactionId = str;
        int i5 = i2 + 117;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r8 = r8 + 107
            byte[] r0 = com.midtrans.sdk.corekit.models.SaveCardRequest.$$c
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.models.SaveCardRequest.$$e(byte, int, short):java.lang.String");
    }
}
