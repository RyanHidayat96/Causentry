package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!JA\u0010#\u001a\u00020\"2\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b#\u0010$JA\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0004\b(\u0010)J?\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070*H\u0002¢\u0006\u0004\b+\u0010,JG\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b-\u0010.JO\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060*H\u0002¢\u0006\u0004\b/\u00100J\u001f\u0010 \u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u00101J1\u00102\u001a\u00020\"2\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b2\u00103JI\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J%\u0010(\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0004\b(\u00108J]\u00106\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u00105\u001a\u00020\n2\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b6\u0010:JW\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\n2\u0016\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b;\u0010<Jm\u0010>\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\u00105\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u00109\u001a\u00020\n2\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010AJ;\u0010E\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010FJ?\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u000204H\u0002¢\u0006\u0004\bG\u0010HJ1\u0010I\u001a\u00020\"2\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\bI\u0010JJA\u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u000204H\u0002¢\u0006\u0004\bK\u0010HJ\u001d\u0010L\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0004\bL\u0010)J!\u0010N\u001a\u00020\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150M¢\u0006\u0004\bN\u0010OJ#\u0010L\u001a\u00020\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150MH\u0002¢\u0006\u0004\bL\u0010OJ1\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\bP\u0010\u001bJ7\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\bQ\u0010RJ3\u0010S\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150M2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u000204H\u0002¢\u0006\u0004\bS\u0010TJC\u0010L\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150M2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u000204H\u0002¢\u0006\u0004\bL\u0010UJw\u0010W\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150M2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060V2\u0014\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060VH\u0002¢\u0006\u0004\bW\u0010XJ \u0010Y\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bY\u0010ZJG\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b[\u00107J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\\H\u0097\u0002¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000_H\u0017¢\u0006\u0004\b`\u0010aJ\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000_2\u0006\u0010\u0005\u001a\u00020\nH\u0017¢\u0006\u0004\b`\u0010bJ%\u0010d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060c2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\bd\u0010bR\u001c\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR \u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010hR\"\u0010j\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010\u000f\"\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020o8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR8\u0010r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\br\u0010h\u001a\u0004\bs\u0010\u001fR4\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bt\u0010h\u001a\u0004\bu\u0010\u001fR$\u0010v\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\bv\u0010k\u001a\u0004\bw\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "p0", "", "", "p1", "p2", "", "p3", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "getModCount$runtime", "()I", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "rootSize", "tailSize", "(I)I", "", "isMutable", "([Ljava/lang/Object;)Z", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "makeMutableShiftingRight", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "mutableBuffer", "()[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Z", "", "pushFilledTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "", "addAll", "(Ljava/util/Collection;)Z", "", "copyToBuffer", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "pushBuffers", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "(ILjava/lang/Object;)V", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "p4", "insertIntoRoot", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "(ILjava/util/Collection;)Z", "p5", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "shiftLeafBuffers", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "p6", "splitToBuffers", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "bufferFor", "(I)[Ljava/lang/Object;", "removeAt", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "removeFromRootAt", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pullLastBuffer", "removeAll", "Lkotlin/Function1;", "removeAllWithPredicate", "(Lkotlin/jvm/functions/Function1;)Z", "retainFirst", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "removeAllFromTail", "(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "", "recyclableRemoveAll", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setInRoot", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "", "leafBufferIterator", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "[Ljava/lang/Object;", "vectorTail", "rootShift", "I", "getRootShift$runtime", "setRootShift$runtime", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "root", "getRoot$runtime", "tail", "getTail$runtime", "size", "getSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    public static final int $stable = 8;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    /* JADX INFO: renamed from: getRootShift$runtime, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    public final void setRootShift$runtime(int i) {
        this.rootShift = i;
    }

    /* JADX INFO: renamed from: getRoot$runtime, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: getTail$runtime, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public final int getModCount$runtime() {
        return ((AbstractList) this).modCount;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public final PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, size());
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    persistentVector = new SmallPersistentVector(objArrCopyOf);
                }
            } else {
                Intrinsics.checkNotNull(objArr);
                persistentVector = new PersistentVector(objArr, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final int tailSize(int p0) {
        return p0 <= 32 ? p0 : p0 - UtilsKt.rootSize(p0);
    }

    private final int tailSize() {
        return tailSize(size());
    }

    private final boolean isMutable(Object[] p0) {
        return p0.length == 33 && p0[32] == this.ownership;
    }

    private final Object[] makeMutable(Object[] p0) {
        if (p0 == null) {
            return mutableBuffer();
        }
        return isMutable(p0) ? p0 : ArraysKt.copyInto$default(p0, mutableBuffer(), 0, 0, RangesKt.coerceAtMost(p0.length, 32), 6, (Object) null);
    }

    private final Object[] makeMutableShiftingRight(Object[] p0, int p1) {
        if (isMutable(p0)) {
            return ArraysKt.copyInto(p0, p0, p1, 0, 32 - p1);
        }
        return ArraysKt.copyInto(p0, mutableBuffer(), p1, 0, 32 - p1);
    }

    private final Object[] mutableBufferWith(Object p0) {
        Object[] objArr = new Object[33];
        objArr[0] = p0;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E p0) {
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            objArrMakeMutable[iTailSize] = p0;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(p0));
        }
        return true;
    }

    private final void pushFilledTail(Object[] p0, Object[] p1, Object[] p2) {
        int size = size();
        int i = this.rootShift;
        if ((size >> 5) > (1 << i)) {
            this.root = pushTail(mutableBufferWith(p0), p1, this.rootShift + 5);
            this.tail = p2;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (p0 == null) {
            this.root = p1;
            this.tail = p2;
            this.size = size() + 1;
        } else {
            this.root = pushTail(p0, p1, i);
            this.tail = p2;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] p0, Object[] p1, int p2) {
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, p2);
        Object[] objArrMakeMutable = makeMutable(p0);
        if (p2 == 5) {
            objArrMakeMutable[iIndexSegment] = p1;
            return objArrMakeMutable;
        }
        objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], p1, p2 - 5);
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> p0) {
        if (p0.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = p0.iterator();
        if (32 - iTailSize >= p0.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            this.size = size() + p0.size();
        } else {
            int size = ((p0.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = copyToBuffer(makeMutable(this.tail), iTailSize, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + p0.size();
        }
        return true;
    }

    private final Object[] copyToBuffer(Object[] p0, int p1, Iterator<? extends Object> p2) {
        while (p1 < 32 && p2.hasNext()) {
            p0[p1] = p2.next();
            p1++;
        }
        return p0;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] p0, int p1, Object[][] p2) {
        Object[] objArrMakeMutable;
        Iterator<Object[]> it = ArrayIteratorKt.iterator(p2);
        int i = this.rootShift;
        if ((p1 >> 5) < (1 << i)) {
            objArrMakeMutable = pushBuffers(p0, p1, i, it);
        } else {
            objArrMakeMutable = makeMutable(p0);
        }
        while (it.hasNext()) {
            this.rootShift += 5;
            objArrMakeMutable = mutableBufferWith(objArrMakeMutable);
            int i2 = this.rootShift;
            pushBuffers(objArrMakeMutable, 1 << i2, i2, it);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffers(Object[] p0, int p1, int p2, Iterator<Object[]> p3) {
        if (!p3.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (p2 < 0) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (p2 == 0) {
            return p3.next();
        }
        Object[] objArrMakeMutable = makeMutable(p0);
        int iIndexSegment = UtilsKt.indexSegment(p1, p2);
        int i = p2 - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], p1, i, p3);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !p3.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i, p3);
        }
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int p0, E p1) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        if (p0 == size()) {
            add(p1);
            return;
        }
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (p0 >= iRootSize) {
            insertIntoTail(this.root, p0 - iRootSize, p1);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, p0, p1, objectRef), 0, objectRef.getValue());
    }

    private final void insertIntoTail(Object[] p0, int p1, E p2) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (iTailSize < 32) {
            ArraysKt.copyInto(this.tail, objArrMakeMutable, p1 + 1, p1, iTailSize);
            objArrMakeMutable[p1] = p2;
            this.root = p0;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.copyInto(objArr, objArrMakeMutable, p1 + 1, p1, 31);
        objArrMakeMutable[p1] = p2;
        pushFilledTail(p0, objArrMakeMutable, mutableBufferWith(obj));
    }

    private final Object[] insertIntoRoot(Object[] p0, int p1, int p2, Object p3, ObjectRef p4) {
        Object obj;
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            p4.setValue(p0[31]);
            Object[] objArrCopyInto = ArraysKt.copyInto(p0, makeMutable(p0), iIndexSegment + 1, iIndexSegment, 31);
            objArrCopyInto[iIndexSegment] = p3;
            return objArrCopyInto;
        }
        Object[] objArrMakeMutable = makeMutable(p0);
        int i = p1 - 5;
        Object obj2 = objArrMakeMutable[iIndexSegment];
        Intrinsics.checkNotNull(obj2, "");
        objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj2, i, p2, p3, p4);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || (obj = objArrMakeMutable[iIndexSegment]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj, "");
            objArrMakeMutable[iIndexSegment] = insertIntoRoot((Object[]) obj, i, 0, p4.getValue(), p4);
        }
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int p0, Collection<? extends E> p1) {
        Object[] objArrCopyInto;
        ListImplementation.checkPositionIndex$runtime(p0, size());
        if (p0 == size()) {
            return addAll(p1);
        }
        if (p1.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i = (p0 >> 5) << 5;
        int size = (((size() - i) + p1.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m3653assert(p0 >= rootSize());
            int i2 = p0 & 31;
            int size2 = p1.size();
            Object[] objArr = this.tail;
            Object[] objArrCopyInto2 = ArraysKt.copyInto(objArr, makeMutable(objArr), (((p0 + size2) - 1) & 31) + 1, i2, tailSize());
            copyToBuffer(objArrCopyInto2, i2, p1.iterator());
            this.tail = objArrCopyInto2;
            this.size = size() + p1.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(size() + p1.size());
        if (p0 >= rootSize()) {
            objArrCopyInto = mutableBuffer();
            splitToBuffers(p1, p0, this.tail, iTailSize, objArr2, size, objArrCopyInto);
        } else if (iTailSize2 > iTailSize) {
            int i3 = iTailSize2 - iTailSize;
            objArrCopyInto = makeMutableShiftingRight(this.tail, i3);
            insertIntoRoot(p1, p0, i3, objArr2, size, objArrCopyInto);
        } else {
            int i4 = iTailSize - iTailSize2;
            objArrCopyInto = ArraysKt.copyInto(this.tail, mutableBuffer(), 0, i4, iTailSize);
            int i5 = 32 - i4;
            Object[] objArrMakeMutableShiftingRight = makeMutableShiftingRight(this.tail, i5);
            int i6 = size - 1;
            objArr2[i6] = objArrMakeMutableShiftingRight;
            insertIntoRoot(p1, p0, i5, objArr2, i6, objArrMakeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i, objArr2);
        this.tail = objArrCopyInto;
        this.size = size() + p1.size();
        return true;
    }

    private final void insertIntoRoot(Collection<? extends E> p0, int p1, int p2, Object[][] p3, int p4, Object[] p5) {
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i = p1 >> 5;
        Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i, p2, p3, p4, p5);
        int iRootSize = p4 - (((rootSize() >> 5) - 1) - i);
        if (iRootSize < p4) {
            p5 = p3[iRootSize];
            Intrinsics.checkNotNull(p5);
        }
        splitToBuffers(p0, p1, objArrShiftLeafBuffers, 32, p3, iRootSize, p5);
    }

    private final Object[] shiftLeafBuffers(int p0, int p1, Object[][] p2, int p3, Object[] p4) {
        if (this.root == null) {
            throw new IllegalStateException("root is null".toString());
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != p0) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            ArraysKt.copyInto(objArrPrevious, p4, 0, 32 - p1, 32);
            p4 = makeMutableShiftingRight(objArrPrevious, p1);
            p3--;
            p2[p3] = p4;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int p0) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        return (E) bufferFor(p0)[p0 & 31];
    }

    private final Object[] bufferFor(int p0) {
        if (rootSize() <= p0) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(p0, i)];
            Intrinsics.checkNotNull(objArr2, "");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final E removeAt(int p0) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        ((AbstractList) this).modCount++;
        int iRootSize = rootSize();
        if (p0 >= iRootSize) {
            return (E) removeFromTailAt(this.root, iRootSize, this.rootShift, p0 - iRootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, p0, objectRef), iRootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    private final Object removeFromTailAt(Object[] p0, int p1, int p2, int p3) {
        int size = size() - p1;
        CommonFunctionsKt.m3653assert(p3 < size);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(p0, p1, p2);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[p3];
        Object[] objArrCopyInto = ArraysKt.copyInto(objArr, makeMutable(objArr), p3, p3 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.root = p0;
        this.tail = objArrCopyInto;
        this.size = (p1 + size) - 1;
        this.rootShift = p2;
        return obj2;
    }

    private final Object[] removeFromRootAt(Object[] p0, int p1, int p2, ObjectRef p3) {
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            Object obj = p0[iIndexSegment];
            Object[] objArrCopyInto = ArraysKt.copyInto(p0, makeMutable(p0), iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyInto[31] = p3.getValue();
            p3.setValue(obj);
            return objArrCopyInto;
        }
        int iIndexSegment2 = p0[31] == null ? UtilsKt.indexSegment(rootSize() - 1, p1) : 31;
        Object[] objArrMakeMutable = makeMutable(p0);
        int i = p1 - 5;
        int i2 = iIndexSegment + 1;
        if (i2 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable[iIndexSegment2];
                Intrinsics.checkNotNull(obj2, "");
                objArrMakeMutable[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i, 0, p3);
                if (iIndexSegment2 == i2) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable[iIndexSegment];
        Intrinsics.checkNotNull(obj3, "");
        objArrMakeMutable[iIndexSegment] = removeFromRootAt((Object[]) obj3, i, p2, p3);
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] p0, int p1, int p2) {
        if (p2 == 0) {
            this.root = null;
            if (p0 == null) {
                p0 = new Object[0];
            }
            this.tail = p0;
            this.size = p1;
            this.rootShift = p2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.checkNotNull(p0);
        Object[] objArrPullLastBuffer = pullLastBuffer(p0, p2, p1, objectRef);
        Intrinsics.checkNotNull(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "");
        this.tail = (Object[]) value;
        this.size = p1;
        if (objArrPullLastBuffer[1] == null) {
            this.root = (Object[]) objArrPullLastBuffer[0];
            this.rootShift = p2 - 5;
        } else {
            this.root = objArrPullLastBuffer;
            this.rootShift = p2;
        }
    }

    private final Object[] pullLastBuffer(Object[] p0, int p1, int p2, ObjectRef p3) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(p2 - 1, p1);
        if (p1 == 5) {
            p3.setValue(p0[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = p0[iIndexSegment];
            Intrinsics.checkNotNull(obj, "");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, p1 - 5, p2, p3);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrMakeMutable = makeMutable(p0);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<?> p0) {
        return removeAllWithPredicate(new Function1() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(p0.contains(obj));
            }
        });
    }

    public final boolean removeAllWithPredicate(Function1<? super E, Boolean> p0) {
        boolean zRemoveAll = removeAll(p0);
        if (zRemoveAll) {
            ((AbstractList) this).modCount++;
        }
        return zRemoveAll;
    }

    private final boolean removeAll(Function1<? super E, Boolean> p0) {
        Object[] objArrPushBuffers;
        int iTailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(p0, iTailSize, objectRef) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRemoveAll = 32;
        while (iRemoveAll == 32 && listIteratorLeafBufferIterator.hasNext()) {
            iRemoveAll = removeAll(p0, listIteratorLeafBufferIterator.next(), 32, objectRef);
        }
        if (iRemoveAll == 32) {
            CommonFunctionsKt.m3653assert(!listIteratorLeafBufferIterator.hasNext());
            int iRemoveAllFromTail = removeAllFromTail(p0, iTailSize, objectRef);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRecyclableRemoveAll = iRemoveAll;
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(p0, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i = iPreviousIndex;
        int iRecyclableRemoveAll2 = recyclableRemoveAll(p0, this.tail, iTailSize, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, iRecyclableRemoveAll2, 32);
        if (arrayList.isEmpty()) {
            objArrPushBuffers = this.root;
            Intrinsics.checkNotNull(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(this.root, i, this.rootShift, arrayList.iterator());
        }
        int size = i + (arrayList.size() << 5);
        this.root = retainFirst(objArrPushBuffers, size);
        this.tail = objArr;
        this.size = size + iRecyclableRemoveAll2;
        return true;
    }

    private final int removeAllFromTail(Function1<? super E, Boolean> p0, int p1, ObjectRef p2) {
        int iRemoveAll = removeAll(p0, this.tail, p1, p2);
        if (iRemoveAll == p1) {
            CommonFunctionsKt.m3653assert(p2.getValue() == this.tail);
            return p1;
        }
        Object value = p2.getValue();
        Intrinsics.checkNotNull(value, "");
        Object[] objArr = (Object[]) value;
        ArraysKt.fill(objArr, (Object) null, iRemoveAll, p1);
        this.tail = objArr;
        this.size = size() - (p1 - iRemoveAll);
        return iRemoveAll;
    }

    private final int removeAll(Function1<? super E, Boolean> p0, Object[] p1, int p2, ObjectRef p3) {
        Object[] objArrMakeMutable = p1;
        int i = p2;
        boolean z = false;
        for (int i2 = 0; i2 < p2; i2++) {
            Object obj = p1[i2];
            if (p0.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrMakeMutable = makeMutable(p1);
                    z = true;
                    i = i2;
                }
            } else if (z) {
                objArrMakeMutable[i] = obj;
                i++;
            }
        }
        p3.setValue(objArrMakeMutable);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(Function1<? super E, Boolean> p0, Object[] p1, int p2, int p3, ObjectRef p4, List<Object[]> p5, List<Object[]> p6) {
        Object[] objArrMutableBuffer;
        if (isMutable(p1)) {
            p5.add(p1);
        }
        Object value = p4.getValue();
        Intrinsics.checkNotNull(value, "");
        Object[] objArr = (Object[]) value;
        Object[] objArr2 = objArr;
        for (int i = 0; i < p2; i++) {
            Object obj = p1[i];
            if (!p0.invoke(obj).booleanValue()) {
                if (p3 == 32) {
                    if (!p5.isEmpty()) {
                        objArrMutableBuffer = p5.remove(p5.size() - 1);
                    } else {
                        objArrMutableBuffer = mutableBuffer();
                    }
                    objArr2 = objArrMutableBuffer;
                    p3 = 0;
                }
                objArr2[p3] = obj;
                p3++;
            }
        }
        p4.setValue(objArr2);
        if (objArr != p4.getValue()) {
            p6.add(objArr);
        }
        return p3;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final E set(int p0, E p1) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        if (rootSize() <= p0) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            if (objArrMakeMutable != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i = p0 & 31;
            E e2 = (E) objArrMakeMutable[i];
            objArrMakeMutable[i] = p1;
            this.tail = objArrMakeMutable;
            return e2;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        Intrinsics.checkNotNull(objArr);
        this.root = setInRoot(objArr, this.rootShift, p0, p1, objectRef);
        return (E) objectRef.getValue();
    }

    private final Object[] setInRoot(Object[] p0, int p1, int p2, E p3, ObjectRef p4) {
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        Object[] objArrMakeMutable = makeMutable(p0);
        if (p1 == 0) {
            if (objArrMakeMutable != p0) {
                ((AbstractList) this).modCount++;
            }
            p4.setValue(objArrMakeMutable[iIndexSegment]);
            objArrMakeMutable[iIndexSegment] = p3;
            return objArrMakeMutable;
        }
        Object obj = objArrMakeMutable[iIndexSegment];
        Intrinsics.checkNotNull(obj, "");
        objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, p1 - 5, p2, p3, p4);
        return objArrMakeMutable;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        return new PersistentVectorMutableIterator(this, p0);
    }

    private final ListIterator<Object[]> leafBufferIterator(int p0) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int iRootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime(p0, iRootSize);
        int i = this.rootShift;
        if (i == 0) {
            return new SingleElementListIterator(objArr, p0);
        }
        return new TrieIterator(objArr, p0, iRootSize, i / 5);
    }

    private final void splitToBuffers(Collection<? extends E> p0, int p1, Object[] p2, int p3, Object[][] p4, int p5, Object[] p6) {
        Object[] objArrMutableBuffer;
        if (p5 <= 0) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrMakeMutable = makeMutable(p2);
        p4[0] = objArrMakeMutable;
        int i = p1 & 31;
        int size = ((p1 + p0.size()) - 1) & 31;
        int i2 = (p3 - i) + size;
        if (i2 < 32) {
            ArraysKt.copyInto(objArrMakeMutable, p6, size + 1, i, p3);
        } else {
            if (p5 == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                p5--;
                p4[p5] = objArrMutableBuffer;
            }
            int i3 = p3 - (i2 - 31);
            ArraysKt.copyInto(objArrMakeMutable, p6, 0, i3, p3);
            ArraysKt.copyInto(objArrMakeMutable, objArrMutableBuffer, size + 1, i, i3);
            p6 = objArrMutableBuffer;
        }
        Iterator<? extends E> it = p0.iterator();
        copyToBuffer(objArrMakeMutable, i, it);
        for (int i4 = 1; i4 < p5; i4++) {
            p4[i4] = copyToBuffer(mutableBuffer(), 0, it);
        }
        copyToBuffer(p6, 0, it);
    }

    private final Object[] retainFirst(Object[] p0, int p1) {
        if ((p1 & 31) != 0) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (p1 == 0) {
            this.rootShift = 0;
            return null;
        }
        int i = p1 - 1;
        while (true) {
            int i2 = this.rootShift;
            if ((i >> i2) == 0) {
                this.rootShift = i2 - 5;
                Object[] objArr = p0[0];
                Intrinsics.checkNotNull(objArr, "");
                p0 = objArr;
            } else {
                return nullifyAfter(p0, i, i2);
            }
        }
    }

    private final Object[] nullifyAfter(Object[] p0, int p1, int p2) {
        if (p2 < 0) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (p2 == 0) {
            return p0;
        }
        int iIndexSegment = UtilsKt.indexSegment(p1, p2);
        Object obj = p0[iIndexSegment];
        Intrinsics.checkNotNull(obj, "");
        Object objNullifyAfter = nullifyAfter((Object[]) obj, p1, p2 - 5);
        if (iIndexSegment < 31) {
            int i = iIndexSegment + 1;
            if (p0[i] != null) {
                if (isMutable(p0)) {
                    ArraysKt.fill(p0, (Object) null, i, 32);
                }
                p0 = ArraysKt.copyInto(p0, mutableBuffer(), 0, 0, i);
            }
        }
        if (objNullifyAfter == p0[iIndexSegment]) {
            return p0;
        }
        Object[] objArrMakeMutable = makeMutable(p0);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }
}
