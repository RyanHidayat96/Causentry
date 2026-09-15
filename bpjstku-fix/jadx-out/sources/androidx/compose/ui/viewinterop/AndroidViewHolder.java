package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.C0654ViewTreeLifecycleOwner;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p013savedstate.C0681ViewTreeSavedStateRegistryOwner;
import androidx.p013savedstate.SavedStateRegistryOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 ¼\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002¼\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001cJ7\u0010#\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0014¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010+\u001a\u00020\u001aH\u0014¢\u0006\u0004\b+\u0010\u001cJ%\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0007\u001a\u0004\u0018\u00010,2\b\u0010\t\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u001a¢\u0006\u0004\b3\u0010\u001cJ\u0017\u00104\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\nH\u0014¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u00020\"2\b\u0010\u0007\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\"H\u0016¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010@J/\u0010A\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010DJG\u0010F\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010E\u001a\u00020,H\u0016¢\u0006\u0004\bF\u0010GJ?\u0010F\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010HJ7\u0010I\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010JJ/\u0010L\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020K2\u0006\u0010\u000b\u001a\u00020K2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020K2\u0006\u0010\u000b\u001a\u00020KH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\"H\u0016¢\u0006\u0004\bP\u0010<J\u001f\u0010R\u001a\u00020Q2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020QH\u0017¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020Q2\u0006\u0010\u0007\u001a\u00020QH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJX\u0010\\\u001a\u00028\u0000\"\u0004\b\u0000\u0010Y2\u0006\u0010\u0007\u001a\u00028\u000028\u0010\t\u001a4\u0012\t\u0012\u00070\n¢\u0006\u0002\b[\u0012\t\u0012\u00070\n¢\u0006\u0002\b[\u0012\t\u0012\u00070\n¢\u0006\u0002\b[\u0012\t\u0012\u00070\n¢\u0006\u0002\b[\u0012\u0004\u0012\u00028\u00000ZH\u0082\b¢\u0006\u0004\b\\\u0010]J3\u0010_\u001a\u00020^*\u00020^2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010\u0016R\u0014\u0010h\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010iR6\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001a0j2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0j8\u0007@EX\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bq\u0010rR6\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001a0j2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0j8\u0007@EX\u0087\u000e¢\u0006\u0012\n\u0004\bs\u0010l\u001a\u0004\bt\u0010n\"\u0004\bu\u0010pR6\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001a0j2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0j8\u0007@EX\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010l\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR*\u0010z\u001a\u00020y2\u0006\u0010\u0007\u001a\u00020y8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR8\u0010\u0081\u0001\u001a\u0011\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0080\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R3\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0007\u001a\u00030\u0087\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R9\u0010\u008e\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0087\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0080\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0082\u0001\u001a\u0006\b\u008f\u0001\u0010\u0084\u0001\"\u0006\b\u0090\u0001\u0010\u0086\u0001R7\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00012\t\u0010\u0007\u001a\u0005\u0018\u00010\u0091\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R7\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u0007\u001a\u0005\u0018\u00010\u0098\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010\u009f\u0001\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010¢\u0001\u001a\u00030¡\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010©\u0001\u001a\u00030¦\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0j8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bª\u0001\u0010lR\u001c\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0j8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b«\u0001\u0010lR8\u0010¬\u0001\u001a\u0011\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0080\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u0082\u0001\u001a\u0006\b\u00ad\u0001\u0010\u0084\u0001\"\u0006\b®\u0001\u0010\u0086\u0001R\u0017\u0010¯\u0001\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010 \u0001R\u0018\u0010°\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010bR\u0018\u0010±\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010bR\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0018\u0010µ\u0001\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010rR\u0016\u0010¶\u0001\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010<R \u0010¸\u0001\u001a\u00030·\u00018\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "p0", "Landroidx/compose/runtime/CompositionContext;", "p1", "", "p2", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "p3", "Landroid/view/View;", "p4", "Landroidx/compose/ui/node/Owner;", "p5", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "onReuse", "()V", "onDeactivate", "onRelease", "onMeasure", "(II)V", "remeasure", "", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "Landroid/graphics/Rect;", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "invalidateOrDefer", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "obtainMeasureSpec", "(III)I", "shouldDelayChildPressedState", "()Z", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "p6", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "insetToLayoutPosition", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "insetBounds", "(Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function4;", "Lkotlin/ParameterName;", "insetValue", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Landroidx/core/graphics/Insets;", "inset", "(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;", "compositeKeyHash", "I", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "view", "Landroid/view/View;", "getView", "owner", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "update", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "hasUpdateBlock", "Z", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Lkotlin/Function1;", "onModifierChanged", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "onDensityChanged", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "position", "[I", "Landroidx/compose/ui/unit/IntSize;", "size", "J", "insets", "Landroidx/core/view/WindowInsetsCompat;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "runUpdate", "runInvalidate", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", FirebaseAnalytics.Param.LOCATION, "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/NestedScrollingParentHelper;", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "isDrawing", "isValidOwnerScope", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private Function1<? super Density, Unit> onDensityChanged;
    private Function1<? super Modifier, Unit> onModifierChanged;
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private Function0<Unit> release;
    private Function0<Unit> reset;
    private final Function0<Unit> runInvalidate;
    private final Function0<Unit> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;
    private Function0<Unit> update;
    private final View view;
    public static final int $stable = 8;
    private static final Function1<AndroidViewHolder, Unit> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View p0, View p1, int p2, int p3) {
        return ((p2 & 2) == 0 && (p2 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final View getView() {
        return this.view;
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AndroidViewHolder androidViewHolder = this;
        ViewCompat.setWindowInsetsAnimationCallback(androidViewHolder, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat p0, WindowInsetsAnimationCompat.BoundsCompat p1) {
                return AndroidViewHolder.this.insetBounds(p1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public final WindowInsetsCompat onProgress(WindowInsetsCompat p0, List<WindowInsetsAnimationCompat> p1) {
                return AndroidViewHolder.this.insetToLayoutPosition(p0);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(androidViewHolder, this);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.modifier = Modifier.INSTANCE;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.INSTANCE.m7111getZeroYbymL2g();
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder2 = this.this$0;
                    if (parent == androidViewHolder2) {
                        androidViewHolder2.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }

            {
                super(0);
            }
        };
        this.runInvalidate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getLayoutNode().invalidateLayer$ui_release();
            }

            {
                super(0);
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(Modifier.INSTANCE, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), this), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder3 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder2.getView().getVisibility() != 8) {
                    androidViewHolder2.isDrawing = true;
                    Owner owner2 = layoutNode2.getOwner();
                    AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder3, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder2.isDrawing = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                WindowInsets windowInsets;
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
                int i2 = this.$this_run.position[0];
                int i3 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j = this.$this_run.size;
                this.$this_run.size = layoutCoordinates.mo5645getSizeYbymL2g();
                WindowInsetsCompat windowInsetsCompat = this.$this_run.insets;
                if (windowInsetsCompat != null) {
                    if ((i2 == this.$this_run.position[0] && i3 == this.$this_run.position[1] && IntSize.m7104equalsimpl0(j, this.$this_run.size)) || (windowInsets = this.$this_run.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsets);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                invoke2(modifier);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Density density) {
                layoutNode.setDensity(density);
            }

            {
                super(1);
            }
        };
        layoutNode.setOnAttach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                if (parent != androidViewHolder2) {
                    androidViewHolder2.addView(androidViewHolder2.getView());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        layoutNode.setOnDetach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                if (ComposeUiFlags.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
                    owner2.getFocusOwner().clearFocus(true);
                }
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }

            {
                super(1);
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo359measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m6890getMinWidthimpl(j), Constraints.m6889getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                if (Constraints.m6890getMinWidthimpl(j) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m6890getMinWidthimpl(j));
                }
                if (Constraints.m6889getMinHeightimpl(j) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m6889getMinHeightimpl(j));
                }
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
                int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iObtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(iM6890getMinWidthimpl, iM6888getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder3 = this.$this_run;
                int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
                int iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder2.measure(iObtainMeasureSpec, androidViewHolder3.obtainMeasureSpec(iM6889getMinHeightimpl, iM6887getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder4 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder4, layoutNode2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            private final int intrinsicWidth(int p0) {
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder3 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder3.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder2.measure(iMakeMeasureSpec, androidViewHolder3.obtainMeasureSpec(0, p0, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            private final int intrinsicHeight(int p0) {
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder2.measure(androidViewHolder2.obtainMeasureSpec(0, p0, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    protected final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    protected final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    protected final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            C0654ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            C0681ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int p0, int p1) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(p0), View.MeasureSpec.getSize(p1));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(p0, p1);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = p0;
        this.lastHeightMeasureSpec = p1;
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        this.view.layout(0, 0, p3 - p1, p4 - p2);
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean p0) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(p0));
        }
        super.requestDisallowInterceptTouchEvent(p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] p0, Rect p1) {
        super.invalidateChildInParent(p0, p1);
        invalidateOrDefer();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View p0, View p1) {
        super.onDescendantInvalidated(p0, p1);
        invalidateOrDefer();
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            View view = this.view;
            final Function0<Unit> function0 = this.runInvalidate;
            view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    function0.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int p0) {
        super.onWindowVisibilityChanged(p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region p0) {
        if (p0 == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        p0.op(i, i2, i + width, this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int p0, int p1, int p2) {
        if (p2 >= 0 || p0 == p1) {
            return View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(p2, p0, p1), BasicMeasure.EXACTLY);
        }
        if (p2 == -2 && p1 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(p1, Integer.MIN_VALUE);
        }
        if (p2 == -1 && p1 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(p1, BasicMeasure.EXACTLY);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View p0, View p1, int p2, int p3) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(p0, p1, p2, p3);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View p0, int p1) {
        this.nestedScrollingParentHelper.onStopNestedScroll(p0, p1);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View p0, int p1, int p2, int p3, int p4, int p5, int[] p6) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(p1);
            long jM3966constructorimpl = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(p2))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset)) << 32));
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(p3);
            long jM5383dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m5383dispatchPostScrollDzOQY0M(jM3966constructorimpl, Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(p4))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset2)) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(p5));
            p6[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM5383dispatchPostScrollDzOQY0M >> 32)));
            p6[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM5383dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View p0, int p1, int p2, int p3, int p4, int p5) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(p1);
            long jM3966constructorimpl = Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(p2))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset)) << 32));
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(p3);
            nestedScrollDispatcher.m5383dispatchPostScrollDzOQY0M(jM3966constructorimpl, Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(p4))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset2)) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(p5));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View p0, int p1, int p2, int[] p3, int p4) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(p1);
            long jM5385dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m5385dispatchPreScrollOzD1aCk(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(p2))) & 4294967295L) | (((long) Float.floatToRawIntBits(composeOffset)) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(p4));
            p3[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM5385dispatchPreScrollOzD1aCk >> 32)));
            p3[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM5385dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View p0, float p1, float p2, boolean p3) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        b.TuitionPaymentFragmentbindingInflater1(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(p3, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(p1), AndroidViewHolder_androidKt.toComposeVelocity(p2)), null), 3, null);
        return false;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {617, 619}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r11 != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (r11 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r11)
                goto L5e
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L3e
            L1e:
                kotlin.ResultKt.throwOnFailure(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L44
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r5 = r11.m7184getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r9 = r10
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r10.label = r3
                java.lang.Object r11 = r4.m5382dispatchPostFlingRZ2iAVY(r5, r7, r9)
                if (r11 == r0) goto L5d
            L3e:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.getPackedValue()
                goto L63
            L44:
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r3 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                long r4 = r10.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r6 = r11.m7184getZero9UxMQ8M()
                r8 = r10
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r10.label = r2
                java.lang.Object r11 = r3.m5382dispatchPostFlingRZ2iAVY(r4, r6, r8)
                if (r11 != r0) goto L5e
            L5d:
                return r0
            L5e:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.getPackedValue()
            L63:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$consumed = z;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View p0, float p1, float p2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        b.TuitionPaymentFragmentbindingInflater1(this.dispatcher.getCoroutineScope(), null, null, new C06111(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(p1), AndroidViewHolder_androidKt.toComposeVelocity(p2)), null), 3, null);
        return false;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {628}, m = "invokeSuspend", n = {}, s = {})
    static final class C06111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AndroidViewHolder.this.dispatcher.m5384dispatchPreFlingQWom1Mo(this.$toBeConsumed, this) == coroutine_suspended) {
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
        C06111(long j, Continuation<? super C06111> continuation) {
            super(2, continuation);
            this.$toBeConsumed = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidViewHolder.this.new C06111(this.$toBeConsumed, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        this.insets = new WindowInsetsCompat(p1);
        return insetToLayoutPosition(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat p0) {
        if (p0.hasInsets()) {
            NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
            if (innerCoordinator$ui_release.isAttached()) {
                NodeCoordinator nodeCoordinator = innerCoordinator$ui_release;
                long jM7080roundk4lQ0M = IntOffsetKt.m7080roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
                int iM7063getXimpl = IntOffset.m7063getXimpl(jM7080roundk4lQ0M);
                if (iM7063getXimpl < 0) {
                    iM7063getXimpl = 0;
                }
                int iM7064getYimpl = IntOffset.m7064getYimpl(jM7080roundk4lQ0M);
                if (iM7064getYimpl < 0) {
                    iM7064getYimpl = 0;
                }
                long jMo5645getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo5645getSizeYbymL2g();
                int i = (int) (jMo5645getSizeYbymL2g >> 32);
                int i2 = (int) (jMo5645getSizeYbymL2g & 4294967295L);
                long jMo5645getSizeYbymL2g2 = innerCoordinator$ui_release.mo5645getSizeYbymL2g();
                long jM7080roundk4lQ0M2 = IntOffsetKt.m7080roundk4lQ0M(innerCoordinator$ui_release.mo5648localToRootMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits((int) (jMo5645getSizeYbymL2g2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jMo5645getSizeYbymL2g2 >> 32))) << 32))));
                int iM7063getXimpl2 = i - IntOffset.m7063getXimpl(jM7080roundk4lQ0M2);
                if (iM7063getXimpl2 < 0) {
                    iM7063getXimpl2 = 0;
                }
                int iM7064getYimpl2 = i2 - IntOffset.m7064getYimpl(jM7080roundk4lQ0M2);
                int i3 = iM7064getYimpl2 < 0 ? 0 : iM7064getYimpl2;
                if (iM7063getXimpl != 0 || iM7064getYimpl != 0 || iM7063getXimpl2 != 0 || i3 != 0) {
                    return p0.inset(iM7063getXimpl, iM7064getYimpl, iM7063getXimpl2, i3);
                }
            }
        }
        return p0;
    }

    private final <T> T insetValue(T p0, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> p1) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            NodeCoordinator nodeCoordinator = innerCoordinator$ui_release;
            long jM7080roundk4lQ0M = IntOffsetKt.m7080roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
            int iM7063getXimpl = IntOffset.m7063getXimpl(jM7080roundk4lQ0M);
            if (iM7063getXimpl < 0) {
                iM7063getXimpl = 0;
            }
            int iM7064getYimpl = IntOffset.m7064getYimpl(jM7080roundk4lQ0M);
            if (iM7064getYimpl < 0) {
                iM7064getYimpl = 0;
            }
            long jMo5645getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo5645getSizeYbymL2g();
            int i = (int) (jMo5645getSizeYbymL2g >> 32);
            int i2 = (int) (jMo5645getSizeYbymL2g & 4294967295L);
            long jMo5645getSizeYbymL2g2 = innerCoordinator$ui_release.mo5645getSizeYbymL2g();
            long jM7080roundk4lQ0M2 = IntOffsetKt.m7080roundk4lQ0M(innerCoordinator$ui_release.mo5648localToRootMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits((int) (jMo5645getSizeYbymL2g2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jMo5645getSizeYbymL2g2 >> 32))) << 32))));
            int iM7063getXimpl2 = i - IntOffset.m7063getXimpl(jM7080roundk4lQ0M2);
            if (iM7063getXimpl2 < 0) {
                iM7063getXimpl2 = 0;
            }
            int iM7064getYimpl2 = i2 - IntOffset.m7064getYimpl(jM7080roundk4lQ0M2);
            int i3 = iM7064getYimpl2 >= 0 ? iM7064getYimpl2 : 0;
            if (iM7063getXimpl != 0 || iM7064getYimpl != 0 || iM7063getXimpl2 != 0 || i3 != 0) {
                return p1.invoke(Integer.valueOf(iM7063getXimpl), Integer.valueOf(iM7064getYimpl), Integer.valueOf(iM7063getXimpl2), Integer.valueOf(i3));
            }
        }
        return p0;
    }

    private final Insets inset(Insets insets, int i, int i2, int i3, int i4) {
        int i5 = insets.left - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = insets.top - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = insets.right - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = insets.bottom - i4;
        return Insets.of(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat p0) {
        NodeCoordinator innerCoordinator$ui_release = this.layoutNode.getInnerCoordinator$ui_release();
        if (innerCoordinator$ui_release.isAttached()) {
            NodeCoordinator nodeCoordinator = innerCoordinator$ui_release;
            long jM7080roundk4lQ0M = IntOffsetKt.m7080roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(nodeCoordinator));
            int iM7063getXimpl = IntOffset.m7063getXimpl(jM7080roundk4lQ0M);
            int i = iM7063getXimpl < 0 ? 0 : iM7063getXimpl;
            int iM7064getYimpl = IntOffset.m7064getYimpl(jM7080roundk4lQ0M);
            int i2 = iM7064getYimpl < 0 ? 0 : iM7064getYimpl;
            long jMo5645getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).mo5645getSizeYbymL2g();
            int i3 = (int) (jMo5645getSizeYbymL2g >> 32);
            int i4 = (int) (jMo5645getSizeYbymL2g & 4294967295L);
            long jMo5645getSizeYbymL2g2 = innerCoordinator$ui_release.mo5645getSizeYbymL2g();
            long jM7080roundk4lQ0M2 = IntOffsetKt.m7080roundk4lQ0M(innerCoordinator$ui_release.mo5648localToRootMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits((int) (jMo5645getSizeYbymL2g2 >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (jMo5645getSizeYbymL2g2 & 4294967295L)))))));
            int iM7063getXimpl2 = i3 - IntOffset.m7063getXimpl(jM7080roundk4lQ0M2);
            int i5 = iM7063getXimpl2 < 0 ? 0 : iM7063getXimpl2;
            int iM7064getYimpl2 = i4 - IntOffset.m7064getYimpl(jM7080roundk4lQ0M2);
            int i6 = iM7064getYimpl2 >= 0 ? iM7064getYimpl2 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i6 != 0) {
                int i7 = i;
                int i8 = i2;
                int i9 = i5;
                int i10 = i6;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(p0.getLowerBound(), i7, i8, i9, i10), inset(p0.getUpperBound(), i7, i8, i9, i10));
            }
        }
        return p0;
    }
}
