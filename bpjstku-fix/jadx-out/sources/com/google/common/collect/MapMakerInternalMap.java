package com.google.common.collect;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.collect.MapMakerInternalMap.a;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda1;
import defpackage.addTag;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.setCameraCaptureResult;
import defpackage.setUseRepeatingSurface;
import defpackage.writeInt;
import defpackage.writeUnsignedInt;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public class MapMakerInternalMap<K, V, E extends a<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    private static RemoteActionCompatParcelizer<Object, Object, TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RemoteActionCompatParcelizer<Object, Object, TuitionPaymentFragmentspecialinlinedviewModeldefault3>() { // from class: com.google.common.collect.MapMakerInternalMap.5
        @Override // com.google.common.collect.MapMakerInternalMap.RemoteActionCompatParcelizer
        public final /* synthetic */ a b() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.RemoteActionCompatParcelizer
        public final void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.RemoteActionCompatParcelizer
        public final Object get() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.RemoteActionCompatParcelizer
        public final /* synthetic */ RemoteActionCompatParcelizer TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReferenceQueue<Object> referenceQueue, a aVar) {
            return this;
        }
    };
    private static final long serialVersionUID = 5;
    final transient d<K, V, E, S> TuitionPaymentFragmentbindingInflater1;
    final transient Segment<K, V, E, S>[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final transient int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set<K> f814a;
    private transient Collection<V> asInterface;
    final transient int b;
    final int concurrencyLevel;
    private transient Set<Map.Entry<K, V>> g;
    final Equivalence<Object> keyEquivalence;

    interface INotificationSideChannelDefault<K, V, E extends a<K, V, E>> extends a<K, V, E> {
        RemoteActionCompatParcelizer<K, V, E> b();
    }

    interface RemoteActionCompatParcelizer<K, V, E extends a<K, V, E>> {
        RemoteActionCompatParcelizer<K, V, E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReferenceQueue<V> referenceQueue, E e2);

        E b();

        void clear();

        V get();
    }

    public interface a<K, V, E extends a<K, V, E>> {
        int TuitionPaymentFragmentbindingInflater1();

        E TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        K TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        V TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    interface d<K, V, E extends a<K, V, E>, S extends Segment<K, V, E, S>> {
        E TuitionPaymentFragmentbindingInflater1(S s, K k, int i, E e2);

        void TuitionPaymentFragmentbindingInflater1(S s, E e2, V v);

        Strength TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        E TuitionPaymentFragmentspecialinlinedviewModeldefault2(S s, E e2, E e3);

        S TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i);
    }

    private static int b(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    private MapMakerInternalMap(setCameraCaptureResult setcameracaptureresult, d<K, V, E, S> dVar) {
        int i = setcameracaptureresult.TuitionPaymentFragmentbindingInflater1;
        this.concurrencyLevel = Math.min(i == -1 ? 4 : i, 65536);
        Equivalence<Object> equivalence = setcameracaptureresult.b;
        Equivalence<Object> equivalenceTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (equivalence == null) {
            if (equivalenceTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            equivalence = equivalenceTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        this.keyEquivalence = equivalence;
        this.TuitionPaymentFragmentbindingInflater1 = dVar;
        int i2 = setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iMin = Math.min(i2 == -1 ? 16 : i2, BasicMeasure.EXACTLY);
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.concurrencyLevel) {
            i5++;
            i6 <<= 1;
        }
        this.b = 32 - i5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 - 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Segment[i6];
        int i7 = iMin / i6;
        while (i4 < (i6 * i7 < iMin ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i3 >= segmentArr.length) {
                return;
            }
            segmentArr[i3] = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, i4);
            i3++;
        }
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends a<K, V, ?>, ?> b(setCameraCaptureResult setcameracaptureresult) {
        if (setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == Strength.STRONG && setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == Strength.STRONG) {
            return new MapMakerInternalMap<>(setcameracaptureresult, cancel.b.b());
        }
        if (setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == Strength.STRONG && setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == Strength.WEAK) {
            return new MapMakerInternalMap<>(setcameracaptureresult, INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
        }
        if (setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == Strength.WEAK && setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == Strength.STRONG) {
            return new MapMakerInternalMap<>(setcameracaptureresult, cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
        }
        if (setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == Strength.WEAK && setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == Strength.WEAK) {
            return new MapMakerInternalMap<>(setcameracaptureresult, getInterfaceDescriptor.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        throw new AssertionError();
    }

    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            final Equivalence<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return Equivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            final Equivalence<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return Equivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        };

        abstract Equivalence<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        /* synthetic */ Strength(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class getInterfaceDescriptor<K, V> extends TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V, getInterfaceDescriptor<K, V>> implements INotificationSideChannelDefault<K, V, getInterfaceDescriptor<K, V>> {
        volatile RemoteActionCompatParcelizer<K, V, getInterfaceDescriptor<K, V>> TuitionPaymentFragmentbindingInflater1;

        static final class TuitionPaymentFragmentbindingInflater1<K, V> implements d<K, V, getInterfaceDescriptor<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static int TuitionPaymentFragmentbindingInflater1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private static final TuitionPaymentFragmentbindingInflater1<?, ?> b;
            private static final byte[] $$c = {58, -51, 54, -115};
            private static final int $$f = 94;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {88, 99, -94, -58, 11, -3, -64, 68, -3, 3, -21, 16, -14, 15, -6, -67, 64, -5, -4, 11, -1, -5, -67, 58, 4, 5, -16, 12, -5, -14, 10, -63, 57, 11, -1, -5, -67, 25, 43, -1, -5, -44, 40, -8, 1, 4, -10, -66, 13, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -68};
            private static final int $$e = 24;
            private static final byte[] $$a = {93, -77, 2, Base64.padSymbol, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 35;
            private static int asBinder = 0;
            private static int asInterface = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 15
                    int r8 = 53 - r8
                    int r7 = r7 * 2
                    int r7 = r7 + 84
                    byte[] r0 = com.google.common.collect.MapMakerInternalMap.getInterfaceDescriptor.TuitionPaymentFragmentbindingInflater1.$$a
                    int r9 = r9 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r7 = r8
                    r3 = r9
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r9 = r9 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L27
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
                    int r7 = r7 + r9
                    int r7 = r7 + (-11)
                    r9 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.getInterfaceDescriptor.TuitionPaymentFragmentbindingInflater1.a(int, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 4
                    byte[] r0 = com.google.common.collect.MapMakerInternalMap.getInterfaceDescriptor.TuitionPaymentFragmentbindingInflater1.$$d
                    int r8 = r8 * 15
                    int r8 = r8 + 84
                    int r6 = r6 * 7
                    int r1 = r6 + 46
                    byte[] r1 = new byte[r1]
                    int r6 = r6 + 45
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r6
                    r8 = r7
                    r3 = r2
                    goto L2e
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L1b:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    int r3 = r3 + 1
                    int r8 = r8 + 1
                    r4 = r0[r8]
                L2e:
                    int r7 = r7 + r4
                    int r7 = r7 + 1
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.getInterfaceDescriptor.TuitionPaymentFragmentbindingInflater1.d(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:36:0x012f  */
            /* JADX WARN: Code duplicated, block: B:38:0x013b  */
            /* JADX WARN: Code duplicated, block: B:39:0x014e  */
            /* JADX WARN: Code duplicated, block: B:41:0x0165  */
            /* JADX WARN: Code duplicated, block: B:44:0x01b0 A[Catch: all -> 0x037c, TryCatch #0 {all -> 0x037c, blocks: (B:7:0x0027, B:9:0x0035, B:10:0x0068, B:17:0x008f, B:19:0x00a0, B:20:0x00d0, B:42:0x0167, B:44:0x01b0, B:45:0x0224), top: B:75:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:48:0x0237  */
            /* JADX WARN: Code duplicated, block: B:51:0x0273 A[Catch: all -> 0x02fd, TryCatch #1 {all -> 0x02fd, blocks: (B:49:0x0239, B:51:0x0273, B:53:0x02dc), top: B:77:0x0239 }] */
            /* JADX WARN: Code duplicated, block: B:52:0x02db  */
            /* JADX WARN: Code duplicated, block: B:60:0x0306  */
            /* JADX WARN: Code duplicated, block: B:62:0x030e  */
            /* JADX WARN: Code duplicated, block: B:63:0x0336  */
            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i4 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i5 = 1770390596;
                long j = 0;
                Object obj2 = null;
                if (cArr2 != null) {
                    int i6 = $10 + 3;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1);
                                int deadChar = 2267 - KeyEvent.getDeadChar(0, 0);
                                int i9 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, deadChar, i9, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i8++;
                            i5 = 1770390596;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i10 = $10 + 75;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 2 / 2;
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 2267, ((byte) KeyEvent.getModifierMetaStateMask()) + 34, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i12 = $11 + 35;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i14 = $10 + 39;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i3 = $11 + 39;
                                $10 = i3 % 128;
                                if (i3 % 2 != 0) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b + b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b2);
                                } else {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                }
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b7 = (byte) 1;
                                    byte b8 = (byte) (b7 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - TextUtils.lastIndexOf("", '0')), 3261 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 30 - View.MeasureSpec.getSize(0), -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    try {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b9 = (byte) 3;
                                            byte b10 = (byte) (b9 - 3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - MotionEvent.axisFromString("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 594, (ViewConfiguration.getTouchSlop() >> 8) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                    } else {
                                        int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                    }
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i3 = $11 + 39;
                                $10 = i3 % 128;
                                if (i3 % 2 != 0) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b + b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b2);
                                } else {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                }
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b11 = (byte) 1;
                                    byte b12 = (byte) (b11 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49266 - TextUtils.lastIndexOf("", '0')), 3261 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 30 - View.MeasureSpec.getSize(0), -127612708, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b13 = (byte) 3;
                                        byte b14 = (byte) (b13 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - MotionEvent.axisFromString("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 594, (ViewConfiguration.getTouchSlop() >> 8) + 17, 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i111 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i112 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i111];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i112];
                                    } else {
                                        int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                int i20 = 0;
                while (i20 < i) {
                    int i21 = $10 + 27;
                    int i22 = i21 % 128;
                    $11 = i22;
                    int i23 = i21 % 2;
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                    int i24 = i22 + 43;
                    $10 = i24 % 128;
                    int i25 = i24 % 2;
                }
                objArr[0] = new String(cArr4);
            }

            TuitionPaymentFragmentbindingInflater1() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ a TuitionPaymentFragmentbindingInflater1(Segment segment, Object obj, int i, a aVar) {
                int i2 = 2 % 2;
                int i3 = asInterface + 113;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                getInterfaceDescriptor getinterfacedescriptorB = b((WeakKeyWeakValueSegment) segment, obj, i, (getInterfaceDescriptor) aVar);
                int i5 = asBinder + 5;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return getinterfacedescriptorB;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* bridge */ /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault2(Segment segment, a aVar, a aVar2) {
                int i = 2 % 2;
                int i2 = asBinder + 9;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) aVar;
                getInterfaceDescriptor getinterfacedescriptor2 = (getInterfaceDescriptor) aVar2;
                K k = getinterfacedescriptor.get();
                Object obj = null;
                if (k == null) {
                    int i4 = asInterface + 39;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (Segment.b(getinterfacedescriptor)) {
                    int i5 = asBinder + 65;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                }
                getInterfaceDescriptor getinterfacedescriptorB = b(weakKeyWeakValueSegment, k, getinterfacedescriptor.b, getinterfacedescriptor2);
                getinterfacedescriptorB.TuitionPaymentFragmentbindingInflater1 = getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(weakKeyWeakValueSegment.queueForValues, getinterfacedescriptorB);
                int i7 = asBinder + 47;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                return getinterfacedescriptorB;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Segment segment, a aVar, Object obj) {
                int i = 2 % 2;
                getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) aVar;
                RemoteActionCompatParcelizer<K, V, getInterfaceDescriptor<K, V>> remoteActionCompatParcelizer = getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1;
                getinterfacedescriptor.TuitionPaymentFragmentbindingInflater1 = new INotificationSideChannelStubProxy(((WeakKeyWeakValueSegment) segment).queueForValues, obj, getinterfacedescriptor);
                remoteActionCompatParcelizer.clear();
                int i2 = asInterface + 119;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapMakerInternalMap mapMakerInternalMap, int i) throws Throwable {
                int i2;
                Object[] objArr;
                int i3 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    int tapTimeout = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b2, bArr[132], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, tapTimeout, i4, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{3, 5, '\f', 21, 6, 2, '\r', 21, '\t', 2, 24, 22, 4, '\t', 15, 17, 7, 11, 7, '\f', 2, 18}, (byte) (TextUtils.lastIndexOf("", '0') + 51), View.resolveSizeAndState(0, 0, 0) + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{17, 1, 5, 0, 1, 19, '\r', 16, 15, 1, 4, 17, 6, 11, 13949}, (byte) (125 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getTrimmedLength("") + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2268;
                    int i6 = 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr5 = new Object[1];
                    a(b3, b4, (byte) (b4 | 51), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, i5, i6, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int defaultSize = View.getDefaultSize(0, 0) + 2267;
                        int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr2 = $$a;
                        byte b5 = bArr2[7];
                        byte b6 = bArr2[5];
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, (byte) (b6 | 102), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, defaultSize, scrollBarSize, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i7 = ((int[]) objArr7[0])[0];
                    int i8 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int iNextInt = new Random().nextInt();
                    int i9 = ~iNextInt;
                    int i10 = (~((-1036127995) | i9)) | 226624146;
                    int i11 = ~(iNextInt | 1036918526);
                    int i12 = ((((-228492996) + ((i10 | i11) * (-713))) + (i11 * 1426)) + ((~(227414678 | i9)) * 713)) - 1657183912;
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{3, 5, '\f', 21, 6, 2, '\r', 21, 5, 0, 21, 24, 18, '\b', 16, 4, 6, 0, 24, 4, 5, 14, 21, 17, 1, '\n'}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 19), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{0, 18, 13849, 13849, 18, 6, 18, 14, 13851, 13851, 3, 2, 4, 1, 16, 4, '\b', '\t'}, (byte) (49 - TextUtils.getOffsetAfter("", 0)), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext == null) {
                        i2 = 2;
                    } else if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                        i2 = 2;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i15 = asBinder + 23;
                        asInterface = i15 % 128;
                        i2 = 2;
                        if (i15 % 2 == 0) {
                            int i16 = 3 / 2;
                        }
                    }
                    int i17 = asInterface + 85;
                    asBinder = i17 % 128;
                    int i18 = i17 % i2;
                    try {
                        Object[] objArr10 = new Object[4];
                        objArr10[3] = -1657183912;
                        objArr10[i2] = 0;
                        objArr10[1] = Integer.valueOf(i);
                        objArr10[0] = applicationContext;
                        byte[] bArr3 = $$d;
                        Object[] objArr11 = new Object[1];
                        d(bArr3[91], bArr3[20], bArr3[44], objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        d(bArr3[44], (byte) (-bArr3[41]), bArr3[91], objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 33;
                                byte[] bArr4 = $$a;
                                byte b7 = bArr4[7];
                                byte b8 = bArr4[5];
                                Object[] objArr14 = new Object[1];
                                a(b7, b8, (byte) (b8 | 102), objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, maxKeyCode, offsetAfter, -654680577, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                            try {
                                Object[] objArr15 = new Object[1];
                                c(new char[]{3, 5, '\f', 21, 6, 2, '\r', 21, '\t', 2, 24, 22, 4, '\t', 15, 17, 7, 11, 7, '\f', 2, 18}, (byte) (50 - TextUtils.getTrimmedLength("")), 22 - (Process.myTid() >> 22), objArr15);
                                Class<?> cls4 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                c(new char[]{17, 1, 5, 0, 1, 19, '\r', 16, 15, 1, 4, 17, 6, 11, 13949}, (byte) (126 - View.combineMeasuredStates(0, 0)), 15 - KeyEvent.getDeadChar(0, 0), objArr16);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                    int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                                    int i19 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32;
                                    byte b9 = $$a[7];
                                    byte b10 = b9;
                                    Object[] objArr17 = new Object[1];
                                    a(b9, b10, (byte) (b10 | 51), objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, packedPositionGroup, i19, -874156483, false, (String) objArr17[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                    int mode = View.MeasureSpec.getMode(0) + 2267;
                                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                                    byte[] bArr5 = $$a;
                                    byte b11 = bArr5[7];
                                    Object[] objArr18 = new Object[1];
                                    a(b11, b11, bArr5[132], objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, mode, scrollBarFadeDuration, -887667012, false, (String) objArr18[0], null);
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
                int i20 = ((int[]) objArr[3])[0];
                int i21 = ((int[]) objArr[0])[0];
                if (i21 == i20) {
                    int i22 = asBinder + 39;
                    asInterface = i22 % 128;
                    int i23 = i22 % 2;
                    Object[] objArr19 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i24 = ((int[]) objArr[2])[0];
                    int i25 = ((int[]) objArr[0])[0];
                    int i26 = ((int[]) objArr[3])[0];
                    String[] strArr2 = (String[]) objArr[1];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i27 = ~iIdentityHashCode;
                    int i28 = i24 + (-652709645) + ((~(750792800 | i27)) * (-560)) + ((~(iIdentityHashCode | (-53726212))) * (-560)) + (((~(57920515 | i27)) | 746598496) * 560);
                    int i29 = i28 ^ (i28 << 13);
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr19[2])[0] = i30 ^ (i30 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[1];
                    if (strArr3 != null) {
                        int i31 = asInterface + 119;
                        asBinder = i31 % 128;
                        int i32 = i31 % 2;
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
                    int i33 = ((int[]) objArr[2])[0];
                    int i34 = ((int[]) objArr[0])[0];
                    int i35 = ((int[]) objArr[3])[0];
                    new int[1][0] = i34;
                    new int[1][0] = i35;
                    int i36 = i33 + (-1062005449) + (((~(i | 917217754)) | 108504438) * (-668)) + ((917217754 | (~(108504438 | i))) * 1336) + ((922723838 | i) * 668);
                    int i37 = (i36 << 13) ^ i36;
                    int i38 = i37 ^ (i37 >>> 17);
                    int[] iArr = {i38 ^ (i38 << 5)};
                }
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i);
            }

            static {
                TuitionPaymentFragmentbindingInflater1 = 1;
                b();
                b = new TuitionPaymentFragmentbindingInflater1<>();
                int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                int i2 = i % 2;
            }

            static <K, V> TuitionPaymentFragmentbindingInflater1<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                TuitionPaymentFragmentbindingInflater1<K, V> tuitionPaymentFragmentbindingInflater1;
                int i = 2 % 2;
                int i2 = asInterface + 43;
                int i3 = i2 % 128;
                asBinder = i3;
                if (i2 % 2 != 0) {
                    tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1<K, V>) b;
                    int i4 = 8 / 0;
                } else {
                    tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1<K, V>) b;
                }
                int i5 = i3 + 39;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return tuitionPaymentFragmentbindingInflater1;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                int i = 2 % 2;
                int i2 = asBinder + 45;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Strength strength = Strength.WEAK;
                if (i3 != 0) {
                    return strength;
                }
                throw null;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                int i = 2 % 2;
                int i2 = asBinder + 5;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Strength strength = Strength.WEAK;
                int i4 = asInterface + 125;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return strength;
            }

            private static getInterfaceDescriptor<K, V> b(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, getInterfaceDescriptor<K, V> getinterfacedescriptor) {
                int i2 = 2 % 2;
                int i3 = asInterface + 119;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                if (getinterfacedescriptor == null) {
                    getInterfaceDescriptor<K, V> getinterfacedescriptor2 = new getInterfaceDescriptor<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i);
                    int i5 = asBinder + 69;
                    asInterface = i5 % 128;
                    if (i5 % 2 != 0) {
                        return getinterfacedescriptor2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).queueForKeys, k, i, getinterfacedescriptor);
                int i6 = asInterface + 53;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 94 / 0;
                }
                return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            static void b() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{60058, 60050, 60055, 60056, 60040, 60045, 60054, 60052, 60053, 60079, 60051, 60063, 60088, 60090, 60061, 60046, 60062, 60048, 60073, 60047, 60043, 60072, 60041, 60117, 60034};
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 57188;
            }

            private static String $$g(byte b2, int i, byte b3) {
                int i2 = (b3 * 4) + 4;
                int i3 = i * 3;
                byte[] bArr = $$c;
                int i4 = b2 + 113;
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                int i6 = -1;
                if (bArr == null) {
                    i2++;
                    i4 = i2 + (-i5);
                }
                while (true) {
                    int i7 = i2;
                    int i8 = i4;
                    i6++;
                    bArr2[i6] = (byte) i8;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    i2 = i7 + 1;
                    i4 = i8 + (-bArr[i7]);
                }
            }
        }

        getInterfaceDescriptor(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.TuitionPaymentFragmentbindingInflater1 = MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final V TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentbindingInflater1.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.INotificationSideChannelDefault
        public final RemoteActionCompatParcelizer<K, V, getInterfaceDescriptor<K, V>> b() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V> extends getInterfaceDescriptor<K, V> {
            private final getInterfaceDescriptor<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReferenceQueue<K> referenceQueue, K k, int i, getInterfaceDescriptor<K, V> getinterfacedescriptor) {
                super(referenceQueue, k, i);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getinterfacedescriptor;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault2, com.google.common.collect.MapMakerInternalMap.a
            public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            public static /* synthetic */ void d() {
                writeUnsignedInt.b[0] = writeInt.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            }
        }
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V, E extends a<K, V, E>> implements a<K, V, E> {
        final K TuitionPaymentFragmentbindingInflater1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public E TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return null;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(K k, int i) {
            this.TuitionPaymentFragmentbindingInflater1 = k;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final K TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final int TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    static <K, V, E extends a<K, V, E>> RemoteActionCompatParcelizer<K, V, E> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (RemoteActionCompatParcelizer<K, V, E>) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    static class cancel<K, V> extends TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V, cancel<K, V>> implements setUseRepeatingSurface<K, V, cancel<K, V>> {
        volatile V TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* synthetic */ cancel(Object obj, int i, byte b2) {
            this(obj, i);
        }

        private cancel(K k, int i) {
            super(k, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final V TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX INFO: loaded from: classes6.dex */
        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V> extends cancel<K, V> {
            private final cancel<K, V> b;

            TuitionPaymentFragmentspecialinlinedviewModeldefault2(K k, int i, cancel<K, V> cancelVar) {
                super(k, i, (byte) 0);
                this.b = cancelVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.MapMakerInternalMap.a
            public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return this.b;
            }
        }

        static final class b<K, V> implements d<K, V, cancel<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final b<?, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b<>();

            b() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ a TuitionPaymentFragmentbindingInflater1(Segment segment, Object obj, int i, a aVar) {
                cancel cancelVar = (cancel) aVar;
                if (cancelVar == null) {
                    return new cancel(obj, i, (byte) 0);
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj, i, cancelVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Segment segment, a aVar, Object obj) {
                ((cancel) aVar).TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault2(Segment segment, a aVar, a aVar2) {
                cancel tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                cancel cancelVar = (cancel) aVar;
                cancel cancelVar2 = (cancel) aVar2;
                K k = cancelVar.TuitionPaymentFragmentbindingInflater1;
                int i = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (cancelVar2 == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new cancel(k, i, (byte) 0);
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(k, i, cancelVar2);
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cancelVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            static <K, V> b<K, V> b() {
                return (b<K, V>) TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i);
            }
        }
    }

    static class INotificationSideChannel<K, V> extends TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V, INotificationSideChannel<K, V>> implements INotificationSideChannelDefault<K, V, INotificationSideChannel<K, V>> {
        volatile RemoteActionCompatParcelizer<K, V, INotificationSideChannel<K, V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* synthetic */ INotificationSideChannel(Object obj, int i, byte b) {
            this(obj, i);
        }

        private INotificationSideChannel(K k, int i) {
            super(k, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final V TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.INotificationSideChannelDefault
        public final RemoteActionCompatParcelizer<K, V, INotificationSideChannel<K, V>> b() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX INFO: loaded from: classes6.dex */
        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<K, V> extends INotificationSideChannel<K, V> {
            private final INotificationSideChannel<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            TuitionPaymentFragmentspecialinlinedviewModeldefault3(K k, int i, INotificationSideChannel<K, V> iNotificationSideChannel) {
                super(k, i, (byte) 0);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNotificationSideChannel;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.MapMakerInternalMap.a
            public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V> implements d<K, V, INotificationSideChannel<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final TuitionPaymentFragmentspecialinlinedviewModeldefault1<?, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>();

            TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ a TuitionPaymentFragmentbindingInflater1(Segment segment, Object obj, int i, a aVar) {
                INotificationSideChannel iNotificationSideChannel = (INotificationSideChannel) aVar;
                if (iNotificationSideChannel == null) {
                    return new INotificationSideChannel(obj, i, (byte) 0);
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, i, iNotificationSideChannel);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Segment segment, a aVar, Object obj) {
                INotificationSideChannel iNotificationSideChannel = (INotificationSideChannel) aVar;
                RemoteActionCompatParcelizer<K, V, INotificationSideChannel<K, V>> remoteActionCompatParcelizer = iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new INotificationSideChannelStubProxy(((StrongKeyWeakValueSegment) segment).queueForValues, obj, iNotificationSideChannel);
                remoteActionCompatParcelizer.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* bridge */ /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault2(Segment segment, a aVar, a aVar2) {
                INotificationSideChannel tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                INotificationSideChannel iNotificationSideChannel = (INotificationSideChannel) aVar;
                INotificationSideChannel iNotificationSideChannel2 = (INotificationSideChannel) aVar2;
                if (Segment.b(iNotificationSideChannel)) {
                    return null;
                }
                K k = iNotificationSideChannel.TuitionPaymentFragmentbindingInflater1;
                int i = iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (iNotificationSideChannel2 == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new INotificationSideChannel(k, i, (byte) 0);
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(k, i, iNotificationSideChannel2);
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iNotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strongKeyWeakValueSegment.queueForValues, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }

            static <K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V> TuitionPaymentFragmentbindingInflater1() {
                return (TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V>) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i);
            }
        }
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V, E extends a<K, V, E>> extends WeakReference<K> implements a<K, V, E> {
        final int b;

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public E TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return null;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(k, referenceQueue);
            this.b = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final K TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final int TuitionPaymentFragmentbindingInflater1() {
            return this.b;
        }
    }

    static class cancelAll<K, V> extends TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V, cancelAll<K, V>> implements setUseRepeatingSurface<K, V, cancelAll<K, V>> {
        volatile V TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* synthetic */ cancelAll(ReferenceQueue referenceQueue, Object obj, int i, byte b) {
            this(referenceQueue, obj, i);
        }

        private cancelAll(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final V TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX INFO: loaded from: classes6.dex */
        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<K, V> extends cancelAll<K, V> {
            private final cancelAll<K, V> TuitionPaymentFragmentbindingInflater1;

            /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReferenceQueue referenceQueue, Object obj, int i, cancelAll cancelall, byte b) {
                this(referenceQueue, obj, i, cancelall);
            }

            private TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReferenceQueue<K> referenceQueue, K k, int i, cancelAll<K, V> cancelall) {
                super(referenceQueue, k, i, (byte) 0);
                this.TuitionPaymentFragmentbindingInflater1 = cancelall;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault2, com.google.common.collect.MapMakerInternalMap.a
            public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return this.TuitionPaymentFragmentbindingInflater1;
            }
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V> implements d<K, V, cancelAll<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final TuitionPaymentFragmentspecialinlinedviewModeldefault2<?, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2<>();

            TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ a TuitionPaymentFragmentbindingInflater1(Segment segment, Object obj, int i, a aVar) {
                return b((WeakKeyStrongValueSegment) segment, obj, i, (cancelAll) aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Segment segment, a aVar, Object obj) {
                ((cancelAll) aVar).TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault2(Segment segment, a aVar, a aVar2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                cancelAll cancelall = (cancelAll) aVar;
                cancelAll cancelall2 = (cancelAll) aVar2;
                K k = cancelall.get();
                if (k == null) {
                    return null;
                }
                cancelAll cancelallB = b(weakKeyStrongValueSegment, k, cancelall.b, cancelall2);
                cancelallB.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelall.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                return cancelallB;
            }

            static <K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V> b() {
                return (TuitionPaymentFragmentspecialinlinedviewModeldefault2<K, V>) TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final Strength TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return Strength.STRONG;
            }

            private static cancelAll<K, V> b(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, cancelAll<K, V> cancelall) {
                if (cancelall == null) {
                    return new cancelAll<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i, (byte) 0);
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys, k, i, cancelall, (byte) 0);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.d
            public final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapMakerInternalMap mapMakerInternalMap, int i) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i);
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements a<Object, Object, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final int TuitionPaymentFragmentbindingInflater1() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.a
        public final /* synthetic */ a TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            throw new AssertionError();
        }
    }

    static final class INotificationSideChannelStubProxy<K, V, E extends a<K, V, E>> extends WeakReference<V> implements RemoteActionCompatParcelizer<K, V, E> {
        private E b;

        INotificationSideChannelStubProxy(ReferenceQueue<V> referenceQueue, V v, E e2) {
            super(v, referenceQueue);
            this.b = e2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.RemoteActionCompatParcelizer
        public final E b() {
            return this.b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.RemoteActionCompatParcelizer
        public final RemoteActionCompatParcelizer<K, V, E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReferenceQueue<V> referenceQueue, E e2) {
            return new INotificationSideChannelStubProxy(referenceQueue, get(), e2);
        }
    }

    static V TuitionPaymentFragmentspecialinlinedviewModeldefault2(E e2) {
        if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == null) {
            return null;
        }
        return (V) e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    static abstract class Segment<K, V, E extends a<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        volatile AtomicReferenceArray<E> table;
        int threshold;

        void TuitionPaymentFragmentbindingInflater1() {
        }

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        abstract S TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i) {
            this.map = mapMakerInternalMap;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i);
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        final void TuitionPaymentFragmentbindingInflater1(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                a aVar = (a) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.map;
                int iTuitionPaymentFragmentbindingInflater1 = aVar.TuitionPaymentFragmentbindingInflater1();
                mapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1[mapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault2 & (iTuitionPaymentFragmentbindingInflater1 >>> mapMakerInternalMap.b)].TuitionPaymentFragmentspecialinlinedviewModeldefault2(aVar, iTuitionPaymentFragmentbindingInflater1);
                i++;
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.map;
                a aVarB = remoteActionCompatParcelizer.b();
                int iTuitionPaymentFragmentbindingInflater1 = aVarB.TuitionPaymentFragmentbindingInflater1();
                mapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1[mapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault2 & (iTuitionPaymentFragmentbindingInflater1 >>> mapMakerInternalMap.b)].TuitionPaymentFragmentspecialinlinedviewModeldefault1(aVarB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentbindingInflater1, remoteActionCompatParcelizer);
                i++;
            } while (i != 16);
        }

        private E TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            for (E e2 = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); e2 != null; e2 = (E) e2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                if (e2.TuitionPaymentFragmentbindingInflater1() == i) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = e2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        if (this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                            return e2;
                        }
                    } else if (tryLock()) {
                        try {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            unlock();
                        } catch (Throwable th) {
                            unlock();
                            throw th;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }

        final boolean b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, i);
                if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                    z = true;
                }
                return z;
            } finally {
                if ((this.readCount.incrementAndGet() & 63) == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
        }

        final V b(K k, int i, V v, boolean z) {
            lock();
            try {
                b();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i3 = this.count;
                        ScheduledRunnable scheduledRunnable = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
                        this.threshold = (scheduledRunnable.length() * 3) / 4;
                        int length2 = scheduledRunnable.length() - 1;
                        for (int i4 = 0; i4 < length; i4++) {
                            E eTuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReferenceArray.get(i4);
                            if (eTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                                a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int iTuitionPaymentFragmentbindingInflater1 = eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() & length2;
                                if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                    scheduledRunnable.set(iTuitionPaymentFragmentbindingInflater1, eTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                } else {
                                    a aVar = eTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    while (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                                        int iTuitionPaymentFragmentbindingInflater2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() & length2;
                                        if (iTuitionPaymentFragmentbindingInflater2 != iTuitionPaymentFragmentbindingInflater1) {
                                            aVar = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            iTuitionPaymentFragmentbindingInflater1 = iTuitionPaymentFragmentbindingInflater2;
                                        }
                                        aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    }
                                    scheduledRunnable.set(iTuitionPaymentFragmentbindingInflater1, aVar);
                                    while (eTuitionPaymentFragmentspecialinlinedviewModeldefault1 != aVar) {
                                        int iTuitionPaymentFragmentbindingInflater3 = eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() & length2;
                                        a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), eTuitionPaymentFragmentspecialinlinedviewModeldefault1, (a) scheduledRunnable.get(iTuitionPaymentFragmentbindingInflater3));
                                        if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                            scheduledRunnable.set(iTuitionPaymentFragmentbindingInflater3, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        } else {
                                            i3--;
                                        }
                                        eTuitionPaymentFragmentspecialinlinedviewModeldefault1 = eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    }
                                }
                            }
                        }
                        this.table = scheduledRunnable;
                        this.count = i3;
                    }
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray2 = this.table;
                int length3 = (atomicReferenceArray2.length() - 1) & i;
                E e2 = atomicReferenceArray2.get(length3);
                for (a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = e2; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1() == i && objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        V v2 = (V) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (v2 == null) {
                            this.modCount++;
                            this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, v);
                            this.count = this.count;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.modCount++;
                        this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), aVarTuitionPaymentFragmentspecialinlinedviewModeldefault3, v);
                        return v2;
                    }
                }
                this.modCount++;
                a aVarTuitionPaymentFragmentbindingInflater1 = this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), k, i, e2);
                this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), aVarTuitionPaymentFragmentbindingInflater1, v);
                atomicReferenceArray2.set(length3, (E) aVarTuitionPaymentFragmentbindingInflater1);
                this.count = i2;
                return null;
            } finally {
                unlock();
            }
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(K k, int i, V v, V v2) {
            lock();
            try {
                b();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e2 = atomicReferenceArray.get(length);
                for (a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = e2; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() == i && objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            if (!this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(v, objTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                                return false;
                            }
                            this.modCount++;
                            this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, v2);
                            return true;
                        }
                        if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == null) {
                            this.modCount++;
                            a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i2 = this.count;
                            atomicReferenceArray.set(length, (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            this.count = i2 - 1;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        final V TuitionPaymentFragmentbindingInflater1(K k, int i, V v) {
            lock();
            try {
                b();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e2 = atomicReferenceArray.get(length);
                for (a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = e2; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() == i && objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        V v2 = (V) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (v2 != null) {
                            this.modCount++;
                            this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1, v);
                            return v2;
                        }
                        if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == null) {
                            this.modCount++;
                            a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i2 = this.count;
                            atomicReferenceArray.set(length, (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            this.count = i2 - 1;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        final V TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i) {
            lock();
            try {
                b();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e2 = atomicReferenceArray.get(length);
                for (a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = e2; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() == i && objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        V v = (V) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (v == null && aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                            return null;
                        }
                        this.modCount++;
                        a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        this.count = i2 - 1;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i, Object obj2) {
            lock();
            try {
                b();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e2 = atomicReferenceArray.get(length);
                a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = e2;
                while (true) {
                    boolean z = false;
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        return false;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() != i || objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || !this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        if (this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                            z = true;
                        } else if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                            return false;
                        }
                        this.modCount++;
                        a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        this.count = i2 - 1;
                        return z;
                    }
                }
            } finally {
                unlock();
            }
        }

        private E TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, E e3) {
            int i = this.count;
            E e4 = (E) e3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            while (e2 != e3) {
                a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.map.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), e2, e4);
                if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    e4 = (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    i--;
                }
                e2 = (E) e2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            this.count = i;
            return e4;
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(E e2, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e3 = atomicReferenceArray.get(length);
                for (a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = e3; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 == e2) {
                        this.modCount++;
                        a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(e3, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(K k, int i, RemoteActionCompatParcelizer<K, V, E> remoteActionCompatParcelizer) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e2 = atomicReferenceArray.get(length);
                for (a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = e2; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null; aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1() == i && objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && this.map.keyEquivalence.TuitionPaymentFragmentspecialinlinedviewModeldefault1(k, objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                        if (((INotificationSideChannelDefault) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1).b() != remoteActionCompatParcelizer) {
                            return false;
                        }
                        this.modCount++;
                        a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        static <K, V, E extends a<K, V, E>> boolean b(E e2) {
            return e2.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == null;
        }

        final V TuitionPaymentFragmentbindingInflater1(Object obj, int i) {
            try {
                a aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, i);
                if (aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    V v = (V) aVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    if (v == null && tryLock()) {
                        try {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            unlock();
                        } catch (Throwable th) {
                            unlock();
                            throw th;
                        }
                    }
                    if ((this.readCount.incrementAndGet() & 63) == 0) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                    return v;
                }
                if ((this.readCount.incrementAndGet() & 63) != 0) {
                    return null;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return null;
            } catch (Throwable th2) {
                if ((this.readCount.incrementAndGet() & 63) == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                throw th2;
            }
        }

        private void b() {
            if (tryLock()) {
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (tryLock()) {
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }
    }

    static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, cancel<K, V>, StrongKeyStrongValueSegment<K, V>> {
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this;
        }

        StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, cancel<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }
    }

    static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, INotificationSideChannel<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this;
        }

        StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, INotificationSideChannel<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void TuitionPaymentFragmentbindingInflater1() {
            while (this.queueForValues.poll() != null) {
            }
        }
    }

    static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, cancelAll<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this;
        }

        WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, cancelAll<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TuitionPaymentFragmentbindingInflater1(this.queueForKeys);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void TuitionPaymentFragmentbindingInflater1() {
            while (this.queueForKeys.poll() != null) {
            }
        }
    }

    static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, getInterfaceDescriptor<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final /* synthetic */ Segment TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this;
        }

        WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, getInterfaceDescriptor<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.queueForKeys = new ReferenceQueue<>();
            this.queueForValues = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TuitionPaymentFragmentbindingInflater1(this.queueForKeys);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.queueForValues);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        final void TuitionPaymentFragmentbindingInflater1() {
            while (this.queueForKeys.poll() != null) {
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (Segment<K, V, E, S> segment : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            j += (long) segment.count;
        }
        if (j > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i2 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    for (E eTuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReferenceArray.get(r13); eTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null; eTuitionPaymentFragmentspecialinlinedviewModeldefault1 = eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        if (eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = eTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                if (segment.tryLock()) {
                                    try {
                                        segment.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        segment.unlock();
                                    } catch (Throwable th) {
                                        segment.unlock();
                                        throw th;
                                    }
                                }
                            }
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, objTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                                return true;
                            }
                        } else if (segment.tryLock()) {
                            try {
                                segment.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                segment.unlock();
                            } catch (Throwable th2) {
                                segment.unlock();
                                throw th2;
                            }
                        }
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        }
                    }
                }
                j2 += (long) segment.modCount;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    segment.TuitionPaymentFragmentbindingInflater1();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                    segment.unlock();
                } catch (Throwable th) {
                    segment.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f814a;
        if (set != null) {
            return set;
        }
        asInterface asinterface = new asInterface();
        this.f814a = asinterface;
        return asinterface;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.asInterface;
        if (collection != null) {
            return collection;
        }
        notify notifyVar = new notify();
        this.asInterface = notifyVar;
        return notifyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.g;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.g = bVar;
        return bVar;
    }

    public abstract class g<T> implements Iterator<T> {
        public static int TuitionPaymentFragmentbindingInflater1 = -776623219;
        MapMakerInternalMap<K, V, E, S>.INotificationSideChannelStub TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        MapMakerInternalMap<K, V, E, S>.INotificationSideChannelStub TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private AtomicReferenceArray<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private int asBinder = -1;
        private Segment<K, V, E, S> b;
        private E d;
        private int g;

        g() {
            this.g = MapMakerInternalMap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - 1;
            b();
        }

        final void b() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3() || TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                return;
            }
            while (this.g >= 0) {
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i = this.g;
                this.g = i - 1;
                Segment<K, V, E, S> segment = segmentArr[i];
                this.b = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.b.table;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReferenceArray;
                    this.asBinder = atomicReferenceArray.length() - 1;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        return;
                    }
                }
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            E e2 = this.d;
            if (e2 == null) {
                return false;
            }
            while (true) {
                E e3 = (E) e2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                this.d = e3;
                if (e3 == null) {
                    return false;
                }
                if (b(e3)) {
                    return true;
                }
                e2 = this.d;
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            while (true) {
                int i = this.asBinder;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.asBinder = i - 1;
                E e2 = atomicReferenceArray.get(i);
                this.d = e2;
                if (e2 != null && (b(e2) || TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                    return true;
                }
            }
        }

        private boolean b(E e2) {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = e2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MapMakerInternalMap.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new INotificationSideChannelStub(objTuitionPaymentFragmentspecialinlinedviewModeldefault2, objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } finally {
                Segment<K, V, E, S> segment = this.b;
                if ((segment.readCount.incrementAndGet() & 63) == 0) {
                    segment.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            MapMakerInternalMap<K, V, E, S>.INotificationSideChannelStub iNotificationSideChannelStub = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (iNotificationSideChannelStub != null) {
                MapMakerInternalMap.this.remove(iNotificationSideChannelStub.getKey());
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    final class asBinder extends MapMakerInternalMap<K, V, E, S>.g<K> {
        asBinder() {
            super();
        }

        @Override // java.util.Iterator
        public final K next() {
            MapMakerInternalMap<K, V, E, S>.INotificationSideChannelStub iNotificationSideChannelStub = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (iNotificationSideChannelStub == null) {
                throw new NoSuchElementException();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iNotificationSideChannelStub;
            b();
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getKey();
        }
    }

    final class onTransact extends MapMakerInternalMap<K, V, E, S>.g<V> {
        onTransact() {
            super();
        }

        @Override // java.util.Iterator
        public final V next() {
            MapMakerInternalMap<K, V, E, S>.INotificationSideChannelStub iNotificationSideChannelStub = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (iNotificationSideChannelStub == null) {
                throw new NoSuchElementException();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iNotificationSideChannelStub;
            b();
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        }
    }

    final class INotificationSideChannelStub extends CameraStateRegistryCameraRegistrationExternalSyntheticLambda1<K, V> {
        private K TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private V TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        INotificationSideChannelStub(K k, V v) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = k;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = v;
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda1, java.util.Map.Entry
        public final K getKey() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda1, java.util.Map.Entry
        public final V getValue() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda1, java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(entry.getKey()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(entry.getValue());
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda1, java.util.Map.Entry
        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        @Override // defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda1, java.util.Map.Entry
        public final V setValue(V v) {
            V vPut = MapMakerInternalMap.this.put(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, v);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = v;
            return vPut;
        }
    }

    final class TuitionPaymentFragmentbindingInflater1 extends MapMakerInternalMap<K, V, E, S>.g<Map.Entry<K, V>> {
        TuitionPaymentFragmentbindingInflater1() {
            super();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            MapMakerInternalMap<K, V, E, S>.INotificationSideChannelStub iNotificationSideChannelStub = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (iNotificationSideChannelStub == null) {
                throw new NoSuchElementException();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iNotificationSideChannelStub;
            b();
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    final class asInterface extends AbstractSet<K> {
        asInterface() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new asBinder();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    final class notify extends AbstractCollection<V> {
        notify() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new onTransact();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    final class b extends AbstractSet<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new TuitionPaymentFragmentbindingInflater1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            V v;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (v = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.getValue(), v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    Object writeReplace() {
        return new SerializationProxy(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.keyEquivalence, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(), this.concurrencyLevel, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    static abstract class AbstractSerializationProxy<K, V> extends addTag<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        transient ConcurrentMap<K, V> b;
        final int concurrencyLevel;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.b = concurrentMap;
        }

        @Override // defpackage.addTag
        /* JADX INFO: renamed from: b */
        public final ConcurrentMap<K, V> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.b;
        }

        @Override // defpackage.addTag, defpackage.clearSurfaces, defpackage.addCameraCaptureCallback
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }

        @Override // defpackage.addTag, defpackage.clearSurfaces
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
        public final /* synthetic */ Map TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.b;
        }
    }

    static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.b.size());
            for (Map.Entry<K, V> entry : this.b.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i = objectInputStream.readInt();
            setCameraCaptureResult setcameracaptureresult = new setCameraCaptureResult();
            int i2 = setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (!(i2 == -1)) {
                throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("initial capacity was already set to %s", Integer.valueOf(i2)));
            }
            if (i >= 0) {
                setcameracaptureresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                setCameraCaptureResult setcameracaptureresultB = setcameracaptureresult.b(this.keyStrength);
                Strength strength = this.valueStrength;
                Strength strength2 = setcameracaptureresultB.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (strength2 == null) {
                    setcameracaptureresultB.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strength;
                    if (strength != Strength.STRONG) {
                        setcameracaptureresultB.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                    }
                    Equivalence<Object> equivalence = this.keyEquivalence;
                    Equivalence<Object> equivalence2 = setcameracaptureresultB.b;
                    if (equivalence2 == null) {
                        setcameracaptureresultB.b = equivalence;
                        setcameracaptureresultB.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                        int i3 = this.concurrencyLevel;
                        int i4 = setcameracaptureresultB.TuitionPaymentFragmentbindingInflater1;
                        if (!(i4 == -1)) {
                            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("concurrency level was already set to %s", Integer.valueOf(i4)));
                        }
                        if (i3 > 0) {
                            setcameracaptureresultB.TuitionPaymentFragmentbindingInflater1 = i3;
                            this.b = setcameracaptureresultB.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            while (true) {
                                Object object = objectInputStream.readObject();
                                if (object == null) {
                                    return;
                                } else {
                                    this.b.put((K) object, (V) objectInputStream.readObject());
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("key equivalence was already set to %s", equivalence2));
                    }
                } else {
                    throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Value strength was already set to %s", strength2));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        private Object readResolve() {
            return this.b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iB = b(this.keyEquivalence.b(obj));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].b(obj, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iB = b(this.keyEquivalence.b(obj));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].TuitionPaymentFragmentbindingInflater1(obj, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int iB = b(this.keyEquivalence.b(k));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].b(k, iB, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        int iB = b(this.keyEquivalence.b(k));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].b(k, iB, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iB = b(this.keyEquivalence.b(obj));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj, iB);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iB = b(this.keyEquivalence.b(obj));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj, iB, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        int iB = b(this.keyEquivalence.b(k));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].TuitionPaymentFragmentbindingInflater1(k, iB, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        if (v == null) {
            return false;
        }
        int iB = b(this.keyEquivalence.b(k));
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iB >>> this.b) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault2].TuitionPaymentFragmentspecialinlinedviewModeldefault3(k, iB, v, v2);
    }
}
