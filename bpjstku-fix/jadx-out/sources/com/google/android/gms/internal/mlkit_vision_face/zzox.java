package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.SessionProcessor;
import defpackage.getSessionStateCallback;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zzox implements Parcelable.Creator {
    private static final byte[] $$c = {80, -8, 43, 65};
    private static final int $$d = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
    private static final int $$b = 216;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 43884;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 98 - r6
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_face.zzox.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r5]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzox.c(byte, int, byte, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = b + 113;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        int i5 = i3 % 2;
        zzow[] zzowVarArr = new zzow[i];
        int i6 = i4 + 45;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return zzowVarArr;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i2 = 0;
        Rect rect = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList arrayListCreateTypedList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    rect = (Rect) SafeParcelReader.createParcelable(parcel, header, Rect.CREATOR);
                    break;
                case 3:
                    f = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    f2 = SafeParcelReader.readFloat(parcel, header);
                    int i3 = b + 119;
                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 2 / 2;
                    }
                    break;
                case 5:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    f4 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f5 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    f7 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 10:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzpc.CREATOR);
                    break;
                case 11:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, zzos.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    int i5 = b + 59;
                    TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                    int i6 = i5 % 2;
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzow(i2, rect, f, f2, f3, f4, f5, f6, f7, arrayListCreateTypedList, arrayListCreateTypedList2);
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
            int i4 = $10 + 1;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cCombineMeasuredStates = (char) (8328 - View.combineMeasuredStates(0, 0));
                    int iGreen = 1235 - Color.green(0);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 35;
                    byte b2 = (byte) ($$d - i2);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iGreen, scrollBarSize, -653973969, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2764;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
                    byte b4 = (byte) $$d;
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates2, jumpTapTimeout, fadingEdgeLength, 1504416861, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 252 - TextUtils.indexOf((CharSequence) "", '0', 0), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (65200 - ExpandableListView.getPackedPositionGroup(0L));
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2891;
                    int longPressTimeout = 17 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b6 = (byte) ($$d - 1);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, maxKeyCode, longPressTimeout, 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
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
        int i6 = $11 + 93;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0658 A[Catch: all -> 0x08ba, TryCatch #5 {all -> 0x08ba, blocks: (B:95:0x05e4, B:99:0x0656, B:101:0x067b, B:103:0x06ef, B:100:0x0658), top: B:164:0x05e4, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0721  */
    /* JADX WARN: Code duplicated, block: B:108:0x0725  */
    /* JADX WARN: Code duplicated, block: B:114:0x0776  */
    /* JADX WARN: Code duplicated, block: B:115:0x0778 A[Catch: Exception -> 0x0868, TRY_LEAVE, TryCatch #4 {Exception -> 0x0868, blocks: (B:110:0x0728, B:112:0x0770, B:115:0x0778, B:117:0x0859, B:119:0x0861, B:120:0x0867, B:116:0x0782), top: B:163:0x0728, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x086d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0879  */
    /* JADX WARN: Code duplicated, block: B:128:0x0882  */
    /* JADX WARN: Code duplicated, block: B:129:0x088c  */
    /* JADX WARN: Code duplicated, block: B:132:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:133:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:135:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:142:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:163:0x0728 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x05da A[Catch: Exception -> 0x08c2, TRY_LEAVE, TryCatch #8 {Exception -> 0x08c2, blocks: (B:80:0x04f4, B:83:0x05c3, B:85:0x05ca, B:94:0x05da, B:104:0x070f, B:137:0x08bb, B:138:0x08c1, B:91:0x05d2, B:95:0x05e4, B:99:0x0656, B:101:0x067b, B:103:0x06ef, B:100:0x0658), top: B:169:0x04f4, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0643  */
    public static Object[] b(int i, int i2) throws Throwable {
        int i3;
        String str;
        int i4;
        Object[] objArr;
        int[] iArr;
        int i5;
        char c;
        char c2;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i6;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zEquals;
        int i13;
        int i14;
        boolean zEquals2;
        int i15;
        int i16;
        char c3;
        int i17;
        String[] strArr;
        int[] iArr2;
        int i18;
        File file;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int iMakeMeasureSpec;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj;
        int i23 = 2 % 2;
        try {
            String[] strArr2 = new String[2];
            char[] cArr = {0, 0, 0, 0};
            char[] cArr2 = {45093, 15406, 29269, 21407};
            int i24 = b;
            int i25 = (i24 ^ 103) + ((i24 & 103) << 1);
            TuitionPaymentFragmentbindingInflater1 = i25 % 128;
            if (i25 % 2 == 0) {
                char cResolveSize = (char) (40818 % View.resolveSize(0, 0));
                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
                Object[] objArr2 = new Object[1];
                a(cArr, cArr2, cResolveSize, 1430007472 >>> ((maximumFlingVelocity ^ (-21)) + ((maximumFlingVelocity & (-21)) << 1)), new char[]{43360, 43232, 20997, 56586, 1562, 27174, 4809, 54524, 32400, 58669, 35425, 43987, 4635, 63398, 11270, 40550, 40565, 33074, 32067}, objArr2);
                strArr2[0] = (String) objArr2[0];
            } else {
                int iResolveSize = View.resolveSize(0, 0);
                int i26 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                Object[] objArr3 = new Object[1];
                a(cArr, cArr2, (char) ((iResolveSize ^ 40818) + ((iResolveSize & 40818) << 1)), (i26 & 1430007472) + (1430007472 | i26), new char[]{43360, 43232, 20997, 56586, 1562, 27174, 4809, 54524, 32400, 58669, 35425, 43987, 4635, 63398, 11270, 40550, 40565, 33074, 32067}, objArr3);
                strArr2[0] = (String) objArr3[0];
            }
            char[] cArr3 = {0, 0, 0, 0};
            char[] cArr4 = {28786, 44412, 2229, 10868};
            int i27 = -AndroidCharacter.getMirror('0');
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i28 = i27 * 881;
            int i29 = (i28 & 26211512) + (i28 | 26211512);
            int i30 = ~i27;
            int i31 = (~((i30 & (-29753)) | (i30 ^ (-29753)))) | (~((i30 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i30 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
            int i32 = ((-29753) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-29753) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i33 = TuitionPaymentFragmentbindingInflater1;
            int i34 = (i33 & 123) + (i33 | 123);
            b = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = i31 | (~i32);
                i21 = i29 << (((i35 | (-880)) << 1) - (i35 ^ (-880)));
                int i36 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i37 = ~((i36 & i30) | (i30 ^ i36));
                i22 = (i37 & 29752) | (i37 ^ 29752);
            } else {
                int i38 = ~i32;
                i21 = (((i31 & i38) | (i31 ^ i38)) * (-880)) + i29;
                int i39 = ~i27;
                int i40 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i22 = (~((i39 & i40) | (i39 ^ i40))) | 29752;
            }
            int i41 = (i27 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i27 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i42 = ~i41;
            int i43 = (-880) * ((i22 & i42) | (i22 ^ i42));
            char c4 = (char) ((((i21 ^ i43) + ((i21 & i43) << 1)) - (~((~i41) * 880))) - 1);
            Object[] objArr4 = new Object[1];
            a(cArr3, cArr4, c4, Gravity.getAbsoluteGravity(0, 0), new char[]{3138, 42921, 64782, 33104, 51162, 6014, 63645, 985, 60697, 23929, 28054, '\f', 59295, 65299, 25668, 2841, 3128, 54034}, objArr4);
            strArr2[1] = (String) objArr4[0];
            int i44 = 0;
            while (true) {
                if (i44 >= 2) {
                    i3 = i;
                    break;
                }
                String str2 = strArr2[i44];
                char[] cArr5 = {0, 0, 0, 0};
                char[] cArr6 = {56017, 7583, 11622, 2075};
                int i45 = b + 75;
                TuitionPaymentFragmentbindingInflater1 = i45 % 128;
                int i46 = i45 % 2;
                int i47 = -View.combineMeasuredStates(0, 0);
                char c5 = (char) (((i47 | 6957) << 1) - (i47 ^ 6957));
                int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
                int i48 = TuitionPaymentFragmentbindingInflater1 + 17;
                b = i48 % 128;
                if (i48 % 2 != 0) {
                    int i49 = keyRepeatDelay + 16;
                    Object[] objArr5 = new Object[1];
                    a(cArr5, cArr6, c5, i49, new char[]{21404, 59381, 47023, 60014, 15496, 41516, 56381, 33729, 25865, 4938, 33168, 17093, 23021, 36151, 15407, 33330}, objArr5);
                    obj = objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    a(cArr5, cArr6, c5, keyRepeatDelay >> 16, new char[]{21404, 59381, 47023, 60014, 15496, 41516, 56381, 33729, 25865, 4938, 33168, 17093, 23021, 36151, 15407, 33330}, objArr6);
                    obj = objArr6[0];
                }
                Class<?> cls = Class.forName((String) obj);
                int i50 = TuitionPaymentFragmentbindingInflater1;
                int i51 = ((i50 | 125) << 1) - (i50 ^ 125);
                b = i51 % 128;
                int i52 = i51 % 2;
                Method method = cls.getMethod(str2, new Class[0]);
                int i53 = b;
                int i54 = (i53 ^ 77) + ((i53 & 77) << 1);
                TuitionPaymentFragmentbindingInflater1 = i54 % 128;
                int i55 = i54 % 2;
                if (((Boolean) method.invoke(cls, null)).booleanValue()) {
                    int i56 = TuitionPaymentFragmentbindingInflater1;
                    int i57 = i56 + 101;
                    b = i57 % 128;
                    int i58 = i57 % 2;
                    i3 = (~(i & 1)) & (i | 1);
                    int i59 = i56 + 73;
                    b = i59 % 128;
                    if (i59 % 2 == 0) {
                        break;
                    }
                    int i60 = 3 / 3;
                    break;
                }
                int i61 = (i44 & (-9)) + (i44 | (-9));
                i44 = ((i61 | 10) << 1) - (i61 ^ 10);
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char offsetBefore = (char) (2419 - TextUtils.getOffsetBefore("", 0));
                int i62 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2844;
                int i63 = 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                Object[] objArr7 = new Object[1];
                c(b2, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, i62, i63, -501222268, false, (String) objArr7[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -949292874;
            int i64 = i3;
            long j2 = i;
            long j3 = -1;
            long j4 = j2 ^ j3;
            long j5 = jLongValue ^ j3;
            long j6 = (((long) 758) * j) + (((long) (-756)) * jLongValue) + (((long) (-757)) * (j | j4)) + (((long) 1514) * (((j5 | j) | j2) ^ j3)) + (((long) 757) * ((((j ^ j3) | j5) ^ j3) | ((j5 | j4) ^ j3) | ((j2 | (j | jLongValue)) ^ j3))) + ((long) (-209893812));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i65 = ~iFreeMemory;
            int i66 = ((int) (j6 >> 32)) & ((-802173004) + (((-714492674) | i65) * (-369)) + (((~(715017025 | i65)) | (-2142723860)) * (-369)) + (((~(iFreeMemory | (-715017026))) | 524352 | (~(i65 | (-1428231187)))) * 369));
            int iNextInt = new Random().nextInt(1219274597);
            int i67 = ((int) j6) & ((((~((-950406814) | iNextInt)) | 134218757) * (-566)) + 1516146019 + ((~(iNextInt | (-816188057))) * 566));
            int i68 = (i66 & i67) | (i66 ^ i67);
            int i69 = (i68 | 1) & (~(i68 & 1));
            int i70 = (i69 | (-i69)) >> 31;
            int i71 = (i ^ 10) & (~i70);
            int i72 = i70 & i;
            int i73 = (~i64) & i;
            int i74 = ~i;
            int i75 = i73 | (i64 & i74);
            int i76 = -i75;
            int i77 = ((i75 & i76) | (i75 ^ i76)) >> 31;
            int i78 = ((i72 & i71) | (i71 ^ i72)) & (~i77);
            int i79 = i64 & i77;
            int i80 = (i78 ^ i79) | (i78 & i79);
            try {
                Object[] objArr8 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{55074, 42630, 41154, 7768}, (char) (22686 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))))), KeyEvent.normalizeMetaState(0), new char[]{28211, 62002, 7207, 18603, 61151, 55875, 13600, 31088, 16492, 3376, 15149, 6241, 19378, 3092, 13049, 50748, 20812, 35856, 7981, 18140, 9207, 60268, 43060, 50055, 8926, 13243, 16952, 60133, 6758, 3358, 44844, 47093, 14953, 2721, 31619, 30754, 39173, 22418, 49293, 4916}, objArr8);
                File file2 = new File((String) objArr8[0]);
                if (file2.canRead()) {
                    FileReader fileReader3 = new FileReader(file2);
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                    try {
                        String line = bufferedReader3.readLine();
                        char[] cArr7 = {0, 0, 0, 0};
                        char[] cArr8 = {31768, 7808, 6451, 49795};
                        int i81 = TuitionPaymentFragmentbindingInflater1 + 47;
                        b = i81 % 128;
                        if (i81 % 2 != 0) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1, 1);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i82 = -iMakeMeasureSpec;
                            i19 = ((i82 ^ (-958)) + ((i82 & (-958)) << 1)) / (-32151438);
                        } else {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i19 = (-32151438) + (iMakeMeasureSpec * (-958));
                        }
                        int i83 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i84 = ~(((-33562) ^ i83) | ((-33562) & i83));
                        int i85 = ~iMakeMeasureSpec;
                        int i86 = ~((i85 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i85 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i87 = (i84 ^ i86) | (i84 & i86);
                        int i88 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i89 = ~((i88 ^ iMakeMeasureSpec) | (i88 & iMakeMeasureSpec));
                        int i90 = 959 * ((i87 ^ i89) | (i87 & i89));
                        int i91 = ((i19 | i90) << 1) - (i19 ^ i90);
                        int i92 = -(-((~((33561 & iMakeMeasureSpec) | (iMakeMeasureSpec ^ 33561))) * (-959)));
                        int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                        int i94 = ~(i83 | (~iMakeMeasureSpec));
                        int i95 = TuitionPaymentFragmentbindingInflater1 + 123;
                        b = i95 % 128;
                        int i96 = i95 % 2;
                        int i97 = ~(((-33562) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-33562) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i98 = (i94 ^ i97) | (i94 & i97);
                        int i99 = ~((iMakeMeasureSpec & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iMakeMeasureSpec ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        char c6 = (char) ((i93 - (~(-(-(959 * ((i98 & i99) | (i98 ^ i99))))))) - 1);
                        int i100 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i101 = i100 * (-661);
                        int i102 = (i101 ^ 37634665) + ((i101 & 37634665) << 1);
                        int i103 = ~i;
                        int i104 = ~i100;
                        int i105 = TuitionPaymentFragmentbindingInflater1 + 57;
                        b = i105 % 128;
                        if (i105 % 2 != 0) {
                            int i106 = ~(i104 | (-857636988));
                            int i107 = 1324 >> ((i103 ^ i106) | (i103 & i106));
                            int i108 = ((i102 | i107) << 1) - (i102 ^ i107);
                            int i109 = ~((i100 ^ i) | (i100 & i));
                            int i110 = ~((i ^ 857636987) | (i & 857636987));
                            i20 = i108 * ((-1325) - (~(-((i109 ^ i110) | (i109 & i110)))));
                        } else {
                            int i111 = -(-((i103 | (~((i104 ^ (-857636988)) | (i104 & (-857636988))))) * 1324));
                            int i112 = (i102 & i111) + (i102 | i111);
                            int i113 = ((~((i100 ^ i) | (i100 & i))) | (~((i ^ 857636987) | (i & 857636987)))) * (-1324);
                            i20 = (i112 ^ i113) + ((i113 & i112) << 1);
                        }
                        int i114 = ~((~i100) | 857636987);
                        int i115 = ~((i100 & (-857636988)) | ((-857636988) ^ i100));
                        int i116 = i20 + (662 * ((i114 & i115) | (i114 ^ i115)));
                        Object[] objArr9 = new Object[1];
                        a(cArr7, cArr8, c6, i116, new char[]{40874, 21860, 12739}, objArr9);
                        if (line.equals((String) objArr9[0])) {
                            fileReader3.close();
                            bufferedReader3.close();
                            int i117 = TuitionPaymentFragmentbindingInflater1;
                            int i118 = (i117 ^ 77) + ((i117 & 77) << 1);
                            b = i118 % 128;
                            int i119 = i118 % 2;
                            int i120 = TuitionPaymentFragmentbindingInflater1;
                            int i121 = ((i120 | 37) << 1) - (i120 ^ 37);
                            b = i121 % 128;
                            int i122 = i121 % 2;
                            str = null;
                        } else {
                            fileReader3.close();
                            bufferedReader3.close();
                            int i123 = b;
                            int i124 = (i123 ^ 57) + ((i123 & 57) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i124 % 128;
                            int i125 = i124 % 2;
                            str = line;
                        }
                    } catch (Throwable th) {
                        fileReader3.close();
                        bufferedReader3.close();
                        throw th;
                    }
                } else {
                    int i126 = b + 69;
                    TuitionPaymentFragmentbindingInflater1 = i126 % 128;
                    if (i126 % 2 == 0) {
                        throw null;
                    }
                    str = null;
                }
            } catch (Exception unused2) {
            }
            try {
                Object[] objArr10 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{27042, 49102, 43456, 63601}, (char) (16806312 - (~Color.rgb(0, 0, 0))), (-1061171609) - (~(-((byte) KeyEvent.getModifierMetaStateMask()))), new char[]{34358, 19362, 5999, 63560, 8123, 27748, 38877, 10096, 36331, 35434, 32008, 7206, 26571, 5894, 36653, 61915, 42824, 20751, 65165, 59830, 63775, 49821, 2429, 24761, 4044, 32186, 37584, 44249, 44657, 42772, 62488}, objArr10);
                File file3 = new File((String) objArr10[0]);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i127 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i128 = (~((383479338 ^ i127) | (383479338 & i127))) | 536903745;
                int i129 = ~((i127 & (-550742116)) | (i127 ^ (-550742116)));
                int i130 = ((i129 & i128) | (i128 ^ i129)) * 464;
                int i131 = ((-1234738655) & i130) + (i130 | (-1234738655));
                int i132 = (550742115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ 550742115);
                int i133 = ((i132 & 383479338) | (i132 ^ 383479338)) * (-464);
                int i134 = ((((i131 | i133) << 1) - (i133 ^ i131)) - (~(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-550742116)) | ((-550742116) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | 536903745) * 464))) - 1;
                int i135 = (-793188707) - (~(((~(((-2107098981) & i74) | ((-2107098981) ^ i74))) | (-1683406638)) * (-602)));
                int i136 = (~(((-2107098981) & i) | ((-2107098981) ^ i))) | 427900992;
                int i137 = ~((2107098980 & i74) | (i74 ^ 2107098980) | (-1683406638));
                int i138 = ((i136 & i137) | (i136 ^ i137)) * (-301);
                int i139 = ((i135 | i138) << 1) - (i138 ^ i135);
                int i140 = -(-((~((i74 ^ (-1683406638)) | ((-1683406638) & i74))) * 301));
                if (i134 > ((i139 | i140) << 1) - (i140 ^ i139)) {
                    int i141 = 30 / 0;
                    if (file3.canRead()) {
                        fileReader = new FileReader(file3);
                        bufferedReader = new BufferedReader(fileReader);
                        try {
                            String line2 = bufferedReader.readLine();
                            char[] cArr9 = {0, 0, 0, 0};
                            char[] cArr10 = {25304, 64459, 6299, 32964};
                            i6 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i142 = i6 * (-575);
                            int i143 = (i142 & (-28865000)) + (i142 | (-28865000));
                            int i144 = ~i6;
                            i7 = ~((i144 ^ (-50201)) | (i144 & (-50201)));
                            int i145 = ((~(((-50201) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-50201) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | i7) * 576;
                            i8 = ((i143 | i145) << 1) - (i143 ^ i145);
                            i9 = ~i6;
                            i10 = ~((i9 ^ 50200) | (i9 & 50200));
                            i11 = TuitionPaymentFragmentbindingInflater1 + 117;
                            b = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i146 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i147 = ~(i6 | ((-50201) & i146) | ((-50201) ^ i146));
                                i12 = (i8 >>> (576 >> ((i10 & i147) | (i10 ^ i147)))) / (576 << i7);
                            } else {
                                int i148 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i149 = ((-50201) & i148) | ((-50201) ^ i148);
                                int i150 = ~((i6 & i149) | (i149 ^ i6));
                                int i151 = ((i10 & i150) | (i10 ^ i150)) * 576;
                                int i152 = ((i8 | i151) << 1) - (i8 ^ i151);
                                int i153 = -(-((~(i9 | (-50201))) * 576));
                                i12 = (i153 | i152) + (i152 & i153);
                            }
                            char c7 = (char) i12;
                            int i154 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i155 = i154 * 71;
                            int i156 = b;
                            int i157 = i156 + 35;
                            TuitionPaymentFragmentbindingInflater1 = i157 % 128;
                            int i158 = i157 % 2;
                            int i159 = ((i155 | (-182309226)) << 1) - (i155 ^ (-182309226));
                            int i160 = ~i154;
                            int i161 = ~((i160 ^ (-1677997214)) | (i160 & (-1677997214)));
                            int i162 = ~(((-1677997214) ^ i) | ((-1677997214) & i));
                            int i163 = i159 + (((i161 ^ i162) | (i162 & i161)) * (-140));
                            int i164 = i154 | (-1677997214);
                            int i165 = (i163 - (~((~((i164 & i) | (i164 ^ i))) * 70))) - 1;
                            int i166 = ~i154;
                            int i167 = (~((1677997213 & i154) | (1677997213 ^ i154))) | (~((i166 & (-1677997214)) | (i166 ^ (-1677997214))));
                            int i168 = i156 + 51;
                            TuitionPaymentFragmentbindingInflater1 = i168 % 128;
                            int i169 = i168 % 2;
                            int i170 = ~(i154 | i);
                            int i171 = -(-(70 * ((i170 & i167) | (i167 ^ i170))));
                            Object[] objArr11 = new Object[1];
                            a(cArr9, cArr10, c7, ((i165 | i171) << 1) - (i165 ^ i171), new char[]{41806}, objArr11);
                            zEquals = line2.equals((String) objArr11[0]);
                            fileReader.close();
                            bufferedReader.close();
                            i13 = b + 99;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            if (i13 % 2 == 0) {
                                i14 = 4;
                                int i172 = 4 / 4;
                            } else {
                                i14 = 4;
                            }
                            if (zEquals) {
                                try {
                                    char[] cArr11 = new char[i14];
                                    // fill-array-data instruction
                                    cArr11[0] = 0;
                                    cArr11[1] = 0;
                                    cArr11[2] = 0;
                                    cArr11[3] = 0;
                                    char[] cArr12 = new char[i14];
                                    // fill-array-data instruction
                                    cArr12[0] = 22786;
                                    cArr12[1] = 57081;
                                    cArr12[2] = 23868;
                                    cArr12[3] = 6998;
                                    Object[] objArr12 = new Object[1];
                                    a(cArr11, cArr12, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getTapTimeout() >> 16, new char[]{58489, 24186, 2919, 61479, 22602, 40532, 59155, 6272, 32247, 64309, 27423, 8074, 18201, 59238, 61152, 57581, 1828, 18245, 51041, 17114, 41279, 54995, 36134, 25460, 47707, 37177, 9428, 3748, 34642, 33819, 47789, 27813, 34764, 14054, 23249, 17101}, objArr12);
                                    file = new File((String) objArr12[0]);
                                    int i173 = b;
                                    int i174 = ((i173 | 69) << 1) - (i173 ^ 69);
                                    TuitionPaymentFragmentbindingInflater1 = i174 % 128;
                                    int i175 = i174 % 2;
                                    if (file.canRead()) {
                                        fileReader2 = new FileReader(file);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        try {
                                            String line3 = bufferedReader2.readLine();
                                            int i176 = -TextUtils.getTrimmedLength("");
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i177 = i176 * (-112);
                                            int i178 = (i177 & (-5622400)) + (i177 | (-5622400));
                                            int i179 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i180 = ~(((-50201) & i179) | ((-50201) ^ i179));
                                            int i181 = -(-(((i180 & i176) | (i176 ^ i180)) * 226));
                                            int i182 = (i178 ^ i181) + ((i181 & i178) << 1);
                                            int i183 = ~i176;
                                            int i184 = ~((i183 ^ 50200) | (50200 & i183));
                                            int i185 = ~((i183 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i183 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                            int i186 = (i184 ^ i185) | (i185 & i184);
                                            int i187 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i188 = ((-50201) ^ i187) | ((-50201) & i187);
                                            int i189 = ~((i188 ^ i176) | (i176 & i188));
                                            int i190 = i182 + (((i189 & i186) | (i186 ^ i189)) * (-113));
                                            int i191 = -(-((~(((-50201) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-50201) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 113));
                                            char c8 = (char) ((i190 ^ i191) + ((i191 & i190) << 1));
                                            int i192 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i193 = ((i192 * (-419)) - 2062190971) + ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ (-1677997215)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-1677997215)))) * TypedValues.CycleType.TYPE_EASING);
                                            int i194 = ~i192;
                                            int i195 = i193 + (((i194 ^ (-1677997215)) | (i194 & (-1677997215))) * (-420));
                                            int i196 = ~i192;
                                            int i197 = ~((i196 ^ 1677997214) | (i196 & 1677997214));
                                            int i198 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                            int i199 = ~((i198 & (-1677997215)) | (i198 ^ (-1677997215)));
                                            int i200 = -(-(((i197 & i199) | (i197 ^ i199)) * TypedValues.CycleType.TYPE_EASING));
                                            Object[] objArr13 = new Object[1];
                                            a(new char[]{0, 0, 0, 0}, new char[]{25304, 64459, 6299, 32964}, c8, ((i195 | i200) << 1) - (i200 ^ i195), new char[]{41806}, objArr13);
                                            zEquals2 = line3.equals((String) objArr13[0]);
                                            fileReader2.close();
                                            bufferedReader2.close();
                                        } catch (Throwable th2) {
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            throw th2;
                                        }
                                    } else {
                                        zEquals2 = false;
                                    }
                                } catch (Exception unused3) {
                                    zEquals2 = false;
                                }
                                if (!(!zEquals2)) {
                                    int i201 = b + 107;
                                    i15 = i201 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i15;
                                    int i202 = i201 % 2;
                                    if (str != null) {
                                        i16 = i15 + 117;
                                        int i203 = i16 % 128;
                                        b = i203;
                                        if (i16 % 2 != 0) {
                                            objArr = new Object[4];
                                            c3 = 0;
                                            objArr[1] = new int[0];
                                        } else {
                                            c3 = 0;
                                            objArr = new Object[2];
                                            objArr[0] = new int[1];
                                        }
                                        i17 = (i & (-21)) | (i74 & 20);
                                        strArr = new String[]{str};
                                        iArr2 = (int[]) objArr[c3];
                                        i18 = i203 + 15;
                                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                                        if (i18 % 2 == 0) {
                                            iArr2[1] = i17;
                                            objArr[1] = strArr;
                                        } else {
                                            iArr2[0] = i17;
                                            objArr[1] = strArr;
                                        }
                                        c = 0;
                                    } else {
                                        i4 = 2;
                                    }
                                }
                                objArr = new Object[i4];
                                iArr = new int[1];
                                objArr[0] = iArr;
                                String[] strArr3 = new String[0];
                                i5 = b + 7;
                                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                                if (i5 % 2 == 0) {
                                    ((int[]) objArr[1])[1] = i;
                                    c = 0;
                                    c2 = 0;
                                } else {
                                    c = 0;
                                    iArr[0] = i;
                                    c2 = 1;
                                }
                                objArr[c2] = strArr3;
                            }
                        } catch (Throwable th3) {
                            fileReader.close();
                            bufferedReader.close();
                            throw th3;
                        }
                    }
                    int i204 = ((int[]) objArr[c])[c];
                    int i205 = ((~i80) & i) | (i80 & i74);
                    int i206 = -i205;
                    int i207 = ((i205 & i206) | (i205 ^ i206)) >> 31;
                    int i208 = (~i207) & i204;
                    int i209 = i80 & i207;
                    int i210 = (i209 & i208) | (i208 ^ i209);
                    String[] strArr4 = (String[]) objArr[1];
                    Object[] objArr14 = new Object[2];
                    int i211 = i204 ^ i;
                    int i212 = -i211;
                    int i213 = (((i211 & i212) | (i211 ^ i212)) >> 31) & 1;
                    int i214 = -i213;
                    int i215 = (~(((i214 & i213) | (i213 ^ i214)) >> 31)) & 1;
                    objArr14[i213] = null;
                    objArr14[i215] = strArr4;
                    int[] iArr3 = new int[1];
                    int i216 = i ^ i210;
                    int i217 = -i216;
                    Object[] objArr15 = {new int[]{i}, iArr3, new int[]{i210}, (String[]) objArr14[0]};
                    int i218 = ~((-865507421) | i);
                    int i219 = ((((515754628 + ((822509572 | i218) * (-280))) + ((i218 | (~(825197191 | i))) * 140)) + ((((~((-42997849) | i)) | (~((-822509573) | i74))) | (~(868195039 | i74))) * 140)) - (~((((i216 & i217) | (i216 ^ i217)) >> 31) & 16))) - 1;
                    int i220 = ((i2 | i219) << 1) - (i2 ^ i219);
                    int i221 = i220 << 13;
                    int i222 = (i220 | i221) & (~(i220 & i221));
                    int i223 = i222 >>> 17;
                    int i224 = ((~i222) & i223) | ((~i223) & i222);
                    int i225 = i224 << 5;
                    iArr3[0] = ((~i224) & i225) | ((~i225) & i224);
                    return objArr15;
                }
                if (file3.canRead()) {
                    fileReader = new FileReader(file3);
                    bufferedReader = new BufferedReader(fileReader);
                    String line4 = bufferedReader.readLine();
                    char[] cArr13 = {0, 0, 0, 0};
                    char[] cArr14 = {25304, 64459, 6299, 32964};
                    i6 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i1410 = i6 * (-575);
                    int i1411 = (i1410 & (-28865000)) + (i1410 | (-28865000));
                    int i1412 = ~i6;
                    i7 = ~((i1412 ^ (-50201)) | (i1412 & (-50201)));
                    int i1413 = ((~(((-50201) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-50201) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | i7) * 576;
                    i8 = ((i1411 | i1413) << 1) - (i1411 ^ i1413);
                    i9 = ~i6;
                    i10 = ~((i9 ^ 50200) | (i9 & 50200));
                    i11 = TuitionPaymentFragmentbindingInflater1 + 117;
                    b = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i1414 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i1415 = ~(i6 | ((-50201) & i1414) | ((-50201) ^ i1414));
                        i12 = (i8 >>> (576 >> ((i10 & i1415) | (i10 ^ i1415)))) / (576 << i7);
                    } else {
                        int i1416 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i1417 = ((-50201) & i1416) | ((-50201) ^ i1416);
                        int i1510 = ~((i6 & i1417) | (i1417 ^ i6));
                        int i1511 = ((i10 & i1510) | (i10 ^ i1510)) * 576;
                        int i1512 = ((i8 | i1511) << 1) - (i8 ^ i1511);
                        int i1513 = -(-((~(i9 | (-50201))) * 576));
                        i12 = (i1513 | i1512) + (i1512 & i1513);
                    }
                    char c9 = (char) i12;
                    int i1514 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i1515 = i1514 * 71;
                    int i1516 = b;
                    int i1517 = i1516 + 35;
                    TuitionPaymentFragmentbindingInflater1 = i1517 % 128;
                    int i1518 = i1517 % 2;
                    int i1519 = ((i1515 | (-182309226)) << 1) - (i1515 ^ (-182309226));
                    int i1610 = ~i1514;
                    int i1611 = ~((i1610 ^ (-1677997214)) | (i1610 & (-1677997214)));
                    int i1612 = ~(((-1677997214) ^ i) | ((-1677997214) & i));
                    int i1613 = i1519 + (((i1611 ^ i1612) | (i1612 & i1611)) * (-140));
                    int i1614 = i1514 | (-1677997214);
                    int i1615 = (i1613 - (~((~((i1614 & i) | (i1614 ^ i))) * 70))) - 1;
                    int i1616 = ~i1514;
                    int i1617 = (~((1677997213 & i1514) | (1677997213 ^ i1514))) | (~((i1616 & (-1677997214)) | (i1616 ^ (-1677997214))));
                    int i1618 = i1516 + 51;
                    TuitionPaymentFragmentbindingInflater1 = i1618 % 128;
                    int i1619 = i1618 % 2;
                    int i1710 = ~(i1514 | i);
                    int i1711 = -(-(70 * ((i1710 & i1617) | (i1617 ^ i1710))));
                    Object[] objArr16 = new Object[1];
                    a(cArr13, cArr14, c9, ((i1615 | i1711) << 1) - (i1615 ^ i1711), new char[]{41806}, objArr16);
                    zEquals = line4.equals((String) objArr16[0]);
                    fileReader.close();
                    bufferedReader.close();
                    i13 = b + 99;
                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                    if (i13 % 2 == 0) {
                        i14 = 4;
                        int i1712 = 4 / 4;
                    } else {
                        i14 = 4;
                    }
                    if (zEquals) {
                        char[] cArr15 = new char[i14];
                        // fill-array-data instruction
                        cArr15[0] = 0;
                        cArr15[1] = 0;
                        cArr15[2] = 0;
                        cArr15[3] = 0;
                        char[] cArr16 = new char[i14];
                        // fill-array-data instruction
                        cArr16[0] = 22786;
                        cArr16[1] = 57081;
                        cArr16[2] = 23868;
                        cArr16[3] = 6998;
                        Object[] objArr17 = new Object[1];
                        a(cArr15, cArr16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getTapTimeout() >> 16, new char[]{58489, 24186, 2919, 61479, 22602, 40532, 59155, 6272, 32247, 64309, 27423, 8074, 18201, 59238, 61152, 57581, 1828, 18245, 51041, 17114, 41279, 54995, 36134, 25460, 47707, 37177, 9428, 3748, 34642, 33819, 47789, 27813, 34764, 14054, 23249, 17101}, objArr17);
                        file = new File((String) objArr17[0]);
                        int i1713 = b;
                        int i1714 = ((i1713 | 69) << 1) - (i1713 ^ 69);
                        TuitionPaymentFragmentbindingInflater1 = i1714 % 128;
                        int i1715 = i1714 % 2;
                        if (file.canRead()) {
                            zEquals2 = false;
                        } else {
                            fileReader2 = new FileReader(file);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            String line5 = bufferedReader2.readLine();
                            int i1716 = -TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1717 = i1716 * (-112);
                            int i1718 = (i1717 & (-5622400)) + (i1717 | (-5622400));
                            int i1719 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i1810 = ~(((-50201) & i1719) | ((-50201) ^ i1719));
                            int i1811 = -(-(((i1810 & i1716) | (i1716 ^ i1810)) * 226));
                            int i1812 = (i1718 ^ i1811) + ((i1811 & i1718) << 1);
                            int i1813 = ~i1716;
                            int i1814 = ~((i1813 ^ 50200) | (50200 & i1813));
                            int i1815 = ~((i1813 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i1813 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                            int i1816 = (i1814 ^ i1815) | (i1815 & i1814);
                            int i1817 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i1818 = ((-50201) ^ i1817) | ((-50201) & i1817);
                            int i1819 = ~((i1818 ^ i1716) | (i1716 & i1818));
                            int i1910 = i1812 + (((i1819 & i1816) | (i1816 ^ i1819)) * (-113));
                            int i1911 = -(-((~(((-50201) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-50201) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) * 113));
                            char c10 = (char) ((i1910 ^ i1911) + ((i1911 & i1910) << 1));
                            int i1912 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = getSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1913 = ((i1912 * (-419)) - 2062190971) + ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ (-1677997215)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-1677997215)))) * TypedValues.CycleType.TYPE_EASING);
                            int i1914 = ~i1912;
                            int i1915 = i1913 + (((i1914 ^ (-1677997215)) | (i1914 & (-1677997215))) * (-420));
                            int i1916 = ~i1912;
                            int i1917 = ~((i1916 ^ 1677997214) | (i1916 & 1677997214));
                            int i1918 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i1919 = ~((i1918 & (-1677997215)) | (i1918 ^ (-1677997215)));
                            int i2010 = -(-(((i1917 & i1919) | (i1917 ^ i1919)) * TypedValues.CycleType.TYPE_EASING));
                            Object[] objArr18 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{25304, 64459, 6299, 32964}, c10, ((i1915 | i2010) << 1) - (i2010 ^ i1915), new char[]{41806}, objArr18);
                            zEquals2 = line5.equals((String) objArr18[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                        }
                        if (!(!zEquals2)) {
                            int i2011 = b + 107;
                            i15 = i2011 % 128;
                            TuitionPaymentFragmentbindingInflater1 = i15;
                            int i2012 = i2011 % 2;
                            if (str != null) {
                                i16 = i15 + 117;
                                int i2013 = i16 % 128;
                                b = i2013;
                                if (i16 % 2 != 0) {
                                    objArr = new Object[4];
                                    c3 = 0;
                                    objArr[1] = new int[0];
                                } else {
                                    c3 = 0;
                                    objArr = new Object[2];
                                    objArr[0] = new int[1];
                                }
                                i17 = (i & (-21)) | (i74 & 20);
                                strArr = new String[]{str};
                                iArr2 = (int[]) objArr[c3];
                                i18 = i2013 + 15;
                                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                                if (i18 % 2 == 0) {
                                    iArr2[1] = i17;
                                    objArr[1] = strArr;
                                } else {
                                    iArr2[0] = i17;
                                    objArr[1] = strArr;
                                }
                                c = 0;
                            } else {
                                i4 = 2;
                            }
                        }
                        objArr = new Object[i4];
                        iArr = new int[1];
                        objArr[0] = iArr;
                        String[] strArr5 = new String[0];
                        i5 = b + 7;
                        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                        if (i5 % 2 == 0) {
                            ((int[]) objArr[1])[1] = i;
                            c = 0;
                            c2 = 0;
                        } else {
                            c = 0;
                            iArr[0] = i;
                            c2 = 1;
                        }
                        objArr[c2] = strArr5;
                    }
                    int i2014 = ((int[]) objArr[c])[c];
                    int i2015 = ((~i80) & i) | (i80 & i74);
                    int i2016 = -i2015;
                    int i2017 = ((i2015 & i2016) | (i2015 ^ i2016)) >> 31;
                    int i2018 = (~i2017) & i2014;
                    int i2019 = i80 & i2017;
                    int i2110 = (i2019 & i2018) | (i2018 ^ i2019);
                    String[] strArr6 = (String[]) objArr[1];
                    Object[] objArr19 = new Object[2];
                    int i2111 = i2014 ^ i;
                    int i2112 = -i2111;
                    int i2113 = (((i2111 & i2112) | (i2111 ^ i2112)) >> 31) & 1;
                    int i2114 = -i2113;
                    int i2115 = (~(((i2114 & i2113) | (i2113 ^ i2114)) >> 31)) & 1;
                    objArr19[i2113] = null;
                    objArr19[i2115] = strArr6;
                    int[] iArr4 = new int[1];
                    int i2116 = i ^ i2110;
                    int i2117 = -i2116;
                    Object[] objArr110 = {new int[]{i}, iArr4, new int[]{i2110}, (String[]) objArr19[0]};
                    int i2118 = ~((-865507421) | i);
                    int i2119 = ((((515754628 + ((822509572 | i2118) * (-280))) + ((i2118 | (~(825197191 | i))) * 140)) + ((((~((-42997849) | i)) | (~((-822509573) | i74))) | (~(868195039 | i74))) * 140)) - (~((((i2116 & i2117) | (i2116 ^ i2117)) >> 31) & 16))) - 1;
                    int i226 = ((i2 | i2119) << 1) - (i2 ^ i2119);
                    int i227 = i226 << 13;
                    int i228 = (i226 | i227) & (~(i226 & i227));
                    int i229 = i228 >>> 17;
                    int i2210 = ((~i228) & i229) | ((~i229) & i228);
                    int i2211 = i2210 << 5;
                    iArr4[0] = ((~i2210) & i2211) | ((~i2211) & i2210);
                    return objArr110;
                }
            } catch (Exception unused4) {
            }
            i4 = 2;
            objArr = new Object[i4];
            iArr = new int[1];
            objArr[0] = iArr;
            String[] strArr7 = new String[0];
            i5 = b + 7;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                ((int[]) objArr[1])[1] = i;
                c = 0;
                c2 = 0;
            } else {
                c = 0;
                iArr[0] = i;
                c2 = 1;
            }
            objArr[c2] = strArr7;
            int i20110 = ((int[]) objArr[c])[c];
            int i20111 = ((~i80) & i) | (i80 & i74);
            int i20112 = -i20111;
            int i20113 = ((i20111 & i20112) | (i20111 ^ i20112)) >> 31;
            int i20114 = (~i20113) & i20110;
            int i20115 = i80 & i20113;
            int i21110 = (i20115 & i20114) | (i20114 ^ i20115);
            String[] strArr8 = (String[]) objArr[1];
            Object[] objArr111 = new Object[2];
            int i21111 = i20110 ^ i;
            int i21112 = -i21111;
            int i21113 = (((i21111 & i21112) | (i21111 ^ i21112)) >> 31) & 1;
            int i21114 = -i21113;
            int i21115 = (~(((i21114 & i21113) | (i21113 ^ i21114)) >> 31)) & 1;
            objArr111[i21113] = null;
            objArr111[i21115] = strArr8;
            int[] iArr5 = new int[1];
            int i21116 = i ^ i21110;
            int i21117 = -i21116;
            Object[] objArr112 = {new int[]{i}, iArr5, new int[]{i21110}, (String[]) objArr111[0]};
            int i21118 = ~((-865507421) | i);
            int i21119 = ((((515754628 + ((822509572 | i21118) * (-280))) + ((i21118 | (~(825197191 | i))) * 140)) + ((((~((-42997849) | i)) | (~((-822509573) | i74))) | (~(868195039 | i74))) * 140)) - (~((((i21116 & i21117) | (i21116 ^ i21117)) >> 31) & 16))) - 1;
            int i2212 = ((i2 | i21119) << 1) - (i2 ^ i21119);
            int i2213 = i2212 << 13;
            int i2214 = (i2212 | i2213) & (~(i2212 & i2213));
            int i2215 = i2214 >>> 17;
            int i2216 = ((~i2214) & i2215) | ((~i2215) & i2214);
            int i2217 = i2216 << 5;
            iArr5[0] = ((~i2216) & i2217) | ((~i2217) & i2216);
            return objArr112;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzox.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r8 = r8 + 4
            int r6 = r6 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzox.$$e(int, int, byte):java.lang.String");
    }
}
