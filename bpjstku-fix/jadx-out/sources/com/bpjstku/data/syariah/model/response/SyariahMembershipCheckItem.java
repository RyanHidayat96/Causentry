package com.bpjstku.data.syariah.model.response;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/syariah/model/response/SyariahMembershipCheckItem;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/bpjstku/data/syariah/model/response/SyariahMembershipCheckItem;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", NotificationCompat.CATEGORY_STATUS, "Ljava/lang/Boolean;", "getStatus", "message", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SyariahMembershipCheckItem implements Parcelable {

    @SerializedName("message")
    private final String message;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final Boolean status;
    public static final Parcelable.Creator<SyariahMembershipCheckItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SyariahMembershipCheckItem(Boolean bool, String str) {
        this.status = bool;
        this.message = str;
    }

    public final Boolean getStatus() {
        return this.status;
    }

    public final String getMessage() {
        return this.message;
    }

    public static /* synthetic */ SyariahMembershipCheckItem copy$default(SyariahMembershipCheckItem syariahMembershipCheckItem, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = syariahMembershipCheckItem.status;
        }
        if ((i & 2) != 0) {
            str = syariahMembershipCheckItem.message;
        }
        return syariahMembershipCheckItem.copy(bool, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final SyariahMembershipCheckItem copy(Boolean p0, String p1) {
        return new SyariahMembershipCheckItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SyariahMembershipCheckItem)) {
            return false;
        }
        SyariahMembershipCheckItem syariahMembershipCheckItem = (SyariahMembershipCheckItem) p0;
        return Intrinsics.areEqual(this.status, syariahMembershipCheckItem.status) && Intrinsics.areEqual(this.message, syariahMembershipCheckItem.message);
    }

    public final int hashCode() {
        Boolean bool = this.status;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.status;
        String str = this.message;
        StringBuilder sb = new StringBuilder("SyariahMembershipCheckItem(status=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(p0, "");
        Boolean bool = this.status;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            p0.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        p0.writeInt(BooleanValue);
        p0.writeString(this.message);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SyariahMembershipCheckItem> {
        private static final byte[] $$c = {111, 40, 23, -13};
        private static final int $$f = 206;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {90, 46, 113, 8, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 56, 3, 9, -13, -3, -1, 18, -14, -55, 63, -8, 14, 0, -18, 6, 2, 5, -7, -57, 37, 21, -7, 17, -13, -1, -20, 34, -13, 1, -1, 13, -13, 9, -11, 2, 14, -34, 36, -16, 16, -16};
        private static final int $$e = 39;
        private static final byte[] $$a = {81, 125, 2, 46, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 78;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int b = 1;
        private static int[] TuitionPaymentFragmentbindingInflater1 = {-117180792, -2106875854, 728413890, 482846411, -1138191613, 91053353, 1827821113, 832870752, 1193334537, -987698146, 748798938, -1236491876, 1472975440, -1885647880, 711360704, -1103519673, 938095529, -369251986};

        private static void a(byte b2, short s, short s2, Object[] objArr) {
            byte[] bArr = $$a;
            int i = 107 - (b2 * 52);
            int i2 = s2 * 15;
            int i3 = 84 - (s * 4);
            byte[] bArr2 = new byte[53 - i2];
            int i4 = 52 - i2;
            int i5 = -1;
            if (bArr == null) {
                i3 = (i4 + i3) - 11;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                i++;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = (i3 + bArr[i]) - 11;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem.Creator.$$d
                int r7 = r7 * 51
                int r7 = r7 + 1
                int r8 = 99 - r8
                int r6 = r6 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                int r6 = r6 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = r6 + r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem.Creator.d(int, short, short, java.lang.Object[]):void");
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = -1870535734;
            int i4 = 1;
            int i5 = 0;
            if (iArr2 != null) {
                int i6 = $11 + 95;
                int i7 = i6 % 128;
                $10 = i7;
                int i8 = i6 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = i7 + 67;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr2[i11]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Drawable.resolveOpacity(i5, i5) + 3291, 31 - (ViewConfiguration.getTouchSlop() >> 8), 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i11++;
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
            int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    try {
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = Integer.valueOf(iArr5[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), View.MeasureSpec.makeMeasureSpec(0, 0) + 3291, 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i12++;
                        iArr5 = iArr5;
                        i4 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            int i13 = 2;
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i14 = $11 + 67;
                $10 = i14 % 128;
                int i15 = i14 % i13;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i16 = $11 + 33;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                for (int i18 = 17; i18 > 1; i18--) {
                    int i19 = $10 + 85;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                    try {
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 2560, (ViewConfiguration.getJumpTapTimeout() >> 16) + 29, 683220507, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28880 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 348 - View.resolveSize(0, 0), 'I' - AndroidCharacter.getMirror('0'), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyariahMembershipCheckItem createFromParcel(Parcel parcel) throws Throwable {
            boolean z;
            Boolean boolValueOf;
            Object[] objArr;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                b = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 43042);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 3111;
                int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr = $$a;
                byte b2 = bArr[2];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, windowTouchSlop, maximumDrawingCacheSize, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{87608658, 394121750, -1363693907, -1994628149, -463788131, -1641114887, 1052544471, -637182902, -1515242708, 1266647040, 1840307237, 573506777, -1716317837, -17444912}, 22 - Color.argb(0, 0, 0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{-2061628765, 1888407714, -1669344912, -1916106889, 201122085, -231989996, -214875165, -1539031853, 642494930, 400004874}, Color.green(0) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRed = (char) (43042 - Color.red(0));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3111;
                int iAlpha = 22 - Color.alpha(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[132];
                byte b5 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b4, b5, b5, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, iCombineMeasuredStates, iAlpha, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char jumpTapTimeout = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3111;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 22;
                    byte[] bArr3 = $$a;
                    byte b6 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b6, b6, bArr3[132], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, iNormalizeMetaState, iIndexOf, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i6};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i8 = (((-460183508) + (((~((-671236177) | elapsedCpuTime)) | (~(1033795282 | elapsedCpuTime))) * 69)) + (((~(elapsedCpuTime | 681467984)) | ((~((-1023563475) | elapsedCpuTime)) | 352327298)) * (-69))) - 1733953796;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[1], new int[]{i7}, iArr, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{-964921002, -1019072217, -1826207993, 1343622778, 1342903188, 2125284399, 436612369, 618694436, 2089689548, -718187543}, 15 - ImageFormat.getBitsPerPixel(0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{-455003333, -1686876370, -2011186098, -1918702696, -1350834736, -1510957119, -1282265425, 774170416, 532689497, 1618547901}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, objArr9);
                try {
                    Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1855018748};
                    byte[] bArr4 = $$d;
                    Object[] objArr11 = new Object[1];
                    d(bArr4[19], bArr4[42], bArr4[9], objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    d((byte) 50, bArr4[9], bArr4[42], objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3112;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr14 = new Object[1];
                        a(b7, b7, bArr5[132], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf, iResolveOpacity, 154975793, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new int[]{87608658, 394121750, -1363693907, -1994628149, -463788131, -1641114887, 1052544471, -637182902, -1515242708, 1266647040, 1840307237, 573506777, -1716317837, -17444912}, 22 - KeyEvent.keyCodeFromString(""), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new int[]{-2061628765, 1888407714, -1669344912, -1916106889, 201122085, -231989996, -214875165, -1539031853, 642494930, 400004874}, 15 - View.getDefaultSize(0, 0), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            int iArgb = 3111 - Color.argb(0, 0, 0, 0);
                            int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[132];
                            byte b9 = bArr6[7];
                            Object[] objArr17 = new Object[1];
                            a(b8, b9, b9, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, iArgb, i11, -1269618118, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43042);
                            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3111;
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[2];
                            byte b11 = bArr7[7];
                            Object[] objArr18 = new Object[1];
                            a(b10, b11, b11, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, jumpTapTimeout2, capsMode, -1272852037, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
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
            int i12 = ((int[]) objArr[1])[0];
            int i13 = ((int[]) objArr[2])[0];
            if (i13 == i12) {
                int i14 = b + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((int[]) objArr[2])[0];
                int i18 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int[] iArr2 = {i17};
                int i19 = (~new Random().nextInt()) | 140497616;
                int i20 = i16 + 1886183009 + (i19 * 495) + (((~i19) | 138461264) * 495);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
                Object[] objArr19 = {new int[1], new int[]{i18}, iArr2, strArr2};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                int i23 = ((int[]) objArr[0])[0];
                int i24 = ((int[]) objArr[2])[0];
                int i25 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr3 = {i24};
                int[] iArr4 = {i25};
                int iIdentityHashCode = System.identityHashCode(this);
                int i26 = ~((-739319346) | (~iIdentityHashCode));
                int i27 = i23 + ((((294551744 | i26) | (~(739319345 | iIdentityHashCode))) * (-338)) - 1815694174) + (((~(iIdentityHashCode | 1033871089)) | i26) * 338);
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
                Object[] objArr20 = {new int[1], iArr4, iArr3, strArr4};
            }
            return new SyariahMembershipCheckItem(boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SyariahMembershipCheckItem createFromParcel(Parcel parcel) throws Throwable {
            int i = 2 % 2;
            int i2 = b + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyariahMembershipCheckItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            SyariahMembershipCheckItem[] syariahMembershipCheckItemArr = new SyariahMembershipCheckItem[i];
            if (i3 % 2 != 0) {
                int i4 = 41 / 0;
            }
            return syariahMembershipCheckItemArr;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SyariahMembershipCheckItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
            b = i3 % 128;
            int i4 = i3 % 2;
            SyariahMembershipCheckItem[] syariahMembershipCheckItemArrNewArray = newArray(i);
            int i5 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return syariahMembershipCheckItemArrNewArray;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, byte r7, short r8) {
            /*
                int r7 = r7 * 2
                int r7 = 4 - r7
                int r8 = r8 * 4
                int r0 = 1 - r8
                byte[] r1 = com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem.Creator.$$c
                int r6 = r6 * 56
                int r6 = 122 - r6
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2b
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2b:
                int r7 = -r7
                int r3 = r3 + 1
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem.Creator.$$g(byte, byte, short):java.lang.String");
        }
    }
}
