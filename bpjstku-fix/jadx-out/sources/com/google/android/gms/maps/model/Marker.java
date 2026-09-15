package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class Marker {
    private static short[] b;
    protected final com.google.android.gms.internal.maps.zzaj zza;
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, 40, 23, -13, -15, -18, 11, -21, -7, -5, -7, -29, 5, 23, -56, 7, -32, 12, -11, -20, -3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 57};
    private static final int $$e = 96;
    private static final byte[] $$a = {81, -102, -70, -91, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 67;
    private static int asInterface = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -81694475;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795571;
    private static int TuitionPaymentFragmentbindingInflater1 = 1452619275;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {13, -22, -114, -9, -51, -96, -22, -123, -11, -68, -48, -47, ByteCompanionObject.MAX_VALUE, -2, 53, -84, -65, -68, -71, -24, ByteCompanionObject.MIN_VALUE, -23, 2, -91, 17, -96, 21, 22, -39, 14, -85, -38, -81, 30, 10, -96, 18, 9, -55, 98, -103, -48, -6, -127, -53, -47, -103, -45, -101, -57, -88, -7, 36, -42, -43, -39, -112, 97, 96, 99, -44, -100, -45, 1, -66, 87, -124, 34, -65, -69, -68, -67, 81, 110, -116, 87, 72, -126, 81, -68, 35, 3, -28, Base64.padSymbol, -19, 54, -54, -55, 43, 53, -31, 57, -14, 33, 7, 25, 59, 3, 18, 46, -9, 120, 46, 1, 58, 84, 30, 8, 46, 29, 10, 18, 88, -13, 55, -29, 91, 39, 1, -13, -2, 22, 55, -3, 91, 18, 12, 47, -18, 3, 37, -31, -2, 1, 91, -2, -18, 88, 12, 38, 39, -1, 38, 20, 15, 39, 88, 23, 52, 37, -18, 10, 21, 34, 10, 39, 37, 23, 14, 88, -3, 37, 11, -13, 39, 55, -18, 39, 0, 34, 23, 91, 36, 39, -6, 36, 50, -13, 46, 92, -107, 51, 80, -110, 81, 47, 101, 101, ByteCompanionObject.MIN_VALUE, 55, 94, -116, 40, 92, 94, 101, 99, 95, -114, 95, 33, 94, -113, 98, 47, 81, 98, -127, 55, 95, 101, 94, 92, -104, -115, 52, ByteCompanionObject.MIN_VALUE, 50, -114, 53, 80, 80, 99, 81, 95, 100, -108, 42, -109, 81, 32, -120, 95, 52, -117, 51, 91, -104, ByteCompanionObject.MIN_VALUE, 81, 100};

    public Marker(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza = (com.google.android.gms.internal.maps.zzaj) Preconditions.checkNotNull(zzajVar);
    }

    private static void a(int i, int i2, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = i2 * 52;
        int i4 = 98 - (b2 * 14);
        int i5 = (i * 52) + 4;
        byte[] bArr2 = new byte[53 - i3];
        int i6 = 52 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i4 = (i4 + i6) - 11;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5++;
                i4 = (i4 + bArr[i5]) - 11;
            }
        }
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
    private static void e(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.google.android.gms.maps.model.Marker.$$d
            int r6 = r6 * 21
            int r6 = r6 + 84
            int r7 = r7 * 35
            int r1 = r7 + 18
            byte[] r1 = new byte[r1]
            int r7 = r7 + 17
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Marker.e(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return r5.zza.zzE(((com.google.android.gms.maps.model.Marker) r6).zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw new com.google.android.gms.maps.model.RuntimeRemoteException(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r2 = r2 + 27;
        com.google.android.gms.maps.model.Marker.d = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r6 instanceof com.google.android.gms.maps.model.Marker) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r6 instanceof com.google.android.gms.maps.model.Marker)) != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.maps.model.Marker.d
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.google.android.gms.maps.model.Marker.asInterface = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L17
            boolean r1 = r6 instanceof com.google.android.gms.maps.model.Marker
            r4 = 15
            int r4 = r4 / r3
            if (r1 != 0) goto L1d
            goto L2f
        L17:
            boolean r1 = r6 instanceof com.google.android.gms.maps.model.Marker
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == r4) goto L2f
        L1d:
            com.google.android.gms.internal.maps.zzaj r0 = r5.zza     // Catch: android.os.RemoteException -> L28
            com.google.android.gms.maps.model.Marker r6 = (com.google.android.gms.maps.model.Marker) r6     // Catch: android.os.RemoteException -> L28
            com.google.android.gms.internal.maps.zzaj r6 = r6.zza     // Catch: android.os.RemoteException -> L28
            boolean r6 = r0.zzE(r6)     // Catch: android.os.RemoteException -> L28
            return r6
        L28:
            r6 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r0.<init>(r6)
            throw r0
        L2f:
            int r2 = r2 + 27
            int r6 = r2 % 128
            com.google.android.gms.maps.model.Marker.d = r6
            int r2 = r2 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Marker.equals(java.lang.Object):boolean");
    }

    public float getAlpha() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            float fZzd = this.zza.zzd();
            int i4 = d + 65;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return fZzd;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public String getId() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strZzk = this.zza.zzk();
            int i4 = asInterface + 49;
            d = i4 % 128;
            int i5 = i4 % 2;
            return strZzk;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public LatLng getPosition() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            LatLng latLngZzj = this.zza.zzj();
            int i4 = d + 79;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return latLngZzj;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public float getRotation() {
        int i = 2 % 2;
        int i2 = d + 53;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return this.zza.zze();
            }
            this.zza.zze();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public String getSnippet() {
        String strZzl;
        int i = 2 % 2;
        int i2 = asInterface + 83;
        d = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                strZzl = this.zza.zzl();
                int i3 = 28 / 0;
            } else {
                strZzl = this.zza.zzl();
            }
            int i4 = asInterface + 121;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return strZzl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public Object getTag() {
        Object objUnwrap;
        int i = 2 % 2;
        int i2 = d + 69;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                objUnwrap = ObjectWrapper.unwrap(this.zza.zzi());
                int i3 = 7 / 0;
            } else {
                objUnwrap = ObjectWrapper.unwrap(this.zza.zzi());
            }
            int i4 = asInterface + 53;
            d = i4 % 128;
            int i5 = i4 % 2;
            return objUnwrap;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = d + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strZzm = this.zza.zzm();
            int i4 = d + 17;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return strZzm;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public float getZIndex() {
        int i = 2 % 2;
        int i2 = d + 103;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzf();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float fZzf = this.zza.zzf();
            int i3 = d + 65;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return fZzf;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = d + 63;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzg();
                throw null;
            }
            int iZzg = this.zza.zzg();
            int i3 = d + 125;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return iZzg;
            }
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[PHI: r4
  0x0083: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v19 byte[]) binds: [B:20:0x0081, B:17:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:3:0x000f, B:6:0x002a, B:7:0x0056, B:32:0x00f1, B:34:0x0108, B:35:0x0141, B:24:0x008b, B:26:0x009c, B:27:0x00d0, B:49:0x01b5, B:51:0x01d2, B:52:0x021b), top: B:83:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x01ad A[PHI: r0
  0x01ad: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:45:0x01ab, B:42:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x01af A[PHI: r0
  0x01af: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:45:0x01ab, B:42:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0263  */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        byte[] bArr;
        int length;
        byte[] bArr2;
        int i6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0), Drawable.resolveOpacity(0, 0) + 2267, 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            float f = 0.0f;
            if (z2) {
                int i8 = $10 + 27;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i9 = 86 / 0;
                    if (bArr != null) {
                        length = bArr.length;
                        bArr2 = new byte[length];
                        i6 = 0;
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                                int defaultSize = View.getDefaultSize(0, 0) + 3358;
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 18;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, defaultSize, iNormalizeMetaState, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).byteValue();
                            i6++;
                            f = 0.0f;
                        }
                        bArr = bArr2;
                    }
                } else {
                    bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr != null) {
                        length = bArr.length;
                        bArr2 = new byte[length];
                        i6 = 0;
                        while (i6 < length) {
                            Object[] objArr4 = {Integer.valueOf(bArr[i6])};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c2 = (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1));
                                int defaultSize2 = View.getDefaultSize(0, 0) + 3358;
                                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 18;
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, defaultSize2, iNormalizeMetaState2, -1054011043, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).byteValue();
                            i6++;
                            f = 0.0f;
                        }
                        bArr = bArr2;
                    }
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2267 - Color.green(0), (ViewConfiguration.getScrollBarSize() >> 8) + 33, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i10 = $11 + 107;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i4 = ((i3 >>> iIntValue) << 4) / ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) + 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 2854 - Process.getGidForName(""), 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr4 != null) {
                    int i11 = $11 + 123;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i13 = 0; i13 < length4; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $10 + 71;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i15 = $11 + 27;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = b;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i18 = $10 + 103;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
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

    public void setPosition(LatLng latLng) {
        int i = 2 % 2;
        int i2 = d + 49;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        int i5 = i3 + 81;
        d = i5 % 128;
        int i6 = i5 % 2;
        try {
            this.zza.zzw(latLng);
            int i7 = asInterface + 67;
            d = i7 % 128;
            int i8 = i7 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void hideInfoWindow() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        try {
            com.google.android.gms.internal.maps.zzaj zzajVar = this.zza;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                int iAlpha = 625 - Color.alpha(0);
                int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (-bArr[5]), b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iAlpha, i2, -477065106, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(633836916 - TextUtils.indexOf("", ""), (-44) - View.getDefaultSize(0, 0), (short) (70 - MotionEvent.axisFromString("")), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 91), TextUtils.getOffsetBefore("", 0) - 2005675027, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((ViewConfiguration.getScrollDefaultDelay() >> 16) + 633836920, (-44) - TextUtils.indexOf("", "", 0), (short) (View.MeasureSpec.getMode(0) - 28), (byte) (Color.argb(0, 0, 0, 0) - 33), (-2005675005) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 626;
                int i4 = 14 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, b3, (byte) (-bArr2[5]), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i3, i4, -976899241, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                    int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
                    int iBlue = Color.blue(0) + 14;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    Object[] objArr6 = new Object[1];
                    a((byte) (-b4), bArr3[7], (byte) (-b4), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, i5, iBlue, -973632554, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[0])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i6};
                int[] iArr2 = {i7};
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = (-5767740) + (((~((-112127478) | iIdentityHashCode)) | (-1711610644)) * (-318));
                int i9 = ~((-1711610644) | iIdentityHashCode);
                int i10 = ~iIdentityHashCode;
                int i11 = i8 + ((i9 | (~(1722810359 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | 1722810359)) | (~((-1610682883) | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 247305579;
                int i12 = (i11 << 13) ^ i11;
                int i13 = i12 ^ (i12 >>> 17);
                ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
                objArr = new Object[]{iArr2, new int[1], iArr, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c((ViewConfiguration.getFadingEdgeLength() >> 16) + 633836916, Color.green(0) - 44, (short) ((-89) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 42), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 2005674990, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(633836918 - ExpandableListView.getPackedPositionType(0L), (-44) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (120 - Color.alpha(0)), (byte) (47 - (ViewConfiguration.getTapTimeout() >> 16)), View.MeasureSpec.getSize(0) - 2005674964, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i14 = asInterface + 67;
                    d = i14 % 128;
                    if (i14 % 2 == 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(633836924 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollBarSize() >> 8) - 44, (short) (View.MeasureSpec.getMode(0) + 16), (byte) (MotionEvent.axisFromString("") + 27), (-2005674945) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 633836924, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 44, (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 92), (byte) (View.MeasureSpec.getSize(0) - 103), (ViewConfiguration.getTapTimeout() >> 16) - 2005674930, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr12 = new Object[1];
                c(View.resolveSize(0, 0) + 633836869, MotionEvent.axisFromString("") - 43, (short) (Process.getGidForName("") + 20), (byte) ((-44) - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.indexOf("", "", 0) - 2005674914, objArr12);
                Object[] objArr13 = new Object[1];
                c(633836918 - (Process.myTid() >> 22), KeyEvent.normalizeMetaState(0) - 44, (short) (TextUtils.indexOf("", "", 0, 0) - 30), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 102), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 2005674850, objArr13);
                try {
                    Object[] objArr14 = {applicationContext, new String[]{(String) objArr12[0], (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 247305579};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[24];
                    Object[] objArr15 = new Object[1];
                    e(b5, (byte) (b5 - 1), bArr4[54], objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    byte b6 = bArr4[24];
                    Object[] objArr16 = new Object[1];
                    e((byte) (b6 - 1), b6, (byte) (-bArr4[25]), objArr16);
                    Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i15 = ((int[]) objArr17[0])[0];
                    int i16 = ((int[]) objArr17[2])[0];
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMyTid = (char) (37567 - (Process.myTid() >> 22));
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
                            int i17 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[5];
                            Object[] objArr18 = new Object[1];
                            a((byte) (-b7), bArr5[7], (byte) (-b7), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, maximumDrawingCacheSize, i17, -973632554, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                        try {
                            Object[] objArr19 = new Object[1];
                            c(633836916 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-44) - View.getDefaultSize(0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 72), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 90), (-2005675026) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr19);
                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            c(633836920 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) - 44, (short) ((-27) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) - 32), Process.getGidForName("") - 2005675004, objArr20);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0, 0));
                                int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int iIndexOf = 13 - TextUtils.indexOf((CharSequence) "", '0');
                                byte[] bArr6 = $$a;
                                byte b8 = bArr6[7];
                                Object[] objArr21 = new Object[1];
                                a(b8, b8, (byte) (-bArr6[5]), objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, jumpTapTimeout, iIndexOf, -976899241, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 37519);
                                int iIndexOf2 = 625 - TextUtils.indexOf("", "");
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                                byte[] bArr7 = $$a;
                                byte b9 = bArr7[7];
                                Object[] objArr22 = new Object[1];
                                a(b9, (byte) (-bArr7[5]), b9, objArr22);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iIndexOf2, longPressTimeout, -477065106, false, (String) objArr22[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr17;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[2])[0];
            if (i19 != i18) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[3];
                if (strArr2 != null) {
                    int i20 = asInterface + 87;
                    d = i20 % 128;
                    for (int i21 = i20 % 2 != 0 ? 0 : 1; i21 < strArr2.length; i21++) {
                        arrayList.add(strArr2[i21]);
                    }
                }
                throw new RuntimeException(String.valueOf(i19));
            }
            int i22 = asInterface + 67;
            d = i22 % 128;
            int i23 = i22 % 2;
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int i27 = ~((int) Process.getStartElapsedRealtime());
            int i28 = i24 + (-1120101456) + ((~(1802438655 | i27)) * 52) + (((~(692388635 | i27)) | (~((-1131349486) | i27)) | 1110050020) * (-52)) + (((~(i27 | (-692388636))) | 671089170) * 52);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
            Object[] objArr23 = {new int[]{i26}, new int[1], new int[]{i25}, strArr3};
            zzajVar.zzn();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean isDraggable() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        d = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return this.zza.zzF();
            }
            this.zza.zzF();
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean isFlat() {
        int i = 2 % 2;
        int i2 = d + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zZzG = this.zza.zzG();
            int i4 = asInterface + 3;
            d = i4 % 128;
            int i5 = i4 % 2;
            return zZzG;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean isInfoWindowShown() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zZzH = this.zza.zzH();
            int i4 = asInterface + 33;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return zZzH;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean isVisible() {
        boolean zZzI;
        int i = 2 % 2;
        int i2 = d + 31;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                zZzI = this.zza.zzI();
                int i3 = 99 / 0;
            } else {
                zZzI = this.zza.zzI();
            }
            int i4 = d + 67;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return zZzI;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void remove() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzo();
            int i4 = asInterface + 7;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setAlpha(float f) {
        int i = 2 % 2;
        int i2 = d + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzp(f);
            int i4 = d + 103;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setAnchor(float f, float f2) {
        int i = 2 % 2;
        int i2 = d + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzq(f, f2);
            int i4 = d + 59;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setDraggable(boolean z) {
        int i = 2 % 2;
        int i2 = d + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzr(z);
            int i4 = asInterface + 63;
            d = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setFlat(boolean z) {
        int i = 2 % 2;
        int i2 = d + 47;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzs(z);
                int i3 = 99 / 0;
            } else {
                this.zza.zzs(z);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setInfoWindowAnchor(float f, float f2) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        d = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.zza.zzv(f, f2);
                int i3 = 14 / 0;
            } else {
                this.zza.zzv(f, f2);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setRotation(float f) {
        int i = 2 % 2;
        int i2 = d + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzx(f);
            int i4 = d + 77;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setSnippet(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzy(str);
            int i4 = asInterface + 13;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setTag(Object obj) {
        int i = 2 % 2;
        int i2 = d + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzz(ObjectWrapper.wrap(obj));
            int i4 = asInterface + 113;
            d = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setTitle(String str) {
        int i = 2 % 2;
        int i2 = d + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzA(str);
            int i4 = d + 75;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setVisible(boolean z) {
        int i = 2 % 2;
        int i2 = d + 101;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzB(z);
                int i3 = 37 / 0;
            } else {
                this.zza.zzB(z);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setZIndex(float f) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzC(f);
            int i4 = d + 19;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void showInfoWindow() {
        int i = 2 % 2;
        int i2 = d + 47;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzD();
                throw null;
            }
            this.zza.zzD();
            int i3 = asInterface + 69;
            d = i3 % 128;
            int i4 = i3 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        try {
            if (bitmapDescriptor == null) {
                this.zza.zzt(null);
                int i3 = d + 21;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 47 / 0;
                    return;
                }
                return;
            }
            this.zza.zzt(bitmapDescriptor.zza());
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, short r9) {
        /*
            byte[] r0 = com.google.android.gms.maps.model.Marker.$$c
            int r8 = r8 + 117
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Marker.$$g(int, short, short):java.lang.String");
    }
}
