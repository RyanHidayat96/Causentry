package com.bpjstku.util.constant;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.bpjstku.util.constant.MaritalStatusCode[], still in use, count: 1, list:
  (r0v4 com.bpjstku.util.constant.MaritalStatusCode[]) from 0x003e: INVOKE (r0v4 com.bpjstku.util.constant.MaritalStatusCode[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/bpjstku/util/constant/MaritalStatusCode;", "Landroid/os/Parcelable;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MaritalStatusCode implements Parcelable {
    T("BELUM KAWIN"),
    Y("KAWIN"),
    H("CERAI HIDUP"),
    M("CERAI MATI");

    public static final Parcelable.Creator<MaritalStatusCode> CREATOR;
    private final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private MaritalStatusCode(String str) {
        super(str, i);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    static {
        EnumEntriesKt.enumEntries(new MaritalStatusCode[]{T, Y, H, r0});
        CREATOR = new Parcelable.Creator<MaritalStatusCode>() { // from class: com.bpjstku.util.constant.MaritalStatusCode.b
            private static final byte[] $$c = {32, 1, 70, -122};
            private static final int $$f = 252;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {21, -108, 100, 114, -28, -10, 10, -11, 19, 49, -15, -28, -10, 10, -11, 19, 32, -42, 3, -4, 4, 5, 5, 41, -49, 6, 17, -11, 6, 15, -9, 27, -36, 13, -4, 14, 5, -13, 13, 8, 25, -19, -10, 13, 0, 5, 48};
            private static final int $$e = 102;
            private static final byte[] $$a = {57, -56, 23, -36, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
            private static final int $$b = 16;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int b = 1;
            private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 14880;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.bpjstku.util.constant.MaritalStatusCode.b.$$a
                    int r7 = r7 * 52
                    int r7 = 55 - r7
                    int r8 = r8 * 52
                    int r1 = 53 - r8
                    int r6 = 103 - r6
                    byte[] r1 = new byte[r1]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                L17:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2e:
                    int r6 = r6 + r7
                    int r6 = r6 + (-11)
                    r7 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.MaritalStatusCode.b.a(int, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 43
                    int r0 = 44 - r6
                    int r7 = r7 * 31
                    int r7 = 98 - r7
                    byte[] r1 = com.bpjstku.util.constant.MaritalStatusCode.b.$$d
                    int r8 = r8 + 4
                    byte[] r0 = new byte[r0]
                    int r6 = 43 - r6
                    r2 = 0
                    if (r1 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r8 = r8 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L2e:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + 2
                    r8 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.MaritalStatusCode.b.d(short, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:27:0x027e  */
            /* JADX WARN: Code duplicated, block: B:28:0x0280  */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MaritalStatusCode createFromParcel(Parcel parcel) throws Throwable {
                Object[] objArr;
                int i;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                MaritalStatusCode maritalStatusCodeValueOf = MaritalStatusCode.valueOf(parcel.readString());
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                    int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = (byte) (bArr[51] - 1);
                    byte b3 = (byte) (-bArr[5]);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, i3, doubleTapTimeout, 252381699, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{42066, 61670, 20891, 57681}, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0), new char[]{34165, 25771, 46580, 32546, 6251, 10875, 32381, 35249, 45236, 48987, 730, 60814, 12126, 28823, 17148, 49972, 52274, 490, 56871, 36238, 57917, 55788}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{63914, 40440, 13357, 2018}, (char) (57908 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.resolveSizeAndState(0, 0, 0) + 765327609, new char[]{7827, 50976, 51323, 16370, 60571, 29544, 24804, 49659, 30698, 53319, 23108, 7052, 33139, 11786, 27436}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int iIndexOf = TextUtils.indexOf("", "") + 876;
                    int mode = 10 - View.MeasureSpec.getMode(0);
                    byte[] bArr2 = $$a;
                    Object[] objArr5 = new Object[1];
                    a(bArr2[54], (byte) (-bArr2[5]), bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, iIndexOf, mode, 2009631821, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                        int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, b4, (byte) (-bArr3[5]), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i4, iIndexOf2, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = ~iIdentityHashCode;
                    int i6 = (-9308604) + (((~(i5 | (-498017114))) | 497615441 | (~((-537925671) | iIdentityHashCode))) * 717) + (((~(iIdentityHashCode | (-498017114))) | (~(i5 | (-537925671))) | 497615441) * 717) + 2085294967;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{49342, 27402, 24639, 33274}, (char) (64095 - ExpandableListView.getPackedPositionChild(0L)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{8567, 12576, 48727, 39316, 38893, 43434, 33087, 5923, 5795, 46983, 14008, 30612, 9250, 37450, 2140, 35152, 6838, 57482, 8873, 29703, 13038, 28878, 59051, 54639, 1269, 21769}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{27579, 8778, 9102, 35812}, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58403), KeyEvent.getDeadChar(0, 0), new char[]{33650, 7140, 55511, 51313, 64916, 45037, 62315, 64057, 47189, 54270, 41751, 32272, 7841, 14947, 28445, 64699, 39478, 48657}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                            b = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i10 = 24 / 0;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    applicationContext = null;
                                }
                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{3811, 40960, 64401, 52641}, (char) (TextUtils.indexOf("", "", 0, 0) + 41467), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{39873, 51705, 36311, 35475, 44347, 64057, 61646, 8955, 2373, 8846, 4653, 54183, 61353, 61115, 31722, 34874}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{24865, 43916, 22624, 63072}, (char) (TextUtils.getCapsMode("", 0, 0) + 24664), TextUtils.indexOf("", "", 0, 0), new char[]{34914, 61496, 21870, 4461, 59849, 26677, 49567, 3556, 35331, 8869, 23082, 20747, 60167, 31348, 36070, 7299}, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 2085294967};
                        byte[] bArr4 = $$d;
                        byte b5 = bArr4[44];
                        byte b6 = (byte) (b5 + 1);
                        Object[] objArr13 = new Object[1];
                        d(b5, b6, (byte) (-b6), objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = bArr4[44];
                        Object[] objArr14 = new Object[1];
                        d((byte) (b7 + 1), b7, (byte) (-bArr4[17]), objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                i = 22;
                                char cMyTid = (char) (Process.myTid() >> 22);
                                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 876;
                                int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[7];
                                Object[] objArr16 = new Object[1];
                                a(b8, b8, (byte) (-bArr5[5]), objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, iIndexOf3, i11, 256017550, false, (String) objArr16[0], null);
                            } else {
                                i = 22;
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                char[] cArr = new char[i];
                                // fill-array-data instruction
                                cArr[0] = 34165;
                                cArr[1] = 25771;
                                cArr[2] = 46580;
                                cArr[3] = 32546;
                                cArr[4] = 6251;
                                cArr[5] = 10875;
                                cArr[6] = 32381;
                                cArr[7] = 35249;
                                cArr[8] = 45236;
                                cArr[9] = 48987;
                                cArr[10] = 730;
                                cArr[11] = 60814;
                                cArr[12] = 12126;
                                cArr[13] = 28823;
                                cArr[14] = 17148;
                                cArr[15] = 49972;
                                cArr[16] = 52274;
                                cArr[17] = 490;
                                cArr[18] = 56871;
                                cArr[19] = 36238;
                                cArr[20] = 57917;
                                cArr[21] = 55788;
                                Object[] objArr17 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{42066, 61670, 20891, 57681}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), ViewConfiguration.getScrollDefaultDelay() >> 16, cArr, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{0, 0, 0, 0}, new char[]{63914, 40440, 13357, 2018}, (char) (57909 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 765327608 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{7827, 50976, 51323, 16370, 60571, 29544, 24804, 49659, 30698, 53319, 23108, 7052, 33139, 11786, 27436}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                    int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                                    byte[] bArr6 = $$a;
                                    byte b9 = bArr6[54];
                                    byte b10 = (byte) (-bArr6[5]);
                                    byte b11 = bArr6[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b9, b10, b11, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, offsetBefore, edgeSlop, 2009631821, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cIndexOf = (char) TextUtils.indexOf("", "");
                                    int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                                    int iGreen = 10 - Color.green(0);
                                    byte[] bArr7 = $$a;
                                    byte b12 = (byte) (bArr7[51] - 1);
                                    byte b13 = (byte) (-bArr7[5]);
                                    Object[] objArr20 = new Object[1];
                                    a(b12, b13, b13, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i12, iGreen, 252381699, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                                b = i13 % 128;
                                int i14 = i13 % 2;
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr15;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                    throw null;
                }
                int i15 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i16 = ~iMaxMemory;
                int i17 = i15 + 2070192700 + (((~((-33141549) | i16)) | (~((-7168681) | iMaxMemory))) * (-370)) + (((~(iMaxMemory | (-33141549))) | (~(i16 | (-7168681))) | (-33420205)) * (-370)) + 519426038;
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
                return maritalStatusCodeValueOf;
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
                    int i4 = $11 + 113;
                    $10 = i4 % 128;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 8328);
                            int iNormalizeMetaState = 1235 - KeyEvent.normalizeMetaState(0);
                            int iMyTid = (Process.myTid() >> 22) + 35;
                            byte b2 = (byte) ($$c[1] - 1);
                            byte b3 = (byte) (b2 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iNormalizeMetaState, iMyTid, -653973969, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char gidForName = (char) (Process.getGidForName("") + 1);
                                int defaultSize = 2764 - View.getDefaultSize(0, 0);
                                int iGreen = 14 - Color.green(0);
                                byte b4 = (byte) ($$c[1] - 1);
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, defaultSize, iGreen, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - Process.getGidForName("")), (ViewConfiguration.getFadingEdgeLength() >> 16) + 253, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 65200);
                                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2892;
                                        int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16;
                                        byte b6 = $$c[1];
                                        byte b7 = (byte) (b6 - 1);
                                        byte b8 = b6;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, modifierMetaStateMask, i6, 2012627446, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    int i7 = $11 + 103;
                                    $10 = i7 % 128;
                                    int i8 = i7 % 2;
                                    i2 = 2;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MaritalStatusCode[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                b = i3 % 128;
                if (i3 % 2 != 0) {
                    return new MaritalStatusCode[i];
                }
                MaritalStatusCode[] maritalStatusCodeArr = new MaritalStatusCode[i];
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r5, int r6, short r7) {
                /*
                    int r7 = r7 * 2
                    int r0 = r7 + 1
                    byte[] r1 = com.bpjstku.util.constant.MaritalStatusCode.b.$$c
                    int r5 = r5 * 3
                    int r5 = 3 - r5
                    int r6 = 104 - r6
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r6
                    r6 = r7
                    r4 = r2
                    goto L27
                L15:
                    r3 = r2
                L16:
                    int r5 = r5 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L25:
                    r3 = r1[r5]
                L27:
                    int r6 = r6 + r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.MaritalStatusCode.b.$$g(byte, int, short):java.lang.String");
            }
        };
    }

    public static MaritalStatusCode valueOf(String str) {
        return (MaritalStatusCode) Enum.valueOf(MaritalStatusCode.class, str);
    }

    public static MaritalStatusCode[] values() {
        return (MaritalStatusCode[]) b.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
