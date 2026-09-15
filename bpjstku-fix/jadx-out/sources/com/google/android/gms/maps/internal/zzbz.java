package com.google.android.gms.maps.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbz extends com.google.android.gms.internal.maps.zza implements IStreetViewPanoramaViewDelegate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, 125, 2, 46, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 23, -17, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
    private static final int $$e = 148;
    private static final byte[] $$a = {97, 58, 103, -72, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 165;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -8883020284301721240L;

    zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    private static void a(int i, byte b2, byte b3, Object[] objArr) {
        int i2 = 98 - (i * 14);
        int i3 = 56 - (b3 * 52);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - b2];
        int i4 = 52 - b2;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 10;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 10;
                i3++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.maps.internal.zzbz.$$d
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r8 = r8 + 4
            int r6 = r6 * 11
            int r1 = 49 - r6
            byte[] r1 = new byte[r1]
            int r6 = 48 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + 3
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbz.d(int, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onDestroy() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzc(5, zza());
        int i4 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onLowMemory() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 35;
        } else {
            parcelZza = zza();
            i = 6;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onPause() throws RemoteException {
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzc(2, zza());
        } else {
            zzc(4, zza());
        }
        int i3 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onResume() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 4;
        } else {
            parcelZza = zza();
            i = 3;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStart() throws RemoteException {
        int i = 2 % 2;
        int i2 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzc(10, zza());
        int i4 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void getStreetViewPanoramaAsync(zzbt zzbtVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbtVar);
            i = 100;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbtVar);
            i = 9;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
        zzc(2, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final IObjectWrapper getView() throws RemoteException {
        Parcel parcelZzJ;
        IObjectWrapper iObjectWrapperAsInterface;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(37, zza());
            iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzJ.readStrongBinder());
        } else {
            parcelZzJ = zzJ(8, zza());
            iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
        IStreetViewPanoramaDelegate zzbxVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        b = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(1, zza());
        IBinder strongBinder = parcelZzJ.readStrongBinder();
        if (strongBinder == null) {
            zzbxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaDelegate) {
                IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate = (IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface;
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                b = i4 % 128;
                int i5 = i4 % 2;
                zzbxVar = iStreetViewPanoramaDelegate;
            } else {
                zzbxVar = new zzbx(strongBinder);
            }
        }
        parcelZzJ.recycle();
        return zzbxVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r1
  0x0034: PHI (r1v6 android.os.Parcel) = (r1v5 android.os.Parcel), (r1v9 android.os.Parcel) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel parcelZzJ;
        int i = 2 % 2;
        int i2 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
            parcelZzJ = zzJ(88, parcelZza);
            if (parcelZzJ.readInt() != 0) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                b = i3 % 128;
                int i4 = i3 % 2;
                bundle.readFromParcel(parcelZzJ);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                b = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza2, bundle);
            parcelZzJ = zzJ(7, parcelZza2);
            if (parcelZzJ.readInt() != 0) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                b = i7 % 128;
                int i8 = i7 % 2;
                bundle.readFromParcel(parcelZzJ);
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        parcelZzJ.recycle();
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 39;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - View.resolveSizeAndState(0, 0, 0)), 2624 - (ViewConfiguration.getTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), Drawable.resolveOpacity(0, 0) + 481, 37 - (ViewConfiguration.getTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 481 - ExpandableListView.getPackedPositionGroup(0L), 36 - MotionEvent.axisFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0235  */
    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStop() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, pressedStateDuration, packedPositionGroup, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{59410, 16812, 47989, 5394, 20184, 47215, 4657, 19338, 42388, 7993, 18615, 41659, 7238, 30205, 44969, 6473, 29454, 44273, 1645, 28735, 43460, 925}, (ViewConfiguration.getScrollBarSize() >> 8) + 43441, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{59414, 48632, 17372, 59830, 49052, 17813, 60285, 45424, 18222, 60685, 45849, 22762, 61134, 46245, 23220}, 21991 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
            int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
            int pressedStateDuration2 = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[80], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i4, pressedStateDuration2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                int iRed = Color.red(0) + 921;
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[7], (byte) (-bArr3[33]), bArr3[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, iRed, defaultSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyPid = Process.myPid();
            int i7 = (-403930261) + (((~((-558771463) | iMyPid)) | 4202756 | (~((-1215308182) | iMyPid))) * (-880));
            int i8 = (~((-558771463) | (~iMyPid))) | 1215308181;
            int i9 = ~(iMyPid | 558771462);
            int i10 = ((i7 + ((i8 | i9) * (-880))) + (i9 * 880)) - 1415849610;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            int i13 = b + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{59410, 8162, 2025, 4092, 14304, 16353, 10221, 12196, 22506, 24564, 18421, 20392, 30662, 32739, 26613, 28651, 38901, 40949, 34793, 36839, 47051, 49136, 42987, 45055, 55290, 57328}, MotionEvent.axisFromString("") + 63488, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{59408, 31347, 52459, 24414, 41410, 13396, 34489, 59649, 31659, 52766, 20621, 41757, 13676, 34787, 60001, 31937, 53068, 20952}, 37494 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{59417, 38729, 5811, 38403, 5425, 38104, 5168, 37728, 4812, 37486, 4526, 37091, 4164, 40856, 7916, 40523}, 32603 - (ViewConfiguration.getScrollBarSize() >> 8), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{59418, 64654, 49444, 54742, 47715, 36583, 37777, 30757, 19699, 20851, 9722, 2696, 7964, 58329, 51273, 56545}, 5274 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1415849610};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[35];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr13 = new Object[1];
                d(b5, b6, (byte) (-b6), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[35];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr14 = new Object[1];
                d(b7, b8, (byte) (b8 | 47), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (31532 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    a(bArr5[7], (byte) (-bArr5[33]), bArr5[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, packedPositionType, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{59410, 16812, 47989, 5394, 20184, 47215, 4657, 19338, 42388, 7993, 18615, 41659, 7238, 30205, 44969, 6473, 29454, 44273, 1645, 28735, 43460, 925}, 43440 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{59414, 48632, 17372, 59830, 49052, 17813, 60285, 45424, 18222, 60685, 45849, 22762, 61134, 46245, 23220}, 21991 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 31485);
                        int i17 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int minimumFlingVelocity2 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[7];
                        Object[] objArr19 = new Object[1];
                        a(b9, bArr6[80], b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, i17, minimumFlingVelocity2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                        int edgeSlop = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[80];
                        Object[] objArr20 = new Object[1];
                        a(b10, (byte) (b10 | 52), bArr7[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, edgeSlop, iMakeMeasureSpec, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iNextInt = new Random().nextInt();
        int i19 = ~((-942145) | iNextInt);
        int i20 = ~iNextInt;
        int i21 = i18 + 1708380563 + ((i19 | (~((-1075873796) | i20))) * 920) + (((~((-697263705) | i20)) | 942144) * 920) + (((~(iNextInt | (-1075873796))) | (~((-942145) | i20)) | (~((-696321561) | iNextInt))) * 920);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        Object obj = objArr21[0];
        ((int[]) obj)[0] = i23 ^ (i23 << 5);
        int i24 = ((int[]) obj)[0];
        int i25 = i24 * i24;
        int i26 = -(1500323395 * i24);
        int i27 = (((i25 ^ i26) + ((i25 & i26) << 1)) - (~(-(i24 * (-2021035031))))) - 1;
        int i28 = ((i27 | (-1878946332)) << 1) - ((-1878946332) ^ i27);
        int i29 = (i28 - (~((((i28 >> 21) - 4095) / 2048) + 1))) - 1;
        int i30 = i28 >> 26;
        int i31 = ((i30 ^ ComposerKt.defaultsKey) + ((i30 & ComposerKt.defaultsKey) << 1)) / 64;
        int i32 = -(i29 ^ ((i31 ^ 1) + ((i31 & 1) << 1)));
        int i33 = (i32 & 7) + (i32 | 7);
        int i34 = i33 >> 24;
        int i35 = ((i34 ^ (-511)) + ((i34 & (-511)) << 1)) / 256;
        int i36 = ((i35 | 1) << 1) - (i35 ^ 1);
        zzc(153923 / (((-((i36 & 1) + (i36 | 1))) & i33) * 1999), parcelZza);
    }
}
