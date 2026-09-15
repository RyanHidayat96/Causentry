package com.bpjstku.data.registration.pmi.model.response;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeLocationsItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeLocationsItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BranchOfficeLocationsItem extends BaseItem {
    public static final int $stable = 8;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName("kantorCabang")
    private final List<BranchOfficeItem> data;
    private static final byte[] $$c = {12, 11, -9, -106};
    private static final int $$d = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {77, -106, 83, 4};
    private static final int $$b = 108;
    private static int b = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem.$$a
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = r8 + 98
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L33
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L33:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem.c(byte, byte, byte, java.lang.Object[]):void");
    }

    public BranchOfficeLocationsItem(List<BranchOfficeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    public final List<BranchOfficeItem> getData() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 125;
        g = i3 % 128;
        int i4 = i3 % 2;
        List<BranchOfficeItem> list = this.data;
        int i5 = i2 + 7;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 107;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.red(0) + 2187, (Process.myTid() >> 22) + 40, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.indexOf("", "")), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3011, 26 - (ViewConfiguration.getEdgeSlop() >> 16), 321985076, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 36506), AndroidCharacter.getMirror('0') + 3328, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 53;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (-b8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 36505), KeyEvent.getDeadChar(0, 0) + 3376, Color.blue(0) + 17, -968507904, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i9 = $11 + 69;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentbindingInflater1();
        int i = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BranchOfficeLocationsItem copy$default(BranchOfficeLocationsItem branchOfficeLocationsItem, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 61;
        g = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
            int i6 = i3 + 23;
            g = i6 % 128;
            int i7 = i6 % 2;
            list = branchOfficeLocationsItem.data;
        }
        BranchOfficeLocationsItem branchOfficeLocationsItemCopy = branchOfficeLocationsItem.copy(list);
        int i8 = g + 93;
        b = i8 % 128;
        int i9 = i8 % 2;
        return branchOfficeLocationsItemCopy;
    }

    public final List<BranchOfficeItem> component1() {
        int i = 2 % 2;
        int i2 = b + 109;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        List<BranchOfficeItem> list = this.data;
        int i5 = i3 + 53;
        b = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BranchOfficeLocationsItem copy(List<BranchOfficeItem> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        BranchOfficeLocationsItem branchOfficeLocationsItem = new BranchOfficeLocationsItem(p0);
        int i2 = b + 115;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return branchOfficeLocationsItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = g + 125;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (p0 instanceof BranchOfficeLocationsItem) {
            return Intrinsics.areEqual(this.data, ((BranchOfficeLocationsItem) p0).data);
        }
        int i5 = i3 + 15;
        g = i5 % 128;
        return i5 % 2 == 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 105;
        g = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode();
        int i4 = g + 55;
        b = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        List<BranchOfficeItem> list = this.data;
        StringBuilder sb = new StringBuilder("BranchOfficeLocationsItem(data=");
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 49;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 2321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{45557, 13185, 46340, 14003, 47174, 15823, 49007, 8441, 41609, 9264, 43411, 11081, 44250, 11876, 37885, 5517, 38664, 6327, 39492, 45547, 13203, 46377, 13986, 47181, 15828, 49007, 8408, 41603, 9264, 43412, 11075, 44246, 11903, 37887, 5513, 38681, 6304, 45565, 13212, 46372, 13988, 47179, 15827, 49004, 8368, 41603, 9265, 43518, 11106, 44241, 11880, 37869, 5513, 45491, 13185, 46393, 13989, 47115, 15825, 49005, 8428, 41602, 9255, 43452, 11017, 44240, 11887, 37882, 5531, 38683, 6397, 39508, 8132, 33125, 761, 33921, 1552, 35755, 3341, 36563, 28787, 62950, 30616, 63773, 31392, 64552, 25069, 58228, 25828, 59013, 26649, 60845, 28460, 45554, 13213, 46384, 45491, 13186, 46386, 14009, 47175, 15765, 49019, 8423, 41631, 9325, 43451, 11075, 44230, 11876, 37885, 5506, 38739, 6324, 39508, 8132, 33125, 761, 33933, 1569, 35753, 3404, 36561, 28772, 62968, 30607, 63772, 32524, 45491, 13185, 46393, 13989, 47115, 15825, 49005, 8428, 41602, 9255, 43452, 11017, 44240, 11887, 37882, 5531, 38683, 6397, 39508, 8132, 33125, 761, 33921, 1552, 35755, 3341, 36548, 28788, 62965, 30601, 63761, 31392, 64571, 25069, 58223, 25848};
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -9019302577541925902L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, int r6, short r7) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 109
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r5]
            int r3 = r3 + 1
        L27:
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem.$$e(short, int, short):java.lang.String");
    }
}
