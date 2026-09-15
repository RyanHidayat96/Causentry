package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionObserverKt;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import androidx.content.preferences.protobuf.DescriptorProtos;
import androidx.core.view.PointerIconCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.p006compose.ComposeNavigator;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import defpackage.SizeCannotEncodeVideoQuirk;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.createPersistentInputSurface;
import defpackage.hasEndOfStreamFlag;
import defpackage.lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.stopMediaCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 å\u00012\u00020\u0001:\næ\u0001ç\u0001è\u0001é\u0001å\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010H\u0082\b¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0082\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b*\u0010'J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u0010%J\u0017\u00103\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u0010'J\u0018\u00104\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b4\u00105J \u00108\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u0002062\u0006\u0010\u0019\u001a\u000207H\u0082@¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b:\u0010\u0017JD\u0010A\u001a\u00020\u000722\u0010\u0003\u001a.\b\u0001\u0012\u0004\u0012\u00020<\u0012\t\u0012\u000706¢\u0006\u0002\b=\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070>\u0012\u0006\u0012\u0004\u0018\u00010?0;¢\u0006\u0002\b@H\u0082@¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010%J\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010%J\u0010\u0010E\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bE\u0010\u0017J*\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00112\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\u0002\bFH\u0011¢\u0006\u0004\bG\u0010HJ8\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020I2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001d¢\u0006\u0002\bFH\u0011¢\u0006\u0004\bL\u0010MJ3\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020I2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020K0JH\u0011¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020KH\u0010¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010'J)\u0010T\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010SH\u0002¢\u0006\u0004\bT\u0010UJ3\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00110 2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020V0 2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010SH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0007H\u0002¢\u0006\u0004\bY\u0010%J#\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\bZ\u0010[J3\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0003\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010SH\u0002¢\u0006\u0004\b\\\u0010]J<\u0010_\u001a\u00028\u0000\"\u0004\b\u0000\u0010^2\u0006\u0010\u0003\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010S2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0082\b¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bd\u0010\u0017J\r\u0010e\u001a\u00020\u0007¢\u0006\u0004\be\u0010%J\r\u0010f\u001a\u00020\u0007¢\u0006\u0004\bf\u0010%J\u001d\u0010i\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020h0gH\u0010¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0010¢\u0006\u0004\bk\u0010'J\u0017\u0010l\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0010¢\u0006\u0004\bl\u0010'J\u0017\u0010m\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0010¢\u0006\u0004\bm\u0010'J\u0017\u0010n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020KH\u0010¢\u0006\u0004\bn\u0010QJ\u0017\u0010o\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020VH\u0010¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020VH\u0010¢\u0006\u0004\bq\u0010pJ+\u0010t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020V2\u0006\u0010\u0019\u001a\u00020r2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030sH\u0010¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0010¢\u0006\u0004\bv\u0010'J\u0019\u0010w\u001a\u0004\u0018\u00010r2\u0006\u0010\u0003\u001a\u00020VH\u0010¢\u0006\u0004\bw\u0010xR$\u0010z\u001a\u00020y2\u0006\u0010\u0003\u001a\u00020y8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u00070?j\u0003`\u0081\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0088\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u001f\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020?0S8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u008e\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0088\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008a\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020V0\u0088\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008a\u0001R-\u0010\u0095\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010?0\u0094\u0001\u0012\u0004\u0012\u00020V0\u0093\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R$\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020r0\u009a\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0096\u0001R$\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020V0\u0093\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0096\u0001R\"\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0088\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008a\u0001R!\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010 \u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010£\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¥\u0001\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001b\u0010§\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b©\u0001\u0010¦\u0001R\u001f\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R&\u0010¯\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020K\u0018\u00010S0®\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001f\u0010´\u0001\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u0017\u0010¹\u0001\u001a\u00020\u00028QX\u0090\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010·\u0001R\u0016\u0010»\u0001\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\u000fR\u0016\u0010½\u0001\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u000fR)\u0010¿\u0001\u001a\u000b\u0012\u0004\u0012\u00020+\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b¿\u0001\u0010À\u0001\u0012\u0005\bÁ\u0001\u0010%R\u0016\u0010Ã\u0001\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\u000fR&\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010Ä\u00018GX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÇ\u0001\u0010%\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u001c\u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010É\u00018G¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001c\u0010Î\u0001\u001a\u00070Í\u0001R\u00020\u00008\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0016\u0010Ñ\u0001\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u000fR\u0013\u0010Ó\u0001\u001a\u00020\r8G¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u000fR\u0016\u0010Õ\u0001\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u000fR\u0016\u0010×\u0001\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\u000fR\u001b\u0010Ú\u0001\u001a\u00070yj\u0003`Ø\u00018QX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010}R\u0016\u0010Ü\u0001\u001a\u00020\r8QX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010\u000fR\u0016\u0010Þ\u0001\u001a\u00020\r8QX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010\u000fR\u0016\u0010à\u0001\u001a\u00020\r8QX\u0090\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010\u000fR\u001a\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018QX\u0090\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "p0", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "", "deriveStateLocked", "()LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "", "recordComposerModifications", "()Z", "Lkotlin/Function1;", "Landroidx/compose/runtime/ControlledComposition;", "(Lkotlin/jvm/functions/Function1;)V", "LVideoMimeInfoBuilder;", "registerRunnerJob", "(LVideoMimeInfoBuilder;)V", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p1", "p2", "processCompositionError", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "Lkotlin/Function0;", "withTransparentSnapshot", "(Lkotlin/jvm/functions/Function0;)V", "", "knownCompositions", "()Ljava/util/List;", "knownCompositionsLocked", "clearKnownCompositionsLocked", "()V", "removeKnownCompositionLocked", "(Landroidx/compose/runtime/ControlledComposition;)V", "addKnownCompositionLocked", "registerCompositionLocked", "unregisterCompositionLocked", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "addCompositionRegistrationObserver$runtime", "(Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "recordFailedCompositionLocked", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroidx/compose/runtime/ProduceFrameSignal;", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "close", "join", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "performInitialMovableContentInserts", "Landroidx/collection/MutableScatterSet;", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/MovableContentStateReference;", "performInsertValues", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "discardUnusedMovableContentState", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lkotlin/jvm/functions/Function1;", ExifInterface.GPS_DIRECTION_TRUE, "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "registerComposition$runtime", "unregisterComposition$runtime", "invalidate$runtime", "invalidateScope$runtime", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "deletedMovableContent$runtime", "Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/Applier;", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "reportRemovedComposition$runtime", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "stateLock", "Ljava/lang/Object;", "runnerJob", "LVideoMimeInfoBuilder;", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "movableContentRemoved", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "LSizeCannotEncodeVideoQuirk;", "effectJob", "LSizeCannotEncodeVideoQuirk;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$runtime", "recomposeCoroutineContext", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "Landroidx/collection/MutableObjectList;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "getShouldKeepRecomposing", "shouldKeepRecomposing", "LclampVideoBitrateIfNotSupported;", "getState", "()LclampVideoBitrateIfNotSupported;", "getState$annotations", RemoteConfigConstants.ResponseFieldKey.STATE, "LstopMediaCodec;", "getCurrentState", "()LstopMediaCodec;", "currentState", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getHasSchedulingWork", "hasSchedulingWork", "getHasPendingWork", "hasPendingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "compositeKeyHashCode", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getCollectingParameterInformation$runtime", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "composition", "Companion", "State", "RecomposerInfoImpl", "HotReloadable", "RecomposerErrorState"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final SizeCannotEncodeVideoQuirk effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final MutableScatterMap<Object, Object> movableContentRemoved;
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;
    private VideoMimeInfoBuilder runnerJob;
    private MutableScatterSet<Object> snapshotInvalidations;
    private final Object stateLock;
    private MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> workContinuation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final lambdastop3androidxcameravideointernalencoderEncoderImpl<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {1029, 1036}, m = "runFrameLoop", n = {"parentFrameClock", "frameSignal", "toRecompose", "toApply", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: getCollectingParameterInformation$runtime */
    public final boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: getCompositeKeyHashCode$runtime */
    public final long getCompositeKeyHashCode() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final Composition getComposition$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void recordInspectionTable$runtime(Set<CompositionData> p0) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void registerComposition$runtime(ControlledComposition p0) {
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Recomposer.broadcastFrameClock$lambda$2(this.f$0);
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m3616constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m3616constructorimpl$default(null, 1, null);
        this._state = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b));
        sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3.a_(new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Recomposer.effectJob$lambda$10$lambda$9(this.f$0, (Throwable) obj);
            }
        });
        this.effectJob = sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit broadcastFrameClock$lambda$2(Recomposer recomposer) {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        synchronized (recomposer.stateLock) {
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = recomposer.deriveStateLocked();
            if (recomposer._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.ShuttingDown) <= 0) {
                Throwable th = recomposer.closeCause;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$10$lambda$9(final Recomposer recomposer, final Throwable th) {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk2;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        synchronized (recomposer.stateLock) {
            VideoMimeInfoBuilder videoMimeInfoBuilder = recomposer.runnerJob;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk = null;
            if (videoMimeInfoBuilder != null) {
                recomposer._state.b(State.ShuttingDown);
                if (!recomposer.isClosed) {
                    videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
                } else {
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = recomposer.workContinuation;
                    if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 == null) {
                    }
                    recomposer.workContinuation = null;
                    videoMimeInfoBuilder.a_(new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Recomposer.effectJob$lambda$10$lambda$9$lambda$8$lambda$7(this.f$0, th, (Throwable) obj);
                        }
                    });
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirk = mediaFormatMustNotUseFrameRateToFindEncoderQuirk2;
                }
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = null;
                recomposer.workContinuation = null;
                videoMimeInfoBuilder.a_(new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Recomposer.effectJob$lambda$10$lambda$9$lambda$8$lambda$7(this.f$0, th, (Throwable) obj);
                    }
                });
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk = mediaFormatMustNotUseFrameRateToFindEncoderQuirk2;
            } else {
                recomposer.closeCause = cancellationException;
                recomposer._state.b(State.ShutDown);
                Unit unit = Unit.INSTANCE;
            }
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                if (th2 instanceof CancellationException) {
                    th2 = null;
                }
                if (th2 != null) {
                    ExceptionsKt.addSuppressed(th, th2);
                }
            }
            recomposer.closeCause = th;
            recomposer._state.b(State.ShutDown);
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final CoroutineContext getRecomposeCoroutineContext$runtime() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> deriveStateLocked() {
        State state;
        int i = 1;
        int i2 = 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i2, i, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.workContinuation;
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.TuitionPaymentFragmentbindingInflater1(null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i2, i, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else if (this.compositionInvalidations.getSize() != 0 || this.snapshotInvalidations.isNotEmpty() || !this.compositionsAwaitingApply.isEmpty() || !this.movableContentAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked() || MultiValueMap.m3624isNotEmptyimpl(this.movableContentRemoved)) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.b(state);
        if (state != State.PendingWork) {
            return null;
        }
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = this.workContinuation;
        this.workContinuation = null;
        return mediaFormatMustNotUseFrameRateToFindEncoderQuirk2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator<VideoMimeInfoBuilder> it = this.effectJob.asInterface().iterator();
        while (it.hasNext()) {
            if (it.next().r_()) {
                return true;
            }
        }
        return false;
    }

    public final clampVideoBitrateIfNotSupported<State> getState() {
        return getCurrentState();
    }

    public final stopMediaCodec<State> getCurrentState() {
        return this._state;
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010&\u001a\u0004\u0018\u00010#8G¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "p0", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "(Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "", "", "invalidateGroupsWithKey", "(I)V", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "saveStateAndDisposeForHotReload", "()Ljava/util/List;", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "()V", "LclampVideoBitrateIfNotSupported;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()LclampVideoBitrateIfNotSupported;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getChangeCount", "()J", "changeCount", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "currentError"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public final clampVideoBitrateIfNotSupported<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public final boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public final long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public final CompositionObserverHandle observe(CompositionRegistrationObserver p0) {
            return CompositionObserverKt.observe(Recomposer.this, p0);
        }

        public final void invalidateGroupsWithKey(int p0) {
            List listKnownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(listKnownCompositions.size());
            int size = listKnownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) listKnownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((CompositionImpl) arrayList2.get(i2)).invalidateGroupsWithKey(p0);
            }
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List listKnownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(listKnownCompositions.size());
            int size = listKnownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) listKnownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList2.get(i2));
                hotReloadable.clearContent();
                arrayList3.add(hotReloadable);
            }
            return arrayList3;
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "Landroidx/compose/runtime/CompositionImpl;", "p0", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "", "clearContent", "()V", "resetContent", "recompose", "composition", "Landroidx/compose/runtime/CompositionImpl;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ComposeNavigator.NAME, "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class HotReloadable {
        private Function2<? super Composer, ? super Integer, Unit> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m3460getLambda$1091980426$runtime());
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "", "p0", "", "p1", "<init>", "(ZLjava/lang/Throwable;)V", "recoverable", "Z", "getRecoverable", "()Z", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Throwable th) {
            this.recoverable = z;
            this.cause = th;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public final boolean getRecoverable() {
            return this.recoverable;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public final Throwable getCause() {
            return this.cause;
        }
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        CollectionsKt.emptyList();
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            List<ControlledComposition> listKnownCompositionsLocked = knownCompositionsLocked();
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            int i = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
            try {
                Recomposer recomposer = this;
                int size = listKnownCompositionsLocked.size();
                while (i < size) {
                    listKnownCompositionsLocked.get(i).recordModificationsOf(setWrapIntoSet);
                    if (this._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                    i++;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> p0) {
        MutableScatterSet mutableScatterSet;
        int i;
        synchronized (this.stateLock) {
            mutableScatterSet = this.snapshotInvalidations;
            i = 0;
            if (mutableScatterSet.isNotEmpty()) {
                this.snapshotInvalidations = new MutableScatterSet(i, 1, null);
            }
        }
        Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
        if (!setWrapIntoSet.isEmpty()) {
            List listKnownCompositionsLocked = knownCompositionsLocked();
            int size = listKnownCompositionsLocked.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ControlledComposition) listKnownCompositionsLocked.get(i2)).recordModificationsOf(setWrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        T[] tArr = mutableVector.content;
        int size2 = mutableVector.getSize();
        while (i < size2) {
            p0.invoke(tArr[i]);
            i++;
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            if (deriveStateLocked() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(VideoMimeInfoBuilder p0) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = p0;
            deriveStateLocked();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {587, 598}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    static final class C05722 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: Code duplicated, block: B:13:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:15:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:18:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:21:0x0147  */
        /* JADX WARN: Code duplicated, block: B:23:0x015b  */
        /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0147 -> B:22:0x014c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x015b -> B:11:0x00bf). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C05722.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0075 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x0077 A[Catch: all -> 0x011d, LOOP:1: B:10:0x0041->B:20:0x0077, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0019, B:7:0x0028, B:10:0x0041, B:12:0x004b, B:14:0x0055, B:16:0x005f, B:17:0x006f, B:20:0x0077, B:21:0x007a, B:24:0x008b, B:26:0x0095, B:28:0x009f, B:30:0x00a9, B:31:0x00b3, B:34:0x00bb, B:35:0x00be, B:38:0x00d2, B:40:0x00dc, B:42:0x00e6, B:44:0x00f0, B:45:0x0100, B:51:0x0112, B:52:0x0116), top: B:58:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x00bb A[Catch: all -> 0x011d, LOOP:3: B:24:0x008b->B:34:0x00bb, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0019, B:7:0x0028, B:10:0x0041, B:12:0x004b, B:14:0x0055, B:16:0x005f, B:17:0x006f, B:20:0x0077, B:21:0x007a, B:24:0x008b, B:26:0x0095, B:28:0x009f, B:30:0x00a9, B:31:0x00b3, B:34:0x00bb, B:35:0x00be, B:38:0x00d2, B:40:0x00dc, B:42:0x00e6, B:44:0x00f0, B:45:0x0100, B:51:0x0112, B:52:0x0116), top: B:58:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x007a A[EDGE_INSN: B:62:0x007a->B:21:0x007a BREAK  A[LOOP:1: B:10:0x0041->B:20:0x0077], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x00be A[EDGE_INSN: B:67:0x00be->B:35:0x00be BREAK  A[LOOP:3: B:24:0x008b->B:34:0x00bb], SYNTHETIC] */
        private static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, MutableScatterSet<Object> mutableScatterSet3, MutableScatterSet<ControlledComposition> mutableScatterSet4) {
            synchronized (recomposer.stateLock) {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ControlledComposition controlledComposition = list3.get(i);
                    controlledComposition.abandonChanges();
                    recomposer.recordFailedCompositionLocked(controlledComposition);
                }
                list3.clear();
                MutableScatterSet<ControlledComposition> mutableScatterSet5 = mutableScatterSet;
                Object[] objArr = mutableScatterSet5.elements;
                long[] jArr = mutableScatterSet5.metadata;
                int length = jArr.length - 2;
                char c = 7;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i4];
                                    controlledComposition2.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition2);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                mutableScatterSet.clear();
                MutableScatterSet<ControlledComposition> mutableScatterSet6 = mutableScatterSet2;
                Object[] objArr2 = mutableScatterSet6.elements;
                long[] jArr2 = mutableScatterSet6.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j2 = jArr2[i5];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j2 & 255) < 128) {
                                    ((ControlledComposition) objArr2[(i5 << 3) + i7]).changesApplied();
                                }
                                j2 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                mutableScatterSet2.clear();
                mutableScatterSet3.clear();
                MutableScatterSet<ControlledComposition> mutableScatterSet7 = mutableScatterSet4;
                Object[] objArr3 = mutableScatterSet7.elements;
                long[] jArr3 = mutableScatterSet7.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j3 = jArr3[i8];
                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j3 & 255) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i8 << 3) + i10];
                                    controlledComposition3.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition3);
                                }
                                j3 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        }
                        i8++;
                        c = 7;
                    }
                }
                mutableScatterSet4.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                List list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) list2.get(i));
                }
                recomposer.movableContentAwaitingInsert.clear();
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:100:0x0215 A[Catch: all -> 0x023f, TRY_LEAVE, TryCatch #21 {all -> 0x023f, blocks: (B:91:0x01e6, B:94:0x01f3, B:96:0x01ff, B:98:0x020b, B:100:0x0215), top: B:255:0x01e6, outer: #17 }] */
        /* JADX WARN: Code duplicated, block: B:105:0x022e  */
        /* JADX WARN: Code duplicated, block: B:107:0x0236 A[LOOP:2: B:94:0x01f3->B:107:0x0236, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:233:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:242:0x027b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:255:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:261:0x023b A[EDGE_INSN: B:261:0x023b->B:108:0x023b BREAK  A[LOOP:2: B:94:0x01f3->B:107:0x0236], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:262:0x023b A[EDGE_INSN: B:262:0x023b->B:108:0x023b BREAK  A[LOOP:2: B:94:0x01f3->B:107:0x0236], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:265:0x021f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:266:0x01ac A[EDGE_INSN: B:266:0x01ac->B:78:0x01ac BREAK  A[LOOP:4: B:64:0x0161->B:77:0x01a3], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:267:0x01ac A[EDGE_INSN: B:267:0x01ac->B:78:0x01ac BREAK  A[LOOP:4: B:64:0x0161->B:77:0x01a3], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:270:0x018e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x015f  */
        /* JADX WARN: Code duplicated, block: B:66:0x016d A[Catch: all -> 0x01b0, TryCatch #8 {all -> 0x01b0, blocks: (B:61:0x014d, B:64:0x0161, B:66:0x016d, B:68:0x0179, B:70:0x0183), top: B:233:0x014d, outer: #17 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0179 A[Catch: all -> 0x01b0, TryCatch #8 {all -> 0x01b0, blocks: (B:61:0x014d, B:64:0x0161, B:66:0x016d, B:68:0x0179, B:70:0x0183), top: B:233:0x014d, outer: #17 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0183 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #8 {all -> 0x01b0, blocks: (B:61:0x014d, B:64:0x0161, B:66:0x016d, B:68:0x0179, B:70:0x0183), top: B:233:0x014d, outer: #17 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x019f  */
        /* JADX WARN: Code duplicated, block: B:77:0x01a3 A[LOOP:4: B:64:0x0161->B:77:0x01a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:89:0x01df A[Catch: all -> 0x029c, TRY_LEAVE, TryCatch #17 {all -> 0x029c, blocks: (B:89:0x01df, B:108:0x023b, B:120:0x026e, B:113:0x025f, B:118:0x026a, B:119:0x026d, B:83:0x01d2, B:87:0x01db, B:88:0x01de, B:112:0x0247, B:61:0x014d, B:64:0x0161, B:66:0x016d, B:68:0x0179, B:70:0x0183, B:82:0x01ba, B:91:0x01e6, B:94:0x01f3, B:96:0x01ff, B:98:0x020b, B:100:0x0215), top: B:233:0x014d, inners: #2, #8, #15, #21 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:96:0x01ff A[Catch: all -> 0x023f, TryCatch #21 {all -> 0x023f, blocks: (B:91:0x01e6, B:94:0x01f3, B:96:0x01ff, B:98:0x020b, B:100:0x0215), top: B:255:0x01e6, outer: #17 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x020b A[Catch: all -> 0x023f, TryCatch #21 {all -> 0x023f, blocks: (B:91:0x01e6, B:94:0x01f3, B:96:0x01ff, B:98:0x020b, B:100:0x0215), top: B:255:0x01e6, outer: #17 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v35 */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v14, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r11v19, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r11v20, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v22 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v21, types: [int] */
        /* JADX WARN: Type inference failed for: r12v22 */
        /* JADX WARN: Type inference failed for: r12v23, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r12v24, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r12v25 */
        /* JADX WARN: Type inference failed for: r12v26 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r30v0, types: [androidx.collection.MutableScatterSet, androidx.collection.ScatterSet] */
        /* JADX WARN: Type inference failed for: r3v8, types: [T[], java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.runtime.snapshots.Snapshot] */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v18, types: [androidx.collection.MutableScatterSet] */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v6, types: [T[]] */
        public static final Unit invokeSuspend$lambda$22(Recomposer recomposer, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, List list, List list2, MutableScatterSet mutableScatterSet3, List list3, MutableScatterSet mutableScatterSet4, Set set, long j) {
            boolean z;
            Unit unit;
            List list4;
            ?? r11;
            Object[] objArr;
            long[] jArr;
            int length;
            int i;
            long j2;
            long[] jArr2;
            int i2;
            ?? r12;
            Object[] objArr2;
            long[] jArr3;
            int length2;
            int i3;
            long j3;
            int i4;
            int i5;
            ?? r13 = list2;
            if (recomposer.getHasBroadcastFrameClockAwaiters()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
                try {
                    recomposer.broadcastFrameClock.sendFrame(j);
                    Snapshot.INSTANCE.sendApplyNotifications();
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th;
                }
            }
            Object objBeginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer.recordComposerModifications();
                synchronized (recomposer.stateLock) {
                    MutableVector mutableVector = recomposer.compositionInvalidations;
                    Object[] objArr3 = mutableVector.content;
                    int size = mutableVector.getSize();
                    z = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        list.add((ControlledComposition) objArr3[i6]);
                    }
                    recomposer.compositionInvalidations.clear();
                    Unit unit3 = Unit.INSTANCE;
                }
                mutableScatterSet.clear();
                mutableScatterSet2.clear();
                while (true) {
                    if (list.isEmpty() && ((Collection) r13).isEmpty()) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            ControlledComposition controlledComposition = (ControlledComposition) list.get(i7);
                            ControlledComposition controlledCompositionPerformRecompose = recomposer.performRecompose(controlledComposition, mutableScatterSet);
                            if (controlledCompositionPerformRecompose != null) {
                                list3.add(controlledCompositionPerformRecompose);
                                Unit unit4 = Unit.INSTANCE;
                                Unit unit5 = Unit.INSTANCE;
                            }
                            mutableScatterSet2.add(controlledComposition);
                        }
                        list.clear();
                        if (mutableScatterSet.isNotEmpty() || recomposer.compositionInvalidations.getSize() != 0) {
                            synchronized (recomposer.stateLock) {
                                List listKnownCompositionsLocked = recomposer.knownCompositionsLocked();
                                int size3 = listKnownCompositionsLocked.size();
                                for (int i8 = 0; i8 < size3; i8++) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) listKnownCompositionsLocked.get(i8);
                                    if (!mutableScatterSet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set)) {
                                        list.add(controlledComposition2);
                                    }
                                }
                                MutableVector mutableVector2 = recomposer.compositionInvalidations;
                                int size4 = mutableVector2.getSize();
                                int i9 = 0;
                                for (int i10 = 0; i10 < size4; i10++) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.content[i10];
                                    if (!mutableScatterSet2.contains(controlledComposition3) && !list.contains(controlledComposition3)) {
                                        list.add(controlledComposition3);
                                        i9++;
                                    } else if (i9 > 0) {
                                        mutableVector2.content[i10 - i9] = mutableVector2.content[i10];
                                    }
                                }
                                int i11 = size4 - i9;
                                ArraysKt.fill((Object[]) mutableVector2.content, (Object) null, i11, size4);
                                mutableVector2.setSize(i11);
                                Unit unit6 = Unit.INSTANCE;
                            }
                        }
                        if (list.isEmpty()) {
                            list4 = list2;
                            try {
                                invokeSuspend$fillToInsert(list4, recomposer);
                                while (!list4.isEmpty()) {
                                    try {
                                        mutableScatterSet3.plusAssign(recomposer.performInsertValues(list4, mutableScatterSet));
                                        invokeSuspend$fillToInsert(list4, recomposer);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Recomposer.processCompositionError$default(recomposer, th, null, true, 2, null);
                                        invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                        unit = Unit.INSTANCE;
                                        Trace.INSTANCE.endSection(objBeginSection2);
                                        return unit;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            list4 = list2;
                        }
                        z = false;
                        r13 = list4;
                    } catch (Throwable th4) {
                        try {
                            Recomposer.processCompositionError$default(recomposer, th4, null, true, 2, null);
                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                            unit = Unit.INSTANCE;
                            list.clear();
                        } catch (Throwable th5) {
                            list.clear();
                            throw th5;
                        }
                    }
                    Trace.INSTANCE.endSection(objBeginSection2);
                    return unit;
                }
                Snapshot current = Snapshot.INSTANCE.getCurrent();
                ?? transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, true, z);
                try {
                    try {
                        Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                        try {
                            try {
                                if (list3.isEmpty()) {
                                    r13 = transparentObserverMutableSnapshot;
                                    if (mutableScatterSet3.isNotEmpty()) {
                                        mutableScatterSet3 = snapshotMakeCurrent;
                                        if (mutableScatterSet4.isNotEmpty()) {
                                            MutableScatterSet mutableScatterSet5 = mutableScatterSet4;
                                            objArr2 = mutableScatterSet5.elements;
                                            jArr3 = mutableScatterSet5.metadata;
                                            length2 = jArr3.length - 2;
                                            if (length2 >= 0) {
                                                i3 = 0;
                                                while (true) {
                                                    j3 = jArr3[i3];
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i4 = 8 - ((~(i3 - length2)) >>> 31);
                                                        for (i5 = 0; i5 < i4; i5++) {
                                                            if ((j3 & 255) < 128) {
                                                                ((ControlledComposition) objArr2[(i3 << 3) + i5]).changesApplied();
                                                            }
                                                            j3 >>= 8;
                                                        }
                                                        if (i4 == 8) {
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (i3 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                            mutableScatterSet4.clear();
                                        }
                                        Unit unit7 = Unit.INSTANCE;
                                        r13.restoreCurrent(mutableScatterSet3);
                                        r13.dispose();
                                        synchronized (recomposer.stateLock) {
                                            recomposer.deriveStateLocked();
                                            Snapshot.INSTANCE.notifyObjectsInitialized();
                                            mutableScatterSet2.clear();
                                            mutableScatterSet.clear();
                                            recomposer.compositionsRemoved = null;
                                            Unit unit8 = Unit.INSTANCE;
                                            Trace.INSTANCE.endSection(objBeginSection2);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    mutableScatterSet4.plusAssign((ScatterSet) mutableScatterSet3);
                                    ScatterSet scatterSet = (ScatterSet) mutableScatterSet3;
                                    objArr = scatterSet.elements;
                                    jArr = scatterSet.metadata;
                                    length = jArr.length - 2;
                                    if (length >= 0) {
                                        i = 0;
                                        while (true) {
                                            j2 = jArr[i];
                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                mutableScatterSet3 = 8 - ((~(i - length)) >>> 31);
                                                i2 = 0;
                                                while (i2 < mutableScatterSet3) {
                                                    if ((j2 & 255) < 128) {
                                                        ((ControlledComposition) objArr[(i << 3) + i2]).applyLateChanges();
                                                    }
                                                    j2 >>= 8;
                                                    i2++;
                                                    jArr = jArr;
                                                }
                                                jArr2 = jArr;
                                                if (mutableScatterSet3 == 8) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr;
                                            }
                                            if (i != length) {
                                                break;
                                                break;
                                            }
                                            i++;
                                            jArr = jArr2;
                                        }
                                    }
                                    mutableScatterSet3.clear();
                                    mutableScatterSet3 = snapshotMakeCurrent;
                                    if (mutableScatterSet4.isNotEmpty()) {
                                        MutableScatterSet mutableScatterSet6 = mutableScatterSet4;
                                        objArr2 = mutableScatterSet6.elements;
                                        jArr3 = mutableScatterSet6.metadata;
                                        length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            i3 = 0;
                                            while (true) {
                                                j3 = jArr3[i3];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    i4 = 8 - ((~(i3 - length2)) >>> 31);
                                                    while (i5 < i4) {
                                                        if ((j3 & 255) < 128) {
                                                            ((ControlledComposition) objArr2[(i3 << 3) + i5]).changesApplied();
                                                        }
                                                        j3 >>= 8;
                                                    }
                                                    if (i4 == 8) {
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (i3 != length2) {
                                                    break;
                                                    break;
                                                }
                                                i3++;
                                            }
                                        }
                                        mutableScatterSet4.clear();
                                    }
                                    Unit unit9 = Unit.INSTANCE;
                                    r13.restoreCurrent(mutableScatterSet3);
                                    r13.dispose();
                                    synchronized (recomposer.stateLock) {
                                        recomposer.deriveStateLocked();
                                        Snapshot.INSTANCE.notifyObjectsInitialized();
                                        mutableScatterSet2.clear();
                                        mutableScatterSet.clear();
                                        recomposer.compositionsRemoved = null;
                                        Unit unit10 = Unit.INSTANCE;
                                        Trace.INSTANCE.endSection(objBeginSection2);
                                        return Unit.INSTANCE;
                                    }
                                }
                                try {
                                    recomposer.changeCount = recomposer.getChangeCount() + 1;
                                    try {
                                        int size5 = list3.size();
                                        for (int i12 = 0; i12 < size5; i12++) {
                                            mutableScatterSet4.add((ControlledComposition) list3.get(i12));
                                        }
                                        int size6 = list3.size();
                                        for (int i13 = 0; i13 < size6; i13++) {
                                            ((ControlledComposition) list3.get(i13)).applyChanges();
                                        }
                                        list3.clear();
                                        r13 = transparentObserverMutableSnapshot;
                                        if (mutableScatterSet3.isNotEmpty()) {
                                            mutableScatterSet3 = snapshotMakeCurrent;
                                            if (mutableScatterSet4.isNotEmpty()) {
                                                MutableScatterSet mutableScatterSet7 = mutableScatterSet4;
                                                objArr2 = mutableScatterSet7.elements;
                                                jArr3 = mutableScatterSet7.metadata;
                                                length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    i3 = 0;
                                                    while (true) {
                                                        j3 = jArr3[i3];
                                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            i4 = 8 - ((~(i3 - length2)) >>> 31);
                                                            while (i5 < i4) {
                                                                if ((j3 & 255) < 128) {
                                                                    ((ControlledComposition) objArr2[(i3 << 3) + i5]).changesApplied();
                                                                }
                                                                j3 >>= 8;
                                                            }
                                                            if (i4 == 8) {
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (i3 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i3++;
                                                    }
                                                }
                                                mutableScatterSet4.clear();
                                            }
                                            Unit unit11 = Unit.INSTANCE;
                                            r13.restoreCurrent(mutableScatterSet3);
                                            r13.dispose();
                                            synchronized (recomposer.stateLock) {
                                                recomposer.deriveStateLocked();
                                                Snapshot.INSTANCE.notifyObjectsInitialized();
                                                mutableScatterSet2.clear();
                                                mutableScatterSet.clear();
                                                recomposer.compositionsRemoved = null;
                                                Unit unit12 = Unit.INSTANCE;
                                                Trace.INSTANCE.endSection(objBeginSection2);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        try {
                                            try {
                                                mutableScatterSet4.plusAssign((ScatterSet) mutableScatterSet3);
                                                ScatterSet scatterSet2 = (ScatterSet) mutableScatterSet3;
                                                objArr = scatterSet2.elements;
                                                jArr = scatterSet2.metadata;
                                                length = jArr.length - 2;
                                                if (length >= 0) {
                                                    i = 0;
                                                    while (true) {
                                                        j2 = jArr[i];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            mutableScatterSet3 = 8 - ((~(i - length)) >>> 31);
                                                            i2 = 0;
                                                            while (i2 < mutableScatterSet3) {
                                                                if ((j2 & 255) < 128) {
                                                                    ((ControlledComposition) objArr[(i << 3) + i2]).applyLateChanges();
                                                                }
                                                                j2 >>= 8;
                                                                i2++;
                                                                jArr = jArr;
                                                            }
                                                            jArr2 = jArr;
                                                            if (mutableScatterSet3 == 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            jArr2 = jArr;
                                                        }
                                                        if (i != length) {
                                                            break;
                                                        }
                                                        i++;
                                                        jArr = jArr2;
                                                    }
                                                }
                                                mutableScatterSet3.clear();
                                                mutableScatterSet3 = snapshotMakeCurrent;
                                                if (mutableScatterSet4.isNotEmpty()) {
                                                    try {
                                                        MutableScatterSet mutableScatterSet8 = mutableScatterSet4;
                                                        objArr2 = mutableScatterSet8.elements;
                                                        jArr3 = mutableScatterSet8.metadata;
                                                        length2 = jArr3.length - 2;
                                                        if (length2 >= 0) {
                                                            i3 = 0;
                                                            while (true) {
                                                                j3 = jArr3[i3];
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    i4 = 8 - ((~(i3 - length2)) >>> 31);
                                                                    while (i5 < i4) {
                                                                        if ((j3 & 255) < 128) {
                                                                            ((ControlledComposition) objArr2[(i3 << 3) + i5]).changesApplied();
                                                                        }
                                                                        j3 >>= 8;
                                                                    }
                                                                    if (i4 == 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i3 != length2) {
                                                                    break;
                                                                }
                                                                i3++;
                                                            }
                                                        }
                                                        mutableScatterSet4.clear();
                                                    } catch (Throwable th6) {
                                                        try {
                                                            Recomposer.processCompositionError$default(recomposer, th6, null, false, 6, null);
                                                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                                            unit = Unit.INSTANCE;
                                                            mutableScatterSet4.clear();
                                                            r12 = mutableScatterSet3;
                                                            r13.restoreCurrent(r12);
                                                            r11 = r13;
                                                            r11.dispose();
                                                            Trace.INSTANCE.endSection(objBeginSection2);
                                                            return unit;
                                                        } catch (Throwable th7) {
                                                            mutableScatterSet4.clear();
                                                            throw th7;
                                                        }
                                                    }
                                                }
                                                Unit unit13 = Unit.INSTANCE;
                                                r13.restoreCurrent(mutableScatterSet3);
                                                r13.dispose();
                                                synchronized (recomposer.stateLock) {
                                                    recomposer.deriveStateLocked();
                                                }
                                                Snapshot.INSTANCE.notifyObjectsInitialized();
                                                mutableScatterSet2.clear();
                                                mutableScatterSet.clear();
                                                recomposer.compositionsRemoved = null;
                                                Unit unit14 = Unit.INSTANCE;
                                                Trace.INSTANCE.endSection(objBeginSection2);
                                                return Unit.INSTANCE;
                                            } catch (Throwable th8) {
                                                mutableScatterSet3 = snapshotMakeCurrent;
                                                try {
                                                    Recomposer.processCompositionError$default(recomposer, th8, null, false, 6, null);
                                                    invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, mutableScatterSet4, mutableScatterSet, mutableScatterSet2);
                                                    unit = Unit.INSTANCE;
                                                    mutableScatterSet3.clear();
                                                    r12 = mutableScatterSet3;
                                                    r13.restoreCurrent(r12);
                                                    r11 = r13;
                                                    r11.dispose();
                                                    Trace.INSTANCE.endSection(objBeginSection2);
                                                    return unit;
                                                } catch (Throwable th9) {
                                                    mutableScatterSet3.clear();
                                                    throw th9;
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            r13.restoreCurrent(mutableScatterSet3);
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        r13 = transparentObserverMutableSnapshot;
                                        transparentObserverMutableSnapshot = 0;
                                        try {
                                            Recomposer.processCompositionError$default(recomposer, th11, null, false, 6, null);
                                            transparentObserverMutableSnapshot = mutableScatterSet4;
                                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet3, transparentObserverMutableSnapshot, mutableScatterSet, mutableScatterSet2);
                                            unit = Unit.INSTANCE;
                                            try {
                                                list3.clear();
                                                r13.restoreCurrent(snapshotMakeCurrent);
                                                r11 = r13;
                                                r11.dispose();
                                                Trace.INSTANCE.endSection(objBeginSection2);
                                                return unit;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                transparentObserverMutableSnapshot = snapshotMakeCurrent;
                                                mutableScatterSet3 = transparentObserverMutableSnapshot;
                                                r13.restoreCurrent(mutableScatterSet3);
                                                throw th;
                                            }
                                        } catch (Throwable th13) {
                                            list3.clear();
                                            throw th13;
                                        }
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    r13 = transparentObserverMutableSnapshot;
                                    transparentObserverMutableSnapshot = snapshotMakeCurrent;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            mutableScatterSet3 = snapshotMakeCurrent;
                            r13 = transparentObserverMutableSnapshot;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        r13.dispose();
                        throw th;
                    }
                } catch (Throwable th18) {
                    th = th18;
                    r13 = transparentObserverMutableSnapshot;
                    r13.dispose();
                    throw th;
                }
                Trace.INSTANCE.endSection(objBeginSection2);
                return unit;
            } catch (Throwable th19) {
                Trace.INSTANCE.endSection(objBeginSection2);
                throw th19;
            }
        }

        C05722(Continuation<? super C05722> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C05722 c05722 = Recomposer.this.new C05722(continuation);
            c05722.L$0 = monotonicFrameClock;
            return c05722.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> continuation) {
        Object objRecompositionRunner = recompositionRunner(new C05722(null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z);
    }

    private final void processCompositionError(Throwable p0, ControlledComposition p1, boolean p2) throws Throwable {
        int i = 0;
        if (_hotReloadEnabled.get().booleanValue() && !(p0 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", p0);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m3614clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(p2, p0);
                if (p1 != null) {
                    recordFailedCompositionLocked(p1);
                }
                deriveStateLocked();
            }
            return;
        }
        synchronized (this.stateLock) {
            RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new RecomposerErrorState(false, p0);
                Unit unit = Unit.INSTANCE;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw p0;
    }

    private final void withTransparentSnapshot(Function0<Unit> p0) {
        TransparentObserverSnapshot transparentObserverSnapshot;
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        if (current instanceof MutableSnapshot) {
            transparentObserverSnapshot = new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false);
        } else {
            transparentObserverSnapshot = new TransparentObserverSnapshot(current, null, true, false);
        }
        try {
            Snapshot snapshotMakeCurrent = transparentObserverSnapshot.makeCurrent();
            try {
                p0.invoke();
                transparentObserverSnapshot.restoreCurrent(snapshotMakeCurrent);
                transparentObserverSnapshot.dispose();
            } catch (Throwable th) {
                transparentObserverSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            transparentObserverSnapshot.dispose();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositions() {
        List<ControlledComposition> listKnownCompositionsLocked;
        synchronized (this.stateLock) {
            listKnownCompositionsLocked = knownCompositionsLocked();
        }
        return listKnownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<ControlledComposition> list2 = this._knownCompositions;
        ArrayList arrayListEmptyList = list2.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list2);
        this._knownCompositionsCache = arrayListEmptyList;
        return arrayListEmptyList;
    }

    private final void clearKnownCompositionsLocked() {
        Iterator<T> it = knownCompositionsLocked().iterator();
        while (it.hasNext()) {
            unregisterCompositionLocked((ControlledComposition) it.next());
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(ControlledComposition p0) {
        if (this._knownCompositions.remove(p0)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(p0);
        }
    }

    private final void addKnownCompositionLocked(ControlledComposition p0) {
        this._knownCompositions.add(p0);
        this._knownCompositionsCache = null;
    }

    private final void registerCompositionLocked(ControlledComposition p0) {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList2 = mutableObjectList;
            Object[] objArr = mutableObjectList2.content;
            int i = mutableObjectList2._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (p0 instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) p0);
                }
            }
        }
    }

    private final void unregisterCompositionLocked(ControlledComposition p0) {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList2 = mutableObjectList;
            Object[] objArr = mutableObjectList2.content;
            int i = mutableObjectList2._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (p0 instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionUnregistered((ObservableComposition) p0);
                }
            }
        }
    }

    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime(final CompositionRegistrationObserver p0) {
        synchronized (this.stateLock) {
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
            int i = 0;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(i, 1, null);
                this.registrationObservers = mutableObjectList;
            }
            mutableObjectList.add(p0);
            List<ControlledComposition> list = this._knownCompositions;
            int size = list.size();
            while (i < size) {
                ControlledComposition controlledComposition = list.get(i);
                if (controlledComposition instanceof ObservableComposition) {
                    p0.onCompositionRegistered((ObservableComposition) controlledComposition);
                }
                i++;
            }
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public final void dispose() {
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                CompositionRegistrationObserver compositionRegistrationObserver = p0;
                synchronized (obj) {
                    MutableObjectList mutableObjectList2 = recomposer.registrationObservers;
                    if (mutableObjectList2 != null) {
                        mutableObjectList2.remove(compositionRegistrationObserver);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list != null) {
            while (true) {
                i = 0;
                try {
                    if (list.isEmpty()) {
                        break;
                    }
                    ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt.removeLast(list);
                    if (controlledComposition instanceof CompositionImpl) {
                        ((CompositionImpl) controlledComposition).invalidateAll();
                        ((CompositionImpl) controlledComposition).setContent(((CompositionImpl) controlledComposition).getComposable());
                        if (this.errorState != null) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    if (!list.isEmpty()) {
                        synchronized (this.stateLock) {
                            int size = list.size();
                            while (i < size) {
                                recordFailedCompositionLocked(list.get(i));
                                i++;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    throw th;
                }
            }
            if (list.isEmpty()) {
                return;
            }
            synchronized (this.stateLock) {
                int size2 = list.size();
                while (i < size2) {
                    recordFailedCompositionLocked(list.get(i));
                    i++;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition p0) {
        ArrayList arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(p0)) {
            arrayList.add(p0);
        }
        removeKnownCompositionLocked(p0);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {DescriptorProtos.Edition.EDITION_PROTO2_VALUE, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C05732 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00db A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #3 {, blocks: (B:28:0x00d1, B:30:0x00db), top: B:94:0x00d1 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:36:0x0101 A[LOOP:0: B:35:0x00ff->B:36:0x0101, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x011a  */
        /* JADX WARN: Code duplicated, block: B:51:0x016d A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #1 {, blocks: (B:49:0x0167, B:51:0x016d, B:67:0x019b, B:68:0x01a6), top: B:90:0x0167 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x017f A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #2 {all -> 0x0198, blocks: (B:55:0x0179, B:57:0x017f), top: B:92:0x0179 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0184  */
        /* JADX WARN: Code duplicated, block: B:62:0x0188  */
        /* JADX WARN: Code duplicated, block: B:88:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c6 -> B:12:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 495
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C05732.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05732(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super C05732> continuation) {
            super(3, continuation);
            this.$recomposeCoroutineContext = coroutineContext;
            this.this$0 = recomposer;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C05732 c05732 = new C05732(this.$recomposeCoroutineContext, this.this$0, continuation);
            c05732.L$0 = coroutineScope;
            c05732.L$1 = monotonicFrameClock;
            return c05732.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object objRecompositionRunner = recompositionRunner(new C05732(coroutineContext, this, null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r5.withFrameNanos(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0093 -> B:23:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r7, androidx.compose.runtime.ProduceFrameSignal r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.runtime.Recomposer.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 + r2
            r0.label = r9
            goto L19
        L14:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.L$3
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.L$1
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L96
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r0.L$3
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$2
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r0.L$1
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L80
        L59:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L6a:
            java.lang.Object r5 = r6.stateLock
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r2
            r0.label = r4
            java.lang.Object r5 = r8.awaitFrameRequest(r5, r0)
            if (r5 == r1) goto L9b
            r5 = r7
            r7 = r2
            r2 = r8
            r8 = r9
        L80:
            androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda5 r9 = new androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda5
            r9.<init>()
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r8
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r9 = r5.withFrameNanos(r9, r0)
            if (r9 != r1) goto L96
            goto L9b
        L96:
            r9 = r8
            r8 = r2
            r2 = r7
            r7 = r5
            goto L6a
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaFormatMustNotUseFrameRateToFindEncoderQuirk runFrameLoop$lambda$51(Recomposer recomposer, List list, List list2, ProduceFrameSignal produceFrameSignal, long j) {
        int i;
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        if (recomposer.getHasBroadcastFrameClockAwaiters()) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
            try {
                recomposer.broadcastFrameClock.sendFrame(j);
                Snapshot.INSTANCE.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th;
            }
        }
        Object objBeginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer.recordComposerModifications();
            synchronized (recomposer.stateLock) {
                List<ControlledComposition> list3 = recomposer.compositionsAwaitingApply;
                int size = list3.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    list2.add(list3.get(i2));
                }
                recomposer.compositionsAwaitingApply.clear();
                MutableVector<ControlledComposition> mutableVector = recomposer.compositionInvalidations;
                ControlledComposition[] controlledCompositionArr = mutableVector.content;
                int size2 = mutableVector.getSize();
                for (int i3 = 0; i3 < size2; i3++) {
                    list.add(controlledCompositionArr[i3]);
                }
                recomposer.compositionInvalidations.clear();
                produceFrameSignal.takeFrameRequestLocked();
                Unit unit2 = Unit.INSTANCE;
            }
            MutableScatterSet<Object> mutableScatterSet = new MutableScatterSet<>(i, 1, null);
            try {
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ControlledComposition controlledCompositionPerformRecompose = recomposer.performRecompose((ControlledComposition) list.get(i4), mutableScatterSet);
                    if (controlledCompositionPerformRecompose != null) {
                        list2.add(controlledCompositionPerformRecompose);
                    }
                }
                list.clear();
                if (!list2.isEmpty()) {
                    recomposer.changeCount++;
                }
                try {
                    int size4 = list2.size();
                    while (i < size4) {
                        ((ControlledComposition) list2.get(i)).applyChanges();
                        i++;
                    }
                    list2.clear();
                    synchronized (recomposer.stateLock) {
                        mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = recomposer.deriveStateLocked();
                    }
                    Trace.INSTANCE.endSection(objBeginSection2);
                    return mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
                } catch (Throwable th2) {
                    list2.clear();
                    throw th2;
                }
            } catch (Throwable th3) {
                list.clear();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.INSTANCE.endSection(objBeginSection2);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.snapshotInvalidations.isNotEmpty() || this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this.stateLock) {
            if (!getHasSchedulingWork()) {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl2 = null;
            }
        }
        if (cancellableContinuationImpl2 != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1159}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    static final class C05712 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Code duplicated, block: B:24:0x0099 A[Catch: all -> 0x00ae, TryCatch #3 {, blocks: (B:22:0x0093, B:24:0x0099, B:25:0x009c), top: B:52:0x0093 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[Catch: all -> 0x00da, TryCatch #2 {, blocks: (B:36:0x00c1, B:38:0x00c7, B:39:0x00ca), top: B:50:0x00c1 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
            ObserverHandle observerHandle;
            Throwable th;
            Object obj2;
            Recomposer recomposer;
            Object obj3;
            Recomposer recomposer2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                observerHandle = (ObserverHandle) this.L$1;
                videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = (VideoMimeInfoBuilder) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    observerHandle.dispose();
                    obj3 = Recomposer.this.stateLock;
                    recomposer2 = Recomposer.this;
                    synchronized (obj3) {
                        if (recomposer2.runnerJob == videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1) {
                            recomposer2.runnerJob = null;
                        }
                        recomposer2.deriveStateLocked();
                    }
                    Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    observerHandle.dispose();
                    obj2 = Recomposer.this.stateLock;
                    recomposer = Recomposer.this;
                    synchronized (obj2) {
                        if (recomposer.runnerJob == videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1) {
                            recomposer.runnerJob = null;
                        }
                        recomposer.deriveStateLocked();
                        Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                        throw th;
                    }
                }
            }
            ResultKt.throwOnFailure(obj);
            videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = VideoMimeInfo.TuitionPaymentFragmentbindingInflater1(((CoroutineScope) this.L$0).getCoroutineContext());
            Recomposer.this.registerRunnerJob(videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1);
            Snapshot.Companion companion = Snapshot.INSTANCE;
            final Recomposer recomposer3 = Recomposer.this;
            ObserverHandle observerHandleRegisterApplyObserver = companion.registerApplyObserver(new Function2() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return Recomposer.C05712.invokeSuspend$lambda$2(recomposer3, (Set) obj4, (Snapshot) obj5);
                }
            });
            Recomposer.INSTANCE.addRunning(Recomposer.this.recomposerInfo);
            try {
                List listKnownCompositions = Recomposer.this.knownCompositions();
                int size = listKnownCompositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ControlledComposition) listKnownCompositions.get(i2)).invalidateAll();
                }
                this.L$0 = videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1;
                this.L$1 = observerHandleRegisterApplyObserver;
                this.label = 1;
                if (CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new C01152(this.$block, this.$parentFrameClock, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = observerHandleRegisterApplyObserver;
                observerHandle.dispose();
                obj3 = Recomposer.this.stateLock;
                recomposer2 = Recomposer.this;
                synchronized (obj3) {
                    if (recomposer2.runnerJob == videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1) {
                        recomposer2.runnerJob = null;
                    }
                    recomposer2.deriveStateLocked();
                    Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                observerHandle = observerHandleRegisterApplyObserver;
                th = th3;
                observerHandle.dispose();
                obj2 = Recomposer.this.stateLock;
                recomposer = Recomposer.this;
                synchronized (obj2) {
                    if (recomposer.runnerJob == videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1) {
                        recomposer.runnerJob = null;
                    }
                    recomposer.deriveStateLocked();
                }
                Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:24:0x0073 A[Catch: all -> 0x00c2, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x001b, B:9:0x0024, B:12:0x0035, B:14:0x0045, B:16:0x0051, B:18:0x005a, B:21:0x0063, B:24:0x0073, B:25:0x0076, B:28:0x007e, B:39:0x00a9, B:29:0x0081, B:30:0x0087, B:32:0x008d, B:35:0x0095, B:38:0x00a5), top: B:50:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: all -> 0x00c2, LOOP:0: B:12:0x0035->B:28:0x007e, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x001b, B:9:0x0024, B:12:0x0035, B:14:0x0045, B:16:0x0051, B:18:0x005a, B:21:0x0063, B:24:0x0073, B:25:0x0076, B:28:0x007e, B:39:0x00a9, B:29:0x0081, B:30:0x0087, B:32:0x008d, B:35:0x0095, B:38:0x00a5), top: B:50:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[EDGE_INSN: B:53:0x00a9->B:39:0x00a9 BREAK  A[LOOP:0: B:12:0x0035->B:28:0x007e], SYNTHETIC] */
        public static final Unit invokeSuspend$lambda$2(Recomposer recomposer, Set set, Snapshot snapshot) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
            synchronized (recomposer.stateLock) {
                if (((State) recomposer._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).compareTo(State.Idle) >= 0) {
                    MutableScatterSet mutableScatterSet = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
                        Object[] objArr = set$runtime.elements;
                        long[] jArr = set$runtime.metadata;
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
                                            Object obj = objArr[(i << 3) + i3];
                                            if (obj instanceof StateObjectImpl) {
                                                ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                                if (((StateObjectImpl) obj).m3694isReadInh_f27i8$runtime(ReaderKind.m3677constructorimpl(1))) {
                                                    mutableScatterSet.add(obj);
                                                }
                                            } else {
                                                mutableScatterSet.add(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (obj2 instanceof StateObjectImpl) {
                                ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                                if (!((StateObjectImpl) obj2).m3694isReadInh_f27i8$runtime(ReaderKind.m3677constructorimpl(1))) {
                                }
                            }
                            mutableScatterSet.add(obj2);
                        }
                    }
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = recomposer.deriveStateLocked();
                } else {
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = null;
                }
            }
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
                Result.Companion companion3 = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", i = {}, l = {1159}, m = "invokeSuspend", n = {}, s = {})
        static final class C01152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01152(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C01152> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01152 c01152 = new C01152(this.$block, this.$parentFrameClock, continuation);
                c01152.L$0 = obj;
                return c01152;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01152) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05712(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C05712> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05712 c05712 = Recomposer.this.new C05712(this.$block, this.$parentFrameClock, continuation);
            c05712.L$0 = obj;
            return c05712;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1(this.broadcastFrameClock, new C05712(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objTuitionPaymentFragmentbindingInflater1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentbindingInflater1 : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.Idle) >= 0) {
                this._state.b(State.ShuttingDown);
            }
            Unit unit = Unit.INSTANCE;
        }
        this.effectJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
    }

    public final void close() {
        if (this.effectJob.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C05702 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0) == State.ShutDown);
        }

        C05702(Continuation<? super C05702> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05702 c05702 = new C05702(continuation);
            c05702.L$0 = obj;
            return c05702;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((C05702) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object join(Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = hasEndOfStreamFlag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCurrentState(), new C05702(null), continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault3 : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void composeInitial$runtime(ControlledComposition p0, Function2<? super Composer, ? super Integer, Unit> p1) throws Throwable {
        boolean z;
        boolean zIsComposing = p0.isComposing();
        synchronized (this.stateLock) {
            if (this._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.ShuttingDown) > 0) {
                boolean zContains = knownCompositionsLocked().contains(p0);
                z = !zContains;
                if (!zContains) {
                    registerCompositionLocked(p0);
                }
            } else {
                z = true;
            }
        }
        try {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(p0), writeObserverOf(p0, null));
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    p0.composeContent(p1);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    synchronized (this.stateLock) {
                        try {
                            if (this._state.TuitionPaymentFragmentspecialinlinedviewModeldefault1().compareTo(State.ShuttingDown) > 0) {
                                if (!knownCompositionsLocked().contains(p0)) {
                                    addKnownCompositionLocked(p0);
                                }
                            } else {
                                unregisterCompositionLocked(p0);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!zIsComposing) {
                        Snapshot.INSTANCE.notifyObjectsInitialized();
                    }
                    try {
                        performInitialMovableContentInserts(p0);
                        try {
                            p0.applyChanges();
                            p0.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            Snapshot.INSTANCE.notifyObjectsInitialized();
                        } catch (Throwable th2) {
                            processCompositionError$default(this, th2, null, false, 6, null);
                        }
                    } catch (Throwable th3) {
                        processCompositionError(th3, p0, true);
                    }
                } catch (Throwable th4) {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th4;
                }
            } catch (Throwable th5) {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                throw th5;
            }
        } catch (Throwable th6) {
            if (z) {
                synchronized (this.stateLock) {
                    unregisterCompositionLocked(p0);
                    Unit unit3 = Unit.INSTANCE;
                }
            }
            processCompositionError(th6, p0, true);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition p0, ShouldPauseCallback p1, ScatterSet<RecomposeScopeImpl> p2) {
        try {
            recordComposerModifications();
            p0.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(p2));
            ShouldPauseCallback andSetShouldPauseCallback = p0.getAndSetShouldPauseCallback(p1);
            try {
                ControlledComposition controlledCompositionPerformRecompose = performRecompose(p0, null);
                if (controlledCompositionPerformRecompose != null) {
                    performInitialMovableContentInserts(p0);
                    controlledCompositionPerformRecompose.applyChanges();
                    controlledCompositionPerformRecompose.applyLateChanges();
                }
                MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.pausedScopes.get();
                MutableScatterSet<RecomposeScopeImpl> mutableScatterSetEmptyScatterSet = mutableScatterSet != null ? mutableScatterSet : ScatterSetKt.emptyScatterSet();
                p0.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
                this.pausedScopes.set(null);
                return mutableScatterSetEmptyScatterSet;
            } catch (Throwable th) {
                p0.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
                throw th;
            }
        } catch (Throwable th2) {
            this.pausedScopes.set(null);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void reportPausedScope$runtime(RecomposeScopeImpl p0) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSetMutableScatterSetOf = this.pausedScopes.get();
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSetMutableScatterSetOf);
        }
        mutableScatterSetMutableScatterSetOf.add(p0);
    }

    private final void performInitialMovableContentInserts(ControlledComposition p0) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(list.get(i).getComposition(), p0)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, p0);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, p0);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition p0, final MutableScatterSet<Object> p1) {
        Set<ControlledComposition> set;
        if (p0.isComposing() || p0.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(p0))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(p0), writeObserverOf(p0, p1));
        try {
            MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
            Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
            if (p1 != null) {
                try {
                    if (p1.isNotEmpty()) {
                        p0.prepareCompose(new Function0() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Recomposer.performRecompose$lambda$69$lambda$68(p1, p0);
                            }
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = p0.recompose();
            mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            if (zRecompose) {
                return p0;
            }
            return null;
        } catch (Throwable th2) {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[LOOP:0: B:5:0x000d->B:15:0x0042, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0045 A[EDGE_INSN: B:19:0x0045->B:16:0x0045 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0042], SYNTHETIC] */
    public static final Unit performRecompose$lambda$69$lambda$68(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        MutableScatterSet mutableScatterSet2 = mutableScatterSet;
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
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
                            controlledComposition.recordWriteOf(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        MutableObjectList mutableObjectListEmptyObjectList;
        synchronized (this.stateLock) {
            if (MultiValueMap.m3624isNotEmptyimpl(this.movableContentRemoved)) {
                ObjectList objectListM3629valuesimpl = MultiValueMap.m3629valuesimpl(this.movableContentRemoved);
                MultiValueMap.m3614clearimpl(this.movableContentRemoved);
                this.movableContentNestedStatesAvailable.clear();
                MultiValueMap.m3614clearimpl(this.movableContentNestedExtractionsPending);
                MutableObjectList mutableObjectList = new MutableObjectList(objectListM3629valuesimpl.getSize());
                Object[] objArr = objectListM3629valuesimpl.content;
                int i2 = objectListM3629valuesimpl._size;
                for (int i3 = 0; i3 < i2; i3++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                    mutableObjectList.add(TuplesKt.to(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                }
                mutableObjectListEmptyObjectList = mutableObjectList;
                this.movableContentStatesAvailable.clear();
            } else {
                mutableObjectListEmptyObjectList = ObjectListKt.emptyObjectList();
            }
        }
        Object[] objArr2 = mutableObjectListEmptyObjectList.content;
        int i4 = mutableObjectListEmptyObjectList._size;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition p0) {
        return new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Recomposer.readObserverOf$lambda$86(p0, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserverOf$lambda$86(ControlledComposition controlledComposition, Object obj) {
        controlledComposition.recordReadOf(obj);
        return Unit.INSTANCE;
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition p0, final MutableScatterSet<Object> p1) {
        return new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Recomposer.writeObserverOf$lambda$87(p0, p1, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeObserverOf$lambda$87(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, Object obj) {
        controlledComposition.recordWriteOf(obj);
        if (mutableScatterSet != null) {
            mutableScatterSet.add(obj);
        }
        return Unit.INSTANCE;
    }

    private final <T> T composing(ControlledComposition p0, MutableScatterSet<Object> p1, Function0<? extends T> p2) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(p0), writeObserverOf(p0, p1));
        try {
            MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
            Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
            try {
                T tInvoke = p2.invoke();
                mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                return tInvoke;
            } catch (Throwable th) {
                mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            throw th2;
        }
    }

    private final void applyAndCheck(MutableSnapshot p0) {
        try {
            if (p0.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            p0.dispose();
        } catch (Throwable th) {
            p0.dispose();
            throw th;
        }
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.snapshotInvalidations.isNotEmpty() || this.compositionInvalidations.getSize() != 0 || this.concurrentCompositionsOutstanding > 0 || !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked() || MultiValueMap.m3624isNotEmptyimpl(this.movableContentRemoved);
        }
        return z;
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked() || MultiValueMap.m3624isNotEmptyimpl(this.movableContentRemoved);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0).compareTo(State.Idle) > 0);
        }

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object awaitIdle(Continuation<? super Unit> continuation) {
        Object objCollect = new lambdaacquireInputBuffer14androidxcameravideointernalencoderEncoderImpl.asBinder(getCurrentState(), new AnonymousClass2(null)).collect(createPersistentInputSurface.INSTANCE, continuation);
        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollect = Unit.INSTANCE;
        }
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void resumeCompositionFrameClock() {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = deriveStateLocked();
            } else {
                mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = null;
            }
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingCallByInformation$runtime() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* JADX INFO: renamed from: getCollectingSourceInformation$runtime */
    public final boolean getCollectingSourceInformation() {
        return ComposerKt.getComposeStackTraceEnabled();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void unregisterComposition$runtime(ControlledComposition p0) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(p0);
            this.compositionInvalidations.remove(p0);
            this.compositionsAwaitingApply.remove(p0);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void invalidate$runtime(ControlledComposition p0) {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(p0)) {
                mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(p0);
                mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = deriveStateLocked();
            }
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void invalidateScope$runtime(RecomposeScopeImpl p0) {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(p0);
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = deriveStateLocked();
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void insertMovableContent$runtime(MovableContentStateReference p0) {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(p0);
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = deriveStateLocked();
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void deletedMovableContent$runtime(MovableContentStateReference p0) {
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked;
        synchronized (this.stateLock) {
            MultiValueMap.m3612addimpl(this.movableContentRemoved, p0.getContent$runtime(), p0);
            if (p0.getNestedReferences$runtime() != null) {
                deletedMovableContent$lambda$96$recordNestedStatesOf(this, p0, p0);
            }
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked = deriveStateLocked();
        }
        if (mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkDeriveStateLocked.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
    }

    private static final void deletedMovableContent$lambda$96$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime = movableContentStateReference2.getNestedReferences$runtime();
        if (nestedReferences$runtime != null) {
            int size = nestedReferences$runtime.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime.get(i);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$96$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006a A[Catch: all -> 0x0071, LOOP:0: B:9:0x002d->B:19:0x006a, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x001a, B:9:0x002d, B:11:0x003d, B:13:0x0049, B:15:0x0052, B:16:0x0062, B:19:0x006a, B:20:0x006d), top: B:26:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:20:0x006d BREAK  A[LOOP:0: B:9:0x002d->B:19:0x006a], SYNTHETIC] */
    @Override // androidx.compose.runtime.CompositionContext
    public final void movableContentStateReleased$runtime(MovableContentStateReference p0, MovableContentState p1, Applier<?> p2) {
        synchronized (this.stateLock) {
            this.movableContentStatesAvailable.set(p0, p1);
            ObjectList<MovableContentStateReference> objectListM3621getimpl = MultiValueMap.m3621getimpl(this.movableContentNestedExtractionsPending, p0);
            if (objectListM3621getimpl.isNotEmpty()) {
                ScatterMap<MovableContentStateReference, MovableContentState> scatterMapExtractNestedStates$runtime = p1.extractNestedStates$runtime(p2, objectListM3621getimpl);
                Object[] objArr = scatterMapExtractNestedStates$runtime.keys;
                Object[] objArr2 = scatterMapExtractNestedStates$runtime.values;
                long[] jArr = scatterMapExtractNestedStates$runtime.metadata;
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
                                    this.movableContentStatesAvailable.set((MovableContentStateReference) obj, (MovableContentState) objArr2[i4]);
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
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void reportRemovedComposition$runtime(ControlledComposition p0) {
        synchronized (this.stateLock) {
            LinkedHashSet linkedHashSet = this.compositionsRemoved;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.compositionsRemoved = linkedHashSet;
            }
            linkedHashSet.add(p0);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final MovableContentState movableContentStateResolve$runtime(MovableContentStateReference p0) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.movableContentStatesAvailable.remove(p0);
        }
        return movableContentStateRemove;
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\n\u0010\t\u001a\u00060\rR\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\n2\n\u0010\t\u001a\u00060\rR\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u0003R$\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\rR\u00020\u000e0\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\b0\"j\b\u0012\u0004\u0012\u00020\b`#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040&8G¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "", "Landroidx/compose/runtime/RecomposerInfo;", "currentRunningRecomposers$runtime", "()Ljava/util/Set;", "", "p0", "", "setHotReloadEnabled$runtime", "(Z)V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "addRunning", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "removeRunning", "saveStateAndDisposeForHotReload$runtime", "()Ljava/lang/Object;", "loadStateAndComposeForHotReload$runtime", "(Ljava/lang/Object;)V", "", "invalidateGroupsWithKey$runtime", "(I)V", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime", "()Ljava/util/List;", "clearErrors$runtime", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/b;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "LstopMediaCodec;", "getRunningRecomposers", "()LstopMediaCodec;", "runningRecomposers"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final stopMediaCodec<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final Set<RecomposerInfo> currentRunningRecomposers$runtime() {
            return (Set) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        public final void setHotReloadEnabled$runtime(boolean p0) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(p0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl p0) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                persistentSetAdd = persistentSet.add(p0);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl p0) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                persistentSetRemove = persistentSet.remove(p0);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1(persistentSet, persistentSetRemove));
        }

        public final Object saveStateAndDisposeForHotReload$runtime() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void loadStateAndComposeForHotReload$runtime(Object p0) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            Intrinsics.checkNotNull(p0, "");
            List list = (List) p0;
            List list2 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((HotReloadable) list.get(i2)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final void invalidateGroupsWithKey$runtime(int p0) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(p0);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final void clearErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition p0, ShouldPauseCallback p1, Function2<? super Composer, ? super Integer, Unit> p2) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = p0.getAndSetShouldPauseCallback(p1);
            try {
                composeInitial$runtime(p0, p2);
                MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.pausedScopes.get();
                MutableScatterSet<RecomposeScopeImpl> mutableScatterSetEmptyScatterSet = mutableScatterSet != null ? mutableScatterSet : ScatterSetKt.emptyScatterSet();
                p0.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
                this.pausedScopes.set(null);
                return mutableScatterSetEmptyScatterSet;
            } catch (Throwable th) {
                p0.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
                throw th;
            }
        } catch (Throwable th2) {
            this.pausedScopes.set(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> p0, MutableScatterSet<Object> p1) {
        Iterator it;
        ArrayList arrayList;
        NestedMovableContent nestedMovableContentRemoveLast;
        HashMap map = new HashMap(p0.size());
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = p0.get(i);
            ControlledComposition composition = movableContentStateReference.getComposition();
            HashMap map2 = map;
            Object arrayList2 = map2.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map2.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(movableContentStateReference);
        }
        HashMap map3 = map;
        Iterator it2 = map3.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            if (controlledComposition.isComposing()) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, p1));
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        ArrayList arrayList3 = new ArrayList(list.size());
                        int size2 = list.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            ArrayList arrayList4 = arrayList3;
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list.get(i2);
                            Iterator it3 = it2;
                            Object objM3626removeLastimpl = MultiValueMap.m3626removeLastimpl(this.movableContentRemoved, movableContentStateReference2.getContent$runtime());
                            MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) objM3626removeLastimpl;
                            if (movableContentStateReference3 != null) {
                                this.movableContentNestedStatesAvailable.usedContainer(movableContentStateReference3);
                            }
                            arrayList4.add(TuplesKt.to(movableContentStateReference2, objM3626removeLastimpl));
                            i2++;
                            it2 = it3;
                            list = list;
                        }
                        it = it2;
                        arrayList = arrayList3;
                        if (ComposeRuntimeFlags.isMovingNestedMovableContentEnabled) {
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Pair<MovableContentStateReference, MovableContentStateReference> pair = arrayList.get(i3);
                                if (pair.getSecond() == null && this.movableContentNestedStatesAvailable.contains(pair.getFirst().getContent$runtime())) {
                                    ArrayList<Pair> arrayList5 = arrayList;
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                    for (Pair pair2 : arrayList5) {
                                        if (pair2.getSecond() == null && (nestedMovableContentRemoveLast = this.movableContentNestedStatesAvailable.removeLast(((MovableContentStateReference) pair2.getFirst()).getContent$runtime())) != null) {
                                            MovableContentStateReference content = nestedMovableContentRemoveLast.getContent();
                                            MultiValueMap.m3612addimpl(this.movableContentNestedExtractionsPending, nestedMovableContentRemoveLast.getContainer(), content);
                                            pair2 = TuplesKt.to(pair2.getFirst(), content);
                                        }
                                        arrayList6.add(pair2);
                                    }
                                    arrayList = arrayList6;
                                    break;
                                }
                            }
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        if (arrayList.get(i4).getSecond() != null) {
                            int size5 = arrayList.size();
                            for (int i5 = 0; i5 < size5; i5++) {
                                if (arrayList.get(i5).getSecond() == null) {
                                    ArrayList arrayList7 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        Pair<MovableContentStateReference, MovableContentStateReference> pair3 = arrayList.get(i6);
                                        MovableContentStateReference first = pair3.getSecond() == null ? pair3.getFirst() : null;
                                        if (first != null) {
                                            arrayList7.add(first);
                                        }
                                    }
                                    ArrayList arrayList8 = arrayList7;
                                    synchronized (this.stateLock) {
                                        CollectionsKt.addAll(this.movableContentAwaitingInsert, arrayList8);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair<MovableContentStateReference, MovableContentStateReference> pair4 = arrayList.get(i7);
                                        if (pair4.getSecond() != null) {
                                            arrayList9.add(pair4);
                                        }
                                    }
                                    arrayList = arrayList9;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit2 = Unit.INSTANCE;
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    it2 = it;
                } catch (Throwable th) {
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                throw th2;
            }
        }
        return CollectionsKt.toList(map3.keySet());
    }
}
