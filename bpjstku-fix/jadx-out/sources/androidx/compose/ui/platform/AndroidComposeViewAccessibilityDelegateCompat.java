package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.collection.ArraySet;
import androidx.collection.IntIntMapKt;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import defpackage.Encoder;
import defpackage.getInput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0086\u00022\u00020\u0001:\n\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u0004\u0018\u00010$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010\"J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010)J=\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b2\u00103J?\u00106\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010)J)\u0010:\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b:\u0010;J1\u0010<\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020,2\b\u0010\u0010\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b<\u0010=J#\u0010@\u001a\u0004\u0018\u00010?2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u00020C*\u00020B2\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u0004\u0018\u00010\u001a*\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u0004\u0018\u00010H*\u00020CH\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u0004\u0018\u00010K*\u00020CH\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010F\u001a\u00020\u001a*\u00020>H\u0002¢\u0006\u0004\bF\u0010NJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020OH\u0000¢\u0006\u0004\bP\u0010QJ\u001f\u0010S\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020R2\u0006\u0010\b\u001a\u00020RH\u0001¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010\u0003\u001a\u00020WH\u0017¢\u0006\u0004\bY\u0010ZJ-\u0010\\\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010[*\u0002042\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u001eH\u0000¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u001eH\u0080@¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020bH\u0000¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020bH\u0002¢\u0006\u0004\be\u0010dJ\u0017\u0010f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020bH\u0002¢\u0006\u0004\bf\u0010dJ\u001f\u0010h\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020b2\u0006\u0010\b\u001a\u00020gH\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u001eH\u0002¢\u0006\u0004\bj\u0010_J\u000f\u0010k\u001a\u00020\u001eH\u0002¢\u0006\u0004\bk\u0010_J\u001d\u0010l\u001a\u00020\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\bl\u0010mJ%\u0010o\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020n0+H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020nH\u0002¢\u0006\u0004\bq\u0010rJ)\u0010s\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\bs\u0010tJ\u001f\u0010v\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020uH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\bx\u0010yJ/\u0010z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b|\u0010VJ/\u0010}\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b}\u0010~J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J'\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001e\u0010\u0087\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u008a\u0001\u001a\u0004\u0018\u00010#*\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001f\u0010\u008c\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R/\u0010\u0090\u0001\u001a\u00020\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u001e\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u0012\u0005\b\u0095\u0001\u0010_\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b\u0094\u0001\u0010VR=\u0010\u0097\u0001\u001a\u000f\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00060\u0096\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u0012\u0005\b\u009d\u0001\u0010_\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R0\u0010¡\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0001@AX\u0081\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0005\b£\u0001\u0010\u0014\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010§\u0001\u001a\u00030¦\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R6\u0010µ\u0001\u001a\u001f\u0012\n\u0012\b*\u00030´\u00010´\u0001*\u000e\u0012\n\u0012\b*\u00030´\u00010´\u00010+0³\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u0010¸\u0001\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b·\u0001\u0010\u0014R\u0016\u0010¹\u0001\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010\u0014R+\u0010º\u0001\u001a\u0004\u0018\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Á\u0001\u001a\u00030À\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001e\u0010Ä\u0001\u001a\u00070Ã\u0001R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u0091\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010\u0091\u0001R\u001b\u0010È\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001b\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010É\u0001R\u0019\u0010Ë\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bË\u0001\u0010¢\u0001R\u001f\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010Ì\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001f\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010Ì\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ï\u0001R'\u0010Ò\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002040Ñ\u00010Ñ\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R'\u0010Õ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002040Ô\u00010Ñ\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ó\u0001R\u0019\u0010Ö\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u0091\u0001R\u001b\u0010×\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u001e\u0010Ú\u0001\u001a\t\u0012\u0004\u0012\u00020b0Ù\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001e\u0010Ý\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0Ü\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010ß\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bß\u0001\u0010¢\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R'\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8C@\u0002X\u0083\u000e¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R\u0019\u0010ç\u0001\u001a\u00020g8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R*\u0010ê\u0001\u001a\u00030é\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R*\u0010ð\u0001\u001a\u00030é\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bð\u0001\u0010ë\u0001\u001a\u0006\bñ\u0001\u0010í\u0001\"\u0006\bò\u0001\u0010ï\u0001R\u001f\u0010ó\u0001\u001a\u00020,8\u0001X\u0081D¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R\u001f\u0010÷\u0001\u001a\u00020,8\u0001X\u0081D¢\u0006\u0010\n\u0006\b÷\u0001\u0010ô\u0001\u001a\u0006\bø\u0001\u0010ö\u0001R\u0018\u0010ú\u0001\u001a\u00030ù\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R \u0010ü\u0001\u001a\t\u0012\u0004\u0012\u00020u0Ì\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bü\u0001\u0010Ï\u0001R\u0019\u0010ý\u0001\u001a\u00020u8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0019\u0010ÿ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010¢\u0001R\u0018\u0010\u0080\u0002\u001a\u00030é\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010ë\u0001R\u0018\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001e\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020n0³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010¶\u0001R$\u0010\u0085\u0002\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001e0\u0096\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0098\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "", "p1", "Landroidx/compose/ui/geometry/Offset;", "p2", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "p3", "canScroll-moWRBKg", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "isRequestFromAccessibilityTool", "()Z", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "createNodeInfo", "(I)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "emptyNodeInfoOrNull", "()Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "Landroid/graphics/Rect;", "boundsInScreen", "(Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;)Landroid/graphics/Rect;", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "populateAccessibilityNodeInfoProperties", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "setContentInvalid", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/SpannableString;", "toSpannableString", "(Landroidx/compose/ui/text/AnnotatedString;)Landroid/text/SpannableString;", "setText", "isAccessibilityFocused", "(I)Z", "requestAccessibilityFocus", "", "", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "sendEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "createEvent", "(II)Landroid/view/accessibility/AccessibilityEvent;", "", "p4", "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "Landroid/os/Bundle;", "performActionHelper", "(IILandroid/os/Bundle;)Z", "addExtraDataToAccessibilityNodeInfoHelper", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Ljava/lang/String;Landroid/os/Bundle;)V", "Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/RectF;", "toScreenCoords", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Outline;", "createOutline", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/graphics/Outline;", "toAndroidRect", "(Landroidx/compose/ui/graphics/Outline;)Landroid/graphics/Rect;", "", "toCornerArray", "(Landroidx/compose/ui/graphics/Outline;)[F", "Landroid/graphics/Region;", "toRegion", "(Landroidx/compose/ui/graphics/Outline;)Landroid/graphics/Region;", "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui_release", "(Landroid/view/MotionEvent;)Z", "", "hitTestSemanticsAt$ui_release", "(FF)I", "updateHoveredVirtualView", "(I)V", "Landroid/view/View;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", ExifInterface.GPS_DIRECTION_TRUE, "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "onSemanticsChange$ui_release", "()V", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "notifySubtreeAccessibilityStateChangedIfNeeded", "sendTypeViewScrolledAccessibilityEvent", "Landroidx/collection/MutableIntSet;", "sendSubtreeChangeAccessibilityEvents", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/MutableIntSet;)V", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "sendSemanticsPropertyChangeEvents", "(Landroidx/collection/IntObjectMap;)V", "Landroidx/compose/ui/platform/ScrollObservationScope;", "registerScrollingId", "(ILjava/util/List;)Z", "scheduleScrollEventIfNeeded", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "sendPaneChangeEvents", "(IILjava/lang/String;)V", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "sendAccessibilitySemanticsStructureChangeEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "semanticsNodeIdToAccessibilityVirtualNodeId", "(I)I", "traverseAtGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "sendPendingTextTraversedAtGranularityEvent", "setAccessibilitySelection", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "getAccessibilitySelectionStart", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIterableTextForAccessibility", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getTextForTextField", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "Lkotlin/Function1;", "onSendAccessibilityEvent", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui_release", "(J)V", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "enabledServices", "Ljava/util/List;", "isEnabled$ui_release", "isEnabled", "isTouchExplorationEnabled", "requestFromAccessibilityToolForTesting", "Ljava/lang/Boolean;", "getRequestFromAccessibilityToolForTesting$ui_release", "()Ljava/lang/Boolean;", "setRequestFromAccessibilityToolForTesting$ui_release", "(Ljava/lang/Boolean;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "nodeProvider", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "accessibilityFocusedVirtualViewId", "focusedVirtualViewId", "currentlyAccessibilityFocusedANI", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "currentlyFocusedANI", "sendingFocusAffectingEvent", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingHorizontalScrollEvents", "Landroidx/collection/MutableIntObjectMap;", "pendingVerticalScrollEvents", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/MutableObjectIntMap;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "Landroidx/collection/ArraySet;", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "LEncoder;", "boundsUpdateChannel", "LEncoder;", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "getCurrentSemanticsNodes", "()Landroidx/collection/IntObjectMap;", "paneDisplayed", "Landroidx/collection/MutableIntSet;", "Landroidx/collection/MutableIntIntMap;", "idToBeforeMap", "Landroidx/collection/MutableIntIntMap;", "getIdToBeforeMap$ui_release", "()Landroidx/collection/MutableIntIntMap;", "setIdToBeforeMap$ui_release", "(Landroidx/collection/MutableIntIntMap;)V", "idToAfterMap", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "ExtraDataTestTraversalBeforeVal", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalAfterVal", "getExtraDataTestTraversalAfterVal$ui_release", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "previousSemanticsNodes", "previousSemanticsRoot", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "checkingForSemanticsChanges", "drawingOrder", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "Companion", "PendingTextTraversedEvent", "ComposeAccessibilityNodeProvider", "Api24Impl", "Api29Impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Encoder<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private final MutableIntIntMap drawingOrder;
    private List<AccessibilityServiceInfo> enabledServices;
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final int $stable = 8;
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }

        {
            super(1);
        }
    };

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f$0, z);
            }
        };
        this.touchExplorationStateListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f$0, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = getInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, null, 6);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        this.drawingOrder = IntIntMapKt.mutableIntIntMapOf();
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View p0) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View p0) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$50(this.f$0);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
            }

            {
                super(1);
            }
        };
    }

    /* JADX INFO: renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1<? super AccessibilityEvent, Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    /* JADX INFO: renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    /* JADX INFO: renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui_release, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List<AccessibilityServiceInfo> listEmptyList;
        if (z) {
            listEmptyList = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: getRequestFromAccessibilityToolForTesting$ui_release, reason: from getter */
    public final Boolean getRequestFromAccessibilityToolForTesting() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui_release(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "action", "I", "getAction", "()I", "granularity", "getGranularity", "fromIndex", "getFromIndex", "toIndex", "getToIndex", "traverseTime", "J", "getTraverseTime", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1);
            if (isEnabled$ui_release()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    /* JADX INFO: renamed from: getIdToBeforeMap$ui_release, reason: from getter */
    public final MutableIntIntMap getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    /* JADX INFO: renamed from: getIdToAfterMap$ui_release, reason: from getter */
    public final MutableIntIntMap getIdToAfterMap() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    /* JADX INFO: renamed from: getExtraDataTestTraversalBeforeVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* JADX INFO: renamed from: getExtraDataTestTraversalAfterVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m6046canScroll0AR0LA0$ui_release(boolean p0, int p1, long p2) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m6045canScrollmoWRBKg(getCurrentSemanticsNodes(), p0, p1, p2);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX INFO: renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m6045canScrollmoWRBKg(IntObjectMap<SemanticsNodeWithAdjustedBounds> p0, boolean p1, int p2, long p3) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m3971equalsimpl0(p3, Offset.INSTANCE.m3989getUnspecifiedF1C5BW0()) || (((9223372034707292159L & p3) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (p1) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (p1) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        Object[] objArr = p0.values;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((j & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3];
                        if (IntRectKt.toRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m4000containsk4lQ0M(p3) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), horizontalScrollAxisRange)) != null) {
                            int i4 = scrollAxisRange.getReverseScrolling() ? -p2 : p2;
                            if (!(p2 == 0 && scrollAxisRange.getReverseScrolling()) && i4 >= 0) {
                                if (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue()) {
                                    z = true;
                                }
                            } else if (scrollAxisRange.getValue().invoke().floatValue() > 0.0f) {
                                z = true;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return true;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return false;
        }
        return AccessibilityManagerCompat.isRequestFromAccessibilityTool(this.accessibilityManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int p0) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(p0);
        if (semanticsNodeWithAdjustedBounds == null) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        boolean zAreEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE);
        if (zAreEqual && !isRequestFromAccessibilityTool()) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompatObtain.setAccessibilityDataSensitive(zAreEqual);
        if (p0 == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer numValueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (numValueOf == null) {
                StringBuilder sb = new StringBuilder("semanticsNode ");
                sb.append(p0);
                sb.append(" has null parent");
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
                throw new KotlinNothingValueException();
            }
            int iIntValue = numValueOf.intValue();
            accessibilityNodeInfoCompatObtain.setParent(this.view, iIntValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? iIntValue : -1);
        }
        accessibilityNodeInfoCompatObtain.setSource(this.view, p0);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(p0, accessibilityNodeInfoCompatObtain, semanticsNode);
        return accessibilityNodeInfoCompatObtain;
    }

    private final AccessibilityNodeInfoCompat emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return AccessibilityNodeInfoCompat.obtain();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds p0) {
        IntRect adjustedBounds = p0.getAdjustedBounds();
        long jMo5589localToScreenMKHz9U = this.view.mo5589localToScreenMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(adjustedBounds.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(adjustedBounds.getLeft())) << 32)));
        long jMo5589localToScreenMKHz9U2 = this.view.mo5589localToScreenMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(adjustedBounds.getRight())) << 32) | (((long) Float.floatToRawIntBits(adjustedBounds.getBottom())) & 4294967295L)));
        int i = (int) (jMo5589localToScreenMKHz9U >> 32);
        int i2 = (int) (jMo5589localToScreenMKHz9U2 >> 32);
        int i3 = (int) (jMo5589localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (jMo5589localToScreenMKHz9U2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x0640 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x0642 A[LOOP:2: B:211:0x05fb->B:223:0x0642, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:349:0x0648 A[EDGE_INSN: B:349:0x0648->B:224:0x0648 BREAK  A[LOOP:2: B:211:0x05fb->B:223:0x0642], SYNTHETIC] */
    private final void populateAccessibilityNodeInfoProperties(int p0, AccessibilityNodeInfoCompat p1, SemanticsNode p2) {
        View viewSemanticsIdToView;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        String accessibilityExtraKey;
        boolean z;
        int orDefault;
        SemanticsNode semanticsNode;
        SemanticsConfiguration config;
        Resources resources = this.view.getContext().getResources();
        p1.setClassName(ClassName);
        if (p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            p1.setClassName(TextFieldClassName);
        }
        if (p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getText())) {
            p1.setClassName(TextClassName);
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            role.getValue();
            if (p2.getIsFake() || p2.getReplacedChildren$ui_release().isEmpty()) {
                if (Role.m6140equalsimpl0(role.getValue(), Role.INSTANCE.m6151getTabo7Vup1c())) {
                    p1.setRoleDescription(resources.getString(R.string.tab));
                } else if (Role.m6140equalsimpl0(role.getValue(), Role.INSTANCE.m6150getSwitcho7Vup1c())) {
                    p1.setRoleDescription(resources.getString(R.string.switch_role));
                } else {
                    String strM6119toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m6119toLegacyClassNameV4PA4sw(role.getValue());
                    if (!Role.m6140equalsimpl0(role.getValue(), Role.INSTANCE.m6148getImageo7Vup1c()) || p2.isUnmergedLeafNode$ui_release() || p2.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        p1.setClassName(strM6119toLegacyClassNameV4PA4sw);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        p1.setPackageName(this.view.getContext().getPackageName());
        p1.setImportantForAccessibility(SemanticsOwnerKt.isImportantForAccessibility(p2));
        boolean zIsRequestFromAccessibilityTool = isRequestFromAccessibilityTool();
        List<SemanticsNode> replacedChildren$ui_release = p2.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (semanticsNode2.getId() != -1) {
                    if (androidViewHolder != null) {
                        p1.addChild(androidViewHolder);
                    } else {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(semanticsNode2.getId());
                        boolean zAreEqual = (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null || (config = semanticsNode.getConfig()) == null) ? false : Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE);
                        if (zIsRequestFromAccessibilityTool || !zAreEqual) {
                            p1.addChild(this.view, semanticsNode2.getId());
                        }
                    }
                    this.drawingOrder.put(semanticsNode2.getId(), i);
                    i++;
                }
            }
        }
        if (p0 == this.accessibilityFocusedVirtualViewId) {
            p1.setAccessibilityFocused(true);
            p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            p1.setAccessibilityFocused(false);
            p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(p2, p1);
        setContentInvalid(p2, p1);
        p1.setStateDescription(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoStateDescriptionOrNull(p2, resources));
        p1.setCheckable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoIsCheckable(p2));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                p1.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                p1.setChecked(false);
            }
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iM6151getTabo7Vup1c = Role.INSTANCE.m6151getTabo7Vup1c();
            if (role != null && Role.m6140equalsimpl0(role.getValue(), iM6151getTabo7Vup1c)) {
                p1.setSelected(zBooleanValue);
            } else {
                p1.setChecked(zBooleanValue);
            }
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
        }
        if (!p2.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || p2.getReplacedChildren$ui_release().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
            p1.setContentDescription(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            for (SemanticsNode parent = p2; parent != null; parent = parent.getParent()) {
                if (parent.getUnmergedConfig().contains(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                    if (!((Boolean) parent.getUnmergedConfig().get(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue()) {
                        break;
                    }
                    p1.setViewIdResourceName(str);
                    break;
                }
            }
        }
        if (((Unit) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHeading())) != null) {
            p1.setHeading(true);
            Unit unit7 = Unit.INSTANCE;
            Unit unit8 = Unit.INSTANCE;
        }
        if (p0 != -1 && (orDefault = this.drawingOrder.getOrDefault(p2.getId(), -1)) != -1) {
            p1.setDrawingOrder(orDefault);
            Unit unit9 = Unit.INSTANCE;
        }
        p1.setPassword(p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        p1.setEditable(p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getIsEditable()));
        Integer num = (Integer) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getMaxTextLength());
        p1.setMaxTextLength(num != null ? num.intValue() : -1);
        p1.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2));
        p1.setFocusable(p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getFocused()));
        if (p1.isFocusable()) {
            p1.setFocused(((Boolean) p2.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (p1.isFocused()) {
                p1.addAction(2);
                this.focusedVirtualViewId = p0;
            } else {
                p1.addAction(1);
            }
        }
        p1.setVisibleToUser(!SemanticsOwnerKt.isHidden(p2));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int value = liveRegionMode.getValue();
            p1.setLiveRegion((!LiveRegionMode.m6131equalsimpl0(value, LiveRegionMode.INSTANCE.m6136getPolite0phEisY()) && LiveRegionMode.m6131equalsimpl0(value, LiveRegionMode.INSTANCE.m6135getAssertive0phEisY())) ? 2 : 1);
            Unit unit10 = Unit.INSTANCE;
            Unit unit11 = Unit.INSTANCE;
        }
        p1.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean zAreEqual2 = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected()), Boolean.TRUE);
            int iM6151getTabo7Vup1c2 = Role.INSTANCE.m6151getTabo7Vup1c();
            if (role != null && Role.m6140equalsimpl0(role.getValue(), iM6151getTabo7Vup1c2)) {
                z = true;
            } else {
                int iM6149getRadioButtono7Vup1c = Role.INSTANCE.m6149getRadioButtono7Vup1c();
                if (role != null && Role.m6140equalsimpl0(role.getValue(), iM6149getRadioButtono7Vup1c)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            p1.setClickable(!z || (z && !zAreEqual2));
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2) && p1.isClickable()) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit12 = Unit.INSTANCE;
            Unit unit13 = Unit.INSTANCE;
        }
        p1.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            p1.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2)) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit14 = Unit.INSTANCE;
            Unit unit15 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit16 = Unit.INSTANCE;
            Unit unit17 = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit18 = Unit.INSTANCE;
                Unit unit19 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnImeAction());
            if (accessibilityAction5 != null) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit20 = Unit.INSTANCE;
                Unit unit21 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction6 != null) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit22 = Unit.INSTANCE;
                Unit unit23 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction7 != null) {
                if (p1.isFocused() && this.view.getClipboardManager().hasText()) {
                    p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit24 = Unit.INSTANCE;
                Unit unit25 = Unit.INSTANCE;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(p2);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            p1.setTextSelection(getAccessibilitySelectionStart(p2), getAccessibilitySelectionEnd(p2));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetSelection());
            p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            p1.addAction(256);
            p1.addAction(512);
            p1.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && p2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(p2)) {
                p1.setMovementGranularities(p1.getMovementGranularities() | 20);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = p1.getText();
            if (text != null && text.length() != 0 && p2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                arrayList.add(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY);
            }
            if (p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            if (p2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getShape())) {
                arrayList.add(ExtraDataShapeTypeKey);
                arrayList.add(ExtraDataShapeRectKey);
                arrayList.add(ExtraDataShapeRectCornersKey);
                arrayList.add(ExtraDataShapeRegionKey);
            }
            ScatterSet<SemanticsPropertyKey<?>> accessibilityExtraKeys$ui_release = p2.getUnmergedConfig().getAccessibilityExtraKeys$ui_release();
            if (accessibilityExtraKeys$ui_release != null) {
                Object[] objArr = accessibilityExtraKeys$ui_release.elements;
                long[] jArr = accessibilityExtraKeys$ui_release.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128 && (accessibilityExtraKey = ((SemanticsPropertyKey) objArr[(i3 << 3) + i5]).getAccessibilityExtraKey()) != null) {
                                    arrayList.add(accessibilityExtraKey);
                                    Unit unit26 = Unit.INSTANCE;
                                    Unit unit27 = Unit.INSTANCE;
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                Unit unit28 = Unit.INSTANCE;
            }
            p1.setAvailableExtraData(arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (p2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                p1.setClassName("android.widget.SeekBar");
            } else {
                p1.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                p1.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (p2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2)) {
                if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                }
                if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                }
            }
        }
        Api24Impl.addSetProgressAction(p1, p2);
        CollectionInfo_androidKt.setCollectionInfo(p2, p1);
        CollectionInfo_androidKt.setCollectionItemInfo(p2, p1);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(p2)) {
                p1.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                p1.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(p2)) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    p1.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(p2)) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    p1.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(p2)) {
                p1.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                p1.setScrollable(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    p1.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.addPageActions(p1, p2);
        }
        p1.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getPaneTitle()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p2)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction10 != null) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit29 = Unit.INSTANCE;
                Unit unit30 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction11 != null) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit31 = Unit.INSTANCE;
                Unit unit32 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction12 != null) {
                p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit33 = Unit.INSTANCE;
                Unit unit34 = Unit.INSTANCE;
            }
            if (p2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getCustomActions())) {
                List list3 = (List) p2.getUnmergedConfig().get(SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list3.size();
                IntList intList = AccessibilityActionsResourceIds;
                if (size2 >= intList._size) {
                    StringBuilder sb = new StringBuilder("Can't have more than ");
                    sb.append(intList._size);
                    sb.append(" custom actions for one widget");
                    throw new IllegalStateException(sb.toString());
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                MutableObjectIntMap<CharSequence> mutableObjectIntMapMutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
                if (this.labelToActionId.containsKey(p0)) {
                    MutableObjectIntMap<CharSequence> mutableObjectIntMap = this.labelToActionId.get(p0);
                    MutableIntList mutableIntList = new MutableIntList(0, 1, null);
                    int[] iArr = intList.content;
                    int i6 = intList._size;
                    for (int i7 = 0; i7 < i6; i7++) {
                        mutableIntList.add(iArr[i7]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i8);
                        Intrinsics.checkNotNull(mutableObjectIntMap);
                        if (mutableObjectIntMap.containsKey(customAccessibilityAction.getLabel())) {
                            int i9 = mutableObjectIntMap.get(customAccessibilityAction.getLabel());
                            sparseArrayCompat.put(i9, customAccessibilityAction.getLabel());
                            mutableObjectIntMapMutableObjectIntMapOf.set(customAccessibilityAction.getLabel(), i9);
                            mutableIntList.remove(i9);
                            p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i9, customAccessibilityAction.getLabel()));
                            Unit unit35 = Unit.INSTANCE;
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i10);
                        int i11 = mutableIntList.get(i10);
                        sparseArrayCompat.put(i11, customAccessibilityAction2.getLabel());
                        mutableObjectIntMapMutableObjectIntMapOf.set(customAccessibilityAction2.getLabel(), i11);
                        p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i12);
                        int i13 = AccessibilityActionsResourceIds.get(i12);
                        sparseArrayCompat.put(i13, customAccessibilityAction3.getLabel());
                        mutableObjectIntMapMutableObjectIntMapOf.set(customAccessibilityAction3.getLabel(), i13);
                        p1.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i13, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(p0, sparseArrayCompat);
                this.labelToActionId.put(p0, mutableObjectIntMapMutableObjectIntMapOf);
            }
        }
        p1.setScreenReaderFocusable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(p2, resources));
        int orDefault2 = this.idToBeforeMap.getOrDefault(p0, -1);
        if (orDefault2 != -1) {
            View viewSemanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), orDefault2);
            if (viewSemanticsIdToView2 != null) {
                p1.setTraversalBefore(viewSemanticsIdToView2);
            } else {
                p1.setTraversalBefore(this.view, orDefault2);
            }
            addExtraDataToAccessibilityNodeInfoHelper(p0, p1, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int orDefault3 = this.idToAfterMap.getOrDefault(p0, -1);
        if (orDefault3 != -1 && (viewSemanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), orDefault3)) != null) {
            p1.setTraversalAfter(viewSemanticsIdToView);
            addExtraDataToAccessibilityNodeInfoHelper(p0, p1, this.ExtraDataTestTraversalAfterVal, null);
        }
        String str2 = (String) SemanticsConfigurationKt.getOrNull(p2.getUnmergedConfig(), SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName());
        if (str2 != null) {
            p1.setClassName(str2);
            Unit unit36 = Unit.INSTANCE;
            Unit unit37 = Unit.INSTANCE;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final void setContentInvalid(SemanticsNode p0, AccessibilityNodeInfoCompat p1) {
        if (p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getError())) {
            p1.setContentInvalid(true);
            p1.setError((CharSequence) SemanticsConfigurationKt.getOrNull(p0.getUnmergedConfig(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    private final void setText(SemanticsNode p0, AccessibilityNodeInfoCompat p1) {
        AnnotatedString infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(p0);
        p1.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final boolean isAccessibilityFocused(int p0) {
        return this.accessibilityFocusedVirtualViewId == p0;
    }

    private final boolean requestAccessibilityFocus(int p0) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(p0)) {
            return false;
        }
        int i = this.accessibilityFocusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = p0;
        this.view.invalidate();
        sendEventForVirtualView$default(this, p0, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int p0, int p1, Integer p2, List<String> p3) {
        if (p0 == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(p0, p1);
        if (p2 != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(p2.intValue());
        }
        if (p3 != null) {
            accessibilityEventCreateEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(p3, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(accessibilityEventCreateEvent);
    }

    private final boolean sendEvent(AccessibilityEvent p0) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (p0.getEventType() == 2048 || p0.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(p0).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final AccessibilityEvent createEvent(int p0, int p1) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(p1);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, p0);
        if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(p0)) != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
            AccessibilityEventCompat.setAccessibilityDataSensitive(accessibilityEventObtain, Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int p0, Integer p1, Integer p2, Integer p3, CharSequence p4) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(p0, 8192);
        if (p1 != null) {
            accessibilityEventCreateEvent.setFromIndex(p1.intValue());
        }
        if (p2 != null) {
            accessibilityEventCreateEvent.setToIndex(p2.intValue());
        }
        if (p3 != null) {
            accessibilityEventCreateEvent.setItemCount(p3.intValue());
        }
        if (p4 != null) {
            accessibilityEventCreateEvent.getText().add(p4);
        }
        return accessibilityEventCreateEvent;
    }

    private final boolean clearAccessibilityFocus(int p0) {
        if (!isAccessibilityFocused(p0)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, p0, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v23, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.SemanticsModifierNode] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x013b -> B:68:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:68:0x013c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean performActionHelper(int r16, int r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        if (f >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int p0, AccessibilityNodeInfoCompat p1, String p2, Bundle p3) {
        SemanticsNode semanticsNode;
        Region region;
        float[] cornerArray;
        Rect androidRect;
        TextLayoutResult textLayoutResult;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(p0);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(p2, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(p0, -1);
            if (orDefault != -1) {
                p1.getExtras().putInt(p2, orDefault);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(p2, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(p0, -1);
            if (orDefault2 != -1) {
                p1.getExtras().putInt(p2, orDefault2);
                return;
            }
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && p3 != null && Intrinsics.areEqual(p2, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            int i = p3.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
            int i2 = p3.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
            if (i2 <= 0 || i < 0) {
                return;
            }
            if (i >= (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig())) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                if (i4 >= textLayoutResult.getLayoutInput().getText().length()) {
                    arrayList.add(null);
                } else {
                    arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i4)));
                }
            }
            p1.getExtras().putParcelableArray(p2, (Parcelable[]) arrayList.toArray(new RectF[0]));
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTestTag()) && p3 != null && Intrinsics.areEqual(p2, ExtraDataTestTagKey)) {
            String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTestTag());
            if (str != null) {
                p1.getExtras().putCharSequence(p2, str);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(p2, ExtraDataIdKey)) {
            p1.getExtras().putInt(p2, semanticsNode.getId());
            return;
        }
        if (Intrinsics.areEqual(p2, ExtraDataShapeTypeKey)) {
            Shape shape = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape != null) {
                Outline outlineCreateOutline = createOutline(shape, semanticsNode);
                if (outlineCreateOutline instanceof Outline.Rectangle) {
                    p1.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    p1.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(outlineCreateOutline));
                    return;
                } else if (outlineCreateOutline instanceof Outline.Rounded) {
                    p1.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    p1.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(outlineCreateOutline));
                    p1.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(outlineCreateOutline));
                    return;
                } else {
                    if (outlineCreateOutline instanceof Outline.Generic) {
                        p1.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                        p1.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(outlineCreateOutline));
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return;
        }
        if (Intrinsics.areEqual(p2, ExtraDataShapeRectKey)) {
            Shape shape2 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape2 == null || (androidRect = toAndroidRect(createOutline(shape2, semanticsNode))) == null) {
                return;
            }
            p1.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
            return;
        }
        if (Intrinsics.areEqual(p2, ExtraDataShapeRectCornersKey)) {
            Shape shape3 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape3 == null || (cornerArray = toCornerArray(createOutline(shape3, semanticsNode))) == null) {
                return;
            }
            p1.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (Intrinsics.areEqual(p2, ExtraDataShapeRegionKey)) {
            Shape shape4 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getShape());
            if (shape4 == null || (region = toRegion(createOutline(shape4, semanticsNode))) == null) {
                return;
            }
            p1.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
            return;
        }
        ScatterSet<SemanticsPropertyKey<?>> accessibilityExtraKeys$ui_release = semanticsNode.getUnmergedConfig().getAccessibilityExtraKeys$ui_release();
        if (accessibilityExtraKeys$ui_release == null) {
            return;
        }
        Object[] objArr = accessibilityExtraKeys$ui_release.elements;
        long[] jArr = accessibilityExtraKeys$ui_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j = jArr[i5];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j) < 128) {
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i5 << 3) + i7];
                        String accessibilityExtraKey = semanticsPropertyKey.getAccessibilityExtraKey();
                        if (Intrinsics.areEqual(accessibilityExtraKey, p2)) {
                            Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsPropertyKey);
                            if (orNull instanceof Serializable) {
                                p1.getExtras().putSerializable(accessibilityExtraKey, (Serializable) orNull);
                            } else {
                                if (!(orNull instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                p1.getExtras().putParcelable(accessibilityExtraKey, (Parcelable) orNull);
                            }
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    private final RectF toScreenCoords(SemanticsNode p0, androidx.compose.ui.geometry.Rect p1) {
        if (p0 == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rectM4011translatek4lQ0M = p1.m4011translatek4lQ0M(p0.m6154getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = p0.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect rectIntersect = rectM4011translatek4lQ0M.overlaps(boundsInRoot) ? rectM4011translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        long jMo5589localToScreenMKHz9U = this.view.mo5589localToScreenMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(rectIntersect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(rectIntersect.getLeft())) << 32)));
        long jMo5589localToScreenMKHz9U2 = this.view.mo5589localToScreenMKHz9U(Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(rectIntersect.getRight())) << 32) | (((long) Float.floatToRawIntBits(rectIntersect.getBottom())) & 4294967295L)));
        int i = (int) (jMo5589localToScreenMKHz9U >> 32);
        int i2 = (int) (jMo5589localToScreenMKHz9U2 >> 32);
        int i3 = (int) (jMo5589localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (jMo5589localToScreenMKHz9U2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
    }

    private final Outline createOutline(Shape shape, SemanticsNode semanticsNode) {
        return shape.mo605createOutlinePq9zytI(IntSizeKt.m7118toSizeozmzZPI(semanticsNode.m6157getSizeYbymL2g()), semanticsNode.getLayoutInfo().getLayoutDirection(), this.view.getDensity());
    }

    private final Rect toAndroidRect(Outline outline) {
        if ((outline instanceof Outline.Rectangle) || (outline instanceof Outline.Rounded)) {
            return toAndroidRect(outline.getRect());
        }
        return null;
    }

    private final float[] toCornerArray(Outline outline) {
        if (!(outline instanceof Outline.Rounded)) {
            return null;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        return new float[]{Float.intBitsToFloat((int) (rounded.getRoundRect().m4024getTopLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4024getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4025getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4025getTopRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4023getBottomRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4023getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m4022getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (4294967295L & rounded.getRoundRect().m4022getBottomLeftCornerRadiuskKHJgLs()))};
    }

    private final Region toRegion(Outline outline) {
        if (!(outline instanceof Outline.Generic)) {
            return null;
        }
        Outline.Generic generic = (Outline.Generic) outline;
        Region region = new Region(toAndroidRect(generic.getRect()));
        Region region2 = new Region();
        Path path = generic.getPath();
        if (path instanceof AndroidPath) {
            region2.setPath(((AndroidPath) path).getInternalPath(), region);
            return region2;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    private final Rect toAndroidRect(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent p0) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = p0.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(p0.getX(), p0.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(p0);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(p0);
    }

    public final int hitTestSemanticsAt$ui_release(float p0, float p1) {
        int iSemanticsNodeIdToAccessibilityVirtualNodeId;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m5831hitTestSemantics6fMxITs$ui_release$default(this.view.getRoot(), Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(p1)) & 4294967295L) | (((long) Float.floatToRawIntBits(p0)) << 32)), hitTestResult, 0, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            iSemanticsNodeIdToAccessibilityVirtualNodeId = Integer.MIN_VALUE;
            if (lastIndex < 0) {
                break;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (layoutNodeRequireLayoutNode.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
                iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
                SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false);
                if (SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker())) {
                    break;
                }
            }
            lastIndex--;
        }
        return iSemanticsNodeIdToAccessibilityVirtualNodeId;
    }

    private final void updateHoveredVirtualView(int p0) {
        int i = this.hoveredVirtualViewId;
        if (i == p0) {
            return;
        }
        this.hoveredVirtualViewId = p0;
        sendEventForVirtualView$default(this, p0, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View p0) {
        return this.nodeProvider;
    }

    private final <T extends CharSequence> T trimToSize(T p0, int p1) {
        if (p1 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (p0 == null || p0.length() == 0 || p0.length() <= p1) {
            return p0;
        }
        int i = p1 - 1;
        if (Character.isHighSurrogate(p0.charAt(i)) && Character.isLowSurrogate(p0.charAt(p1))) {
            p1 = i;
        }
        T t = (T) p0.subSequence(0, p1);
        Intrinsics.checkNotNull(t, "");
        return t;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0032, B:22:0x005a, B:25:0x0069, B:27:0x0071, B:29:0x007a, B:31:0x0085, B:32:0x0096, B:34:0x009d, B:35:0x00a6, B:18:0x0047, B:21:0x004e), top: B:44:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0032, B:22:0x005a, B:25:0x0069, B:27:0x0071, B:29:0x007a, B:31:0x0085, B:32:0x0096, B:34:0x009d, B:35:0x00a6, B:18:0x0047, B:21:0x004e), top: B:44:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[Catch: all -> 0x00cd, LOOP:0: B:30:0x0083->B:31:0x0085, LOOP_END, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0032, B:22:0x005a, B:25:0x0069, B:27:0x0071, B:29:0x007a, B:31:0x0085, B:32:0x0096, B:34:0x009d, B:35:0x00a6, B:18:0x0047, B:21:0x004e), top: B:44:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0032, B:22:0x005a, B:25:0x0069, B:27:0x0071, B:29:0x007a, B:31:0x0085, B:32:0x0096, B:34:0x009d, B:35:0x00a6, B:18:0x0047, B:21:0x004e), top: B:44:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (defpackage.AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c1 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void onLayoutChange$ui_release(LayoutNode p0) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode p0) {
        if (this.subtreeChangedLayoutNodes.add(p0)) {
            this.boundsUpdateChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Unit.INSTANCE);
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode p0) {
        if (!p0.isAttached() || this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(p0)) {
            return;
        }
        int semanticsId = p0.getSemanticsId();
        ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
        ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
        if (scrollAxisRange == null && scrollAxisRange2 == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, 4096);
        if (scrollAxisRange != null) {
            accessibilityEventCreateEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
            accessibilityEventCreateEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
        }
        if (scrollAxisRange2 != null) {
            accessibilityEventCreateEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
            accessibilityEventCreateEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode p0, MutableIntSet p1) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode layoutNodeFindClosestParentNode;
        if (!p0.isAttached() || this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(p0)) {
            return;
        }
        if (!p0.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
            p0 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(p0, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(LayoutNode layoutNode) {
                    return Boolean.valueOf(layoutNode.getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8)));
                }
            });
        }
        if (p0 == null || (semanticsConfiguration = p0.getSemanticsConfiguration()) == null) {
            return;
        }
        if (!semanticsConfiguration.getIsMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(p0, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode layoutNode) {
                SemanticsConfiguration semanticsConfiguration2 = layoutNode.getSemanticsConfiguration();
                boolean z = false;
                if (semanticsConfiguration2 != null && semanticsConfiguration2.getIsMergingSemanticsOfDescendants()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        })) != null) {
            p0 = layoutNodeFindClosestParentNode;
        }
        if (p0 != null) {
            int semanticsId = p0.getSemanticsId();
            if (p1.add(semanticsId)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[LOOP:0: B:5:0x0026->B:28:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[EDGE_INSN: B:54:0x00a9->B:29:0x00a9 BREAK  A[LOOP:0: B:5:0x0026->B:28:0x009e], SYNTHETIC] */
    private final void updateSemanticsNodesCopyAndPanes() {
        SemanticsConfiguration unmergedConfig;
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        MutableIntSet mutableIntSet2 = this.paneDisplayed;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        long j = 128;
        long j2 = 255;
        char c = 7;
        long j3 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                long[] jArr2 = jArr;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                    jArr = jArr2;
                    j = 128;
                    j2 = 255;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j4 & j2) < j) {
                            int i4 = iArr[(i << 3) + i3];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i4);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null || !semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                mutableIntSet.add(i4);
                                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i4);
                                sendPaneChangeEvents(i4, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                        }
                        j4 >>= 8;
                        i3++;
                        j = 128;
                        j2 = 255;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                    jArr = jArr2;
                    j = 128;
                    j2 = 255;
                }
            }
        }
        this.paneDisplayed.removeAll(mutableIntSet);
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr2 = currentSemanticsNodes.keys;
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr3 = currentSemanticsNodes.metadata;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr3[i5];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j5 & 255) < 128) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr2[i8];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i8];
                            if (semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle()) && this.paneDisplayed.add(i9)) {
                                sendPaneChangeEvents(i9, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                            this.previousSemanticsNodes.set(i9, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length2) {
                    break;
                }
                i5++;
                c = 7;
                j3 = -9187201950435737472L;
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code duplicated, block: B:162:0x057b  */
    private final void sendSemanticsPropertyChangeEvents(IntObjectMap<SemanticsNodeWithAdjustedBounds> p0) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i6;
        int i7;
        int i8;
        int i9;
        SemanticsNode semanticsNode;
        int i10;
        boolean zPropertiesDeleted;
        long[] jArr3;
        Object[] objArr;
        int i11;
        Object[] objArr2;
        long[] jArr4;
        Object[] objArr3;
        int i12;
        SemanticsNode semanticsNode2;
        int i13;
        Object[] objArr4;
        ArrayList arrayList3;
        int i14;
        int i15;
        String text;
        AccessibilityEvent accessibilityEventCreateTextSelectionChangedEvent;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap = p0;
        ArrayList arrayList4 = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        int[] iArr3 = intObjectMap.keys;
        long[] jArr5 = intObjectMap.metadata;
        int i16 = 2;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j = jArr5[i17];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8;
                int i19 = 8 - ((~(i17 - length)) >>> 31);
                long j2 = j;
                int i20 = 0;
                while (i20 < i19) {
                    if ((j2 & 255) < 128) {
                        int i21 = iArr3[(i17 << 3) + i20];
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i21);
                        if (semanticsNodeCopy == null) {
                            i4 = i20;
                            i5 = i19;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i6 = length;
                            i7 = i17;
                            i8 = i16;
                        } else {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i21);
                            SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode3 != null) {
                                MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsNode3.getUnmergedConfig().getProps$ui_release();
                                Object[] objArr5 = props$ui_release.keys;
                                Object[] objArr6 = props$ui_release.values;
                                long[] jArr6 = props$ui_release.metadata;
                                int length2 = jArr6.length - i16;
                                if (length2 >= 0) {
                                    i4 = i20;
                                    int i22 = i19;
                                    int i23 = 0;
                                    zPropertiesDeleted = false;
                                    while (true) {
                                        long j3 = jArr6[i23];
                                        iArr2 = iArr3;
                                        jArr2 = jArr5;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                            long j4 = j3;
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                if ((j4 & 255) < 128) {
                                                    int i26 = (i23 << 3) + i25;
                                                    Object obj = objArr5[i26];
                                                    Object obj2 = objArr6[i26];
                                                    SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                                    jArr4 = jArr6;
                                                    if (((Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) && registerScrollingId(i21, arrayList4)) || !Intrinsics.areEqual(obj2, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) {
                                                        objArr3 = objArr5;
                                                        String str = "";
                                                        if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getPaneTitle())) {
                                                            Intrinsics.checkNotNull(obj2, "");
                                                            String str2 = (String) obj2;
                                                            if (semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                                                sendPaneChangeEvents(i21, 8, str2);
                                                            }
                                                            Unit unit = Unit.INSTANCE;
                                                        } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getStateDescription()) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getToggleableState())) {
                                                            semanticsNode2 = semanticsNode3;
                                                            i15 = length2;
                                                            i13 = length;
                                                            objArr4 = objArr6;
                                                            i17 = i17;
                                                            i12 = i22;
                                                            arrayList3 = arrayList4;
                                                            i14 = i21;
                                                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, 64, null, 8, null);
                                                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, 0, null, 8, null);
                                                        } else {
                                                            if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                                                                semanticsNode2 = semanticsNode3;
                                                                int i27 = i21;
                                                                i12 = i22;
                                                                i15 = length2;
                                                                arrayList3 = arrayList4;
                                                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i21), 2048, 64, null, 8, null);
                                                                i14 = i27;
                                                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i27), 2048, 0, null, 8, null);
                                                            } else {
                                                                semanticsNode2 = semanticsNode3;
                                                                i15 = length2;
                                                                i12 = i22;
                                                                arrayList3 = arrayList4;
                                                                i14 = i21;
                                                                if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getSelected())) {
                                                                    Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
                                                                    int iM6151getTabo7Vup1c = Role.INSTANCE.m6151getTabo7Vup1c();
                                                                    if (role != null && Role.m6140equalsimpl0(role.getValue(), iM6151getTabo7Vup1c)) {
                                                                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected()), Boolean.TRUE)) {
                                                                            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i14), 4);
                                                                            SemanticsNode semanticsNodeCopyWithMergingEnabled$ui_release = semanticsNode2.copyWithMergingEnabled$ui_release();
                                                                            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopyWithMergingEnabled$ui_release.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
                                                                            String strFastJoinToString$default = list != null ? ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
                                                                            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopyWithMergingEnabled$ui_release.getConfig(), SemanticsProperties.INSTANCE.getText());
                                                                            String strFastJoinToString$default2 = list2 != null ? ListUtilsKt.fastJoinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
                                                                            if (strFastJoinToString$default != null) {
                                                                                accessibilityEventCreateEvent.setContentDescription(strFastJoinToString$default);
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                                Unit unit3 = Unit.INSTANCE;
                                                                            }
                                                                            if (strFastJoinToString$default2 != null) {
                                                                                accessibilityEventCreateEvent.getText().add(strFastJoinToString$default2);
                                                                            }
                                                                            sendEvent(accessibilityEventCreateEvent);
                                                                        } else {
                                                                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, 0, null, 8, null);
                                                                        }
                                                                    } else {
                                                                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, 64, null, 8, null);
                                                                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, 0, null, 8, null);
                                                                    }
                                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getContentDescription())) {
                                                                    int iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(i14);
                                                                    Intrinsics.checkNotNull(obj2, "");
                                                                    sendEventForVirtualView(iSemanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) obj2);
                                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getEditableText())) {
                                                                    if (semanticsNode2.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText())) {
                                                                        AnnotatedString textForTextField = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                                        CharSequence charSequence = textForTextField != null ? textForTextField : "";
                                                                        AnnotatedString textForTextField2 = getTextForTextField(semanticsNode2.getUnmergedConfig());
                                                                        String str3 = textForTextField2 != null ? textForTextField2 : "";
                                                                        CharSequence charSequenceTrimToSize = trimToSize(str3, ParcelSafeTextLength);
                                                                        int length3 = charSequence.length();
                                                                        int length4 = str3.length();
                                                                        int iCoerceAtMost = RangesKt.coerceAtMost(length3, length4);
                                                                        int i28 = 0;
                                                                        while (true) {
                                                                            if (i28 >= iCoerceAtMost) {
                                                                                i13 = length;
                                                                                objArr4 = objArr6;
                                                                                break;
                                                                            }
                                                                            objArr4 = objArr6;
                                                                            i13 = length;
                                                                            if (charSequence.charAt(i28) != str3.charAt(i28)) {
                                                                                break;
                                                                            }
                                                                            i28++;
                                                                            objArr6 = objArr4;
                                                                            length = i13;
                                                                        }
                                                                        int i29 = 0;
                                                                        while (i29 < iCoerceAtMost - i28) {
                                                                            int i30 = iCoerceAtMost;
                                                                            if (charSequence.charAt((length3 - 1) - i29) != str3.charAt((length4 - 1) - i29)) {
                                                                                break;
                                                                            }
                                                                            i29++;
                                                                            iCoerceAtMost = i30;
                                                                        }
                                                                        boolean zContains = semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
                                                                        boolean zContains2 = semanticsNode2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
                                                                        boolean zContains3 = semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
                                                                        boolean z = zContains3 && !zContains && zContains2;
                                                                        boolean z2 = zContains3 && zContains && !zContains2;
                                                                        if (z || z2) {
                                                                            accessibilityEventCreateTextSelectionChangedEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i14), 0, 0, Integer.valueOf(length4), charSequenceTrimToSize);
                                                                        } else {
                                                                            accessibilityEventCreateTextSelectionChangedEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i14), 16);
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setFromIndex(i28);
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setRemovedCount((length3 - i29) - i28);
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setAddedCount((length4 - i29) - i28);
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setBeforeText(charSequence);
                                                                            accessibilityEventCreateTextSelectionChangedEvent.getText().add(charSequenceTrimToSize);
                                                                        }
                                                                        accessibilityEventCreateTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                        sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        if (z || z2) {
                                                                            long packedValue = ((TextRange) semanticsNode2.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setFromIndex(TextRange.m6397getStartimpl(packedValue));
                                                                            accessibilityEventCreateTextSelectionChangedEvent.setToIndex(TextRange.m6392getEndimpl(packedValue));
                                                                            sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                                                        }
                                                                        Unit unit4 = Unit.INSTANCE;
                                                                    } else {
                                                                        i13 = length;
                                                                        objArr4 = objArr6;
                                                                        i17 = i17;
                                                                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, 2, null, 8, null);
                                                                    }
                                                                } else {
                                                                    i13 = length;
                                                                    objArr4 = objArr6;
                                                                    i17 = i17;
                                                                    if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                                                        AnnotatedString textForTextField3 = getTextForTextField(semanticsNode2.getUnmergedConfig());
                                                                        if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                                                            str = text;
                                                                        }
                                                                        long packedValue2 = ((TextRange) semanticsNode2.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                                                        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i14), Integer.valueOf(TextRange.m6397getStartimpl(packedValue2)), Integer.valueOf(TextRange.m6392getEndimpl(packedValue2)), Integer.valueOf(str.length()), trimToSize(str, ParcelSafeTextLength)));
                                                                        sendPendingTextTraversedAtGranularityEvent(semanticsNode2.getId());
                                                                        Unit unit5 = Unit.INSTANCE;
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                                                        notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode2.getLayoutNode());
                                                                        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(this.scrollObservationScopes, i14);
                                                                        Intrinsics.checkNotNull(scrollObservationScopeFindById);
                                                                        scrollObservationScopeFindById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                                                        scrollObservationScopeFindById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                                                        scheduleScrollEventIfNeeded(scrollObservationScopeFindById);
                                                                        Unit unit6 = Unit.INSTANCE;
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.INSTANCE.getFocused())) {
                                                                        Intrinsics.checkNotNull(obj2, "");
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            sendEvent(createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode2.getId()), 8));
                                                                        }
                                                                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode2.getId()), 2048, 0, null, 8, null);
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsActions.INSTANCE.getCustomActions())) {
                                                                        List list3 = (List) semanticsNode2.getUnmergedConfig().get(SemanticsActions.INSTANCE.getCustomActions());
                                                                        List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
                                                                        if (list4 != null) {
                                                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                            int size = list3.size();
                                                                            for (int i31 = 0; i31 < size; i31++) {
                                                                                linkedHashSet.add(((CustomAccessibilityAction) list3.get(i31)).getLabel());
                                                                            }
                                                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                            int size2 = list4.size();
                                                                            for (int i32 = 0; i32 < size2; i32++) {
                                                                                linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i32)).getLabel());
                                                                            }
                                                                            if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                zPropertiesDeleted = false;
                                                                            } else {
                                                                                zPropertiesDeleted = true;
                                                                            }
                                                                        } else if (!list3.isEmpty()) {
                                                                            zPropertiesDeleted = true;
                                                                        }
                                                                        Unit unit7 = Unit.INSTANCE;
                                                                    } else {
                                                                        boolean z3 = ((obj2 instanceof AccessibilityAction) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) obj2, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) ? false : true;
                                                                        Unit unit8 = Unit.INSTANCE;
                                                                        zPropertiesDeleted = z3;
                                                                    }
                                                                }
                                                            }
                                                            i13 = length;
                                                            objArr4 = objArr6;
                                                        }
                                                        j4 >>= 8;
                                                        i25++;
                                                        length2 = i15;
                                                        i21 = i14;
                                                        arrayList4 = arrayList3;
                                                        objArr5 = objArr3;
                                                        jArr6 = jArr4;
                                                        objArr6 = objArr4;
                                                        length = i13;
                                                        semanticsNode3 = semanticsNode2;
                                                        i22 = i12;
                                                        i17 = i17;
                                                    }
                                                    semanticsNode2 = semanticsNode3;
                                                    i15 = length2;
                                                    i13 = length;
                                                    objArr4 = objArr6;
                                                    i17 = i17;
                                                    i12 = i22;
                                                    arrayList3 = arrayList4;
                                                    i14 = i21;
                                                    j4 >>= 8;
                                                    i25++;
                                                    length2 = i15;
                                                    i21 = i14;
                                                    arrayList4 = arrayList3;
                                                    objArr5 = objArr3;
                                                    jArr6 = jArr4;
                                                    objArr6 = objArr4;
                                                    length = i13;
                                                    semanticsNode3 = semanticsNode2;
                                                    i22 = i12;
                                                    i17 = i17;
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                objArr3 = objArr5;
                                                semanticsNode2 = semanticsNode3;
                                                i15 = length2;
                                                i13 = length;
                                                objArr4 = objArr6;
                                                i17 = i17;
                                                i12 = i22;
                                                arrayList3 = arrayList4;
                                                i14 = i21;
                                                j4 >>= 8;
                                                i25++;
                                                length2 = i15;
                                                i21 = i14;
                                                arrayList4 = arrayList3;
                                                objArr5 = objArr3;
                                                jArr6 = jArr4;
                                                objArr6 = objArr4;
                                                length = i13;
                                                semanticsNode3 = semanticsNode2;
                                                i22 = i12;
                                                i17 = i17;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr5;
                                            semanticsNode = semanticsNode3;
                                            i11 = length2;
                                            i6 = length;
                                            objArr2 = objArr6;
                                            i7 = i17;
                                            i5 = i22;
                                            i8 = 2;
                                            arrayList2 = arrayList4;
                                            i10 = i21;
                                            if (i24 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr5;
                                            semanticsNode = semanticsNode3;
                                            i11 = length2;
                                            i6 = length;
                                            objArr2 = objArr6;
                                            i7 = i17;
                                            i5 = i22;
                                            i8 = 2;
                                            arrayList2 = arrayList4;
                                            i10 = i21;
                                        }
                                        if (i23 == i11) {
                                            break;
                                        }
                                        i23++;
                                        length2 = i11;
                                        i21 = i10;
                                        arrayList4 = arrayList2;
                                        iArr3 = iArr2;
                                        jArr5 = jArr2;
                                        objArr5 = objArr;
                                        jArr6 = jArr3;
                                        objArr6 = objArr2;
                                        length = i6;
                                        semanticsNode3 = semanticsNode;
                                        i22 = i5;
                                        i17 = i7;
                                    }
                                } else {
                                    semanticsNode = semanticsNode3;
                                    i4 = i20;
                                    i5 = i19;
                                    arrayList2 = arrayList4;
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    i6 = length;
                                    i7 = i17;
                                    i10 = i21;
                                    i8 = i16;
                                    zPropertiesDeleted = false;
                                }
                                if (!zPropertiesDeleted) {
                                    zPropertiesDeleted = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy.getUnmergedConfig());
                                }
                                if (zPropertiesDeleted) {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i10), 2048, 0, null, 8, null);
                                }
                            } else {
                                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                                throw new KotlinNothingValueException();
                            }
                        }
                        i9 = 8;
                    } else {
                        i4 = i20;
                        i5 = i19;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        i6 = length;
                        i7 = i17;
                        i8 = i16;
                        i9 = i18;
                    }
                    j2 >>= i9;
                    i20 = i4 + 1;
                    intObjectMap = p0;
                    i18 = i9;
                    i16 = i8;
                    arrayList4 = arrayList2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i6;
                    i19 = i5;
                    i17 = i7;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr5;
                int i33 = length;
                int i34 = i17;
                i = i16;
                if (i19 != i18) {
                    return;
                }
                i3 = i33;
                i2 = i34;
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr5;
                int i35 = length;
                i = i16;
                i2 = i17;
                i3 = i35;
            }
            if (i2 == i3) {
                return;
            }
            i17 = i2 + 1;
            intObjectMap = p0;
            i16 = i;
            arrayList4 = arrayList;
            iArr3 = iArr;
            jArr5 = jArr;
            length = i3;
        }
    }

    private final boolean registerScrollingId(int p0, List<ScrollObservationScope> p1) {
        boolean z;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(p1, p0);
        if (scrollObservationScopeFindById != null) {
            z = false;
        } else {
            scrollObservationScopeFindById = new ScrollObservationScope(p0, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope p0) {
        if (p0.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(p0, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded.1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode;
                    ScrollAxisRange horizontalScrollAxisRange = p0.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = p0.getVerticalScrollAxisRange();
                    Float oldXValue = p0.getOldXValue();
                    Float oldYValue = p0.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(p0.getSemanticsNodeId());
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(this.accessibilityFocusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (accessibilityNodeInfoCompat != null) {
                                    accessibilityNodeInfoCompat.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (accessibilityNodeInfoCompat2 != null) {
                                    accessibilityNodeInfoCompat2.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2));
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused2) {
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().get(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        p0.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        p0.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int p0, int p1, String p2) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(p0), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(p1);
        if (p2 != null) {
            accessibilityEventCreateEvent.getText().add(p2);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[LOOP:1: B:15:0x0059->B:28:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[EDGE_INSN: B:44:0x009c->B:29:0x009c BREAK  A[LOOP:1: B:15:0x0059->B:28:0x0099], SYNTHETIC] */
    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode p0, SemanticsNodeCopy p1) {
        MutableIntSet mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
        List<SemanticsNode> replacedChildren$ui_release = p0.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode.getId())) {
                if (!p1.getChildren().contains(semanticsNode.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(p0.getLayoutNode());
                    return;
                }
                mutableIntSetMutableIntSetOf.add(semanticsNode.getId());
            }
        }
        MutableIntSet children = p1.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
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
                        if ((255 & j) < 128 && !mutableIntSetMutableIntSetOf.contains(iArr[(i2 << 3) + i4])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(p0.getLayoutNode());
                            return;
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
        List<SemanticsNode> replacedChildren$ui_release2 = p0.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i5);
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(semanticsNode2.getId());
            if (semanticsNodeCopy != null && getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int p0) {
        if (p0 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return p0;
    }

    private final boolean traverseAtGranularity(SemanticsNode p0, int p1, boolean p2, boolean p3) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int accessibilitySelectionStart;
        int i;
        int id2 = p0.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id2 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(p0.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(p0);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0 || (iteratorForGranularity = getIteratorForGranularity(p0, p1)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(p0);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = p2 ? 0 : iterableTextForAccessibility.length();
        }
        int[] iArrFollowing = p2 ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (iArrFollowing == null) {
            return false;
        }
        int i2 = iArrFollowing[0];
        int i3 = iArrFollowing[1];
        if (p3 && isAccessibilitySelectionExtendable(p0)) {
            accessibilitySelectionStart = getAccessibilitySelectionStart(p0);
            if (accessibilitySelectionStart == -1) {
                accessibilitySelectionStart = p2 ? i2 : i3;
            }
            i = p2 ? i3 : i2;
        } else {
            accessibilitySelectionStart = p2 ? i3 : i2;
            i = accessibilitySelectionStart;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(p0, p2 ? 256 : 512, p1, i2, i3, SystemClock.uptimeMillis());
        setAccessibilitySelection(p0, accessibilitySelectionStart, i, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int p0) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (p0 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode p0, int p1, int p2, boolean p3) {
        String iterableTextForAccessibility;
        if (p0.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p0)) {
            Function3 function3 = (Function3) ((AccessibilityAction) p0.getUnmergedConfig().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3))).booleanValue();
            }
            return false;
        }
        if ((p1 == p2 && p2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(p0)) == null) {
            return false;
        }
        if (p1 < 0 || p1 != p2 || p2 > iterableTextForAccessibility.length()) {
            p1 = -1;
        }
        this.accessibilityCursorPosition = p1;
        String str = iterableTextForAccessibility;
        boolean z = str.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(p0.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
        sendPendingTextTraversedAtGranularityEvent(p0.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode p0) {
        if (!p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m6397getStartimpl(((TextRange) p0.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode p0) {
        if (!p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m6392getEndimpl(((TextRange) p0.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode p0) {
        return !p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode p0, int p1) {
        AccessibilityIterators.AbstractTextSegmentIterator companion;
        TextLayoutResult textLayoutResult;
        if (p0 == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(p0);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (p1 == 1) {
            companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((AccessibilityIterators.CharacterTextSegmentIterator) companion).initialize(iterableTextForAccessibility);
        } else if (p1 == 2) {
            companion = AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((AccessibilityIterators.WordTextSegmentIterator) companion).initialize(iterableTextForAccessibility);
        } else if (p1 == 4) {
            if (p0.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(p0.getUnmergedConfig())) == null) {
                return null;
            }
            if (p1 == 4) {
                companion = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                AccessibilityIterators.AbstractTextSegmentIterator companion2 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.PageTextSegmentIterator) companion2).initialize(iterableTextForAccessibility, textLayoutResult, p0);
                companion = companion2;
            }
        } else if (p1 == 8) {
            companion = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
            companion.initialize(iterableTextForAccessibility);
        } else {
            if (p1 != 16) {
                return null;
            }
            if (p0.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                return null;
            }
            if (p1 == 4) {
                companion = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                AccessibilityIterators.AbstractTextSegmentIterator companion3 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.PageTextSegmentIterator) companion3).initialize(iterableTextForAccessibility, textLayoutResult, p0);
                companion = companion3;
            }
        }
        return companion;
    }

    private final String getIterableTextForAccessibility(SemanticsNode p0) {
        AnnotatedString annotatedString;
        if (p0 == null) {
            return null;
        }
        if (p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) p0.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (p0.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(p0.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(p0.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "p0", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "createAccessibilityNodeInfo", "(I)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p1", "Landroid/os/Bundle;", "p2", "", "performAction", "(IILandroid/os/Bundle;)Z", "", "p3", "", "addExtraDataToAccessibilityNodeInfo", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Ljava/lang/String;Landroid/os/Bundle;)V", "findFocus"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int p0) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(p0);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (p0 == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
                }
                if (p0 == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
                }
            }
            return accessibilityNodeInfoCompatCreateNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final boolean performAction(int p0, int p1, Bundle p2) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(p0, p1, p2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final void addExtraDataToAccessibilityNodeInfo(int p0, AccessibilityNodeInfoCompat p1, String p2, Bundle p3) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(p0, p1, p2, p3);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat findFocus(int p0) {
            if (p0 != 1) {
                if (p0 == 2) {
                    return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
                }
                throw new IllegalArgumentException("Unknown focus type: ".concat(String.valueOf(p0)));
            }
            if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "<init>", "()V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p0", "Landroidx/compose/ui/semantics/SemanticsNode;", "p1", "", "addSetProgressAction", "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat p0, SemanticsNode p1) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p1) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            p0.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "<init>", "()V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p0", "Landroidx/compose/ui/semantics/SemanticsNode;", "p1", "", "addPageActions", "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat p0, SemanticsNode p1) {
            Role role = (Role) SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(p1)) {
                int iM6145getCarouselo7Vup1c = Role.INSTANCE.m6145getCarouselo7Vup1c();
                if (role != null && Role.m6140equalsimpl0(role.getValue(), iM6145getCarouselo7Vup1c)) {
                    return;
                }
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    p0.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    p0.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    p0.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(p1.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    p0.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$50(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
