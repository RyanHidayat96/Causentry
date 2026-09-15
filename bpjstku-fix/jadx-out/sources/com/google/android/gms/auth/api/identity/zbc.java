package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.volley.ExecutorDelivery;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zbc implements Parcelable.Creator {
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$d = 43;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {106, -93, -11, -74, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 42;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1827325458;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795530;
    private static int b = 2091832559;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {26, -11, 23, -32, 25, -54, -13, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, -17, 30, -61, Base64.padSymbol, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -23, 24, -17, 30, -61, Base64.padSymbol, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, -11, 39, 27, -92, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, -22, -32, 19, -32, 23, -94, 47, 31, -20, -25, 28, -26, 20, -11, 27, -25, -47, 47, 31, 25, -26, -37, 93, -19, 29, -29, -36, 42, 9, -23, -48, 31, -20, -25, 28, -26, 20, -11, 27, -25, -48, 89, 27, -26, -26, -26, -26, -26, -26, -26};

    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = 98 - (i * 14);
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i3 + i4) - 11;
            i6 = -1;
        }
        while (true) {
            int i7 = i3;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            if (i9 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i7 + 1;
                i4 = (i8 + bArr[i7]) - 11;
                i6 = i9;
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        asBinder = i3 % 128;
        AuthorizationResult[] authorizationResultArr = new AuthorizationResult[i];
        if (i3 % 2 == 0) {
            return authorizationResultArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i4 = asBinder + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        ArrayList<String> arrayListCreateStringList = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    int i6 = asBinder + 93;
                    asInterface = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 3;
                    }
                    break;
                case 4:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.createParcelable(parcel, header, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, header, PendingIntent.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AuthorizationResult(strCreateString, strCreateString2, strCreateString3, arrayListCreateStringList, googleSignInAccount, pendingIntent);
    }

    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int length2;
        byte[] bArr2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i5 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2315 - AndroidCharacter.getMirror('0'), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 == 1) {
                byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr3 != null) {
                    int i7 = $10 + 121;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        length = bArr3.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr3.length;
                        bArr = new byte[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) i5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 3358 - KeyEvent.getDeadChar(0, 0), 18 - Color.green(0), -1054011043, false, $$e(b5, (byte) (b5 + 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        bArr[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i8++;
                        int i9 = $11 + 35;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i5 = -1;
                    }
                    bArr3 = bArr;
                }
                if (bArr3 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 33, 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ j)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 55904), 2855 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (Process.myTid() >> 22) + 13, -1529949196, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr5 != null) {
                    int i11 = $10 + 101;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length2 = bArr5.length;
                        bArr2 = new byte[length2];
                    } else {
                        length2 = bArr5.length;
                        bArr2 = new byte[length2];
                    }
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr2[i12] = (byte) (((long) bArr5[i12]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr2;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i13 = $10 + 59;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 >>> 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / (((byte) (((byte) (((long) bArr6[i14]) / 3046761265686732006L)) % s)) ^ b2));
                        } else {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x04b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0499  */
    /* JADX WARN: Code duplicated, block: B:38:0x049f  */
    /* JADX WARN: Code duplicated, block: B:42:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x05ca A[Catch: all -> 0x06e1, TryCatch #1 {all -> 0x06e1, blocks: (B:44:0x05bd, B:46:0x05ca, B:47:0x060a), top: B:109:0x05bd, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x06ec A[Catch: Exception -> 0x08e5, TRY_LEAVE, TryCatch #3 {Exception -> 0x08e5, blocks: (B:51:0x067b, B:57:0x06e4, B:59:0x06ea, B:60:0x06eb, B:61:0x06ec, B:65:0x071f, B:67:0x0770, B:71:0x0805, B:73:0x083b, B:78:0x08b8, B:84:0x08db, B:86:0x08e1, B:87:0x08e2, B:72:0x0818, B:66:0x0746, B:44:0x05bd, B:46:0x05ca, B:47:0x060a, B:74:0x0862, B:76:0x086f, B:77:0x08b1), top: B:113:0x04b5, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x071e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0746 A[Catch: Exception -> 0x08e5, TryCatch #3 {Exception -> 0x08e5, blocks: (B:51:0x067b, B:57:0x06e4, B:59:0x06ea, B:60:0x06eb, B:61:0x06ec, B:65:0x071f, B:67:0x0770, B:71:0x0805, B:73:0x083b, B:78:0x08b8, B:84:0x08db, B:86:0x08e1, B:87:0x08e2, B:72:0x0818, B:66:0x0746, B:44:0x05bd, B:46:0x05ca, B:47:0x060a, B:74:0x0862, B:76:0x086f, B:77:0x08b1), top: B:113:0x04b5, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0818 A[Catch: Exception -> 0x08e5, TryCatch #3 {Exception -> 0x08e5, blocks: (B:51:0x067b, B:57:0x06e4, B:59:0x06ea, B:60:0x06eb, B:61:0x06ec, B:65:0x071f, B:67:0x0770, B:71:0x0805, B:73:0x083b, B:78:0x08b8, B:84:0x08db, B:86:0x08e1, B:87:0x08e2, B:72:0x0818, B:66:0x0746, B:44:0x05bd, B:46:0x05ca, B:47:0x060a, B:74:0x0862, B:76:0x086f, B:77:0x08b1), top: B:113:0x04b5, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x086f A[Catch: all -> 0x08da, TryCatch #2 {all -> 0x08da, blocks: (B:74:0x0862, B:76:0x086f, B:77:0x08b1), top: B:111:0x0862, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0902  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r36v1 */
    /* JADX WARN: Type inference failed for: r36v10 */
    /* JADX WARN: Type inference failed for: r36v11 */
    /* JADX WARN: Type inference failed for: r36v12 */
    /* JADX WARN: Type inference failed for: r36v13 */
    /* JADX WARN: Type inference failed for: r36v14 */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        ?? r36;
        int i6;
        ?? r37;
        int i7;
        int i8;
        int i9;
        int iArgb;
        int iIndexOf;
        short s;
        int iCombineMeasuredStates;
        int i10;
        String str;
        int i11;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int capsMode;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        short s2;
        int i17;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i18;
        int i19;
        int i20 = 2 % 2;
        int i21 = asBinder;
        int i22 = (i21 ^ 105) + ((i21 & 105) << 1);
        asInterface = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
        int i23 = ((i21 | 15) << 1) - (i21 ^ 15);
        int i24 = i23 % 128;
        asInterface = i24;
        if (i23 % 2 == 0) {
            throw null;
        }
        if (context != 0) {
            int i25 = i24 + 31;
            asBinder = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 54 / 0;
            }
            try {
                int i27 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i28 = i27 * 784;
                int i29 = ((i28 ^ 717774882) + ((i28 & 717774882) << 1)) - 449569978;
                int i30 = ~i27;
                int i31 = ~i;
                int i32 = (i30 ^ i31) | (i30 & i31);
                int i33 = (i29 - (~((~((i32 ^ 268204121) | (i32 & 268204121))) * (-783)))) - 1;
                int i34 = ~i;
                int i35 = ~(i34 | 268204121);
                int i36 = ((i30 ^ i35) | (i30 & i35)) * 783;
                int i37 = ((i33 | i36) << 1) - (i33 ^ i36);
                int i38 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i39 = ((i38 | 6) << 1) - (i38 ^ 6);
                short sIndexOf = (short) TextUtils.indexOf("", "");
                int i40 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i41 = asBinder;
                int i42 = (i41 ^ 9) + ((i41 & 9) << 1);
                asInterface = i42 % 128;
                int i43 = i42 % 2;
                int i44 = i40 * 714;
                int i45 = (i44 ^ (-712)) + ((i44 & (-712)) << 1);
                int i46 = ~i40;
                int i47 = ~((i46 ^ i31) | (i46 & i31));
                int i48 = ~i40;
                int i49 = ~((i48 ^ 1) | (i48 & 1));
                int i50 = (i47 ^ i49) | (i49 & i47);
                int i51 = ~((-2) | i40 | i);
                int i52 = ((i50 ^ i51) | (i51 & i50)) * (-713);
                int i53 = (i45 & i52) + (i52 | i45);
                int i54 = ((-2) ^ i40) | (i40 & (-2));
                int i55 = (~((i54 & i) | (i54 ^ i))) * 1426;
                int i56 = (i53 & i55) + (i55 | i53);
                int i57 = (~(((-2) ^ i34) | ((-2) & i34))) * 713;
                byte b2 = (byte) ((i56 & i57) + (i57 | i56));
                int mode = View.MeasureSpec.getMode(0);
                int i58 = mode * (-661);
                int i59 = ((i58 | 417536004) << 1) - (i58 ^ 417536004);
                int i60 = ~mode;
                int i61 = ~((i60 ^ (-532178189)) | (i60 & (-532178189)));
                int i62 = i59 + (((i31 ^ i61) | (i61 & i31)) * 1324);
                int i63 = ~((mode ^ i) | (mode & i));
                int i64 = ~((i ^ 532178188) | (i & 532178188));
                int i65 = ((i63 & i64) | (i63 ^ i64)) * (-1324);
                int i66 = (i62 & i65) + (i62 | i65);
                int i67 = ~((i60 ^ 532178188) | (i60 & 532178188));
                int i68 = ~((mode & (-532178189)) | ((-532178189) ^ mode));
                int i69 = i66 + (((i68 & i67) | (i67 ^ i68)) * 662);
                Object[] objArr2 = new Object[1];
                a(i37, i39, sIndexOf, b2, i69, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                int i70 = -ExpandableListView.getPackedPositionType(0L);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i71 = i70 * (-1965);
                int i72 = (i71 & 1919854928) + (i71 | 1919854928);
                int i73 = -(-((((-268204127) & i70) | (i70 ^ (-268204127))) * 983));
                int i74 = (i72 & i73) + (i73 | i72);
                int i75 = ~i70;
                int i76 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i77 = ~((i76 & (-268204127)) | ((-268204127) ^ i76));
                int i78 = (i74 - (~(((i75 & i77) | (i75 ^ i77)) * (-983)))) - 1;
                int i79 = ~i70;
                int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i81 = ~((i80 & i79) | (i79 ^ i80));
                int i82 = ~((i79 & 268204126) | (i79 ^ 268204126));
                int i83 = (i78 - (~(((i82 & i81) | (i81 ^ i82)) * 983))) - 1;
                int i84 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                int i85 = (i84 ^ 2) + ((i84 & 2) << 1);
                short keyRepeatDelay = (short) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b3 = (byte) ((-2) - ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) ^ (-1)));
                int i86 = -(-ExpandableListView.getPackedPositionChild(0L));
                int i87 = (i86 ^ 532178211) + ((i86 & 532178211) << 1);
                Object[] objArr3 = new Object[1];
                a(i83, i85, keyRepeatDelay, b3, i87, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                int i88 = 268204119 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0');
                int i89 = ((iIndexOf2 | 19) << 1) - (iIndexOf2 ^ 19);
                int i90 = -TextUtils.lastIndexOf("", '0', 0);
                int i91 = ~i90;
                int i92 = ~((~i91) | i91);
                int i93 = (((i90 * 193) - 193) - (~(((i92 & i31) | (i31 ^ i92)) * (-192)))) - 1;
                int i94 = ~i91;
                int i95 = ~i34;
                int i96 = -(-(((i94 & i95) | (i94 ^ i95)) * (-384)));
                int i97 = ((i93 | i96) << 1) - (i93 ^ i96);
                int i98 = ~((i91 ^ i) | (i91 & i));
                int i99 = asInterface;
                int i100 = ((i99 | 63) << 1) - (i99 ^ 63);
                asBinder = i100 % 128;
                int i101 = i100 % 2;
                int i102 = i98 | (~((i34 ^ i90) | (i34 & i90)));
                int i103 = i90 | (i90 ^ (-1));
                int i104 = ~((i103 & i) | (i103 ^ i));
                int i105 = -(-(DerHeader.TAG_CLASS_PRIVATE * ((i104 & i102) | (i102 ^ i104))));
                byte bMyTid = (byte) (Process.myTid() >> 22);
                int i106 = -((byte) KeyEvent.getModifierMetaStateMask());
                int i107 = (i106 ^ 532178226) + ((i106 & 532178226) << 1);
                Object[] objArr4 = new Object[1];
                a(i88, i89, (short) (((i97 | i105) << 1) - (i105 ^ i97)), bMyTid, i107, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                int i108 = -TextUtils.getOffsetAfter("", 0);
                int i109 = i108 * 465;
                int i110 = (i109 ^ 375541709) + ((i109 & 375541709) << 1);
                int i111 = ~((-268204126) | i34);
                int i112 = ~(((-268204126) ^ i108) | ((-268204126) & i108));
                int i113 = ((i111 & i112) | (i111 ^ i112) | (~((i31 ^ i108) | (i31 & i108)))) * 464;
                int i114 = (i110 & i113) + (i113 | i110);
                int i115 = asInterface + 107;
                asBinder = i115 % 128;
                int i116 = i115 % 2;
                int i117 = ~i108;
                int i118 = (i117 & i) | (i ^ i117);
                int i119 = (i114 - (~(-(-((-464) * (((-268204126) & i118) | (i118 ^ (-268204126)))))))) - 1;
                int i120 = ~(((-268204126) & i108) | ((-268204126) ^ i108));
                int i121 = ~((i108 & i) | (i108 ^ i));
                int i122 = -(-(((i121 & i120) | (i120 ^ i121)) * 464));
                int i123 = ((i119 | i122) << 1) - (i122 ^ i119);
                int i124 = -(-TextUtils.indexOf("", "", 0));
                int i125 = (i124 ^ (-11)) + ((i124 & (-11)) << 1);
                short capsMode2 = (short) TextUtils.getCapsMode("", 0, 0);
                byte bIndexOf = (byte) TextUtils.indexOf("", "");
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i126 = (iIndexOf3 * (-300)) + 1804044870;
                int i127 = 532178261 | iIndexOf3;
                int i128 = ~((i127 & i) | (i127 ^ i));
                int i129 = asInterface + 29;
                asBinder = i129 % 128;
                int i130 = i129 % 2;
                int i131 = -(-(i128 * (-301)));
                int i132 = (i126 ^ i131) + ((i126 & i131) << 1);
                int i133 = ~(((-532178262) & i) | ((-532178262) ^ i));
                int i134 = ~(i34 | iIndexOf3);
                int i135 = -(-(((i133 & i134) | (i133 ^ i134)) * (-301)));
                int i136 = ((i132 | i135) << 1) - (i135 ^ i132);
                int i137 = ~((~iIndexOf3) | i);
                int i138 = ((i137 & (-532178262)) | ((-532178262) ^ i137)) * 301;
                int i139 = (i136 ^ i138) + ((i138 & i136) << 1);
                Object[] objArr5 = new Object[1];
                a(i123, i125, capsMode2, bIndexOf, i139, objArr5);
                int i140 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i141 = (~(i & 1)) & (i | 1);
                int i142 = -i140;
                int i143 = ((i140 & i142) | (i140 ^ i142)) >> 31;
                int i144 = (~i143) & i;
                int i145 = i143 & i141;
                i4 = (i145 & i144) | (i144 ^ i145);
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
                char mirror = (char) (AndroidCharacter.getMirror('0') + 16901);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2739;
                int i146 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13;
                byte[] bArr = $$a;
                byte b4 = bArr[132];
                short s3 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b4, s3, (byte) s3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iResolveOpacity, i146, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            int i147 = asBinder;
            int i148 = (i147 ^ 47) + ((i147 & 47) << 1);
            asInterface = i148 % 128;
            int i149 = i148 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 16949);
                int scrollBarSize = 2739 - (ViewConfiguration.getScrollBarSize() >> 8);
                int jumpTapTimeout = 13 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                c(bArr2[132], (short) 52, bArr2[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, scrollBarSize, jumpTapTimeout, 47863026, false, (String) objArr7[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 16950);
                    int i150 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2739;
                    int longPressTimeout = 13 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(bArr3[132], (short) 104, (byte) (bArr3[33] - 1), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, i150, longPressTimeout, 631063962, false, (String) objArr8[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i151 = asInterface;
                        int i152 = (i151 ^ 87) + ((i151 & 87) << 1);
                        asBinder = i152 % 128;
                        int i153 = i152 % 2;
                        int threadPriority = Process.getThreadPriority(0);
                        int i154 = -(-(threadPriority * (-949)));
                        int i155 = ((-18980) & i154) + (i154 | (-18980));
                        int i156 = ~threadPriority;
                        int i157 = ~i;
                        int i158 = ~((i156 & i157) | (i156 ^ i157));
                        int i159 = ~((-21) | i);
                        int i160 = i155 + (((i158 & i159) | (i158 ^ i159)) * 1900);
                        int i161 = ~((i157 ^ 20) | (i157 & 20));
                        int i162 = ~((threadPriority ^ i) | (threadPriority & i));
                        int i163 = -(-(((i161 & i162) | (i161 ^ i162)) * (-950)));
                        int i164 = ((i160 | i163) << 1) - (i163 ^ i160);
                        int i165 = ~i;
                        int i166 = -(-(((~((threadPriority & i165) | (i165 ^ threadPriority))) | (~((i ^ 20) | (i & 20)))) * 950));
                        int i167 = -(((i164 ^ i166) + ((i166 & i164) << 1)) >> 6);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i168 = i167 * 960;
                        int i169 = ((i168 | 1248873330) << 1) - (i168 ^ 1248873330);
                        int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i171 = (i169 - (~(((~((-268204071) | i170)) | (~((i167 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i167 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) * 959))) - 1;
                        int i172 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-268204071)) | ((-268204071) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i173 = ~((i167 & i170) | (i170 ^ i167));
                        int i174 = (i171 ^ (-490333671)) + (((-490333671) & i171) << 1) + (((i173 & i172) | (i172 ^ i173)) * 959);
                        int i175 = -AndroidCharacter.getMirror('0');
                        int i176 = (i175 * (-300)) + 18120;
                        int i177 = -(-((~(i175 | 60 | i)) * (-301)));
                        int i178 = (i176 & i177) + (i176 | i177);
                        int i179 = ~(((-61) ^ i) | ((-61) & i));
                        int i180 = ~((i157 & i175) | (i157 ^ i175));
                        int i181 = -(-(((i180 & i179) | (i179 ^ i180)) * (-301)));
                        int i182 = (i178 & i181) + (i181 | i178);
                        int i183 = ~((~i175) | i);
                        int i184 = ((i183 & (-61)) | ((-61) ^ i183)) * 301;
                        Object[] objArr9 = new Object[1];
                        a(i174, ((i182 | i184) << 1) - (i184 ^ i182), (short) Color.red(0), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), 532178263 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), objArr9);
                        Object[] objArr10 = {(String) objArr9[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 993;
                            int i185 = 8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte b5 = $$a[7];
                            Object[] objArr11 = new Object[1];
                            c(b5, (short) (b5 | 141), (byte) 52, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, edgeSlop, i185, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                        long j = 853404572;
                        long j2 = -1;
                        long j3 = jLongValue ^ j2;
                        long jNextInt = new Random().nextInt(1885085374);
                        long j4 = jNextInt ^ j2;
                        i18 = i4;
                        long j5 = (((long) (-830)) * j) + (((long) 832) * jLongValue) + (((long) (-831)) * (((j3 | j4) ^ j2) | (((j | jLongValue) | jNextInt) ^ j2))) + (((long) (-1662)) * (((j3 | j) | jNextInt) ^ j2)) + (((long) 831) * ((((j ^ j2) | j4) ^ j2) | ((j | jNextInt) ^ j2) | ((jLongValue | jNextInt) ^ j2))) + ((long) (-1054322809));
                        int i186 = (int) (j5 >> 32);
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i187 = i186 & ((((~((-17436673) | iFreeMemory)) | 603980810) * 449) + 989207190 + (((~((~iFreeMemory) | (-17436673))) | 603980810) * 449));
                        int i188 = (int) j5;
                        int i189 = ~Process.myPid();
                        int i190 = i188 & (1019428157 + (((~(i189 | (-4194369))) | (~(2113907690 | i189))) * (-184)) + ((336243456 | (~(1777664234 | i189)) | (~((-340437825) | i189))) * 184) + 99058968);
                        i6 = (i187 & i190) | (i187 ^ i190);
                        i19 = asInterface + 77;
                        asBinder = i19 % 128;
                        r37 = i18;
                        if (i19 % 2 != 0) {
                            int i191 = 3 % 5;
                            r37 = i18;
                        }
                    } else {
                        context = i4;
                        iArgb = Color.argb(0, 0, 0, 0) + 268204072;
                        iIndexOf = (-16) - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i192 = -(-Process.getGidForName(""));
                        s = (short) (((i192 | 1) << 1) - (i192 ^ 1));
                        iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                        i10 = asBinder + 17;
                        asInterface = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object[] objArr12 = new Object[1];
                            a(iArgb, iIndexOf, s, (byte) iCombineMeasuredStates, 532178291 % (ViewConfiguration.getLongPressTimeout() >>> 88), objArr12);
                            str = (String) objArr12[0];
                            i11 = -View.combineMeasuredStates(1, 0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        } else {
                            byte b6 = (byte) iCombineMeasuredStates;
                            int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                            int i193 = ((longPressTimeout2 | 532178291) << 1) - (longPressTimeout2 ^ 532178291);
                            Object[] objArr13 = new Object[1];
                            a(iArgb, iIndexOf, s, b6, i193, objArr13);
                            str = (String) objArr13[0];
                            i11 = -View.combineMeasuredStates(0, 0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                        int i194 = ~i11;
                        int i195 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i196 = ~((i195 & i194) | (i194 ^ i195) | 268204137);
                        int i197 = i11 | 268204137;
                        int i198 = ~((i197 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i197 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i199 = i194 | 268204137;
                        int i200 = ((303 * i11) - (-874933387)) + (((i196 & i198) | (i196 ^ i198)) * (-302)) + ((~((i199 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i199 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * (-604));
                        int i201 = ~((i11 & (-268204138)) | ((-268204138) ^ i11));
                        int i202 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 268204137) | (268204137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i203 = i200 + (((i201 & i202) | (i201 ^ i202)) * 302);
                        capsMode = TextUtils.getCapsMode("", 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i204 = asInterface;
                        int i205 = (i204 ^ 45) + ((i204 & 45) << 1);
                        asBinder = i205 % 128;
                        int i206 = i205 % 2;
                        int i207 = ((-963) * capsMode) - 964;
                        int i208 = (i207 & (-2895)) + (i207 | (-2895));
                        int i209 = ~capsMode;
                        int i210 = ~((2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        i12 = i208 + (((i209 & i210) | (i209 ^ i210)) * (-964));
                        int i211 = ((i204 | 75) << 1) - (i204 ^ 75);
                        asBinder = i211 % 128;
                        i13 = i211 % 2;
                        i14 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        if (i13 != 0) {
                            int i212 = -((~((i14 & 2) | (2 ^ i14))) | (~((capsMode & 2) | (2 ^ capsMode))));
                            int i213 = i12 >> (((i212 | (-964)) << 1) - (i212 ^ (-964)));
                            short sResolveSizeAndState = (short) View.resolveSizeAndState(0, 0, 0);
                            i16 = (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1));
                            i17 = i213;
                            s2 = sResolveSizeAndState;
                            i15 = 1;
                        } else {
                            int i214 = ~(i14 | 2);
                            int i215 = ~((capsMode & 2) | (2 ^ capsMode));
                            int i216 = i12 - (~(((i214 & i215) | (i214 ^ i215)) * (-964)));
                            i15 = 1;
                            short sResolveSizeAndState2 = (short) View.resolveSizeAndState(0, 0, 0);
                            i16 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            s2 = sResolveSizeAndState2;
                            i17 = i216 - 1;
                        }
                        int i217 = -i16;
                        int i218 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                        int i219 = ((i218 | 532178292) << i15) - (i218 ^ 532178292);
                        Object[] objArr14 = new Object[i15];
                        a(i203, i17, s2, (byte) (((i15 | i217) << i15) - (i217 ^ i15)), i219, objArr14);
                        objArr = new Object[]{(String) objArr14[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cCombineMeasuredStates = (char) (33602 - View.combineMeasuredStates(0, 0));
                            int iAxisFromString = 3084 - MotionEvent.axisFromString("");
                            int edgeSlop2 = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte b7 = $$a[7];
                            Object[] objArr15 = new Object[1];
                            c(b7, (short) (b7 | 141), (byte) 52, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iAxisFromString, edgeSlop2, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i220 = asBinder;
                            int i221 = ((i220 | 7) << 1) - (i220 ^ 7);
                            asInterface = i221 % 128;
                            int i222 = i221 % 2;
                            i6 = 0;
                            r37 = context;
                        } else {
                            int i223 = asBinder + 115;
                            asInterface = i223 % 128;
                            int i224 = i223 % 2;
                            i6 = 1;
                            r37 = context;
                        }
                    }
                    int i225 = (~(i & 10)) & (i | 10);
                    i7 = i6 | (-i6);
                    int i226 = asInterface;
                    i8 = ((i226 | 117) << 1) - (i226 ^ 117);
                    int i227 = i8 % 128;
                    asBinder = i227;
                    if (i8 % 2 != 0) {
                        i9 = i7 * 31;
                    } else {
                        i9 = i7 >> 31;
                    }
                    int i228 = (i9 & i225) | ((~i9) & i);
                    int i229 = i2 & 32;
                    int i230 = (i227 ^ 77) + ((i227 & 77) << 1);
                    asInterface = i230 % 128;
                    int i231 = i230 % 2;
                    int i232 = -i229;
                    int i233 = ((i229 & i232) | (i229 ^ i232)) >> 31;
                    int i234 = i228 & (~i233);
                    int i235 = i233 & i;
                    i5 = (i234 & i235) | (i234 ^ i235);
                    int i236 = (i227 ^ 23) + ((i227 & 23) << 1);
                    asInterface = i236 % 128;
                    int i237 = i236 % 2;
                    r36 = r37;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i238 = asBinder;
                    int i239 = ((i238 | 1) << 1) - (i238 ^ 1);
                    asInterface = i239 % 128;
                    int i240 = i239 % 2;
                    i5 = i;
                    r36 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i1510 = asInterface;
                        int i1511 = (i1510 ^ 87) + ((i1510 & 87) << 1);
                        asBinder = i1511 % 128;
                        int i1512 = i1511 % 2;
                        int threadPriority2 = Process.getThreadPriority(0);
                        int i1513 = -(-(threadPriority2 * (-949)));
                        int i1514 = ((-18980) & i1513) + (i1513 | (-18980));
                        int i1515 = ~threadPriority2;
                        int i1516 = ~i;
                        int i1517 = ~((i1515 & i1516) | (i1515 ^ i1516));
                        int i1518 = ~((-21) | i);
                        int i1610 = i1514 + (((i1517 & i1518) | (i1517 ^ i1518)) * 1900);
                        int i1611 = ~((i1516 ^ 20) | (i1516 & 20));
                        int i1612 = ~((threadPriority2 ^ i) | (threadPriority2 & i));
                        int i1613 = -(-(((i1611 & i1612) | (i1611 ^ i1612)) * (-950)));
                        int i1614 = ((i1610 | i1613) << 1) - (i1613 ^ i1610);
                        int i1615 = ~i;
                        int i1616 = -(-(((~((threadPriority2 & i1615) | (i1615 ^ threadPriority2))) | (~((i ^ 20) | (i & 20)))) * 950));
                        int i1617 = -(((i1614 ^ i1616) + ((i1616 & i1614) << 1)) >> 6);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i1618 = i1617 * 960;
                        int i1619 = ((i1618 | 1248873330) << 1) - (i1618 ^ 1248873330);
                        int i1710 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i1711 = (i1619 - (~(((~((-268204071) | i1710)) | (~((i1617 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1617 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5)))) * 959))) - 1;
                        int i1712 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & (-268204071)) | ((-268204071) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i1713 = ~((i1617 & i1710) | (i1710 ^ i1617));
                        int i1714 = (i1711 ^ (-490333671)) + (((-490333671) & i1711) << 1) + (((i1713 & i1712) | (i1712 ^ i1713)) * 959);
                        int i1715 = -AndroidCharacter.getMirror('0');
                        int i1716 = (i1715 * (-300)) + 18120;
                        int i1717 = -(-((~(i1715 | 60 | i)) * (-301)));
                        int i1718 = (i1716 & i1717) + (i1716 | i1717);
                        int i1719 = ~(((-61) ^ i) | ((-61) & i));
                        int i1810 = ~((i1516 & i1715) | (i1516 ^ i1715));
                        int i1811 = -(-(((i1810 & i1719) | (i1719 ^ i1810)) * (-301)));
                        int i1812 = (i1718 & i1811) + (i1811 | i1718);
                        int i1813 = ~((~i1715) | i);
                        int i1814 = ((i1813 & (-61)) | ((-61) ^ i1813)) * 301;
                        Object[] objArr16 = new Object[1];
                        a(i1714, ((i1812 | i1814) << 1) - (i1814 ^ i1812), (short) Color.red(0), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), 532178263 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), objArr16);
                        Object[] objArr17 = {(String) objArr16[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 993;
                            int i1815 = 8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte b8 = $$a[7];
                            Object[] objArr18 = new Object[1];
                            c(b8, (short) (b8 | 141), (byte) 52, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState2, edgeSlop3, i1815, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                        long j6 = 853404572;
                        long j7 = -1;
                        long j8 = jLongValue2 ^ j7;
                        long jNextInt2 = new Random().nextInt(1885085374);
                        long j9 = jNextInt2 ^ j7;
                        i18 = i4;
                        long j10 = (((long) (-830)) * j6) + (((long) 832) * jLongValue2) + (((long) (-831)) * (((j8 | j9) ^ j7) | (((j6 | jLongValue2) | jNextInt2) ^ j7))) + (((long) (-1662)) * (((j8 | j6) | jNextInt2) ^ j7)) + (((long) 831) * ((((j6 ^ j7) | j9) ^ j7) | ((j6 | jNextInt2) ^ j7) | ((jLongValue2 | jNextInt2) ^ j7))) + ((long) (-1054322809));
                        int i1816 = (int) (j10 >> 32);
                        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                        int i1817 = i1816 & ((((~((-17436673) | iFreeMemory2)) | 603980810) * 449) + 989207190 + (((~((~iFreeMemory2) | (-17436673))) | 603980810) * 449));
                        int i1818 = (int) j10;
                        int i1819 = ~Process.myPid();
                        int i1910 = i1818 & (1019428157 + (((~(i1819 | (-4194369))) | (~(2113907690 | i1819))) * (-184)) + ((336243456 | (~(1777664234 | i1819)) | (~((-340437825) | i1819))) * 184) + 99058968);
                        i6 = (i1817 & i1910) | (i1817 ^ i1910);
                        i19 = asInterface + 77;
                        asBinder = i19 % 128;
                        r37 = i18;
                        if (i19 % 2 != 0) {
                            int i1911 = 3 % 5;
                            r37 = i18;
                        }
                    } else {
                        context = i4;
                        iArgb = Color.argb(0, 0, 0, 0) + 268204072;
                        iIndexOf = (-16) - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i1912 = -(-Process.getGidForName(""));
                        s = (short) (((i1912 | 1) << 1) - (i1912 ^ 1));
                        iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                        i10 = asBinder + 17;
                        asInterface = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object[] objArr19 = new Object[1];
                            a(iArgb, iIndexOf, s, (byte) iCombineMeasuredStates, 532178291 % (ViewConfiguration.getLongPressTimeout() >>> 88), objArr19);
                            str = (String) objArr19[0];
                            i11 = -View.combineMeasuredStates(1, 0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        } else {
                            byte b9 = (byte) iCombineMeasuredStates;
                            int longPressTimeout3 = ViewConfiguration.getLongPressTimeout() >> 16;
                            int i1913 = ((longPressTimeout3 | 532178291) << 1) - (longPressTimeout3 ^ 532178291);
                            Object[] objArr110 = new Object[1];
                            a(iArgb, iIndexOf, s, b9, i1913, objArr110);
                            str = (String) objArr110[0];
                            i11 = -View.combineMeasuredStates(0, 0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                        int i1914 = ~i11;
                        int i1915 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i1916 = ~((i1915 & i1914) | (i1914 ^ i1915) | 268204137);
                        int i1917 = i11 | 268204137;
                        int i1918 = ~((i1917 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i1917 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i1919 = i1914 | 268204137;
                        int i2010 = ((303 * i11) - (-874933387)) + (((i1916 & i1918) | (i1916 ^ i1918)) * (-302)) + ((~((i1919 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i1919 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * (-604));
                        int i2011 = ~((i11 & (-268204138)) | ((-268204138) ^ i11));
                        int i2012 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 268204137) | (268204137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i2013 = i2010 + (((i2011 & i2012) | (i2011 ^ i2012)) * 302);
                        capsMode = TextUtils.getCapsMode("", 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i2014 = asInterface;
                        int i2015 = (i2014 ^ 45) + ((i2014 & 45) << 1);
                        asBinder = i2015 % 128;
                        int i2016 = i2015 % 2;
                        int i2017 = ((-963) * capsMode) - 964;
                        int i2018 = (i2017 & (-2895)) + (i2017 | (-2895));
                        int i2019 = ~capsMode;
                        int i2110 = ~((2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        i12 = i2018 + (((i2019 & i2110) | (i2019 ^ i2110)) * (-964));
                        int i2111 = ((i2014 | 75) << 1) - (i2014 ^ 75);
                        asBinder = i2111 % 128;
                        i13 = i2111 % 2;
                        i14 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        if (i13 != 0) {
                            int i2112 = -((~((i14 & 2) | (2 ^ i14))) | (~((capsMode & 2) | (2 ^ capsMode))));
                            int i2113 = i12 >> (((i2112 | (-964)) << 1) - (i2112 ^ (-964)));
                            short sResolveSizeAndState3 = (short) View.resolveSizeAndState(0, 0, 0);
                            i16 = (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1));
                            i17 = i2113;
                            s2 = sResolveSizeAndState3;
                            i15 = 1;
                        } else {
                            int i2114 = ~(i14 | 2);
                            int i2115 = ~((capsMode & 2) | (2 ^ capsMode));
                            int i2116 = i12 - (~(((i2114 & i2115) | (i2114 ^ i2115)) * (-964)));
                            i15 = 1;
                            short sResolveSizeAndState4 = (short) View.resolveSizeAndState(0, 0, 0);
                            i16 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            s2 = sResolveSizeAndState4;
                            i17 = i2116 - 1;
                        }
                        int i2117 = -i16;
                        int i2118 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                        int i2119 = ((i2118 | 532178292) << i15) - (i2118 ^ 532178292);
                        Object[] objArr111 = new Object[i15];
                        a(i2013, i17, s2, (byte) (((i15 | i2117) << i15) - (i2117 ^ i15)), i2119, objArr111);
                        objArr = new Object[]{(String) objArr111[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cCombineMeasuredStates2 = (char) (33602 - View.combineMeasuredStates(0, 0));
                            int iAxisFromString2 = 3084 - MotionEvent.axisFromString("");
                            int edgeSlop4 = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte b10 = $$a[7];
                            Object[] objArr112 = new Object[1];
                            c(b10, (short) (b10 | 141), (byte) 52, objArr112);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates2, iAxisFromString2, edgeSlop4, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i2210 = asBinder;
                            int i2211 = ((i2210 | 7) << 1) - (i2210 ^ 7);
                            asInterface = i2211 % 128;
                            int i2212 = i2211 % 2;
                            i6 = 0;
                            r37 = context;
                        } else {
                            int i2213 = asBinder + 115;
                            asInterface = i2213 % 128;
                            int i2214 = i2213 % 2;
                            i6 = 1;
                            r37 = context;
                        }
                    }
                    int i2215 = (~(i & 10)) & (i | 10);
                    i7 = i6 | (-i6);
                    int i2216 = asInterface;
                    i8 = ((i2216 | 117) << 1) - (i2216 ^ 117);
                    int i2217 = i8 % 128;
                    asBinder = i2217;
                    if (i8 % 2 != 0) {
                        i9 = i7 * 31;
                    } else {
                        i9 = i7 >> 31;
                    }
                    int i2218 = (i9 & i2215) | ((~i9) & i);
                    int i2219 = i2 & 32;
                    int i2310 = (i2217 ^ 77) + ((i2217 & 77) << 1);
                    asInterface = i2310 % 128;
                    int i2311 = i2310 % 2;
                    int i2312 = -i2219;
                    int i2313 = ((i2219 & i2312) | (i2219 ^ i2312)) >> 31;
                    int i2314 = i2218 & (~i2313);
                    int i2315 = i2313 & i;
                    i5 = (i2314 & i2315) | (i2314 ^ i2315);
                    int i2316 = (i2217 ^ 23) + ((i2217 & 23) << 1);
                    asInterface = i2316 % 128;
                    int i2317 = i2316 % 2;
                    r36 = r37;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i2318 = asBinder;
                int i2319 = ((i2318 | 1) << 1) - (i2318 ^ 1);
                asInterface = i2319 % 128;
                int i241 = i2319 % 2;
                i5 = i;
                r36 = i4;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i1519 = asInterface;
                            int i15110 = (i1519 ^ 87) + ((i1519 & 87) << 1);
                            asBinder = i15110 % 128;
                            int i15111 = i15110 % 2;
                            int threadPriority3 = Process.getThreadPriority(0);
                            int i15112 = -(-(threadPriority3 * (-949)));
                            int i15113 = ((-18980) & i15112) + (i15112 | (-18980));
                            int i15114 = ~threadPriority3;
                            int i15115 = ~i;
                            int i15116 = ~((i15114 & i15115) | (i15114 ^ i15115));
                            int i15117 = ~((-21) | i);
                            int i16110 = i15113 + (((i15116 & i15117) | (i15116 ^ i15117)) * 1900);
                            int i16111 = ~((i15115 ^ 20) | (i15115 & 20));
                            int i16112 = ~((threadPriority3 ^ i) | (threadPriority3 & i));
                            int i16113 = -(-(((i16111 & i16112) | (i16111 ^ i16112)) * (-950)));
                            int i16114 = ((i16110 | i16113) << 1) - (i16113 ^ i16110);
                            int i16115 = ~i;
                            int i16116 = -(-(((~((threadPriority3 & i16115) | (i16115 ^ threadPriority3))) | (~((i ^ 20) | (i & 20)))) * 950));
                            int i16117 = -(((i16114 ^ i16116) + ((i16116 & i16114) << 1)) >> 6);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i16118 = i16117 * 960;
                            int i16119 = ((i16118 | 1248873330) << 1) - (i16118 ^ 1248873330);
                            int i17110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i17111 = (i16119 - (~(((~((-268204071) | i17110)) | (~((i16117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i16117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7)))) * 959))) - 1;
                            int i17112 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & (-268204071)) | ((-268204071) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                            int i17113 = ~((i16117 & i17110) | (i17110 ^ i16117));
                            int i17114 = (i17111 ^ (-490333671)) + (((-490333671) & i17111) << 1) + (((i17113 & i17112) | (i17112 ^ i17113)) * 959);
                            int i17115 = -AndroidCharacter.getMirror('0');
                            int i17116 = (i17115 * (-300)) + 18120;
                            int i17117 = -(-((~(i17115 | 60 | i)) * (-301)));
                            int i17118 = (i17116 & i17117) + (i17116 | i17117);
                            int i17119 = ~(((-61) ^ i) | ((-61) & i));
                            int i18110 = ~((i15115 & i17115) | (i15115 ^ i17115));
                            int i18111 = -(-(((i18110 & i17119) | (i17119 ^ i18110)) * (-301)));
                            int i18112 = (i17118 & i18111) + (i18111 | i17118);
                            int i18113 = ~((~i17115) | i);
                            int i18114 = ((i18113 & (-61)) | ((-61) ^ i18113)) * 301;
                            Object[] objArr113 = new Object[1];
                            a(i17114, ((i18112 | i18114) << 1) - (i18114 ^ i18112), (short) Color.red(0), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), 532178263 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), objArr113);
                            try {
                                Object[] objArr114 = {(String) objArr113[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cResolveSizeAndState3 = (char) View.resolveSizeAndState(0, 0, 0);
                                    int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 993;
                                    int i18115 = 8 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    byte b11 = $$a[7];
                                    Object[] objArr115 = new Object[1];
                                    c(b11, (short) (b11 | 141), (byte) 52, objArr115);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState3, edgeSlop5, i18115, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                                long j11 = 853404572;
                                long j12 = -1;
                                long j13 = jLongValue3 ^ j12;
                                long jNextInt3 = new Random().nextInt(1885085374);
                                long j14 = jNextInt3 ^ j12;
                                i18 = i4;
                                long j15 = (((long) (-830)) * j11) + (((long) 832) * jLongValue3) + (((long) (-831)) * (((j13 | j14) ^ j12) | (((j11 | jLongValue3) | jNextInt3) ^ j12))) + (((long) (-1662)) * (((j13 | j11) | jNextInt3) ^ j12)) + (((long) 831) * ((((j11 ^ j12) | j14) ^ j12) | ((j11 | jNextInt3) ^ j12) | ((jLongValue3 | jNextInt3) ^ j12))) + ((long) (-1054322809));
                                int i18116 = (int) (j15 >> 32);
                                int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                int i18117 = i18116 & ((((~((-17436673) | iFreeMemory3)) | 603980810) * 449) + 989207190 + (((~((~iFreeMemory3) | (-17436673))) | 603980810) * 449));
                                int i18118 = (int) j15;
                                int i18119 = ~Process.myPid();
                                int i19110 = i18118 & (1019428157 + (((~(i18119 | (-4194369))) | (~(2113907690 | i18119))) * (-184)) + ((336243456 | (~(1777664234 | i18119)) | (~((-340437825) | i18119))) * 184) + 99058968);
                                i6 = (i18117 & i19110) | (i18117 ^ i19110);
                                i19 = asInterface + 77;
                                asBinder = i19 % 128;
                                r37 = i18;
                                if (i19 % 2 != 0) {
                                    int i19111 = 3 % 5;
                                    r37 = i18;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            context = i4;
                            iArgb = Color.argb(0, 0, 0, 0) + 268204072;
                            iIndexOf = (-16) - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int i19112 = -(-Process.getGidForName(""));
                            s = (short) (((i19112 | 1) << 1) - (i19112 ^ 1));
                            iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            i10 = asBinder + 17;
                            asInterface = i10 % 128;
                            if (i10 % 2 == 0) {
                                Object[] objArr116 = new Object[1];
                                a(iArgb, iIndexOf, s, (byte) iCombineMeasuredStates, 532178291 % (ViewConfiguration.getLongPressTimeout() >>> 88), objArr116);
                                str = (String) objArr116[0];
                                i11 = -View.combineMeasuredStates(1, 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            } else {
                                byte b12 = (byte) iCombineMeasuredStates;
                                int longPressTimeout4 = ViewConfiguration.getLongPressTimeout() >> 16;
                                int i19113 = ((longPressTimeout4 | 532178291) << 1) - (longPressTimeout4 ^ 532178291);
                                Object[] objArr117 = new Object[1];
                                a(iArgb, iIndexOf, s, b12, i19113, objArr117);
                                str = (String) objArr117[0];
                                i11 = -View.combineMeasuredStates(0, 0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            }
                            int i19114 = ~i11;
                            int i19115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i19116 = ~((i19115 & i19114) | (i19114 ^ i19115) | 268204137);
                            int i19117 = i11 | 268204137;
                            int i19118 = ~((i19117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i19117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i19119 = i19114 | 268204137;
                            int i20110 = ((303 * i11) - (-874933387)) + (((i19116 & i19118) | (i19116 ^ i19118)) * (-302)) + ((~((i19119 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i19119 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) * (-604));
                            int i20111 = ~((i11 & (-268204138)) | ((-268204138) ^ i11));
                            int i20112 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 268204137) | (268204137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i20113 = i20110 + (((i20111 & i20112) | (i20111 ^ i20112)) * 302);
                            capsMode = TextUtils.getCapsMode("", 0, 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i20114 = asInterface;
                            int i20115 = (i20114 ^ 45) + ((i20114 & 45) << 1);
                            asBinder = i20115 % 128;
                            int i20116 = i20115 % 2;
                            int i20117 = ((-963) * capsMode) - 964;
                            int i20118 = (i20117 & (-2895)) + (i20117 | (-2895));
                            int i20119 = ~capsMode;
                            int i21110 = ~((2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            i12 = i20118 + (((i20119 & i21110) | (i20119 ^ i21110)) * (-964));
                            int i21111 = ((i20114 | 75) << 1) - (i20114 ^ 75);
                            asBinder = i21111 % 128;
                            i13 = i21111 % 2;
                            i14 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            if (i13 != 0) {
                                int i21112 = -((~((i14 & 2) | (2 ^ i14))) | (~((capsMode & 2) | (2 ^ capsMode))));
                                int i21113 = i12 >> (((i21112 | (-964)) << 1) - (i21112 ^ (-964)));
                                short sResolveSizeAndState5 = (short) View.resolveSizeAndState(0, 0, 0);
                                i16 = (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1));
                                i17 = i21113;
                                s2 = sResolveSizeAndState5;
                                i15 = 1;
                            } else {
                                int i21114 = ~(i14 | 2);
                                int i21115 = ~((capsMode & 2) | (2 ^ capsMode));
                                int i21116 = i12 - (~(((i21114 & i21115) | (i21114 ^ i21115)) * (-964)));
                                i15 = 1;
                                short sResolveSizeAndState6 = (short) View.resolveSizeAndState(0, 0, 0);
                                i16 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                s2 = sResolveSizeAndState6;
                                i17 = i21116 - 1;
                            }
                            int i21117 = -i16;
                            int i21118 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                            int i21119 = ((i21118 | 532178292) << i15) - (i21118 ^ 532178292);
                            Object[] objArr118 = new Object[i15];
                            a(i20113, i17, s2, (byte) (((i15 | i21117) << i15) - (i21117 ^ i15)), i21119, objArr118);
                            try {
                                objArr = new Object[]{(String) objArr118[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cCombineMeasuredStates3 = (char) (33602 - View.combineMeasuredStates(0, 0));
                                    int iAxisFromString3 = 3084 - MotionEvent.axisFromString("");
                                    int edgeSlop6 = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    byte b13 = $$a[7];
                                    Object[] objArr119 = new Object[1];
                                    c(b13, (short) (b13 | 141), (byte) 52, objArr119);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates3, iAxisFromString3, edgeSlop6, 1411172903, false, (String) objArr119[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i22110 = asBinder;
                                    int i22111 = ((i22110 | 7) << 1) - (i22110 ^ 7);
                                    asInterface = i22111 % 128;
                                    int i22112 = i22111 % 2;
                                    i6 = 0;
                                    r37 = context;
                                } else {
                                    int i22113 = asBinder + 115;
                                    asInterface = i22113 % 128;
                                    int i22114 = i22113 % 2;
                                    i6 = 1;
                                    r37 = context;
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
                        i6 = 0;
                        r37 = context;
                    }
                } catch (Exception unused2) {
                    context = i4;
                }
                int i22115 = (~(i & 10)) & (i | 10);
                i7 = i6 | (-i6);
                int i22116 = asInterface;
                i8 = ((i22116 | 117) << 1) - (i22116 ^ 117);
                int i22117 = i8 % 128;
                asBinder = i22117;
                if (i8 % 2 != 0) {
                    i9 = i7 * 31;
                } else {
                    i9 = i7 >> 31;
                }
                int i22118 = (i9 & i22115) | ((~i9) & i);
                int i22119 = i2 & 32;
                int i23110 = (i22117 ^ 77) + ((i22117 & 77) << 1);
                asInterface = i23110 % 128;
                int i23111 = i23110 % 2;
                int i23112 = -i22119;
                int i23113 = ((i22119 & i23112) | (i22119 ^ i23112)) >> 31;
                int i23114 = i22118 & (~i23113);
                int i23115 = i23113 & i;
                i5 = (i23114 & i23115) | (i23114 ^ i23115);
                int i23116 = (i22117 ^ 23) + ((i22117 & 23) << 1);
                asInterface = i23116 % 128;
                int i23117 = i23116 % 2;
                r36 = r37;
            }
            int i242 = (~((i & r36) == true ? 1 : 0)) & ((i | r36) == true ? 1 : 0);
            int i243 = -i242;
            int i244 = ((i242 & i243) | (i242 ^ i243)) >> 31;
            int i245 = i5 & (~i244);
            int i246 = r36 & i244;
            int i247 = (i245 & i246) | (i245 ^ i246);
            int i248 = (~(i & i247)) & (i | i247);
            int i249 = -i248;
            int i250 = (((i248 & i249) | (i248 ^ i249)) >> 31) & 16;
            Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i247}, null};
            int i251 = ~((-906208061) | i);
            int i252 = (-972968060) + ((838893860 | i251) * (-280)) + ((i251 | (~(865897831 | i))) * 140);
            int i253 = ~((-67314201) | i);
            int i254 = ~i;
            int i255 = i252 + ((i253 | (~((-838893861) | i254)) | (~(i254 | 933212031))) * 140);
            int i256 = i250 * (-501);
            int i257 = -(-(i255 * TypedValues.PositionType.TYPE_PERCENT_WIDTH));
            int i258 = (i256 ^ i257) + ((i256 & i257) << 1);
            int i259 = ~i255;
            int i260 = ~(i259 | i);
            int i261 = ~((i250 ^ i255) | (i250 & i255));
            int i262 = ((i260 & i261) | (i260 ^ i261)) * (-502);
            int i263 = (i258 ^ i262) + ((i262 & i258) << 1);
            int i264 = ~i;
            int i265 = i263 + ((~((i259 & i264) | (i259 ^ i264) | i250)) * (-502));
            int i266 = ~i255;
            int i267 = ~i250;
            int i268 = ~((i & i267) | (i267 ^ i));
            int i269 = (i265 - (~(((i266 & i268) | (i266 ^ i268)) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i270 = i269 * 677;
            int i271 = i3 * (-675);
            int i272 = (i270 & i271) + (i270 | i271);
            int i273 = ~i3;
            int i274 = ((i269 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i269 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | i273) * (-676);
            int i275 = (i272 ^ i274) + ((i274 & i272) << 1);
            int i276 = ~((i273 ^ i269) | (i273 & i269));
            int i277 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
            int i278 = ~((i277 ^ i269) | (i277 & i269));
            int i279 = (i275 - (~(((i276 & i278) | (i276 ^ i278)) * 676))) - 1;
            int i280 = ~i269;
            int i281 = ~((i280 & i273) | (i280 ^ i273));
            int i282 = ~i3;
            int i283 = ~((i282 & i277) | (i282 ^ i277));
            int i284 = (i281 & i283) | (i281 ^ i283);
            int i285 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault9 | (i3 & i269) | (i269 ^ i3));
            int i286 = -(-(((i285 & i284) | (i284 ^ i285)) * 676));
            int i287 = (i279 & i286) + (i286 | i279);
            int i288 = (i287 << 13) ^ i287;
            int i289 = i288 ^ (i288 >>> 17);
            int i290 = i289 << 5;
            ((int[]) objArr20[1])[0] = (i289 | i290) & (~(i289 & i290));
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 + 117
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.auth.api.identity.zbc.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.zbc.$$e(int, short, short):java.lang.String");
    }
}
