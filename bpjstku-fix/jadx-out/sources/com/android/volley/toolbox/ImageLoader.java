package com.android.volley.toolbox;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutStrategy;
import defpackage.abortCapture;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ImageLoader {
    private final ImageCache mCache;
    private final RequestQueue mRequestQueue;
    private Runnable mRunnable;
    private static final byte[] $$c = {84, 10, 24, -102};
    private static final int $$f = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {106, -93, -11, -74, 20, 6, -55, 69, 12, 14, 6, -3, 9, 10, 1, 25, 7, 8, -11, -43, 59, 26, 14, -3, -3, -45, 27, 58, 14, -3, -3, -8, 26, 21, 12, -9, 21, -70, 23, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
    private static final int $$e = 210;
    private static final byte[] $$a = {21, -108, 100, 114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 218;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2425268488110455000L;
    private int mBatchResponseDelayMs = 100;
    private final HashMap<String, BatchedImageRequest> mInFlightRequests = new HashMap<>();
    private final HashMap<String, BatchedImageRequest> mBatchedResponses = new HashMap<>();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    public interface ImageListener extends Response.ErrorListener {
        void onResponse(ImageContainer imageContainer, boolean z);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r0 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = com.android.volley.toolbox.ImageLoader.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.ImageLoader.a(byte, short, int, java.lang.Object[]):void");
    }

    private static void c(int i, short s, byte b, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = (b * 15) + 84;
        int i3 = i * 17;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i3 + 36];
        int i5 = i3 + 35;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i2 = (i5 + i4) - 8;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i6 = i7;
            i2 = (i2 + bArr[i8]) - 8;
            i4 = i8;
        }
    }

    static /* synthetic */ HashMap access$100(ImageLoader imageLoader) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, BatchedImageRequest> map = imageLoader.mInFlightRequests;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return map;
    }

    static /* synthetic */ HashMap access$200(ImageLoader imageLoader) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, BatchedImageRequest> map = imageLoader.mBatchedResponses;
        if (i3 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Runnable access$602(ImageLoader imageLoader, Runnable runnable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        imageLoader.mRunnable = runnable;
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        int i6 = i2 + 89;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 57 / 0;
        }
        return runnable;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.lastIndexOf("", '0', 0)), 1356 - TextUtils.getTrimmedLength(""), View.getDefaultSize(0, 0) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 467 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 35;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    public ImageLoader(RequestQueue requestQueue, ImageCache imageCache) {
        this.mRequestQueue = requestQueue;
        this.mCache = imageCache;
    }

    public static ImageListener getImageListener(final ImageView imageView, final int i, final int i2) {
        int i3 = 2 % 2;
        ImageListener imageListener = new ImageListener() { // from class: com.android.volley.toolbox.ImageLoader.1
            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                int i4 = i2;
                if (i4 != 0) {
                    imageView.setImageResource(i4);
                }
            }

            @Override // com.android.volley.toolbox.ImageLoader.ImageListener
            public void onResponse(ImageContainer imageContainer, boolean z) {
                if (imageContainer.getBitmap() != null) {
                    imageView.setImageBitmap(imageContainer.getBitmap());
                    return;
                }
                int i4 = i;
                if (i4 != 0) {
                    imageView.setImageResource(i4);
                }
            }
        };
        int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return imageListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public class ImageContainer {
        private Bitmap mBitmap;
        private final String mCacheKey;
        private final ImageListener mListener;
        private final String mRequestUrl;

        public ImageContainer(Bitmap bitmap, String str, String str2, ImageListener imageListener) {
            this.mBitmap = bitmap;
            this.mRequestUrl = str;
            this.mCacheKey = str2;
            this.mListener = imageListener;
        }

        public void cancelRequest() {
            Threads.throwIfNotOnMainThread();
            if (this.mListener != null) {
                BatchedImageRequest batchedImageRequest = (BatchedImageRequest) ImageLoader.access$100(ImageLoader.this).get(this.mCacheKey);
                if (batchedImageRequest != null) {
                    if (batchedImageRequest.removeContainerAndCancelIfNecessary(this)) {
                        ImageLoader.access$100(ImageLoader.this).remove(this.mCacheKey);
                        return;
                    }
                    return;
                }
                BatchedImageRequest batchedImageRequest2 = (BatchedImageRequest) ImageLoader.access$200(ImageLoader.this).get(this.mCacheKey);
                if (batchedImageRequest2 != null) {
                    batchedImageRequest2.removeContainerAndCancelIfNecessary(this);
                    if (batchedImageRequest2.mContainers.size() == 0) {
                        ImageLoader.access$200(ImageLoader.this).remove(this.mCacheKey);
                    }
                }
            }
        }

        public Bitmap getBitmap() {
            return this.mBitmap;
        }

        public String getRequestUrl() {
            return this.mRequestUrl;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:28:0x01ef  */
    public boolean isCached(String str, int i, int i2) throws Throwable {
        Object[] objArr;
        int i3 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[5]);
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 | 14), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iIndexOf, iMakeMeasureSpec, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{62988, 63085, 49155, 6660, 11196, 48283, 37587, 3852, 48924, 20236, 54260, 37096, 25491, 31246, 33886, 23949, 5789, 41222, 14604, 2739, 56705, 60430, 28204, 63361, 32951, 23342}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{17052, 17145, 35347, 61374, 46578, 2071, 55489, 17682, 19107, 47795, 19896, 3800, 55049, 12302, 29091, 50150, 41501, 60170, 52386}, ViewConfiguration.getJumpTapTimeout() >> 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int iArgb = Color.argb(0, 0, 0, 0) + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a((byte) (-b3), b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i4, iArgb, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                int iBlue = 10 - Color.blue(0);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 51, bArr3[7], bArr3[10], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, offsetBefore, iBlue, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (((-1703544620) + (((~(550260131 | iIdentityHashCode)) | 53682776) * 576)) + (((~((~iIdentityHashCode) | 603942907)) | 536887584) * 576)) - 255418839;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{49888, 49793, 22593, 60556, 34130, 34935, 2705, 38734, 18836, 47492, 32026, 15878, 22385, 57935, 29320, 62238, 8777, 14676, 53124, 42065, 59766, 29798, 39100, 22905, 46188, 50031, 21938, 4717, 849, 7803}, (-1) - Process.getGidForName(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{6905, 6810, 49438, 62873, 3339, 20580, 37845, 3597, 20631, 41111, 62787, 46640, 36729, 31499, 27543, 31488, 64114, 40978, 54919, 11272, 12662, 60709}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 48 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), -1111926743};
                byte[] bArr4 = $$d;
                Object[] objArr11 = new Object[1];
                c(bArr4[49], bArr4[72], bArr4[14], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c(bArr4[14], (byte) (-bArr4[78]), bArr4[49], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i12 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int mode = View.MeasureSpec.getMode(0) + 10;
                        byte[] bArr5 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((byte) 51, bArr5[7], bArr5[10], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, i12, mode, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(new char[]{62988, 63085, 49155, 6660, 11196, 48283, 37587, 3852, 48924, 20236, 54260, 37096, 25491, 31246, 33886, 23949, 5789, 41222, 14604, 2739, 56705, 60430, 28204, 63361, 32951, 23342}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(new char[]{17052, 17145, 35347, 61374, 46578, 2071, 55489, 17682, 19107, 47795, 19896, 3800, 55049, 12302, 29091, 50150, 41501, 60170, 52386}, Color.argb(0, 0, 0, 0), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                            int mirror = ':' - AndroidCharacter.getMirror('0');
                            byte[] bArr6 = $$a;
                            byte b4 = bArr6[5];
                            Object[] objArr17 = new Object[1];
                            a((byte) (-b4), b4, bArr6[7], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iLastIndexOf, mirror, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                            int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte[] bArr7 = $$a;
                            byte b5 = (byte) (-bArr7[5]);
                            byte b6 = bArr7[7];
                            Object[] objArr18 = new Object[1];
                            a(b5, b6, (byte) (b6 | 14), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, i13, fadingEdgeLength, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentbindingInflater1 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i19 = ~iIdentityHashCode2;
        int i20 = i18 + 1183914268 + (((~((-2228277) | i19)) | 42538505) * 220) + (((~(i19 | (-421702005))) | 462012233) * (-440)) + ((iIdentityHashCode2 | (-2228277)) * 220);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr19[1])[0] = i22 ^ (i22 << 5);
        return isCached(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(String str, int i, int i2, ImageView.ScaleType scaleType) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        Threads.throwIfNotOnMainThread();
        if (this.mCache.getBitmap(getCacheKey(str, i, i2, scaleType)) == null) {
            return false;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i7 = i6 + 75;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        boolean z = i7 % 2 == 0;
        int i8 = i6 + 67;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 38 / 0;
        }
        return z;
    }

    public ImageContainer get(String str, ImageListener imageListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ImageContainer imageContainer = get(str, imageListener, 0, 0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return imageContainer;
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (i5 == 0) {
            get(str, imageListener, i, i2, scaleType);
            throw null;
        }
        ImageContainer imageContainer = get(str, imageListener, i, i2, scaleType);
        int i6 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            return imageContainer;
        }
        obj.hashCode();
        throw null;
    }

    static class BatchedImageRequest {
        private final List<ImageContainer> mContainers;
        private VolleyError mError;
        private final Request<?> mRequest;
        private Bitmap mResponseBitmap;

        public BatchedImageRequest(Request<?> request, ImageContainer imageContainer) {
            ArrayList arrayList = new ArrayList();
            this.mContainers = arrayList;
            this.mRequest = request;
            arrayList.add(imageContainer);
        }

        public void setError(VolleyError volleyError) {
            this.mError = volleyError;
        }

        public VolleyError getError() {
            return this.mError;
        }

        public void addContainer(ImageContainer imageContainer) {
            this.mContainers.add(imageContainer);
        }

        public boolean removeContainerAndCancelIfNecessary(ImageContainer imageContainer) {
            this.mContainers.remove(imageContainer);
            if (this.mContainers.size() != 0) {
                return false;
            }
            this.mRequest.cancel();
            return true;
        }
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2, ImageView.ScaleType scaleType) {
        int i3 = 2 % 2;
        Threads.throwIfNotOnMainThread();
        String cacheKey = getCacheKey(str, i, i2, scaleType);
        Bitmap bitmap = this.mCache.getBitmap(cacheKey);
        if (bitmap != null) {
            ImageContainer imageContainer = new ImageContainer(bitmap, str, null, null);
            imageListener.onResponse(imageContainer, true);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 89 / 0;
            }
            return imageContainer;
        }
        ImageContainer imageContainer2 = new ImageContainer(null, str, cacheKey, imageListener);
        imageListener.onResponse(imageContainer2, true);
        BatchedImageRequest batchedImageRequest = this.mInFlightRequests.get(cacheKey);
        if (batchedImageRequest == null) {
            batchedImageRequest = this.mBatchedResponses.get(cacheKey);
        }
        if (batchedImageRequest == null) {
            Request<Bitmap> requestMakeImageRequest = makeImageRequest(str, i, i2, scaleType, cacheKey);
            this.mRequestQueue.add(requestMakeImageRequest);
            this.mInFlightRequests.put(cacheKey, new BatchedImageRequest(requestMakeImageRequest, imageContainer2));
            return imageContainer2;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        batchedImageRequest.addContainer(imageContainer2);
        return imageContainer2;
    }

    protected Request<Bitmap> makeImageRequest(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        int i3 = 2 % 2;
        ImageRequest imageRequest = new ImageRequest(str, new Response.Listener<Bitmap>() { // from class: com.android.volley.toolbox.ImageLoader.2
            @Override // com.android.volley.Response.Listener
            public void onResponse(Bitmap bitmap) {
                ImageLoader.this.onGetImageSuccess(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new Response.ErrorListener() { // from class: com.android.volley.toolbox.ImageLoader.3
            private static final byte[] $$c = {49, 84, -120, 101};
            private static final int $$d = 165;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {115, 98, 19, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 162;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int g = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {47210, 47261, 47207, 47257, 47260, 47202, 47197, 47208, 47255, 47206, 47176, 47251, 47204, 47178, 47259, 47263, 47170, 47205, 47262, 47256, 47196, 47200, 47198, 47209, 47254, 47194};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719435;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    int r7 = 53 - r7
                    int r8 = r8 + 4
                    byte[] r0 = com.android.volley.toolbox.ImageLoader.AnonymousClass3.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r7
                    r4 = r2
                    goto L26
                L12:
                    r3 = r2
                L13:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r7) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                L26:
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.ImageLoader.AnonymousClass3.c(byte, short, int, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int[] iArr, int i4, byte[] bArr, Object[] objArr) throws Throwable {
                int i5 = 2;
                int i6 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                long j = 0;
                int i7 = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 53;
                        $10 = i9 % 128;
                        if (i9 % i5 != 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i7] = Integer.valueOf(cArr2[i8]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c = (char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 31338);
                                    int iLastIndexOf = 2993 - TextUtils.lastIndexOf("", '0');
                                    int iMakeMeasureSpec = 17 - View.MeasureSpec.makeMeasureSpec(i7, i7);
                                    byte b2 = (byte) ($$d & 3);
                                    byte b3 = (byte) (-b2);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iLastIndexOf, iMakeMeasureSpec, 1182129903, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                }
                                cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cMyTid = (char) (31339 - (Process.myTid() >> 22));
                                int iGreen = Color.green(0) + 2994;
                                int i10 = 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte b4 = (byte) ($$d & 3);
                                byte b5 = (byte) (-b4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, iGreen, i10, 1182129903, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i8++;
                        }
                        i5 = 2;
                        j = 0;
                        i7 = 0;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.lastIndexOf("", '0', 0, 0) + 254, 21 - TextUtils.indexOf((CharSequence) "", '0'), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i11 = $11 + 93;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i4] >> iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 33602), (Process.myTid() >> 22) + 3085, 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2146875848, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        } else {
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i4] - iIntValue);
                            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.alpha(0) + 33602), 3084 - ExpandableListView.getPackedPositionChild(0L), 26 - Color.green(0), -2146875848, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (b) {
                    int i12 = $10 + 79;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i14 = $11 + 109;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i4] - iIntValue);
                        Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 33602), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3085, 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2146875848, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i16 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    int i17 = $11 + 35;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i4] - iIntValue);
                    i16 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                }
            }

            @Override // com.android.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                int i4 = 2 % 2;
                int i5 = g + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                ImageLoader.this.onGetImageError(str2, volleyError);
                int i7 = g + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                if (i7 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x056b  */
            /* JADX WARN: Code duplicated, block: B:102:0x0594 A[Catch: Exception -> 0x0736, TRY_LEAVE, TryCatch #6 {Exception -> 0x0736, blocks: (B:81:0x04d1, B:87:0x04d7, B:89:0x04dd, B:90:0x04de, B:91:0x04df, B:95:0x0512, B:101:0x0579, B:107:0x05da, B:113:0x0631, B:118:0x0698, B:122:0x06a3, B:124:0x06a9, B:125:0x06aa, B:126:0x06ab, B:131:0x0722, B:135:0x072d, B:137:0x0733, B:138:0x0734, B:102:0x0594, B:114:0x0643, B:116:0x0650, B:117:0x0691, B:71:0x03cf, B:73:0x03dc, B:74:0x041b, B:127:0x06cd, B:129:0x06da, B:130:0x071b), top: B:172:0x02cd, inners: #0, #2, #8 }] */
            /* JADX WARN: Code duplicated, block: B:106:0x05ce  */
            /* JADX WARN: Code duplicated, block: B:109:0x05e5  */
            /* JADX WARN: Code duplicated, block: B:112:0x0621  */
            /* JADX WARN: Code duplicated, block: B:116:0x0650 A[Catch: all -> 0x06a2, TryCatch #0 {all -> 0x06a2, blocks: (B:114:0x0643, B:116:0x0650, B:117:0x0691), top: B:161:0x0643, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:120:0x06a0  */
            /* JADX WARN: Code duplicated, block: B:126:0x06ab A[Catch: Exception -> 0x0736, TRY_LEAVE, TryCatch #6 {Exception -> 0x0736, blocks: (B:81:0x04d1, B:87:0x04d7, B:89:0x04dd, B:90:0x04de, B:91:0x04df, B:95:0x0512, B:101:0x0579, B:107:0x05da, B:113:0x0631, B:118:0x0698, B:122:0x06a3, B:124:0x06a9, B:125:0x06aa, B:126:0x06ab, B:131:0x0722, B:135:0x072d, B:137:0x0733, B:138:0x0734, B:102:0x0594, B:114:0x0643, B:116:0x0650, B:117:0x0691, B:71:0x03cf, B:73:0x03dc, B:74:0x041b, B:127:0x06cd, B:129:0x06da, B:130:0x071b), top: B:172:0x02cd, inners: #0, #2, #8 }] */
            /* JADX WARN: Code duplicated, block: B:129:0x06da A[Catch: all -> 0x072c, TryCatch #8 {all -> 0x072c, blocks: (B:127:0x06cd, B:129:0x06da, B:130:0x071b), top: B:174:0x06cd, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:133:0x072a  */
            /* JADX WARN: Code duplicated, block: B:140:0x0736 A[PHI: r6
  0x0736: PHI (r6v5 int) = (r6v4 int), (r6v7 int), (r6v8 int), (r6v8 int) binds: [B:139:0x0735, B:160:0x0736, B:132:0x0728, B:120:0x06a0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:143:0x0754  */
            /* JADX WARN: Code duplicated, block: B:144:0x0757  */
            /* JADX WARN: Code duplicated, block: B:173:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x02b2  */
            /* JADX WARN: Code duplicated, block: B:47:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:51:0x02cf  */
            /* JADX WARN: Code duplicated, block: B:53:0x02df A[Catch: Exception -> 0x0735, TRY_ENTER, TryCatch #7 {Exception -> 0x0735, blocks: (B:48:0x02c9, B:53:0x02df, B:59:0x0343, B:76:0x042b, B:66:0x03aa, B:68:0x03b0, B:69:0x03b1, B:70:0x03b2, B:54:0x02e7, B:60:0x0351, B:62:0x035e, B:63:0x039b), top: B:173:0x02c9, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x02e7 A[Catch: Exception -> 0x0735, TRY_LEAVE, TryCatch #7 {Exception -> 0x0735, blocks: (B:48:0x02c9, B:53:0x02df, B:59:0x0343, B:76:0x042b, B:66:0x03aa, B:68:0x03b0, B:69:0x03b1, B:70:0x03b2, B:54:0x02e7, B:60:0x0351, B:62:0x035e, B:63:0x039b), top: B:173:0x02c9, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x032b  */
            /* JADX WARN: Code duplicated, block: B:62:0x035e A[Catch: all -> 0x03a9, TryCatch #5 {all -> 0x03a9, blocks: (B:60:0x0351, B:62:0x035e, B:63:0x039b), top: B:170:0x0351, outer: #7 }] */
            /* JADX WARN: Code duplicated, block: B:70:0x03b2 A[Catch: Exception -> 0x0735, TRY_LEAVE, TryCatch #7 {Exception -> 0x0735, blocks: (B:48:0x02c9, B:53:0x02df, B:59:0x0343, B:76:0x042b, B:66:0x03aa, B:68:0x03b0, B:69:0x03b1, B:70:0x03b2, B:54:0x02e7, B:60:0x0351, B:62:0x035e, B:63:0x039b), top: B:173:0x02c9, inners: #5 }] */
            /* JADX WARN: Code duplicated, block: B:73:0x03dc A[Catch: all -> 0x04d5, TryCatch #2 {all -> 0x04d5, blocks: (B:71:0x03cf, B:73:0x03dc, B:74:0x041b), top: B:165:0x03cf, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:79:0x04a3  */
            /* JADX WARN: Code duplicated, block: B:80:0x04d0  */
            /* JADX WARN: Code duplicated, block: B:91:0x04df A[Catch: Exception -> 0x0736, TRY_LEAVE, TryCatch #6 {Exception -> 0x0736, blocks: (B:81:0x04d1, B:87:0x04d7, B:89:0x04dd, B:90:0x04de, B:91:0x04df, B:95:0x0512, B:101:0x0579, B:107:0x05da, B:113:0x0631, B:118:0x0698, B:122:0x06a3, B:124:0x06a9, B:125:0x06aa, B:126:0x06ab, B:131:0x0722, B:135:0x072d, B:137:0x0733, B:138:0x0734, B:102:0x0594, B:114:0x0643, B:116:0x0650, B:117:0x0691, B:71:0x03cf, B:73:0x03dc, B:74:0x041b, B:127:0x06cd, B:129:0x06da, B:130:0x071b), top: B:172:0x02cd, inners: #0, #2, #8 }] */
            /* JADX WARN: Code duplicated, block: B:94:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:97:0x051c  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i4, int i5, int i6) throws Throwable {
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                String str3;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                Object[] objArr;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i28;
                int scrollBarFadeDuration;
                int i29;
                int i30;
                int i31;
                int i32;
                int i33;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                long jLongValue;
                long j;
                int i34;
                int i35;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                int i36;
                int i37;
                int i38;
                Object objInvoke;
                Class<?> cls;
                int i39;
                int i40 = 2 % 2;
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                int i42 = i41 % 128;
                g = i42;
                int i43 = i41 % 2;
                int i44 = 0;
                if (context != null) {
                    int i45 = ((i42 | 67) << 1) - (i42 ^ 67);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
                    if (i45 % 2 != 0) {
                        int i46 = 26 / 0;
                    }
                    int i47 = (i42 & 55) + (i42 | 55);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i47 % 128;
                    int i48 = i47 % 2;
                    try {
                        int i49 = -TextUtils.lastIndexOf("", '0', 0, 0);
                        int i50 = ~i49;
                        int i51 = ~((i50 & 126) | (i50 ^ 126));
                        int i52 = (((i49 * (-1975)) + 124614) - (~(-(-((i4 | i51) * 988))))) - 1;
                        int i53 = ~(((-127) ^ i49) | ((-127) & i49));
                        int i54 = ~i4;
                        int i55 = ~(i49 | i54);
                        int i56 = -(-(((i55 & i53) | (i53 ^ i55)) * (-1976)));
                        int i57 = (i52 ^ i56) + ((i56 & i52) << 1);
                        int i58 = ~(((-127) ^ i4) | ((-127) & i4));
                        int i59 = ~i4;
                        int i60 = -(-(((i58 & i51) | (i51 ^ i58) | (~((i59 & 126) | (i59 ^ 126)))) * 988));
                        Object[] objArr3 = new Object[1];
                        a(null, null, ((i57 | i60) << 1) - (i60 ^ i57), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                        g = i61 % 128;
                        int i62 = i61 % 2;
                        int threadPriority = Process.getThreadPriority(0);
                        int i63 = -(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i64 = i63 * 980;
                        int i65 = ((i64 | (-124206)) << 1) - (i64 ^ (-124206));
                        int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                        int i67 = i66 % 128;
                        g = i67;
                        if (i66 % 2 == 0) {
                            int i68 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i69 = 979 >> (~((-128) | i68));
                            i36 = ((i65 & i69) + (i69 | i65)) * ((i63 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i63 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * (-979);
                            i38 = ~(((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            i37 = (i63 & i68) | (i68 ^ i63);
                        } else {
                            int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            i36 = i65 + ((~((-128) | i70)) * 979) + (((i63 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i63 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * (-979));
                            i37 = (i70 ^ i63) | (i70 & i63);
                            i38 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        }
                        int i71 = (i67 ^ 7) + ((i67 & 7) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i71 % 128;
                        int i72 = i71 % 2;
                        int i73 = ~i37;
                        if (i72 != 0) {
                            int i74 = -(979 << (i38 | i73));
                            Object[] objArr4 = new Object[1];
                            a(null, null, (i36 & i74) + (i74 | i36), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr4);
                            objInvoke = cls2.getMethod((String) objArr4[0], null).invoke(context, null);
                            Object[] objArr5 = new Object[1];
                            a(null, null, 104 % View.MeasureSpec.getSize(1), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr5);
                            cls = Class.forName((String) objArr5[0]);
                            i39 = 20;
                        } else {
                            int i75 = 979 * ((i38 & i73) | (i38 ^ i73));
                            Object[] objArr6 = new Object[1];
                            a(null, null, (i36 ^ i75) + ((i36 & i75) << 1), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr6);
                            objInvoke = cls2.getMethod((String) objArr6[0], null).invoke(context, null);
                            Object[] objArr7 = new Object[1];
                            a(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr7);
                            cls = Class.forName((String) objArr7[0]);
                            i39 = 127;
                        }
                        Object[] objArr8 = new Object[1];
                        a(null, null, (i39 - (~Color.blue(0))) - 1, new byte[]{-108, -115, -127, -112, -110}, objArr8);
                        int i76 = cls.getField((String) objArr8[0]).getInt(objInvoke) & 2;
                        int i77 = -i76;
                        int i78 = ((i76 & i77) | (i76 ^ i77)) >> 31;
                        int i79 = (~i78) & i4;
                        int i80 = i78 & ((i4 & (-2)) | (i54 & 1));
                        i7 = (i80 & i79) | (i79 ^ i80);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i7 = i4;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cBlue = (char) (Color.blue(0) + 16949);
                        int pressedStateDuration = 2739 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iGreen = Color.green(0) + 13;
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        Object[] objArr9 = new Object[1];
                        c(b2, b2, bArr[5], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, pressedStateDuration, iGreen, 1501733736, false, (String) objArr9[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16949);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2739;
                        int i81 = 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b3 = $$a[7];
                        byte b4 = b3;
                        Object[] objArr10 = new Object[1];
                        c(b3, b4, (short) (b4 | 51), objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, minimumFlingVelocity, i81, 47863026, false, (String) objArr10[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16949);
                            int i82 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2738;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 13;
                            byte b5 = $$a[7];
                            Object[] objArr11 = new Object[1];
                            c(b5, (byte) (b5 | 15), (short) 103, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, i82, jumpTapTimeout, 631063962, false, (String) objArr11[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i83 = g;
                                i28 = ((i83 | 95) << 1) - (i83 ^ 95);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                if (i28 % 2 != 0) {
                                    scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() % 83;
                                    i29 = 3;
                                } else {
                                    scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                    i29 = 127;
                                }
                                i30 = ~i4;
                                int i84 = (scrollBarFadeDuration * (-559)) + (i29 * 561) + ((~((i30 ^ scrollBarFadeDuration) | (i30 & scrollBarFadeDuration))) * (-560));
                                int i85 = ~i29;
                                int i86 = (i85 & scrollBarFadeDuration) | (i85 ^ scrollBarFadeDuration);
                                int i87 = (~((i86 & i4) | (i86 ^ i4))) * (-560);
                                int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i89 = (i88 & 87) + (i88 | 87);
                                int i90 = i89 % 128;
                                g = i90;
                                int i91 = i89 % 2;
                                int i92 = -(-i87);
                                i31 = ((i84 | i92) << 1) - (i84 ^ i92);
                                i32 = ~((~scrollBarFadeDuration) | i29);
                                i33 = i90 + 39;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                if (i33 % 2 != 0) {
                                    int i93 = ~((i29 & i30) | (i30 ^ i29));
                                    int i94 = -((i32 & i93) | (i32 ^ i93));
                                    int i95 = -(-(((i94 | 560) << 1) - (i94 ^ 560)));
                                    Object[] objArr12 = new Object[1];
                                    a(null, null, (i31 & i95) + (i95 | i31), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr12);
                                    Object[] objArr13 = {(String) objArr12[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 993;
                                        int mode = View.MeasureSpec.getMode(0) + 8;
                                        Object[] objArr14 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, packedPositionType, mode, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr13)).longValue();
                                } else {
                                    int i96 = ~i4;
                                    int i97 = ~((i29 & i96) | (i96 ^ i29));
                                    int i98 = i32 ^ i97;
                                    Object[] objArr15 = new Object[1];
                                    a(null, null, i31 + (((i32 & i97) | i98) * 560), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr15);
                                    Object[] objArr16 = {(String) objArr15[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int absoluteGravity = 993 - Gravity.getAbsoluteGravity(0, 0);
                                        int threadPriority2 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        Object[] objArr17 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, absoluteGravity, threadPriority2, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                }
                                long j2 = 959898726;
                                long j3 = (((long) 960) * j2) + (((long) (-1917)) * jLongValue);
                                long j4 = 959;
                                long j5 = -1;
                                long j6 = jLongValue ^ j5;
                                long jMyPid = Process.myPid();
                                long j7 = jMyPid ^ j5;
                                j = j3 + ((((j6 | j7) ^ j5) | ((j2 | jMyPid) ^ j5)) * j4) + (((long) (-959)) * j6) + (j4 * (((j6 | jMyPid) ^ j5) | ((j7 | j2) ^ j5))) + ((long) (-1160816963));
                                int i99 = ~(1568780745 | i30);
                                i44 = i4;
                                int i100 = ~(1288960139 | i44);
                                i34 = ((int) (j >> 32)) & ((-334238508) + ((i99 | i100) * 1150) + (((~((-1288960140) | i30)) | i100) * (-575)) + (((~(1568780745 | i44)) | (~((-1568780746) | i30))) * 575));
                                int i101 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i35 = (i101 ^ 39) + ((i101 & 39) << 1);
                                g = i35 % 128;
                                if (i35 % 2 == 0) {
                                    throw null;
                                }
                                int i102 = ((int) j) & ((-743136445) + (((~((-1048610) | i30)) | (~((-1714235973) | i44))) * (-302)) + ((~((-1048610) | i44)) * (-604)) + (((~((-1715284582) | i44)) | (-1992294144)) * 302));
                                i9 = (i34 & i102) | (i34 ^ i102);
                            } else {
                                i44 = i4;
                                i12 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i13 = i12 * 522;
                                i14 = g + 99;
                                int i103 = i14 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i103;
                                if (i14 % 2 != 0) {
                                    int i104 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 127);
                                    int i105 = -(-((i104 & i12) | (i12 ^ i104)));
                                    int i106 = (i13 + 12) >>> ((i105 & (-1042)) + (i105 | (-1042)));
                                    int i107 = -(-(521 / ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 127))));
                                    i15 = (i106 ^ i107) + ((i106 & i107) << 1);
                                } else {
                                    int i108 = ((i13 | (-66040)) << 1) - (i13 ^ (-66040));
                                    int i109 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i110 = ~((i109 & 127) | (i109 ^ 127));
                                    int i111 = ((i110 & i12) | (i12 ^ i110)) * (-1042);
                                    i15 = (i108 & i111) + (i111 | i108) + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 127)) * 521);
                                }
                                int i112 = (i103 & 89) + (i103 | 89);
                                int i113 = i112 % 128;
                                g = i113;
                                int i114 = i112 % 2;
                                int i115 = ~i12;
                                int i116 = ~((i115 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i115 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                int i117 = ~((i115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                i16 = (i117 & i116) | (i116 ^ i117);
                                int i118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i17 = (i12 & i118) | (i118 ^ i12);
                                i18 = i113 + 21;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    int i119 = ~((i17 & 127) | (i17 ^ 127));
                                    int i120 = i15 * (521 << ((i119 & i16) | (i16 ^ i119)));
                                    Object[] objArr18 = new Object[1];
                                    a(null, null, i120, new byte[]{-102}, objArr18);
                                    str3 = (String) objArr18[0];
                                    i19 = -TextUtils.indexOf((CharSequence) "", (char) 31, 1);
                                } else {
                                    Object[] objArr19 = new Object[1];
                                    a(null, null, i15 + (521 * ((~(i17 | 127)) | i16)), new byte[]{-102}, objArr19);
                                    str3 = (String) objArr19[0];
                                    i19 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                }
                                i20 = (i19 * 319) - 39942;
                                int i121 = g;
                                i21 = ((i121 | 105) << 1) - (i121 ^ 105);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                                if (i21 % 2 != 0) {
                                    int i122 = ~i19;
                                    int i123 = ~((i122 & i44) | (i122 ^ i44));
                                    i22 = i20 >>> ((-318) % ((i123 & ComposerKt.defaultsKey) | ((-127) ^ i123)));
                                    i23 = ~(((-127) ^ i44) | ((-127) & i44));
                                    i24 = (~i44) | i19;
                                } else {
                                    int i124 = ~i19;
                                    int i125 = ~((i124 & i44) | (i124 ^ i44));
                                    i22 = i20 + (((i125 & ComposerKt.defaultsKey) | ((-127) ^ i125)) * (-318));
                                    i23 = ~(((-127) ^ i44) | ((-127) & i44));
                                    int i126 = ~i44;
                                    i24 = (i126 & i19) | (i126 ^ i19);
                                }
                                i25 = i22 + (TypedValues.AttributesType.TYPE_PIVOT_TARGET * (i23 | (~(i24 | 126))));
                                int i127 = ~i44;
                                int i128 = (i127 & ComposerKt.defaultsKey) | ((-127) ^ i127);
                                i26 = ~((i128 & i19) | (i128 ^ i19));
                                i27 = (i121 ^ 15) + ((i121 & 15) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                                if (i27 % 2 != 0) {
                                    int i129 = (i19 & 126) | (i19 ^ 126);
                                    int i130 = ~((i129 & i44) | (i129 ^ i44));
                                    Object[] objArr20 = new Object[1];
                                    a(null, null, i25 / (((i130 & i26) | (i26 ^ i130)) + TypedValues.AttributesType.TYPE_PIVOT_TARGET), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr20);
                                    objArr2 = new Object[]{(String) objArr20[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char scrollDefaultDelay = (char) (33602 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        int jumpTapTimeout2 = 3085 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int iCombineMeasuredStates = 26 - View.combineMeasuredStates(0, 0);
                                        Object[] objArr21 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr21);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, jumpTapTimeout2, iCombineMeasuredStates, 1411172903, false, (String) objArr21[0], new Class[]{String.class});
                                    }
                                    if (!str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                        i9 = 0;
                                    } else {
                                        i9 = 1;
                                    }
                                } else {
                                    int i131 = (i19 & 126) | (i19 ^ 126);
                                    int i132 = ~((i131 & i44) | (i131 ^ i44));
                                    Object[] objArr22 = new Object[1];
                                    a(null, null, i25 + (((i132 & i26) | (i26 ^ i132)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr22);
                                    objArr = new Object[]{(String) objArr22[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33602);
                                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 3086;
                                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                                        Object[] objArr23 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr23);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay2, modifierMetaStateMask, pressedStateDuration2, 1411172903, false, (String) objArr23[0], new Class[]{String.class});
                                    }
                                    if (!(!str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                        i9 = 1;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                            }
                            int i133 = -i9;
                            int i134 = ((i9 & i133) | (i9 ^ i133)) >> 31;
                            int i135 = (~i134) & i44;
                            i10 = g + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            int i136 = i134 & (i44 ^ 10);
                            int i137 = (i136 & i135) | (i135 ^ i136);
                            if (i10 % 2 != 0) {
                                i11 = 36;
                            } else {
                                i11 = 32;
                            }
                            int i138 = i5 & i11;
                            int i139 = -i138;
                            int i140 = ((i138 & i139) | (i138 ^ i139)) >> 31;
                            int i141 = i137 & (~i140);
                            int i142 = i140 & i44;
                            i8 = (i141 & i142) | (i141 ^ i142);
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i143 = g;
                            int i144 = (i143 & 113) + (i143 | 113);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i144 % 128;
                            int i145 = i144 % 2;
                            i8 = i4;
                            i44 = i8;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i810 = g;
                                i28 = ((i810 | 95) << 1) - (i810 ^ 95);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                if (i28 % 2 != 0) {
                                    scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() % 83;
                                    i29 = 3;
                                } else {
                                    scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                    i29 = 127;
                                }
                                i30 = ~i4;
                                int i811 = (scrollBarFadeDuration * (-559)) + (i29 * 561) + ((~((i30 ^ scrollBarFadeDuration) | (i30 & scrollBarFadeDuration))) * (-560));
                                int i812 = ~i29;
                                int i813 = (i812 & scrollBarFadeDuration) | (i812 ^ scrollBarFadeDuration);
                                int i814 = (~((i813 & i4) | (i813 ^ i4))) * (-560);
                                int i815 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i816 = (i815 & 87) + (i815 | 87);
                                int i910 = i816 % 128;
                                g = i910;
                                int i911 = i816 % 2;
                                int i912 = -(-i814);
                                i31 = ((i811 | i912) << 1) - (i811 ^ i912);
                                i32 = ~((~scrollBarFadeDuration) | i29);
                                i33 = i910 + 39;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                if (i33 % 2 != 0) {
                                    int i913 = ~((i29 & i30) | (i30 ^ i29));
                                    int i914 = -((i32 & i913) | (i32 ^ i913));
                                    int i915 = -(-(((i914 | 560) << 1) - (i914 ^ 560)));
                                    Object[] objArr110 = new Object[1];
                                    a(null, null, (i31 & i915) + (i915 | i31), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr110);
                                    Object[] objArr111 = {(String) objArr110[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                        int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 993;
                                        int mode2 = View.MeasureSpec.getMode(0) + 8;
                                        Object[] objArr112 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr112);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, packedPositionType2, mode2, 410748506, false, (String) objArr112[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr111)).longValue();
                                } else {
                                    int i916 = ~i4;
                                    int i917 = ~((i29 & i916) | (i916 ^ i29));
                                    int i918 = i32 ^ i917;
                                    Object[] objArr113 = new Object[1];
                                    a(null, null, i31 + (((i32 & i917) | i918) * 560), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr113);
                                    Object[] objArr114 = {(String) objArr113[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int absoluteGravity2 = 993 - Gravity.getAbsoluteGravity(0, 0);
                                        int threadPriority3 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                        Object[] objArr115 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr115);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, absoluteGravity2, threadPriority3, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr114)).longValue();
                                }
                                long j8 = 959898726;
                                long j9 = (((long) 960) * j8) + (((long) (-1917)) * jLongValue);
                                long j10 = 959;
                                long j11 = -1;
                                long j12 = jLongValue ^ j11;
                                long jMyPid2 = Process.myPid();
                                long j13 = jMyPid2 ^ j11;
                                j = j9 + ((((j12 | j13) ^ j11) | ((j8 | jMyPid2) ^ j11)) * j10) + (((long) (-959)) * j12) + (j10 * (((j12 | jMyPid2) ^ j11) | ((j13 | j8) ^ j11))) + ((long) (-1160816963));
                                int i919 = ~(1568780745 | i30);
                                i44 = i4;
                                int i1010 = ~(1288960139 | i44);
                                i34 = ((int) (j >> 32)) & ((-334238508) + ((i919 | i1010) * 1150) + (((~((-1288960140) | i30)) | i1010) * (-575)) + (((~(1568780745 | i44)) | (~((-1568780746) | i30))) * 575));
                                int i1011 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i35 = (i1011 ^ 39) + ((i1011 & 39) << 1);
                                g = i35 % 128;
                                if (i35 % 2 == 0) {
                                    throw null;
                                }
                                int i1012 = ((int) j) & ((-743136445) + (((~((-1048610) | i30)) | (~((-1714235973) | i44))) * (-302)) + ((~((-1048610) | i44)) * (-604)) + (((~((-1715284582) | i44)) | (-1992294144)) * 302));
                                i9 = (i34 & i1012) | (i34 ^ i1012);
                            } else {
                                i44 = i4;
                                i12 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i13 = i12 * 522;
                                i14 = g + 99;
                                int i1013 = i14 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1013;
                                if (i14 % 2 != 0) {
                                    int i1014 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 127);
                                    int i1015 = -(-((i1014 & i12) | (i12 ^ i1014)));
                                    int i1016 = (i13 + 12) >>> ((i1015 & (-1042)) + (i1015 | (-1042)));
                                    int i1017 = -(-(521 / ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 127))));
                                    i15 = (i1016 ^ i1017) + ((i1016 & i1017) << 1);
                                } else {
                                    int i1018 = ((i13 | (-66040)) << 1) - (i13 ^ (-66040));
                                    int i1019 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1110 = ~((i1019 & 127) | (i1019 ^ 127));
                                    int i1111 = ((i1110 & i12) | (i12 ^ i1110)) * (-1042);
                                    i15 = (i1018 & i1111) + (i1111 | i1018) + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 127)) * 521);
                                }
                                int i1112 = (i1013 & 89) + (i1013 | 89);
                                int i1113 = i1112 % 128;
                                g = i1113;
                                int i1114 = i1112 % 2;
                                int i1115 = ~i12;
                                int i1116 = ~((i1115 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1115 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                int i1117 = ~((i1115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                i16 = (i1117 & i1116) | (i1116 ^ i1117);
                                int i1118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i17 = (i12 & i1118) | (i1118 ^ i12);
                                i18 = i1113 + 21;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    int i1119 = ~((i17 & 127) | (i17 ^ 127));
                                    int i1210 = i15 * (521 << ((i1119 & i16) | (i16 ^ i1119)));
                                    Object[] objArr116 = new Object[1];
                                    a(null, null, i1210, new byte[]{-102}, objArr116);
                                    str3 = (String) objArr116[0];
                                    i19 = -TextUtils.indexOf((CharSequence) "", (char) 31, 1);
                                } else {
                                    Object[] objArr117 = new Object[1];
                                    a(null, null, i15 + (521 * ((~(i17 | 127)) | i16)), new byte[]{-102}, objArr117);
                                    str3 = (String) objArr117[0];
                                    i19 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                }
                                i20 = (i19 * 319) - 39942;
                                int i1211 = g;
                                i21 = ((i1211 | 105) << 1) - (i1211 ^ 105);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                                if (i21 % 2 != 0) {
                                    int i1212 = ~i19;
                                    int i1213 = ~((i1212 & i44) | (i1212 ^ i44));
                                    i22 = i20 >>> ((-318) % ((i1213 & ComposerKt.defaultsKey) | ((-127) ^ i1213)));
                                    i23 = ~(((-127) ^ i44) | ((-127) & i44));
                                    i24 = (~i44) | i19;
                                } else {
                                    int i1214 = ~i19;
                                    int i1215 = ~((i1214 & i44) | (i1214 ^ i44));
                                    i22 = i20 + (((i1215 & ComposerKt.defaultsKey) | ((-127) ^ i1215)) * (-318));
                                    i23 = ~(((-127) ^ i44) | ((-127) & i44));
                                    int i1216 = ~i44;
                                    i24 = (i1216 & i19) | (i1216 ^ i19);
                                }
                                i25 = i22 + (TypedValues.AttributesType.TYPE_PIVOT_TARGET * (i23 | (~(i24 | 126))));
                                int i1217 = ~i44;
                                int i1218 = (i1217 & ComposerKt.defaultsKey) | ((-127) ^ i1217);
                                i26 = ~((i1218 & i19) | (i1218 ^ i19));
                                i27 = (i1211 ^ 15) + ((i1211 & 15) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                                if (i27 % 2 != 0) {
                                    int i1219 = (i19 & 126) | (i19 ^ 126);
                                    int i1310 = ~((i1219 & i44) | (i1219 ^ i44));
                                    Object[] objArr24 = new Object[1];
                                    a(null, null, i25 / (((i1310 & i26) | (i26 ^ i1310)) + TypedValues.AttributesType.TYPE_PIVOT_TARGET), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr24);
                                    objArr2 = new Object[]{(String) objArr24[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char scrollDefaultDelay3 = (char) (33602 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        int jumpTapTimeout3 = 3085 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int iCombineMeasuredStates2 = 26 - View.combineMeasuredStates(0, 0);
                                        Object[] objArr25 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr25);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay3, jumpTapTimeout3, iCombineMeasuredStates2, 1411172903, false, (String) objArr25[0], new Class[]{String.class});
                                    }
                                    if (!str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                        i9 = 0;
                                    } else {
                                        i9 = 1;
                                    }
                                } else {
                                    int i1311 = (i19 & 126) | (i19 ^ 126);
                                    int i1312 = ~((i1311 & i44) | (i1311 ^ i44));
                                    Object[] objArr26 = new Object[1];
                                    a(null, null, i25 + (((i1312 & i26) | (i26 ^ i1312)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr26);
                                    objArr = new Object[]{(String) objArr26[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char scrollDefaultDelay4 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33602);
                                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3086;
                                        int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                                        Object[] objArr27 = new Object[1];
                                        c($$a[132], (byte) 52, (short) 140, objArr27);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay4, modifierMetaStateMask2, pressedStateDuration3, 1411172903, false, (String) objArr27[0], new Class[]{String.class});
                                    }
                                    if (!(!str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                        i9 = 1;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                            }
                            int i1313 = -i9;
                            int i1314 = ((i9 & i1313) | (i9 ^ i1313)) >> 31;
                            int i1315 = (~i1314) & i44;
                            i10 = g + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            int i1316 = i1314 & (i44 ^ 10);
                            int i1317 = (i1316 & i1315) | (i1315 ^ i1316);
                            if (i10 % 2 != 0) {
                                i11 = 36;
                            } else {
                                i11 = 32;
                            }
                            int i1318 = i5 & i11;
                            int i1319 = -i1318;
                            int i146 = ((i1318 & i1319) | (i1318 ^ i1319)) >> 31;
                            int i147 = i1317 & (~i146);
                            int i148 = i146 & i44;
                            i8 = (i147 & i148) | (i147 ^ i148);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i149 = g;
                        int i1410 = (i149 & 113) + (i149 | 113);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1410 % 128;
                        int i1411 = i1410 % 2;
                        i8 = i4;
                        i44 = i8;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i817 = g;
                                    i28 = ((i817 | 95) << 1) - (i817 ^ 95);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                    if (i28 % 2 != 0) {
                                        scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() % 83;
                                        i29 = 3;
                                    } else {
                                        scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                        i29 = 127;
                                    }
                                    i30 = ~i4;
                                    int i818 = (scrollBarFadeDuration * (-559)) + (i29 * 561) + ((~((i30 ^ scrollBarFadeDuration) | (i30 & scrollBarFadeDuration))) * (-560));
                                    int i819 = ~i29;
                                    int i8110 = (i819 & scrollBarFadeDuration) | (i819 ^ scrollBarFadeDuration);
                                    int i8111 = (~((i8110 & i4) | (i8110 ^ i4))) * (-560);
                                    int i8112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i8113 = (i8112 & 87) + (i8112 | 87);
                                    int i9110 = i8113 % 128;
                                    g = i9110;
                                    int i9111 = i8113 % 2;
                                    int i9112 = -(-i8111);
                                    i31 = ((i818 | i9112) << 1) - (i818 ^ i9112);
                                    i32 = ~((~scrollBarFadeDuration) | i29);
                                    i33 = i9110 + 39;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                                    if (i33 % 2 != 0) {
                                        int i9113 = ~((i29 & i30) | (i30 ^ i29));
                                        int i9114 = -((i32 & i9113) | (i32 ^ i9113));
                                        int i9115 = -(-(((i9114 | 560) << 1) - (i9114 ^ 560)));
                                        Object[] objArr118 = new Object[1];
                                        a(null, null, (i31 & i9115) + (i9115 | i31), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr118);
                                        try {
                                            Object[] objArr119 = {(String) objArr118[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 993;
                                                int mode3 = View.MeasureSpec.getMode(0) + 8;
                                                Object[] objArr1110 = new Object[1];
                                                c($$a[132], (byte) 52, (short) 140, objArr1110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf3, packedPositionType3, mode3, 410748506, false, (String) objArr1110[0], new Class[]{String.class});
                                            }
                                            jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr119)).longValue();
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        int i9116 = ~i4;
                                        int i9117 = ~((i29 & i9116) | (i9116 ^ i29));
                                        int i9118 = i32 ^ i9117;
                                        Object[] objArr1111 = new Object[1];
                                        a(null, null, i31 + (((i32 & i9117) | i9118) * 560), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr1111);
                                        try {
                                            Object[] objArr1112 = {(String) objArr1111[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int absoluteGravity3 = 993 - Gravity.getAbsoluteGravity(0, 0);
                                                int threadPriority4 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                Object[] objArr1113 = new Object[1];
                                                c($$a[132], (byte) 52, (short) 140, objArr1113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, absoluteGravity3, threadPriority4, 410748506, false, (String) objArr1113[0], new Class[]{String.class});
                                            }
                                            jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1112)).longValue();
                                        } catch (Throwable th3) {
                                            Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    }
                                    long j14 = 959898726;
                                    long j15 = (((long) 960) * j14) + (((long) (-1917)) * jLongValue);
                                    long j16 = 959;
                                    long j17 = -1;
                                    long j18 = jLongValue ^ j17;
                                    long jMyPid3 = Process.myPid();
                                    long j19 = jMyPid3 ^ j17;
                                    j = j15 + ((((j18 | j19) ^ j17) | ((j14 | jMyPid3) ^ j17)) * j16) + (((long) (-959)) * j18) + (j16 * (((j18 | jMyPid3) ^ j17) | ((j19 | j14) ^ j17))) + ((long) (-1160816963));
                                    int i9119 = ~(1568780745 | i30);
                                    i44 = i4;
                                    int i10110 = ~(1288960139 | i44);
                                    i34 = ((int) (j >> 32)) & ((-334238508) + ((i9119 | i10110) * 1150) + (((~((-1288960140) | i30)) | i10110) * (-575)) + (((~(1568780745 | i44)) | (~((-1568780746) | i30))) * 575));
                                    int i10111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i35 = (i10111 ^ 39) + ((i10111 & 39) << 1);
                                    g = i35 % 128;
                                    if (i35 % 2 == 0) {
                                        throw null;
                                    }
                                    int i10112 = ((int) j) & ((-743136445) + (((~((-1048610) | i30)) | (~((-1714235973) | i44))) * (-302)) + ((~((-1048610) | i44)) * (-604)) + (((~((-1715284582) | i44)) | (-1992294144)) * 302));
                                    i9 = (i34 & i10112) | (i34 ^ i10112);
                                } else {
                                    i44 = i4;
                                    i12 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MiddleOutStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i13 = i12 * 522;
                                    i14 = g + 99;
                                    int i10113 = i14 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10113;
                                    if (i14 % 2 != 0) {
                                        int i10114 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 127);
                                        int i10115 = -(-((i10114 & i12) | (i12 ^ i10114)));
                                        int i10116 = (i13 + 12) >>> ((i10115 & (-1042)) + (i10115 | (-1042)));
                                        int i10117 = -(-(521 / ((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 127))));
                                        i15 = (i10116 ^ i10117) + ((i10116 & i10117) << 1);
                                    } else {
                                        int i10118 = ((i13 | (-66040)) << 1) - (i13 ^ (-66040));
                                        int i10119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i11110 = ~((i10119 & 127) | (i10119 ^ 127));
                                        int i11111 = ((i11110 & i12) | (i12 ^ i11110)) * (-1042);
                                        i15 = (i10118 & i11111) + (i11111 | i10118) + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 127) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 127)) * 521);
                                    }
                                    int i11112 = (i10113 & 89) + (i10113 | 89);
                                    int i11113 = i11112 % 128;
                                    g = i11113;
                                    int i11114 = i11112 % 2;
                                    int i11115 = ~i12;
                                    int i11116 = ~((i11115 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i11115 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                    int i11117 = ~((i11115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i11115 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    i16 = (i11117 & i11116) | (i11116 ^ i11117);
                                    int i11118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i17 = (i12 & i11118) | (i11118 ^ i12);
                                    i18 = i11113 + 21;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        int i11119 = ~((i17 & 127) | (i17 ^ 127));
                                        int i12110 = i15 * (521 << ((i11119 & i16) | (i16 ^ i11119)));
                                        Object[] objArr1114 = new Object[1];
                                        a(null, null, i12110, new byte[]{-102}, objArr1114);
                                        str3 = (String) objArr1114[0];
                                        i19 = -TextUtils.indexOf((CharSequence) "", (char) 31, 1);
                                    } else {
                                        Object[] objArr1115 = new Object[1];
                                        a(null, null, i15 + (521 * ((~(i17 | 127)) | i16)), new byte[]{-102}, objArr1115);
                                        str3 = (String) objArr1115[0];
                                        i19 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                    }
                                    i20 = (i19 * 319) - 39942;
                                    int i12111 = g;
                                    i21 = ((i12111 | 105) << 1) - (i12111 ^ 105);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
                                    if (i21 % 2 != 0) {
                                        int i12112 = ~i19;
                                        int i12113 = ~((i12112 & i44) | (i12112 ^ i44));
                                        i22 = i20 >>> ((-318) % ((i12113 & ComposerKt.defaultsKey) | ((-127) ^ i12113)));
                                        i23 = ~(((-127) ^ i44) | ((-127) & i44));
                                        i24 = (~i44) | i19;
                                    } else {
                                        int i12114 = ~i19;
                                        int i12115 = ~((i12114 & i44) | (i12114 ^ i44));
                                        i22 = i20 + (((i12115 & ComposerKt.defaultsKey) | ((-127) ^ i12115)) * (-318));
                                        i23 = ~(((-127) ^ i44) | ((-127) & i44));
                                        int i12116 = ~i44;
                                        i24 = (i12116 & i19) | (i12116 ^ i19);
                                    }
                                    i25 = i22 + (TypedValues.AttributesType.TYPE_PIVOT_TARGET * (i23 | (~(i24 | 126))));
                                    int i12117 = ~i44;
                                    int i12118 = (i12117 & ComposerKt.defaultsKey) | ((-127) ^ i12117);
                                    i26 = ~((i12118 & i19) | (i12118 ^ i19));
                                    i27 = (i12111 ^ 15) + ((i12111 & 15) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        int i12119 = (i19 & 126) | (i19 ^ 126);
                                        int i13110 = ~((i12119 & i44) | (i12119 ^ i44));
                                        Object[] objArr28 = new Object[1];
                                        a(null, null, i25 / (((i13110 & i26) | (i26 ^ i13110)) + TypedValues.AttributesType.TYPE_PIVOT_TARGET), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr28);
                                        try {
                                            objArr2 = new Object[]{(String) objArr28[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char scrollDefaultDelay5 = (char) (33602 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                int jumpTapTimeout4 = 3085 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                int iCombineMeasuredStates3 = 26 - View.combineMeasuredStates(0, 0);
                                                Object[] objArr29 = new Object[1];
                                                c($$a[132], (byte) 52, (short) 140, objArr29);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay5, jumpTapTimeout4, iCombineMeasuredStates3, 1411172903, false, (String) objArr29[0], new Class[]{String.class});
                                            }
                                            if (!str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2))) {
                                                i9 = 0;
                                            } else {
                                                i9 = 1;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    } else {
                                        int i13111 = (i19 & 126) | (i19 ^ 126);
                                        int i13112 = ~((i13111 & i44) | (i13111 ^ i44));
                                        Object[] objArr210 = new Object[1];
                                        a(null, null, i25 + (((i13112 & i26) | (i26 ^ i13112)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr210);
                                        try {
                                            objArr = new Object[]{(String) objArr210[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char scrollDefaultDelay6 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33602);
                                                int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3086;
                                                int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                                                Object[] objArr211 = new Object[1];
                                                c($$a[132], (byte) 52, (short) 140, objArr211);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay6, modifierMetaStateMask3, pressedStateDuration4, 1411172903, false, (String) objArr211[0], new Class[]{String.class});
                                            }
                                            if (!(!str3.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr)))) {
                                                i9 = 1;
                                            } else {
                                                i9 = 0;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i44 = i4;
                            i9 = 0;
                        }
                        int i13113 = -i9;
                        int i13114 = ((i9 & i13113) | (i9 ^ i13113)) >> 31;
                        int i13115 = (~i13114) & i44;
                        i10 = g + 3;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        int i13116 = i13114 & (i44 ^ 10);
                        int i13117 = (i13116 & i13115) | (i13115 ^ i13116);
                        if (i10 % 2 != 0) {
                            i11 = 36;
                        } else {
                            i11 = 32;
                        }
                        int i13118 = i5 & i11;
                        int i13119 = -i13118;
                        int i1412 = ((i13118 & i13119) | (i13118 ^ i13119)) >> 31;
                        int i1413 = i13117 & (~i1412);
                        int i1414 = i1412 & i44;
                        i8 = (i1413 & i1414) | (i1413 ^ i1414);
                    }
                    int i150 = (~i7) & i44;
                    int i151 = ~i44;
                    int i152 = i150 | (i7 & i151);
                    int i153 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    int i154 = i153 % 128;
                    g = i154;
                    int i155 = i153 % 2;
                    int i156 = -i152;
                    int i157 = ((i152 & i156) | (i152 ^ i156)) >> 31;
                    int i158 = i8 & (~i157);
                    int i159 = i157 & i7;
                    int i160 = (i158 & i159) | (i158 ^ i159);
                    Object[] objArr30 = new Object[4];
                    int i161 = (i154 & 79) + (i154 | 79);
                    int i162 = i161 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i162;
                    if (i161 % 2 != 0) {
                        objArr30[0] = new int[0];
                        objArr30[1] = new int[1];
                        objArr30[5] = new int[0];
                    } else {
                        objArr30[0] = new int[1];
                        objArr30[1] = new int[1];
                        objArr30[2] = new int[1];
                    }
                    int i163 = i44 ^ i160;
                    int i164 = ((i163 | (-i163)) >> 31) & 16;
                    ((int[]) objArr30[0])[0] = i44;
                    ((int[]) objArr30[2])[0] = i160;
                    objArr30[3] = null;
                    int i165 = ((i162 | 109) << 1) - (i162 ^ 109);
                    g = i165 % 128;
                    int i166 = i165 % 2;
                    int i167 = (((~(i44 | (-952768934))) * TypedValues.CycleType.TYPE_EASING) - 1707993224) + (((~((-952768934) | i151)) | 53552730) * TypedValues.CycleType.TYPE_EASING);
                    int i168 = (i6 - (~(-(-(((i167 | i164) << 1) - (i164 ^ i167)))))) - 1;
                    int i169 = i168 << 13;
                    int i170 = (i168 | i169) & (~(i168 & i169));
                    int i171 = i162 + 67;
                    g = i171 % 128;
                    if (i171 % 2 == 0) {
                        int i172 = (i170 ^ 17) + ((i170 & 17) << 1);
                        int i173 = (i170 | i172) & (~(i170 & i172));
                        int i174 = i173 >>> 2;
                        ((int[]) objArr30[1])[0] = ((~i173) & i174) | ((~i174) & i173);
                    } else {
                        int i175 = i170 >>> 17;
                        int i176 = (i170 | i175) & (~(i170 & i175));
                        int i177 = i176 << 5;
                        ((int[]) objArr30[1])[0] = ((~i176) & i177) | ((~i177) & i176);
                    }
                    return objArr30;
                } catch (Throwable th6) {
                    Throwable cause6 = th6.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th6;
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
            private static java.lang.String $$e(int r6, short r7, byte r8) {
                /*
                    int r6 = r6 + 67
                    int r7 = r7 + 4
                    byte[] r0 = com.android.volley.toolbox.ImageLoader.AnonymousClass3.$$c
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r7
                    r4 = r2
                    goto L29
                L12:
                    r3 = r2
                L13:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    if (r3 != r8) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L22:
                    r4 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L29:
                    int r6 = -r6
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.ImageLoader.AnonymousClass3.$$e(int, short, byte):java.lang.String");
            }
        });
        int i4 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return imageRequest;
        }
        throw null;
    }

    public void setBatchedResponseDelay(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        this.mBatchResponseDelayMs = i;
        int i6 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    protected void onGetImageSuccess(String str, Bitmap bitmap) {
        int i = 2 % 2;
        this.mCache.putBitmap(str, bitmap);
        BatchedImageRequest batchedImageRequestRemove = this.mInFlightRequests.remove(str);
        if (batchedImageRequestRemove != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            batchedImageRequestRemove.mResponseBitmap = bitmap;
            batchResponse(str, batchedImageRequestRemove);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    protected void onGetImageError(String str, VolleyError volleyError) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BatchedImageRequest batchedImageRequestRemove = this.mInFlightRequests.remove(str);
        if (batchedImageRequestRemove != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                batchedImageRequestRemove.setError(volleyError);
                batchResponse(str, batchedImageRequestRemove);
            } else {
                batchedImageRequestRemove.setError(volleyError);
                batchResponse(str, batchedImageRequestRemove);
                throw null;
            }
        }
    }

    private void batchResponse(String str, BatchedImageRequest batchedImageRequest) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.mBatchedResponses.put(str, batchedImageRequest);
        if (this.mRunnable == null) {
            Runnable runnable = new Runnable() { // from class: com.android.volley.toolbox.ImageLoader.4
                @Override // java.lang.Runnable
                public void run() {
                    for (BatchedImageRequest batchedImageRequest2 : ImageLoader.access$200(ImageLoader.this).values()) {
                        for (ImageContainer imageContainer : batchedImageRequest2.mContainers) {
                            if (imageContainer.mListener != null) {
                                if (batchedImageRequest2.getError() == null) {
                                    imageContainer.mBitmap = batchedImageRequest2.mResponseBitmap;
                                    imageContainer.mListener.onResponse(imageContainer, false);
                                } else {
                                    imageContainer.mListener.onErrorResponse(batchedImageRequest2.getError());
                                }
                            }
                        }
                    }
                    ImageLoader.access$200(ImageLoader.this).clear();
                    ImageLoader.access$602(ImageLoader.this, null);
                }
            };
            this.mRunnable = runnable;
            this.mHandler.postDelayed(runnable, this.mBatchResponseDelayMs);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static String getCacheKey(String str, int i, int i2, ImageView.ScaleType scaleType) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        String string = sb.toString();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return string;
    }

    private static String $$g(short s, byte b, int i) {
        int i2 = 107 - (i * 3);
        int i3 = b * 3;
        byte[] bArr = $$c;
        int i4 = 3 - (s * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 += -i5;
        }
        while (true) {
            i6++;
            i4++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i4];
        }
    }
}
