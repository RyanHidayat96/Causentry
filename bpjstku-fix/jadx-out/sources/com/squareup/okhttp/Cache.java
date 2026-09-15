package com.squareup.okhttp;

import RotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.collection.SieveCacheKt;
import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.StatusLine;
import com.squareup.okhttp.internal.io.FileSystem;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.getBrightness;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.tryToComplete;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes6.dex */
public final class Cache {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {118, 35, -100, -35, -41, -9, -7, -21, -8, 9, -9, -18, -1, 10, -42, -5, 4, -3, -10, -10, -22, 38, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = 99;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 118;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 52222, 17888, 57290, 22979, 54217, 28080, 59366, 24979, 64387, 30154, 36683, 2421, 33651, 7488, 38733, 4401, 43795, 9512, 48919, 14607, 45835, 45561, 52220, 17893, 57288, 23007, 54213, 28080, 59290, 24985, 64401, 30088, 36716, 2405, 33645, 7505, 45565, 52222, 17888, 57290, 22979, 54217, 28080, 59366, 24989, 64384, 30100, 36662, 2381, 33635, 7488, 38721, 4394, 43833, 9520, 48897, 14648, 45832, 52454, 18157, 49373, 23252, 45567, 52197, 17910, 57290, 22985, 54222, 28064, 59273, 24972, 64384, 30088, 36721, 2415, 33633, 7488, 38721, 4403, 43838, 45558, 52209, 17906, 57305, 22914, 54220, 28085, 59302, 24987, 64478, 30135, 36705, 2431, 33652, 7505, 38725, 45557, 52212, 17889, 57302, 23000, 54217, 28064, 59313, 25012, 64401, 30103, 36720, 2383, 33647, 7504, 38733};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1042706480375581584L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r9 = r9 * 52
            int r9 = 55 - r9
            byte[] r0 = com.squareup.okhttp.Cache.$$a
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-10)
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Cache.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = r8 + 68
            int r7 = r7 * 11
            int r0 = r7 + 42
            byte[] r1 = com.squareup.okhttp.Cache.$$d
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 41
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Cache.d(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x021a  */
    /* JADX WARN: Code duplicated, block: B:49:0x021b  */
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
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 2;
                    byte b2 = (byte) (b - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2186, 'X' - AndroidCharacter.getMirror('0'), 841711447, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 33017), 3012 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 26, 321985076, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 3376, (-16777199) - Color.rgb(0, 0, 0), -968507904, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 81;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 57;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 1;
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + 36505), 3424 - AndroidCharacter.getMirror('0'), 17 - View.MeasureSpec.getMode(0), -968507904, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b9 = (byte) 1;
                byte b10 = (byte) (b9 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 36506), ExpandableListView.getPackedPositionGroup(j) + 3376, 17 - TextUtils.indexOf("", ""), -968507904, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    static /* synthetic */ CacheRequest access$000(Cache cache, Response response) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            cache.put(response);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CacheRequest cacheRequestPut = cache.put(response);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return cacheRequestPut;
    }

    static /* synthetic */ void access$100(Cache cache, Request request) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        cache.remove(request);
        if (i3 == 0) {
            throw null;
        }
    }

    static /* synthetic */ int access$1000(RotationProvider1 rotationProvider1) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = readInt(rotationProvider1);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    static /* synthetic */ void access$200(Cache cache, Response response, Response response2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        cache.update(response, response2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void access$300(Cache cache) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        cache.trackConditionalCacheHit();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    static /* synthetic */ void access$400(Cache cache, CacheStrategy cacheStrategy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        cache.trackResponse(cacheStrategy);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ DiskLruCache access$600(Cache cache) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        DiskLruCache diskLruCache = cache.cache;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return diskLruCache;
    }

    static /* synthetic */ int access$808(Cache cache) {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        if (i3 % 2 == 0) {
            i = cache.writeSuccessCount;
            cache.writeSuccessCount = i;
        } else {
            i = cache.writeSuccessCount;
            cache.writeSuccessCount = i + 1;
        }
        int i5 = i4 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return i;
    }

    static /* synthetic */ int access$908(Cache cache) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i4 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            i = cache.writeAbortCount;
            i2 = i >>> 1;
        } else {
            i = cache.writeAbortCount;
            i2 = i + 1;
        }
        cache.writeAbortCount = i2;
        int i6 = i4 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() { // from class: com.squareup.okhttp.Cache.1
            @Override // com.squareup.okhttp.internal.InternalCache
            public Response get(Request request) throws IOException {
                return Cache.this.get(request);
            }

            @Override // com.squareup.okhttp.internal.InternalCache
            public CacheRequest put(Response response) throws IOException {
                return Cache.access$000(Cache.this, response);
            }

            @Override // com.squareup.okhttp.internal.InternalCache
            public void remove(Request request) throws IOException {
                Cache.access$100(Cache.this, request);
            }

            @Override // com.squareup.okhttp.internal.InternalCache
            public void update(Response response, Response response2) throws IOException {
                Cache.access$200(Cache.this, response, response2);
            }

            @Override // com.squareup.okhttp.internal.InternalCache
            public void trackConditionalCacheHit() {
                Cache.access$300(Cache.this);
            }

            @Override // com.squareup.okhttp.internal.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.access$400(Cache.this, cacheStrategy);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    private static String urlToKey(Request request) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String strMd5Hex = Util.md5Hex(request.urlString());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return strMd5Hex;
    }

    final Response get(Request request) {
        int i = 2 % 2;
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(urlToKey(request));
            if (snapshot == null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(request, snapshot);
                if (!(!entry.matches(request, response))) {
                    return response;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    private CacheRequest put(Response response) throws IOException {
        DiskLruCache.Editor editorEdit;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String strMethod = response.request().method();
        Object obj = null;
        if (HttpMethod.invalidatesCache(response.request().method())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    remove(response.request());
                    return null;
                }
                remove(response.request());
                obj.hashCode();
                throw null;
            } catch (IOException unused) {
            }
        } else {
            if ((!strMethod.equals(ShareTarget.METHOD_GET)) || OkHeaders.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editorEdit = this.cache.edit(urlToKey(response.request()));
                if (editorEdit != null) {
                    try {
                        entry.writeTo(editorEdit);
                        return new CacheRequestImpl(editorEdit);
                    } catch (IOException unused2) {
                        abortQuietly(editorEdit);
                        return null;
                    }
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 86 / 0;
                }
                return null;
            } catch (IOException unused3) {
                editorEdit = null;
            }
        }
    }

    private void remove(Request request) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.cache.remove(urlToKey(request));
            obj.hashCode();
            throw null;
        }
        this.cache.remove(urlToKey(request));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void update(Response response, Response response2) {
        DiskLruCache.Editor editorEdit;
        int i = 2 % 2;
        Entry entry = new Entry(response2);
        try {
            editorEdit = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editorEdit != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                try {
                    entry.writeTo(editorEdit);
                    editorEdit.commit();
                } catch (IOException unused) {
                    abortQuietly(editorEdit);
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 5 % 3;
                    }
                }
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        int i = 2 % 2;
        if (editor != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    editor.abort();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    editor.abort();
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } catch (IOException unused) {
            }
        }
    }

    public final void initialize() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.cache.initialize();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void delete() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.cache.delete();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void evictAll() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.cache.evictAll();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Iterator<String> urls() throws IOException {
        int i = 2 % 2;
        Iterator<String> it = new Iterator<String>() { // from class: com.squareup.okhttp.Cache.2
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            String nextUrl;

            {
                this.delegate = Cache.access$600(Cache.this).snapshots();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next.getSource(0)).IconCompatParcelizer();
                        next.close();
                        return true;
                    } catch (IOException unused) {
                        next.close();
                    } catch (Throwable th) {
                        next.close();
                        throw th;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.nextUrl;
                this.nextUrl = null;
                this.canRemove = true;
                return str;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (!this.canRemove) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.delegate.remove();
            }
        };
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return it;
    }

    public final int getWriteAbortCount() {
        int i;
        synchronized (this) {
            i = this.writeAbortCount;
        }
        return i;
    }

    public final int getWriteSuccessCount() {
        int i;
        synchronized (this) {
            i = this.writeSuccessCount;
        }
        return i;
    }

    public final long getSize() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        long size = this.cache.size();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final long getMaxSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        long maxSize = this.cache.getMaxSize();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return maxSize;
    }

    public final void flush() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.cache.flush();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    final class CacheRequestImpl implements CacheRequest {
        private SurfaceViewImplementationApi24Impl body;
        private SurfaceViewImplementationApi24Impl cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;

        public CacheRequestImpl(final DiskLruCache.Editor editor) throws IOException {
            this.editor = editor;
            this.cacheOut = editor.newSink(1);
            this.body = new getBrightness(this.cacheOut) { // from class: com.squareup.okhttp.Cache.CacheRequestImpl.1
                @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (Cache.this) {
                        if (CacheRequestImpl.this.done) {
                            return;
                        }
                        CacheRequestImpl.this.done = true;
                        Cache.access$808(Cache.this);
                        super.close();
                        editor.commit();
                    }
                }
            };
        }

        @Override // com.squareup.okhttp.internal.http.CacheRequest
        public final void abort() {
            synchronized (Cache.this) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache.access$908(Cache.this);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.squareup.okhttp.internal.http.CacheRequest
        public final SurfaceViewImplementationApi24Impl body() {
            return this.body;
        }
    }

    static final class Entry {
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final String url;
        private final Headers varyHeaders;

        public Entry(tryToComplete trytocomplete) throws IOException {
            try {
                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trytocomplete);
                this.url = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
                this.requestMethod = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
                Headers.Builder builder = new Headers.Builder();
                int iAccess$1000 = Cache.access$1000(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                for (int i = 0; i < iAccess$1000; i++) {
                    builder.addLenient(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.parse(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int iAccess$1001 = Cache.access$1000(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                for (int i2 = 0; i2 < iAccess$1001; i2++) {
                    builder2.addLenient(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                }
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strIconCompatParcelizer = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
                    if (strIconCompatParcelizer.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(strIconCompatParcelizer);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                    this.handshake = Handshake.get(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer(), readCertificateList(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3), readCertificateList(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                } else {
                    this.handshake = null;
                }
                trytocomplete.close();
            } catch (Throwable th) {
                trytocomplete.close();
                throw th;
            }
        }

        public Entry(Response response) {
            this.url = response.request().urlString();
            this.varyHeaders = OkHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(editor.newSink(0));
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.url);
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.requestMethod);
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.a(this.varyHeaders.size());
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.varyHeaders.name(i));
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ");
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.varyHeaders.value(i));
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            }
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new StatusLine(this.protocol, this.code, this.message).toString());
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.a(this.responseHeaders.size());
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.responseHeaders.name(i2));
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ");
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.responseHeaders.value(i2));
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            }
            if (isHttps()) {
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.handshake.cipherSuite());
                rotationProviderListenerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                writeCertList(rotationProviderListenerTuitionPaymentFragmentbindingInflater1, this.handshake.peerCertificates());
                writeCertList(rotationProviderListenerTuitionPaymentFragmentbindingInflater1, this.handshake.localCertificates());
            }
            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(RotationProvider1 rotationProvider1) throws IOException {
            int iAccess$1000 = Cache.access$1000(rotationProvider1);
            if (iAccess$1000 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iAccess$1000);
                for (int i = 0; i < iAccess$1000; i++) {
                    String strIconCompatParcelizer = rotationProvider1.IconCompatParcelizer();
                    RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                    ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strIconCompatParcelizer);
                    Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    arrayList.add(certificateFactory.generateCertificate(rotationProviderListenerWrapper.new TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private void writeCertList(RotationProviderListener rotationProviderListener, List<Certificate> list) throws IOException {
            try {
                rotationProviderListener.a(list.size());
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString.TuitionPaymentFragmentbindingInflater1(list.get(i).getEncoded()).b());
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            return this.url.equals(request.urlString()) && this.requestMethod.equals(request.method()) && OkHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(Request request, DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get(HttpHeaderParser.HEADER_CONTENT_TYPE);
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).build();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x023d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0247  */
    /* JADX WARN: Code duplicated, block: B:28:0x0254  */
    /* JADX WARN: Code duplicated, block: B:31:0x025e  */
    public final void close() throws Throwable {
        Object[] objArr;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
            int mirror = 969 - AndroidCharacter.getMirror('0');
            int packedPositionType = 28 - ExpandableListView.getPackedPositionType(0L);
            byte b = (byte) ($$b & 189);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, mirror, packedPositionType, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(Color.green(0), KeyEvent.keyCodeFromString("") + 22, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(KeyEvent.keyCodeFromString("") + 22, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 1), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 31534);
            int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iArgb = Color.argb(0, 0, 0, 0) + 28;
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, scrollDefaultDelay, iArgb, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31533);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                byte b4 = (byte) (-bArr2[33]);
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay2, iCombineMeasuredStates, iKeyCodeFromString, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i8}, (String[]) objArr7[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i9 = ~iMaxMemory;
            int i10 = 81443043 + (((~((-992159470) | i9)) | 704849580) * 168) + ((~((-704849581) | iMaxMemory)) * 168) + (((~(iMaxMemory | (-287309890))) | (~(i9 | (-781920175))) | 77070594) * 168) + 216557608;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c((-16777179) - Color.rgb(0, 0, 0), 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(Process.getGidForName("") + 64, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                int i16 = i15 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
                if (i15 % 2 != 0) {
                    int i17 = 82 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        i = i16 + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                        if (i % 2 == 0) {
                            int i18 = 87 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    i = i16 + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                    if (i % 2 == 0) {
                        int i19 = 87 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(80 - TextUtils.indexOf((CharSequence) "", '0', 0), 16 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 96, Gravity.getAbsoluteGravity(0, 0) + 16, (char) Color.green(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
            int i21 = i20 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 216557608};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[12];
                byte b7 = bArr3[55];
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = (byte) (bArr3[44] - 1);
                byte b9 = bArr3[78];
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 31533);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                    byte[] bArr4 = $$a;
                    byte b10 = (byte) (-bArr4[33]);
                    byte b11 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    a(b10, b11, b11, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, deadChar, capsMode, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(TextUtils.getCapsMode("", 0, 0), 22 - View.combineMeasuredStates(0, 0), (char) Color.alpha(0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(AndroidCharacter.getMirror('0') - 26, 15 - (Process.myTid() >> 22), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                        int i22 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
                        int i23 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b12, b12, bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType2, i22, i23, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                        int iAlpha = Color.alpha(0) + 28;
                        byte b13 = (byte) ($$b & 189);
                        byte b14 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        a(b13, b14, b14, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, iLastIndexOf, iAlpha, -1048449946, false, (String) objArr20[0], null);
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
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[3])[0];
        if (i25 != i24) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i5 < strArr.length) {
                    arrayList.add(strArr[i5]);
                    i5++;
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                    int i27 = i26 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i25));
        }
        int i28 = ((int[]) objArr[0])[0];
        int i29 = ((int[]) objArr[3])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i29}, (String[]) objArr[4]};
        int iMyTid = Process.myTid();
        int i30 = i28 + 2106421723 + (((~((-1359729458) | iMyTid)) | 268587808) * 576) + (((~((~iMyTid) | (-1091141650))) | 145762378) * 576) + 87754752;
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr21[0])[0] = i32 ^ (i32 << 5);
        this.cache.close();
    }

    public final File getDirectory() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        File directory = this.cache.getDirectory();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return directory;
        }
        throw null;
    }

    public final boolean isClosed() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsClosed = this.cache.isClosed();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zIsClosed;
    }

    private void trackResponse(CacheStrategy cacheStrategy) {
        synchronized (this) {
            this.requestCount++;
            if (cacheStrategy.networkRequest != null) {
                this.networkCount++;
            } else if (cacheStrategy.cacheResponse != null) {
                this.hitCount++;
            }
        }
    }

    private void trackConditionalCacheHit() {
        synchronized (this) {
            this.hitCount++;
        }
    }

    public final int getNetworkCount() {
        int i;
        synchronized (this) {
            i = this.networkCount;
        }
        return i;
    }

    public final int getHitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int getRequestCount() {
        int i;
        synchronized (this) {
            i = this.requestCount;
        }
        return i;
    }

    static class CacheResponseBody extends ResponseBody {
        private final RotationProvider1 bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(final DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new RotationProviderListenerWrapperExternalSyntheticLambda0(snapshot.getSource(1)) { // from class: com.squareup.okhttp.Cache.CacheResponseBody.1
                @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    snapshot.close();
                    super.close();
                }
            });
        }

        @Override // com.squareup.okhttp.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // com.squareup.okhttp.ResponseBody
        public long contentLength() {
            try {
                String str = this.contentLength;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.squareup.okhttp.ResponseBody
        public RotationProvider1 source() {
            return this.bodySource;
        }
    }

    private static int readInt(RotationProvider1 rotationProvider1) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        try {
            long jINotificationSideChannel = rotationProvider1.INotificationSideChannel();
            String strIconCompatParcelizer = rotationProvider1.IconCompatParcelizer();
            if (jINotificationSideChannel >= 0) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                if (jINotificationSideChannel <= SieveCacheKt.NodeLinkMask && !(!strIconCompatParcelizer.isEmpty())) {
                    int i6 = (int) jINotificationSideChannel;
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    if (i7 % 2 == 0) {
                        return i6;
                    }
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("expected an int but was \"");
            sb.append(jINotificationSideChannel);
            sb.append(strIconCompatParcelizer);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
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
    private static java.lang.String $$g(short r7, short r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r0 = com.squareup.okhttp.Cache.$$c
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r9 = r9 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Cache.$$g(short, short, byte):java.lang.String");
    }
}
