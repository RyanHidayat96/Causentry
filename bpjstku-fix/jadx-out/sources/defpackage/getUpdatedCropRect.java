package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class getUpdatedCropRect {
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "0123456789abcdef".toCharArray();
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[64];
    private static volatile Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int TuitionPaymentFragmentbindingInflater1(int i) {
        return i + 527;
    }

    public static int TuitionPaymentFragmentbindingInflater1(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int TuitionPaymentFragmentbindingInflater1(boolean z, int i) {
        return (i * 31) + (z ? 1 : 0);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    private getUpdatedCropRect() {
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr) {
        String str;
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (cArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                int i2 = i * 2;
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                cArr[i2] = cArr2[(b & UByte.MAX_VALUE) >>> 4];
                cArr[i2 + 1] = cArr2[b & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
            sb.append(bitmap);
            sb.append("[");
            sb.append(bitmap.getWidth());
            sb.append("x");
            sb.append(bitmap.getHeight());
            sb.append("] ");
            sb.append(bitmap.getConfig());
            throw new IllegalStateException(sb.toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1(int i, int i2, Bitmap.Config config) {
        return i * i2 * TuitionPaymentFragmentspecialinlinedviewModeldefault3(config);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault1[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: getUpdatedCropRect$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void TuitionPaymentFragmentbindingInflater1(Runnable runnable) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3().post(runnable);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3().removeCallbacks(runnable);
    }

    private static Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            synchronized (getUpdatedCropRect.class) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Handler(Looper.getMainLooper());
                }
            }
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static <T> Queue<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof getMinimumLoggingLevel) {
            return ((getMinimumLoggingLevel) obj).isEquivalentTo(obj2);
        }
        return obj.equals(obj2);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f) {
        return Float.floatToIntBits(f) + 527;
    }

    public static boolean b() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }
}
