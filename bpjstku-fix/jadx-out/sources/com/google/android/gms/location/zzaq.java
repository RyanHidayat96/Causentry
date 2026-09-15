package com.google.android.gms.location;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaq implements Parcelable.Creator {
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$d = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {106, -66, 28, 119, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 229;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6834958340307125584L;
    private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 1
            byte[] r1 = com.google.android.gms.location.zzaq.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r7 = 145 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r1[r7]
        L24:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzaq.c(short, int, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        SleepSegmentRequest[] sleepSegmentRequestArr = new SleepSegmentRequest[i];
        int i6 = i4 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return sleepSegmentRequestArr;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Object obj = null;
        int i2 = 0;
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            b = i3 % 128;
            int i4 = i3 % 2;
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                int i5 = b + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 != 0) {
                    if (fieldId != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                        int i6 = b + 83;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        i2 = SafeParcelReader.readInt(parcel, header);
                    }
                } else if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                    int i8 = b + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i2 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzas.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        SleepSegmentRequest sleepSegmentRequest = new SleepSegmentRequest(arrayListCreateTypedList, i2);
        int i10 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        if (i10 % 2 == 0) {
            return sleepSegmentRequest;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $10 + 17;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getTrimmedLength("") + 8328), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1234, ExpandableListView.getPackedPositionChild(0L) + 36, -653973969, false, $$e(b2, b3, (byte) (b3 - 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.getMode(0), 2812 - AndroidCharacter.getMirror('0'), 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 252 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 2891 - (ViewConfiguration.getScrollBarSize() >> 8), Color.argb(0, 0, 0, 0) + 17, 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
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
        int i6 = $10 + 105;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 59 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0376  */
    /* JADX WARN: Code duplicated, block: B:40:0x037c  */
    /* JADX WARN: Code duplicated, block: B:42:0x038b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0398  */
    /* JADX WARN: Code duplicated, block: B:51:0x03e7 A[Catch: all -> 0x04ea, TryCatch #4 {all -> 0x04ea, blocks: (B:49:0x03da, B:51:0x03e7, B:52:0x042f), top: B:117:0x03da, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x04f5 A[Catch: Exception -> 0x06ec, TRY_LEAVE, TryCatch #1 {Exception -> 0x06ec, blocks: (B:58:0x04ed, B:60:0x04f3, B:61:0x04f4, B:62:0x04f5, B:64:0x0562, B:68:0x05af, B:71:0x0627, B:76:0x06a4, B:87:0x06e2, B:89:0x06e8, B:90:0x06e9, B:70:0x05e6, B:72:0x0650, B:74:0x065d, B:75:0x069d, B:49:0x03da, B:51:0x03e7, B:52:0x042f), top: B:112:0x0396, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x05e6 A[Catch: Exception -> 0x06ec, TryCatch #1 {Exception -> 0x06ec, blocks: (B:58:0x04ed, B:60:0x04f3, B:61:0x04f4, B:62:0x04f5, B:64:0x0562, B:68:0x05af, B:71:0x0627, B:76:0x06a4, B:87:0x06e2, B:89:0x06e8, B:90:0x06e9, B:70:0x05e6, B:72:0x0650, B:74:0x065d, B:75:0x069d, B:49:0x03da, B:51:0x03e7, B:52:0x042f), top: B:112:0x0396, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x065d A[Catch: all -> 0x06e1, TryCatch #0 {all -> 0x06e1, blocks: (B:72:0x0650, B:74:0x065d, B:75:0x069d), top: B:110:0x0650, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:80:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:83:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0730  */
    /* JADX WARN: Code duplicated, block: B:96:0x073c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v9 */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        ?? r2;
        int i7;
        ?? r31;
        int i8;
        int i9;
        int i10;
        char[] cArr;
        char[] cArr2;
        int i11;
        char c;
        int i12;
        int i13;
        int i14;
        String str;
        char[] cArr3;
        char[] cArr4;
        int i15;
        int i16;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i17;
        int i18;
        int i19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i20 = 2 % 2;
        int i21 = b + 87;
        int i22 = i21 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22;
        if (i21 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (context != 0) {
            int i23 = (i22 ^ 95) + ((i22 & 95) << 1);
            b = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
            try {
                char[] cArr5 = {65409, 33507, 46313, 1627};
                char[] cArr6 = {10456, 40849, 5998, 58306};
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int i24 = -Gravity.getAbsoluteGravity(0, 0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = com.google.android.gms.internal.fido.zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i25 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i26 = ~(((-1855951145) ^ i25) | ((-1855951145) & i25));
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i28 = (i27 ^ 65) + ((i27 & 65) << 1);
                b = i28 % 128;
                int i29 = i28 % 2;
                int i30 = ~((-1855951145) | i24);
                int i31 = (i24 * 50) + 361365464 + (98 * ((i30 & i26) | (i26 ^ i30)));
                int i32 = ~((~i24) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i33 = (((-1855951145) & i32) | ((-1855951145) ^ i32) | (~((i24 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i24 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))) * (-49);
                int i34 = (i31 ^ i33) + ((i31 & i33) << 1) + (((~(i24 | 1855951144)) | (~(((-1855951145) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-1855951145) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))) * 49);
                Object[] objArr2 = new Object[1];
                a(cArr5, cArr6, cIndexOf, i34, new char[]{40869, 59618, 29567, 52684, 59716, 65477, 11180, 7138, 28544, 32999, 42217, 33049, 40512, 20917, 19268, 45959, 30486, 16268, 25263, 6889, 3336, 9129, 60675}, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                a(new char[]{65409, 33507, 46313, 1627}, new char[]{5498, 40374, 60392, 63263}, (char) (8170 - (~(-TextUtils.getOffsetBefore("", 0)))), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{54840, 884, 38985, 51591, 24652, 64008, 32959, 12151, 35984, 20139, 54241, 4870, 24554, 19539, 30616, 56051, 19115, 3006}, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                Object[] objArr4 = new Object[1];
                a(new char[]{65409, 33507, 46313, 1627}, new char[]{23803, 8903, 59962, 13429}, (char) TextUtils.indexOf("", "", 0), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{50607, 8000, 7139, 46329, 32003, 64047, 4683, 24389, 30872, 46052, 6764, 48013, 25532, 40269, 5953, 51420, 61496, 45310, 2009, 6412, 11861, 814, 31031, 3396, 61960, 43656, 28219, 28025, 2708, 10863, 44213, 11884, 65316, 10815}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                int i35 = b;
                int i36 = ((i35 | 27) << 1) - (i35 ^ 27);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i36 % 128;
                int i37 = i36 % 2;
                int i38 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = com.google.android.gms.internal.fido.zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i39 = (i38 * (-919)) - 48571907;
                int i40 = ~i38;
                int i41 = (i40 ^ (-52854)) | (i40 & (-52854));
                int i42 = ~((i41 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i41 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i43 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i44 = (-52854) | i43;
                int i45 = ~((i44 ^ i38) | (i44 & i38));
                int i46 = ((i42 ^ i45) | (i42 & i45)) * 920;
                int i47 = (i39 & i46) + (i46 | i39);
                int i48 = ~i41;
                int i49 = ~i38;
                int i50 = ~((i49 ^ i43) | (i49 & i43));
                int i51 = -(-(((i48 ^ i50) | (i48 & i50)) * 920));
                int i52 = ((i47 | i51) << 1) - (i51 ^ i47);
                int i53 = (i49 ^ (-52854)) | (i49 & (-52854));
                int i54 = (52853 & i40) | (i40 ^ 52853);
                int i55 = (~((i53 & i43) | (i53 ^ i43))) | (~((i54 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i54 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2)));
                int i56 = ~((i38 & (-52854)) | ((-52854) ^ i38) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i57 = -(-(((i55 & i56) | (i55 ^ i56)) * 920));
                char c2 = (char) (((i52 | i57) << 1) - (i57 ^ i52));
                int i58 = -AndroidCharacter.getMirror('0');
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = com.google.android.gms.internal.fido.zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i59 = i58 * (-958);
                int i60 = (i59 ^ 1431216442) + ((i59 & 1431216442) << 1);
                int i61 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i62 = ~((629150978 & i61) | (629150978 ^ i61));
                int i63 = ~i58;
                int i64 = (i60 - (~(((i62 | (~((i63 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i63 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) | (~(i61 | i58))) * 959))) - 1;
                int i65 = (~(((-629150979) & i58) | (i58 ^ (-629150979)))) * (-959);
                int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                int i67 = ~i58;
                int i68 = ~((i61 & i67) | (i67 ^ i61));
                int i69 = ~((629150978 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (629150978 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                int i70 = ((~((i58 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i58 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | (i68 & i69) | (i68 ^ i69)) * 959;
                Object[] objArr5 = new Object[1];
                a(new char[]{65409, 33507, 46313, 1627}, new char[]{52733, 32746, 30170, 30926}, c2, (i66 ^ i70) + ((i70 & i66) << 1), new char[]{3854, 32661, 51173, 54598, 40059}, objArr5);
                int i71 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i72 = (i & (-2)) | ((~i) & 1);
                int i73 = -i71;
                int i74 = ((i71 & i73) | (i71 ^ i73)) >> 31;
                int i75 = (~i74) & i;
                int i76 = i74 & i72;
                i4 = (i76 & i75) | (i75 ^ i76);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (16949 - View.resolveSize(0, 0));
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2739;
                int iAlpha = Color.alpha(0) + 13;
                byte b2 = $$a[7];
                Object[] objArr6 = new Object[1];
                c((byte) 52, b2, (short) (b2 | 141), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, scrollBarFadeDuration, iAlpha, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char size = (char) (16949 - View.MeasureSpec.getSize(0));
                int i77 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2739;
                int i78 = 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b3 = $$a[7];
                Object[] objArr7 = new Object[1];
                c((byte) 52, b3, (short) (b3 | 89), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, i77, i78, 47863026, false, (String) objArr7[0], null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i80 = ((i79 | 117) << 1) - (i79 ^ 117);
            b = i80 % 128;
            if (i80 % 2 == 0) {
                set.contains(obj2);
                throw null;
            }
            if (!set.contains(obj2)) {
                int i81 = b;
                int i82 = (i81 & 101) + (i81 | 101);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i82 % 128;
                int i83 = i82 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf = (char) (16948 - TextUtils.lastIndexOf("", '0'));
                    int bitsPerPixel = 2738 - ImageFormat.getBitsPerPixel(0);
                    int maxKeyCode = 13 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b4 = (byte) ($$b & 63);
                    byte b5 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (short) (b5 | 37), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, bitsPerPixel, maxKeyCode, 631063962, false, (String) objArr8[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i84 = b;
                        int i85 = (i84 & 39) + (i84 | 39);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i85 % 128;
                        int i86 = i85 % 2;
                        char cResolveOpacity = (char) (14264 - Drawable.resolveOpacity(0, 0));
                        int i87 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr9 = new Object[1];
                        a(new char[]{65409, 33507, 46313, 1627}, new char[]{32103, 30382, 47320, 12855}, cResolveOpacity, (i87 ^ (-1)) + (i87 << 1), new char[]{17682, 55730, 39052, 57376, 3377, 9384, 4342, 13906, 21797, 16946, 37941, 36840, 17677, 34059, 51760, 28141, 36148, 'y', 65347, 6290, 9096, 27151, 16739, 40710, 2653, 26504, 62116, 42052}, objArr9);
                        Object[] objArr10 = {(String) objArr9[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                            int i88 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                            int i89 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8;
                            byte[] bArr = $$a;
                            byte b6 = bArr[7];
                            Object[] objArr11 = new Object[1];
                            c(b6, bArr[132], b6, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, i88, i89, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                        long j = 780023256;
                        long j2 = 886;
                        long j3 = -1;
                        long j4 = jLongValue ^ j3;
                        long jNextInt = new Random().nextInt(16962088);
                        long j5 = (((j ^ j3) | j4) ^ j3) | ((j4 | jNextInt) ^ j3);
                        long j6 = jNextInt ^ j3;
                        long j7 = j6 | j;
                        r31 = i4;
                        long j8 = (((long) 1773) * j) + (((long) (-885)) * jLongValue) + ((j5 | ((j7 | jLongValue) ^ j3)) * j2) + (((long) (-1772)) * (((j6 | jLongValue) ^ j3) | j)) + (j2 * (j7 ^ j3)) + ((long) (-980941493));
                        int i90 = ~(627148101 | i);
                        int i91 = ~i;
                        int i92 = i90 | (~(2064374512 | i91));
                        int i93 = ~((-627148102) | i91);
                        int i94 = ((int) (j8 >> 32)) & ((-114005806) + ((i92 | i93) * (-516)) + (((~((-1510628017) | i)) | (~((-553746497) | i91))) * 516) + ((553746496 | i93) * 516));
                        int i95 = 818884229 + (((~((-487700048) | i)) | 218215430 | (~(1924926457 | i))) * (-880));
                        int i96 = (~(i91 | (-487700048))) | (-1924926458);
                        int i97 = ~(487700047 | i);
                        i7 = i94 | (((int) j8) & (i95 + ((i96 | i97) * (-880)) + (i97 * 880)));
                    } else {
                        context = i4;
                        cArr = new char[]{65409, 33507, 46313, 1627};
                        cArr2 = new char[]{7380, 47906, 26490, 48640};
                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i98 = (keyRepeatDelay ^ 103) | (keyRepeatDelay & 103);
                        i11 = ~i;
                        int i99 = (((keyRepeatDelay * 370) - (-38110)) - (~(((i98 & i11) | (i98 ^ i11)) * (-369)))) - 1;
                        int i100 = ~keyRepeatDelay;
                        int i101 = -(-(((~((i100 & i11) | (i100 ^ i11))) | 103) * (-369)));
                        int i102 = (i99 & i101) + (i99 | i101);
                        int i103 = ~(((-104) & keyRepeatDelay) | ((-104) ^ keyRepeatDelay));
                        int i104 = b;
                        int i105 = (i104 ^ 91) + ((i104 & 91) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                        int i106 = i105 % 2;
                        int i107 = i103 | ((keyRepeatDelay | i) ^ (-1));
                        int i108 = ~keyRepeatDelay;
                        int i109 = (i108 & i11) | (i108 ^ i11);
                        int i110 = ~((i109 & 103) | (i109 ^ 103));
                        c = (char) ((i102 - (~(-(-(369 * ((i110 & i107) | (i107 ^ i110))))))) - 1);
                        int iAxisFromString = MotionEvent.axisFromString("");
                        int i111 = iAxisFromString * 784;
                        int i112 = ((i111 | 408800106) << 1) - (i111 ^ 408800106);
                        int i113 = (i112 ^ 1650284994) + ((1650284994 & i112) << 1);
                        int i114 = ~iAxisFromString;
                        int i115 = (i114 & i11) | (i114 ^ i11);
                        int i116 = -(-((~((i115 & 2059084317) | (i115 ^ 2059084317))) * (-783)));
                        i12 = (i113 & i116) + (i116 | i113);
                        i13 = ~iAxisFromString;
                        int i117 = b;
                        i14 = ((i117 | 29) << 1) - (i117 ^ 29);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i118 = ~((2059084317 & i11) | (i11 ^ 2059084317));
                            int i119 = i12 * (783 >>> ((i13 & i118) | (i13 ^ i118)));
                            Object[] objArr12 = new Object[1];
                            a(cArr, cArr2, c, i119, new char[]{13779}, objArr12);
                            str = (String) objArr12[0];
                            cArr3 = new char[]{65409, 33507, 46313, 1627};
                            cArr4 = new char[]{37482, 48746, 10314, 8727};
                            i15 = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                            i16 = 16103;
                        } else {
                            int i120 = ~i;
                            int i121 = ~((2059084317 & i120) | (i120 ^ 2059084317));
                            int i122 = ((i13 & i121) | (i13 ^ i121)) * 783;
                            Object[] objArr13 = new Object[1];
                            a(cArr, cArr2, c, (i12 ^ i122) + ((i122 & i12) << 1), new char[]{13779}, objArr13);
                            str = (String) objArr13[0];
                            cArr3 = new char[]{65409, 33507, 46313, 1627};
                            cArr4 = new char[]{37482, 48746, 10314, 8727};
                            i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            i16 = 5927;
                        }
                        char[] cArr7 = cArr4;
                        int i123 = i16;
                        char[] cArr8 = cArr3;
                        int i124 = -(-i15);
                        char c3 = (char) ((i123 ^ i124) + ((i124 & i123) << 1));
                        int i125 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr14 = new Object[1];
                        a(cArr8, cArr7, c3, ((i125 | 1253993106) << 1) - (i125 ^ 1253993106), new char[]{42221, 49295, 34719, 16212, 44331, 4094, 41649, 18191, 36239, 24461, 51532, 28865, 10489}, objArr14);
                        objArr = new Object[]{(String) objArr14[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c4 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int i126 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085;
                            int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr2 = $$a;
                            byte b7 = bArr2[7];
                            Object[] objArr15 = new Object[1];
                            c(b7, bArr2[132], b7, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i126, iNormalizeMetaState, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i127 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i18 = (i127 & 55) + (i127 | 55);
                            int i128 = i18 % 128;
                            b = i128;
                            if (i18 % 2 == 0) {
                                i19 = 0;
                            } else {
                                i19 = 1;
                            }
                            int i129 = ((i128 | 33) << 1) - (i128 ^ 33);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i129 % 128;
                            int i130 = i129 % 2;
                            i7 = i19;
                            r31 = context;
                        } else {
                            int i131 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i17 = (i131 ^ 81) + ((i131 & 81) << 1);
                            b = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i132 = 4 / 5;
                            }
                            i7 = 0;
                            r31 = context;
                        }
                    }
                    int i133 = (~(i & 10)) & (i | 10);
                    int i134 = -i7;
                    int i135 = ((i7 & i134) | (i7 ^ i134)) >> 31;
                    int i136 = (~i135) & i;
                    int i137 = b;
                    int i138 = i137 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i138 % 128;
                    int i139 = i138 % 2;
                    int i140 = i135 & i133;
                    i8 = (i140 & i136) | (i136 ^ i140);
                    int i141 = i2 & 32;
                    int i142 = ((i137 | 93) << 1) - (i137 ^ 93);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i142 % 128;
                    int i143 = i142 % 2;
                    int i144 = -i141;
                    i9 = ((i141 & i144) | (i141 ^ i144)) >> 31;
                    i10 = ((i137 | 67) << 1) - (i137 ^ 67);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i145 = i8 & (~i9);
                        int i146 = i9 & i;
                        i6 = (i145 & i146) | (i145 ^ i146);
                        int i147 = 88 / 0;
                    } else {
                        int i148 = i8 & (~i9);
                        int i149 = i9 & i;
                        i6 = (i148 & i149) | (i148 ^ i149);
                    }
                    r2 = r31;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i150 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i5 = (i150 & 97) + (i150 | 97);
                    b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i151 = 3 % 4;
                    }
                    i6 = i;
                    r2 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i810 = b;
                        int i811 = (i810 & 39) + (i810 | 39);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i811 % 128;
                        int i812 = i811 % 2;
                        char cResolveOpacity2 = (char) (14264 - Drawable.resolveOpacity(0, 0));
                        int i813 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr16 = new Object[1];
                        a(new char[]{65409, 33507, 46313, 1627}, new char[]{32103, 30382, 47320, 12855}, cResolveOpacity2, (i813 ^ (-1)) + (i813 << 1), new char[]{17682, 55730, 39052, 57376, 3377, 9384, 4342, 13906, 21797, 16946, 37941, 36840, 17677, 34059, 51760, 28141, 36148, 'y', 65347, 6290, 9096, 27151, 16739, 40710, 2653, 26504, 62116, 42052}, objArr16);
                        Object[] objArr17 = {(String) objArr16[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                            int i814 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                            int i815 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8;
                            byte[] bArr3 = $$a;
                            byte b8 = bArr3[7];
                            Object[] objArr18 = new Object[1];
                            c(b8, bArr3[132], b8, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf3, i814, i815, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                        long j9 = 780023256;
                        long j10 = 886;
                        long j11 = -1;
                        long j12 = jLongValue2 ^ j11;
                        long jNextInt2 = new Random().nextInt(16962088);
                        long j13 = (((j9 ^ j11) | j12) ^ j11) | ((j12 | jNextInt2) ^ j11);
                        long j14 = jNextInt2 ^ j11;
                        long j15 = j14 | j9;
                        r31 = i4;
                        long j16 = (((long) 1773) * j9) + (((long) (-885)) * jLongValue2) + ((j13 | ((j15 | jLongValue2) ^ j11)) * j10) + (((long) (-1772)) * (((j14 | jLongValue2) ^ j11) | j9)) + (j10 * (j15 ^ j11)) + ((long) (-980941493));
                        int i910 = ~(627148101 | i);
                        int i911 = ~i;
                        int i912 = i910 | (~(2064374512 | i911));
                        int i913 = ~((-627148102) | i911);
                        int i914 = ((int) (j16 >> 32)) & ((-114005806) + ((i912 | i913) * (-516)) + (((~((-1510628017) | i)) | (~((-553746497) | i911))) * 516) + ((553746496 | i913) * 516));
                        int i915 = 818884229 + (((~((-487700048) | i)) | 218215430 | (~(1924926457 | i))) * (-880));
                        int i916 = (~(i911 | (-487700048))) | (-1924926458);
                        int i917 = ~(487700047 | i);
                        i7 = i914 | (((int) j16) & (i915 + ((i916 | i917) * (-880)) + (i917 * 880)));
                    } else {
                        context = i4;
                        cArr = new char[]{65409, 33507, 46313, 1627};
                        cArr2 = new char[]{7380, 47906, 26490, 48640};
                        int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i918 = (keyRepeatDelay2 ^ 103) | (keyRepeatDelay2 & 103);
                        i11 = ~i;
                        int i919 = (((keyRepeatDelay2 * 370) - (-38110)) - (~(((i918 & i11) | (i918 ^ i11)) * (-369)))) - 1;
                        int i1010 = ~keyRepeatDelay2;
                        int i1011 = -(-(((~((i1010 & i11) | (i1010 ^ i11))) | 103) * (-369)));
                        int i1012 = (i919 & i1011) + (i919 | i1011);
                        int i1013 = ~(((-104) & keyRepeatDelay2) | ((-104) ^ keyRepeatDelay2));
                        int i1014 = b;
                        int i1015 = (i1014 ^ 91) + ((i1014 & 91) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1015 % 128;
                        int i1016 = i1015 % 2;
                        int i1017 = i1013 | ((keyRepeatDelay2 | i) ^ (-1));
                        int i1018 = ~keyRepeatDelay2;
                        int i1019 = (i1018 & i11) | (i1018 ^ i11);
                        int i1110 = ~((i1019 & 103) | (i1019 ^ 103));
                        c = (char) ((i1012 - (~(-(-(369 * ((i1110 & i1017) | (i1017 ^ i1110))))))) - 1);
                        int iAxisFromString2 = MotionEvent.axisFromString("");
                        int i1111 = iAxisFromString2 * 784;
                        int i1112 = ((i1111 | 408800106) << 1) - (i1111 ^ 408800106);
                        int i1113 = (i1112 ^ 1650284994) + ((1650284994 & i1112) << 1);
                        int i1114 = ~iAxisFromString2;
                        int i1115 = (i1114 & i11) | (i1114 ^ i11);
                        int i1116 = -(-((~((i1115 & 2059084317) | (i1115 ^ 2059084317))) * (-783)));
                        i12 = (i1113 & i1116) + (i1116 | i1113);
                        i13 = ~iAxisFromString2;
                        int i1117 = b;
                        i14 = ((i1117 | 29) << 1) - (i1117 ^ 29);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i1118 = ~((2059084317 & i11) | (i11 ^ 2059084317));
                            int i1119 = i12 * (783 >>> ((i13 & i1118) | (i13 ^ i1118)));
                            Object[] objArr19 = new Object[1];
                            a(cArr, cArr2, c, i1119, new char[]{13779}, objArr19);
                            str = (String) objArr19[0];
                            cArr3 = new char[]{65409, 33507, 46313, 1627};
                            cArr4 = new char[]{37482, 48746, 10314, 8727};
                            i15 = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                            i16 = 16103;
                        } else {
                            int i1210 = ~i;
                            int i1211 = ~((2059084317 & i1210) | (i1210 ^ 2059084317));
                            int i1212 = ((i13 & i1211) | (i13 ^ i1211)) * 783;
                            Object[] objArr110 = new Object[1];
                            a(cArr, cArr2, c, (i12 ^ i1212) + ((i1212 & i12) << 1), new char[]{13779}, objArr110);
                            str = (String) objArr110[0];
                            cArr3 = new char[]{65409, 33507, 46313, 1627};
                            cArr4 = new char[]{37482, 48746, 10314, 8727};
                            i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            i16 = 5927;
                        }
                        char[] cArr9 = cArr4;
                        int i1213 = i16;
                        char[] cArr10 = cArr3;
                        int i1214 = -(-i15);
                        char c5 = (char) ((i1213 ^ i1214) + ((i1214 & i1213) << 1));
                        int i1215 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr111 = new Object[1];
                        a(cArr10, cArr9, c5, ((i1215 | 1253993106) << 1) - (i1215 ^ 1253993106), new char[]{42221, 49295, 34719, 16212, 44331, 4094, 41649, 18191, 36239, 24461, 51532, 28865, 10489}, objArr111);
                        objArr = new Object[]{(String) objArr111[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c6 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int i1216 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085;
                            int iNormalizeMetaState2 = 26 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            Object[] objArr112 = new Object[1];
                            c(b9, bArr4[132], b9, objArr112);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c6, i1216, iNormalizeMetaState2, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i1217 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i18 = (i1217 & 55) + (i1217 | 55);
                            int i1218 = i18 % 128;
                            b = i1218;
                            if (i18 % 2 == 0) {
                                i19 = 0;
                            } else {
                                i19 = 1;
                            }
                            int i1219 = ((i1218 | 33) << 1) - (i1218 ^ 33);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1219 % 128;
                            int i1310 = i1219 % 2;
                            i7 = i19;
                            r31 = context;
                        } else {
                            int i1311 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i17 = (i1311 ^ 81) + ((i1311 & 81) << 1);
                            b = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i1312 = 4 / 5;
                            }
                            i7 = 0;
                            r31 = context;
                        }
                    }
                    int i1313 = (~(i & 10)) & (i | 10);
                    int i1314 = -i7;
                    int i1315 = ((i7 & i1314) | (i7 ^ i1314)) >> 31;
                    int i1316 = (~i1315) & i;
                    int i1317 = b;
                    int i1318 = i1317 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1318 % 128;
                    int i1319 = i1318 % 2;
                    int i1410 = i1315 & i1313;
                    i8 = (i1410 & i1316) | (i1316 ^ i1410);
                    int i1411 = i2 & 32;
                    int i1412 = ((i1317 | 93) << 1) - (i1317 ^ 93);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1412 % 128;
                    int i1413 = i1412 % 2;
                    int i1414 = -i1411;
                    i9 = ((i1411 & i1414) | (i1411 ^ i1414)) >> 31;
                    i10 = ((i1317 | 67) << 1) - (i1317 ^ 67);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i1415 = i8 & (~i9);
                        int i1416 = i9 & i;
                        i6 = (i1415 & i1416) | (i1415 ^ i1416);
                        int i1417 = 88 / 0;
                    } else {
                        int i1418 = i8 & (~i9);
                        int i1419 = i9 & i;
                        i6 = (i1418 & i1419) | (i1418 ^ i1419);
                    }
                    r2 = r31;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i152 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i5 = (i152 & 97) + (i152 | 97);
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i153 = 3 % 4;
                }
                i6 = i;
                r2 = i4;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i816 = b;
                            int i817 = (i816 & 39) + (i816 | 39);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i817 % 128;
                            int i818 = i817 % 2;
                            char cResolveOpacity3 = (char) (14264 - Drawable.resolveOpacity(0, 0));
                            int i819 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            Object[] objArr113 = new Object[1];
                            a(new char[]{65409, 33507, 46313, 1627}, new char[]{32103, 30382, 47320, 12855}, cResolveOpacity3, (i819 ^ (-1)) + (i819 << 1), new char[]{17682, 55730, 39052, 57376, 3377, 9384, 4342, 13906, 21797, 16946, 37941, 36840, 17677, 34059, 51760, 28141, 36148, 'y', 65347, 6290, 9096, 27151, 16739, 40710, 2653, 26504, 62116, 42052}, objArr113);
                            try {
                                Object[] objArr114 = {(String) objArr113[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                                    int i8110 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 993;
                                    int i8111 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8;
                                    byte[] bArr5 = $$a;
                                    byte b10 = bArr5[7];
                                    Object[] objArr115 = new Object[1];
                                    c(b10, bArr5[132], b10, objArr115);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf4, i8110, i8111, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                                long j17 = 780023256;
                                long j18 = 886;
                                long j19 = -1;
                                long j110 = jLongValue3 ^ j19;
                                long jNextInt3 = new Random().nextInt(16962088);
                                long j111 = (((j17 ^ j19) | j110) ^ j19) | ((j110 | jNextInt3) ^ j19);
                                long j112 = jNextInt3 ^ j19;
                                long j113 = j112 | j17;
                                r31 = i4;
                                long j114 = (((long) 1773) * j17) + (((long) (-885)) * jLongValue3) + ((j111 | ((j113 | jLongValue3) ^ j19)) * j18) + (((long) (-1772)) * (((j112 | jLongValue3) ^ j19) | j17)) + (j18 * (j113 ^ j19)) + ((long) (-980941493));
                                int i9110 = ~(627148101 | i);
                                int i9111 = ~i;
                                int i9112 = i9110 | (~(2064374512 | i9111));
                                int i9113 = ~((-627148102) | i9111);
                                int i9114 = ((int) (j114 >> 32)) & ((-114005806) + ((i9112 | i9113) * (-516)) + (((~((-1510628017) | i)) | (~((-553746497) | i9111))) * 516) + ((553746496 | i9113) * 516));
                                int i9115 = 818884229 + (((~((-487700048) | i)) | 218215430 | (~(1924926457 | i))) * (-880));
                                int i9116 = (~(i9111 | (-487700048))) | (-1924926458);
                                int i9117 = ~(487700047 | i);
                                i7 = i9114 | (((int) j114) & (i9115 + ((i9116 | i9117) * (-880)) + (i9117 * 880)));
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            context = i4;
                            cArr = new char[]{65409, 33507, 46313, 1627};
                            cArr2 = new char[]{7380, 47906, 26490, 48640};
                            int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                            int i9118 = (keyRepeatDelay3 ^ 103) | (keyRepeatDelay3 & 103);
                            i11 = ~i;
                            int i9119 = (((keyRepeatDelay3 * 370) - (-38110)) - (~(((i9118 & i11) | (i9118 ^ i11)) * (-369)))) - 1;
                            int i10110 = ~keyRepeatDelay3;
                            int i10111 = -(-(((~((i10110 & i11) | (i10110 ^ i11))) | 103) * (-369)));
                            int i10112 = (i9119 & i10111) + (i9119 | i10111);
                            int i10113 = ~(((-104) & keyRepeatDelay3) | ((-104) ^ keyRepeatDelay3));
                            int i10114 = b;
                            int i10115 = (i10114 ^ 91) + ((i10114 & 91) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10115 % 128;
                            int i10116 = i10115 % 2;
                            int i10117 = i10113 | ((keyRepeatDelay3 | i) ^ (-1));
                            int i10118 = ~keyRepeatDelay3;
                            int i10119 = (i10118 & i11) | (i10118 ^ i11);
                            int i11110 = ~((i10119 & 103) | (i10119 ^ 103));
                            c = (char) ((i10112 - (~(-(-(369 * ((i11110 & i10117) | (i10117 ^ i11110))))))) - 1);
                            int iAxisFromString3 = MotionEvent.axisFromString("");
                            int i11111 = iAxisFromString3 * 784;
                            int i11112 = ((i11111 | 408800106) << 1) - (i11111 ^ 408800106);
                            int i11113 = (i11112 ^ 1650284994) + ((1650284994 & i11112) << 1);
                            int i11114 = ~iAxisFromString3;
                            int i11115 = (i11114 & i11) | (i11114 ^ i11);
                            int i11116 = -(-((~((i11115 & 2059084317) | (i11115 ^ 2059084317))) * (-783)));
                            i12 = (i11113 & i11116) + (i11116 | i11113);
                            i13 = ~iAxisFromString3;
                            int i11117 = b;
                            i14 = ((i11117 | 29) << 1) - (i11117 ^ 29);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i11118 = ~((2059084317 & i11) | (i11 ^ 2059084317));
                                int i11119 = i12 * (783 >>> ((i13 & i11118) | (i13 ^ i11118)));
                                Object[] objArr116 = new Object[1];
                                a(cArr, cArr2, c, i11119, new char[]{13779}, objArr116);
                                str = (String) objArr116[0];
                                cArr3 = new char[]{65409, 33507, 46313, 1627};
                                cArr4 = new char[]{37482, 48746, 10314, 8727};
                                i15 = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                                i16 = 16103;
                            } else {
                                int i12110 = ~i;
                                int i12111 = ~((2059084317 & i12110) | (i12110 ^ 2059084317));
                                int i12112 = ((i13 & i12111) | (i13 ^ i12111)) * 783;
                                Object[] objArr117 = new Object[1];
                                a(cArr, cArr2, c, (i12 ^ i12112) + ((i12112 & i12) << 1), new char[]{13779}, objArr117);
                                str = (String) objArr117[0];
                                cArr3 = new char[]{65409, 33507, 46313, 1627};
                                cArr4 = new char[]{37482, 48746, 10314, 8727};
                                i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                i16 = 5927;
                            }
                            char[] cArr11 = cArr4;
                            int i12113 = i16;
                            char[] cArr12 = cArr3;
                            int i12114 = -(-i15);
                            char c7 = (char) ((i12113 ^ i12114) + ((i12114 & i12113) << 1));
                            int i12115 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr118 = new Object[1];
                            a(cArr12, cArr11, c7, ((i12115 | 1253993106) << 1) - (i12115 ^ 1253993106), new char[]{42221, 49295, 34719, 16212, 44331, 4094, 41649, 18191, 36239, 24461, 51532, 28865, 10489}, objArr118);
                            try {
                                objArr = new Object[]{(String) objArr118[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c8 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                    int i12116 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085;
                                    int iNormalizeMetaState3 = 26 - KeyEvent.normalizeMetaState(0);
                                    byte[] bArr6 = $$a;
                                    byte b11 = bArr6[7];
                                    Object[] objArr119 = new Object[1];
                                    c(b11, bArr6[132], b11, objArr119);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c8, i12116, iNormalizeMetaState3, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i12117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i18 = (i12117 & 55) + (i12117 | 55);
                                    int i12118 = i18 % 128;
                                    b = i12118;
                                    if (i18 % 2 == 0) {
                                        i19 = 0;
                                    } else {
                                        i19 = 1;
                                    }
                                    int i12119 = ((i12118 | 33) << 1) - (i12118 ^ 33);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12119 % 128;
                                    int i13110 = i12119 % 2;
                                    i7 = i19;
                                    r31 = context;
                                } else {
                                    int i13111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i17 = (i13111 ^ 81) + ((i13111 & 81) << 1);
                                    b = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        int i13112 = 4 / 5;
                                    }
                                    i7 = 0;
                                    r31 = context;
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
                    context = i4;
                }
                int i13113 = (~(i & 10)) & (i | 10);
                int i13114 = -i7;
                int i13115 = ((i7 & i13114) | (i7 ^ i13114)) >> 31;
                int i13116 = (~i13115) & i;
                int i13117 = b;
                int i13118 = i13117 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13118 % 128;
                int i13119 = i13118 % 2;
                int i14110 = i13115 & i13113;
                i8 = (i14110 & i13116) | (i13116 ^ i14110);
                int i14111 = i2 & 32;
                int i14112 = ((i13117 | 93) << 1) - (i13117 ^ 93);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14112 % 128;
                int i14113 = i14112 % 2;
                int i14114 = -i14111;
                i9 = ((i14111 & i14114) | (i14111 ^ i14114)) >> 31;
                i10 = ((i13117 | 67) << 1) - (i13117 ^ 67);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i14115 = i8 & (~i9);
                    int i14116 = i9 & i;
                    i6 = (i14115 & i14116) | (i14115 ^ i14116);
                    int i14117 = 88 / 0;
                } else {
                    int i14118 = i8 & (~i9);
                    int i14119 = i9 & i;
                    i6 = (i14118 & i14119) | (i14118 ^ i14119);
                }
                r2 = r31;
            }
            int i154 = (~r2) & i;
            int i155 = ~i;
            int i156 = i154 | (r2 & i155);
            int i157 = (i156 | (-i156)) >> 31;
            int i158 = i6 & (~i157);
            int i159 = r2 & i157;
            int i160 = (i158 & i159) | (i158 ^ i159);
            int i161 = (~(i & i160)) & (i | i160);
            Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i160}, null};
            int i162 = 2001364 + ((~(349981450 | i155)) * (-560)) + ((~(385711935 | i)) * (-560)) + (((~((-309671222) | i155)) | 273940736) * 560);
            int i163 = -(-(((i161 | (-i161)) >> 31) & 16));
            int i164 = ((i162 | i163) << 1) - (i163 ^ i162);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = com.google.android.gms.internal.fido.zzah.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i165 = (i164 * (-419)) + (i3 * 421);
            int i166 = (~(i3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * TypedValues.CycleType.TYPE_EASING;
            int i167 = ~i164;
            int i168 = (((i165 | i166) << 1) - (i165 ^ i166)) + (((i3 ^ i167) | (i3 & i167)) * (-420));
            int i169 = ~i3;
            int i170 = ~((i167 & i169) | (i167 ^ i169));
            int i171 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i172 = ~((i171 & i3) | (i171 ^ i3));
            int i173 = -(-(((i172 & i170) | (i170 ^ i172)) * TypedValues.CycleType.TYPE_EASING));
            int i174 = ((i168 | i173) << 1) - (i173 ^ i168);
            int i175 = i174 << 13;
            int i176 = (i175 | i174) & (~(i174 & i175));
            int i177 = i176 >>> 17;
            int i178 = ((~i176) & i177) | ((~i177) & i176);
            int i179 = i178 << 5;
            ((int[]) objArr20[1])[0] = ((~i178) & i179) | ((~i179) & i178);
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
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
    private static java.lang.String $$e(int r5, short r6, int r7) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = com.google.android.gms.location.zzaq.$$c
            int r6 = 104 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzaq.$$e(int, short, int):java.lang.String");
    }
}
