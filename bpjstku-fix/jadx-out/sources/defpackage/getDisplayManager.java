package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.libraries.places.internal.zzrf;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
@CorrectNegativeLatLongForMediaMuxer(TuitionPaymentFragmentspecialinlinedviewModeldefault2 = startListeningToDisplayChange.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0017B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"LgetDisplayManager;", "LisTransformationInfoReady;", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LisTransformationInfoReady;)Z", "isEmpty", "()Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Map;", "b", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDisplayManager extends isTransformationInfoReady implements Map<String, isTransformationInfoReady>, KMappedMarker {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f931a;
    private static int asBinder;
    private static byte[] b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Map<String, isTransformationInfoReady> b;
    private static final byte[] $$c = {46, 47, -18, 64};
    private static final int $$f = 189;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, 25, -47, -94, 48, 1, -44, 45, -1, 4, -14, 20, -47, 34, 8, -6, 3, -5, 20, -14, -27, 37, 4, -3, -31, 30, 11, 2, -38, 25, 10, 8, -48, 34, -1, 13, 4, -27, 20, -3, 19};
    private static final int $$e = 122;
    private static final byte[] $$a = {108, -26, -110, 50, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 149;
    private static int asInterface = 1;
    private static int d = 0;
    private static int g = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | i2;
        int i10 = i8 | i2;
        int i11 = (~((~i2) | i5)) | (~i10);
        int i12 = (~(i4 | i7 | i2)) | (~(i10 | i5));
        int i13 = i2 + i5 + i + (528639218 * i3) + ((-532493036) * i6);
        int i14 = i13 * i13;
        int i15 = ((i2 * 873666089) - 1460666368) + (873666089 * i5) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i) + (1819279360 * i3) + ((-1621098496) * i6) + (586088448 * i14);
        int i16 = (i2 * (-1573143961)) + 2078511484 + (i5 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i * (-1573143025)) + (i3 * 123045422) + (i6 * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        if (i17 == 1) {
            int i18 = 2 % 2;
            String strJoinToString$default = CollectionsKt.joinToString$default(((getDisplayManager) objArr[0]).b.entrySet(), ",", "{", "}", 0, null, new Function1() { // from class: getScreenFlashInternal
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getDisplayManager.TuitionPaymentFragmentbindingInflater1((Map.Entry) obj);
                }
            }, 24, null);
            int i19 = g + 29;
            d = i19 % 128;
            int i20 = i19 % 2;
            return strJoinToString$default;
        }
        if (i17 == 2) {
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i21 = 2 % 2;
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i17 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 != 4) {
            int i22 = 2 % 2;
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        int i23 = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 1
            byte[] r0 = defpackage.getDisplayManager.$$a
            int r6 = r6 * 3
            int r6 = r6 + 97
            int r8 = r8 * 10
            int r8 = 14 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-5)
            int r6 = r6 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDisplayManager.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 37
            int r6 = 41 - r6
            int r7 = r7 * 33
            int r7 = 98 - r7
            byte[] r0 = defpackage.getDisplayManager.$$d
            int r8 = r8 * 37
            int r1 = 38 - r8
            byte[] r1 = new byte[r1]
            int r8 = 37 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
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
        L2e:
            int r6 = r6 + r4
            int r7 = r7 + 1
            int r6 = r6 + (-1)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDisplayManager.f(byte, int, byte, java.lang.Object[]):void");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 19;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof String)) {
            int i5 = i2 + 123;
            g = i5 % 128;
            return i5 % 2 == 0;
        }
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zContainsKey = this.b.containsKey(str);
        int i6 = d + 111;
        g = i6 % 128;
        int i7 = i6 % 2;
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = g + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!(obj instanceof isTransformationInfoReady)) {
            return false;
        }
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3((isTransformationInfoReady) obj);
        int i4 = d + 9;
        g = i4 % 128;
        int i5 = i4 % 2;
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, isTransformationInfoReady>> entrySet() {
        int i = 2 % 2;
        int i2 = g + 53;
        d = i2 % 128;
        int i3 = i2 % 2;
        Set<Map.Entry<String, isTransformationInfoReady>> setEntrySet = this.b.entrySet();
        int i4 = d + 13;
        g = i4 % 128;
        int i5 = i4 % 2;
        return setEntrySet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r5 = (java.lang.String) r5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r4.b.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!(r5 instanceof java.lang.String)) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((r5 instanceof java.lang.String) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 17;
        defpackage.getDisplayManager.d = r1 % 128;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.isTransformationInfoReady get(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.getDisplayManager.g
            int r2 = r1 + 35
            int r3 = r2 % 128
            defpackage.getDisplayManager.d = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L19
            boolean r2 = r5 instanceof java.lang.String
            r3 = 45
            int r3 = r3 / 0
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == r3) goto L1d
            goto L29
        L19:
            boolean r2 = r5 instanceof java.lang.String
            if (r2 != 0) goto L29
        L1d:
            int r1 = r1 + 17
            int r5 = r1 % 128
            defpackage.getDisplayManager.d = r5
            int r1 = r1 % r0
            r5 = 0
            if (r1 != 0) goto L28
            return r5
        L28:
            throw r5
        L29:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map<java.lang.String, isTransformationInfoReady> r0 = r4.b
            java.lang.Object r5 = r0.get(r5)
            isTransformationInfoReady r5 = (defpackage.isTransformationInfoReady) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDisplayManager.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        int i = 2 % 2;
        int i2 = g + 25;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            this.b.keySet();
            throw null;
        }
        return this.b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        int i = 2 % 2;
        int i2 = d + 51;
        g = i2 % 128;
        int i3 = i2 % 2;
        int size = this.b.size();
        int i4 = g + 125;
        d = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<isTransformationInfoReady> values() {
        int i = 2 % 2;
        int i2 = d + 117;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.b.values();
            throw null;
        }
        Collection<isTransformationInfoReady> collectionValues = this.b.values();
        int i3 = d + 13;
        g = i3 % 128;
        int i4 = i3 % 2;
        return collectionValues;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public getDisplayManager(Map<String, ? extends isTransformationInfoReady> map) {
        super(null);
        Intrinsics.checkNotNullParameter(map, "");
        this.b = map;
    }

    @Override // java.util.Map
    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = d + 59;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(this.b, p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.b, p0);
        int i3 = d + 41;
        g = i3 % 128;
        int i4 = i3 % 2;
        return zAreEqual;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        getDisplayManager getdisplaymanager = (getDisplayManager) objArr[0];
        int i = 2 % 2;
        int i2 = d + 1;
        g = i2 % 128;
        int i3 = i2 % 2;
        Map<String, isTransformationInfoReady> map = getdisplaymanager.b;
        if (i3 == 0) {
            map.hashCode();
            throw null;
        }
        int iHashCode = map.hashCode();
        int i4 = d + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(iHashCode);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01bc A[PHI: r0
  0x01bc: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:39:0x01ba, B:36:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01be A[PHI: r0
  0x01be: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:39:0x01ba, B:36:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        boolean z;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i7 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2267, 33 - (ViewConfiguration.getTouchSlop() >> 8), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i8 = $11 + 23;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr = b;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) i7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3358 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - (ViewConfiguration.getTapTimeout() >> 16), -1054011043, false, $$g(b5, (byte) (b5 + 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i10++;
                            i7 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $11 + 15;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = b;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 2267, ((byte) KeyEvent.getModifierMetaStateMask()) + 34, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) f931a[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11 + 79;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    i4 = ((i3 << iIntValue) >>> 4) / ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) % 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    if (z2) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2855, (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 91;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i17 = $11 + 29;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i19 = $11 + 115;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    if (z) {
                        byte[] bArr6 = b;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = f931a;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(isTransformationInfoReady p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = d + 63;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int mirror = 924 - AndroidCharacter.getMirror('0');
            int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[11], bArr[17], (byte) ($$b & 3), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, mirror, doubleTapTimeout, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(View.MeasureSpec.getSize(0) - 1510507421, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 62, (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) ('0' - AndroidCharacter.getMirror('0')), (-1498111965) - TextUtils.indexOf("", "", 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1510507418, (-69) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) Color.alpha(0), (byte) Gravity.getAbsoluteGravity(0, 0), (-1498111944) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int mode = 876 - View.MeasureSpec.getMode(0);
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte b2 = (byte) ($$b & 3);
            byte b3 = $$a[11];
            Object[] objArr6 = new Object[1];
            c(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, mode, i4, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int mode2 = View.MeasureSpec.getMode(0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[11];
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                c(b4, bArr2[12], b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iResolveOpacity, mode2, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = (((-208210156) + (((~((-960386874) | startUptimeMillis)) | 153622041) * 1504)) + ((~(startUptimeMillis | (-806764833))) * (-1504))) - 761388888;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getPressedStateDuration() >> 16) - 1510507412, (-67) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) TextUtils.indexOf("", "", 0), (byte) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1498111930, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e((-1510507413) - KeyEvent.keyCodeFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 69, (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) TextUtils.getOffsetBefore("", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1498111915, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i8 = d + 11;
            g = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), -1890593592};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[5];
                byte b7 = b6;
                Object[] objArr12 = new Object[1];
                f(b6, b7, (byte) (b7 - 1), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b8 = bArr3[5];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr13 = new Object[1];
                f(b9, b9, b8, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                    int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[11];
                    Object[] objArr15 = new Object[1];
                    c(b10, bArr4[12], b10, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i10, windowTouchSlop, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(MotionEvent.axisFromString("") - 1510507420, (-62) - TextUtils.getTrimmedLength(""), (short) (Process.myTid() >> 22), (byte) TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0') - 1498111964, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e((-1510507417) - Color.green(0), (-70) - MotionEvent.axisFromString(""), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) TextUtils.getOffsetAfter("", 0), Color.rgb(0, 0, 0) - 1481334728, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int i11 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b11 = (byte) ($$b & 3);
                        byte b12 = $$a[11];
                        Object[] objArr18 = new Object[1];
                        c(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, i11, maxKeyCode, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf3 = (char) TextUtils.indexOf("", "");
                        int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                        byte[] bArr5 = $$a;
                        Object[] objArr19 = new Object[1];
                        c(bArr5[11], bArr5[17], (byte) ($$b & 3), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, i12, keyRepeatDelay, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode;
            int i17 = i15 + (-1354025622) + (((~((-42445819) | i16)) | (-2135590)) * (-602)) + (((~(iIdentityHashCode | (-42445819))) | 42412506 | (~((-2102278) | i16))) * (-301)) + ((~(i16 | (-2135590))) * 301);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[1])[0] = i19 ^ (i19 << 5);
            int i20 = d + 67;
            g = i20 % 128;
            int i21 = i20 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i22 = d + 37;
                g = i22 % 128;
                int i23 = i22 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i24 = i14 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i26 = ~iIdentityHashCode2;
            int i27 = i25 + (((~(559976100 | i26)) | (~(iIdentityHashCode2 | 600286329))) * 959) + 335451893 + (((~(iIdentityHashCode2 | 559976100)) | (~(i26 | 600286329))) * 959);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[1])[0] = i29 ^ (i29 << 5);
        }
        int i30 = ((int[]) objArr2[1])[0];
        int i31 = ((i30 * i30) - (~(-(748323136 * i30)))) - 1;
        int i32 = -(i30 * (-1681823402));
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = (i33 & (-1083792391)) + ((-1083792391) | i33);
        int i35 = i34 >> 19;
        int i36 = (((i35 | (-16383)) << 1) - (i35 ^ (-16383))) / 8192;
        int i37 = (i36 & 1) + (i36 | 1);
        int i38 = (i34 ^ i37) + ((i37 & i34) << 1);
        int i39 = i34 >> 25;
        int i40 = (((i39 | (-255)) << 1) - (i39 ^ (-255))) / 128;
        int i41 = (-(((i40 & 1) + (i40 | 1)) ^ i38)) + 8;
        int i42 = i41 >> 27;
        int i43 = ((i42 ^ (-63)) + ((i42 & (-63)) << 1)) / 32;
        int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
        Intrinsics.checkNotNullParameter(p0, "13|value".substring(34464 / ((i41 & (-((i44 & 1) + (i44 | 1)))) * 1436)));
        return this.b.containsValue(p0);
    }

    public static /* synthetic */ CharSequence TuitionPaymentFragmentbindingInflater1(Map.Entry entry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        String str = (String) entry.getKey();
        isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) entry.getValue();
        StringBuilder sb = new StringBuilder();
        getPreviewBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb, str);
        sb.append(':');
        sb.append(istransformationinfoready);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str2 = string;
        int i2 = d + 27;
        g = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = asInterface + 71;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady compute(String str, BiFunction<? super String, ? super isTransformationInfoReady, ? extends isTransformationInfoReady> biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady computeIfAbsent(String str, Function<? super String, ? extends isTransformationInfoReady> function) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady computeIfPresent(String str, BiFunction<? super String, ? super isTransformationInfoReady, ? extends isTransformationInfoReady> biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ((Integer) TuitionPaymentFragmentbindingInflater1(new Object[]{this}, zzrf.b(), -1145165987, zzrf.b(), zzrf.b(), 1145165990, zzrf.b())).intValue();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = g + 115;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            this.b.isEmpty();
            throw null;
        }
        boolean zIsEmpty = this.b.isEmpty();
        int i3 = g + 47;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return zIsEmpty;
        }
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady merge(String str, isTransformationInfoReady istransformationinfoready, BiFunction<? super isTransformationInfoReady, ? super isTransformationInfoReady, ? extends isTransformationInfoReady> biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [isTransformationInfoReady, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady put(String str, isTransformationInfoReady istransformationinfoready) {
        ?? TuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(new Object[]{this, str, istransformationinfoready}, zzrf.b(), -1958455010, zzrf.b(), zzrf.b(), 1958455014, zzrf.b());
        return TuitionPaymentFragmentbindingInflater2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends isTransformationInfoReady> map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady putIfAbsent(String str, isTransformationInfoReady istransformationinfoready) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(new Object[]{this, obj, obj2}, zzrf.b(), 1515654176, zzrf.b(), zzrf.b(), -1515654174, zzrf.b())).booleanValue();
    }

    @Override // java.util.Map
    public final /* synthetic */ isTransformationInfoReady replace(String str, isTransformationInfoReady istransformationinfoready) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(String str, isTransformationInfoReady istransformationinfoready, isTransformationInfoReady istransformationinfoready2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super isTransformationInfoReady, ? extends isTransformationInfoReady> biFunction) {
        TuitionPaymentFragmentbindingInflater1(new Object[]{this, biFunction}, zzrf.b(), -1911673141, zzrf.b(), zzrf.b(), 1911673141, zzrf.b());
    }

    public final String toString() {
        return (String) TuitionPaymentFragmentbindingInflater1(new Object[]{this}, zzrf.b(), -565622604, zzrf.b(), zzrf.b(), 565622605, zzrf.b());
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -706346181;
        TuitionPaymentFragmentbindingInflater1 = -1934795598;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -693772520;
        b = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26};
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
    private static java.lang.String $$g(int r6, short r7, byte r8) {
        /*
            int r8 = r8 + 117
            byte[] r0 = defpackage.getDisplayManager.$$c
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getDisplayManager.$$g(int, short, byte):java.lang.String");
    }
}
