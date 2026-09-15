package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class zzd extends zza implements zzf {
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {92, 126, -38, -95, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -27, -42, -25, 3, -21, 5, -19, -13, 27, -27, -3, -9, -18, 23, -36, 3, -32, 12, -21, 40, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
    private static final int $$e = 55;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 106;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6222325961120020325L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;

    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 84
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r7 = r7 * 52
            int r7 = 108 - r7
            byte[] r1 = com.google.android.gms.internal.auth.zzd.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzd.a(byte, short, short, java.lang.Object[]):void");
    }

    private static void d(byte b2, int i, short s, Object[] objArr) {
        int i2 = 52 - (i * 49);
        byte[] bArr = $$d;
        int i3 = (b2 * 15) + 84;
        int i4 = s * 12;
        byte[] bArr2 = new byte[i4 + 38];
        int i5 = i4 + 37;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i5 + (-i2)) - 8;
            i2 = i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i2 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i7])) - 8;
                i2 = i7;
                i6 = i8;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account account) throws RemoteException {
        Parcel parcelZzb;
        Bundle bundle;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            Parcel parcelZza = zza();
            zzc.zzc(parcelZza, account);
            parcelZzb = zzb(98, parcelZza);
            bundle = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
        } else {
            Parcel parcelZza2 = zza();
            zzc.zzc(parcelZza2, account);
            parcelZzb = zzb(7, parcelZza2);
            bundle = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
        }
        parcelZzb.recycle();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String str) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(8, parcelZza);
        Bundle bundle = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
        parcelZzb.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String str, Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzc(parcelZza, bundle);
        Parcel parcelZzb = zzb(2, parcelZza);
        Bundle bundle2 = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
        parcelZzb.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account account, String str, Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, account);
        parcelZza.writeString(str);
        zzc.zzc(parcelZza, bundle);
        Parcel parcelZzb = zzb(5, parcelZza);
        Bundle bundle2 = (Bundle) zzc.zza(parcelZzb, Bundle.CREATOR);
        parcelZzb.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return bundle2;
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
            int i4 = $11 + 69;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 8328), 1234 - TextUtils.lastIndexOf("", '0'), 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 2763 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 14, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.green(0) + 253, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - Process.getGidForName("")), TextUtils.lastIndexOf("", '0', 0) + 2892, 16 - ExpandableListView.getPackedPositionChild(0L), 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i6 = $10 + 67;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i8 = $11 + 17;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, accountChangeEventsRequest);
        Parcel parcelZzb = zzb(3, parcelZza);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.zza(parcelZzb, AccountChangeEventsResponse.CREATOR);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
            int iBlue = 3111 - Color.blue(0);
            int i2 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[40], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, iBlue, i2, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{36266, 46917, 14066, 3803}, new char[]{14032, 37993, 8952, 15345}, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.getMaxKeyCode() >> 16, new char[]{4196, 26182, 54700, 49530, 2657, 47734, 10751, 31819, 28018, 35271, 22429, 54163, 8504, 18921, 19874, 61599, 45682, 37852, 43812, 840, 27267, 5842}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{36266, 46917, 14066, 3803}, new char[]{49190, 6010, 28076, 43462}, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50797), ((Process.getThreadPriority(0) + 20) >> 6) - 1407747392, new char[]{30719, 18272, 17287, 9957, 35417, 5314, 17810, 32324, 45202, 51206, 42649, 35678, 63421, 46715, 27864}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) (43042 - View.resolveSizeAndState(0, 0, 0));
            int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[5], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i3, iIndexOf, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 3111;
                int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar, iCombineMeasuredStates, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i4};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i6 = ((((-1475930634) + (((~(660488522 | startElapsedRealtime)) | 402666640) * (-140))) + ((~(1063155162 | startElapsedRealtime)) * 70)) + (((~(startElapsedRealtime | 1044542936)) | 421278866) * 70)) - 843543416;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{36266, 46917, 14066, 3803}, new char[]{20944, 29744, 56219, 9104}, (char) (KeyEvent.keyCodeFromString("") + 37083), TextUtils.indexOf("", "", 0, 0), new char[]{61164, 6057, 58465, 33063, 7702, 45733, 16549, 9782, 51471, 7483, 28097, 38700, 21780, 19082, 544, 35300}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{36266, 46917, 14066, 3803}, new char[]{38477, 52114, 41594, 22172}, (char) (TextUtils.getOffsetBefore("", 0) + 40098), View.getDefaultSize(0, 0), new char[]{5242, 17300, 6001, 41466, 59216, 60711, 21793, 16228, 54287, 12914, 44035, 1330, 19239, 11506, 26874, 4645}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentbindingInflater1 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -843543416};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[12];
                byte b7 = b6;
                Object[] objArr11 = new Object[1];
                d(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr4[63];
                byte b9 = b8;
                Object[] objArr12 = new Object[1];
                d(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 43042);
                    int iRed = Color.red(0) + 3111;
                    int defaultSize = 22 - View.getDefaultSize(0, 0);
                    byte[] bArr5 = $$a;
                    byte b10 = bArr5[5];
                    byte b11 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    a(b10, b11, b11, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, iRed, defaultSize, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{36266, 46917, 14066, 3803}, new char[]{14032, 37993, 8952, 15345}, (char) (Process.myTid() >> 22), Process.myPid() >> 22, new char[]{4196, 26182, 54700, 49530, 2657, 47734, 10751, 31819, 28018, 35271, 22429, 54163, 8504, 18921, 19874, 61599, 45682, 37852, 43812, 840, 27267, 5842}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{36266, 46917, 14066, 3803}, new char[]{49190, 6010, 28076, 43462}, (char) (Color.rgb(0, 0, 0) + 16828013), (-1407747392) - View.resolveSizeAndState(0, 0, 0), new char[]{30719, 18272, 17287, 9957, 35417, 5314, 17810, 32324, 45202, 51206, 42649, 35678, 63421, 46715, 27864}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43042);
                        int gidForName = 3110 - Process.getGidForName("");
                        int iAlpha = 22 - Color.alpha(0);
                        byte[] bArr6 = $$a;
                        byte b12 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        a(b12, bArr6[5], b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, gidForName, iAlpha, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 43042);
                        int iIndexOf2 = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr7 = $$a;
                        byte b13 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        a(b13, bArr7[40], b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, iIndexOf2, tapTimeout, -1272852037, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            int i15 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i18};
            int iMyPid = Process.myPid();
            int i20 = ~iMyPid;
            int i21 = i17 + 500399120 + (((~((-517459167) | i20)) | 1187572292) * (-602)) + (((~(iMyPid | (-517459167))) | 113297476 | (~(1591733982 | i20))) * (-301)) + ((~(i20 | 1187572292)) * 301);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr[0])[0] = i23 ^ (i23 << 5);
            Object[] objArr18 = {new int[1], new int[]{i19}, iArr2, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr3 = new int[i14];
            int i24 = i14 - 1;
            iArr3[i24] = 1;
            Toast.makeText((Context) null, iArr3[((i14 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr4 = {i26};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = ~((-1015790727) | iIdentityHashCode);
            int i29 = ~iIdentityHashCode;
            int i30 = i25 + 1140342846 + ((i28 | (~(1033895582 | i29))) * (-406)) + ((~((-344654851) | i29)) * (-406)) + (((~(iIdentityHashCode | (-689240733))) | (~(1015790726 | i29))) * 406);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
            Object[] objArr19 = {new int[1], new int[]{i27}, iArr4, strArr4};
        }
        parcelZzb.recycle();
        return accountChangeEventsResponse;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r8 = 104 - r8
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = com.google.android.gms.internal.auth.zzd.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzd.$$g(int, byte, byte):java.lang.String");
    }
}
