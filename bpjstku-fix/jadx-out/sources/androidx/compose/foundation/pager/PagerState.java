package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.AutoValue_JpegBytes2Disk_In;
import defpackage.AutoValue_ProcessingNode_In;
import defpackage.CaptureNodeIn;
import defpackage.Image2JpegBytes;
import defpackage.SurfaceRequestExternalSyntheticLambda1;
import defpackage.SurfaceRequestExternalSyntheticLambda5;
import defpackage.UseCaseGroupBuilder;
import defpackage.ViewPort;
import defpackage.getPostviewEdge;
import defpackage.getPostviewSurface;
import defpackage.isVirtualCamera;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0019J\u001f\u0010&\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0007JA\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020'2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0*\u0012\u0006\u0012\u0004\u0018\u00010+0(¢\u0006\u0002\b,H\u0096@¢\u0006\u0004\b-\u0010.J\"\u0010/\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0010H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\f*\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\f*\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR+\u0010O\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010NR+\u0010S\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010NR\u0011\u0010V\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010Y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010UR$\u0010g\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bg\u0010e\u001a\u0004\bh\u0010UR\u0016\u0010i\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u0011\u0010m\u001a\u00020j8G¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010o\u001a\u00020n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00100s8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bt\u0010KR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00100s8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bu\u0010KR\u0014\u0010v\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u001fR\u0014\u0010x\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\u001fR\u0014\u0010z\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u001fR\u0011\u0010}\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b{\u0010|R$\u0010~\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b~\u0010e\u001a\u0004\b\u007f\u0010UR\u0018\u0010\u0080\u0001\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010eR\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\"\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0001X\u0081\u0004ø\u0001\u0000¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010K\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R!\u0010\u008e\u0001\u001a\u00030\u0089\u00018AX\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001*\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u0090\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010UR\u0016\u0010\u0092\u0001\u001a\u00020\u00028'X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010UR\u0016\u0010\u0094\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010UR\u0016\u0010\u0096\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010UR\u0016\u0010\u0098\u0001\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010UR\u001e\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0s8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010KR \u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\"\u0010\u009f\u0001\u001a\u00030\u0084\u00018\u0001X\u0081\u0004ø\u0001\u0000¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010K\u001a\u0006\b \u0001\u0010\u0087\u0001R\u0016\u0010¢\u0001\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010XR \u0010¤\u0001\u001a\u00030£\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R'\u0010¨\u0001\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0005\bª\u0001\u0010\u001f\"\u0005\b«\u0001\u0010NR-\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0001@\u0001X\u0081\u000eø\u0001\u0000¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010\u0083\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010²\u0001\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010<R1\u0010¸\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0017\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bµ\u0001\u0010U\"\u0006\b¶\u0001\u0010·\u0001R7\u0010¿\u0001\u001a\u0005\u0018\u00010¹\u00012\t\u0010\u0003\u001a\u0005\u0018\u00010¹\u00018A@CX\u0081\u008e\u0002¢\u0006\u0017\n\u0005\bº\u0001\u0010K\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R \u0010Á\u0001\u001a\u00030À\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0017\u0010È\u0001\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001f\u0010Í\u0001\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u000f\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0005\bÌ\u0001\u0010UR1\u0010Ñ\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0017\n\u0006\bÎ\u0001\u0010´\u0001\u001a\u0005\bÏ\u0001\u0010U\"\u0006\bÐ\u0001\u0010·\u0001R\u001f\u0010Ô\u0001\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u000f\n\u0006\bÒ\u0001\u0010Ë\u0001\u001a\u0005\bÓ\u0001\u0010UR6\u0010Ù\u0001\u001a\u00030Õ\u00012\u0007\u0010\u0003\u001a\u00030Õ\u00018A@AX\u0081\u008e\u0002ø\u0001\u0000¢\u0006\u0017\n\u0005\bÖ\u0001\u0010K\u001a\u0006\b×\u0001\u0010¯\u0001\"\u0006\bØ\u0001\u0010±\u0001R\u0019\u0010Ú\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010©\u0001\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "p0", "", "p1", "<init>", "(IF)V", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "p2", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "cancelPrefetchIfVisibleItemsChanged", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "dispatchRawDelta", "(F)F", "getOffsetDistanceInPages", "(I)F", "isGestureActionMatchesScroll", "(F)Z", "isNotGestureAction", "()Z", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "matchScrollPositionWithKey$foundation_release", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "notifyPrefetch", "(FLandroidx/compose/foundation/pager/PagerLayoutInfo;)V", "performScroll", "requestScrollToPage", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem$foundation_release", "(IFZ)V", "tryRunPrefetch", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "coerceInPageRange", "(I)I", "updateCurrentPage", "(Landroidx/compose/foundation/gestures/ScrollScope;IF)V", "updateTargetPage", "(Landroidx/compose/foundation/gestures/ScrollScope;I)V", "accumulator", "F", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "animatedScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "getCanScrollBackward", "setCanScrollBackward", "(Z)V", "canScrollBackward", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "getCurrentPage", "()I", "currentPage", "getCurrentPageOffsetFraction", "()F", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "firstVisiblePage", "I", "getFirstVisiblePage$foundation_release", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "indexToPrefetch", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/runtime/MutableState;", "isLastScrollBackwardState", "isLastScrollForwardState", "isScrollInProgress", "getLastScrolledBackward", "lastScrolledBackward", "getLastScrolledForward", "lastScrolledForward", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "layoutWithMeasurement", "getLayoutWithMeasurement$foundation_release", "layoutWithoutMeasurement", "", "maxScrollOffset", "J", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "measurementScopeInvalidator", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "minScrollOffset", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "getNumMeasurePasses$foundation_release", "numMeasurePasses", "getPageCount", "pageCount", "getPageSize$foundation_release", "pageSize", "getPageSizeWithSpacing$foundation_release", "pageSizeWithSpacing", "getPageSpacing$foundation_release", "pageSpacing", "pagerLayoutInfoState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "getPositionThresholdFraction$foundation_release", "positionThresholdFraction", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/ui/unit/Constraints;", "premeasureConstraints", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "previousPassDelta", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "(I)V", "programmaticScrollTargetPage", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "settledPage$delegate", "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", "settledPageState$delegate", "getSettledPageState", "setSettledPageState", "settledPageState", "targetPage$delegate", "getTargetPage", "targetPage", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference$delegate", "getUpDownDifference-F1C5BW0$foundation_release", "setUpDownDifference-k-4lQ0M$foundation_release", "upDownDifference", "wasPrefetchingForward"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;
    private final LazyLayoutAnimateScrollScope animatedScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private /* synthetic */ AutoValue_ProcessingNode_In dyn$pageChangedCallback;
    private /* synthetic */ int dyn$previousPage;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<Unit> measurementScopeInvalidator;
    private long minScrollOffset;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<Unit> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    /* JADX INFO: renamed from: programmaticScrollTargetPage$delegate, reason: from kotlin metadata */
    private final MutableIntState programmaticScrollTargetPage;

    /* JADX INFO: renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final MutableState remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: settledPage$delegate, reason: from kotlin metadata */
    private final State settledPage;

    /* JADX INFO: renamed from: settledPageState$delegate, reason: from kotlin metadata */
    private final MutableIntState settledPageState;

    /* JADX INFO: renamed from: targetPage$delegate, reason: from kotlin metadata */
    private final State targetPage;

    /* JADX INFO: renamed from: upDownDifference$delegate, reason: from kotlin metadata */
    private final MutableState upDownDifference;
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 613}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scroll$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {629, 634}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C03661 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C03661(Continuation<? super C03661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.scroll$suspendImpl(PagerState.this, null, null, this);
        }
    }

    public abstract int getPageCount();

    public PagerState(int i, float f, PrefetchScheduler prefetchScheduler) {
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            this.upDownDifference = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3963boximpl(Offset.INSTANCE.m3990getZeroF1C5BW0()), null, 2, null);
            this.animatedScrollScope = PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope(this);
            PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, f, this);
            this.scrollPosition = pagerScrollPosition;
            this.firstVisiblePage = i;
            this.maxScrollOffset = Long.MAX_VALUE;
            this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
                public final Float invoke(float f2) {
                    return Float.valueOf(this.this$0.performScroll(f2));
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Float invoke(Float f2) {
                    return invoke(f2.floatValue());
                }

                {
                    super(1);
                }
            });
            this.prefetchingEnabled = true;
            this.indexToPrefetch = -1;
            this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
            this.density = PagerStateKt.UnitDensity;
            this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
            this.programmaticScrollTargetPage = SnapshotIntStateKt.mutableIntStateOf(-1);
            this.settledPageState = SnapshotIntStateKt.mutableIntStateOf(i);
            this.settledPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    int currentPage;
                    if (this.this$0.isScrollInProgress()) {
                        currentPage = this.this$0.getSettledPageState();
                    } else {
                        currentPage = this.this$0.getCurrentPage();
                    }
                    return Integer.valueOf(currentPage);
                }

                {
                    super(0);
                }
            });
            this.targetPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Code duplicated, block: B:13:0x0048  */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    int currentPage;
                    if (this.this$0.isScrollInProgress()) {
                        if (this.this$0.getProgrammaticScrollTargetPage() != -1) {
                            currentPage = this.this$0.getProgrammaticScrollTargetPage();
                        } else if (Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction$foundation_release())) {
                            if (this.this$0.getLastScrolledForward()) {
                                currentPage = this.this$0.getFirstVisiblePage() + 1;
                            } else {
                                currentPage = this.this$0.getFirstVisiblePage();
                            }
                        } else {
                            currentPage = this.this$0.getCurrentPage();
                        }
                    } else {
                        currentPage = this.this$0.getCurrentPage();
                    }
                    return Integer.valueOf(this.this$0.coerceInPageRange(currentPage));
                }

                {
                    super(0);
                }
            });
            this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
            this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
            this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
            this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
                @Override // androidx.compose.ui.layout.RemeasurementModifier
                public final void onRemeasurementAvailable(Remeasurement p0) {
                    this.this$0.setRemeasurement(p0);
                }
            };
            this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.pinnedPages = new LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            this.placementScopeInvalidator = ObservableScopeInvalidator.m1179constructorimpl$default(null, 1, null);
            this.measurementScopeInvalidator = ObservableScopeInvalidator.m1179constructorimpl$default(null, 1, null);
            this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder("currentPageOffsetFraction ");
        sb.append(f);
        sb.append(" is not within the range -0.5 to 0.5");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public /* synthetic */ PagerState(int i, float f, PrefetchScheduler prefetchScheduler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public PagerState(int i, float f) {
        this(i, f, null);
    }

    /* JADX INFO: renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1250getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference.getValue()).m3984unboximpl();
    }

    /* JADX INFO: renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m1252setUpDownDifferencek4lQ0M$foundation_release(long j) {
        this.upDownDifference.setValue(Offset.m3963boximpl(j));
    }

    /* JADX INFO: renamed from: getFirstVisiblePage$foundation_release, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* JADX INFO: renamed from: getFirstVisiblePageOffset$foundation_release, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float p0) {
        long jCurrentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f = this.accumulator + p0;
        long jRoundToLong = MathKt.roundToLong(f);
        this.accumulator = f - jRoundToLong;
        if (Math.abs(p0) < 1.0E-4f) {
            return p0;
        }
        long j = jRoundToLong + jCurrentAbsoluteScrollOffset;
        long jCoerceIn = RangesKt.coerceIn(j, this.minScrollOffset, this.maxScrollOffset);
        boolean z = j != jCoerceIn;
        long j2 = jCoerceIn - jCurrentAbsoluteScrollOffset;
        float f2 = j2;
        this.previousPassDelta = f2;
        if (Math.abs(j2) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f2 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f2 < 0.0f));
        }
        PagerMeasureResult value = this.pagerLayoutInfoState.getValue();
        int i = (int) j2;
        if (value.tryToApplyScrollWithoutRemeasure(-i)) {
            applyMeasureResult$foundation_release(value, true);
            ObservableScopeInvalidator.m1183invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z ? Long.valueOf(j2) : Float.valueOf(p0)).floatValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    /* JADX INFO: renamed from: getLayoutWithMeasurement$foundation_release, reason: from getter */
    public final int getLayoutWithMeasurement() {
        return this.layoutWithMeasurement;
    }

    /* JADX INFO: renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    /* JADX INFO: renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density density) {
        this.density = density;
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo694toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    /* JADX INFO: renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage.getIntValue();
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.programmaticScrollTargetPage.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState.getIntValue();
    }

    private final void setSettledPageState(int i) {
        this.settledPageState.setIntValue(i);
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    /* JADX INFO: renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* JADX INFO: renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    /* JADX INFO: renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    /* JADX INFO: renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m1251setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.premeasureConstraints = j;
    }

    /* JADX INFO: renamed from: getPinnedPages$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1248getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PagerState.this.awaitScrollDependencies(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            float f = this.$pageOffsetFraction;
            double d = f;
            if (-0.5d <= d && d <= 0.5d) {
                PagerState.this.snapToItem$foundation_release(PagerState.this.coerceInPageRange(this.$page), this.$pageOffsetFraction, true);
                return Unit.INSTANCE;
            }
            StringBuilder sb = new StringBuilder("pageOffsetFraction ");
            sb.append(f);
            sb.append(" is not within the range -0.5 to 0.5");
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$pageOffsetFraction = f;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PagerState.this.new AnonymousClass2(this.$pageOffsetFraction, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    public final void updateCurrentPage(ScrollScope scrollScope, int i, float f) {
        snapToItem$foundation_release(i, f, true);
    }

    public final void updateTargetPage(ScrollScope scrollScope, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public final void snapToItem$foundation_release(int p0, float p1, boolean p2) {
        this.scrollPosition.requestPositionAndForgetLastKnownKey(p0, p1);
        if (p2) {
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.m1183invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1247getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.requestScrollToPage(i, f);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerState$requestScrollToPage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", i = {}, l = {576}, m = "invokeSuspend", n = {}, s = {})
    static final class C03651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(PagerState.this, null, this, 1, null) == coroutine_suspended) {
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

        C03651(Continuation<? super C03651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PagerState.this.new C03651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C03651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void requestScrollToPage(int p0, float p1) {
        if (isScrollInProgress()) {
            b.TuitionPaymentFragmentbindingInflater1(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new C03651(null), 3, null);
        }
        snapToItem$foundation_release(p0, p1, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (androidx.compose.foundation.pager.PagerStateKt.animateScrollToPage(r13, r10, r11 * r12, r4, r5, r6) == r0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r10, float r11, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.pager.PagerState.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r13
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 + r2
            r0.label = r13
            goto L19
        L14:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r13)
        L19:
            r6 = r0
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.throwOnFailure(r13)
            goto La6
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            float r11 = r6.F$0
            int r10 = r6.I$0
            java.lang.Object r12 = r6.L$1
            androidx.compose.animation.core.AnimationSpec r12 = (androidx.compose.animation.core.AnimationSpec) r12
            java.lang.Object r1 = r6.L$0
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            kotlin.ResultKt.throwOnFailure(r13)
        L46:
            r4 = r12
            goto L74
        L48:
            kotlin.ResultKt.throwOnFailure(r13)
            int r13 = r9.getCurrentPage()
            if (r10 != r13) goto L59
            float r13 = r9.getCurrentPageOffsetFraction()
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 == 0) goto L5f
        L59:
            int r13 = r9.getPageCount()
            if (r13 != 0) goto L62
        L5f:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L62:
            r6.L$0 = r9
            r6.L$1 = r12
            r6.I$0 = r10
            r6.F$0 = r11
            r6.label = r3
            java.lang.Object r13 = r9.awaitScrollDependencies(r6)
            if (r13 == r0) goto Lc6
            r1 = r9
            goto L46
        L74:
            double r12 = (double) r11
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 > 0) goto La9
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 > 0) goto La9
            int r10 = r1.coerceInPageRange(r10)
            int r12 = r1.getPageSizeWithSpacing$foundation_release()
            float r12 = (float) r12
            androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope r13 = r1.animatedScrollScope
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r3.<init>()
            r5 = r3
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            float r3 = r11 * r12
            r1 = r13
            r2 = r10
            java.lang.Object r10 = androidx.compose.foundation.pager.PagerStateKt.access$animateScrollToPage(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto La6
            goto Lc6
        La6:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        La9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "pageOffsetFraction "
            r10.<init>(r12)
            r10.append(r11)
            java.lang.String r11 = " is not within the range -0.5 to 0.5"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(Continuation<? super Unit> continuation) throws Throwable {
        Object objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
        return objWaitForFirstLayout == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWaitForFirstLayout : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState.C03661
            if (r0 == 0) goto L14
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState.C03661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 + r2
            r0.label = r8
            goto L19
        L14:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L4b:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 == r1) goto L82
        L5c:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L69
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L69:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L7b
            goto L82
        L7b:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float p0) {
        return this.scrollableState.dispatchRawDelta(p0);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z);
    }

    public final void applyMeasureResult$foundation_release(PagerMeasureResult p0, boolean p1) {
        if (p1) {
            this.scrollPosition.updateCurrentPageOffsetFraction(p0.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(p0);
            cancelPrefetchIfVisibleItemsChanged(p0);
        }
        this.pagerLayoutInfoState.setValue(p0);
        setCanScrollForward(p0.getCanScrollForward());
        setCanScrollBackward(p0.getCanScrollBackward());
        MeasuredPage firstVisiblePage = p0.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = p0.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(p0);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(p0, getPageCount());
        this.minScrollOffset = PagerStateKt.calculateNewMinScrollOffset(p0, getPageCount());
    }

    private final void tryRunPrefetch(PagerMeasureResult p0) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                notifyPrefetch(this.previousPassDelta, p0);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final boolean isGestureActionMatchesScroll(float p0) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(p0) == Math.signum(-Offset.m3975getYimpl(m1250getUpDownDifferenceF1C5BW0$foundation_release()))) {
                return true;
            }
        } else if (Math.signum(p0) == Math.signum(-Offset.m3974getXimpl(m1250getUpDownDifferenceF1C5BW0$foundation_release()))) {
            return true;
        }
        return isNotGestureAction();
    }

    private final boolean isNotGestureAction() {
        return ((int) Offset.m3974getXimpl(m1250getUpDownDifferenceF1C5BW0$foundation_release())) == 0 && ((int) Offset.m3975getYimpl(m1250getUpDownDifferenceF1C5BW0$foundation_release())) == 0;
    }

    private final void notifyPrefetch(float p0, PagerLayoutInfo p1) {
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (!this.prefetchingEnabled || p1.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        boolean z = p0 > 0.0f;
        if (z) {
            index = ((PageInfo) CollectionsKt.last((List) p1.getVisiblePagesInfo())).getIndex() + p1.getBeyondViewportPageCount() + 1;
        } else {
            index = (((PageInfo) CollectionsKt.first((List) p1.getVisiblePagesInfo())).getIndex() - p1.getBeyondViewportPageCount()) - 1;
        }
        if (index < 0 || index >= getPageCount()) {
            return;
        }
        if (index != this.indexToPrefetch) {
            if (this.wasPrefetchingForward != z && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                prefetchHandle3.cancel();
            }
            this.wasPrefetchingForward = z;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = this.prefetchState.m1174schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
        }
        if (z) {
            if ((((PageInfo) CollectionsKt.last((List) p1.getVisiblePagesInfo())).getOffset() + (p1.getPageSize() + p1.getPageSpacing())) - p1.getViewportEndOffset() >= p0 || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle2.markAsUrgent();
            return;
        }
        if (p1.getViewportStartOffset() - ((PageInfo) CollectionsKt.first((List) p1.getVisiblePagesInfo())).getOffset() >= (-p0) || (prefetchHandle = this.currentPrefetchHandle) == null) {
            return;
        }
        prefetchHandle.markAsUrgent();
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo p0) {
        int index;
        if (this.indexToPrefetch == -1 || p0.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.wasPrefetchingForward) {
            index = ((PageInfo) CollectionsKt.last((List) p0.getVisiblePagesInfo())).getIndex() + p0.getBeyondViewportPageCount() + 1;
        } else {
            index = (((PageInfo) CollectionsKt.first((List) p0.getVisiblePagesInfo())).getIndex() - p0.getBeyondViewportPageCount()) - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public final float getOffsetDistanceInPages(int p0) {
        if (p0 < 0 || p0 > getPageCount()) {
            StringBuilder sb = new StringBuilder("page ");
            sb.append(p0);
            sb.append(" is not within the range 0 to ");
            sb.append(getPageCount());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return (p0 - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i2 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                i = currentPage;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i);
    }

    public final int matchScrollPositionWithKey$foundation_release(PagerLazyLayoutItemProvider p0, int p1) {
        return this.scrollPosition.matchPageWithKey(p0, p1);
    }

    public final Object scrollToPage(int i, float f, Continuation<? super Unit> continuation) {
        String string;
        AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = this.dyn$pageChangedCallback;
        if (autoValue_ProcessingNode_In != null) {
            int i2 = this.dyn$previousPage;
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
                UseCaseGroupBuilder useCaseGroupBuilder = new UseCaseGroupBuilder(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Image2JpegBytes image2JpegBytes = new Image2JpegBytes();
                AutoValue_JpegBytes2Disk_In autoValue_JpegBytes2Disk_In = new AutoValue_JpegBytes2Disk_In(i, i2, autoValue_ProcessingNode_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str = autoValue_ProcessingNode_In.TuitionPaymentFragmentbindingInflater1;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("onUA: ".concat(String.valueOf(autoValue_JpegBytes2Disk_In)));
                }
                UseCaseGroupBuilder useCaseGroupBuilder2 = useCaseGroupBuilder;
                Image2JpegBytes image2JpegBytes2 = image2JpegBytes;
                isVirtualCamera isvirtualcamera = isVirtualCamera.INSTANCE;
                Modifier modifier = autoValue_ProcessingNode_In.b;
                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                semanticsConfiguration.set(SemanticsProperties.INSTANCE.getContentDescription(), arrayList);
                semanticsConfiguration.set(SemanticsProperties.INSTANCE.getText(), arrayList2);
                String strB = isvirtualcamera.b(semanticsConfiguration);
                boolean z = autoValue_ProcessingNode_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                getPostviewEdge getpostviewedge = new getPostviewEdge(useCaseGroupBuilder2, image2JpegBytes2, autoValue_JpegBytes2Disk_In, strB, false);
                getPostviewSurface getpostviewsurface = getpostviewedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                AutoValue_JpegBytes2Disk_In autoValue_JpegBytes2Disk_In2 = getpostviewedge.b;
                String str2 = getpostviewedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                boolean z2 = !getpostviewedge.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Intrinsics.checkNotNullParameter(autoValue_JpegBytes2Disk_In2, "");
                if (str2 == null || z2) {
                    StringBuilder sb = new StringBuilder("Swipe to page index ");
                    sb.append(autoValue_JpegBytes2Disk_In2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    string = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder("Swipe ");
                    sb2.append(str2);
                    sb2.append(" to page index ");
                    sb2.append(autoValue_JpegBytes2Disk_In2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    string = sb2.toString();
                }
                CaptureNodeIn captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getpostviewsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, getpostviewedge.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("orientation", getpostviewedge.b.TuitionPaymentFragmentbindingInflater1.name());
                captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("fromState", String.valueOf(getpostviewedge.b.b));
                captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("toState", String.valueOf(getpostviewedge.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("type", "pager");
                captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
            }
        }
        this.dyn$previousPage = i;
        Object objScroll$default = ScrollableState.scroll$default(this, null, new AnonymousClass2(f, i, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    public final /* synthetic */ void dyn$setPageChangedCallback(AutoValue_ProcessingNode_In autoValue_ProcessingNode_In) {
        this.dyn$pageChangedCallback = autoValue_ProcessingNode_In;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }
}
