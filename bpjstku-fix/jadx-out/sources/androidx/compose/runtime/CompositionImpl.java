package androidx.compose.runtime;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.ObservableComposition;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.p006compose.ComposeNavigator;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00102\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u00020\u00102\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\"\u0010\u0016\u001a\u00020\u00152\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00152\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00102\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010\u001f\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u001e2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010!\u001a\u00020\u00102\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010#J\u000f\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010#J\"\u00100\u001a\u00020\u00102\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b0\u0010\u0013J\u000f\u00101\u001a\u00020\u0010H\u0000¢\u0006\u0004\b1\u0010#J\u000f\u00102\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u0010#J\u001d\u00105\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020403H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u001e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020403H\u0016¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b9\u0010:J)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002040=0<2\u0006\u0010\b\u001a\u00020;H\u0001¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\b\u001a\u0002042\u0006\u0010\n\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010BJ%\u0010A\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u000204032\u0006\u0010\n\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010CJ\u000f\u0010D\u001a\u00020\u0010H\u0002¢\u0006\u0004\bD\u0010#J\u0017\u0010E\u001a\u00020\u00102\u0006\u0010\b\u001a\u000204H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00102\u0006\u0010\b\u001a\u000204H\u0002¢\u0006\u0004\bG\u0010FJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010\b\u001a\u000204H\u0016¢\u0006\u0004\bH\u0010FJ\u000f\u0010I\u001a\u00020\u001eH\u0016¢\u0006\u0004\bI\u0010%J+\u0010K\u001a\u00020\u00102\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020J\u0012\u0006\u0012\u0004\u0018\u00010J0=0<H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010#J\u000f\u0010T\u001a\u00020\u0010H\u0016¢\u0006\u0004\bT\u0010#J\u000f\u0010U\u001a\u00020\u0010H\u0016¢\u0006\u0004\bU\u0010#J;\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010V2#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002040X¢\u0006\u0002\bY\u0012\u0004\u0012\u00028\u00000WH\u0082\b¢\u0006\u0004\bZ\u0010[J$\u0010\\\u001a\u00028\u0000\"\u0004\b\u0000\u0010V2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082\b¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0010H\u0016¢\u0006\u0004\b^\u0010#J\u000f\u0010_\u001a\u00020\u0010H\u0016¢\u0006\u0004\b_\u0010#J\u000f\u0010`\u001a\u00020\u0010H\u0016¢\u0006\u0004\b`\u0010#J5\u0010b\u001a\u00028\u0000\"\u0004\b\u0000\u0010a2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020*2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\bb\u0010cJ\u001b\u0010e\u001a\u0004\u0018\u00010d2\b\u0010\b\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\be\u0010fJ!\u0010h\u001a\u00020g2\u0006\u0010\b\u001a\u00020>2\b\u0010\n\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020>H\u0016¢\u0006\u0004\bj\u0010kJ%\u0010m\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010V2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000lH\u0016¢\u0006\u0004\bm\u0010nJ!\u0010o\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020>2\b\u0010\n\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bo\u0010pJ)\u0010q\u001a\u00020g2\u0006\u0010\b\u001a\u00020>2\u0006\u0010\n\u001a\u00020;2\b\u0010\f\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bq\u0010rJ\u001f\u0010s\u001a\u00020\u00102\u0006\u0010\b\u001a\u0002042\u0006\u0010\n\u001a\u00020>H\u0000¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00102\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030uH\u0000¢\u0006\u0004\bv\u0010wJ\u001b\u0010z\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002040XH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J$\u0010~\u001a\u00028\u0000\"\u0004\b\u0000\u0010V2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082\b¢\u0006\u0004\b~\u0010]J\u0012\u0010\u007f\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0081\u0001\u0010#J\u0012\u0010\u0082\u0001\u001a\u00020*H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001f\u0010\u0084\u0001\u001a\u00020\u00078GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R-\u0010\u008c\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001040\u008a\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u000104`\u008b\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u000704j\u0003`\u008e\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u0012\u0005\b\u0095\u0001\u0010#R&\u0010\u0096\u0001\u001a\u00020{8\u0001X\u0080\u0004¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u009a\u0001\u0010#\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R#\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020>0X8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001d\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u000204038AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001e\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R'\u0010¤\u0001\u001a\u0012\u0012\u0004\u0012\u000204\u0012\b\u0012\u0006\u0012\u0002\b\u00030u0X8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u009c\u0001R\u001d\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u000204038AX\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u009e\u0001R\u001d\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020>0<8AX\u0080\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010ª\u0001\u001a\u00020P8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0017\u0010¬\u0001\u001a\u00020P8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010«\u0001R#\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020>0X8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009c\u0001R%\u0010®\u0001\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002040X8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u009c\u0001R/\u0010¯\u0001\u001a\u00020\u001e8\u0001@\u0001X\u0080\u000e¢\u0006\u001e\n\u0006\b¯\u0001\u0010°\u0001\u0012\u0005\b´\u0001\u0010#\u001a\u0005\b±\u0001\u0010%\"\u0006\b²\u0001\u0010³\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001b\u0010º\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¼\u0001\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R \u0010¿\u0001\u001a\u00030¾\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ä\u0001\u001a\u00030Ã\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R \u0010Ç\u0001\u001a\u00030Æ\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Ë\u0001\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0014\u0010Ï\u0001\u001a\u00020\u000b8G¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001e\u0010Ð\u0001\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\bÐ\u0001\u0010°\u0001\u001a\u0005\bÐ\u0001\u0010%R\u0019\u0010Ñ\u0001\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010½\u0001R\u0016\u0010Ó\u0001\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010%R3\u0010Ô\u0001\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0005\bØ\u0001\u0010\u0013R\u0016\u0010Ù\u0001\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010%R\u0016\u0010Ú\u0001\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010%R\u0016\u0010Ü\u0001\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010%R\u0016\u0010Þ\u0001\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010%"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/tooling/ObservableComposition;", "Landroidx/compose/runtime/CompositionContext;", "p0", "Landroidx/compose/runtime/Applier;", "p1", "Lkotlin/coroutines/CoroutineContext;", "p2", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "setContentWithReuse", "Landroidx/compose/runtime/PausedComposition;", "setPausableContent", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RememberObserverHolder;", "pausedCompositionFinished$runtime", "(Landroidx/collection/ScatterSet;)V", "composeInitial", "", "composeInitialPaused", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "composeInitialWithReuse", "ensureRunning", "()V", "clearDeactivated", "()Z", "Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "", "invalidateGroupsWithKey", "(I)V", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "composeContent", "updateMovingInvalidations$runtime", "dispose", "", "", "recordModificationsOf", "(Ljava/util/Set;)V", "observesAnyOf", "(Ljava/util/Set;)Z", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/Anchor;", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "extractInvalidationsOf$runtime", "(Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "addPendingInvalidationsLocked", "(Ljava/lang/Object;Z)V", "(Ljava/util/Set;Z)V", "cleanUpDerivedStateObservations", "recordReadOf", "(Ljava/lang/Object;)V", "invalidateScopeOfLocked", "recordWriteOf", "recompose", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "Landroidx/compose/runtime/changelist/ChangeList;", "applyChangesInLocked", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "applyChanges", "applyLateChanges", "changesApplied", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/ScopeMap;", "Lkotlin/ParameterName;", "guardInvalidationsLocked", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "abandonChanges", "invalidateAll", "verifyConsistent", "R", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/ShouldPauseCallback;", "getAndSetShouldPauseCallback", "(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "tryImminentInvalidation", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "invalidateChecked", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "removeObservation$runtime", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime", "(Landroidx/compose/runtime/DerivedState;)V", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "takeInvalidations", "Landroidx/compose/runtime/SlotTable;", "validateRecomposeScopeAnchors", "(Landroidx/compose/runtime/SlotTable;)V", "trackAbandonedValues", "observer", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "deactivate", "composerStacksSizes$runtime", "()I", "parent", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/b;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "getAbandonSet$annotations", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime$annotations", "observations", "Landroidx/collection/MutableScatterMap;", "getObservedObjects$runtime", "()Ljava/util/Set;", "observedObjects", "Landroidx/collection/MutableScatterSet;", "invalidatedScopes", "Landroidx/collection/MutableScatterSet;", "conditionallyInvalidatedScopes", "derivedStates", "getDerivedStateDependencies$runtime", "derivedStateDependencies", "getConditionalScopes$runtime", "()Ljava/util/List;", "conditionalScopes", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/PausedCompositionImpl;", "pendingPausedComposition", "Landroidx/compose/runtime/PausedCompositionImpl;", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "getComposer$runtime", "()Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "isRoot", RemoteConfigConstants.ResponseFieldKey.STATE, "getAreChildrenComposing", "areChildrenComposing", ComposeNavigator.NAME, "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition, ObservableComposition {
    public static final int $stable = 8;
    private final CoroutineContext _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final MutableScatterMap<Object, Object> derivedStates;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final MutableScatterMap<Object, Object> observations;
    private final MutableScatterMap<Object, Object> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private PausedCompositionImpl pendingPausedComposition;
    private final RememberEventDispatcher rememberManager;
    private ShouldPauseCallback shouldPause;
    private final SlotTable slotTable;
    private int state;

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime$annotations() {
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        int i = 0;
        int i2 = 1;
        Set<RememberObserver> setAsMutableSet = new MutableScatterSet(i, i2, defaultConstructorMarker).asMutableSet();
        this.abandonSet = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m3637constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
        this.derivedStates = ScopeMap.m3637constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m3637constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m3637constructorimpl$default(null, 1, null);
        CompositionObserverHolder compositionObserverHolder = new CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.observerHolder = compositionObserverHolder;
        this.rememberManager = new RememberEventDispatcher();
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, compositionObserverHolder, this);
        compositionContext.registerComposer$runtime(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    public final CompositionContext getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final Set<Object> getObservedObjects$runtime() {
        return this.observations.asMap().keySet();
    }

    public final Set<Object> getDerivedStateDependencies$runtime() {
        return this.derivedStates.asMap().keySet();
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes.asSet());
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime(boolean z) {
        this.pendingInvalidScopes = z;
    }

    /* JADX INFO: renamed from: getObserverHolder$runtime, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    /* JADX INFO: renamed from: getComposer$runtime, reason: from getter */
    public final ComposerImpl getComposer() {
        return this.composer;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime() : coroutineContext;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean isDisposed() {
        return this.state == 3;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime;
        synchronized (this.lock) {
            hasPendingChanges$runtime = this.composer.getHasPendingChanges$runtime();
        }
        return hasPendingChanges$runtime;
    }

    @Override // androidx.compose.runtime.Composition
    public final void setContent(Function2<? super Composer, ? super Integer, Unit> p0) {
        boolean zClearDeactivated = clearDeactivated();
        ensureRunning();
        if (zClearDeactivated) {
            composeInitialWithReuse(p0);
        } else {
            composeInitial(p0);
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void setContentWithReuse(Function2<? super Composer, ? super Integer, Unit> p0) {
        clearDeactivated();
        ensureRunning();
        composeInitialWithReuse(p0);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public final PausedComposition setPausableContent(Function2<? super Composer, ? super Integer, Unit> p0) {
        return composeInitialPaused(clearDeactivated(), p0);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public final PausedComposition setPausableContentWithReuse(Function2<? super Composer, ? super Integer, Unit> p0) {
        clearDeactivated();
        ensureRunning();
        return composeInitialPaused(true, p0);
    }

    public final void pausedCompositionFinished$runtime(ScatterSet<RememberObserverHolder> p0) {
        this.pendingPausedComposition = null;
        if (p0 != null) {
            this.rememberManager.ignoreForgotten(p0);
            this.state = 2;
        }
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> p0) {
        this.composable = p0;
        this.parent.composeInitial$runtime(this, p0);
    }

    private final PausedComposition composeInitialPaused(boolean p0, Function2<? super Composer, ? super Integer, Unit> p1) {
        if (this.pendingPausedComposition != null) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, p1, p0, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    private final void composeInitialWithReuse(Function2<? super Composer, ? super Integer, Unit> p0) {
        this.composer.startReuseFromRoot();
        composeInitial(p0);
        this.composer.endReuseFromRoot();
    }

    private final void ensureRunning() {
        String str;
        int i = this.state;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i == 2) {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else if (i == 3) {
                str = "The composition is disposed";
            } else {
                str = "";
            }
            PreconditionsKt.throwIllegalStateException(str);
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private final boolean clearDeactivated() {
        boolean z;
        synchronized (this.lock) {
            z = this.state == 1;
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.tooling.ObservableComposition
    public final CompositionObserverHandle setObserver(final CompositionObserver p0) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(p0);
            this.observerHolder.setRoot(true);
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl.setObserver.2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public final void dispose() {
                Object obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver = p0;
                synchronized (obj) {
                    if (Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                        compositionImpl.getObserverHolder().setObserver(null);
                        compositionImpl.getObserverHolder().setRoot(false);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        };
    }

    public final void invalidateGroupsWithKey(int p0) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime = this.slotTable.invalidateGroupsWithKey$runtime(p0);
        }
        if (listInvalidateGroupsWithKey$runtime != null) {
            int size = listInvalidateGroupsWithKey$runtime.size();
            for (int i = 0; i < size; i++) {
                if (listInvalidateGroupsWithKey$runtime.get(i).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime()) {
            this.parent.invalidate$runtime(this);
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, true);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
            sb.append(this.pendingModifications);
            ComposerKt.composeRuntimeError(sb.toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
        sb.append(this.pendingModifications);
        ComposerKt.composeRuntimeError(sb.toString());
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object andSet = this.pendingModifications.getAndSet(SetsKt.emptySet());
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        StringBuilder sb = new StringBuilder("corrupt pendingModifications drain: ");
        sb.append(this.pendingModifications);
        ComposerKt.composeRuntimeError(sb.toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void composeContent(Function2<? super Composer, ? super Integer, Unit> p0) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                MutableScatterMap<Object, Object> mutableScatterMapM3469takeInvalidationsafanTW4 = m3469takeInvalidationsafanTW4();
                try {
                    this.composer.m3464composeContentZbOJvo$runtime(mutableScatterMapM3469takeInvalidationsafanTW4, p0, this.shouldPause);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    this.invalidations = mutableScatterMapM3469takeInvalidationsafanTW4;
                    throw th;
                }
            }
            Unit unit3 = Unit.INSTANCE;
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                    } finally {
                        rememberEventDispatcher.clear();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap<Object, Object> mutableScatterMapM3469takeInvalidationsafanTW4 = m3469takeInvalidationsafanTW4();
            try {
                this.composer.m3466updateComposerInvalidationsRY85e9Y(mutableScatterMapM3469takeInvalidationsafanTW4);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                this.invalidations = mutableScatterMapM3469takeInvalidationsafanTW4;
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        synchronized (this.lock) {
            if (this.composer.getIsComposing()) {
                PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.state != 3) {
                this.state = 3;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                ChangeList deferredChanges$runtime = this.composer.getDeferredChanges();
                if (deferredChanges$runtime != null) {
                    applyChangesInLocked(deferredChanges$runtime);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || !this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        if (z) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, this.rememberManager);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close(true);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                this.composer.dispose$runtime();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m3642getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public final void recordModificationsOf(Set<? extends Object> p0) {
        Object obj;
        Object objPlus;
        do {
            obj = this.pendingModifications.get();
            if (obj == null || Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                objPlus = p0;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, p0};
            } else {
                if (!(obj instanceof Object[])) {
                    StringBuilder sb = new StringBuilder("corrupt pendingModifications: ");
                    sb.append(this.pendingModifications);
                    throw new IllegalStateException(sb.toString().toString());
                }
                Intrinsics.checkNotNull(obj, "");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, p0);
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, obj, objPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void prepareCompose(Function0<Unit> p0) {
        this.composer.prepareCompose$runtime(p0);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014f A[PHI: r18 r22 r24 r25 r26 r27 r28 r30 r33
  0x014f: PHI (r18v6 char) = (r18v5 char), (r18v5 char), (r18v10 char) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r22v3 long) = (r22v2 long), (r22v2 long), (r22v7 long) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r24v6 long[]) = (r24v5 long[]), (r24v5 long[]), (r24v9 long[]) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r25v4 int) = (r25v3 int), (r25v3 int), (r25v8 int) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r26v4 int) = (r26v3 int), (r26v3 int), (r26v8 int) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r27v3 int) = (r27v2 int), (r27v2 int), (r27v7 int) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r28v3 long) = (r28v2 long), (r28v2 long), (r28v7 long) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r30v3 int) = (r30v2 int), (r30v2 int), (r30v7 int) binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]
  0x014f: PHI (r33v1 androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object>) = 
  (r33v0 androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object>)
  (r33v0 androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object>)
  (r33v4 androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object>)
 binds: [B:42:0x013b, B:44:0x0141, B:39:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    public final List<Pair<RecomposeScopeImpl, Object>> extractInvalidationsOf$runtime(Anchor p0) {
        MutableScatterMap<Object, Object> mutableScatterMap;
        long[] jArr;
        int i;
        MutableScatterMap<Object, Object> mutableScatterMap2;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        char c;
        long j2;
        int i6;
        MutableScatterMap<Object, Object> mutableScatterMap3;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        MutableScatterMap<Object, Object> mutableScatterMap4;
        int i7;
        long[] jArr4;
        if (ScopeMap.m3642getSizeimpl(this.invalidations) > 0) {
            ArrayList arrayList = new ArrayList();
            SlotTable slotTable = this.slotTable;
            MutableScatterMap<Object, Object> mutableScatterMap5 = this.invalidations;
            long[] jArr5 = mutableScatterMap5.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr5[i8];
                    char c2 = 7;
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                Object obj = mutableScatterMap5.keys[i12];
                                Object obj2 = mutableScatterMap5.values[i12];
                                Intrinsics.checkNotNull(obj, "");
                                if (obj2 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj2, "");
                                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                    Object[] objArr3 = mutableScatterSet.elements;
                                    long[] jArr6 = mutableScatterSet.metadata;
                                    jArr2 = jArr5;
                                    int length2 = jArr6.length - 2;
                                    if (length2 >= 0) {
                                        i2 = length;
                                        i3 = i11;
                                        i4 = i8;
                                        int i13 = 0;
                                        while (true) {
                                            long j5 = jArr6[i13];
                                            j = j3;
                                            c = 7;
                                            j2 = -9187201950435737472L;
                                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                int i15 = 0;
                                                while (i15 < i14) {
                                                    if ((j5 & 255) < 128) {
                                                        jArr4 = jArr6;
                                                        int i16 = (i13 << 3) + i15;
                                                        i7 = i10;
                                                        Object obj3 = objArr3[i16];
                                                        objArr2 = objArr3;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                                        mutableScatterMap4 = mutableScatterMap5;
                                                        Anchor anchor = recomposeScopeImpl.getAnchor();
                                                        if (anchor != null && slotTable.inGroup(p0, anchor)) {
                                                            arrayList.add(TuplesKt.to(recomposeScopeImpl, obj3));
                                                            mutableScatterSet.removeElementAt(i16);
                                                        }
                                                    } else {
                                                        objArr2 = objArr3;
                                                        mutableScatterMap4 = mutableScatterMap5;
                                                        i7 = i10;
                                                        jArr4 = jArr6;
                                                    }
                                                    j5 >>= 8;
                                                    i15++;
                                                    i10 = i7;
                                                    jArr6 = jArr4;
                                                    objArr3 = objArr2;
                                                    mutableScatterMap5 = mutableScatterMap4;
                                                }
                                                objArr = objArr3;
                                                mutableScatterMap3 = mutableScatterMap5;
                                                i5 = i10;
                                                jArr3 = jArr6;
                                                if (i14 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr = objArr3;
                                                mutableScatterMap3 = mutableScatterMap5;
                                                i5 = i10;
                                                jArr3 = jArr6;
                                            }
                                            if (i13 == length2) {
                                                break;
                                            }
                                            i13++;
                                            j3 = j;
                                            i10 = i5;
                                            jArr6 = jArr3;
                                            objArr3 = objArr;
                                            mutableScatterMap5 = mutableScatterMap3;
                                        }
                                    } else {
                                        mutableScatterMap3 = mutableScatterMap5;
                                        i2 = length;
                                        i3 = i11;
                                        i4 = i8;
                                        j = j3;
                                        i5 = i10;
                                        c = 7;
                                        j2 = -9187201950435737472L;
                                    }
                                    if (mutableScatterSet.isEmpty()) {
                                        mutableScatterMap2 = mutableScatterMap3;
                                        mutableScatterMap2.removeValueAt(i12);
                                    } else {
                                        mutableScatterMap2 = mutableScatterMap3;
                                    }
                                } else {
                                    mutableScatterMap3 = mutableScatterMap5;
                                    jArr2 = jArr5;
                                    i2 = length;
                                    i3 = i11;
                                    i4 = i8;
                                    j = j3;
                                    i5 = i10;
                                    c = 7;
                                    j2 = -9187201950435737472L;
                                    Intrinsics.checkNotNull(obj2, "");
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
                                    Anchor anchor2 = recomposeScopeImpl2.getAnchor();
                                    if (anchor2 == null || !slotTable.inGroup(p0, anchor2)) {
                                        mutableScatterMap2 = mutableScatterMap3;
                                    } else {
                                        arrayList.add(TuplesKt.to(recomposeScopeImpl2, obj2));
                                        mutableScatterMap2 = mutableScatterMap3;
                                        mutableScatterMap2.removeValueAt(i12);
                                    }
                                }
                                i6 = 8;
                            } else {
                                mutableScatterMap2 = mutableScatterMap5;
                                jArr2 = jArr5;
                                i2 = length;
                                i3 = i11;
                                i4 = i8;
                                j = j3;
                                i5 = i10;
                                c = c2;
                                j2 = j4;
                                i6 = i9;
                            }
                            j3 = j >> i6;
                            i11 = i3 + 1;
                            i9 = i6;
                            c2 = c;
                            j4 = j2;
                            jArr5 = jArr2;
                            length = i2;
                            i8 = i4;
                            i10 = i5;
                            mutableScatterMap5 = mutableScatterMap2;
                        }
                        mutableScatterMap = mutableScatterMap5;
                        jArr = jArr5;
                        int i17 = length;
                        int i18 = i8;
                        if (i10 != i9) {
                            break;
                        }
                        length = i17;
                        i = i18;
                    } else {
                        mutableScatterMap = mutableScatterMap5;
                        jArr = jArr5;
                        i = i8;
                    }
                    if (i == length) {
                        break;
                    }
                    i8 = i + 1;
                    mutableScatterMap5 = mutableScatterMap;
                    jArr5 = jArr;
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final void addPendingInvalidationsLocked(Object p0, boolean p1) {
        Object obj = this.observations.get(p0);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
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
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (!ScopeMap.m3644removeimpl(this.observationsProcessed, p0, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(p0) != InvalidationResult.IGNORED) {
                                if (recomposeScopeImpl.isConditional() && !p1) {
                                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                } else {
                                    this.invalidatedScopes.add(recomposeScopeImpl);
                                }
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
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (ScopeMap.m3644removeimpl(this.observationsProcessed, p0, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(p0) == InvalidationResult.IGNORED) {
                return;
            }
            if (recomposeScopeImpl2.isConditional() && !p1) {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
            } else {
                this.invalidatedScopes.add(recomposeScopeImpl2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e7 A[PHI: r24 r25 r26
  0x00e7: PHI (r24v6 long[]) = (r24v5 long[]), (r24v9 long[]) binds: [B:38:0x00e5, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r25v4 int) = (r25v3 int), (r25v7 int) binds: [B:38:0x00e5, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r26v4 int) = (r26v3 int), (r26v7 int) binds: [B:38:0x00e5, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    private final void cleanUpDerivedStateObservations() {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        MutableScatterMap<Object, Object> mutableScatterMap = this.derivedStates;
        long[] jArr3 = mutableScatterMap.metadata;
        int length = jArr3.length - 2;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << c) & j3 & j2) != j2) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & j) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = mutableScatterMap.keys[i9];
                            Object obj2 = mutableScatterMap.values[i9];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    i2 = length;
                                    int i10 = 0;
                                    while (true) {
                                        long j4 = jArr4[i10];
                                        long[] jArr5 = jArr4;
                                        i3 = i6;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j4 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    objArr2 = objArr3;
                                                    if (!ScopeMap.m3638containsimpl(this.observations, (DerivedState) objArr3[i13])) {
                                                        mutableScatterSet.removeElementAt(i13);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j4 >>= 8;
                                                i12++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i11 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i6 = i3;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                        c = 7;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i2 = length;
                                    i3 = i6;
                                }
                                if (mutableScatterSet.isEmpty()) {
                                    mutableScatterMap.removeValueAt(i9);
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = length;
                                i3 = i6;
                                Intrinsics.checkNotNull(obj2, "");
                                if (!ScopeMap.m3638containsimpl(this.observations, (DerivedState) obj2)) {
                                    mutableScatterMap.removeValueAt(i9);
                                }
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i3 = i6;
                            i4 = i5;
                        }
                        j3 >>= i4;
                        i8++;
                        i5 = i4;
                        jArr3 = jArr2;
                        length = i2;
                        i6 = i3;
                        j = 255;
                        c = 7;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    int i15 = i6;
                    if (i7 != i5) {
                        break;
                    }
                    length = i14;
                    i = i15;
                } else {
                    jArr = jArr3;
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
                jArr3 = jArr;
                j = 255;
                c = 7;
                j2 = -9187201950435737472L;
                i5 = 8;
            }
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr4 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j5 = jArr6[i16];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j5 & 255) < 128) {
                        int i19 = (i16 << 3) + i18;
                        if (!((RecomposeScopeImpl) objArr4[i19]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i19);
                        }
                    }
                    j5 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public final void recordReadOf(Object p0) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        long[] jArr;
        int i;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime = this.composer.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        currentRecomposeScope$runtime.setUsed(true);
        boolean zRecordRead = currentRecomposeScope$runtime.recordRead(p0);
        CompositionObserver compositionObserverObserver = observer();
        if (compositionObserverObserver != null) {
            compositionObserverObserver.onReadInScope(currentRecomposeScope$runtime, p0);
        }
        if (zRecordRead) {
            return;
        }
        if (p0 instanceof StateObjectImpl) {
            ReaderKind.Companion companion = ReaderKind.INSTANCE;
            ((StateObjectImpl) p0).m3695recordReadInh_f27i8$runtime(ReaderKind.m3677constructorimpl(1));
        }
        ScopeMap.m3631addimpl(this.observations, p0, currentRecomposeScope$runtime);
        if (p0 instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) p0;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m3646removeScopeimpl(this.derivedStates, p0);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr2 = dependencies.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr2[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr[(i2 << 3) + i5];
                                if (stateObject instanceof StateObjectImpl) {
                                    ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                                    ((StateObjectImpl) stateObject).m3695recordReadInh_f27i8$runtime(ReaderKind.m3677constructorimpl(1));
                                }
                                ScopeMap.m3631addimpl(this.derivedStates, stateObject, p0);
                                i = 8;
                            } else {
                                jArr2 = jArr2;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr2 = jArr;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    private final void invalidateScopeOfLocked(Object p0) {
        Object obj = this.observations.get(p0);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
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
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(p0) == InvalidationResult.IMMINENT) {
                                ScopeMap.m3631addimpl(this.observationsProcessed, p0, recomposeScopeImpl);
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
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (recomposeScopeImpl2.invalidateForResult(p0) == InvalidationResult.IMMINENT) {
                ScopeMap.m3631addimpl(this.observationsProcessed, p0, recomposeScopeImpl2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x0064, LOOP:0: B:11:0x0021->B:21:0x0058, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0012, B:11:0x0021, B:13:0x0031, B:15:0x003d, B:17:0x0046, B:18:0x0050, B:21:0x0058, B:22:0x005b, B:23:0x0060), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[EDGE_INSN: B:32:0x0060->B:23:0x0060 BREAK  A[LOOP:0: B:11:0x0021->B:21:0x0058], SYNTHETIC] */
    @Override // androidx.compose.runtime.ControlledComposition
    public final void recordWriteOf(Object p0) {
        synchronized (this.lock) {
            invalidateScopeOfLocked(p0);
            Object obj = this.derivedStates.get(p0);
            if (obj != null) {
                if (!(obj instanceof MutableScatterSet)) {
                    invalidateScopeOfLocked((DerivedState) obj);
                } else {
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
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
                                        invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
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
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean recompose() {
        synchronized (this.lock) {
            PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
            if (pausedCompositionImpl != null && !pausedCompositionImpl.isRecomposing$runtime()) {
                pausedCompositionImpl.markIncomplete$runtime();
                return false;
            }
            drainPendingModificationsForCompositionLocked();
            try {
                MutableScatterMap<Object, Object> mutableScatterMapM3469takeInvalidationsafanTW4 = m3469takeInvalidationsafanTW4();
                try {
                    boolean zM3465recomposeaFTiNEg$runtime = this.composer.m3465recomposeaFTiNEg$runtime(mutableScatterMapM3469takeInvalidationsafanTW4, this.shouldPause);
                    if (!zM3465recomposeaFTiNEg$runtime) {
                        drainPendingModificationsLocked();
                    }
                    return zM3465recomposeaFTiNEg$runtime;
                } catch (Throwable th) {
                    this.invalidations = mutableScatterMapM3469takeInvalidationsafanTW4;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                        } finally {
                            rememberEventDispatcher.clear();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void disposeUnusedMovableContent(MovableContentState p0) {
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            SlotWriter slotWriterOpenWriter = p0.getSlotTable().openWriter();
            try {
                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, this.rememberManager);
                Unit unit = Unit.INSTANCE;
                slotWriterOpenWriter.close(true);
                rememberEventDispatcher.dispatchRememberObservers();
                rememberEventDispatcher.clear();
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            rememberEventDispatcher.clear();
            throw th2;
        }
    }

    private final void applyChangesInLocked(ChangeList p0) throws Throwable {
        RememberEventDispatcher rememberManager$runtime;
        Object obj;
        Object obj2;
        long[] jArr;
        long[] jArr2;
        int i;
        char c;
        long j;
        int i2;
        long[] jArr3;
        long[] jArr4;
        RecordingApplier<Object> pausableApplier$runtime;
        CompositionImpl compositionImpl = this;
        compositionImpl.rememberManager.prepare(compositionImpl.abandonSet, compositionImpl.composer.getErrorContext$runtime());
        try {
            if (p0.isEmpty()) {
                try {
                    if (compositionImpl.lateChanges.isEmpty() && compositionImpl.pendingPausedComposition == null) {
                        compositionImpl.rememberManager.dispatchAbandons();
                    }
                } finally {
                    compositionImpl.rememberManager.clear();
                }
            } else {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
                try {
                    PausedCompositionImpl pausedCompositionImpl = compositionImpl.pendingPausedComposition;
                    RecordingApplier<Object> recordingApplier = (pausedCompositionImpl == null || (pausableApplier$runtime = pausedCompositionImpl.getPausableApplier$runtime()) == null) ? compositionImpl.applier : pausableApplier$runtime;
                    PausedCompositionImpl pausedCompositionImpl2 = compositionImpl.pendingPausedComposition;
                    if (pausedCompositionImpl2 == null || (rememberManager$runtime = pausedCompositionImpl2.getRememberManager()) == null) {
                        rememberManager$runtime = compositionImpl.rememberManager;
                    }
                    recordingApplier.onBeginChanges();
                    SlotWriter slotWriterOpenWriter = compositionImpl.slotTable.openWriter();
                    int i3 = 0;
                    try {
                        p0.executeAndFlushAllPendingChanges(recordingApplier, slotWriterOpenWriter, rememberManager$runtime, compositionImpl.composer.getErrorContext$runtime());
                        Unit unit = Unit.INSTANCE;
                        slotWriterOpenWriter.close(true);
                        recordingApplier.onEndChanges();
                        Unit unit2 = Unit.INSTANCE;
                        Trace.INSTANCE.endSection(objBeginSection);
                        compositionImpl.rememberManager.dispatchRememberObservers();
                        compositionImpl.rememberManager.dispatchSideEffects();
                        if (compositionImpl.pendingInvalidScopes) {
                            try {
                                Object objBeginSection2 = Trace.INSTANCE.beginSection("Compose:unobserve");
                                try {
                                    compositionImpl.pendingInvalidScopes = false;
                                    MutableScatterMap<Object, Object> mutableScatterMap = compositionImpl.observations;
                                    long[] jArr5 = mutableScatterMap.metadata;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            try {
                                                long j2 = jArr5[i4];
                                                char c2 = 7;
                                                long j3 = -9187201950435737472L;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j2 & 255) < 128) {
                                                            int i8 = (i4 << 3) + i7;
                                                            Object obj3 = mutableScatterMap.keys[i8];
                                                            Object obj4 = mutableScatterMap.values[i8];
                                                            if (obj4 instanceof MutableScatterSet) {
                                                                Intrinsics.checkNotNull(obj4, "");
                                                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj4;
                                                                Object[] objArr = mutableScatterSet.elements;
                                                                long[] jArr6 = mutableScatterSet.metadata;
                                                                int length2 = jArr6.length - 2;
                                                                if (length2 >= 0) {
                                                                    obj2 = objBeginSection2;
                                                                    int i9 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j4 = jArr6[i9];
                                                                            jArr2 = jArr5;
                                                                            i = length;
                                                                            c = 7;
                                                                            j = -9187201950435737472L;
                                                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                                int i11 = 0;
                                                                                while (i11 < i10) {
                                                                                    if ((j4 & 255) < 128) {
                                                                                        jArr4 = jArr6;
                                                                                        int i12 = (i9 << 3) + i11;
                                                                                        if (!((RecomposeScopeImpl) objArr[i12]).getValid()) {
                                                                                            mutableScatterSet.removeElementAt(i12);
                                                                                        }
                                                                                    } else {
                                                                                        jArr4 = jArr6;
                                                                                    }
                                                                                    j4 >>= 8;
                                                                                    i11++;
                                                                                    jArr6 = jArr4;
                                                                                }
                                                                                jArr3 = jArr6;
                                                                                if (i10 != 8) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr6;
                                                                            }
                                                                            if (i9 == length2) {
                                                                                break;
                                                                            }
                                                                            i9++;
                                                                            jArr5 = jArr2;
                                                                            length = i;
                                                                            jArr6 = jArr3;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            obj = obj2;
                                                                            Trace.INSTANCE.endSection(obj);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    obj2 = objBeginSection2;
                                                                    jArr2 = jArr5;
                                                                    i = length;
                                                                    c = c2;
                                                                    j = -9187201950435737472L;
                                                                }
                                                                if (mutableScatterSet.isEmpty()) {
                                                                    mutableScatterMap.removeValueAt(i8);
                                                                }
                                                            } else {
                                                                obj2 = objBeginSection2;
                                                                jArr2 = jArr5;
                                                                i = length;
                                                                c = c2;
                                                                j = -9187201950435737472L;
                                                                Intrinsics.checkNotNull(obj4, "");
                                                                if (!((RecomposeScopeImpl) obj4).getValid()) {
                                                                    mutableScatterMap.removeValueAt(i8);
                                                                }
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            obj2 = objBeginSection2;
                                                            jArr2 = jArr5;
                                                            i = length;
                                                            c = c2;
                                                            j = j3;
                                                            i2 = i5;
                                                        }
                                                        j2 >>= i2;
                                                        i7++;
                                                        i5 = i2;
                                                        j3 = j;
                                                        c2 = c;
                                                        objBeginSection2 = obj2;
                                                        jArr5 = jArr2;
                                                        length = i;
                                                    }
                                                    obj2 = objBeginSection2;
                                                    jArr = jArr5;
                                                    int i13 = length;
                                                    if (i6 != i5) {
                                                        break;
                                                    } else {
                                                        length = i13;
                                                    }
                                                } else {
                                                    obj2 = objBeginSection2;
                                                    jArr = jArr5;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                i3 = 0;
                                                objBeginSection2 = obj2;
                                                jArr5 = jArr;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj2 = objBeginSection2;
                                                obj = obj2;
                                                Trace.INSTANCE.endSection(obj);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj2 = objBeginSection2;
                                    }
                                    cleanUpDerivedStateObservations();
                                    Unit unit3 = Unit.INSTANCE;
                                    Trace.INSTANCE.endSection(obj2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = objBeginSection2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                compositionImpl = this;
                                try {
                                    if (compositionImpl.lateChanges.isEmpty() && compositionImpl.pendingPausedComposition == null) {
                                        compositionImpl.rememberManager.dispatchAbandons();
                                    }
                                    throw th;
                                } finally {
                                    compositionImpl.rememberManager.clear();
                                }
                            }
                        }
                        compositionImpl = this;
                        try {
                            if (compositionImpl.lateChanges.isEmpty() && compositionImpl.pendingPausedComposition == null) {
                                compositionImpl.rememberManager.dispatchAbandons();
                            }
                        } finally {
                            compositionImpl.rememberManager.clear();
                        }
                    } catch (Throwable th5) {
                        slotWriterOpenWriter.close(false);
                        throw th5;
                    }
                } catch (Throwable th6) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                        } finally {
                            rememberEventDispatcher.clear();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                        } finally {
                            rememberEventDispatcher.clear();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th) {
                        rememberEventDispatcher.clear();
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher2 = this.rememberManager;
                        try {
                            rememberEventDispatcher2.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher2.dispatchAbandons();
                        } finally {
                            rememberEventDispatcher2.clear();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> p0) {
        MutableScatterMap<Object, Object> mutableScatterMapM3469takeInvalidationsafanTW4 = m3469takeInvalidationsafanTW4();
        try {
            return p0.invoke(ScopeMap.m3634boximpl(mutableScatterMapM3469takeInvalidationsafanTW4));
        } catch (Throwable th) {
            this.invalidations = mutableScatterMapM3469takeInvalidationsafanTW4;
            throw th;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final <R> R delegateInvalidations(ControlledComposition p0, int p1, Function0<? extends R> p2) {
        if (p0 != null && !Intrinsics.areEqual(p0, this) && p1 >= 0) {
            this.invalidationDelegate = (CompositionImpl) p0;
            this.invalidationDelegateGroup = p1;
            try {
                return p2.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return p2.invoke();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback p0) {
        ShouldPauseCallback shouldPauseCallback = this.shouldPause;
        this.shouldPause = p0;
        return shouldPauseCallback;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final InvalidationResult invalidate(RecomposeScopeImpl p0, Object p1) {
        CompositionObserver compositionObserverObserver;
        CompositionImpl compositionImpl;
        if (p0.getDefaultsInScope()) {
            p0.setDefaultsInvalid(true);
        }
        Anchor anchor = p0.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            if (!p0.getCanRecompose()) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult invalidationResultInvalidateChecked = invalidateChecked(p0, anchor, p1);
            if (invalidationResultInvalidateChecked != InvalidationResult.IGNORED && (compositionObserverObserver = observer()) != null) {
                compositionObserverObserver.onScopeInvalidated(p0, p1);
            }
            return invalidationResultInvalidateChecked;
        }
        synchronized (this.lock) {
            compositionImpl = this.invalidationDelegate;
        }
        if (compositionImpl != null && compositionImpl.tryImminentInvalidation(p0, p1)) {
            return InvalidationResult.IMMINENT;
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final void recomposeScopeReleased(RecomposeScopeImpl p0) {
        this.pendingInvalidScopes = true;
        CompositionObserver compositionObserverObserver = observer();
        if (compositionObserverObserver != null) {
            compositionObserverObserver.onScopeDisposed(p0);
        }
    }

    @Override // androidx.compose.runtime.CompositionServices
    public final <T> T getCompositionService(CompositionServiceKey<T> p0) {
        if (Intrinsics.areEqual(p0, CompositionKt.getObservableCompositionServiceKey())) {
            return (T) this;
        }
        return null;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl p0, Object p1) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(p0, p1);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x009b A[Catch: all -> 0x00c2, LOOP:1: B:31:0x005c->B:46:0x009b, LOOP_END, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000e, B:13:0x0020, B:15:0x0026, B:19:0x002c, B:23:0x0039, B:24:0x0042, B:28:0x004e, B:31:0x005c, B:33:0x006c, B:35:0x0078, B:37:0x0082, B:42:0x0091, B:46:0x009b, B:47:0x009e, B:50:0x00a3), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[Catch: all -> 0x00c2, EDGE_INSN: B:50:0x00a3->B:51:0x00a8 BREAK  A[LOOP:1: B:31:0x005c->B:46:0x009b], TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x000e, B:13:0x0020, B:15:0x0026, B:19:0x002c, B:23:0x0039, B:24:0x0042, B:28:0x004e, B:31:0x005c, B:33:0x006c, B:35:0x0078, B:37:0x0082, B:42:0x0091, B:46:0x009b, B:47:0x009e, B:50:0x00a3), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00a3 A[SYNTHETIC] */
    private final InvalidationResult invalidateChecked(RecomposeScopeImpl p0, Anchor p1, Object p2) {
        int i;
        CompositionImpl compositionImpl = this;
        while (true) {
            synchronized (compositionImpl.lock) {
                CompositionImpl compositionImpl2 = compositionImpl.invalidationDelegate;
                if (compositionImpl2 == null || !compositionImpl.slotTable.groupContainsAnchor(compositionImpl.invalidationDelegateGroup, p1)) {
                    compositionImpl2 = null;
                }
                if (compositionImpl2 == null) {
                    if (compositionImpl.tryImminentInvalidation(p0, p2)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (p2 == null || !(p2 instanceof DerivedState)) {
                        ScopeMap.m3648setimpl(compositionImpl.invalidations, p0, ScopeInvalidated.INSTANCE);
                    } else {
                        Object obj = compositionImpl.invalidations.get(p0);
                        if (obj == null) {
                            ScopeMap.m3631addimpl(compositionImpl.invalidations, p0, p2);
                            break;
                        }
                        if (!(obj instanceof MutableScatterSet)) {
                            if (obj != ScopeInvalidated.INSTANCE) {
                                ScopeMap.m3631addimpl(compositionImpl.invalidations, p0, p2);
                                break;
                            }
                        } else {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr = mutableScatterSet.metadata;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                ScopeMap.m3631addimpl(compositionImpl.invalidations, p0, p2);
                                break;
                            }
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i2 == length) {
                                        ScopeMap.m3631addimpl(compositionImpl.invalidations, p0, p2);
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int i3 = 8;
                                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((j & 255) >= 128) {
                                            i = i3;
                                        } else {
                                            if (objArr[(i2 << 3) + i5] == ScopeInvalidated.INSTANCE) {
                                                break;
                                            }
                                            i = 8;
                                        }
                                        j >>= i;
                                        i5++;
                                        i3 = i;
                                    }
                                    if (i4 == i3) {
                                        if (i2 == length) {
                                            i2++;
                                        }
                                    }
                                    ScopeMap.m3631addimpl(compositionImpl.invalidations, p0, p2);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (compositionImpl2 == null) {
                    compositionImpl.parent.invalidate$runtime(compositionImpl);
                    return compositionImpl.isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
                }
                compositionImpl = compositionImpl2;
            }
        }
    }

    public final void removeObservation$runtime(Object p0, RecomposeScopeImpl p1) {
        ScopeMap.m3644removeimpl(this.observations, p0, p1);
    }

    public final void removeDerivedStateObservation$runtime(DerivedState<?> p0) {
        if (ScopeMap.m3638containsimpl(this.observations, p0)) {
            return;
        }
        ScopeMap.m3646removeScopeimpl(this.derivedStates, p0);
    }

    /* JADX INFO: renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m3469takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m3637constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final void validateRecomposeScopeAnchors(SlotTable p0) {
        Object[] slots = p0.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList2.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !p0.slotsOf$runtime(anchor.toIndexFor(p0)).contains(recomposeScopeImpl2)) {
                int iIndexOf = ArraysKt.indexOf((RecomposeScopeImpl[]) p0.getSlots(), recomposeScopeImpl2);
                StringBuilder sb = new StringBuilder("Misaligned anchor ");
                sb.append(anchor);
                sb.append(" in scope ");
                sb.append(recomposeScopeImpl2);
                sb.append(" encountered, scope found at ");
                sb.append(iIndexOf);
                PreconditionsKt.throwIllegalStateException(sb.toString());
            }
        }
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> p0) {
        try {
            return p0.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                try {
                    rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                    rememberEventDispatcher.dispatchAbandons();
                } finally {
                    rememberEventDispatcher.clear();
                }
            }
            throw th;
        }
    }

    private final CompositionObserver observer() {
        return this.observerHolder.current();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void deactivate() {
        synchronized (this.lock) {
            if (this.pendingPausedComposition != null) {
                PreconditionsKt.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
            }
            boolean z = this.slotTable.getGroupsSize() > 0;
            if (z || !this.abandonSet.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:deactivate");
                try {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        if (z) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, this.rememberManager);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close(true);
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                        Unit unit2 = Unit.INSTANCE;
                        Trace.INSTANCE.endSection(objBeginSection);
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th3;
                }
            }
            ScopeMap.m3635clearimpl(this.observations);
            ScopeMap.m3635clearimpl(this.derivedStates);
            ScopeMap.m3635clearimpl(this.invalidations);
            this.changes.clear();
            this.lateChanges.clear();
            this.composer.deactivate$runtime();
            this.state = 1;
            Unit unit3 = Unit.INSTANCE;
        }
    }

    public final int composerStacksSizes$runtime() {
        return this.composer.stacksSize$runtime();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean observesAnyOf(Set<? extends Object> p0) {
        if (p0 instanceof ScatterSetWrapper) {
            ScatterSet set$runtime = ((ScatterSetWrapper) p0).getSet$runtime();
            Object[] objArr = set$runtime.elements;
            long[] jArr = set$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (ScopeMap.m3638containsimpl(this.observations, obj) || ScopeMap.m3638containsimpl(this.derivedStates, obj)) {
                                    break loop0;
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
                return true;
            }
        } else {
            for (Object obj2 : p0) {
                if (ScopeMap.m3638containsimpl(this.observations, obj2) || ScopeMap.m3638containsimpl(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0293 A[PHI: r16 r25 r33 r34
  0x0293: PHI (r16v13 long[]) = (r16v12 long[]), (r16v12 long[]), (r16v14 long[]) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]
  0x0293: PHI (r25v4 long) = (r25v3 long), (r25v3 long), (r25v6 long) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]
  0x0293: PHI (r33v13 int) = (r33v12 int), (r33v12 int), (r33v15 int) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]
  0x0293: PHI (r34v13 int) = (r34v12 int), (r34v12 int), (r34v15 int) binds: [B:116:0x028a, B:118:0x0290, B:113:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x00da A[EDGE_INSN: B:186:0x00da->B:37:0x00da BREAK  A[LOOP:2: B:23:0x007a->B:34:0x00be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0191 A[EDGE_INSN: B:222:0x0191->B:72:0x0191 BREAK  A[LOOP:13: B:59:0x014d->B:70:0x0189], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[LOOP:2: B:23:0x007a->B:34:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0189 A[LOOP:13: B:59:0x014d->B:70:0x0189, LOOP_END] */
    private final void addPendingInvalidationsLocked(Set<? extends Object> p0, boolean p1) {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        boolean zContains;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int i6;
        int i7;
        long j;
        Object[] objArr3;
        long[] jArr6;
        Object[] objArr4;
        long[] jArr7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i14 = 8;
        if (p0 instanceof ScatterSetWrapper) {
            ScatterSet set$runtime = ((ScatterSetWrapper) p0).getSet$runtime();
            Object[] objArr5 = set$runtime.elements;
            long[] jArr8 = set$runtime.metadata;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j3 = jArr8[i15];
                    if ((((~j3) << c) & j3 & j2) != j2) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j3 & 255) < 128) {
                                Object obj = objArr5[(i15 << 3) + i17];
                                if (obj instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj).invalidateForResult(null);
                                    i9 = i16;
                                    i10 = i17;
                                    i13 = i14;
                                    i11 = length;
                                    i12 = i15;
                                } else {
                                    addPendingInvalidationsLocked(obj, p1);
                                    Object obj2 = this.derivedStates.get(obj);
                                    if (obj2 == null) {
                                        i9 = i16;
                                        i10 = i17;
                                        i11 = length;
                                        i12 = i15;
                                    } else if (obj2 instanceof MutableScatterSet) {
                                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                        Object[] objArr6 = mutableScatterSet.elements;
                                        long[] jArr9 = mutableScatterSet.metadata;
                                        int length2 = jArr9.length - 2;
                                        if (length2 >= 0) {
                                            i11 = length;
                                            i12 = i15;
                                            int i18 = 0;
                                            while (true) {
                                                long j4 = jArr9[i18];
                                                i9 = i16;
                                                i10 = i17;
                                                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i18 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i18++;
                                                    i16 = i9;
                                                    i17 = i10;
                                                    c = 7;
                                                } else {
                                                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                    for (int i20 = 0; i20 < i19; i20++) {
                                                        if ((j4 & 255) < 128) {
                                                            addPendingInvalidationsLocked((DerivedState) objArr6[(i18 << 3) + i20], p1);
                                                        }
                                                        j4 >>= 8;
                                                    }
                                                    if (i19 != 8) {
                                                        break;
                                                    }
                                                    if (i18 != length2) {
                                                        break;
                                                    }
                                                    i18++;
                                                    i16 = i9;
                                                    i17 = i10;
                                                    c = 7;
                                                }
                                            }
                                        } else {
                                            i9 = i16;
                                            i10 = i17;
                                            i11 = length;
                                            i12 = i15;
                                        }
                                    } else {
                                        i9 = i16;
                                        i10 = i17;
                                        i11 = length;
                                        i12 = i15;
                                        addPendingInvalidationsLocked((DerivedState) obj2, p1);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    i13 = 8;
                                }
                            } else {
                                i9 = i16;
                                i10 = i17;
                                i11 = length;
                                i12 = i15;
                                i13 = i14;
                            }
                            j3 >>= i13;
                            i17 = i10 + 1;
                            length = i11;
                            i14 = i13;
                            i15 = i12;
                            i16 = i9;
                            c = 7;
                        }
                        int i21 = length;
                        i8 = i15;
                        if (i16 != i14) {
                            break;
                        } else {
                            length = i21;
                        }
                    } else {
                        i8 = i15;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i15 = i8 + 1;
                    c = 7;
                    j2 = -9187201950435737472L;
                    i14 = 8;
                }
            }
        } else {
            for (Object obj3 : p0) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj3, p1);
                    Object obj4 = this.derivedStates.get(obj3);
                    if (obj4 != null) {
                        if (obj4 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj4;
                            Object[] objArr7 = mutableScatterSet2.elements;
                            long[] jArr10 = mutableScatterSet2.metadata;
                            int length3 = jArr10.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j5 = jArr10[i22];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i22 != length3) {
                                            break;
                                            break;
                                        }
                                        i22++;
                                    } else {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j5 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr7[(i22 << 3) + i24], p1);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i23 != 8) {
                                            break;
                                        } else if (i22 != length3) {
                                            break;
                                        } else {
                                            i22++;
                                        }
                                    }
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) obj4, p1);
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet3 = this.conditionallyInvalidatedScopes;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet4 = this.invalidatedScopes;
        if (p1 && mutableScatterSet3.isNotEmpty()) {
            MutableScatterMap<Object, Object> mutableScatterMap = this.observations;
            long[] jArr11 = mutableScatterMap.metadata;
            int length4 = jArr11.length - 2;
            if (length4 >= 0) {
                int i25 = 0;
                while (true) {
                    long j6 = jArr11[i25];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i26 = 8 - ((~(i25 - length4)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j6 & 255) < 128) {
                                int i28 = (i25 << 3) + i27;
                                Object obj5 = mutableScatterMap.keys[i28];
                                Object obj6 = mutableScatterMap.values[i28];
                                if (obj6 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj6, "");
                                    MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj6;
                                    Object[] objArr8 = mutableScatterSet5.elements;
                                    long[] jArr12 = mutableScatterSet5.metadata;
                                    jArr5 = jArr11;
                                    int length5 = jArr12.length - 2;
                                    if (length5 >= 0) {
                                        i6 = length4;
                                        i7 = i25;
                                        int i29 = 0;
                                        while (true) {
                                            long j7 = jArr12[i29];
                                            j = j6;
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                int i31 = 0;
                                                while (i31 < i30) {
                                                    if ((j7 & 255) < 128) {
                                                        jArr7 = jArr12;
                                                        int i32 = (i29 << 3) + i31;
                                                        objArr4 = objArr8;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr8[i32];
                                                        if (mutableScatterSet3.contains(recomposeScopeImpl) || mutableScatterSet4.contains(recomposeScopeImpl)) {
                                                            mutableScatterSet5.removeElementAt(i32);
                                                        }
                                                    } else {
                                                        objArr4 = objArr8;
                                                        jArr7 = jArr12;
                                                    }
                                                    j7 >>= 8;
                                                    i31++;
                                                    jArr12 = jArr7;
                                                    objArr8 = objArr4;
                                                }
                                                objArr3 = objArr8;
                                                jArr6 = jArr12;
                                                if (i30 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr3 = objArr8;
                                                jArr6 = jArr12;
                                            }
                                            if (i29 == length5) {
                                                break;
                                            }
                                            i29++;
                                            j6 = j;
                                            jArr12 = jArr6;
                                            objArr8 = objArr3;
                                        }
                                    } else {
                                        i6 = length4;
                                        i7 = i25;
                                        j = j6;
                                    }
                                    if (mutableScatterSet5.isEmpty()) {
                                        mutableScatterMap.removeValueAt(i28);
                                    }
                                } else {
                                    jArr5 = jArr11;
                                    i6 = length4;
                                    i7 = i25;
                                    j = j6;
                                    Intrinsics.checkNotNull(obj6, "");
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj6;
                                    if (mutableScatterSet3.contains(recomposeScopeImpl2) || mutableScatterSet4.contains(recomposeScopeImpl2)) {
                                        mutableScatterMap.removeValueAt(i28);
                                    }
                                }
                            } else {
                                jArr5 = jArr11;
                                i6 = length4;
                                i7 = i25;
                                j = j6;
                            }
                            j6 = j >> 8;
                            i27++;
                            length4 = i6;
                            i25 = i7;
                            jArr11 = jArr5;
                        }
                        jArr4 = jArr11;
                        int i33 = length4;
                        int i34 = i25;
                        if (i26 != 8) {
                            break;
                        }
                        length4 = i33;
                        i5 = i34;
                    } else {
                        jArr4 = jArr11;
                        i5 = i25;
                    }
                    if (i5 == length4) {
                        break;
                    }
                    i25 = i5 + 1;
                    jArr11 = jArr4;
                }
            }
            mutableScatterSet3.clear();
            cleanUpDerivedStateObservations();
            return;
        }
        if (mutableScatterSet4.isNotEmpty()) {
            MutableScatterMap<Object, Object> mutableScatterMap2 = this.observations;
            long[] jArr13 = mutableScatterMap2.metadata;
            int length6 = jArr13.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j8 = jArr13[i35];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j8 & 255) < 128) {
                                int i38 = (i35 << 3) + i37;
                                Object obj7 = mutableScatterMap2.keys[i38];
                                Object obj8 = mutableScatterMap2.values[i38];
                                if (obj8 instanceof MutableScatterSet) {
                                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj8;
                                    Object[] objArr9 = mutableScatterSet6.elements;
                                    long[] jArr14 = mutableScatterSet6.metadata;
                                    int length7 = jArr14.length - 2;
                                    if (length7 >= 0) {
                                        i2 = length6;
                                        i3 = i35;
                                        int i39 = 0;
                                        while (true) {
                                            long j9 = jArr14[i39];
                                            i4 = i36;
                                            long[] jArr15 = jArr14;
                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j9 & 255) < 128) {
                                                        jArr3 = jArr13;
                                                        int i42 = (i39 << 3) + i41;
                                                        objArr2 = objArr9;
                                                        if (mutableScatterSet4.contains((RecomposeScopeImpl) objArr9[i42])) {
                                                            mutableScatterSet6.removeElementAt(i42);
                                                        }
                                                    } else {
                                                        jArr3 = jArr13;
                                                        objArr2 = objArr9;
                                                    }
                                                    j9 >>= 8;
                                                    i41++;
                                                    jArr13 = jArr3;
                                                    objArr9 = objArr2;
                                                }
                                                jArr2 = jArr13;
                                                objArr = objArr9;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr13;
                                                objArr = objArr9;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39++;
                                            i36 = i4;
                                            jArr14 = jArr15;
                                            jArr13 = jArr2;
                                            objArr9 = objArr;
                                        }
                                    } else {
                                        jArr2 = jArr13;
                                        i2 = length6;
                                        i3 = i35;
                                        i4 = i36;
                                    }
                                    zContains = mutableScatterSet6.isEmpty();
                                } else {
                                    jArr2 = jArr13;
                                    i2 = length6;
                                    i3 = i35;
                                    i4 = i36;
                                    Intrinsics.checkNotNull(obj8, "");
                                    zContains = mutableScatterSet4.contains((RecomposeScopeImpl) obj8);
                                }
                                if (zContains) {
                                    mutableScatterMap2.removeValueAt(i38);
                                }
                            } else {
                                jArr2 = jArr13;
                                i2 = length6;
                                i3 = i35;
                                i4 = i36;
                            }
                            j8 >>= 8;
                            i37++;
                            length6 = i2;
                            i35 = i3;
                            i36 = i4;
                            jArr13 = jArr2;
                        }
                        jArr = jArr13;
                        int i43 = length6;
                        int i44 = i35;
                        if (i36 != 8) {
                            break;
                        }
                        length6 = i43;
                        i = i44;
                    } else {
                        jArr = jArr13;
                        i = i35;
                    }
                    if (i == length6) {
                        break;
                    }
                    i35 = i + 1;
                    jArr13 = jArr;
                }
            }
            cleanUpDerivedStateObservations();
            mutableScatterSet4.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> p0) {
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(p0.get(i).getFirst().getComposition(), this)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
                break;
            }
        }
        try {
            this.composer.insertMovableContentReferences(p0);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                    } finally {
                        rememberEventDispatcher.clear();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                abandonChanges();
                throw th2;
            }
        }
    }

    private final <T> T guardChanges(Function0<? extends T> p0) {
        try {
            return p0.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                    } finally {
                        rememberEventDispatcher.clear();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                abandonChanges();
                throw th2;
            }
        }
    }
}
