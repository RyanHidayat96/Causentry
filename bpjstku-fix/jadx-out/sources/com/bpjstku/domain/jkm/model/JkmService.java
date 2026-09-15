package com.bpjstku.domain.jkm.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018"}, d2 = {"Lcom/bpjstku/domain/jkm/model/JkmService;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "<init>", "(ILjava/lang/String;Ljava/lang/String;I)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JkmService implements Parcelable {
    public static final Parcelable.Creator<JkmService> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public JkmService(int i, String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JkmService)) {
            return false;
        }
        JkmService jkmService = (JkmService) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == jkmService.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.b, jkmService.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jkmService.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == jkmService.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final String toString() {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("JkmService(TuitionPaymentFragmentbindingInflater1=");
        sb.append(i);
        sb.append(", b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<JkmService> {
        private static final byte[] $$c = {58, 66, -14, -31};
        private static final int $$f = 144;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {90, 46, 113, 8, -11, -12, 1, -4, -12, -17, 67, -60, -19, -10, -4, -13, -6, 4, -12, 2, -21, 62, -63, -13, -10, -15, 66, -66, -12, -13, 8, -20, -3, 6, -18, 55, -28, -44, 0, -20, -7, 2, -14, 31, -45, -10, -15, 28, -37, 10, -20, -12, 6, -16, -10, -2, 26, -28, -26, 8, -21, -8, 73, -73, -13, -10, -15, 45, -51, -4, -7, 0, -5, -24, 73, -22, 8, -20, 6, -72, -15, -3, -18, 73, -20};
        private static final int $$e = 53;
        private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
        private static final int $$b = 222;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int d = 1;
        private static char[] b = {47374, 47361, 47371, 47421, 47360, 47366, 47297, 47420, 47388, 47414, 47419, 47370, 47362, 47340, 47363, 47372, 47364, 47423, 47389};
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719599;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.bpjstku.domain.jkm.model.JkmService.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r6 = r6 * 10
                int r6 = r6 + 4
                int r5 = r5 * 3
                int r5 = 100 - r5
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                r4 = r0[r6]
            L26:
                int r6 = r6 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-5)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jkm.model.JkmService.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(byte, byte, short, java.lang.Object[]):void");
        }

        private static void e(int i, short s, short s2, Object[] objArr) {
            int i2 = (i * 9) + 98;
            int i3 = 85 - (s2 * 81);
            byte[] bArr = $$d;
            int i4 = s * 81;
            byte[] bArr2 = new byte[82 - i4];
            int i5 = 81 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2 = (i2 + (-i3)) - 7;
                i3++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i3;
                i2 = (i2 + (-bArr[i3])) - 7;
                i3 = i8 + 1;
                i6 = i7;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JkmService[] newArray(int i) throws Throwable {
            Object[] objArr;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentbindingInflater1 + 41;
            d = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr = $$a;
                byte b2 = bArr[11];
                Object[] objArr2 = new Object[1];
                a((byte) (b2 + 1), b2, bArr[17], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, maximumDrawingCacheSize, iMakeMeasureSpec, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, TextUtils.getTrimmedLength("") + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                int mode = View.MeasureSpec.getMode(0) + 876;
                int iRed = 10 - Color.red(0);
                byte b3 = $$a[11];
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 + 1), b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, mode, iRed, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cMyPid2 = (char) (Process.myPid() >> 22);
                    int i5 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iRed2 = Color.red(0) + 10;
                    byte[] bArr2 = $$a;
                    byte b5 = (byte) (bArr2[11] + 1);
                    byte b6 = bArr2[12];
                    Object[] objArr6 = new Object[1];
                    a(b5, b5, b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid2, i5, iRed2, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = ((((-518882204) + (((~(iUptimeMillis | (-765249224))) | ((~((-268638233) | i6)) | 228328003)) * (-68))) + ((~((-536921221) | i6)) * (-68))) + (((~(765249223 | i6)) | (-805559453)) * 68)) - 817915461;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            } else {
                int i10 = TuitionPaymentFragmentbindingInflater1 + 123;
                d = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr8 = {Integer.valueOf(i), -817915461};
                    byte[] bArr3 = $$d;
                    byte b7 = bArr3[6];
                    Object[] objArr9 = new Object[1];
                    e(b7, bArr3[38], b7, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b8 = bArr3[38];
                    Object[] objArr10 = new Object[1];
                    e(b8, bArr3[6], b8, objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                        byte[] bArr4 = $$a;
                        byte b9 = (byte) (bArr4[11] + 1);
                        Object[] objArr11 = new Object[1];
                        a(b9, b9, bArr4[12], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, pressedStateDuration, iResolveSizeAndState, 1324201839, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(null, null, 127 - Drawable.resolveOpacity(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(null, null, (Process.myPid() >> 22) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cGreen = (char) Color.green(0);
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                            byte b10 = $$a[11];
                            byte b11 = b10;
                            Object[] objArr14 = new Object[1];
                            a(b11, (byte) (b11 + 1), b10, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, absoluteGravity, iNormalizeMetaState, 254769921, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int iRgb = Color.rgb(0, 0, 0) + 16778092;
                            int iMyTid = 10 - (Process.myTid() >> 22);
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[11];
                            Object[] objArr15 = new Object[1];
                            a((byte) (b12 + 1), b12, bArr5[17], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, iRgb, iMyTid, -1199417970, false, (String) objArr15[0], null);
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
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[0])[0];
            if (i13 == i12) {
                int i14 = ((int[]) objArr[1])[0];
                int i15 = ((int[]) objArr[0])[0];
                int i16 = ((int[]) objArr[2])[0];
                new int[1][0] = i15;
                new int[1][0] = i16;
                int i17 = ~i;
                int i18 = i14 + 1276235560 + ((i | 134479874) * 988) + (((~(204293611 | i17)) | (-233797120)) * (-1976)) + ((134479874 | (~(163983382 | i)) | (~(i17 | (-163983383)))) * 988);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                int[] iArr = {i20 ^ (i20 << 5)};
                return new JkmService[i];
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i21 = d + 33;
                TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr3 = b;
            int i3 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr3[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i3;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.green(i3) + 31339), (ViewConfiguration.getTapTimeout() >> 16) + 2994, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4++;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 43325), 253 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                int i5 = 33602;
                int i6 = 1687675375;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 3133 - AndroidCharacter.getMirror('0'), Color.argb(0, 0, 0, 0) + 26, -2146875848, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        i5 = 33602;
                        i6 = 1687675375;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    int i7 = $11 + 39;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - ((Process.getThreadPriority(0) + 20) >> 6)), 3085 - TextUtils.indexOf("", "", 0), (Process.myPid() >> 22) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        int i8 = $11 + 9;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i10 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        int i11 = $11 + 125;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        return;
                    }
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    i10 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JkmService createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            JkmService jkmService = new JkmService(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
            int i2 = d + 39;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            return jkmService;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                int r7 = r7 * 3
                int r0 = 1 - r7
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r8 = 68 - r8
                byte[] r1 = com.bpjstku.domain.jkm.model.JkmService.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L17
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2d:
                int r6 = r6 + 1
                int r8 = r8 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.jkm.model.JkmService.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g(byte, int, byte):java.lang.String");
        }
    }
}
