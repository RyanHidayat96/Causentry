package com.bpjstku.domain.general.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bpjstku.data.point.PointDataStore;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/bpjstku/domain/general/model/CodeNamePair;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CodeNamePair implements Parcelable {
    public static final Parcelable.Creator<CodeNamePair> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public String b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CodeNamePair(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
    }

    public /* synthetic */ CodeNamePair(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<CodeNamePair> {
        private static final byte[] $$c = {77, -106, 83, 4};
        private static final int $$d = 17;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {68, 104, -93, -37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 105;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        private static int b = -981105359;
        private static char TuitionPaymentFragmentbindingInflater1 = 44405;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 2
                int r9 = r9 + 84
                int r7 = r7 + 4
                byte[] r0 = com.bpjstku.domain.general.model.CodeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r8 = r8 * 15
                int r8 = 53 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r9 = r9 + 1
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.general.model.CodeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(byte, byte, byte, java.lang.Object[]):void");
        }

        private static CodeNamePair[] TuitionPaymentFragmentbindingInflater1(int i) throws Throwable {
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            int i2 = 2 % 2;
            CodeNamePair[] codeNamePairArr = new CodeNamePair[i];
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int defaultSize = View.getDefaultSize(0, 0) + 1755;
                int size = 23 - View.MeasureSpec.getSize(0);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr = new Object[1];
                a(b2, bArr[5], b2, objArr);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, defaultSize, size, 986134021, false, (String) objArr[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr2 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{49706, 40637, 34015, 15540}, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{23710, 50313, 1943, 5431, 10383, 43126, 582, 53361, 58601, 58808, 61121, 21911, 5298, 21557, 2680, 1372, 27652, 21838, 55836, 19063, 29912, 25827}, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{13225, 14981, 40648, 45530}, (char) (TextUtils.indexOf("", "", 0, 0) + 55966), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 935688910, new char[]{50370, 40992, 59526, 59152, 10664, 40635, 7788, 43003, 12449, 43319, 11922, 30310, 31467, 38763, 10908}, objArr3);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr2 = $$a;
                byte b3 = (byte) (-bArr2[3]);
                byte b4 = bArr2[7];
                Object[] objArr4 = new Object[1];
                a(b3, b4, b4, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, fadingEdgeLength, threadPriority, 1596667560, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int deadChar = 1755 - KeyEvent.getDeadChar(0, 0);
                    int mode = View.MeasureSpec.getMode(0) + 23;
                    byte b5 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 89, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, deadChar, mode, 1599039318, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                int iMyUid = Process.myUid();
                int i5 = (-1144866607) + (((~(835790041 | iMyUid)) | 237769474) * 336) + (((~(iMyUid | 1048392467)) | 25167048) * (-168)) + (((~((~iMyUid) | 1048392467)) | 835790041) * 168) + 792416125;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i7 ^ (i7 << 5);
            } else {
                try {
                    Object[] objArr7 = {239358066};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 42049), 1726 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(i, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr7), 792416125, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                        int i8 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte b6 = $$a[7];
                        Object[] objArr8 = new Object[1];
                        a((byte) 89, b6, b6, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, keyRepeatTimeout, i8, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{49706, 40637, 34015, 15540}, (char) TextUtils.getCapsMode("", 0, 0), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{23710, 50313, 1943, 5431, 10383, 43126, 582, 53361, 58601, 58808, 61121, 21911, 5298, 21557, 2680, 1372, 27652, 21838, 55836, 19063, 29912, 25827}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{13225, 14981, 40648, 45530}, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 55966), (-935688909) - TextUtils.indexOf("", "", 0, 0), new char[]{50370, 40992, 59526, 59152, 10664, 40635, 7788, 43003, 12449, 43319, 11922, 30310, 31467, 38763, 10908}, objArr10);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                            int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                            int i9 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte[] bArr3 = $$a;
                            byte b7 = (byte) (-bArr3[3]);
                            byte b8 = bArr3[7];
                            Object[] objArr11 = new Object[1];
                            a(b7, b8, b8, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iNormalizeMetaState, i9, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                            int iCombineMeasuredStates = 1755 - View.combineMeasuredStates(0, 0);
                            int mode2 = 23 - View.MeasureSpec.getMode(0);
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            Object[] objArr12 = new Object[1];
                            a(b9, bArr4[5], b9, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, iCombineMeasuredStates, mode2, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
            int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
            if (i11 != i10) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
                        int i13 = i12 % 2;
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i11));
            }
            int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
            int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
            new int[1][0] = i15;
            new int[1][0] = i16;
            int i17 = ~(675001881 | i);
            int i18 = ~i;
            int i19 = i17 | (~(887604307 | i18));
            int i20 = ~((-675001882) | i18);
            int i21 = i14 + 1361660549 + ((i19 | i20) * (-516)) + (((~(i | (-348405827))) | (~((-539198482) | i18))) * 516) + ((539198481 | i20) * 516);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            int[] iArr = {i23 ^ (i23 << 5)};
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
            if (i24 % 2 == 0) {
                return codeNamePairArr;
            }
            throw null;
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
                int i4 = $11 + 1;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - Color.green(0)), 1235 - (ViewConfiguration.getTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 35, -653973969, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 2;
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 2764, KeyEvent.normalizeMetaState(0) + 14, 1504416861, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.red(0)), 253 - View.resolveSize(0, 0), 22 - KeyEvent.normalizeMetaState(0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) (65200 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int scrollBarSize = 2891 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 18;
                        byte b6 = (byte) ($$d & 7);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, scrollBarSize, bitsPerPixel, 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i6 = $10 + 85;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 36 / 0;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CodeNamePair createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CodeNamePair codeNamePair = new CodeNamePair(parcel.readString(), parcel.readString());
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return codeNamePair;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CodeNamePair[] newArray(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                TuitionPaymentFragmentbindingInflater1(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CodeNamePair[] codeNamePairArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return codeNamePairArrTuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, int r7, int r8) {
            /*
                byte[] r0 = com.bpjstku.domain.general.model.CodeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r7 = r7 * 2
                int r7 = r7 + 1
                int r8 = r8 + 4
                int r6 = r6 + 102
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L28
            L12:
                r3 = r2
            L13:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L28:
                int r8 = -r8
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.domain.general.model.CodeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$e(byte, int, int):java.lang.String");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CodeNamePair() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CodeNamePair)) {
            return false;
        }
        CodeNamePair codeNamePair = (CodeNamePair) p0;
        return Intrinsics.areEqual(this.b, codeNamePair.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("CodeNamePair(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}
