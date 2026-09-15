package kotlin.collections;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
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
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\"\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.0&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010("}, d2 = {"Lkotlin/collections/MapWithDefaultImpl;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/MapWithDefault;", "", "p0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "p1", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrImplicitDefault", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "default", "Lkotlin/jvm/functions/Function1;", "getSize", "size", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", RemoteConfigConstants.ResponseFieldKey.ENTRIES}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapWithDefaultImpl<K, V> implements MapWithDefault<K, V> {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Function1<K, V> default;
    private final Map<K, V> map;
    private static final byte[] $$c = {65, -122, -65, 2};
    private static final int $$d = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {111, 40, 23, -13};
    private static final int $$b = 145;
    private static int d = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -1224889358;
    private static int b = -1934795602;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1577820502;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45, 25, 23, -9, 24, 17, -26, 25, -54, 55, -21, 24, -26, 20, -11, 27, -57, 55, -20, 44, -21, 24, -26, 20, -11, 27, -57, 52, -27, -49, 57, 31, -29, 19, -19, -18, 12, 46, 20, -11, 27, -57, -16, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 6, -21, -28, -28, 9, 24, -13, 13, -32, -17, 21, -26, 27, -12, -46, 46, 31, -29, -32, -28, 9, 24, -93, 46, 20, -11, 27, -25, -45, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94, 93, -25, -25, 49, 25, 31, -20, -25, 21, -17, -32, 28, -28, -28, 9, 24, -24, -47, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94, 42, 18, 27, -28, -89, 95, 58, 25, -10, 30, 31, -29, -32, -28, 9, 24, -93, 46, 31, -29, -32, -28, 9, 24, -93, 46, 20, -11, 27, -25, -45, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94};

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 98 - r7
            byte[] r0 = kotlin.collections.MapWithDefaultImpl.$$a
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.MapWithDefaultImpl.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapWithDefaultImpl(Map<K, ? extends V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.map = map;
        this.default = function1;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        int i = 2 % 2;
        int i2 = d + 85;
        g = i2 % 128;
        int i3 = i2 % 2;
        Set<Map.Entry<K, V>> entries = getEntries();
        int i4 = g + 113;
        d = i4 % 128;
        int i5 = i4 % 2;
        return entries;
    }

    @Override // kotlin.collections.MapWithDefault
    public final Map<K, V> getMap() {
        int i = 2 % 2;
        int i2 = d + 55;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.map;
        }
        throw null;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        int i = 2 % 2;
        int i2 = d + 5;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return getKeys();
        }
        getKeys();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        int i = 2 % 2;
        int i2 = d + 25;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            size = getSize();
            int i3 = 49 / 0;
        } else {
            size = getSize();
        }
        int i4 = d + 39;
        g = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        int i = 2 % 2;
        int i2 = g + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        Collection<V> values = getValues();
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return values;
    }

    @Override // java.util.Map
    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = d + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = getMap().equals(p0);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<K, V> map = getMap();
        if (i3 == 0) {
            return map.hashCode();
        }
        map.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = d + 51;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            getMap().toString();
            throw null;
        }
        String string = getMap().toString();
        int i3 = g + 89;
        d = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public final int getSize() {
        int i = 2 % 2;
        int i2 = g + 41;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<K, V> map = getMap();
        if (i3 == 0) {
            return map.size();
        }
        map.size();
        throw null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = g + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<K, V> map = getMap();
        if (i3 == 0) {
            return map.isEmpty();
        }
        map.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object p0) {
        int i = 2 % 2;
        int i2 = g + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean zContainsKey = getMap().containsKey(p0);
        int i4 = d + 95;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return zContainsKey;
        }
        throw null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object p0) {
        int i = 2 % 2;
        int i2 = d + 111;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getMap().containsValue(p0);
            throw null;
        }
        boolean zContainsValue = getMap().containsValue(p0);
        int i3 = d + 81;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return zContainsValue;
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Map
    public final V get(Object p0) {
        int i = 2 % 2;
        int i2 = d + 93;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            getMap().get(p0);
            throw null;
        }
        V v = getMap().get(p0);
        int i3 = d + 5;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return v;
    }

    public final Set<K> getKeys() {
        int i = 2 % 2;
        int i2 = g + 37;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getMap().keySet();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Set<K> setKeySet = getMap().keySet();
        int i3 = g + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        return setKeySet;
    }

    public final Collection<V> getValues() {
        int i = 2 % 2;
        int i2 = g + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<K, V> map = getMap();
        if (i3 == 0) {
            return map.values();
        }
        map.values();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        int i = 2 % 2;
        int i2 = g + 15;
        d = i2 % 128;
        int i3 = i2 % 2;
        Map<K, V> map = getMap();
        if (i3 == 0) {
            return map.entrySet();
        }
        map.entrySet();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.collections.MapWithDefault
    public final V getOrImplicitDefault(K p0) {
        int i = 2 % 2;
        Map<K, V> map = getMap();
        V v = map.get(p0);
        if (v == null) {
            int i2 = g + 79;
            d = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                map.containsKey(p0);
                obj.hashCode();
                throw null;
            }
            if (!map.containsKey(p0)) {
                int i3 = g + 45;
                d = i3 % 128;
                int i4 = i3 % 2;
                Function1<K, V> function1 = this.default;
                if (i4 == 0) {
                    return function1.invoke(p0);
                }
                function1.invoke(p0);
                throw null;
            }
        }
        return v;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01af A[PHI: r0
  0x01af: PHI (r0v9 int) = (r0v8 int), (r0v47 int) binds: [B:38:0x01ad, B:35:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x01b1 A[PHI: r0
  0x01b1: PHI (r0v44 int) = (r0v8 int), (r0v47 int) binds: [B:38:0x01ad, B:35:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2267;
                int i8 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                byte length = (byte) $$c.length;
                byte b3 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i7, i8, 1387473586, false, $$e(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = !(iIntValue != -1);
            if (z) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int i9 = $11 + 67;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 3358, 18 - (KeyEvent.getMaxKeyCode() >> 16), -1054011043, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int trimmedLength = 2267 - TextUtils.getTrimmedLength("");
                        int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte length3 = (byte) $$c.length;
                        byte b6 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, trimmedLength, iLastIndexOf, 1387473586, false, $$e(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i12 = $10 + 95;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    i4 = ((i3 >> iIntValue) >> 4) << ((int) (((long) TuitionPaymentFragmentbindingInflater1) * 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 55905);
                    int scrollBarFadeDuration = 2855 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int mirror = AndroidCharacter.getMirror('0') - '#';
                    byte b7 = (byte) ($$c[3] + 1);
                    byte b8 = (byte) (b7 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, scrollBarFadeDuration, mirror, -1529949196, false, $$e(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i13 = 0; i13 < length4; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i14 = $10 + 101;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    if (z2) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
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

    @Override // java.util.Map
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:121:0x0bb3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [int] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static Object[] TuitionPaymentFragmentbindingInflater1(int i, int i2) throws Throwable {
        int i3;
        String str;
        String str2;
        Object[] objArr;
        Object[] objArr2;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        String[] strArr;
        int scrollDefaultDelay;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 2 % 2;
        int i22 = g + 51;
        d = i22 % 128;
        int i23 = i22 % 2;
        long j = 0;
        try {
            int i24 = -TextUtils.getOffsetBefore("", 0);
            int i25 = (i24 ^ 760808121) + ((i24 & 760808121) << 1);
            int i26 = -TextUtils.getCapsMode("", 0, 0);
            int i27 = ((i26 | (-73)) << 1) - (i26 ^ (-73));
            short s = (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i28 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i29 = -MotionEvent.axisFromString("");
            int i30 = (i29 ^ (-978384661)) + ((i29 & (-978384661)) << 1);
            Object[] objArr3 = new Object[1];
            a(i25, i27, s, (byte) ((i28 & 1) + (i28 | 1)), i30, objArr3);
            int i31 = -View.combineMeasuredStates(0, 0);
            int i32 = ((i31 | 760808135) << 1) - (i31 ^ 760808135);
            int iMyTid = Process.myTid() >> 22;
            int i33 = iMyTid * 284;
            int i34 = (i33 ^ 20586) + ((i33 & 20586) << 1);
            int i35 = ~iMyTid;
            int i36 = ~(i35 | (-73));
            int i37 = ~((i35 ^ i) | (i35 & i));
            int i38 = ((i36 ^ i37) | (i37 & i36)) * (-283);
            int i39 = ((i34 | i38) << 1) - (i38 ^ i34);
            int i40 = -(-((~((72 ^ iMyTid) | (iMyTid & 72))) * 283));
            int i41 = (i39 & i40) + (i40 | i39);
            int i42 = (i35 ^ 72) | (i35 & 72);
            int i43 = (i41 - (~((~((i42 & i) | (i42 ^ i))) * 283))) - 1;
            short s2 = (short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b2 = (byte) ((-2) - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
            int i44 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i45 = i44 * (-518);
            int i46 = (i45 & (-2896890)) + (i45 | (-2896890));
            int i47 = ~i44;
            int i48 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i49 = ~(i47 | i48);
            int i50 = i46 + (((i49 ^ (-978384641)) | (i49 & (-978384641))) * 519);
            int i51 = ~i44;
            int i52 = (i51 ^ i48) | (i48 & i51);
            int i53 = ~((i52 & (-978384641)) | (i52 ^ (-978384641)));
            int i54 = (i44 ^ (-978384641)) | (i44 & (-978384641));
            int i55 = ~((i54 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i54 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            int i56 = i50 + (((i53 ^ i55) | (i53 & i55)) * (-519));
            int i57 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-978384641)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & (-978384641)));
            int i58 = -(-(((i44 & i57) | (i44 ^ i57)) * 519));
            int i59 = (i56 & i58) + (i56 | i58);
            Object[] objArr4 = new Object[1];
            a(i32, i43, s2, b2, i59, objArr4);
            String[] strArr2 = {(String) objArr3[0], (String) objArr4[0]};
            int i60 = 0;
            int i61 = 2;
            while (true) {
                if (i60 >= i61) {
                    i3 = i;
                    break;
                }
                int i62 = d;
                int i63 = ((i62 | 87) << 1) - (i62 ^ 87);
                g = i63 % 128;
                int i64 = i63 % i61;
                String str3 = strArr2[i60];
                int i65 = -(Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1));
                int i66 = (i65 ^ 760808114) + ((i65 & 760808114) << 1);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) - 73;
                short tapTimeout = (short) (ViewConfiguration.getTapTimeout() >> 16);
                byte bAlpha = (byte) Color.alpha(0);
                int i67 = -KeyEvent.keyCodeFromString("");
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i68 = ~i67;
                int i69 = (((i67 * (-159)) + 944332401) - (~(((i68 ^ (-978384623)) | (i68 & (-978384623))) * 160))) - 1;
                int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i71 = ~((i70 ^ i67) | (i70 & i67));
                int i72 = ~((i67 ^ (-978384623)) | (i67 & (-978384623)));
                int i73 = -(-(((i72 & i71) | (i71 ^ i72)) * (-160)));
                int i74 = ((i69 | i73) << 1) - (i73 ^ i69);
                int i75 = ~((i70 & 978384622) | (978384622 ^ i70));
                int i76 = ((i75 & i67) | (i67 ^ i75)) * 160;
                int i77 = (i74 ^ i76) + ((i76 & i74) << 1);
                Object[] objArr5 = new Object[1];
                a(i66, edgeSlop, tapTimeout, bAlpha, i77, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                if (((Boolean) cls.getMethod(str3, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = (~(i & 1)) & (i | 1);
                    break;
                }
                i60 = ((i60 | 1) << 1) - (i60 ^ 1);
                j = 0;
                i61 = 2;
            }
        } catch (Exception unused) {
            i3 = i ^ 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 2419);
                int iCombineMeasuredStates = 2845 - View.combineMeasuredStates(0, 0);
                int i78 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6;
                byte b3 = (byte) 0;
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iCombineMeasuredStates, i78, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j2 = -630840760;
            long j3 = -1;
            long j4 = j2 ^ j3;
            long j5 = 184;
            long j6 = jLongValue ^ j3;
            long j7 = ((long) ((int) Runtime.getRuntime().totalMemory())) ^ j3;
            long j8 = (((long) (-183)) * j2) + (((long) 185) * jLongValue) + (((long) (-368)) * (jLongValue | j4)) + ((j2 | j6 | j7) * j5) + (j5 * (((j4 | j6) ^ j3) | ((j7 | j2) ^ j3) | ((jLongValue | j2) ^ j3))) + ((long) (-528345926));
            int i79 = ~i;
            int i80 = ((int) (j8 >> 32)) & (1738041050 + (((~(782008589 | i79)) | (-2143136080) | (~(2075732295 | i79))) * (-1136)) + (((~(782008589 | i)) | (~(2075732295 | i)) | (~((-714604806) | i79))) * (-568)) + (((~((-782008590) | i79)) | (~((-2075732296) | i79)) | (~(2143136079 | i))) * 568));
            int i81 = ((int) j8) & ((-1800659321) + (((~(739560318 | i79)) | 25231361) * 98) + (((~(697666091 | i79)) | 739560318 | (~((-697666092) | i))) * (-49)) + (((~(739560318 | i)) | 672434730) * 49));
            int i82 = ((i80 & i81) | (i80 ^ i81)) ^ 1;
            int i83 = -i82;
            int i84 = ((i82 & i83) | (i82 ^ i83)) >> 31;
            int i85 = (~(i & 10)) & (i | 10) & (~i84);
            int i86 = i84 & i;
            int i87 = (i86 & i85) | (i85 ^ i86);
            int i88 = i ^ i3;
            int i89 = -i88;
            int i90 = ((i88 & i89) | (i88 ^ i89)) >> 31;
            int i91 = i87 & (~i90);
            int i92 = i3 & i90;
            int i93 = (i91 ^ i92) | (i92 & i91);
            try {
                int i94 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i95 = i94 * (-575);
                int i96 = ((i95 | 622028542) << 1) - (i95 ^ 622028542);
                int i97 = ~i94;
                int i98 = ~((i97 & (-760808063)) | (i97 ^ (-760808063)));
                int i99 = ~((-760808063) | i);
                int i100 = -(-(((i98 & i99) | (i98 ^ i99)) * 576));
                int i101 = ((i96 | i100) << 1) - (i100 ^ i96);
                int i102 = ~i94;
                int i103 = ~((760808062 & i102) | (i102 ^ 760808062));
                ?? r10 = ~i;
                int i104 = ((-760808063) ^ r10) | ((-760808063) & r10);
                int i105 = ~((i94 & i104) | (i104 ^ i94));
                int i106 = -(-(((i105 & i103) | (i103 ^ i105)) * 576));
                int i107 = (i101 ^ i106) + ((i106 & i101) << 1);
                int i108 = -(-((~(i102 | (-760808063))) * 576));
                int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i110 = (bitsPerPixel * (-109)) - 7992;
                int i111 = ~bitsPerPixel;
                int i112 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-72)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ (-72)));
                int i113 = ((i111 ^ i112) | (i111 & i112)) * (-220);
                int i114 = ((i110 | i113) << 1) - (i110 ^ i113);
                int i115 = ~((bitsPerPixel ^ (-72)) | (bitsPerPixel & (-72)));
                int i116 = -(-(((i112 & i115) | (i115 ^ i112)) * 220));
                int i117 = ((i114 | i116) << 1) - (i116 ^ i114);
                int i118 = -(-(((~((i111 ^ (-72)) | (i111 & (-72)))) | (~(bitsPerPixel | 71))) * 110));
                int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                int i120 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i121 = i120 * (-919);
                int i122 = (i121 & (-919)) + (i121 | (-919));
                int i123 = ~i120;
                int i124 = i123 | (-2);
                int i125 = ~((i124 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i124 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i127 = ((-2) ^ i126) | ((-2) & i126);
                int i128 = ~((i127 & i120) | (i127 ^ i120));
                int i129 = ((i125 & i128) | (i125 ^ i128)) * 920;
                int i130 = (i122 ^ i129) + ((i122 & i129) << 1);
                int i131 = ~((i123 ^ (-2)) | (i123 & (-2)));
                int i132 = ~((i123 ^ i126) | (i123 & i126));
                int i133 = -(-(((i131 & i132) | (i131 ^ i132)) * 920));
                int i134 = (i130 & i133) + (i133 | i130);
                int i135 = ~((i123 ^ (-2)) | (i123 & (-2)) | i126);
                int i136 = i123 | 1;
                int i137 = i120 | (-2);
                Object[] objArr7 = new Object[1];
                a(i109, i119, (short) (i134 + (((~((i137 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i137 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (~((i136 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i136 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | i135) * 920)), (byte) ((-Process.getGidForName("")) - 1), (-978384608) - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr7);
                File file = new File((String) objArr7[0]);
                int i138 = d + 83;
                g = i138 % 128;
                int i139 = i138 % 2;
                if (file.canRead()) {
                    try {
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        try {
                            String line = bufferedReader.readLine();
                            int i140 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i141 = (i140 * (-963)) - 964;
                            int i142 = (((i141 | (-259566026)) << 1) - (i141 ^ (-259566026))) + (((~i140) | (~(((-760808127) ^ i) | ((-760808127) & i)))) * (-964));
                            int i143 = ((~((i140 & (-760808127)) | ((-760808127) ^ i140))) | (~(((-760808127) ^ i79) | ((-760808127) & i79)))) * (-964);
                            int i144 = (i142 & i143) + (i143 | i142);
                            int i145 = -(KeyEvent.getMaxKeyCode() >> 16);
                            int i146 = g;
                            int i147 = (i146 ^ 9) + ((i146 & 9) << 1);
                            d = i147 % 128;
                            if (i147 % 2 != 0) {
                                i15 = (253 >>> i145) << (-3);
                                i16 = ~((~i145) | 72);
                                i17 = (r10 & 72) | (72 ^ r10);
                            } else {
                                int i148 = i145 * 253;
                                i15 = ((i148 | (-18469)) << 1) - (i148 ^ (-18469));
                                int i149 = ~i145;
                                i16 = ~((i149 & 72) | (i149 ^ 72));
                                i17 = (r10 & 72) | (72 ^ r10);
                            }
                            int i150 = ~i17;
                            int i151 = (i16 & i150) | (i16 ^ i150);
                            int i152 = (i145 ^ (-73)) | (i145 & (-73));
                            int i153 = ~((i152 & i) | (i152 ^ i));
                            int i154 = i15 + (((i151 & i153) | (i151 ^ i153)) * (-252));
                            int i155 = ((i145 ^ (-73)) | (i145 & (-73))) * (-252);
                            int i156 = (i154 ^ i155) + ((i154 & i155) << 1);
                            int i157 = (72 ^ i79) | (72 & i79);
                            int i158 = ~((i157 & i145) | (i157 ^ i145));
                            int i159 = i145 | (-73);
                            int i160 = ~((i159 & i) | (i159 ^ i));
                            int i161 = -(-(((i160 & i158) | (i158 ^ i160)) * 252));
                            int i162 = ((i156 | i161) << 1) - (i161 ^ i156);
                            short sAlpha = (short) Color.alpha(0);
                            byte bBlue = (byte) Color.blue(0);
                            r10 = "";
                            try {
                                int i163 = -TextUtils.getCapsMode(r10, 0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i164 = (i163 * (-51)) - 314774499;
                                int i165 = d;
                                int i166 = (i165 ^ 101) + ((i165 & 101) << 1);
                                int i167 = i166 % 128;
                                g = i167;
                                if (i166 % 2 == 0) {
                                    int i168 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i169 = i168 | i163;
                                    int i170 = -(~((i169 ^ (-978384567)) | (i169 & (-978384567))));
                                    int i171 = -((i170 & 52) + (i170 | 52));
                                    i18 = (i164 ^ i171) + ((i171 & i164) << 1);
                                    int i172 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i173 = ~((i172 & 978384566) | (978384566 ^ i172));
                                    int i174 = ~((978384566 ^ i163) | (978384566 & i163));
                                    i20 = (i173 & i174) | (i173 ^ i174);
                                    i19 = (i168 ^ i163) | (i168 & i163);
                                } else {
                                    int i175 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i176 = (~(i175 | i163 | (-978384567))) * 52;
                                    i18 = (i164 ^ i176) + ((i164 & i176) << 1);
                                    int i177 = ~(978384566 | i175);
                                    int i178 = ~((978384566 ^ i163) | (978384566 & i163));
                                    int i179 = (i177 & i178) | (i177 ^ i178);
                                    i19 = (i175 & i163) | (i175 ^ i163);
                                    i20 = i179;
                                }
                                int i180 = i167 + 95;
                                d = i180 % 128;
                                int i181 = i180 % 2;
                                int i182 = ~i19;
                                if (i181 != 0) {
                                    int i183 = i18 / ((-52) % ((i20 & i182) | (i20 ^ i182)));
                                    int i184 = ~i163;
                                    int i185 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i186 = ~((i185 & i184) | (i184 ^ i185));
                                    int i187 = ~(i184 | (-978384567));
                                    int i188 = i183 % (52 / ((i187 & i186) | (i186 ^ i187)));
                                    Object[] objArr8 = new Object[1];
                                    a(i144, i162, sAlpha, bBlue, i188, objArr8);
                                    if (!line.equals((String) objArr8[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        str2 = line;
                                        str = r10;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                    MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    str2 = null;
                                    str = r10;
                                } else {
                                    int i189 = (i18 - (~(-(-((-52) * (i20 | i182)))))) - 1;
                                    int i190 = ~i163;
                                    int i191 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i192 = ~((i191 & i190) | (i190 ^ i191));
                                    int i193 = ~((i190 & (-978384567)) | (i190 ^ (-978384567)));
                                    int i194 = (i189 - (~(-(-(((i193 & i192) | (i192 ^ i193)) * 52))))) - 1;
                                    Object[] objArr9 = new Object[1];
                                    a(i144, i162, sAlpha, bBlue, i194, objArr9);
                                    if (line.equals((String) objArr9[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        str2 = null;
                                        str = r10;
                                    } else {
                                        fileReader.close();
                                        bufferedReader.close();
                                        str2 = line;
                                        str = r10;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileReader.close();
                                bufferedReader.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    int i195 = d;
                    int i196 = ((i195 | 91) << 1) - (i195 ^ 91);
                    int i197 = i196 % 128;
                    g = i197;
                    if (i196 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i198 = ((i197 | 107) << 1) - (i197 ^ 107);
                    d = i198 % 128;
                    int i199 = i198 % 2;
                    r10 = "";
                    str2 = null;
                    str = r10;
                }
            } catch (Exception unused3) {
            }
            try {
                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                int i200 = ((maxKeyCode | 760808063) << 1) - (maxKeyCode ^ 760808063);
                int i201 = -ExpandableListView.getPackedPositionType(0L);
                int i202 = (i201 * 141) + 20367;
                int i203 = ((i ^ (-73)) | (i & (-73))) * 140;
                int i204 = (i202 & i203) + (i202 | i203);
                int i205 = ~i201;
                int i206 = (i205 & (-73)) | (i205 ^ (-73));
                int i207 = ~i206;
                int i208 = ~(i79 | (-73));
                int i209 = ((i207 & i208) | (i207 ^ i208)) * (-280);
                int i210 = (i204 & i209) + (i209 | i204);
                int i211 = ~((72 ^ i201) | (72 & i201));
                int i212 = ~((i201 & i79) | (i79 ^ i201));
                int i213 = -(-(((i212 & i211) | (i211 ^ i212) | (~((i206 & i) | (i206 ^ i)))) * 140));
                short sMakeMeasureSpec = (short) View.MeasureSpec.makeMeasureSpec(0, 0);
                byte packedPositionGroup = (byte) ExpandableListView.getPackedPositionGroup(0L);
                int iArgb = Color.argb(0, 0, 0, 0);
                Object[] objArr10 = new Object[1];
                a(i200, ((i210 | i213) << 1) - (i213 ^ i210), sMakeMeasureSpec, packedPositionGroup, ((iArgb | (-978384564)) << 1) - ((-978384564) ^ iArgb), objArr10);
                File file2 = new File((String) objArr10[0]);
                if (file2.canRead()) {
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    try {
                        String line2 = bufferedReader2.readLine();
                        float maxVolume = AudioTrack.getMaxVolume();
                        int i214 = d;
                        int i215 = (i214 & 13) + (i214 | 13);
                        g = i215 % 128;
                        if (i215 % 2 == 0) {
                            int i216 = (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) * 760808066;
                            scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() % 91;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i8 = (-743) >>> scrollDefaultDelay;
                            i10 = 30;
                            i9 = i216;
                        } else {
                            int i217 = -(maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1));
                            int i218 = (i217 | 760808066) + (i217 & 760808066);
                            scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i8 = scrollDefaultDelay * (-743);
                            i9 = i218;
                            i10 = -73;
                        }
                        int i219 = g;
                        int i220 = i219 + 115;
                        d = i220 % 128;
                        int i221 = i220 % 2;
                        int i222 = (scrollDefaultDelay ^ i10) | (scrollDefaultDelay & i10);
                        int i223 = (((i8 - (~((-743) * i10))) - 1) - (~((((~((scrollDefaultDelay ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (scrollDefaultDelay & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | (~i222)) | (~((i10 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i10 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))) * (-744)))) - 1;
                        int i224 = (i219 ^ 117) + ((i219 & 117) << 1);
                        d = i224 % 128;
                        if (i224 % 2 != 0) {
                            int i225 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i226 = ~scrollDefaultDelay;
                            int i227 = ~i10;
                            int i228 = ~((i226 ^ i227) | (i226 & i227));
                            int i229 = i223 << (744 % ((i228 & i225) | (i225 ^ i228)));
                            int i230 = -(744 % (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | i222));
                            i12 = (i229 & i230) + (i229 | i230);
                            i11 = 1;
                        } else {
                            int i231 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i232 = ~scrollDefaultDelay;
                            int i233 = ~i10;
                            int i234 = ~((i232 ^ i233) | (i232 & i233));
                            int i235 = ((i234 & i231) | (i231 ^ i234)) * 744;
                            int i236 = (i223 & i235) + (i235 | i223);
                            int i237 = (i222 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1) * 744;
                            i11 = 1;
                            i12 = ((i236 | i237) << 1) - (i236 ^ i237);
                        }
                        int i238 = (i219 ^ 7) + ((i219 & 7) << i11);
                        d = i238 % 128;
                        int i239 = i238 % 2;
                        short sMyPid = (short) (Process.myPid() >> 22);
                        byte longPressTimeout = (byte) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i240 = iMakeMeasureSpec * 829;
                        int i241 = ((i240 | 668041087) << 1) - (i240 ^ 668041087);
                        int i242 = ~iMakeMeasureSpec;
                        int i243 = ~((i242 & 978384532) | (i242 ^ 978384532));
                        int i244 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i245 = (i244 & iMakeMeasureSpec) | (i244 ^ iMakeMeasureSpec);
                        int i246 = -(-((i243 | (~((i245 ^ (-978384533)) | (i245 & (-978384533))))) * (-828)));
                        int i247 = (i241 ^ i246) + ((i246 & i241) << 1);
                        int i248 = iMakeMeasureSpec | (-978384533);
                        int i249 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                        int i250 = -(-(((i249 & i248) | (i248 ^ i249)) * (-828)));
                        int i251 = (i247 & i250) + (i250 | i247);
                        int i252 = -(-((~((iMakeMeasureSpec ^ (-978384533)) | (iMakeMeasureSpec & (-978384533)))) * 828));
                        Object[] objArr11 = new Object[1];
                        a(i9, i12, sMyPid, longPressTimeout, (i251 & i252) + (i252 | i251), objArr11);
                        boolean zEquals = line2.equals((String) objArr11[0]);
                        fileReader2.close();
                        bufferedReader2.close();
                        if (zEquals) {
                            int maximumDrawingCacheSize = 760808063 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i253 = -TextUtils.getTrimmedLength(str);
                            int i254 = ((i253 | (-73)) << 1) - (i253 ^ (-73));
                            int i255 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i256 = ~i255;
                            int i257 = (~i256) | i256;
                            int i258 = ~i257;
                            int i259 = ~((i ^ (-1)) | i);
                            int i260 = (i255 * 71) + 69 + (((i258 & i259) | (i258 ^ i259)) * (-140));
                            int i261 = i256 | i255;
                            int i262 = (~((i261 & i) | (i261 ^ i))) * 70;
                            int i263 = ((i260 | i262) << 1) - (i260 ^ i262);
                            int i264 = (~i257) | (~i255);
                            int i265 = ~((i255 & i) | (i255 ^ i));
                            short s3 = (short) ((i263 - (~(((i265 & i264) | (i264 ^ i265)) * 70))) - 1);
                            byte bMakeMeasureSpec = (byte) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i266 = -Color.green(0);
                            int i267 = (i266 * (-661)) - 1827886044;
                            int i268 = ~i;
                            int i269 = ~((~i266) | 978384531);
                            int i270 = -(-(((i268 & i269) | (i268 ^ i269)) * 1324));
                            int i271 = (i267 ^ i270) + ((i267 & i270) << 1);
                            int i272 = ~((i266 ^ i) | (i266 & i));
                            int i273 = ~((i ^ (-978384532)) | (i & (-978384532)));
                            int i274 = i271 + (((i272 & i273) | (i272 ^ i273)) * (-1324));
                            int i275 = ~i266;
                            int i276 = ~((i275 & (-978384532)) | (i275 ^ (-978384532)));
                            int i277 = ~((i266 & 978384531) | (978384531 ^ i266));
                            int i278 = ((i277 & i276) | (i276 ^ i277)) * 662;
                            int i279 = ((i274 | i278) << 1) - (i278 ^ i274);
                            Object[] objArr12 = new Object[1];
                            a(maximumDrawingCacheSize, i254, s3, bMakeMeasureSpec, i279, objArr12);
                            File file3 = new File((String) objArr12[0]);
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                try {
                                    String line3 = bufferedReader3.readLine();
                                    int i280 = -MotionEvent.axisFromString(str);
                                    int i281 = ((i280 | 760808064) << 1) - (i280 ^ 760808064);
                                    int i282 = -View.combineMeasuredStates(0, 0);
                                    int i283 = i282 * (-391);
                                    int i284 = (i283 ^ 14235) + ((i283 & 14235) << 1);
                                    int i285 = ~(72 | i282);
                                    int i286 = (i ^ (-73)) | (i & (-73));
                                    int i287 = ~i286;
                                    int i288 = ((i285 & i287) | (i285 ^ i287)) * (-196);
                                    int i289 = ((i284 | i288) << 1) - (i288 ^ i284);
                                    int i290 = ((i282 ^ (-73)) | (i282 & (-73))) * 392;
                                    int i291 = (i289 & i290) + (i290 | i289);
                                    int i292 = ~((~i282) | 72);
                                    int i293 = ~i286;
                                    int i294 = ((i292 & i293) | (i292 ^ i293)) * 196;
                                    int i295 = d + 49;
                                    g = i295 % 128;
                                    int i296 = i295 % 2;
                                    int i297 = (i291 & i294) + (i294 | i291);
                                    short sIndexOf = (short) TextUtils.indexOf(str, str, 0);
                                    byte b5 = (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i298 = iResolveOpacity * 784;
                                    int i299 = (i298 & 592526118) + (i298 | 592526118);
                                    int i300 = g + 97;
                                    d = i300 % 128;
                                    int i301 = i300 % 2;
                                    int i302 = ~iResolveOpacity;
                                    int i303 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                    int i304 = (((i299 & (-1570909868)) + ((-1570909868) | i299)) - (~((-783) * (~(((i302 ^ i303) | (i302 & i303)) | (-978384533)))))) - 1;
                                    int i305 = ~((i303 & (-978384533)) | (i303 ^ (-978384533)));
                                    int i306 = -(-(((i305 & i302) | (i302 ^ i305)) * 783));
                                    int i307 = (i304 ^ i306) + ((i306 & i304) << 1);
                                    Object[] objArr13 = new Object[1];
                                    a(i281, i297, sIndexOf, b5, i307, objArr13);
                                    boolean zEquals2 = line3.equals((String) objArr13[0]);
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    if (zEquals2 && str2 != null) {
                                        int i308 = d;
                                        int i309 = i308 + 49;
                                        g = i309 % 128;
                                        int i310 = i309 % 2;
                                        objArr = new Object[2];
                                        objArr[0] = new int[1];
                                        int i311 = (i308 ^ 53) + ((i308 & 53) << 1);
                                        g = i311 % 128;
                                        if (i311 % 2 == 0) {
                                            i14 = (~(i & 67)) & (i | 67);
                                            i13 = 1;
                                        } else {
                                            i13 = 1;
                                            i14 = (i & (-21)) | (i79 & 20);
                                        }
                                        String[] strArr3 = new String[i13];
                                        strArr3[0] = str2;
                                        ((int[]) objArr[0])[0] = i14;
                                        objArr[i13] = strArr3;
                                        int i312 = i308 + 107;
                                        g = i312 % 128;
                                        if (i312 % 2 == 0) {
                                            int i313 = 4 / 4;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th3;
                                }
                            }
                        }
                        int i314 = ((int[]) objArr[0])[0];
                        int i315 = ((~i93) & i) | (i93 & i79);
                        int i316 = -i315;
                        int i317 = ((i315 & i316) | (i315 ^ i316)) >> 31;
                        int i318 = ~i317;
                        int i319 = d + 121;
                        int i320 = i319 % 128;
                        g = i320;
                        int i321 = i319 % 2;
                        int i322 = i318 & i314;
                        int i323 = i93 & i317;
                        int i324 = (i323 & i322) | (i322 ^ i323);
                        String[] strArr4 = (String[]) objArr[1];
                        Object[] objArr14 = new Object[2];
                        int i325 = (i314 & i79) | ((~i314) & i);
                        int i326 = -i325;
                        int i327 = ((i325 & i326) | (i325 ^ i326)) >> 31;
                        int i328 = (i320 ^ 19) + ((i320 & 19) << 1);
                        int i329 = i328 % 128;
                        d = i329;
                        int i330 = i328 % 2;
                        int i331 = i327 & 1;
                        int i332 = (~(((-i331) | i331) >> 31)) & 1;
                        objArr14[i331] = null;
                        objArr14[i332] = strArr4;
                        String[] strArr5 = (String[]) objArr14[0];
                        int i333 = (~(i & i324)) & (i | i324);
                        int i334 = -i333;
                        int i335 = i329 + 119;
                        g = i335 % 128;
                        int i336 = i335 % 2;
                        objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i324}, strArr5};
                        int iNextInt = new Random().nextInt();
                        int i337 = ~iNextInt;
                        int i338 = (~(318558663 | i337)) | 84092440;
                        int i339 = ~(iNextInt | (-43782212));
                        i4 = (((i338 | i339) * (-252)) - 243231372) + ((i339 | (~(i337 | 402651103))) * 252) + ((((i333 & i334) | (i333 ^ i334)) >> 31) & 16);
                        int i340 = ((i4 * (-501)) - (~(i2 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
                        int i341 = ~i2;
                        int i342 = i340 + (((~((i341 & i) | (i341 ^ i))) | (~((i4 ^ i2) | (i4 & i2)))) * (-502));
                        i5 = ~i2;
                        int i343 = (i79 & i5) | (i5 ^ i79);
                        int i344 = (~((i343 & i4) | (i343 ^ i4))) * (-502);
                        i6 = ((i342 | i344) << 1) - (i342 ^ i344);
                        i7 = d + 55;
                        g = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i345 = ~i4;
                            int i346 = ~((i345 & i) | (i345 ^ i));
                            int i347 = i6 + (((i346 & i5) | (i5 ^ i346)) * TypedValues.PositionType.TYPE_DRAWPATH);
                            int i348 = (i347 << 13) ^ i347;
                            int i349 = i348 ^ (i348 >>> 17);
                            int i350 = i349 << 5;
                            ((int[]) objArr2[1])[0] = ((~i349) & i350) | ((~i350) & i349);
                            return objArr2;
                        }
                        int i351 = ~i4;
                        int i352 = ~((i351 & i) | (i351 ^ i));
                        int i353 = i6 >> (501 - (~(-((i352 & i5) | (i5 ^ i352)))));
                        int i354 = i353 / 28;
                        int i355 = ((~i353) & i354) | ((~i354) & i353);
                        int i356 = i355 / 112;
                        int i357 = ((~i355) & i356) | ((~i356) & i355);
                        ((int[]) objArr2[0])[1] = i357 ^ (i357 - 5);
                        return objArr2;
                    } catch (Throwable th4) {
                        fileReader2.close();
                        bufferedReader2.close();
                        throw th4;
                    }
                }
            } catch (Exception unused4) {
            }
            Object[] objArr15 = new Object[2];
            int[] iArr = new int[1];
            objArr15[0] = iArr;
            int i358 = g;
            int i359 = ((i358 | 19) << 1) - (i358 ^ 19);
            int i360 = i359 % 128;
            d = i360;
            if (i359 % 2 != 0) {
                strArr = new String[1];
                c = 0;
            } else {
                c = 0;
                strArr = new String[0];
            }
            iArr[c] = i;
            int i361 = i360 + 51;
            int i362 = i361 % 128;
            g = i362;
            int i363 = i361 % 2;
            objArr15[1] = strArr;
            int i364 = i362 + 79;
            d = i364 % 128;
            int i365 = i364 % 2;
            objArr = objArr15;
            int i3110 = ((int[]) objArr[0])[0];
            int i3111 = ((~i93) & i) | (i93 & i79);
            int i3112 = -i3111;
            int i3113 = ((i3111 & i3112) | (i3111 ^ i3112)) >> 31;
            int i3114 = ~i3113;
            int i3115 = d + 121;
            int i3210 = i3115 % 128;
            g = i3210;
            int i3211 = i3115 % 2;
            int i3212 = i3114 & i3110;
            int i3213 = i93 & i3113;
            int i3214 = (i3213 & i3212) | (i3212 ^ i3213);
            String[] strArr6 = (String[]) objArr[1];
            Object[] objArr16 = new Object[2];
            int i3215 = (i3110 & i79) | ((~i3110) & i);
            int i3216 = -i3215;
            int i3217 = ((i3215 & i3216) | (i3215 ^ i3216)) >> 31;
            int i3218 = (i3210 ^ 19) + ((i3210 & 19) << 1);
            int i3219 = i3218 % 128;
            d = i3219;
            int i3310 = i3218 % 2;
            int i3311 = i3217 & 1;
            int i3312 = (~(((-i3311) | i3311) >> 31)) & 1;
            objArr16[i3311] = null;
            objArr16[i3312] = strArr6;
            String[] strArr7 = (String[]) objArr16[0];
            int i3313 = (~(i & i3214)) & (i | i3214);
            int i3314 = -i3313;
            int i3315 = i3219 + 119;
            g = i3315 % 128;
            int i3316 = i3315 % 2;
            objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i3214}, strArr7};
            int iNextInt2 = new Random().nextInt();
            int i3317 = ~iNextInt2;
            int i3318 = (~(318558663 | i3317)) | 84092440;
            int i3319 = ~(iNextInt2 | (-43782212));
            i4 = (((i3318 | i3319) * (-252)) - 243231372) + ((i3319 | (~(i3317 | 402651103))) * 252) + ((((i3313 & i3314) | (i3313 ^ i3314)) >> 31) & 16);
            int i3410 = ((i4 * (-501)) - (~(i2 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
            int i3411 = ~i2;
            int i3412 = i3410 + (((~((i3411 & i) | (i3411 ^ i))) | (~((i4 ^ i2) | (i4 & i2)))) * (-502));
            i5 = ~i2;
            int i3413 = (i79 & i5) | (i5 ^ i79);
            int i3414 = (~((i3413 & i4) | (i3413 ^ i4))) * (-502);
            i6 = ((i3412 | i3414) << 1) - (i3412 ^ i3414);
            i7 = d + 55;
            g = i7 % 128;
            if (i7 % 2 == 0) {
                int i3415 = ~i4;
                int i3416 = ~((i3415 & i) | (i3415 ^ i));
                int i3417 = i6 + (((i3416 & i5) | (i5 ^ i3416)) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i3418 = (i3417 << 13) ^ i3417;
                int i3419 = i3418 ^ (i3418 >>> 17);
                int i3510 = i3419 << 5;
                ((int[]) objArr2[1])[0] = ((~i3419) & i3510) | ((~i3510) & i3419);
                return objArr2;
            }
            int i3511 = ~i4;
            int i3512 = ~((i3511 & i) | (i3511 ^ i));
            int i3513 = i6 >> (501 - (~(-((i3512 & i5) | (i5 ^ i3512)))));
            int i3514 = i3513 / 28;
            int i3515 = ((~i3513) & i3514) | ((~i3514) & i3513);
            int i3516 = i3515 / 112;
            int i3517 = ((~i3515) & i3516) | ((~i3516) & i3515);
            ((int[]) objArr2[0])[1] = i3517 ^ (i3517 - 5);
            return objArr2;
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }

    private static String $$e(byte b2, short s, byte b3) {
        int i = 121 - b2;
        int i2 = 3 - (s * 3);
        byte[] bArr = $$c;
        int i3 = b3 * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += -i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            i2++;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i += -bArr[i2];
        }
    }
}
