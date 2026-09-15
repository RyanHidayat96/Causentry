package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\n*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a>\u0010\"\u001a\u00020\n\"\u0004\b\u0000\u0010\u001f*\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010 2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000!H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010$\u001a\u00020\n*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0000¢\u0006\u0004\b$\u0010\u001e\u001a%\u0010&\u001a\u00020\n*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'\u001a7\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\"\b\b\u0000\u0010(*\u00020%\"\b\b\u0001\u0010)*\u00020%2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010-\u001a\u0004\u0018\u00010%2\b\u0010\u0003\u001a\u0004\u0018\u00010%2\b\u0010\u0006\u001a\u0004\u0018\u00010%2\b\u0010\u000e\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b-\u0010.\u001a!\u00101\u001a\u00020\r*\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\r*\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00102\u001a3\u00106\u001a\u00020\n*\b\u0012\u0004\u0012\u000200042\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u0002052\b\u0010\u000e\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b6\u00107\u001a+\u00108\u001a\u0004\u0018\u000100*\b\u0012\u0004\u0012\u000200042\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010:\u001a\u0004\u0018\u000100*\b\u0012\u0004\u0012\u000200042\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010;\u001a)\u0010<\u001a\u00020\n*\b\u0012\u0004\u0012\u000200042\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\b<\u0010=\u001a>\u0010?\u001a\u00020\n*\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\n0>H\u0082\b¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010A\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\bA\u0010B\u001a\u0013\u0010C\u001a\u00020\u0002*\u00020\rH\u0002¢\u0006\u0004\bC\u0010D\u001a#\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0/*\u00020E2\u0006\u0010\u0003\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010G\u001a#\u0010I\u001a\u00020\r*\u00020H2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0002¢\u0006\u0004\bI\u0010J\u001a+\u0010K\u001a\u00020\r*\u00020H2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bK\u0010L\u001a1\u0010M\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\bM\u0010N\u001a&\u0010O\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0080\b¢\u0006\u0004\bO\u0010N\u001a\u0018\u0010O\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bO\u0010P\u001a\u0018\u0010M\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bM\u0010P\u001a\u0017\u0010R\u001a\u00020Q2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\bR\u0010S\u001a\u0017\u0010T\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\bT\u0010U\u001a5\u0010Z\u001a\u00020Y2\u0006\u0010\u0003\u001a\u00020V2\u0006\u0010\u0006\u001a\u00020W2\u0006\u0010\u000e\u001a\u00020\u001b2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010XH\u0001¢\u0006\u0004\bZ\u0010[\"\u0018\u0010^\u001a\u00020\r*\u00020\u001b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\"\u001e\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b`\u0010a\u0012\u0004\bb\u0010\u0018\"\"\u0010c\u001a\u00020\u00028\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010\u0012\"\u0004\bf\u0010P\"\u0018\u0010g\u001a\u00020\u0002*\u00020\u001b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h\"\u0018\u0010g\u001a\u00020\u0002*\u00020H8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010i\"\u0018\u0010m\u001a\u00020%*\u00020j8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l\"\u0014\u0010n\u001a\u00020\r8\u0002X\u0083T¢\u0006\u0006\n\u0004\bn\u0010o\"\u0014\u0010p\u001a\u00020\r8\u0002X\u0083T¢\u0006\u0006\n\u0004\bp\u0010o\"\u0014\u0010q\u001a\u00020\r8\u0000X\u0081T¢\u0006\u0006\n\u0004\bq\u0010o\"\u001a\u0010r\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\br\u0010o\u0012\u0004\bs\u0010\u0018\" \u0010t\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bt\u0010u\u0012\u0004\bx\u0010\u0018\u001a\u0004\bv\u0010w\"\u001a\u0010y\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\by\u0010o\u0012\u0004\bz\u0010\u0018\" \u0010{\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b{\u0010u\u0012\u0004\b}\u0010\u0018\u001a\u0004\b|\u0010w\"\u001a\u0010~\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b~\u0010o\u0012\u0004\b\u007f\u0010\u0018\"$\u0010\u0080\u0001\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010u\u0012\u0005\b\u0082\u0001\u0010\u0018\u001a\u0005\b\u0081\u0001\u0010w\"\u001d\u0010\u0083\u0001\u001a\u00020\r8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010o\u0012\u0005\b\u0084\u0001\u0010\u0018\"$\u0010\u0085\u0001\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010u\u0012\u0005\b\u0087\u0001\u0010\u0018\u001a\u0005\b\u0086\u0001\u0010w\"\u001d\u0010\u0088\u0001\u001a\u00020\r8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010o\u0012\u0005\b\u0089\u0001\u0010\u0018\"$\u0010\u008a\u0001\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010u\u0012\u0005\b\u008c\u0001\u0010\u0018\u001a\u0005\b\u008b\u0001\u0010w\"\u001d\u0010\u008d\u0001\u001a\u00020\r8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010o\u0012\u0005\b\u008e\u0001\u0010\u0018\"$\u0010\u008f\u0001\u001a\u00020%8\u0001X\u0081\u0004¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010u\u0012\u0005\b\u0091\u0001\u0010\u0018\u001a\u0005\b\u0090\u0001\u0010w\"\u001d\u0010\u0092\u0001\u001a\u00020\r8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010o\u0012\u0005\b\u0093\u0001\u0010\u0018\"\u0016\u0010\u0094\u0001\u001a\u00020\r8\u0002X\u0083T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010o\"\u0016\u0010\u0095\u0001\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010d\")\u0010\u0098\u0001\u001a\u0014\u0012\u0004\u0012\u0002000\u0096\u0001j\t\u0012\u0004\u0012\u000200`\u0097\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Composer;", "", "p0", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "p1", "cache", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "", "sourceInformation", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", "p2", "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "isTraceInProgress", "()Z", "traceEventStart", "(ILjava/lang/String;)V", "p3", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "R", "Landroidx/compose/runtime/Anchor;", "Lkotlin/Function2;", "withAfterAnchorInfo", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Lkotlin/jvm/functions/Function2;)V", "deactivateCurrentGroup", "", "removeData", "(Landroidx/compose/runtime/SlotWriter;ILjava/lang/Object;)V", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/collection/MultiValueMap;", "multiMap", "(I)Landroidx/collection/MutableScatterMap;", "getKey", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/Invalidation;", "findLocation", "(Ljava/util/List;I)I", "findInsertLocation", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "insertIfMissing", "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", "firstInRange", "(Ljava/util/List;II)Landroidx/compose/runtime/Invalidation;", "removeLocation", "(Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;", "removeRange", "(Ljava/util/List;II)V", "Lkotlin/Function1;", "forEachInRange", "(Ljava/util/List;IILkotlin/jvm/functions/Function1;)V", "asInt", "(Z)I", "asBool", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "collectNodesFrom", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "distanceFrom", "(Landroidx/compose/runtime/SlotReader;II)I", "nearestCommonRootOf", "(Landroidx/compose/runtime/SlotReader;III)I", "runtimeCheck", "(ZLkotlin/jvm/functions/Function0;)V", "debugRuntimeCheck", "(Z)V", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "composeImmediateRuntimeError", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/MovableContentStateReference;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/MovableContentState;", "extractMovableContentAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/MovableContentState;", "getNextGroup", "(Landroidx/compose/runtime/SlotWriter;)I", "nextGroup", "Landroidx/compose/runtime/CompositionTracer;", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "composeStackTraceEnabled", "Z", "getComposeStackTraceEnabled", "setComposeStackTraceEnabled", "isAfterFirstChild", "(Landroidx/compose/runtime/SlotWriter;)Z", "(Landroidx/compose/runtime/SlotReader;)Z", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "rootKey", "I", "nodeKey", "defaultsKey", "invocationKey", "getInvocationKey$annotations", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", TypedValues.Custom.S_REFERENCE, "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "invalidGroupLocation", "EnableDebugRuntimeChecks", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "InvalidationLocationAscending", "Ljava/util/Comparator;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    private static boolean composeStackTraceEnabled = false;
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    public static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComposerKt.InvalidationLocationAscending$lambda$13((Invalidation) obj, (Invalidation) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final void debugRuntimeCheck(boolean z) {
    }

    public static final void debugRuntimeCheck(boolean z, Function0<String> function0) {
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z, Function0<? extends T> function0) {
        T t = (T) composer.rememberedValue();
        if (!z && t != Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i, String str) {
        composer.sourceInformationMarkerStart(i, str);
    }

    public static final boolean getComposeStackTraceEnabled() {
        return composeStackTraceEnabled;
    }

    public static final void setComposeStackTraceEnabled(boolean z) {
        composeStackTraceEnabled = z;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, str);
        }
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, final RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new Function2() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComposerKt.removeCurrentGroup$lambda$2(rememberManager, ((Integer) obj).intValue(), obj2);
            }
        });
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeCurrentGroup$lambda$2(RememberManager rememberManager, int i, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
        }
        if (obj instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj).release();
        }
        return Unit.INSTANCE;
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter slotWriter, Anchor anchor, Function2<? super Integer, ? super Integer, ? extends R> function2) {
        int iAnchorIndex;
        int slotsSize;
        if (anchor == null || !anchor.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = slotWriter.anchorIndex(anchor);
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime(iAnchorIndex);
        }
        function2.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final void deactivateCurrentGroup(final SlotWriter slotWriter, final RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new Function2() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComposerKt.deactivateCurrentGroup$lambda$3(rememberManager, slotWriter, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deactivateCurrentGroup$lambda$3(RememberManager rememberManager, SlotWriter slotWriter, int i, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((ComposeNodeLifecycleCallback) obj);
        } else if (obj instanceof RememberObserverHolder) {
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            if (!(rememberObserverHolder.getWrapped() instanceof ReusableRememberObserver)) {
                removeData(slotWriter, i, obj);
                rememberManager.forgetting(rememberObserverHolder);
            }
        } else if (obj instanceof RecomposeScopeImpl) {
            removeData(slotWriter, i, obj);
            ((RecomposeScopeImpl) obj).release();
        }
        return Unit.INSTANCE;
    }

    private static final void removeData(SlotWriter slotWriter, int i, Object obj) {
        Object objClear = slotWriter.clear(i);
        if (obj == objClear) {
            return;
        }
        StringBuilder sb = new StringBuilder("Slot table is out of sync (expected ");
        sb.append(obj);
        sb.append(", got ");
        sb.append(objClear);
        sb.append(')');
        composeImmediateRuntimeError(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i) {
        return MultiValueMap.m3615constructorimpl(new MutableScatterMap(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (Intrinsics.areEqual(joinedKey.getLeft(), obj2) && Intrinsics.areEqual(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i3).getLocation(), i);
            if (iCompare < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findInsertLocation(List<Invalidation> list, int i) {
        int iFindLocation = findLocation(list, i);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation < 0) {
            int i2 = -(iFindLocation + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, obj));
            return;
        }
        Invalidation invalidation = list.get(iFindLocation);
        if (obj instanceof DerivedState) {
            Object instances = invalidation.getInstances();
            if (instances == null) {
                invalidation.setInstances(obj);
                return;
            } else if (instances instanceof MutableScatterSet) {
                ((MutableScatterSet) instances).add(obj);
                return;
            } else {
                invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
                return;
            }
        }
        invalidation.setInstances(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i2) {
        int iFindInsertLocation = findInsertLocation(list, i);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i2) {
            return invalidation;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int iFindLocation = findLocation(list, i);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i, int i2) {
        int iFindInsertLocation = findInsertLocation(list, i);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i2) {
            list.remove(iFindInsertLocation);
        }
    }

    private static final void forEachInRange(List<Invalidation> list, int i, int i2, Function1<? super Invalidation, Unit> function1) {
        for (int iFindInsertLocation = findInsertLocation(list, i); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i2) {
                return;
            }
            function1.invoke(invalidation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$8$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$8$collectFromGroup(SlotReader slotReader, List<Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int iGroupSize = i + 1;
        int iGroupSize2 = slotReader.groupSize(i);
        while (iGroupSize < i + iGroupSize2) {
            collectNodesFrom$lambda$8$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (slotReader.parent(i) == i2) {
                return i2;
            }
            if (slotReader.parent(i2) != i) {
                if (slotReader.parent(i) == slotReader.parent(i2)) {
                    return slotReader.parent(i);
                }
                int iDistanceFrom = distanceFrom(slotReader, i, i3);
                int iDistanceFrom2 = distanceFrom(slotReader, i2, i3);
                for (int i4 = 0; i4 < iDistanceFrom - iDistanceFrom2; i4++) {
                    i = slotReader.parent(i);
                }
                for (int i5 = 0; i5 < iDistanceFrom2 - iDistanceFrom; i5++) {
                    i2 = slotReader.parent(i2);
                }
                while (i != i2) {
                    i = slotReader.parent(i);
                    i2 = slotReader.parent(i2);
                }
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final void runtimeCheck(boolean z, Function0<String> function0) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError(function0.invoke());
    }

    public static final Void composeRuntimeError(String str) {
        StringBuilder sb = new StringBuilder("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(str);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new ComposeRuntimeError(sb.toString());
    }

    public static final void composeImmediateRuntimeError(String str) {
        StringBuilder sb = new StringBuilder("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(str);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new ComposeRuntimeError(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$13(Invalidation invalidation, Invalidation invalidation2) {
        return Intrinsics.compare(invalidation.getLocation(), invalidation2.getLocation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier<?> applier) {
        int iGroupSize;
        SlotTable slotTable = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        Object[] objArr = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        boolean z3 = true;
        boolean z4 = true;
        int i5 = 1;
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object objNode = slotWriter.node(parent);
                int i6 = parent + 1;
                int iGroupSize2 = slotWriter.groupSize(parent);
                int iNodeCount = i;
                while (i6 < parent + iGroupSize2 && (iGroupSize = slotWriter.groupSize(i6) + i6) <= currentGroup) {
                    iNodeCount += slotWriter.isNode(i6) ? i3 : slotWriter.nodeCount(i6);
                    i6 = iGroupSize;
                }
                int iNodeCount2 = slotWriter.isNode(currentGroup) ? i4 : slotWriter.nodeCount(currentGroup);
                applier.down(objNode);
                applier.remove(iNodeCount, iNodeCount2);
                applier.up();
            }
        }
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime());
            SlotWriter.markGroup$default(slotWriterOpenWriter, objArr == true ? 1 : 0, i2, null);
            slotWriterOpenWriter.update(movableContentStateReference.getParameter());
            List<Anchor> listMoveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), i5, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            slotWriterOpenWriter.close(z4);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            if (!RecomposeScopeImpl.INSTANCE.hasAnchoredRecomposeScopes$runtime(slotTable, listMoveTo)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public final void recomposeScopeReleased(RecomposeScopeImpl p0) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public final void recordReadOf(Object p0) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public final InvalidationResult invalidate(RecomposeScopeImpl p0, Object p1) {
                    InvalidationResult invalidationResultInvalidate;
                    ControlledComposition controlledComposition2 = controlledComposition;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResultInvalidate = recomposeScopeOwner2.invalidate(p0, p1)) == null) {
                        invalidationResultInvalidate = InvalidationResult.IGNORED;
                    }
                    if (invalidationResultInvalidate != InvalidationResult.IGNORED) {
                        return invalidationResultInvalidate;
                    }
                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                    movableContentStateReference2.setInvalidations$runtime(CollectionsKt.plus((Collection<? extends Pair>) movableContentStateReference2.getInvalidations$runtime(), TuplesKt.to(p0, p1)));
                    return InvalidationResult.SCHEDULED;
                }
            };
            SlotWriter slotWriterOpenWriter2 = slotTable.openWriter();
            try {
                RecomposeScopeImpl.INSTANCE.adoptAnchoredScopes$runtime(slotWriterOpenWriter2, listMoveTo, recomposeScopeOwner);
                Unit unit = Unit.INSTANCE;
                return movableContentState;
            } finally {
                slotWriterOpenWriter2.close(z2);
            }
        } catch (Throwable th) {
            slotWriterOpenWriter.close(z);
            throw th;
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }
}
