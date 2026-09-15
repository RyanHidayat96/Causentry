package com.bpjstku.util.constant;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.getPreviewCapabilities;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.util.constant.EducationCode[], still in use, count: 1, list:
  (r0v1 com.bpjstku.util.constant.EducationCode[]) from 0x0082: INVOKE (r0v1 com.bpjstku.util.constant.EducationCode[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Lcom/bpjstku/util/constant/EducationCode;", "Landroid/os/Parcelable;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "g", "asInterface", "asBinder", "a", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EducationCode implements Parcelable {
    P01("SD SEDERAJAT"),
    P02("SMP SEDERAJAT"),
    P03("SMA SEDERAJAT"),
    P04("D1"),
    P05("D2"),
    P06("D3"),
    P07("D4/S1"),
    P08("S2"),
    P09("S3"),
    P10("TIDAK SEKOLAH");

    public static final Parcelable.Creator<EducationCode> CREATOR;
    private final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private EducationCode(String str) {
        super(str, i);
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    static {
        EnumEntriesKt.enumEntries(educationCodeArr);
        CREATOR = new Parcelable.Creator<EducationCode>() { // from class: com.bpjstku.util.constant.EducationCode.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            private static final byte[] $$c = {92, 126, -38, -95};
            private static final int $$d = 187;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {27, 65, -33, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 145;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-307305606, -417577685, 1914610877, 2094484700, 800197418, -197592341, -2136523719, 754605107, 521314630, -702188605, 1033952610, 1496477980, 2033992419, -1554521544, -1541847471, 793020527, -512995390, -583525203};

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r0 = 53 - r8
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    byte[] r1 = com.bpjstku.util.constant.EducationCode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                    int r7 = 145 - r7
                    byte[] r0 = new byte[r0]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L23:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = -r6
                    int r7 = r7 + r6
                    int r6 = r3 + 1
                    int r7 = r7 + (-11)
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.EducationCode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(short, short, int, java.lang.Object[]):void");
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                int i3 = -1870535734;
                int i4 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = $11 + 1;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i5] = Integer.valueOf(iArr2[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) i5;
                                byte b2 = b;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getTrimmedLength(""), 3290 - (ExpandableListView.getPackedPositionForChild(i5, i5) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == j ? 0 : -1)), Color.alpha(i5) + 31, 1948206109, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                            }
                            iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i8++;
                            j = 0;
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
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                char c = '0';
                float f = 0.0f;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = $11 + 99;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = Integer.valueOf(iArr5[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cIndexOf = (char) ((-1) - TextUtils.indexOf("", c));
                                int minimumFlingVelocity = 3291 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int i11 = 31 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, minimumFlingVelocity, i11, 1948206109, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        } else {
                            length3 = length3;
                            Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3290, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, 1948206109, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            i9++;
                        }
                        length3 = length3;
                        c = '0';
                        f = 0.0f;
                        i4 = 1;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                int i12 = 2;
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i13 = $11 + 3;
                    $10 = i13 % 128;
                    int i14 = i13 % i12;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i15 = 17;
                    while (i15 > 1) {
                        int i16 = $11 + 91;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2559, (Process.myPid() >> 22) + 29, 683220507, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i15 += 50;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                            Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 2559, KeyEvent.keyCodeFromString("") + 29, 683220507, false, $$e(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i15--;
                        }
                    }
                    int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr7 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28878 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.normalizeMetaState(0) + 348, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    i12 = 2;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EducationCode createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return EducationCode.valueOf(parcel.readString());
                }
                Intrinsics.checkNotNullParameter(parcel, "");
                EducationCode.valueOf(parcel.readString());
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EducationCode[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                int i4 = i3 % 128;
                TuitionPaymentFragmentbindingInflater1 = i4;
                int i5 = i3 % 2;
                EducationCode[] educationCodeArr = new EducationCode[i];
                int i6 = i4 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return educationCodeArr;
                }
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:111:0x02ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:11:0x0030  */
            /* JADX WARN: Code duplicated, block: B:13:0x003d  */
            /* JADX WARN: Code duplicated, block: B:15:0x005a A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #0 {all -> 0x01c6, blocks: (B:14:0x003f, B:18:0x00be, B:21:0x00f1, B:23:0x010e, B:15:0x005a), top: B:109:0x003b }] */
            /* JADX WARN: Code duplicated, block: B:21:0x00f1 A[Catch: all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c6, blocks: (B:14:0x003f, B:18:0x00be, B:21:0x00f1, B:23:0x010e, B:15:0x005a), top: B:109:0x003b }] */
            /* JADX WARN: Code duplicated, block: B:23:0x010e A[Catch: all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c6, blocks: (B:14:0x003f, B:18:0x00be, B:21:0x00f1, B:23:0x010e, B:15:0x005a), top: B:109:0x003b }] */
            /* JADX WARN: Code duplicated, block: B:27:0x01a8  */
            /* JADX WARN: Code duplicated, block: B:29:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x01cf  */
            /* JADX WARN: Code duplicated, block: B:55:0x02d1  */
            /* JADX WARN: Code duplicated, block: B:57:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:59:0x02e2  */
            /* JADX WARN: Code duplicated, block: B:64:0x02f0  */
            /* JADX WARN: Code duplicated, block: B:66:0x02fe A[Catch: Exception -> 0x0547, TRY_ENTER, TryCatch #2 {Exception -> 0x0547, blocks: (B:61:0x02ea, B:66:0x02fe, B:70:0x038b, B:67:0x0312), top: B:111:0x02ea }] */
            /* JADX WARN: Code duplicated, block: B:67:0x0312 A[Catch: Exception -> 0x0547, TRY_LEAVE, TryCatch #2 {Exception -> 0x0547, blocks: (B:61:0x02ea, B:66:0x02fe, B:70:0x038b, B:67:0x0312), top: B:111:0x02ea }] */
            /* JADX WARN: Code duplicated, block: B:73:0x03a1 A[Catch: all -> 0x047b, TryCatch #3 {all -> 0x047b, blocks: (B:71:0x0394, B:73:0x03a1, B:74:0x03e6), top: B:113:0x0394, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:82:0x0486 A[Catch: Exception -> 0x0549, TRY_LEAVE, TryCatch #1 {Exception -> 0x0549, blocks: (B:76:0x0433, B:78:0x047c, B:80:0x0484, B:81:0x0485, B:82:0x0486, B:87:0x0519, B:92:0x053f, B:94:0x0545, B:95:0x0546, B:71:0x0394, B:73:0x03a1, B:74:0x03e6, B:83:0x04c6, B:85:0x04d3, B:86:0x0512), top: B:110:0x02ee, inners: #3, #5 }] */
            /* JADX WARN: Code duplicated, block: B:85:0x04d3 A[Catch: all -> 0x053e, TryCatch #5 {all -> 0x053e, blocks: (B:83:0x04c6, B:85:0x04d3, B:86:0x0512), top: B:117:0x04c6, outer: #1 }] */
            /* JADX WARN: Code duplicated, block: B:89:0x051f  */
            /* JADX WARN: Code duplicated, block: B:90:0x052e  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int[] iArr;
                int iResolveSizeAndState;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i5;
                int i6;
                int i7;
                int i8;
                Class<?> cls;
                String str;
                int i9;
                Object objInvoke;
                int[] iArr2;
                int i10;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                int i20;
                String str2;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i21;
                int[] iArr3;
                int i22;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i23;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i24 = 2 % 2;
                int i25 = TuitionPaymentFragmentbindingInflater1 + 67;
                int i26 = i25 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26;
                if (i25 % 2 == 0) {
                    int i27 = 39 / 0;
                }
                int i28 = i26 + 17;
                TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 70 / 0;
                    if (context != null) {
                        i4 = (i26 ^ 55) + ((i26 & 55) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                        try {
                            if (i4 % 2 != 0) {
                                iArr = new int[]{1671062121, -1591002819, -1780819518, -474512152, 1966361645, 2061949576, -1456076174, 944117287, 1608422837, 1819145026, -176641101, -703916348, 624343001, 1913296716};
                                iResolveSizeAndState = View.resolveSizeAndState(0, 0, 1);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i30 = (-500) % iResolveSizeAndState;
                                i6 = (i30 ^ 5) + ((i30 & 5) << 1);
                                i7 = 99;
                                i5 = -100;
                            } else {
                                iArr = new int[]{1671062121, -1591002819, -1780819518, -474512152, 1966361645, 2061949576, -1456076174, 944117287, 1608422837, 1819145026, -176641101, -703916348, 624343001, 1913296716};
                                iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i5 = -24;
                                i6 = (iResolveSizeAndState * (-500)) - 11500;
                                i7 = 23;
                            }
                            int i31 = ~((i5 ^ iResolveSizeAndState) | (i5 & iResolveSizeAndState));
                            int i32 = ~iResolveSizeAndState;
                            int i33 = (i32 ^ i7) | (i32 & i7);
                            int i34 = ~((i33 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i33 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            i8 = i6 + (TypedValues.PositionType.TYPE_TRANSITION_EASING * ((i31 ^ i34) | (i34 & i31)));
                            int i35 = -(-((~((~i7) | i32)) * 1002));
                            int i36 = ((i8 | i35) << 1) - (i8 ^ i35);
                            int i37 = TuitionPaymentFragmentbindingInflater1;
                            int i38 = (i37 & 111) + (i37 | 111);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                            int i39 = i38 % 2;
                            int i40 = ~iResolveSizeAndState;
                            int i41 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i42 = (i40 & i41) | (i40 ^ i41);
                            int i43 = i36 + (TypedValues.PositionType.TYPE_TRANSITION_EASING * (~((i42 & i7) | (i42 ^ i7))));
                            Object[] objArr2 = new Object[1];
                            a(iArr, i43, objArr2);
                            cls = Class.forName((String) objArr2[0]);
                            int i44 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i45 = (i44 & 18) + (i44 | 18);
                            Object[] objArr3 = new Object[1];
                            a(new int[]{-186382597, -1978352207, 107551480, -272413829, 1927974674, 1383132302, -2012520659, 1664881949, -16120963, 1983068410, -1317076233, -1484911836}, i45, objArr3);
                            str = (String) objArr3[0];
                            i9 = TuitionPaymentFragmentbindingInflater1 + 115;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            if (i9 % 2 == 0) {
                                objInvoke = cls.getMethod(str, null).invoke(context, null);
                                iArr2 = new int[]{-896430809, -87881765, 889000190, 2010409810, 374716903, -1509315301, -668103798, 1783982638, -426141289, -2005663131, -506412102, 1600634430, -1969052693, -515748530, 1927632693, -573561301, -1948415700, -597363208, 363699475, 1699368436};
                                i10 = -(ViewConfiguration.getScrollBarFadeDuration() / 80);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i11 = i10 + 367;
                                i12 = 32;
                            } else {
                                objInvoke = cls.getMethod(str, null).invoke(context, null);
                                iArr2 = new int[]{-896430809, -87881765, 889000190, 2010409810, 374716903, -1509315301, -668103798, 1783982638, -426141289, -2005663131, -506412102, 1600634430, -1969052693, -515748530, 1927632693, -573561301, -1948415700, -597363208, 363699475, 1699368436};
                                i10 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                i11 = i10 * 367;
                                i12 = 34;
                            }
                            int i46 = (i11 - (~(367 * i12))) - 1;
                            int i47 = ((i10 ^ i12) | (i10 & i12)) * (-366);
                            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                            int i49 = ~i12;
                            int i50 = ~((i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i51 = (i48 - (~(((i50 & i10) | (i10 ^ i50)) * (-366)))) - 1;
                            int i52 = ~i10;
                            int i53 = ~((i52 & i12) | (i52 ^ i12));
                            int i54 = ~i12;
                            int i55 = (i10 & i54) | (i54 ^ i10);
                            int i56 = ~((i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i57 = -(-(((i56 & i53) | (i53 ^ i56)) * 366));
                            int i58 = (i51 ^ i57) + ((i57 & i51) << 1);
                            Object[] objArr4 = new Object[1];
                            a(iArr2, i58, objArr4);
                            Class<?> cls2 = Class.forName((String) objArr4[0]);
                            int i59 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i60 = (i59 ^ 5) + ((i59 & 5) << 1);
                            Object[] objArr5 = new Object[1];
                            a(new int[]{1834428363, 1204639956, 1790078277, -1504185522, 295342492, -1022014254}, i60, objArr5);
                            String str3 = (String) objArr5[0];
                            int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i62 = (i61 ^ 69) + ((i61 & 69) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i62 % 128;
                            i13 = i62 % 2;
                            i14 = cls2.getField(str3).getInt(objInvoke);
                            if (i13 != 0) {
                                int i63 = i14 & 3;
                                i15 = (~(i & 1)) & (i | 1);
                                i16 = (i63 | (-i63)) / 25;
                            } else {
                                int i64 = i14 & 2;
                                i15 = i ^ 1;
                                i16 = (i64 | (-i64)) >> 31;
                            }
                            int i65 = (~i16) & i;
                            int i66 = i16 & i15;
                            i17 = (i66 & i65) | (i65 ^ i66);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        i17 = i;
                    }
                } else if (context != null) {
                    i4 = (i26 ^ 55) + ((i26 & 55) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        iArr = new int[]{1671062121, -1591002819, -1780819518, -474512152, 1966361645, 2061949576, -1456076174, 944117287, 1608422837, 1819145026, -176641101, -703916348, 624343001, 1913296716};
                        iResolveSizeAndState = View.resolveSizeAndState(0, 0, 1);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i310 = (-500) % iResolveSizeAndState;
                        i6 = (i310 ^ 5) + ((i310 & 5) << 1);
                        i7 = 99;
                        i5 = -100;
                    } else {
                        iArr = new int[]{1671062121, -1591002819, -1780819518, -474512152, 1966361645, 2061949576, -1456076174, 944117287, 1608422837, 1819145026, -176641101, -703916348, 624343001, 1913296716};
                        iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i5 = -24;
                        i6 = (iResolveSizeAndState * (-500)) - 11500;
                        i7 = 23;
                    }
                    int i311 = ~((i5 ^ iResolveSizeAndState) | (i5 & iResolveSizeAndState));
                    int i312 = ~iResolveSizeAndState;
                    int i313 = (i312 ^ i7) | (i312 & i7);
                    int i314 = ~((i313 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i313 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    i8 = i6 + (TypedValues.PositionType.TYPE_TRANSITION_EASING * ((i311 ^ i314) | (i314 & i311)));
                    int i315 = -(-((~((~i7) | i312)) * 1002));
                    int i316 = ((i8 | i315) << 1) - (i8 ^ i315);
                    int i317 = TuitionPaymentFragmentbindingInflater1;
                    int i318 = (i317 & 111) + (i317 | 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i318 % 128;
                    int i319 = i318 % 2;
                    int i410 = ~iResolveSizeAndState;
                    int i411 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i412 = (i410 & i411) | (i410 ^ i411);
                    int i413 = i316 + (TypedValues.PositionType.TYPE_TRANSITION_EASING * (~((i412 & i7) | (i412 ^ i7))));
                    Object[] objArr6 = new Object[1];
                    a(iArr, i413, objArr6);
                    cls = Class.forName((String) objArr6[0]);
                    int i414 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i415 = (i414 & 18) + (i414 | 18);
                    Object[] objArr7 = new Object[1];
                    a(new int[]{-186382597, -1978352207, 107551480, -272413829, 1927974674, 1383132302, -2012520659, 1664881949, -16120963, 1983068410, -1317076233, -1484911836}, i415, objArr7);
                    str = (String) objArr7[0];
                    i9 = TuitionPaymentFragmentbindingInflater1 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    if (i9 % 2 == 0) {
                        objInvoke = cls.getMethod(str, null).invoke(context, null);
                        iArr2 = new int[]{-896430809, -87881765, 889000190, 2010409810, 374716903, -1509315301, -668103798, 1783982638, -426141289, -2005663131, -506412102, 1600634430, -1969052693, -515748530, 1927632693, -573561301, -1948415700, -597363208, 363699475, 1699368436};
                        i10 = -(ViewConfiguration.getScrollBarFadeDuration() / 80);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i11 = i10 + 367;
                        i12 = 32;
                    } else {
                        objInvoke = cls.getMethod(str, null).invoke(context, null);
                        iArr2 = new int[]{-896430809, -87881765, 889000190, 2010409810, 374716903, -1509315301, -668103798, 1783982638, -426141289, -2005663131, -506412102, 1600634430, -1969052693, -515748530, 1927632693, -573561301, -1948415700, -597363208, 363699475, 1699368436};
                        i10 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i11 = i10 * 367;
                        i12 = 34;
                    }
                    int i416 = (i11 - (~(367 * i12))) - 1;
                    int i417 = ((i10 ^ i12) | (i10 & i12)) * (-366);
                    int i418 = ((i416 | i417) << 1) - (i416 ^ i417);
                    int i419 = ~i12;
                    int i510 = ~((i419 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i419 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i511 = (i418 - (~(((i510 & i10) | (i10 ^ i510)) * (-366)))) - 1;
                    int i512 = ~i10;
                    int i513 = ~((i512 & i12) | (i512 ^ i12));
                    int i514 = ~i12;
                    int i515 = (i10 & i514) | (i514 ^ i10);
                    int i516 = ~((i515 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i515 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i517 = -(-(((i516 & i513) | (i513 ^ i516)) * 366));
                    int i518 = (i511 ^ i517) + ((i517 & i511) << 1);
                    Object[] objArr8 = new Object[1];
                    a(iArr2, i518, objArr8);
                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                    int i519 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i67 = (i519 ^ 5) + ((i519 & 5) << 1);
                    Object[] objArr9 = new Object[1];
                    a(new int[]{1834428363, 1204639956, 1790078277, -1504185522, 295342492, -1022014254}, i67, objArr9);
                    String str4 = (String) objArr9[0];
                    int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i69 = (i68 ^ 69) + ((i68 & 69) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i69 % 128;
                    i13 = i69 % 2;
                    i14 = cls3.getField(str4).getInt(objInvoke);
                    if (i13 != 0) {
                        int i610 = i14 & 3;
                        i15 = (~(i & 1)) & (i | 1);
                        i16 = (i610 | (-i610)) / 25;
                    } else {
                        int i611 = i14 & 2;
                        i15 = i ^ 1;
                        i16 = (i611 | (-i611)) >> 31;
                    }
                    int i612 = (~i16) & i;
                    int i613 = i16 & i15;
                    i17 = (i613 & i612) | (i612 ^ i613);
                } else {
                    i17 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (16949 - TextUtils.indexOf("", "", 0, 0));
                        int iMyPid = 2739 - (Process.myPid() >> 22);
                        int threadPriority = 13 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b = $$a[7];
                        byte b2 = b;
                        Object[] objArr10 = new Object[1];
                        b(b2, (short) (b2 | 141), b, objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iMyPid, threadPriority, 1501733736, false, (String) objArr10[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16949);
                        int defaultSize = View.getDefaultSize(0, 0) + 2739;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 13;
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr11 = new Object[1];
                        b(b4, (short) (b4 | 89), b3, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, defaultSize, maxKeyCode, 47863026, false, (String) objArr11[0], null);
                    }
                    Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                    int i70 = TuitionPaymentFragmentbindingInflater1;
                    int i71 = (i70 & 21) + (i70 | 21);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i71 % 128;
                    if (i71 % 2 == 0) {
                        set.contains(obj);
                        throw null;
                    }
                    if (!set.contains(obj)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (16949 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int scrollDefaultDelay = 2739 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int mirror = '=' - AndroidCharacter.getMirror('0');
                            byte b5 = $$a[7];
                            Object[] objArr12 = new Object[1];
                            b(b5, (short) (b5 | 37), (byte) 15, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollDefaultDelay, mirror, 631063962, false, (String) objArr12[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i72 = TuitionPaymentFragmentbindingInflater1;
                                i21 = (i72 & 53) + (i72 | 53);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                if (i21 % 2 == 0) {
                                    iArr3 = new int[]{1627734544, -1421132388, 1320820170, -1703666892, 1736340712, -1356747689, -1229619828, -754946584, 1506836301, -1726119623, -1968149808, 1577930394, -812345882, 1452550843, -1823457606, -1412230064};
                                    i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i23 = 70;
                                } else {
                                    iArr3 = new int[]{1627734544, -1421132388, 1320820170, -1703666892, 1736340712, -1356747689, -1229619828, -754946584, 1506836301, -1726119623, -1968149808, 1577930394, -812345882, 1452550843, -1823457606, -1412230064};
                                    i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i23 = 27;
                                }
                                int i73 = i22 * (-344);
                                int i74 = i23 * (-344);
                                int i75 = (i73 & i74) + (i73 | i74);
                                int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i77 = i76 + 49;
                                TuitionPaymentFragmentbindingInflater1 = i77 % 128;
                                int i78 = i77 % 2;
                                int i79 = ~i22;
                                int i80 = ~i23;
                                int i81 = ~((i79 ^ i80) | (i80 & i79));
                                int i82 = ~((i79 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i79 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i83 = -(-(((i81 ^ i82) | (i82 & i81)) * 345));
                                i8 = (i75 & i83) + (i83 | i75);
                                int i84 = ~i22;
                                int i85 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i86 = ~((i84 ^ i85) | (i84 & i85));
                                int i87 = ~i23;
                                int i88 = ~((i22 & i87) | (i87 ^ i22));
                                int i89 = -(-(((i88 & i86) | (i86 ^ i88)) * 345));
                                int i90 = ((i8 | i89) << 1) - (i8 ^ i89);
                                int i91 = (i76 ^ 31) + ((i76 & 31) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i91 % 128;
                                int i92 = i91 % 2;
                                int i93 = (i79 ^ i87) | (i87 & i79);
                                int i94 = -(-(345 * (~((i93 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i93 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))));
                                int i95 = (i90 ^ i94) + ((i94 & i90) << 1);
                                Object[] objArr13 = new Object[1];
                                a(iArr3, i95, objArr13);
                                Object[] objArr14 = {(String) objArr13[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                    int i96 = 994 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i97 = 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    byte[] bArr = $$a;
                                    byte b6 = bArr[5];
                                    short s = bArr[7];
                                    Object[] objArr15 = new Object[1];
                                    b(b6, s, (byte) (s | 52), objArr15);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i96, i97, 410748506, false, (String) objArr15[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr14)).longValue();
                                long j = -18839108;
                                i8 = i17;
                                long j2 = (((long) (-665)) * j) + (((long) 334) * jLongValue);
                                long j3 = -1;
                                long j4 = j ^ j3;
                                long j5 = 333;
                                long j6 = i;
                                long j7 = j6 ^ j3;
                                long j8 = j2 + (((long) (-333)) * j4) + ((((j4 | j7) ^ j3) | ((jLongValue | j6) ^ j3)) * j5) + (j5 * (((j7 | jLongValue) ^ j3) | ((j4 | j6) ^ j3))) + ((long) (-182079129));
                                int i98 = (int) (j8 >> 32);
                                int i99 = ~Process.myTid();
                                int i100 = i98 & (2045741182 + (((~(553294020 | i99)) | (-1990520432)) * (-983)) + (((~(i99 | (-1990520432))) | 547391556) * 983));
                                int i101 = ((int) j8) & ((-635053948) + (((-671613993) | i) * (-627)) + (((~(1044940008 | i)) | (-392286402)) * (-627)) + (((~((~i) | (-1044940009))) | (~((-392286402) | i))) * 627));
                                i20 = (i100 & i101) | (i100 ^ i101);
                            } else {
                                i8 = i17;
                                Object[] objArr16 = new Object[1];
                                a(new int[]{1925383353, 1399378711, -377436490, 2063686288}, -ImageFormat.getBitsPerPixel(0), objArr16);
                                str2 = (String) objArr16[0];
                                int i102 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                int i103 = (i102 ^ 13) + ((i102 & 13) << 1);
                                Object[] objArr17 = new Object[1];
                                a(new int[]{78665405, -1945863782, 1406372019, -1998287685, 328821448, 838745276, 666306078, 2040158674, 539647854, 1826400214}, i103, objArr17);
                                objArr = new Object[]{(String) objArr17[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char offsetAfter = (char) (33602 - TextUtils.getOffsetAfter("", 0));
                                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                    int iResolveSize = View.resolveSize(0, 0) + 26;
                                    byte[] bArr2 = $$a;
                                    byte b7 = bArr2[5];
                                    short s2 = bArr2[7];
                                    Object[] objArr18 = new Object[1];
                                    b(b7, s2, (byte) (s2 | 52), objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, scrollBarFadeDuration, iResolveSize, 1411172903, false, (String) objArr18[0], new Class[]{String.class});
                                }
                                if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i104 = TuitionPaymentFragmentbindingInflater1;
                                    int i105 = (i104 & 119) + (i104 | 119);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i105 % 128;
                                    int i106 = i105 % 2;
                                    i20 = 1;
                                } else {
                                    int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i108 = ((i107 | 17) << 1) - (i107 ^ 17);
                                    TuitionPaymentFragmentbindingInflater1 = i108 % 128;
                                    int i109 = i108 % 2;
                                    i20 = 0;
                                }
                            }
                            int i110 = -i20;
                            int i111 = ((i20 & i110) | (i20 ^ i110)) >> 31;
                            int i112 = (~i111) & i;
                            int i113 = i111 & (i ^ 10);
                            int i114 = (i113 & i112) | (i112 ^ i113);
                            int i115 = TuitionPaymentFragmentbindingInflater1 + 67;
                            int i116 = i115 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i116;
                            int i117 = i115 % 2;
                            int i118 = i2 & 32;
                            int i119 = -i118;
                            int i120 = (i118 & i119) | (i118 ^ i119);
                            int i121 = i116 + 69;
                            TuitionPaymentFragmentbindingInflater1 = i121 % 128;
                            int i122 = i121 % 2;
                            int i123 = i120 >> 31;
                            int i124 = i114 & (~i123);
                            int i125 = i116 + 9;
                            TuitionPaymentFragmentbindingInflater1 = i125 % 128;
                            int i126 = i125 % 2;
                            int i127 = i123 & i;
                            i19 = (i124 & i127) | (i124 ^ i127);
                        } else if (Build.VERSION.SDK_INT == 30) {
                            i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                            if (i18 % 2 != 0) {
                                int i128 = 32 / 0;
                            }
                            i19 = i;
                            i8 = i17;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i710 = TuitionPaymentFragmentbindingInflater1;
                                i21 = (i710 & 53) + (i710 | 53);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                if (i21 % 2 == 0) {
                                    iArr3 = new int[]{1627734544, -1421132388, 1320820170, -1703666892, 1736340712, -1356747689, -1229619828, -754946584, 1506836301, -1726119623, -1968149808, 1577930394, -812345882, 1452550843, -1823457606, -1412230064};
                                    i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i23 = 70;
                                } else {
                                    iArr3 = new int[]{1627734544, -1421132388, 1320820170, -1703666892, 1736340712, -1356747689, -1229619828, -754946584, 1506836301, -1726119623, -1968149808, 1577930394, -812345882, 1452550843, -1823457606, -1412230064};
                                    i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i23 = 27;
                                }
                                int i711 = i22 * (-344);
                                int i712 = i23 * (-344);
                                int i713 = (i711 & i712) + (i711 | i712);
                                int i714 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i715 = i714 + 49;
                                TuitionPaymentFragmentbindingInflater1 = i715 % 128;
                                int i716 = i715 % 2;
                                int i717 = ~i22;
                                int i810 = ~i23;
                                int i811 = ~((i717 ^ i810) | (i810 & i717));
                                int i812 = ~((i717 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i717 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i813 = -(-(((i811 ^ i812) | (i812 & i811)) * 345));
                                i8 = (i713 & i813) + (i813 | i713);
                                int i814 = ~i22;
                                int i815 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i816 = ~((i814 ^ i815) | (i814 & i815));
                                int i817 = ~i23;
                                int i818 = ~((i22 & i817) | (i817 ^ i22));
                                int i819 = -(-(((i818 & i816) | (i816 ^ i818)) * 345));
                                int i910 = ((i8 | i819) << 1) - (i8 ^ i819);
                                int i911 = (i714 ^ 31) + ((i714 & 31) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i911 % 128;
                                int i912 = i911 % 2;
                                int i913 = (i717 ^ i817) | (i817 & i717);
                                int i914 = -(-(345 * (~((i913 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i913 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))));
                                int i915 = (i910 ^ i914) + ((i914 & i910) << 1);
                                Object[] objArr19 = new Object[1];
                                a(iArr3, i915, objArr19);
                                Object[] objArr110 = {(String) objArr19[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                                    int i916 = 994 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i917 = 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    byte[] bArr3 = $$a;
                                    byte b8 = bArr3[5];
                                    short s3 = bArr3[7];
                                    Object[] objArr111 = new Object[1];
                                    b(b8, s3, (byte) (s3 | 52), objArr111);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState2, i916, i917, 410748506, false, (String) objArr111[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr110)).longValue();
                                long j9 = -18839108;
                                i8 = i17;
                                long j10 = (((long) (-665)) * j9) + (((long) 334) * jLongValue2);
                                long j11 = -1;
                                long j12 = j9 ^ j11;
                                long j13 = 333;
                                long j14 = i;
                                long j15 = j14 ^ j11;
                                long j16 = j10 + (((long) (-333)) * j12) + ((((j12 | j15) ^ j11) | ((jLongValue2 | j14) ^ j11)) * j13) + (j13 * (((j15 | jLongValue2) ^ j11) | ((j12 | j14) ^ j11))) + ((long) (-182079129));
                                int i918 = (int) (j16 >> 32);
                                int i919 = ~Process.myTid();
                                int i1010 = i918 & (2045741182 + (((~(553294020 | i919)) | (-1990520432)) * (-983)) + (((~(i919 | (-1990520432))) | 547391556) * 983));
                                int i1011 = ((int) j16) & ((-635053948) + (((-671613993) | i) * (-627)) + (((~(1044940008 | i)) | (-392286402)) * (-627)) + (((~((~i) | (-1044940009))) | (~((-392286402) | i))) * 627));
                                i20 = (i1010 & i1011) | (i1010 ^ i1011);
                            } else {
                                i8 = i17;
                                Object[] objArr112 = new Object[1];
                                a(new int[]{1925383353, 1399378711, -377436490, 2063686288}, -ImageFormat.getBitsPerPixel(0), objArr112);
                                str2 = (String) objArr112[0];
                                int i1012 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                int i1013 = (i1012 ^ 13) + ((i1012 & 13) << 1);
                                Object[] objArr113 = new Object[1];
                                a(new int[]{78665405, -1945863782, 1406372019, -1998287685, 328821448, 838745276, 666306078, 2040158674, 539647854, 1826400214}, i1013, objArr113);
                                objArr = new Object[]{(String) objArr113[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char offsetAfter2 = (char) (33602 - TextUtils.getOffsetAfter("", 0));
                                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                    int iResolveSize2 = View.resolveSize(0, 0) + 26;
                                    byte[] bArr4 = $$a;
                                    byte b9 = bArr4[5];
                                    short s4 = bArr4[7];
                                    Object[] objArr114 = new Object[1];
                                    b(b9, s4, (byte) (s4 | 52), objArr114);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter2, scrollBarFadeDuration2, iResolveSize2, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                                }
                                if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i1014 = TuitionPaymentFragmentbindingInflater1;
                                    int i1015 = (i1014 & 119) + (i1014 | 119);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1015 % 128;
                                    int i1016 = i1015 % 2;
                                    i20 = 1;
                                } else {
                                    int i1017 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i1018 = ((i1017 | 17) << 1) - (i1017 ^ 17);
                                    TuitionPaymentFragmentbindingInflater1 = i1018 % 128;
                                    int i1019 = i1018 % 2;
                                    i20 = 0;
                                }
                            }
                            int i1110 = -i20;
                            int i1111 = ((i20 & i1110) | (i20 ^ i1110)) >> 31;
                            int i1112 = (~i1111) & i;
                            int i1113 = i1111 & (i ^ 10);
                            int i1114 = (i1113 & i1112) | (i1112 ^ i1113);
                            int i1115 = TuitionPaymentFragmentbindingInflater1 + 67;
                            int i1116 = i1115 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1116;
                            int i1117 = i1115 % 2;
                            int i1118 = i2 & 32;
                            int i1119 = -i1118;
                            int i129 = (i1118 & i1119) | (i1118 ^ i1119);
                            int i1210 = i1116 + 69;
                            TuitionPaymentFragmentbindingInflater1 = i1210 % 128;
                            int i1211 = i1210 % 2;
                            int i1212 = i129 >> 31;
                            int i1213 = i1114 & (~i1212);
                            int i1214 = i1116 + 9;
                            TuitionPaymentFragmentbindingInflater1 = i1214 % 128;
                            int i1215 = i1214 % 2;
                            int i1216 = i1212 & i;
                            i19 = (i1213 & i1216) | (i1213 ^ i1216);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        if (i18 % 2 != 0) {
                            int i1217 = 32 / 0;
                        }
                        i19 = i;
                        i8 = i17;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i718 = TuitionPaymentFragmentbindingInflater1;
                                    i21 = (i718 & 53) + (i718 | 53);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        iArr3 = new int[]{1627734544, -1421132388, 1320820170, -1703666892, 1736340712, -1356747689, -1229619828, -754946584, 1506836301, -1726119623, -1968149808, 1577930394, -812345882, 1452550843, -1823457606, -1412230064};
                                        i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        i23 = 70;
                                    } else {
                                        iArr3 = new int[]{1627734544, -1421132388, 1320820170, -1703666892, 1736340712, -1356747689, -1229619828, -754946584, 1506836301, -1726119623, -1968149808, 1577930394, -812345882, 1452550843, -1823457606, -1412230064};
                                        i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getPreviewCapabilities.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        i23 = 27;
                                    }
                                    int i719 = i22 * (-344);
                                    int i7110 = i23 * (-344);
                                    int i7111 = (i719 & i7110) + (i719 | i7110);
                                    int i7112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i7113 = i7112 + 49;
                                    TuitionPaymentFragmentbindingInflater1 = i7113 % 128;
                                    int i7114 = i7113 % 2;
                                    int i7115 = ~i22;
                                    int i8110 = ~i23;
                                    int i8111 = ~((i7115 ^ i8110) | (i8110 & i7115));
                                    int i8112 = ~((i7115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i7115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    int i8113 = -(-(((i8111 ^ i8112) | (i8112 & i8111)) * 345));
                                    i8 = (i7111 & i8113) + (i8113 | i7111);
                                    int i8114 = ~i22;
                                    int i8115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i8116 = ~((i8114 ^ i8115) | (i8114 & i8115));
                                    int i8117 = ~i23;
                                    int i8118 = ~((i22 & i8117) | (i8117 ^ i22));
                                    int i8119 = -(-(((i8118 & i8116) | (i8116 ^ i8118)) * 345));
                                    int i9110 = ((i8 | i8119) << 1) - (i8 ^ i8119);
                                    int i9111 = (i7112 ^ 31) + ((i7112 & 31) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i9111 % 128;
                                    int i9112 = i9111 % 2;
                                    int i9113 = (i7115 ^ i8117) | (i8117 & i7115);
                                    int i9114 = -(-(345 * (~((i9113 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i9113 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))));
                                    int i9115 = (i9110 ^ i9114) + ((i9114 & i9110) << 1);
                                    Object[] objArr115 = new Object[1];
                                    a(iArr3, i9115, objArr115);
                                    try {
                                        Object[] objArr116 = {(String) objArr115[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cNormalizeMetaState3 = (char) KeyEvent.normalizeMetaState(0);
                                            int i9116 = 994 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int i9117 = 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            byte[] bArr5 = $$a;
                                            byte b10 = bArr5[5];
                                            short s5 = bArr5[7];
                                            Object[] objArr117 = new Object[1];
                                            b(b10, s5, (byte) (s5 | 52), objArr117);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState3, i9116, i9117, 410748506, false, (String) objArr117[0], new Class[]{String.class});
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr116)).longValue();
                                        long j17 = -18839108;
                                        i8 = i17;
                                        long j18 = (((long) (-665)) * j17) + (((long) 334) * jLongValue3);
                                        long j19 = -1;
                                        long j110 = j17 ^ j19;
                                        long j111 = 333;
                                        long j112 = i;
                                        long j113 = j112 ^ j19;
                                        long j114 = j18 + (((long) (-333)) * j110) + ((((j110 | j113) ^ j19) | ((jLongValue3 | j112) ^ j19)) * j111) + (j111 * (((j113 | jLongValue3) ^ j19) | ((j110 | j112) ^ j19))) + ((long) (-182079129));
                                        int i9118 = (int) (j114 >> 32);
                                        int i9119 = ~Process.myTid();
                                        int i10110 = i9118 & (2045741182 + (((~(553294020 | i9119)) | (-1990520432)) * (-983)) + (((~(i9119 | (-1990520432))) | 547391556) * 983));
                                        int i10111 = ((int) j114) & ((-635053948) + (((-671613993) | i) * (-627)) + (((~(1044940008 | i)) | (-392286402)) * (-627)) + (((~((~i) | (-1044940009))) | (~((-392286402) | i))) * 627));
                                        i20 = (i10110 & i10111) | (i10110 ^ i10111);
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i8 = i17;
                                    Object[] objArr118 = new Object[1];
                                    a(new int[]{1925383353, 1399378711, -377436490, 2063686288}, -ImageFormat.getBitsPerPixel(0), objArr118);
                                    str2 = (String) objArr118[0];
                                    int i10112 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                    int i10113 = (i10112 ^ 13) + ((i10112 & 13) << 1);
                                    Object[] objArr119 = new Object[1];
                                    a(new int[]{78665405, -1945863782, 1406372019, -1998287685, 328821448, 838745276, 666306078, 2040158674, 539647854, 1826400214}, i10113, objArr119);
                                    try {
                                        objArr = new Object[]{(String) objArr119[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char offsetAfter3 = (char) (33602 - TextUtils.getOffsetAfter("", 0));
                                            int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                            int iResolveSize3 = View.resolveSize(0, 0) + 26;
                                            byte[] bArr6 = $$a;
                                            byte b11 = bArr6[5];
                                            short s6 = bArr6[7];
                                            Object[] objArr1110 = new Object[1];
                                            b(b11, s6, (byte) (s6 | 52), objArr1110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter3, scrollBarFadeDuration3, iResolveSize3, 1411172903, false, (String) objArr1110[0], new Class[]{String.class});
                                        }
                                        if (str2.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            int i10114 = TuitionPaymentFragmentbindingInflater1;
                                            int i10115 = (i10114 & 119) + (i10114 | 119);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10115 % 128;
                                            int i10116 = i10115 % 2;
                                            i20 = 1;
                                        } else {
                                            int i10117 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i10118 = ((i10117 | 17) << 1) - (i10117 ^ 17);
                                            TuitionPaymentFragmentbindingInflater1 = i10118 % 128;
                                            int i10119 = i10118 % 2;
                                            i20 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i8 = i17;
                        }
                        int i11110 = -i20;
                        int i11111 = ((i20 & i11110) | (i20 ^ i11110)) >> 31;
                        int i11112 = (~i11111) & i;
                        int i11113 = i11111 & (i ^ 10);
                        int i11114 = (i11113 & i11112) | (i11112 ^ i11113);
                        int i11115 = TuitionPaymentFragmentbindingInflater1 + 67;
                        int i11116 = i11115 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11116;
                        int i11117 = i11115 % 2;
                        int i11118 = i2 & 32;
                        int i11119 = -i11118;
                        int i1218 = (i11118 & i11119) | (i11118 ^ i11119);
                        int i1219 = i11116 + 69;
                        TuitionPaymentFragmentbindingInflater1 = i1219 % 128;
                        int i12110 = i1219 % 2;
                        int i12111 = i1218 >> 31;
                        int i12112 = i11114 & (~i12111);
                        int i12113 = i11116 + 9;
                        TuitionPaymentFragmentbindingInflater1 = i12113 % 128;
                        int i12114 = i12113 % 2;
                        int i12115 = i12111 & i;
                        i19 = (i12112 & i12115) | (i12112 ^ i12115);
                    }
                    int i130 = i ^ i8;
                    int i131 = (i130 | (-i130)) >> 31;
                    int i132 = i19 & (~i131);
                    int i133 = i8 & i131;
                    int i134 = (i132 & i133) | (i132 ^ i133);
                    int i135 = (~(i & i134)) & (i | i134);
                    Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i134}, null};
                    int iNextInt = new Random().nextInt(388795297);
                    int i136 = (-706897084) + ((~(iNextInt | 614948703)) * 216);
                    int i137 = ~iNextInt;
                    int i138 = i136 + ((652697567 | i137) * (-216)) + (((~(i137 | 614948703)) | (-574638475)) * 216);
                    int i139 = -(-(((i135 | (-i135)) >> 31) & 16));
                    int i140 = (i138 & i139) + (i139 | i138);
                    int i141 = i140 * (-949);
                    int i142 = -(-(i3 * (-949)));
                    int i143 = (i141 ^ i142) + ((i141 & i142) << 1);
                    int i144 = ~i3;
                    int i145 = ~i;
                    int i146 = ~((i144 & i145) | (i144 ^ i145));
                    int i147 = ~((~i140) | i);
                    int i148 = -(-(((i146 & i147) | (i146 ^ i147)) * 1900));
                    int i149 = (i143 ^ i148) + ((i148 & i143) << 1);
                    int i150 = ~i;
                    int i151 = ~((i150 & i140) | (i150 ^ i140));
                    int i152 = ~(i3 | i);
                    int i153 = ((i151 & i152) | (i151 ^ i152)) * (-950);
                    int i154 = ((i149 | i153) << 1) - (i153 ^ i149);
                    int i155 = ~((i145 ^ i3) | (i3 & i145));
                    int i156 = ~((i & i140) | (i140 ^ i));
                    int i157 = -(-(((i155 & i156) | (i155 ^ i156)) * 950));
                    int i158 = (i154 ^ i157) + ((i157 & i154) << 1);
                    int i159 = i158 << 13;
                    int i160 = (i159 | i158) & (~(i158 & i159));
                    int i161 = i160 >>> 17;
                    int i162 = (i160 | i161) & (~(i160 & i161));
                    ((int[]) objArr20[1])[0] = i162 ^ (i162 << 5);
                    return objArr20;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
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
            private static java.lang.String $$e(byte r6, int r7, short r8) {
                /*
                    byte[] r0 = com.bpjstku.util.constant.EducationCode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                    int r8 = r8 * 56
                    int r8 = r8 + 66
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r6 = r6 * 4
                    int r1 = 1 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r0 != 0) goto L19
                    r4 = r8
                    r3 = r2
                    r8 = r7
                    goto L2c
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2c:
                    int r7 = r7 + r4
                    int r8 = r8 + 1
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.constant.EducationCode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(byte, int, short):java.lang.String");
            }
        };
    }

    public static EducationCode valueOf(String str) {
        return (EducationCode) Enum.valueOf(EducationCode.class, str);
    }

    public static EducationCode[] values() {
        return (EducationCode[]) cancelAll.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(name());
    }
}
