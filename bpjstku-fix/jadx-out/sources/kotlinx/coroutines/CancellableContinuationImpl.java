package kotlinx.coroutines;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.AudioConfigUtil;
import defpackage.AudioConfigUtilExternalSyntheticLambda0;
import defpackage.AudioMimeInfoBuilder;
import defpackage.AutoValue_AudioEncoderConfigBuilder;
import defpackage.AutoValue_VideoEncoderConfig;
import defpackage.EncoderImplByteBufferInputExternalSyntheticLambda4;
import defpackage.EncoderImplByteBufferInputExternalSyntheticLambda5;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda0;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda1;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import defpackage.NegativeLatLongSavesIncorrectlyQuirk;
import defpackage.SignalEosOutputBufferNotComeQuirk;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.adjustCropRectForProblematicEncodeSize;
import defpackage.getByteBuffer;
import defpackage.getExtraSupportedSizes;
import defpackage.getSupportedPostviewSize;
import defpackage.getTextOn;
import defpackage.initSession;
import defpackage.isAvc;
import defpackage.isOppoPht110;
import defpackage.isSize;
import defpackage.isVideo;
import defpackage.isVivoY91i;
import defpackage.reachEndData;
import defpackage.resolveAudioMimeInfo;
import defpackage.scaleAndClampBitrate;
import defpackage.setCompatibleAudioProfile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0005j\u0002`\u00042\u00020\u0006B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0001J\u0015\u00100\u001a\n\u0018\u000102j\u0004\u0018\u0001`1H\u0016¢\u0006\u0002\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0002\b5J\u001f\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\u00172\u0006\u00108\u001a\u000209H\u0010¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010<\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0015\u0010=\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b>J\u0017\u0010?\u001a\u00020*2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020*0AH\u0082\bJ\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020D2\b\u00108\u001a\u0004\u0018\u000109J\u001e\u0010E\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\b\u00108\u001a\u0004\u0018\u000109H\u0002Jn\u0010H\u001a\u00020*\"\u0004\b\u0001\u0010I2K\u0010J\u001aG\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*0K2\u0006\u00108\u001a\u0002092\u0006\u0010N\u001a\u0002HI¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020!H\u0002J\b\u0010T\u001a\u00020!H\u0002J\n\u0010U\u001a\u0004\u0018\u00010\u0017H\u0001J\n\u0010V\u001a\u0004\u0018\u00010\u0019H\u0002J\r\u0010W\u001a\u00020*H\u0000¢\u0006\u0002\bXJ\u001b\u0010Y\u001a\u00020*2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0002\u0010\\J:\u0010]\u001a\u00020*2\u0006\u0010N\u001a\u00028\u00002#\u0010J\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*\u0018\u00010^H\u0016¢\u0006\u0002\u0010_Jn\u0010]\u001a\u00020*\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010`J\u001c\u0010a\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010b\u001a\u00020\nH\u0016J6\u0010a\u001a\u00020*2'\u0010C\u001a#\u0012\u0015\u0012\u0013\u0018\u000109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*0^j\u0002`cH\u0016¢\u0006\u0002\u0010dJ\u0015\u0010e\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0000¢\u0006\u0002\bfJ\u0010\u0010g\u001a\u00020*2\u0006\u0010C\u001a\u00020\u0017H\u0002J\u001a\u0010h\u001a\u00020*2\u0006\u0010C\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\nH\u0002J\u0086\u0001\u0010k\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0001\u0010I2\u0006\u0010\u001d\u001a\u00020l2\u0006\u0010m\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010K2\b\u0010n\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010oJv\u0010p\u001a\u00020*\"\u0004\b\u0001\u0010I2\u0006\u0010m\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2O\b\u0002\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0000¢\u0006\u0004\bq\u0010rJv\u0010s\u001a\u0004\u0018\u00010t\"\u0004\b\u0001\u0010I2\u0006\u0010m\u001a\u0002HI2\b\u0010n\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0002¢\u0006\u0002\u0010uJ\u0012\u0010v\u001a\u00020w2\b\u0010m\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010x\u001a\u00020*H\u0002J\r\u0010y\u001a\u00020*H\u0000¢\u0006\u0002\bzJ!\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010N\u001a\u00028\u00002\b\u0010n\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010{Jz\u0010T\u001a\u0004\u0018\u00010\u0017\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2\b\u0010n\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010|J\u0012\u0010}\u001a\u0004\u0018\u00010\u00172\u0006\u0010~\u001a\u000209H\u0016J\u0011\u0010\u007f\u001a\u00020*2\u0007\u0010\u0080\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010\u0081\u0001\u001a\u00020**\u00030\u0082\u00012\u0006\u0010N\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0083\u0001J\u0016\u0010\u0084\u0001\u001a\u00020**\u00030\u0082\u00012\u0006\u0010~\u001a\u000209H\u0016J\"\u0010\u0085\u0001\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u0001092\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0003\b\u0089\u0001J\t\u0010\u008a\u0001\u001a\u00020&H\u0016J\t\u0010\u008b\u0001\u001a\u00020&H\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004R\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016X\u0082\u0004R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006\u008c\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", RemoteConfigConstants.ResponseFieldKey.STATE, "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "isActive", "", "()Z", "isCompleted", "isCancelled", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "initCancellability", "", "isReusable", "resetStateReusable", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Lkotlinx/coroutines/internal/StackTraceElement;", "Ljava/lang/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "takeState", "takeState$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "cancel", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callCancelHandler", "handler", "Lkotlinx/coroutines/CancelHandler;", "callSegmentOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "callOnCancellation", "R", "onCancellation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "trySuspend", "tryResume", "getResult", "installParentHandle", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resume", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "invokeOnCancellation", FirebaseAnalytics.Param.INDEX, "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCancellationInternal", "invokeOnCancellationInternal$kotlinx_coroutines_core", "invokeOnCancellationImpl", "multipleHandlersError", "dispatchResume", "mode", "resumedState", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "idempotent", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "resumeImpl", "resumeImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/internal/Symbol;", "alreadyResumedError", "", "detachChildIfNonResuable", "detachChild", "detachChild$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "tryResumeWithException", "exception", "completeResume", "token", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "toString", "nameString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends AudioConfigUtilExternalSyntheticLambda0<T> implements MediaFormatMustNotUseFrameRateToFindEncoderQuirk<T>, CoroutineStackFrame, getByteBuffer {
    private static boolean INotificationSideChannel;
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentbindingInflater1;
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f1241a;
    private static int asBinder;
    private static int cancelAll;
    private static boolean onTransact;
    private final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final Continuation<T> g;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$f = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, -50, -56, -93, 54, 16, 18, -9, 30, -1, 18, 18, 6, -23, 43, 25, 5, 26, -4, -11, 50, 5, 22, -62, Base64.padSymbol, 46, 1, 24, 2, 19, 12, -17, 30, 37, 1, 5, 22, 19, -33, 57, -4, 19, 19, 5, 22, 19, 12, 10, 2, 11, 19, 5, 24, 10, 18, 11, 10, 18, 4, 12, 31, 0, 9, 31, -29, 47, 2, 14, 20, 5, 14, 14, 8, 33, 4, 21, -53, -1, 28, 46, 1, 24, 2, 19, 12, -17, 30, 37, 1, 5, 22, 19, -33, 57, -4, 19, 19, 5, 22, 19, 12, 10, 2, 11, 19, 5, 24, 10, 18, 11, 10, 18, 4, 12, 31, 0, 9, 31, -29, 47, 2, 14, 20, 5, 14, 14, 8, 33, 4, 21, -53};
    private static final int $$e = 181;
    private static final byte[] $$a = {67, -127, -109, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 249;
    private static int INotificationSideChannelDefault = 1;
    private static int cancel = 0;
    private static int notify = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~((~i) | i8)) | i7;
        int i10 = i2 | i8;
        int i11 = (~(i | i7 | i8)) | (~(i4 | i2));
        int i12 = i4 + i2 + i3 + (2049387148 * i6) + ((-609071723) * i5);
        int i13 = i12 * i12;
        int i14 = ((1483459036 * i4) - 1284505600) + (2005429323 * i2) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i3) + ((-243269632) * i6) + ((-895483904) * i5) + ((-1334837248) * i13);
        int i15 = ((i4 * 335895516) - 1139737737) + (i2 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i3 * 335896449) + (i6 * (-616405876)) + (i5 * 126640917) + (i13 * 2020605952);
        switch (i14 + (i15 * i15 * (-544210944))) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 4:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 5:
                return a(objArr);
            case 6:
                return g(objArr);
            default:
                return b(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 103 - r7
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r0 = kotlinx.coroutines.CancellableContinuationImpl.$$a
            int r9 = r9 * 52
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CancellableContinuationImpl.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 75
            int r7 = 78 - r7
            int r8 = r8 * 14
            int r8 = 84 - r8
            int r9 = r9 * 23
            int r9 = r9 + 53
            byte[] r0 = kotlinx.coroutines.CancellableContinuationImpl.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L30
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L30:
            int r7 = r7 + r8
            int r7 = r7 + (-13)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CancellableContinuationImpl.f(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final Continuation<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancel + 95;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        Continuation<T> continuation = this.g;
        int i5 = i3 + 27;
        cancel = i5 % 128;
        if (i5 % 2 == 0) {
            return continuation;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(Continuation<? super T> continuation, int i) {
        super(i);
        this.g = continuation;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = continuation.get$context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = getExtraSupportedSizes.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext get$context() {
        int i = 2 % 2;
        int i2 = cancel + 13;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 123;
        notify = i2 % 128;
        int i3 = i2 % 2;
        setCompatibleAudioProfile setcompatibleaudioprofile = (setCompatibleAudioProfile) TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(cancellableContinuationImpl);
        int i4 = notify + 17;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return setcompatibleaudioprofile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Object RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = cancel + 7;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Object obj = TuitionPaymentFragmentbindingInflater1.get(this);
        int i4 = notify + 31;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public boolean isActive() {
        int i = 2 % 2;
        int i2 = notify + 105;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        boolean z = RemoteActionCompatParcelizer() instanceof AutoValue_VideoEncoderConfig;
        int i4 = cancel + 35;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = notify + 103;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return !(RemoteActionCompatParcelizer() instanceof AutoValue_VideoEncoderConfig);
    }

    public void initCancellability() {
        int i = 2 % 2;
        int i2 = cancel + 69;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            cancel();
            throw null;
        }
        setCompatibleAudioProfile setcompatibleaudioprofileCancel = cancel();
        if (setcompatibleaudioprofileCancel != null && TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            setcompatibleaudioprofileCancel.dispose();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this, AutoValue_AudioEncoderConfigBuilder.INSTANCE);
        }
        int i3 = notify + 5;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean onTransact() {
        int i = 2 % 2;
        if (AudioMimeInfoBuilder.TuitionPaymentFragmentbindingInflater1(this.b)) {
            Continuation<T> continuation = this.g;
            Intrinsics.checkNotNull(continuation, "");
            if (EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder.get((EncoderImplByteBufferInputExternalSyntheticLambda4) continuation) != null) {
                int i2 = notify + 31;
                int i3 = i2 % 128;
                cancel = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 79;
                int i6 = i5 % 128;
                notify = i6;
                boolean z = i5 % 2 != 0;
                int i7 = i6 + 27;
                cancel = i7 % 128;
                if (i7 % 2 == 0) {
                    return z;
                }
                throw null;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r1
  0x003d: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v15 java.lang.Object) binds: [B:8:0x003a, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    public final boolean a() {
        Object obj;
        int i;
        int i2 = 2 % 2;
        int i3 = cancel + 57;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            obj = TuitionPaymentFragmentbindingInflater1.get(this);
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = 99 / 0;
            if (!(!(obj instanceof adjustCropRectForProblematicEncodeSize))) {
                if (((adjustCropRectForProblematicEncodeSize) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    i = notify + 59;
                    cancel = i % 128;
                    if (i % 2 != 0) {
                        TuitionPaymentFragmentbindingInflater1();
                        return true;
                    }
                    TuitionPaymentFragmentbindingInflater1();
                    return false;
                }
            }
        } else {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            obj = TuitionPaymentFragmentbindingInflater1.get(this);
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (!(!(obj instanceof adjustCropRectForProblematicEncodeSize))) {
                if (((adjustCropRectForProblematicEncodeSize) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    i = notify + 59;
                    cancel = i % 128;
                    if (i % 2 != 0) {
                        TuitionPaymentFragmentbindingInflater1();
                        return true;
                    }
                    TuitionPaymentFragmentbindingInflater1();
                    return false;
                }
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(this, 536870911);
        TuitionPaymentFragmentbindingInflater1.set(this, getExtraSupportedSizes.INSTANCE);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        int i = 2 % 2;
        int i2 = notify + 1;
        int i3 = i2 % 128;
        cancel = i3;
        if (i2 % 2 != 0) {
            boolean z = this.g instanceof CoroutineStackFrame;
            throw null;
        }
        Continuation<T> continuation = this.g;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        int i4 = i3 + 95;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final Object asInterface() {
        int i = 2 % 2;
        int i2 = notify + 119;
        cancel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i3 = notify + 111;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            return objRemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[SYNTHETIC] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        adjustCropRectForProblematicEncodeSize adjustcroprectforproblematicencodesize;
        int i = 0;
        CancellableContinuationImpl<?> cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i2 = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cancellableContinuationImpl);
            if (obj instanceof AutoValue_VideoEncoderConfig) {
                throw new IllegalStateException("Not completed".toString());
            }
            int i3 = cancel + 123;
            int i4 = i3 % 128;
            notify = i4;
            if (i3 % 2 == 0) {
                int i5 = 38 / i;
                if (!(obj instanceof isVivoY91i)) {
                    int i6 = i4 + 77;
                    cancel = i6 % 128;
                    int i7 = i6 % 2;
                    if (obj instanceof adjustCropRectForProblematicEncodeSize) {
                        adjustcroprectforproblematicencodesize = (adjustCropRectForProblematicEncodeSize) obj;
                        if (!adjustcroprectforproblematicencodesize.b()) {
                            throw new IllegalStateException("Must be called at most once".toString());
                        }
                        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl, obj, adjustCropRectForProblematicEncodeSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(adjustcroprectforproblematicencodesize, null, null, null, null, th, 15))) {
                            adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellableContinuationImpl, th);
                            return null;
                        }
                    } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl, obj, new adjustCropRectForProblematicEncodeSize(obj, null, null, null, th, 14, null))) {
                    }
                    i = 0;
                }
            } else if (!(obj instanceof isVivoY91i)) {
                int i8 = i4 + 77;
                cancel = i8 % 128;
                int i9 = i8 % 2;
                if (obj instanceof adjustCropRectForProblematicEncodeSize) {
                    adjustcroprectforproblematicencodesize = (adjustCropRectForProblematicEncodeSize) obj;
                    if (!adjustcroprectforproblematicencodesize.b()) {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl, obj, adjustCropRectForProblematicEncodeSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(adjustcroprectforproblematicencodesize, null, null, null, null, th, 15))) {
                        adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellableContinuationImpl, th);
                        return null;
                    }
                } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl, obj, new adjustCropRectForProblematicEncodeSize(obj, null, null, null, th, 14, null))) {
                }
                i = 0;
            }
            return null;
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        long j;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = f1241a;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 31339), 2994 - (Process.myTid() >> 22), Color.green(0) + 17, 1182129903, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 59;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - View.MeasureSpec.getSize(0)), TextUtils.indexOf((CharSequence) "", '0') + 254, ExpandableListView.getPackedPositionType(0L) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (INotificationSideChannel) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i6 = $10 + 75;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 + 1) / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] + iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - Color.blue(0)), 3085 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2146875848, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        j = 0;
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - TextUtils.indexOf("", "")), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3085, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), -2146875848, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    } else {
                        j = 0;
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onTransact) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i7 = $10 + 125;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 3085 - Color.green(0), MotionEvent.axisFromString("") + 27, -2146875848, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr6);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        if (!cancellableContinuationImpl.onTransact()) {
            return false;
        }
        Continuation<T> continuation = cancellableContinuationImpl.g;
        Intrinsics.checkNotNull(continuation, "");
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder;
        int i2 = notify + 51;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(encoderImplByteBufferInputExternalSyntheticLambda4);
            if (Intrinsics.areEqual(obj, EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1)) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder, encoderImplByteBufferInputExternalSyntheticLambda4, EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    int i4 = notify + 79;
                    cancel = i4 % 128;
                    return Boolean.valueOf(!(i4 % 2 != 0));
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(EncoderImplByteBufferInputExternalSyntheticLambda4.asBinder, encoderImplByteBufferInputExternalSyntheticLambda4, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final boolean TuitionPaymentFragmentbindingInflater1(Throwable th) throws Throwable {
        Object obj;
        CancellableContinuationImpl<T> cancellableContinuationImpl;
        boolean z;
        int i = 2 % 2;
        int i2 = notify + 53;
        cancel = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AutoValue_VideoEncoderConfig)) {
                return false;
            }
            cancellableContinuationImpl = this;
            if ((obj instanceof isAvc) || !(!(obj instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda1))) {
                int i3 = cancel + 37;
                notify = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, this, obj, new NegativeLatLongSavesIncorrectlyQuirk(cancellableContinuationImpl, th, z)));
        int i5 = cancel + 75;
        int i6 = i5 % 128;
        notify = i6;
        if (i5 % 2 == 0) {
            boolean z2 = ((AutoValue_VideoEncoderConfig) obj) instanceof isAvc;
            obj2.hashCode();
            throw null;
        }
        AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) obj;
        if (autoValue_VideoEncoderConfig instanceof isAvc) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1044552076, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, (isAvc) obj, th}, 1044552079, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
        } else if (autoValue_VideoEncoderConfig instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda1) {
            int i7 = i6 + 67;
            cancel = i7 % 128;
            if (i7 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2((EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?>) obj);
                int i8 = 64 / 0;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2((EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?>) obj);
            }
        }
        asBinder();
        b(this.b);
        return true;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = notify + 7;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        if (!((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 889515704, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, th}, -889515699, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1())).booleanValue()) {
            TuitionPaymentFragmentbindingInflater1(th);
            asBinder();
        } else {
            int i4 = notify + 51;
            cancel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?> encoderImplMediaCodecCallbackExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = cancel + 19;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this) & 536870911;
        if (i4 != 536870911) {
            int i5 = notify + 59;
            cancel = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, get$context());
                    int i6 = 92 / 0;
                } else {
                    encoderImplMediaCodecCallbackExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, get$context());
                }
                return;
            } catch (Throwable th) {
                AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(get$context(), new CompletionHandlerException("Exception in invokeOnCancellation handler for ".concat(String.valueOf(this)), th));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Throwable th, R r) {
        int i = 2 % 2;
        int i2 = notify + 89;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        try {
            function3.invoke(th, r, get$context());
            int i4 = cancel + 117;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(get$context(), new CompletionHandlerException("Exception in resume onCancellation handler for ".concat(String.valueOf(this)), th2));
        }
    }

    public Throwable TuitionPaymentFragmentbindingInflater1(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        int i = 2 % 2;
        int i2 = cancel + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
        CancellationException cancellationExceptionS_ = videoMimeInfoBuilder.s_();
        int i4 = cancel + 119;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return cancellationExceptionS_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        int i2 = 2 % 2;
        int i3 = notify + 33;
        int i4 = i3 % 128;
        cancel = i4;
        int i5 = i3 % 2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i4 + 61;
        notify = i6 % 128;
        int i7 = i6 % 2;
        do {
            i = atomicIntegerFieldUpdater.get(cancellableContinuationImpl);
            int i8 = i >> 29;
            if (i8 != 0) {
                int i9 = cancel + 89;
                notify = i9 % 128;
                int i10 = i9 % 2;
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(cancellableContinuationImpl, i, (536870911 & i) + 536870912));
        int i11 = notify + 81;
        cancel = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private final boolean INotificationSideChannel() {
        int i;
        int i2 = 2 % 2;
        int i3 = notify + 111;
        int i4 = i3 % 128;
        cancel = i4;
        int i5 = i3 % 2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i6 = i4 + 79;
        notify = i6 % 128;
        int i7 = i6 % 2;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i8 = i >> 29;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                int i9 = notify;
                int i10 = i9 + 87;
                cancel = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 99;
                cancel = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
        } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareAndSet(this, i, (536870911 & i) + BasicMeasure.EXACTLY));
        return true;
    }

    public final Object getResult() {
        VideoMimeInfoBuilder videoMimeInfoBuilder;
        int i = 2 % 2;
        int i2 = cancel + 19;
        notify = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact();
        if (((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1113051139, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1113051141, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1())).booleanValue()) {
            if (((setCompatibleAudioProfile) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1224171898, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1224171898, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1())) == null) {
                cancel();
            }
            Object obj = null;
            if (zOnTransact) {
                int i4 = notify + 117;
                cancel = i4 % 128;
                if (i4 % 2 != 0) {
                    b();
                    obj.hashCode();
                    throw null;
                }
                b();
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = notify + 1;
            cancel = i5 % 128;
            if (i5 % 2 == 0) {
                return coroutine_suspended;
            }
            obj.hashCode();
            throw null;
        }
        if (zOnTransact) {
            int i6 = notify + 47;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            b();
        }
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (!(!(objRemoteActionCompatParcelizer instanceof isVivoY91i))) {
            Throwable th = ((isVivoY91i) objRemoteActionCompatParcelizer).TuitionPaymentFragmentbindingInflater1;
            if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                throw reachEndData.TuitionPaymentFragmentbindingInflater1(th, this);
            }
            throw th;
        }
        if (!AudioMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b) || (videoMimeInfoBuilder = (VideoMimeInfoBuilder) get$context().get(VideoMimeInfoBuilder.b)) == null || videoMimeInfoBuilder.r_()) {
            return TuitionPaymentFragmentbindingInflater1(objRemoteActionCompatParcelizer);
        }
        CancellationException cancellationExceptionS_ = videoMimeInfoBuilder.s_();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancellationExceptionS_);
        if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            throw reachEndData.TuitionPaymentFragmentbindingInflater1(cancellationExceptionS_, this);
        }
        throw cancellationExceptionS_;
    }

    private final setCompatibleAudioProfile cancel() {
        int i = 2 % 2;
        int i2 = notify + 1;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) get$context().get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder == null) {
            int i3 = notify + 61;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        setCompatibleAudioProfile setcompatibleaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(videoMimeInfoBuilder, true, new isOppoPht110(this));
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this, null, setcompatibleaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return setcompatibleaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final void b() {
        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 83;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        Continuation<T> continuation = this.g;
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4 = null;
        if (continuation instanceof EncoderImplByteBufferInputExternalSyntheticLambda4) {
            int i5 = i2 + 13;
            int i6 = i5 % 128;
            cancel = i6;
            if (i5 % 2 != 0) {
                encoderImplByteBufferInputExternalSyntheticLambda4.hashCode();
                throw null;
            }
            encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuation;
            int i7 = i6 + 19;
            notify = i7 % 128;
            int i8 = i7 % 2;
        }
        if (encoderImplByteBufferInputExternalSyntheticLambda4 == null || (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this)) == null) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i9 = notify + 115;
        cancel = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 2 % 4;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        int i = 2 % 2;
        int i2 = notify + 69;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(result, (MediaFormatMustNotUseFrameRateToFindEncoderQuirk<?>) this), this.b, null);
            int i3 = 93 / 0;
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(result, (MediaFormatMustNotUseFrameRateToFindEncoderQuirk<?>) this), this.b, null);
        }
        int i4 = notify + 5;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final void b(T t, Function1<? super Throwable, Unit> function1) {
        isVideo isvideo;
        int i = 2 % 2;
        int i2 = cancel + 93;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.b;
        if (function1 != null) {
            isvideo = new isVideo(function1);
        } else {
            int i5 = notify + 57;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            isvideo = null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(t, i4, isvideo);
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final <R extends T> void b(R r, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        int i = 2 % 2;
        int i2 = notify + 61;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(r, this.b, function3);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // defpackage.getByteBuffer
    public final void b(EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?> encoderImplMediaCodecCallbackExternalSyntheticLambda1, int i) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        int i3 = 2 % 2;
        int i4 = notify + 43;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = 73 / 0;
        } else {
            atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        int i6 = cancel + 105;
        notify = i6 % 128;
        int i7 = i6 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(encoderImplMediaCodecCallbackExternalSyntheticLambda1);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) throws Throwable {
        int i = 2 % 2;
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof getExtraSupportedSizes) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof isAvc) || (obj2 instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda1)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, obj2);
            } else {
                boolean z = obj2 instanceof isVivoY91i;
                if (z) {
                    isVivoY91i isvivoy91i = (isVivoY91i) obj2;
                    if (!isvivoy91i.b()) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, obj2);
                        int i2 = cancel + 7;
                        notify = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    if (obj2 instanceof NegativeLatLongSavesIncorrectlyQuirk) {
                        if (!z) {
                            int i4 = cancel + 95;
                            notify = i4 % 128;
                            if (i4 % 2 == 0) {
                                int i5 = 24 / 0;
                            }
                            isvivoy91i = null;
                        }
                        Throwable th = isvivoy91i != null ? isvivoy91i.TuitionPaymentFragmentbindingInflater1 : null;
                        if (obj instanceof isAvc) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1044552076, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, (isAvc) obj, th}, 1044552079, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "");
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2((EncoderImplMediaCodecCallbackExternalSyntheticLambda1<?>) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof adjustCropRectForProblematicEncodeSize) {
                    adjustCropRectForProblematicEncodeSize adjustcroprectforproblematicencodesize = (adjustCropRectForProblematicEncodeSize) obj2;
                    if (adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, obj2);
                    }
                    if (obj instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda1) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "");
                    isAvc isavc = (isAvc) obj;
                    if (adjustcroprectforproblematicencodesize.b()) {
                        int i6 = notify + 87;
                        cancel = i6 % 128;
                        int i7 = i6 % 2;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1044552076, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, isavc, adjustcroprectforproblematicencodesize.TuitionPaymentFragmentbindingInflater1}, 1044552079, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
                        return;
                    }
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, this, obj2, adjustCropRectForProblematicEncodeSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(adjustcroprectforproblematicencodesize, null, isavc, null, null, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda1) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "");
                    if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, this, obj2, new adjustCropRectForProblematicEncodeSize(obj2, (isAvc) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, Object obj2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(obj);
        sb.append(", already has ");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final void b(int i) {
        int i2 = 2 % 2;
        int i3 = cancel + 9;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
            if (INotificationSideChannel()) {
                return;
            }
        } else if (INotificationSideChannel()) {
            return;
        }
        AudioMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, i);
        int i5 = cancel + 51;
        notify = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    private static <R> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig, R r, int i, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj) {
        isAvc isavc;
        int i2 = 2 % 2;
        int i3 = cancel + 103;
        notify = i3 % 128;
        int i4 = i3 % 2;
        if (r instanceof isVivoY91i) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else if (!AudioMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i)) {
            int i5 = notify + 67;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            if (obj != null) {
                if (function3 == null || (autoValue_VideoEncoderConfig instanceof isAvc) || obj != null) {
                    if (autoValue_VideoEncoderConfig instanceof isAvc) {
                        isavc = (isAvc) autoValue_VideoEncoderConfig;
                    } else {
                        isavc = null;
                    }
                    return new adjustCropRectForProblematicEncodeSize(r, isavc, function3, obj, null, 16, null);
                }
            }
        } else {
            if (function3 == null) {
            }
            if (autoValue_VideoEncoderConfig instanceof isAvc) {
                isavc = (isAvc) autoValue_VideoEncoderConfig;
            } else {
                isavc = null;
            }
            return new adjustCropRectForProblematicEncodeSize(r, isavc, function3, obj, null, 16, null);
        }
        return r;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Object obj;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        Object obj2 = objArr[1];
        Object obj3 = objArr[2];
        Function3 function3 = (Function3) objArr[3];
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        do {
            obj = atomicReferenceFieldUpdater.get(cancellableContinuationImpl);
            if (!(obj instanceof AutoValue_VideoEncoderConfig)) {
                if (obj instanceof adjustCropRectForProblematicEncodeSize) {
                    int i2 = cancel + 25;
                    notify = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 98 / 0;
                        if (obj3 != null) {
                            if (((adjustCropRectForProblematicEncodeSize) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2 == obj3) {
                                scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                return isSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            }
                        }
                    } else if (obj3 != null) {
                        if (((adjustCropRectForProblematicEncodeSize) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2 == obj3) {
                            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            return isSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        }
                    }
                }
                int i4 = cancel + 57;
                notify = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 62 / 0;
                }
                return null;
            }
            int i6 = cancel + 41;
            notify = i6 % 128;
            int i7 = i6 % 2;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, cancellableContinuationImpl, obj, TuitionPaymentFragmentspecialinlinedviewModeldefault1((AutoValue_VideoEncoderConfig) obj, obj2, cancellableContinuationImpl.b, function3, obj3)));
        cancellableContinuationImpl.asBinder();
        return isSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 101;
        notify = i2 % 128;
        int i3 = i2 % 2;
        if (onTransact()) {
            return;
        }
        int i4 = notify + 73;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        TuitionPaymentFragmentbindingInflater1();
        if (i5 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 39;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setCompatibleAudioProfile setcompatibleaudioprofile = (setCompatibleAudioProfile) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1224171898, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1224171898, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
        if (setcompatibleaudioprofile != null) {
            setcompatibleaudioprofile.dispose();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(this, AutoValue_AudioEncoderConfigBuilder.INSTANCE);
        } else {
            int i3 = notify + 75;
            cancel = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final <R extends T> Object b(R r, Object obj, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        int i = 2 % 2;
        int i2 = notify + 101;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda0) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 1595944854, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, r, null, function3}, -1595944850, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
        int i4 = notify + 87;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return encoderImplMediaCodecCallbackExternalSyntheticLambda0;
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        int i = 2 % 2;
        Object[] objArr = {this, new isVivoY91i(th, false, 2, null), null, null};
        EncoderImplMediaCodecCallbackExternalSyntheticLambda0 encoderImplMediaCodecCallbackExternalSyntheticLambda0 = (EncoderImplMediaCodecCallbackExternalSyntheticLambda0) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 1595944854, getTextOn.TuitionPaymentFragmentbindingInflater1(), objArr, -1595944850, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
        int i2 = notify + 95;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return encoderImplMediaCodecCallbackExternalSyntheticLambda0;
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        int i = 2 % 2;
        int i2 = notify + 61;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b(this.b);
        } else {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            b(this.b);
            throw null;
        }
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineDispatcher coroutineDispatcher, T t) {
        EncoderImplByteBufferInputExternalSyntheticLambda4 encoderImplByteBufferInputExternalSyntheticLambda4;
        CoroutineDispatcher coroutineDispatcher2;
        int i;
        int i2 = 2 % 2;
        Continuation<T> continuation = this.g;
        if (continuation instanceof EncoderImplByteBufferInputExternalSyntheticLambda4) {
            int i3 = cancel + 55;
            notify = i3 % 128;
            int i4 = i3 % 2;
            encoderImplByteBufferInputExternalSyntheticLambda4 = (EncoderImplByteBufferInputExternalSyntheticLambda4) continuation;
        } else {
            int i5 = cancel + 11;
            notify = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 3;
            }
            encoderImplByteBufferInputExternalSyntheticLambda4 = null;
        }
        if (encoderImplByteBufferInputExternalSyntheticLambda4 != null) {
            int i7 = notify + 19;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            coroutineDispatcher2 = encoderImplByteBufferInputExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            coroutineDispatcher2 = null;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            int i9 = notify + 107;
            cancel = i9 % 128;
            int i10 = i9 % 2;
            i = 4;
        } else {
            i = this.b;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(t, i, null);
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final <T> T TuitionPaymentFragmentbindingInflater1(Object obj) {
        int i = 2 % 2;
        if (obj instanceof adjustCropRectForProblematicEncodeSize) {
            int i2 = cancel + 9;
            notify = i2 % 128;
            int i3 = i2 % 2;
            obj = (T) ((adjustCropRectForProblematicEncodeSize) obj).b;
        }
        int i4 = cancel + 117;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return (T) obj;
    }

    public String toString() {
        String str;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        sb.append('(');
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1((Continuation<?>) this.g));
        sb.append("){");
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (objRemoteActionCompatParcelizer instanceof AutoValue_VideoEncoderConfig) {
            int i2 = cancel + 113;
            notify = i2 % 128;
            str = "Active";
            if (i2 % 2 == 0) {
                int i3 = 75 / 0;
            }
        } else if (objRemoteActionCompatParcelizer instanceof NegativeLatLongSavesIncorrectlyQuirk) {
            int i4 = notify + 11;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
        String string = sb.toString();
        int i6 = cancel + 107;
        notify = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 92 / 0;
        }
        return string;
    }

    protected String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 47;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 75;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return "CancellableContinuation";
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        isAvc isavc = (isAvc) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
            int iMyPid = (Process.myPid() >> 22) + 10;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[19] - 1), bArr[5], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, maximumFlingVelocity, iMyPid, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
            int iRed = Color.red(0) + 10;
            byte[] bArr2 = $$a;
            byte b = bArr2[10];
            byte b2 = bArr2[5];
            Object[] objArr6 = new Object[1];
            c(b, b2, b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, absoluteGravity, iRed, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iResolveSize = 876 - View.resolveSize(0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b3, b4, b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iResolveSize, iIndexOf, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i2 = (int) Runtime.getRuntime().totalMemory();
            int i3 = (((-758182276) + (((~((~i2) | 414749295)) | 50800640) * 446)) + (((~(i2 | 465549935)) | 404258884) * 446)) - 2011871354;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr2[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(null, null, 127 - View.MeasureSpec.getMode(0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(null, null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(null, null, 127 - ExpandableListView.getPackedPositionType(0L), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, cancellableContinuationImpl)).intValue()), 1100846982};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[26];
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                f(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr3[61];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                f(b7, b8, b8, objArr15);
                objArr2 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0');
                        int i6 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        c(b9, b10, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf2, i6, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(null, null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(null, null, View.MeasureSpec.getSize(0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                            int gidForName = Process.getGidForName("") + 11;
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[10];
                            byte b12 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            c(b11, b12, b12, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, iResolveOpacity, gidForName, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iAlpha = 10 - Color.alpha(0);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c((byte) (bArr5[19] - 1), bArr5[5], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, scrollDefaultDelay, iAlpha, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i7 = notify + 67;
                        cancel = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 4 / 3;
                        }
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        int i9 = ((int[]) objArr2[2])[0];
        int i10 = ((int[]) objArr2[0])[0];
        if (i10 != i9) {
            throw new RuntimeException(String.valueOf(i10));
        }
        int i11 = ((int[]) objArr2[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i12 = (-713749560) + (((~((-761809742) | iMaxMemory)) | 721499512) * (-318));
        int i13 = ~(721499512 | iMaxMemory);
        int i14 = ~iMaxMemory;
        int i15 = i11 + i12 + ((i13 | (~((-33633329) | i14))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMaxMemory | (-33633329))) | (~(795443069 | i14))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr21[1])[0] = i17 ^ (i17 << 5);
        int i18 = cancel + 81;
        notify = i18 % 128;
        int i19 = i18 % 2;
        try {
            isavc.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
            return null;
        } catch (Throwable th3) {
            AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cancellableContinuationImpl.get$context(), new CompletionHandlerException("Exception in invokeOnCancellation handler for ".concat(String.valueOf(cancellableContinuationImpl)), th3));
            return null;
        }
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) objArr[0];
        int i = 2 % 2;
        Throwable thB = super.b(objArr[1]);
        Object obj = null;
        if (thB == null) {
            int i2 = cancel + 79;
            notify = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = cancel + 95;
        notify = i4 % 128;
        int i5 = i4 % 2;
        Continuation<T> continuation = cancellableContinuationImpl.g;
        if (!scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return thB;
        }
        int i6 = notify + 103;
        int i7 = i6 % 128;
        cancel = i7;
        if (i6 % 2 != 0) {
            boolean z = continuation instanceof CoroutineStackFrame;
            obj.hashCode();
            throw null;
        }
        if (continuation instanceof CoroutineStackFrame) {
            return reachEndData.TuitionPaymentFragmentbindingInflater1(thB, (CoroutineStackFrame) continuation);
        }
        int i8 = i7 + 45;
        notify = i8 % 128;
        int i9 = i8 % 2;
        return thB;
    }

    public static /* synthetic */ Unit b(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = notify + 59;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(th);
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 45;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
    public final void b(Function1<? super Throwable, Unit> function1) throws Throwable {
        int i = 2 % 2;
        CancellableContinuationImpl<T> cancellableContinuationImpl = this;
        isAvc.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new isAvc.TuitionPaymentFragmentbindingInflater1(function1);
        if (!(cancellableContinuationImpl instanceof CancellableContinuationImpl)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        int i2 = cancel + 105;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            cancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        cancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
    }

    public final <R> void TuitionPaymentFragmentspecialinlinedviewModeldefault2(R r, int i, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        int i2 = 2 % 2;
        int i3 = cancel + 51;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
            int i4 = 89 / 0;
        } else {
            atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        }
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AutoValue_VideoEncoderConfig)) {
                if (obj instanceof NegativeLatLongSavesIncorrectlyQuirk) {
                    int i5 = notify + 113;
                    cancel = i5 % 128;
                    int i6 = i5 % 2;
                    NegativeLatLongSavesIncorrectlyQuirk negativeLatLongSavesIncorrectlyQuirk = (NegativeLatLongSavesIncorrectlyQuirk) obj;
                    if (negativeLatLongSavesIncorrectlyQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        if (function3 != null) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3(function3, negativeLatLongSavesIncorrectlyQuirk.TuitionPaymentFragmentbindingInflater1, r);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(r)).toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentbindingInflater1, this, obj, TuitionPaymentFragmentspecialinlinedviewModeldefault1((AutoValue_VideoEncoderConfig) obj, r, i, function3, null)));
        asBinder();
        b(i);
    }

    static {
        cancelAll = 0;
        d();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
        TuitionPaymentFragmentbindingInflater1 = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
        int i = INotificationSideChannelDefault + 37;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    private final boolean g(Throwable th) {
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 889515704, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, th}, -889515699, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1())).booleanValue();
    }

    private final setCompatibleAudioProfile g() {
        return (setCompatibleAudioProfile) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1224171898, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1224171898, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    public final <R> EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1(R r, Object obj, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3) {
        return (EncoderImplMediaCodecCallbackExternalSyntheticLambda0) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 1595944854, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, r, obj, function3}, -1595944850, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    private final boolean cancelAll() {
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1113051139, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1113051141, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1())).booleanValue();
    }

    public final void TuitionPaymentFragmentbindingInflater1(isAvc isavc, Throwable th) throws Throwable {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1044552076, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, isavc, th}, 1044552079, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) throws Throwable {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 1529078894, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, th}, -1529078893, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // defpackage.AudioConfigUtilExternalSyntheticLambda0
    public final Throwable b(Object obj) {
        return (Throwable) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), 386393544, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, obj}, -386393538, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 83;
        cancel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 87;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return null;
    }

    static void d() {
        f1241a = new char[]{47405, 47392, 47402, 47452, 47455, 47397, 47328, 47451, 47419, 47445, 47450, 47401, 47393, 47371, 47394, 47403, 47395, 47454, 47420, 47373, 47448, 47418, 47398, 47449, 47396, 47399, 47366};
        asBinder = 2047719630;
        onTransact = true;
        INotificationSideChannel = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = r8 + 67
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = kotlinx.coroutines.CancellableContinuationImpl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CancellableContinuationImpl.$$g(int, int, byte):java.lang.String");
    }
}
