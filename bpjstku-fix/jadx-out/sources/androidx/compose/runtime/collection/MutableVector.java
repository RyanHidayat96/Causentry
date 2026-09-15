package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003yz{B!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u0010J#\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0012\u0010\u0014J\u001e\u0010\u0012\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0015J\u001e\u0010\u0012\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0016J\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0012\u0010\u0019J\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0012\u0010\u001aJ/\u0010\u001c\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\u000eJ\u001b\u0010%\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b%\u0010\u0015J\u001b\u0010%\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b%\u0010\u001aJ\u001b\u0010%\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b%\u0010\u0016J\u001b\u0010&\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b&\u0010\u0016J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J/\u0010*\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010,J\u0010\u0010.\u001a\u00020-H\u0081\b¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u000200H\u0001¢\u0006\u0004\b.\u00101J\u0012\u00102\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b2\u0010+J1\u00102\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b2\u0010,JH\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u0010\u0005\u001a\u00028\u00012\u001d\u0010\u0007\u001a\u0019\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b6\u00107JS\u00109\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u0010\u0005\u001a\u00028\u00012(\u0010\u0007\u001a$\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b5\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b9\u0010:JH\u0010;\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u0010\u0005\u001a\u00028\u00012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u000104H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b;\u00107JS\u0010<\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u0010\u0005\u001a\u00028\u00012(\u0010\u0007\u001a$\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u0000\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u000108H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b<\u0010:J/\u0010=\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b=\u0010>J5\u0010?\u001a\u00020\u000f2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f04H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b?\u0010@J/\u0010A\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bA\u0010>J5\u0010B\u001a\u00020\u000f2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f04H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010@J\u0018\u0010C\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\bE\u0010FJ/\u0010G\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bG\u0010HJ/\u0010I\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bI\u0010HJ\u0010\u0010J\u001a\u00020\fH\u0086\b¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\fH\u0086\b¢\u0006\u0004\bL\u0010KJ\r\u0010M\u001a\u00028\u0000¢\u0006\u0004\bM\u0010+J/\u0010M\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bM\u0010,J\u0015\u0010N\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\bN\u0010FJ\u0012\u0010O\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bO\u0010+J1\u0010O\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bO\u0010,J=\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u00103\u0018\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bP\u0010QJH\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u00103\u0018\u00012\u001d\u0010\u0005\u001a\u0019\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bR\u0010SJJ\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u00103\u0018\u00012\u001f\u0010\u0005\u001a\u001b\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b5\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u000104H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bT\u0010UJ?\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u00103\u0018\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bV\u0010WJ\u0018\u0010X\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bX\u0010YJ\u0018\u0010Z\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bZ\u0010YJ\u0015\u0010[\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b[\u0010\u000eJ\u001b\u0010\\\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\\\u0010\u0015J\u001b\u0010\\\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\\\u0010\u0016J\u001b\u0010\\\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\\\u0010\u001aJ\u0015\u0010]\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b]\u0010DJ\u001d\u0010^\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0004\b`\u0010(J$\u0010a\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0086\b¢\u0006\u0004\ba\u0010>J\u001b\u0010b\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\bb\u0010\u001aJ \u0010c\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bc\u0010dJ%\u0010g\u001a\u00020\u000f2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000ej\b\u0012\u0004\u0012\u00028\u0000`f¢\u0006\u0004\bg\u0010hJ/\u0010i\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bi\u0010HR$\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bj\u0010k\u0012\u0004\bl\u0010#R\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010nR$\u0010o\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0012\u0010t\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\bs\u0010rR\u0012\u0010x\u001a\u00020u8Ç\u0002¢\u0006\u0006\u001a\u0004\bv\u0010w"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/RandomAccess;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "p0", "", "p1", "<init>", "([Ljava/lang/Object;I)V", "getContent", "()[Ljava/lang/Object;", "", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "addAll", "(ILjava/util/List;)Z", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "(Ljava/util/List;)Z", "(Landroidx/compose/runtime/collection/MutableVector;)Z", "([Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "Lkotlin/Function1;", "any", "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "", "asMutableList", "()Ljava/util/List;", "clear", "()V", "contains", "containsAll", "contentEquals", "ensureCapacity", "(I)V", "resizeStorage", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "throwNoSuchElementException", "()Ljava/lang/Void;", "", "(Ljava/lang/String;)Ljava/lang/Void;", "firstOrNull", "R", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "(Lkotlin/jvm/functions/Function1;)I", "indexOfLast", "isEmpty", "()Z", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/collection/MutableVector;", "mapNotNull", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", "removeRange", "(II)V", "setSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "sortWith", "(Ljava/util/Comparator;)V", "sumBy", FirebaseAnalytics.Param.CONTENT, "[Ljava/lang/Object;", "getContent$annotations", "list", "Ljava/util/List;", "size", "I", "getSize", "()I", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "VectorListIterator", "MutableVectorList", "SubList"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    public T[] content;
    private List<T> list;
    private int size;

    public static /* synthetic */ void getContent$annotations() {
    }

    public MutableVector(T[] tArr, int i) {
        this.content = tArr;
        this.size = i;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, getSize());
    }

    public final T[] getContent() {
        return this.content;
    }

    public final boolean add(T p0) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        tArr[i2] = p0;
        this.size = i2 + 1;
        return true;
    }

    public final void add(int p0, T p1) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (p0 != i2) {
            System.arraycopy(tArr, p0, tArr, p0 + 1, i2 - p0);
        }
        tArr[p0] = p1;
        this.size++;
    }

    public final boolean addAll(int p0, List<? extends T> p1) {
        if (p1.isEmpty()) {
            return false;
        }
        int size = p1.size();
        int i = this.size + size;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        T[] tArr = this.content;
        int i2 = this.size;
        if (p0 != i2) {
            System.arraycopy(tArr, p0, tArr, p0 + size, i2 - p0);
        }
        int size2 = p1.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tArr[p0 + i3] = p1.get(i3);
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(int p0, MutableVector<T> p1) {
        int i = p1.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size + i;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (p0 != i3) {
            System.arraycopy(tArr, p0, tArr, p0 + i, i3 - p0);
        }
        System.arraycopy(p1.content, 0, tArr, p0, i);
        this.size += i;
        return true;
    }

    public final boolean addAll(List<? extends T> p0) {
        return addAll(getSize(), (List) p0);
    }

    public final boolean addAll(MutableVector<T> p0) {
        return addAll(getSize(), p0);
    }

    public final boolean addAll(T[] p0) {
        int length = p0.length;
        if (length == 0) {
            return false;
        }
        int i = this.size + length;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        System.arraycopy(p0, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int p0, Collection<? extends T> p1) {
        int i = 0;
        if (p1.isEmpty()) {
            return false;
        }
        int size = p1.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        T[] tArr = this.content;
        int i3 = this.size;
        if (p0 != i3) {
            System.arraycopy(tArr, p0, tArr, p0 + size, i3 - p0);
        }
        for (T t : p1) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i + p0] = t;
            i++;
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(Collection<? extends T> p0) {
        return addAll(this.size, p0);
    }

    public final boolean any(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (p0.invoke(tArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (p0.invoke(tArr[size]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            tArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean containsAll(List<? extends T> p0) {
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            if (!contains(p0.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection<? extends T> p0) {
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> p0) {
        if (p0.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; Intrinsics.areEqual(p0.content[i], this.content[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int p0) {
        if (this.content.length < p0) {
            resizeStorage(p0);
        }
    }

    public final void resizeStorage(int p0) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(p0, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T first(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            ?? r3 = (Object) tArr[i];
            if (p0.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final Void throwNoSuchElementException(String p0) {
        throw new NoSuchElementException(p0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T firstOrNull(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            ?? r3 = (Object) tArr[i];
            if (p0.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    public final <R> R fold(R p0, Function2<? super R, ? super T, ? extends R> p1) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            p0 = p1.invoke(p0, tArr[i]);
        }
        return p0;
    }

    public final <R> R foldIndexed(R p0, Function3<? super Integer, ? super R, ? super T, ? extends R> p1) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            p0 = p1.invoke(Integer.valueOf(i), p0, tArr[i]);
        }
        return p0;
    }

    public final <R> R foldRight(R p0, Function2<? super T, ? super R, ? extends R> p1) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return p0;
        }
        while (size >= 0) {
            p0 = p1.invoke(tArr[size], p0);
            size--;
        }
        return p0;
    }

    public final <R> R foldRightIndexed(R p0, Function3<? super Integer, ? super T, ? super R, ? extends R> p1) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return p0;
        }
        while (size >= 0) {
            p0 = p1.invoke(Integer.valueOf(size), tArr[size], p0);
            size--;
        }
        return p0;
    }

    public final void forEach(Function1<? super T, Unit> p0) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            p0.invoke(tArr[i]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super T, Unit> p0) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            p0.invoke(Integer.valueOf(i), tArr[i]);
        }
    }

    public final void forEachReversed(Function1<? super T, Unit> p0) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                p0.invoke(tArr[size]);
                size--;
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super T, Unit> p0) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size < tArr.length) {
            while (size >= 0) {
                p0.invoke(Integer.valueOf(size), tArr[size]);
                size--;
            }
        }
    }

    public final T get(int p0) {
        return this.content[p0];
    }

    public final int indexOf(T p0) {
        T[] tArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.areEqual(p0, tArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            if (p0.invoke(tArr[i]).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super T, Boolean> p0) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (p0.invoke(tArr[size]).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T last(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r2 = (Object) tArr[size];
            if (p0.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T p0) {
        T[] tArr = this.content;
        for (int i = this.size - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(p0, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T lastOrNull(Function1<? super T, Boolean> p0) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r2 = (Object) tArr[size];
            if (p0.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> p0) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = p0.invoke(this.content[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> p0) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = p0.invoke(Integer.valueOf(i), this.content[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> p0) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = p0.invoke(Integer.valueOf(i2), tArr[i2]);
            if (rInvoke != null) {
                objArr[i] = rInvoke;
                i++;
            }
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> p0) {
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = p0.invoke(tArr[i2]);
            if (rInvoke != null) {
                objArr[i] = rInvoke;
                i++;
            }
        }
        return new MutableVector<>(objArr, i);
    }

    public final void plusAssign(T p0) {
        add(p0);
    }

    public final void minusAssign(T p0) {
        remove(p0);
    }

    public final boolean remove(T p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(List<? extends T> p0) {
        int i = this.size;
        int size = p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(p0.get(i2));
        }
        return i != this.size;
    }

    public final boolean removeAll(MutableVector<T> p0) {
        int i = this.size;
        int size = p0.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(p0.content[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.size;
    }

    public final boolean removeAll(Collection<? extends T> p0) {
        if (p0.isEmpty()) {
            return false;
        }
        int i = this.size;
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.size;
    }

    public final T removeAt(int p0) {
        T[] tArr = this.content;
        T t = tArr[p0];
        if (p0 != getSize() - 1) {
            int i = p0 + 1;
            System.arraycopy(tArr, i, tArr, p0, this.size - i);
        }
        int i2 = this.size - 1;
        this.size = i2;
        tArr[i2] = null;
        return t;
    }

    public final void removeRange(int p0, int p1) {
        if (p1 > p0) {
            int i = this.size;
            if (p1 < i) {
                T[] tArr = this.content;
                System.arraycopy(tArr, p1, tArr, p0, i - p1);
            }
            int i2 = this.size - (p1 - p0);
            int size = getSize() - 1;
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.content[i3] = null;
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.size = i2;
        }
    }

    public final void setSize(int p0) {
        this.size = p0;
    }

    public final void removeIf(Function1<? super T, Boolean> p0) {
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (p0.invoke(this.content[i2]).booleanValue()) {
                i++;
            } else if (i > 0) {
                T[] tArr = this.content;
                tArr[i2 - i] = tArr[i2];
            }
        }
        int i3 = size - i;
        ArraysKt.fill(this.content, (Object) null, i3, size);
        setSize(i3);
    }

    public final boolean retainAll(Collection<? extends T> p0) {
        int i = this.size;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (!p0.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i != this.size;
    }

    public final T set(int p0, T p1) {
        T[] tArr = this.content;
        T t = tArr[p0];
        tArr[p0] = p1;
        return t;
    }

    public final void sortWith(Comparator<T> p0) {
        ArraysKt.sortWith(this.content, p0, 0, this.size);
    }

    public final int sumBy(Function1<? super T, Integer> p0) {
        T[] tArr = this.content;
        int iIntValue = 0;
        for (int i = 0; i < getSize(); i++) {
            iIntValue += p0.invoke(tArr[i]).intValue();
        }
        return iIntValue;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "add", "(Ljava/lang/Object;)V", "set", "list", "Ljava/util/List;", FirebaseAnalytics.Param.INDEX, "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            List<T> list = this.list;
            int i = this.index;
            this.index = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator
        public final void add(T p0) {
            this.list.add(this.index, p0);
            this.index++;
        }

        @Override // java.util.ListIterator
        public final void set(T p0) {
            this.list.set(this.index, p0);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0010\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0097\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0004\u001a\u00020\rH\u0017¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\tJ\u001d\u0010%\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b%\u0010\fJ\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u001d\u0010'\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b'\u0010\fJ \u0010(\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0017¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/collection/MutableVector;", "p0", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "p1", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "getSize", "()I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class MutableVectorList<T> implements List<T>, KMutableList {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        public final int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object p0) {
            return this.vector.contains(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            return this.vector.containsAll(p0);
        }

        @Override // java.util.List
        public final T get(int p0) {
            MutableVectorKt.checkIndex(this, p0);
            return this.vector.content[p0];
        }

        @Override // java.util.List
        public final int indexOf(Object p0) {
            return this.vector.indexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object p0) {
            return this.vector.lastIndexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            return this.vector.add(p0);
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.vector.add(p0, p1);
        }

        @Override // java.util.List
        public final boolean addAll(int p0, Collection<? extends T> p1) {
            return this.vector.addAll(p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> p0) {
            return this.vector.addAll(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.vector.clear();
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int p0) {
            return new VectorListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object p0) {
            return this.vector.remove(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> p0) {
            return this.vector.removeAll(p0);
        }

        public final T removeAt(int p0) {
            MutableVectorKt.checkIndex(this, p0);
            return this.vector.removeAt(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> p0) {
            return this.vector.retainAll(p0);
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            MutableVectorKt.checkIndex(this, p0);
            return this.vector.set(p0, p1);
        }

        @Override // java.util.List
        public final List<T> subList(int p0, int p1) {
            MutableVectorList<T> mutableVectorList = this;
            MutableVectorKt.checkSubIndex(mutableVectorList, p0, p1);
            return new SubList(mutableVectorList, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0097\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ%\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010%\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0010J\u001d\u0010'\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b'\u0010\u000eJ \u0010(\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00103\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "", "contains", "(Ljava/lang/Object;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "list", "Ljava/util/List;", "start", "I", "end", "getSize", "()I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i, int i2) {
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        public final int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object p0) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), p0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<?> p0) {
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int p0) {
            MutableVectorKt.checkIndex(this, p0);
            return this.list.get(p0 + this.start);
        }

        @Override // java.util.List
        public final int indexOf(Object p0) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), p0)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object p0) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, p0);
            return true;
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.list.add(p0 + this.start, p1);
            this.end++;
        }

        @Override // java.util.List
        public final boolean addAll(int p0, Collection<? extends T> p1) {
            this.list.addAll(p0 + this.start, p1);
            int size = p1.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> p0) {
            this.list.addAll(this.end, p0);
            int size = p0.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int p0) {
            return new VectorListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object p0) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), p0)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<?> p0) {
            int i = this.end;
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public final T removeAt(int p0) {
            MutableVectorKt.checkIndex(this, p0);
            T tRemove = this.list.remove(p0 + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<?> p0) {
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!p0.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            MutableVectorKt.checkIndex(this, p0);
            return this.list.set(p0 + this.start, p1);
        }

        @Override // java.util.List
        public final List<T> subList(int p0, int p1) {
            SubList<T> subList = this;
            MutableVectorKt.checkSubIndex(subList, p0, p1);
            return new SubList(subList, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    public final boolean contains(T p0) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.areEqual(this.content[i], p0); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(MutableVector<T> p0) {
        IntRange intRangeUntil = RangesKt.until(0, p0.getSize());
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(p0.content[first])) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final T first() {
        if (getSize() == 0) {
            throwNoSuchElementException("MutableVector is empty.");
            throw new KotlinNothingValueException();
        }
        return this.content[0];
    }

    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    public final T last() {
        if (getSize() == 0) {
            throwNoSuchElementException("MutableVector is empty.");
            throw new KotlinNothingValueException();
        }
        return this.content[getSize() - 1];
    }

    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }
}
