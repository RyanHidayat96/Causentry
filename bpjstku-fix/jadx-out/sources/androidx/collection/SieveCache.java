package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u009a\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n\u0012<\b\u0002\u0010\u000f\u001a6\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\b\u0012\t\u0012\u00070\r¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\r2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u001c\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010 \u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010\u0019J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020+H\u0002¢\u0006\u0004\b)\u0010,J7\u0010-\u001a\u00020\u000e2\"\u0010\u0005\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010.J,\u0010/\u001a\u00020\u000e2\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\nH\u0081\bø\u0001\u0000¢\u0006\u0004\b/\u00100J,\u00101\u001a\u00020\u000e2\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00100J,\u00102\u001a\u00020\u000e2\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00100J\u001a\u00103\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\u001dJ\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010\u0013J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u00108J\r\u0010:\u001a\u00020\r¢\u0006\u0004\b:\u0010\u0017J\r\u0010;\u001a\u00020\r¢\u0006\u0004\b;\u0010\u0017J\u0018\u0010<\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b<\u00108J\u0018\u0010=\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b=\u0010>J\u001e\u0010=\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0086\n¢\u0006\u0004\b=\u0010@J\u001e\u0010=\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000AH\u0086\n¢\u0006\u0004\b=\u0010BJ \u0010=\u001a\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000CH\u0086\n¢\u0006\u0004\b=\u0010DJ\u001e\u0010=\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0086\n¢\u0006\u0004\b=\u0010FJ\u001e\u0010=\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0086\n¢\u0006\u0004\b=\u0010HJ\u0018\u0010I\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\bI\u00108J\r\u0010J\u001a\u00020\r¢\u0006\u0004\bJ\u0010\u0017J$\u0010L\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010KH\u0086\n¢\u0006\u0004\bL\u0010MJ$\u0010L\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\n¢\u0006\u0004\bL\u0010NJ,\u0010L\u001a\u00020\u000e2\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0CH\u0086\n¢\u0006\u0004\bL\u0010PJ$\u0010L\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010OH\u0086\n¢\u0006\u0004\bL\u0010QJ*\u0010L\u001a\u00020\u000e2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0EH\u0086\n¢\u0006\u0004\bL\u0010FJ$\u0010L\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010RH\u0086\n¢\u0006\u0004\bL\u0010SJ*\u0010L\u001a\u00020\u000e2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0GH\u0086\n¢\u0006\u0004\bL\u0010HJ\u001f\u0010T\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010K¢\u0006\u0004\bV\u0010MJ!\u0010V\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\bV\u0010NJ)\u0010V\u001a\u00020\u000e2\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0C¢\u0006\u0004\bV\u0010PJ'\u0010V\u001a\u00020\u000e2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0E¢\u0006\u0004\bV\u0010FJ!\u0010V\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010R¢\u0006\u0004\bV\u0010SJ'\u0010V\u001a\u00020\u000e2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O0G¢\u0006\u0004\bV\u0010HJ\u0017\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\bW\u00104J\u001d\u0010W\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\bW\u0010XJ'\u0010Y\u001a\u00020\u000e2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\bY\u0010.J\u0018\u0010Z\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\bZ\u00108J\u0019\u0010[\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b[\u0010\\J\u0015\u0010]\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b]\u00108J\u0017\u0010^\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b^\u00108J \u0010_\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0086\n¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0017¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bd\u00108R\u0016\u0010e\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010h\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0016\u0010i\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010fR\u0011\u0010k\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bj\u0010\u001dR\u0017\u0010\u001c\u001a\u00020\u00048G¢\u0006\f\u0012\u0004\bm\u0010\u0013\u001a\u0004\bl\u0010\u001dR'\u0010n\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010fR\u0016\u0010q\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bq\u0010fR\u0016\u0010r\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010fR$\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010C8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bs\u0010t\u0012\u0004\bu\u0010\u0013R\u0011\u0010w\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bv\u0010\u001dR\u001c\u0010x\u001a\u00020+8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bx\u0010y\u0012\u0004\bz\u0010\u0013R\u0016\u0010{\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010yRH\u0010|\u001a6\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\b\u0012\t\u0012\u00070\r¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0011\u0010\u007f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b~\u0010\u001dR3\u0010\u0080\u0001\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0082\u0001\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010fR'\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010C8\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010t\u0012\u0005\b\u0084\u0001\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/SieveCache;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "p0", "p1", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "p2", "Lkotlin/Function1;", "p3", "Lkotlin/Function4;", "", "", "p4", "<init>", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "adjustStorage$collection", "()V", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "dropDeletes$collection", "equals", "evictAll", "findEvictionCandidate", "findFirstAvailableSlot", "(I)I", "findInsertIndex", "(Ljava/lang/Object;)I", "findKeyIndex", "", "fixupNodes", "([I)V", "", "([J)V", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "initializeGrowth", "initializeMetadata", "(I)V", "initializeStorage", "isEmpty", "isNotEmpty", "markNodeVisited", "minusAssign", "(Ljava/lang/Object;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "moveNodeToHead", "none", "Landroidx/collection/ScatterMap;", "plusAssign", "(Landroidx/collection/ScatterMap;)V", "(Landroidx/collection/SieveCache;)V", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "(Lkotlin/Pair;)V", "", "(Ljava/util/Map;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeIf", "removeNode", "removeValueAt", "(I)Ljava/lang/Object;", "resize", "resizeStorage$collection", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "trimToSize", "_capacity", "I", "_count", "_maxSize", "_size", "getCapacity", "capacity", "getCount", "getCount$annotations", "createValueFromKey", "Lkotlin/jvm/functions/Function1;", "growthLimit", "hand", "head", UserMetadata.KEYDATA_FILENAME, "[Ljava/lang/Object;", "getKeys$annotations", "getMaxSize", "maxSize", "metadata", "[J", "getMetadata$annotations", "nodes", "onEntryRemoved", "Lkotlin/jvm/functions/Function4;", "getSize", "size", "sizeOf", "Lkotlin/jvm/functions/Function2;", "tail", "values", "getValues$annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SieveCache<K, V> {
    private int _capacity;
    private int _count;
    private int _maxSize;
    private int _size;
    private final Function1<K, V> createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;
    public Object[] keys;
    public long[] metadata;
    private long[] nodes;
    private final Function4<K, V, V, Boolean, Unit> onEntryRemoved;
    private final Function2<K, V, Integer> sizeOf;
    private int tail;
    public Object[] values;

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SieveCache(int i, int i2, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super K, ? super V, ? super V, ? super Boolean, Unit> function4) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function4, "");
        this.sizeOf = function2;
        this.createValueFromKey = function1;
        this.onEntryRemoved = function4;
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (i <= 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this._maxSize = i;
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
    }

    public /* synthetic */ SieveCache(int i, int i2, AnonymousClass1 anonymousClass1, AnonymousClass2 anonymousClass2, AnonymousClass3 anonymousClass3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 6 : i2, (i3 & 4) != 0 ? new Function2<K, V, Integer>() { // from class: androidx.collection.SieveCache.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(K k, V v) {
                Intrinsics.checkNotNullParameter(k, "");
                Intrinsics.checkNotNullParameter(v, "");
                return 1;
            }
        } : anonymousClass1, (i3 & 8) != 0 ? new Function1() { // from class: androidx.collection.SieveCache.2
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(K k) {
                Intrinsics.checkNotNullParameter(k, "");
                return null;
            }
        } : anonymousClass2, (i3 & 16) != 0 ? new Function4<K, V, V, Boolean, Unit>() { // from class: androidx.collection.SieveCache.3
            @Override // kotlin.jvm.functions.Function4
            public final /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Boolean bool) {
                invoke(obj, obj2, obj3, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(K k, V v, V v2, boolean z) {
                Intrinsics.checkNotNullParameter(k, "");
                Intrinsics.checkNotNullParameter(v, "");
            }
        } : anonymousClass3);
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    /* JADX INFO: renamed from: getMaxSize, reason: from getter */
    public final int get_maxSize() {
        return this._maxSize;
    }

    /* JADX INFO: renamed from: getCount, reason: from getter */
    public final int get_count() {
        return this._count;
    }

    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final boolean any() {
        return this._count != 0;
    }

    public final boolean none() {
        return this._count == 0;
    }

    public final boolean isEmpty() {
        return this._count == 0;
    }

    public final boolean isNotEmpty() {
        return this._count != 0;
    }

    private final void initializeStorage(int p0) {
        long[] emptyNodes;
        int iMax = p0 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            ArraysKt.fill$default(emptyNodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        }
        this.nodes = emptyNodes;
    }

    private final void initializeMetadata(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((p0 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i = p0 >> 3;
            long j = 255 << ((p0 & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j)) | j;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this._capacity) - get_count();
    }

    public final V get(K p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0) {
            V vInvoke = this.createValueFromKey.invoke(p0);
            if (vInvoke == null) {
                return null;
            }
            put(p0, vInvoke);
            return vInvoke;
        }
        long[] jArr = this.nodes;
        jArr[iFindKeyIndex] = (jArr[iFindKeyIndex] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
        return (V) this.values[iFindKeyIndex];
    }

    public final void set(K p0, V p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        put(p0, p1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V put(K p0, V p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int iFindInsertIndex = findInsertIndex(p0);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v = (V) objArr[iFindInsertIndex];
        objArr[iFindInsertIndex] = p1;
        this.keys[iFindInsertIndex] = p0;
        int iIntValue = this._size + this.sizeOf.invoke(p0, p1).intValue();
        this._size = iIntValue;
        if (v != null) {
            this._size = iIntValue - ((Number) this.sizeOf.invoke(p0, v)).intValue();
            this.onEntryRemoved.invoke(p0, v, p1, Boolean.FALSE);
            trimToSize(this._maxSize);
            return v;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindInsertIndex] = (((long) i) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = (jArr[i] & SieveCacheKt.NodeMetaAndNextMask) | ((SieveCacheKt.NodeLinkMask & ((long) iFindInsertIndex)) << 31);
        }
        this.head = iFindInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindInsertIndex;
        }
        return v;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (Pair<? extends K, ? extends V> pair : p0) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (Pair<? extends K, ? extends V> pair : p0) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void putAll(Sequence<? extends Pair<? extends K, ? extends V>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (Pair<? extends K, ? extends V> pair : p0) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        put(p0.getFirst(), p0.getSecond());
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        putAll(p0);
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        putAll(p0);
    }

    public final void plusAssign(Sequence<? extends Pair<? extends K, ? extends V>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        putAll(p0);
    }

    public final void plusAssign(Map<K, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        putAll(p0);
    }

    public final void plusAssign(ScatterMap<K, V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        putAll(p0);
    }

    public final void plusAssign(SieveCache<K, V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        putAll(p0);
    }

    public final V remove(K p0) {
        V vRemoveValueAt;
        Intrinsics.checkNotNullParameter(p0, "");
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0 || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return null;
        }
        this._size -= this.sizeOf.invoke(p0, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(p0, vRemoveValueAt, null, Boolean.FALSE);
        return vRemoveValueAt;
    }

    public final boolean remove(K p0, V p1) {
        V vRemoveValueAt;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int iFindKeyIndex = findKeyIndex(p0);
        if (iFindKeyIndex < 0 || !Intrinsics.areEqual(this.values[iFindKeyIndex], p1) || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return false;
        }
        this._size -= this.sizeOf.invoke(p0, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(p0, vRemoveValueAt, null, Boolean.FALSE);
        return true;
    }

    public final void minusAssign(K p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        remove(p0);
    }

    public final void minusAssign(K[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (K k : p0) {
            remove(k);
        }
    }

    public final void minusAssign(Iterable<? extends K> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends K> it = p0.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(Sequence<? extends K> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends K> it = p0.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void resize(int p0) {
        this._maxSize = p0;
        trimToSize(p0);
    }

    public final void trimToSize(int p0) {
        int iFindEvictionCandidate;
        while (this._size > p0 && get_count() != 0 && (iFindEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iFindEvictionCandidate];
            Intrinsics.checkNotNull(obj, "");
            V vRemoveValueAt = removeValueAt(iFindEvictionCandidate);
            if (vRemoveValueAt != null) {
                this._size -= this.sizeOf.invoke((K) obj, vRemoveValueAt).intValue();
                this.onEntryRemoved.invoke((K) obj, vRemoveValueAt, null, Boolean.TRUE);
            }
        }
    }

    public final void forEach(Function2<? super K, ? super V, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = objArr2[i4];
                        Intrinsics.checkNotNull(obj2, "");
                        p0.invoke(obj, obj2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(Function1<? super K, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        Intrinsics.checkNotNull(obj, "");
                        p0.invoke(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(Function1<? super V, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Object obj = objArr[(i << 3) + i3];
                        Intrinsics.checkNotNull(obj, "");
                        p0.invoke(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int count() {
        return get_size();
    }

    public final boolean contains(K p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return findKeyIndex(p0) >= 0;
    }

    public final boolean containsKey(K p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return findKeyIndex(p0) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[LOOP:0: B:5:0x0014->B:18:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[SYNTHETIC] */
    public final boolean containsValue(V p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            Intrinsics.checkNotNull(obj, "");
                            if (Intrinsics.areEqual(p0, obj)) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i = this.hand;
        if (i == Integer.MAX_VALUE) {
            i = this.tail;
        }
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i];
            if (((int) ((j >> 62) & 1)) == 0) {
                break;
            }
            int i2 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            jArr[i] = 4611686018427387903L & j;
            i = i2 != Integer.MAX_VALUE ? i2 : this.tail;
        }
        int i3 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
        this.hand = i3 != Integer.MAX_VALUE ? i3 : Integer.MAX_VALUE;
        return i;
    }

    private final void moveNodeToHead(int p0) {
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[p0] = (((long) i) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) p0) & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = p0;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = p0;
        }
    }

    private final V removeValueAt(int p0) {
        this._count--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[p0] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[p0];
        objArr[p0] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[p0];
        int i4 = (int) ((j2 >> 31) & SieveCacheKt.NodeLinkMask);
        int i5 = (int) (j2 & SieveCacheKt.NodeLinkMask);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i5) & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((((long) i4) & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i5] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i4;
        }
        if (this.hand == p0) {
            this.hand = i4;
        }
        jArr2[p0] = 4611686018427387903L;
        return v;
    }

    private final void removeNode(int p0) {
        long[] jArr = this.nodes;
        long j = jArr[p0];
        int i = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
        int i2 = (int) (j & SieveCacheKt.NodeLinkMask);
        if (i == Integer.MAX_VALUE) {
            this.head = i2;
        } else {
            jArr[i] = (jArr[i] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i2) & SieveCacheKt.NodeLinkMask);
        }
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) i) & SieveCacheKt.NodeLinkMask) << 31) | (SieveCacheKt.NodeMetaAndNextMask & jArr[i2]);
        } else {
            this.tail = i;
        }
        if (this.hand == p0) {
            this.hand = i;
        }
        jArr[p0] = 4611686018427387903L;
    }

    private final void markNodeVisited(int p0) {
        long[] jArr = this.nodes;
        jArr[p0] = (jArr[p0] & 4611686018427387903L) | SieveCacheKt.NodeVisitedBit;
    }

    private final int findFirstAvailableSlot(int p0) {
        int i = this._capacity;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8 && Long.compare(ULong.m8203constructorimpl(ULong.m8203constructorimpl(get_count()) * 32) ^ Long.MIN_VALUE, ULong.m8203constructorimpl(ULong.m8203constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        }
    }

    public final void dropDeletes$collection() {
        long[] jArr;
        long[] jArr2;
        long j;
        int i;
        long[] jArr3 = this.metadata;
        if (jArr3 == null) {
            return;
        }
        int i2 = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr4 = this.nodes;
        long[] jArr5 = new long[i2];
        long j2 = 9223372034707292159L;
        int i3 = 0;
        ArraysKt.fill(jArr5, 9223372034707292159L, 0, i2);
        for (int i4 = 0; i4 < ((i2 + 7) >> 3); i4++) {
            long j3 = jArr3[i4] & (-9187201950435737472L);
            jArr3[i4] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr3);
        int i5 = lastIndex - 1;
        jArr3[i5] = (jArr3[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr3[lastIndex] = jArr3[0];
        int i6 = 0;
        while (i6 != i2) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j4 = (jArr3[i7] >> i8) & 255;
            if (j4 != 128 && j4 == 254) {
                Object obj = objArr[i6];
                int iHashCode = (obj != null ? obj.hashCode() : i3) * ScatterMapKt.MurmurHashC1;
                int i9 = iHashCode ^ (iHashCode << 16);
                int i10 = i9 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                int i11 = i10 & i2;
                if (((iFindFirstAvailableSlot - i11) & i2) / 8 == ((i6 - i11) & i2) / 8) {
                    jArr3[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr3[i7]);
                    if (jArr5[i6] == 9223372034707292159L) {
                        long j5 = i6;
                        jArr5[i6] = j5 | (j5 << 32);
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i6++;
                    j2 = 9223372034707292159L;
                    i3 = 0;
                } else {
                    j = 9223372034707292159L;
                    int i12 = iFindFirstAvailableSlot >> 3;
                    long j6 = jArr3[i12];
                    int i13 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j6 >> i13) & 255) == 128) {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i12] = (j6 & (~(255 << i13))) | (((long) (i9 & 127)) << i13);
                        jArr3[i7] = (jArr3[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[iFindFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = null;
                        objArr2[iFindFirstAvailableSlot] = objArr2[i6];
                        objArr2[i6] = null;
                        jArr[iFindFirstAvailableSlot] = jArr[i6];
                        jArr[i6] = 4611686018427387903L;
                        int i14 = (int) ((jArr2[i6] >> 32) & 4294967295L);
                        if (i14 != Integer.MAX_VALUE) {
                            jArr2[i14] = (jArr2[i14] & (-4294967296L)) | ((long) iFindFirstAvailableSlot);
                            jArr2[i6] = (jArr2[i6] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr2[i6] = ((long) iFindFirstAvailableSlot) | 9223372032559808512L;
                        }
                        jArr2[iFindFirstAvailableSlot] = (((long) i6) << 32) | SieveCacheKt.NodeLinkMask;
                    } else {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i12] = (((long) (i9 & 127)) << i13) | (j6 & (~(255 << i13)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = obj2;
                        Object obj3 = objArr2[iFindFirstAvailableSlot];
                        objArr2[iFindFirstAvailableSlot] = objArr2[i6];
                        objArr2[i6] = obj3;
                        long j7 = jArr[iFindFirstAvailableSlot];
                        jArr[iFindFirstAvailableSlot] = jArr[i6];
                        jArr[i6] = j7;
                        int i15 = (int) ((jArr2[i6] >> 32) & 4294967295L);
                        if (i15 != Integer.MAX_VALUE) {
                            long j8 = iFindFirstAvailableSlot;
                            jArr2[i15] = (jArr2[i15] & (-4294967296L)) | j8;
                            jArr2[i6] = (jArr2[i6] & 4294967295L) | (j8 << 32);
                        } else {
                            long j9 = iFindFirstAvailableSlot;
                            jArr2[i6] = j9 | (j9 << 32);
                            i15 = i6;
                        }
                        jArr2[iFindFirstAvailableSlot] = (((long) i15) << 32) | ((long) i6);
                        i6--;
                    }
                    i = 0;
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i6++;
                    i3 = i;
                    j2 = j;
                    jArr4 = jArr;
                    jArr5 = jArr2;
                }
            } else {
                jArr = jArr4;
                jArr2 = jArr5;
                j = j2;
                i = i3;
                i6++;
                i3 = i;
                j2 = j;
                jArr4 = jArr;
                jArr5 = jArr2;
            }
        }
        initializeGrowth();
        fixupNodes(jArr5);
    }

    public final void resizeStorage$collection(int p0) {
        int[] iArr;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr2 = this.nodes;
        int i = this._capacity;
        int[] iArr2 = new int[i];
        initializeStorage(p0);
        long[] jArr3 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        long[] jArr4 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i4 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4 >>> 7);
                long j = i4 & 127;
                int i5 = iFindFirstAvailableSlot >> 3;
                int i6 = (iFindFirstAvailableSlot & 7) << 3;
                iArr = iArr2;
                long j2 = (j << i6) | (jArr3[i5] & (~(255 << i6)));
                jArr3[i5] = j2;
                jArr3[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i3];
                jArr4[iFindFirstAvailableSlot] = jArr2[i3];
                iArr[i3] = iFindFirstAvailableSlot;
            } else {
                iArr = iArr2;
            }
            i3++;
            jArr = jArr;
            objArr = objArr;
            i = i;
            iArr2 = iArr;
        }
        fixupNodes(iArr2);
    }

    private final void fixupNodes(long[] p0) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            int i4 = (int) (j & SieveCacheKt.NodeLinkMask);
            long j2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (p0[i3] & 4294967295L);
            if (i4 != Integer.MAX_VALUE) {
                i2 = (int) (4294967295L & p0[i4]);
            }
            jArr[i] = ((long) i2) | (((j & SieveCacheKt.NodeMetaMask) | j2) << 31);
            i++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = (int) (p0[i5] & 4294967295L);
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = (int) (p0[i6] & 4294967295L);
        }
        int i7 = this.hand;
        if (i7 != Integer.MAX_VALUE) {
            this.hand = (int) (p0[i7] & 4294967295L);
        }
    }

    private final void fixupNodes(int[] p0) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            int i4 = (int) (j & SieveCacheKt.NodeLinkMask);
            long j2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p0[i3];
            if (i4 != Integer.MAX_VALUE) {
                i2 = p0[i4];
            }
            jArr[i] = (((j & SieveCacheKt.NodeMetaMask) | j2) << 31) | ((long) i2);
            i++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = p0[i5];
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = p0[i6];
        }
        int i7 = this.hand;
        if (i7 != Integer.MAX_VALUE) {
            this.hand = p0[i7];
        }
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        p0.invoke(Integer.valueOf((i << 3) + i3));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:15:0x002c->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object p0) {
        if (p0 == this) {
            return true;
        }
        if (!(p0 instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) p0;
        if (sieveCache.get_size() != get_size() || sieveCache._count != this._count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = objArr2[i4];
                        Intrinsics.checkNotNull(obj2, "");
                        if (!Intrinsics.areEqual(obj2, sieveCache.get(obj))) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 == 8) {
                    if (i != length) {
                        i++;
                    }
                }
            } else if (i != length) {
                i++;
            }
            return true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SieveCache[maxSize=");
        sb.append(this._maxSize);
        sb.append(", size=");
        sb.append(this._size);
        sb.append(", capacity=");
        sb.append(this._capacity);
        sb.append(", count=");
        sb.append(this._count);
        sb.append(']');
        return sb.toString();
    }

    public final void putAll(Map<K, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (Map.Entry<K, ? extends V> entry : p0.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.keys;
        Object[] objArr2 = p0.values;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        put(objArr[i4], objArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(SieveCache<K, V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.keys;
        Object[] objArr2 = p0.values;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = objArr2[i4];
                        Intrinsics.checkNotNull(obj2, "");
                        put(obj, obj2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void removeIf(Function2<? super K, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = this.keys[i4];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = this.values[i4];
                        Intrinsics.checkNotNull(obj2, "");
                        if (p0.invoke(obj, obj2).booleanValue()) {
                            V vRemoveValueAt = removeValueAt(i4);
                            if (vRemoveValueAt == null) {
                                return;
                            }
                            this._size -= this.sizeOf.invoke((K) obj, vRemoveValueAt).intValue();
                            this.onEntryRemoved.invoke((K) obj, vRemoveValueAt, null, Boolean.FALSE);
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.elements;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    public final boolean all(Function2<? super K, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = objArr2[i4];
                        Intrinsics.checkNotNull(obj2, "");
                        if (!p0.invoke(obj, obj2).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[LOOP:0: B:5:0x0016->B:18:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[SYNTHETIC] */
    public final boolean any(Function2<? super K, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Intrinsics.checkNotNull(obj, "");
                            Object obj2 = objArr2[i4];
                            Intrinsics.checkNotNull(obj2, "");
                            if (p0.invoke(obj, obj2).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public final int count(Function2<? super K, ? super V, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = objArr2[i5];
                        Intrinsics.checkNotNull(obj2, "");
                        if (p0.invoke(obj, obj2).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    private final int findKeyIndex(K p0) {
        int i = 0;
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this._capacity;
        int i4 = i2 >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], p0)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    private final int findInsertIndex(K p0) {
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (j3 - ScatterMapKt.BitmaskLsb) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], p0)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._count++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return ~iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.checkNotNull(obj, "");
                        Object obj2 = objArr2[i4];
                        Intrinsics.checkNotNull(obj2, "");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }
}
