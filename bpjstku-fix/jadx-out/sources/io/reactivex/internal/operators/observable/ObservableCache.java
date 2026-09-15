package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.identity.zzp;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.notifySuspended;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableCache<T> extends notifySuspended<T, T> implements deriveMediaType<T> {
    static final CacheDisposable[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CacheDisposable[0];
    private static CacheDisposable[] b = new CacheDisposable[0];
    private TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> INotificationSideChannel;
    final AtomicReference<CacheDisposable<T>[]> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f1209a;
    private volatile boolean asBinder;
    private volatile long asInterface;
    private int cancel;
    private Throwable d;
    private int g;

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
    }

    public ObservableCache(VideoRecordEventStart<T> videoRecordEventStart, int i) {
        super(videoRecordEventStart);
        this.g = i;
        this.f1209a = new AtomicBoolean();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.INotificationSideChannel = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicReference<>(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final deriveMediaType<? super T> downstream;
        long index;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> node;
        int offset;
        final ObservableCache<T> parent;
        private static final byte[] $$c = {77, -106, 83, 4};
        private static final int $$d = 204;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {27, 65, -33, 120, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 73;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {61624, 62014, 62895, 63280, 64146, 64541, 65419, 57672, 58610, 58983, 59885, 60238, 61136, 53314, 54227, 55024, 55306, 56239, 56597, 49286, 49672, 50588, 51051, 28702, 29333, 29983, 30627, 31277, 31908, 32547, 25007, 25682, 26313, 26967, 27635, 28282, 20706, 21326, 22032, 22671, 23311, 45565, 45947, 46314, 46709, 48087, 48472, 48846, 40973, 42423, 42786, 43176, 43531, 44949, 37127, 37526, 38837, 39292, 39656, 39952, 33270, 33624, 34001, 34358, 35770, 36135, 36508, 61442, 62854, 63247, 63607, 64987, 65381, 57562, 57946, 26942, 27581, 27691, 28324, 25359, 36826, 36121, 35475, 34829, 34302, 33585, 32941, 40483, 39881, 39179, 38595, 38010, 37362, 44900, 44198, 43414, 42752, 42126, 41506, 49081, 48422, 47785, 47185, 46550, 45896, 45242, 52845, 52197, 65398, 29723, 30351, 29013, 29590, 32296, 30886, 31530, 26033, 24646, 25305, 27985, 28646, 27232};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 7930954529874752277L;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = 144 - r5
                int r6 = r6 * 14
                int r6 = r6 + 84
                int r0 = r7 + 1
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r6
                r6 = r7
                r4 = r2
                goto L27
            L13:
                r3 = r2
            L14:
                int r5 = r5 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L25:
                r3 = r1[r5]
            L27:
                int r6 = r6 + r3
                int r6 = r6 + (-11)
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCache.CacheDisposable.c(int, int, short, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.getDefaultSize(0, 0), (-16775029) - Color.rgb(0, 0, 0), 40 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - TextUtils.lastIndexOf("", '0', 0, 0)), 3010 - TextUtils.indexOf((CharSequence) "", '0', 0), 26 - (ViewConfiguration.getLongPressTimeout() >> 16), 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - ExpandableListView.getPackedPositionChild(0L)), 3376 - TextUtils.getTrimmedLength(""), 17 - View.getDefaultSize(0, 0), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i5 = $10 + 95;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36505), (ViewConfiguration.getTouchSlop() >> 8) + 3376, 17 - Color.argb(0, 0, 0, 0), -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i7 = $10 + 113;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr);
        }

        CacheDisposable(deriveMediaType<? super T> derivemediatype, ObservableCache<T> observableCache) {
            this.downstream = derivemediatype;
            this.parent = observableCache;
            this.node = observableCache.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            CacheDisposable<T>[] cacheDisposableArr;
            CacheDisposable[] cacheDisposableArr2;
            int i = 2 % 2;
            if (this.disposed) {
                return;
            }
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.disposed = true;
            ObservableCache<T> observableCache = this.parent;
            do {
                cacheDisposableArr = observableCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                int length = cacheDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i4 = -1;
                        break;
                    }
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i6 = i5 + 53;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    if (cacheDisposableArr[i4] == this) {
                        break;
                    }
                    int i8 = i5 + 49;
                    b = i8 % 128;
                    i4 = i8 % 2 != 0 ? i4 + 11 : i4 + 1;
                    int i9 = i5 + 121;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (i4 < 0) {
                    return;
                }
                if (length == 1) {
                    cacheDisposableArr2 = ObservableCache.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                    System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i4);
                    System.arraycopy(cacheDisposableArr, i4 + 1, cacheDisposableArr3, i4, (length - i4) - 1);
                    cacheDisposableArr2 = cacheDisposableArr3;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(observableCache.TuitionPaymentFragmentspecialinlinedviewModeldefault1, cacheDisposableArr, cacheDisposableArr2));
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = b + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.disposed;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x08cc  */
        /* JADX WARN: Code duplicated, block: B:110:0x03ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x03a5  */
        /* JADX WARN: Code duplicated, block: B:32:0x03ab  */
        /* JADX WARN: Code duplicated, block: B:35:0x03b4 A[Catch: Exception -> 0x0798, TRY_LEAVE, TryCatch #0 {Exception -> 0x0798, blocks: (B:33:0x03ae, B:35:0x03b4, B:37:0x042d, B:43:0x04e5, B:45:0x053e, B:47:0x0544, B:48:0x0545, B:49:0x0546, B:53:0x060d, B:61:0x0684, B:65:0x06c1, B:67:0x06eb, B:72:0x0761, B:83:0x0790, B:85:0x0796, B:86:0x0797, B:66:0x06cc, B:38:0x0445, B:40:0x0452, B:41:0x0497, B:68:0x0707, B:70:0x0714, B:71:0x075a), top: B:110:0x03ae, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0452 A[Catch: all -> 0x053d, TryCatch #1 {all -> 0x053d, blocks: (B:38:0x0445, B:40:0x0452, B:41:0x0497), top: B:111:0x0445, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0546 A[Catch: Exception -> 0x0798, TRY_LEAVE, TryCatch #0 {Exception -> 0x0798, blocks: (B:33:0x03ae, B:35:0x03b4, B:37:0x042d, B:43:0x04e5, B:45:0x053e, B:47:0x0544, B:48:0x0545, B:49:0x0546, B:53:0x060d, B:61:0x0684, B:65:0x06c1, B:67:0x06eb, B:72:0x0761, B:83:0x0790, B:85:0x0796, B:86:0x0797, B:66:0x06cc, B:38:0x0445, B:40:0x0452, B:41:0x0497, B:68:0x0707, B:70:0x0714, B:71:0x075a), top: B:110:0x03ae, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x05fd  */
        /* JADX WARN: Code duplicated, block: B:55:0x0612  */
        /* JADX WARN: Code duplicated, block: B:58:0x0643  */
        /* JADX WARN: Code duplicated, block: B:59:0x065f  */
        /* JADX WARN: Code duplicated, block: B:64:0x06b9  */
        /* JADX WARN: Code duplicated, block: B:66:0x06cc A[Catch: Exception -> 0x0798, TryCatch #0 {Exception -> 0x0798, blocks: (B:33:0x03ae, B:35:0x03b4, B:37:0x042d, B:43:0x04e5, B:45:0x053e, B:47:0x0544, B:48:0x0545, B:49:0x0546, B:53:0x060d, B:61:0x0684, B:65:0x06c1, B:67:0x06eb, B:72:0x0761, B:83:0x0790, B:85:0x0796, B:86:0x0797, B:66:0x06cc, B:38:0x0445, B:40:0x0452, B:41:0x0497, B:68:0x0707, B:70:0x0714, B:71:0x075a), top: B:110:0x03ae, inners: #1, #3 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0714 A[Catch: all -> 0x078f, TryCatch #3 {all -> 0x078f, blocks: (B:68:0x0707, B:70:0x0714, B:71:0x075a), top: B:115:0x0707, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0767  */
        /* JADX WARN: Code duplicated, block: B:76:0x0777  */
        /* JADX WARN: Code duplicated, block: B:77:0x0779  */
        /* JADX WARN: Code duplicated, block: B:79:0x077c  */
        /* JADX WARN: Code duplicated, block: B:81:0x078c  */
        /* JADX WARN: Code duplicated, block: B:90:0x07b2  */
        /* JADX WARN: Code duplicated, block: B:92:0x07c3  */
        /* JADX WARN: Code duplicated, block: B:93:0x07cd  */
        public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            String str;
            int i13;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int iArgb;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i30;
            int i31;
            int i32;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i33 = 2 % 2;
            int i34 = b + 57;
            int i35 = i34 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35;
            if (i34 % 2 == 0) {
                throw null;
            }
            if (context != null) {
                int i36 = (i35 & 103) + (i35 | 103);
                b = i36 % 128;
                int i37 = i36 % 2;
                try {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i38 = iIndexOf * (-949);
                    int i39 = (i38 ^ (-949)) + ((i38 & (-949)) << 1);
                    int i40 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i41 = ~((i40 & (-2)) | ((-2) ^ i40));
                    int i42 = ~((~iIndexOf) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i43 = i39 + (((i41 & i42) | (i41 ^ i42)) * 1900);
                    int i44 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i45 = -(-(((~((i44 ^ iIndexOf) | (i44 & iIndexOf))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 1) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 1)))) * (-950)));
                    int i46 = ~((i44 & 1) | (i44 ^ 1));
                    int i47 = ~((iIndexOf & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iIndexOf ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i48 = (((i43 & i45) + (i43 | i45)) - (~(-(-(((i47 & i46) | (i46 ^ i47)) * 950))))) - 1;
                    int i49 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i50 = i49 * 85;
                    int i51 = (i50 & 1955) + (i50 | 1955);
                    int i52 = ~i49;
                    int i53 = ~((i52 & (-24)) | (i52 ^ (-24)));
                    int i54 = ~i49;
                    int i55 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i56 = ~((i54 ^ i55) | (i54 & i55));
                    int i57 = (i53 ^ i56) | (i53 & i56);
                    int i58 = ~((-24) | i55);
                    int i59 = (i57 ^ i58) | (i57 & i58);
                    int i60 = i49 | 23;
                    int i61 = ~((i60 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i60 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i62 = (i51 - (~(-(-(((i61 & i59) | (i59 ^ i61)) * (-84)))))) - 1;
                    int i63 = ~(((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-24) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    int i64 = (i49 & i63) | (i49 ^ i63);
                    int i65 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i66 = ~((i65 & 23) | (i65 ^ 23));
                    int i67 = -(-(((i64 & i66) | (i64 ^ i66)) * (-84)));
                    int i68 = ((i62 | i67) << 1) - (i67 ^ i62);
                    int i69 = ~((i55 & 23) | (i55 ^ 23));
                    int i70 = ~i60;
                    int i71 = i68 + (((i69 & i70) | (i69 ^ i70)) * 84);
                    int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i72 = (scrollBarFadeDuration * 221) - 3659271;
                    int i73 = ~scrollBarFadeDuration;
                    int i74 = ~((i73 & (-16710)) | (i73 ^ (-16710)));
                    int i75 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i76 = (i75 & scrollBarFadeDuration) | (i75 ^ scrollBarFadeDuration);
                    int i77 = ~((i76 & 16709) | (i76 ^ 16709));
                    int i78 = ((i74 & i77) | (i74 ^ i77)) * 220;
                    int i79 = (i72 ^ i78) + ((i72 & i78) << 1);
                    int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i81 = ~((i80 & 16709) | (i80 ^ 16709));
                    char c = (char) (((i79 + (((i81 & scrollBarFadeDuration) | (scrollBarFadeDuration ^ i81)) * (-440))) - (~(-(-((((scrollBarFadeDuration & 16709) | (scrollBarFadeDuration ^ 16709)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4) * 220))))) - 1);
                    Object[] objArr2 = new Object[1];
                    a(i48, i71, c, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int i82 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i83 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i84 = ((i83 | 18) << 1) - (i83 ^ 18);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i85 = iIndexOf2 * 866;
                    int i86 = (i85 ^ (-42887232)) + ((i85 & (-42887232)) << 1);
                    int i87 = ~iIndexOf2;
                    int i88 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                    int i89 = ~((i87 & i88) | (i87 ^ i88));
                    int i90 = (((-49639) ^ i89) | (i89 & (-49639))) * (-865);
                    int i91 = (i86 & i90) + (i90 | i86);
                    int i92 = -(-((~((iIndexOf2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iIndexOf2 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 865));
                    int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                    int i94 = ~(((-49639) & i88) | ((-49639) ^ i88));
                    int i95 = ~(iIndexOf2 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                    int i96 = -(-(((i95 & i94) | (i94 ^ i95)) * 865));
                    Object[] objArr3 = new Object[1];
                    a(i82, i84, (char) (((i93 | i96) << 1) - (i96 ^ i93)), objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 41;
                    int i97 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i98 = i97 * (-167);
                    int i99 = (i98 ^ (-5511)) + ((i98 & (-5511)) << 1);
                    int i100 = ~i97;
                    int i101 = ((~((i100 & (-34)) | (i100 ^ (-34)))) | (~(((-34) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-34) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * 336;
                    int i102 = ((i99 | i101) << 1) - (i101 ^ i99);
                    int i103 = ~((i97 ^ 33) | (i97 & 33));
                    int i104 = ~(i97 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i105 = ((i103 & i104) | (i103 ^ i104)) * (-168);
                    int i106 = (i102 ^ i105) + ((i105 & i102) << 1);
                    int i107 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i108 = ~((i97 & i107) | (i107 ^ i97));
                    int i109 = -(-(((i108 & (-34)) | ((-34) ^ i108)) * 168));
                    Object[] objArr4 = new Object[1];
                    a(offsetBefore, (i106 & i109) + (i109 | i106), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 75;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 6;
                    int i110 = -(Process.myPid() >> 22);
                    int i111 = i110 * (-445);
                    int i112 = (i111 & (-24693940)) + (i111 | (-24693940));
                    int i113 = ~i110;
                    int i114 = ~(((-55493) & i113) | (i113 ^ (-55493)));
                    int i115 = ~i;
                    int i116 = ~(((-55493) ^ i115) | (i115 & (-55493)));
                    int i117 = -(-(((i114 ^ i116) | (i114 & i116)) * 446));
                    int i118 = (i112 ^ i117) + ((i117 & i112) << 1);
                    int i119 = ~i110;
                    int i120 = ~((i119 ^ 55492) | (i119 & 55492));
                    int i121 = ~(i110 | (-55493) | i);
                    char c2 = (char) ((((i118 - (~(-(-(((i121 & i120) | (i120 ^ i121)) * 446))))) - 1) - (~((~(i113 | (-55493))) * 446))) - 1);
                    Object[] objArr5 = new Object[1];
                    a(keyRepeatTimeout, iLastIndexOf, c2, objArr5);
                    int i122 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i123 = -i122;
                    int i124 = ((i122 & i123) | (i122 ^ i123)) >> 31;
                    i4 = (i124 & (~(i & 1)) & (i | 1)) | ((~i124) & i);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16950);
                    int scrollBarSize = 2739 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int mode = View.MeasureSpec.getMode(0) + 13;
                    byte b2 = $$a[7];
                    Object[] objArr6 = new Object[1];
                    c((short) 141, b2, (byte) (b2 | 52), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, scrollBarSize, mode, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (16950 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int keyRepeatTimeout2 = 2739 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i125 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12;
                    short s = (short) ($$b | 16);
                    byte b3 = $$a[7];
                    Object[] objArr7 = new Object[1];
                    c(s, b3, (byte) (b3 | 52), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, keyRepeatTimeout2, i125, 47863026, false, (String) objArr7[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16949);
                        int mirror = 2787 - AndroidCharacter.getMirror('0');
                        int iMyTid = (Process.myTid() >> 22) + 13;
                        byte b4 = $$a[7];
                        Object[] objArr8 = new Object[1];
                        c((short) 37, b4, (byte) (b4 | 37), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, mirror, iMyTid, 631063962, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i126 = 79 - (~TextUtils.getTrimmedLength(""));
                            int trimmedLength = TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i127 = trimmedLength * TypedValues.Custom.TYPE_DIMENSION;
                            int i128 = ((i127 | (-25284)) << 1) - (i127 ^ (-25284));
                            int i129 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i130 = ((i129 | 29) << 1) - (i129 ^ 29);
                            b = i130 % 128;
                            int i131 = i130 % 2;
                            int i132 = trimmedLength ^ (-1);
                            int i133 = ~((i132 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i132 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                            int i134 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i135 = ~((i134 ^ 28) | (i134 & 28));
                            int i136 = -(-((-1808) * ((i133 & i135) | (i133 ^ i135))));
                            int i137 = (i128 & i136) + (i136 | i128);
                            int i138 = ~trimmedLength;
                            int i139 = (i138 & (-29)) | (i138 ^ (-29));
                            int i140 = ~((i139 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i139 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                            int i141 = ~((i134 ^ trimmedLength) | (i134 & trimmedLength) | 28);
                            int i142 = ((i140 & i141) | (i140 ^ i141)) * TypedValues.Custom.TYPE_BOOLEAN;
                            int i143 = (i137 ^ i142) + ((i142 & i137) << 1);
                            int i144 = ~trimmedLength;
                            int i145 = ~((i144 & 28) | (i144 ^ 28));
                            int i146 = ~((-29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                            int i147 = (i145 & i146) | (i145 ^ i146);
                            int i148 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                            int i149 = ~((trimmedLength & i148) | (i148 ^ trimmedLength));
                            int i150 = i143 + (((i149 & i147) | (i147 ^ i149)) * TypedValues.Custom.TYPE_BOOLEAN);
                            int i151 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr9 = new Object[1];
                            a(i126, i150, (char) (((i151 | 15976) << 1) - (i151 ^ 15976)), objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i152 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                int doubleTapTimeout = 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                byte[] bArr = $$a;
                                byte b5 = bArr[7];
                                Object[] objArr11 = new Object[1];
                                c(b5, bArr[132], b5, objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, i152, doubleTapTimeout, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                            long j = 471592396;
                            long j2 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                            long j3 = (j2 * j) + (j2 * jLongValue);
                            long j4 = -502;
                            long j5 = j | jLongValue;
                            long j6 = -1;
                            long j7 = j ^ j6;
                            long j8 = (j7 | (jLongValue ^ j6)) ^ j6;
                            long j9 = i;
                            long j10 = j7 | (j9 ^ j6);
                            long j11 = (j5 | j9) ^ j6;
                            long j12 = j3 + (j4 * j5) + (j4 * (j8 | (j10 ^ j6) | j11)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (((jLongValue | j10) ^ j6) | j11)) + ((long) (-672510633));
                            int i153 = (int) (j12 >> 32);
                            int iNextInt = new Random().nextInt(1935376196);
                            int i154 = 1176281002 + ((~((-932371787) | iNextInt)) * 216);
                            int i155 = ~iNextInt;
                            int i156 = i153 & (i154 + (((-84938817) | i155) * (-216)) + (((~(i155 | (-932371787))) | (-1925369099)) * 216));
                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int i157 = ~iElapsedRealtime;
                            int i158 = ((int) j12) & (1962756126 + (((~((-1103127264) | i157)) | (-1754613623)) * (-865)) + ((~(iElapsedRealtime | 1103127263)) * 865) + (((~((-1754613623) | i157)) | (~(i157 | 1103127263))) * 865));
                            i6 = (i156 & i158) | (i156 ^ i158);
                        } else {
                            int i159 = -TextUtils.indexOf("", "", 0, 0);
                            int i160 = ((i159 | 108) << 1) - (i159 ^ 108);
                            int i161 = -ExpandableListView.getPackedPositionChild(0L);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                            Object[] objArr12 = new Object[1];
                            a(i160, i161, (char) (((iNormalizeMetaState | 20187) << 1) - (iNormalizeMetaState ^ 20187)), objArr12);
                            str = (String) objArr12[0];
                            i13 = -Process.getGidForName("");
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i14 = i13 * (-755);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i163 = ~((1584119815 & i162) | (1584119815 ^ i162));
                            int i164 = (i163 & 546584208) | (i163 ^ 546584208);
                            int i165 = ~((i162 & (-2127885972)) | (i162 ^ (-2127885972)));
                            int i166 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 546584208) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 546584208);
                            i15 = (((((i165 & i164) | (i164 ^ i165)) * (-397)) - 535805136) - (~(-(-(((i166 & 2818052) | (i166 ^ 2818052)) * 397))))) - 1;
                            int i167 = (((-400756569) ^ i) | ((-400756569) & i) | (-1200303038)) * (-676);
                            int i168 = (815011404 ^ i167) + ((i167 & 815011404) << 1);
                            int i169 = ~i;
                            int i170 = ~((-400756569) | i169);
                            i16 = (i168 - (~(((126028568 ^ i170) | (i170 & 126028568)) * 676))) - 1;
                            i17 = ~i;
                            int i171 = ~(((-1200303038) & i17) | ((-1200303038) ^ i17));
                            int i172 = (1074274469 ^ i171) | (i171 & 1074274469);
                            int i173 = ~(((-274728001) ^ i) | ((-274728001) & i));
                            i18 = ((i172 ^ i173) | (i172 & i173)) * 676;
                            if (i15 > (i16 ^ i18) + ((i18 & i16) << 1)) {
                                int i174 = i14 >> (-81540);
                                int i175 = ~i13;
                                int i176 = ~((i175 & (-109)) | (i175 ^ (-109)));
                                i20 = i174 / ((i176 & 1512) + (i176 | 1512));
                                i19 = (~i13) | (-109);
                            } else {
                                int i177 = ((i14 | (-81540)) << 1) - (i14 ^ (-81540));
                                int i178 = ~i13;
                                i19 = (i178 & (-109)) | (i178 ^ (-109));
                                i20 = (i177 - (~((~((i178 ^ (-109)) | (i178 & (-109)))) * 1512))) - 1;
                            }
                            int i179 = b;
                            int i180 = (i179 & 91) + (i179 | 91);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i180 % 128;
                            i21 = i180 % 2;
                            i22 = ~i19;
                            if (i21 == 0) {
                                int i181 = ~(i13 | 108 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i182 = -((-756) - ((i22 ^ i181) | (i22 & i181)));
                                i23 = (i20 ^ i182) + ((i20 & i182) << 1);
                                i24 = 756 >>> (((i13 & 108) | (i13 ^ 108)) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            } else {
                                int i183 = (i13 & 108) | (i13 ^ 108);
                                int i184 = (-756) * (i22 | (~(i183 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)));
                                i23 = (i20 ^ i184) + ((i20 & i184) << 1);
                                int i185 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i24 = ((i183 & i185) | (i183 ^ i185)) * 756;
                            }
                            int i186 = (i179 & 39) + (i179 | 39);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i186 % 128;
                            int i187 = i186 % 2;
                            int i188 = (i23 - (~i24)) - 1;
                            iArgb = Color.argb(0, 0, 0, 0);
                            int i189 = iArgb * (-183);
                            int i190 = b + 85;
                            int i191 = i190 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i191;
                            int i192 = i190 % 2;
                            int i193 = (i189 & 2405) + (i189 | 2405);
                            i25 = ~iArgb;
                            int i194 = ~((i25 ^ 13) | (i25 & 13));
                            int i195 = ~(i169 | 13);
                            int i196 = ((i195 & i194) | (i194 ^ i195)) * 184;
                            i26 = (i193 & i196) + (i193 | i196);
                            i27 = i191 + 75;
                            b = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i197 = ~(iArgb | (-14));
                                i29 = i26 >> ((-184) / ((i197 & i) | (i ^ i197)));
                                i28 = (~((i25 & i17) | (i25 ^ i17))) * 184;
                            } else {
                                int i198 = ~(((-14) & iArgb) | ((-14) ^ iArgb));
                                int i199 = -(-(((i198 & i) | (i ^ i198)) * (-184)));
                                int i200 = (i199 | i26) + (i26 & i199);
                                int i201 = ~iArgb;
                                i28 = (~((i201 & i17) | (i201 ^ i17))) * 184;
                                i29 = i200;
                            }
                            Object[] objArr13 = new Object[1];
                            a(i188, (i29 & i28) + (i29 | i28), (char) (50677 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), objArr13);
                            objArr = new Object[]{(String) objArr13[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c5 = (char) (33603 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                int minimumFlingVelocity2 = 3085 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                                byte[] bArr2 = $$a;
                                byte b6 = bArr2[7];
                                Object[] objArr14 = new Object[1];
                                c(b6, bArr2[132], b6, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, minimumFlingVelocity2, iResolveOpacity, 1411172903, false, (String) objArr14[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i202 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i31 = (i202 ^ 53) + ((i202 & 53) << 1);
                                b = i31 % 128;
                                if (i31 % 2 != 0) {
                                    i32 = 1;
                                } else {
                                    i32 = 0;
                                }
                                i6 = i32 ^ 1;
                            } else {
                                int i203 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i30 = (i203 ^ 103) + ((i203 & 103) << 1);
                                b = i30 % 128;
                                if (i30 % 2 != 0) {
                                    int i204 = 5 % 3;
                                }
                                i6 = 0;
                            }
                        }
                        i7 = (~(i & 10)) & (i | 10);
                        int i205 = -i6;
                        i8 = ((i6 & i205) | (i6 ^ i205)) >> 31;
                        i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i10 = i9 + 19;
                        b = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        int i206 = (~i8) & i;
                        int i207 = i8 & i7;
                        int i208 = (i207 & i206) | (i206 ^ i207);
                        i11 = i9 + 103;
                        int i209 = i11 % 128;
                        b = i209;
                        if (i11 % 2 != 0) {
                            int i210 = i2 & 115;
                            int i211 = -i210;
                            i12 = ((i210 & i211) | (i210 ^ i211)) / 78;
                        } else {
                            int i212 = i2 & 32;
                            int i213 = -i212;
                            i12 = ((i212 & i213) | (i212 ^ i213)) >> 31;
                        }
                        int i214 = i208 & (~i12);
                        int i215 = i12 & i;
                        i5 = (i214 & i215) | (i214 ^ i215);
                        int i216 = i209 + 69;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i216 % 128;
                        int i217 = i216 % 2;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        i5 = i;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i1210 = 79 - (~TextUtils.getTrimmedLength(""));
                            int trimmedLength2 = TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1211 = trimmedLength2 * TypedValues.Custom.TYPE_DIMENSION;
                            int i1212 = ((i1211 | (-25284)) << 1) - (i1211 ^ (-25284));
                            int i1213 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i1310 = ((i1213 | 29) << 1) - (i1213 ^ 29);
                            b = i1310 % 128;
                            int i1311 = i1310 % 2;
                            int i1312 = trimmedLength2 ^ (-1);
                            int i1313 = ~((i1312 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i1312 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i1314 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i1315 = ~((i1314 ^ 28) | (i1314 & 28));
                            int i1316 = -(-((-1808) * ((i1313 & i1315) | (i1313 ^ i1315))));
                            int i1317 = (i1212 & i1316) + (i1316 | i1212);
                            int i1318 = ~trimmedLength2;
                            int i1319 = (i1318 & (-29)) | (i1318 ^ (-29));
                            int i1410 = ~((i1319 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i1319 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                            int i1411 = ~((i1314 ^ trimmedLength2) | (i1314 & trimmedLength2) | 28);
                            int i1412 = ((i1410 & i1411) | (i1410 ^ i1411)) * TypedValues.Custom.TYPE_BOOLEAN;
                            int i1413 = (i1317 ^ i1412) + ((i1412 & i1317) << 1);
                            int i1414 = ~trimmedLength2;
                            int i1415 = ~((i1414 & 28) | (i1414 ^ 28));
                            int i1416 = ~((-29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                            int i1417 = (i1415 & i1416) | (i1415 ^ i1416);
                            int i1418 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                            int i1419 = ~((trimmedLength2 & i1418) | (i1418 ^ trimmedLength2));
                            int i1510 = i1413 + (((i1419 & i1417) | (i1417 ^ i1419)) * TypedValues.Custom.TYPE_BOOLEAN);
                            int i1511 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr15 = new Object[1];
                            a(i1210, i1510, (char) (((i1511 | 15976) << 1) - (i1511 ^ 15976)), objArr15);
                            Object[] objArr16 = {(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c6 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i1512 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                int doubleTapTimeout2 = 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                byte[] bArr3 = $$a;
                                byte b7 = bArr3[7];
                                Object[] objArr17 = new Object[1];
                                c(b7, bArr3[132], b7, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c6, i1512, doubleTapTimeout2, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                            long j13 = 471592396;
                            long j14 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                            long j15 = (j14 * j13) + (j14 * jLongValue2);
                            long j16 = -502;
                            long j17 = j13 | jLongValue2;
                            long j18 = -1;
                            long j19 = j13 ^ j18;
                            long j20 = (j19 | (jLongValue2 ^ j18)) ^ j18;
                            long j21 = i;
                            long j110 = j19 | (j21 ^ j18);
                            long j111 = (j17 | j21) ^ j18;
                            long j112 = j15 + (j16 * j17) + (j16 * (j20 | (j110 ^ j18) | j111)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (((jLongValue2 | j110) ^ j18) | j111)) + ((long) (-672510633));
                            int i1513 = (int) (j112 >> 32);
                            int iNextInt2 = new Random().nextInt(1935376196);
                            int i1514 = 1176281002 + ((~((-932371787) | iNextInt2)) * 216);
                            int i1515 = ~iNextInt2;
                            int i1516 = i1513 & (i1514 + (((-84938817) | i1515) * (-216)) + (((~(i1515 | (-932371787))) | (-1925369099)) * 216));
                            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                            int i1517 = ~iElapsedRealtime2;
                            int i1518 = ((int) j112) & (1962756126 + (((~((-1103127264) | i1517)) | (-1754613623)) * (-865)) + ((~(iElapsedRealtime2 | 1103127263)) * 865) + (((~((-1754613623) | i1517)) | (~(i1517 | 1103127263))) * 865));
                            i6 = (i1516 & i1518) | (i1516 ^ i1518);
                        } else {
                            int i1519 = -TextUtils.indexOf("", "", 0, 0);
                            int i1610 = ((i1519 | 108) << 1) - (i1519 ^ 108);
                            int i1611 = -ExpandableListView.getPackedPositionChild(0L);
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                            Object[] objArr18 = new Object[1];
                            a(i1610, i1611, (char) (((iNormalizeMetaState2 | 20187) << 1) - (iNormalizeMetaState2 ^ 20187)), objArr18);
                            str = (String) objArr18[0];
                            i13 = -Process.getGidForName("");
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i14 = i13 * (-755);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1612 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                            int i1613 = ~((1584119815 & i1612) | (1584119815 ^ i1612));
                            int i1614 = (i1613 & 546584208) | (i1613 ^ 546584208);
                            int i1615 = ~((i1612 & (-2127885972)) | (i1612 ^ (-2127885972)));
                            int i1616 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & 546584208) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ 546584208);
                            i15 = (((((i1615 & i1614) | (i1614 ^ i1615)) * (-397)) - 535805136) - (~(-(-(((i1616 & 2818052) | (i1616 ^ 2818052)) * 397))))) - 1;
                            int i1617 = (((-400756569) ^ i) | ((-400756569) & i) | (-1200303038)) * (-676);
                            int i1618 = (815011404 ^ i1617) + ((i1617 & 815011404) << 1);
                            int i1619 = ~i;
                            int i1710 = ~((-400756569) | i1619);
                            i16 = (i1618 - (~(((126028568 ^ i1710) | (i1710 & 126028568)) * 676))) - 1;
                            i17 = ~i;
                            int i1711 = ~(((-1200303038) & i17) | ((-1200303038) ^ i17));
                            int i1712 = (1074274469 ^ i1711) | (i1711 & 1074274469);
                            int i1713 = ~(((-274728001) ^ i) | ((-274728001) & i));
                            i18 = ((i1712 ^ i1713) | (i1712 & i1713)) * 676;
                            if (i15 > (i16 ^ i18) + ((i18 & i16) << 1)) {
                                int i1714 = i14 >> (-81540);
                                int i1715 = ~i13;
                                int i1716 = ~((i1715 & (-109)) | (i1715 ^ (-109)));
                                i20 = i1714 / ((i1716 & 1512) + (i1716 | 1512));
                                i19 = (~i13) | (-109);
                            } else {
                                int i1717 = ((i14 | (-81540)) << 1) - (i14 ^ (-81540));
                                int i1718 = ~i13;
                                i19 = (i1718 & (-109)) | (i1718 ^ (-109));
                                i20 = (i1717 - (~((~((i1718 ^ (-109)) | (i1718 & (-109)))) * 1512))) - 1;
                            }
                            int i1719 = b;
                            int i1810 = (i1719 & 91) + (i1719 | 91);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1810 % 128;
                            i21 = i1810 % 2;
                            i22 = ~i19;
                            if (i21 == 0) {
                                int i1811 = ~(i13 | 108 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i1812 = -((-756) - ((i22 ^ i1811) | (i22 & i1811)));
                                i23 = (i20 ^ i1812) + ((i20 & i1812) << 1);
                                i24 = 756 >>> (((i13 & 108) | (i13 ^ 108)) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            } else {
                                int i1813 = (i13 & 108) | (i13 ^ 108);
                                int i1814 = (-756) * (i22 | (~(i1813 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)));
                                i23 = (i20 ^ i1814) + ((i20 & i1814) << 1);
                                int i1815 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i24 = ((i1813 & i1815) | (i1813 ^ i1815)) * 756;
                            }
                            int i1816 = (i1719 & 39) + (i1719 | 39);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1816 % 128;
                            int i1817 = i1816 % 2;
                            int i1818 = (i23 - (~i24)) - 1;
                            iArgb = Color.argb(0, 0, 0, 0);
                            int i1819 = iArgb * (-183);
                            int i1910 = b + 85;
                            int i1911 = i1910 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1911;
                            int i1912 = i1910 % 2;
                            int i1913 = (i1819 & 2405) + (i1819 | 2405);
                            i25 = ~iArgb;
                            int i1914 = ~((i25 ^ 13) | (i25 & 13));
                            int i1915 = ~(i1619 | 13);
                            int i1916 = ((i1915 & i1914) | (i1914 ^ i1915)) * 184;
                            i26 = (i1913 & i1916) + (i1913 | i1916);
                            i27 = i1911 + 75;
                            b = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i1917 = ~(iArgb | (-14));
                                i29 = i26 >> ((-184) / ((i1917 & i) | (i ^ i1917)));
                                i28 = (~((i25 & i17) | (i25 ^ i17))) * 184;
                            } else {
                                int i1918 = ~(((-14) & iArgb) | ((-14) ^ iArgb));
                                int i1919 = -(-(((i1918 & i) | (i ^ i1918)) * (-184)));
                                int i2010 = (i1919 | i26) + (i26 & i1919);
                                int i2011 = ~iArgb;
                                i28 = (~((i2011 & i17) | (i2011 ^ i17))) * 184;
                                i29 = i2010;
                            }
                            Object[] objArr19 = new Object[1];
                            a(i1818, (i29 & i28) + (i29 | i28), (char) (50677 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), objArr19);
                            objArr = new Object[]{(String) objArr19[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c7 = (char) (33603 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                int minimumFlingVelocity3 = 3085 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 26;
                                byte[] bArr4 = $$a;
                                byte b8 = bArr4[7];
                                Object[] objArr110 = new Object[1];
                                c(b8, bArr4[132], b8, objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c7, minimumFlingVelocity3, iResolveOpacity2, 1411172903, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i2012 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i31 = (i2012 ^ 53) + ((i2012 & 53) << 1);
                                b = i31 % 128;
                                if (i31 % 2 != 0) {
                                    i32 = 1;
                                } else {
                                    i32 = 0;
                                }
                                i6 = i32 ^ 1;
                            } else {
                                int i2013 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i30 = (i2013 ^ 103) + ((i2013 & 103) << 1);
                                b = i30 % 128;
                                if (i30 % 2 != 0) {
                                    int i2014 = 5 % 3;
                                }
                                i6 = 0;
                            }
                        }
                        i7 = (~(i & 10)) & (i | 10);
                        int i2015 = -i6;
                        i8 = ((i6 & i2015) | (i6 ^ i2015)) >> 31;
                        i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i10 = i9 + 19;
                        b = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        int i2016 = (~i8) & i;
                        int i2017 = i8 & i7;
                        int i2018 = (i2017 & i2016) | (i2016 ^ i2017);
                        i11 = i9 + 103;
                        int i2019 = i11 % 128;
                        b = i2019;
                        if (i11 % 2 != 0) {
                            int i218 = i2 & 115;
                            int i219 = -i218;
                            i12 = ((i218 & i219) | (i218 ^ i219)) / 78;
                        } else {
                            int i2110 = i2 & 32;
                            int i2111 = -i2110;
                            i12 = ((i2110 & i2111) | (i2110 ^ i2111)) >> 31;
                        }
                        int i2112 = i2018 & (~i12);
                        int i2113 = i12 & i;
                        i5 = (i2112 & i2113) | (i2112 ^ i2113);
                        int i2114 = i2019 + 69;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2114 % 128;
                        int i2115 = i2114 % 2;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = i;
                } else {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i1214 = 79 - (~TextUtils.getTrimmedLength(""));
                            int trimmedLength3 = TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1215 = trimmedLength3 * TypedValues.Custom.TYPE_DIMENSION;
                            int i1216 = ((i1215 | (-25284)) << 1) - (i1215 ^ (-25284));
                            int i1217 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i13110 = ((i1217 | 29) << 1) - (i1217 ^ 29);
                            b = i13110 % 128;
                            int i13111 = i13110 % 2;
                            int i13112 = trimmedLength3 ^ (-1);
                            int i13113 = ~((i13112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i13112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                            int i13114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                            int i13115 = ~((i13114 ^ 28) | (i13114 & 28));
                            int i13116 = -(-((-1808) * ((i13113 & i13115) | (i13113 ^ i13115))));
                            int i13117 = (i1216 & i13116) + (i13116 | i1216);
                            int i13118 = ~trimmedLength3;
                            int i13119 = (i13118 & (-29)) | (i13118 ^ (-29));
                            int i14110 = ~((i13119 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i13119 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                            int i14111 = ~((i13114 ^ trimmedLength3) | (i13114 & trimmedLength3) | 28);
                            int i14112 = ((i14110 & i14111) | (i14110 ^ i14111)) * TypedValues.Custom.TYPE_BOOLEAN;
                            int i14113 = (i13117 ^ i14112) + ((i14112 & i13117) << 1);
                            int i14114 = ~trimmedLength3;
                            int i14115 = ~((i14114 & 28) | (i14114 ^ 28));
                            int i14116 = ~((-29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                            int i14117 = (i14115 & i14116) | (i14115 ^ i14116);
                            int i14118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                            int i14119 = ~((trimmedLength3 & i14118) | (i14118 ^ trimmedLength3));
                            int i15110 = i14113 + (((i14119 & i14117) | (i14117 ^ i14119)) * TypedValues.Custom.TYPE_BOOLEAN);
                            int i15111 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr111 = new Object[1];
                            a(i1214, i15110, (char) (((i15111 | 15976) << 1) - (i15111 ^ 15976)), objArr111);
                            try {
                                Object[] objArr112 = {(String) objArr111[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c8 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i15112 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                    int doubleTapTimeout3 = 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    byte[] bArr5 = $$a;
                                    byte b9 = bArr5[7];
                                    Object[] objArr113 = new Object[1];
                                    c(b9, bArr5[132], b9, objArr113);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c8, i15112, doubleTapTimeout3, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                                long j113 = 471592396;
                                long j114 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                long j115 = (j114 * j113) + (j114 * jLongValue3);
                                long j116 = -502;
                                long j117 = j113 | jLongValue3;
                                long j118 = -1;
                                long j119 = j113 ^ j118;
                                long j22 = (j119 | (jLongValue3 ^ j118)) ^ j118;
                                long j23 = i;
                                long j1110 = j119 | (j23 ^ j118);
                                long j1111 = (j117 | j23) ^ j118;
                                long j1112 = j115 + (j116 * j117) + (j116 * (j22 | (j1110 ^ j118) | j1111)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (((jLongValue3 | j1110) ^ j118) | j1111)) + ((long) (-672510633));
                                int i15113 = (int) (j1112 >> 32);
                                int iNextInt3 = new Random().nextInt(1935376196);
                                int i15114 = 1176281002 + ((~((-932371787) | iNextInt3)) * 216);
                                int i15115 = ~iNextInt3;
                                int i15116 = i15113 & (i15114 + (((-84938817) | i15115) * (-216)) + (((~(i15115 | (-932371787))) | (-1925369099)) * 216));
                                int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                int i15117 = ~iElapsedRealtime3;
                                int i15118 = ((int) j1112) & (1962756126 + (((~((-1103127264) | i15117)) | (-1754613623)) * (-865)) + ((~(iElapsedRealtime3 | 1103127263)) * 865) + (((~((-1754613623) | i15117)) | (~(i15117 | 1103127263))) * 865));
                                i6 = (i15116 & i15118) | (i15116 ^ i15118);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            int i15119 = -TextUtils.indexOf("", "", 0, 0);
                            int i16110 = ((i15119 | 108) << 1) - (i15119 ^ 108);
                            int i16111 = -ExpandableListView.getPackedPositionChild(0L);
                            int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                            Object[] objArr114 = new Object[1];
                            a(i16110, i16111, (char) (((iNormalizeMetaState3 | 20187) << 1) - (iNormalizeMetaState3 ^ 20187)), objArr114);
                            str = (String) objArr114[0];
                            i13 = -Process.getGidForName("");
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i14 = i13 * (-755);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i16112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                            int i16113 = ~((1584119815 & i16112) | (1584119815 ^ i16112));
                            int i16114 = (i16113 & 546584208) | (i16113 ^ 546584208);
                            int i16115 = ~((i16112 & (-2127885972)) | (i16112 ^ (-2127885972)));
                            int i16116 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & 546584208) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 ^ 546584208);
                            i15 = (((((i16115 & i16114) | (i16114 ^ i16115)) * (-397)) - 535805136) - (~(-(-(((i16116 & 2818052) | (i16116 ^ 2818052)) * 397))))) - 1;
                            int i16117 = (((-400756569) ^ i) | ((-400756569) & i) | (-1200303038)) * (-676);
                            int i16118 = (815011404 ^ i16117) + ((i16117 & 815011404) << 1);
                            int i16119 = ~i;
                            int i17110 = ~((-400756569) | i16119);
                            i16 = (i16118 - (~(((126028568 ^ i17110) | (i17110 & 126028568)) * 676))) - 1;
                            i17 = ~i;
                            int i17111 = ~(((-1200303038) & i17) | ((-1200303038) ^ i17));
                            int i17112 = (1074274469 ^ i17111) | (i17111 & 1074274469);
                            int i17113 = ~(((-274728001) ^ i) | ((-274728001) & i));
                            i18 = ((i17112 ^ i17113) | (i17112 & i17113)) * 676;
                            if (i15 > (i16 ^ i18) + ((i18 & i16) << 1)) {
                                int i17114 = i14 >> (-81540);
                                int i17115 = ~i13;
                                int i17116 = ~((i17115 & (-109)) | (i17115 ^ (-109)));
                                i20 = i17114 / ((i17116 & 1512) + (i17116 | 1512));
                                i19 = (~i13) | (-109);
                            } else {
                                int i17117 = ((i14 | (-81540)) << 1) - (i14 ^ (-81540));
                                int i17118 = ~i13;
                                i19 = (i17118 & (-109)) | (i17118 ^ (-109));
                                i20 = (i17117 - (~((~((i17118 ^ (-109)) | (i17118 & (-109)))) * 1512))) - 1;
                            }
                            int i17119 = b;
                            int i18110 = (i17119 & 91) + (i17119 | 91);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18110 % 128;
                            i21 = i18110 % 2;
                            i22 = ~i19;
                            if (i21 == 0) {
                                int i18111 = ~(i13 | 108 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i18112 = -((-756) - ((i22 ^ i18111) | (i22 & i18111)));
                                i23 = (i20 ^ i18112) + ((i20 & i18112) << 1);
                                i24 = 756 >>> (((i13 & 108) | (i13 ^ 108)) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            } else {
                                int i18113 = (i13 & 108) | (i13 ^ 108);
                                int i18114 = (-756) * (i22 | (~(i18113 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)));
                                i23 = (i20 ^ i18114) + ((i20 & i18114) << 1);
                                int i18115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i24 = ((i18113 & i18115) | (i18113 ^ i18115)) * 756;
                            }
                            int i18116 = (i17119 & 39) + (i17119 | 39);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18116 % 128;
                            int i18117 = i18116 % 2;
                            int i18118 = (i23 - (~i24)) - 1;
                            iArgb = Color.argb(0, 0, 0, 0);
                            int i18119 = iArgb * (-183);
                            int i19110 = b + 85;
                            int i19111 = i19110 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19111;
                            int i19112 = i19110 % 2;
                            int i19113 = (i18119 & 2405) + (i18119 | 2405);
                            i25 = ~iArgb;
                            int i19114 = ~((i25 ^ 13) | (i25 & 13));
                            int i19115 = ~(i16119 | 13);
                            int i19116 = ((i19115 & i19114) | (i19114 ^ i19115)) * 184;
                            i26 = (i19113 & i19116) + (i19113 | i19116);
                            i27 = i19111 + 75;
                            b = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i19117 = ~(iArgb | (-14));
                                i29 = i26 >> ((-184) / ((i19117 & i) | (i ^ i19117)));
                                i28 = (~((i25 & i17) | (i25 ^ i17))) * 184;
                            } else {
                                int i19118 = ~(((-14) & iArgb) | ((-14) ^ iArgb));
                                int i19119 = -(-(((i19118 & i) | (i ^ i19118)) * (-184)));
                                int i20110 = (i19119 | i26) + (i26 & i19119);
                                int i20111 = ~iArgb;
                                i28 = (~((i20111 & i17) | (i20111 ^ i17))) * 184;
                                i29 = i20110;
                            }
                            Object[] objArr115 = new Object[1];
                            a(i18118, (i29 & i28) + (i29 | i28), (char) (50677 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))))), objArr115);
                            try {
                                objArr = new Object[]{(String) objArr115[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c9 = (char) (33603 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int minimumFlingVelocity4 = 3085 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 26;
                                    byte[] bArr6 = $$a;
                                    byte b10 = bArr6[7];
                                    Object[] objArr116 = new Object[1];
                                    c(b10, bArr6[132], b10, objArr116);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c9, minimumFlingVelocity4, iResolveOpacity3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                    int i20112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i31 = (i20112 ^ 53) + ((i20112 & 53) << 1);
                                    b = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        i32 = 1;
                                    } else {
                                        i32 = 0;
                                    }
                                    i6 = i32 ^ 1;
                                } else {
                                    int i20113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i30 = (i20113 ^ 103) + ((i20113 & 103) << 1);
                                    b = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        int i20114 = 5 % 3;
                                    }
                                    i6 = 0;
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    i7 = (~(i & 10)) & (i | 10);
                    int i20115 = -i6;
                    i8 = ((i6 & i20115) | (i6 ^ i20115)) >> 31;
                    i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i10 = i9 + 19;
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    int i20116 = (~i8) & i;
                    int i20117 = i8 & i7;
                    int i20118 = (i20117 & i20116) | (i20116 ^ i20117);
                    i11 = i9 + 103;
                    int i20119 = i11 % 128;
                    b = i20119;
                    if (i11 % 2 != 0) {
                        int i2116 = i2 & 115;
                        int i2117 = -i2116;
                        i12 = ((i2116 & i2117) | (i2116 ^ i2117)) / 78;
                    } else {
                        int i2118 = i2 & 32;
                        int i2119 = -i2118;
                        i12 = ((i2118 & i2119) | (i2118 ^ i2119)) >> 31;
                    }
                    int i21110 = i20118 & (~i12);
                    int i21111 = i12 & i;
                    i5 = (i21110 & i21111) | (i21110 ^ i21111);
                    int i21112 = i20119 + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21112 % 128;
                    int i21113 = i21112 % 2;
                }
                int i220 = i ^ i4;
                int i221 = (i220 | (-i220)) >> 31;
                int i222 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i223 = (i222 & 89) + (i222 | 89);
                b = i223 % 128;
                int i224 = i223 % 2;
                int i225 = i5 & (~i221);
                int i226 = i4 & i221;
                int i227 = (i225 & i226) | (i225 ^ i226);
                int i228 = (~(i & i227)) & (i | i227);
                int i229 = -i228;
                int i230 = (((i228 & i229) | (i228 ^ i229)) >> 31) & 16;
                zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ((int[]) objArr[0])[0] = i;
                ((int[]) objArr[2])[0] = i227;
                int i231 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i232 = (i231 ^ 5) + ((i231 & 5) << 1);
                int i233 = i232 % 128;
                b = i233;
                int i234 = i232 % 2;
                Object[] objArr20 = {new int[1], new int[1], new int[1], null};
                int i235 = (-1835666784) + (((~((-18286612) | i)) | (-22482388)) * (-502));
                int i236 = ~i;
                int i237 = i235 + ((~((-458771) | i236)) * (-502)) + (((-18286612) | (~((-22023618) | i))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i238 = (i230 * 673) + (i237 * (-1343));
                int i239 = ~(i230 | i);
                int i240 = -(-(((i239 & i237) | (i237 ^ i239)) * 672));
                int i241 = ((i238 | i240) << 1) - (i238 ^ i240);
                int i242 = ~i230;
                int i243 = -(-(((~((i242 & i236) | (i242 ^ i236))) | (~(i237 | i))) * (-672)));
                int i244 = (i241 ^ i243) + ((i243 & i241) << 1);
                int i245 = ~((~i) | (~i237));
                int i246 = ~i237;
                int i247 = ~((i230 & i246) | (i246 ^ i230));
                int i248 = -(-(i244 + (((i245 & i247) | (i245 ^ i247)) * 672)));
                int i249 = (i3 & i248) + (i3 | i248);
                int i250 = (i249 << 13) ^ i249;
                int i251 = i250 >>> 17;
                int i252 = (i250 | i251) & (~(i250 & i251));
                int i253 = i252 << 5;
                ((int[]) objArr20[1])[0] = (i252 | i253) & (~(i252 & i253));
                int i254 = ((i233 | 47) << 1) - (i233 ^ 47);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i254 % 128;
                if (i254 % 2 != 0) {
                    return objArr20;
                }
                throw null;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        private static String $$e(byte b2, short s, short s2) {
            int i = 3 - (b2 * 2);
            byte[] bArr = $$c;
            int i2 = s * 3;
            int i3 = (s2 * 3) + 109;
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i3 = i + (-i3);
                i = i;
            }
            while (true) {
                i4++;
                int i5 = i + 1;
                bArr2[i4] = (byte) i3;
                if (i4 == i2) {
                    return new String(bArr2, 0);
                }
                i3 += -bArr[i5];
                i = i5;
            }
        }
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        CacheDisposable<T>[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        CacheDisposable<T> cacheDisposable = new CacheDisposable<>(derivemediatype, this);
        derivemediatype.onSubscribe(cacheDisposable);
        do {
            cacheDisposableArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
            if (cacheDisposableArr == b) {
                break;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, cacheDisposableArr, cacheDisposableArr2));
        if (!this.f1209a.get() && this.f1209a.compareAndSet(false, true)) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(this);
        } else {
            b(cacheDisposable);
        }
    }

    private void b(CacheDisposable<T> cacheDisposable) {
        if (cacheDisposable.getAndIncrement() == 0) {
            long j = cacheDisposable.index;
            int i = cacheDisposable.offset;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = cacheDisposable.node;
            deriveMediaType<? super T> derivemediatype = cacheDisposable.downstream;
            int i2 = this.g;
            int iAddAndGet = 1;
            while (!cacheDisposable.disposed) {
                boolean z = this.asBinder;
                boolean z2 = this.asInterface == j;
                if (z && z2) {
                    cacheDisposable.node = null;
                    Throwable th = this.d;
                    if (th != null) {
                        derivemediatype.onError(th);
                        return;
                    } else {
                        derivemediatype.onComplete();
                        return;
                    }
                }
                if (!z2) {
                    if (i == i2) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                        i = 0;
                    }
                    derivemediatype.onNext(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i]);
                    i++;
                    j++;
                } else {
                    cacheDisposable.index = j;
                    cacheDisposable.offset = i;
                    cacheDisposable.node = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    iAddAndGet = cacheDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cacheDisposable.node = null;
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        int i = this.cancel;
        if (i == this.g) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(i);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = t;
            this.cancel = 1;
            this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.INotificationSideChannel = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i] = t;
            this.cancel = i + 1;
        }
        this.asInterface++;
        for (CacheDisposable<T> cacheDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get()) {
            b(cacheDisposable);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        this.d = th;
        this.asBinder = true;
        for (CacheDisposable<T> cacheDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(b)) {
            b(cacheDisposable);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        this.asBinder = true;
        for (CacheDisposable<T> cacheDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(b)) {
            b(cacheDisposable);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> {
        volatile TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> TuitionPaymentFragmentbindingInflater1;
        final T[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (T[]) new Object[i];
        }
    }
}
