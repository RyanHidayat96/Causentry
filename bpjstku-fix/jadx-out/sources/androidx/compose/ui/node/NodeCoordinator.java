package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u0000 »\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¼\u0002»\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0012\u001a\u00020\u0010\"\u0006\b\u0000\u0010\u0014\u0018\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0000¢\u0006\u0004\b%\u0010!J(\u0010+\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020&2\u000e\b\u0004\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020(0'H\u0085\b¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010!J\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010!J:\u00104\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020/2\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\b1H\u0014¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020/2\u0006\u0010\u0011\u001a\u000205H\u0014¢\u0006\u0004\b2\u00106JD\u0010:\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020/2\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\b12\b\u00107\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020\u0010¢\u0006\u0004\b;\u0010!JB\u0010=\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020/2\u0019\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\b12\b\u00107\u001a\u0004\u0018\u000105¢\u0006\u0004\b<\u00109J\u001f\u0010?\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020>2\b\u0010\u000e\u001a\u0004\u0018\u000105¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020>2\b\u0010\u000e\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bA\u0010@J!\u0010B\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020>2\b\u0010\u000e\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\bB\u0010@J\r\u0010C\u001a\u00020\u0010¢\u0006\u0004\bC\u0010!J2\u0010D\u001a\u00020\u00102\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\b12\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ5\u0010O\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020J2\u0006\u00107\u001a\u00020K2\u0006\u0010L\u001a\u00020\t¢\u0006\u0004\bM\u0010NJ=\u0010R\u001a\u00020\u0010*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020J2\u0006\u00107\u001a\u00020K2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010QJM\u0010W\u001a\u00020\u0010*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020J2\u0006\u00107\u001a\u00020K2\u0006\u0010L\u001a\u00020\t2\u0006\u0010S\u001a\u00020/2\u0006\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010VJE\u0010Z\u001a\u00020\u0010*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020J2\u0006\u00107\u001a\u00020K2\u0006\u0010L\u001a\u00020\t2\u0006\u0010S\u001a\u00020/H\u0002¢\u0006\u0004\bX\u0010YJE\u0010\\\u001a\u00020\u0010*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020J2\u0006\u00107\u001a\u00020K2\u0006\u0010L\u001a\u00020\t2\u0006\u0010S\u001a\u00020/H\u0002¢\u0006\u0004\b[\u0010YJ%\u0010_\u001a\u00020\t*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020I2\u0006\u0010\u000e\u001a\u00020KH\u0002¢\u0006\u0004\b]\u0010^J7\u0010a\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020H2\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020J2\u0006\u00107\u001a\u00020K2\u0006\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010NJ\u000f\u0010c\u001a\u00020bH\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020IH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020IH\u0016¢\u0006\u0004\bh\u0010fJ\u0017\u0010k\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020IH\u0016¢\u0006\u0004\bj\u0010fJ\u0017\u0010m\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020IH\u0016¢\u0006\u0004\bl\u0010fJ\u0013\u0010n\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\bn\u0010oJ\u001f\u0010r\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020IH\u0016¢\u0006\u0004\bp\u0010qJ'\u0010r\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010x\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010{\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020uH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010~\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020uH\u0002¢\u0006\u0004\b|\u0010}J \u0010\u0080\u0001\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020uH\u0002¢\u0006\u0004\b\u007f\u0010}J\"\u0010\u0081\u0001\u001a\u00020b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J*\u0010\u0085\u0001\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020I2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J+\u0010\u0085\u0001\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00002\u0007\u0010\u000e\u001a\u00030\u0086\u00012\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0087\u0001J\u0019\u0010\u0089\u0001\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020IH\u0016¢\u0006\u0005\b\u0088\u0001\u0010fJ/\u0010\u008a\u0001\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020>2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100\u000fH\u0084\b¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J$\u0010\u008e\u0001\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020I2\b\b\u0002\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J$\u0010\u0090\u0001\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020I2\b\b\u0002\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u008d\u0001J#\u0010\u0092\u0001\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020>2\u0007\u0010\u000e\u001a\u00030\u0091\u0001H\u0004¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u000f\u0010\u0094\u0001\u001a\u00020\u0010¢\u0006\u0005\b\u0094\u0001\u0010!J\u000f\u0010\u0095\u0001\u001a\u00020\u0010¢\u0006\u0005\b\u0095\u0001\u0010!J-\u0010\u0096\u0001\u001a\u00020\u00102\u0007\u0010\u0006\u001a\u00030\u0086\u00012\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J#\u0010\u0098\u0001\u001a\u00020\u00102\u0007\u0010\u0006\u001a\u00030\u0086\u00012\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020IH\u0004¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020IH\u0004¢\u0006\u0006\b\u009d\u0001\u0010\u009b\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u009f\u0001\u0010!J\u0011\u0010 \u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b \u0001\u0010!J\u001a\u0010¡\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u000f\u0010£\u0001\u001a\u00020\t¢\u0006\u0005\b£\u0001\u0010\u001fJ\u0019\u0010¥\u0001\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020IH\u0002¢\u0006\u0005\b¤\u0001\u0010fJ\u001b\u0010¨\u0001\u001a\u00030¦\u00012\u0007\u0010\u0006\u001a\u00030¦\u0001H\u0004¢\u0006\u0005\b§\u0001\u0010fJ#\u0010«\u0001\u001a\u00020/2\u0006\u0010\u0006\u001a\u00020I2\u0007\u0010\u000e\u001a\u00030¦\u0001H\u0004¢\u0006\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010¬\u0001\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R(\u0010°\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\b°\u0001\u0010±\u0001\u001a\u0005\b²\u0001\u0010\u001f\"\u0006\b³\u0001\u0010´\u0001R(\u0010µ\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010±\u0001\u001a\u0005\b¶\u0001\u0010\u001f\"\u0006\b·\u0001\u0010´\u0001R\u0017\u0010º\u0001\u001a\u00020\n8'X¦\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R+\u0010»\u0001\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R+\u0010Á\u0001\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010¼\u0001\u001a\u0006\bÂ\u0001\u0010¾\u0001\"\u0006\bÃ\u0001\u0010À\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010Ê\u0001\u001a\u00020/8WX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0017\u0010Ì\u0001\u001a\u00020/8WX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010É\u0001R\u0019\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0017\u0010Ò\u0001\u001a\u00020\u00038WX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010Ô\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\u001fR\u0019\u0010Õ\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010±\u0001R\u0015\u0010Ù\u0001\u001a\u00030Ö\u00018G¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0019\u0010Ú\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010±\u0001RJ\u0010Û\u0001\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\b12\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0005@BX\u0085\u000e¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u001a\u0010à\u0001\u001a\u00030ß\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001a\u0010â\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010ä\u0001\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0018\u0010é\u0001\u001a\u00030æ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R\u0019\u0010ë\u0001\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010Î\u0001R\u0016\u0010í\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\u001fR\u0016\u0010î\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u0010\u001fR\u001c\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R+\u0010ö\u0001\u001a\u00030ï\u00012\u0007\u0010\u0006\u001a\u00030ï\u00018Q@QX\u0090\u000e¢\u0006\u0010\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R/\u0010ü\u0001\u001a\u0005\u0018\u00010÷\u00012\t\u0010\u0006\u001a\u0005\u0018\u00010÷\u00018'@eX¦\u000e¢\u0006\u0010\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R#\u0010ÿ\u0001\u001a\f\u0012\u0005\u0012\u00030þ\u0001\u0018\u00010ý\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001f\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030þ\u00010\u0081\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R1\u0010\u0085\u0002\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020.8\u0017@UX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010Ø\u0001\"\u0006\b\u0088\u0002\u0010\u0089\u0002R1\u0010\u008a\u0002\u001a\u00020/2\u0006\u0010\u0006\u001a\u00020/8\u0007@EX\u0087\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010å\u0001\u001a\u0006\b\u008b\u0002\u0010É\u0001\"\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001a\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u008e\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0016\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010Ñ\u0001R\u0016\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010Ñ\u0001R\u001c\u0010\u0096\u0002\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u0086\u00018EX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009b\u00028CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001c\u0010 \u0002\u001a\u0005\u0018\u00010\u009f\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0017\u0010£\u0002\u001a\u00020&8AX\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0002\u0010Ø\u0001R\u001b\u0010¤\u0002\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u001b\u0010¦\u0002\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R0\u0010©\u0002\u001a\u0019\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u0010\u0018\u00010¨\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R,\u0010\u00ad\u0002\u001a\u0017\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u00100¨\u00028CX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u001d\u0010®\u0002\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R(\u0010°\u0002\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0001@BX\u0081\u000e¢\u0006\u000f\n\u0006\b°\u0002\u0010±\u0001\u001a\u0005\b±\u0002\u0010\u001fR/\u0010³\u0002\u001a\u0005\u0018\u00010²\u00022\t\u0010\u0006\u001a\u0005\u0018\u00010²\u00028\u0007@BX\u0087\u000e¢\u0006\u0010\n\u0006\b³\u0002\u0010´\u0002\u001a\u0006\bµ\u0002\u0010¶\u0002R\u001b\u0010·\u0002\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¥\u0002R\u0016\u0010¸\u0002\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0002\u0010\u001fR\u0015\u0010º\u0002\u001a\u00030¦\u00018G¢\u0006\b\u001a\u0006\b¹\u0002\u0010Ø\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/LayoutNode;", "p0", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "Landroidx/compose/ui/Modifier$Node;", "headNode", "(Z)Landroidx/compose/ui/Modifier$Node;", "", "p1", "Lkotlin/Function1;", "", "p2", "visitNodes", "(IZLkotlin/jvm/functions/Function1;)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "hasNode-H91voCI", "(I)Z", "hasNode", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "head", "isTransparent", "()Z", "replace$ui_release", "()V", "ensureLookaheadDelegateCreated", "onMeasureResultChanged", "(II)V", "onCoordinatesUsed$ui_release", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "onUnplaced", "Landroidx/compose/ui/unit/IntOffset;", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "p3", "placeSelf-MLgxB_4", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeSelf", "releaseLayer", "placeSelfApparentToRealOffset-MLgxB_4", "placeSelfApparentToRealOffset", "Landroidx/compose/ui/graphics/Canvas;", "draw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "drawContainedDrawModifiers", "performDraw", "onPlaced", "updateLayerBlock", "(Lkotlin/jvm/functions/Function1;Z)V", "updateLayerParameters", "(Z)Z", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerType;", "p4", "hitTest-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTest", "hit-5ShdDok", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hit", "p5", "p6", "outOfBoundsHit-8NAm7pk", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V", "outOfBoundsHit", "hitNear-Fh5PU_I", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V", "hitNear", "speculativeHit-Fh5PU_I", "speculativeHit", "isInExpandedTouchBounds-ThD-n1k", "(Landroidx/compose/ui/Modifier$Node;JI)Z", "isInExpandedTouchBounds", "hitTestChild-qzLsGqo", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "localToScreen-MK-Hz9U", "localToScreen", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "toCoordinator", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformFromAncestor-EL8BTi8", "transformFromAncestor", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "ancestorToLocal-S_NoaFU", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "ancestorToLocal", "Landroidx/compose/ui/geometry/MutableRect;", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "(Landroidx/compose/ui/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "toParentPosition-8S9VItk", "(JZ)J", "toParentPosition", "fromParentPosition-8S9VItk", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "onLayoutNodeDetach", "onRelease", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "fromParentRect", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "onLayoutModifierNodeChanged", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "shouldSharePointerInputWithSiblings", "offsetFromEdge-MK-Hz9U", "offsetFromEdge", "Landroidx/compose/ui/geometry/Size;", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "forcePlaceWithLookaheadOffset", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "setForcePlaceWithLookaheadOffset$ui_release", "(Z)V", "forceMeasureWithLookaheadConstraints", "getForceMeasureWithLookaheadConstraints$ui_release", "setForceMeasureWithLookaheadConstraints$ui_release", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "wrapped", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getIntroducesMotionFrameOfReference", "introducesMotionFrameOfReference", "released", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "isClipping", "layerBlock", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "oldAlignmentLines", "Landroidx/collection/MutableObjectIntMap;", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "position", "J", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "zIndex", "getZIndex", "setZIndex", "(F)V", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "drawBlockParentLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlockCanvas", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function2;", "_drawBlock", "Lkotlin/jvm/functions/Function2;", "getDrawBlock", "()Lkotlin/jvm/functions/Function2;", "drawBlock", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "explicitLayer", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "minimumTouchTargetSize", "Companion", "HitTestSource"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.isValidOwnerScope() && NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                layoutNode.onCoordinatorPositionChanged$ui_release();
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNode);
                RectManager rectManager = ownerRequireOwner.getRectManager();
                if (nodeCoordinator == layoutNode.getOuterCoordinator$ui_release()) {
                    rectManager.onLayoutPositionChanged(layoutNode, false);
                    rectManager.invalidateCallbacksFor(layoutNode);
                } else {
                    rectManager.onLayoutLayerPositionalPropertiesChanged(layoutNode);
                }
                if (layoutNode.getGloballyPositionedObservers() > 0) {
                    ownerRequireOwner.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    };
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m4461constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public final boolean shouldHitTestChildren(LayoutNode p0) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public final void mo5923childHitTestqzLsGqo(LayoutNode p0, long p1, HitTestResult p2, int p3, boolean p4) {
            p0.m5837hitTest6fMxITs$ui_release(p1, p2, p3, p4);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public final int mo5924entityTypeOLwlOKw() {
            return NodeKind.m5928constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public final boolean interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier.Node r10) {
            /*
                r9 = this;
                r0 = 16
                int r1 = androidx.compose.ui.node.NodeKind.m5928constructorimpl(r0)
                r2 = 0
                r3 = r2
            L8:
                r4 = 0
                if (r10 == 0) goto L5d
                boolean r5 = r10 instanceof androidx.compose.ui.node.PointerInputModifierNode
                r6 = 1
                if (r5 == 0) goto L19
                androidx.compose.ui.node.PointerInputModifierNode r10 = (androidx.compose.ui.node.PointerInputModifierNode) r10
                boolean r10 = r10.interceptOutOfBoundsChildEvents()
                if (r10 == 0) goto L58
                return r6
            L19:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L58
                boolean r5 = r10 instanceof androidx.compose.ui.node.DelegatingNode
                if (r5 == 0) goto L58
                r5 = r10
                androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
                androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
                r7 = r4
            L2c:
                if (r5 == 0) goto L56
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L51
                int r7 = r7 + 1
                if (r7 != r6) goto L3b
                r10 = r5
                goto L51
            L3b:
                if (r3 != 0) goto L44
                androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
                androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r0]
                r3.<init>(r8, r4)
            L44:
                if (r10 == 0) goto L4c
                if (r3 == 0) goto L4b
                r3.add(r10)
            L4b:
                r10 = r2
            L4c:
                if (r3 == 0) goto L51
                r3.add(r5)
            L51:
                androidx.compose.ui.Modifier$Node r5 = r5.getChild()
                goto L2c
            L56:
                if (r7 == r6) goto L8
            L58:
                androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
                goto L8
            L5d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1.interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier$Node):boolean");
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public final boolean interceptOutOfBoundsChildEvents(Modifier.Node p0) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public final boolean shouldHitTestChildren(LayoutNode p0) {
            SemanticsConfiguration semanticsConfiguration = p0.getSemanticsConfiguration();
            boolean z = false;
            if (semanticsConfiguration != null && semanticsConfiguration.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        public final void mo5923childHitTestqzLsGqo(LayoutNode p0, long p1, HitTestResult p2, int p3, boolean p4) {
            p0.m5838hitTestSemantics6fMxITs$ui_release(p1, p2, p3, p4);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public final int mo5924entityTypeOLwlOKw() {
            return NodeKind.m5928constructorimpl(8);
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.INSTANCE.m7074getZeronOccac();
    private final Function0<Unit> invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.invalidateLayer();
            }
        }

        {
            super(0);
        }
    };

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "entityType", "Landroidx/compose/ui/Modifier$Node;", "p0", "", "interceptOutOfBoundsChildEvents", "(Landroidx/compose/ui/Modifier$Node;)Z", "Landroidx/compose/ui/node/LayoutNode;", "shouldHitTestChildren", "(Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/geometry/Offset;", "p1", "Landroidx/compose/ui/node/HitTestResult;", "p2", "Landroidx/compose/ui/input/pointer/PointerType;", "p3", "p4", "", "childHitTest-qzLsGqo", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "childHitTest"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        void mo5923childHitTestqzLsGqo(LayoutNode p0, long p1, HitTestResult p2, int p3, boolean p4);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo5924entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node p0);

        boolean shouldHitTestChildren(LayoutNode p0);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public abstract LookaheadDelegate getLookaheadDelegate();

    public abstract Modifier.Node getTail();

    protected abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: renamed from: getForcePlaceWithLookaheadOffset$ui_release, reason: from getter */
    public final boolean getForcePlaceWithLookaheadOffset() {
        return this.forcePlaceWithLookaheadOffset;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    /* JADX INFO: renamed from: getForceMeasureWithLookaheadConstraints$ui_release, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return getIsPlacedUnderMotionFrameOfReference();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean p0) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (p0) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
                return null;
            }
            return tail.getChild();
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            return nodeCoordinator2.getTail();
        }
        return null;
    }

    public final void visitNodes(int p0, boolean p1, Function1<? super Modifier.Node, Unit> p2) {
        Modifier.Node tail = getTail();
        if (p1 || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(p1); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & p0) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & p0) != 0) {
                    p2.invoke(nodeHeadNode);
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m5921visitNodesaLcG6gQ(int p0, Function1<? super T, Unit> p1) {
        boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(p0);
        Modifier.Node tail = getTail();
        if (zM5937getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & p0) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & p0) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (nodePop instanceof Object) {
                            p1.invoke(nodePop);
                        } else if ((nodePop.getKindSet() & p0) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                if ((delegate$ui_release.getKindSet() & p0) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m5898hasNodeH91voCI(int p0) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(p0));
        return nodeHeadNode != null && DelegatableNodeKt.m5780has64DMado(nodeHeadNode, p0);
    }

    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m5914headH91voCI(int p0) {
        boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(p0);
        Modifier.Node tail = getTail();
        if (!zM5937getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & p0) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & p0) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo5645getSizeYbymL2g() {
        return getMeasuredSize();
    }

    protected final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        NodeCoordinator nodeCoordinator = this;
        do {
            if (nodeCoordinator.layer != null && nodeCoordinator.lastLayerAlpha <= 0.0f) {
                return true;
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
        } while (nodeCoordinator != null);
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo5699placeAtf8xVGno(getPosition(), this.zIndex, graphicsLayer);
        } else {
            mo5638placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().getIsAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public void setMeasureResult$ui_release(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.get$w() != measureResult2.get$w() || measureResult.get$h() != measureResult2.get$h()) {
                onMeasureResultChanged(measureResult.get$w(), measureResult.get$h());
            }
            MutableObjectIntMap<AlignmentLine> mutableObjectIntMap = this.oldAlignmentLines;
            if (mutableObjectIntMap != null) {
                Intrinsics.checkNotNull(mutableObjectIntMap);
                if (!mutableObjectIntMap.isNotEmpty()) {
                    if (measureResult.getAlignmentLines().isEmpty()) {
                        return;
                    }
                }
            } else if (measureResult.getAlignmentLines().isEmpty()) {
                return;
            }
            if (NodeCoordinatorKt.compareEquals(this.oldAlignmentLines, measureResult.getAlignmentLines())) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            MutableObjectIntMap<AlignmentLine> mutableObjectIntMapMutableObjectIntMapOf = this.oldAlignmentLines;
            if (mutableObjectIntMapMutableObjectIntMapOf == null) {
                mutableObjectIntMapMutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
                this.oldAlignmentLines = mutableObjectIntMapMutableObjectIntMapOf;
            }
            mutableObjectIntMapMutableObjectIntMapOf.clear();
            for (Map.Entry<AlignmentLine, Integer> entry : measureResult.getAlignmentLines().entrySet()) {
                mutableObjectIntMapMutableObjectIntMapOf.set(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7 */
    protected void onMeasureResultChanged(int p0, int p1) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo5986resizeozmzZPI(IntSize.m7101constructorimpl((((long) p0) << 32) | (((long) p1) & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m5700setMeasuredSizeozmzZPI(IntSize.m7101constructorimpl((((long) p1) & 4294967295L) | (((long) p0) << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(4);
        boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(iM5928constructorimpl);
        Modifier.Node tail = getTail();
        if (zM5937getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM5928constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM5928constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof DrawModifierNode) {
                            ((DrawModifierNode) nodePop).onMeasureResultChanged();
                        } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                            int i = 0;
                            nodePop = nodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM5928constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                nodePop = nodePop;
                            }
                            if (i != 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    protected void m5919setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(64))) {
            return null;
        }
        getTail();
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        for (Modifier.Node tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((NodeKind.m5928constructorimpl(64) & tail.getKindSet()) != 0) {
                int iM5928constructorimpl = NodeKind.m5928constructorimpl(64);
                MutableVector mutableVector = null;
                Modifier.Node nodePop = tail;
                while (nodePop != 0) {
                    if (nodePop instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) nodePop).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
                    } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                        int i = 0;
                        nodePop = nodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet() & iM5928constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    nodePop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (nodePop != 0) {
                                        if (mutableVector != null) {
                                            mutableVector.add(nodePop);
                                        }
                                        nodePop = 0;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild();
                            nodePop = nodePop;
                        }
                        if (i != 1) {
                        }
                    }
                    nodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return objectRef.element;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m5912getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    protected final Placeable m5917performingMeasureK40F9xA(long p0, Function0<? extends Placeable> p1) {
        m5701setMeasurementConstraintsBRTryo0(p0);
        return p1.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5638placeAtf8xVGno(long p0, float p1, Function1<? super GraphicsLayerScope, Unit> p2) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m5904placeSelfMLgxB_4(lookaheadDelegate.getPosition(), p1, p2, null);
            return;
        }
        m5904placeSelfMLgxB_4(p0, p1, p2, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5699placeAtf8xVGno(long p0, float p1, GraphicsLayer p2) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            m5904placeSelfMLgxB_4(lookaheadDelegate.getPosition(), p1, null, p2);
            return;
        }
        m5904placeSelfMLgxB_4(p0, p1, null, p2);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
        }
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m5918placeSelfApparentToRealOffsetMLgxB_4(long p0, float p1, Function1<? super GraphicsLayerScope, Unit> p2, GraphicsLayer p3) {
        m5904placeSelfMLgxB_4(IntOffset.m7067plusqkQi6aY(p0, getApparentToRealOffset()), p1, p2, p3);
    }

    public final void draw(Canvas p0, GraphicsLayer p1) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(p0, p1);
            return;
        }
        float fM7063getXimpl = IntOffset.m7063getXimpl(getPosition());
        float fM7064getYimpl = IntOffset.m7064getYimpl(getPosition());
        p0.translate(fM7063getXimpl, fM7064getYimpl);
        drawContainedDrawModifiers(p0, p1);
        p0.translate(-fM7063getXimpl, -fM7064getYimpl);
    }

    public void performDraw(Canvas p0, GraphicsLayer p1) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(p0, p1);
        }
    }

    private final Function2<Canvas, GraphicsLayer, Unit> getDrawBlock() {
        Function2 function2 = this._drawBlock;
        if (function2 != null) {
            return function2;
        }
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NodeCoordinator nodeCoordinator = this.this$0;
                Canvas canvas = nodeCoordinator.drawBlockCanvas;
                Intrinsics.checkNotNull(canvas);
                nodeCoordinator.drawContainedDrawModifiers(canvas, this.this$0.drawBlockParentLayer);
            }

            {
                super(0);
            }
        };
        Function2<Canvas, GraphicsLayer, Unit> function3 = new Function2<Canvas, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                invoke2(canvas, graphicsLayer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Canvas canvas, GraphicsLayer graphicsLayer) {
                if (this.this$0.getLayoutNode().isPlaced()) {
                    this.this$0.drawBlockCanvas = canvas;
                    this.this$0.drawBlockParentLayer = graphicsLayer;
                    this.this$0.getSnapshotObserver().observeReads$ui_release(this.this$0, NodeCoordinator.onCommitAffectingLayer, function0);
                    this.this$0.lastLayerDrawingWasSkipped = false;
                    return;
                }
                this.this$0.lastLayerDrawingWasSkipped = true;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        };
        this._drawBlock = function3;
        return function3;
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z);
    }

    public final void updateLayerBlock(Function1<? super GraphicsLayerScope, Unit> p0, boolean p1) {
        Owner owner;
        if (p0 != null && this.explicitLayer != null) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z = (!p1 && this.layerBlock == p0 && Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && p0 != null) {
            this.layerBlock = p0;
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, 4, null);
                ownedLayerCreateLayer$default.mo5986resizeozmzZPI(getMeasuredSize());
                ownedLayerCreateLayer$default.mo5985movegyyYBs(getPosition());
                this.layer = ownedLayerCreateLayer$default;
                updateLayerParameters$default(this, false, 1, null);
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                return;
            }
            if (z && updateLayerParameters$default(this, false, 1, null)) {
                layoutNode.onCoordinatorPositionChanged$ui_release();
                LayoutNodeKt.requireOwner(layoutNode).getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                return;
            }
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (!MatrixKt.m4486isIdentity58bKbWc(ownedLayer.mo5981getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorPositionChanged$ui_release();
            }
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner = layoutNode.getOwner()) != null) {
                owner.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    static /* synthetic */ boolean updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return nodeCoordinator.updateLayerParameters(z);
    }

    private final boolean updateLayerParameters(boolean p0) {
        Owner owner;
        if (this.explicitLayer != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
                reusableGraphicsLayerScope.m4543setSizeuvyYCjk(IntSizeKt.m7118toSizeozmzZPI(mo5645getSizeYbymL2g()));
                getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function1.invoke(NodeCoordinator.graphicsLayerScope);
                        NodeCoordinator.graphicsLayerScope.updateOutline$ui_release();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }
                });
                LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.layerPositionalProperties = layerPositionalProperties;
                }
                LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
                layerPositionalProperties2.copyFrom(layerPositionalProperties);
                layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
                ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
                boolean z = this.isClipping;
                this.isClipping = reusableGraphicsLayerScope.getClip();
                this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
                boolean zHasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
                if (p0 && ((!zHasSameValuesAs || z != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
                    owner.onLayoutChange(getLayoutNode());
                }
                return !zHasSameValuesAs;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        if (this.layerBlock != null) {
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
        }
        return false;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m5913getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo695toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo5844getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* JADX INFO: renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m5915hitTestqzLsGqo(HitTestSource p0, long p1, HitTestResult p2, int p3, boolean p4) {
        Modifier.Node nodeM5914headH91voCI = m5914headH91voCI(p0.mo5924entityTypeOLwlOKw());
        if (!m5922withinLayerBoundsk4lQ0M(p1)) {
            if (PointerType.m5580equalsimpl0(p3, PointerType.INSTANCE.m5587getTouchT8wyACA())) {
                float fM5910distanceInMinimumTouchTargettz77jQw = m5910distanceInMinimumTouchTargettz77jQw(p1, m5913getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(fM5910distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !p2.isHitInMinimumTouchTargetBetter(fM5910distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m5900hitNearFh5PU_I(nodeM5914headH91voCI, p0, p1, p2, p3, false, fM5910distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (nodeM5914headH91voCI == null) {
            mo5826hitTestChildqzLsGqo(p0, p1, p2, p3, p4);
        } else if (m5916isPointerInBoundsk4lQ0M(p1)) {
            m5899hit5ShdDok(nodeM5914headH91voCI, p0, p1, p2, p3, p4);
        } else {
            float fM5910distanceInMinimumTouchTargettz77jQw2 = !PointerType.m5580equalsimpl0(p3, PointerType.INSTANCE.m5587getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m5910distanceInMinimumTouchTargettz77jQw(p1, m5913getMinimumTouchTargetSizeNHjbRc());
            m5903outOfBoundsHit8NAm7pk(nodeM5914headH91voCI, p0, p1, p2, p3, p4, fM5910distanceInMinimumTouchTargettz77jQw2, (Float.floatToRawIntBits(fM5910distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040 && p2.isHitInMinimumTouchTargetBetter(fM5910distanceInMinimumTouchTargettz77jQw2, p4));
        }
    }

    /* JADX INFO: renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m5899hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        if (node != null) {
            int i2 = hitTestResult.hitDepth;
            hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
            hitTestResult.hitDepth++;
            hitTestResult.values.add(node);
            hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z, false));
            m5899hit5ShdDok(NodeCoordinatorKt.m5926nextUntilhw7D004(node, hitTestSource.mo5924entityTypeOLwlOKw(), NodeKind.m5928constructorimpl(2)), hitTestSource, j, hitTestResult, i, z);
            hitTestResult.hitDepth = i2;
            return;
        }
        mo5826hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m5903outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f, final boolean z2) {
        if (node == null) {
            mo5826hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (m5901isInExpandedTouchBoundsThDn1k(node, j, i)) {
            hitTestResult.hitExpandedTouchBounds(node, z, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.m5903outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m5926nextUntilhw7D004(node, hitTestSource.mo5924entityTypeOLwlOKw(), NodeKind.m5928constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, z2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        } else if (z2) {
            m5900hitNearFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        } else {
            m5905speculativeHitFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        }
    }

    /* JADX INFO: renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m5900hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        if (node != null) {
            int i2 = hitTestResult.hitDepth;
            hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
            hitTestResult.hitDepth++;
            hitTestResult.values.add(node);
            hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f, z, false));
            m5903outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m5926nextUntilhw7D004(node, hitTestSource.mo5924entityTypeOLwlOKw(), NodeKind.m5928constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, true);
            hitTestResult.hitDepth = i2;
            return;
        }
        mo5826hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
    }

    /* JADX INFO: renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m5905speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f) {
        if (node == null) {
            mo5826hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.m5903outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m5926nextUntilhw7D004(node, hitTestSource.mo5924entityTypeOLwlOKw(), NodeKind.m5928constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, false);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        } else {
            m5903outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m5926nextUntilhw7D004(node, hitTestSource.mo5924entityTypeOLwlOKw(), NodeKind.m5928constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    /* JADX INFO: renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m5901isInExpandedTouchBoundsThDn1k(androidx.compose.ui.Modifier.Node r9, long r10, int r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.m5901isInExpandedTouchBoundsThDn1k(androidx.compose.ui.Modifier$Node, long, int):boolean");
    }

    /* JADX INFO: renamed from: hitTestChild-qzLsGqo */
    public void mo5826hitTestChildqzLsGqo(HitTestSource p0, long p1, HitTestResult p2, int p3, boolean p4) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m5915hitTestqzLsGqo(p0, m5897fromParentPosition8S9VItk$default(nodeCoordinator, p1, false, 2, null), p2, p3, p4);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM5909calculateMinimumTouchTargetPaddingE7KxVPU = m5909calculateMinimumTouchTargetPaddingE7KxVPU(m5913getMinimumTouchTargetSizeNHjbRc());
        int i = (int) (jM5909calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i));
        int i2 = (int) (jM5909calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i2));
        rectCache.setRight(getMeasuredWidth() + Float.intBitsToFloat(i));
        rectCache.setBottom(getMeasuredHeight() + Float.intBitsToFloat(i2));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo5651screenToLocalMKHz9U(long p0) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo5646localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo5590screenToLocalMKHz9U(p0));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo5649localToScreenMKHz9U(long p0) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo5589localToScreenMKHz9U(mo5648localToRootMKHz9U(p0));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo5654windowToLocalMKHz9U(long p0) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo5646localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m3978minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo5988calculateLocalPositionMKHz9U(p0), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo5650localToWindowMKHz9U(long p0) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo5989calculatePositionInWindowMKHz9U(mo5648localToRootMKHz9U(p0));
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "");
        return (NodeCoordinator) layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo5646localPositionOfR5De75A(LayoutCoordinates p0, long p1) {
        return mo5647localPositionOfS_NoaFU(p0, p1, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo5647localPositionOfS_NoaFU(LayoutCoordinates p0, long p1, boolean p2) {
        if (p0 instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) p0;
            lookaheadLayoutCoordinates.getCoordinator().onCoordinatesUsed$ui_release();
            return Offset.m3966constructorimpl(lookaheadLayoutCoordinates.mo5647localPositionOfS_NoaFU(this, Offset.m3966constructorimpl(p1 ^ (-9223372034707292160L)), p2) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(p0);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            p1 = coordinator.m5920toParentPosition8S9VItk(p1, p2);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m5896ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui_release, p1, p2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo5652transformFromEL8BTi8(LayoutCoordinates p0, float[] p1) {
        NodeCoordinator coordinator = toCoordinator(p0);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m4470resetimpl(p1);
        coordinator.m5908transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, p1);
        m5907transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, p1);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo5653transformToScreen58bKbWc(float[] p0) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m5908transformToAncestorEL8BTi8(coordinator, p0);
        if (ownerRequireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRequireOwner).mo5438localToScreen58bKbWc(p0);
            return;
        }
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & jPositionOnScreen) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m4482translateimpl(p0, Float.intBitsToFloat((int) (jPositionOnScreen >> 32)), Float.intBitsToFloat((int) (jPositionOnScreen & 4294967295L)), 0.0f);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m5908transformToAncestorEL8BTi8(NodeCoordinator p0, float[] p1) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.areEqual(nodeCoordinator, p0)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5987transform58bKbWc(p1);
            }
            long position = nodeCoordinator.getPosition();
            if (!IntOffset.m7062equalsimpl0(position, IntOffset.INSTANCE.m7074getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m4470resetimpl(fArr);
                Matrix.m4483translateimpl$default(fArr, IntOffset.m7063getXimpl(position), IntOffset.m7064getYimpl(position), 0.0f, 4, null);
                Matrix.m4480timesAssign58bKbWc(p1, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m5907transformFromAncestorEL8BTi8(NodeCoordinator p0, float[] p1) {
        if (Intrinsics.areEqual(p0, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator);
        nodeCoordinator.m5907transformFromAncestorEL8BTi8(p0, p1);
        if (!IntOffset.m7062equalsimpl0(getPosition(), IntOffset.INSTANCE.m7074getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m4470resetimpl(fArr);
            Matrix.m4483translateimpl$default(fArr, -IntOffset.m7063getXimpl(getPosition()), -IntOffset.m7064getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m4480timesAssign58bKbWc(p1, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo5982inverseTransform58bKbWc(p1);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates p0, boolean p1) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!p0.isAttached()) {
            StringBuilder sb = new StringBuilder("LayoutCoordinates ");
            sb.append(p0);
            sb.append(" is not attached!");
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        NodeCoordinator coordinator = toCoordinator(p0);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (p0.mo5645getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (p0.mo5645getSizeYbymL2g() & 4294967295L));
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, p1, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, p1);
        return MutableRectKt.toRect(rectCache);
    }

    /* JADX INFO: renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m5896ancestorToLocalS_NoaFU(NodeCoordinator p0, long p1, boolean p2) {
        if (p0 == this) {
            return p1;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator == null || Intrinsics.areEqual(p0, nodeCoordinator)) {
            return m5911fromParentPosition8S9VItk(p1, p2);
        }
        return m5911fromParentPosition8S9VItk(nodeCoordinator.m5896ancestorToLocalS_NoaFU(p0, p1, p2), p2);
    }

    private final void ancestorToLocal(NodeCoordinator p0, MutableRect p1, boolean p2) {
        if (p0 == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(p0, p1, p2);
        }
        fromParentRect(p1, p2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo5648localToRootMKHz9U(long p0) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        long jM5906toParentPosition8S9VItk$default = p0;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jM5906toParentPosition8S9VItk$default = m5906toParentPosition8S9VItk$default(nodeCoordinator, jM5906toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM5906toParentPosition8S9VItk$default;
    }

    protected final void withPositionTranslation(Canvas p0, Function1<? super Canvas, Unit> p1) {
        float fM7063getXimpl = IntOffset.m7063getXimpl(getPosition());
        float fM7064getYimpl = IntOffset.m7064getYimpl(getPosition());
        p0.translate(fM7063getXimpl, fM7064getYimpl);
        p1.invoke(p0);
        p0.translate(-fM7063getXimpl, -fM7064getYimpl);
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m5906toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m5920toParentPosition8S9VItk(j, z);
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m5920toParentPosition8S9VItk(long p0, boolean p1) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            p0 = ownedLayer.mo5984mapOffset8S9VItk(p0, false);
        }
        return (p1 || !getIsPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m7078plusNvtHpc(p0, getPosition()) : p0;
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m5897fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.m5911fromParentPosition8S9VItk(j, z);
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m5911fromParentPosition8S9VItk(long p0, boolean p1) {
        if (p1 || !getIsPlacedUnderMotionFrameOfReference()) {
            p0 = IntOffsetKt.m7076minusNvtHpc(p0, getPosition());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo5984mapOffset8S9VItk(p0, true) : p0;
    }

    protected final void drawBorder(Canvas p0, Paint p1) {
        p0.drawRect(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f, p1);
    }

    public final void onLayoutNodeDetach() {
        releaseLayer();
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m7062equalsimpl0(getPosition(), IntOffset.INSTANCE.m7074getZeronOccac())) {
            return;
        }
        getLayoutNode().onCoordinatorPositionChanged$ui_release();
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
    }

    public final void rectInParent$ui_release(MutableRect p0, boolean p1, boolean p2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (p2) {
                    long jM5913getMinimumTouchTargetSizeNHjbRc = m5913getMinimumTouchTargetSizeNHjbRc();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM5913getMinimumTouchTargetSizeNHjbRc >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM5913getMinimumTouchTargetSizeNHjbRc & 4294967295L)) / 2.0f;
                    p0.intersect(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (mo5645getSizeYbymL2g() >> 32)) + fIntBitsToFloat, ((int) (4294967295L & mo5645getSizeYbymL2g())) + fIntBitsToFloat2);
                } else if (p1) {
                    p0.intersect(0.0f, 0.0f, (int) (mo5645getSizeYbymL2g() >> 32), (int) (4294967295L & mo5645getSizeYbymL2g()));
                }
                if (p0.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(p0, false);
        }
        float fM7063getXimpl = IntOffset.m7063getXimpl(getPosition());
        p0.setLeft(p0.getLeft() + fM7063getXimpl);
        p0.setRight(p0.getRight() + fM7063getXimpl);
        float fM7064getYimpl = IntOffset.m7064getYimpl(getPosition());
        p0.setTop(p0.getTop() + fM7064getYimpl);
        p0.setBottom(p0.getBottom() + fM7064getYimpl);
    }

    private final void fromParentRect(MutableRect p0, boolean p1) {
        float fM7063getXimpl = IntOffset.m7063getXimpl(getPosition());
        p0.setLeft(p0.getLeft() - fM7063getXimpl);
        p0.setRight(p0.getRight() - fM7063getXimpl);
        float fM7064getYimpl = IntOffset.m7064getYimpl(getPosition());
        p0.setTop(p0.getTop() - fM7064getYimpl);
        p0.setBottom(p0.getBottom() - fM7064getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(p0, true);
            if (this.isClipping && p1) {
                p0.intersect(0.0f, 0.0f, (int) (mo5645getSizeYbymL2g() >> 32), (int) (mo5645getSizeYbymL2g() & 4294967295L));
                p0.isEmpty();
            }
        }
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m5922withinLayerBoundsk4lQ0M(long p0) {
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (p0 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo5983isInLayerk4lQ0M(p0);
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator p0) {
        LayoutNode layoutNode = p0.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = p0.getTail();
            Modifier.Node tail2 = getTail();
            int iM5928constructorimpl = NodeKind.m5928constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent = tail2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iM5928constructorimpl) != 0 && parent == tail) {
                    return p0;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != p0.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui_release();
            }
            return p0;
        }
        return this;
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m5910distanceInMinimumTouchTargettz77jQw(long p0, long p1) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (p1 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (p1 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM5909calculateMinimumTouchTargetPaddingE7KxVPU = m5909calculateMinimumTouchTargetPaddingE7KxVPU(p1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM5909calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM5909calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long jM5902offsetFromEdgeMKHz9U = m5902offsetFromEdgeMKHz9U(p0);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jM5902offsetFromEdgeMKHz9U >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jM5902offsetFromEdgeMKHz9U & 4294967295L)) <= fIntBitsToFloat2) {
            return Offset.m3973getDistanceSquaredimpl(jM5902offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "<init>", "()V", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayer", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void onMeasured() {
        Modifier.Node parent;
        if (m5898hasNodeH91voCI(NodeKind.m5928constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iM5928constructorimpl = NodeKind.m5928constructorimpl(128);
                boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(iM5928constructorimpl);
                if (!zM5937getIncludeSelfInTraversalH91voCI) {
                    parent = getTail().getParent();
                    if (parent != null) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                parent = getTail();
                for (Modifier.Node nodeHeadNode = headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM5928constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getKindSet() & iM5928constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        Modifier.Node nodePop = nodeHeadNode;
                        while (nodePop != 0) {
                            if (nodePop instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) nodePop).mo684onRemeasuredozmzZPI(getMeasuredSize());
                            } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                                int i = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet() & iM5928constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild();
                                    nodePop = nodePop;
                                }
                                if (i != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == parent) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void onUnplaced() {
        if (m5898hasNodeH91voCI(NodeKind.m5928constructorimpl(1048576))) {
            int iM5928constructorimpl = NodeKind.m5928constructorimpl(1048576);
            boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(iM5928constructorimpl);
            Modifier.Node tail = getTail();
            if (zM5937getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
                for (Modifier.Node nodeHeadNode = headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM5928constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getKindSet() & iM5928constructorimpl) != 0) {
                        Modifier.Node nodePop = nodeHeadNode;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof OnUnplacedModifierNode) {
                                ((OnUnplacedModifierNode) nodePop).onUnplaced();
                            } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                                int i = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet() & iM5928constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild();
                                    nodePop = nodePop;
                                }
                                if (i != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == tail) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m5904placeSelfMLgxB_4(long p0, float p1, Function1<? super GraphicsLayerScope, Unit> p2, GraphicsLayer p3) {
        if (p3 != null) {
            if (p2 != null) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != p3) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = p3;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(getDrawBlock(), this.invalidateParentLayer, p3);
                ownedLayerCreateLayer.mo5986resizeozmzZPI(getMeasuredSize());
                ownedLayerCreateLayer.mo5985movegyyYBs(p0);
                this.layer = ownedLayerCreateLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, p2, false, 2, null);
        }
        if (!IntOffset.m7062equalsimpl0(getPosition(), p0)) {
            LayoutNodeKt.requireOwner(getLayoutNode()).voteFrameRate(FrameRateCategory.INSTANCE.m3706getHighNSsRyOo());
            m5919setPositiongyyYBs(p0);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo5985movegyyYBs(p0);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            getLayoutNode().onCoordinatorPositionChanged$ui_release();
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = p1;
        if (!getIsPlacingForAlignment()) {
            captureRulersIfNeeded$ui_release(getMeasureResult$ui_release());
        }
        if (this == getLayoutNode().getOuterCoordinator$ui_release()) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager().onLayoutPositionChanged(getLayoutNode(), !getLayoutNode().getMeasurePassDelegate$ui_release().getPlacedOnce());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas p0, GraphicsLayer p1) {
        Modifier.Node nodeM5914headH91voCI = m5914headH91voCI(NodeKind.m5928constructorimpl(4));
        if (nodeM5914headH91voCI == null) {
            performDraw(p0, p1);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m5850draweZhPAX0$ui_release(p0, IntSizeKt.m7118toSizeozmzZPI(mo5645getSizeYbymL2g()), this, nodeM5914headH91voCI, p1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void onPlaced() {
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(128);
        boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(iM5928constructorimpl);
        Modifier.Node tail = getTail();
        if (zM5937getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM5928constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM5928constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) nodePop).onPlaced(this);
                        } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                            int i = 0;
                            nodePop = nodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet() & iM5928constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            nodePop = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild();
                                nodePop = nodePop;
                            }
                            if (i != 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m5916isPointerInBoundsk4lQ0M(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) getMeasuredWidth()) && fIntBitsToFloat2 < ((float) getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean shouldSharePointerInputWithSiblings() {
        /*
            r11 = this;
            r0 = 16
            int r1 = androidx.compose.ui.node.NodeKind.m5928constructorimpl(r0)
            boolean r1 = androidx.compose.ui.node.NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(r1)
            androidx.compose.ui.Modifier$Node r1 = r11.headNode(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            boolean r3 = r1.getIsAttached()
            if (r3 == 0) goto L9e
            androidx.compose.ui.node.DelegatableNode r1 = (androidx.compose.ui.node.DelegatableNode) r1
            int r3 = androidx.compose.ui.node.NodeKind.m5928constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 != 0) goto L2e
            java.lang.String r4 = "visitLocalDescendants called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r4)
        L2e:
            androidx.compose.ui.Modifier$Node r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L9e
        L39:
            if (r1 == 0) goto L9e
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L99
            r4 = 0
            r5 = r1
            r6 = r4
        L45:
            if (r5 == 0) goto L99
            boolean r7 = r5 instanceof androidx.compose.ui.node.PointerInputModifierNode
            r8 = 1
            if (r7 == 0) goto L55
            androidx.compose.ui.node.PointerInputModifierNode r5 = (androidx.compose.ui.node.PointerInputModifierNode) r5
            boolean r5 = r5.sharePointerInputWithSiblings()
            if (r5 == 0) goto L94
            return r8
        L55:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L94
            boolean r7 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L94
            r7 = r5
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r9 = r2
        L68:
            if (r7 == 0) goto L92
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L8d
            int r9 = r9 + 1
            if (r9 != r8) goto L77
            r5 = r7
            goto L8d
        L77:
            if (r6 != 0) goto L80
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r0]
            r6.<init>(r10, r2)
        L80:
            if (r5 == 0) goto L88
            if (r6 == 0) goto L87
            r6.add(r5)
        L87:
            r5 = r4
        L88:
            if (r6 == 0) goto L8d
            r6.add(r7)
        L8d:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L68
        L92:
            if (r9 == r8) goto L45
        L94:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L45
        L99:
            androidx.compose.ui.Modifier$Node r1 = r1.getChild()
            goto L39
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.shouldSharePointerInputWithSiblings():boolean");
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m5902offsetFromEdgeMKHz9U(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - getMeasuredWidth());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p0 & 4294967295L));
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 < 0.0f ? -fIntBitsToFloat2 : fIntBitsToFloat2 - getMeasuredHeight()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32));
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m5909calculateMinimumTouchTargetPaddingE7KxVPU(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float measuredWidth = getMeasuredWidth();
        return Size.m4034constructorimpl((((long) Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat((int) (p0 & 4294967295L)) - getMeasuredHeight()) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(0.0f, (fIntBitsToFloat - measuredWidth) / 2.0f))) << 32));
    }
}
