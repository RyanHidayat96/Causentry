package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.ObjectLocation;
import androidx.exifinterface.media.ExifInterface;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0093\u0003\u0094\u0003BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001d\u0010\u0019J!\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0017¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u0015H\u0000¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0015H\u0000¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0015H\u0000¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010\u0017J!\u0010,\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b,\u0010 J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010\u0019J\u000f\u0010.\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010\u0019J\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u0010\u0019J#\u00103\u001a\u00020\u0015\"\u0004\b\u0000\u001012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b6\u0010\u0019J!\u00107\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b7\u0010 J\u000f\u00108\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u0010\u0019J\u000f\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\b9\u0010\u0019J\u000f\u0010:\u001a\u00020\u0015H\u0016¢\u0006\u0004\b:\u0010\u0019J\r\u0010;\u001a\u00020\u0015¢\u0006\u0004\b;\u0010\u0019J\r\u0010<\u001a\u00020\u0015¢\u0006\u0004\b<\u0010\u0019J\u0017\u0010=\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b=\u0010\u0017JB\u0010A\u001a\u00020\u0015\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u001012\u0006\u0010\u0003\u001a\u00028\u00002\u001d\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150?¢\u0006\u0002\b@H\u0016¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bC\u0010DJ\u0011\u0010E\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bE\u0010FJ\u0011\u0010G\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bG\u0010FJ\u0019\u0010H\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bJ\u0010IJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020KH\u0017¢\u0006\u0004\bH\u0010LJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020MH\u0017¢\u0006\u0004\bH\u0010NJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020OH\u0017¢\u0006\u0004\bH\u0010PJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020)H\u0017¢\u0006\u0004\bH\u0010QJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020RH\u0017¢\u0006\u0004\bH\u0010SJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020TH\u0017¢\u0006\u0004\bH\u0010UJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020VH\u0017¢\u0006\u0004\bH\u0010WJ\u0017\u0010H\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\bH\u0010XJ,\u0010Y\u001a\u00028\u0000\"\u0004\b\u0000\u001012\u0006\u0010\u0003\u001a\u00020)2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b]\u0010\\J\u0019\u0010^\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b^\u0010\\J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001502H\u0016¢\u0006\u0004\bb\u00104J\u000f\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010d\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\bd\u0010fJ\u001f\u0010g\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020c2\u0006\u0010\u0005\u001a\u00020cH\u0002¢\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u00020\u00152\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030iH\u0017¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020cH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0015H\u0017¢\u0006\u0004\bn\u0010\u0019J#\u0010p\u001a\u00020\u00152\u0012\u0010\u0003\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030i0oH\u0017¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0015H\u0017¢\u0006\u0004\br\u0010\u0019J#\u0010t\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000sH\u0017¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u0004H\u0017¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u0015H\u0002¢\u0006\u0004\bx\u0010\u0019J\u000f\u0010y\u001a\u00020\u0015H\u0002¢\u0006\u0004\by\u0010\u0019J\u000f\u0010z\u001a\u00020\u0015H\u0002¢\u0006\u0004\bz\u0010\u0019J!\u0010{\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020)2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b{\u0010|J4\u0010\u0080\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020}2\b\u0010\n\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b~\u0010\u007fJ%\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020)2\t\u0010\u0005\u001a\u0005\u0018\u00010\u0081\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0084\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020)H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020)H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0019J\u001a\u0010\u0089\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\"\u0010\u008b\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J2\u0010\u008d\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u008f\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u008a\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u008a\u0001J\"\u0010\u0091\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u008c\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0019J*\u0010\u0093\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\"\u0010\u0095\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J4\u0010\u0097\u0001\u001a\u00070Tj\u0003`\u0096\u00012\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u000b\u0010\u0007\u001a\u00070Tj\u0003`\u0096\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001f\u0010\u009a\u0001\u001a\u00020\u0014*\u00030\u0099\u00012\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J%\u0010\u009d\u0001\u001a\u00020)2\u0007\u0010\u0003\u001a\u00030\u009c\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0012\u0010\u009f\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0015H\u0017¢\u0006\u0005\b¡\u0001\u0010\u0019J\u0011\u0010¢\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b¢\u0001\u0010\u0019J\"\u0010£\u0001\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0014H\u0017¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0011\u0010¥\u0001\u001a\u00020\u0015H\u0017¢\u0006\u0005\b¥\u0001\u0010\u0019J\u001a\u0010¦\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020)H\u0017¢\u0006\u0006\b¦\u0001\u0010\u0087\u0001J\u001a\u0010§\u0001\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0011\u0010©\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b©\u0001\u0010\u0019J\u001b\u0010ª\u0001\u001a\u00020\u00152\u0007\u0010\u0003\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0015\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u0001H\u0017¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J+\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030°\u0001\u0012\u0004\u0012\u00020\u0015\u0018\u00010¯\u00012\u0007\u0010\u0003\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J)\u0010´\u0001\u001a\u00020\u00152\u000b\u0010\u0003\u001a\u0007\u0012\u0002\b\u00030³\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J=\u0010¶\u0001\u001a\u00020\u00152\u000f\u0010\u0003\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0³\u00012\u0006\u0010\u0005\u001a\u00020c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\n\u001a\u00020)H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J2\u0010»\u0001\u001a\u00020\u00152\u001e\u0010\u0003\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030º\u0001\u0012\u0007\u0012\u0005\u0018\u00010º\u00010¹\u00010¸\u0001H\u0017¢\u0006\u0006\b»\u0001\u0010¼\u0001J2\u0010½\u0001\u001a\u00020\u00152\u001e\u0010\u0003\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030º\u0001\u0012\u0007\u0012\u0005\u0018\u00010º\u00010¹\u00010¸\u0001H\u0002¢\u0006\u0006\b½\u0001\u0010¼\u0001J1\u0010¿\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010¾\u00012\u0007\u0010\u0003\u001a\u00030\u0099\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0082\b¢\u0006\u0006\b¿\u0001\u0010À\u0001Jn\u0010Â\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010¾\u00012\u000b\b\u0002\u0010\u0003\u001a\u0005\u0018\u00010Á\u00012\u000b\b\u0002\u0010\u0005\u001a\u0005\u0018\u00010Á\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00142\u001f\b\u0002\u0010\n\u001a\u0019\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001e0¹\u00010¸\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001b\u0010Å\u0001\u001a\u00020\u00152\u0007\u0010\u0003\u001a\u00030Ä\u0001H\u0017¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J#\u0010Ç\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0007\u0010\u0005\u001a\u00030Ä\u0001H\u0017¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0011\u0010É\u0001\u001a\u00020\u0015H\u0017¢\u0006\u0005\bÉ\u0001\u0010\u0019J\u0011\u0010Ê\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÊ\u0001\u0010\u0019J$\u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030Ë\u00010¸\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001a\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Ë\u00010¸\u0001H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J,\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Ë\u00010¸\u00012\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001a\u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030Ë\u00010¸\u0001H\u0007¢\u0006\u0006\bÒ\u0001\u0010Ï\u0001JG\u0010Ø\u0001\u001a\u00020\u00152\u0014\u0010\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\u001e0Ó\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001502¢\u0006\u0003\bÔ\u00012\t\u0010\u0007\u001a\u0005\u0018\u00010Õ\u0001H\u0000¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001f\u0010Ù\u0001\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001502H\u0000¢\u0006\u0005\bÙ\u0001\u00104J3\u0010Ü\u0001\u001a\u00020)2\u0014\u0010\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\u001e0Ó\u00012\t\u0010\u0005\u001a\u0005\u0018\u00010Õ\u0001H\u0000¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J&\u0010ß\u0001\u001a\u00020\u00152\u0014\u0010\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\u001e0Ó\u0001¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J>\u0010â\u0001\u001a\u00020\u00152\u0014\u0010\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\u001e0Ó\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u000102¢\u0006\u0003\bÔ\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J!\u0010ã\u0001\u001a\u0004\u0018\u00010\u001e*\u00030\u0099\u00012\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0011\u0010å\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\bå\u0001\u0010\u0019J\u0011\u0010æ\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\bæ\u0001\u0010\u0019J\u001a\u0010ç\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020_H\u0002¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0011\u0010é\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\bé\u0001\u0010\u0019J\u0019\u0010ê\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0005\bê\u0001\u0010\u0017J\u0011\u0010ë\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\bë\u0001\u0010\u0019J\u0011\u0010ì\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\bì\u0001\u0010\u0019J\u0011\u0010í\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\bí\u0001\u0010\u0019J\u0011\u0010î\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0005\bî\u0001\u0010\u0019J7\u0010ï\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\u001eH\u0082\b¢\u0006\u0006\bï\u0001\u0010ð\u0001J#\u0010ñ\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0082\b¢\u0006\u0006\bñ\u0001\u0010\u008c\u0001J7\u0010ò\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\u001eH\u0082\b¢\u0006\u0006\bò\u0001\u0010ð\u0001J#\u0010ó\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0082\b¢\u0006\u0006\bó\u0001\u0010\u008c\u0001J\u0012\u0010ô\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0006\bô\u0001\u0010 \u0001J\u0013\u0010õ\u0001\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0005\bõ\u0001\u0010FJ\u001b\u0010ö\u0001\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0005\bö\u0001\u0010\\J\u001b\u0010ø\u0001\u001a\u00020\u00152\u0007\u0010\u0003\u001a\u00030÷\u0001H\u0016¢\u0006\u0006\bø\u0001\u0010ù\u0001R#\u0010ú\u0001\u001a\u0006\u0012\u0002\b\u00030\u00028\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001R\u0017\u0010þ\u0001\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0017\u0010\u0080\u0002\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001d\u0010\u0082\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0019\u0010\u0084\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0019\u0010\u0086\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0085\u0002R\u0017\u0010\u0087\u0002\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001f\u0010\u0089\u0002\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R!\u0010\u008e\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010\u008d\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001c\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0019\u0010\u0092\u0002\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0019\u0010\u0094\u0002\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0093\u0002R\u0019\u0010\u0095\u0002\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0093\u0002R\u0018\u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u001c\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0099\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001c\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009c\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0019\u0010\u009f\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u0019\u0010¡\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010 \u0002R\u0019\u0010¢\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010 \u0002R\u001f\u0010¥\u0002\u001a\n\u0012\u0005\u0012\u00030¤\u00020£\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0018\u0010§\u0002\u001a\u00030\u0096\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b§\u0002\u0010\u0098\u0002R\u0019\u0010¨\u0002\u001a\u00020c8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\"\u0010«\u0002\u001a\u000b\u0012\u0004\u0012\u00020c\u0018\u00010ª\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010 \u0002R\u0018\u0010®\u0002\u001a\u00030\u0096\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b®\u0002\u0010\u0098\u0002R\u0019\u0010¯\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010 \u0002R\u0019\u0010°\u0002\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b°\u0002\u0010\u0093\u0002R\u0019\u0010±\u0002\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b±\u0002\u0010\u0093\u0002R\u0019\u0010²\u0002\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b²\u0002\u0010\u0093\u0002R\u0019\u0010³\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b³\u0002\u0010 \u0002R\u0018\u0010µ\u0002\u001a\u00030´\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u001f\u0010·\u0002\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010\u008d\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b·\u0002\u0010\u008f\u0002R(\u0010¸\u0002\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020)8\u0001@BX\u0081\u000e¢\u0006\u000f\n\u0006\b¸\u0002\u0010 \u0002\u001a\u0005\b¹\u0002\u0010+R(\u0010º\u0002\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020)8\u0001@BX\u0081\u000e¢\u0006\u000f\n\u0006\bº\u0002\u0010 \u0002\u001a\u0005\b»\u0002\u0010+R\u0016\u0010½\u0002\u001a\u00020)8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¼\u0002\u0010+R\u0016\u0010¿\u0002\u001a\u00020)8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¾\u0002\u0010+R*\u0010À\u0002\u001a\u00030\u0099\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R)\u0010Æ\u0002\u001a\u00020\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÆ\u0002\u0010\u0081\u0002\u001a\u0006\bÇ\u0002\u0010È\u0002\"\u0006\bÉ\u0002\u0010Ê\u0002R\u001a\u0010Ì\u0002\u001a\u00030Ë\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u0019\u0010Î\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÎ\u0002\u0010 \u0002R\u001b\u0010Ï\u0002\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010©\u0002R+\u0010Ð\u0002\u001a\u0004\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÐ\u0002\u0010\u0085\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002R\u0018\u0010Ö\u0002\u001a\u00030Õ\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u0019\u0010Ø\u0002\u001a\u00020_8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bØ\u0002\u0010Ù\u0002R\u001a\u0010Û\u0002\u001a\u00030Ú\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u0019\u0010Ý\u0002\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010 \u0002R\u001c\u0010Þ\u0002\u001a\u0005\u0018\u00010Õ\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\"\u0010á\u0002\u001a\u0005\u0018\u00010à\u00028AX\u0081\u0004¢\u0006\u0010\n\u0006\bá\u0002\u0010â\u0002\u001a\u0006\bã\u0002\u0010ä\u0002R \u0010æ\u0002\u001a\u00030å\u00028\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\bæ\u0002\u0010ç\u0002\u001a\u0006\bè\u0002\u0010é\u0002R\u001d\u0010ì\u0002\u001a\u00020)8WX\u0097\u0004¢\u0006\u000e\u0012\u0005\bë\u0002\u0010\u0019\u001a\u0005\bê\u0002\u0010+R/\u0010í\u0002\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020)8\u0017@RX\u0097\u000e¢\u0006\u0016\n\u0006\bí\u0002\u0010 \u0002\u0012\u0005\bï\u0002\u0010\u0019\u001a\u0005\bî\u0002\u0010+R\u001d\u0010ò\u0002\u001a\u00020)8WX\u0097\u0004¢\u0006\u000e\u0012\u0005\bñ\u0002\u0010\u0019\u001a\u0005\bð\u0002\u0010+R:\u0010ó\u0002\u001a\u00070Tj\u0003`\u0096\u00012\u000b\u0010\u0003\u001a\u00070Tj\u0003`\u0096\u00018\u0017@RX\u0097\u000e¢\u0006\u0017\n\u0006\bó\u0002\u0010ô\u0002\u0012\u0005\b÷\u0002\u0010\u0019\u001a\u0006\bõ\u0002\u0010ö\u0002R\u0017\u0010ù\u0002\u001a\u00020\u00148WX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0002\u0010 \u0001R\u001c\u0010û\u0002\u001a\u0005\u0018\u00010ú\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bû\u0002\u0010ü\u0002R\u0018\u0010ÿ\u0002\u001a\u00030ú\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0002\u0010þ\u0002R\u0018\u0010\u0083\u0003\u001a\u00030\u0080\u00038WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0003\u0010\u0082\u0003R\u0017\u0010\u0085\u0003\u001a\u00020\u00148AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0003\u0010 \u0001R\u001a\u0010\u0088\u0003\u001a\u0005\u0018\u00010\u009c\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0086\u0003\u0010\u0087\u0003R\u0013\u0010\u008a\u0003\u001a\u00020)8G¢\u0006\u0007\u001a\u0005\b\u0089\u0003\u0010+R\u001e\u0010\u008d\u0003\u001a\u0004\u0018\u00010\u001e*\u00030\u0099\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010\u008c\u0003R\u001a\u0010\u0090\u0003\u001a\u0005\u0018\u00010÷\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0003\u0010\u008f\u0003R\u0018\u0010\u0092\u0003\u001a\u0004\u0018\u00010\u001e8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0003\u0010F"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "p0", "Landroidx/compose/runtime/CompositionContext;", "p1", "Landroidx/compose/runtime/SlotTable;", "p2", "", "Landroidx/compose/runtime/RememberObserver;", "p3", "Landroidx/compose/runtime/changelist/ChangeList;", "p4", "p5", "Landroidx/compose/runtime/CompositionObserverHolder;", "p6", "Landroidx/compose/runtime/CompositionImpl;", "p7", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/CompositionObserverHolder;Landroidx/compose/runtime/CompositionImpl;)V", "", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startRoot", "endRoot", "abortRoot", "changesApplied$runtime", "collectParameterInformation", "dispose$runtime", "deactivate$runtime", "", "forceRecomposeScopes$runtime", "()Z", "startGroup", "endGroup", "skipGroup", "startNode", "startReusableNode", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "nextSlot", "()Ljava/lang/Object;", "nextSlotForCache", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(Z)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "(I)Z", "cache", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateSlot", "(Ljava/lang/Object;)V", "updateValue", "updateCachedValue", "Landroidx/compose/runtime/Anchor;", "rememberObserverAnchor", "()Landroidx/compose/runtime/Anchor;", "recordSideEffect", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "currentCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(I)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "updateProviderMapGroup", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/ProvidedValue;", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "recordProviderUpdate", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "endProvider", "", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "ensureWriter", "createFreshInsertTable", "forceFreshInsertTable", "startReaderGroup", "(ZLjava/lang/Object;)V", "Landroidx/compose/runtime/GroupKind;", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "enterGroup", "(ZLandroidx/compose/runtime/Pending;)V", "exitGroup", "(IZ)V", "end", "(Z)V", "recomposeToGroupEnd", "insertedGroupVirtualIndex", "(I)I", "updateNodeCountOverrides", "(II)V", "nodeIndexOf", "(IIII)I", "rGroupIndexOf", "updatedNodeCount", "updateNodeCount", "clearUpdatedNodeCounts", "recordUpsAndDowns", "(III)V", "doRecordDownsFor", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyOf", "(IIJ)J", "Landroidx/compose/runtime/SlotReader;", "groupCompositeKeyPart", "(Landroidx/compose/runtime/SlotReader;I)I", "Landroidx/compose/runtime/RecomposeScopeImpl;", "tryImminentInvalidation$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "parentKey$runtime", "()I", "skipCurrentGroup", "skipReaderToGroupEnd", "shouldExecute", "(ZI)Z", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "addRecomposeScope", "enterRecomposeScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "exitRecomposeScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/MovableContent;", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "invokeMovableContentLambda", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "(Ljava/util/List;)V", "insertMovableContentGuarded", "R", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "disableSourceInformation", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "stackTraceForValue$runtime", "(Ljava/lang/Object;)Ljava/util/List;", "currentStackTrace", "()Ljava/util/List;", "stackTraceForGroup", "(ILjava/lang/Integer;)Ljava/util/List;", "parentStackTrace", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ShouldPauseCallback;", "composeContent--ZbOJvo$runtime", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V", "composeContent", "prepareCompose$runtime", "recompose-aFTiNEg$runtime", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "recompose", "updateComposerInvalidations-RY85e9Y", "(Landroidx/collection/MutableScatterMap;)V", "updateComposerInvalidations", "doCompose-aFTiNEg", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "doCompose", "nodeAt", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "validateNodeExpected", "validateNodeNotExpected", "recordInsert", "(Landroidx/compose/runtime/Anchor;)V", "recordDelete", "reportFreeMovableContent", "reportAllMovableContent", "finalizeCompose", "cleanUpCompose", "verifyConsistent$runtime", "updateCompositeKeyWhenWeEnterGroup", "(IILjava/lang/Object;Ljava/lang/Object;)V", "updateCompositeKeyWhenWeEnterGroupKeyHash", "updateCompositeKeyWhenWeExitGroup", "updateCompositeKeyWhenWeExitGroupKeyHash", "stacksSize$runtime", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "applier", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "Ljava/util/Set;", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Ljava/util/ArrayList;", TransactionResult.STATUS_PENDING, "Landroidx/compose/runtime/Pending;", "nodeIndex", "I", "groupNodeCount", "rGroupIndex", "Landroidx/compose/runtime/IntStack;", "parentStateStack", "Landroidx/compose/runtime/IntStack;", "", "nodeCountOverrides", "[I", "Landroidx/collection/MutableIntIntMap;", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "forceRecomposeScopes", "Z", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/Invalidation;", "invalidations", "Ljava/util/List;", "entersStack", "rootProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/collection/MutableIntObjectMap;", "providerUpdates", "Landroidx/collection/MutableIntObjectMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "derivedStateObserver", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "invalidateStack", "isComposing", "isComposing$runtime", "isDisposed", "isDisposed$runtime", "getAreChildrenComposing$runtime", "areChildrenComposing", "getHasPendingChanges$runtime", "hasPendingChanges", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime", "(Landroidx/compose/runtime/SlotReader;)V", "insertTable", "getInsertTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/changelist/FixupList;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "pausable", "shouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "errorContext", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "getErrorContext$runtime", "()Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "inserting", "getInserting", "getInserting$annotations", "getSkipping", "getSkipping$annotations", "skipping", "compositeKeyHashCode", "J", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "_compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getChangeCount$runtime", "changeCount", "getCurrentRecomposeScope$runtime", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "node", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "recomposeScopeIdentity", "CompositionContextHolder", "CompositionContextImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;
    private CompositionData _compositionData;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final CoroutineContext applyCoroutineContext;
    private final ComposerChangeListWriter changeListWriter;
    private ChangeList changes;
    private int childrenComposing;
    private long compositeKeyHashCode;
    private final CompositionImpl composition;
    private int compositionToken;
    private ChangeList deferredChanges;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private final CompositionErrorContextImpl errorContext;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private Anchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private final ArrayList<T> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parentContext;
    private boolean pausable;
    private Pending pending;
    private PersistentCompositionLocalMap providerCache;
    private MutableIntObjectMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;
    private SlotReader reader;
    private boolean reusing;
    private ShouldPauseCallback shouldPauseCallback;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final ArrayList<T> pendingStack = Stack.m3520constructorimpl$default(null, 1, null);
    private final IntStack parentStateStack = new IntStack();
    private final List<Invalidation> invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap rootProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int insertedGroupVirtualIndex(int p0) {
        return (-2) - p0;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, ChangeList changeList, ChangeList changeList2, CompositionObserverHolder compositionObserverHolder, CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.observerHolder = compositionObserverHolder;
        this.composition = compositionImpl;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void start(DerivedState<?> p0) {
                this.this$0.childrenComposing++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void done(DerivedState<?> p0) {
                this.this$0.childrenComposing--;
            }
        };
        this.invalidateStack = Stack.m3520constructorimpl$default(null, 1, null);
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.errorContext = new CompositionErrorContextImpl(this);
            CoroutineContext effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            CoroutineContext errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? EmptyCoroutineContext.INSTANCE : errorContext$runtime);
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: isComposing$runtime, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: renamed from: isDisposed$runtime, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime() {
        return this.childrenComposing > 0;
    }

    public final boolean getHasPendingChanges$runtime() {
        return this.changes.isNotEmpty();
    }

    /* JADX INFO: renamed from: getReader$runtime, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    public final void setReader$runtime(SlotReader slotReader) {
        this.reader = slotReader;
    }

    /* JADX INFO: renamed from: getInsertTable$runtime, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime(SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    /* JADX INFO: renamed from: getDeferredChanges$runtime, reason: from getter */
    public final ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final void setDeferredChanges$runtime(ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    public final CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.sourceMarkersEnabled) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public final CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void startReplaceableGroup(int p0) {
        m3463startBaiHCIY(p0, null, GroupKind.INSTANCE.m3480getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void startReplaceGroup(int p0) {
        if (this.pending != null) {
            m3463startBaiHCIY(p0, null, GroupKind.INSTANCE.m3480getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p0), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(p0, Composer.INSTANCE.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == p0 && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i, slotReader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(p0, Composer.INSTANCE.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void startDefaults() {
        m3463startBaiHCIY(ComposerKt.defaultsKey, null, GroupKind.INSTANCE.m3480getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean getDefaultsInvalid() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return !getSkipping() || this.providersInvalid || ((currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && currentRecomposeScope$runtime.getDefaultsInvalid());
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void startMovableGroup(int p0, Object p1) {
        m3463startBaiHCIY(p0, p1, GroupKind.INSTANCE.m3480getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime();
        PersistentCompositionLocalMap compositionLocalScope$runtime = this.parentContext.getCompositionLocalScope$runtime();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(compositionLocalScope$runtime);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        if (this.sourceMarkersEnabled) {
            CompositionLocal<CompositionErrorContext> localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
            Intrinsics.checkNotNull(localCompositionErrorContext, "");
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new StaticValueHolder(getErrorContext$runtime()));
        }
        this.rootProvider = compositionLocalScope$runtime;
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(compositionLocalScope$runtime, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime(set);
        }
        startGroup(Long.hashCode(this.parentContext.getCompositeKeyHashCode()));
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m3518clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compositeKeyHashCode = 0L;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    public final void changesApplied$runtime() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public final long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.runtime.Composer
    public final void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    public final void deactivate$runtime() {
        Stack.m3518clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    public final boolean forceRecomposeScopes$runtime() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    private final void startGroup(int p0) {
        m3463startBaiHCIY(p0, null, GroupKind.INSTANCE.m3480getGroupULZAiWs(), null);
    }

    private final void startGroup(int p0, Object p1) {
        m3463startBaiHCIY(p0, p1, GroupKind.INSTANCE.m3480getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public final void startNode() {
        m3463startBaiHCIY(125, null, GroupKind.INSTANCE.m3481getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void startReusableNode() {
        m3463startBaiHCIY(125, null, GroupKind.INSTANCE.m3482getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public final <T> void createNode(Function0<? extends T> p0) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(p0, iPeek, anchor);
    }

    @Override // androidx.compose.runtime.Composer
    public final void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public final void startReusableGroup(int p0, Object p1) {
        if (!getInserting() && this.reader.getGroupKey() == p0 && !Intrinsics.areEqual(this.reader.getGroupAux(), p1) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m3463startBaiHCIY(p0, null, GroupKind.INSTANCE.m3480getGroupULZAiWs(), p1);
    }

    @Override // androidx.compose.runtime.Composer
    public final void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public final void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public final void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final void endReuseFromRoot() {
        if (this.isComposing || this.reusingGroup != 100) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public final int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public final void endToMarker(int p0) {
        if (p0 < 0) {
            int i = -p0;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= p0) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final <V, T> void apply(V p0, Function2<? super T, ? super V, Unit> p1) {
        if (getInserting()) {
            this.insertFixups.updateNode(p0, p1);
        } else {
            this.changeListWriter.updateNode(p0, p1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final Object joinKey(Object p0, Object p1) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), p0, p1);
        return key == null ? new JoinedKey(p0, p1) : key;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next : Composer.INSTANCE.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        if (!this.reusing || (next instanceof ReusableRememberObserver)) {
            return next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next;
        }
        return Composer.INSTANCE.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(Object p0) {
        if (Intrinsics.areEqual(nextSlot(), p0)) {
            return false;
        }
        updateValue(p0);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changedInstance(Object p0) {
        if (nextSlot() == p0) {
            return false;
        }
        updateValue(p0);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(char p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && p0 == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(byte p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && p0 == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(short p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && p0 == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(boolean p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && p0 == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(float p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && p0 == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(long p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && p0 == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(double p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && p0 == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(p0));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean changed(int p0) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && p0 == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(p0));
        return true;
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean p0, Function0<? extends T> p1) {
        T t = (T) nextSlotForCache();
        if (t != Composer.INSTANCE.getEmpty() && !p0) {
            return t;
        }
        T tInvoke = p1.invoke();
        updateCachedValue(tInvoke);
        return tInvoke;
    }

    private final void updateSlot(Object p0) {
        nextSlot();
        updateValue(p0);
    }

    public final void updateValue(Object p0) {
        if (getInserting()) {
            this.writer.update(p0);
            return;
        }
        if (this.reader.getHadNext()) {
            int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (this.changeListWriter.getPastParent()) {
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                SlotReader slotReader = this.reader;
                composerChangeListWriter.updateAnchoredValue(p0, slotReader.anchor(slotReader.getParent()), groupSlotIndex);
                return;
            }
            this.changeListWriter.updateValue(p0, groupSlotIndex);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.appendValue(slotReader2.anchor(slotReader2.getParent()), p0);
    }

    public final void updateCachedValue(Object p0) {
        boolean z = p0 instanceof RememberObserver;
        Object obj = p0;
        if (z) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) p0, rememberObserverAnchor());
            if (getInserting()) {
                this.changeListWriter.remember(rememberObserverHolder);
            }
            this.abandonSet.add(p0);
            obj = rememberObserverHolder;
        }
        updateValue(obj);
    }

    private final Anchor rememberObserverAnchor() {
        int i;
        int i2;
        if (getInserting()) {
            if (!ComposerKt.isAfterFirstChild(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iParent = this.writer.parent(currentGroup);
            while (true) {
                int i3 = iParent;
                i2 = currentGroup;
                currentGroup = i3;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iParent = this.writer.parent(currentGroup);
            }
            return this.writer.anchor(i2);
        }
        if (!ComposerKt.isAfterFirstChild(this.reader)) {
            return null;
        }
        int currentGroup2 = this.reader.getCurrentGroup() - 1;
        int iParent2 = this.reader.parent(currentGroup2);
        while (true) {
            int i4 = iParent2;
            i = currentGroup2;
            currentGroup2 = i4;
            if (currentGroup2 == this.reader.getParent() || currentGroup2 < 0) {
                break;
            }
            iParent2 = this.reader.parent(currentGroup2);
        }
        return this.reader.anchor(i);
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(getComposition());
        this._compositionData = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public final void recordSideEffect(Function0<Unit> p0) {
        this.changeListWriter.sideEffect(p0);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int p0) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    Intrinsics.checkNotNull(objGroupAux, "");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (p0 > 0) {
                if (this.reader.groupKey(p0) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(p0), ComposerKt.getCompositionLocalMap())) {
                    MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = mutableIntObjectMap.get(p0)) == null) {
                        Object objGroupAux2 = this.reader.groupAux(p0);
                        Intrinsics.checkNotNull(objGroupAux2, "");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                p0 = this.reader.parent(p0);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.rootProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public final void startProvider(ProvidedValue<?> p0) {
        ValueHolder<?> valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        Object objRememberedValue = rememberedValue();
        if (Intrinsics.areEqual(objRememberedValue, Composer.INSTANCE.getEmpty())) {
            valueHolder = null;
        } else {
            Intrinsics.checkNotNull(objRememberedValue, "");
            valueHolder = (ValueHolder) objRememberedValue;
        }
        CompositionLocal<?> compositionLocal = p0.getCompositionLocal();
        Intrinsics.checkNotNull(compositionLocal, "");
        Intrinsics.checkNotNull(p0, "");
        ValueHolder<?> valueHolderUpdatedStateOf$runtime = compositionLocal.updatedStateOf$runtime(p0, valueHolder);
        boolean zAreEqual = Intrinsics.areEqual(valueHolderUpdatedStateOf$runtime, valueHolder);
        if (!zAreEqual) {
            updateRememberedValue(valueHolderUpdatedStateOf$runtime);
        }
        boolean z = false;
        if (getInserting()) {
            if (p0.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal)) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objGroupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            Intrinsics.checkNotNull(objGroupAux, "");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux;
            if ((!getSkipping() || !zAreEqual) && (p0.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal))) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime);
            } else if ((zAreEqual && !this.providersInvalid) || !this.providersInvalid) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMap;
            }
            if (this.reusing || persistentCompositionLocalMap != persistentCompositionLocalMapCurrentCompositionLocalScope) {
                z = true;
            }
        }
        if (z && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapCurrentCompositionLocalScope);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.providerCache = persistentCompositionLocalMapCurrentCompositionLocalScope;
        m3463startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m3480getGroupULZAiWs(), persistentCompositionLocalMapCurrentCompositionLocalScope);
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap p0) {
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrentGroup(), p0);
    }

    @Override // androidx.compose.runtime.Composer
    public final void endProvider() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public final void startProviders(ProvidedValue<?>[] p0) {
        PersistentCompositionLocalMap persistentCompositionLocalMapUpdateProviderMapGroup;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z = true;
        if (getInserting()) {
            persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(p0, persistentCompositionLocalMapCurrentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(objGroupGet, "");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(objGroupGet2, "");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupGet2;
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap = CompositionLocalMapKt.updateCompositionMap(p0, persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMap2);
            if (!getSkipping() || this.reusing || !Intrinsics.areEqual(persistentCompositionLocalMap2, persistentCompositionLocalMapUpdateCompositionMap)) {
                persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMapUpdateCompositionMap);
                if (!this.reusing && Intrinsics.areEqual(persistentCompositionLocalMapUpdateProviderMapGroup, persistentCompositionLocalMap)) {
                }
                if (z && !getInserting()) {
                    recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
                }
                this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
                this.providersInvalid = z;
                this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
                m3463startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m3480getGroupULZAiWs(), persistentCompositionLocalMapUpdateProviderMapGroup);
            }
            skipGroup();
            persistentCompositionLocalMapUpdateProviderMapGroup = persistentCompositionLocalMap;
        }
        z = false;
        if (z) {
            recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
        m3463startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m3480getGroupULZAiWs(), persistentCompositionLocalMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public final void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public final <T> T consume(CompositionLocal<T> p0) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), p0);
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            long compositeKeyHashCode = getCompositeKeyHashCode();
            boolean z = this.forceRecomposeScopes;
            boolean z2 = this.sourceMarkersEnabled;
            CompositionImpl composition = getComposition();
            if (!(composition instanceof CompositionImpl)) {
                composition = null;
            }
            CompositionContextHolder compositionContextHolder2 = new CompositionContextHolder(new CompositionContextImpl(compositeKeyHashCode, z, z2, composition != null ? composition.getObserverHolder() : null));
            updateValue(compositionContextHolder2);
            compositionContextHolder = compositionContextHolder2;
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    public final int getChangeCount$runtime() {
        return this.changes.getSize();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        ArrayList<T> arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.m3526isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m3527peekimpl(arrayList);
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
    }

    private final void startReaderGroup(boolean p0, Object p1) {
        if (p0) {
            this.reader.startNode();
            return;
        }
        if (p1 != null && this.reader.getGroupAux() != p1) {
            this.changeListWriter.updateAuxData(p1);
        }
        this.reader.startGroup();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7  */
    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m3463startBaiHCIY(int p0, Object p1, int p2, Object p3) {
        long jRotateLeft;
        boolean z;
        Pending pending;
        boolean z2;
        Pending pending2;
        int currentGroup;
        Pending pending3;
        Object empty = p1;
        validateNodeNotExpected();
        int i = this.rGroupIndex;
        if (empty == null) {
            if (p3 != null && p0 == 207 && !Intrinsics.areEqual(p3, Composer.INSTANCE.getEmpty())) {
                this.compositeKeyHashCode = ((long) i) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p3.hashCode()), 3);
            } else {
                jRotateLeft = ((long) i) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p0), 3);
            }
            if (empty == null) {
                this.rGroupIndex++;
            }
            if (p2 != GroupKind.INSTANCE.m3480getGroupULZAiWs()) {
                z = true;
            } else {
                z = false;
            }
            pending = null;
            if (getInserting()) {
                this.reader.beginEmpty();
                currentGroup = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(p0, Composer.INSTANCE.getEmpty());
                } else if (p3 != null) {
                    SlotWriter slotWriter = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter.startData(p0, empty, p3);
                } else {
                    SlotWriter slotWriter2 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter2.startGroup(p0, empty);
                }
                pending3 = this.pending;
                if (pending3 != null) {
                    KeyInfo keyInfo = new KeyInfo(p0, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                    pending3.registerInsert(keyInfo, this.nodeIndex - pending3.getStartIndex());
                    pending3.recordUsed(keyInfo);
                }
                enterGroup(z, null);
                return;
            }
            if (p2 == GroupKind.INSTANCE.m3481getNodeULZAiWs() || !this.reusing) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.pending == null) {
                int groupKey = this.reader.getGroupKey();
                if (z2 && groupKey == p0 && Intrinsics.areEqual(p1, this.reader.getGroupObjectKey())) {
                    startReaderGroup(z, p3);
                } else {
                    this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
                }
            }
            pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo next = pending2.getNext(p0, p1);
                if (z2 && next != null) {
                    pending2.recordUsed(next);
                    int location = next.getLocation();
                    this.nodeIndex = pending2.nodePositionOf(next) + pending2.getStartIndex();
                    int iSlotPositionOf = pending2.slotPositionOf(next);
                    int groupIndex = iSlotPositionOf - pending2.getGroupIndex();
                    pending2.registerMoveSlot(iSlotPositionOf, pending2.getGroupIndex());
                    this.changeListWriter.moveReaderRelativeTo(location);
                    this.reader.reposition(location);
                    if (groupIndex > 0) {
                        this.changeListWriter.moveCurrentGroup(groupIndex);
                    }
                    startReaderGroup(z, p3);
                } else {
                    this.reader.beginEmpty();
                    this.inserting = true;
                    this.providerCache = null;
                    ensureWriter();
                    this.writer.beginInsert();
                    int currentGroup2 = this.writer.getCurrentGroup();
                    if (z) {
                        this.writer.startNode(p0, Composer.INSTANCE.getEmpty());
                    } else if (p3 != null) {
                        SlotWriter slotWriter3 = this.writer;
                        if (empty == null) {
                            empty = Composer.INSTANCE.getEmpty();
                        }
                        slotWriter3.startData(p0, empty, p3);
                    } else {
                        SlotWriter slotWriter4 = this.writer;
                        if (empty == null) {
                            empty = Composer.INSTANCE.getEmpty();
                        }
                        slotWriter4.startGroup(p0, empty);
                    }
                    this.insertAnchor = this.writer.anchor(currentGroup2);
                    KeyInfo keyInfo2 = new KeyInfo(p0, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                    pending2.registerInsert(keyInfo2, this.nodeIndex - pending2.getStartIndex());
                    pending2.recordUsed(keyInfo2);
                    pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
                }
            }
            enterGroup(z, pending);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (empty instanceof Enum ? ((Enum) empty).ordinal() : p1.hashCode())), 3);
        this.compositeKeyHashCode = jRotateLeft;
        if (empty == null) {
            this.rGroupIndex++;
        }
        if (p2 != GroupKind.INSTANCE.m3480getGroupULZAiWs()) {
            z = true;
        } else {
            z = false;
        }
        pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(p0, Composer.INSTANCE.getEmpty());
            } else if (p3 != null) {
                SlotWriter slotWriter5 = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter5.startData(p0, empty, p3);
            } else {
                SlotWriter slotWriter6 = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter6.startGroup(p0, empty);
            }
            pending3 = this.pending;
            if (pending3 != null) {
                KeyInfo keyInfo3 = new KeyInfo(p0, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending3.registerInsert(keyInfo3, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo3);
            }
            enterGroup(z, null);
            return;
        }
        if (p2 == GroupKind.INSTANCE.m3481getNodeULZAiWs()) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (this.pending == null) {
            int groupKey2 = this.reader.getGroupKey();
            if (z2) {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        pending2 = this.pending;
        if (pending2 != null) {
            KeyInfo next2 = pending2.getNext(p0, p1);
            if (z2) {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup3 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(p0, Composer.INSTANCE.getEmpty());
                } else if (p3 != null) {
                    SlotWriter slotWriter7 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter7.startData(p0, empty, p3);
                } else {
                    SlotWriter slotWriter8 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter8.startGroup(p0, empty);
                }
                this.insertAnchor = this.writer.anchor(currentGroup3);
                KeyInfo keyInfo4 = new KeyInfo(p0, -1, insertedGroupVirtualIndex(currentGroup3), -1, 0);
                pending2.registerInsert(keyInfo4, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo4);
                pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup4 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(p0, Composer.INSTANCE.getEmpty());
                } else if (p3 != null) {
                    SlotWriter slotWriter9 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter9.startData(p0, empty, p3);
                } else {
                    SlotWriter slotWriter10 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter10.startGroup(p0, empty);
                }
                this.insertAnchor = this.writer.anchor(currentGroup4);
                KeyInfo keyInfo5 = new KeyInfo(p0, -1, insertedGroupVirtualIndex(currentGroup4), -1, 0);
                pending2.registerInsert(keyInfo5, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo5);
                pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        enterGroup(z, pending);
    }

    private final void enterGroup(boolean p0, Pending p1) {
        Stack.m3530pushimpl(this.pendingStack, this.pending);
        this.pending = p1;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (p0) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void exitGroup(int p0, boolean p1) {
        Pending pending = (Pending) Stack.m3529popimpl(this.pendingStack);
        if (pending != null && !p1) {
            pending.setGroupIndex(pending.getGroupIndex() + 1);
        }
        this.pending = pending;
        this.nodeIndex = this.parentStateStack.pop() + p0;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + p0;
    }

    private final void end(boolean p0) {
        long jRotateRight;
        long j;
        int remainingSlots;
        Set set;
        long jRotateRight2;
        long j2;
        int iPeek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iGroupKey = this.writer.groupKey(parent);
            Object objGroupObjectKey = this.writer.groupObjectKey(parent);
            Object objGroupAux = this.writer.groupAux(parent);
            if (objGroupObjectKey == null) {
                if (objGroupAux != null && iGroupKey == 207 && !Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) {
                    this.compositeKeyHashCode = Long.rotateRight(((long) objGroupAux.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3), 3);
                } else {
                    jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3);
                    j2 = iGroupKey;
                }
            } else {
                int iOrdinal = objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode(), 3);
                j2 = iOrdinal;
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iGroupKey2 = this.reader.groupKey(parent2);
            Object objGroupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object objGroupAux2 = this.reader.groupAux(parent2);
            if (objGroupObjectKey2 == null) {
                if (objGroupAux2 != null && iGroupKey2 == 207 && !Intrinsics.areEqual(objGroupAux2, Composer.INSTANCE.getEmpty())) {
                    this.compositeKeyHashCode = Long.rotateRight(((long) objGroupAux2.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3), 3);
                } else {
                    jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iPeek2), 3);
                    j = iGroupKey2;
                }
            } else {
                int iOrdinal2 = objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode(), 3);
                j = iOrdinal2;
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j, 3);
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i2 < size2) {
                KeyInfo keyInfo = keyInfos.get(i2);
                if (!setFastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    set = setFastToSet;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else {
                    set = setFastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i3 < size) {
                            KeyInfo keyInfo2 = used.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    this.changeListWriter.moveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                }
                            } else {
                                i2++;
                            }
                            i3++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                        } else {
                            used = used;
                        }
                    }
                    setFastToSet = set;
                    used = used;
                }
                used = used;
                i2++;
                setFastToSet = set;
                used = used;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i4 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i4, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        if (inserting) {
            if (p0) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (p0) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (p0) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void recomposeToGroupEnd() {
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.groupNodeCount;
        int i3 = this.rGroupIndex;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        boolean z2 = false;
        int i4 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            RecomposeScopeImpl scope = invalidationFirstInRange.getScope();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i4, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                this.compositeKeyHashCode = compositeKeyOf(this.reader.parent(currentGroup), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                z2 = true;
                i4 = currentGroup;
            } else {
                Stack.m3530pushimpl(this.invalidateStack, scope);
                CompositionObserver compositionObserverCurrent = this.observerHolder.current();
                if (compositionObserverCurrent != null) {
                    try {
                        compositionObserverCurrent.onScopeEnter(scope);
                        scope.rereadTrackedInstances();
                        compositionObserverCurrent.onScopeExit(scope);
                    } catch (Throwable th) {
                        compositionObserverCurrent.onScopeExit(scope);
                        throw th;
                    }
                } else {
                    scope.rereadTrackedInstances();
                }
                Stack.m3529popimpl(this.invalidateStack);
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z2) {
            recordUpsAndDowns(i4, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + iUpdatedNodeCount;
            this.groupNodeCount = i2 + iUpdatedNodeCount;
            this.rGroupIndex = i3;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = z;
    }

    private final void updateNodeCountOverrides(int p0, int p1) {
        int iUpdatedNodeCount = updatedNodeCount(p0);
        if (iUpdatedNodeCount != p1) {
            int iM3523getSizeimpl = Stack.m3523getSizeimpl(this.pendingStack) - 1;
            while (p0 != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(p0) + (p1 - iUpdatedNodeCount);
                updateNodeCount(p0, iUpdatedNodeCount2);
                for (int i = iM3523getSizeimpl; i >= 0; i--) {
                    Pending pending = (Pending) Stack.m3528peekimpl(this.pendingStack, i);
                    if (pending != null && pending.updateNodeCount(p0, iUpdatedNodeCount2)) {
                        iM3523getSizeimpl = i - 1;
                        break;
                    }
                }
                if (p0 < 0) {
                    p0 = this.reader.getParent();
                } else if (this.reader.isNode(p0)) {
                    return;
                } else {
                    p0 = this.reader.parent(p0);
                }
            }
        }
    }

    private final int nodeIndexOf(int p0, int p1, int p2, int p3) {
        int iParent = this.reader.parent(p1);
        while (iParent != p2 && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            p3 = 0;
        }
        if (iParent == p1) {
            return p3;
        }
        int iUpdatedNodeCount = updatedNodeCount(iParent);
        int iNodeCount = this.reader.nodeCount(p1);
        int iUpdatedNodeCount2 = p3;
        loop1: while (iUpdatedNodeCount2 < (iUpdatedNodeCount - iNodeCount) + p3 && iParent != p0) {
            iParent++;
            while (iParent < p0) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (p0 >= iGroupSize) {
                    iUpdatedNodeCount2 += this.reader.isNode(iParent) ? 1 : updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
        }
        return iUpdatedNodeCount2;
    }

    private final int rGroupIndexOf(int p0) {
        int iParent = this.reader.parent(p0) + 1;
        int i = 0;
        while (iParent < p0) {
            if (!this.reader.hasObjectKey(iParent)) {
                i++;
            }
            iParent += this.reader.groupSize(iParent);
        }
        return i;
    }

    private final int updatedNodeCount(int p0) {
        int i;
        if (p0 < 0) {
            MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
            if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(p0)) {
                return 0;
            }
            return mutableIntIntMap.get(p0);
        }
        int[] iArr = this.nodeCountOverrides;
        return (iArr == null || (i = iArr[p0]) < 0) ? this.reader.nodeCount(p0) : i;
    }

    private final void updateNodeCount(int p0, int p1) {
        if (updatedNodeCount(p0) != p1) {
            if (p0 < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(p0, p1);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                ArraysKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[p0] = p1;
        }
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int p0, int p1, int p2) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, p0, p1, p2);
        while (p0 > 0 && p0 != iNearestCommonRootOf) {
            if (slotReader.isNode(p0)) {
                this.changeListWriter.moveUp();
            }
            p0 = slotReader.parent(p0);
        }
        doRecordDownsFor(p1, iNearestCommonRootOf);
    }

    private final void doRecordDownsFor(int p0, int p1) {
        if (p0 <= 0 || p0 == p1) {
            return;
        }
        doRecordDownsFor(this.reader.parent(p0), p1);
        if (this.reader.isNode(p0)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, p0));
        }
    }

    private final int groupCompositeKeyPart(SlotReader slotReader, int i) {
        Object objGroupAux;
        if (slotReader.hasObjectKey(i)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i);
            if (objGroupObjectKey == null) {
                return 0;
            }
            if (objGroupObjectKey instanceof Enum) {
                return ((Enum) objGroupObjectKey).ordinal();
            }
            return objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
        }
        int iGroupKey = slotReader.groupKey(i);
        return (iGroupKey != 207 || (objGroupAux = slotReader.groupAux(i)) == null || Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) ? iGroupKey : objGroupAux.hashCode();
    }

    public final boolean tryImminentInvalidation$runtime(RecomposeScopeImpl p0, Object p1) {
        Anchor anchor = p0.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, p0, p1);
        return true;
    }

    public final int parentKey$runtime() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void skipCurrentGroup() {
        long jRotateLeft;
        long j;
        long jRotateLeft2;
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        int i = this.rGroupIndex;
        if (groupObjectKey == null) {
            if (groupAux == null || groupKey != 207 || Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
                jRotateLeft2 = Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) groupKey);
            } else {
                jRotateLeft2 = Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) groupAux.hashCode());
            }
            jRotateLeft = Long.rotateLeft(jRotateLeft2, 3);
            j = i;
        } else {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode())), 3);
            j = 0;
        }
        this.compositeKeyHashCode = jRotateLeft ^ j;
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        if (groupObjectKey != null) {
            if (groupObjectKey instanceof Enum) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((long) ((Enum) groupObjectKey).ordinal()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((long) groupObjectKey.hashCode()), 3);
                return;
            }
        }
        if (groupAux == null || groupKey != 207 || Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
            this.compositeKeyHashCode = Long.rotateRight(((long) groupKey) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3) ^ ((long) groupAux.hashCode()), 3);
        }
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final boolean shouldExecute(boolean p0, int p1) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((p1 & 1) != 0 || (!getInserting() && !this.reusing)) {
            return p0 || !getSkipping();
        }
        ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
        if (shouldPauseCallback == null || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || !shouldPauseCallback.shouldPause() || currentRecomposeScope$runtime.getResuming()) {
            return true;
        }
        currentRecomposeScope$runtime.setUsed(true);
        currentRecomposeScope$runtime.setReusing(this.reusing);
        currentRecomposeScope$runtime.setPaused(true);
        this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime);
        this.parentContext.reportPausedScope$runtime(currentRecomposeScope$runtime);
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void skipToGroupEnd() {
        if (this.groupNodeCount != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void deactivateToEndGroup(boolean p0) {
        if (this.groupNodeCount != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!p0) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final Composer startRestartGroup(int p0) {
        startReplaceGroup(p0);
        addRecomposeScope();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (!getInserting()) {
            Invalidation invalidationRemoveLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
            Object next = this.reader.next();
            if (Intrinsics.areEqual(next, Composer.INSTANCE.getEmpty())) {
                CompositionImpl composition = getComposition();
                Intrinsics.checkNotNull(composition, "");
                recomposeScopeImpl = new RecomposeScopeImpl(composition);
                updateValue(recomposeScopeImpl);
            } else {
                Intrinsics.checkNotNull(next, "");
                recomposeScopeImpl = (RecomposeScopeImpl) next;
            }
            if (invalidationRemoveLocation != null) {
                z = true;
            } else {
                boolean forcedRecompose = recomposeScopeImpl.getForcedRecompose();
                if (forcedRecompose) {
                    recomposeScopeImpl.setForcedRecompose(false);
                }
                if (forcedRecompose) {
                    z = true;
                } else {
                    z = false;
                }
            }
            recomposeScopeImpl.setRequiresRecompose(z);
            Stack.m3530pushimpl(this.invalidateStack, recomposeScopeImpl);
            enterRecomposeScope(recomposeScopeImpl);
            if (recomposeScopeImpl.getPaused()) {
                recomposeScopeImpl.setPaused(false);
                recomposeScopeImpl.setResuming(true);
                this.changeListWriter.startResumingScope(recomposeScopeImpl);
                if (this.reusing || !recomposeScopeImpl.getReusing()) {
                    return;
                }
                this.reusing = true;
                recomposeScopeImpl.setResetReusing(true);
                return;
            }
            return;
        }
        CompositionImpl composition2 = getComposition();
        Intrinsics.checkNotNull(composition2, "");
        RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl(composition2);
        Stack.m3530pushimpl(this.invalidateStack, recomposeScopeImpl2);
        updateValue(recomposeScopeImpl2);
        enterRecomposeScope(recomposeScopeImpl2);
    }

    private final void enterRecomposeScope(RecomposeScopeImpl p0) {
        p0.start(this.compositionToken);
        CompositionObserver compositionObserverCurrent = this.observerHolder.current();
        if (compositionObserverCurrent != null) {
            compositionObserverCurrent.onScopeEnter(p0);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m3526isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m3529popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            Function1<Composition, Unit> function1ExitRecomposeScope = exitRecomposeScope(recomposeScopeImpl2);
            if (function1ExitRecomposeScope != null) {
                this.changeListWriter.endCompositionScope(function1ExitRecomposeScope, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
                recomposeScopeImpl2.setReusing(false);
                if (recomposeScopeImpl2.getResetReusing()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    this.reusing = false;
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    private final Function1<Composition, Unit> exitRecomposeScope(RecomposeScopeImpl p0) {
        CompositionObserver compositionObserverCurrent = this.observerHolder.current();
        if (compositionObserverCurrent != null) {
            compositionObserverCurrent.onScopeExit(p0);
        }
        return p0.end(this.compositionToken);
    }

    @Override // androidx.compose.runtime.Composer
    public final void insertMovableContent(MovableContent<?> p0, Object p1) {
        Intrinsics.checkNotNull(p0, "");
        invokeMovableContentLambda(p0, currentCompositionLocalScope(), p1, false);
    }

    private final void invokeMovableContentLambda(final MovableContent<Object> p0, PersistentCompositionLocalMap p1, final Object p2, boolean p3) {
        startMovableGroup(MovableContentKt.movableContentKey, p0);
        updateSlot(p2);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345L;
            boolean z = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.getGroupAux(), p1)) {
                z = true;
            }
            if (z) {
                recordProviderUpdate(p1);
            }
            m3463startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m3480getGroupULZAiWs(), p1);
            this.providerCache = null;
            if (getInserting() && !p3) {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime(new MovableContentStateReference(p0, p2, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt.emptyList(), currentCompositionLocalScope(), null));
            } else {
                boolean z2 = this.providersInvalid;
                this.providersInvalid = z;
                Expect_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
                        }
                        p0.getContent().invoke(p2, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z2;
            }
            endGroup();
            this.providerCache = null;
            this.compositeKeyHashCode = compositeKeyHashCode;
            endMovableGroup();
        } catch (Throwable th) {
            try {
                throw ComposeStackTraceKt.attachComposeStackTrace(th, new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f$0.currentStackTrace();
                    }
                });
            } catch (Throwable th2) {
                endGroup();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                endMovableGroup();
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> p0) {
        try {
            insertMovableContentGuarded(p0);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> p0) throws Throwable {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        SlotTable slotTable;
        Anchor anchor;
        ChangeList changeList2;
        ComposerChangeListWriter composerChangeListWriter2;
        SlotTable slotTable2;
        SlotReader slotReader;
        List<Pair<MovableContentStateReference, MovableContentStateReference>> list = p0;
        ComposerChangeListWriter composerChangeListWriter3 = this.changeListWriter;
        ChangeList changeList3 = this.lateChanges;
        ChangeList changeList4 = composerChangeListWriter3.getChangeList();
        try {
            composerChangeListWriter3.setChangeList(changeList3);
            this.changeListWriter.resetSlots();
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                try {
                    Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i2);
                    final MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                    MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                    Anchor anchor2 = movableContentStateReferenceComponent1.getAnchor();
                    int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable().anchorIndex(anchor2);
                    IntRef intRef = new IntRef(i, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor2);
                    if (movableContentStateReferenceComponent2 == null) {
                        if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable().openReader();
                        try {
                            slotReaderOpenReader.reposition(iAnchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(iAnchorIndex);
                            final ChangeList changeList5 = new ChangeList();
                            slotReader = slotReaderOpenReader;
                            try {
                                recomposeMovableContent$default(this, null, null, null, null, new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ComposerImpl.insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33(this.f$0, changeList5, slotReaderOpenReader, movableContentStateReferenceComponent1);
                                    }
                                }, 15, null);
                                this.changeListWriter.includeOperationsIn(changeList5, intRef);
                                Unit unit = Unit.INSTANCE;
                                slotReader.close();
                            } catch (Throwable th) {
                                th = th;
                                slotReader.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader = slotReaderOpenReader;
                        }
                    } else {
                        MovableContentState movableContentStateMovableContentStateResolve$runtime = this.parentContext.movableContentStateResolve$runtime(movableContentStateReferenceComponent2);
                        if (movableContentStateMovableContentStateResolve$runtime == null || (slotTable = movableContentStateMovableContentStateResolve$runtime.getSlotTable()) == null) {
                            slotTable = movableContentStateReferenceComponent2.getSlotTable();
                        }
                        if (movableContentStateMovableContentStateResolve$runtime == null || (slotTable2 = movableContentStateMovableContentStateResolve$runtime.getSlotTable()) == null || (anchor = slotTable2.anchor(0)) == null) {
                            anchor = movableContentStateReferenceComponent2.getAnchor();
                        }
                        List<? extends Object> listCollectNodesFrom = ComposerKt.collectNodesFrom(slotTable, anchor);
                        if (!listCollectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(listCollectNodesFrom, intRef);
                            if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.slotTable)) {
                                int iAnchorIndex2 = this.slotTable.anchorIndex(anchor2);
                                updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateMovableContentStateResolve$runtime, this.parentContext, movableContentStateReferenceComponent2, movableContentStateReferenceComponent1);
                        SlotReader slotReaderOpenReader2 = slotTable.openReader();
                        try {
                            SlotReader slotReader2 = this.reader;
                            int[] iArr = this.nodeCountOverrides;
                            MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = slotReaderOpenReader2;
                                int iAnchorIndex3 = slotTable.anchorIndex(anchor);
                                slotReaderOpenReader2.reposition(iAnchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(iAnchorIndex3);
                                ChangeList changeList6 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
                                ChangeList changeList7 = composerChangeListWriter4.getChangeList();
                                try {
                                    composerChangeListWriter4.setChangeList(changeList6);
                                    ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                    try {
                                        boolean implicitRootStart = composerChangeListWriter5.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter5.setImplicitRootStart(false);
                                            movableContentStateReferenceComponent2.transferPendingInvalidations$runtime();
                                            ControlledComposition composition = movableContentStateReferenceComponent2.getComposition();
                                            ControlledComposition composition2 = movableContentStateReferenceComponent1.getComposition();
                                            int currentGroup = slotReaderOpenReader2.getCurrentGroup();
                                            changeList2 = changeList7;
                                            slotReaderOpenReader2 = slotReaderOpenReader2;
                                            composerChangeListWriter2 = composerChangeListWriter4;
                                            iArr = iArr;
                                            try {
                                                recomposeMovableContent(composition, composition2, Integer.valueOf(currentGroup), movableContentStateReferenceComponent2.getInvalidations$runtime(), new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ComposerImpl.insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(this.f$0, movableContentStateReferenceComponent1);
                                                    }
                                                });
                                                try {
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    try {
                                                        composerChangeListWriter2.setChangeList(changeList2);
                                                        this.changeListWriter.includeOperationsIn(changeList6, intRef);
                                                        Unit unit2 = Unit.INSTANCE;
                                                        try {
                                                            this.reader = slotReader2;
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = mutableIntObjectMap;
                                                            Unit unit3 = Unit.INSTANCE;
                                                            slotReaderOpenReader2.close();
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            slotReaderOpenReader2.close();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        mutableIntObjectMap = mutableIntObjectMap;
                                                        this.reader = slotReader2;
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = mutableIntObjectMap;
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    mutableIntObjectMap = mutableIntObjectMap;
                                                    try {
                                                        composerChangeListWriter2.setChangeList(changeList2);
                                                        throw th;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        this.reader = slotReader2;
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = mutableIntObjectMap;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                mutableIntObjectMap = mutableIntObjectMap;
                                                try {
                                                    composerChangeListWriter5.setImplicitRootStart(implicitRootStart);
                                                    throw th;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    composerChangeListWriter2.setChangeList(changeList2);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            mutableIntObjectMap = mutableIntObjectMap;
                                            iArr = iArr;
                                            slotReaderOpenReader2 = slotReaderOpenReader2;
                                            changeList2 = changeList7;
                                            composerChangeListWriter2 = composerChangeListWriter4;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        changeList2 = changeList7;
                                        composerChangeListWriter2 = composerChangeListWriter4;
                                        composerChangeListWriter2.setChangeList(changeList2);
                                        throw th;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                mutableIntObjectMap = mutableIntObjectMap;
                                iArr = iArr;
                                slotReaderOpenReader2 = slotReaderOpenReader2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            slotReaderOpenReader2 = slotReaderOpenReader2;
                        }
                    }
                    try {
                        this.changeListWriter.skipToEndOfCurrentGroup();
                        i2++;
                        list = p0;
                        size = size;
                        composerChangeListWriter3 = composerChangeListWriter3;
                        changeList4 = changeList4;
                        i = 0;
                    } catch (Throwable th14) {
                        th = th14;
                        composerChangeListWriter = composerChangeListWriter3;
                        changeList = changeList4;
                        composerChangeListWriter.setChangeList(changeList);
                        throw th;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    composerChangeListWriter3 = composerChangeListWriter3;
                    changeList4 = changeList4;
                }
            }
            ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter3;
            ChangeList changeList8 = changeList4;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter6.setChangeList(changeList8);
        } catch (Throwable th16) {
            th = th16;
            composerChangeListWriter = composerChangeListWriter3;
            changeList = changeList4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        ComposerChangeListWriter composerChangeListWriter = composerImpl.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader slotReader2 = composerImpl.reader;
            int[] iArr = composerImpl.nodeCountOverrides;
            MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = composerImpl.providerUpdates;
            composerImpl.nodeCountOverrides = null;
            composerImpl.providerUpdates = null;
            try {
                composerImpl.reader = slotReader;
                ComposerChangeListWriter composerChangeListWriter2 = composerImpl.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    Unit unit = Unit.INSTANCE;
                    composerImpl.reader = slotReader2;
                    composerImpl.nodeCountOverrides = iArr;
                    composerImpl.providerUpdates = mutableIntObjectMap;
                    composerChangeListWriter.setChangeList(changeList2);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    throw th;
                }
            } catch (Throwable th2) {
                composerImpl.reader = slotReader2;
                composerImpl.nodeCountOverrides = iArr;
                composerImpl.providerUpdates = mutableIntObjectMap;
                throw th2;
            }
        } catch (Throwable th3) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
        return Unit.INSTANCE;
    }

    private final <R> R withReader(SlotReader p0, Function0<? extends R> p1) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        MutableIntObjectMap<PersistentCompositionLocalMap> mutableIntObjectMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            this.reader = p0;
            return p1.invoke();
        } finally {
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
            this.providerUpdates = mutableIntObjectMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i, Object obj) {
        ControlledComposition controlledComposition3 = (i & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:9:0x002d, B:8:0x0029, B:12:0x0034, B:14:0x003a, B:16:0x0040), top: B:22:0x0005 }] */
    private final <R> R recomposeMovableContent(ControlledComposition p0, ControlledComposition p1, Integer p2, List<? extends Pair<RecomposeScopeImpl, ? extends Object>> p3, Function0<? extends R> p4) {
        R rInvoke;
        boolean z = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = p3.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<RecomposeScopeImpl, ? extends Object> pair = p3.get(i2);
                RecomposeScopeImpl recomposeScopeImplComponent1 = pair.component1();
                Object objComponent2 = pair.component2();
                if (objComponent2 != null) {
                    tryImminentInvalidation$runtime(recomposeScopeImplComponent1, objComponent2);
                } else {
                    tryImminentInvalidation$runtime(recomposeScopeImplComponent1, null);
                }
            }
            if (p0 == null) {
                rInvoke = p4.invoke();
            } else {
                rInvoke = (R) p0.delegateInvalidations(p1, p2 != null ? p2.intValue() : -1, p4);
                if (rInvoke == null) {
                    rInvoke = p4.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.isComposing = z;
            this.nodeIndex = i;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void sourceInformation(String p0) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGroupSourceInformation(p0);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void sourceInformationMarkerStart(int p0, String p1) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(p0, p1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public final void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void disableSourceInformation() {
        this.sourceMarkersEnabled = false;
    }

    public final List<ComposeStackTraceFrame> stackTraceForValue$runtime(final Object p0) {
        List<ComposeStackTraceFrame> listPlus;
        if (!this.sourceMarkersEnabled) {
            return CollectionsKt.emptyList();
        }
        ObjectLocation objectLocationFindLocation = ComposeStackTraceBuilderKt.findLocation(this.slotTable, new Function1() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ComposerImpl.stackTraceForValue$lambda$43(p0, obj));
            }
        });
        return (objectLocationFindLocation == null || (listPlus = CollectionsKt.plus((Collection) stackTraceForGroup(objectLocationFindLocation.getGroup(), objectLocationFindLocation.getDataOffset()), (Iterable) parentStackTrace())) == null) ? CollectionsKt.emptyList() : listPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stackTraceForValue$lambda$43(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        RememberObserverHolder rememberObserverHolder = obj2 instanceof RememberObserverHolder ? (RememberObserverHolder) obj2 : null;
        return (rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null) == obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComposeStackTraceFrame> currentStackTrace() {
        if (!this.sourceMarkersEnabled) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ComposeStackTraceBuilderKt.buildTrace$default(this.writer, null, 0, null, 7, null));
        arrayList.addAll(ComposeStackTraceBuilderKt.buildTrace(this.reader));
        arrayList.addAll(parentStackTrace());
        return arrayList;
    }

    private final List<ComposeStackTraceFrame> stackTraceForGroup(int p0, Integer p1) {
        if (!this.sourceMarkersEnabled) {
            return CollectionsKt.emptyList();
        }
        SlotReader slotReaderOpenReader = this.slotTable.openReader();
        try {
            return ComposeStackTraceBuilderKt.traceForGroup(slotReaderOpenReader, p0, p1);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public final List<ComposeStackTraceFrame> parentStackTrace() {
        Composition composition$runtime = this.parentContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime instanceof CompositionImpl ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl == null) {
            return CollectionsKt.emptyList();
        }
        Integer numFindSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(compositionImpl.getSlotTable(), this.parentContext);
        if (numFindSubcompositionContextGroup == null) {
            return CollectionsKt.emptyList();
        }
        SlotReader slotReaderOpenReader = compositionImpl.getSlotTable().openReader();
        try {
            return ComposeStackTraceBuilderKt.traceForGroup(slotReaderOpenReader, numFindSubcompositionContextGroup.intValue(), 0);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    /* JADX INFO: renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public final void m3464composeContentZbOJvo$runtime(MutableScatterMap<Object, Object> p0, Function2<? super Composer, ? super Integer, Unit> p1, ShouldPauseCallback p2) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = p2;
        try {
            m3462doComposeaFTiNEg(p0, p1);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    public final void prepareCompose$runtime(Function0<Unit> p0) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            p0.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* JADX INFO: renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public final boolean m3465recomposeaFTiNEg$runtime(MutableScatterMap<Object, Object> p0, ShouldPauseCallback p1) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m3642getSizeimpl(p0) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = p1;
        try {
            m3462doComposeaFTiNEg(p0, null);
            return this.changes.isNotEmpty();
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[LOOP:1: B:16:0x004c->B:31:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[EDGE_INSN: B:39:0x00a3->B:32:0x00a3 BREAK  A[LOOP:1: B:16:0x004c->B:31:0x00a0], SYNTHETIC] */
    /* JADX INFO: renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    public final void m3466updateComposerInvalidationsRY85e9Y(MutableScatterMap<Object, Object> p0) {
        for (int lastIndex = CollectionsKt.getLastIndex(this.invalidations); lastIndex >= 0; lastIndex--) {
            Invalidation invalidation = this.invalidations.get(lastIndex);
            Anchor anchor = invalidation.getScope().getAnchor();
            if (anchor != null && anchor.getValid()) {
                if (invalidation.getLocation() != anchor.getLocation()) {
                    invalidation.setLocation(anchor.getLocation());
                }
            } else {
                this.invalidations.remove(lastIndex);
            }
        }
        MutableScatterMap<Object, Object> mutableScatterMap = p0;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            Intrinsics.checkNotNull(obj, "");
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            Anchor anchor2 = recomposeScopeImpl.getAnchor();
                            if (anchor2 != null) {
                                int location = anchor2.getLocation();
                                List<Invalidation> list = this.invalidations;
                                if (obj2 == ScopeInvalidated.INSTANCE) {
                                    obj2 = null;
                                }
                                list.add(new Invalidation(recomposeScopeImpl, location, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        CollectionsKt.sortWith(this.invalidations, ComposerKt.InvalidationLocationAscending);
    }

    /* JADX INFO: renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m3462doComposeaFTiNEg(MutableScatterMap<Object, Object> p0, Function2<? super Composer, ? super Integer, Unit> p1) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        CompositionObserver compositionObserverCurrent = this.observerHolder.current();
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            m3466updateComposerInvalidationsRY85e9Y(p0);
            this.nodeIndex = 0;
            this.isComposing = true;
            if (compositionObserverCurrent != null) {
                compositionObserverCurrent.onBeginComposition(getComposition());
            }
            try {
                startRoot();
                Object objNextSlot = nextSlot();
                if (objNextSlot != p1 && p1 != null) {
                    updateValue(p1);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVectorDerivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (p1 != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, p1);
                        endGroup();
                    } else if ((this.forciblyRecompose || this.providersInvalid) && objNextSlot != null && !Intrinsics.areEqual(objNextSlot, Composer.INSTANCE.getEmpty())) {
                        startGroup(200, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNextSlot, 2));
                        endGroup();
                    } else {
                        skipCurrentGroup();
                    }
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    endRoot();
                    if (compositionObserverCurrent != null) {
                        compositionObserverCurrent.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th) {
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw ComposeStackTraceKt.attachComposeStackTrace(th2, new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f$0.currentStackTrace();
                        }
                    });
                } catch (Throwable th3) {
                    if (compositionObserverCurrent != null) {
                        compositionObserverCurrent.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    this.invalidations.clear();
                    abortRoot();
                    createFreshInsertTable();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th4;
        }
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void recordInsert(Anchor p0) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(p0, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(p0, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(ComposerImpl composerImpl, int i, List<MovableContentStateReference> list) {
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i);
        Intrinsics.checkNotNull(objGroupObjectKey, "");
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet = composerImpl.reader.groupGet(i, 0);
        Anchor anchor = composerImpl.reader.anchor(i);
        int iGroupSize = composerImpl.reader.groupSize(i);
        ArrayList arrayList = new ArrayList();
        List<Invalidation> list2 = composerImpl.invalidations;
        for (int iFindInsertLocation = ComposerKt.findInsertLocation(list2, i); iFindInsertLocation < list2.size(); iFindInsertLocation++) {
            Invalidation invalidation = list2.get(iFindInsertLocation);
            if (invalidation.getLocation() >= iGroupSize + i) {
                break;
            }
            arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, objGroupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(ComposerImpl composerImpl, int i) {
        int iGroupKey = composerImpl.reader.groupKey(i);
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i);
        ArrayList arrayList = null;
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof MovableContent)) {
            return null;
        }
        if (composerImpl.reader.containsMark(i)) {
            ArrayList arrayList2 = new ArrayList();
            reportFreeMovableContent$movableContentReferenceFor$traverseGroups(composerImpl, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(composerImpl, i, arrayList);
    }

    private static final void reportFreeMovableContent$movableContentReferenceFor$traverseGroups(ComposerImpl composerImpl, List<MovableContentStateReference> list, int i) {
        int iGroupSize = composerImpl.reader.groupSize(i);
        int iGroupSize2 = i + 1;
        while (iGroupSize2 < iGroupSize + i) {
            if (composerImpl.reader.hasMark(iGroupSize2)) {
                MovableContentStateReference movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, iGroupSize2);
                if (movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor != null) {
                    list.add(movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
                }
            } else if (composerImpl.reader.containsMark(iGroupSize2)) {
                reportFreeMovableContent$movableContentReferenceFor$traverseGroups(composerImpl, list, iGroupSize2);
            }
            iGroupSize2 += composerImpl.reader.groupSize(iGroupSize2);
        }
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i2)) {
            int iGroupKey = slotReader.groupKey(i2);
            Object objGroupObjectKey = slotReader.groupObjectKey(i2);
            if (iGroupKey == 126665345 && (objGroupObjectKey instanceof MovableContent)) {
                MovableContentStateReference movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, i2);
                if (movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor != null) {
                    composerImpl.parentContext.deletedMovableContent$runtime(movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
                    composerImpl.changeListWriter.recordSlotEditing();
                    composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReferenceReportFreeMovableContent$movableContentReferenceFor);
                }
                if (z && i2 != i) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i3, i2);
                    return 0;
                }
                return slotReader.nodeCount(i2);
            }
            if (iGroupKey == 206 && Intrinsics.areEqual(objGroupObjectKey, ComposerKt.getReference())) {
                Object objGroupGet = slotReader.groupGet(i2, 0);
                CompositionContextHolder compositionContextHolder = objGroupGet instanceof CompositionContextHolder ? (CompositionContextHolder) objGroupGet : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i2);
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return slotReader.nodeCount(i2);
        }
        if (slotReader.containsMark(i2)) {
            int iGroupSize = slotReader.groupSize(i2);
            int iReportFreeMovableContent$reportGroup = 0;
            for (int iGroupSize2 = i2 + 1; iGroupSize2 < iGroupSize + i2; iGroupSize2 += slotReader.groupSize(iGroupSize2)) {
                boolean zIsNode = slotReader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, i, iGroupSize2, zIsNode || z, zIsNode ? 0 : i3 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return iReportFreeMovableContent$reportGroup;
        }
        if (slotReader.isNode(i2)) {
            return 1;
        }
        return slotReader.nodeCount(i2);
    }

    private final void reportFreeMovableContent(int p0) {
        boolean zIsNode = this.reader.isNode(p0);
        if (zIsNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(p0));
        }
        reportFreeMovableContent$reportGroup(this, p0, p0, zIsNode, 0);
        this.changeListWriter.endNodeMovement();
        if (zIsNode) {
            this.changeListWriter.moveUp();
        }
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            getComposition().updateMovingInvalidations$runtime();
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    Unit unit = Unit.INSTANCE;
                    slotReaderOpenReader.close();
                } catch (Throwable th) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th;
                }
            } catch (Throwable th2) {
                slotReaderOpenReader.close();
                throw th2;
            }
        }
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m3525isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m3518clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    public final void verifyConsistent$runtime() {
        this.insertTable.verifyWellFormed();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00060\u0002R\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "p0", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "", "onRemembered", "()V", "onAbandoned", "onForgotten", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        public static final int $stable = 8;
        private final CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public final void onRemembered() {
        }

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onForgotten() {
            this.ref.dispose();
        }
    }

    @Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00132\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\f0\u001a¢\u0006\u0002\b\u001bH\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u001e2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\f0\u001a¢\u0006\u0002\b\u001bH\u0011¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u001e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0011¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0013H\u0010¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0017H\u0010¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010'\u001a\u00020&H\u0011¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020,0+H\u0010¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0010¢\u0006\u0004\b/\u0010\u000eJ\u000f\u00100\u001a\u00020\fH\u0010¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00102\u001a\u00020\f2\u0006\u0010\u0004\u001a\u000201H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\f2\u0006\u0010\u0004\u001a\u000201H\u0010¢\u0006\u0004\b4\u00103J\u0019\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u0004\u001a\u000201H\u0010¢\u0006\u0004\b6\u00107J+\u00109\u001a\u00020\f2\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u0006\u001a\u0002052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u000308H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0013H\u0010¢\u0006\u0004\b;\u0010\u0015R\u001e\u0010<\u001a\u00060\u0002j\u0002`\u00038\u0011X\u0091\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001c\u0010F\u001a\u0004\u0018\u00010\b8\u0011X\u0091\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR0\u0010J\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0018\u00010+8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010.R \u0010P\u001a\b\u0012\u0004\u0012\u00020O0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010MR\u0014\u0010S\u001a\u00020\u00058QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bR\u0010CR\u0014\u0010W\u001a\u00020T8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010Z\u001a\u00020T8QX\u0090\u0004¢\u0006\f\u0012\u0004\bY\u0010\u000e\u001a\u0004\bX\u0010VR+\u0010_\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020&8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010(\"\u0004\b^\u0010*R\u0014\u0010c\u001a\u00020`8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "p0", "", "p1", "p2", "Landroidx/compose/runtime/CompositionObserverHolder;", "p3", "<init>", "(Landroidx/compose/runtime/ComposerImpl;JZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "", "dispose", "()V", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "unregisterComposer$runtime", "Landroidx/compose/runtime/ControlledComposition;", "registerComposition$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "unregisterComposition$runtime", "Landroidx/compose/runtime/RecomposeScopeImpl;", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/collection/ScatterSet;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "invalidate$runtime", "invalidateScope$runtime", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "updateCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "startComposing$runtime", "doneComposing$runtime", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "deletedMovableContent$runtime", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/Applier;", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "reportRemovedComposition$runtime", "compositeKeyHashCode", "J", "getCompositeKeyHashCode$runtime", "()J", "collectingParameterInformation", "Z", "getCollectingParameterInformation$runtime", "()Z", "collectingSourceInformation", "getCollectingSourceInformation$runtime", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime", "getRecomposeCoroutineContext$runtime$annotations", "recomposeCoroutineContext", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompositionLocalScope", "setCompositionLocalScope", "compositionLocalScope", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "composition"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final long compositeKeyHashCode;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        private final MutableState compositionLocalScope = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime$annotations() {
        }

        public CompositionContextImpl(long j, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCompositeKeyHashCode$runtime, reason: from getter */
        public final long getCompositeKeyHashCode() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingParameterInformation$runtime, reason: from getter */
        public final boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingSourceInformation$runtime, reason: from getter */
        public final boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getObserverHolder$runtime, reason: from getter */
        public final CompositionObserverHolder getObserverHolder() {
            return this.observerHolder;
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingCallByInformation$runtime() {
            return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime();
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposer$runtime(Composer p0) {
            Intrinsics.checkNotNull(p0, "");
            super.registerComposer$runtime((ComposerImpl) p0);
            this.composers.add(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposer$runtime(Composer p0) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    Intrinsics.checkNotNull(p0, "");
                    set2.remove(((ComposerImpl) p0).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposition$runtime(ControlledComposition p0) {
            ComposerImpl.this.parentContext.registerComposition$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposition$runtime(ControlledComposition p0) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportPausedScope$runtime(RecomposeScopeImpl p0) {
            ComposerImpl.this.parentContext.reportPausedScope$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final CoroutineContext getRecomposeCoroutineContext$runtime() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void composeInitial$runtime(ControlledComposition p0, Function2<? super Composer, ? super Integer, Unit> p1) {
            ComposerImpl.this.parentContext.composeInitial$runtime(p0, p1);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition p0, ShouldPauseCallback p1, Function2<? super Composer, ? super Integer, Unit> p2) {
            return ComposerImpl.this.parentContext.composeInitialPaused$runtime(p0, p1, p2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition p0, ShouldPauseCallback p1, ScatterSet<RecomposeScopeImpl> p2) {
            return ComposerImpl.this.parentContext.recomposePaused$runtime(p0, p1, p2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidate$runtime(ControlledComposition p0) {
            ComposerImpl.this.parentContext.invalidate$runtime(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidateScope$runtime(RecomposeScopeImpl p0) {
            ComposerImpl.this.parentContext.invalidateScope$runtime(p0);
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap p0) {
            setCompositionLocalScope(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void recordInspectionTable$runtime(Set<CompositionData> p0) {
            HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void startComposing$runtime() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void doneComposing$runtime() {
            ComposerImpl.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void insertMovableContent$runtime(MovableContentStateReference p0) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void deletedMovableContent$runtime(MovableContentStateReference p0) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final MovableContentState movableContentStateResolve$runtime(MovableContentStateReference p0) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void movableContentStateReleased$runtime(MovableContentStateReference p0, MovableContentState p1, Applier<?> p2) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime(p0, p1, p2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportRemovedComposition$runtime(ControlledComposition p0) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime(p0);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final Composition getComposition$runtime() {
            return ComposerImpl.this.getComposition();
        }
    }

    private final void updateCompositeKeyWhenWeEnterGroup(int p0, int p1, Object p2, Object p3) {
        if (p2 == null) {
            if (p3 != null && p0 == 207 && !Intrinsics.areEqual(p3, Composer.INSTANCE.getEmpty())) {
                this.compositeKeyHashCode = ((long) p1) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p3.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = ((long) p1) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p0), 3);
                return;
            }
        }
        if (!(p2 instanceof Enum)) {
            this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p2.hashCode()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) ((Enum) p2).ordinal()), 3);
        }
    }

    private final void updateCompositeKeyWhenWeEnterGroupKeyHash(int p0, int p1) {
        this.compositeKeyHashCode = ((long) p1) ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) p0), 3);
    }

    private final void updateCompositeKeyWhenWeExitGroup(int p0, int p1, Object p2, Object p3) {
        if (p2 == null) {
            if (p3 != null && p0 == 207 && !Intrinsics.areEqual(p3, Composer.INSTANCE.getEmpty())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) p1), 3) ^ ((long) p3.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) p1), 3) ^ ((long) p0), 3);
                return;
            }
        }
        if (!(p2 instanceof Enum)) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((long) p2.hashCode()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode(), 3) ^ ((long) ((Enum) p2).ordinal()), 3);
        }
    }

    private final void updateCompositeKeyWhenWeExitGroupKeyHash(int p0, int p1) {
        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) p1), 3) ^ ((long) p0), 3);
    }

    public final int stacksSize$runtime() {
        int i = this.entersStack.tos;
        int iM3523getSizeimpl = Stack.m3523getSizeimpl(this.invalidateStack);
        int i2 = this.providersInvalidStack.tos;
        return i + iM3523getSizeimpl + i2 + Stack.m3523getSizeimpl(this.pendingStack) + this.parentStateStack.tos;
    }

    @Override // androidx.compose.runtime.Composer
    public final RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // androidx.compose.runtime.Composer
    public final Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            return currentRecomposeScope$runtime.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public final Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public final void updateRememberedValue(Object p0) {
        updateCachedValue(p0);
    }

    @Override // androidx.compose.runtime.Composer
    public final void recordUsed(RecomposeScope p0) {
        RecomposeScopeImpl recomposeScopeImpl = p0 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) p0 : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    public final void dispose$runtime() {
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap p0, PersistentCompositionLocalMap p1) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = p0.builder2();
        builderBuilder2.putAll(p1);
        ?? Build2 = builderBuilder2.build2();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(Build2);
        updateSlot(p1);
        endGroup();
        return Build2;
    }

    private final long compositeKeyOf(int p0, int p1, long p2) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i = 3;
        int i2 = 0;
        while (p0 >= 0) {
            if (p0 != p1) {
                int iGroupCompositeKeyPart = groupCompositeKeyPart(this.reader, p0);
                if (iGroupCompositeKeyPart != 126665345) {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iGroupCompositeKeyPart, i)) ^ Long.rotateLeft(this.reader.hasObjectKey(p0) ? 0 : rGroupIndexOf(p0), i2);
                    i = (i + 6) % 64;
                    i2 = (i2 + 6) % 64;
                    p0 = this.reader.parent(p0);
                } else {
                    jRotateLeft = Long.rotateLeft(iGroupCompositeKeyPart, i2);
                }
            } else {
                jRotateLeft = Long.rotateLeft(p2, i2);
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }
}
