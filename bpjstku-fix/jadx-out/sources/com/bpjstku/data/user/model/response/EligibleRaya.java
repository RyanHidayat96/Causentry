package com.bpjstku.data.user.model.response;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ:\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/user/model/response/EligibleRaya;", "", "", "p0", "", "Lcom/bpjstku/data/user/model/response/Kpj;", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/bpjstku/data/user/model/response/EligibleRaya;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isEligible", "Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EligibleRaya {
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final List<Kpj> data;

    @SerializedName("isEligible")
    private final String isEligible;

    @SerializedName("tglLahir")
    private final String tglLahir;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$d = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {58, 66, -1, 15};
    private static final int $$b = 53;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int g = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.data.user.model.response.EligibleRaya.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L2e:
            int r7 = r7 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.response.EligibleRaya.c(int, byte, short, java.lang.Object[]):void");
    }

    public EligibleRaya(String str, List<Kpj> list, String str2) {
        this.isEligible = str;
        this.data = list;
        this.tglLahir = str2;
    }

    public final String isEligible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.isEligible;
        int i4 = i3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<Kpj> getData() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        List<Kpj> list = this.data;
        int i5 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = g + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.tglLahir;
        int i4 = i3 + 45;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x022f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0230  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            f = 0.0f;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $11 + 83;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 2;
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 2187 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 40, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.red(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3011, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 36505);
                    int iMyTid = 3376 - (Process.myTid() >> 22);
                    int keyRepeatDelay = 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b6 = (byte) ($$d & 3);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iMyTid, keyRepeatDelay, -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (36506 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int iAxisFromString = 3375 - MotionEvent.axisFromString("");
                    int i8 = 17 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1));
                    byte b8 = (byte) ($$d & 3);
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAxisFromString, i8, -968507904, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 36505);
                int iCombineMeasuredStates = 3376 - View.combineMeasuredStates(0, 0);
                int maximumFlingVelocity = 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b10 = (byte) ($$d & 3);
                byte b11 = (byte) (b10 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, iCombineMeasuredStates, maximumFlingVelocity, -968507904, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i9 = $11 + 87;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 3;
            }
            f = 0.0f;
        }
        objArr[0] = new String(cArr);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = b + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EligibleRaya copy$default(EligibleRaya eligibleRaya, String str, List list, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 7;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            str = eligibleRaya.isEligible;
        }
        if ((i & 2) != 0) {
            list = eligibleRaya.data;
        }
        if ((i & 4) != 0) {
            str2 = eligibleRaya.tglLahir;
        }
        return eligibleRaya.copy(str, list, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = g + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.isEligible;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final List<Kpj> component2() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        List<Kpj> list = this.data;
        int i5 = i2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tglLahir;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final EligibleRaya copy(String p0, List<Kpj> p1, String p2) {
        int i = 2 % 2;
        EligibleRaya eligibleRaya = new EligibleRaya(p0, p1, p2);
        int i2 = g + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return eligibleRaya;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            int i2 = g + 89;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(p0 instanceof EligibleRaya)) {
            return false;
        }
        EligibleRaya eligibleRaya = (EligibleRaya) p0;
        if (!Intrinsics.areEqual(this.isEligible, eligibleRaya.isEligible)) {
            int i4 = g + 35;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.data, eligibleRaya.data)) {
            int i6 = g + 117;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tglLahir, eligibleRaya.tglLahir)) {
            return false;
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 49;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.isEligible;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<Kpj> list = this.data;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.tglLahir;
        if (str2 != null) {
            int i4 = g + 85;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = str2.hashCode();
            int i6 = g + 29;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.isEligible;
        List<Kpj> list = this.data;
        String str2 = this.tglLahir;
        StringBuilder sb = new StringBuilder("EligibleRaya(isEligible=");
        sb.append(str);
        sb.append(", data=");
        sb.append(list);
        sb.append(", tglLahir=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i2 = g + 23;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
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
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 2272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.response.EligibleRaya.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{45557, 28666, 3570, 11206, 51626, 59264, 34181, 41832, 16721, 32595, 7437, 15124, 55566, 63203, 38111, 45764, 20664, 3740, 11394, 63186, 10449, 19174, 27886, 36504, 41122, 49852, 58480, 1634, 14442, 23091, 31783, 40507, 45505, 54244, 62969, 6032, 18866, 40966, 32284, 7209, 14890, 55388, 63079, 38013, 45786, 20640, 28329, 3227, 10948, 51454, 59156, 34100, 41787, 45491, 28666, 3535, 11216, 51687, 59294, 34183, 41853, 16730, 32580, 7458, 15188, 55556, 63208, 38104, 45778, 20651, 3798, 11410, 51809, 59481, 34374, 42043, 16913, 24579, 446, 16349, 56798, 64418, 39311, 46991, 21881, 29512, 4470, 53026, 60721, 35593, 43254, 18151, 25821, 45554, 28646, 3526, 61281, 12587, 21270, 29982, 38777, 47368, 56131, 64932, 8085, 8668, 17399, 26060, 34752, 43057, 51725, 60441, 3633, 20557, 29248, 38067, 46731, 55444, 64229, 7410, 16083, 24365, 24845, 33563, 42350, 51018, 59740, 52229, 45491, 28666, 3535, 11216, 51687, 59294, 34183, 41853, 16730, 32580, 7458, 15188, 55556, 63208, 38104, 45778, 20651, 3798, 11410, 51809, 59481, 34374, 42043, 16913, 24579, 446, 16330, 56793, 64433, 39326, 46979, 21881, 29531, 4470, 53049, 60717};
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1219997331604148343L;
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
    private static java.lang.String $$e(int r6, short r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.data.user.model.response.EligibleRaya.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.user.model.response.EligibleRaya.$$e(int, short, byte):java.lang.String");
    }
}
