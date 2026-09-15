package com.bpjstku.domain.jkp.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/bpjstku/domain/jkp/model/JkpTrackClaim;", "Landroid/os/Parcelable;", "", "Lcom/bpjstku/domain/jkp/model/ClaimStep;", "p0", "Lcom/bpjstku/domain/jkp/model/ClaimTitle;", "p1", "<init>", "(Ljava/util/List;Lcom/bpjstku/domain/jkp/model/ClaimTitle;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/jkp/model/ClaimTitle;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JkpTrackClaim implements Parcelable {
    public static final Parcelable.Creator<JkpTrackClaim> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    public final ClaimTitle TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<ClaimStep> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public JkpTrackClaim(List<ClaimStep> list, ClaimTitle claimTitle) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(claimTitle, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = claimTitle;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JkpTrackClaim)) {
            return false;
        }
        JkpTrackClaim jkpTrackClaim = (JkpTrackClaim) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        List<ClaimStep> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ClaimTitle claimTitle = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("JkpTrackClaim(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(list);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(claimTitle);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<ClaimStep> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        p0.writeInt(list.size());
        Iterator<ClaimStep> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.writeToParcel(p0, p1);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<JkpTrackClaim> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {117, 50, 102, 124, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -68, -5, 15, -17, 15, -5, -6, 6, 56, -69, 12, -9, -3, -6, 14, 54, -36, -37, 15, -17, 15, -5, -6, 6, 37, -48, 6};
        private static final int $$e = 19;
        private static final byte[] $$a = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 35;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long b = 3953714635002086478L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.bpjstku.domain.jkp.model.JkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                int r6 = r6 * 4
                int r6 = r6 + 84
                int r7 = r7 * 52
                int r7 = r7 + 4
                int r5 = r5 * 15
                int r1 = r5 + 38
                byte[] r1 = new byte[r1]
                int r5 = r5 + 37
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r5
                r6 = r7
                r3 = r2
                goto L2b
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r5) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
            L2b:
                int r7 = r7 + 1
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jkp.model.JkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 43
                int r9 = 46 - r9
                int r8 = 99 - r8
                int r7 = r7 * 43
                int r7 = 44 - r7
                byte[] r0 = com.bpjstku.domain.jkp.model.JkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2c:
                int r9 = -r9
                int r8 = r8 + r9
                int r8 = r8 + (-1)
                r9 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jkp.model.JkpTrackClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0194  */
        /* JADX WARN: Code duplicated, block: B:48:0x0195  */
        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            Object obj;
            Throwable cause;
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (true) {
                obj = null;
                if (getrealtimecapturelatency.b >= cArr.length) {
                    break;
                }
                int i3 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - TextUtils.indexOf("", "", 0, 0)), (Process.myTid() >> 22) + 2624, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0', 0)), 481 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0') + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            throw th;
                        }
                        throw cause2;
                    }
                } catch (Throwable th2) {
                    Throwable cause3 = th2.getCause();
                    if (cause3 == null) {
                        throw th2;
                    }
                    throw cause3;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i4 = $10 + 107;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $11 + 121;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 39423), 481 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.green(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                }
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Color.green(0)), Color.blue(0) + 481, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    cause = th3.getCause();
                    if (cause != null) {
                        throw th3;
                    }
                    throw cause;
                }
                cause = th3.getCause();
                if (cause != null) {
                    throw th3;
                }
                throw cause;
            }
            objArr[0] = new String(cArr2);
        }

        private static JkpTrackClaim[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) throws Throwable {
            Object[] objArr;
            int i2 = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 43043);
                int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3111;
                int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, i3, fadingEdgeLength, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{44340, 42978, 47235, 36268, 34398, 39681, 60455, 59028, 64498, 52359, 49409, 55893, 12032, 8227, 15103, 3975, 168, 5503, 28283, 25377, 30146, 20211}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2777, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{44336, 60304, 8294, 32478, 46978, 52349, 2759, 17304, 39032, 54981, 28579, 42082, 58064, 15277, 28686}, 18090 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 43042);
                int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                int iMyPid = 22 - (Process.myPid() >> 22);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a(b4, bArr2[7], b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, i4, iMyPid, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 43042);
                    int iAlpha = 3111 - Color.alpha(0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b5, b5, bArr3[40], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iAlpha, threadPriority, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i7 = ((int[]) objArr7[2])[0];
                int i8 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int i9 = ~i;
                int i10 = (-1257338836) + (((~((-446207429) | i9)) | (~((-1258824031) | i))) * 217) + (((~((-446207429) | i)) | 168296772) * 217) + (((~(i9 | (-1258824031))) | 446207428) * 217) + 1353459916;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                objArr = new Object[]{new int[]{i12 ^ (i12 << 5)}, new int[]{i8}, new int[]{i7}, strArr};
            } else {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object[] objArr8 = {null, Integer.valueOf(i), 0, 1353459916};
                    byte[] bArr4 = $$d;
                    byte b6 = bArr4[5];
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr9 = new Object[1];
                    d(b7, b7, b6, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b8 = bArr4[5];
                    byte b9 = b8;
                    Object[] objArr10 = new Object[1];
                    d(b8, b9, (byte) (b9 - 1), objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode = (char) (43042 - TextUtils.getCapsMode("", 0, 0));
                        int defaultSize = View.getDefaultSize(0, 0) + 3111;
                        int i15 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr11 = new Object[1];
                        a(b10, b10, bArr5[40], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, defaultSize, i15, 154975793, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(new char[]{44340, 42978, 47235, 36268, 34398, 39681, 60455, 59028, 64498, 52359, 49409, 55893, 12032, 8227, 15103, 3975, 168, 5503, 28283, 25377, 30146, 20211}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2777, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(new char[]{44336, 60304, 8294, 32478, 46978, 52349, 2759, 17304, 39032, 54981, 28579, 42082, 58064, 15277, 28686}, ImageFormat.getBitsPerPixel(0) + 18090, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int iGreen = Color.green(0) + 3111;
                            int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            Object[] objArr14 = new Object[1];
                            a(b11, bArr6[7], b11, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iGreen, tapTimeout, -1269618118, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                            int iAlpha2 = 3111 - Color.alpha(0);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[5];
                            byte b13 = bArr7[7];
                            Object[] objArr15 = new Object[1];
                            a(b12, b13, b13, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iAlpha2, iIndexOf, -1272852037, false, (String) objArr15[0], null);
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
                if (strArr2 == null) {
                    throw null;
                }
                for (String str : strArr2) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iMyPid2 = Process.myPid();
            int i21 = ~iMyPid2;
            int i22 = i18 + 1913532771 + (((~((-1025369398) | i21)) | (~((-679662062) | iMyPid2))) * 217) + (((~(iMyPid2 | (-1025369398))) | 671138085) * 217) + (((~((-679662062) | i21)) | 1025369397) * 217);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
            Object[] objArr16 = {new int[1], new int[]{i20}, new int[]{i19}, strArr3};
            return new JkpTrackClaim[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ JkpTrackClaim createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(ClaimStep.CREATOR.createFromParcel(parcel));
            }
            JkpTrackClaim jkpTrackClaim = new JkpTrackClaim(arrayList, ClaimTitle.CREATOR.createFromParcel(parcel));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            return jkpTrackClaim;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JkpTrackClaim[] newArray(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            JkpTrackClaim[] jkpTrackClaimArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                return jkpTrackClaimArrTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            throw null;
        }
    }
}
