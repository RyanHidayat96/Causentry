package com.bpjstku.data.scholarship.model.request;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import defpackage.onBackCompletedFallback;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\b"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kode", "Ljava/lang/String;", "getKode", "pathUrl", "getPathUrl"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipDataDocumentForInsert implements Parcelable {

    @SerializedName("kodeDokumen")
    private final String kode;

    @SerializedName("pathUrl")
    private final String pathUrl;
    public static final Parcelable.Creator<ScholarshipDataDocumentForInsert> CREATOR = new Creator();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScholarshipDataDocumentForInsert> {
        private static final byte[] $$c = {109, 7, 114, -90};
        private static final int $$f = 46;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {107, 48, 57, 107, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 113;
        private static final byte[] $$a = {12, 11, -9, -106, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
        private static final int $$b = 13;
        private static int b = 0;
        private static int asBinder = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 46591;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 54198;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 29888;
        private static char TuitionPaymentFragmentbindingInflater1 = 4170;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert.Creator.$$a
                int r6 = r6 * 6
                int r6 = r6 + 97
                int r7 = r7 * 19
                int r1 = r7 + 14
                int r8 = r8 * 32
                int r8 = 35 - r8
                byte[] r1 = new byte[r1]
                int r7 = r7 + 13
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r7
                r6 = r8
                r3 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L30:
                int r4 = -r4
                int r8 = r8 + r4
                int r8 = r8 + (-2)
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert.Creator.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 52
                int r6 = 53 - r6
                int r8 = r8 * 52
                int r8 = r8 + 4
                byte[] r0 = com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert.Creator.$$d
                int r7 = 103 - r7
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r3 = r0[r8]
            L26:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                int r8 = r8 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert.Creator.c(short, short, int, java.lang.Object[]):void");
        }

        private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                char c = 1;
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i4 = 58224;
                int i5 = 0;
                while (i5 < 16) {
                    int i6 = $10 + 93;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    char c2 = cArr3[c];
                    char c3 = cArr3[i3];
                    int i8 = (c3 + i4) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                    int i9 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i3) + 47774);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 468;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[c] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, windowTouchSlop, packedPositionType, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0', 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 468, (ViewConfiguration.getPressedStateDuration() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
                        c = 1;
                        i3 = 0;
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
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 2324 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i10 = $10 + 63;
                $11 = i10 % 128;
                int i11 = i10 % 2;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScholarshipDataDocumentForInsert createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ScholarshipDataDocumentForInsert scholarshipDataDocumentForInsert = new ScholarshipDataDocumentForInsert(parcel.readString(), parcel.readString());
            int i2 = b + 57;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return scholarshipDataDocumentForInsert;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScholarshipDataDocumentForInsert createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            b = i2 % 128;
            int i3 = i2 % 2;
            ScholarshipDataDocumentForInsert scholarshipDataDocumentForInsertCreateFromParcel = createFromParcel(parcel);
            int i4 = b + 1;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return scholarshipDataDocumentForInsertCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScholarshipDataDocumentForInsert[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = asBinder + 53;
            b = i3 % 128;
            ScholarshipDataDocumentForInsert[] scholarshipDataDocumentForInsertArr = new ScholarshipDataDocumentForInsert[i];
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
            }
            return scholarshipDataDocumentForInsertArr;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScholarshipDataDocumentForInsert[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = asBinder + 1;
            b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            ScholarshipDataDocumentForInsert[] scholarshipDataDocumentForInsertArrNewArray = newArray(i);
            int i4 = asBinder + 11;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return scholarshipDataDocumentForInsertArrNewArray;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:118:0x03fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:0x0502 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0414  */
        /* JADX WARN: Code duplicated, block: B:60:0x0460  */
        /* JADX WARN: Code duplicated, block: B:64:0x04b5 A[Catch: all -> 0x0782, TryCatch #0 {all -> 0x0782, blocks: (B:62:0x049f, B:64:0x04b5, B:65:0x04f5, B:77:0x0569, B:79:0x0576, B:80:0x05b0, B:82:0x05ce, B:84:0x0619), top: B:113:0x049f }] */
        /* JADX WARN: Code duplicated, block: B:92:0x06fb A[PHI: r0 r1
  0x06fb: PHI (r0v30 int) = (r0v29 int), (r0v53 int) binds: [B:91:0x06f9, B:88:0x06ec] A[DONT_GENERATE, DONT_INLINE]
  0x06fb: PHI (r1v14 int) = (r1v13 int), (r1v35 int) binds: [B:91:0x06f9, B:88:0x06ec] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:93:0x06fd A[PHI: r0 r1
  0x06fd: PHI (r0v50 int) = (r0v29 int), (r0v53 int) binds: [B:91:0x06f9, B:88:0x06ec] A[DONT_GENERATE, DONT_INLINE]
  0x06fd: PHI (r1v34 int) = (r1v13 int), (r1v35 int) binds: [B:91:0x06f9, B:88:0x06ec] A[DONT_GENERATE, DONT_INLINE]] */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) throws Throwable {
            int i;
            int i2;
            int i3;
            Method method;
            char[] cArr;
            int iResolveSize;
            int iB;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i11 = 2 % 2;
            byte[] bArr = $$a;
            int i12 = 28;
            byte b2 = bArr[28];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            int i13 = 0;
            Class<?> cls = Class.forName((String) objArr2[0]);
            int i14 = b;
            int i15 = ((i14 | 15) << 1) - (i14 ^ 15);
            asBinder = i15 % 128;
            int i16 = i15 % 2;
            byte b4 = bArr[7];
            byte b5 = bArr[28];
            Object[] objArr3 = new Object[1];
            a(b4, b5, b5, objArr3);
            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte b6 = bArr[7];
            byte b7 = bArr[28];
            Object[] objArr4 = new Object[1];
            a(b6, b7, b7, objArr4);
            Method[] methodArr = {cls.getMethod((String) objArr3[0], String.class, Integer.TYPE), cls2.getMethod((String) objArr4[0], String.class, Integer.TYPE)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                int i18 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr2 = $$d;
                byte b8 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b8, bArr2[10], b8, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, i17, i18, 1814927978, false, (String) objArr5[0], null);
            }
            Class<?>[] clsArr = null;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), 2823 - View.getDefaultSize(0, 0), 22 - (ViewConfiguration.getEdgeSlop() >> 16))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i19 = 0;
                while (i19 < length) {
                    Method method2 = declaredMethods[i19];
                    try {
                        int i20 = -(-Color.argb(i13, i13, i13, i13));
                        Object[] objArr6 = new Object[1];
                        d(new char[]{4645, 59043, 54203, 29946, 26005, 35581, 40300, 12196, 26216, 40691, 4886, 26711, 60507, 325, 46493, 3299, 8202, 22211, 43073, 4903, 52124, 31879, 33649, 16964, 35761, 11393}, (i20 ^ 24) + ((i20 & 24) << 1), objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[i13]);
                        int i21 = -(ExpandableListView.getPackedPositionForChild(i13, i13) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i13, i13) == j ? 0 : -1));
                        Object[] objArr7 = new Object[1];
                        d(new char[]{49266, 14234, 8043, 6320, 9898, 11204, 23563, 3068, 33482, 48675, 41559, 45163, 8681, 51771}, (i21 & 11) + (i21 | 11), objArr7);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr7[i13], clsArr).invoke(method2, clsArr)).intValue();
                        Object[] objArr8 = new Object[1];
                        objArr8[i13] = Integer.valueOf(iIntValue);
                        char[] cArr2 = new char[i12];
                        // fill-array-data instruction
                        cArr2[0] = 37746;
                        cArr2[1] = 56426;
                        cArr2[2] = 1304;
                        cArr2[3] = 43866;
                        cArr2[4] = 54575;
                        cArr2[5] = 32473;
                        cArr2[6] = 19115;
                        cArr2[7] = 42753;
                        cArr2[8] = 22123;
                        cArr2[9] = 28216;
                        cArr2[10] = 37882;
                        cArr2[11] = 2521;
                        cArr2[12] = 31002;
                        cArr2[13] = 15623;
                        cArr2[14] = 52070;
                        cArr2[15] = 25460;
                        cArr2[16] = 55527;
                        cArr2[17] = 24062;
                        cArr2[18] = 3032;
                        cArr2[19] = 20602;
                        cArr2[20] = 22913;
                        cArr2[21] = 9188;
                        cArr2[22] = 34116;
                        cArr2[23] = 36219;
                        cArr2[24] = 34337;
                        cArr2[25] = 17898;
                        cArr2[26] = 54297;
                        cArr2[27] = 20056;
                        int i22 = -(-TextUtils.getOffsetBefore("", i13));
                        int i23 = ((i22 | 26) << 1) - (i22 ^ 26);
                        Object[] objArr9 = new Object[1];
                        d(cArr2, i23, objArr9);
                        Class<?> cls4 = Class.forName((String) objArr9[i13]);
                        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                        int iB2 = onBackCompletedFallback.b();
                        int i24 = maxKeyCode * (-129);
                        int i25 = (i24 ^ 1048) + ((i24 & 1048) << 1);
                        int i26 = ~iB2;
                        int i27 = ((-9) ^ i26) | ((-9) & i26);
                        int i28 = (~((i27 ^ maxKeyCode) | (i27 & maxKeyCode))) * 130;
                        int i29 = (i25 ^ i28) + ((i28 & i25) << 1);
                        int i30 = (~((-9) | maxKeyCode)) * (-260);
                        int i31 = (i29 & i30) + (i29 | i30);
                        int i32 = ~maxKeyCode;
                        int i33 = ~((i32 ^ 8) | (i32 & 8));
                        int i34 = ~(((-9) ^ maxKeyCode) | ((-9) & maxKeyCode) | iB2);
                        int i35 = -(-(((i33 & i34) | (i33 ^ i34)) * 130));
                        int i36 = (i31 ^ i35) + ((i35 & i31) << 1);
                        Object[] objArr10 = new Object[1];
                        d(new char[]{53237, 5123, 8378, 24375, 41349, 58793, 42680, 60604, 53322, 42072}, i36, objArr10);
                        String str = (String) objArr10[i13];
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[i13] = Integer.TYPE;
                        if (((Boolean) cls4.getMethod(str, clsArr2).invoke(clsArr, objArr8)).booleanValue()) {
                            Class cls5 = Long.TYPE;
                            int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                            int iB3 = onBackCompletedFallback.b();
                            int i37 = (keyRepeatTimeout2 * 70) - 1632;
                            int i38 = ~keyRepeatTimeout2;
                            int i39 = (i38 ^ (-25)) | (i38 & (-25));
                            int i40 = (keyRepeatTimeout2 ^ 24) | (keyRepeatTimeout2 & 24);
                            int i41 = ((~((i40 ^ iB3) | (i40 & iB3))) | (~((i39 ^ iB3) | (i39 & iB3)))) * 69;
                            int i42 = (i37 ^ i41) + ((i41 & i37) << 1);
                            int i43 = ~keyRepeatTimeout2;
                            int i44 = ~((i43 & 24) | (i43 ^ 24));
                            int i45 = ~((i38 ^ iB3) | (i38 & iB3));
                            int i46 = ((i44 & i45) | (i44 ^ i45) | (~(iB3 | 24))) * (-69);
                            int i47 = ((((i42 | i46) << 1) - (i46 ^ i42)) - (~(-(-((~(((-25) & keyRepeatTimeout2) | ((-25) ^ keyRepeatTimeout2))) * 69))))) - 1;
                            Object[] objArr11 = new Object[1];
                            d(new char[]{4645, 59043, 54203, 29946, 26005, 35581, 40300, 12196, 26216, 40691, 4886, 26711, 60507, 325, 46493, 3299, 8202, 22211, 43073, 4903, 52124, 31879, 33649, 16964, 35761, 11393}, i47, objArr11);
                            Class<?> cls6 = Class.forName((String) objArr11[i13]);
                            int i48 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iB4 = onBackCompletedFallback.b();
                            int i49 = i48 * 491;
                            int i50 = (i49 & (-6357)) + (i49 | (-6357));
                            int i51 = ~i48;
                            int i52 = (i51 ^ (-14)) | (i51 & (-14));
                            int i53 = ~iB4;
                            int i54 = ((i52 ^ i53) | (i53 & i52)) * (-490);
                            int i55 = (i50 & i54) + (i54 | i50);
                            int i56 = ~(((-14) & i48) | ((-14) ^ i48));
                            int i57 = ~(((-14) & iB4) | ((-14) ^ iB4));
                            int i58 = i55 + (((i56 & i57) | (i56 ^ i57)) * 490);
                            int i59 = -(-(i51 * 490));
                            int i60 = (i58 & i59) + (i59 | i58);
                            Object[] objArr12 = new Object[1];
                            d(new char[]{10700, 1951, 63446, 24820, 59172, 22229, 54947, 54223, 45159, 12655, 10565, 22870, 50022, 52210, 58830, 5950}, i60, objArr12);
                            if (cls5.equals(cls6.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                                onBackCompletedFallback.b();
                                onBackCompletedFallback.b();
                                Object[] objArr13 = new Object[1];
                                d(new char[]{4645, 59043, 54203, 29946, 26005, 35581, 40300, 12196, 26216, 40691, 4886, 26711, 60507, 325, 46493, 3299, 8202, 22211, 43073, 4903, 52124, 31879, 33649, 16964, 35761, 11393}, 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr13);
                                Class<?> cls7 = Class.forName((String) objArr13[0]);
                                int i61 = asBinder;
                                int i62 = (i61 & 45) + (i61 | 45);
                                b = i62 % 128;
                                if (i62 % 2 != 0) {
                                    cArr = new char[]{64713, 41562, 48229, 38132, 58534, 57385, 54564, 20384, 47635, 48283, 18312, 63156, 21851, 41082, 7966, 38818, 46328, 40096, 59031, 35157};
                                    iResolveSize = View.resolveSize(1, 0);
                                    iB = onBackCompletedFallback.b();
                                    i4 = 97;
                                } else {
                                    cArr = new char[]{64713, 41562, 48229, 38132, 58534, 57385, 54564, 20384, 47635, 48283, 18312, 63156, 21851, 41082, 7966, 38818, 46328, 40096, 59031, 35157};
                                    iResolveSize = View.resolveSize(0, 0);
                                    iB = onBackCompletedFallback.b();
                                    i4 = 17;
                                }
                                int i63 = iResolveSize * 165;
                                int i64 = i4 * (-163);
                                int i65 = (i63 & i64) + (i63 | i64);
                                int i66 = b;
                                int i67 = i66 + 63;
                                asBinder = i67 % 128;
                                if (i67 % 2 == 0) {
                                    int i68 = ~iB;
                                    int i69 = ~((i68 ^ i4) | (i68 & i4));
                                    i5 = i65 % ((-328) / ((iResolveSize ^ i69) | (i69 & iResolveSize)));
                                } else {
                                    int i70 = ~((~iB) | i4);
                                    i5 = i65 + (((iResolveSize ^ i70) | (i70 & iResolveSize)) * (-328));
                                }
                                int i71 = ((i66 | 45) << 1) - (i66 ^ 45);
                                asBinder = i71 % 128;
                                if (i71 % 2 == 0) {
                                    int i72 = -(164 * ((iResolveSize ^ iB) | (iResolveSize & iB)));
                                    i6 = (i5 ^ i72) + ((i72 & i5) << 1);
                                } else {
                                    i6 = (164 * ((iResolveSize ^ iB) | (iResolveSize & iB))) + i5;
                                }
                                int i73 = ~iResolveSize;
                                int i74 = ~i4;
                                int i75 = (i73 ^ i74) | (i73 & i74);
                                int i76 = i66 + 7;
                                asBinder = i76 % 128;
                                if (i76 % 2 == 0) {
                                    i7 = (~i75) | (~((~i4) | iB));
                                    i8 = ~iB;
                                    int i77 = 12 / 0;
                                } else {
                                    int i78 = ~i75;
                                    int i79 = ~i4;
                                    int i80 = ~((i79 & iB) | (i79 ^ iB));
                                    i7 = (i78 & i80) | (i78 ^ i80);
                                    i8 = ~iB;
                                }
                                int i81 = (i8 & iResolveSize) | (i8 ^ iResolveSize);
                                int i82 = -(-(164 * ((~((i81 & i4) | (i81 ^ i4))) | i7)));
                                int i83 = (i6 ^ i82) + ((i82 & i6) << 1);
                                Object[] objArr14 = new Object[1];
                                d(cArr, i83, objArr14);
                                Method method3 = cls7.getMethod((String) objArr14[0], null);
                                int i84 = asBinder;
                                int i85 = (i84 & 61) + (i84 | 61);
                                b = i85 % 128;
                                int i86 = i85 % 2;
                                Object[] objArr15 = (Object[]) method3.invoke(method2, null);
                                if (objArr15.length == 2) {
                                    int i87 = asBinder + 23;
                                    b = i87 % 128;
                                    int i88 = i87 % 2;
                                    Class cls8 = Long.TYPE;
                                    if (i88 == 0) {
                                        i9 = 0;
                                        if (cls8.equals(objArr15[0])) {
                                            i10 = 26;
                                            char[] cArr3 = new char[i10];
                                            // fill-array-data instruction
                                            cArr3[0] = 4645;
                                            cArr3[1] = 59043;
                                            cArr3[2] = 54203;
                                            cArr3[3] = 29946;
                                            cArr3[4] = 26005;
                                            cArr3[5] = 35581;
                                            cArr3[6] = 40300;
                                            cArr3[7] = 12196;
                                            cArr3[8] = 26216;
                                            cArr3[9] = 40691;
                                            cArr3[10] = 4886;
                                            cArr3[11] = 26711;
                                            cArr3[12] = 60507;
                                            cArr3[13] = 325;
                                            cArr3[14] = 46493;
                                            cArr3[15] = 3299;
                                            cArr3[16] = 8202;
                                            cArr3[17] = 22211;
                                            cArr3[18] = 43073;
                                            cArr3[19] = 4903;
                                            cArr3[20] = 52124;
                                            cArr3[21] = 31879;
                                            cArr3[22] = 33649;
                                            cArr3[23] = 16964;
                                            cArr3[24] = 35761;
                                            cArr3[25] = 11393;
                                            int threadPriority = Process.getThreadPriority(i9);
                                            int i89 = 23 - (~(-(((threadPriority & 20) + (threadPriority | 20)) >> 6)));
                                            objArr = new Object[1];
                                            d(cArr3, i89, objArr);
                                            if (Class.forName((String) objArr[0]).equals(objArr15[1])) {
                                                int i90 = asBinder;
                                                int i91 = ((i90 | 31) << 1) - (i90 ^ 31);
                                                b = i91 % 128;
                                                int i92 = i91 % 2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                    int iGreen = Color.green(0) + 2823;
                                                    int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    byte[] bArr3 = $$d;
                                                    byte b9 = bArr3[7];
                                                    Object[] objArr16 = new Object[1];
                                                    c(b9, bArr3[10], b9, objArr16);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode2, iGreen, keyRepeatDelay, 1814927978, false, (String) objArr16[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2824;
                                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b10 = bArr4[7];
                                                    Object[] objArr17 = new Object[1];
                                                    c(b10, bArr4[10], b10, objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iLastIndexOf, absoluteGravity, 1814927978, false, (String) objArr17[0], null);
                                                }
                                                Object[] objArr18 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                                    int mode = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr5 = $$d;
                                                    byte b11 = bArr5[5];
                                                    Object[] objArr19 = new Object[1];
                                                    c(b11, bArr5[7], b11, objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, pressedStateDuration, mode, -2137287382, false, (String) objArr19[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr18)).longValue();
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (cls8.equals(objArr15[1])) {
                                        i10 = 26;
                                        i9 = 0;
                                        char[] cArr4 = new char[i10];
                                        // fill-array-data instruction
                                        cArr4[0] = 4645;
                                        cArr4[1] = 59043;
                                        cArr4[2] = 54203;
                                        cArr4[3] = 29946;
                                        cArr4[4] = 26005;
                                        cArr4[5] = 35581;
                                        cArr4[6] = 40300;
                                        cArr4[7] = 12196;
                                        cArr4[8] = 26216;
                                        cArr4[9] = 40691;
                                        cArr4[10] = 4886;
                                        cArr4[11] = 26711;
                                        cArr4[12] = 60507;
                                        cArr4[13] = 325;
                                        cArr4[14] = 46493;
                                        cArr4[15] = 3299;
                                        cArr4[16] = 8202;
                                        cArr4[17] = 22211;
                                        cArr4[18] = 43073;
                                        cArr4[19] = 4903;
                                        cArr4[20] = 52124;
                                        cArr4[21] = 31879;
                                        cArr4[22] = 33649;
                                        cArr4[23] = 16964;
                                        cArr4[24] = 35761;
                                        cArr4[25] = 11393;
                                        int threadPriority2 = Process.getThreadPriority(i9);
                                        int i810 = 23 - (~(-(((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6)));
                                        objArr = new Object[1];
                                        d(cArr4, i810, objArr);
                                        if (Class.forName((String) objArr[0]).equals(objArr15[1])) {
                                            int i93 = asBinder;
                                            int i94 = ((i93 | 31) << 1) - (i93 ^ 31);
                                            b = i94 % 128;
                                            int i95 = i94 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                                int iGreen2 = Color.green(0) + 2823;
                                                int keyRepeatDelay2 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                byte[] bArr6 = $$d;
                                                byte b12 = bArr6[7];
                                                Object[] objArr110 = new Object[1];
                                                c(b12, bArr6[10], b12, objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode3, iGreen2, keyRepeatDelay2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 2824;
                                                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 22;
                                                byte[] bArr7 = $$d;
                                                byte b13 = bArr7[7];
                                                Object[] objArr111 = new Object[1];
                                                c(b13, bArr7[10], b13, objArr111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength2, iLastIndexOf2, absoluteGravity2, 1814927978, false, (String) objArr111[0], null);
                                            }
                                            try {
                                                Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                                    int mode2 = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr8 = $$d;
                                                    byte b14 = bArr8[5];
                                                    Object[] objArr113 = new Object[1];
                                                    c(b14, bArr8[7], b14, objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf2, pressedStateDuration2, mode2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
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
                        int i96 = (i19 & 123) + (i19 | 123);
                        i19 = (i96 ^ (-122)) + ((i96 & (-122)) << 1);
                        clsArr = null;
                        i12 = 28;
                        i13 = 0;
                        j = 0;
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
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 22;
                byte[] bArr9 = $$d;
                byte b15 = bArr9[7];
                Object[] objArr20 = new Object[1];
                c(b15, bArr9[10], b15, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize, packedPositionGroup, 1814927978, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iIndexOf = 2823 - TextUtils.indexOf("", "", 0);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 23;
                byte b16 = $$d[5];
                byte b17 = b16;
                Object[] objArr22 = new Object[1];
                c(b17, (byte) (b17 + 4), b16, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf, iLastIndexOf3, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
            Object[] objArr23 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37657);
                int packedPositionType = 2720 - ExpandableListView.getPackedPositionType(0L);
                int maximumDrawingCacheSize2 = 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b18 = $$d[5];
                byte b19 = b18;
                Object[] objArr24 = new Object[1];
                c(b19, (byte) (b19 + 4), b18, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, packedPositionType, maximumDrawingCacheSize2, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
            long j2 = -343617666;
            long j3 = (((long) (-1335)) * j2) + (((long) (-667)) * jLongValue);
            long j4 = -1;
            long j5 = jLongValue ^ j4;
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j6 = j2 | jElapsedRealtime;
            long j7 = j3 + (((long) (-668)) * (j5 | (j6 ^ j4))) + (((long) 1336) * (((jElapsedRealtime | j5) ^ j4) | j2)) + (((long) 668) * (j6 | j5)) + ((long) (-1466788179));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i97 = ~(1736745576 | iFreeMemory);
            int i98 = ~iFreeMemory;
            int i99 = i97 | (~((-1120995309) | i98));
            int i100 = ~((-1736745577) | i98);
            int i101 = ((int) (j7 >> 32)) & (1537668026 + ((i99 | i100) * (-516)) + (((~(iFreeMemory | 1742055404)) | (~((-621060097) | i98))) * 516) + ((621060096 | i100) * 516));
            int iNextInt = new Random().nextInt();
            int i102 = ~(415481324 | iNextInt);
            int i103 = ~iNextInt;
            int i104 = 1164366941 + ((i102 | (~((-1021745086) | i103))) * (-1808)) + (((~(1021820925 | iNextInt)) | (~(i103 | (-415405485)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iNextInt | 1021745085)) | 606339601 | (~((-415481325) | i103))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i105 = b + 33;
            asBinder = i105 % 128;
            int i106 = ((int) j7) & i104;
            if (i105 % 2 == 0) {
                int i107 = (i101 & i106) | (i101 ^ i106);
                i = i107 * 125;
                i2 = i107 & ViewCompat.MEASURED_SIZE_MASK;
                if (i != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            } else {
                int i108 = (i101 & i106) | (i101 ^ i106);
                i = i108 >>> 24;
                i2 = i108 & ViewCompat.MEASURED_SIZE_MASK;
                if (i != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
            int i109 = (i3 ^ 1) ^ 1;
            list.add((i3 == 0 || i2 >= 2 || (method = methodArr[i2]) == null) ? null : method.toString());
            int i110 = asBinder;
            int i111 = (i110 ^ 73) + ((i110 & 73) << 1);
            b = i111 % 128;
            int i112 = i111 % 2;
            int iB5 = onBackCompletedFallback.b();
            int i113 = ((i112 != 0 ? 708 : 4284) - (~(-(-((-712) * i))))) - 1;
            int i114 = ~iB5;
            int i115 = ~((i114 & (-7)) | ((-7) ^ i114));
            int i116 = ~((-7) | i);
            int i117 = (i115 & i116) | (i115 ^ i116);
            int i118 = ~i;
            int i119 = (i118 ^ 6) | (i118 & 6);
            int i120 = i113 + ((i117 | (~((i119 & iB5) | (i119 ^ iB5)))) * (-713));
            int i121 = ~i;
            int i122 = (i121 & 6) | (i121 ^ 6);
            int i123 = (i120 - (~((~((i122 & iB5) | (i122 ^ iB5))) * 1426))) - 1;
            int i124 = b;
            int i125 = (i124 & 113) + (i124 | 113);
            asBinder = i125 % 128;
            int i126 = i125 % 2;
            int i127 = iB5 ^ (-1);
            int i128 = -(-(713 * (~((i127 & i118) | (i118 ^ i127)))));
            return ((i123 ^ i128) + ((i128 & i123) << 1)) * i109;
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
        private static java.lang.String $$g(int r6, int r7, short r8) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r8 = 108 - r8
                byte[] r0 = com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert.Creator.$$c
                int r6 = r6 * 4
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert.Creator.$$g(int, int, short):java.lang.String");
        }
    }

    public ScholarshipDataDocumentForInsert(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.kode = str;
        this.pathUrl = str2;
    }

    public final String getKode() {
        return this.kode;
    }

    public final String getPathUrl() {
        return this.pathUrl;
    }

    public static /* synthetic */ ScholarshipDataDocumentForInsert copy$default(ScholarshipDataDocumentForInsert scholarshipDataDocumentForInsert, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipDataDocumentForInsert.kode;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipDataDocumentForInsert.pathUrl;
        }
        return scholarshipDataDocumentForInsert.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKode() {
        return this.kode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPathUrl() {
        return this.pathUrl;
    }

    public final ScholarshipDataDocumentForInsert copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ScholarshipDataDocumentForInsert(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipDataDocumentForInsert)) {
            return false;
        }
        ScholarshipDataDocumentForInsert scholarshipDataDocumentForInsert = (ScholarshipDataDocumentForInsert) p0;
        return Intrinsics.areEqual(this.kode, scholarshipDataDocumentForInsert.kode) && Intrinsics.areEqual(this.pathUrl, scholarshipDataDocumentForInsert.pathUrl);
    }

    public final int hashCode() {
        return (this.kode.hashCode() * 31) + this.pathUrl.hashCode();
    }

    public final String toString() {
        String str = this.kode;
        String str2 = this.pathUrl;
        StringBuilder sb = new StringBuilder("ScholarshipDataDocumentForInsert(kode=");
        sb.append(str);
        sb.append(", pathUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kode);
        p0.writeString(this.pathUrl);
    }
}
