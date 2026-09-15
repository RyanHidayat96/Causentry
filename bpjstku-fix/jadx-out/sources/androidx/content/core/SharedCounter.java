package androidx.content.core;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/datastore/core/SharedCounter;", "", "", "p0", "<init>", "(J)V", "", "getValue", "()I", "incrementAndGetValue", "mappedAddress", "J", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedCounter {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final NativeSharedCounter nativeSharedCounter = new NativeSharedCounter();
    private final long mappedAddress;

    private SharedCounter(long j) {
        this.mappedAddress = j;
    }

    public final int getValue() {
        return nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
    }

    public final int incrementAndGetValue() {
        return nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SharedCounter$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/core/SharedCounter$Factory;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljava/io/File;", "p0", "Landroidx/datastore/core/SharedCounter;", "create$datastore_core_release", "(Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/SharedCounter;", "Landroid/os/ParcelFileDescriptor;", "createCounterFromFd", "(Landroid/os/ParcelFileDescriptor;)Landroidx/datastore/core/SharedCounter;", "", "loadLib", "Landroidx/datastore/core/NativeSharedCounter;", "nativeSharedCounter", "Landroidx/datastore/core/NativeSharedCounter;", "getNativeSharedCounter$datastore_core_release", "()Landroidx/datastore/core/NativeSharedCounter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$d = {89, 107, -36, -112, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
        private static final int $$e = 136;
        private static final byte[] $$a = {117, 50, 102, 124, -36, 46, -43, 6, 56, -4, 26, -16, -46, 67, -6, 18, -2, -52, 41, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, 20, -29, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, 3, 20, -44, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, -68};
        private static final int $$b = 196;

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = 105 - r9
                byte[] r0 = androidx.content.core.SharedCounter.Companion.$$a
                int r7 = r7 + 97
                int r8 = 21 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L10
                r3 = r9
                r4 = r2
                goto L27
            L10:
                r3 = r2
            L11:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L20
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L20:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L27:
                int r7 = r7 + r9
                int r7 = r7 + (-5)
                r9 = r3
                r3 = r4
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.SharedCounter.Companion.a(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = androidx.content.core.SharedCounter.Companion.$$d
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = 53 - r8
                int r6 = r6 * 3
                int r6 = 84 - r6
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r7]
            L28:
                int r3 = -r3
                int r6 = r6 + r3
                int r6 = r6 + (-10)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.SharedCounter.Companion.b(byte, byte, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return SharedCounter.nativeSharedCounter;
        }

        public final void loadLib() throws Throwable {
            byte b = (byte) 0;
            Object[] objArr = new Object[1];
            a(b, (byte) (b | 15), $$a[2], objArr);
            String str = (String) objArr[0];
            ClassLoader classLoader = Companion.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 3414), 1558 - ((byte) KeyEvent.getModifierMetaStateMask()), 23 - TextUtils.lastIndexOf("", '0'), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {str, classLoader, false, -1764227414, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1764227414};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
                    int i = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                    byte[] bArr = $$d;
                    byte b2 = (byte) (bArr[7] - 1);
                    byte b3 = bArr[37];
                    Object[] objArr4 = new Object[1];
                    b(b2, b3, (byte) (b3 + 1), objArr4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i, maximumDrawingCacheSize, -675216362, false, (String) objArr4[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 518, (-16777140) - Color.rgb(0, 0, 0)), Integer.TYPE});
                }
                Object[] objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i2 = ((int[]) objArr5[1])[0];
                int i3 = ((int[]) objArr5[2])[0];
                if (i3 == i2) {
                    int i4 = ((int[]) objArr5[0])[0];
                    int i5 = ((int[]) objArr5[2])[0];
                    int i6 = ((int[]) objArr5[1])[0];
                    String[] strArr = (String[]) objArr5[3];
                    int[] iArr = {i5};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i7 = ~iIdentityHashCode;
                    int i8 = (~((-1373697743) | i7)) | 295747652;
                    int i9 = ~(iIdentityHashCode | 1409283806);
                    int i10 = i4 + (((i8 | i9) * (-252)) - 1075971566) + ((i9 | (~(i7 | (-1077950091)))) * 252);
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
                    Object[] objArr6 = {new int[1], new int[]{i6}, iArr, strArr};
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) objArr5[3];
                    if (strArr2 != null) {
                        for (String str2 : strArr2) {
                            arrayList.add(str2);
                        }
                    }
                    Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                    int i13 = ((int[]) objArr5[0])[0];
                    int i14 = ((int[]) objArr5[2])[0];
                    int i15 = ((int[]) objArr5[1])[0];
                    String[] strArr3 = (String[]) objArr5[3];
                    int[] iArr2 = {i14};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i16 = i13 + 1312898920 + (((-1769625) | iMaxMemory) * (-627)) + (((~((-998563654) | iMaxMemory)) | 706467805) * (-627)) + (((~(iMaxMemory | 706467805)) | (~((~iMaxMemory) | 998563653))) * 627);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                    Object[] objArr7 = {new int[1], new int[]{i15}, iArr2, strArr3};
                }
                try {
                    byte[] bArr2 = $$a;
                    Object[] objArr8 = new Object[1];
                    a(bArr2[23], (byte) (-bArr2[9]), (byte) 97, objArr8);
                    Class<?> cls = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    a(bArr2[23], b, (byte) (b | 81), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b4 = bArr2[23];
                    byte b5 = bArr2[38];
                    Object[] objArr10 = new Object[1];
                    a(b4, b5, (byte) (b5 | 56), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    a(bArr2[7], bArr2[21], bArr2[5], objArr11);
                    Object objInvoke = cls.getMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0]);
                    Object[] objArr12 = new Object[1];
                    a(bArr2[23], bArr2[7], (byte) (bArr2[55] - 1), objArr12);
                    Class<?> cls4 = Class.forName((String) objArr12[0]);
                    byte b6 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    a(b6, (byte) (b6 + 1), bArr2[37], objArr13);
                    Object objInvoke2 = cls4.getMethod((String) objArr13[0], new Class[0]).invoke(Companion.class, new Object[0]);
                    if (Build.VERSION.SDK_INT > 24) {
                        Object[] objArr14 = new Object[1];
                        a(bArr2[21], bArr2[23], b, objArr14);
                        Method declaredMethod = cls.getDeclaredMethod((String) objArr14[0], cls2, cls3);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(objInvoke, objInvoke2, str);
                        return;
                    }
                    byte b7 = bArr2[21];
                    byte b8 = bArr2[58];
                    Object[] objArr15 = new Object[1];
                    a(b7, b8, b8, objArr15);
                    Method declaredMethod2 = cls.getDeclaredMethod((String) objArr15[0], cls3, cls2);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, str, objInvoke2);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause == null) {
                        throw e2;
                    }
                    throw cause;
                }
            } catch (Throwable th) {
                Throwable cause2 = th.getCause();
                if (cause2 == null) {
                    throw th;
                }
                throw cause2;
            }
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor p0) throws IOException {
            int fd = p0.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter < 0) {
                throw new IOException("Failed to mmap counter file");
            }
            return new SharedCounter(jNativeCreateSharedCounter, null);
        }

        public final SharedCounter create$datastore_core_release(Function0<? extends File> p0) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(p0.invoke(), 939524096);
                try {
                    SharedCounter sharedCounterCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return sharedCounterCreateCounterFromFd;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SharedCounter(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
