package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b#\b\u0001\u0018\u0000 \u0089\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b\u008a\u0003\u0089\u0003\u008b\u0003\u008c\u0003B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J$\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0018\u001a\u00020\u000f2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0000¢\u0006\u0004\b#\u0010\u0011J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0000¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0004\b.\u0010\u0011J\u000f\u0010/\u001a\u00020\u000fH\u0000¢\u0006\u0004\b/\u0010\u0011J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010\n\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u0010\u0011J\u000f\u00107\u001a\u00020 H\u0017¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b@\u0010?J\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\bA\u0010?J\u0015\u0010B\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\bB\u0010?J\u0015\u0010C\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\bC\u0010?J\u0015\u0010D\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\bD\u0010?J\u0015\u0010E\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\bE\u0010?J\u0015\u0010F\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\bF\u0010?J\u0017\u0010I\u001a\u00020H2\u0006\u0010\n\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bK\u0010\u0011J\u000f\u0010L\u001a\u00020\u000fH\u0000¢\u0006\u0004\bL\u0010\u0011J\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000fH\u0002¢\u0006\u0004\bP\u0010\u0011J\u000f\u0010Q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010\u0011J\u001f\u0010R\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\bR\u0010%J\u000f\u0010S\u001a\u00020\u000fH\u0000¢\u0006\u0004\bS\u0010\u0011J\u000f\u0010T\u001a\u00020\u000fH\u0000¢\u0006\u0004\bT\u0010\u0011J!\u0010W\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020U2\b\u0010\f\u001a\u0004\u0018\u00010VH\u0000¢\u0006\u0004\bW\u0010XJ3\u0010_\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020Y2\u0006\u0010\f\u001a\u00020Z2\b\b\u0002\u0010)\u001a\u00020[2\b\b\u0002\u0010\\\u001a\u00020\tH\u0000¢\u0006\u0004\b]\u0010^J3\u0010a\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020Y2\u0006\u0010\f\u001a\u00020Z2\b\b\u0002\u0010)\u001a\u00020[2\b\b\u0002\u0010\\\u001a\u00020\tH\u0000¢\u0006\u0004\b`\u0010^J\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\bb\u0010(J-\u0010c\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\tH\u0000¢\u0006\u0004\bc\u0010dJ-\u0010e\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\tH\u0000¢\u0006\u0004\be\u0010dJ\u000f\u0010f\u001a\u00020\u000fH\u0000¢\u0006\u0004\bf\u0010\u0011J\u000f\u0010g\u001a\u00020\u000fH\u0000¢\u0006\u0004\bg\u0010\u0011J\u000f\u0010h\u001a\u00020\u000fH\u0002¢\u0006\u0004\bh\u0010\u0011J\u000f\u0010i\u001a\u00020\u000fH\u0000¢\u0006\u0004\bi\u0010\u0011J$\u0010l\u001a\u00028\u0000\"\u0004\b\u0000\u0010j2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000kH\u0080\b¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bn\u0010oJ\u0019\u0010p\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bp\u0010oJ\u000f\u0010q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bq\u0010\u0011J\u0015\u0010t\u001a\b\u0012\u0004\u0012\u00020s0rH\u0017¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u000fH\u0000¢\u0006\u0004\bv\u0010\u0011J\u001b\u0010z\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010wH\u0000¢\u0006\u0004\bx\u0010yJ\u001b\u0010|\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010wH\u0000¢\u0006\u0004\b{\u0010yJ\u000f\u0010}\u001a\u00020\u000fH\u0000¢\u0006\u0004\b}\u0010\u0011J\u000f\u0010~\u001a\u00020\u000fH\u0000¢\u0006\u0004\b~\u0010\u0011J\u000f\u0010\u007f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u007f\u0010\u0011J\u0019\u0010\u0080\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0005\b\u0080\u0001\u0010oJ\u0011\u0010\u0081\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0081\u0001\u0010\u0011J\u0011\u0010\u0082\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0082\u0001\u0010\u0011J\u0011\u0010\u0083\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0083\u0001\u0010\u0011J'\u0010\u0085\u0001\u001a\u00020\u000f2\u0013\u0010\n\u001a\u000f\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u000f0\u0014H\u0080\b¢\u0006\u0005\b\u0085\u0001\u0010\u0016J'\u0010\u0087\u0001\u001a\u00020\u000f2\u0013\u0010\n\u001a\u000f\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\u000f0\u0014H\u0080\b¢\u0006\u0005\b\u0087\u0001\u0010\u0016J\u0011\u0010\u0088\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\u0011\u0010\u0089\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u0011J\u0011\u0010\u008a\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008a\u0001\u0010\u0011J\u0011\u0010\u008b\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0011J\u0011\u0010\u008c\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008c\u0001\u0010\u0011J\u0011\u0010\u008d\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0011R\u0017\u0010\u008e\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0090\u0001\u001a\u00020\u000b8\u0017@\u0017X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0006\b\u009f\u0001\u0010\u009a\u0001\"\u0006\b \u0001\u0010\u009c\u0001R*\u0010¡\u0001\u001a\u00030\u0096\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u0098\u0001\u001a\u0006\b¢\u0001\u0010\u009a\u0001\"\u0006\b£\u0001\u0010\u009c\u0001R'\u0010¤\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\b¤\u0001\u0010\u008f\u0001\u001a\u0005\b¥\u0001\u0010-\"\u0005\b¦\u0001\u0010oR)\u0010§\u0001\u001a\u00020\u000b8\u0017@\u0017X\u0097\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010\u0091\u0001\u001a\u0006\b¨\u0001\u0010\u0093\u0001\"\u0006\b©\u0001\u0010\u0095\u0001R'\u0010ª\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\bª\u0001\u0010\u008f\u0001\u001a\u0005\b«\u0001\u0010-\"\u0005\b¬\u0001\u0010oR4\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00008\u0001@CX\u0081\u000e¢\u0006\u0017\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0005\b±\u0001\u0010(R\u0016\u0010²\u0001\u001a\u0004\u0018\u00010\t8G¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u0091\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000µ\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001c\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000r8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010uR\"\u0010»\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010º\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001d\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030½\u00010r8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010uR\u001d\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030½\u00010r8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010uR\u0019\u0010Â\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010\u008f\u0001R\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000r8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010uR\u001b\u0010È\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010®\u0001R\u0019\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00008AX\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010°\u0001R-\u0010Ë\u0001\u001a\u0004\u0018\u0001032\b\u0010\n\u001a\u0004\u0018\u0001038\u0001@BX\u0081\u000e¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R3\u0010Ñ\u0001\u001a\f\u0018\u00010Ï\u0001j\u0005\u0018\u0001`Ð\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R\u0016\u0010×\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010-R)\u0010Ø\u0001\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010\u0091\u0001\u001a\u0006\bÙ\u0001\u0010\u0093\u0001\"\u0006\bÚ\u0001\u0010\u0095\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u001a\u0010â\u0001\u001a\u0005\u0018\u00010ß\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001R\u0019\u0010ç\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bç\u0001\u0010\u008f\u0001R'\u0010è\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\bè\u0001\u0010\u008f\u0001\u001a\u0005\bé\u0001\u0010-\"\u0005\bê\u0001\u0010oR\u001b\u0010ë\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010î\u0001\u001a\u0004\u0018\u0001008WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bí\u0001\u00102R\u0019\u0010ï\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bï\u0001\u0010\u008f\u0001R\u001e\u0010ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bð\u0001\u0010¼\u0001R\u0019\u0010ñ\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010\u008f\u0001R%\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018AX\u0081\u0004¢\u0006\u000f\u0012\u0005\bó\u0001\u0010\u0011\u001a\u0006\bò\u0001\u0010Ä\u0001R\u0016\u0010õ\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010-R\u0016\u0010÷\u0001\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bö\u0001\u0010-R3\u0010ù\u0001\u001a\u00030ø\u00012\u0007\u0010\n\u001a\u00030ø\u00018\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R\u001b\u0010ÿ\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R3\u0010\u0082\u0002\u001a\u00030\u0081\u00022\u0007\u0010\n\u001a\u00030\u0081\u00028\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R3\u0010\u0089\u0002\u001a\u00030\u0088\u00022\u0007\u0010\n\u001a\u00030\u0088\u00028\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R3\u0010\u0090\u0002\u001a\u00030\u008f\u00022\u0007\u0010\n\u001a\u00030\u008f\u00028\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R3\u0010\u0097\u0002\u001a\u00030\u0096\u00022\u0007\u0010\n\u001a\u00030\u0096\u00028\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001a\u0010 \u0002\u001a\u0005\u0018\u00010\u009d\u00028CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0017\u0010¢\u0002\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010\u0093\u0001R\u0017\u0010¤\u0002\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010\u0093\u0001R\u0016\u0010¦\u0002\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¥\u0002\u0010-R\u0018\u0010ª\u0002\u001a\u00030§\u00028AX\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u0016\u0010«\u0002\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0002\u0010-R\u0013\u0010¬\u0002\u001a\u00020\t8G¢\u0006\u0007\u001a\u0005\b¬\u0002\u0010-R\u0017\u0010®\u0002\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010\u0093\u0001R\u0018\u0010²\u0002\u001a\u00030¯\u00028AX\u0080\u0004¢\u0006\b\u001a\u0006\b°\u0002\u0010±\u0002R\u0018\u0010´\u0002\u001a\u00030¯\u00028AX\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010±\u0002R*\u0010µ\u0002\u001a\u00030¯\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010±\u0002\"\u0006\b¸\u0002\u0010¹\u0002R\u001a\u0010º\u0002\u001a\u00030¯\u00028\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bº\u0002\u0010¶\u0002R.\u0010»\u0002\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u001d\n\u0006\b»\u0002\u0010\u008f\u0001\u0012\u0005\b¾\u0002\u0010\u0011\u001a\u0005\b¼\u0002\u0010-\"\u0005\b½\u0002\u0010oR \u0010À\u0002\u001a\u00030¿\u00028\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u0018\u0010Æ\u0002\u001a\u00030\u0086\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010Å\u0002R \u0010È\u0002\u001a\u00030Ç\u00028\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÈ\u0002\u0010É\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u0018\u0010Í\u0002\u001a\u00030\u0086\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Å\u0002R\u0018\u0010Ñ\u0002\u001a\u00030Î\u00028CX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010Ð\u0002R,\u0010Ó\u0002\u001a\u0005\u0018\u00010Ò\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÓ\u0002\u0010Ô\u0002\u001a\u0006\bÕ\u0002\u0010Ö\u0002\"\u0006\b×\u0002\u0010Ø\u0002R\u001c\u0010Ù\u0002\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R'\u0010Û\u0002\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\bÛ\u0002\u0010\u008f\u0001\u001a\u0005\bÜ\u0002\u0010-\"\u0005\bÝ\u0002\u0010oR\u001a\u0010ß\u0002\u001a\u0005\u0018\u00010\u0086\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÞ\u0002\u0010Å\u0002R\u0019\u0010à\u0002\u001a\u00020M8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\u001b\u0010â\u0002\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bâ\u0002\u0010á\u0002R\u0016\u0010ä\u0002\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bã\u0002\u0010-R(\u0010è\u0002\u001a\u00020M2\u0006\u0010\n\u001a\u00020M8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\bå\u0002\u0010æ\u0002\"\u0005\bç\u0002\u0010OR\u0018\u0010ì\u0002\u001a\u00030é\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\bê\u0002\u0010ë\u0002R6\u0010í\u0002\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\bí\u0002\u0010î\u0002\u001a\u0006\bï\u0002\u0010ð\u0002\"\u0005\bñ\u0002\u0010\u0016R6\u0010ò\u0002\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\bò\u0002\u0010î\u0002\u001a\u0006\bó\u0002\u0010ð\u0002\"\u0005\bô\u0002\u0010\u0016R'\u0010õ\u0002\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\bõ\u0002\u0010\u008f\u0001\u001a\u0005\bö\u0002\u0010-\"\u0005\b÷\u0002\u0010oR1\u0010ø\u0002\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\bø\u0002\u0010\u0091\u0001\u001a\u0006\bù\u0002\u0010\u0093\u0001\"\u0006\bú\u0002\u0010\u0095\u0001R\u0016\u0010ü\u0002\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bû\u0002\u0010-R\u0016\u0010þ\u0002\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bý\u0002\u0010-R\u0016\u0010\u0080\u0003\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0002\u0010-R\u0016\u0010\u0082\u0003\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0003\u0010-R\u0019\u0010\u0085\u0003\u001a\u0004\u0018\u00010\u00058WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0003\u0010\u0084\u0003R\u001c\u0010\u0087\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050r8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0003\u0010uR(\u0010\u0088\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0017@RX\u0097\u000e¢\u0006\u000f\n\u0006\b\u0088\u0003\u0010\u008f\u0001\u001a\u0005\b\u0088\u0003\u0010-"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "p0", "", "p1", "<init>", "(ZI)V", "", "recreateUnfoldedChildrenIfDirty", "()V", "invalidateUnfoldedVirtualChildren", "updateChildrenIfDirty$ui_release", "Lkotlin/Function1;", "forEachChild", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachChildIndexed", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "getInteropView", "()Landroid/view/View;", "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "", "exceptionMessageForParentingOrOwnership", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "onZSortedChildrenInvalidated$ui_release", "removeAt$ui_release", "(II)V", "removeAll$ui_release", "onChildRemoved", "(Landroidx/compose/ui/node/LayoutNode;)V", "p2", "move$ui_release", "(III)V", "isTransparent", "()Z", "requestAutofill$ui_release", "invalidateSemantics$ui_release", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "calculateSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/node/Owner;", "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "detach$ui_release", "toString", "()Ljava/lang/String;", "debugTreeToString", "(I)Ljava/lang/String;", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getOrCreateIntrinsicsPolicy", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "minLookaheadIntrinsicWidth", "(I)I", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", "minIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "", "rethrowWithComposeStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "onDensityOrLayoutDirectionChanged", "invalidateLayer$ui_release", "Landroidx/compose/ui/Modifier;", "applyModifier", "(Landroidx/compose/ui/Modifier;)V", "resetModifierState", "invalidateParentData$ui_release", "place$ui_release", "replace$ui_release", "lookaheadReplace$ui_release", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerType;", "p3", "hitTest-6fMxITs$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTest", "hitTestSemantics-6fMxITs$ui_release", "hitTestSemantics", "rescheduleRemeasureOrRelayout$ui_release", "requestRemeasure$ui_release", "(ZZZ)V", "requestLookaheadRemeasure$ui_release", "invalidateMeasurements$ui_release", "invalidateOnPositioned$ui_release", "invalidateOffsetFromRoot", "onCoordinatorPositionChanged$ui_release", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requestRelayout$ui_release", "(Z)V", "requestLookaheadRelayout$ui_release", "dispatchOnPositionedCallbacks$ui_release", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "invalidateLayers$ui_release", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "lookaheadRemeasure", "remeasure-_Sx5XlM$ui_release", "remeasure", "markLayoutPending$ui_release", "markMeasurePending$ui_release", "markLookaheadLayoutPending$ui_release", "invalidateSubtree", "markLookaheadMeasurePending$ui_release", "forceRemeasure", "onLayoutComplete", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "Landroidx/compose/ui/node/NodeCoordinator;", "forEachCoordinatorIncludingInner$ui_release", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "onReuse", "onDeactivate", "onRelease", "isVirtual", "Z", "semanticsId", "I", "getSemanticsId", "()I", "setSemanticsId", "(I)V", "Landroidx/compose/ui/unit/IntOffset;", "offsetFromRoot", "J", "getOffsetFromRoot-nOcc-ac$ui_release", "()J", "setOffsetFromRoot--gyyYBs$ui_release", "(J)V", "Landroidx/compose/ui/unit/IntSize;", "lastSize", "getLastSize-YbymL2g$ui_release", "setLastSize-ozmzZPI$ui_release", "outerToInnerOffset", "getOuterToInnerOffset-nOcc-ac$ui_release", "setOuterToInnerOffset--gyyYBs$ui_release", "outerToInnerOffsetDirty", "getOuterToInnerOffsetDirty$ui_release", "setOuterToInnerOffsetDirty$ui_release", "compositeKeyHash", "getCompositeKeyHash", "setCompositeKeyHash", "isVirtualLookaheadRoot", "isVirtualLookaheadRoot$ui_release", "setVirtualLookaheadRoot$ui_release", "lookaheadRoot", "Landroidx/compose/ui/node/LayoutNode;", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "virtualChildrenCount", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "getFoldedChildren$ui_release", "foldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/layout/Measurable;", "getChildMeasurables$ui_release", "childMeasurables", "getChildLookaheadMeasurables$ui_release", "childLookaheadMeasurables", "unfoldedVirtualChildrenListDirty", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "getChildren$ui_release", "children", "_foldedParent", "getParent$ui_release", "parent", "owner", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "isAttached", "depth", "getDepth$ui_release", "setDepth$ui_release", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "ignoreRemeasureRequests", "isSemanticsInvalidated", "isSemanticsInvalidated$ui_release", "setSemanticsInvalidated$ui_release", "_semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "semanticsConfiguration", "isCurrentlyCalculatingSemanticsConfiguration", "_zSortedChildren", "zSortedChildrenInvalidated", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "getHasFixedInnerContentConstraints$ui_release", "hasFixedInnerContentConstraints", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "Landroidx/compose/runtime/tooling/CompositionErrorContext;", "getTraceContext", "()Landroidx/compose/runtime/tooling/CompositionErrorContext;", "traceContext", "getWidth", "width", "getHeight", "height", "getAlignmentLinesRequired$ui_release", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "isPlaced", "isPlacedByParent", "getPlaceOrder$ui_release", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "getMeasuredByParentInLookahead$ui_release", "measuredByParentInLookahead", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "previousIntrinsicsUsageByParent", "canMultiMeasure", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "Landroidx/compose/ui/node/NodeChain;", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getOuterCoordinator$ui_release", "outerCoordinator", "", "getZIndex", "()F", "zIndex", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "getInnerLayerCoordinator$ui_release", "innerLayerCoordinator", "_modifier", "Landroidx/compose/ui/Modifier;", "pendingModifier", "getApplyingModifierOnAttach$ui_release", "applyingModifierOnAttach", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "modifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onAttach", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "needsOnGloballyPositionedDispatch", "getNeedsOnGloballyPositionedDispatch$ui_release", "setNeedsOnGloballyPositionedDispatch$ui_release", "globallyPositionedObservers", "getGloballyPositionedObservers", "setGloballyPositionedObservers", "getMeasurePending$ui_release", "measurePending", "getLayoutPending$ui_release", "layoutPending", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "getParentInfo", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "parentInfo", "getChildrenInfo", "childrenInfo", "isDeactivated", "Companion", "NoIntrinsicsMeasurePolicy", "LayoutState", "UsageByParent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private SemanticsConfiguration _semanticsConfiguration;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private CompositionLocalMap compositionLocalMap;
    private Density density;
    private int depth;
    private int globallyPositionedObservers;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private long lastSize;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnGloballyPositionedDispatch;
    private final NodeChain nodes;
    private long offsetFromRoot;
    private Function1<? super Owner, Unit> onAttach;
    private Function1<? super Owner, Unit> onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final /* bridge */ /* synthetic */ MeasureResult mo359measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) m5845measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
        }

        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public final Void m5845measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public final long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public final long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public final long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public final float getTouchSlop() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public final long mo5844getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m7043getZeroMYxV2XQ();
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.ZComparator$lambda$42((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this.offsetFromRoot = IntOffset.INSTANCE.m7073getMaxnOccac();
        this.lastSize = IntSize.INSTANCE.m7111getZeroYbymL2g();
        this.outerToInnerOffset = IntOffset.INSTANCE.m7073getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getLayoutDelegate().markChildrenDirty();
            }

            {
                super(0);
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.INSTANCE.getEmpty();
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        this.previousIntrinsicsUsageByParent = UsageByParent.NotUsed;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final int getSemanticsId() {
        return this.semanticsId;
    }

    public final void setSemanticsId(int i) {
        this.semanticsId = i;
    }

    /* JADX INFO: renamed from: getOffsetFromRoot-nOcc-ac$ui_release, reason: not valid java name and from getter */
    public final long getOffsetFromRoot() {
        return this.offsetFromRoot;
    }

    /* JADX INFO: renamed from: setOffsetFromRoot--gyyYBs$ui_release, reason: not valid java name */
    public final void m5842setOffsetFromRootgyyYBs$ui_release(long j) {
        this.offsetFromRoot = j;
    }

    /* JADX INFO: renamed from: getLastSize-YbymL2g$ui_release, reason: not valid java name and from getter */
    public final long getLastSize() {
        return this.lastSize;
    }

    /* JADX INFO: renamed from: setLastSize-ozmzZPI$ui_release, reason: not valid java name */
    public final void m5841setLastSizeozmzZPI$ui_release(long j) {
        this.lastSize = j;
    }

    /* JADX INFO: renamed from: getOuterToInnerOffset-nOcc-ac$ui_release, reason: not valid java name and from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    /* JADX INFO: renamed from: setOuterToInnerOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m5843setOuterToInnerOffsetgyyYBs$ui_release(long j) {
        this.outerToInnerOffset = j;
    }

    /* JADX INFO: renamed from: getOuterToInnerOffsetDirty$ui_release, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    public final void setOuterToInnerOffsetDirty$ui_release(boolean z) {
        this.outerToInnerOffsetDirty = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setCompositeKeyHash(int i) {
        this.compositeKeyHash = i;
    }

    /* JADX INFO: renamed from: isVirtualLookaheadRoot$ui_release, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    /* JADX INFO: renamed from: getLookaheadRoot$ui_release, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        } else {
            this.layoutDelegate.onRemovedFromLookaheadScope();
        }
        invalidateMeasurements$ui_release();
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.getVector().asMutableList();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode = layoutNodeArr[i];
                if (!layoutNode.isVirtual) {
                    mutableVector.add(layoutNode);
                } else {
                    mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                }
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode = this;
        do {
            if (layoutNode.virtualChildrenCount > 0) {
                layoutNode.unfoldedVirtualChildrenListDirty = true;
            }
            if (!layoutNode.isVirtual) {
                return;
            } else {
                layoutNode = layoutNode._foldedParent;
            }
        } while (layoutNode != null);
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public final void forEachChild(Function1<? super LayoutNode, Unit> p0) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            p0.invoke(layoutNodeArr[i]);
        }
    }

    public final void forEachChildIndexed(Function2<? super Integer, ? super LayoutNode, Unit> p0) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            p0.invoke(Integer.valueOf(i), layoutNodeArr[i]);
        }
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    /* JADX INFO: renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: getInteropViewFactoryHolder$ui_release, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    public final View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final boolean isAttached() {
        return this.owner != null;
    }

    /* JADX INFO: renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void setDepth$ui_release(int i) {
        this.depth = i;
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState();
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final void insertAt$ui_release(int p0, LayoutNode p1) {
        if (p1._foldedParent != null && p1.owner != null) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(p1));
        }
        p1._foldedParent = this;
        this._foldedChildren.add(p0, p1);
        onZSortedChildrenInvalidated$ui_release();
        if (p1.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            p1.attach$ui_release(owner);
        }
        if (p1.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
        if (p1.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers + 1);
        }
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode p0) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(p0);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(debugTreeToString$default(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode = p0._foldedParent;
        sb.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
        return sb.toString();
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        LayoutNode parent$ui_release = this;
        while (parent$ui_release.isVirtual) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            if (parent$ui_release == null) {
                return;
            }
        }
        parent$ui_release.zSortedChildrenInvalidated = true;
    }

    public final void removeAt$ui_release(int p0, int p1) {
        if (p1 < 0) {
            StringBuilder sb = new StringBuilder("count (");
            sb.append(p1);
            sb.append(") must be greater than 0");
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        int i = (p1 + p0) - 1;
        if (p0 > i) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.getVector().content[i]);
            this._foldedChildren.removeAt(i);
            if (i == p0) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void removeAll$ui_release() {
        for (int size = this._foldedChildren.getVector().getSize() - 1; size >= 0; size--) {
            onChildRemoved(this._foldedChildren.getVector().content[size]);
        }
        this._foldedChildren.clear();
    }

    private final void onChildRemoved(LayoutNode p0) {
        if (p0.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            p0.detach$ui_release();
        }
        p0._foldedParent = null;
        if (p0.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers - 1);
        }
        p0.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (p0.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = p0._foldedChildren.getVector();
            LayoutNode[] layoutNodeArr = vector.content;
            int size = vector.getSize();
            for (int i = 0; i < size; i++) {
                layoutNodeArr[i].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    public final void move$ui_release(int p0, int p1, int p2) {
        if (p0 == p1) {
            return;
        }
        for (int i = 0; i < p2; i++) {
            this._foldedChildren.add(p0 > p1 ? p1 + i : (p1 + p2) - 2, this._foldedChildren.removeAt(p0 > p1 ? p0 + i : p0));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final boolean isTransparent() {
        return getOuterCoordinator$ui_release().isTransparent();
    }

    /* JADX INFO: renamed from: isSemanticsInvalidated$ui_release, reason: from getter */
    public final boolean getIsSemanticsInvalidated() {
        return this.isSemanticsInvalidated;
    }

    public final void setSemanticsInvalidated$ui_release(boolean z) {
        this.isSemanticsInvalidated = z;
    }

    public final void requestAutofill$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestAutofill(this);
    }

    public final void invalidateSemantics$ui_release() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        } else {
            if (this.nodes.isUpdating$ui_release() || getApplyingModifierOnAttach$ui_release()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = calculateSemanticsConfiguration();
            this.isSemanticsInvalidated = false;
            Owner ownerRequireOwner = LayoutNodeKt.requireOwner(this);
            ownerRequireOwner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            ownerRequireOwner.onSemanticsChange();
        }
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final SemanticsConfiguration getSemanticsConfiguration() {
        if (!isAttached() || getIsDeactivated() || !this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            return null;
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
            this._semanticsConfiguration = calculateSemanticsConfiguration();
        }
        return this._semanticsConfiguration;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode.calculateSemanticsConfiguration.1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
            /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
                	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
                	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                /*
                    r11 = this;
                    androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNode.this
                    androidx.compose.ui.node.NodeChain r0 = r0.getNodes()
                    r1 = 8
                    int r1 = androidx.compose.ui.node.NodeKind.m5928constructorimpl(r1)
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.semantics.SemanticsConfiguration> r2 = r2
                    int r3 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r0)
                    r3 = r3 & r1
                    if (r3 == 0) goto La4
                    androidx.compose.ui.Modifier$Node r0 = r0.getTail()
                L19:
                    if (r0 == 0) goto La4
                    int r3 = r0.getKindSet()
                    r3 = r3 & r1
                    if (r3 == 0) goto L9e
                    r3 = 0
                    r4 = r0
                    r5 = r3
                L25:
                    if (r4 == 0) goto L9e
                    boolean r6 = r4 instanceof androidx.compose.ui.node.SemanticsModifierNode
                    r7 = 1
                    if (r6 == 0) goto L57
                    androidx.compose.ui.node.SemanticsModifierNode r4 = (androidx.compose.ui.node.SemanticsModifierNode) r4
                    boolean r6 = r4.getIsClearingSemantics()
                    if (r6 == 0) goto L42
                    androidx.compose.ui.semantics.SemanticsConfiguration r6 = new androidx.compose.ui.semantics.SemanticsConfiguration
                    r6.<init>()
                    r2.element = r6
                    T r6 = r2.element
                    androidx.compose.ui.semantics.SemanticsConfiguration r6 = (androidx.compose.ui.semantics.SemanticsConfiguration) r6
                    r6.setClearingSemantics(r7)
                L42:
                    boolean r6 = r4.getShouldMergeDescendantSemantics()
                    if (r6 == 0) goto L4f
                    T r6 = r2.element
                    androidx.compose.ui.semantics.SemanticsConfiguration r6 = (androidx.compose.ui.semantics.SemanticsConfiguration) r6
                    r6.setMergingSemanticsOfDescendants(r7)
                L4f:
                    T r6 = r2.element
                    androidx.compose.ui.semantics.SemanticsPropertyReceiver r6 = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) r6
                    r4.applySemantics(r6)
                    goto L99
                L57:
                    int r6 = r4.getKindSet()
                    r6 = r6 & r1
                    if (r6 == 0) goto L99
                    boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
                    if (r6 == 0) goto L99
                    r6 = r4
                    androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
                    androidx.compose.ui.Modifier$Node r6 = r6.getDelegate()
                    r8 = 0
                    r9 = r8
                L6b:
                    if (r6 == 0) goto L97
                    int r10 = r6.getKindSet()
                    r10 = r10 & r1
                    if (r10 == 0) goto L92
                    int r9 = r9 + 1
                    if (r9 != r7) goto L7a
                    r4 = r6
                    goto L92
                L7a:
                    if (r5 != 0) goto L85
                    androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
                    r10 = 16
                    androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r10]
                    r5.<init>(r10, r8)
                L85:
                    if (r4 == 0) goto L8d
                    if (r5 == 0) goto L8c
                    r5.add(r4)
                L8c:
                    r4 = r3
                L8d:
                    if (r5 == 0) goto L92
                    r5.add(r6)
                L92:
                    androidx.compose.ui.Modifier$Node r6 = r6.getChild()
                    goto L6b
                L97:
                    if (r9 == r7) goto L25
                L99:
                    androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
                    goto L25
                L9e:
                    androidx.compose.ui.Modifier$Node r0 = r0.getParent()
                    goto L19
                La4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.AnonymousClass1.invoke2():void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) objectRef.element;
    }

    public final void attach$ui_release(Owner p0) {
        LayoutNode layoutNode;
        if (this.owner != null) {
            StringBuilder sb = new StringBuilder("Cannot attach ");
            sb.append(this);
            sb.append(" as it already is attached.  Tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 != null) {
            if (!Intrinsics.areEqual(layoutNode2 != null ? layoutNode2.owner : null, p0)) {
                StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
                sb2.append(p0);
                sb2.append(") than the parent's owner(");
                LayoutNode parent$ui_release = getParent$ui_release();
                sb2.append(parent$ui_release != null ? parent$ui_release.owner : null);
                sb2.append("). This tree: ");
                sb2.append(debugTreeToString$default(this, 0, 1, null));
                sb2.append(" Parent tree: ");
                LayoutNode layoutNode3 = this._foldedParent;
                sb2.append(layoutNode3 != null ? debugTreeToString$default(layoutNode3, 0, 1, null) : null);
                InlineClassHelperKt.throwIllegalStateException(sb2.toString());
            }
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.onAttachedToNullParent();
            }
        }
        getOuterCoordinator$ui_release().setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.owner = p0;
        this.depth = (parent$ui_release2 != null ? parent$ui_release2.depth : -1) + 1;
        Modifier modifier = this.pendingModifier;
        if (modifier != null) {
            applyModifier(modifier);
        }
        this.pendingModifier = null;
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        p0.onPreAttach(this);
        if (this.isVirtualLookaheadRoot) {
            setLookaheadRoot(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            setLookaheadRoot(layoutNode);
            if (this.lookaheadRoot == null && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(512))) {
                setLookaheadRoot(this);
            }
        }
        if (!getIsDeactivated()) {
            this.nodes.markAsAttached();
        }
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr = vector.content;
        int size = vector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].attach$ui_release(p0);
        }
        if (!getIsDeactivated()) {
            this.nodes.runAttachLifecycle();
        }
        invalidateMeasurements$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateMeasurements$ui_release();
        }
        Function1<? super Owner, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(p0);
        }
        this.layoutDelegate.updateParentData();
        if (ComposeUiFlags.isSemanticAutofillEnabled && !getIsDeactivated() && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        p0.onPostAttach(this);
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(UsageByParent.NotUsed);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(UsageByParent.NotUsed);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onLayoutNodeDetach();
        }
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (!ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        LayoutNode[] layoutNodeArr = vector.content;
        int size = vector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].detach$ui_release();
        }
        Unit unit = Unit.INSTANCE;
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        this.offsetFromRoot = IntOffset.INSTANCE.m7073getMaxnOccac();
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().notifySemanticsChange$ui_release(this, semanticsConfiguration);
            owner.onSemanticsChange();
        }
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return isAttached();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JvmActuals_jvmKt.simpleIdentityToString(this, null));
        sb.append(" children: ");
        sb.append(getChildren$ui_release().size());
        sb.append(" measurePolicy: ");
        sb.append(getMeasurePolicy());
        sb.append(" deactivated: ");
        sb.append(getIsDeactivated());
        return sb.toString();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM5912getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m5912getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m6886getHasFixedWidthimpl(jM5912getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m6885getHasFixedHeightimpl(jM5912getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final String debugTreeToString(int p0) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p0; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(layoutNodeArr[i2].debugTreeToString(p0 + 1));
        }
        String string = sb.toString();
        if (p0 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0010\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "p1", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)Ljava/lang/Void;", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m5846maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m5847maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m5848minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m5849minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m5849minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m5848minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m5847maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m5846maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setMeasurePolicy(MeasurePolicy measurePolicy) {
        if (Intrinsics.areEqual(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui_release();
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    public final int minLookaheadIntrinsicWidth(int p0) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(p0);
    }

    public final int minLookaheadIntrinsicHeight(int p0) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(p0);
    }

    public final int maxLookaheadIntrinsicWidth(int p0) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(p0);
    }

    public final int maxLookaheadIntrinsicHeight(int p0) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(p0);
    }

    public final int minIntrinsicWidth(int p0) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(p0);
    }

    public final int minIntrinsicHeight(int p0) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(p0);
    }

    public final int maxIntrinsicWidth(int p0) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(p0);
    }

    public final int maxIntrinsicHeight(int p0) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(p0);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public final Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setDensity(Density density) {
        if (Intrinsics.areEqual(this.density, density)) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.onDensityChange();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.onLayoutDirectionChange();
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (Intrinsics.areEqual(this.viewConfiguration, viewConfiguration)) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & iM5928constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM5928constructorimpl) != 0) {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) nodePop).onViewConfigurationChange();
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
                if ((head.getAggregateChildKindSet() & iM5928constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setCompositionLocalMap(androidx.compose.runtime.CompositionLocalMap r10) {
        /*
            r9 = this;
            r9.compositionLocalMap = r10
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.Object r0 = r10.get(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            r9.setDensity(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.Object r0 = r10.get(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r9.setLayoutDirection(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.Object r10 = r10.get(r0)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.ui.platform.ViewConfiguration) r10
            r9.setViewConfiguration(r10)
            androidx.compose.ui.node.NodeChain r10 = r9.nodes
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = androidx.compose.ui.node.NodeKind.m5928constructorimpl(r0)
            int r1 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r10)
            r1 = r1 & r0
            if (r1 == 0) goto Lbd
            androidx.compose.ui.Modifier$Node r10 = r10.getHead()
        L43:
            if (r10 == 0) goto Lbd
            int r1 = r10.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lb1
            r1 = 0
            r2 = r10
            r3 = r1
        L4f:
            if (r2 == 0) goto Lb1
            boolean r4 = r2 instanceof androidx.compose.ui.node.CompositionLocalConsumerModifierNode
            r5 = 1
            if (r4 == 0) goto L6a
            androidx.compose.ui.node.CompositionLocalConsumerModifierNode r2 = (androidx.compose.ui.node.CompositionLocalConsumerModifierNode) r2
            androidx.compose.ui.Modifier$Node r2 = r2.getNode()
            boolean r4 = r2.getIsAttached()
            if (r4 == 0) goto L66
            androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(r2)
            goto Lac
        L66:
            r2.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(r5)
            goto Lac
        L6a:
            int r4 = r2.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto Lac
            boolean r4 = r2 instanceof androidx.compose.ui.node.DelegatingNode
            if (r4 == 0) goto Lac
            r4 = r2
            androidx.compose.ui.node.DelegatingNode r4 = (androidx.compose.ui.node.DelegatingNode) r4
            androidx.compose.ui.Modifier$Node r4 = r4.getDelegate()
            r6 = 0
            r7 = r6
        L7e:
            if (r4 == 0) goto Laa
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto La5
            int r7 = r7 + 1
            if (r7 != r5) goto L8d
            r2 = r4
            goto La5
        L8d:
            if (r3 != 0) goto L98
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r3.<init>(r8, r6)
        L98:
            if (r2 == 0) goto La0
            if (r3 == 0) goto L9f
            r3.add(r2)
        L9f:
            r2 = r1
        La0:
            if (r3 == 0) goto La5
            r3.add(r4)
        La5:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            goto L7e
        Laa:
            if (r7 == r5) goto L4f
        Lac:
            androidx.compose.ui.Modifier$Node r2 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
            goto L4f
        Lb1:
            int r1 = r10.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lbd
            androidx.compose.ui.Modifier$Node r10 = r10.getChild()
            goto L43
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.setCompositionLocalMap(androidx.compose.runtime.CompositionLocalMap):void");
    }

    private final CompositionErrorContext getTraceContext() {
        return (CompositionErrorContext) getCompositionLocalMap().get(CompositionErrorContextKt.getLocalCompositionErrorContext());
    }

    public final Void rethrowWithComposeStackTrace(Throwable p0) throws Throwable {
        CompositionErrorContext traceContext = getTraceContext();
        if (traceContext == null) {
            throw p0;
        }
        traceContext.attachComposeStackTrace(p0, this);
        throw p0;
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() || !((lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    /* JADX INFO: renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    /* JADX INFO: renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    /* JADX INFO: renamed from: getNodes$ui_release, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator();
    }

    /* JADX INFO: renamed from: getLayoutDelegate$ui_release, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    /* JADX INFO: renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX INFO: renamed from: getInnerLayerCoordinatorIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final NodeCoordinator getInnerLayerCoordinator$ui_release() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy)) {
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final void invalidateLayer$ui_release() {
        LayoutNode parent$ui_release = this;
        do {
            NodeCoordinator innerLayerCoordinator$ui_release = parent$ui_release.getInnerLayerCoordinator$ui_release();
            if (innerLayerCoordinator$ui_release != null) {
                innerLayerCoordinator$ui_release.invalidateLayer();
                return;
            }
            parent$ui_release = parent$ui_release.getParent$ui_release();
        } while (parent$ui_release != null);
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.pendingModifier != null;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    /* JADX INFO: renamed from: getModifier, reason: from getter */
    public final Modifier get_modifier() {
        return this._modifier;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void setModifier(Modifier modifier) {
        if (this.isVirtual && get_modifier() != Modifier.INSTANCE) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (isAttached()) {
            applyModifier(modifier);
            if (this.isSemanticsInvalidated) {
                invalidateSemantics$ui_release();
                return;
            }
            return;
        }
        this.pendingModifier = modifier;
    }

    private final void applyModifier(Modifier p0) {
        boolean zM5889hasH91voCI$ui_release = this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(16));
        boolean zM5889hasH91voCI$ui_release2 = this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(1024));
        this._modifier = p0;
        this.nodes.updateFrom$ui_release(p0);
        boolean zM5889hasH91voCI$ui_release3 = this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(16));
        boolean zM5889hasH91voCI$ui_release4 = this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(1024));
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(512))) {
            setLookaheadRoot(this);
        }
        if (zM5889hasH91voCI$ui_release == zM5889hasH91voCI$ui_release3 && zM5889hasH91voCI$ui_release2 == zM5889hasH91voCI$ui_release4) {
            return;
        }
        LayoutNodeKt.requireOwner(this).getRectManager().updateFlagsFor(this, zM5889hasH91voCI$ui_release4, zM5889hasH91voCI$ui_release3);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final void setOnAttach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final void setOnDetach$ui_release(Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    /* JADX INFO: renamed from: getNeedsOnGloballyPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnGloballyPositionedDispatch() {
        return this.needsOnGloballyPositionedDispatch;
    }

    public final void setNeedsOnGloballyPositionedDispatch$ui_release(boolean z) {
        this.needsOnGloballyPositionedDispatch = z;
    }

    public final int getGloballyPositionedObservers() {
        return this.globallyPositionedObservers;
    }

    public final void setGloballyPositionedObservers(int i) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        int i2 = this.globallyPositionedObservers;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (parent$ui_release2 = getParent$ui_release()) != null) {
                parent$ui_release2.setGloballyPositionedObservers(parent$ui_release2.globallyPositionedObservers + 1);
            }
            if (i == 0 && this.globallyPositionedObservers > 0 && (parent$ui_release = getParent$ui_release()) != null) {
                parent$ui_release.setGloballyPositionedObservers(parent$ui_release.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i;
        }
    }

    public final void place$ui_release(int p0, int p1) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), p0, p1, 0.0f, 4, null);
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void draw$ui_release(Canvas p0, GraphicsLayer p1) throws Throwable {
        try {
            getOuterCoordinator$ui_release().draw(p0, p1);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            rethrowWithComposeStackTrace(th);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: hitTest-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m5830hitTest6fMxITs$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PointerType.INSTANCE.m5588getUnknownT8wyACA();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.m5837hitTest6fMxITs$ui_release(j, hitTestResult, i3, z);
    }

    /* JADX INFO: renamed from: hitTest-6fMxITs$ui_release, reason: not valid java name */
    public final void m5837hitTest6fMxITs$ui_release(long p0, HitTestResult p1, int p2, boolean p3) {
        getOuterCoordinator$ui_release().m5915hitTestqzLsGqo(NodeCoordinator.INSTANCE.getPointerInputSource(), NodeCoordinator.m5897fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), p0, false, 2, null), p1, p2, p3);
    }

    /* JADX INFO: renamed from: hitTestSemantics-6fMxITs$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m5831hitTestSemantics6fMxITs$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PointerType.INSTANCE.m5587getTouchT8wyACA();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.m5838hitTestSemantics6fMxITs$ui_release(j, hitTestResult, i3, z);
    }

    /* JADX INFO: renamed from: hitTestSemantics-6fMxITs$ui_release, reason: not valid java name */
    public final void m5838hitTestSemantics6fMxITs$ui_release(long p0, HitTestResult p1, int p2, boolean p3) {
        getOuterCoordinator$ui_release().m5915hitTestqzLsGqo(NodeCoordinator.INSTANCE.getSemanticsSource(), NodeCoordinator.m5897fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), p0, false, 2, null), p1, PointerType.INSTANCE.m5587getTouchT8wyACA(), p3);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode p0) {
        if (WhenMappings.$EnumSwitchMapping$0[p0.getLayoutState$ui_release().ordinal()] == 1) {
            if (p0.getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release$default(p0, true, false, false, 6, null);
                return;
            }
            if (p0.getLookaheadLayoutPending$ui_release()) {
                p0.requestLookaheadRelayout$ui_release(true);
            }
            if (p0.getMeasurePending$ui_release()) {
                requestRemeasure$ui_release$default(p0, true, false, false, 6, null);
                return;
            } else {
                if (p0.getLayoutPending$ui_release()) {
                    p0.requestRelayout$ui_release(true);
                    return;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected state ");
        sb.append(p0.getLayoutState$ui_release());
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.requestRemeasure$ui_release(z, z2, z3);
    }

    public final void requestRemeasure$ui_release(boolean p0, boolean p1, boolean p2) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, p0, p1, 2, null);
        if (p2) {
            getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(p0);
        }
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z, z2, z3);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean p0, boolean p1, boolean p2) {
        if (this.lookaheadRoot == null) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, p0, p1);
        if (p2) {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(p0);
        }
    }

    public final void invalidateMeasurements$ui_release() {
        LayoutNode parent$ui_release = this;
        while (parent$ui_release.isVirtual) {
            parent$ui_release = parent$ui_release.getParent$ui_release();
            if (parent$ui_release == null) {
                return;
            }
        }
        if (parent$ui_release.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(parent$ui_release, false, false, false, 7, null);
        } else {
            requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui_release() {
        if (this.globallyPositionedObservers == 0 || getLayoutPending$ui_release() || getMeasurePending$ui_release() || this.needsOnGloballyPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    private final void invalidateOffsetFromRoot() {
        if (IntOffset.m7062equalsimpl0(this.offsetFromRoot, IntOffset.INSTANCE.m7073getMaxnOccac())) {
            return;
        }
        this.offsetFromRoot = IntOffset.INSTANCE.m7073getMaxnOccac();
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].invalidateOffsetFromRoot();
        }
    }

    public final void onCoordinatorPositionChanged$ui_release() {
        this.outerToInnerOffsetDirty = true;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].invalidateOffsetFromRoot();
        }
    }

    public final <T> T ignoreRemeasureRequests$ui_release(Function0<? extends T> p0) {
        this.ignoreRemeasureRequests = true;
        T tInvoke = p0.invoke();
        this.ignoreRemeasureRequests = false;
        return tInvoke;
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public final void requestRelayout$ui_release(boolean p0) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, p0, 2, null);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z);
    }

    public final void requestLookaheadRelayout$ui_release(boolean p0) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || getIsDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & iM5928constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM5928constructorimpl) != 0) {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) nodePop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m5782requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m5928constructorimpl(256)));
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
                if ((head.getAggregateChildKindSet() & iM5928constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m5832lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m5853getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m5839lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m5839lookaheadRemeasure_Sx5XlM$ui_release(Constraints p0) {
        if (p0 == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m5873remeasureBRTryo0(p0.getValue());
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m5833remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m5852getLastConstraintsDWUhwKw();
        }
        return layoutNode.m5840remeasure_Sx5XlM$ui_release(constraints);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m5840remeasure_Sx5XlM$ui_release(Constraints p0) {
        if (p0 == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m5884remeasureBRTryo0(p0.getValue());
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    public final void invalidateSubtree(boolean p0) {
        LayoutNode parent$ui_release;
        if (p0 && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM5928constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM5928constructorimpl) != 0) {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m5782requireCoordinator64DMado((LayoutModifierNode) nodePop, NodeKind.m5928constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
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
                if ((head.getAggregateChildKindSet() & iM5928constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            layoutNodeArr[i2].invalidateSubtree(false);
        }
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public final void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 5, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 5, null);
        }
        Constraints constraintsM5852getLastConstraintsDWUhwKw = this.layoutDelegate.m5852getLastConstraintsDWUhwKw();
        if (constraintsM5852getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo5991measureAndLayout0kLqBqw(this, constraintsM5852getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public final void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(128);
        boolean zM5937getIncludeSelfInTraversalH91voCI = NodeKindKt.m5937getIncludeSelfInTraversalH91voCI(iM5928constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (zM5937getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (Modifier.Node nodeHeadNode = innerCoordinator$ui_release.headNode(zM5937getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM5928constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                if ((nodeHeadNode.getKindSet() & iM5928constructorimpl) != 0) {
                    Modifier.Node nodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (nodePop != 0) {
                        if (nodePop instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) nodePop).onPlaced(getInnerCoordinator$ui_release());
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

    public final void forEachCoordinator$ui_release(Function1<? super LayoutModifierNodeCoordinator, Unit> p0) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            p0.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(Function1<? super NodeCoordinator, Unit> p0) {
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            p0.invoke(outerCoordinator$ui_release);
        }
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public final SemanticsInfo getParentInfo() {
        return getParent$ui_release();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public final List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* JADX INFO: renamed from: isDeactivated, reason: from getter */
    public final boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onReuse() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onReuse();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            if (!ComposeUiFlags.isSemanticAutofillEnabled) {
                invalidateSemantics$ui_release();
            }
        } else {
            resetModifierState();
        }
        int semanticsId = getSemanticsId();
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner owner = this.owner;
        if (owner != null) {
            owner.onPreLayoutNodeReused(this, semanticsId);
        }
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (ComposeUiFlags.isSemanticAutofillEnabled && this.nodes.m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        rescheduleRemeasureOrRelayout$ui_release(this);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.onPostLayoutNodeReused(this, semanticsId);
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            if (!ComposeUiFlags.isSemanticAutofillEnabled) {
                invalidateSemantics$ui_release();
            } else {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            }
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.onLayoutNodeDeactivated(this);
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u0003R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0016j\b\u0012\u0004\u0012\u00020\f`\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "", "NotPlacedPlaceOrder", "I", "getNotPlacedPlaceOrder$ui_release$annotations", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/ViewConfiguration;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        private Companion() {
        }

        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$42(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode.getZIndex() == layoutNode2.getZIndex()) {
            return Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release());
        }
        return Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<LayoutState> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "<init>", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<UsageByParent> getEntries() {
            return $ENTRIES;
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }
}
