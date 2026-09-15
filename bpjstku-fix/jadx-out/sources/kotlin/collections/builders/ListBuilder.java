package kotlin.collections.builders;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0001\u0018\u0000 X*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003XYZB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010'J\u001d\u0010)\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J%\u0010)\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010+J\u000f\u0010,\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u0016J\u0017\u0010/\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u0010%J\u001d\u00100\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b0\u0010*J\u001d\u00101\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b1\u0010*J%\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0017¢\u0006\u0004\b2\u00103J)\u00106\u001a\b\u0012\u0004\u0012\u00028\u000105\"\u0004\b\u0001\u001042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0017¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f05H\u0017¢\u0006\u0004\b6\u00108J\u001a\u00109\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b9\u0010%J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0017¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020&H\u0002¢\u0006\u0004\b?\u0010-J\u000f\u0010@\u001a\u00020&H\u0002¢\u0006\u0004\b@\u0010-J\u0017\u0010A\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\u000bJ\u0017\u0010B\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010\u000bJ\u001b\u0010C\u001a\u00020\u00122\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\bG\u0010'J-\u0010I\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010\u0016J\u001f\u0010L\u001a\u00020&2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010FJ5\u0010N\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bN\u0010OR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010;"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "<init>", "(I)V", "", "build", "()Ljava/util/List;", "", "writeReplace", "()Ljava/lang/Object;", "", "isEmpty", "()Z", "get", "(I)Ljava/lang/Object;", "p1", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "subList", "(II)Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "registerModification", "checkIsMutable", "ensureExtraCapacity", "ensureCapacityInternal", "contentEquals", "(Ljava/util/List;)Z", "insertAtInternal", "(II)V", "addAtInternal", "p2", "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "removeRangeInternal", "p3", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", "backing", "[Ljava/lang/Object;", "length", "I", "isReadOnly", "Z", "getSize", "size", "Companion", "Itr", "BuilderSubList"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    private static final Companion Companion;
    private static final ListBuilder Empty;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private E[] backing;
    private boolean isReadOnly;
    private int length;
    private static final byte[] $$c = {27, 65, -33, 120};
    private static final int $$d = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 246;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1235a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = 53 - r8
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r1 = kotlin.collections.builders.ListBuilder.$$a
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.d(short, short, byte, java.lang.Object[]):void");
    }

    public ListBuilder(int i) {
        this.backing = (E[]) ListBuilderKt.arrayOfUninitializedElements(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ListBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = asBinder + 87;
            f1235a = i3 % 128;
            i = i3 % 2 == 0 ? 64 : 10;
            int i4 = 2 % 2;
        }
        this(i);
    }

    public static final /* synthetic */ void access$addAllInternal(ListBuilder listBuilder, int i, Collection collection, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 5;
        f1235a = i4 % 128;
        int i5 = i4 % 2;
        listBuilder.addAllInternal(i, collection, i2);
        int i6 = asBinder + 107;
        f1235a = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$addAtInternal(ListBuilder listBuilder, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 35;
        f1235a = i3 % 128;
        int i4 = i3 % 2;
        listBuilder.addAtInternal(i, obj);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f1235a + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ Object[] access$getBacking$p(ListBuilder listBuilder) {
        int i = 2 % 2;
        int i2 = f1235a + 63;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        E[] eArr = listBuilder.backing;
        int i5 = i3 + 117;
        f1235a = i5 % 128;
        if (i5 % 2 != 0) {
            return eArr;
        }
        throw null;
    }

    public static final /* synthetic */ int access$getLength$p(ListBuilder listBuilder) {
        int i = 2 % 2;
        int i2 = f1235a;
        int i3 = i2 + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = listBuilder.length;
        int i6 = i2 + 57;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return i5;
    }

    /* JADX INFO: renamed from: access$getModCount$p$s-2084097795, reason: not valid java name */
    public static final /* synthetic */ int m8500access$getModCount$p$s2084097795(ListBuilder listBuilder) {
        int i = 2 % 2;
        int i2 = f1235a + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((AbstractList) listBuilder).modCount;
        int i5 = f1235a + 23;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static final /* synthetic */ boolean access$isReadOnly$p(ListBuilder listBuilder) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        f1235a = i3;
        int i4 = i2 % 2;
        boolean z = listBuilder.isReadOnly;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return z;
    }

    public static final /* synthetic */ Object access$removeAtInternal(ListBuilder listBuilder, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 121;
        f1235a = i3 % 128;
        int i4 = i3 % 2;
        Object objRemoveAtInternal = listBuilder.removeAtInternal(i);
        if (i4 == 0) {
            int i5 = 23 / 0;
        }
        int i6 = asBinder + 43;
        f1235a = i6 % 128;
        int i7 = i6 % 2;
        return objRemoveAtInternal;
    }

    public static final /* synthetic */ void access$removeRangeInternal(ListBuilder listBuilder, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = f1235a + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        listBuilder.removeRangeInternal(i, i2);
        int i6 = asBinder + 21;
        f1235a = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ int access$retainOrRemoveAllInternal(ListBuilder listBuilder, int i, int i2, Collection collection, boolean z) {
        int i3 = 2 % 2;
        int i4 = f1235a + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        int iRetainOrRemoveAllInternal = listBuilder.retainOrRemoveAllInternal(i, i2, collection, z);
        int i6 = f1235a + 85;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return iRetainOrRemoveAllInternal;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "<init>", "()V", "Lkotlin/collections/builders/ListBuilder;", "", "Empty", "Lkotlin/collections/builders/ListBuilder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Companion = new Companion(null);
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return kotlin.collections.builders.ListBuilder.Empty;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.length > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.length > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = r4;
        r2 = kotlin.collections.builders.ListBuilder.f1235a + 95;
        kotlin.collections.builders.ListBuilder.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<E> build() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.collections.builders.ListBuilder.asBinder
            int r1 = r1 + 17
            int r2 = r1 % 128
            kotlin.collections.builders.ListBuilder.f1235a = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            r4.checkIsMutable()
            r1 = 0
            r4.isReadOnly = r1
            int r1 = r4.length
            if (r1 <= 0) goto L30
            goto L23
        L19:
            r4.checkIsMutable()
            r1 = 1
            r4.isReadOnly = r1
            int r1 = r4.length
            if (r1 <= 0) goto L30
        L23:
            r1 = r4
            java.util.List r1 = (java.util.List) r1
            int r2 = kotlin.collections.builders.ListBuilder.f1235a
            int r2 = r2 + 95
            int r3 = r2 % 128
            kotlin.collections.builders.ListBuilder.asBinder = r3
            int r2 = r2 % r0
            return r1
        L30:
            kotlin.collections.builders.ListBuilder r0 = kotlin.collections.builders.ListBuilder.Empty
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.build():java.util.List");
    }

    private final Object writeReplace() throws NotSerializableException {
        int i = 2 % 2;
        int i2 = f1235a + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!this.isReadOnly) {
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }
        SerializedCollection serializedCollection = new SerializedCollection(this, 0);
        int i4 = f1235a + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return serializedCollection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        int i3 = i2 % 128;
        f1235a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.length;
        int i5 = i3 + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = f1235a;
        int i3 = i2 + 41;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.length != 0) {
            return false;
        }
        int i4 = i2 + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int p0) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        f1235a = i2 % 128;
        if (i2 % 2 != 0) {
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
            return this.backing[p0];
        }
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
        int i3 = 57 / 0;
        return this.backing[p0];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final E set(int p0, E p1) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        f1235a = i2 % 128;
        if (i2 % 2 == 0) {
            checkIsMutable();
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
            E[] eArr = this.backing;
            E e2 = eArr[p0];
            eArr[p0] = p1;
            throw null;
        }
        checkIsMutable();
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
        E[] eArr2 = this.backing;
        E e3 = eArr2[p0];
        eArr2[p0] = p1;
        int i3 = asBinder + 39;
        f1235a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object p0) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        f1235a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < this.length) {
            if (Intrinsics.areEqual(this.backing[i4], p0)) {
                int i5 = f1235a + 23;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }
            i4++;
            int i7 = asBinder + 101;
            f1235a = i7 % 128;
            int i8 = i7 % 2;
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object p0) {
        int i = 2 % 2;
        for (int i2 = this.length - 1; i2 >= 0; i2--) {
            int i3 = f1235a + 65;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            if (Intrinsics.areEqual(this.backing[i2], p0)) {
                int i5 = f1235a + 41;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    return i2;
                }
                throw null;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        f1235a = i2 % 128;
        ListIterator<E> listIterator = listIterator(i2 % 2 == 0 ? 1 : 0);
        int i3 = f1235a + 39;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return listIterator;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        f1235a = i2 % 128;
        return listIterator(i2 % 2 == 0 ? 1 : 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        int i = 2 % 2;
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
        Itr itr = new Itr(this, p0);
        int i2 = asBinder + 1;
        f1235a = i2 % 128;
        if (i2 % 2 != 0) {
            return itr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E p0) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        f1235a = i2 % 128;
        if (i2 % 2 == 0) {
            checkIsMutable();
        } else {
            checkIsMutable();
        }
        addAtInternal(this.length, p0);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int p0, E p1) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        f1235a = i2 % 128;
        if (i2 % 2 != 0) {
            checkIsMutable();
            kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
            addAtInternal(p0, p1);
        } else {
            checkIsMutable();
            kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
            addAtInternal(p0, p1);
            throw null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> p0) {
        int i = 2 % 2;
        int i2 = f1235a + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        checkIsMutable();
        int size = p0.size();
        addAllInternal(this.length, p0, size);
        if (size <= 0) {
            return false;
        }
        int i4 = asBinder + 49;
        f1235a = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int p0, Collection<? extends E> p1) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        f1235a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        checkIsMutable();
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
        int size = p1.size();
        addAllInternal(p0, p1, size);
        if (size <= 0) {
            return false;
        }
        int i4 = asBinder + 5;
        f1235a = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        f1235a = i2 % 128;
        int i3 = i2 % 2;
        checkIsMutable();
        removeRangeInternal(0, this.length);
        int i4 = f1235a + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $10 + 69;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 33;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1234 - TextUtils.lastIndexOf("", '0'), 35 - (KeyEvent.getMaxKeyCode() >> 16), -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 2764, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13, 1504416861, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - ExpandableListView.getPackedPositionChild(0L)), 252 - Process.getGidForName(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char maximumDrawingCacheSize = (char) (65200 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int mirror = AndroidCharacter.getMirror('0') + 2843;
                                int i9 = 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                String str$$e = $$e(b6, b7, (byte) (b7 - 1));
                                i2 = 2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, mirror, i9, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i3 = i2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", ExifInterface.LONGITUDE_EAST, "", "Lkotlin/collections/builders/ListBuilder;", "p0", "", "p1", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "", "set", "(Ljava/lang/Object;)V", "add", "remove", "()V", "checkForComodification", "list", "Lkotlin/collections/builders/ListBuilder;", FirebaseAnalytics.Param.INDEX, "I", "lastIndex", "expectedModCount"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final ListBuilder<E> list;

        public Itr(ListBuilder<E> listBuilder, int i) {
            Intrinsics.checkNotNullParameter(listBuilder, "");
            this.list = listBuilder;
            this.index = i;
            this.lastIndex = -1;
            this.expectedModCount = ListBuilder.m8500access$getModCount$p$s2084097795(listBuilder);
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.index < ListBuilder.access$getLength$p(this.list);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            checkForComodification();
            int i = this.index;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.index = i2;
            this.lastIndex = i2;
            return (E) ListBuilder.access$getBacking$p(this.list)[this.lastIndex];
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            checkForComodification();
            if (this.index >= ListBuilder.access$getLength$p(this.list)) {
                throw new NoSuchElementException();
            }
            int i = this.index;
            this.index = i + 1;
            this.lastIndex = i;
            return (E) ListBuilder.access$getBacking$p(this.list)[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public final void set(E p0) {
            checkForComodification();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.list.set(i, p0);
        }

        @Override // java.util.ListIterator
        public final void add(E p0) {
            checkForComodification();
            ListBuilder<E> listBuilder = this.list;
            int i = this.index;
            this.index = i + 1;
            listBuilder.add(i, p0);
            this.lastIndex = -1;
            this.expectedModCount = ListBuilder.m8500access$getModCount$p$s2084097795(this.list);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            checkForComodification();
            int i = this.lastIndex;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.list.remove(i);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ListBuilder.m8500access$getModCount$p$s2084097795(this.list);
        }

        private final void checkForComodification() {
            if (ListBuilder.m8500access$getModCount$p$s2084097795(this.list) != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // kotlin.collections.AbstractMutableList
    public final E removeAt(int p0) throws Throwable {
        int i = 2 % 2;
        checkIsMutable();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 46400), 39 - Process.getGidForName(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{2611, 13582, 11744, 53688}, new char[]{60471, 33828, 32697, 22444}, (char) KeyEvent.keyCodeFromString(""), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{2882, 38120, 18904, 1825, 1530, 31246, 45951, 4355, 17413, 12336, 62428, 48203, 51868, 22107, 27135, 14716, 502, 4719, 17164, 64149, 58839, 21102}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{2611, 13582, 11744, 53688}, new char[]{6537, 19248, 9170, 52731}, (char) (64291 - KeyEvent.normalizeMetaState(0)), (-766824423) - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{33720, 54944, 36437, 29610, 56360, 14142, 20967, 50885, 22371, 47650, 34453, 44467, 16954, 65283, 54289}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -1;
        long j2 = j ^ 743381488670822179L;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j3 = (((long) 303) * 743381488670822179L) + (((long) (-301)) * 1353875686071136808L) + (((long) (-302)) * ((((j2 | (jElapsedRealtime ^ j)) | 1353875686071136808L) ^ j) | ((1934841155038478123L | jElapsedRealtime) ^ j))) + (((long) (-604)) * (((j2 | 1353875686071136808L) | jElapsedRealtime) ^ j)) + (((long) 302) * ((j ^ (jElapsedRealtime | 1353875686071136808L)) | (((j ^ 1353875686071136808L) | 743381488670822179L) ^ j)));
        int i3 = f1235a + 55;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j4 = jLongValue;
        int i5 = 0;
        try {
            while (i5 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37836), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j5 = j4;
                int i7 = 0;
                while (true) {
                    for (int i8 = 0; i8 != 8; i8++) {
                        int i9 = asBinder + 95;
                        f1235a = i9 % 128;
                        int i10 = i9 % 2;
                        i6 = (((((int) (j5 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i11 = f1235a + 113;
                    asBinder = i11 % 128;
                    i7 = i11 % 2 != 0 ? i7 + 96 : i7 + 1;
                    j5 = j3;
                }
                if (i6 == i2) {
                    kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
                    return removeAtInternal(p0);
                }
                int i12 = f1235a + 89;
                asBinder = i12 % 128;
                if (i12 % 2 != 0) {
                    j4 *= 1024;
                    i5 += 31;
                } else {
                    j4 -= 1024;
                    i5++;
                }
            }
            Object[] objArr3 = {-1211342168};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1133, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr4 = {Integer.valueOf(p0), 0, 833711422, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                int size = View.MeasureSpec.getSize(0) + 15;
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr5 = new Object[1];
                d(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iRgb, size, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45992), 1117 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17 - (KeyEvent.getMaxKeyCode() >> 16)), Boolean.TYPE});
            }
            Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
            int i13 = ((int[]) objArr6[1])[0];
            int i14 = ((int[]) objArr6[3])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr6[0];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            }
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
            return removeAtInternal(p0);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r5
  0x0024: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object p0) {
        int iIndexOf;
        int i;
        int i2 = 2 % 2;
        int i3 = f1235a + 3;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            checkIsMutable();
            iIndexOf = indexOf(p0);
            int i4 = 3 / 0;
            if (iIndexOf >= 0) {
                int i5 = asBinder + 115;
                f1235a = i5 % 128;
                i = i5 % 2;
                remove(iIndexOf);
                if (i == 0) {
                    int i6 = 71 / 0;
                }
            }
        } else {
            checkIsMutable();
            iIndexOf = indexOf(p0);
            if (iIndexOf >= 0) {
                int i7 = asBinder + 115;
                f1235a = i7 % 128;
                i = i7 % 2;
                remove(iIndexOf);
                if (i == 0) {
                    int i8 = 71 / 0;
                }
            }
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = kotlin.collections.builders.ListBuilder.f1235a + 45;
        kotlin.collections.builders.ListBuilder.asBinder = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if ((r6 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (retainOrRemoveAllInternal(1, r5.length, r6, true) > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (retainOrRemoveAllInternal(0, r5.length, r6, false) > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection<?> r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.collections.builders.ListBuilder.asBinder
            int r1 = r1 + 65
            int r2 = r1 % 128
            kotlin.collections.builders.ListBuilder.f1235a = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            r5.checkIsMutable()
            int r1 = r5.length
            int r6 = r5.retainOrRemoveAllInternal(r4, r1, r6, r4)
            if (r6 <= 0) goto L30
            goto L2f
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            r5.checkIsMutable()
            int r1 = r5.length
            int r6 = r5.retainOrRemoveAllInternal(r3, r1, r6, r3)
            if (r6 <= 0) goto L30
        L2f:
            return r4
        L30:
            int r6 = kotlin.collections.builders.ListBuilder.f1235a
            int r6 = r6 + 45
            int r1 = r6 % 128
            kotlin.collections.builders.ListBuilder.asBinder = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L3c
            return r3
        L3c:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.removeAll(java.util.Collection):boolean");
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0017\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001ZBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH\u0097\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0017¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u00020(2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010)J\u001d\u0010+\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0019J\u0017\u00101\u001a\u00020\u00152\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010'J\u001d\u00102\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016¢\u0006\u0004\b3\u0010,J%\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b4\u00105J)\u00107\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0017¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0017¢\u0006\u0004\b7\u00109J\u001a\u0010:\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b:\u0010'J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\b@\u0010/J\u000f\u0010A\u001a\u00020(H\u0002¢\u0006\u0004\bA\u0010/J\u000f\u0010B\u001a\u00020(H\u0002¢\u0006\u0004\bB\u0010/J\u001b\u0010D\u001a\u00020\u00152\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030CH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020(2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bF\u0010)J-\u0010G\u001a\u00020(2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\bI\u0010\u0019J\u001f\u0010J\u001a\u00020(2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bJ\u0010KJ5\u0010L\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\r\u001a\u00020\u0015H\u0002¢\u0006\u0004\bL\u0010MR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u001c\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010Y\u001a\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0017"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "", "p1", "p2", "p3", "Lkotlin/collections/builders/ListBuilder;", "p4", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "isEmpty", "()Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "subList", "(II)Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "registerModification", "checkForComodification", "checkIsMutable", "", "contentEquals", "(Ljava/util/List;)Z", "addAtInternal", "addAllInternal", "(ILjava/util/Collection;I)V", "removeAtInternal", "removeRangeInternal", "(II)V", "retainOrRemoveAllInternal", "(IILjava/util/Collection;Z)I", "backing", "[Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "I", "length", "parent", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "root", "Lkotlin/collections/builders/ListBuilder;", "getSize", "size", "isReadOnly", "Itr"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        public BuilderSubList(E[] eArr, int i, int i2, BuilderSubList<E> builderSubList, ListBuilder<E> listBuilder) {
            Intrinsics.checkNotNullParameter(eArr, "");
            Intrinsics.checkNotNullParameter(listBuilder, "");
            this.backing = eArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ListBuilder.m8500access$getModCount$p$s2084097795(listBuilder);
        }

        private final Object writeReplace() throws NotSerializableException {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // kotlin.collections.AbstractMutableList
        public final int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            checkForComodification();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int p0) {
            checkForComodification();
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
            return this.backing[this.offset + p0];
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public final E set(int p0, E p1) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
            E[] eArr = this.backing;
            int i = this.offset + p0;
            E e2 = eArr[i];
            eArr[i] = p1;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object p0) {
            checkForComodification();
            for (int i = 0; i < this.length; i++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], p0)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object p0) {
            checkForComodification();
            for (int i = this.length - 1; i >= 0; i--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], p0)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int p0) {
            checkForComodification();
            kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
            return new Itr(this, p0);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E p0) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, p0);
            return true;
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public final void add(int p0, E p1) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
            addAtInternal(this.offset + p0, p1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            checkIsMutable();
            checkForComodification();
            int size = p0.size();
            addAllInternal(this.offset + this.length, p0, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int p0, Collection<? extends E> p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(p0, this.length);
            int size = p1.size();
            addAllInternal(this.offset + p0, p1, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // kotlin.collections.AbstractMutableList
        public final E removeAt(int p0) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.length);
            return removeAtInternal(this.offset + p0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object p0) {
            checkIsMutable();
            checkForComodification();
            int iIndexOf = indexOf(p0);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, p0, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, p0, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int p0, int p1) {
            kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(p0, p1, this.length);
            return new BuilderSubList(this.backing, this.offset + p0, p1 - p0, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            checkForComodification();
            int length = p0.length;
            int i = this.length;
            if (length < i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, p0.getClass());
                Intrinsics.checkNotNullExpressionValue(tArr, "");
                return tArr;
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            ArraysKt.copyInto(eArr2, p0, 0, i3, i + i3);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, p0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i = this.offset;
            return ArraysKt.copyOfRange(eArr, i, this.length + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object p0) {
            checkForComodification();
            if (p0 != this) {
                return (p0 instanceof List) && contentEquals((List) p0);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            checkForComodification();
            return ListBuilderKt.subarrayContentHashCode(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            checkForComodification();
            return ListBuilderKt.subarrayContentToString(this.backing, this.offset, this.length, this);
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final void checkForComodification() {
            if (ListBuilder.m8500access$getModCount$p$s2084097795(this.root) != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean isReadOnly() {
            return ListBuilder.access$isReadOnly$p(this.root);
        }

        private final boolean contentEquals(List<?> p0) {
            return ListBuilderKt.subarrayContentEquals(this.backing, this.offset, this.length, p0);
        }

        private final void addAtInternal(int p0, E p1) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(p0, p1);
            } else {
                ListBuilder.access$addAtInternal(this.root, p0, p1);
            }
            this.backing = (E[]) ListBuilder.access$getBacking$p(this.root);
            this.length++;
        }

        private final void addAllInternal(int p0, Collection<? extends E> p1, int p2) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(p0, p1, p2);
            } else {
                ListBuilder.access$addAllInternal(this.root, p0, p1, p2);
            }
            this.backing = (E[]) ListBuilder.access$getBacking$p(this.root);
            this.length += p2;
        }

        private final E removeAtInternal(int p0) {
            E eRemoveAtInternal;
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                eRemoveAtInternal = builderSubList.removeAtInternal(p0);
            } else {
                eRemoveAtInternal = (E) ListBuilder.access$removeAtInternal(this.root, p0);
            }
            this.length--;
            return eRemoveAtInternal;
        }

        private final void removeRangeInternal(int p0, int p1) {
            if (p1 > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(p0, p1);
            } else {
                ListBuilder.access$removeRangeInternal(this.root, p0, p1);
            }
            this.length -= p1;
        }

        private final int retainOrRemoveAllInternal(int p0, int p1, Collection<? extends E> p2, boolean p3) {
            int iAccess$retainOrRemoveAllInternal;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                iAccess$retainOrRemoveAllInternal = builderSubList.retainOrRemoveAllInternal(p0, p1, p2, p3);
            } else {
                iAccess$retainOrRemoveAllInternal = ListBuilder.access$retainOrRemoveAllInternal(this.root, p0, p1, p2, p3);
            }
            if (iAccess$retainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= iAccess$retainOrRemoveAllInternal;
            return iAccess$retainOrRemoveAllInternal;
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\b\u0003\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", ExifInterface.LONGITUDE_EAST, "", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "p0", "", "p1", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "", "set", "(Ljava/lang/Object;)V", "add", "remove", "()V", "checkForComodification", "list", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", FirebaseAnalytics.Param.INDEX, "I", "lastIndex", "expectedModCount"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
            private int expectedModCount;
            private int index;
            private int lastIndex;
            private final BuilderSubList<E> list;

            public Itr(BuilderSubList<E> builderSubList, int i) {
                Intrinsics.checkNotNullParameter(builderSubList, "");
                this.list = builderSubList;
                this.index = i;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.index < ((BuilderSubList) this.list).length;
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                checkForComodification();
                int i = this.index;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.index = i2;
                this.lastIndex = i2;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                checkForComodification();
                if (this.index >= ((BuilderSubList) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i = this.index;
                this.index = i + 1;
                this.lastIndex = i;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public final void set(E p0) {
                checkForComodification();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.list.set(i, p0);
            }

            @Override // java.util.ListIterator
            public final void add(E p0) {
                checkForComodification();
                BuilderSubList<E> builderSubList = this.list;
                int i = this.index;
                this.index = i + 1;
                builderSubList.add(i, p0);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                checkForComodification();
                int i = this.lastIndex;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.list.remove(i);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            private final void checkForComodification() {
                if (ListBuilder.m8500access$getModCount$p$s2084097795(((BuilderSubList) this.list).root) != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> p0) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        f1235a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        checkIsMutable();
        if (retainOrRemoveAllInternal(0, this.length, p0, true) <= 0) {
            return false;
        }
        int i4 = asBinder + 13;
        f1235a = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int p0, int p1) {
        int i = 2 % 2;
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(p0, p1, this.length);
        BuilderSubList builderSubList = new BuilderSubList(this.backing, p0, p1 - p0, null, this);
        int i2 = asBinder + 81;
        f1235a = i2 % 128;
        int i3 = i2 % 2;
        return builderSubList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] p0) {
        int i = 2 % 2;
        int i2 = f1235a + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int length = p0.length;
        int i4 = this.length;
        if (length < i4) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i4, p0.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "");
            return tArr;
        }
        ArraysKt.copyInto(this.backing, p0, 0, 0, i4);
        T[] tArr2 = (T[]) CollectionsKt.terminateCollectionToArray(this.length, p0);
        int i5 = f1235a + 113;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return tArr2;
        }
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = 2 % 2;
        int i2 = f1235a + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArrCopyOfRange = ArraysKt.copyOfRange(this.backing, 0, this.length);
        int i4 = f1235a + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return objArrCopyOfRange;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r6 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((!r6) != false) goto L12;
     */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r6 == r5) goto L2f
            boolean r2 = r6 instanceof java.util.List
            r3 = 0
            if (r2 == 0) goto L25
            int r2 = kotlin.collections.builders.ListBuilder.f1235a
            int r2 = r2 + 45
            int r4 = r2 % 128
            kotlin.collections.builders.ListBuilder.asBinder = r4
            int r2 = r2 % r0
            java.util.List r6 = (java.util.List) r6
            boolean r6 = r5.contentEquals(r6)
            if (r2 == 0) goto L23
            r2 = 25
            int r2 = r2 / r3
            r6 = r6 ^ r1
            if (r6 == 0) goto L2f
            goto L25
        L23:
            if (r6 != 0) goto L2f
        L25:
            int r6 = kotlin.collections.builders.ListBuilder.f1235a
            int r6 = r6 + 27
            int r1 = r6 % 128
            kotlin.collections.builders.ListBuilder.asBinder = r1
            int r6 = r6 % r0
            return r3
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        f1235a = i2 % 128;
        int i3 = i2 % 2;
        int iSubarrayContentHashCode = ListBuilderKt.subarrayContentHashCode(this.backing, 0, this.length);
        int i4 = f1235a + 123;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return iSubarrayContentHashCode;
        }
        throw null;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = 2 % 2;
        int i2 = f1235a + 109;
        asBinder = i2 % 128;
        String strSubarrayContentToString = i2 % 2 != 0 ? ListBuilderKt.subarrayContentToString(this.backing, 0, this.length, this) : ListBuilderKt.subarrayContentToString(this.backing, 0, this.length, this);
        int i3 = asBinder + 103;
        f1235a = i3 % 128;
        if (i3 % 2 != 0) {
            return strSubarrayContentToString;
        }
        throw null;
    }

    private final void registerModification() {
        int i = 2 % 2;
        int i2 = f1235a + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((AbstractList) this).modCount;
        ((AbstractList) this).modCount = i3 != 0 ? i4 - 1 : i4 + 1;
    }

    private final void checkIsMutable() {
        int i = 2 % 2;
        int i2 = f1235a;
        int i3 = i2 + 37;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
        int i5 = i2 + 111;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void ensureExtraCapacity(int p0) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        f1235a = i2 % 128;
        ensureCapacityInternal(i2 % 2 == 0 ? this.length / p0 : this.length + p0);
        int i3 = f1235a + 23;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void ensureCapacityInternal(int p0) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        int i3 = i2 % 128;
        f1235a = i3;
        int i4 = i2 % 2;
        if (p0 < 0) {
            throw new OutOfMemoryError();
        }
        int i5 = i3 + 31;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int length = this.backing.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (p0 > this.backing.length) {
            this.backing = (E[]) ListBuilderKt.copyOfUninitializedElements(this.backing, kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(this.backing.length, p0));
        }
    }

    private final boolean contentEquals(List<?> p0) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        f1235a = i2 % 128;
        boolean zSubarrayContentEquals = i2 % 2 == 0 ? ListBuilderKt.subarrayContentEquals(this.backing, 0, this.length, p0) : ListBuilderKt.subarrayContentEquals(this.backing, 0, this.length, p0);
        int i3 = asBinder + 91;
        f1235a = i3 % 128;
        int i4 = i3 % 2;
        return zSubarrayContentEquals;
    }

    private final void insertAtInternal(int p0, int p1) {
        int i = 2 % 2;
        int i2 = f1235a + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ensureExtraCapacity(p1);
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, p0 + p1, p0, this.length);
        this.length += p1;
        int i4 = asBinder + 53;
        f1235a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    private final void addAtInternal(int p0, E p1) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        f1235a = i2 % 128;
        if (i2 % 2 == 0) {
            registerModification();
            insertAtInternal(p0, 0);
            this.backing[p0] = p1;
        } else {
            registerModification();
            insertAtInternal(p0, 1);
            this.backing[p0] = p1;
        }
    }

    private final void addAllInternal(int p0, Collection<? extends E> p1, int p2) {
        Iterator<? extends E> it;
        int i;
        int i2 = 2 % 2;
        int i3 = f1235a + 99;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            registerModification();
            insertAtInternal(p0, p2);
            it = p1.iterator();
            i = 1;
        } else {
            registerModification();
            insertAtInternal(p0, p2);
            it = p1.iterator();
            i = 0;
        }
        while (i < p2) {
            int i4 = asBinder + 125;
            f1235a = i4 % 128;
            if (i4 % 2 == 0) {
                this.backing[p0 << i] = it.next();
                i += 106;
            } else {
                this.backing[p0 + i] = it.next();
                i++;
            }
        }
    }

    private final E removeAtInternal(int p0) {
        int i = 2 % 2;
        int i2 = f1235a + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        registerModification();
        E[] eArr = this.backing;
        E e2 = eArr[p0];
        ArraysKt.copyInto(eArr, eArr, p0, p0 + 1, this.length);
        ListBuilderKt.resetAt(this.backing, this.length - 1);
        this.length--;
        int i4 = f1235a + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return e2;
    }

    private final void removeRangeInternal(int p0, int p1) {
        int i = 2 % 2;
        int i2 = f1235a + 47;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (p1 > 0) {
            int i4 = i3 + 103;
            f1235a = i4 % 128;
            if (i4 % 2 != 0) {
                registerModification();
            } else {
                registerModification();
                obj.hashCode();
                throw null;
            }
        }
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, p0, p0 + p1, this.length);
        E[] eArr2 = this.backing;
        int i5 = this.length;
        ListBuilderKt.resetRange(eArr2, i5 - p1, i5);
        this.length -= p1;
    }

    private final int retainOrRemoveAllInternal(int p0, int p1, Collection<? extends E> p2, boolean p3) {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 49;
        f1235a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < p1) {
            int i7 = f1235a + 121;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                i = p0 * i5;
                if (p2.contains(this.backing[i]) == p3) {
                    E[] eArr = this.backing;
                    i5++;
                    eArr[i6 + p0] = eArr[i];
                    i6++;
                } else {
                    i5++;
                }
            } else {
                i = p0 + i5;
                if (p2.contains(this.backing[i]) == p3) {
                    E[] eArr2 = this.backing;
                    i5++;
                    eArr2[i6 + p0] = eArr2[i];
                    i6++;
                } else {
                    i5++;
                }
            }
        }
        int i8 = p1 - i6;
        E[] eArr3 = this.backing;
        ArraysKt.copyInto(eArr3, eArr3, i6 + p0, p1 + p0, this.length);
        E[] eArr4 = this.backing;
        int i9 = this.length;
        ListBuilderKt.resetRange(eArr4, i9 - i8, i9);
        if (i8 > 0) {
            int i10 = f1235a + 125;
            asBinder = i10 % 128;
            if (i10 % 2 == 0) {
                registerModification();
            } else {
                registerModification();
                throw null;
            }
        }
        this.length -= i8;
        return i8;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8558739883492609794L;
        TuitionPaymentFragmentbindingInflater1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    private static String $$e(byte b2, short s, int i) {
        int i2 = 4 - (b2 * 2);
        int i3 = i * 4;
        byte[] bArr = $$c;
        int i4 = s + 102;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + (-i4);
        }
        while (true) {
            int i7 = i4;
            int i8 = i2;
            i6++;
            bArr2[i6] = (byte) i7;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = i8 + 1;
            i4 = i7 + (-bArr[i8]);
        }
    }
}
