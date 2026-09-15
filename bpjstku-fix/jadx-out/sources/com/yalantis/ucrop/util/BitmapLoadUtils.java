package com.yalantis.ucrop.util;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.task.BitmapLoadTask;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.onCameraAvailable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class BitmapLoadUtils {
    private static final String TAG = "BitmapLoadUtils";
    private static final byte[] $$c = {14, 116, 92, -78};
    private static final int $$d = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {59, -124, -78, 46};
    private static final int $$b = 13;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-1794347950, -927650838, -1602743524, 16188794, -850811809, -1781291047, -1226963937, -264447072, 994291746, 1882591289, -445161650, -1563450343, 216886947, -1248217392, 230397436, -536120811, 1346169641, -55508495};

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 98
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.yalantis.ucrop.util.BitmapLoadUtils.$$a
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.BitmapLoadUtils.c(short, int, int, java.lang.Object[]):void");
    }

    public static void decodeBitmapInBackground(Context context, Uri uri, Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        int i3 = 2 % 2;
        new BitmapLoadTask(context, uri, uri2, i, i2, bitmapLoadCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r10.sameAs(r11) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap transformBitmap(android.graphics.Bitmap r10, android.graphics.Matrix r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.yalantis.ucrop.util.BitmapLoadUtils.b
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.yalantis.ucrop.util.BitmapLoadUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L28
            int r5 = r10.getWidth()     // Catch: java.lang.OutOfMemoryError -> L40
            int r6 = r10.getHeight()     // Catch: java.lang.OutOfMemoryError -> L40
            r3 = 0
            r4 = 1
            r8 = 0
            r2 = r10
            r7 = r11
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.OutOfMemoryError -> L40
            boolean r1 = r10.sameAs(r11)     // Catch: java.lang.OutOfMemoryError -> L40
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L3f
            goto L40
        L28:
            int r6 = r10.getWidth()     // Catch: java.lang.OutOfMemoryError -> L40
            int r7 = r10.getHeight()     // Catch: java.lang.OutOfMemoryError -> L40
            r4 = 0
            r5 = 0
            r9 = 1
            r3 = r10
            r8 = r11
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.OutOfMemoryError -> L40
            boolean r1 = r10.sameAs(r11)     // Catch: java.lang.OutOfMemoryError -> L40
            if (r1 != 0) goto L40
        L3f:
            return r11
        L40:
            int r11 = com.yalantis.ucrop.util.BitmapLoadUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r11 = r11 + 25
            int r1 = r11 % 128
            com.yalantis.ucrop.util.BitmapLoadUtils.b = r1
            int r11 = r11 % r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.BitmapLoadUtils.transformBitmap(android.graphics.Bitmap, android.graphics.Matrix):android.graphics.Bitmap");
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        int i6 = 1;
        if (i4 <= i2) {
            if (i5 <= i) {
                return 1;
            }
            int i7 = b + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            if (i7 % 2 == 0) {
                i6 = 0;
            }
        }
        while (true) {
            if (i4 / i6 <= i2 && i5 / i6 <= i) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                b = i8 % 128;
                int i9 = i8 % 2;
                return i6;
            }
            i6 *= 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getExifOrientation(android.content.Context r3, android.net.Uri r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.yalantis.ucrop.util.BitmapLoadUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.yalantis.ucrop.util.BitmapLoadUtils.b = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.io.IOException -> L3f
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.io.IOException -> L3f
            if (r3 != 0) goto L32
            goto L24
        L1a:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.io.IOException -> L3f
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.io.IOException -> L3f
            if (r3 != 0) goto L32
        L24:
            int r3 = com.yalantis.ucrop.util.BitmapLoadUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r3 = r3 + 21
            int r4 = r3 % 128
            com.yalantis.ucrop.util.BitmapLoadUtils.b = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L30
            return r2
        L30:
            r3 = 0
            throw r3
        L32:
            com.yalantis.ucrop.util.ImageHeaderParser r0 = new com.yalantis.ucrop.util.ImageHeaderParser     // Catch: java.io.IOException -> L3f
            r0.<init>(r3)     // Catch: java.io.IOException -> L3f
            int r2 = r0.getOrientation()     // Catch: java.io.IOException -> L3f
            close(r3)     // Catch: java.io.IOException -> L3f
            return r2
        L3f:
            r4.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.BitmapLoadUtils.getExifOrientation(android.content.Context, android.net.Uri):int");
    }

    public static int calculateMaxBitmapSize(Context context) {
        int i = 2 % 2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        Object obj = null;
        if (windowManager != null) {
            int i2 = b + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                windowManager.getDefaultDisplay().getSize(point);
                obj.hashCode();
                throw null;
            }
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            b = i3 % 128;
            int i4 = i3 % 2;
            iSqrt = Math.min(iSqrt, iMin);
        }
        int maxTextureSize = EglUtils.getMaxTextureSize();
        if (maxTextureSize <= 0) {
            return iSqrt;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return Math.min(iSqrt, maxTextureSize);
        }
        Math.min(iSqrt, maxTextureSize);
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = -1870535734;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 87;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1);
                        int i9 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 3290;
                        int i10 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 30;
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i9, i10, 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = -1870535734;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 23;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", i5);
                        int offsetBefore = 3291 - TextUtils.getOffsetBefore("", i5);
                        int iResolveSize = View.resolveSize(i5, i5) + 31;
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, offsetBefore, iResolveSize, 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i11++;
                    iArr5 = iArr5;
                    i4 = 1;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i14 = i5;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[i14] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 2559, 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i15--;
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28878 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf((CharSequence) "", '0', 0) + 349, Gravity.getAbsoluteGravity(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static void close(Closeable closeable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 63;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
            if (closeable != null) {
                if (closeable instanceof Closeable) {
                    int i5 = i2 + 17;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        } else if (closeable != null) {
            if (closeable instanceof Closeable) {
                int i7 = i2 + 17;
                b = i7 % 128;
                int i8 = i7 % 2;
                closeable.close();
            }
        }
        int i9 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static int exifToDegrees(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 115;
        b = i4 % 128;
        int i5 = i4 % 2;
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                int i6 = i3 + 57;
                b = i6 % 128;
                int i7 = i6 % 2;
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int exifToTranslation(int i) {
        int i2 = 2 % 2;
        if (i == 2) {
            return -1;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i3 + 77;
        b = i4 % 128;
        int i5 = i4 % 2;
        if (i == 7) {
            return -1;
        }
        int i6 = i3 + 77;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            if (i == 3) {
                return -1;
            }
        } else if (i == 4) {
            return -1;
        }
        int i7 = i3 + 105;
        b = i7 % 128;
        if (i7 % 2 != 0) {
            return i != 5 ? 1 : -1;
        }
        return i != 5 ? 1 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x04ba A[Catch: Exception -> 0x05f7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x05f7, blocks: (B:55:0x0451, B:58:0x04ba, B:69:0x0522, B:74:0x0535, B:77:0x0547, B:79:0x0574, B:81:0x059d, B:83:0x05a6, B:84:0x05ac, B:99:0x05f0, B:100:0x05f6, B:80:0x057e, B:61:0x04dd, B:67:0x0514, B:68:0x051e, B:72:0x052a, B:62:0x04f0), top: B:119:0x0451, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x04dd A[Catch: all -> 0x05ef, TRY_ENTER, TryCatch #6 {all -> 0x05ef, blocks: (B:61:0x04dd, B:67:0x0514, B:68:0x051e, B:72:0x052a, B:62:0x04f0), top: B:124:0x04db, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x04f0 A[Catch: all -> 0x05ef, TRY_LEAVE, TryCatch #6 {all -> 0x05ef, blocks: (B:61:0x04dd, B:67:0x0514, B:68:0x051e, B:72:0x052a, B:62:0x04f0), top: B:124:0x04db, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0511  */
    /* JADX WARN: Code duplicated, block: B:71:0x0526  */
    /* JADX WARN: Code duplicated, block: B:77:0x0547 A[Catch: Exception -> 0x05f7, TRY_ENTER, TryCatch #3 {Exception -> 0x05f7, blocks: (B:55:0x0451, B:58:0x04ba, B:69:0x0522, B:74:0x0535, B:77:0x0547, B:79:0x0574, B:81:0x059d, B:83:0x05a6, B:84:0x05ac, B:99:0x05f0, B:100:0x05f6, B:80:0x057e, B:61:0x04dd, B:67:0x0514, B:68:0x051e, B:72:0x052a, B:62:0x04f0), top: B:119:0x0451, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0574 A[Catch: Exception -> 0x05f7, TRY_LEAVE, TryCatch #3 {Exception -> 0x05f7, blocks: (B:55:0x0451, B:58:0x04ba, B:69:0x0522, B:74:0x0535, B:77:0x0547, B:79:0x0574, B:81:0x059d, B:83:0x05a6, B:84:0x05ac, B:99:0x05f0, B:100:0x05f6, B:80:0x057e, B:61:0x04dd, B:67:0x0514, B:68:0x051e, B:72:0x052a, B:62:0x04f0), top: B:119:0x0451, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x05be  */
    /* JADX WARN: Code duplicated, block: B:88:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x05d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x05ed  */
    public static Object[] b(int i, int i2) throws Throwable {
        int i3;
        String line;
        char c;
        Object[] objArr;
        int i4;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        int i5;
        String line2;
        int[] iArr;
        float fComplexToFraction;
        int i6;
        int i7;
        int i8;
        String str;
        boolean zEquals;
        File file2;
        boolean z;
        int i9;
        boolean zEquals2;
        int i10;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 2 % 2;
        int i15 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
        int i16 = i15 % 2;
        try {
            int i17 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i18 = i17 * 522;
            int i19 = (i18 ^ (-9880)) + ((i18 & (-9880)) << 1);
            int i20 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i21 = ((~((i20 ^ 19) | (i20 & 19))) | i17) * (-1042);
            int i22 = (i19 ^ i21) + ((i19 & i21) << 1);
            int i23 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 19) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 19)) * 521;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            int i25 = ~i17;
            int i26 = ~((i25 ^ (-20)) | (i25 & (-20)));
            int i27 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i25) | (i25 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i28 = (i27 & i26) | (i26 ^ i27);
            int i29 = (i17 & i20) | (i20 ^ i17);
            int i30 = ~((i29 & 19) | (i29 ^ 19));
            int i31 = ((i30 & i28) | (i28 ^ i30)) * 521;
            int i32 = (i24 & i31) + (i31 | i24);
            Object[] objArr2 = new Object[1];
            a(new int[]{-2123212909, -173118799, 24015124, 1692195660, 716898955, 114998340, 1216077556, 1896836390, 2088438085, 812584694, -1616164111, -2098047550}, i32, objArr2);
            int i33 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i34 = i33 * 398;
            int i35 = (i34 ^ (-7128)) + ((i34 & (-7128)) << 1);
            int i36 = ~i33;
            int i37 = ~i;
            int i38 = ~((i36 ^ i37) | (i36 & i37));
            int i39 = (i36 & 18) | (i36 ^ 18);
            int i40 = ~i39;
            int i41 = i38 | i40;
            int i42 = ~i;
            int i43 = ~((i42 & 18) | (i42 ^ 18));
            int i44 = ((i41 & i43) | (i41 ^ i43)) * (-397);
            int i45 = (((i35 | i44) << 1) - (i35 ^ i44)) + ((~i39) * (-397));
            int i46 = ((~((i33 & (-19)) | ((-19) ^ i33))) | (i ^ i40) | (i & i40)) * 397;
            int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
            Object[] objArr3 = new Object[1];
            a(new int[]{836378625, 6345243, -979093081, -1030094763, 59251175, -167894733, 358827994, 1394456868, 1463249874, -1451164486, 402591226, 444474609}, i47, objArr3);
            String[] strArr = {(String) objArr2[0], (String) objArr3[0]};
            int i48 = 0;
            while (true) {
                if (i48 >= i13) {
                    i3 = i;
                    break;
                }
                String str2 = strArr[i48];
                int i49 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i50 = ~i49;
                int i51 = ~((i50 & (-17)) | (i50 ^ (-17)));
                int i52 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i53 = (i52 ^ i49) | (i52 & i49);
                int i54 = ((i49 * 221) - 3504) + (((~((i53 ^ 16) | (i53 & 16))) | i51) * 220);
                int i55 = ~(i52 | 16);
                int i56 = ((i55 & i49) | (i49 ^ i55)) * (-440);
                int i57 = (i54 ^ i56) + ((i56 & i54) << 1);
                int i58 = ((i49 ^ 16) | (i49 & 16) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2) * 220;
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                Object[] objArr4 = new Object[1];
                a(new int[]{-248812109, 1153613946, -1947494459, -725221555, -1164586792, -1091579587, -1396660836, -589033006, 491475194, 722817408}, i59, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i60 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                    b = i60 % 128;
                    int i61 = i60 % 2;
                    i3 = (i & (-2)) | (i37 & 1);
                    break;
                }
                i48++;
                i13 = 2;
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 2419);
                int iIndexOf = 2845 - TextUtils.indexOf("", "");
                int iGreen = 5 - Color.green(0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                c(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iIndexOf, iGreen, -501222268, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 956355878;
            long j2 = -1;
            long j3 = j ^ j2;
            long j4 = i;
            long j5 = (j3 | (j4 ^ j2)) ^ j2;
            long j6 = 338;
            long j7 = (((long) (-337)) * j) + (((long) 339) * jLongValue) + (((long) (-338)) * (j5 | (((jLongValue ^ j2) | j) ^ j2) | ((j | j4) ^ j2))) + (((j3 | jLongValue) ^ j2) * j6) + (j6 * (j5 | (j2 ^ (j4 | (jLongValue | j))))) + ((long) (-2115542564));
            int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i63 = ((i62 | 67) << 1) - (i62 ^ 67);
            b = i63 % 128;
            int i64 = i63 % 2;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i65 = ~((-716462518) | elapsedCpuTime);
            int i66 = ~elapsedCpuTime;
            int i67 = ((int) (j7 >> 32)) & ((-300142843) + ((i65 | (~(i66 | (-106561)))) * 497) + (((~(elapsedCpuTime | (-106561))) | (~((-720657334) | i66)) | 4194816) * 497));
            int i68 = ~i;
            int i69 = i67 | (((int) j7) & ((-1754753727) + (((~(i68 | (-1615488595))) | 178262184) * (-828)) + (((-1615488595) | i68) * (-828)) + 1889726776));
            int i70 = (~(i & 10)) & (i | 10);
            int i71 = i69 ^ 1;
            int i72 = -i71;
            int i73 = ((i71 & i72) | (i71 ^ i72)) >> 31;
            int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i75 = (i74 ^ 93) + ((i74 & 93) << 1);
            int i76 = i75 % 128;
            b = i76;
            if (i75 % 2 != 0) {
                throw null;
            }
            int i77 = (i73 & i) | (i70 & (~i73));
            int i78 = ((~i3) & i) | (i3 & i68);
            int i79 = (i76 ^ 39) + ((i76 & 39) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i79 % 128;
            int i80 = i79 % 2;
            int i81 = -i78;
            int i82 = ((i78 & i81) | (i78 ^ i81)) >> 31;
            int i83 = i77 & (~i82);
            int i84 = i3 & i82;
            int i85 = (i84 & i83) | (i83 ^ i84);
            try {
                int i86 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i87 = ((i86 | 41) << 1) - (i86 ^ 41);
                Object[] objArr6 = new Object[1];
                a(new int[]{1226967405, -913562032, 702870713, 883540629, -489585455, -1180409602, 486697487, 61498764, -1831215109, 1348639566, -467056093, 1016624819, 42217993, 1808450884, -1844035100, -783489541, 1962063876, 1216877564, -167918870, -1424797147, 1594855964, 233538156}, i87, objArr6);
                File file3 = new File((String) objArr6[0]);
                try {
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        try {
                            line = bufferedReader3.readLine();
                            int[] iArr2 = {-1948359062, 1776283416, 1797639794, -1764876815};
                            int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                            b = i88 % 128;
                            int i89 = i88 % 2;
                            int i90 = -TextUtils.indexOf("", "", 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i91 = (i90 * 221) - 657;
                            int i92 = ~i90;
                            int i93 = ~((783267139 & i68) | (783267139 ^ i68));
                            int i94 = (i93 & 1074806924) | (1074806924 ^ i93);
                            int i95 = ~((-1678996685) | i68);
                            int i96 = (-1430997688) + (((i94 & i95) | (i94 ^ i95)) * (-1136));
                            int i97 = (~((783267139 & i) | (783267139 ^ i))) | (~(((-1678996685) ^ i) | ((-1678996685) & i)));
                            int i98 = ~i;
                            int i99 = ~((i98 ^ (-783267140)) | (i98 & (-783267140)) | 1678996684);
                            int i100 = i96 + (((i97 ^ i99) | (i99 & i97)) * (-568));
                            int i101 = ~(i98 | (-783267140));
                            int i102 = ~((i68 & 1678996684) | (i68 ^ 1678996684));
                            int i103 = (i101 & i102) | (i101 ^ i102);
                            int i104 = ~(((-1074806925) & i) | ((-1074806925) ^ i));
                            int i105 = ((i103 & i104) | (i103 ^ i104)) * 568;
                            int i106 = (i100 ^ i105) + ((i105 & i100) << 1);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i107 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i108 = (-1219599430) + (((~((i107 & 254816050) | (i107 ^ 254816050))) | (-2142817503)) * (-1042)) + (((254816050 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (254816050 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 521);
                            int i109 = ~((2142817502 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (2142817502 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i110 = (8992 ^ i109) | (i109 & 8992);
                            int i111 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-1888010445));
                            if (i106 <= (i108 - (~(-(-(((i111 & i110) | (i110 ^ i111)) * 521))))) - 1) {
                                i11 = ~(i92 | (-4));
                                int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i113 = (i112 & i90) | (i112 ^ i90);
                                i12 = (i113 & 3) | (i113 ^ 3);
                                int i114 = 34 / 0;
                            } else {
                                i11 = ~((i92 ^ (-4)) | (i92 & (-4)));
                                int i115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i116 = (i115 & i90) | (i115 ^ i90);
                                i12 = (i116 & 3) | (i116 ^ 3);
                            }
                            int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i118 = i117 + 75;
                            b = i118 % 128;
                            int i119 = i118 % 2;
                            int i120 = ~i12;
                            int i121 = ((i11 & i120) | (i11 ^ i120)) * 220;
                            int i122 = ((i91 | i121) << 1) - (i121 ^ i91);
                            int i123 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i124 = ~((i123 & 3) | (i123 ^ 3));
                            int i125 = (i122 - (~(((i124 & i90) | (i90 ^ i124)) * (-440)))) - 1;
                            int i126 = (i90 ^ 3) | (i90 & 3);
                            int i127 = (i117 & 33) + (i117 | 33);
                            b = i127 % 128;
                            int i128 = -(((i126 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i126 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 220);
                            if (i127 % 2 != 0) {
                                int i129 = ((i125 | i128) << 1) - (i128 ^ i125);
                                Object[] objArr7 = new Object[1];
                                a(iArr2, i129, objArr7);
                                if (!line.equals((String) objArr7[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    int i130 = b + 5;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i130 % 128;
                                    int i131 = i130 % 2;
                                }
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i132 = -i128;
                                int i133 = ((i125 | i132) << 1) - (i132 ^ i125);
                                Object[] objArr8 = new Object[1];
                                a(iArr2, i133, objArr8);
                                if (line.equals((String) objArr8[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                } else {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    int i134 = b + 5;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i134 % 128;
                                    int i135 = i134 % 2;
                                }
                            }
                            int i136 = -Color.argb(0, 0, 0, 0);
                            int i137 = i136 * (-494);
                            int i138 = (i137 ^ (-15314)) + ((i137 & (-15314)) << 1);
                            int i139 = (~((i136 ^ 31) | (i136 & 31))) * (-495);
                            int i140 = (i138 & i139) + (i139 | i138);
                            int i141 = ~i;
                            int i142 = (i136 | i141) * 495;
                            int i143 = (i140 & i142) + (i142 | i140);
                            int i144 = ~i136;
                            int i145 = ~((i144 & (-32)) | (i144 ^ (-32)));
                            int i146 = ~((i136 & i141) | (i141 ^ i136));
                            Object[] objArr9 = new Object[1];
                            a(new int[]{1843424980, 1549417411, 1184862001, 208204765, -1495086430, 862536808, -708001611, 1586635225, -835590132, 644282750, 1447594835, 1983720532, -265397335, -577358132, -1768037157, 1870057813, -807461943, -193844316}, (i143 - (~(-(-(((i146 & i145) | (i145 ^ i146)) * 495))))) - 1, objArr9);
                            file = new File((String) objArr9[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                                b = i5 % 128;
                                try {
                                    if (i5 % 2 != 0) {
                                        line2 = bufferedReader.readLine();
                                        iArr = new int[]{-131409900, -1106706362, -1377615338, -459925986};
                                        fComplexToFraction = TypedValue.complexToFraction(0, 2.0f, 1.0f);
                                        i6 = 0;
                                    } else {
                                        line2 = bufferedReader.readLine();
                                        iArr = new int[]{-131409900, -1106706362, -1377615338, -459925986};
                                        fComplexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                        i6 = 1;
                                    }
                                    int i147 = b;
                                    i7 = (i147 & 111) + (i147 | 111);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                                    i8 = (fComplexToFraction > 0.0f ? 1 : (fComplexToFraction == 0.0f ? 0 : -1));
                                    if (i7 % 2 == 0) {
                                        Object[] objArr10 = new Object[1];
                                        a(iArr, i6 >>> i8, objArr10);
                                        str = (String) objArr10[0];
                                    } else {
                                        Object[] objArr11 = new Object[1];
                                        a(iArr, (i6 - (~i8)) - 1, objArr11);
                                        str = (String) objArr11[0];
                                    }
                                    zEquals = line2.equals(str);
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i148 = b;
                                    int i149 = (i148 & 27) + (i148 | 27);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i149 % 128;
                                    int i150 = i149 % 2;
                                    if (zEquals) {
                                        int i151 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                        int i152 = (i151 ^ 35) + ((i151 & 35) << 1);
                                        Object[] objArr12 = new Object[1];
                                        a(new int[]{1742078116, 374383713, 706732044, -1170914582, -54642985, -830228104, 1942236251, 1354591859, -624788363, 415434675, 336759178, -624887804, -6362194, 532283551, -374819893, -1398594366, 1735264833, -1569197307, 534423990, 223599951}, i152, objArr12);
                                        file2 = new File((String) objArr12[0]);
                                        if (!(!file2.canRead())) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            try {
                                                String line3 = bufferedReader2.readLine();
                                                Object[] objArr13 = new Object[1];
                                                a(new int[]{-131409900, -1106706362, -1377615338, -459925986}, -MotionEvent.axisFromString(""), objArr13);
                                                zEquals2 = line3.equals((String) objArr13[0]);
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                z = true;
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        } else {
                                            int i153 = b;
                                            z = true;
                                            i9 = (i153 ^ 121) + ((i153 & 121) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                                            if (i9 % 2 == 0) {
                                                zEquals2 = true;
                                            } else {
                                                zEquals2 = false;
                                            }
                                        }
                                        if (zEquals2 != z) {
                                            int i154 = b;
                                            i10 = (i154 & 89) + (i154 | 89);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                throw null;
                                            }
                                            if (line != null) {
                                                objArr = new Object[]{new int[]{i ^ 20}, new String[]{line}};
                                                c = 0;
                                            } else {
                                                i4 = 2;
                                            }
                                        }
                                        objArr = new Object[i4];
                                        c = 0;
                                        objArr[0] = new int[]{i};
                                        objArr[1] = new String[0];
                                    }
                                    int i155 = ((int[]) objArr[c])[c];
                                    int i156 = (~(i & i85)) & (i | i85);
                                    int i157 = (i156 | (-i156)) >> 31;
                                    int i158 = (~i157) & i155;
                                    int i159 = i85 & i157;
                                    int i160 = (i159 & i158) | (i158 ^ i159);
                                    String[] strArr2 = (String[]) objArr[1];
                                    Object[] objArr14 = new Object[2];
                                    int i161 = i155 ^ i;
                                    int i162 = ((i161 | (-i161)) >> 31) & 1;
                                    int i163 = (~(((-i162) | i162) >> 31)) & 1;
                                    objArr14[i162] = null;
                                    objArr14[i163] = strArr2;
                                    int i164 = i ^ i160;
                                    int i165 = -i164;
                                    Object[] objArr15 = {new int[]{i}, new int[]{(i | i) & (~(i & i))}, new int[]{i160}, (String[]) objArr14[0]};
                                    int i166 = i2 + (((((((~((-519171890) | i)) | 478202128) * (-566)) + 119775028) + ((~(i | (-40969762))) * 566)) - (~((((i164 & i165) | (i164 ^ i165)) >> 31) & 16))) - 1);
                                    int i167 = i166 ^ (i166 << 13);
                                    int i168 = i167 ^ (i167 >>> 17);
                                    int i169 = i168 << 5;
                                    return objArr15;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            int i170 = b;
                            int i171 = ((i170 | 65) << 1) - (i170 ^ 65);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i171 % 128;
                            int i172 = i171 % 2;
                            i4 = 2;
                            objArr = new Object[i4];
                            c = 0;
                            objArr[0] = new int[]{i};
                            objArr[1] = new String[0];
                            int i1510 = ((int[]) objArr[c])[c];
                            int i1511 = (~(i & i85)) & (i | i85);
                            int i1512 = (i1511 | (-i1511)) >> 31;
                            int i1513 = (~i1512) & i1510;
                            int i1514 = i85 & i1512;
                            int i1610 = (i1514 & i1513) | (i1513 ^ i1514);
                            String[] strArr3 = (String[]) objArr[1];
                            Object[] objArr16 = new Object[2];
                            int i1611 = i1510 ^ i;
                            int i1612 = ((i1611 | (-i1611)) >> 31) & 1;
                            int i1613 = (~(((-i1612) | i1612) >> 31)) & 1;
                            objArr16[i1612] = null;
                            objArr16[i1613] = strArr3;
                            int i1614 = i ^ i1610;
                            int i1615 = -i1614;
                            Object[] objArr17 = {new int[]{i}, new int[]{(i168 | i169) & (~(i168 & i169))}, new int[]{i1610}, (String[]) objArr16[0]};
                            int i1616 = i2 + (((((((~((-519171890) | i)) | 478202128) * (-566)) + 119775028) + ((~(i | (-40969762))) * 566)) - (~((((i1614 & i1615) | (i1614 ^ i1615)) >> 31) & 16))) - 1);
                            int i1617 = i1616 ^ (i1616 << 13);
                            int i1618 = i1617 ^ (i1617 >>> 17);
                            int i1619 = i1618 << 5;
                            return objArr17;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                    int i173 = b;
                    int i174 = (i173 ^ 25) + ((i173 & 25) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i174 % 128;
                    if (i174 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i1310 = -Color.argb(0, 0, 0, 0);
                    int i1311 = i1310 * (-494);
                    int i1312 = (i1311 ^ (-15314)) + ((i1311 & (-15314)) << 1);
                    int i1313 = (~((i1310 ^ 31) | (i1310 & 31))) * (-495);
                    int i1410 = (i1312 & i1313) + (i1313 | i1312);
                    int i1411 = ~i;
                    int i1412 = (i1310 | i1411) * 495;
                    int i1413 = (i1410 & i1412) + (i1412 | i1410);
                    int i1414 = ~i1310;
                    int i1415 = ~((i1414 & (-32)) | (i1414 ^ (-32)));
                    int i1416 = ~((i1310 & i1411) | (i1411 ^ i1310));
                    Object[] objArr18 = new Object[1];
                    a(new int[]{1843424980, 1549417411, 1184862001, 208204765, -1495086430, 862536808, -708001611, 1586635225, -835590132, 644282750, 1447594835, 1983720532, -265397335, -577358132, -1768037157, 1870057813, -807461943, -193844316}, (i1413 - (~(-(-(((i1416 & i1415) | (i1415 ^ i1416)) * 495))))) - 1, objArr18);
                    file = new File((String) objArr18[0]);
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                        b = i5 % 128;
                        if (i5 % 2 != 0) {
                            line2 = bufferedReader.readLine();
                            iArr = new int[]{-131409900, -1106706362, -1377615338, -459925986};
                            fComplexToFraction = TypedValue.complexToFraction(0, 2.0f, 1.0f);
                            i6 = 0;
                        } else {
                            line2 = bufferedReader.readLine();
                            iArr = new int[]{-131409900, -1106706362, -1377615338, -459925986};
                            fComplexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
                            i6 = 1;
                        }
                        int i1417 = b;
                        i7 = (i1417 & 111) + (i1417 | 111);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                        i8 = (fComplexToFraction > 0.0f ? 1 : (fComplexToFraction == 0.0f ? 0 : -1));
                        if (i7 % 2 == 0) {
                            Object[] objArr19 = new Object[1];
                            a(iArr, i6 >>> i8, objArr19);
                            str = (String) objArr19[0];
                        } else {
                            Object[] objArr110 = new Object[1];
                            a(iArr, (i6 - (~i8)) - 1, objArr110);
                            str = (String) objArr110[0];
                        }
                        zEquals = line2.equals(str);
                        fileReader.close();
                        bufferedReader.close();
                        int i1418 = b;
                        int i1419 = (i1418 & 27) + (i1418 | 27);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1419 % 128;
                        int i1515 = i1419 % 2;
                        if (zEquals) {
                            int i1516 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            int i1517 = (i1516 ^ 35) + ((i1516 & 35) << 1);
                            Object[] objArr111 = new Object[1];
                            a(new int[]{1742078116, 374383713, 706732044, -1170914582, -54642985, -830228104, 1942236251, 1354591859, -624788363, 415434675, 336759178, -624887804, -6362194, 532283551, -374819893, -1398594366, 1735264833, -1569197307, 534423990, 223599951}, i1517, objArr111);
                            file2 = new File((String) objArr111[0]);
                            if (!(!file2.canRead())) {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                String line4 = bufferedReader2.readLine();
                                Object[] objArr112 = new Object[1];
                                a(new int[]{-131409900, -1106706362, -1377615338, -459925986}, -MotionEvent.axisFromString(""), objArr112);
                                zEquals2 = line4.equals((String) objArr112[0]);
                                fileReader2.close();
                                bufferedReader2.close();
                                z = true;
                            } else {
                                int i1518 = b;
                                z = true;
                                i9 = (i1518 ^ 121) + ((i1518 & 121) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                                if (i9 % 2 == 0) {
                                    zEquals2 = true;
                                } else {
                                    zEquals2 = false;
                                }
                            }
                            if (zEquals2 != z) {
                                int i1519 = b;
                                i10 = (i1519 & 89) + (i1519 | 89);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    throw null;
                                }
                                if (line != null) {
                                    objArr = new Object[]{new int[]{i ^ 20}, new String[]{line}};
                                    c = 0;
                                } else {
                                    i4 = 2;
                                }
                            }
                            objArr = new Object[i4];
                            c = 0;
                            objArr[0] = new int[]{i};
                            objArr[1] = new String[0];
                        }
                        int i15110 = ((int[]) objArr[c])[c];
                        int i15111 = (~(i & i85)) & (i | i85);
                        int i15112 = (i15111 | (-i15111)) >> 31;
                        int i15113 = (~i15112) & i15110;
                        int i15114 = i85 & i15112;
                        int i16110 = (i15114 & i15113) | (i15113 ^ i15114);
                        String[] strArr4 = (String[]) objArr[1];
                        Object[] objArr113 = new Object[2];
                        int i16111 = i15110 ^ i;
                        int i16112 = ((i16111 | (-i16111)) >> 31) & 1;
                        int i16113 = (~(((-i16112) | i16112) >> 31)) & 1;
                        objArr113[i16112] = null;
                        objArr113[i16113] = strArr4;
                        int i16114 = i ^ i16110;
                        int i16115 = -i16114;
                        Object[] objArr114 = {new int[]{i}, new int[]{(i1618 | i1619) & (~(i1618 & i1619))}, new int[]{i16110}, (String[]) objArr113[0]};
                        int i16116 = i2 + (((((((~((-519171890) | i)) | 478202128) * (-566)) + 119775028) + ((~(i | (-40969762))) * 566)) - (~((((i16114 & i16115) | (i16114 ^ i16115)) >> 31) & 16))) - 1);
                        int i16117 = i16116 ^ (i16116 << 13);
                        int i16118 = i16117 ^ (i16117 >>> 17);
                        int i16119 = i16118 << 5;
                        return objArr114;
                    }
                    int i175 = b;
                    int i176 = ((i175 | 65) << 1) - (i175 ^ 65);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i176 % 128;
                    int i177 = i176 % 2;
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
            }
            line = null;
            i4 = 2;
            objArr = new Object[i4];
            c = 0;
            objArr[0] = new int[]{i};
            objArr[1] = new String[0];
            int i15115 = ((int[]) objArr[c])[c];
            int i15116 = (~(i & i85)) & (i | i85);
            int i15117 = (i15116 | (-i15116)) >> 31;
            int i15118 = (~i15117) & i15115;
            int i15119 = i85 & i15117;
            int i161110 = (i15119 & i15118) | (i15118 ^ i15119);
            String[] strArr5 = (String[]) objArr[1];
            Object[] objArr115 = new Object[2];
            int i161111 = i15115 ^ i;
            int i161112 = ((i161111 | (-i161111)) >> 31) & 1;
            int i161113 = (~(((-i161112) | i161112) >> 31)) & 1;
            objArr115[i161112] = null;
            objArr115[i161113] = strArr5;
            int i161114 = i ^ i161110;
            int i161115 = -i161114;
            Object[] objArr116 = {new int[]{i}, new int[]{(i16118 | i16119) & (~(i16118 & i16119))}, new int[]{i161110}, (String[]) objArr115[0]};
            int i161116 = i2 + (((((((~((-519171890) | i)) | 478202128) * (-566)) + 119775028) + ((~(i | (-40969762))) * 566)) - (~((((i161114 & i161115) | (i161114 ^ i161115)) >> 31) & 16))) - 1);
            int i161117 = i161116 ^ (i161116 << 13);
            int i161118 = i161117 ^ (i161117 >>> 17);
            int i161119 = i161118 << 5;
            return objArr116;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = com.yalantis.ucrop.util.BitmapLoadUtils.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.BitmapLoadUtils.$$e(int, byte, byte):java.lang.String");
    }
}
