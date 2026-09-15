package androidx.compose.runtime;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000 é\u00012\u00020\u0001:\u0002é\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\tJ\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u001b¢\u0006\u0004\b*\u0010\u001fJ\u0015\u0010,\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020+¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u001b¢\u0006\u0004\b0\u0010\u001fJ#\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b4\u0010(J\u001f\u00104\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b4\u0010$J\u0017\u00105\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b5\u0010(J\u0017\u00106\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u0010(J$\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J)\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u0010;J\u0017\u0010<\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b<\u0010\u000eJ\u000f\u0010=\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b?\u0010@J\u001f\u0010?\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b?\u0010AJ<\u0010C\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u001a\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001b0BH\u0086\b¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\bE\u0010\u000bJ\u0017\u0010F\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\bG\u0010\u000bJ\u0015\u0010H\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bH\u0010\u000bJ\u0015\u0010I\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bI\u0010&J\u0015\u0010J\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u001b¢\u0006\u0004\bL\u0010\u001fJ\r\u0010M\u001a\u00020\u001b¢\u0006\u0004\bM\u0010\u001fJ\r\u0010N\u001a\u00020\u001b¢\u0006\u0004\bN\u0010\u001fJ\r\u0010O\u001a\u00020\u001b¢\u0006\u0004\bO\u0010\u001fJ\u0015\u0010O\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bO\u0010&J\u001f\u0010O\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bQ\u0010PJ)\u0010Q\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bQ\u0010RJ)\u0010S\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bS\u0010RJ\u001f\u0010S\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bS\u0010PJ3\u0010O\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\u00072\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bO\u0010UJ\r\u0010V\u001a\u00020\u0006¢\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bX\u0010&J\u0015\u0010X\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\bX\u0010KJ\r\u0010Y\u001a\u00020\u0006¢\u0006\u0004\bY\u0010WJ\r\u0010Z\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\\H\u0007¢\u0006\u0004\b]\u0010^J>\u0010`\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062$\u0010\u0013\u001a \u0012\t\u0012\u00070\u0006¢\u0006\u0002\b_\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b_\u0012\u0004\u0012\u00020\u001b0BH\u0086\b¢\u0006\u0004\b`\u0010aJJ\u0010c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0017\u0010\u0013\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b_\u0012\u0004\u0012\u00020\u001b0b2\u0017\u0010:\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b_\u0012\u0004\u0012\u00020\u001b0bH\u0086\b¢\u0006\u0004\bc\u0010dJ;\u0010e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062$\u0010\u0013\u001a \u0012\t\u0012\u00070\u0006¢\u0006\u0002\b_\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b_\u0012\u0004\u0012\u00020\u001b0B¢\u0006\u0004\be\u0010aJ\u0015\u0010f\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bf\u0010&J-\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00170g2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0000H\u0007¢\u0006\u0004\bh\u0010iJ/\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00170g2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010:\u001a\u00020\u0007H\u0007¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\u001b¢\u0006\u0004\bl\u0010\u001fJ-\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00170g2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0006H\u0007¢\u0006\u0004\bm\u0010nJ\u0019\u0010o\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bq\u0010&J\u0017\u0010r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\br\u0010\tJ\u0017\u0010s\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\bs\u0010\tJ\u000f\u0010t\u001a\u00020\u001bH\u0002¢\u0006\u0004\bt\u0010\u001fJ\u0017\u0010u\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\bu\u0010&J\u001f\u0010y\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020vH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\bz\u0010\tJ\u0015\u0010{\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b{\u0010\u001aJ\u000f\u0010|\u001a\u00020+H\u0017¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020\u001bH\u0002¢\u0006\u0004\b~\u0010\u001fJ\u000f\u0010\u007f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u007f\u0010WJ*\u0010\u0080\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0082\u0001\u0010&J\"\u0010\u0083\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u001fJ\u0019\u0010\u0086\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0086\u0001\u0010&J\"\u0010\u0087\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0084\u0001J!\u0010\u0088\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0015J\u001c\u0010\u0089\u0001\u001a\u0004\u0018\u0001012\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0005\b\u008b\u0001\u0010pJ*\u0010\u008c\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u0081\u0001J#\u0010\u008d\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0005\b\u008d\u0001\u0010PJ\"\u0010\u008e\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u0084\u0001JL\u0010\u0091\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062(\u0010:\u001a$\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000201\u0018\u00010\u008f\u0001j\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000201\u0018\u0001`\u0090\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J*\u0010\u0093\u0001\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0081\u0001J\u0011\u0010\u0094\u0001\u001a\u00020+H\u0007¢\u0006\u0005\b\u0094\u0001\u0010}J$\u0010\u0097\u0001\u001a\u00020\u001b*\b0\u0095\u0001j\u0003`\u0096\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0005\b\u0099\u0001\u0010\u001fJ\u0011\u0010\u009a\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0005\b\u009a\u0001\u0010\u001fJ\u0019\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u000bJ\u0019\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009c\u0001\u0010\u000bJ\u001d\u0010\u0019\u001a\u00020\u0006*\u00030\u009d\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0019\u0010\u009e\u0001J\u0019\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u000bJ\u001f\u0010\u009f\u0001\u001a\u00020\u0006*\u00030\u009d\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009f\u0001\u0010\u009e\u0001J\u001f\u0010 \u0001\u001a\u00020\u0006*\u00030\u009d\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0006\b \u0001\u0010\u009e\u0001J'\u0010¡\u0001\u001a\u00020\u001b*\u00030\u009d\u00012\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001f\u0010£\u0001\u001a\u00020\u0006*\u00030\u009d\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0006\b£\u0001\u0010\u009e\u0001J\u001f\u0010¤\u0001\u001a\u00020\u0006*\u00030\u009d\u00012\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¤\u0001\u0010\u009e\u0001J\u001d\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060g*\u00030\u009d\u0001H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0018\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060gH\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J2\u0010©\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J*\u0010«\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J!\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u00ad\u0001\u00109J\u0019\u0010®\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0005\b®\u0001\u0010\u000bR\u001f\u0010¯\u0001\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010³\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\"\u0010¶\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010µ\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R+\u0010º\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00170¸\u0001j\t\u0012\u0004\u0012\u00020\u0017`¹\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R;\u0010¼\u0001\u001a$\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000201\u0018\u00010\u008f\u0001j\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000201\u0018\u0001`\u0090\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R#\u0010À\u0001\u001a\f\u0012\u0005\u0012\u00030¿\u0001\u0018\u00010¾\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R\u0019\u0010Å\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Ã\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ã\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Ã\u0001R\u0019\u0010È\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ã\u0001R\u0019\u0010É\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ã\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ã\u0001R\u0017\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\n\u0010Ã\u0001R\u0018\u0010Ì\u0001\u001a\u00030Ë\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ë\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Í\u0001R+\u0010Ñ\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ð\u0001\u0018\u00010¾\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Á\u0001R(\u0010Ò\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0006\bÒ\u0001\u0010Ã\u0001\u001a\u0005\bÓ\u0001\u0010WR(\u0010Ô\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0006\bÔ\u0001\u0010Ã\u0001\u001a\u0005\bÕ\u0001\u0010WR\u0013\u0010Ö\u0001\u001a\u00020\u00078G¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010[R\u0013\u0010Ø\u0001\u001a\u00020\u00068G¢\u0006\u0007\u001a\u0005\b×\u0001\u0010WR\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010[R\u0013\u0010Ú\u0001\u001a\u00020\u00078G¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010[R\u0013\u0010Ü\u0001\u001a\u00020\u00078G¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010[R&\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b\u0019\u0010Ã\u0001\u001a\u0005\bÝ\u0001\u0010WR(\u0010Þ\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0005\bà\u0001\u0010[R\u0016\u0010â\u0001\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010WR\u001b\u0010ã\u0001\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0016\u0010æ\u0001\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bå\u0001\u0010WR\u0016\u0010è\u0001\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bç\u0001\u0010W"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "p0", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "", "isNode", "(I)Z", "nodeCount", "(I)I", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "p1", "indexInGroup", "(II)Z", "node", "Landroidx/compose/runtime/Anchor;", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "parent", "(Landroidx/compose/runtime/Anchor;)I", "", "close", "(Z)V", "reset", "()V", "update", "(Ljava/lang/Object;)Ljava/lang/Object;", "rawUpdate", "appendSlot", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "trimTailSlots", "(I)V", "updateAux", "(Ljava/lang/Object;)V", "insertAux", "updateToTableMaps", "", "recordGroupSourceInformation", "(Ljava/lang/String;)V", "recordGrouplessCallSourceInformationStart", "(ILjava/lang/String;)V", "recordGrouplessCallSourceInformationEnd", "Landroidx/compose/runtime/GroupSourceInformation;", "groupSourceInformationFor", "(ILjava/lang/String;)Landroidx/compose/runtime/GroupSourceInformation;", "updateNode", "updateParentNode", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "slotIndexOfGroupSlotIndex", "(II)I", "p2", "(IILjava/lang/Object;)Ljava/lang/Object;", "clear", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "(II)Ljava/lang/Object;", "Lkotlin/Function2;", "forEachTailSlot", "(IILkotlin/jvm/functions/Function2;)V", "slotsStartIndex$runtime", "slotsEndIndex$runtime", "slotsEndAllIndex$runtime", "groupSlotIndex", "advanceBy", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "(ILjava/lang/Object;)V", "startNode", "(ILjava/lang/Object;Ljava/lang/Object;)V", "startData", "p3", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "endGroup", "()I", "ensureStarted", "skipGroup", "removeGroup", "()Z", "", "groupSlots", "()Ljava/util/Iterator;", "Lkotlin/ParameterName;", "forAllData", "(ILkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "traverseGroupAndChildren", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "forAllDataInRememberOrder", "moveGroup", "", "moveTo", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "bashCurrentGroup", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "containsGroupMark", "containsAnyGroupMarks", "recalculateMarks", "updateContainsMark", "Landroidx/compose/runtime/PrioritySet;", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "updateContainsMarkNow", "childContainsAnyMarks", "anchorIndex", "toString", "()Ljava/lang/String;", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "fixParentAnchorsFor", "(III)V", "moveGroupGapTo", "moveSlotGapTo", "(II)V", "clearSlotGap", "insertGroups", "insertSlots", "removeGroups", "sourceInformationOf$runtime", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "tryAnchor$runtime", "removeSlots", "updateNodeOfGroup", "updateAnchors", "Ljava/util/HashMap;", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "removeAnchors", "(IILjava/util/HashMap;)Z", "moveAnchors", "toDebugString", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "groupAsString", "(Ljava/lang/StringBuilder;I)V", "verifyDataAnchors$runtime", "verifyParentAnchors$runtime", "groupIndexToAddress", "dataIndexToDataAddress", "", "([II)I", "dataIndex", "slotIndex", "updateDataIndex", "([III)V", "nodeIndex", "auxIndex", "dataIndexes", "([I)Ljava/util/List;", UserMetadata.KEYDATA_FILENAME, "()Ljava/util/List;", "dataIndexToDataAnchor", "(IIII)I", "dataAnchorToDataIndex", "(III)I", "parentIndexToAnchor", "parentAnchorToIndex", "table", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "anchors", "Ljava/util/ArrayList;", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "groupGapStart", "I", "groupGapLen", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "Landroidx/collection/MutableObjectList;", "deferredSlotWrites", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "isGroupEnd", "getSlotsSize", "slotsSize", "getCollectingSourceInformation", "collectingSourceInformation", "getCollectingCalledInformation", "collectingCalledInformation", "getParent", "closed", "Z", "getClosed", "getCurrentGroupSlotIndex", "currentGroupSlotIndex", "pendingRecalculateMarks", "Landroidx/collection/MutableIntList;", "getSize$runtime", "size", "getCapacity", "capacity", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private MutableIntList pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    private final int dataAnchorToDataIndex(int p0, int p1, int p2) {
        return p0 < 0 ? (p2 - p1) + p0 + 1 : p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int p0, int p1, int p2, int p3) {
        return p0 > p1 ? -(((p3 - p2) - p0) + 1) : p0;
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime();
        this.calledByMap = slotTable.getCalledByMap$runtime();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    /* JADX INFO: renamed from: getTable$runtime, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i) * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean isNode(int p0) {
        return (this.groups[(groupIndexToAddress(p0) * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final int nodeCount(int p0) {
        return this.groups[(groupIndexToAddress(p0) * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int groupKey(int p0) {
        return this.groups[groupIndexToAddress(p0) * 5];
    }

    public final Object groupObjectKey(int p0) {
        int iGroupIndexToAddress = groupIndexToAddress(p0);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int p0) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(p0));
    }

    public final Object groupAux(int p0) {
        int iGroupIndexToAddress = groupIndexToAddress(p0);
        int[] iArr = this.groups;
        return (iArr[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final boolean indexInParent(int p0) {
        int i = this.parent;
        if (p0 <= i || p0 >= this.currentGroupEnd) {
            return i == 0 && p0 == 0;
        }
        return true;
    }

    public final boolean indexInCurrentGroup(int p0) {
        return indexInGroup(p0, this.currentGroup);
    }

    public final boolean indexInGroup(int p0, int p1) {
        int iIndexOf;
        int capacity;
        if (p1 == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (p1 > this.startStack.peekOr(0) || (iIndexOf = this.startStack.indexOf(p1)) < 0) {
            int iGroupSize = groupSize(p1);
            capacity = iGroupSize + p1;
        } else {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        }
        return p0 > p1 && p0 < capacity;
    }

    public final Object node(int p0) {
        int iGroupIndexToAddress = groupIndexToAddress(p0);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))];
        }
        return null;
    }

    public final Object node(Anchor p0) {
        return node(p0.toIndexFor(this));
    }

    public final int getParent() {
        return this.parent;
    }

    public final int parent(int p0) {
        return parent(this.groups, p0);
    }

    public final int parent(Anchor p0) {
        if (p0.getValid()) {
            return parent(this.groups, anchorIndex(p0));
        }
        return -1;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void close(boolean p0) {
        this.closed = true;
        if (p0 && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final void reset() {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final Object update(Object p0) {
        if (this.insertCount > 0 && this.currentSlot != this.slotsGapStart) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            if (mutableIntObjectMap == null) {
                mutableIntObjectMap = new MutableIntObjectMap<>(i2, i, defaultConstructorMarker);
            }
            this.deferredSlotWrites = mutableIntObjectMap;
            int i3 = this.parent;
            MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i3);
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(i2, i, defaultConstructorMarker);
                mutableIntObjectMap.set(i3, mutableObjectList);
            }
            mutableObjectList.add(p0);
            return Composer.INSTANCE.getEmpty();
        }
        return rawUpdate(p0);
    }

    private final Object rawUpdate(Object p0) {
        Object objSkip = skip();
        set(p0);
        return objSkip;
    }

    public final void appendSlot(Anchor p0, Object p1) {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i2 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(p0);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i >= iDataIndex) {
            i++;
            i2++;
        }
        this.slots[iDataIndex] = p1;
        this.currentSlot = i;
        this.currentSlotEnd = i2;
    }

    public final void updateAux(Object p0) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) == 0) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = p0;
    }

    public final void insertAux(Object p0) {
        if (this.insertCount < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i2 = this.currentSlot;
        if (i2 > iAuxIndex) {
            int i3 = i2 - iAuxIndex;
            if (i3 >= 3) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i3 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = p0;
        this.currentSlot++;
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime();
        this.calledByMap = this.table.getCalledByMap$runtime();
    }

    public final void recordGroupSourceInformation(String p0) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, p0);
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int p0, String p1) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, p0, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationGroupSourceInformationFor != null) {
                groupSourceInformationGroupSourceInformationFor.startGrouplessCall(p0, p1, getCurrentGroupSlotIndex());
            }
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationGroupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationGroupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    private final GroupSourceInformation groupSourceInformationFor(int p0, String p1) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        HashMap<Anchor, GroupSourceInformation> map2 = map;
        Anchor anchor = anchor(p0);
        GroupSourceInformation groupSourceInformation = map2.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, p1, 0);
            if (p1 == null) {
                int iGroupSize = p0 + 1;
                int i = this.currentGroup;
                while (iGroupSize < i) {
                    groupSourceInformation.reportGroup(this, iGroupSize);
                    iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                }
            }
            map2.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void updateNode(Object p0) {
        updateNodeOfGroup(this.currentGroup, p0);
    }

    public final void updateNode(Anchor p0, Object p1) {
        updateNodeOfGroup(p0.toIndexFor(this), p1);
    }

    public final void updateParentNode(Object p0) {
        updateNodeOfGroup(this.parent, p0);
    }

    public final void set(Object p0) {
        if (this.currentSlot > this.currentSlotEnd) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = p0;
    }

    public final Object set(int p0, Object p1) {
        return set(getCurrentGroup(), p0, p1);
    }

    public final int slotIndexOfGroupSlotIndex(int p0, int p1) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(p0));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(p0 + 1));
        int i = iSlotIndex + p1;
        if (i < iSlotIndex || i >= iDataIndex) {
            StringBuilder sb = new StringBuilder("Write to an invalid slot index ");
            sb.append(p1);
            sb.append(" for group ");
            sb.append(p0);
            ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        return i;
    }

    public final Object set(int p0, int p1, Object p2) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(p0, p1));
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = p2;
        return obj;
    }

    public final Object clear(int p0) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(p0);
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = Composer.INSTANCE.getEmpty();
        return obj;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final Object slot(Anchor p0, int p1) {
        return slot(anchorIndex(p0), p1);
    }

    public final Object slot(int p0, int p1) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(p0));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(p0 + 1));
        int i = p1 + iSlotIndex;
        if (iSlotIndex > i || i >= iDataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i)];
    }

    public final void forEachTailSlot(int p0, int p1, Function2<? super Integer, Object, Unit> p2) {
        int iSlotsStartIndex$runtime = slotsStartIndex$runtime(p0);
        int iSlotsEndIndex$runtime = slotsEndIndex$runtime(p0);
        for (int iMax = Math.max(iSlotsStartIndex$runtime, iSlotsEndIndex$runtime - p1); iMax < iSlotsEndIndex$runtime; iMax++) {
            p2.invoke(Integer.valueOf(iMax), this.slots[dataIndexToDataAddress(iMax)]);
        }
    }

    public final int slotsStartIndex$runtime(int p0) {
        return slotIndex(this.groups, groupIndexToAddress(p0));
    }

    public final int slotsEndIndex$runtime(int p0) {
        return dataIndex(this.groups, groupIndexToAddress(p0 + 1));
    }

    public final int slotsEndAllIndex$runtime(int p0) {
        return dataIndex(this.groups, groupIndexToAddress(p0 + groupSize(p0)));
    }

    private final int getCurrentGroupSlotIndex() {
        return groupSlotIndex(this.parent);
    }

    public final int groupSlotIndex(int p0) {
        MutableObjectList<Object> mutableObjectList;
        int i = this.currentSlot;
        int iSlotsStartIndex$runtime = slotsStartIndex$runtime(p0);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return (i - iSlotsStartIndex$runtime) + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(p0)) == null) ? 0 : mutableObjectList.getSize());
    }

    public final void seek(Anchor p0) {
        advanceBy(p0.toIndexFor(this) - this.currentGroup);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void endInsert() {
        if (this.insertCount <= 0) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (this.nodeCountStack.tos != this.startStack.tos) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void startGroup() {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        startGroup(0, Composer.INSTANCE.getEmpty(), false, Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int p0) {
        startGroup(p0, Composer.INSTANCE.getEmpty(), false, Composer.INSTANCE.getEmpty());
    }

    public final void startGroup(int p0, Object p1) {
        startGroup(p0, p1, false, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int p0, Object p1) {
        startGroup(p0, p1, true, Composer.INSTANCE.getEmpty());
    }

    public final void startNode(int p0, Object p1, Object p2) {
        startGroup(p0, p1, true, p2);
    }

    public final void startData(int p0, Object p1, Object p2) {
        startGroup(p0, p1, false, p2);
    }

    public final void startData(int p0, Object p1) {
        startGroup(p0, Composer.INSTANCE.getEmpty(), false, p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int p0, Object p1, boolean p2, Object p3) {
        int iGroupSize;
        GroupSourceInformation groupSourceInformationSourceInformationOf$runtime;
        int i = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i2 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i2);
            int i3 = p1 != Composer.INSTANCE.getEmpty() ? 1 : 0;
            int i4 = (p2 || p3 == Composer.INSTANCE.getEmpty()) ? 0 : 1;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i2) {
                iDataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, p0, p2, i3, i4, this.parent, iDataIndexToDataAnchor);
            int i5 = (p2 ? 1 : 0) + i3 + i4;
            if (i5 > 0) {
                insertSlots(i5, i2);
                Object[] objArr2 = this.slots;
                int i6 = this.currentSlot;
                if (p2) {
                    objArr2[i6] = p3;
                    i6++;
                }
                if (i3 != 0) {
                    objArr2[i6] = p1;
                    i6++;
                }
                if (i4 != 0) {
                    objArr2[i6] = p3;
                    i6++;
                }
                this.currentSlot = i6;
            }
            this.nodeCount = 0;
            iGroupSize = i2 + 1;
            this.parent = i2;
            this.currentGroup = iGroupSize;
            if (i >= 0 && (groupSourceInformationSourceInformationOf$runtime = sourceInformationOf$runtime(i)) != null) {
                groupSourceInformationSourceInformationOf$runtime.reportGroup(this, i2);
            }
        } else {
            this.startStack.push(i);
            saveCurrentGroupEnd();
            int i7 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i7);
            if (!Intrinsics.areEqual(p3, Composer.INSTANCE.getEmpty())) {
                if (p2) {
                    updateNode(p3);
                } else {
                    updateAux(p3);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits;
            this.parent = i7;
            this.currentGroup = i7 + 1;
            iGroupSize = i7 + SlotTableKt.groupSize(iArr, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        int i6 = (iGroupIndexToAddress * 5) + 1;
        boolean z2 = (this.groups[i6] & BasicMeasure.EXACTLY) != 0;
        if (!z) {
            if (i != i2) {
                ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
            }
            int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            int[] iArr = this.groups;
            int i7 = iArr[i6] & RectListKt.Lower26Bits;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, i5);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i4);
            int iPop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = iPop;
            int iParent = parent(this.groups, i3);
            int iPop2 = this.nodeCountStack.pop();
            this.nodeCount = iPop2;
            if (iParent == iPop) {
                this.nodeCount = iPop2 + (z2 ? 0 : i4 - i7);
                return i4;
            }
            int i8 = i5 - iGroupSize;
            int i9 = z2 ? 0 : i4 - i7;
            if (i8 != 0 || i9 != 0) {
                while (iParent != 0 && iParent != iPop && (i9 != 0 || i8 != 0)) {
                    int iGroupIndexToAddress2 = groupIndexToAddress(iParent);
                    if (i8 != 0) {
                        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i8);
                    }
                    if (i9 != 0) {
                        int[] iArr2 = this.groups;
                        SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress2, (iArr2[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits) + i9);
                    }
                    int[] iArr3 = this.groups;
                    if ((iArr3[(iGroupIndexToAddress2 * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
                        i9 = 0;
                    }
                    iParent = parent(iArr3, iParent);
                }
            }
            this.nodeCount += i9;
            return i4;
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i3)) != null) {
            MutableObjectList<Object> mutableObjectList2 = mutableObjectList;
            Object[] objArr = mutableObjectList2.content;
            int i10 = mutableObjectList2._size;
            for (int i11 = 0; i11 < i10; i11++) {
                rawUpdate(objArr[i11]);
            }
            mutableIntObjectMap.remove(i3);
        }
        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i5);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i4);
        this.nodeCount = this.nodeCountStack.pop() + (z2 ? 1 : i4);
        int iParent2 = parent(this.groups, i3);
        this.parent = iParent2;
        int size$runtime = iParent2 < 0 ? getSize$runtime() : groupIndexToAddress(iParent2 + 1);
        int iDataIndex = size$runtime >= 0 ? dataIndex(this.groups, size$runtime) : 0;
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        return i4;
    }

    public final void ensureStarted(int p0) {
        if (this.insertCount > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != p0) {
            if (p0 < i || p0 >= this.currentGroupEnd) {
                StringBuilder sb = new StringBuilder("Started group at ");
                sb.append(p0);
                sb.append(" must be a subgroup of the group at ");
                sb.append(i);
                ComposerKt.composeImmediateRuntimeError(sb.toString());
            }
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            this.currentGroup = p0;
            startGroup();
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.currentSlotEnd = i4;
        }
    }

    public final void ensureStarted(Anchor p0) {
        ensureStarted(p0.toIndexFor(this));
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i = this.groups[(iGroupIndexToAddress * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & RectListKt.Lower26Bits;
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime;
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        int iSkipGroup = skipGroup();
        GroupSourceInformation groupSourceInformationSourceInformationOf$runtime = sourceInformationOf$runtime(this.parent);
        if (groupSourceInformationSourceInformationOf$runtime != null && (anchorTryAnchor$runtime = tryAnchor$runtime(i)) != null) {
            groupSourceInformationSourceInformationOf$runtime.removeAnchor(anchorTryAnchor$runtime);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m3494isNotEmptyimpl(mutableIntList) && PrioritySet.m3495peekimpl(mutableIntList) >= i) {
                PrioritySet.m3496takeMaximpl(mutableIntList);
            }
        }
        boolean zRemoveGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new AnonymousClass1(iDataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/SlotWriter$groupSlots$1;", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        AnonymousClass1(int i, int i2, SlotWriter slotWriter) {
            this.$end = i2;
            this.this$0 = slotWriter;
            this.current = i;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final void setCurrent(int i) {
            this.current = i;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i = this.current;
            this.current = i + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i)];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void forAllData(int p0, Function2<? super Integer, Object, Unit> p1) {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(p0)); iDataIndex2 < iDataIndex; iDataIndex2++) {
            p1.invoke(Integer.valueOf(iDataIndex2), this.slots[dataIndexToDataAddress(iDataIndex2)]);
        }
    }

    public final void traverseGroupAndChildren(int p0, Function1<? super Integer, Unit> p1, Function1<? super Integer, Unit> p2) {
        int iParent = parent(p0);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(p0);
        int i = p0;
        while (i < iGroupSize + p0) {
            p1.invoke(Integer.valueOf(i));
            int i2 = i + 1;
            int iParent2 = i2 < size$runtime ? parent(i2) : -1;
            if (iParent2 != i) {
                while (true) {
                    p2.invoke(Integer.valueOf(i));
                    if (i == p0 || iParent == iParent2) {
                        break;
                    }
                    i = iParent;
                    iParent = parent(iParent);
                }
            }
            i = i2;
            iParent = iParent2;
        }
    }

    public final void moveGroup(int p0) {
        int i;
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (p0 < 0) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (p0 != 0) {
            int i2 = this.currentGroup;
            int i3 = this.parent;
            int i4 = this.currentGroupEnd;
            int iGroupSize = i2;
            for (int i5 = p0; i5 > 0; i5--) {
                iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
                if (iGroupSize > i4) {
                    ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
                }
            }
            int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
            int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
            int i6 = iGroupSize + iGroupSize2;
            int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i6));
            int i7 = iDataIndex3 - iDataIndex2;
            int i8 = 0;
            insertSlots(i7, Math.max(this.currentGroup - 1, 0));
            insertGroups(iGroupSize2);
            int[] iArr = this.groups;
            int iGroupIndexToAddress = groupIndexToAddress(i6) * 5;
            ArraysKt.copyInto(iArr, iArr, groupIndexToAddress(i2) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
            if (i7 > 0) {
                Object[] objArr = this.slots;
                int iDataIndexToDataAddress = dataIndexToDataAddress(iDataIndex2 + i7);
                System.arraycopy(objArr, iDataIndexToDataAddress, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex3 + i7) - iDataIndexToDataAddress);
            }
            int i9 = iDataIndex2 + i7;
            int i10 = i9 - iDataIndex;
            int i11 = this.slotsGapStart;
            int i12 = this.slotsGapLen;
            int length = this.slots.length;
            int i13 = this.slotsGapOwner;
            int i14 = i2;
            while (i14 < i2 + iGroupSize2) {
                int iGroupIndexToAddress2 = groupIndexToAddress(i14);
                int iDataIndex4 = dataIndex(iArr, iGroupIndexToAddress2);
                if (i13 < iGroupIndexToAddress2) {
                    i = i11;
                } else {
                    i8 = i11;
                    i = i8;
                }
                updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(iDataIndex4 - i10, i8, i12, length));
                i14++;
                i11 = i;
                i8 = 0;
            }
            moveAnchors(i6, i2, iGroupSize2);
            if (removeGroups(i6, iGroupSize2)) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            fixParentAnchorsFor(i3, this.currentGroupEnd, i2);
            if (i7 > 0) {
                removeSlots(i9, i7, i6 - 1);
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "", "Landroidx/compose/runtime/Anchor;", "moveGroup", "(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter p0, int p1, SlotWriter p2, boolean p3, boolean p4, boolean p5) {
            ArrayList arrayListEmptyList;
            boolean zRemoveGroup;
            int iGroupSize = p0.groupSize(p1);
            int i = p1 + iGroupSize;
            int iDataIndex = p0.dataIndex(p1);
            int iDataIndex2 = p0.dataIndex(i);
            int i2 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = p0.containsAnyGroupMarks(p1);
            p2.insertGroups(iGroupSize);
            p2.insertSlots(i2, p2.getCurrentGroup());
            if (p0.groupGapStart < i) {
                p0.moveGroupGapTo(i);
            }
            if (p0.slotsGapStart < iDataIndex2) {
                p0.moveSlotGapTo(iDataIndex2, i);
            }
            int[] iArr = p2.groups;
            int currentGroup = p2.getCurrentGroup();
            int i3 = currentGroup * 5;
            ArraysKt.copyInto(p0.groups, iArr, i3, p1 * 5, i * 5);
            Object[] objArr = p2.slots;
            int i4 = p2.currentSlot;
            System.arraycopy(p0.slots, iDataIndex, objArr, i4, i2);
            int parent = p2.getParent();
            iArr[i3 + 2] = parent;
            int i5 = currentGroup - p1;
            int i6 = currentGroup + iGroupSize;
            int iDataIndex3 = p2.dataIndex(iArr, currentGroup);
            int i7 = p2.slotsGapOwner;
            int i8 = p2.slotsGapLen;
            int length = objArr.length;
            int i9 = i7;
            int i10 = currentGroup;
            while (true) {
                if (i10 >= i6) {
                    break;
                }
                if (i10 != currentGroup) {
                    int i11 = (i10 * 5) + 2;
                    iArr[i11] = iArr[i11] + i5;
                }
                int i12 = currentGroup;
                int i13 = i4;
                iArr[(i10 * 5) + 4] = p2.dataIndexToDataAnchor(p2.dataIndex(iArr, i10) + (i4 - iDataIndex3), i9 >= i10 ? p2.slotsGapStart : 0, i8, length);
                if (i10 == i9) {
                    i9++;
                }
                i10++;
                currentGroup = i12;
                i4 = i13;
            }
            int i14 = i4;
            p2.slotsGapOwner = i9;
            int iLocationOf = SlotTableKt.locationOf(p0.anchors, p1, p0.getSize$runtime());
            int iLocationOf2 = SlotTableKt.locationOf(p0.anchors, i, p0.getSize$runtime());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = p0.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i15 = iLocationOf; i15 < iLocationOf2; i15++) {
                    Anchor anchor = (Anchor) arrayList.get(i15);
                    anchor.setLocation$runtime(anchor.getLocation() + i5);
                    arrayList2.add(anchor);
                }
                p2.anchors.addAll(SlotTableKt.locationOf(p2.anchors, p2.getCurrentGroup(), p2.getSize$runtime()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                arrayListEmptyList = arrayList2;
            } else {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            List<Anchor> list = arrayListEmptyList;
            if (!list.isEmpty()) {
                HashMap map = p0.sourceInformationMap;
                HashMap map2 = p2.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        Anchor anchor2 = arrayListEmptyList.get(i16);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = p2.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf$runtime = p2.sourceInformationOf$runtime(parent);
            if (groupSourceInformationSourceInformationOf$runtime != null) {
                int iGroupSize2 = parent2 + 1;
                int currentGroup2 = p2.getCurrentGroup();
                int i17 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i17 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(p2.groups, iGroupSize2) + iGroupSize2;
                }
                groupSourceInformationSourceInformationOf$runtime.addGroupAfter(p2, i17, currentGroup2);
            }
            int iParent = p0.parent(p1);
            if (p5) {
                if (!p3) {
                    boolean zRemoveGroups = p0.removeGroups(p1, iGroupSize);
                    p0.removeSlots(iDataIndex, i2, p1 - 1);
                    zRemoveGroup = zRemoveGroups;
                } else {
                    int i18 = iParent >= 0 ? 1 : 0;
                    if (i18 != 0) {
                        p0.startGroup();
                        p0.advanceBy(iParent - p0.getCurrentGroup());
                        p0.startGroup();
                    }
                    p0.advanceBy(p1 - p0.getCurrentGroup());
                    zRemoveGroup = p0.removeGroup();
                    if (i18 != 0) {
                        p0.skipToGroupEnd();
                        p0.endGroup();
                        p0.skipToGroupEnd();
                        p0.endGroup();
                    }
                }
                if (zRemoveGroup) {
                    ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
                }
            }
            int i19 = p2.nodeCount;
            int i20 = iArr[i3 + 1];
            p2.nodeCount = i19 + ((1073741824 & i20) == 0 ? i20 & RectListKt.Lower26Bits : 1);
            if (p4) {
                p2.currentGroup = i6;
                p2.currentSlot = i14 + i2;
            }
            if (zContainsAnyGroupMarks) {
                p2.updateContainsMark(parent);
            }
            return arrayListEmptyList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<Anchor> moveTo(Anchor p0, int p1, SlotWriter p2) {
        if (p2.insertCount <= 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!p0.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iAnchorIndex = anchorIndex(p0) + p1;
        int i = this.currentGroup;
        if (i > iAnchorIndex || iAnchorIndex >= this.currentGroupEnd) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, this, iAnchorIndex, p2, false, false, false, 32, null);
        updateContainsMark(iParent);
        boolean z = iNodeCount > 0;
        while (iParent >= i) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z) {
                int[] iArr2 = this.groups;
                int i2 = iArr2[(iGroupIndexToAddress * 5) + 1];
                if ((1073741824 & i2) != 0) {
                    z = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, (i2 & RectListKt.Lower26Bits) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z) {
            if (this.nodeCount < iNodeCount) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup$default;
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return slotWriter.moveFrom(slotTable, i, z);
    }

    public final List<Anchor> moveFrom(SlotTable p0, int p1, boolean p2) {
        if (this.insertCount <= 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (p1 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0 && SlotTableKt.groupSize(p0.getGroups(), p1) == p0.getGroupsSize()) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            ArrayList<Anchor> arrayList = this.anchors;
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            int[] groups = p0.getGroups();
            int groupsSize = p0.getGroupsSize();
            Object[] slots = p0.getSlots();
            int slotsSize = p0.getSlotsSize();
            HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime = p0.getSourceInformationMap$runtime();
            MutableIntObjectMap<MutableIntSet> calledByMap$runtime = p0.getCalledByMap$runtime();
            this.groups = groups;
            this.slots = slots;
            this.anchors = p0.getAnchors$runtime();
            this.groupGapStart = groupsSize;
            this.groupGapLen = (groups.length / 5) - groupsSize;
            this.slotsGapStart = slotsSize;
            this.slotsGapLen = slots.length - slotsSize;
            this.slotsGapOwner = groupsSize;
            this.sourceInformationMap = sourceInformationMap$runtime;
            this.calledByMap = calledByMap$runtime;
            p0.setTo$runtime(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
            return this.anchors;
        }
        SlotWriter slotWriterOpenWriter = p0.openWriter();
        try {
            List<Anchor> listMoveGroup = INSTANCE.moveGroup(slotWriterOpenWriter, p1, this, true, true, p2);
            boolean z = true;
            return listMoveGroup;
        } finally {
            slotWriterOpenWriter.close(false);
        }
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final List<Anchor> moveIntoGroupFrom(int p0, SlotTable p1, int p2) {
        if (this.insertCount > 0 || groupSize(this.currentGroup + p0) != 1) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        advanceBy(p0);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = p1.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, slotWriterOpenWriter, p2, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.currentSlot = i2;
            this.currentSlotEnd = i3;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    public final Anchor anchor(int p0) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, p0, getSize$runtime());
        if (iSearch < 0) {
            if (p0 > this.groupGapStart) {
                p0 = -(getSize$runtime() - p0);
            }
            Anchor anchor = new Anchor(p0);
            arrayList.add(-(iSearch + 1), anchor);
            return anchor;
        }
        return arrayList.get(iSearch);
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    public final void markGroup(int p0) {
        int iGroupIndexToAddress = groupIndexToAddress(p0);
        int[] iArr = this.groups;
        int i = (iGroupIndexToAddress * 5) + 1;
        if ((iArr[i] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, iGroupIndexToAddress, true);
        if ((this.groups[i] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            return;
        }
        updateContainsMark(parent(p0));
    }

    private final boolean containsGroupMark(int p0) {
        return p0 >= 0 && (this.groups[(groupIndexToAddress(p0) * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int p0) {
        return p0 >= 0 && (this.groups[(groupIndexToAddress(p0) * 5) + 1] & 201326592) != 0;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m3494isNotEmptyimpl(mutableIntList)) {
                m3514updateContainsMarkNowXpTMRCE(PrioritySet.m3496takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int p0) {
        if (p0 >= 0) {
            MutableIntList mutableIntListM3489constructorimpl$default = this.pendingRecalculateMarks;
            if (mutableIntListM3489constructorimpl$default == null) {
                mutableIntListM3489constructorimpl$default = PrioritySet.m3489constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListM3489constructorimpl$default;
            }
            PrioritySet.m3486addimpl(mutableIntListM3489constructorimpl$default, p0);
        }
    }

    /* JADX INFO: renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m3514updateContainsMarkNowXpTMRCE(int p0, MutableIntList p1) {
        int iGroupIndexToAddress = groupIndexToAddress(p0);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(p0);
        int[] iArr = this.groups;
        if (((iArr[(iGroupIndexToAddress * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(p0);
            if (iParent >= 0) {
                PrioritySet.m3486addimpl(p1, iParent);
            }
        }
    }

    private final boolean childContainsAnyMarks(int p0) {
        int iGroupSize = p0 + 1;
        int iGroupSize2 = groupSize(p0);
        while (iGroupSize < p0 + iGroupSize2) {
            if ((this.groups[(groupIndexToAddress(iGroupSize) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    public final int anchorIndex(Anchor p0) {
        int location$runtime = p0.getLocation();
        return location$runtime < 0 ? getSize$runtime() + location$runtime : location$runtime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotWriter(current = ");
        sb.append(this.currentGroup);
        sb.append(" end=");
        sb.append(this.currentGroupEnd);
        sb.append(" size = ");
        sb.append(getSize$runtime());
        sb.append(" gap=");
        sb.append(this.groupGapStart);
        sb.append('-');
        sb.append(this.groupGapStart + this.groupGapLen);
        sb.append(')');
        return sb.toString();
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void fixParentAnchorsFor(int p0, int p1, int p2) {
        int iParentIndexToAnchor = parentIndexToAnchor(p0, this.groupGapStart);
        while (p2 < p1) {
            this.groups[(groupIndexToAddress(p2) * 5) + 2] = iParentIndexToAnchor;
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(p2)) + p2;
            fixParentAnchorsFor(p2, iGroupSize, p2 + 1);
            p2 = iGroupSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int p0) {
        int i = this.groupGapLen;
        int i2 = this.groupGapStart;
        if (i2 != p0) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i2, p0);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i3 = p0 * 5;
                int i4 = i * 5;
                int i5 = i2 * 5;
                if (p0 < i2) {
                    ArraysKt.copyInto(iArr, iArr, i4 + i3, i3, i5);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i5, i5 + i4, i3 + i4);
                }
            }
            if (p0 < i2) {
                i2 = p0 + i;
            }
            int capacity = getCapacity();
            if (i2 >= capacity) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i2 < capacity) {
                int i6 = (i2 * 5) + 2;
                int i7 = this.groups[i6];
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i7), p0);
                if (iParentIndexToAnchor != i7) {
                    this.groups[i6] = iParentIndexToAnchor;
                }
                i2++;
                if (i2 == p0) {
                    i2 += i;
                }
            }
        }
        this.groupGapStart = p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int p0, int p1) {
        int i = this.slotsGapLen;
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapOwner;
        if (i2 != p0) {
            Object[] objArr = this.slots;
            if (p0 < i2) {
                System.arraycopy(objArr, p0, objArr, p0 + i, i2 - p0);
            } else {
                int i4 = i2 + i;
                System.arraycopy(objArr, i4, objArr, i2, (p0 + i) - i4);
            }
        }
        int iMin = Math.min(p1 + 1, getSize$runtime());
        if (i3 != iMin) {
            int length = this.slots.length - i;
            if (iMin < i3) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i3);
                int i5 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int i6 = (iGroupIndexToAddress * 5) + 4;
                    int i7 = this.groups[i6];
                    if (i7 < 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i6] = -((length - i7) + 1);
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i5) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i3);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int i8 = (iGroupIndexToAddress3 * 5) + 4;
                    int i9 = this.groups[i8];
                    if (i9 >= 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i8] = i9 + length + 1;
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = p0;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        ArraysKt.fill(this.slots, (Object) null, i, this.slotsGapLen + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int p0) {
        if (p0 > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < p0) {
                int iMax = Math.max(Math.max(length * 2, i4 + p0), 32);
                int[] iArr2 = new int[iMax * 5];
                int i5 = iMax - i4;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i2 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + p0;
            }
            int i7 = i2 + p0;
            this.groupGapStart = i7;
            this.groupGapLen = i3 - p0;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i4 > 0 ? dataIndex(i + p0) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i8 = i2; i8 < i7; i8++) {
                this.groups[(i8 * 5) + 4] = iDataIndexToDataAnchor;
            }
            int i9 = this.slotsGapOwner;
            if (i9 >= i2) {
                this.slotsGapOwner = i9 + p0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int p0, int p1) {
        if (p0 > 0) {
            moveSlotGapTo(this.currentSlot, p1);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < p0) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int iMax = Math.max(Math.max(length * 2, i3 + p0), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i4 = 0; i4 < iMax; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = iMax - i3;
                int i6 = i2 + i;
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i6, objArr2, i + i5, length - i6);
                this.slots = objArr2;
                i2 = i5;
            }
            int i7 = this.currentSlotEnd;
            if (i7 >= i) {
                this.currentSlotEnd = i7 + p0;
            }
            this.slotsGapStart = i + p0;
            this.slotsGapLen = i2 - p0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int p0, int p1) {
        boolean zRemoveAnchors = false;
        if (p1 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(p0);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(p0, p1, this.sourceInformationMap);
            this.groupGapStart = p0;
            this.groupGapLen += p1;
            int i = this.slotsGapOwner;
            if (i > p0) {
                this.slotsGapOwner = Math.max(p0, i - p1);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.groupGapStart) {
                this.currentGroupEnd = i2 - p1;
            }
            int i3 = this.parent;
            if (containsGroupMark(i3)) {
                updateContainsMark(i3);
            }
        }
        return zRemoveAnchors;
    }

    public final GroupSourceInformation sourceInformationOf$runtime(int p0) {
        Anchor anchorTryAnchor$runtime;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime = tryAnchor$runtime(p0)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime);
    }

    public final Anchor tryAnchor$runtime(int p0) {
        if (p0 < 0 || p0 >= getSize$runtime()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, p0, getSize$runtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int p0, int p1, int p2) {
        if (p1 > 0) {
            int i = this.slotsGapLen;
            int i2 = p0 + p1;
            moveSlotGapTo(i2, p2);
            this.slotsGapStart = p0;
            this.slotsGapLen = i + p1;
            ArraysKt.fill(this.slots, (Object) null, p0, i2);
            int i3 = this.currentSlotEnd;
            if (i3 >= p0) {
                this.currentSlotEnd = i3 - p1;
            }
        }
    }

    private final void updateNodeOfGroup(int p0, Object p1) {
        int iGroupIndexToAddress = groupIndexToAddress(p0);
        int[] iArr = this.groups;
        if (iGroupIndexToAddress >= iArr.length || (iArr[(iGroupIndexToAddress * 5) + 1] & BasicMeasure.EXACTLY) == 0) {
            StringBuilder sb = new StringBuilder("Updating the node of a group at ");
            sb.append(p0);
            sb.append(" that was not created with as a node group");
            ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = p1;
    }

    private final void updateAnchors(int p0, int p1) {
        Anchor anchor;
        int location$runtime;
        Anchor anchor2;
        int location$runtime2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (p0 < p1) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, p0, capacity); iLocationOf < this.anchors.size() && (location$runtime2 = (anchor2 = this.anchors.get(iLocationOf)).getLocation()) < 0 && (i = location$runtime2 + capacity) < p1; iLocationOf++) {
                anchor2.setLocation$runtime(i);
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, p1, capacity); iLocationOf2 < this.anchors.size() && (location$runtime = (anchor = this.anchors.get(iLocationOf2)).getLocation()) >= 0; iLocationOf2++) {
            anchor.setLocation$runtime(-(capacity - location$runtime));
        }
    }

    private final boolean removeAnchors(int p0, int p1, HashMap<Anchor, GroupSourceInformation> p2) {
        int i = p1 + p0;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i2 = iLocationOf + 1;
        int i3 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < p0) {
                break;
            }
            if (iAnchorIndex < i) {
                anchor.setLocation$runtime(Integer.MIN_VALUE);
                if (p2 != null) {
                    p2.remove(anchor);
                }
                if (i3 == 0) {
                    i3 = iLocationOf + 1;
                }
                i2 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    private final void moveAnchors(int p0, int p1, int p2) {
        Anchor anchor;
        int iAnchorIndex;
        int size$runtime = getSize$runtime();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, p0, size$runtime);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= p0 && iAnchorIndex < p2 + p0) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Anchor anchor2 = (Anchor) arrayList.get(i);
            int iAnchorIndex2 = anchorIndex(anchor2) + (p1 - p0);
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime(-(size$runtime - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime), anchor2);
        }
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        StringBuilder sb2 = new StringBuilder("  parent:    ");
        sb2.append(this.parent);
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        StringBuilder sb3 = new StringBuilder("  current:   ");
        sb3.append(this.currentGroup);
        sb.append(sb3.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        StringBuilder sb4 = new StringBuilder("  group gap: ");
        sb4.append(this.groupGapStart);
        sb4.append('-');
        sb4.append(this.groupGapStart + this.groupGapLen);
        sb4.append('(');
        sb4.append(this.groupGapLen);
        sb4.append(')');
        sb.append(sb4.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        StringBuilder sb5 = new StringBuilder("  slots gap: ");
        sb5.append(this.slotsGapStart);
        sb5.append('-');
        sb5.append(this.slotsGapStart + this.slotsGapLen);
        sb5.append('(');
        sb5.append(this.slotsGapLen);
        sb5.append(')');
        sb.append(sb5.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        StringBuilder sb6 = new StringBuilder("  gap owner: ");
        sb6.append(this.slotsGapOwner);
        sb.append(sb6.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        int size$runtime = getSize$runtime();
        for (int i = 0; i < size$runtime; i++) {
            groupAsString(sb, i);
            sb.append('\n');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int iGroupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (iGroupIndexToAddress != i) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        sb.append('^');
        int i2 = iGroupIndexToAddress * 5;
        int i3 = i2 + 2;
        sb.append(parentAnchorToIndex(this.groups[i3]));
        sb.append(": key=");
        sb.append(this.groups[i2]);
        sb.append(", nodes=");
        int i4 = i2 + 1;
        sb.append(this.groups[i4] & RectListKt.Lower26Bits);
        sb.append(", dataAnchor=");
        sb.append(this.groups[i2 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.groups[i3]);
        if ((this.groups[i4] & BasicMeasure.EXACTLY) != 0) {
            StringBuilder sb2 = new StringBuilder(", node=");
            sb2.append(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]), 10));
            sb.append(sb2.toString());
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i5 = iSlotIndex; i5 < iDataIndex; i5++) {
                if (i5 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i5)]), 10));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    public final void verifyDataAnchors$runtime() {
        int i = this.slotsGapOwner;
        int length = this.slots.length;
        int i2 = this.slotsGapLen;
        int size$runtime = getSize$runtime();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < size$runtime) {
            int iGroupIndexToAddress = groupIndexToAddress(i3);
            int[] iArr = this.groups;
            int i5 = iArr[(iGroupIndexToAddress * 5) + 4];
            int iDataIndex = dataIndex(iArr, iGroupIndexToAddress);
            if (iDataIndex < i4) {
                StringBuilder sb = new StringBuilder("Data index out of order at ");
                sb.append(i3);
                sb.append(", previous = ");
                sb.append(i4);
                sb.append(", current = ");
                sb.append(iDataIndex);
                PreconditionsKt.throwIllegalStateException(sb.toString());
            }
            if (iDataIndex > length - i2) {
                StringBuilder sb2 = new StringBuilder("Data index, ");
                sb2.append(iDataIndex);
                sb2.append(", out of bound at ");
                sb2.append(i3);
                PreconditionsKt.throwIllegalStateException(sb2.toString());
            }
            if (i5 < 0 && !z) {
                if (i != i3) {
                    StringBuilder sb3 = new StringBuilder("Expected the slot gap owner to be ");
                    sb3.append(i);
                    sb3.append(" found gap at ");
                    sb3.append(i3);
                    PreconditionsKt.throwIllegalStateException(sb3.toString());
                }
                z = true;
            }
            i3++;
            i4 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime() {
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        for (int i3 = 0; i3 < i; i3++) {
            if (this.groups[(i3 * 5) + 2] <= -2) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at ".concat(String.valueOf(i3)));
            }
        }
        for (int i4 = i2 + i; i4 < capacity; i4++) {
            int i5 = this.groups[(i4 * 5) + 2];
            if (parentAnchorToIndex(i5) < i) {
                if (i5 <= -2) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at ".concat(String.valueOf(i4)));
                }
            } else if (i5 > -2) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at ".concat(String.valueOf(i4)));
            }
        }
    }

    public final int getSize$runtime() {
        return getCapacity() - this.groupGapLen;
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int p0) {
        return p0 + (this.groupGapLen * (p0 < this.groupGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int p0) {
        return p0 + (this.slotsGapLen * (p0 < this.slotsGapStart ? 0 : 1));
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i) * 5) + 2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int p0) {
        return dataIndex(this.groups, groupIndexToAddress(p0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    private final int slotIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return dataIndex(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.slice(listDataAnchors$default, RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt.slice(listDataAnchors$default, RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listPlus.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = listKeys$default.get(i);
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final int parentIndexToAnchor(int p0, int p1) {
        return p0 < p1 ? p0 : -((getSize$runtime() - p0) + 2);
    }

    private final int parentAnchorToIndex(int p0) {
        return p0 > -2 ? p0 : getSize$runtime() + p0 + 2;
    }

    public final void trimTailSlots(int p0) {
        if (p0 <= 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1)) - p0;
        if (iDataIndex < iSlotIndex) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(iDataIndex, p0, i);
        int i2 = this.currentSlot;
        if (i2 >= iSlotIndex) {
            this.currentSlot = i2 - p0;
        }
    }

    public final void advanceBy(int p0) {
        if (p0 < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (this.insertCount > 0) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (p0 == 0) {
            return;
        }
        int i = this.currentGroup + p0;
        if (i < this.parent || i > this.currentGroupEnd) {
            StringBuilder sb = new StringBuilder("Cannot seek outside the current group (");
            sb.append(this.parent);
            sb.append('-');
            sb.append(this.currentGroupEnd);
            sb.append(')');
            ComposerKt.composeImmediateRuntimeError(sb.toString());
        }
        this.currentGroup = i;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    public final void forAllDataInRememberOrder(int p0, Function2<? super Integer, Object, Unit> p1) {
        int i;
        int i2;
        Anchor after;
        int iParent = parent(p0);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(p0);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = p0;
        MutableIntList mutableIntList = null;
        MutableIntSet mutableIntSetMutableIntSetOf = null;
        while (i3 < iGroupSize + p0) {
            int iDataIndex = dataIndex(i3);
            int i4 = i3 + 1;
            int iDataIndex2 = dataIndex(i4);
            while (true) {
                i = 0;
                if (iDataIndex >= iDataIndex2) {
                    break;
                }
                Object obj = this.slots[dataIndexToDataAddress(iDataIndex)];
                if ((obj instanceof RememberObserverHolder) && (after = ((RememberObserverHolder) obj).getAfter()) != null && after.getValid()) {
                    int iAnchorIndex = anchorIndex(after);
                    if (mutableIntSetMutableIntSetOf == null) {
                        mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
                    }
                    if (mutableIntList == null) {
                        mutableIntList = new MutableIntList(i, 1, defaultConstructorMarker);
                    }
                    mutableIntSetMutableIntSetOf.add(iAnchorIndex);
                    mutableIntList.add(iAnchorIndex);
                    mutableIntList.add(iDataIndex);
                } else {
                    p1.invoke(Integer.valueOf(iDataIndex), obj);
                }
                iDataIndex++;
            }
            int iParent2 = i4 < size$runtime ? parent(i4) : -1;
            if (iParent2 != i3) {
                while (true) {
                    if (mutableIntList == null || mutableIntSetMutableIntSetOf == null || !mutableIntSetMutableIntSetOf.remove(i3)) {
                        i2 = size$runtime;
                    } else {
                        int i5 = mutableIntList._size;
                        int i6 = i5 / 2;
                        int i7 = i;
                        int i8 = i7;
                        while (i8 < i6) {
                            int i9 = i8 * 2;
                            int i10 = size$runtime;
                            int i11 = mutableIntList.get(i9);
                            if (i11 == i3) {
                                int i12 = mutableIntList.get(i9 + 1);
                                p1.invoke(Integer.valueOf(i12), this.slots[dataIndexToDataAddress(i12)]);
                            } else if (i9 != i7) {
                                mutableIntList.set(i7, i11);
                                mutableIntList.set(i7 + 1, mutableIntList.get(i9 + 1));
                                i7 += 2;
                            } else {
                                i7 += 2;
                            }
                            i8++;
                            size$runtime = i10;
                        }
                        i2 = size$runtime;
                        if (i7 != i5) {
                            mutableIntList.removeRange(i7, i5);
                        }
                    }
                    if (i3 == p0 || iParent == iParent2) {
                        break;
                    }
                    i3 = iParent;
                    iParent = parent(iParent);
                    size$runtime = i2;
                    i = 0;
                }
            } else {
                i2 = size$runtime;
            }
            iParent = iParent2;
            i3 = i4;
            size$runtime = i2;
            defaultConstructorMarker = null;
        }
    }
}
