package kotlin.collections;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030!0 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "<init>", "()V", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "containsValue", "(Ljava/lang/Void;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Void;", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "getSize", "size", "", "", "getEntries", "()Ljava/util/Set;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "getKeys", UserMetadata.KEYDATA_FILENAME, "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EmptyMap implements Map, Serializable, KMappedMarker {
    public static final EmptyMap INSTANCE;
    private static int[] TuitionPaymentFragmentbindingInflater1 = null;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static final long serialVersionUID = 8246714829545688274L;
    private static final byte[] $$c = {57, -50, -56, -93};
    private static final int $$d = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {114, -59, 10, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 37;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r0 = r5 + 1
            byte[] r1 = kotlin.collections.EmptyMap.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r5
            r7 = r6
            goto L29
        L12:
            r4 = r7
            r7 = r6
            r6 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.EmptyMap.a(int, int, byte, java.lang.Object[]):void");
    }

    private EmptyMap() {
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (!(obj instanceof Void)) {
            return false;
        }
        boolean zContainsValue = containsValue((Void) obj);
        int i4 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return getEntries();
        }
        getEntries();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        Void r4 = get(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        b = i4 % 128;
        int i5 = i4 % 2;
        return r4;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        int i = 2 % 2;
        int i2 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return getKeys();
        }
        getKeys();
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        b = i2 % 128;
        int i3 = i2 % 2;
        Void voidRemove = remove(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
        return voidRemove;
    }

    @Override // java.util.Map
    public final int size() {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int size = getSize();
        int i4 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return size;
        }
        throw null;
    }

    @Override // java.util.Map
    public final Collection values() throws Throwable {
        Collection values;
        int i = 2 % 2;
        int i2 = b + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            values = getValues();
            int i3 = 88 / 0;
        } else {
            values = getValues();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return values;
    }

    @Override // java.util.Map
    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (!(p0 instanceof Map)) {
            return false;
        }
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Map map = (Map) p0;
        if (i2 % 2 == 0) {
            map.isEmpty();
            throw null;
        }
        if (!map.isEmpty()) {
            return false;
        }
        int i3 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return "{}";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Set<Map.Entry> getEntries() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        b = i2 % 128;
        int i3 = i2 % 2;
        EmptySet emptySet = EmptySet.INSTANCE;
        if (i3 == 0) {
            return emptySet;
        }
        throw null;
    }

    public final Set<Object> getKeys() {
        int i = 2 % 2;
        int i2 = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        EmptySet emptySet = EmptySet.INSTANCE;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        return emptySet;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
        int i5 = -1870535734;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 13;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 91;
                $10 = i11 % 128;
                if (i11 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3291, 31 - Color.alpha(0), 1948206109, false, $$e(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3291 - Gravity.getAbsoluteGravity(0, 0), 32 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1948206109, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i10++;
                }
                i3 = 2;
                i5 = -1870535734;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = new Object[i6];
                objArr4[i7] = Integer.valueOf(iArr5[i12]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int iIndexOf = TextUtils.indexOf("", c, i7, i7) + 3292;
                    int iArgb = 31 - Color.argb(i7, i7, i7, i7);
                    byte b6 = (byte) i7;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iIndexOf, iArgb, 1948206109, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                i12++;
                iArr5 = iArr5;
                c = '0';
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i13 = $11 + 121;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i15 = 17;
            for (int i16 = 1; i15 > i16; i16 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 2560, 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 683220507, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i15--;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 348 - View.MeasureSpec.getSize(0), ((Process.getThreadPriority(0) + 20) >> 6) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            int i19 = $10 + 95;
            $11 = i19 % 128;
            int i20 = i19 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final Collection getValues() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 651;
            int maximumDrawingCacheSize = 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 52, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, windowTouchSlop, maximumDrawingCacheSize, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{906986099, 1407681397, -15130628, -773953995, -194159669, -1444163764, 2085931157, 2038685344, -674052297, -674972922, 1661028970, 6717969, -1136744088, -1636245940}, 22 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{-1908636531, 2000849224, -133669170, -566069085, -1664899270, -2076780260, -565738249, -1448612442, -840609432, -634854127}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int iLastIndexOf = 650 - TextUtils.lastIndexOf("", '0', 0, 0);
            int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, (byte) (b2 | 51), bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, i4, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            b = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int mode = View.MeasureSpec.getMode(0) + 651;
                int fadingEdgeLength = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr6 = new Object[1];
                a((byte) $$b, (byte) 51, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, mode, fadingEdgeLength, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = (~(155279736 | iIdentityHashCode)) | 3447298;
            int i10 = ~iIdentityHashCode;
            int i11 = (-2090429705) + ((i9 | (~(i10 | (-16489)))) * 886) + (((~(i10 | (-155279737))) | 158710546) * (-1772)) + ((~(i10 | 158710546)) * 886) + 727405057;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[3])[0] = i13 ^ (i13 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Drawable.resolveOpacity(0, 0) + 1610, (KeyEvent.getMaxKeyCode() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 727405057, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int i14 = 652 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iMyTid = (Process.myTid() >> 22) + 44;
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr9 = new Object[1];
                    a(b3, (byte) (b3 | 51), bArr3[80], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, i14, iMyTid, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 694 - TextUtils.lastIndexOf("", '0', 0, 0), 98 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63406), TextUtils.indexOf("", "", 0) + 793, View.getDefaultSize(0, 0) + 83), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0');
                    int mirror = AndroidCharacter.getMirror('0') - 4;
                    Object[] objArr11 = new Object[1];
                    a((byte) $$b, (byte) 51, $$a[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iIndexOf, mirror, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new int[]{906986099, 1407681397, -15130628, -773953995, -194159669, -1444163764, 2085931157, 2038685344, -674052297, -674972922, 1661028970, 6717969, -1136744088, -1636245940}, 22 - (ViewConfiguration.getTapTimeout() >> 16), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new int[]{-1908636531, 2000849224, -133669170, -566069085, -1664899270, -2076780260, -565738249, -1448612442, -840609432, -634854127}, TextUtils.indexOf("", "") + 15, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int iGreen = 651 - Color.green(0);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 44;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr14 = new Object[1];
                        a(b4, (byte) (b4 | 51), bArr4[80], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, iGreen, iMakeMeasureSpec, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int iLastIndexOf2 = 650 - TextUtils.lastIndexOf("", '0');
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44;
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[5];
                        byte b6 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a((byte) 52, b5, b6, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, iLastIndexOf2, minimumFlingVelocity, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        if (((int[]) objArr[2])[0] == ((int[]) objArr[0])[0]) {
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int iMyTid2 = Process.myTid();
            int i18 = ~iMyTid2;
            int i19 = i15 + (-384250608) + (((~(963974047 | i18)) | 967404857) * 226) + (((~(i18 | 972914623)) | (~((-967404858) | iMyTid2)) | 958464281) * (-113)) + ((~(iMyTid2 | 963974047)) * 113);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr16[3])[0] = i21 ^ (i21 << 5);
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[1];
        if (strArr == null) {
            throw null;
        }
        int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        b = i22 % 128;
        int i23 = i22 % 2;
        for (String str : strArr) {
            arrayList.add(str);
        }
        throw null;
    }

    private final Object readResolve() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        EmptyMap emptyMap = INSTANCE;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return emptyMap;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new EmptyMap();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object p0) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean containsValue(Void p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        return i3 != 0;
    }

    @Override // java.util.Map
    public final Void get(Object p0) {
        int i = 2 % 2;
        int i2 = b + 95;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 37;
        b = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final int getSize() {
        int i = 2 % 2;
        int i2 = b + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Void put(Object obj, Void r2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Void remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new int[]{1163711932, -50441043, -752242703, -1008541725, 1414229069, 1218021462, -2118873050, 187695762, 1106223633, -1526055406, 2097821863, 419778985, -1083531363, 1929677477, 1288688278, -1924733166, 1666985165, 1255884885};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, int r8) {
        /*
            byte[] r0 = kotlin.collections.EmptyMap.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.EmptyMap.$$e(byte, short, int):java.lang.String");
    }
}
