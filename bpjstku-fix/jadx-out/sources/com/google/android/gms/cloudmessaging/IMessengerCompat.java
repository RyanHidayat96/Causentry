package com.google.android.gms.cloudmessaging;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
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
import androidx.core.view.ViewCompat;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.setRelative;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
interface IMessengerCompat extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    void send(Message message) throws RemoteException;

    /* JADX INFO: loaded from: classes4.dex */
    public static class Proxy implements IMessengerCompat {
        private final IBinder zza;
        private static final byte[] $$c = {106, -66, 28, 119};
        private static final int $$d = 16;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {59, -124, -78, 46};
        private static final int $$b = 122;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int[] b = {1834236125, 1806819677, -1440039720, -270274086, -1611271403, -1617258141, -1390592140, -1602362942, 1146177503, 504005534, 182311985, 129541637, -1181011465, 1082042635, -885996099, -1186250015, -71691442, 1070310482};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 98
                byte[] r0 = com.google.android.gms.cloudmessaging.IMessengerCompat.Proxy.$$a
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r9 = r9 * 3
                int r9 = 3 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2f
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2f:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.IMessengerCompat.Proxy.c(byte, short, int, java.lang.Object[]):void");
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(Message message) throws RemoteException {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(IMessengerCompat.DESCRIPTOR);
            parcelObtain.writeInt(1);
            message.writeToParcel(parcelObtain, 0);
            try {
                this.zza.transact(1, parcelObtain, null, 1);
                parcelObtain.recycle();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = b;
            int i4 = -1870535734;
            long j = 0;
            int i5 = 1;
            int i6 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i7 = $11 + 83;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 0;
                while (i9 < length2) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr3[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int deadChar = 3291 - KeyEvent.getDeadChar(i6, i6);
                            int i10 = 31 - (ExpandableListView.getPackedPositionForGroup(i6) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == j ? 0 : -1));
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, deadChar, i10, 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9++;
                        i4 = -1870535734;
                        j = 0;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = b;
            if (iArr6 != null) {
                int i11 = $10 + 13;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i12 = $11 + 119;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 3291, 31 - (KeyEvent.getMaxKeyCode() >> 16), 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i2++;
                    iArr6 = iArr6;
                    i5 = 1;
                }
                iArr6 = iArr2;
            }
            char c = 0;
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i14 = 17;
                for (int i15 = 1; i14 > i15; i15 = 1) {
                    int i16 = $10 + 57;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i14];
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (-b6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2559, TextUtils.getOffsetAfter("", 0) + 29, 683220507, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i14 += 16;
                    } else {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i14];
                        try {
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 1;
                                byte b9 = (byte) (-b8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2558 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 683220507, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i14--;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                }
                int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - TextUtils.getOffsetAfter("", 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 348, 25 - ExpandableListView.getPackedPositionType(0L), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        Proxy(IBinder iBinder) {
            this.zza = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.zza;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:87:0x05cd A[PHI: r18
  0x05cd: PHI (r18v2 ??) = (r18v3 ??), (r18v4 ??), (r18v13 ??), (r18v13 ??), (r18v13 ??), (r18v13 ??) binds: [B:86:0x05cb, B:107:0x05cd, B:54:0x0431, B:56:0x045c, B:73:0x058f, B:75:0x059a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x0671  */
        /* JADX WARN: Code duplicated, block: B:90:0x0678  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v0, types: [long] */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v13 */
        /* JADX WARN: Type inference failed for: r18v14 */
        /* JADX WARN: Type inference failed for: r18v15 */
        /* JADX WARN: Type inference failed for: r18v2 */
        /* JADX WARN: Type inference failed for: r18v3 */
        /* JADX WARN: Type inference failed for: r18v4 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
            int i3;
            int i4;
            int i5;
            String line;
            ?? r18;
            char c;
            Object[] objArr;
            char c2;
            int i6;
            String[] strArr;
            Object[] objArr2;
            char c3;
            int i7;
            int i8;
            int i9;
            int i10;
            int[] iArr;
            int threadPriority;
            int iB;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17 = 2 % 2;
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
            int i19 = i18 % 2;
            try {
                String[] strArr2 = new String[2];
                int[] iArr2 = {959465156, -1185284446, -1218893374, 470438508, -1356664373, -429780329, -715615355, 1742651824, 2065079985, 1643410309, 1969116089, 1850397244};
                int i20 = -Drawable.resolveOpacity(0, 0);
                int iB2 = setRelative.b();
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i22 = (i21 ^ 43) + ((i21 & 43) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = i22 % 2;
                int i24 = i20 * 755;
                int i25 = (i24 & (-14307)) + (i24 | (-14307));
                int i26 = ~i20;
                int i27 = ~(i26 | 19);
                int i28 = ~((i26 ^ iB2) | (i26 & iB2));
                int i29 = (i27 ^ i28) | (i27 & i28);
                int i30 = ~((iB2 ^ 19) | (iB2 & 19));
                int i31 = i25 + (((i29 ^ i30) | (i29 & i30)) * (-754));
                int i32 = ~i20;
                int i33 = (i32 ^ 19) | (i32 & 19);
                int i34 = ~((i33 ^ iB2) | (i33 & iB2));
                int i35 = i21 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
                int i36 = i35 % 2;
                int i37 = ~iB2;
                int i38 = ~((i20 & i37) | (i37 ^ i20) | 19);
                int i39 = i31 + ((-754) * ((i38 & i34) | (i34 ^ i38)));
                int i40 = ((i37 & i26) | (i26 ^ i37)) * 754;
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                Object[] objArr3 = new Object[1];
                a(iArr2, i41, objArr3);
                strArr2[0] = (String) objArr3[0];
                int[] iArr3 = {-1010432512, 530792588, 2119009491, -750774151, -448800367, -788428276, 807344842, -384362117, -2140232062, 1718819970, -1725978863, -268809717};
                int i42 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i44 = (i43 & 55) + (i43 | 55);
                int i45 = i44 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45;
                int i46 = i44 % 2;
                int i47 = (i42 * 141) - 5301;
                int i48 = -(-(((19 ^ i) | (19 & i)) * 140));
                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                int i50 = ~i42;
                int i51 = ~((i50 & 19) | (i50 ^ 19));
                int i52 = ~i;
                int i53 = (i45 & 1) + (i45 | 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i53 % 128;
                if (i53 % 2 != 0) {
                    int i54 = -(i51 | (~((i52 ^ 19) | (i52 & 19))));
                    i14 = i49 % ((i54 ^ (-280)) + ((i54 & (-280)) << 1));
                    i15 = ~(((-20) & i42) | ((-20) ^ i42));
                    int i55 = ~i;
                    i16 = (i55 & i42) | (i55 ^ i42);
                } else {
                    int i56 = ~((i52 ^ 19) | (i52 & 19));
                    i14 = i49 + (((i51 & i56) | (i51 ^ i56)) * (-280));
                    i15 = ~(((-20) & i42) | ((-20) ^ i42));
                    i16 = (i52 ^ i42) | (i52 & i42);
                }
                int i57 = ~i16;
                int i58 = (i15 & i57) | (i15 ^ i57);
                int i59 = (i42 ^ (-1)) | 19;
                int i60 = ~((i59 & i) | (i59 ^ i));
                int i61 = 140 * ((i60 & i58) | (i58 ^ i60));
                int i62 = ((i14 | i61) << 1) - (i61 ^ i14);
                Object[] objArr4 = new Object[1];
                a(iArr3, i62, objArr4);
                strArr2[1] = (String) objArr4[0];
                int i63 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i63 % 128;
                int i64 = i63 % 2;
                int i65 = 0;
                while (true) {
                    if (i65 >= 2) {
                        i5 = i;
                        break;
                    }
                    String str = strArr2[i65];
                    Object[] objArr5 = new Object[1];
                    a(new int[]{-176384751, 1555050975, 1384261120, -45909067, 948718676, 1414120902, -715854592, -947344823, -36076447, -1373146820}, 16 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), objArr5);
                    Class<?> cls = Class.forName((String) objArr5[0]);
                    if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                        int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i67 = (i66 ^ 51) + ((i66 & 51) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i67 % 128;
                        if (i67 % 2 != 0) {
                            i3 = i & (-2);
                            i4 = i52 & 1;
                            i5 = i3 | i4;
                            break;
                        }
                        i5 = (~(i & 1)) & (i | 1);
                        break;
                    }
                    i65 = ((i65 | 1) << 1) - (i65 ^ 1);
                    int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i69 = ((i68 | 11) << 1) - (i68 ^ 11);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                    int i70 = i69 % 2;
                }
            } catch (Exception unused) {
                i3 = i & (-3);
                i4 = (~i) & 2;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 2420);
                    int offsetBefore = 2845 - TextUtils.getOffsetBefore("", 0);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 5;
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    c(b2, b3, b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, offsetBefore, offsetBefore2, -501222268, false, (String) objArr6[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = 34698253;
                long j2 = -1;
                ?? r19 = j ^ j2;
                long j3 = 191;
                long j4 = i;
                long j5 = (((long) (-381)) * j) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue) + (((long) (-191)) * r19) + ((j | ((jLongValue | j4) ^ j2)) * j3) + (j3 * ((j2 ^ ((j4 ^ j2) | jLongValue)) | ((r19 | jLongValue) ^ j2))) + ((long) (-1193884939));
                int i71 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
                int i72 = i71 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i72;
                int i73 = i71 % 2;
                int i74 = ~i;
                int i75 = (~(1843489803 | i74)) | (-2113240652);
                int i76 = ~((-744500234) | i);
                int i77 = ((int) (j5 >> 32)) & (1447341218 + ((i75 | i76) * (-502)) + (((~((-269750849) | i74)) | i76) * TypedValues.PositionType.TYPE_DRAWPATH));
                int i78 = ((int) j5) & (((((~(1265879113 | i)) | 263456) * (-566)) - 1288110315) + ((~(1266142569 | i)) * 566));
                int i79 = (i77 & i78) | (i77 ^ i78);
                int i80 = (~(i & 10)) & (i | 10);
                int i81 = (i79 | 1) & (~(i79 & 1));
                int i82 = -i81;
                int i83 = ((i81 & i82) | (i81 ^ i82)) >> 31;
                int i84 = (i83 & i) | (i80 & (~i83));
                int i85 = (i72 ^ 67) + ((i72 & 67) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i85 % 128;
                int i86 = i85 % 2;
                int i87 = (~(i & i5)) & (i | i5);
                int i88 = -i87;
                int i89 = ((i87 & i88) | (i87 ^ i88)) >> 31;
                int i90 = i84 & (~i89);
                int i91 = i5 & i89;
                int i92 = (i91 & i90) | (i90 ^ i91);
                try {
                    int trimmedLength = TextUtils.getTrimmedLength("");
                    int i93 = (trimmedLength & 40) + (trimmedLength | 40);
                    Object[] objArr7 = new Object[1];
                    a(new int[]{1084418599, -1474699102, -203721553, 102438100, 1459458451, -331289060, 63181447, 653372931, -821917254, -1077467435, -819357332, -2024357655, -249222234, 1603299076, 334504492, 1183839895, -2088897044, -1672817829, 1714844175, -839330186, -969233426, -1886095239}, i93, objArr7);
                    File file = new File((String) objArr7[0]);
                    if (file.canRead()) {
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        try {
                            line = bufferedReader.readLine();
                            Object[] objArr8 = new Object[1];
                            a(new int[]{-22018292, -1257846496, -1853455046, -56099390}, Drawable.resolveOpacity(0, 0) + 3, objArr8);
                            if (line.equals((String) objArr8[0])) {
                                fileReader.close();
                                bufferedReader.close();
                                int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i95 = ((i94 | 105) << 1) - (i94 ^ 105);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i95 % 128;
                                int i96 = i95 % 2;
                                line = null;
                            } else {
                                fileReader.close();
                                bufferedReader.close();
                            }
                        } catch (Throwable th) {
                            fileReader.close();
                            bufferedReader.close();
                            throw th;
                        }
                    } else {
                        line = null;
                    }
                } catch (Exception unused2) {
                }
                try {
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                    int iB3 = setRelative.b();
                    int i97 = ~(((-32) & absoluteGravity) | ((-32) ^ absoluteGravity));
                    int i98 = ~absoluteGravity;
                    int i99 = ~((i98 ^ 31) | (i98 & 31) | iB3);
                    int i100 = ((absoluteGravity * (-500)) - 15500) + (((i97 & i99) | (i97 ^ i99)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    int i101 = (~((i98 ^ (-32)) | (i98 & (-32)))) * 1002;
                    int i102 = (i100 & i101) + (i100 | i101);
                    int i103 = ~absoluteGravity;
                    int i104 = ~iB3;
                    int i105 = (~((i103 & i104) | (i103 ^ i104) | 31)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                    int i106 = (i102 ^ i105) + ((i105 & i102) << 1);
                    Object[] objArr9 = new Object[1];
                    a(new int[]{2041016283, -1214697041, -124734685, 1935915834, 800479348, -1674928003, 518579291, 999340046, 858215578, -1127709626, -1346882702, -2064726438, -107228051, 1800274210, -1074874022, 1238861486, 416590320, -1541059982}, i106, objArr9);
                    File file2 = new File((String) objArr9[0]);
                    if (file2.canRead()) {
                        FileReader fileReader2 = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                        int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i107 % 128;
                        int i108 = i107 % 2;
                        try {
                            try {
                                String line2 = bufferedReader2.readLine();
                                int[] iArr4 = {1175315083, -694621545, 381959407, 324775690};
                                int size = View.MeasureSpec.getSize(0);
                                int iB4 = setRelative.b();
                                setRelative.b();
                                int i109 = ~(((-2) ^ iB4) | ((-2) & iB4));
                                int i110 = ~iB4;
                                int i111 = ~((i110 ^ size) | (i110 & size));
                                int i112 = (((size * (-515)) + 517) - (~(-(-((((i109 ^ i111) | (i111 & i109)) | (~((i110 ^ 1) | (i110 & 1)))) * (-516)))))) - 1;
                                int i113 = ~size;
                                int i114 = i113 | (-2);
                                int i115 = ~((i114 ^ iB4) | (i114 & iB4));
                                int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i117 = (i116 & 63) + (i116 | 63);
                                r19 = i92;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i117 % 128;
                                int i118 = i117 % 2;
                                int i119 = ~size;
                                int i120 = (i119 & i110) | (i119 ^ i110);
                                int i121 = ~((i120 & 1) | (i120 ^ 1));
                                int i122 = 516 * ((i121 & i115) | (i115 ^ i121));
                                int i123 = (i112 & i122) + (i122 | i112);
                                int i124 = ~((i113 & 1) | (i113 ^ 1));
                                int i125 = ~iB4;
                                int i126 = ~((i125 & 1) | (i125 ^ 1));
                                int i127 = i123 + (((i124 & i126) | (i124 ^ i126)) * 516);
                                try {
                                    Object[] objArr10 = new Object[1];
                                    a(iArr4, i127, objArr10);
                                    boolean zEquals = line2.equals((String) objArr10[0]);
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    if (zEquals) {
                                        int i128 = 20;
                                        Object[] objArr11 = new Object[1];
                                        a(new int[]{816644149, -881359539, -1850075793, -319310280, -2125056708, 108684906, 547059915, -1336873868, 690044304, 1842441679, -740958933, -1745994954, 1557765795, -2106172387, 325722071, -1234413259, 1827602674, 1614427380, -1060836813, -1802712285}, 34 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), objArr11);
                                        File file3 = new File((String) objArr11[0]);
                                        if (!(!file3.canRead())) {
                                            FileReader fileReader3 = new FileReader(file3);
                                            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                            try {
                                                String line3 = bufferedReader3.readLine();
                                                int[] iArr5 = {1175315083, -694621545, 381959407, 324775690};
                                                int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i130 = (i129 & 43) + (i129 | 43);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i130 % 128;
                                                if (i130 % 2 == 0) {
                                                    i11 = 0;
                                                    threadPriority = Process.getThreadPriority(0);
                                                    i128 = 25;
                                                    iB = setRelative.b();
                                                } else {
                                                    threadPriority = Process.getThreadPriority(0);
                                                    iB = setRelative.b();
                                                    int i131 = -(-(threadPriority * (-282)));
                                                    i11 = (i131 | 5680) + (5680 & i131);
                                                }
                                                int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i133 = (i132 & 109) + (i132 | 109);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i133 % 128;
                                                int i134 = i133 % 2;
                                                int i135 = ~i128;
                                                int i136 = ~((i135 & threadPriority) | (i135 ^ threadPriority));
                                                int i137 = ~i128;
                                                int i138 = ~((i137 ^ iB) | (i137 & iB));
                                                int i139 = (-283) * ((i136 ^ i138) | (i136 & i138));
                                                int i140 = ~threadPriority;
                                                int i141 = (i11 ^ i139) + ((i11 & i139) << 1) + ((~((i128 & i140) | (i140 ^ i128))) * 283);
                                                int i142 = (i137 ^ i140) | (i140 & i137);
                                                int i143 = -((i141 + ((~((i142 & iB) | (i142 ^ iB))) * 283)) >> 6);
                                                int iB5 = setRelative.b();
                                                int i144 = i143 * (-575);
                                                int i145 = (i144 ^ (-575)) + ((i144 & (-575)) << 1);
                                                int i146 = ~i143;
                                                int i147 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i148 = i147 + 3;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i148 % 128;
                                                int i149 = i148 % 2;
                                                int i150 = ~((i146 ^ (-2)) | (i146 & (-2)));
                                                int i151 = ~(((-2) ^ iB5) | ((-2) & iB5));
                                                int i152 = -(-(((i150 ^ i151) | (i150 & i151)) * 576));
                                                int i153 = (i145 & i152) + (i145 | i152);
                                                int i154 = ~((i146 ^ 1) | (i146 & 1));
                                                int i155 = (i147 ^ 15) + ((i147 & 15) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i155 % 128;
                                                if (i155 % 2 == 0) {
                                                    int i156 = ~iB5;
                                                    int i157 = (i156 & (-2)) | ((-2) ^ i156);
                                                    int i158 = ~((i143 & i157) | (i157 ^ i143));
                                                    i13 = i153 >> (576 - ((i158 & i154) | (i154 ^ i158)));
                                                    i12 = (i146 ^ (-2)) | (i146 & (-2));
                                                } else {
                                                    int i159 = (~iB5) | (-2);
                                                    int i160 = ~((i159 & i143) | (i159 ^ i143));
                                                    int i161 = -(-(((i160 & i154) | (i154 ^ i160)) * 576));
                                                    int i162 = (i153 | i161) + (i153 & i161);
                                                    int i163 = ~i143;
                                                    i12 = (i163 & (-2)) | (i163 ^ (-2));
                                                    i13 = i162;
                                                }
                                                int i164 = -(-(576 * (~i12)));
                                                int i165 = (i13 ^ i164) + ((i13 & i164) << 1);
                                                Object[] objArr12 = new Object[1];
                                                a(iArr5, i165, objArr12);
                                                boolean zEquals2 = line3.equals((String) objArr12[0]);
                                                fileReader3.close();
                                                bufferedReader3.close();
                                                if (zEquals2) {
                                                    int i166 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i166 % 128;
                                                    int i167 = i166 % 2;
                                                    if (line != null) {
                                                        objArr = new Object[]{new int[]{(i & (-21)) | (i74 & 20)}, new String[]{line}};
                                                        c = 0;
                                                        r18 = r19;
                                                    } else {
                                                        objArr = new Object[2];
                                                        objArr[0] = new int[1];
                                                        String[] strArr3 = new String[0];
                                                        int i168 = (((-288529221) ^ i) | ((-288529221) & i)) * (-50);
                                                        int i169 = ((1839629187 | i168) << 1) - (i168 ^ 1839629187);
                                                        int i170 = ~((-1652621339) | i);
                                                        int i171 = ~i;
                                                        int i172 = ((-1941112863) ^ i171) | ((-1941112863) & i171);
                                                        int i173 = ~((i172 & (-288529221)) | (i172 ^ (-288529221)));
                                                        int i174 = ((i170 & i173) | (i170 ^ i173)) * 50;
                                                        int i175 = (i169 & i174) + (i174 | i169);
                                                        int i176 = ~(((-1941112863) ^ i74) | ((-1941112863) & i74));
                                                        int i177 = -(-(((~(((-288529221) & i171) | (i171 ^ (-288529221)))) | (i176 & 288491524) | (i176 ^ 288491524)) * 50));
                                                        i8 = (i175 ^ i177) + ((i177 & i175) << 1);
                                                        int iB6 = setRelative.b();
                                                        int i178 = 714631481 - (~(((~(((-254966661) & iB6) | ((-254966661) ^ iB6))) | (-1541456235)) * (-318)));
                                                        int i179 = ~(((-1541456235) ^ iB6) | ((-1541456235) & iB6));
                                                        int i180 = ~iB6;
                                                        int i181 = i180 | 254966660;
                                                        int i182 = ~((i181 & 1541456234) | (i181 ^ 1541456234));
                                                        i9 = i178 + (((i179 & i182) | (i179 ^ i182)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                                        int i183 = (-1541456235) | i180;
                                                        int i184 = ~((i183 & 254966660) | (i183 ^ 254966660));
                                                        int i185 = ~(iB6 | 1609759726);
                                                        i10 = ((i185 & i184) | (i184 ^ i185)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                        if (i8 > ((i9 | i10) << 1) - (i10 ^ i9)) {
                                                            iArr = (int[]) objArr[1];
                                                            c = 0;
                                                        } else {
                                                            c = 0;
                                                            iArr = (int[]) objArr[0];
                                                        }
                                                        iArr[c] = i;
                                                        objArr[1] = strArr3;
                                                        r18 = r19;
                                                    }
                                                } else {
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                    String[] strArr4 = new String[0];
                                                    int i1610 = (((-288529221) ^ i) | ((-288529221) & i)) * (-50);
                                                    int i1611 = ((1839629187 | i1610) << 1) - (i1610 ^ 1839629187);
                                                    int i1710 = ~((-1652621339) | i);
                                                    int i1711 = ~i;
                                                    int i1712 = ((-1941112863) ^ i1711) | ((-1941112863) & i1711);
                                                    int i1713 = ~((i1712 & (-288529221)) | (i1712 ^ (-288529221)));
                                                    int i1714 = ((i1710 & i1713) | (i1710 ^ i1713)) * 50;
                                                    int i1715 = (i1611 & i1714) + (i1714 | i1611);
                                                    int i1716 = ~(((-1941112863) ^ i74) | ((-1941112863) & i74));
                                                    int i1717 = -(-(((~(((-288529221) & i1711) | (i1711 ^ (-288529221)))) | (i1716 & 288491524) | (i1716 ^ 288491524)) * 50));
                                                    i8 = (i1715 ^ i1717) + ((i1717 & i1715) << 1);
                                                    int iB7 = setRelative.b();
                                                    int i1718 = 714631481 - (~(((~(((-254966661) & iB7) | ((-254966661) ^ iB7))) | (-1541456235)) * (-318)));
                                                    int i1719 = ~(((-1541456235) ^ iB7) | ((-1541456235) & iB7));
                                                    int i186 = ~iB7;
                                                    int i187 = i186 | 254966660;
                                                    int i188 = ~((i187 & 1541456234) | (i187 ^ 1541456234));
                                                    i9 = i1718 + (((i1719 & i188) | (i1719 ^ i188)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                                    int i189 = (-1541456235) | i186;
                                                    int i1810 = ~((i189 & 254966660) | (i189 ^ 254966660));
                                                    int i1811 = ~(iB7 | 1609759726);
                                                    i10 = ((i1811 & i1810) | (i1810 ^ i1811)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                    if (i8 > ((i9 | i10) << 1) - (i10 ^ i9)) {
                                                        iArr = (int[]) objArr[1];
                                                        c = 0;
                                                    } else {
                                                        c = 0;
                                                        iArr = (int[]) objArr[0];
                                                    }
                                                    iArr[c] = i;
                                                    objArr[1] = strArr4;
                                                    r18 = r19;
                                                }
                                            } catch (Throwable th2) {
                                                fileReader3.close();
                                                bufferedReader3.close();
                                                throw th2;
                                            }
                                        } else {
                                            objArr = new Object[2];
                                            objArr[0] = new int[1];
                                            String[] strArr5 = new String[0];
                                            int i1612 = (((-288529221) ^ i) | ((-288529221) & i)) * (-50);
                                            int i1613 = ((1839629187 | i1612) << 1) - (i1612 ^ 1839629187);
                                            int i17110 = ~((-1652621339) | i);
                                            int i17111 = ~i;
                                            int i17112 = ((-1941112863) ^ i17111) | ((-1941112863) & i17111);
                                            int i17113 = ~((i17112 & (-288529221)) | (i17112 ^ (-288529221)));
                                            int i17114 = ((i17110 & i17113) | (i17110 ^ i17113)) * 50;
                                            int i17115 = (i1613 & i17114) + (i17114 | i1613);
                                            int i17116 = ~(((-1941112863) ^ i74) | ((-1941112863) & i74));
                                            int i17117 = -(-(((~(((-288529221) & i17111) | (i17111 ^ (-288529221)))) | (i17116 & 288491524) | (i17116 ^ 288491524)) * 50));
                                            i8 = (i17115 ^ i17117) + ((i17117 & i17115) << 1);
                                            int iB8 = setRelative.b();
                                            int i17118 = 714631481 - (~(((~(((-254966661) & iB8) | ((-254966661) ^ iB8))) | (-1541456235)) * (-318)));
                                            int i17119 = ~(((-1541456235) ^ iB8) | ((-1541456235) & iB8));
                                            int i1812 = ~iB8;
                                            int i1813 = i1812 | 254966660;
                                            int i1814 = ~((i1813 & 1541456234) | (i1813 ^ 1541456234));
                                            i9 = i17118 + (((i17119 & i1814) | (i17119 ^ i1814)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                            int i1815 = (-1541456235) | i1812;
                                            int i1816 = ~((i1815 & 254966660) | (i1815 ^ 254966660));
                                            int i1817 = ~(iB8 | 1609759726);
                                            i10 = ((i1817 & i1816) | (i1816 ^ i1817)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                            if (i8 > ((i9 | i10) << 1) - (i10 ^ i9)) {
                                                iArr = (int[]) objArr[1];
                                                c = 0;
                                            } else {
                                                c = 0;
                                                iArr = (int[]) objArr[0];
                                            }
                                            iArr[c] = i;
                                            objArr[1] = strArr5;
                                            r18 = r19;
                                        }
                                    } else {
                                        objArr = new Object[2];
                                        objArr[0] = new int[1];
                                        String[] strArr6 = new String[0];
                                        int i1614 = (((-288529221) ^ i) | ((-288529221) & i)) * (-50);
                                        int i1615 = ((1839629187 | i1614) << 1) - (i1614 ^ 1839629187);
                                        int i171110 = ~((-1652621339) | i);
                                        int i171111 = ~i;
                                        int i171112 = ((-1941112863) ^ i171111) | ((-1941112863) & i171111);
                                        int i171113 = ~((i171112 & (-288529221)) | (i171112 ^ (-288529221)));
                                        int i171114 = ((i171110 & i171113) | (i171110 ^ i171113)) * 50;
                                        int i171115 = (i1615 & i171114) + (i171114 | i1615);
                                        int i171116 = ~(((-1941112863) ^ i74) | ((-1941112863) & i74));
                                        int i171117 = -(-(((~(((-288529221) & i171111) | (i171111 ^ (-288529221)))) | (i171116 & 288491524) | (i171116 ^ 288491524)) * 50));
                                        i8 = (i171115 ^ i171117) + ((i171117 & i171115) << 1);
                                        int iB9 = setRelative.b();
                                        int i171118 = 714631481 - (~(((~(((-254966661) & iB9) | ((-254966661) ^ iB9))) | (-1541456235)) * (-318)));
                                        int i171119 = ~(((-1541456235) ^ iB9) | ((-1541456235) & iB9));
                                        int i1818 = ~iB9;
                                        int i1819 = i1818 | 254966660;
                                        int i18110 = ~((i1819 & 1541456234) | (i1819 ^ 1541456234));
                                        i9 = i171118 + (((i171119 & i18110) | (i171119 ^ i18110)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                        int i18111 = (-1541456235) | i1818;
                                        int i18112 = ~((i18111 & 254966660) | (i18111 ^ 254966660));
                                        int i18113 = ~(iB9 | 1609759726);
                                        i10 = ((i18113 & i18112) | (i18112 ^ i18113)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                        if (i8 > ((i9 | i10) << 1) - (i10 ^ i9)) {
                                            iArr = (int[]) objArr[1];
                                            c = 0;
                                        } else {
                                            c = 0;
                                            iArr = (int[]) objArr[0];
                                        }
                                        iArr[c] = i;
                                        objArr[1] = strArr6;
                                        r18 = r19;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        int i190 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i190 % 128;
                        int i191 = i190 % 2;
                        r19 = i92;
                        objArr = new Object[2];
                        objArr[0] = new int[1];
                        String[] strArr7 = new String[0];
                        int i1616 = (((-288529221) ^ i) | ((-288529221) & i)) * (-50);
                        int i1617 = ((1839629187 | i1616) << 1) - (i1616 ^ 1839629187);
                        int i1711110 = ~((-1652621339) | i);
                        int i1711111 = ~i;
                        int i1711112 = ((-1941112863) ^ i1711111) | ((-1941112863) & i1711111);
                        int i1711113 = ~((i1711112 & (-288529221)) | (i1711112 ^ (-288529221)));
                        int i1711114 = ((i1711110 & i1711113) | (i1711110 ^ i1711113)) * 50;
                        int i1711115 = (i1617 & i1711114) + (i1711114 | i1617);
                        int i1711116 = ~(((-1941112863) ^ i74) | ((-1941112863) & i74));
                        int i1711117 = -(-(((~(((-288529221) & i1711111) | (i1711111 ^ (-288529221)))) | (i1711116 & 288491524) | (i1711116 ^ 288491524)) * 50));
                        i8 = (i1711115 ^ i1711117) + ((i1711117 & i1711115) << 1);
                        int iB10 = setRelative.b();
                        int i1711118 = 714631481 - (~(((~(((-254966661) & iB10) | ((-254966661) ^ iB10))) | (-1541456235)) * (-318)));
                        int i1711119 = ~(((-1541456235) ^ iB10) | ((-1541456235) & iB10));
                        int i18114 = ~iB10;
                        int i18115 = i18114 | 254966660;
                        int i18116 = ~((i18115 & 1541456234) | (i18115 ^ 1541456234));
                        i9 = i1711118 + (((i1711119 & i18116) | (i1711119 ^ i18116)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                        int i18117 = (-1541456235) | i18114;
                        int i18118 = ~((i18117 & 254966660) | (i18117 ^ 254966660));
                        int i18119 = ~(iB10 | 1609759726);
                        i10 = ((i18119 & i18118) | (i18118 ^ i18119)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                        if (i8 > ((i9 | i10) << 1) - (i10 ^ i9)) {
                            iArr = (int[]) objArr[1];
                            c = 0;
                        } else {
                            c = 0;
                            iArr = (int[]) objArr[0];
                        }
                        iArr[c] = i;
                        objArr[1] = strArr7;
                        r18 = r19;
                    }
                } catch (Exception unused4) {
                }
                int i192 = ((int[]) objArr[c])[c];
                int i193 = i ^ r18;
                int i194 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i195 = (i194 ^ 85) + ((i194 & 85) << 1);
                int i196 = i195 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i196;
                int i197 = i195 % 2;
                int i198 = (i193 | (-i193)) >> 31;
                int i199 = (~i198) & i192;
                int i200 = r18 & i198;
                int i201 = (i200 & i199) | (i199 ^ i200);
                String[] strArr8 = (String[]) objArr[1];
                Object[] objArr13 = new Object[2];
                int i202 = ((i196 | 9) << 1) - (i196 ^ 9);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i202 % 128;
                int i203 = i202 % 2;
                int i204 = (i192 & i74) | ((~i192) & i);
                int i205 = -i204;
                int i206 = (((i204 & i205) | (i204 ^ i205)) >> 31) & 1;
                int i207 = -i206;
                int i208 = (~(((i207 & i206) | (i206 ^ i207)) >> 31)) & 1;
                int i209 = (i196 ^ 17) + ((i196 & 17) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i209 % 128;
                if (i209 % 2 == 0) {
                    objArr13[i206] = null;
                    objArr13[i208] = strArr8;
                    c2 = 0;
                    strArr = (String[]) objArr13[0];
                    objArr2 = new Object[4];
                    i6 = 1;
                } else {
                    c2 = 0;
                    i6 = 1;
                    objArr13[i206] = null;
                    objArr13[i208] = strArr8;
                    strArr = (String[]) objArr13[0];
                    objArr2 = new Object[4];
                }
                int[] iArr6 = new int[i6];
                objArr2[c2] = iArr6;
                int[] iArr7 = new int[i6];
                objArr2[i6] = iArr7;
                int[] iArr8 = new int[i6];
                objArr2[2] = iArr8;
                int i210 = ((~i201) & i) | (i201 & i74);
                int i211 = -i210;
                int i212 = ((i210 & i211) | (i210 ^ i211)) >> 31;
                int i213 = i196 + 87;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i213 % 128;
                if (i213 % 2 == 0) {
                    i7 = i212 & 118;
                    c3 = 0;
                    iArr7[0] = i;
                } else {
                    c3 = 0;
                    i7 = i212 & 16;
                    iArr6[0] = i;
                }
                iArr8[c3] = i201;
                objArr2[3] = strArr;
                int i214 = ~((-694044099) | i74);
                int i215 = ~(653733869 | i);
                int i216 = (-1663234392) + ((i214 | i215) * 1150) + (((~((-653733870) | i74)) | i215) * (-575)) + (((~((-694044099) | i)) | (~(694044098 | i74))) * 575);
                int i217 = (i2 - (~(((i216 | i7) << 1) - (i7 ^ i216)))) - 1;
                int i218 = i217 << 13;
                int i219 = ((~i217) & i218) | ((~i218) & i217);
                int i220 = i219 >>> 17;
                int i221 = (i219 | i220) & (~(i219 & i220));
                iArr7[0] = i221 ^ (i221 << 5);
                return objArr2;
            } catch (Throwable th5) {
                Throwable cause = th5.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r6, short r7, int r8) {
            /*
                int r8 = r8 * 2
                int r0 = r8 + 1
                int r6 = r6 * 56
                int r6 = r6 + 66
                byte[] r1 = com.google.android.gms.cloudmessaging.IMessengerCompat.Proxy.$$c
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L29
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L29:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.IMessengerCompat.Proxy.$$e(int, short, int):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class Impl extends Binder implements IMessengerCompat {
        private static short[] TuitionPaymentFragmentbindingInflater1;
        private static final byte[] $$c = {110, -73, -111, 99};
        private static final int $$f = 181;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {6, 51, 46, 31, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -1};
        private static final int $$e = 203;
        private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 106;
        private static int g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f769a = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2062526129;
        private static int b = -1934795581;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -928748680;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {23, 30, 2, 21, -1, 32, 30, 7, 23, 12, -16, -13, 77, 18, -41, 92, 13, 12, 11, 24, 0, 27, 12, 78, 82, 67, 94, 93, 74, 37, 120, 73, 68, 85, 89, 67, 81};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.google.android.gms.cloudmessaging.IMessengerCompat.Impl.$$a
                int r7 = r7 * 4
                int r7 = r7 + 84
                int r6 = r6 * 15
                int r6 = r6 + 38
                int r5 = r5 * 52
                int r5 = 108 - r5
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r5
                r4 = r6
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r5]
            L29:
                int r4 = -r4
                int r5 = r5 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.IMessengerCompat.Impl.c(byte, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.android.gms.cloudmessaging.IMessengerCompat.Impl.$$d
                int r9 = r9 * 47
                int r9 = 51 - r9
                int r7 = r7 * 47
                int r7 = r7 + 1
                int r8 = r8 + 98
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r8 = -r8
                int r9 = r9 + r8
                int r8 = r9 + 3
                int r9 = r3 + 1
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.IMessengerCompat.Impl.e(int, byte, int, java.lang.Object[]):void");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws Throwable {
            Object[] objArr;
            int i3 = 2 % 2;
            int i4 = g + 33;
            f769a = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            int i6 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                int i7 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(bArr[40], bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i7, capsMode, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d((ViewConfiguration.getScrollDefaultDelay() >> 16) - 1141454653, (-37) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (-163382697) - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1141454649, Color.red(0) - 38, (short) ((ViewConfiguration.getPressedStateDuration() >> 16) + 80), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) - 163382674, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                int longPressTimeout = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                Object[] objArr5 = new Object[1];
                c(b2, b2, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, longPressTimeout, jumpTapTimeout, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char longPressTimeout2 = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int i8 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    c(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout2, i8, modifierMetaStateMask, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i9 = ((int[]) objArr7[2])[0];
                int i10 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i9};
                int i11 = ~(System.identityHashCode(this) | 717352581);
                int i12 = 2033909970 + (((-987678878) | i11) * (-220)) + ((i11 | (-987754142)) * 220) + 2101175021;
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{new int[1], new int[]{i10}, iArr, strArr};
            } else {
                try {
                    Object[] objArr8 = {null, Integer.valueOf(i), 0, -1881471843};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[30];
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    e(b5, b6, b6, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b7 = (byte) (bArr3[30] - 1);
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    e(b7, b8, b8, objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (43043 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3110;
                        int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr11 = new Object[1];
                        c(b9, b10, b10, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i15, iLastIndexOf, 154975793, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        d(ExpandableListView.getPackedPositionChild(0L) - 1141454652, (-38) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (16 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-163382697) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        d(((byte) KeyEvent.getModifierMetaStateMask()) - 1141454648, View.MeasureSpec.makeMeasureSpec(0, 0) - 38, (short) (79 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-163382674) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mode = (char) (43042 - View.MeasureSpec.getMode(0));
                            int i16 = 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[5];
                            Object[] objArr14 = new Object[1];
                            c(b11, b11, bArr4[7], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, i16, keyRepeatDelay, -1269618118, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAlpha = (char) (43042 - Color.alpha(0));
                            int i17 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3110;
                            int iBlue = Color.blue(0) + 22;
                            byte[] bArr5 = $$a;
                            Object[] objArr15 = new Object[1];
                            c(bArr5[40], bArr5[5], bArr5[7], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, i17, iBlue, -1272852037, false, (String) objArr15[0], null);
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
            if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[1])[0];
                new int[1][0] = i19;
                new int[1][0] = i20;
                int i21 = i18 + 509742028 + ((~((~i) | (-16777353))) * 433) + (((~((-1381806967) | i)) | (-323224493)) * (-433)) + (((~(i | (-323224493))) | (-1398584319)) * 433);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                int[] iArr2 = {i23 ^ (i23 << 5)};
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            while (i6 < strArr2.length) {
                int i24 = g + 11;
                f769a = i24 % 128;
                if (i24 % 2 == 0) {
                    arrayList.add(strArr2[i6]);
                    i6 += 42;
                } else {
                    arrayList.add(strArr2[i6]);
                    i6++;
                }
            }
            throw null;
        }

        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int length;
            byte[] bArr;
            int i5 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int modifierMetaStateMask = 2266 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33;
                    byte length2 = (byte) $$c.length;
                    byte b3 = (byte) (length2 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, modifierMetaStateMask, keyRepeatTimeout, 1387473586, false, $$g(length2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                Object obj = null;
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                int i6 = iIntValue == -1 ? 1 : 0;
                if (i6 != 0) {
                    int i7 = $10 + 119;
                    int i8 = i7 % 128;
                    $11 = i8;
                    if (i7 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr2 != null) {
                        int i9 = i8 + 69;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                        }
                        for (int i10 = 0; i10 < length; i10++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3358 - (ViewConfiguration.getTapTimeout() >> 16), View.resolveSize(0, 0) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        int i11 = $11 + 27;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
                                int mirror = 'Q' - AndroidCharacter.getMirror('0');
                                byte length3 = (byte) $$c.length;
                                byte b6 = (byte) (length3 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maxKeyCode, iNormalizeMetaState, mirror, 1387473586, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i4 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) * ((int) (((long) b) ^ 3046761265686732006L));
                        } else {
                            byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                int iAxisFromString = MotionEvent.axisFromString("") + 2268;
                                int deadChar = 33 - KeyEvent.getDeadChar(0, 0);
                                byte length4 = (byte) $$c.length;
                                byte b7 = (byte) (length4 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, iAxisFromString, deadChar, 1387473586, false, $$g(length4, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i4 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L));
                        }
                        iIntValue = (byte) i4;
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i6;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b8 = (byte) 3;
                        byte b9 = (byte) (b8 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55904), 2855 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 13, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr5 != null) {
                        int length5 = bArr5.length;
                        byte[] bArr6 = new byte[length5];
                        int i12 = 0;
                        while (i12 < length5) {
                            int i13 = $10 + 119;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                bArr6[i12] = (byte) (((long) bArr5[i12]) ^ 3046761265686732006L);
                                i12 >>= 1;
                            } else {
                                bArr6[i12] = (byte) (((long) bArr5[i12]) ^ 3046761265686732006L);
                                i12++;
                            }
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i14 = $10 + 9;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentbindingInflater1;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            int i = 2 % 2;
            int i2 = g + 39;
            f769a = i2 % 128;
            int i3 = i2 % 2;
            throw null;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(Message message) throws RemoteException {
            int i = 2 % 2;
            int i2 = f769a + 125;
            g = i2 % 128;
            int i3 = i2 % 2;
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, byte r7, byte r8) {
            /*
                int r6 = 121 - r6
                int r8 = r8 * 4
                int r0 = r8 + 1
                byte[] r1 = com.google.android.gms.cloudmessaging.IMessengerCompat.Impl.$$c
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L21:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2b:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.IMessengerCompat.Impl.$$g(short, byte, byte):java.lang.String");
        }
    }
}
