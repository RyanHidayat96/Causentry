package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzad;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.libraries.places.api.model.zzcb;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public class ModelUtils {
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final GmsLogger zza;
    private static final byte[] $$c = {117, 57, 101, -72};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {55, -47, -47, 67, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 9;
    private static final byte[] $$a = {27, -8, 5, 78, 2, -10, 10};
    private static final int $$b = 87;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    public static abstract class AutoMLManifest {
        public abstract String getLabelsFile();

        public abstract String getModelFile();

        public abstract String getModelType();
    }

    public static abstract class ModelLoggingInfo {
        static ModelLoggingInfo zza(long j, String str, boolean z) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j, zzad.zzb(str), z);
        }

        public abstract String getHash();

        public abstract long getSize();

        public abstract boolean isManifestModel();
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        zza = new GmsLogger("ModelUtils", "");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = 4 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = com.google.mlkit.common.internal.model.ModelUtils.$$a
            int r6 = r6 * 4
            int r6 = 111 - r6
            byte[] r0 = new byte[r0]
            int r8 = 3 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.a(byte, int, int, java.lang.Object[]):void");
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = 55 - (s * 52);
        int i3 = 103 - i;
        int i4 = s2 * 52;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i4 + i2) - 11;
            i2 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i7;
            i3 = (i3 + bArr[i6]) - 11;
            i2 = i6;
        }
    }

    public static String getSHA256(File file) throws IllegalAccessException, InvocationTargetException {
        int i = 2 % 2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strZzc = zzc(fileInputStream);
                fileInputStream.close();
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                b = i2 % 128;
                int i3 = i2 % 2;
                return strZzc;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            zza.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e2.toString()));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[SYNTHETIC] */
    public static ModelLoggingInfo getModelLoggingInfo(Context context, LocalModel localModel) throws Throwable {
        long length;
        String string;
        IOException e2;
        InputStream fileInputStream;
        String strZzc;
        int i = 2 % 2;
        if (zzcb.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
            throw new RuntimeException("0");
        }
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        InputStream inputStream = null;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    if (assetFileDescriptorOpenFd != null) {
                        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                        b = i2 % 128;
                        int i3 = i2 % 2;
                        assetFileDescriptorOpenFd.close();
                    }
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                zza.e("ModelUtils", "Failed to open model file", e3);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile()) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                b = i4 % 128;
                int i5 = i4 % 2;
                absoluteFilePath = zzb(context, absoluteFilePath, false);
                if (absoluteFilePath == null) {
                    return null;
                }
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.e("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    length = assetFileDescriptorZza.getLength();
                    if (assetFileDescriptorZza != null) {
                        assetFileDescriptorZza.close();
                    }
                } catch (Throwable th3) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        }
                    }
                    throw th3;
                }
            } catch (IOException e4) {
                zza.e("ModelUtils", "Failed to open model file", e4);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            int i6 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                inputStream.hashCode();
                throw null;
            }
            string = assetFilePath;
        } else {
            string = absoluteFilePath != null ? absoluteFilePath : ((Uri) Preconditions.checkNotNull(uri)).toString();
        }
        String strZza = sharedPrefManager.zza(string, length);
        if (strZza != null) {
            int i7 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            return ModelLoggingInfo.zza(length, strZza, localModel.isManifestFile());
        }
        try {
            if (assetFilePath != null) {
                fileInputStream = context.getAssets().open(assetFilePath);
            } else {
                fileInputStream = absoluteFilePath != null ? new FileInputStream(new File(absoluteFilePath)) : zzi.zzb(context, (Uri) Preconditions.checkNotNull(uri));
            }
            if (fileInputStream != null) {
                try {
                    try {
                        strZzc = zzc(fileInputStream);
                    } catch (IOException e5) {
                        e2 = e5;
                        zza.e("ModelUtils", "Failed to open model file", e2);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e6) {
                                zza.e("ModelUtils", "Failed to close model file", e6);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th5) {
                    inputStream = fileInputStream;
                    th = th5;
                    if (inputStream != null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                        b = i9 % 128;
                        int i10 = i9 % 2;
                        throw th;
                    } catch (IOException e7) {
                        zza.e("ModelUtils", "Failed to close model file", e7);
                        throw th;
                    }
                }
            } else {
                strZzc = null;
            }
            if (strZzc != null) {
                sharedPrefManager.zzb(string, length, strZzc);
            }
            ModelLoggingInfo modelLoggingInfoZza = ModelLoggingInfo.zza(length, strZzc, localModel.isManifestFile());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    return modelLoggingInfoZza;
                } catch (IOException e8) {
                    zza.e("ModelUtils", "Failed to close model file", e8);
                }
            }
            return modelLoggingInfoZza;
        } catch (IOException e9) {
            e2 = e9;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            if (inputStream != null) {
                throw th;
            }
            inputStream.close();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            b = i11 % 128;
            int i12 = i11 % 2;
            throw th;
        }
    }

    public static boolean zza(File file, String str) throws IllegalAccessException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            String sha256 = getSHA256(file);
            zza.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
            return str.equals(sha256);
        }
        String sha257 = getSHA256(file);
        zza.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha257)));
        str.equals(sha257);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String zzb(Context context, String str, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            parseManifestFile(str, z, context);
            throw null;
        }
        AutoMLManifest manifestFile = parseManifestFile(str, z, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        zza.e("ModelUtils", "Failed to parse manifest file.");
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static String zzc(InputStream inputStream) {
        MessageDigest messageDigest;
        byte[] bArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        b = i2 % 128;
        int i3 = 0;
        try {
            if (i2 % 2 != 0) {
                messageDigest = MessageDigest.getInstance("SHA-256");
                bArr = new byte[1048576];
                int i4 = 76 / 0;
            } else {
                messageDigest = MessageDigest.getInstance("SHA-256");
                bArr = new byte[1048576];
            }
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 == -1) {
                    break;
                }
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    messageDigest.update(bArr, 0, i5);
                } else {
                    messageDigest.update(bArr, 0, i5);
                }
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            while (i3 < bArrDigest.length) {
                String hexString = Integer.toHexString(bArrDigest[i3] & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    sb.append('0');
                }
                sb.append(hexString);
                i3++;
                int i9 = b + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                int i10 = i9 % 2;
            }
            return sb.toString();
        } catch (IOException unused) {
            zza.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0415  */
    /* JADX WARN: Code duplicated, block: B:78:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0601  */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0652, code lost:
    
        if (new java.io.File(r3).exists() == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(java.lang.String r30, boolean r31, android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(java.lang.String, boolean, android.content.Context):com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest");
    }

    private static void d(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c2 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        long j = 0;
        if (cArr3 != null) {
            int i9 = $11 + 69;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = Integer.valueOf(cArr3[i3]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)));
                        int i10 = (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 1269;
                        int i11 = 19 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1));
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, i10, i11, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    c2 = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr3, i5, cArr4, 0, i6);
        if (bArr != null) {
            int i12 = $11 + 15;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr = new char[i6];
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                cArr = new char[i6];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = $10 + 71;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 3225, (ViewConfiguration.getPressedStateDuration() >> 16) + 13, 2133916302, false, $$g((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                        int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                        int i17 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte length2 = (byte) $$c.length;
                        byte b5 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iAxisFromString, i17, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1705, 21 - TextUtils.getCapsMode("", 0, 0), -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            int i18 = $11 + 45;
            $10 = i18 % 128;
            i = 2;
            int i19 = i18 % 2;
            cArr4 = cArr;
        } else {
            i = 2;
        }
        if (i8 > 0) {
            int i20 = $10 + 17;
            $11 = i20 % 128;
            if (i20 % i == 0) {
                char[] cArr5 = new char[i6];
                System.arraycopy(cArr4, 1, cArr5, 1, i6);
                int i21 = i6 >>> i8;
                System.arraycopy(cArr5, 1, cArr4, i21, i8);
                i2 = 0;
                System.arraycopy(cArr5, i8, cArr4, 0, i21);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr4, 0, cArr6, 0, i6);
                int i22 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr4, i22, i8);
                System.arraycopy(cArr6, i8, cArr4, 0, i22);
            }
        } else {
            i2 = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            setvideostabilizationmode.b = i2;
            while (setvideostabilizationmode.b < i6) {
                cArr7[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                int i24 = $10 + 101;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private ModelUtils() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59708, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59756, 59746, 59744, 59749, 59751, 59730, 59702, 59738, 59744, 59759, 59747, 59746, 59758, 59744, 59739, 59713, 59705, 59757, 59750, 59769, 59744, 59756, 59756, 59756, 59757, 59746, 59733, 59755, 59743, 59847, 59885, 59860, 59880, 59887, 59883, 59885, 59840, 59854, 59886, 59881, 59882, 59843, 59849, 59885, 59885, 59883, 59874, 59885, 59881, 59881, 59881, 59882, 59887, 59858, 59418, 59398, 59413, 59418, 59415, 59394, 59901, 59408, 59765, 59897, 59889, 59400, 59894, 59894, 59402, 59392, 59894, 59891, 59404, 59393, 59392, 59699, 59772, 59773, 59775, 59765, 59771, 59750, 59774, 59773, 59773, 59768, 59770, 59768, 59768, 59753, 59751, 59773};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r5 = 105 - r5
            byte[] r0 = com.google.mlkit.common.internal.model.ModelUtils.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.$$g(byte, short, byte):java.lang.String");
    }
}
