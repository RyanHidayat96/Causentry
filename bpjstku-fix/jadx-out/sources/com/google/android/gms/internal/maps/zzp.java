package com.google.android.gms.internal.maps;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zzp extends zza implements zzr {
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$f = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {110, -73, -111, 99, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 22;
    private static final byte[] $$a = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 153;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {57189, 57191, 60060, 57186, 60053, 60063, 57193, 57188, 60117, 60049, 60058, 60079, 60040, 60083, 60052, 60047, 60046, 60055, 60045, 57184, 60043, 60090, 60051, 60048, 60088, 60072, 60073, 57190, 57187, 60056, 57192, 60054, 60041, 60062, 60050, 60034};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57191;

    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureDelegate");
    }

    private static void a(int i, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (b2 * 2) + 84;
        int i3 = b3 + 4;
        int i4 = i * 15;
        byte[] bArr2 = new byte[53 - i4];
        int i5 = 52 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 11;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i8])) - 11;
            i3 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.maps.zzp.$$d
            int r7 = r7 * 52
            int r1 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 80
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-11)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzp.d(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzd() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(1, zza());
        int i4 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zze() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(4, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zzf() throws RemoteException {
        Parcel parcelZzJ;
        String string;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(4, zza());
            string = parcelZzJ.readString();
        } else {
            parcelZzJ = zzJ(2, zza());
            string = parcelZzJ.readString();
        }
        parcelZzJ.recycle();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x017f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0198  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e3 A[Catch: all -> 0x03c7, TryCatch #0 {all -> 0x03c7, blocks: (B:9:0x002a, B:11:0x0038, B:12:0x0069, B:15:0x007c, B:17:0x008d, B:18:0x00c4, B:23:0x00de, B:25:0x00f1, B:26:0x0127, B:44:0x019a, B:46:0x01e3, B:48:0x0260), top: B:78:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x025e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0273  */
    /* JADX WARN: Code duplicated, block: B:54:0x02af A[Catch: all -> 0x0338, TryCatch #1 {all -> 0x0338, blocks: (B:52:0x0275, B:54:0x02af, B:55:0x0317), top: B:80:0x0275 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0341  */
    /* JADX WARN: Code duplicated, block: B:64:0x0348  */
    /* JADX WARN: Code duplicated, block: B:66:0x037b  */
    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i4 = 2;
        int i5 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i6 = 1770390596;
        Object obj2 = null;
        int i7 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 121;
                $10 = i9 % 128;
                if (i9 % i4 != 0) {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) i7;
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267, 33 - TextUtils.indexOf("", "", 0, 0), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i8 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    i8++;
                }
                i4 = 2;
                i6 = 1770390596;
                i7 = -1;
            }
            cArr2 = cArr3;
        }
        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            byte b7 = (byte) (-1);
            byte b8 = (byte) (b7 + 1);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 2268, 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr5)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $11 + 3;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                        i3 = 2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b9 = (byte) (-1);
                            byte b10 = (byte) (-b9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3261, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, -127612708, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            try {
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b11 = (byte) (-1);
                                    byte b12 = (byte) (b11 + 4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 22878), 593 - TextUtils.lastIndexOf("", '0', 0), (-16777199) - Color.rgb(0, 0, 0), 1570859318, false, $$g(b11, b12, (byte) (b12 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i12 = $11 + 99;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                            } else {
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                int i18 = $11 + 39;
                                $10 = i18 % 128;
                                i3 = 2;
                                int i19 = i18 % 2;
                            }
                        }
                        i3 = 2;
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                        i3 = 2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b13 = (byte) (-1);
                            byte b14 = (byte) (-b13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3261, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, -127612708, false, $$g(b13, b14, (byte) (b14 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr7 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b15 = (byte) (-1);
                                byte b16 = (byte) (b15 + 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 22878), 593 - TextUtils.lastIndexOf("", '0', 0), (-16777199) - Color.rgb(0, 0, 0), 1570859318, false, $$g(b15, b16, (byte) (b16 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr7)).intValue();
                            int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i111 = $11 + 99;
                                $10 = i111 % 128;
                                int i112 = i111 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                            } else {
                                int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i115];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i116];
                                int i117 = $11 + 39;
                                $10 = i117 % 128;
                                i3 = 2;
                                int i118 = i117 % 2;
                            }
                        }
                        i3 = 2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            int i21 = $10 + 61;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final String zzg() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int threadPriority = 2267 - ((Process.getThreadPriority(0) + 20) >> 6);
            int i4 = 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, threadPriority, i4, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{16, '\n', 2, '#', 16, ' ', 2, 11, 15, '\r', 7, 26, 30, 17, 21, 3, 30, 25, '\f', 15, '#', 29}, (byte) (TextUtils.getCapsMode("", 0, 0) + 71), View.resolveSize(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{'#', 15, '\b', 22, 15, 30, 2, 29, Typography.quote, '\t', '\f', 16, '#', ' ', 13932}, (byte) (108 - TextUtils.lastIndexOf("", '0', 0)), 15 - TextUtils.getOffsetAfter("", 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
            int maximumDrawingCacheSize = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, (byte) (b4 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, capsMode, maximumDrawingCacheSize, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[5];
                byte b6 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 103), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, modifierMetaStateMask, i7, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[0])[0];
            int i9 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int i10 = ~System.identityHashCode(this);
            int i11 = 1837175811 + (((~(i10 | 693602883)) | (-803207780)) * (-160)) + (((~(i10 | (-115110433))) | 693602883) * 160) + 113075608;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{16, '\n', 2, '#', 16, ' ', 2, 11, '\b', 22, 26, 14, 23, 27, 16, '!', 22, 30, 17, '!', '\n', 23, '!', Typography.quote, 11, 4}, (byte) (-TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{28, 17, 13900, 13900, Typography.quote, 3, 21, 27, 13902, 13902, 16, '#', 28, 11, 16, '!', 16, 2}, (byte) (99 - TextUtils.lastIndexOf("", '0', 0, 0)), 17 - ExpandableListView.getPackedPositionChild(0L), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{'\n', 11, 22, 6, 11, 14, 16, '\n', '\b', 14, 29, 31, '\r', 16, Typography.quote, ' '}, (byte) (TextUtils.indexOf("", "", 0, 0) + 44), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{'#', 4, Typography.quote, 3, 16, '!', 17, '!', 16, 7, 16, 18, 26, '\f', 3, '#'}, (byte) (View.resolveSize(0, 0) + 52), 16 - View.MeasureSpec.getMode(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i14 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 113075608};
                byte[] bArr3 = $$d;
                byte b7 = bArr3[7];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr3[7];
                byte b10 = bArr3[5];
                Object[] objArr14 = new Object[1];
                d(b9, b10, b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iBlue = 2267 - Color.blue(0);
                        int i16 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[5];
                        byte b12 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b11, b12, (byte) (b12 | 103), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize2, iBlue, i16, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{16, '\n', 2, '#', 16, ' ', 2, 11, 15, '\r', 7, 26, 30, 17, 21, 3, 30, 25, '\f', 15, '#', 29}, (byte) (70 - MotionEvent.axisFromString("")), 22 - View.combineMeasuredStates(0, 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{'#', 15, '\b', 22, 15, 30, 2, 29, Typography.quote, '\t', '\f', 16, '#', ' ', 13932}, (byte) (View.MeasureSpec.getMode(0) + 109), View.MeasureSpec.getSize(0) + 15, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int iAxisFromString = MotionEvent.axisFromString("") + 2268;
                            int i17 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr19 = new Object[1];
                            a(b13, b14, (byte) (b14 | 51), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, iAxisFromString, i17, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int iRgb = Color.rgb(0, 0, 0) + 16779483;
                            int iIndexOf = 33 - TextUtils.indexOf("", "", 0, 0);
                            byte[] bArr5 = $$a;
                            byte b15 = bArr5[7];
                            Object[] objArr20 = new Object[1];
                            a(b15, b15, bArr5[132], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, iRgb, iIndexOf, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                int i18 = TuitionPaymentFragmentbindingInflater1 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                for (int i19 = i18 % 2 == 0 ? 0 : 1; i19 < strArr2.length; i19++) {
                    arrayList.add(strArr2[i19]);
                }
            }
            throw null;
        }
        int i20 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
        int i21 = i20 % 2;
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iMyTid = Process.myTid();
        int i25 = ~iMyTid;
        int i26 = i22 + 1462847139 + ((100835649 | i25) * (-192)) + (((~((-435772067) | i25)) | 272105600) * (-384)) + (((~(iMyTid | 536607715)) | (~(i25 | (-163666467))) | (~((-272105601) | iMyTid))) * DerHeader.TAG_CLASS_PRIVATE);
        int i27 = i26 ^ (i26 << 13);
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr21[2])[0] = i28 ^ (i28 << 5);
        Parcel parcelZza = zza();
        int i29 = ((int[]) objArr21[2])[0];
        int i30 = ((((i29 * i29) - (~(-(2029891028 * i29)))) - 1) - (~(-(i29 * (-1840742722))))) - 1;
        int i31 = (i30 & 1021747409) + (1021747409 | i30);
        int i32 = i31 >> 22;
        int i33 = i32 | (-2047);
        int i34 = ((i33 << 1) - (i32 ^ (-2047))) / 1024;
        int i35 = ((i32 & (-2047)) + i33) / 1024;
        int i36 = -(((i31 - (~((i34 & 1) + (i34 | 1)))) - 1) ^ ((i35 & 1) + (i35 | 1)));
        int i37 = (i36 & 7) + (i36 | 7);
        int i38 = ((i37 >> 25) - 255) / 128;
        Parcel parcelZzJ = zzJ(28224 / (((-(((i38 ^ 1) + ((i38 & 1) << 1)) + 1)) & i37) * 1344), parcelZza);
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final Map zzh() throws RemoteException {
        Parcel parcelZzJ;
        HashMap mapZzc;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(2, zza());
            mapZzc = zzc.zzc(parcelZzJ);
        } else {
            parcelZzJ = zzJ(5, zza());
            mapZzc = zzc.zzc(parcelZzJ);
        }
        parcelZzJ.recycle();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return mapZzc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, int r7) {
        /*
            int r5 = r5 + 4
            byte[] r0 = com.google.android.gms.internal.maps.zzp.$$c
            int r6 = r6 + 113
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L12
            r3 = r2
            r2 = r5
            goto L2b
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            int r6 = r6 + 1
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L25:
            r3 = r0[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2b:
            int r6 = -r6
            int r5 = r5 + r6
            r6 = r2
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzp.$$g(byte, short, int):java.lang.String");
    }
}
