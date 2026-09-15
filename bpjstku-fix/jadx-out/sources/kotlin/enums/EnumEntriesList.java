package kotlin.enums;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.Enum;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0097\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "<init>", "([Ljava/lang/Enum;)V", "", "get", "(I)Ljava/lang/Enum;", "", "contains", "(Ljava/lang/Enum;)Z", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "", "writeReplace", "()Ljava/lang/Object;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "[Ljava/lang/Enum;", "getSize", "()I", "size"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EnumEntriesList<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {
    private final T[] entries;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$f = 8;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {64, 73, -26, 82, -5, 2, -7, -29, 5, 7, -40, 7, -23, -15, 3, -19, -13, -5, 2, -29, 1, -16, -9, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 253;
    private static final byte[] $$a = {25, 31, 20, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 228;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long b = 7911843290469319633L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 52
            int r8 = 107 - r8
            byte[] r0 = kotlin.enums.EnumEntriesList.$$a
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r9 = r9 * 3
            int r9 = 84 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r9
            int r8 = r8 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2d:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.enums.EnumEntriesList.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 18
            int r0 = r7 + 20
            int r6 = r6 * 33
            int r6 = 117 - r6
            int r8 = r8 * 19
            int r8 = 23 - r8
            byte[] r1 = kotlin.enums.EnumEntriesList.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 19
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.enums.EnumEntriesList.d(short, int, short, java.lang.Object[]):void");
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (!(obj instanceof Enum)) {
            int i5 = i3 + 45;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            return i5 % 2 != 0;
        }
        boolean zContains = contains((Enum) obj);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            return zContains;
        }
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Enum r4 = get(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return r4;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof Enum;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof Enum)) {
            int i4 = i3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return -1;
        }
        int iIndexOf = indexOf((Enum) obj);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            return iIndexOf;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        int i = 2 % 2;
        if (!(obj instanceof Enum)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
            return -1;
        }
        int iLastIndexOf = lastIndexOf((Enum) obj);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iLastIndexOf;
        }
        throw null;
    }

    public EnumEntriesList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        this.entries = tArr;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int length = this.entries.length;
        int i5 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final T get(int p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.entries.length);
        T t = this.entries[p0];
        int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean contains(T p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        if (((Enum) ArraysKt.getOrNull(this.entries, p0.ordinal())) != p0) {
            return false;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final int indexOf(T p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iOrdinal = p0.ordinal();
        if (((Enum) ArraysKt.getOrNull(this.entries, iOrdinal)) != p0) {
            return -1;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iOrdinal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int lastIndexOf(T p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iIndexOf = indexOf((Object) p0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iIndexOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 67;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 8328), 1235 - Color.alpha(0), 36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iResolveSize = View.resolveSize(0, 0) + 2764;
                    int i5 = 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b4 = (byte) ($$f >>> 2);
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iResolveSize, i5, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 254, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 65200);
                    int packedPositionChild = 2890 - ExpandableListView.getPackedPositionChild(0L);
                    int iRgb = (-16777199) - Color.rgb(0, 0, 0);
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    String str$$g = $$g(b6, b7, b7);
                    c2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, packedPositionChild, iRgb, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 79;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private final Object writeReplace() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) ((-16734174) - Color.rgb(0, 0, 0));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
            int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[3], bArr[40], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, scrollDefaultDelay, keyRepeatTimeout, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{50912, 2942, 28414, 51890}, new char[]{11504, 49289, 16240, 40972}, (char) ((Process.getThreadPriority(0) + 20) >> 6), Color.green(0), new char[]{30732, 21450, 5310, 49445, 33894, 32328, 35365, 15895, 3307, 5797, 30936, 50550, 65338, 25910, 60367, 32595, 7127, 4359, 42017, 36636, 27876, 8048}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{50912, 2942, 28414, 51890}, new char[]{8169, 16172, 54251, 53621}, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30163), Gravity.getAbsoluteGravity(0, 0) - 348181473, new char[]{54871, 63240, 31855, 6266, 4143, 9657, 14537, 4476, 47489, 31134, 28799, 10498, 12688, 39364, 52542}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 43042);
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[3];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i4, threadPriority, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 43043);
                int i7 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3111;
                int i8 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i7, i8, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i9 = ((int[]) objArr7[2])[0];
            int i10 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i9};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = ((((-559646296) + ((~((~iIdentityHashCode) | (-84156443))) * 433)) + (((~((-1618630341) | iIdentityHashCode)) | (-86401119)) * (-433))) + (((~(iIdentityHashCode | (-86401119))) | (-1702786783)) * 433)) - 644593074;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], new int[]{i10}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{50912, 2942, 28414, 51890}, new char[]{25463, 34087, 55386, 58059}, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 52183), Drawable.resolveOpacity(0, 0), new char[]{38797, 62615, 47152, 53521, 31350, 28110, 19493, 1807, 10457, 18856, 44122, 60229, 24789, 35915, 44801, 51258}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{50912, 2942, 28414, 51890}, new char[]{17066, 26343, 24492, 53670}, (char) (42591 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.getOffsetBefore("", 0), new char[]{28667, 50280, 13564, 43322, 22964, 13450, 44677, 29351, 10920, 30354, 22560, 22350, 2190, 32920, 61062, 14298}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i14 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -644593074};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[47];
                Object[] objArr11 = new Object[1];
                d(b5, b5, bArr3[20], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[20];
                Object[] objArr12 = new Object[1];
                d(b6, b6, bArr3[47], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43042);
                    int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    a(b7, b8, b8, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf, pressedStateDuration, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{50912, 2942, 28414, 51890}, new char[]{11504, 49289, 16240, 40972}, (char) (Process.getGidForName("") + 1), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{30732, 21450, 5310, 49445, 33894, 32328, 35365, 15895, 3307, 5797, 30936, 50550, 65338, 25910, 60367, 32595, 7127, 4359, 42017, 36636, 27876, 8048}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{50912, 2942, 28414, 51890}, new char[]{8169, 16172, 54251, 53621}, (char) (30163 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-348181473) - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{54871, 63240, 31855, 6266, 4143, 9657, 14537, 4476, 47489, 31134, 28799, 10498, 12688, 39364, 52542}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout2 = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3111;
                        int i16 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[3];
                        Object[] objArr17 = new Object[1];
                        a(b9, b9, bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout2, maximumFlingVelocity, i16, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                        int defaultSize = 3111 - View.getDefaultSize(0, 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(bArr5[3], bArr5[40], bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, defaultSize, jumpTapTimeout, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iNextInt = new Random().nextInt();
            int i20 = i17 + 563330354 + (((-94152321) | iNextInt) * 376) + (((~((~iNextInt) | 805481169)) | (-899591890)) * (-376)) + (((~(iNextInt | (-805481170))) | 899550289) * 376);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
            Object[] objArr19 = {new int[1], new int[]{i19}, new int[]{i18}, strArr2};
            return new EnumEntriesSerializationProxy(this.entries);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 == null) {
            throw null;
        }
        int i23 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
        for (int i24 = i23 % 2 != 0 ? 0 : 1; i24 < strArr3.length; i24++) {
            arrayList.add(strArr3[i24]);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 102
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = kotlin.enums.EnumEntriesList.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.enums.EnumEntriesList.$$g(short, byte, byte):java.lang.String");
    }
}
