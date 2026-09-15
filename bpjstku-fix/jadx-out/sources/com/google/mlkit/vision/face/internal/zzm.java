package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageConvertUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class zzm implements zzb {
    private boolean zza;
    private final Context zzb;
    private final FaceDetectorOptions zzc;
    private final int zzd;
    private final zzoc zze;
    private com.google.android.gms.internal.mlkit_vision_face.zzj zzf;
    private com.google.android.gms.internal.mlkit_vision_face.zzj zzg;
    private static final byte[] $$c = {109, 84, -87, -114};
    private static final int $$f = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -17, 90, 37, 16, 2, -59, 56, 18, -2, 13, 5, -5, 14, -67, 70, 6, -9, 18, -10, 13, 10, -15, 23, -7, 10, 3, -60, 57, 16, 2, 7, 3, 8, -10, -51, 60, 3, 0, 23, 5, 1, -9, -51, 73, -12, 9, 11, 1, -7, 21, 5, -7, 5, 11, -62, 73, -12, 19, -9, 4, 13, -60, 41, 20, 9, 11, 1, -7, 21, -38, 37, 14, 5, -1, 7, 11, -34, 20, 19, -9, 4, 13, -31, 45, -76, 51, 20, 9, 11, 1, -7, 21, 5, -7, 5, 11, -36, 37, 14, 5, -1, 7, 11, -34, 20, 19, -9, 4, 13, -70, 21, -13, 73, 9, 12, -3, 0, -2, -61, 76, -7, 16, -7, 6, 1, -57, 19, -11, 76, -7, 16, -7, 6, 1, -57, 18, -10, 76, -7, 16, -7, 6, 1, -57, 17, -9, 4, 73, 9, 2, 1, 9, -5, 3, -60, 73, 15, -11, 12, 10, -75, 68, 5, 5, -1, 24, -5, 12, -76, 19, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -61};
    private static final int $$e = 25;
    private static final byte[] $$a = {46, 126, -84, 108, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 107;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static char[] b = {47551, 11405, 37824, 1563, 60741, 21382, 50900, 44379, 4185, 34440, 28050, 53266, 18299, 11700, 37116, 1832, 60003, 20624, 51192, 43574, 4473, 34740, 15266, 44694, 4572, 33792, 28480, 53651, 17613, 12094, 37450, 1155, 61385, 21036, 50546, 44979, 4852, 45558, 9408, 39824, 3658, 58694, 23489, 52883, 42329, 6163, 36503, 26029, 55418, 20275, 9713, 39087, 3938, 45557, 9413, 39811, 3653, 58652, 23492, 52870, 42318, 6204, 36568, 25997, 55403, 20227, 9706, 39086, 3946};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3334864068416625503L;

    zzm(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.zzb = context;
        this.zzc = faceDetectorOptions;
        this.zzd = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.zze = zzocVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 11 - r8
            int r6 = r6 * 3
            int r6 = r6 + 97
            byte[] r1 = com.google.mlkit.vision.face.internal.zzm.$$a
            int r7 = r7 * 10
            int r7 = 13 - r7
            byte[] r0 = new byte[r0]
            int r8 = 10 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r6 = r6 + r7
            int r6 = r6 + (-5)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.zzm.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 115
            int r0 = 168 - r8
            byte[] r1 = com.google.mlkit.vision.face.internal.zzm.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r8 = 167 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L31
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L31:
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.zzm.d(byte, int, byte, java.lang.Object[]):void");
    }

    static int zzc(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 119;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
        if (i3 % 2 == 0) {
            if (i == 1) {
                return 0;
            }
        } else if (i == 1) {
            return 0;
        }
        int i5 = i4 + 1;
        int i6 = i5 % 128;
        TuitionPaymentFragmentbindingInflater1 = i6;
        int i7 = i5 % 2;
        if (i != 2) {
            StringBuilder sb = new StringBuilder("Invalid classification type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i8 = i6 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
        return 1;
    }

    static int zze(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            if (i == 1) {
                return 0;
            }
        } else if (i == 1) {
            return 0;
        }
        if (i != 2) {
            StringBuilder sb = new StringBuilder("Invalid landmark type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return 1;
    }

    private static int zzf(int i) {
        int i2 = 2 % 2;
        if (i == 1) {
            return 0;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 1;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        if (i != 2) {
            StringBuilder sb = new StringBuilder("Invalid mode type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i6 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c3 A[LOOP:0: B:15:0x00c1->B:16:0x00c3, LOOP_END] */
    private final List zzg(com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar, InputImage inputImage) throws MlKitException {
        com.google.android.gms.internal.mlkit_vision_face.zzf[] zzfVarArrZze;
        ArrayList arrayList;
        int i = 2 % 2;
        try {
            zzp zzpVar = new zzp(inputImage.getWidth(), inputImage.getHeight(), 0, SystemClock.elapsedRealtime(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()));
            if (inputImage.getFormat() == 35) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                int i3 = i2 % 128;
                TuitionPaymentFragmentbindingInflater1 = i3;
                int i4 = i2 % 2;
                try {
                    if (this.zzd >= 201500000) {
                        int i5 = i3 + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                        int i6 = i5 % 2;
                        Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes());
                        zzfVarArrZze = zzjVar.zzf(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
                    }
                    arrayList = new ArrayList();
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    int i8 = i7 % 2;
                    for (com.google.android.gms.internal.mlkit_vision_face.zzf zzfVar : zzfVarArrZze) {
                        arrayList.add(new Face(zzfVar, inputImage.getCoordinatesMatrix()));
                    }
                    return arrayList;
                } catch (RemoteException e2) {
                    e = e2;
                    throw new MlKitException("Failed to detect with legacy face detector", 13, e);
                }
            }
            zzfVarArrZze = zzjVar.zze(ObjectWrapper.wrap(ImageConvertUtils.getInstance().convertToNv21Buffer(inputImage, false)), zzpVar);
            arrayList = new ArrayList();
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            while (i < r5) {
                arrayList.add(new Face(zzfVar, inputImage.getCoordinatesMatrix()));
            }
            return arrayList;
        } catch (RemoteException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c7  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = $10 + 83;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2187;
                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39;
                    byte b2 = (byte) ($$f & 7);
                    byte b3 = (byte) (b2 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, minimumFlingVelocity, i7, 841711447, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33065 - AndroidCharacter.getMirror('0')), 3011 - View.resolveSizeAndState(0, 0, 0), Color.red(0) + 26, 321985076, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (-b6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 36505), 3376 - KeyEvent.getDeadChar(0, 0), 17 - KeyEvent.getDeadChar(0, 0), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i8 = $11 + 77;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 1;
                byte b9 = (byte) (-b8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - ExpandableListView.getPackedPositionType(j)), TextUtils.indexOf("", "", 0) + 3376, View.getDefaultSize(0, 0) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c A[PHI: r2
  0x001c: PHI (r2v3 com.google.android.gms.internal.mlkit_vision_face.zzj) = 
  (r2v2 com.google.android.gms.internal.mlkit_vision_face.zzj)
  (r2v5 com.google.android.gms.internal.mlkit_vision_face.zzj)
 binds: [B:8:0x001a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.mlkit.vision.face.internal.zzb
    public final void zzb() {
        com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            zzjVar = this.zzf;
            int i4 = 50 / 0;
            if (zzjVar != null) {
                int i5 = i2 + 115;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    zzjVar.zzd();
                } catch (RemoteException unused) {
                }
                this.zzf = null;
            }
        } else {
            zzjVar = this.zzf;
            if (zzjVar != null) {
                int i7 = i2 + 115;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                zzjVar.zzd();
                this.zzf = null;
            }
        }
        com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar2 = this.zzg;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
            } catch (RemoteException unused2) {
            }
            this.zzg = null;
        }
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public final Pair zza(InputImage inputImage) throws Throwable {
        List listZzg;
        List listZzg2;
        Object[] objArr;
        int i = 2 % 2;
        if (this.zzf == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 75;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            if (this.zzg == null) {
                int i5 = i2 + 37;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                zzd();
            }
        }
        com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar = this.zzf;
        if (zzjVar == null && this.zzg == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        if (zzjVar != null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            if (i7 % 2 != 0) {
                zzg(zzjVar, inputImage);
                this.zzc.zzg();
                throw null;
            }
            listZzg = zzg(zzjVar, inputImage);
            if (!this.zzc.zzg()) {
                zzh.zzf(listZzg);
            }
        } else {
            listZzg = null;
        }
        com.google.android.gms.internal.mlkit_vision_face.zzj zzjVar2 = this.zzg;
        if (zzjVar2 != null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
            if (i8 % 2 != 0) {
                zzh.zzf(zzg(zzjVar2, inputImage));
                throw null;
            }
            listZzg2 = zzg(zzjVar2, inputImage);
            zzh.zzf(listZzg2);
        } else {
            listZzg2 = null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int modifierMetaStateMask = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
            int iArgb = Color.argb(0, 0, 0, 0) + 10;
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, (byte) (b3 + 1), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, modifierMetaStateMask, iArgb, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(View.MeasureSpec.getMode(0), 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionGroup(0L) + 2114), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - Color.red(0), View.MeasureSpec.getMode(0) + 15, (char) (35419 - ExpandableListView.getPackedPositionGroup(0L)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
            int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte b4 = (byte) ($$b & 5);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(b4, bArr[11], bArr[17], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, doubleTapTimeout, windowTouchSlop, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                int mirror = AndroidCharacter.getMirror('0') - '&';
                byte b5 = $$a[11];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 + 3), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, offsetBefore, mirror, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i9 = (-1620801868) + ((~(263846911 | iMyPid)) * 623) + (((~iMyPid) | 167809312) * (-623)) + (((~(iMyPid | 235983226)) | (~(195672997 | iMyPid)) | (-263846912)) * 623) + 2012190164;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((ViewConfiguration.getFadingEdgeLength() >> 16) + 37, 15 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(53 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 2012190164};
                byte[] bArr2 = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr2[41], bArr2[74], bArr2[38], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr2[38];
                Object[] objArr12 = new Object[1];
                d(b7, (short) (b7 | 166), bArr2[41], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                    int defaultSize = View.getDefaultSize(0, 0) + 10;
                    byte b8 = $$a[11];
                    byte b9 = b8;
                    Object[] objArr13 = new Object[1];
                    a(b8, b9, (byte) (b9 + 3), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, fadingEdgeLength, defaultSize, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, (char) (2115 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (-16777201) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35418), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 876;
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                        byte b10 = (byte) ($$b & 5);
                        byte[] bArr3 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(b10, bArr3[11], bArr3[17], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, iIndexOf, maxKeyCode, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 876;
                        int i12 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b11 = $$a[11];
                        byte b12 = b11;
                        Object[] objArr17 = new Object[1];
                        a(b12, (byte) (b12 + 1), b11, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, offsetBefore2, i12, -1199417970, false, (String) objArr17[0], null);
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
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i16 = 1249275260 + (((~((-633302949) | startUptimeMillis)) | 555239812 | (~((-592992720) | startUptimeMillis))) * (-754));
            int i17 = ~((-555239813) | startUptimeMillis);
            int i18 = ~startUptimeMillis;
            int i19 = i15 + i16 + ((i17 | (~((-37752908) | i18))) * (-754)) + ((i18 | (-633302949)) * 754);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr18[1])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i22 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = i22 + (-1208067874) + (((~((-40900822) | (~iIdentityHashCode))) | 590592) * (-591)) + ((iIdentityHashCode | (-40900822)) * 591);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr19[1])[0] = i25 ^ (i25 << 5);
        }
        return new Pair(listZzg, listZzg2);
    }

    @Override // com.google.mlkit.vision.face.internal.zzb
    public final boolean zzd() throws MlKitException {
        int i = 2 % 2;
        if (this.zzf != null || this.zzg != null) {
            return false;
        }
        try {
            com.google.android.gms.internal.mlkit_vision_face.zzm zzmVarZza = com.google.android.gms.internal.mlkit_vision_face.zzl.zza(DynamiteModule.load(this.zzb, DynamiteModule.PREFER_REMOTE, OptionalModuleUtils.DEPRECATED_DYNAMITE_MODULE_ID).instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.zzb);
            Object obj = null;
            if (this.zzc.zzc() == 2) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this.zzg == null) {
                    this.zzg = zzmVarZza.zzd(iObjectWrapperWrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(2, 2, 0, true, false, this.zzc.zza()));
                }
                if ((this.zzc.zzd() == 2 || this.zzc.zzb() == 2 || this.zzc.zze() == 2) && this.zzf == null) {
                    this.zzf = zzmVarZza.zzd(iObjectWrapperWrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(zzf(this.zzc.zze()), zze(this.zzc.zzd()), zzc(this.zzc.zzb()), false, this.zzc.zzg(), this.zzc.zza()));
                }
            } else if (this.zzf == null) {
                this.zzf = zzmVarZza.zzd(iObjectWrapperWrap, new com.google.android.gms.internal.mlkit_vision_face.zzh(zzf(this.zzc.zze()), zze(this.zzc.zzd()), zzc(this.zzc.zzb()), false, this.zzc.zzg(), this.zzc.zza()));
            }
            if (this.zzf == null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = i3 + 39;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                if (this.zzg == null) {
                    int i6 = i3 + 39;
                    int i7 = i6 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i7;
                    int i8 = i6 % 2;
                    if (!this.zza) {
                        int i9 = i7 + 125;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        if (i9 % 2 == 0) {
                            OptionalModuleUtils.requestDownload(this.zzb, OptionalModuleUtils.BARCODE);
                            this.zza = true;
                        } else {
                            OptionalModuleUtils.requestDownload(this.zzb, OptionalModuleUtils.BARCODE);
                            this.zza = true;
                        }
                    }
                }
            }
            zzj.zzc(this.zze, false, zzks.NO_ERROR);
            int i10 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to create legacy face detector.", 13, e2);
        } catch (DynamiteModule.LoadingException e3) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            byte[] r0 = com.google.mlkit.vision.face.internal.zzm.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r6 = r6 * 3
            int r6 = 115 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.zzm.$$g(int, byte, short):java.lang.String");
    }
}
