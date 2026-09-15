package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2;
import kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1;
import kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1;
import kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004ï\u0001ð\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010#J4\u0010%\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010)J\"\u0010*\u001a\u00020\b*\u00020+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u0004H\u0002J#\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.H\u0002¢\u0006\u0002\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\b012\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b5\u0010#Jê\u0001\u00106\u001a\u0002H7\"\u0004\b\u0001\u001072\u0006\u0010\"\u001a\u00028\u00002\b\u00108\u001a\u0004\u0018\u0001092\f\u0010:\u001a\b\u0012\u0004\u0012\u0002H70;2<\u0010<\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0004\u0012\u0002H70=2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H70;2h\b\u0002\u0010C\u001ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H70DH\u0082\b¢\u0006\u0002\u0010EJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\b012\u0006\u0010\"\u001a\u00028\u0000H\u0004¢\u0006\u0004\bG\u00103JX\u0010H\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u00112\u0006\u00108\u001a\u00020+2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0;2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0;H\u0082\b¢\u0006\u0002\u0010IJE\u0010J\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010LJE\u0010M\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010LJ\u0010\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u0011H\u0003J\u0010\u0010P\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u0011H\u0002J\r\u0010N\u001a\u00020\u001aH\u0010¢\u0006\u0002\bRJ\u0019\u0010S\u001a\u00020\u001a*\u0002092\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\bH\u0014J\b\u0010V\u001a\u00020\bH\u0014J\u000e\u0010W\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010XJ;\u0010Y\u001a\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010[J\"\u0010\\\u001a\u00020\b*\u00020+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0016\u0010]\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0002J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@¢\u0006\u0004\b_\u0010XJ4\u0010`\u001a\b\u0012\u0004\u0012\u00028\u0000012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0011H\u0082@¢\u0006\u0004\ba\u0010[J\u001c\u0010b\u001a\u00020\b2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000010.H\u0002J\u0015\u0010c\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0016¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\b2\u0006\u0010g\u001a\u00020\u0011H\u0004J÷\u0001\u0010h\u001a\u0002H7\"\u0004\b\u0001\u001072\b\u00108\u001a\u0004\u0018\u0001092!\u0010i\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H70\u00072Q\u0010<\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002H70j2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H70;2S\b\u0002\u0010C\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002H70jH\u0082\b¢\u0006\u0002\u0010kJ`\u0010l\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00112\u0006\u00108\u001a\u00020+2!\u0010i\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\b0\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0;H\u0082\bJ2\u0010m\u001a\u0004\u0018\u0001092\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000109H\u0002J2\u0010n\u001a\u0004\u0018\u0001092\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000109H\u0002J\"\u0010o\u001a\u00020\u001a*\u0002092\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u0004H\u0002J\b\u0010p\u001a\u00020\bH\u0002J&\u0010q\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0011H\u0002J&\u0010s\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0011H\u0002J\u0012\u0010t\u001a\u00020\b2\b\b\u0002\u0010u\u001a\u00020\u0011H\u0002J\u0015\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\u0011H\u0000¢\u0006\u0002\bxJ \u0010\u007f\u001a\u00020\b2\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u00012\b\u0010\"\u001a\u0004\u0018\u000109H\u0014J%\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u00002\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u0001H\u0002¢\u0006\u0003\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J\"\u0010\u0092\u0001\u001a\u00020\b2\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u000109H\u0002J\u0017\u0010\u0093\u0001\u001a\u00020\b2\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u0001H\u0002J!\u0010\u0094\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J!\u0010\u0095\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J!\u0010\u0096\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J\u0011\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000 \u0001H\u0096\u0002J\t\u0010ª\u0001\u001a\u00020\bH\u0014J\u0015\u0010«\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016J\u0013\u0010\u00ad\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u0001J\u0007\u0010\u00ad\u0001\u001a\u00020\bJ \u0010\u00ad\u0001\u001a\u00020\b2\u0011\u0010¬\u0001\u001a\f\u0018\u00010¯\u0001j\u0005\u0018\u0001`®\u0001¢\u0006\u0003\u0010°\u0001J\u001b\u0010±\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0010¢\u0006\u0003\b²\u0001J\u001e\u0010³\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u001aH\u0014J\t\u0010´\u0001\u001a\u00020\bH\u0002J1\u0010µ\u0001\u001a\u00020\b2&\u0010¶\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010\u009b\u0001¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(¬\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\t\u0010·\u0001\u001a\u00020\bH\u0002J\t\u0010¸\u0001\u001a\u00020\bH\u0002J\t\u0010¹\u0001\u001a\u00020\bH\u0002J\t\u0010º\u0001\u001a\u00020\bH\u0002J\u0018\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0007\u0010½\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010¾\u0001\u001a\u00020\b2\u0007\u0010½\u0001\u001a\u00020\u0011H\u0002J\u000f\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0018\u0010À\u0001\u001a\u00020\u00112\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0018\u0010Â\u0001\u001a\u00020\b2\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J \u0010Ã\u0001\u001a\u00020\b2\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010Ä\u0001\u001a\u00020\b*\u00020+H\u0002J\r\u0010Å\u0001\u001a\u00020\b*\u00020+H\u0002J\u0016\u0010Æ\u0001\u001a\u00020\b*\u00020+2\u0007\u0010Ç\u0001\u001a\u00020\u001aH\u0002J\u001b\u0010Ï\u0001\u001a\u00020\u001a2\u0007\u0010Ð\u0001\u001a\u00020\u00112\u0007\u0010Ì\u0001\u001a\u00020\u001aH\u0002J\u000f\u0010Ó\u0001\u001a\u00020\u001aH\u0000¢\u0006\u0003\bÔ\u0001J'\u0010Õ\u0001\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\u0011H\u0002J)\u0010Ö\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J)\u0010Ù\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J2\u0010Ú\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0007\u0010Û\u0001\u001a\u00020\u0011H\u0002J!\u0010Ü\u0001\u001a\u00020\b2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0012\u0010Ý\u0001\u001a\u00020\b2\u0007\u0010Þ\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010ß\u0001\u001a\u00020\b2\u0007\u0010Þ\u0001\u001a\u00020\u0011H\u0002J\n\u0010à\u0001\u001a\u00030á\u0001H\u0016J\u0010\u0010â\u0001\u001a\u00030á\u0001H\u0000¢\u0006\u0003\bã\u0001J\u0007\u0010ä\u0001\u001a\u00020\bJJ\u0010å\u0001\u001a#\u0012\u0005\u0012\u00030\u009b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0æ\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u0006H\u0002¢\u0006\u0003\u0010ç\u0001J4\u0010è\u0001\u001a\u00020\b2\b\u0010¬\u0001\u001a\u00030\u009b\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u0000012\b\u0010é\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001JM\u0010ì\u0001\u001a\u001e\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0j*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010í\u0001JD\u0010ì\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0æ\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u0006H\u0002¢\u0006\u0003\u0010ç\u0001J+\u0010î\u0001\u001a\u00020\b2\b\u0010¬\u0001\u001a\u00030\u009b\u00012\u0006\u0010\"\u001a\u00028\u00002\b\u0010é\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0003\u0010ë\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00068\u0000X\u0081\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\t\u0010\f\u001a\u00020\rX\u0082\u0004R\t\u0010\u000e\u001a\u00020\rX\u0082\u0004R\t\u0010\u000f\u001a\u00020\rX\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\t\u0010\u0018\u001a\u00020\rX\u0082\u0004R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001dX\u0082\u0004R\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001dX\u0082\u0004R\u0015\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001dX\u0082\u0004R,\u0010y\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000z8VX\u0096\u0004¢\u0006\f\u0012\u0004\b{\u0010|\u001a\u0004\b}\u0010~R%\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u0089\u0001\u0010|\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R+\u0010\u008c\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000010\u0088\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u008d\u0001\u0010|\u001a\u0006\b\u008e\u0001\u0010\u008b\u0001R'\u0010\u008f\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0088\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u0090\u0001\u0010|\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001R\u008f\u0001\u0010\u0097\u0001\u001ax\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030\u0081\u0001¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(\u0080\u0001\u0012\u0016\u0012\u0014\u0018\u000109¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(\u0099\u0001\u0012\u0016\u0012\u0014\u0018\u000109¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(\u009a\u0001\u0012 \u0012\u001e\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0j\u0018\u00010jj\u0005\u0018\u0001`\u0098\u0001X\u0082\u0004¢\u0006\f\n\u0003\u0010\u009e\u0001\u0012\u0005\b\u009d\u0001\u0010|R\u0012\u0010¡\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u001dX\u0082\u0004R\u001a\u0010¢\u0001\u001a\u0005\u0018\u00010\u009b\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u00030\u009b\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00030\u009b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010¤\u0001R\u0012\u0010©\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u001dX\u0082\u0004R\u0016\u0010»\u0001\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\u001bR\u001d\u0010È\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÉ\u0001\u0010|\u001a\u0005\bÈ\u0001\u0010\u001bR\u001b\u0010Ê\u0001\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001d\u0010Ì\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÍ\u0001\u0010|\u001a\u0005\bÌ\u0001\u0010\u001bR\u001b\u0010Î\u0001\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ë\u0001R\u001d\u0010Ñ\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÒ\u0001\u0010|\u001a\u0005\bÑ\u0001\u0010\u001b¨\u0006ñ\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/Function1;", "", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "sendersAndCloseStatus", "Lkotlinx/atomicfu/AtomicLong;", "receivers", "bufferEnd", "sendersCounter", "", "getSendersCounter$kotlinx_coroutines_core", "()J", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "bufferEndCounter", "getBufferEndCounter", "completedExpandBuffersAndPauseFlag", "isRendezvousOrUnlimited", "", "()Z", "sendSegment", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/channels/ChannelSegment;", "receiveSegment", "bufferEndSegment", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSend", "sendOnNoWaiterSuspend", "segment", FirebaseAnalytics.Param.INDEX, "s", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareSenderForSuspension", "Lkotlinx/coroutines/Waiter;", "onClosedSendOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "R", "waiter", "", "onRendezvousOrBuffered", "Lkotlin/Function0;", "onSuspend", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "segm", "i", "onClosed", "onNoWaiterSuspend", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "shouldSendSuspend", "curSendersAndCloseStatus", "bufferOrRendezvousSend", "curSenders", "shouldSendSuspend$kotlinx_coroutines_core", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "onReceiveEnqueued", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOnNoWaiterSuspend", "r", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "onClosedReceiveCatchingOnNoWaiterSuspend", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "receiveImpl", "onElementRetrieved", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "updateCellReceive", "updateCellReceiveSlow", "tryResumeSender", "expandBuffer", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "incCompletedExpandBufferAttempts", "nAttempts", "waitExpandBufferCompletion", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "()V", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onClosedSelectOnSend", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "processResultSelectSend", "ignoredParam", "selectResult", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "registerSelectForReceive", "onClosedSelectOnReceive", "processResultSelectReceive", "processResultSelectReceiveOrNull", "processResultSelectReceiveCatching", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "Lkotlin/jvm/functions/Function3;", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "_closeCause", "closeCause", "getCloseCause", "()Ljava/lang/Throwable;", "sendException", "getSendException", "receiveException", "getReceiveException", "closeHandler", "onClosedIdempotent", "close", "cause", "cancel", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "closeOrCancelImpl", "invokeCloseHandler", "invokeOnClose", "handler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "isConflatedDropOldest", "completeClose", "sendersCur", "completeCancel", "closeLinkedList", "markAllEmptyCellsAsClosed", "lastSegment", "removeUnprocessedElements", "cancelSuspendedReceiveRequests", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "isClosedForSend", "isClosedForSend$annotations", "isClosedForSend0", "(J)Z", "isClosedForReceive", "isClosedForReceive$annotations", "isClosedForReceive0", "isClosed", "sendersAndCloseStatusCur", "isEmpty", "isEmpty$annotations", "hasElements", "hasElements$kotlinx_coroutines_core", "isCellNonEmpty", "findSegmentSend", "id", "startFrom", "findSegmentReceive", "findSegmentBufferEnd", "currentBufferEndCounter", "moveSegmentBufferEndToSpecifiedOrLast", "updateSendersCounterIfLower", "value", "updateReceiversCounterIfLower", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "checkSegmentStructureInvariants", "bindCancellationFunResult", "Lkotlin/reflect/KFunction3;", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/KFunction;", "onCancellationChannelResultImplDoNotCall", "context", "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "bindCancellationFun", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "onCancellationImplDoNotCall", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EncodeExceptionErrorType<E> implements Encoder<E> {
    private static char INotificationSideChannel;
    private static char INotificationSideChannelStub;
    private static char INotificationSideChannelStubProxy;
    private static int MediaBrowserCompat;
    static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f133a;
    private static final /* synthetic */ AtomicReferenceFieldUpdater asBinder;
    private static final /* synthetic */ AtomicReferenceFieldUpdater asInterface;
    static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private static final /* synthetic */ AtomicReferenceFieldUpdater cancel;
    private static final /* synthetic */ AtomicReferenceFieldUpdater d;
    private static final /* synthetic */ AtomicLongFieldUpdater g;
    private static char onTransact;
    public final Function1<E, Unit> TuitionPaymentFragmentbindingInflater1;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int cancelAll;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private final Function3<SystemTimeProvider<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> notify;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final byte[] $$c = {7, 15, 25, 25};
    private static final int $$f = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 92, -72, 43, 31, 34, 0, 16, 9, -33, 47, -1, 19, 19, -7, 11, -23, 43, 25, -5, 8, 27, 5, 13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 138;
    private static final byte[] $$a = {51, -99, -8, -59, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 91;
    private static int RemoteActionCompatParcelizer = 0;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelDefault = 1;

    static final class TuitionPaymentFragmentbindingInflater1 implements getByteBuffer {
        final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final /* synthetic */ CancellableContinuationImpl<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.getByteBuffer
        public final void b(EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?> encoderImplMediaCodecCallbackExternalSyntheticLambda1, int i) {
            throw null;
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~(i7 | i8 | i5)) | (~(i | i4 | i5));
        int i10 = ~i5;
        int i11 = (~(i8 | i)) | (~(i8 | i10));
        int i12 = (~(i5 | i4)) | (~(i7 | i10));
        int i13 = i + i4 + i3 + ((-564018846) * i2) + (483938512 * i6);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i) + 752877568 + ((-1516524009) * i4) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i3) + (1390411776 * i2) + (452984832 * i6) + ((-1135738880) * i14);
        int i16 = ((i * 1456092922) - 824780772) + (i4 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i3 * 1456093799) + (i2 * 578355822) + (i6 * 1098359728) + (i14 * 1868693504);
        switch (i15 + (i16 * i16 * 2110914560)) {
            case 1:
                return b(objArr);
            case 2:
                EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
                int i17 = 2 % 2;
                int i18 = getInterfaceDescriptor + 11;
                INotificationSideChannelDefault = i18 % 128;
                int i19 = i18 % 2;
                boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType)), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
                int i20 = INotificationSideChannelDefault + 113;
                getInterfaceDescriptor = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 6:
                EncodeExceptionErrorType encodeExceptionErrorType2 = (EncodeExceptionErrorType) objArr[0];
                int i22 = 2 % 2;
                int i23 = getInterfaceDescriptor + 67;
                INotificationSideChannelDefault = i23 % 128;
                int i24 = i23 % 2;
                Throwable th = (Throwable) b.get(encodeExceptionErrorType2);
                if (th != null) {
                    return th;
                }
                ClosedReceiveChannelException closedReceiveChannelException = new ClosedReceiveChannelException("Channel was closed");
                int i25 = INotificationSideChannelDefault + 107;
                getInterfaceDescriptor = i25 % 128;
                int i26 = i25 % 2;
                return closedReceiveChannelException;
            case 7:
                return a(objArr);
            case 8:
                return d(objArr);
            case 9:
                return g(objArr);
            default:
                return TuitionPaymentFragmentbindingInflater1(objArr);
        }
    }

    private static void c(short s, int i, byte b2, Object[] objArr) {
        int i2 = 13 - (b2 * 10);
        byte[] bArr = $$a;
        int i3 = (s * 3) + 97;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i)) - 5;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = (i3 + (-bArr[i2])) - 5;
            }
        }
    }

    private static void f(short s, int i, short s2, Object[] objArr) {
        int i2 = (s * 8) + 76;
        byte[] bArr = $$d;
        int i3 = i * 17;
        int i4 = s2 + 4;
        byte[] bArr2 = new byte[38 - i3];
        int i5 = 37 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i5 + i2) - 10;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4++;
                i2 = (i2 + bArr[i4]) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    public EncodeExceptionErrorType(int i, Function1<? super E, Unit> function1) {
        Function3<SystemTimeProvider<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> function3;
        this.cancelAll = i;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Invalid channel capacity: ");
            sb.append(i);
            sb.append(", should be >=0");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        this.bufferEnd$volatile = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.completedExpandBuffersAndPauseFlag$volatile = atomicLongFieldUpdater.get(this);
        requestKeyFrame requestkeyframe = new requestKeyFrame(0L, null, this, 3);
        this.sendSegment$volatile = requestkeyframe;
        this.receiveSegment$volatile = requestkeyframe;
        long j = atomicLongFieldUpdater.get(this);
        if (j == 0) {
            int i2 = 2 % 2;
            int i3 = INotificationSideChannelDefault + 25;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            requestkeyframe = EncodedData.INotificationSideChannel;
            Intrinsics.checkNotNull(requestkeyframe, "");
        } else {
            int i5 = getInterfaceDescriptor + 107;
            INotificationSideChannelDefault = i5 % 128;
            int i6 = i5 % 2;
            if (j == Long.MAX_VALUE) {
                int i7 = 2 % 2;
                int i8 = INotificationSideChannelDefault + 25;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                requestkeyframe = EncodedData.INotificationSideChannel;
                Intrinsics.checkNotNull(requestkeyframe, "");
            }
        }
        this.bufferEndSegment$volatile = requestkeyframe;
        if (function1 != 0) {
            function3 = new Function3() { // from class: EncodedDataImpl
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (SystemTimeProvider) obj, obj3);
                }
            };
            int i10 = 2 % 2;
        } else {
            function3 = null;
        }
        this.notify = function3;
        this._closeCause$volatile = EncodedData.notify;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EncodeExceptionErrorType(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 93;
            INotificationSideChannelDefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            function1 = null;
        }
        this(i, function1);
    }

    public static final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(EncodeExceptionErrorType encodeExceptionErrorType, requestKeyFrame requestkeyframe, int i, long j, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 97;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(requestkeyframe, i, j, obj);
            throw null;
        }
        Object objTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(requestkeyframe, i, j, obj);
        int i4 = getInterfaceDescriptor + 97;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return objTuitionPaymentFragmentbindingInflater1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        Object obj = objArr[2];
        CoroutineContext coroutineContext = (CoroutineContext) objArr[3];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 89;
        getInterfaceDescriptor = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Function1<E, Unit> function1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(function1);
            lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, obj, null);
            obj2.hashCode();
            throw null;
        }
        Function1<E, Unit> function2 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(function2);
        UndeliveredElementException undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function2, obj, null);
        if (undeliveredElementExceptionB != null) {
            int i3 = getInterfaceDescriptor + 33;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[EDGE_INSN: B:27:0x0086->B:43:0x00c8 BREAK  A[LOOP:0: B:3:0x0010->B:71:0x0010, LOOP_LABEL: LOOP:0: B:3:0x0010->B:71:0x0010]] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x002b A[SYNTHETIC] */
    private static /* synthetic */ requestKeyFrame TuitionPaymentFragmentbindingInflater1(EncodeExceptionErrorType encodeExceptionErrorType, long j, requestKeyFrame requestkeyframe) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j2;
        long j3;
        int i;
        Object objTuitionPaymentFragmentbindingInflater1;
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
        Object objTuitionPaymentFragmentbindingInflater2;
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cancel;
        Function2 function2 = (Function2) EncodedData.INotificationSideChannelStub();
        loop0: while (true) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestkeyframe, j, function2);
            if (!onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                int i4 = getInterfaceDescriptor + 49;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                while (true) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater.get(encodeExceptionErrorType);
                    if (encoderImplMediaCodecCallbackExternalSyntheticLambda1.f136a >= encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.f136a) {
                        break loop0;
                    }
                    int i6 = getInterfaceDescriptor + 73;
                    INotificationSideChannelDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 17 / 0;
                        if (!encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.a()) {
                            break;
                        }
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, encodeExceptionErrorType, encoderImplMediaCodecCallbackExternalSyntheticLambda1, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1)) {
                            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1, SupportMenu.CATEGORY_MASK) == encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                break loop0;
                            }
                            i = INotificationSideChannelDefault + 101;
                            getInterfaceDescriptor = i % 128;
                            if (i % 2 == 0) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 unused = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                            if (objTuitionPaymentFragmentbindingInflater1 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = null;
                            } else {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1;
                            }
                            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput != null) {
                                break loop0;
                            }
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1.asInterface();
                            break loop0;
                        }
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            objTuitionPaymentFragmentbindingInflater2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                            if (objTuitionPaymentFragmentbindingInflater2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 = null;
                            } else {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater2;
                            }
                            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 == null) {
                                i2 = INotificationSideChannelDefault + 11;
                                getInterfaceDescriptor = i2 % 128;
                                if (i2 % 2 != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                }
                            }
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                        }
                    } else {
                        if (!encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.a()) {
                            break;
                        }
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, encodeExceptionErrorType, encoderImplMediaCodecCallbackExternalSyntheticLambda1, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1)) {
                            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1, SupportMenu.CATEGORY_MASK) == encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                break loop0;
                            }
                            i = INotificationSideChannelDefault + 101;
                            getInterfaceDescriptor = i % 128;
                            if (i % 2 == 0) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 unused2 = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                            if (objTuitionPaymentFragmentbindingInflater1 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = null;
                            } else {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1;
                            }
                            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput != null) {
                                break loop0;
                            }
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1.asInterface();
                            break loop0;
                        }
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            objTuitionPaymentFragmentbindingInflater2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                            if (objTuitionPaymentFragmentbindingInflater2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 = null;
                            } else {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater2;
                            }
                            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 == null) {
                                i2 = INotificationSideChannelDefault + 11;
                                getInterfaceDescriptor = i2 % 128;
                                if (i2 % 2 != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                }
                            }
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (!(!onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType)), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
            if (requestkeyframe.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1) >= g.get(encodeExceptionErrorType)) {
                return null;
            }
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
            return null;
        }
        requestKeyFrame requestkeyframe2 = (requestKeyFrame) onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (requestkeyframe2.f136a <= j) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return requestkeyframe2;
        }
        long j4 = requestkeyframe2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        do {
            j2 = atomicLongFieldUpdater.get(encodeExceptionErrorType);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j4) {
                break;
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(encodeExceptionErrorType, j2, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j3, (int) (j2 >> 60))));
        if (requestkeyframe2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1) >= g.get(encodeExceptionErrorType)) {
            return null;
        }
        int i8 = INotificationSideChannelDefault + 113;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 == 0) {
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
            return null;
        }
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
        throw null;
    }

    public static final /* synthetic */ Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault1(EncodeExceptionErrorType encodeExceptionErrorType) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ClosedReceiveChannelException closedReceiveChannelException = (Throwable) b.get(encodeExceptionErrorType);
        if (closedReceiveChannelException == null) {
            closedReceiveChannelException = new ClosedReceiveChannelException("Channel was closed");
        }
        int i4 = INotificationSideChannelDefault + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return closedReceiveChannelException;
    }

    public static final /* synthetic */ Function3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Function1 function1, final Object obj) {
        int i = 2 % 2;
        Function3 function3 = new Function3() { // from class: throwIfClosed
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return EncodeExceptionErrorType.b(function1, obj, (CoroutineContext) obj4);
            }
        };
        int i2 = INotificationSideChannelDefault + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return function3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ requestKeyFrame TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncodeExceptionErrorType encodeExceptionErrorType, long j, requestKeyFrame requestkeyframe) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 111;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(j, requestkeyframe);
        int i4 = getInterfaceDescriptor + 13;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return requestkeyframeTuitionPaymentFragmentbindingInflater1;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncodeExceptionErrorType encodeExceptionErrorType, getByteBuffer getbytebuffer, requestKeyFrame requestkeyframe, int i) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannelDefault + 59;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getbytebuffer.b(requestkeyframe, i);
        int i5 = getInterfaceDescriptor + 67;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncodeExceptionErrorType encodeExceptionErrorType, Object obj, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Function1<E, Unit> function1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(function1);
        Object objB = EncodedDataImplExternalSyntheticLambda0.b(obj);
        Intrinsics.checkNotNull(objB);
        UndeliveredElementException undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, objB, null);
        if (undeliveredElementExceptionB != null) {
            int i4 = getInterfaceDescriptor + 119;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 == 0) {
                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
                throw null;
            }
            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ int b(EncodeExceptionErrorType encodeExceptionErrorType, requestKeyFrame requestkeyframe, int i, Object obj, long j, Object obj2, boolean z) {
        boolean z2;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = i * 2;
        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, obj);
        Object obj3 = null;
        if (!z) {
            int i4 = INotificationSideChannelDefault + 33;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 1;
            Object obj4 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i6);
            if (obj4 == null) {
                if (j < TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(encodeExceptionErrorType) || j < g.get(encodeExceptionErrorType) + ((long) encodeExceptionErrorType.cancelAll)) {
                    z3 = true;
                } else {
                    int i7 = getInterfaceDescriptor + 85;
                    INotificationSideChannelDefault = i7 % 128;
                    int i8 = i7 % 2;
                    z3 = false;
                }
                if (!(!z3)) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    AtomicReferenceArray atomicReferenceArray = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    while (!atomicReferenceArray.compareAndSet(i6, null, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                        if (atomicReferenceArray.get(i6) != null) {
                        }
                    }
                    return 1;
                }
                if (obj2 == null) {
                    return 3;
                }
                AtomicReferenceArray atomicReferenceArray2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                do {
                    if (atomicReferenceArray2.compareAndSet(i6, null, obj2)) {
                        int i9 = getInterfaceDescriptor + 5;
                        INotificationSideChannelDefault = i9 % 128;
                        if (i9 % 2 == 0) {
                            break;
                        }
                        return 2;
                    }
                } while (atomicReferenceArray2.get(i6) == null);
            } else if (obj4 instanceof getByteBuffer) {
                requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                if (encodeExceptionErrorType.b(obj4, obj)) {
                    int i10 = getInterfaceDescriptor + 113;
                    INotificationSideChannelDefault = i10 % 128;
                    if (i10 % 2 == 0) {
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i >>> 5, EncodedData.d);
                        return 1;
                    }
                    requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i6, EncodedData.d);
                    return 0;
                }
                if (requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(i6, EncodedData.f134a) == EncodedData.f134a) {
                    return 5;
                }
                EncodeExceptionErrorType<E> encodeExceptionErrorType2 = requestkeyframe.b;
                Intrinsics.checkNotNull(encodeExceptionErrorType2);
                encodeExceptionErrorType2.TuitionPaymentFragmentspecialinlinedviewModeldefault1((requestkeyframe.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i));
                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) != requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    return 5;
                }
                int i11 = getInterfaceDescriptor + 115;
                INotificationSideChannelDefault = i11 % 128;
                if (i11 % 2 != 0) {
                    requestkeyframe.asInterface();
                    return 5;
                }
                requestkeyframe.asInterface();
                obj3.hashCode();
                throw null;
            }
        }
        while (true) {
            int i12 = i3 + 1;
            Object obj5 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i12);
            if (obj5 == null) {
                if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(j)}, -15543992, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 15543993, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue() && !z) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    AtomicReferenceArray atomicReferenceArray3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    while (!atomicReferenceArray3.compareAndSet(i12, null, encoderImplMediaCodecCallbackExternalSyntheticLambda1)) {
                        if (atomicReferenceArray3.get(i12) != null) {
                        }
                    }
                    return 1;
                }
                if (z) {
                    int i13 = getInterfaceDescriptor + 45;
                    INotificationSideChannelDefault = i13 % 128;
                    int i14 = i13 % 2;
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda2 = EncodedData.asInterface;
                    AtomicReferenceArray atomicReferenceArray4 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    do {
                        if (atomicReferenceArray4.compareAndSet(i12, null, encoderImplMediaCodecCallbackExternalSyntheticLambda2)) {
                            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) == requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                requestkeyframe.asInterface();
                            }
                            int i15 = INotificationSideChannelDefault + 43;
                            getInterfaceDescriptor = i15 % 128;
                            if (i15 % 2 == 0) {
                                return 4;
                            }
                            throw null;
                        }
                    } while (atomicReferenceArray4.get(i12) == null);
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    AtomicReferenceArray atomicReferenceArray5 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    while (true) {
                        if (atomicReferenceArray5.compareAndSet(i12, null, obj2)) {
                            z2 = true;
                            break;
                        }
                        if (atomicReferenceArray5.get(i12) != null) {
                            z2 = false;
                            break;
                        }
                    }
                    if (!(!z2)) {
                        return 2;
                    }
                }
            } else {
                if (obj5 != EncodedData.cancelAll) {
                    if (obj5 == EncodedData.f134a) {
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                        return 5;
                    }
                    if (obj5 == EncodedData.onTransact) {
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                        return 5;
                    }
                    if (obj5 == EncodedData.INotificationSideChannelDefault()) {
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                        ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType)), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
                        return 4;
                    }
                    scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                    if (obj5 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw) {
                        obj5 = ((r8lambdaSlAnbggd9lEp59VusripYrYneuw) obj5).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    if (encodeExceptionErrorType.b(obj5, obj)) {
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i12, EncodedData.d);
                        return 0;
                    }
                    if (requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(i12, EncodedData.f134a) == EncodedData.f134a) {
                        return 5;
                    }
                    EncodeExceptionErrorType<E> encodeExceptionErrorType3 = requestkeyframe.b;
                    Intrinsics.checkNotNull(encodeExceptionErrorType3);
                    encodeExceptionErrorType3.TuitionPaymentFragmentspecialinlinedviewModeldefault1((requestkeyframe.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i));
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) != requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        return 5;
                    }
                    int i16 = getInterfaceDescriptor + 23;
                    INotificationSideChannelDefault = i16 % 128;
                    if (i16 % 2 != 0) {
                        requestkeyframe.asInterface();
                        return 5;
                    }
                    requestkeyframe.asInterface();
                    obj3.hashCode();
                    throw null;
                }
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda3 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                AtomicReferenceArray atomicReferenceArray6 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                do {
                    if (atomicReferenceArray6.compareAndSet(i12, obj5, encoderImplMediaCodecCallbackExternalSyntheticLambda3)) {
                        int i17 = INotificationSideChannelDefault;
                        int i18 = i17 + 61;
                        getInterfaceDescriptor = i18 % 128;
                        int i19 = i18 % 2;
                        int i20 = i17 + 95;
                        getInterfaceDescriptor = i20 % 128;
                        return i20 % 2 != 0 ? 0 : 1;
                    }
                } while (atomicReferenceArray6.get(i12) == obj5);
            }
        }
    }

    public static final /* synthetic */ Object b(EncodeExceptionErrorType encodeExceptionErrorType, Continuation continuation) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3((requestKeyFrame) null, 0, 0L, continuation);
        int i4 = INotificationSideChannelDefault + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i3 = $11 + 59;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = i6;
                int i8 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) INotificationSideChannelStubProxy) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(INotificationSideChannelStub);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47773);
                        int iIndexOf = 468 - TextUtils.indexOf("", "");
                        int iIndexOf2 = 13 - TextUtils.indexOf("", "");
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iIndexOf, iIndexOf2, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) INotificationSideChannel) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47773), Process.getGidForName("") + 469, KeyEvent.getDeadChar(0, 0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i7 + 1;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2323, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i10 = $10 + 67;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 % 3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bc  */
    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2) {
        long j;
        requestKeyFrame requestkeyframe;
        requestKeyFrame requestkeyframe2;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        long j2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this);
        long j3 = 1152921504606846975L;
        if (!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(j2), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
            if (!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(j2 & 1152921504606846975L)}, -15543992, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 15543993, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                int i4 = INotificationSideChannelDefault + 1;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.asInterface;
        requestKeyFrame requestkeyframe3 = (requestKeyFrame) cancel.get(this);
        while (true) {
            long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndIncrement(this);
            j = andIncrement & j3;
            boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(andIncrement), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
            long j4 = j / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = (int) (j % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (requestkeyframe3.f136a != j4) {
                requestKeyFrame requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(this, j4, requestkeyframe3);
                if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                    requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                } else if (zBooleanValue) {
                    EncodedDataImplExternalSyntheticLambda0.Companion companion2 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                    return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                }
            } else {
                requestkeyframe = requestkeyframe3;
            }
            requestkeyframe2 = requestkeyframe;
            int iB = b(this, requestkeyframe, i6, e2, j, encoderImplMediaCodecCallbackExternalSyntheticLambda0, zBooleanValue);
            if (iB == 0) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
            }
            if (iB == 1) {
                EncodedDataImplExternalSyntheticLambda0.Companion companion4 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
            }
            int i7 = INotificationSideChannelDefault;
            int i8 = i7 + 83;
            int i9 = i8 % 128;
            getInterfaceDescriptor = i9;
            int i10 = i8 % 2;
            if (iB == 2) {
                if (!zBooleanValue) {
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe2) == requestkeyframe2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        requestkeyframe2.asInterface();
                    }
                    EncodedDataImplExternalSyntheticLambda0.Companion companion5 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                    return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                int i11 = i7 + 123;
                getInterfaceDescriptor = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 71 / 0;
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe2) == requestkeyframe2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        requestkeyframe2.asInterface();
                    }
                } else if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe2) == requestkeyframe2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    requestkeyframe2.asInterface();
                }
                EncodedDataImplExternalSyntheticLambda0.Companion companion6 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
            }
            if (iB == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            int i13 = i9 + 123;
            INotificationSideChannelDefault = i13 % 128;
            if (i13 % 2 == 0) {
                if (iB == 5) {
                    break;
                }
                if (iB == 5) {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                }
                requestkeyframe3 = requestkeyframe2;
                j3 = 1152921504606846975L;
            } else {
                if (iB == 4) {
                    break;
                }
                if (iB == 5) {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                }
                requestkeyframe3 = requestkeyframe2;
                j3 = 1152921504606846975L;
            }
        }
        if (j < g.get(this)) {
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
        }
        EncodedDataImplExternalSyntheticLambda0.Companion companion7 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
        return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162 A[EDGE_INSN: B:66:0x0162->B:46:0x0162 BREAK  A[LOOP:0: B:3:0x0018->B:71:0x0018], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0162 A[EDGE_INSN: B:67:0x0162->B:46:0x0162 BREAK  A[LOOP:0: B:3:0x0018->B:71:0x0018], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x011b A[SYNTHETIC] */
    protected final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2) {
        boolean zBooleanValue;
        int i;
        requestKeyFrame requestkeyframe;
        requestKeyFrame requestkeyframe2;
        int i2;
        int i3;
        int i4;
        requestKeyFrame requestkeyframe3;
        int i5 = 2 % 2;
        int i6 = getInterfaceDescriptor + 97;
        INotificationSideChannelDefault = i6 % 128;
        int i7 = i6 % 2;
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        requestKeyFrame requestkeyframe4 = (requestKeyFrame) cancel.get(this);
        while (true) {
            long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            Object[] objArr = {this, Long.valueOf(andIncrement), false};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
            long j2 = j / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            i = (int) (j % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (requestkeyframe4.f136a != j2) {
                requestKeyFrame requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(this, j2, requestkeyframe4);
                if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                    requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                } else if (zBooleanValue) {
                    int i8 = INotificationSideChannelDefault + 5;
                    getInterfaceDescriptor = i8 % 128;
                    if (i8 % 2 == 0) {
                        EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                    }
                    EncodedDataImplExternalSyntheticLambda0.Companion companion2 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                    throw null;
                }
            } else {
                requestkeyframe = requestkeyframe4;
            }
            requestkeyframe2 = requestkeyframe;
            int iB = b(this, requestkeyframe, i, e2, j, encoderImplMediaCodecCallbackExternalSyntheticLambda0, zBooleanValue);
            if (iB == 0) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
            }
            int i9 = INotificationSideChannelDefault;
            int i10 = i9 + 41;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 != 0) {
                if (iB == 1) {
                    EncodedDataImplExternalSyntheticLambda0.Companion companion4 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                    return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
                }
                i2 = i9 + 63;
                i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                if (i2 % 2 != 0) {
                    if (iB == 5) {
                        break;
                    }
                    i4 = i9 + 109;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion5 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    } else {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion6 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    }
                } else {
                    if (iB == 2) {
                        break;
                    }
                    i4 = i9 + 109;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion7 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault6, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    } else {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion8 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault7, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    }
                }
            } else {
                if (iB == 1) {
                    EncodedDataImplExternalSyntheticLambda0.Companion companion9 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                    return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
                }
                i2 = i9 + 63;
                i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                if (i2 % 2 != 0) {
                    if (iB == 5) {
                        break;
                        break;
                    }
                    i4 = i9 + 109;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion10 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault8, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    } else {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion11 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault9, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    }
                } else {
                    if (iB == 2) {
                        break;
                        break;
                    }
                    i4 = i9 + 109;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 != 0) {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion12 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault10, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    } else {
                        if (iB == 3) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (iB != 4) {
                            if (j < g.get(this)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                            }
                            EncodedDataImplExternalSyntheticLambda0.Companion companion13 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault11, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                        }
                        if (iB == 5) {
                            requestkeyframe3 = requestkeyframe2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        } else {
                            requestkeyframe3 = requestkeyframe2;
                        }
                        requestkeyframe4 = requestkeyframe3;
                    }
                }
            }
        }
        if (!zBooleanValue) {
            asBinder((requestkeyframe2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i));
            EncodedDataImplExternalSyntheticLambda0.Companion companion14 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
        }
        int i11 = i3 + 125;
        INotificationSideChannelDefault = i11 % 128;
        int i12 = i11 % 2;
        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe2) == requestkeyframe2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            requestkeyframe2.asInterface();
        }
        EncodedDataImplExternalSyntheticLambda0.Companion companion15 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault12, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        if (jLongValue < TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(encodeExceptionErrorType) || jLongValue < g.get(encodeExceptionErrorType) + ((long) encodeExceptionErrorType.cancelAll)) {
            return true;
        }
        int i2 = getInterfaceDescriptor + 9;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private final boolean b(Object obj, E e2) {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        if (obj instanceof SystemTimeProvider) {
            boolean zTuitionPaymentFragmentbindingInflater1 = ((SystemTimeProvider) obj).TuitionPaymentFragmentbindingInflater1(this, e2);
            int i2 = getInterfaceDescriptor + 13;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return zTuitionPaymentFragmentbindingInflater1;
            }
            throw null;
        }
        if (obj instanceof EncoderCallback1) {
            Intrinsics.checkNotNull(obj, "");
            CancellableContinuationImpl<EncodedDataImplExternalSyntheticLambda0<? extends E>> cancellableContinuationImpl = ((EncoderCallback1) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            boolean zTuitionPaymentFragmentbindingInflater2 = EncodedData.TuitionPaymentFragmentbindingInflater1(cancellableContinuationImpl, EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(EncodedDataImplExternalSyntheticLambda0.Companion.b(e2)), (Function3) (this.TuitionPaymentFragmentbindingInflater1 != null ? new BufferedChannel$bindCancellationFunResult$1(this) : null));
            int i3 = INotificationSideChannelDefault + 125;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return zTuitionPaymentFragmentbindingInflater2;
        }
        if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            if (!(obj instanceof MediaFormatMustNotUseFrameRateToFindEncoderQuirk)) {
                throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)).toString());
            }
            Intrinsics.checkNotNull(obj, "");
            return EncodedData.TuitionPaymentFragmentbindingInflater1((MediaFormatMustNotUseFrameRateToFindEncoderQuirk) obj, e2, (Function3) (this.TuitionPaymentFragmentbindingInflater1 != null ? asInterface() : null));
        }
        int i5 = INotificationSideChannelDefault + 37;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNull(obj, "");
            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
            int i6 = 74 / 0;
        } else {
            Intrinsics.checkNotNull(obj, "");
            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
        }
        int i7 = getInterfaceDescriptor + 27;
        INotificationSideChannelDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static /* synthetic */ <E> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(EncodeExceptionErrorType<E> encodeExceptionErrorType, Continuation<? super EncodedDataImplExternalSyntheticLambda0<? extends E>> continuation) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        requestKeyFrame<E> requestkeyframe;
        int i = 2 % 2;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            if ((bufferedChannel$receiveCatching$1.label & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label -= Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(encodeExceptionErrorType, continuation);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(encodeExceptionErrorType, continuation);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bufferedChannel$receiveCatching$2.label;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = getInterfaceDescriptor + 125;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            ResultKt.throwOnFailure(obj);
            return ((EncodedDataImplExternalSyntheticLambda0) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        ResultKt.throwOnFailure(obj);
        requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) asInterface.get(encodeExceptionErrorType);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj2 = null;
            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(atomicLongFieldUpdater.get(encodeExceptionErrorType)), Boolean.valueOf(z)}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                int i5 = INotificationSideChannelDefault + 21;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 == 0) {
                    EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                    return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) b.get(encodeExceptionErrorType));
                }
                EncodedDataImplExternalSyntheticLambda0.Companion companion2 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) b.get(encodeExceptionErrorType));
                obj2.hashCode();
                throw null;
            }
            long andIncrement = g.getAndIncrement(encodeExceptionErrorType);
            long j = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (requestkeyframe2.f136a != j) {
                requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(j, requestkeyframe2);
                if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                    requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                } else {
                    continue;
                }
            } else {
                requestkeyframe = requestkeyframe2;
            }
            requestKeyFrame<E> requestkeyframe3 = requestkeyframe;
            Object objTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(requestkeyframe, i6, andIncrement, (Object) null);
            if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.RemoteActionCompatParcelizer) {
                throw new IllegalStateException("unexpected".toString());
            }
            int i7 = INotificationSideChannelDefault + 57;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.asBinder) {
                if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.INotificationSideChannelStub) {
                    int i9 = getInterfaceDescriptor + 43;
                    INotificationSideChannelDefault = i9 % 128;
                    int i10 = i9 % 2;
                    bufferedChannel$receiveCatching$2.label = 1;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3((requestKeyFrame) requestkeyframe3, i6, andIncrement, (Continuation) bufferedChannel$receiveCatching$2);
                    return objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended ? coroutine_suspended : objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                Object objB = EncodedDataImplExternalSyntheticLambda0.Companion.b(objTuitionPaymentFragmentbindingInflater1);
                int i11 = getInterfaceDescriptor + 99;
                INotificationSideChannelDefault = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 25 / 0;
                }
                return objB;
            }
            if (andIncrement < (atomicLongFieldUpdater.get(encodeExceptionErrorType) & 1152921504606846975L)) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                int i13 = INotificationSideChannelDefault + 99;
                getInterfaceDescriptor = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 / 5;
                }
            }
            requestkeyframe2 = requestkeyframe3;
            z = true;
        }
    }

    private void asBinder(long j) {
        UndeliveredElementException undeliveredElementExceptionB;
        int i = 2 % 2;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        requestKeyFrame<E> requestkeyframe = (requestKeyFrame) asInterface.get(this);
        int i2 = getInterfaceDescriptor + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.cancelAll) + j2, TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this))) {
                int i4 = getInterfaceDescriptor + 65;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = j2 / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i6 = (int) (j2 % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                Object obj = null;
                if (requestkeyframe.f136a != j3) {
                    int i7 = INotificationSideChannelDefault + 109;
                    getInterfaceDescriptor = i7 % 128;
                    if (i7 % 2 != 0) {
                        TuitionPaymentFragmentbindingInflater1(j3, requestkeyframe);
                        obj.hashCode();
                        throw null;
                    }
                    requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(j3, requestkeyframe);
                    if (requestkeyframeTuitionPaymentFragmentbindingInflater1 == null) {
                        continue;
                    } else {
                        requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                    }
                }
                Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(requestkeyframe, i6, j2, (Object) null);
                if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.asBinder) {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                    Function1<E, Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
                    if (function1 != null && (undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, objTuitionPaymentFragmentbindingInflater1, null)) != null) {
                        throw undeliveredElementExceptionB;
                    }
                } else if (j2 < (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L)) {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object TuitionPaymentFragmentbindingInflater1(requestKeyFrame<E> requestkeyframe, int i, long j, Object obj) {
        int i2 = 2 % 2;
        int i3 = i * 2;
        int i4 = i3 + 1;
        Object obj2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i4);
        if (obj2 == null) {
            if (j >= (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return EncodedData.INotificationSideChannelStub;
                }
                AtomicReferenceArray atomicReferenceArray = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                while (!atomicReferenceArray.compareAndSet(i4, obj2, obj)) {
                    if (atomicReferenceArray.get(i4) != obj2) {
                        int i5 = INotificationSideChannelDefault + 125;
                        getInterfaceDescriptor = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 2 / 2;
                        }
                    }
                }
                cancelAll();
                return EncodedData.RemoteActionCompatParcelizer;
            }
        } else if (obj2 == EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.d;
            AtomicReferenceArray atomicReferenceArray2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            while (!atomicReferenceArray2.compareAndSet(i4, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                if (atomicReferenceArray2.get(i4) != obj2) {
                }
            }
            int i7 = getInterfaceDescriptor;
            int i8 = i7 + 47;
            INotificationSideChannelDefault = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 97;
            INotificationSideChannelDefault = i10 % 128;
            int i11 = i10 % 2;
            cancelAll();
            Object obj3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i3);
            requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
            return obj3;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(requestkeyframe, i, j, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(requestKeyFrame<E> requestkeyframe, int i, long j, Object obj) {
        int i2 = 2 % 2;
        while (true) {
            int i3 = i * 2;
            int i4 = i3 + 1;
            Object obj2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i4);
            boolean z = true;
            if (obj2 == null || obj2 == EncodedData.cancelAll) {
                if (j < (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L)) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.onTransact;
                    AtomicReferenceArray atomicReferenceArray = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    do {
                        if (!(!atomicReferenceArray.compareAndSet(i4, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0))) {
                            cancelAll();
                            return EncodedData.asBinder;
                        }
                    } while (atomicReferenceArray.get(i4) == obj2);
                } else {
                    if (obj == null) {
                        return EncodedData.INotificationSideChannelStub;
                    }
                    AtomicReferenceArray atomicReferenceArray2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i5 = INotificationSideChannelDefault + 111;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                    while (!atomicReferenceArray2.compareAndSet(i4, obj2, obj)) {
                        if (atomicReferenceArray2.get(i4) != obj2) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        cancelAll();
                        return EncodedData.RemoteActionCompatParcelizer;
                    }
                }
            } else if (obj2 == EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = EncodedData.d;
                AtomicReferenceArray atomicReferenceArray3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                do {
                    if (atomicReferenceArray3.compareAndSet(i4, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda1)) {
                        int i7 = INotificationSideChannelDefault;
                        int i8 = i7 + 51;
                        getInterfaceDescriptor = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = i7 + 15;
                        getInterfaceDescriptor = i10 % 128;
                        if (i10 % 2 != 0) {
                            cancelAll();
                            Object obj3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i << 4);
                            requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i << 2, null);
                            return obj3;
                        }
                        cancelAll();
                        Object obj4 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i3);
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                        return obj4;
                    }
                } while (atomicReferenceArray3.get(i4) == obj2);
            } else {
                if (obj2 == EncodedData.asInterface) {
                    int i11 = INotificationSideChannelDefault + 81;
                    getInterfaceDescriptor = i11 % 128;
                    int i12 = i11 % 2;
                    return EncodedData.asBinder;
                }
                if (obj2 == EncodedData.onTransact) {
                    int i13 = getInterfaceDescriptor + 65;
                    INotificationSideChannelDefault = i13 % 128;
                    if (i13 % 2 != 0) {
                        return EncodedData.asBinder;
                    }
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 unused = EncodedData.asBinder;
                    throw null;
                }
                if (obj2 == EncodedData.INotificationSideChannelDefault()) {
                    cancelAll();
                    return EncodedData.asBinder;
                }
                if (obj2 != EncodedData.INotificationSideChannelStubProxy) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda2 = EncodedData.INotificationSideChannelDefault;
                    AtomicReferenceArray atomicReferenceArray4 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    do {
                        if (atomicReferenceArray4.compareAndSet(i4, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda2)) {
                            int i14 = getInterfaceDescriptor + 119;
                            INotificationSideChannelDefault = i14 % 128;
                            if (i14 % 2 == 0) {
                                break;
                            }
                            boolean z2 = obj2 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw;
                            if (z2) {
                                obj2 = ((r8lambdaSlAnbggd9lEp59VusripYrYneuw) obj2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            }
                            if (!(!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, obj2, requestkeyframe, Integer.valueOf(i)}, 1464886202, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1464886193, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue())) {
                                requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i4, EncodedData.d);
                                cancelAll();
                                Object obj5 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i3);
                                requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i3, null);
                                return obj5;
                            }
                            requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i4, EncodedData.asInterface);
                            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) == requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                int i15 = INotificationSideChannelDefault + 125;
                                getInterfaceDescriptor = i15 % 128;
                                int i16 = i15 % 2;
                                requestkeyframe.asInterface();
                            }
                            if (z2) {
                                cancelAll();
                            }
                            return EncodedData.asBinder;
                        }
                    } while (atomicReferenceArray4.get(i4) == obj2);
                } else {
                    continue;
                }
            }
        }
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        Object obj = objArr[1];
        requestKeyFrame requestkeyframe = (requestKeyFrame) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 69;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if (obj instanceof MediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            int i5 = i2 + 31;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNull(obj, "");
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1((MediaFormatMustNotUseFrameRateToFindEncoderQuirk) obj, Unit.INSTANCE);
            int i7 = getInterfaceDescriptor + 87;
            INotificationSideChannelDefault = i7 % 128;
            int i8 = i7 % 2;
            return Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (!(obj instanceof SystemTimeProvider)) {
            if (obj instanceof TuitionPaymentFragmentbindingInflater1) {
                return Boolean.valueOf(EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((TuitionPaymentFragmentbindingInflater1) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1, Boolean.TRUE));
            }
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)).toString());
        }
        Intrinsics.checkNotNull(obj, "");
        TrySelectDetailedResult trySelectDetailedResultTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isSizeSupportedAllowSwapping.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((TimeProvider) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3(encodeExceptionErrorType, Unit.INSTANCE));
        if (trySelectDetailedResultTuitionPaymentFragmentspecialinlinedviewModeldefault3 == TrySelectDetailedResult.REREGISTER) {
            int i9 = INotificationSideChannelDefault + 57;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(iIntValue * 2, null);
        }
        if (trySelectDetailedResultTuitionPaymentFragmentspecialinlinedviewModeldefault3 != TrySelectDetailedResult.SUCCESSFUL) {
            return false;
        }
        int i11 = getInterfaceDescriptor + 75;
        INotificationSideChannelDefault = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d3 A[EDGE_INSN: B:108:0x02d3->B:114:0x02e5 BREAK  A[LOOP:4: B:89:0x0247->B:173:0x0247]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:144:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e5 A[EDGE_INSN: B:169:0x02e5->B:114:0x02e5 BREAK  A[LOOP:4: B:89:0x0247->B:173:0x0247], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0276  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelAll() {
        Object obj;
        r8lambdaSlAnbggd9lEp59VusripYrYneuw r8lambdaslanbggd9lep59vusripyryneuw;
        AtomicReferenceArray atomicReferenceArray;
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0;
        AtomicReferenceArray atomicReferenceArray2;
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda1;
        AtomicReferenceArray atomicReferenceArray3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Function2 function2;
        boolean z;
        boolean z2;
        int i = 2 % 2;
        long j = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            return;
        }
        requestKeyFrame requestkeyframe = (requestKeyFrame) asBinder.get(this);
        while (true) {
            long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndIncrement(this);
            long j2 = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = null;
            if ((TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L) <= andIncrement) {
                if (requestkeyframe.f136a < j2) {
                    Object objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe);
                    if ((objTuitionPaymentFragmentbindingInflater1 != lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1 : null) != null) {
                        int i2 = INotificationSideChannelDefault + 49;
                        getInterfaceDescriptor = i2 % 128;
                        if (i2 % 2 != 0) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2, requestkeyframe);
                            int i3 = 25 / 0;
                        } else {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2, requestkeyframe);
                        }
                    }
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                return;
            }
            if (requestkeyframe.f136a != j2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
                Function2 function3 = (Function2) EncodedData.INotificationSideChannelStub();
                while (true) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestkeyframe, j2, function3);
                    if (onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                        break;
                    }
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    while (true) {
                        EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda2 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater.get(this);
                        function2 = function3;
                        if (encoderImplMediaCodecCallbackExternalSyntheticLambda2.f136a >= encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.f136a) {
                            break;
                        }
                        if (encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.a()) {
                            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, encoderImplMediaCodecCallbackExternalSyntheticLambda2, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1)) {
                                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda2, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                    break;
                                }
                                Object objTuitionPaymentFragmentbindingInflater2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda2);
                                if ((objTuitionPaymentFragmentbindingInflater2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater2) == null) {
                                    break;
                                }
                                int i4 = INotificationSideChannelDefault + 117;
                                int i5 = i4 % 128;
                                getInterfaceDescriptor = i5;
                                int i6 = i4 % 2;
                                int i7 = i5 + 55;
                                INotificationSideChannelDefault = i7 % 128;
                                int i8 = i7 % 2;
                                encoderImplMediaCodecCallbackExternalSyntheticLambda2.asInterface();
                                break;
                            }
                            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                z = true;
                                z2 = false;
                            } else {
                                Object objTuitionPaymentFragmentbindingInflater3 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                                if ((objTuitionPaymentFragmentbindingInflater3 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater3) == null) {
                                    z = true;
                                    z2 = false;
                                } else {
                                    z = true;
                                    z2 = true;
                                }
                            }
                            if ((!z2) != z) {
                                int i9 = getInterfaceDescriptor + 11;
                                INotificationSideChannelDefault = i9 % 128;
                                if (i9 % 2 == 0) {
                                    encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                                    throw null;
                                }
                                encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                            }
                            function3 = function2;
                        }
                    }
                    function3 = function2;
                }
                if (onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this)), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2, requestkeyframe);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                } else {
                    requestKeyFrame requestkeyframe2 = (requestKeyFrame) onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (requestkeyframe2.f136a > j2) {
                        int i10 = INotificationSideChannelDefault + 125;
                        getInterfaceDescriptor = i10 % 128;
                        int i11 = i10 % 2;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3.compareAndSet(this, andIncrement + 1, ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * requestkeyframe2.f136a)) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2((requestkeyframe2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) - andIncrement);
                        } else {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                        }
                    } else {
                        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = requestkeyframe2;
                    }
                }
                if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput != null) {
                    requestkeyframe = lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
                } else {
                    continue;
                }
            }
            int i12 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i13 = (i12 * 2) + 1;
            Object obj2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i13);
            if (!(obj2 instanceof getByteBuffer) || andIncrement < g.get(this)) {
                while (true) {
                    obj = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i13);
                    if (obj instanceof getByteBuffer) {
                        if (andIncrement < g.get(this)) {
                            r8lambdaslanbggd9lep59vusripyryneuw = new r8lambdaSlAnbggd9lEp59VusripYrYneuw((getByteBuffer) obj);
                            atomicReferenceArray = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            do {
                                if (atomicReferenceArray.compareAndSet(i13, obj, r8lambdaslanbggd9lep59vusripyryneuw)) {
                                    int i14 = INotificationSideChannelDefault + 1;
                                    getInterfaceDescriptor = i14 % 128;
                                    int i15 = i14 % 2;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                    return;
                                }
                            } while (atomicReferenceArray.get(i13) == obj);
                        } else {
                            encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.INotificationSideChannelStubProxy;
                            atomicReferenceArray2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            do {
                                if (atomicReferenceArray2.compareAndSet(i13, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                                    if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, obj, requestkeyframe, Integer.valueOf(i12)}, 1464886202, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1464886193, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i13, EncodedData.asInterface);
                                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) == requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                            break;
                                        }
                                        requestkeyframe.asInterface();
                                        break;
                                    }
                                    requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i13, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                    return;
                                }
                            } while (atomicReferenceArray2.get(i13) == obj);
                        }
                    } else {
                        if (obj == EncodedData.asInterface) {
                            break;
                        }
                        if (obj == null) {
                            if (obj == EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && obj != EncodedData.onTransact && obj != EncodedData.d) {
                                int i16 = getInterfaceDescriptor + 49;
                                INotificationSideChannelDefault = i16 % 128;
                                int i17 = i16 % 2;
                                if (obj != EncodedData.f134a && obj != EncodedData.INotificationSideChannelDefault()) {
                                    if (obj != EncodedData.INotificationSideChannelDefault) {
                                        throw new IllegalStateException("Unexpected cell state: ".concat(String.valueOf(obj)).toString());
                                    }
                                }
                            }
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                            return;
                        }
                        int i18 = getInterfaceDescriptor + 7;
                        INotificationSideChannelDefault = i18 % 128;
                        int i19 = i18 % 2;
                        encoderImplMediaCodecCallbackExternalSyntheticLambda1 = EncodedData.cancelAll;
                        atomicReferenceArray3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        do {
                            if (!atomicReferenceArray3.compareAndSet(i13, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda1)) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                return;
                            }
                        } while (atomicReferenceArray3.get(i13) == obj);
                    }
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
            } else {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda3 = EncodedData.INotificationSideChannelStubProxy;
                AtomicReferenceArray atomicReferenceArray4 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i20 = INotificationSideChannelDefault + 25;
                getInterfaceDescriptor = i20 % 128;
                int i21 = i20 % 2;
                while (true) {
                    if (atomicReferenceArray4.compareAndSet(i13, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda3)) {
                        if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, obj2, requestkeyframe, Integer.valueOf(i12)}, 1464886202, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1464886193, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                            requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i13, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                            return;
                        }
                        requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i13, EncodedData.asInterface);
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) == requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            int i22 = getInterfaceDescriptor + 75;
                            INotificationSideChannelDefault = i22 % 128;
                            int i23 = i22 % 2;
                            requestkeyframe.asInterface();
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                    } else if (atomicReferenceArray4.get(i13) != obj2) {
                        while (true) {
                            obj = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i13);
                            if (obj instanceof getByteBuffer) {
                                if (andIncrement < g.get(this)) {
                                    r8lambdaslanbggd9lep59vusripyryneuw = new r8lambdaSlAnbggd9lEp59VusripYrYneuw((getByteBuffer) obj);
                                    atomicReferenceArray = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    do {
                                        if (atomicReferenceArray.compareAndSet(i13, obj, r8lambdaslanbggd9lep59vusripyryneuw)) {
                                            int i110 = INotificationSideChannelDefault + 1;
                                            getInterfaceDescriptor = i110 % 128;
                                            int i111 = i110 % 2;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                            return;
                                        }
                                    } while (atomicReferenceArray.get(i13) == obj);
                                } else {
                                    encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.INotificationSideChannelStubProxy;
                                    atomicReferenceArray2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    do {
                                        if (atomicReferenceArray2.compareAndSet(i13, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                                            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, obj, requestkeyframe, Integer.valueOf(i12)}, 1464886202, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1464886193, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                                                requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i13, EncodedData.asInterface);
                                                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe) == requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                                    break;
                                                }
                                                requestkeyframe.asInterface();
                                                break;
                                            }
                                            requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i13, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                            return;
                                        }
                                    } while (atomicReferenceArray2.get(i13) == obj);
                                }
                            } else {
                                if (obj == EncodedData.asInterface) {
                                    break;
                                    break;
                                }
                                if (obj == null) {
                                    if (obj == EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    }
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                    return;
                                }
                                int i112 = getInterfaceDescriptor + 7;
                                INotificationSideChannelDefault = i112 % 128;
                                int i113 = i112 % 2;
                                encoderImplMediaCodecCallbackExternalSyntheticLambda1 = EncodedData.cancelAll;
                                atomicReferenceArray3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                do {
                                    if (!atomicReferenceArray3.compareAndSet(i13, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda1)) {
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                                        return;
                                    }
                                } while (atomicReferenceArray3.get(i13) == obj);
                            }
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(1L);
                    }
                }
            }
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0 ? (f133a.addAndGet(this, j) & SieveCacheKt.NodeVisitedBit) != 0 : f133a.addAndGet(this, j) - SieveCacheKt.NodeVisitedBit != 0) {
            while ((f133a.get(this) & SieveCacheKt.NodeVisitedBit) != 0) {
            }
        }
        int i3 = getInterfaceDescriptor + 105;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
        int i;
        int i2;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        long j3;
        int i3 = 2 % 2;
        long j4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
        if (j4 != 0) {
            int i4 = getInterfaceDescriptor + 5;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
            if (j4 != Long.MAX_VALUE) {
                while (TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this) <= j) {
                }
                int i6 = getInterfaceDescriptor + 39;
                INotificationSideChannelDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    i = EncodedData.g;
                    i2 = 1;
                } else {
                    i = EncodedData.g;
                    i2 = 0;
                }
                while (i2 < i) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    long j5 = atomicLongFieldUpdater2.get(this);
                    if (j5 == (4611686018427387903L & f133a.get(this)) && j5 == atomicLongFieldUpdater2.get(this)) {
                        return;
                    } else {
                        i2++;
                    }
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater3 = f133a;
                do {
                    j2 = atomicLongFieldUpdater3.get(this);
                } while (!atomicLongFieldUpdater3.compareAndSet(this, j2, EncodedData.TuitionPaymentFragmentbindingInflater1(j2 & 4611686018427387903L, true)));
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    long j6 = atomicLongFieldUpdater4.get(this);
                    atomicLongFieldUpdater = f133a;
                    long j7 = atomicLongFieldUpdater.get(this);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z2 = (j7 & SieveCacheKt.NodeVisitedBit) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater4.get(this)) {
                        break;
                    }
                    if (z2) {
                        z = true;
                    } else {
                        int i7 = INotificationSideChannelDefault + 101;
                        getInterfaceDescriptor = i7 % 128;
                        int i8 = i7 % 2;
                        long jTuitionPaymentFragmentbindingInflater1 = EncodedData.TuitionPaymentFragmentbindingInflater1(j8, true);
                        if (i8 != 0) {
                            atomicLongFieldUpdater.compareAndSet(this, j7, jTuitionPaymentFragmentbindingInflater1);
                        } else {
                            z = true;
                            atomicLongFieldUpdater.compareAndSet(this, j7, jTuitionPaymentFragmentbindingInflater1);
                        }
                    }
                }
                int i9 = INotificationSideChannelDefault + 33;
                getInterfaceDescriptor = i9 % 128;
                int i10 = i9 % 2;
                do {
                    j3 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(this, j3, EncodedData.TuitionPaymentFragmentbindingInflater1(j3 & 4611686018427387903L, false)));
            }
        }
    }

    @Override // defpackage.EncoderSurfaceInput
    public final getEncoderInfo<E> a() {
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i2 = INotificationSideChannelDefault + 105;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getEncoderInfo<E>, getByteBuffer {
        private Object TuitionPaymentFragmentbindingInflater1 = EncodedData.cancel;
        private CancellableContinuationImpl<? super Boolean> b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // defpackage.getEncoderInfo
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Continuation<? super Boolean> continuation) throws Throwable {
            boolean z = true;
            if (this.TuitionPaymentFragmentbindingInflater1 == EncodedData.cancel || this.TuitionPaymentFragmentbindingInflater1 == EncodedData.INotificationSideChannelDefault()) {
                EncodeExceptionErrorType<E> encodeExceptionErrorType = EncodeExceptionErrorType.this;
                requestKeyFrame<E> requestkeyframe = (requestKeyFrame) EncodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1().get(encodeExceptionErrorType);
                while (!encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    long andIncrement = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3().getAndIncrement(encodeExceptionErrorType);
                    long j = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    if (requestkeyframe.f136a != j) {
                        requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(encodeExceptionErrorType, j, requestkeyframe);
                        if (requestkeyframeTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            continue;
                        } else {
                            requestkeyframe = requestkeyframeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        }
                    }
                    Object objTuitionPaymentFragmentbindingInflater1 = EncodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(encodeExceptionErrorType, requestkeyframe, i, andIncrement, null);
                    if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.RemoteActionCompatParcelizer) {
                        if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.asBinder) {
                            if (andIncrement < (EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType) & 1152921504606846975L)) {
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                            }
                        } else {
                            if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.INotificationSideChannelStub) {
                                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(requestkeyframe, i, andIncrement, continuation);
                            }
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                            this.TuitionPaymentFragmentbindingInflater1 = objTuitionPaymentFragmentbindingInflater1;
                        }
                    } else {
                        throw new IllegalStateException("unreachable".toString());
                    }
                }
                this.TuitionPaymentFragmentbindingInflater1 = EncodedData.INotificationSideChannelDefault();
                Throwable th = (Throwable) EncodeExceptionErrorType.b.get(EncodeExceptionErrorType.this);
                if (th != null) {
                    throw reachEndData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                }
                z = false;
            }
            return Boxing.boxBoolean(z);
        }

        private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(requestKeyFrame<E> requestkeyframe, int i, long j, Continuation<? super Boolean> continuation) {
            Boolean boolBoxBoolean;
            Function1<E, Unit> function1;
            EncodeExceptionErrorType<E> encodeExceptionErrorType = EncodeExceptionErrorType.this;
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(continuation));
            try {
                this.b = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentbindingInflater1 = EncodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(encodeExceptionErrorType, requestkeyframe, i, j, this);
                if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.RemoteActionCompatParcelizer) {
                    Function3 function3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    function3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.asBinder) {
                        if (j < (EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType) & 1152921504606846975L)) {
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                        }
                        requestKeyFrame requestkeyframe2 = (requestKeyFrame) EncodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1().get(encodeExceptionErrorType);
                        while (true) {
                            if (!encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                long andIncrement = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3().getAndIncrement(encodeExceptionErrorType);
                                long j2 = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i2 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                if (requestkeyframe2.f136a != j2) {
                                    requestKeyFrame requestkeyframeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(encodeExceptionErrorType, j2, requestkeyframe2);
                                    if (requestkeyframeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                        requestkeyframe2 = requestkeyframeTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    }
                                }
                                objTuitionPaymentFragmentbindingInflater1 = EncodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(encodeExceptionErrorType, requestkeyframe2, i2, andIncrement, this);
                                if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.RemoteActionCompatParcelizer) {
                                    if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.asBinder) {
                                        if (andIncrement < (EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType) & 1152921504606846975L)) {
                                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                        }
                                    } else {
                                        if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.INotificationSideChannelStub) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                        this.TuitionPaymentFragmentbindingInflater1 = objTuitionPaymentFragmentbindingInflater1;
                                        this.b = null;
                                        boolBoxBoolean = Boxing.boxBoolean(true);
                                        function1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
                                        if (function1 != null) {
                                            function3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, objTuitionPaymentFragmentbindingInflater1);
                                        }
                                        cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolBoxBoolean, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b, function3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    }
                                } else {
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this;
                                    EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(encodeExceptionErrorType, this, requestkeyframe2, i2);
                                }
                            } else {
                                CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.b;
                                Intrinsics.checkNotNull(cancellableContinuationImpl);
                                this.b = null;
                                this.TuitionPaymentFragmentbindingInflater1 = EncodedData.INotificationSideChannelDefault();
                                Throwable thTuitionPaymentFragmentbindingInflater1 = (Throwable) EncodeExceptionErrorType.b.get(EncodeExceptionErrorType.this);
                                if (thTuitionPaymentFragmentbindingInflater1 == null) {
                                    Result.Companion companion = Result.INSTANCE;
                                    cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(Boolean.FALSE));
                                } else {
                                    CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
                                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (cancellableContinuationImpl2 instanceof CoroutineStackFrame)) {
                                        thTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(thTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl2);
                                    }
                                    Result.Companion companion2 = Result.INSTANCE;
                                    cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(thTuitionPaymentFragmentbindingInflater1)));
                                }
                            }
                        }
                    } else {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                        this.TuitionPaymentFragmentbindingInflater1 = objTuitionPaymentFragmentbindingInflater1;
                        this.b = null;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                        function1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
                        if (function1 != null) {
                            function3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, objTuitionPaymentFragmentbindingInflater1);
                        }
                        cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolBoxBoolean, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b, function3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                } else {
                    EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(encodeExceptionErrorType, this, requestkeyframe, i);
                }
                Object result = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Throwable th) {
                cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
                throw th;
            }
        }

        @Override // defpackage.getByteBuffer
        public final void b(EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?> encoderImplMediaCodecCallbackExternalSyntheticLambda1, int i) throws Throwable {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.b;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.b(encoderImplMediaCodecCallbackExternalSyntheticLambda1, i);
            }
        }

        @Override // defpackage.getEncoderInfo
        public final E b() throws Throwable {
            E e2 = (E) this.TuitionPaymentFragmentbindingInflater1;
            if (e2 != EncodedData.cancel) {
                this.TuitionPaymentFragmentbindingInflater1 = EncodedData.cancel;
                if (e2 != EncodedData.INotificationSideChannelDefault()) {
                    return e2;
                }
                throw reachEndData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1((EncodeExceptionErrorType) EncodeExceptionErrorType.this));
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }

        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.b;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.b = null;
            this.TuitionPaymentFragmentbindingInflater1 = e2;
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            Function1<E, Unit> function1 = EncodeExceptionErrorType.this.TuitionPaymentFragmentbindingInflater1;
            return EncodedData.TuitionPaymentFragmentbindingInflater1(cancellableContinuationImpl2, Boolean.TRUE, function1 != null ? EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, e2) : null);
        }

        public final void TuitionPaymentFragmentbindingInflater1() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.b;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.b = null;
            this.TuitionPaymentFragmentbindingInflater1 = EncodedData.INotificationSideChannelDefault();
            Throwable thTuitionPaymentFragmentbindingInflater1 = (Throwable) EncodeExceptionErrorType.b.get(EncodeExceptionErrorType.this);
            if (thTuitionPaymentFragmentbindingInflater1 == null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(Boolean.FALSE));
                return;
            }
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (cancellableContinuationImpl2 instanceof CoroutineStackFrame)) {
                thTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(thTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl2);
            }
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(thTuitionPaymentFragmentbindingInflater1)));
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ClosedSendChannelException closedSendChannelException = (Throwable) b.get(encodeExceptionErrorType);
        if (closedSendChannelException == null) {
            closedSendChannelException = new ClosedSendChannelException("Channel was closed");
        }
        int i3 = INotificationSideChannelDefault + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return closedSendChannelException;
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final boolean a_(Throwable th) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, false);
        int i4 = INotificationSideChannelDefault + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return zTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.EncoderSurfaceInput
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CancellationException cancellationException) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 == null) {
            cancellationException2 = new CancellationException("Channel was cancelled");
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((Throwable) cancellationException2, true);
        int i4 = INotificationSideChannelDefault + 105;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th, boolean z) {
        long j;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 55;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (z) {
            int i4 = i2 + 109;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
            INotificationSideChannel();
        }
        boolean zM = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(b, this, EncodedData.notify, th);
        if (z) {
            int i6 = getInterfaceDescriptor + 87;
            INotificationSideChannelDefault = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            do {
                j = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1152921504606846975L & j, 3)));
        } else {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1270204088, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1270204096, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
        Object[] objArr = {this, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this)), false};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
        if (zM) {
            int i7 = getInterfaceDescriptor + 15;
            INotificationSideChannelDefault = i7 % 128;
            int i8 = i7 % 2;
            cancel();
            int i9 = getInterfaceDescriptor + 21;
            INotificationSideChannelDefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return zM;
    }

    private final void cancel() {
        Object obj;
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0;
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                int i2 = getInterfaceDescriptor + 83;
                INotificationSideChannelDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    EncoderImplMediaCodecCallbackExternalSyntheticLambda0 unused = EncodedData.b;
                    throw null;
                }
                encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.b;
                int i3 = getInterfaceDescriptor + 23;
                INotificationSideChannelDefault = i3 % 128;
                int i4 = i3 % 2;
            } else {
                encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda0));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke((Throwable) b.get(this));
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        INotificationSideChannelDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, encodeExceptionErrorType, null, function1);
            obj.hashCode();
            throw null;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, encodeExceptionErrorType, null, function1)) {
            return null;
        }
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(encodeExceptionErrorType);
            if (obj2 != EncodedData.b) {
                if (obj2 == EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj2)).toString());
            }
            int i3 = INotificationSideChannelDefault + 65;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(d, encodeExceptionErrorType, EncodedData.b, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        int i5 = INotificationSideChannelDefault + 55;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            function1.invoke((Throwable) b.get(encodeExceptionErrorType));
            return null;
        }
        function1.invoke((Throwable) b.get(encodeExceptionErrorType));
        int i6 = 58 / 0;
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        long j;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        int i = 2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        do {
            j = atomicLongFieldUpdater.get(encodeExceptionErrorType);
            int i2 = (int) (j >> 60);
            if (i2 == 0) {
                jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j & 1152921504606846975L, 2);
                int i3 = INotificationSideChannelDefault + 75;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
            } else {
                if (i2 != 1) {
                    return null;
                }
                int i5 = getInterfaceDescriptor + 123;
                INotificationSideChannelDefault = i5 % 128;
                jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 2 == 0 ? EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1152921504606846975L + j, 2) : EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(encodeExceptionErrorType, j, jTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        return null;
    }

    private final void INotificationSideChannel() {
        long j;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 95;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i2 + 25;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1152921504606846975L & j, 1)));
        int i6 = INotificationSideChannelDefault + 107;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final requestKeyFrame<E> TuitionPaymentFragmentbindingInflater1(long j) {
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault;
        int i;
        AtomicReferenceArray atomicReferenceArray;
        boolean z;
        long j2;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 89;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = asBinder.get(this);
        requestKeyFrame requestkeyframe = (requestKeyFrame) cancel.get(this);
        if (requestkeyframe.f136a > ((requestKeyFrame) obj).f136a) {
            obj = requestkeyframe;
        }
        requestKeyFrame requestkeyframe2 = (requestKeyFrame) asInterface.get(this);
        if (requestkeyframe2.f136a > ((requestKeyFrame) obj).f136a) {
            obj = requestkeyframe2;
        }
        requestKeyFrame<E> requestkeyframe3 = (requestKeyFrame) lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2((lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) obj);
        if (g()) {
            requestKeyFrame<E> requestkeyframe4 = requestkeyframe3;
            loop0: while (true) {
                int i5 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1;
                while (true) {
                    if (i5 >= 0) {
                        j2 = (requestkeyframe4.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i5);
                        if (j2 >= g.get(this)) {
                            while (true) {
                                int i6 = (i5 * 2) + 1;
                                Object obj2 = requestkeyframe4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i6);
                                if (obj2 != null && obj2 != EncodedData.cancelAll) {
                                    if (obj2 != EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                        break;
                                    }
                                    break loop0;
                                }
                                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault2 = EncodedData.INotificationSideChannelDefault();
                                AtomicReferenceArray atomicReferenceArray2 = requestkeyframe4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                while (true) {
                                    if (atomicReferenceArray2.compareAndSet(i6, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault2)) {
                                        int i7 = INotificationSideChannelDefault + 5;
                                        getInterfaceDescriptor = i7 % 128;
                                        int i8 = i7 % 2;
                                        z2 = true;
                                        break;
                                    }
                                    if (atomicReferenceArray2.get(i6) != obj2) {
                                        int i9 = getInterfaceDescriptor + 27;
                                        INotificationSideChannelDefault = i9 % 128;
                                        int i10 = i9 % 2;
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (!(!z2)) {
                                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe4) != requestkeyframe4.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                        break;
                                    }
                                    requestkeyframe4.asInterface();
                                    break;
                                }
                            }
                            i5--;
                        }
                    } else {
                        requestkeyframe4 = (requestKeyFrame) ((lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(requestkeyframe4));
                        if (requestkeyframe4 == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                asBinder(j2);
            }
        }
        lambdaonOutputFormatChanged5.TuitionPaymentFragmentbindingInflater1();
        Object obj3 = null;
        Object objTuitionPaymentFragmentbindingInflater1 = null;
        loop4: for (requestKeyFrame<E> requestkeyframe5 = requestkeyframe3; requestkeyframe5 != null; requestkeyframe5 = (requestKeyFrame) ((lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(requestkeyframe5))) {
            int i11 = INotificationSideChannelDefault + 123;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % 2;
            for (int i13 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1; i13 >= 0; i13--) {
                long j3 = i13;
                if ((requestkeyframe5.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + j3 < j) {
                    break loop4;
                }
                while (true) {
                    int i14 = (i13 * 2) + 1;
                    Object obj4 = requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i14);
                    if (obj4 == null || obj4 == EncodedData.cancelAll) {
                        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault3 = EncodedData.INotificationSideChannelDefault();
                        AtomicReferenceArray atomicReferenceArray3 = requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        do {
                            if (atomicReferenceArray3.compareAndSet(i14, obj4, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault3)) {
                                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe5) != requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                    break;
                                }
                                requestkeyframe5.asInterface();
                                break;
                            }
                        } while (atomicReferenceArray3.get(i14) == obj4);
                        int i15 = INotificationSideChannelDefault + 11;
                        getInterfaceDescriptor = i15 % 128;
                        int i16 = i15 % 2;
                    } else if (!(obj4 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw)) {
                        if (!(obj4 instanceof getByteBuffer)) {
                            break;
                        }
                        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault4 = EncodedData.INotificationSideChannelDefault();
                        AtomicReferenceArray atomicReferenceArray4 = requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i17 = INotificationSideChannelDefault + 51;
                        getInterfaceDescriptor = i17 % 128;
                        int i18 = i17 % 2;
                        while (true) {
                            if (atomicReferenceArray4.compareAndSet(i14, obj4, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault4)) {
                                z = true;
                                break;
                            }
                            if (atomicReferenceArray4.get(i14) != obj4) {
                                z = false;
                                break;
                            }
                        }
                        if (!(!z)) {
                            objTuitionPaymentFragmentbindingInflater1 = lambdaonOutputFormatChanged5.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentbindingInflater1, obj4);
                            EncodeExceptionErrorType<E> encodeExceptionErrorType = requestkeyframe5.b;
                            Intrinsics.checkNotNull(encodeExceptionErrorType);
                            encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1((requestkeyframe5.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + j3);
                            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe5) != requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                break;
                            }
                            int i19 = getInterfaceDescriptor + 73;
                            INotificationSideChannelDefault = i19 % 128;
                            if (i19 % 2 != 0) {
                                requestkeyframe5.asInterface();
                                break;
                            }
                            requestkeyframe5.asInterface();
                            throw null;
                        }
                    } else {
                        int i20 = getInterfaceDescriptor + 57;
                        INotificationSideChannelDefault = i20 % 128;
                        if (i20 % 2 == 0) {
                            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault5 = EncodedData.INotificationSideChannelDefault();
                            i = i13 - 2;
                            atomicReferenceArray = requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault = encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault5;
                        } else {
                            encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault = EncodedData.INotificationSideChannelDefault();
                            i = i14;
                            atomicReferenceArray = requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        }
                        int i21 = INotificationSideChannelDefault + 57;
                        getInterfaceDescriptor = i21 % 128;
                        int i22 = i21 % 2;
                        do {
                            if (atomicReferenceArray.compareAndSet(i, obj4, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault)) {
                                objTuitionPaymentFragmentbindingInflater1 = lambdaonOutputFormatChanged5.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentbindingInflater1, ((r8lambdaSlAnbggd9lEp59VusripYrYneuw) obj4).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                EncodeExceptionErrorType<E> encodeExceptionErrorType2 = requestkeyframe5.b;
                                Intrinsics.checkNotNull(encodeExceptionErrorType2);
                                encodeExceptionErrorType2.TuitionPaymentFragmentspecialinlinedviewModeldefault1((requestkeyframe5.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + j3);
                                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe5) != requestkeyframe5.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                    break;
                                }
                                int i23 = getInterfaceDescriptor + 15;
                                INotificationSideChannelDefault = i23 % 128;
                                if (i23 % 2 != 0) {
                                    requestkeyframe5.asInterface();
                                    break;
                                }
                                requestkeyframe5.asInterface();
                                obj3.hashCode();
                                throw null;
                            }
                        } while (atomicReferenceArray.get(i) == obj4);
                    }
                }
            }
        }
        if (objTuitionPaymentFragmentbindingInflater1 != null) {
            if (objTuitionPaymentFragmentbindingInflater1 instanceof ArrayList) {
                Intrinsics.checkNotNull(objTuitionPaymentFragmentbindingInflater1, "");
                ArrayList arrayList = (ArrayList) objTuitionPaymentFragmentbindingInflater1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b((getByteBuffer) arrayList.get(size), true);
                }
            } else {
                b((getByteBuffer) objTuitionPaymentFragmentbindingInflater1, true);
            }
        }
        return requestkeyframe3;
    }

    private final void b(getByteBuffer getbytebuffer, boolean z) {
        ClosedSendChannelException closedSendChannelException;
        int i;
        int i2 = 2 % 2;
        if (getbytebuffer instanceof TuitionPaymentFragmentbindingInflater1) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Boolean> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = ((TuitionPaymentFragmentbindingInflater1) getbytebuffer).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Result.Companion companion = Result.INSTANCE;
            Result.m8024constructorimpl(Boolean.FALSE);
            throw null;
        }
        if (!(getbytebuffer instanceof MediaFormatMustNotUseFrameRateToFindEncoderQuirk)) {
            if (getbytebuffer instanceof EncoderCallback1) {
                CancellableContinuationImpl<EncodedDataImplExternalSyntheticLambda0<? extends E>> cancellableContinuationImpl = ((EncoderCallback1) getbytebuffer).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Result.Companion companion2 = Result.INSTANCE;
                EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) b.get(this)))));
                return;
            }
            if (getbytebuffer instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) getbytebuffer).TuitionPaymentFragmentbindingInflater1();
                return;
            } else {
                if (!(getbytebuffer instanceof SystemTimeProvider)) {
                    throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(getbytebuffer)).toString());
                }
                ((SystemTimeProvider) getbytebuffer).TuitionPaymentFragmentbindingInflater1(this, EncodedData.INotificationSideChannelDefault());
                return;
            }
        }
        int i3 = getInterfaceDescriptor + 111;
        INotificationSideChannelDefault = i3 % 128;
        int i4 = i3 % 2;
        Continuation continuation = (Continuation) getbytebuffer;
        Result.Companion companion4 = Result.INSTANCE;
        if (!(!z)) {
            closedSendChannelException = (Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1420461955, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1420461961, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            i = INotificationSideChannelDefault + 75;
        } else {
            closedSendChannelException = (Throwable) b.get(this);
            if (closedSendChannelException == null) {
                closedSendChannelException = new ClosedSendChannelException("Channel was closed");
            }
            i = INotificationSideChannelDefault + 23;
        }
        getInterfaceDescriptor = i % 128;
        int i5 = i % 2;
        continuation.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(closedSendChannelException)));
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this)), true};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
        }
        Object[] objArr2 = {this, Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this)), true};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr2, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0285  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object a(Object[] objArr) {
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0;
        AtomicReferenceArray atomicReferenceArray;
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        int i = 1;
        long jLongValue = ((Number) objArr[1]).longValue();
        int i2 = 2;
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i3 = 2 % 2;
        int i4 = (int) (jLongValue >> 60);
        if (i4 == 0 || i4 == 1) {
            return false;
        }
        E e2 = null;
        if (i4 == 2) {
            encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(jLongValue & 1152921504606846975L);
            if (!zBooleanValue) {
                return true;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asInterface;
                requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = (requestKeyFrame) atomicReferenceFieldUpdater.get(encodeExceptionErrorType);
                long j = g.get(encodeExceptionErrorType);
                if ((TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType) & 1152921504606846975L) > j) {
                    long j2 = j / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (requestkeyframeTuitionPaymentFragmentbindingInflater1.f136a == j2 || (requestkeyframeTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(j2, requestkeyframeTuitionPaymentFragmentbindingInflater1)) != null) {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframeTuitionPaymentFragmentbindingInflater1, null);
                        int i5 = (int) (j % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        while (true) {
                            int i6 = (i5 * 2) + 1;
                            Object obj = requestkeyframeTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i6);
                            if (obj != null) {
                                int i7 = INotificationSideChannelDefault + 123;
                                getInterfaceDescriptor = i7 % 128;
                                int i8 = i7 % 2;
                                if (obj != EncodedData.cancelAll) {
                                    int i9 = getInterfaceDescriptor + 17;
                                    INotificationSideChannelDefault = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        throw null;
                                    }
                                    if (obj == EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                        break;
                                    }
                                    if (obj != EncodedData.asInterface && obj != EncodedData.INotificationSideChannelDefault()) {
                                        if (obj != EncodedData.d) {
                                            if (obj != EncodedData.onTransact) {
                                                if (obj == EncodedData.INotificationSideChannelStubProxy) {
                                                    break;
                                                }
                                                if (obj != EncodedData.INotificationSideChannelDefault) {
                                                    if (j == g.get(encodeExceptionErrorType)) {
                                                        break;
                                                    }
                                                } else {
                                                    int i10 = INotificationSideChannelDefault + 101;
                                                    getInterfaceDescriptor = i10 % 128;
                                                    int i11 = i10 % 2;
                                                }
                                            }
                                        } else {
                                            int i12 = getInterfaceDescriptor + 87;
                                            INotificationSideChannelDefault = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.onTransact;
                                atomicReferenceArray = requestkeyframeTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                do {
                                    if (atomicReferenceArray.compareAndSet(i6, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                                        encodeExceptionErrorType.cancelAll();
                                        break;
                                    }
                                } while (atomicReferenceArray.get(i6) == obj);
                            } else {
                                encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.onTransact;
                                atomicReferenceArray = requestkeyframeTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                do {
                                    if (atomicReferenceArray.compareAndSet(i6, obj, encoderImplMediaCodecCallbackExternalSyntheticLambda0)) {
                                        encodeExceptionErrorType.cancelAll();
                                        break;
                                    }
                                } while (atomicReferenceArray.get(i6) == obj);
                            }
                        }
                        g.compareAndSet(encodeExceptionErrorType, j, 1 + j);
                    } else {
                        int i13 = INotificationSideChannelDefault + 53;
                        getInterfaceDescriptor = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i14 = 54 / 0;
                            if (((requestKeyFrame) atomicReferenceFieldUpdater.get(encodeExceptionErrorType)).f136a < j2) {
                            }
                        } else if (((requestKeyFrame) atomicReferenceFieldUpdater.get(encodeExceptionErrorType)).f136a < j2) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (i4 != 3) {
            throw new IllegalStateException("unexpected close status: ".concat(String.valueOf(i4)).toString());
        }
        requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater2 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(jLongValue & 1152921504606846975L);
        Function1<E, Unit> function1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
        Object objTuitionPaymentFragmentbindingInflater1 = lambdaonOutputFormatChanged5.TuitionPaymentFragmentbindingInflater1();
        UndeliveredElementException undeliveredElementExceptionB = null;
        loop0: while (true) {
            int i15 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - i;
            while (i15 >= 0) {
                long j3 = (requestkeyframeTuitionPaymentFragmentbindingInflater2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i15);
                while (true) {
                    int i16 = i15 * 2;
                    int i17 = i16 + 1;
                    Object obj2 = requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i17);
                    if (obj2 == EncodedData.d) {
                        break loop0;
                    }
                    if (obj2 != EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        if (obj2 != EncodedData.cancelAll && obj2 != null) {
                            int i18 = INotificationSideChannelDefault + 49;
                            getInterfaceDescriptor = i18 % 128;
                            int i19 = i18 % i2;
                            if (!(obj2 instanceof getByteBuffer) && !(obj2 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw)) {
                                if (obj2 != EncodedData.INotificationSideChannelStubProxy && obj2 != EncodedData.INotificationSideChannelDefault) {
                                    if (obj2 != EncodedData.INotificationSideChannelStubProxy) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j3 < g.get(encodeExceptionErrorType)) {
                                    break loop0;
                                }
                                getByteBuffer getbytebuffer = obj2 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw ? ((r8lambdaSlAnbggd9lEp59VusripYrYneuw) obj2).TuitionPaymentFragmentspecialinlinedviewModeldefault2 : (getByteBuffer) obj2;
                                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault = EncodedData.INotificationSideChannelDefault();
                                AtomicReferenceArray atomicReferenceArray2 = requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                while (true) {
                                    if (atomicReferenceArray2.compareAndSet(i17, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault)) {
                                        int i20 = getInterfaceDescriptor + 23;
                                        INotificationSideChannelDefault = i20 % 128;
                                        if (i20 % i2 == 0) {
                                            int i21 = 76 / 0;
                                            if (function1 != null) {
                                                undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i16), undeliveredElementExceptionB);
                                            }
                                        } else if (function1 != null) {
                                            undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i16), undeliveredElementExceptionB);
                                        }
                                        objTuitionPaymentFragmentbindingInflater1 = lambdaonOutputFormatChanged5.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentbindingInflater1, getbytebuffer);
                                        requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i16, null);
                                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframeTuitionPaymentFragmentbindingInflater2) != requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                            break;
                                        }
                                        requestkeyframeTuitionPaymentFragmentbindingInflater2.asInterface();
                                        break;
                                    }
                                    if (atomicReferenceArray2.get(i17) != obj2) {
                                        break;
                                    }
                                    i2 = 2;
                                }
                                i2 = 2;
                            }
                        } else {
                            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault2 = EncodedData.INotificationSideChannelDefault();
                            AtomicReferenceArray atomicReferenceArray3 = requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            do {
                                if (atomicReferenceArray3.compareAndSet(i17, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault2)) {
                                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframeTuitionPaymentFragmentbindingInflater2) != requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                        break;
                                    }
                                    requestkeyframeTuitionPaymentFragmentbindingInflater2.asInterface();
                                    break;
                                }
                            } while (atomicReferenceArray3.get(i17) == obj2);
                            i2 = 2;
                        }
                    } else {
                        if (j3 < g.get(encodeExceptionErrorType)) {
                            break loop0;
                        }
                        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault3 = EncodedData.INotificationSideChannelDefault();
                        AtomicReferenceArray atomicReferenceArray4 = requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        while (true) {
                            if (atomicReferenceArray4.compareAndSet(i17, obj2, encoderImplMediaCodecCallbackExternalSyntheticLambda0INotificationSideChannelDefault3)) {
                                int i22 = INotificationSideChannelDefault + 71;
                                getInterfaceDescriptor = i22 % 128;
                                int i23 = i22 % i2;
                                if (function1 != null) {
                                    undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i16), undeliveredElementExceptionB);
                                    int i24 = INotificationSideChannelDefault + 117;
                                    getInterfaceDescriptor = i24 % 128;
                                    int i25 = i24 % i2;
                                }
                                requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(i16, e2);
                                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframeTuitionPaymentFragmentbindingInflater2) != requestkeyframeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                    break;
                                }
                                requestkeyframeTuitionPaymentFragmentbindingInflater2.asInterface();
                                break;
                            }
                            if (atomicReferenceArray4.get(i17) != obj2) {
                                break;
                            }
                            e2 = null;
                        }
                    }
                    e2 = null;
                }
                i15--;
                i2 = 2;
                e2 = null;
            }
            requestkeyframeTuitionPaymentFragmentbindingInflater2 = (requestKeyFrame) ((lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(requestkeyframeTuitionPaymentFragmentbindingInflater2));
            if (requestkeyframeTuitionPaymentFragmentbindingInflater2 == null) {
                break;
            }
            i = 1;
            i2 = 2;
            e2 = null;
        }
        if (objTuitionPaymentFragmentbindingInflater1 != null) {
            int i26 = INotificationSideChannelDefault + 13;
            getInterfaceDescriptor = i26 % 128;
            if (i26 % 2 != 0) {
                boolean z = objTuitionPaymentFragmentbindingInflater1 instanceof ArrayList;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            if (objTuitionPaymentFragmentbindingInflater1 instanceof ArrayList) {
                boolean z2 = false;
                Intrinsics.checkNotNull(objTuitionPaymentFragmentbindingInflater1, "");
                ArrayList arrayList = (ArrayList) objTuitionPaymentFragmentbindingInflater1;
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    encodeExceptionErrorType.b((getByteBuffer) arrayList.get(size), z2);
                    size--;
                    z2 = false;
                }
            } else {
                encodeExceptionErrorType.b((getByteBuffer) objTuitionPaymentFragmentbindingInflater1, false);
            }
        }
        if (undeliveredElementExceptionB == null) {
            return true;
        }
        throw undeliveredElementExceptionB;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01d2  */
    private final requestKeyFrame<E> TuitionPaymentFragmentbindingInflater1(long j, requestKeyFrame<E> requestkeyframe) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asInterface;
        Function2 function2 = (Function2) EncodedData.INotificationSideChannelStub();
        loop0: while (true) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestkeyframe, j, function2);
            if (onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                break;
            }
            EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            while (true) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater.get(this);
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1.f136a >= encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.f136a) {
                    break loop0;
                }
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.a()) {
                    int i2 = getInterfaceDescriptor + 51;
                    INotificationSideChannelDefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, encoderImplMediaCodecCallbackExternalSyntheticLambda1, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                        throw null;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, encoderImplMediaCodecCallbackExternalSyntheticLambda1, encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1)) {
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            break loop0;
                        }
                        Object objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                        if ((objTuitionPaymentFragmentbindingInflater1 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1) == null) {
                            break loop0;
                        }
                        int i3 = getInterfaceDescriptor + 47;
                        INotificationSideChannelDefault = i3 % 128;
                        int i4 = i3 % 2;
                        encoderImplMediaCodecCallbackExternalSyntheticLambda1.asInterface();
                        break loop0;
                    }
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, SupportMenu.CATEGORY_MASK) == encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        Object objTuitionPaymentFragmentbindingInflater2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1);
                        if ((objTuitionPaymentFragmentbindingInflater2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater2) != null) {
                            int i5 = getInterfaceDescriptor + 29;
                            INotificationSideChannelDefault = i5 % 128;
                            int i6 = i5 % 2;
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1.asInterface();
                        }
                    }
                }
            }
        }
        if (onOutputFormatChanged.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(atomicLongFieldUpdater.get(this)), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
            if (requestkeyframe.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1) < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                int i7 = INotificationSideChannelDefault + 35;
                getInterfaceDescriptor = i7 % 128;
                if (i7 % 2 != 0) {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                    int i8 = 57 / 0;
                } else {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                }
            }
            return null;
        }
        requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) onOutputFormatChanged.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (j2 != 0 && j2 != Long.MAX_VALUE && j <= atomicLongFieldUpdater2.get(this) / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = asBinder;
            while (true) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda2 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater2.get(this);
                requestKeyFrame<E> requestkeyframe3 = requestkeyframe2;
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda2.f136a >= requestkeyframe3.f136a || !requestkeyframe3.a()) {
                    break;
                }
                int i9 = getInterfaceDescriptor + 1;
                INotificationSideChannelDefault = i9 % 128;
                int i10 = i9 % 2;
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, encoderImplMediaCodecCallbackExternalSyntheticLambda2, requestkeyframe3)) {
                    int i11 = INotificationSideChannelDefault + 85;
                    getInterfaceDescriptor = i11 % 128;
                    int i12 = i11 % 2;
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda2, SupportMenu.CATEGORY_MASK) != encoderImplMediaCodecCallbackExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        break;
                    }
                    Object objTuitionPaymentFragmentbindingInflater3 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda2);
                    if ((objTuitionPaymentFragmentbindingInflater3 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater3) != null) {
                        int i13 = getInterfaceDescriptor + 73;
                        INotificationSideChannelDefault = i13 % 128;
                        int i14 = i13 % 2;
                        encoderImplMediaCodecCallbackExternalSyntheticLambda2.asInterface();
                        break;
                    }
                    int i15 = getInterfaceDescriptor + 41;
                    INotificationSideChannelDefault = i15 % 128;
                    int i16 = i15 % 2;
                    break;
                }
                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(requestkeyframe3, SupportMenu.CATEGORY_MASK) != requestkeyframe3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    int i17 = INotificationSideChannelDefault + 95;
                    getInterfaceDescriptor = i17 % 128;
                    int i18 = i17 % 2;
                } else {
                    Object objTuitionPaymentFragmentbindingInflater4 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe3);
                    if ((objTuitionPaymentFragmentbindingInflater4 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater4) == null) {
                        int i19 = INotificationSideChannelDefault + 95;
                        getInterfaceDescriptor = i19 % 128;
                        int i110 = i19 % 2;
                    } else {
                        int i20 = getInterfaceDescriptor + 19;
                        INotificationSideChannelDefault = i20 % 128;
                        if (i20 % 2 == 0) {
                            requestkeyframe3.asInterface();
                            int i21 = 77 / 0;
                        } else {
                            requestkeyframe3.asInterface();
                        }
                    }
                }
            }
        }
        if (requestkeyframe2.f136a <= j) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return requestkeyframe2;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(requestkeyframe2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        if (requestkeyframe2.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1) >= (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L)) {
            return null;
        }
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
        return null;
    }

    private final KFunction<Unit> asInterface() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[11], bArr[8], (byte) ($$b & 5), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, capsMode, iLastIndexOf, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{28183, 50588, 58671, 49703, 34386, 14473, 22853, 34347, 55998, 13966, 43231, 33855, 22557, 54537, 22665, 9309, 48810, 9464, 58638, 40454, 't', 29926, 34473, 21838}, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{53318, 38614, '3', 25773, 4596, 45707, 41619, 'D', 35649, 52515, 35901, 42199, 5324, 1458, 41198, 26738, 13586, 43378}, 15 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
            byte b2 = (byte) ($$b & 5);
            byte b3 = $$a[11];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, keyRepeatTimeout, scrollBarFadeDuration, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = getInterfaceDescriptor + 45;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[11];
                Object[] objArr6 = new Object[1];
                c(b4, bArr2[10], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, i4, i5, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = ~System.identityHashCode(this);
            int i7 = (((((~((-723618543) | i6)) | 50432742) * (-241)) + 47634522) + (((~(i6 | (-673185801))) | (-733741056)) * 241)) - 1761022249;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            int i10 = getInterfaceDescriptor + 105;
            INotificationSideChannelDefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{11760, 10435, 23299, 29257, 36754, 40410, 17660, 44783, 27774, 54370, 61880, 10687, 22141, 1835, 48305, 53010, 49393, 12151}, 16 - (Process.myTid() >> 22), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{22548, 63812, 33496, 14971, 32886, 11252, 32778, 56906, 31609, 50420, 4040, 37973, 44324, 48086, 5580, 55275, 4525, 62255}, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i12 = getInterfaceDescriptor + 5;
            INotificationSideChannelDefault = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -1761022249};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[6];
                byte b6 = bArr3[11];
                Object[] objArr11 = new Object[1];
                f(b5, (byte) (-b6), b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                f((byte) (-bArr3[11]), bArr3[6], bArr3[12], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[11];
                    Object[] objArr14 = new Object[1];
                    c(b7, bArr4[10], b7, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, maximumDrawingCacheSize, i14, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{28183, 50588, 58671, 49703, 34386, 14473, 22853, 34347, 55998, 13966, 43231, 33855, 22557, 54537, 22665, 9309, 48810, 9464, 58638, 40454, 't', 29926, 34473, 21838}, (ViewConfiguration.getEdgeSlop() >> 16) + 22, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{53318, 38614, '3', 25773, 4596, 45707, 41619, 'D', 35649, 52515, 35901, 42199, 5324, 1458, 41198, 26738, 13586, 43378}, (ViewConfiguration.getTapTimeout() >> 16) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        byte b8 = (byte) ($$b & 5);
                        byte b9 = $$a[11];
                        Object[] objArr17 = new Object[1];
                        c(b8, b9, b9, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, scrollBarSize, edgeSlop, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[11], bArr5[8], (byte) ($$b & 5), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, minimumFlingVelocity, iResolveOpacity, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = getInterfaceDescriptor + 95;
            INotificationSideChannelDefault = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = i19 + 1538464444 + ((~(402365431 | iIdentityHashCode)) * 623) + (((~iIdentityHashCode) | 289440160) * (-623)) + (((~(iIdentityHashCode | 366057910)) | (~(325747681 | iIdentityHashCode)) | (-402365432)) * 623);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr19[1])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i23 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i23 + (-219778240) + (((~(858083239 | i24)) | 898393468) * 226) + (((~(i24 | 934113279)) | (~((-898393469) | iIdentityHashCode2)) | 822363428) * (-113)) + ((~(iIdentityHashCode2 | 858083239)) * 113);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[1])[0] = i27 ^ (i27 << 5);
        }
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[PHI: r9
  0x0035: PHI (r9v14 kotlinx.coroutines.internal.UndeliveredElementException) = 
  (r9v13 kotlinx.coroutines.internal.UndeliveredElementException)
  (r9v20 kotlinx.coroutines.internal.UndeliveredElementException)
 binds: [B:10:0x0033, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(E e2, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        ClosedSendChannelException closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1;
        UndeliveredElementException undeliveredElementExceptionB;
        UndeliveredElementException undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1;
        ClosedSendChannelException closedSendChannelException;
        CancellableContinuationImpl cancellableContinuationImpl2;
        int i = 2 % 2;
        CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl3.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl3;
        Function1<E, Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (function1 == null) {
            cancellableContinuationImpl = cancellableContinuationImpl4;
            closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = (Throwable) b.get(this);
            if (closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 == null) {
                closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = new ClosedSendChannelException("Channel was closed");
            }
            Result.Companion companion = Result.INSTANCE;
            if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl);
            }
            cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1)));
        } else {
            int i2 = getInterfaceDescriptor + 1;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 == 0) {
                undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, e2, null);
                int i3 = 58 / 0;
                if (undeliveredElementExceptionB != null) {
                    undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1 = undeliveredElementExceptionB;
                    closedSendChannelException = (Throwable) b.get(this);
                    if (closedSendChannelException == null) {
                        closedSendChannelException = new ClosedSendChannelException("Channel was closed");
                    }
                    ExceptionsKt.addSuppressed(undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1, closedSendChannelException);
                    cancellableContinuationImpl2 = cancellableContinuationImpl4;
                    Result.Companion companion2 = Result.INSTANCE;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl2);
                    }
                    cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1)));
                } else {
                    cancellableContinuationImpl = cancellableContinuationImpl4;
                    closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = (Throwable) b.get(this);
                    if (closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 == null) {
                        closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = new ClosedSendChannelException("Channel was closed");
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl);
                    }
                    cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1)));
                }
            } else {
                undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, e2, null);
                if (undeliveredElementExceptionB != null) {
                    undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1 = undeliveredElementExceptionB;
                    closedSendChannelException = (Throwable) b.get(this);
                    if (closedSendChannelException == null) {
                        closedSendChannelException = new ClosedSendChannelException("Channel was closed");
                    }
                    ExceptionsKt.addSuppressed(undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1, closedSendChannelException);
                    cancellableContinuationImpl2 = cancellableContinuationImpl4;
                    Result.Companion companion4 = Result.INSTANCE;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl2);
                    }
                    cancellableContinuationImpl2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(undeliveredElementExceptionTuitionPaymentFragmentbindingInflater1)));
                } else {
                    cancellableContinuationImpl = cancellableContinuationImpl4;
                    closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = (Throwable) b.get(this);
                    if (closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 == null) {
                        closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = new ClosedSendChannelException("Channel was closed");
                    }
                    Result.Companion companion5 = Result.INSTANCE;
                    if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl);
                    }
                    cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1)));
                }
            }
        }
        Object result = cancellableContinuationImpl3.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i4 = getInterfaceDescriptor + 75;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return result;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0228  */
    /* JADX WARN: Code duplicated, block: B:89:0x0231 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x0232  */
    private final Object b(requestKeyFrame<E> requestkeyframe, int i, E e2, long j, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        Unit unit;
        int i2;
        int i3;
        Object result;
        CancellableContinuationImpl cancellableContinuationImpl2;
        int i4 = 2 % 2;
        int i5 = getInterfaceDescriptor + 33;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
        CancellableContinuationImpl cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(continuation));
        try {
            int iB = b(this, requestkeyframe, i, e2, j, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3, false);
            if (iB == 0) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                cancellableContinuationImpl = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Result.Companion companion = Result.INSTANCE;
                unit = Unit.INSTANCE;
            } else {
                if (iB != 1) {
                    int i7 = getInterfaceDescriptor + 37;
                    int i8 = i7 % 128;
                    INotificationSideChannelDefault = i8;
                    int i9 = i7 % 2;
                    if (iB != 2) {
                        if (iB != 4) {
                            int i10 = i8 + 45;
                            getInterfaceDescriptor = i10 % 128;
                            int i11 = i10 % 2;
                            if (iB != 5) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            int i12 = i8 + 35;
                            getInterfaceDescriptor = i12 % 128;
                            int i13 = i12 % 2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                            requestKeyFrame requestkeyframe2 = (requestKeyFrame) cancel.get(this);
                            while (true) {
                                long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndIncrement(this);
                                long j2 = andIncrement & 1152921504606846975L;
                                boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(andIncrement), false}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
                                long j3 = j2 / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i14 = (int) (j2 % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                if (requestkeyframe2.f136a != j3) {
                                    requestKeyFrame requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(this, j3, requestkeyframe2);
                                    if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                                        requestkeyframe2 = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                                    } else if (zBooleanValue) {
                                    }
                                }
                                int iB2 = b(this, requestkeyframe2, i14, e2, j2, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3, zBooleanValue);
                                if (iB2 == 0) {
                                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                    cancellableContinuationImpl = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                } else if (iB2 != 1) {
                                    int i15 = INotificationSideChannelDefault;
                                    int i16 = i15 + 93;
                                    getInterfaceDescriptor = i16 % 128;
                                    int i17 = i16 % 2;
                                    if (iB2 != 2) {
                                        if (iB2 == 3) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        if (iB2 != 4) {
                                            if (iB2 == 5) {
                                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                            }
                                        } else if (j2 < g.get(this)) {
                                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                        }
                                    } else if (!zBooleanValue) {
                                        if (cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof getByteBuffer) {
                                            int i18 = i15 + 115;
                                            getInterfaceDescriptor = i18 % 128;
                                            int i19 = i18 % 2;
                                            cancellableContinuationImpl2 = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        } else {
                                            cancellableContinuationImpl2 = null;
                                        }
                                        if (cancellableContinuationImpl2 != null) {
                                            cancellableContinuationImpl2.b(requestkeyframe2, i14 + EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        }
                                    } else if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe2) == requestkeyframe2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                                        int i20 = INotificationSideChannelDefault + 101;
                                        getInterfaceDescriptor = i20 % 128;
                                        int i21 = i20 % 2;
                                        requestkeyframe2.asInterface();
                                    }
                                } else {
                                    cancellableContinuationImpl = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    Result.Companion companion3 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                }
                            }
                        } else if (j < g.get(this)) {
                            int i22 = INotificationSideChannelDefault + 83;
                            getInterfaceDescriptor = i22 % 128;
                            int i23 = i22 % 2;
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                        }
                        CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Function1<E, Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
                        if (function1 != null) {
                            CoroutineContext context = cancellableContinuationImpl3.getContext();
                            UndeliveredElementException undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, e2, null);
                            if (undeliveredElementExceptionB != null) {
                                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, undeliveredElementExceptionB);
                            }
                        }
                        CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl3;
                        ClosedSendChannelException closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = (Throwable) b.get(this);
                        if (closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 == null) {
                            closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = new ClosedSendChannelException("Channel was closed");
                        }
                        if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && (cancellableContinuationImpl4 instanceof CoroutineStackFrame)) {
                            closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1 = reachEndData.TuitionPaymentFragmentbindingInflater1(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl4);
                        }
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuationImpl4.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(closedSendChannelExceptionTuitionPaymentFragmentbindingInflater1)));
                    } else {
                        cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(requestkeyframe, i + EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        i3 = INotificationSideChannelDefault + 75;
                        i2 = i3 % 128;
                        getInterfaceDescriptor = i2;
                        int i24 = i3 % 2;
                    }
                    result = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return result;
                    }
                    return Unit.INSTANCE;
                }
                cancellableContinuationImpl = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Result.Companion companion5 = Result.INSTANCE;
                unit = Unit.INSTANCE;
            }
            cancellableContinuationImpl.resumeWith(Result.m8024constructorimpl(unit));
            i3 = INotificationSideChannelDefault + 41;
            i2 = i3 % 128;
            getInterfaceDescriptor = i2;
            int i25 = i3 % 2;
            result = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0242: INVOKE (r10 I:kotlinx.coroutines.CancellableContinuationImpl) VIRTUAL call: kotlinx.coroutines.CancellableContinuationImpl.b():void A[MD:():void (m)] (LINE:3787), block:B:79:0x0242 */
    private final Object b(requestKeyFrame<E> requestkeyframe, int i, long j, Continuation<? super E> continuation) {
        CancellableContinuationImpl cancellableContinuationImplB;
        KFunction<Unit> kFunctionAsInterface;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 71;
        INotificationSideChannelDefault = i3 % 128;
        Throwable th = null;
        try {
            if (i3 % 2 == 0) {
                TuitionPaymentFragmentbindingInflater1(requestkeyframe, i, j, MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(continuation)));
                EncoderImplMediaCodecCallbackExternalSyntheticLambda0 unused = EncodedData.RemoteActionCompatParcelizer;
                throw null;
            }
            CancellableContinuationImpl cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(continuation));
            Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(requestkeyframe, i, j, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.RemoteActionCompatParcelizer) {
                cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(requestkeyframe, i);
            } else {
                if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.asBinder) {
                    if (j < (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L)) {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                    }
                    requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) asInterface.get(this);
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(atomicLongFieldUpdater.get(this)), true}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                            int i4 = INotificationSideChannelDefault + 5;
                            getInterfaceDescriptor = i4 % 128;
                            if (i4 % 2 != 0) {
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1420461955, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1420461961, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()))));
                                th.hashCode();
                                throw th;
                            }
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1420461955, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1420461961, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()))));
                        } else {
                            long andIncrement = g.getAndIncrement(this);
                            long j2 = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i5 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            if (requestkeyframe2.f136a != j2) {
                                int i6 = getInterfaceDescriptor + 27;
                                INotificationSideChannelDefault = i6 % 128;
                                int i7 = i6 % 2;
                                requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(j2, requestkeyframe2);
                                if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                                    int i8 = INotificationSideChannelDefault + 115;
                                    getInterfaceDescriptor = i8 % 128;
                                    int i9 = i8 % 2;
                                    requestkeyframe2 = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                                } else {
                                    continue;
                                }
                            }
                            objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(requestkeyframe2, i5, andIncrement, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.RemoteActionCompatParcelizer) {
                                int i10 = getInterfaceDescriptor + 47;
                                INotificationSideChannelDefault = i10 % 128;
                                int i11 = i10 % 2;
                                CancellableContinuationImpl cancellableContinuationImpl = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof getByteBuffer ? cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                                if (cancellableContinuationImpl != null) {
                                    cancellableContinuationImpl.b(requestkeyframe2, i5);
                                }
                            } else if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.asBinder) {
                                if (andIncrement < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                                    int i12 = getInterfaceDescriptor + 17;
                                    INotificationSideChannelDefault = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                        int i13 = 61 / 0;
                                    } else {
                                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                    }
                                }
                                th = null;
                            } else {
                                if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.INotificationSideChannelStub) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                int i14 = getInterfaceDescriptor + 91;
                                INotificationSideChannelDefault = i14 % 128;
                                int i15 = i14 % 2;
                                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                                    int i16 = INotificationSideChannelDefault + 57;
                                    getInterfaceDescriptor = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        asInterface();
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    kFunctionAsInterface = asInterface();
                                } else {
                                    kFunctionAsInterface = null;
                                }
                            }
                        }
                    }
                } else {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                    if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                        int i17 = getInterfaceDescriptor + 9;
                        INotificationSideChannelDefault = i17 % 128;
                        if (i17 % 2 == 0) {
                            asInterface();
                            throw null;
                        }
                        kFunctionAsInterface = asInterface();
                    } else {
                        kFunctionAsInterface = null;
                    }
                }
                cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objTuitionPaymentFragmentbindingInflater1, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b, (Function3) kFunctionAsInterface);
            }
            Object result = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th2) {
            cancellableContinuationImplB.b();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(requestKeyFrame<E> requestkeyframe, int i, long j, Continuation<? super EncodedDataImplExternalSyntheticLambda0<? extends E>> continuation) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        EncodedDataImplExternalSyntheticLambda0 encodedDataImplExternalSyntheticLambda0TuitionPaymentFragmentbindingInflater1;
        int i2 = 2 % 2;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            if ((bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label -= Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        }
        Object result = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(result);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = requestkeyframe;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
            CancellableContinuationImpl cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaStoreVideoCannotWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$2));
            try {
                Intrinsics.checkNotNull(cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                EncoderCallback1 encoderCallback1 = new EncoderCallback1(cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(requestkeyframe, i, j, encoderCallback1);
                if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.RemoteActionCompatParcelizer) {
                    encoderCallback1.b(requestkeyframe, i);
                } else {
                    BufferedChannel$bindCancellationFunResult$1 bufferedChannel$bindCancellationFunResult$1 = null;
                    if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.asBinder) {
                        int i4 = INotificationSideChannelDefault + 93;
                        getInterfaceDescriptor = i4 % 128;
                        int i5 = i4 % 2;
                        if (j < (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 1152921504606846975L)) {
                            lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                        }
                        requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) asInterface.get(this);
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(atomicLongFieldUpdater.get(this)), true}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                                Result.Companion companion = Result.INSTANCE;
                                EncodedDataImplExternalSyntheticLambda0.Companion companion2 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                                cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.resumeWith(Result.m8024constructorimpl(EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) b.get(this)))));
                            } else {
                                long andIncrement = g.getAndIncrement(this);
                                long j2 = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i6 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                if (requestkeyframe2.f136a != j2) {
                                    int i7 = INotificationSideChannelDefault + 71;
                                    getInterfaceDescriptor = i7 % 128;
                                    int i8 = i7 % 2;
                                    requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(j2, requestkeyframe2);
                                    if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                                        requestkeyframe2 = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                                    } else {
                                        continue;
                                    }
                                }
                                Object objTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(requestkeyframe2, i6, andIncrement, encoderCallback1);
                                if (objTuitionPaymentFragmentbindingInflater2 == EncodedData.RemoteActionCompatParcelizer) {
                                    int i9 = getInterfaceDescriptor + 113;
                                    INotificationSideChannelDefault = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        encoderCallback1.b(requestkeyframe2, i6);
                                        bufferedChannel$bindCancellationFunResult$1.hashCode();
                                        throw null;
                                    }
                                    encoderCallback1.b(requestkeyframe2, i6);
                                    int i10 = getInterfaceDescriptor + 31;
                                    INotificationSideChannelDefault = i10 % 128;
                                    int i11 = i10 % 2;
                                } else if (objTuitionPaymentFragmentbindingInflater2 == EncodedData.asBinder) {
                                    if (andIncrement < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                    }
                                } else {
                                    if (objTuitionPaymentFragmentbindingInflater2 == EncodedData.INotificationSideChannelStub) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe2, null);
                                    EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                                    encodedDataImplExternalSyntheticLambda0TuitionPaymentFragmentbindingInflater1 = EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(EncodedDataImplExternalSyntheticLambda0.Companion.b(objTuitionPaymentFragmentbindingInflater2));
                                    if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                                        bufferedChannel$bindCancellationFunResult$1 = new BufferedChannel$bindCancellationFunResult$1(this);
                                    }
                                }
                            }
                        }
                    } else {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                        EncodedDataImplExternalSyntheticLambda0.Companion companion4 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                        encodedDataImplExternalSyntheticLambda0TuitionPaymentFragmentbindingInflater1 = EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(EncodedDataImplExternalSyntheticLambda0.Companion.b(objTuitionPaymentFragmentbindingInflater1));
                        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                            bufferedChannel$bindCancellationFunResult$1 = new BufferedChannel$bindCancellationFunResult$1(this);
                        }
                    }
                    cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(encodedDataImplExternalSyntheticLambda0TuitionPaymentFragmentbindingInflater1, cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b, bufferedChannel$bindCancellationFunResult$1);
                }
                result = cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$2);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                cancellableContinuationImplTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0;
            int i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0;
            ResultKt.throwOnFailure(result);
        }
        return ((EncodedDataImplExternalSyntheticLambda0) result).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        requestKeyFrame<E> requestkeyframe;
        EncodeExceptionErrorType encodeExceptionErrorType = (EncodeExceptionErrorType) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        long j = g.get(encodeExceptionErrorType);
        long j2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(encodeExceptionErrorType);
        boolean z = true;
        if (!(!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(j2), true}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue())) {
            EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) b.get(encodeExceptionErrorType));
        }
        if (j >= (j2 & 1152921504606846975L)) {
            EncodedDataImplExternalSyntheticLambda0.Companion companion2 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = EncodedData.f134a;
        requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) asInterface.get(encodeExceptionErrorType);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, Long.valueOf(atomicLongFieldUpdater.get(encodeExceptionErrorType)), Boolean.valueOf(z)}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue()) {
                EncodedDataImplExternalSyntheticLambda0.Companion companion3 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) b.get(encodeExceptionErrorType));
            }
            long andIncrement = g.getAndIncrement(encodeExceptionErrorType);
            long j3 = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i4 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (requestkeyframe2.f136a != j3) {
                requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(j3, requestkeyframe2);
                if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                    requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                } else {
                    continue;
                }
            } else {
                requestkeyframe = requestkeyframe2;
            }
            requestKeyFrame<E> requestkeyframe3 = requestkeyframe;
            Object objTuitionPaymentFragmentbindingInflater1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1(requestkeyframe, i4, andIncrement, encoderImplMediaCodecCallbackExternalSyntheticLambda0);
            if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.RemoteActionCompatParcelizer) {
                encodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(andIncrement);
                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe3) == requestkeyframe3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    int i5 = getInterfaceDescriptor + 41;
                    INotificationSideChannelDefault = i5 % 128;
                    int i6 = i5 % 2;
                    requestkeyframe3.asInterface();
                }
                EncodedDataImplExternalSyntheticLambda0.Companion companion4 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncodedDataImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i7 = INotificationSideChannelDefault + 29;
                getInterfaceDescriptor = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 59 / 0;
                }
                return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.asBinder) {
                if (objTuitionPaymentFragmentbindingInflater1 == EncodedData.INotificationSideChannelStub) {
                    throw new IllegalStateException("unexpected".toString());
                }
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                EncodedDataImplExternalSyntheticLambda0.Companion companion5 = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
                return EncodedDataImplExternalSyntheticLambda0.Companion.b(objTuitionPaymentFragmentbindingInflater1);
            }
            int i9 = getInterfaceDescriptor + 103;
            INotificationSideChannelDefault = i9 % 128;
            int i10 = i9 % 2;
            if (andIncrement < (atomicLongFieldUpdater.get(encodeExceptionErrorType) & 1152921504606846975L)) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
            }
            requestkeyframe2 = requestkeyframe3;
            z = true;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, requestKeyFrame<E> requestkeyframe) {
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2;
        int i = 2 % 2;
        while (true) {
            lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = null;
            if (requestkeyframe.f136a >= j) {
                break;
            }
            Object objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe);
            requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) (objTuitionPaymentFragmentbindingInflater1 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1);
            if (requestkeyframe2 == null) {
                break;
            } else {
                requestkeyframe = requestkeyframe2;
            }
        }
        while (true) {
            if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(requestkeyframe) == requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                Object objTuitionPaymentFragmentbindingInflater2 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe);
                if ((objTuitionPaymentFragmentbindingInflater2 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater2) == null) {
                    int i2 = INotificationSideChannelDefault;
                    int i3 = i2 + 19;
                    getInterfaceDescriptor = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 119;
                    getInterfaceDescriptor = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    Object objTuitionPaymentFragmentbindingInflater3 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe);
                    if (objTuitionPaymentFragmentbindingInflater3 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i7 = getInterfaceDescriptor + 21;
                        INotificationSideChannelDefault = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 23 / 0;
                        }
                        lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 = null;
                    } else {
                        lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2 = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater3;
                    }
                    requestKeyFrame<E> requestkeyframe3 = (requestKeyFrame) lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput2;
                    if (requestkeyframe3 != null) {
                        int i9 = INotificationSideChannelDefault + 117;
                        getInterfaceDescriptor = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 5 / 4;
                        }
                        requestkeyframe = requestkeyframe3;
                    }
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asBinder;
            while (true) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda1 encoderImplMediaCodecCallbackExternalSyntheticLambda1 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda1) atomicReferenceFieldUpdater.get(this);
                requestKeyFrame<E> requestkeyframe4 = requestkeyframe;
                if (encoderImplMediaCodecCallbackExternalSyntheticLambda1.f136a < requestkeyframe4.f136a) {
                    if (!requestkeyframe4.a()) {
                        break;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, encoderImplMediaCodecCallbackExternalSyntheticLambda1, requestkeyframe4)) {
                        int i11 = INotificationSideChannelDefault + 23;
                        getInterfaceDescriptor = i11 % 128;
                        int i12 = i11 % 2;
                        if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(encoderImplMediaCodecCallbackExternalSyntheticLambda1, SupportMenu.CATEGORY_MASK) == encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                            Object objTuitionPaymentFragmentbindingInflater4 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
                            if (objTuitionPaymentFragmentbindingInflater4 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                int i13 = getInterfaceDescriptor + 123;
                                INotificationSideChannelDefault = i13 % 128;
                                int i14 = i13 % 2;
                            } else {
                                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater4;
                            }
                            if (lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput == null) {
                                return;
                            }
                            int i15 = INotificationSideChannelDefault + 23;
                            getInterfaceDescriptor = i15 % 128;
                            int i16 = i15 % 2;
                            encoderImplMediaCodecCallbackExternalSyntheticLambda1.asInterface();
                            return;
                        }
                        return;
                    }
                    if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAndGet(requestkeyframe4, SupportMenu.CATEGORY_MASK) == requestkeyframe4.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                        Object objTuitionPaymentFragmentbindingInflater5 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe4);
                        if ((objTuitionPaymentFragmentbindingInflater5 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? null : (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater5) != null) {
                            int i17 = INotificationSideChannelDefault + 69;
                            getInterfaceDescriptor = i17 % 128;
                            int i18 = i17 % 2;
                            requestkeyframe4.asInterface();
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
        int i;
        String string;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) >> 60);
        if (i3 != 2) {
            int i4 = INotificationSideChannelDefault + 109;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (i3 == 3) {
                sb.append("cancelled,");
            }
        } else {
            sb.append("closed,");
        }
        StringBuilder sb2 = new StringBuilder("capacity=");
        sb2.append(this.cancelAll);
        sb2.append(',');
        sb.append(sb2.toString());
        sb.append("data=[");
        int i6 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new requestKeyFrame[]{asInterface.get(this), cancel.get(this), asBinder.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((requestKeyFrame) obj) != EncodedData.INotificationSideChannel) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = INotificationSideChannelDefault + 15;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((requestKeyFrame) next).f136a;
            do {
                Object next2 = it.next();
                long j2 = ((requestKeyFrame) next2).f136a;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        } else {
            int i9 = INotificationSideChannelDefault + 107;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
        }
        requestKeyFrame requestkeyframe = (requestKeyFrame) next;
        long j3 = g.get(this);
        long j4 = 1152921504606846975L & TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this);
        loop1: while (true) {
            int i11 = EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i12 = i6;
            while (i12 < i11) {
                long j5 = (requestkeyframe.f136a * ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + ((long) i12);
                if (j5 >= j4) {
                    int i13 = INotificationSideChannelDefault + 15;
                    getInterfaceDescriptor = i13 % 128;
                    if (i13 % 2 != 0) {
                        i = 0;
                        int i14 = 12 / 0;
                        if (j5 >= j3) {
                            break loop1;
                        }
                    } else {
                        i = 0;
                        if (j5 >= j3) {
                            break loop1;
                        }
                    }
                } else {
                    i = 0;
                }
                int i15 = i12 * 2;
                Object obj2 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i15 + 1);
                Object obj3 = requestkeyframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i15);
                if (obj2 instanceof MediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
                    string = (j5 >= j3 || j5 < j4) ? (j5 >= j4 || j5 < j3) ? "cont" : "send" : "receive";
                } else if (obj2 instanceof SystemTimeProvider) {
                    string = (j5 >= j3 || j5 < j4) ? (j5 >= j4 || j5 < j3) ? "select" : "onSend" : "onReceive";
                } else if (obj2 instanceof EncoderCallback1) {
                    string = "receiveCatching";
                } else if (obj2 instanceof TuitionPaymentFragmentbindingInflater1) {
                    string = "sendBroadcast";
                } else if (obj2 instanceof r8lambdaSlAnbggd9lEp59VusripYrYneuw) {
                    StringBuilder sb3 = new StringBuilder("EB(");
                    sb3.append(obj2);
                    sb3.append(')');
                    string = sb3.toString();
                } else if (Intrinsics.areEqual(obj2, EncodedData.INotificationSideChannelDefault) || Intrinsics.areEqual(obj2, EncodedData.INotificationSideChannelStubProxy)) {
                    string = "resuming_sender";
                } else {
                    int i16 = INotificationSideChannelDefault + 93;
                    getInterfaceDescriptor = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                    if (obj2 != null && !Intrinsics.areEqual(obj2, EncodedData.cancelAll) && !Intrinsics.areEqual(obj2, EncodedData.d)) {
                        int i17 = getInterfaceDescriptor + 103;
                        INotificationSideChannelDefault = i17 % 128;
                        if (i17 % 2 == 0) {
                            Intrinsics.areEqual(obj2, EncodedData.onTransact);
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        if (!Intrinsics.areEqual(obj2, EncodedData.onTransact) && !Intrinsics.areEqual(obj2, EncodedData.f134a)) {
                            int i18 = getInterfaceDescriptor + 45;
                            INotificationSideChannelDefault = i18 % 128;
                            int i19 = i18 % 2;
                            if (!Intrinsics.areEqual(obj2, EncodedData.asInterface)) {
                                int i20 = INotificationSideChannelDefault + 15;
                                getInterfaceDescriptor = i20 % 128;
                                int i21 = i20 % 2;
                                if (!Intrinsics.areEqual(obj2, EncodedData.INotificationSideChannelDefault())) {
                                    string = obj2.toString();
                                }
                            }
                        }
                    }
                    i12++;
                    i6 = i;
                }
                if (obj3 != null) {
                    StringBuilder sb4 = new StringBuilder("(");
                    sb4.append(string);
                    sb4.append(',');
                    sb4.append(obj3);
                    sb4.append("),");
                    sb.append(sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(string);
                    sb5.append(',');
                    sb.append(sb5.toString());
                }
                i12++;
                i6 = i;
            }
            int i22 = i6;
            Object objTuitionPaymentFragmentbindingInflater1 = lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentbindingInflater1(requestkeyframe);
            if (objTuitionPaymentFragmentbindingInflater1 == lambdaacquireBuffer2androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i23 = getInterfaceDescriptor + 19;
                INotificationSideChannelDefault = i23 % 128;
                int i24 = i23 % 2;
                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = null;
            } else {
                lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput = (lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput) objTuitionPaymentFragmentbindingInflater1;
            }
            requestkeyframe = (requestKeyFrame) lambdafetchdata1androidxcameravideointernalencoderencoderimplbytebufferinput;
            if (requestkeyframe == null) {
                break;
            }
            i6 = i22;
        }
        if (StringsKt.last(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "");
        }
        sb.append("]");
        return sb.toString();
    }

    public static /* synthetic */ Unit b(Object obj, EncodeExceptionErrorType encodeExceptionErrorType, SystemTimeProvider systemTimeProvider) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        if (obj != EncodedData.INotificationSideChannelDefault()) {
            Function1<E, Unit> function1 = encodeExceptionErrorType.TuitionPaymentFragmentbindingInflater1;
            CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = systemTimeProvider.getTuitionPaymentFragmentbindingInflater1();
            UndeliveredElementException undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, obj, null);
            if (undeliveredElementExceptionB != null) {
                int i4 = getInterfaceDescriptor + 23;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3, undeliveredElementExceptionB);
                int i6 = INotificationSideChannelDefault + 105;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(final EncodeExceptionErrorType encodeExceptionErrorType, final SystemTimeProvider systemTimeProvider, final Object obj) {
        int i = 2 % 2;
        Function3 function3 = new Function3() { // from class: getErrorType
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return EncodeExceptionErrorType.b(obj, encodeExceptionErrorType, systemTimeProvider);
            }
        };
        int i2 = INotificationSideChannelDefault + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return function3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 kotlinx.coroutines.internal.UndeliveredElementException) = 
  (r3v1 kotlinx.coroutines.internal.UndeliveredElementException)
  (r3v6 kotlinx.coroutines.internal.UndeliveredElementException)
 binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit b(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionB;
        int i;
        int i2 = 2 % 2;
        int i3 = INotificationSideChannelDefault + 55;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, obj, null);
            int i4 = 12 / 0;
            if (undeliveredElementExceptionB != null) {
                i = getInterfaceDescriptor + 23;
                INotificationSideChannelDefault = i % 128;
                if (i % 2 != 0) {
                    AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
                    throw null;
                }
                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
            }
        } else {
            undeliveredElementExceptionB = lambdareachEndData2androidxcameravideointernalencoderEncoderImplMediaCodecCallback.b(function1, obj, null);
            if (undeliveredElementExceptionB != null) {
                i = getInterfaceDescriptor + 23;
                INotificationSideChannelDefault = i % 128;
                if (i % 2 != 0) {
                    AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
                    throw null;
                }
                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineContext, undeliveredElementExceptionB);
            }
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 71;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = asInterface;
        int i5 = i3 + 53;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return atomicReferenceFieldUpdater;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 35;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        int i5 = i2 + 21;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return atomicLongFieldUpdater;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        long j2;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 83;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        int i5 = i3 + 117;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 % 5;
        }
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!g.compareAndSet(this, j2, j));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x000d A[SYNTHETIC] */
    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, Continuation<? super Unit> continuation) {
        requestKeyFrame<E> requestkeyframe;
        requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        requestKeyFrame<E> requestkeyframe2 = (requestKeyFrame) cancel.get(this);
        while (true) {
            long andIncrement = TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            Object[] objArr = {this, Long.valueOf(andIncrement), false};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            boolean zBooleanValue = ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
            long j2 = j / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i2 = (int) (j % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (requestkeyframe2.f136a != j2) {
                int i3 = getInterfaceDescriptor + 5;
                INotificationSideChannelDefault = i3 % 128;
                if (i3 % 2 == 0) {
                    requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(this, j2, requestkeyframe2);
                    int i4 = 97 / 0;
                    if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                        requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                    } else if (zBooleanValue) {
                        int i5 = getInterfaceDescriptor + 125;
                        INotificationSideChannelDefault = i5 % 128;
                        int i6 = i5 % 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, continuation);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            break;
                        }
                        return objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                } else {
                    requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(this, j2, requestkeyframe2);
                    if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                        requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                    } else if (zBooleanValue) {
                        int i7 = getInterfaceDescriptor + 125;
                        INotificationSideChannelDefault = i7 % 128;
                        int i8 = i7 % 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, continuation);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            break;
                        }
                        return objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                }
            } else {
                requestkeyframe = requestkeyframe2;
            }
            requestKeyFrame<E> requestkeyframe3 = requestkeyframe;
            int iB = b(this, requestkeyframe, i2, e2, j, null, zBooleanValue);
            Object obj = null;
            if (iB == 0) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                break;
            }
            if (iB == 1) {
                break;
            }
            int i9 = INotificationSideChannelDefault;
            int i10 = i9 + 41;
            int i11 = i10 % 128;
            getInterfaceDescriptor = i11;
            int i12 = i10 % 2;
            if (iB == 2) {
                if (!zBooleanValue) {
                    scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    break;
                }
                int i13 = i11 + 57;
                INotificationSideChannelDefault = i13 % 128;
                int i14 = i13 % 2;
                if (EncoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.incrementAndGet(requestkeyframe3) == requestkeyframe3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    requestkeyframe3.asInterface();
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, continuation);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    break;
                }
                return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (iB == 3) {
                Object objB = b(requestkeyframe3, i2, e2, j, continuation);
                if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    break;
                }
                int i15 = getInterfaceDescriptor + 73;
                INotificationSideChannelDefault = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 71 / 0;
                }
                return objB;
            }
            if (iB == 4) {
                if (j < g.get(this)) {
                    int i17 = INotificationSideChannelDefault + 27;
                    getInterfaceDescriptor = i17 % 128;
                    if (i17 % 2 != 0) {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                        obj.hashCode();
                        throw null;
                    }
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, continuation);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    break;
                }
                return objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            }
            int i18 = i9 + 109;
            getInterfaceDescriptor = i18 % 128;
            if (i18 % 2 == 0 ? iB == 5 : iB == 2) {
                lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe3, null);
            }
            requestkeyframe2 = requestkeyframe3;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.EncoderSurfaceInput
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Continuation<? super E> continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        requestKeyFrame<E> requestkeyframe = (requestKeyFrame) asInterface.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (!(!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Long.valueOf(atomicLongFieldUpdater.get(this)), true}, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue())) {
                throw reachEndData.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1420461955, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1420461961, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
            }
            long andIncrement = g.getAndIncrement(this);
            long j = andIncrement / ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i4 = (int) (andIncrement % ((long) EncodedData.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (requestkeyframe.f136a != j) {
                requestKeyFrame<E> requestkeyframeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(j, requestkeyframe);
                if (requestkeyframeTuitionPaymentFragmentbindingInflater1 != null) {
                    requestkeyframe = requestkeyframeTuitionPaymentFragmentbindingInflater1;
                } else {
                    continue;
                }
            }
            Object objTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(requestkeyframe, i4, andIncrement, (Object) null);
            if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.RemoteActionCompatParcelizer) {
                if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.asBinder) {
                    if (objTuitionPaymentFragmentbindingInflater1 != EncodedData.INotificationSideChannelStub) {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                        return objTuitionPaymentFragmentbindingInflater1;
                    }
                    return b(requestkeyframe, i4, andIncrement, continuation);
                }
                int i5 = INotificationSideChannelDefault + 81;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    if (andIncrement < (atomicLongFieldUpdater.get(this) | 1152921504606846975L)) {
                        lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                    }
                } else if (andIncrement < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    lambdafetchData1androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(requestkeyframe, null);
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
    }

    static {
        MediaBrowserCompat = 1;
        d();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicLongFieldUpdater.newUpdater(EncodeExceptionErrorType.class, "sendersAndCloseStatus$volatile");
        g = AtomicLongFieldUpdater.newUpdater(EncodeExceptionErrorType.class, "receivers$volatile");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicLongFieldUpdater.newUpdater(EncodeExceptionErrorType.class, "bufferEnd$volatile");
        f133a = AtomicLongFieldUpdater.newUpdater(EncodeExceptionErrorType.class, "completedExpandBuffersAndPauseFlag$volatile");
        cancel = AtomicReferenceFieldUpdater.newUpdater(EncodeExceptionErrorType.class, Object.class, "sendSegment$volatile");
        asInterface = AtomicReferenceFieldUpdater.newUpdater(EncodeExceptionErrorType.class, Object.class, "receiveSegment$volatile");
        asBinder = AtomicReferenceFieldUpdater.newUpdater(EncodeExceptionErrorType.class, Object.class, "bufferEndSegment$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(EncodeExceptionErrorType.class, Object.class, "_closeCause$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(EncodeExceptionErrorType.class, Object.class, "closeHandler$volatile");
        int i = RemoteActionCompatParcelizer + 29;
        MediaBrowserCompat = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(EncodeExceptionErrorType encodeExceptionErrorType, Throwable th, Object obj, CoroutineContext coroutineContext) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{encodeExceptionErrorType, th, obj, coroutineContext}, -1163089776, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1163089776, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    private final boolean b(long j) {
        Object[] objArr = {this, Long.valueOf(j)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -15543992, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 15543993, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    private final Throwable onTransact() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1420461955, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1420461961, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    private final boolean b(long j, boolean z) {
        Object[] objArr = {this, Long.valueOf(j), Boolean.valueOf(z)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 70487127, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -70487120, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    private final void INotificationSideChannelStub() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -1270204088, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1270204096, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, requestKeyFrame<E> requestkeyframe, int i) {
        Object[] objArr = {this, obj, requestkeyframe, Integer.valueOf(i)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, 1464886202, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1464886193, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    protected final Throwable b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, -832463563, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 832463566, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final void b(Function1<? super Throwable, Unit> function1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, function1}, 966072031, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -966072026, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // defpackage.EncoderSurfaceInputOnSurfaceUpdateListener
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, 1223546678, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1223546676, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).booleanValue();
    }

    protected boolean g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 103;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        INotificationSideChannelDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.EncoderSurfaceInput
    public final Object TuitionPaymentFragmentbindingInflater1(Continuation<? super EncodedDataImplExternalSyntheticLambda0<? extends E>> continuation) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, continuation);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.EncoderSurfaceInput
    public final Object asBinder() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, 607183861, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -607183857, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    static void d() {
        INotificationSideChannel = (char) 29744;
        onTransact = (char) 52071;
        INotificationSideChannelStubProxy = (char) 4487;
        INotificationSideChannelStub = (char) 51385;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = 108 - r6
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = defpackage.EncodeExceptionErrorType.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EncodeExceptionErrorType.$$g(short, short, int):java.lang.String");
    }
}
