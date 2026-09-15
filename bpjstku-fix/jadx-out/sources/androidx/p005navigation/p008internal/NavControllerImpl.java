package androidx.p005navigation.p008internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.p005navigation.FloatingWindow;
import androidx.p005navigation.NavArgument;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavBackStackEntryState;
import androidx.p005navigation.NavController;
import androidx.p005navigation.NavControllerViewModel;
import androidx.p005navigation.NavDeepLinkRequest;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavGraph;
import androidx.p005navigation.NavOptions;
import androidx.p005navigation.NavOptionsBuilder;
import androidx.p005navigation.NavOptionsBuilderKt;
import androidx.p005navigation.NavUriKt;
import androidx.p005navigation.Navigator;
import androidx.p005navigation.NavigatorProvider;
import androidx.p005navigation.SupportingPane;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import defpackage.CameraController2;
import defpackage.EncoderImplExternalSyntheticLambda14;
import defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl;
import defpackage.lambdastop3androidxcameravideointernalencoderEncoderImpl;
import defpackage.setMediaCodecPaused;
import defpackage.stopMediaCodec;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0089\u00022\u00020\u0001:\u0002\u0089\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u0018\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\u00050\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001b\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001a2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\u00050\u0015H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060\u001dR\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0001¢\u0006\u0004\b\"\u0010#J9\u0010$\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060\u001dR\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060\u001dR\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020*H\u0000¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u00101J'\u0010.\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u00102J'\u0010.\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u00104J7\u0010.\u001a\u00020\u001a\"\b\b\u0000\u00105*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u00107J1\u0010.\u001a\u00020\u001a\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b.\u00108J)\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\u001a2\b\b\u0002\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u00102J3\u0010\u001b\u001a\u00020\u001a\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u001a2\b\b\u0002\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u00108J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u00104J9\u00109\u001a\u00020\u001a2\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00102\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0000¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b;\u0010<J1\u0010?\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u001a2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020>0=H\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u000203H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u000200H\u0000¢\u0006\u0004\bA\u0010CJ'\u0010A\u001a\u00020\u001a\"\b\b\u0000\u00105*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0000¢\u0006\u0004\bA\u0010DJ!\u0010A\u001a\u00020\u001a\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\bA\u0010EJ\u0017\u0010F\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u000200H\u0000¢\u0006\u0004\bF\u0010CJ\u0017\u0010F\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u000203H\u0000¢\u0006\u0004\bF\u0010BJ\u000f\u0010G\u001a\u00020\u001aH\u0000¢\u0006\u0004\bG\u0010/J\u000f\u0010H\u001a\u00020\u0005H\u0000¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0001¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020L2\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0000¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0000¢\u0006\u0004\bO\u0010PJ\u0019\u0010R\u001a\u0004\u0018\u0001032\u0006\u0010\u0003\u001a\u00020QH\u0000¢\u0006\u0004\bR\u0010SJ%\u0010T\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u0002002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\bT\u0010UJ5\u0010V\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u0002002\u0006\u0010\u0012\u001a\u00020\u001a2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\bV\u0010WJ\u0019\u0010T\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u000203H\u0000¢\u0006\u0004\bT\u0010XJ\u000f\u0010Y\u001a\u00020LH\u0001¢\u0006\u0004\bY\u0010ZJ!\u0010[\u001a\u000203\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b[\u0010\\J\u001b\u0010_\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060]j\u0002`^H\u0000¢\u0006\u0004\b_\u0010`J%\u0010_\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060]j\u0002`^2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b_\u0010aJ/\u0010_\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060]j\u0002`^2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b_\u0010bJ\u0017\u0010_\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020cH\u0000¢\u0006\u0004\b_\u0010dJ!\u0010_\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b_\u0010eJ+\u0010_\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b_\u0010fJ;\u0010_\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b_\u0010gJ'\u0010h\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0002¢\u0006\u0004\bh\u0010iJ;\u0010j\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002002\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010j\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\bj\u0010BJA\u0010l\u001a\u00020\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\bl\u0010mJ%\u0010n\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002¢\u0006\u0004\bn\u0010oJ?\u0010p\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u0006\u0010\u0012\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0002¢\u0006\u0004\bp\u0010qJ0\u0010_\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u0002032\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\bsH\u0000¢\u0006\u0004\b_\u0010tJ-\u0010_\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u0002032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b_\u0010uJ:\u0010_\u001a\u00020\u0005\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\bsH\u0000¢\u0006\u0004\b_\u0010vJ7\u0010_\u001a\u00020\u0005\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b_\u0010wJ\u0017\u0010x\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0000¢\u0006\u0004\bx\u0010yJ\u001f\u0010z\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0000¢\u0006\u0004\bz\u0010PJ\u0017\u0010|\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020{H\u0001¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020~H\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010\u0003\u001a\u000200H\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u000200H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u000203H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001J*\u0010\u0084\u0001\u001a\u00020\t\"\b\b\u0000\u00105*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001J$\u0010\u0084\u0001\u001a\u00020\t\"\b\b\u0000\u00105*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0088\u0001R\u001f\u0010\u0089\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R/\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0096\u0001\u001a\u00030\u0093\u00018G¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0097\u0001\u001a\u0004\u0018\u00010L8\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010Z\"\u0006\b\u009a\u0001\u0010\u009b\u0001R'\u0010\u009d\u0001\u001a\u00020L2\u0006\u0010\u0003\u001a\u00020L8A@AX\u0080\u000e¢\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010Z\"\u0005\bM\u0010\u009b\u0001R/\u0010\u009e\u0001\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010y\"\u0005\b¡\u0001\u0010PR6\u0010£\u0001\u001a\u000f\u0012\b\u0012\u00060 j\u0002`!\u0018\u00010¢\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R%\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\t0=8\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R,\u0010®\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u00ad\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R,\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100²\u00018AX\u0081\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R,\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u00ad\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010¯\u0001\u001a\u0006\b¸\u0001\u0010±\u0001R,\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100²\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010´\u0001\u001a\u0006\bº\u0001\u0010¶\u0001R,\u0010¼\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R-\u0010Á\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030À\u00010»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010½\u0001\u001a\u0006\bÂ\u0001\u0010¿\u0001R.\u0010Ã\u0001\u001a\u0011\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u0001030»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010½\u0001\u001a\u0006\bÄ\u0001\u0010¿\u0001R2\u0010Å\u0001\u001a\u0015\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010½\u0001\u001a\u0006\bÆ\u0001\u0010¿\u0001R-\u0010Ç\u0001\u001a\u0004\u0018\u00010{2\b\u0010\u0003\u001a\u0004\u0018\u00010{8\u0001@BX\u0081\u000e¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R,\u0010Ì\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R%\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020*0Ò\u00018\u0001X\u0081\u0004¢\u0006\u000f\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0005\bÕ\u0001\u0010KR*\u0010×\u0001\u001a\u00030Ö\u00018A@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R \u0010Þ\u0001\u001a\u00030Ý\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R*\u0010ã\u0001\u001a\u00030â\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R+\u0010ë\u0001\u001a\u00030â\u00012\u0007\u0010\u0003\u001a\u00030â\u00018A@AX\u0080\u000e¢\u0006\u0010\u001a\u0006\bé\u0001\u0010æ\u0001\"\u0006\bê\u0001\u0010è\u0001R8\u0010ì\u0001\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\u0012\b\u0012\u00060\u001dR\u00020\u00020»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\bì\u0001\u0010½\u0001\u001a\u0006\bí\u0001\u0010¿\u0001R<\u0010î\u0001\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R<\u0010ô\u0001\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\bô\u0001\u0010ï\u0001\u001a\u0006\bõ\u0001\u0010ñ\u0001\"\u0006\bö\u0001\u0010ó\u0001R,\u0010÷\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a0»\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010½\u0001\u001a\u0006\bø\u0001\u0010¿\u0001R\u0019\u0010ù\u0001\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u001e\u0010û\u0001\u001a\t\u0012\u0004\u0012\u00020\t0Ò\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bû\u0001\u0010Ô\u0001R\u0019\u0010þ\u0001\u001a\u0004\u0018\u00010\u000f8AX\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ý\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R&\u0010\u0083\u0002\u001a\t\u0012\u0004\u0012\u00020\t0\u0082\u00028\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0019\u0010\u0088\u0002\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010\u0080\u0002"}, d2 = {"Landroidx/navigation/internal/NavControllerImpl;", "", "Landroidx/navigation/NavController;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V", "Landroidx/navigation/NavBackStackEntry;", "linkChildToParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "unlinkChildFromParent$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavOptions;", "p2", "Landroidx/navigation/Navigator$Extras;", "p3", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p4", "navigateInternal$navigation_runtime_release", "(Landroidx/navigation/Navigator;Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Lkotlin/jvm/functions/Function1;)V", "", "popBackStackInternal$navigation_runtime_release", "(Landroidx/navigation/Navigator;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "push$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "createBackStackEntry$navigation_runtime_release", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "pop$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function0;)V", "markTransitionComplete$navigation_runtime_release", "(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "prepareForTransition$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "addOnDestinationChangedListener$navigation_runtime_release", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "removeOnDestinationChangedListener$navigation_runtime_release", "popBackStack$navigation_runtime_release", "()Z", "", "(IZ)Z", "(IZZ)Z", "", "(Ljava/lang/String;ZZ)Z", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;ZZ)Z", "(Ljava/lang/Object;ZZ)Z", "executePopOperations$navigation_runtime_release", "(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z", "popBackStackFromNavigator$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/collections/ArrayDeque;", "Landroidx/navigation/NavBackStackEntryState;", "popEntryFromBackStack$navigation_runtime_release", "(Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/ArrayDeque;)V", "clearBackStack$navigation_runtime_release", "(Ljava/lang/String;)Z", "(I)Z", "(Lkotlin/reflect/KClass;)Z", "(Ljava/lang/Object;)Z", "clearBackStackInternal$navigation_runtime_release", "dispatchOnDestinationChanged$navigation_runtime_release", "updateBackStackLifecycle$navigation_runtime_release", "()V", "populateVisibleEntries$navigation_runtime_release", "()Ljava/util/List;", "Landroidx/navigation/NavGraph;", "setGraph$navigation_runtime_release", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "onGraphCreated$navigation_runtime_release", "(Landroid/os/Bundle;)V", "", "findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release", "([I)Ljava/lang/String;", "findDestination$navigation_runtime_release", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findDestinationComprehensive$navigation_runtime_release", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "getTopGraph$navigation_runtime_release", "()Landroidx/navigation/NavGraph;", "generateRouteFilled$navigation_runtime_release", "(Ljava/lang/Object;)Ljava/lang/String;", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "navigate$navigation_runtime_release", "(Landroid/net/Uri;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkRequest;", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "launchSingleTopInternal", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Z", "restoreStateInternal", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "executeRestoreState", "(Ljava/util/List;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "instantiateBackStack", "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "addEntryToBackStack", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;Ljava/util/List;)V", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "saveState$navigation_runtime_release", "()Landroid/os/Bundle;", "restoreState$navigation_runtime_release", "Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner$navigation_runtime_release", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/ViewModelStore;", "setViewModelStore$navigation_runtime_release", "(Landroidx/lifecycle/ViewModelStore;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner$navigation_runtime_release", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "getBackStackEntry$navigation_runtime_release", "(I)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "(Lkotlin/reflect/KClass;)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "updateOnBackPressedCallbackEnabledCallback", "Lkotlin/jvm/functions/Function0;", "getUpdateOnBackPressedCallbackEnabledCallback", "()Lkotlin/jvm/functions/Function0;", "setUpdateOnBackPressedCallbackEnabledCallback", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/navigation/internal/NavContext;", "getNavContext", "()Landroidx/navigation/internal/NavContext;", "navContext", "_graph", "Landroidx/navigation/NavGraph;", "get_graph$navigation_runtime_release", "set_graph$navigation_runtime_release", "(Landroidx/navigation/NavGraph;)V", "getGraph$navigation_runtime_release", "graph", "navigatorStateToRestore", "Landroid/os/Bundle;", "getNavigatorStateToRestore$navigation_runtime_release", "setNavigatorStateToRestore$navigation_runtime_release", "", "backStackToRestore", "[Landroid/os/Bundle;", "getBackStackToRestore$navigation_runtime_release", "()[Landroid/os/Bundle;", "setBackStackToRestore$navigation_runtime_release", "([Landroid/os/Bundle;)V", "backQueue", "Lkotlin/collections/ArrayDeque;", "getBackQueue$navigation_runtime_release", "()Lkotlin/collections/ArrayDeque;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "_currentBackStack", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "get_currentBackStack$navigation_runtime_release", "()Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LstopMediaCodec;", "currentBackStack", "LstopMediaCodec;", "getCurrentBackStack$navigation_runtime_release", "()LstopMediaCodec;", "_visibleEntries", "get_visibleEntries$navigation_runtime_release", "visibleEntries", "getVisibleEntries$navigation_runtime_release", "", "childToParentEntries", "Ljava/util/Map;", "getChildToParentEntries$navigation_runtime_release", "()Ljava/util/Map;", "Landroidx/navigation/internal/AtomicInt;", "parentToChildCount", "getParentToChildCount$navigation_runtime_release", "backStackMap", "getBackStackMap$navigation_runtime_release", "backStackStates", "getBackStackStates$navigation_runtime_release", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner$navigation_runtime_release", "()Landroidx/lifecycle/LifecycleOwner;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Landroidx/navigation/NavControllerViewModel;", "getViewModel$navigation_runtime_release", "()Landroidx/navigation/NavControllerViewModel;", "setViewModel$navigation_runtime_release", "(Landroidx/navigation/NavControllerViewModel;)V", "", "onDestinationChangedListeners", "Ljava/util/List;", "getOnDestinationChangedListeners$navigation_runtime_release", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "getHostLifecycleState$navigation_runtime_release", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getLifecycleObserver$navigation_runtime_release", "()Landroidx/lifecycle/LifecycleObserver;", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "get_navigatorProvider$navigation_runtime_release", "()Landroidx/navigation/NavigatorProvider;", "set_navigatorProvider$navigation_runtime_release", "(Landroidx/navigation/NavigatorProvider;)V", "getNavigatorProvider$navigation_runtime_release", "setNavigatorProvider$navigation_runtime_release", "navigatorProvider", "navigatorState", "getNavigatorState$navigation_runtime_release", "addToBackStackHandler", "Lkotlin/jvm/functions/Function1;", "getAddToBackStackHandler$navigation_runtime_release", "()Lkotlin/jvm/functions/Function1;", "setAddToBackStackHandler$navigation_runtime_release", "(Lkotlin/jvm/functions/Function1;)V", "popFromBackStackHandler", "getPopFromBackStackHandler$navigation_runtime_release", "setPopFromBackStackHandler$navigation_runtime_release", "entrySavedState", "getEntrySavedState$navigation_runtime_release", "dispatchReentrantCount", "I", "backStackEntriesToDispatch", "getCurrentDestination$navigation_runtime_release", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry$navigation_runtime_release", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "_currentBackStackEntryFlow", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "get_currentBackStackEntryFlow$navigation_runtime_release", "()LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "getPreviousBackStackEntry$navigation_runtime_release", "previousBackStackEntry", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavControllerImpl {
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    public static final String TAG = "NavController";
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> _currentBackStack;
    private final lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<NavBackStackEntry> _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> _visibleEntries;
    private Function1<? super NavBackStackEntry, Unit> addToBackStackHandler;
    private final ArrayDeque<NavBackStackEntry> backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, ArrayDeque<NavBackStackEntryState>> backStackStates;
    private Bundle[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final stopMediaCodec<List<NavBackStackEntry>> currentBackStack;
    private int dispatchReentrantCount;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;
    private final NavController navController;
    private final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final List<NavController.OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInt> parentToChildCount;
    private Function1<? super NavBackStackEntry, Unit> popFromBackStackHandler;
    private Function0<Unit> updateOnBackPressedCallbackEnabledCallback;
    private NavControllerViewModel viewModel;
    private final stopMediaCodec<List<NavBackStackEntry>> visibleEntries;

    public NavControllerImpl(NavController navController, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(navController, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.navController = navController;
        this.updateOnBackPressedCallbackEnabledCallback = function0;
        this.backQueue = new ArrayDeque<>();
        lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.emptyList());
        this._currentBackStack = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.currentBackStack = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.emptyList());
        this._visibleEntries = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.visibleEntries = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new ArrayList();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda8
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavControllerImpl.lifecycleObserver$lambda$1(this.f$0, lifecycleOwner, event);
            }
        };
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this.backStackEntriesToDispatch = new ArrayList();
        this._currentBackStackEntryFlow = setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    public final NavController getNavController() {
        return this.navController;
    }

    public final Function0<Unit> getUpdateOnBackPressedCallbackEnabledCallback() {
        return this.updateOnBackPressedCallbackEnabledCallback;
    }

    public final void setUpdateOnBackPressedCallbackEnabledCallback(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.updateOnBackPressedCallbackEnabledCallback = function0;
    }

    public final NavContext getNavContext() {
        return this.navController.getNavContext();
    }

    /* JADX INFO: renamed from: get_graph$navigation_runtime_release, reason: from getter */
    public final NavGraph get_graph() {
        return this._graph;
    }

    public final void set_graph$navigation_runtime_release(NavGraph navGraph) {
        this._graph = navGraph;
    }

    public final NavGraph getGraph$navigation_runtime_release() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        Intrinsics.checkNotNull(navGraph, "");
        return navGraph;
    }

    public final void setGraph$navigation_runtime_release(NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "");
        setGraph$navigation_runtime_release(navGraph, null);
    }

    /* JADX INFO: renamed from: getNavigatorStateToRestore$navigation_runtime_release, reason: from getter */
    public final Bundle getNavigatorStateToRestore() {
        return this.navigatorStateToRestore;
    }

    public final void setNavigatorStateToRestore$navigation_runtime_release(Bundle bundle) {
        this.navigatorStateToRestore = bundle;
    }

    /* JADX INFO: renamed from: getBackStackToRestore$navigation_runtime_release, reason: from getter */
    public final Bundle[] getBackStackToRestore() {
        return this.backStackToRestore;
    }

    public final void setBackStackToRestore$navigation_runtime_release(Bundle[] bundleArr) {
        this.backStackToRestore = bundleArr;
    }

    public final ArrayDeque<NavBackStackEntry> getBackQueue$navigation_runtime_release() {
        return this.backQueue;
    }

    public final lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> get_currentBackStack$navigation_runtime_release() {
        return this._currentBackStack;
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getCurrentBackStack$navigation_runtime_release() {
        return this.currentBackStack;
    }

    public final lambdastop3androidxcameravideointernalencoderEncoderImpl<List<NavBackStackEntry>> get_visibleEntries$navigation_runtime_release() {
        return this._visibleEntries;
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getVisibleEntries$navigation_runtime_release() {
        return this.visibleEntries;
    }

    public final Map<NavBackStackEntry, NavBackStackEntry> getChildToParentEntries$navigation_runtime_release() {
        return this.childToParentEntries;
    }

    public final Map<NavBackStackEntry, AtomicInt> getParentToChildCount$navigation_runtime_release() {
        return this.parentToChildCount;
    }

    public final void linkChildToParent$navigation_runtime_release(NavBackStackEntry p0, NavBackStackEntry p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.childToParentEntries.put(p0, p1);
        if (this.parentToChildCount.get(p1) == null) {
            this.parentToChildCount.put(p1, new AtomicInt(0));
        }
        AtomicInt atomicInt = this.parentToChildCount.get(p1);
        Intrinsics.checkNotNull(atomicInt);
        atomicInt.incrementAndGet$navigation_runtime_release();
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavBackStackEntry navBackStackEntryRemove = this.childToParentEntries.remove(p0);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInt atomicInt = this.parentToChildCount.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInt != null ? Integer.valueOf(atomicInt.decrementAndGet$navigation_runtime_release()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntryRemove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(navBackStackEntryRemove);
            }
            this.parentToChildCount.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    public final Map<Integer, String> getBackStackMap$navigation_runtime_release() {
        return this.backStackMap;
    }

    public final Map<String, ArrayDeque<NavBackStackEntryState>> getBackStackStates$navigation_runtime_release() {
        return this.backStackStates;
    }

    /* JADX INFO: renamed from: getLifecycleOwner$navigation_runtime_release, reason: from getter */
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    /* JADX INFO: renamed from: getViewModel$navigation_runtime_release, reason: from getter */
    public final NavControllerViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setViewModel$navigation_runtime_release(NavControllerViewModel navControllerViewModel) {
        this.viewModel = navControllerViewModel;
    }

    public final List<NavController.OnDestinationChangedListener> getOnDestinationChangedListeners$navigation_runtime_release() {
        return this.onDestinationChangedListeners;
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "");
        this.hostLifecycleState = state;
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        if (this.lifecycleOwner == null) {
            return Lifecycle.State.CREATED;
        }
        return this.hostLifecycleState;
    }

    /* JADX INFO: renamed from: getLifecycleObserver$navigation_runtime_release, reason: from getter */
    public final LifecycleObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$1(NavControllerImpl navControllerImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        navControllerImpl.hostLifecycleState = event.getTargetState();
        if (navControllerImpl._graph != null) {
            Iterator it = CollectionsKt.toMutableList((Collection) navControllerImpl.backQueue).iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    public final NavigatorProvider get_navigatorProvider$navigation_runtime_release() {
        return this._navigatorProvider;
    }

    public final void set_navigatorProvider$navigation_runtime_release(NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this._navigatorProvider = navigatorProvider;
    }

    /* JADX INFO: renamed from: getNavigatorProvider$navigation_runtime_release, reason: from getter */
    public final NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public final void setNavigatorProvider$navigation_runtime_release(NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
        }
        this._navigatorProvider = navigatorProvider;
    }

    public final Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> getNavigatorState$navigation_runtime_release() {
        return this.navigatorState;
    }

    public final Function1<NavBackStackEntry, Unit> getAddToBackStackHandler$navigation_runtime_release() {
        return this.addToBackStackHandler;
    }

    public final void setAddToBackStackHandler$navigation_runtime_release(Function1<? super NavBackStackEntry, Unit> function1) {
        this.addToBackStackHandler = function1;
    }

    public final Function1<NavBackStackEntry, Unit> getPopFromBackStackHandler$navigation_runtime_release() {
        return this.popFromBackStackHandler;
    }

    public final void setPopFromBackStackHandler$navigation_runtime_release(Function1<? super NavBackStackEntry, Unit> function1) {
        this.popFromBackStackHandler = function1;
    }

    public final Map<NavBackStackEntry, Boolean> getEntrySavedState$navigation_runtime_release() {
        return this.entrySavedState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateInternal$lambda$3(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return NavControllerImpl.navigateInternal$lambda$3((NavBackStackEntry) obj2);
                }
            };
        }
        navControllerImpl.navigateInternal$navigation_runtime_release(navigator, list, navOptions, extras, function1);
    }

    public final void navigateInternal$navigation_runtime_release(Navigator<? extends NavDestination> p0, List<NavBackStackEntry> p1, NavOptions p2, Navigator.Extras p3, Function1<? super NavBackStackEntry, Unit> p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p4, "");
        this.addToBackStackHandler = p4;
        p0.navigate(p1, p2, p3);
        this.addToBackStackHandler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit popBackStackInternal$lambda$4(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return NavControllerImpl.popBackStackInternal$lambda$4((NavBackStackEntry) obj2);
                }
            };
        }
        navControllerImpl.popBackStackInternal$navigation_runtime_release(navigator, navBackStackEntry, z, function1);
    }

    public final void popBackStackInternal$navigation_runtime_release(Navigator<? extends NavDestination> p0, NavBackStackEntry p1, boolean p2, Function1<? super NavBackStackEntry, Unit> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        this.popFromBackStackHandler = p3;
        p0.popBackStack(p1, p2);
        this.popFromBackStackHandler = null;
    }

    public final void push$navigation_runtime_release(NavController.NavControllerNavigatorState p0, NavBackStackEntry p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Navigator navigator = this._navigatorProvider.getNavigator(p1.getDestination().getNavigatorName());
        if (Intrinsics.areEqual(navigator, p0.getNavigator())) {
            Function1<? super NavBackStackEntry, Unit> function1 = this.addToBackStackHandler;
            if (function1 != null) {
                function1.invoke(p1);
                p0.addInternal(p1);
                return;
            }
            Log.Companion companion = Log.INSTANCE;
            StringBuilder sb = new StringBuilder("Ignoring add of destination ");
            sb.append(p1.getDestination());
            sb.append(" outside of the call to navigate(). ");
            companion.i(TAG, sb.toString());
            return;
        }
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
        if (navControllerNavigatorState == null) {
            StringBuilder sb2 = new StringBuilder("NavigatorBackStack for ");
            sb2.append(p1.getDestination().getNavigatorName());
            sb2.append(" should already be created");
            throw new IllegalStateException(sb2.toString().toString());
        }
        navControllerNavigatorState.push(p1);
    }

    public final NavBackStackEntry createBackStackEntry$navigation_runtime_release(NavDestination p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
        return companion.create(getNavContext(), p0, (96 & 4) != 0 ? null : p1, (96 & 8) != 0 ? Lifecycle.State.CREATED : getHostLifecycleState$navigation_runtime_release(), (96 & 16) != 0 ? null : this.viewModel, (96 & 32) != 0 ? companion.randomUUID$navigation_common_release() : null, (96 & 64) != 0 ? null : null);
    }

    public final void pop$navigation_runtime_release(NavController.NavControllerNavigatorState p0, NavBackStackEntry p1, boolean p2, final Function0<Unit> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Navigator navigator = this._navigatorProvider.getNavigator(p1.getDestination().getNavigatorName());
        this.entrySavedState.put(p1, Boolean.valueOf(p2));
        if (Intrinsics.areEqual(navigator, p0.getNavigator())) {
            Function1<? super NavBackStackEntry, Unit> function1 = this.popFromBackStackHandler;
            if (function1 != null) {
                function1.invoke(p1);
                p3.invoke();
                return;
            } else {
                popBackStackFromNavigator$navigation_runtime_release(p1, new Function0() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavControllerImpl.pop$lambda$6(p3);
                    }
                });
                return;
            }
        }
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(navigator);
        Intrinsics.checkNotNull(navControllerNavigatorState);
        navControllerNavigatorState.pop(p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pop$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void markTransitionComplete$navigation_runtime_release(NavController.NavControllerNavigatorState p0, NavBackStackEntry p1, Function0<Unit> p2) {
        NavControllerViewModel navControllerViewModel;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        boolean zAreEqual = Intrinsics.areEqual(this.entrySavedState.get(p1), Boolean.TRUE);
        p2.invoke();
        this.entrySavedState.remove(p1);
        if (!this.backQueue.contains(p1)) {
            unlinkChildFromParent$navigation_runtime_release(p1);
            if (p1.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                p1.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
            if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
                Iterator<NavBackStackEntry> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().getId(), p1.getId())) {
                    }
                }
                if (!zAreEqual && (navControllerViewModel = this.viewModel) != null) {
                    navControllerViewModel.clear(p1.getId());
                }
            } else if (!zAreEqual) {
                navControllerViewModel.clear(p1.getId());
            }
            updateBackStackLifecycle$navigation_runtime_release();
            this._visibleEntries.TuitionPaymentFragmentspecialinlinedviewModeldefault2(populateVisibleEntries$navigation_runtime_release());
            return;
        }
        if (p0.getIsNavigating()) {
            return;
        }
        updateBackStackLifecycle$navigation_runtime_release();
        this._currentBackStack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.toMutableList((Collection) this.backQueue));
        this._visibleEntries.TuitionPaymentFragmentspecialinlinedviewModeldefault2(populateVisibleEntries$navigation_runtime_release());
    }

    public final void prepareForTransition$navigation_runtime_release(NavBackStackEntry p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.backQueue.contains(p0)) {
            p0.setMaxLifecycle(Lifecycle.State.STARTED);
            return;
        }
        throw new IllegalStateException("Cannot transition entry that is not in the back stack");
    }

    public final void addOnDestinationChangedListener$navigation_runtime_release(NavController.OnDestinationChangedListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.onDestinationChangedListeners.add(p0);
        if (this.backQueue.isEmpty()) {
            return;
        }
        NavBackStackEntry navBackStackEntryLast = this.backQueue.last();
        p0.onDestinationChanged(this.navController, navBackStackEntryLast.getDestination(), navBackStackEntryLast.getArguments());
    }

    public final void removeOnDestinationChangedListener$navigation_runtime_release(NavController.OnDestinationChangedListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.onDestinationChangedListeners.remove(p0);
    }

    public final boolean popBackStack$navigation_runtime_release() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination$navigation_runtime_release = getCurrentDestination$navigation_runtime_release();
        Intrinsics.checkNotNull(currentDestination$navigation_runtime_release);
        return popBackStack$navigation_runtime_release(currentDestination$navigation_runtime_release.getId(), true);
    }

    public final boolean popBackStack$navigation_runtime_release(int p0, boolean p1) {
        return popBackStack$navigation_runtime_release(p0, p1, false);
    }

    public final boolean popBackStack$navigation_runtime_release(int p0, boolean p1, boolean p2) {
        return popBackStackInternal$navigation_runtime_release(p0, p1, p2) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean popBackStack$navigation_runtime_release(String p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return popBackStackInternal$navigation_runtime_release(p0, p1, p2) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final <T> boolean popBackStack$navigation_runtime_release(T p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return popBackStackInternal$navigation_runtime_release(p0, p1, p2) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release(i, z, z2);
    }

    public final boolean popBackStackInternal$navigation_runtime_release(int p0, boolean p1, boolean p2) {
        NavDestination destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(this.backQueue).iterator();
        do {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(destination.getNavigatorName());
            if (p1 || destination.getId() != p0) {
                arrayList.add(navigator);
            }
        } while (destination.getId() != p0);
        if (destination == null) {
            String displayName = NavDestination.INSTANCE.getDisplayName(getNavContext(), p0);
            Log.Companion companion = Log.INSTANCE;
            StringBuilder sb = new StringBuilder("Ignoring popBackStack to destination ");
            sb.append(displayName);
            sb.append(" as it was not found on the current back stack");
            companion.i(TAG, sb.toString());
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, p1, p2);
    }

    public static /* synthetic */ boolean popBackStackInternal$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Object obj, boolean z, boolean z2, int i, Object obj2) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return navControllerImpl.popBackStackInternal$navigation_runtime_release(obj, z, z2);
    }

    public final <T> boolean popBackStackInternal$navigation_runtime_release(T p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return popBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(p0), p1, p2);
    }

    public final boolean popBackStackInternal$navigation_runtime_release(String p0, boolean p1, boolean p2) {
        NavBackStackEntry navBackStackEntryPrevious;
        boolean zHasRoute;
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
            zHasRoute = navBackStackEntry.getDestination().hasRoute(p0, navBackStackEntry.getArguments());
            if (p1 || !zHasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
            }
        } while (!zHasRoute);
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        NavDestination destination = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
        if (destination == null) {
            Log.Companion companion = Log.INSTANCE;
            StringBuilder sb = new StringBuilder("Ignoring popBackStack to route ");
            sb.append(p0);
            sb.append(" as it was not found on the current back stack");
            companion.i(TAG, sb.toString());
            return false;
        }
        return executePopOperations$navigation_runtime_release(arrayList, destination, p1, p2);
    }

    public final boolean executePopOperations$navigation_runtime_release(List<? extends Navigator<?>> p0, NavDestination p1, boolean p2, final boolean p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>();
        Iterator<? extends Navigator<?>> it = p0.iterator();
        while (it.hasNext()) {
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            popBackStackInternal$navigation_runtime_release(navigator, this.backQueue.last(), p3, new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavControllerImpl.executePopOperations$lambda$10(booleanRef2, booleanRef, this, p3, arrayDeque, (NavBackStackEntry) obj);
                }
            });
            if (!booleanRef2.element) {
                break;
            }
        }
        if (p3) {
            if (!p2) {
                for (NavDestination navDestination : SequencesKt.takeWhile(SequencesKt.generateSequence(p1, (Function1<? super NavDestination, ? extends NavDestination>) new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavControllerImpl.executePopOperations$lambda$11((NavDestination) obj);
                    }
                }), new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(NavControllerImpl.executePopOperations$lambda$12(this.f$0, (NavDestination) obj));
                    }
                })) {
                    Map<Integer, String> map = this.backStackMap;
                    int id2 = navDestination.getId();
                    NavBackStackEntryState navBackStackEntryStateFirstOrNull = arrayDeque.firstOrNull();
                    map.put(Integer.valueOf(id2), navBackStackEntryStateFirstOrNull != null ? navBackStackEntryStateFirstOrNull.getId() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryStateFirst = arrayDeque.first();
                Iterator it2 = SequencesKt.takeWhile(SequencesKt.generateSequence(findDestination$navigation_runtime_release$default(this, navBackStackEntryStateFirst.getDestinationId(), null, 2, null), (Function1<? super NavDestination, ? extends NavDestination>) new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavControllerImpl.executePopOperations$lambda$14((NavDestination) obj);
                    }
                }), new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(NavControllerImpl.executePopOperations$lambda$15(this.f$0, (NavDestination) obj));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), navBackStackEntryStateFirst.getId());
                }
                if (this.backStackMap.values().contains(navBackStackEntryStateFirst.getId())) {
                    this.backStackStates.put(navBackStackEntryStateFirst.getId(), arrayDeque);
                }
            }
        }
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executePopOperations$lambda$10(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, NavControllerImpl navControllerImpl, boolean z, ArrayDeque arrayDeque, NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        booleanRef.element = true;
        booleanRef2.element = true;
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, z, arrayDeque);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$11(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        NavGraph parent = navDestination.getParent();
        if (parent == null || parent.getStartDestinationId() != navDestination.getId()) {
            return null;
        }
        return navDestination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$12(NavControllerImpl navControllerImpl, NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(navDestination.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavDestination executePopOperations$lambda$14(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        NavGraph parent = navDestination.getParent();
        if (parent == null || parent.getStartDestinationId() != navDestination.getId()) {
            return null;
        }
        return navDestination.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean executePopOperations$lambda$15(NavControllerImpl navControllerImpl, NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        return !navControllerImpl.backStackMap.containsKey(Integer.valueOf(navDestination.getId()));
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry p0, Function0<Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int iIndexOf = this.backQueue.indexOf(p0);
        if (iIndexOf < 0) {
            Log.Companion companion = Log.INSTANCE;
            StringBuilder sb = new StringBuilder("Ignoring pop of ");
            sb.append(p0);
            sb.append(" as it was not found on the current back stack");
            companion.i(TAG, sb.toString());
            return;
        }
        int i = iIndexOf + 1;
        if (i != this.backQueue.size()) {
            popBackStackInternal$navigation_runtime_release(this.backQueue.get(i).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$navigation_runtime_release$default(this, p0, false, null, 6, null);
        p1.invoke();
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        dispatchOnDestinationChanged$navigation_runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        navControllerImpl.popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, z, arrayDeque);
    }

    public final void popEntryFromBackStack$navigation_runtime_release(NavBackStackEntry p0, boolean p1, ArrayDeque<NavBackStackEntryState> p2) {
        NavControllerViewModel navControllerViewModel;
        stopMediaCodec<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> setTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        NavBackStackEntry navBackStackEntryLast = this.backQueue.last();
        if (!Intrinsics.areEqual(navBackStackEntryLast, p0)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(p0.getDestination());
            sb.append(", which is not the top of the back stack (");
            sb.append(navBackStackEntryLast.getDestination());
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        CollectionsKt.removeLast(this.backQueue);
        NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntryLast.getDestination().getNavigatorName()));
        boolean z = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (setTuitionPaymentFragmentspecialinlinedviewModeldefault1 = transitionsInProgress.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) == null || !setTuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(navBackStackEntryLast)) && !this.parentToChildCount.containsKey(navBackStackEntryLast)) {
            z = false;
        }
        if (navBackStackEntryLast.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            if (p1) {
                navBackStackEntryLast.setMaxLifecycle(Lifecycle.State.CREATED);
                p2.addFirst(new NavBackStackEntryState(navBackStackEntryLast));
            }
            if (!z) {
                navBackStackEntryLast.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntryLast);
            } else {
                navBackStackEntryLast.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        if (p1 || z || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(navBackStackEntryLast.getId());
    }

    public final boolean clearBackStack$navigation_runtime_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return clearBackStackInternal$navigation_runtime_release(p0) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean clearBackStack$navigation_runtime_release(int p0) {
        return clearBackStackInternal$navigation_runtime_release(p0) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final <T> boolean clearBackStack$navigation_runtime_release(T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return clearBackStackInternal$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(p0)) && dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(int p0) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(p0, null, NavOptionsBuilderKt.navOptions(new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavControllerImpl.clearBackStackInternal$lambda$19((NavOptionsBuilder) obj);
            }
        }), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(p0, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearBackStackInternal$lambda$19(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "");
        navOptionsBuilder.setRestoreState(true);
        return Unit.INSTANCE;
    }

    public final boolean clearBackStackInternal$navigation_runtime_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean zRestoreStateInternal = restoreStateInternal(p0);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return zRestoreStateInternal && popBackStackInternal$navigation_runtime_release(p0, true, false);
    }

    public final boolean dispatchOnDestinationChanged$navigation_runtime_release() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$navigation_runtime_release$default(this, this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryLastOrNull = this.backQueue.lastOrNull();
        if (navBackStackEntryLastOrNull != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntryLastOrNull);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i;
        if (i == 0) {
            List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : mutableList) {
                Iterator it = CollectionsKt.toList(this.onDestinationChangedListeners).iterator();
                while (it.hasNext()) {
                    ((NavController.OnDestinationChangedListener) it.next()).onDestinationChanged(this.navController, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(navBackStackEntry);
            }
            this._currentBackStack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.toMutableList((Collection) this.backQueue));
            this._visibleEntries.TuitionPaymentFragmentspecialinlinedviewModeldefault2(populateVisibleEntries$navigation_runtime_release());
        }
        return navBackStackEntryLastOrNull != null;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        AtomicInt atomicInt;
        stopMediaCodec<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> setTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.backQueue);
        if (mutableList.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) CollectionsKt.last(mutableList)).getDestination();
        List listMutableListOf = CollectionsKt.mutableListOf(destination);
        if (destination instanceof SupportingPane) {
            boolean z = destination instanceof FloatingWindow;
            Iterator it = CollectionsKt.drop(CollectionsKt.reversed(mutableList), 1).iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                if (z && !(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
                listMutableListOf.add(destination2);
                if (!(destination2 instanceof SupportingPane) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.last(listMutableListOf) instanceof FloatingWindow) {
            Iterator it2 = CollectionsKt.reversed(mutableList).iterator();
            while (it2.hasNext()) {
                NavDestination destination3 = ((NavBackStackEntry) it2.next()).getDestination();
                arrayList.add(destination3);
                if (!(destination3 instanceof FloatingWindow) && !(destination3 instanceof SupportingPane) && !(destination3 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt.reversed(mutableList)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination4 = navBackStackEntry.getDestination();
            NavDestination navDestination = (NavDestination) CollectionsKt.firstOrNull(listMutableListOf);
            if (navDestination != null && navDestination.getId() == destination4.getId()) {
                if (maxLifecycle != Lifecycle.State.RESUMED) {
                    NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(get_navigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (!Intrinsics.areEqual((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (setTuitionPaymentFragmentspecialinlinedviewModeldefault1 = transitionsInProgress.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) == null) ? null : Boolean.valueOf(setTuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(navBackStackEntry)), Boolean.TRUE) && ((atomicInt = this.parentToChildCount.get(navBackStackEntry)) == null || atomicInt.get$navigation_runtime_release() != 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.RESUMED);
                    } else {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    }
                }
                NavDestination navDestination2 = (NavDestination) CollectionsKt.firstOrNull((List) arrayList);
                if (navDestination2 != null && navDestination2.getId() == destination4.getId()) {
                    CollectionsKt.removeFirst(arrayList);
                }
                CollectionsKt.removeFirst(listMutableListOf);
                NavGraph parent = destination4.getParent();
                if (parent != null) {
                    listMutableListOf.add(parent);
                }
            } else if (!arrayList.isEmpty() && destination4.getId() == ((NavDestination) CollectionsKt.first((List) arrayList)).getId()) {
                NavDestination navDestination3 = (NavDestination) CollectionsKt.removeFirst(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else if (maxLifecycle != Lifecycle.State.STARTED) {
                    map.put(navBackStackEntry, Lifecycle.State.STARTED);
                }
                NavGraph parent2 = navDestination3.getParent();
                if (parent2 != null && !arrayList.contains(parent2)) {
                    arrayList.add(parent2);
                }
            } else {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : mutableList) {
            Lifecycle.State state = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state != null) {
                navBackStackEntry2.setMaxLifecycle(state);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            Set<NavBackStackEntry> setTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((NavController.NavControllerNavigatorState) it.next()).getTransitionsInProgress().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : setTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList3.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        ArrayList arrayList4 = arrayList;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ArrayList arrayList5 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList5.add(navBackStackEntry2);
            }
        }
        CollectionsKt.addAll(arrayList4, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList6.add(obj2);
            }
        }
        return arrayList6;
    }

    public final void setGraph$navigation_runtime_release(NavGraph p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!this.backQueue.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.".toString());
        }
        if (!Intrinsics.areEqual(this._graph, p0)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer num : new ArrayList(this.backStackMap.keySet())) {
                    Intrinsics.checkNotNull(num);
                    clearBackStackInternal$navigation_runtime_release(num.intValue());
                }
                popBackStackInternal$navigation_runtime_release$default(this, navGraph.getId(), true, false, 4, (Object) null);
            }
            this._graph = p0;
            onGraphCreated$navigation_runtime_release(p1);
            return;
        }
        int size = p0.getNodes().size();
        for (int i = 0; i < size; i++) {
            NavDestination navDestinationValueAt = p0.getNodes().valueAt(i);
            NavGraph navGraph2 = this._graph;
            Intrinsics.checkNotNull(navGraph2);
            int iKeyAt = navGraph2.getNodes().keyAt(i);
            NavGraph navGraph3 = this._graph;
            Intrinsics.checkNotNull(navGraph3);
            navGraph3.getNodes().replace(iKeyAt, navDestinationValueAt);
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            List<NavDestination> listAsReversed = CollectionsKt.asReversed(SequencesKt.toList(NavDestination.INSTANCE.getHierarchy(navBackStackEntry.getDestination())));
            NavDestination navDestinationFindNode = this._graph;
            Intrinsics.checkNotNull(navDestinationFindNode);
            for (NavDestination navDestination : listAsReversed) {
                if (!Intrinsics.areEqual(navDestination, this._graph) || !Intrinsics.areEqual(navDestinationFindNode, p0)) {
                    if (navDestinationFindNode instanceof NavGraph) {
                        navDestinationFindNode = ((NavGraph) navDestinationFindNode).findNode(navDestination.getId());
                        Intrinsics.checkNotNull(navDestinationFindNode);
                    }
                }
            }
            navBackStackEntry.setDestination(navDestinationFindNode);
        }
    }

    public final void onGraphCreated$navigation_runtime_release(Bundle p0) {
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null) {
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(bundle);
            if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_NAVIGATOR_STATE_NAMES)) {
                for (String str : SavedStateReader.m7442getStringListimpl(bundleM7368constructorimpl, KEY_NAVIGATOR_STATE_NAMES)) {
                    Navigator navigator = this._navigatorProvider.getNavigator(str);
                    if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, str)) {
                        navigator.onRestoreState(SavedStateReader.m7425getSavedStateimpl(bundleM7368constructorimpl, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.backStackToRestore;
        if (bundleArr != null) {
            for (Bundle bundle2 : bundleArr) {
                NavBackStackEntryState navBackStackEntryState = new NavBackStackEntryState(bundle2);
                NavDestination navDestinationFindDestination$navigation_runtime_release$default = findDestination$navigation_runtime_release$default(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (navDestinationFindDestination$navigation_runtime_release$default == null) {
                    String displayName = NavDestination.INSTANCE.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId());
                    StringBuilder sb = new StringBuilder("Restoring the Navigation back stack failed: destination ");
                    sb.append(displayName);
                    sb.append(" cannot be found from the current destination ");
                    sb.append(getCurrentDestination$navigation_runtime_release());
                    throw new IllegalStateException(sb.toString());
                }
                NavBackStackEntry navBackStackEntryInstantiate = navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestination$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(navDestinationFindDestination$navigation_runtime_release$default.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map = this.navigatorState;
                NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = map.get(navigator2);
                if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release == null) {
                    navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator2);
                    map.put(navigator2, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release);
                }
                this.backQueue.add(navBackStackEntryInstantiate);
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release.addInternal(navBackStackEntryInstantiate);
                NavGraph parent = navBackStackEntryInstantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent$navigation_runtime_release(navBackStackEntryInstantiate, getBackStackEntry$navigation_runtime_release(parent.getId()));
                }
            }
            this.updateOnBackPressedCallbackEnabledCallback.invoke();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavController.NavControllerNavigatorState> map2 = this.navigatorState;
            NavController.NavControllerNavigatorState navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = map2.get(navigator3);
            if (navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 == null) {
                navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2 = this.navController.createNavControllerNavigatorState$navigation_runtime_release(navigator3);
                map2.put(navigator3, navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
            }
            navigator3.onAttach(navControllerNavigatorStateCreateNavControllerNavigatorState$navigation_runtime_release2);
        }
        if (this._graph != null && this.backQueue.isEmpty()) {
            if (this.navController.checkDeepLinkHandled$navigation_runtime_release()) {
                return;
            }
            NavGraph navGraph = this._graph;
            Intrinsics.checkNotNull(navGraph);
            navigate$navigation_runtime_release(navGraph, p0, null, null);
            return;
        }
        dispatchOnDestinationChanged$navigation_runtime_release();
    }

    public final String findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release(int[] p0) {
        NavGraph navGraphFindNode;
        NavGraph navGraph;
        Intrinsics.checkNotNullParameter(p0, "");
        NavGraph navGraph2 = this._graph;
        int length = p0.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return null;
            }
            int i2 = p0[i];
            if (i == 0) {
                NavGraph navGraph3 = this._graph;
                Intrinsics.checkNotNull(navGraph3);
                navGraphFindNode = navGraph3.getId() == i2 ? this._graph : null;
            } else {
                Intrinsics.checkNotNull(navGraph2);
                navGraphFindNode = navGraph2.findNode(i2);
            }
            if (navGraphFindNode == null) {
                return NavDestination.INSTANCE.getDisplayName(getNavContext(), i2);
            }
            if (i != p0.length - 1 && (navGraphFindNode instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navGraphFindNode;
                    Intrinsics.checkNotNull(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navGraphFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i++;
        }
    }

    public final NavDestination getCurrentDestination$navigation_runtime_release() {
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        if (currentBackStackEntry$navigation_runtime_release != null) {
            return currentBackStackEntry$navigation_runtime_release.getDestination();
        }
        return null;
    }

    public static /* synthetic */ NavDestination findDestination$navigation_runtime_release$default(NavControllerImpl navControllerImpl, int i, NavDestination navDestination, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            navDestination = null;
        }
        return navControllerImpl.findDestination$navigation_runtime_release(i, navDestination);
    }

    public final NavDestination findDestination$navigation_runtime_release(int p0, NavDestination p1) {
        NavGraph destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph);
        if (navGraph.getId() == p0) {
            if (p1 != null) {
                if (Intrinsics.areEqual(this._graph, p1) && p1.getParent() == null) {
                    return this._graph;
                }
            } else {
                return this._graph;
            }
        }
        NavBackStackEntry navBackStackEntryLastOrNull = this.backQueue.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (destination = navBackStackEntryLastOrNull.getDestination()) == null) {
            NavGraph navGraph2 = this._graph;
            Intrinsics.checkNotNull(navGraph2);
            destination = navGraph2;
        }
        return findDestinationComprehensive$navigation_runtime_release(destination, p0, false, p1);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$navigation_runtime_release$default(NavControllerImpl navControllerImpl, NavDestination navDestination, int i, boolean z, NavDestination navDestination2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navControllerImpl.findDestinationComprehensive$navigation_runtime_release(navDestination, i, z, navDestination2);
    }

    public final NavDestination findDestinationComprehensive$navigation_runtime_release(NavDestination p0, int p1, boolean p2, NavDestination p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.getId() == p1 && (p3 == null || (Intrinsics.areEqual(p0, p3) && Intrinsics.areEqual(p0.getParent(), p3.getParent())))) {
            return p0;
        }
        NavGraph parent = p0 instanceof NavGraph ? (NavGraph) p0 : null;
        if (parent == null) {
            parent = p0.getParent();
            Intrinsics.checkNotNull(parent);
        }
        return parent.findNodeComprehensive(p1, parent, p2, p3);
    }

    public final NavDestination findDestination$navigation_runtime_release(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph);
        if (!Intrinsics.areEqual(navGraph.getRoute(), p0)) {
            NavGraph navGraph2 = this._graph;
            Intrinsics.checkNotNull(navGraph2);
            if (navGraph2.matchRoute(p0) == null) {
                return getTopGraph$navigation_runtime_release().findNode(p0);
            }
        }
        return this._graph;
    }

    public final NavGraph getTopGraph$navigation_runtime_release() {
        NavGraph destination;
        NavBackStackEntry navBackStackEntryLastOrNull = this.backQueue.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (destination = navBackStackEntryLastOrNull.getDestination()) == null) {
            NavGraph navGraph = this._graph;
            Intrinsics.checkNotNull(navGraph);
            destination = navGraph;
        }
        NavGraph navGraph2 = destination instanceof NavGraph ? (NavGraph) destination : null;
        if (navGraph2 != null) {
            return navGraph2;
        }
        NavGraph parent = destination.getParent();
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    public final <T> String generateRouteFilled$navigation_runtime_release(T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(p0.getClass());
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass(orCreateKotlinClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(orCreateKotlinClass);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1), true, null, 8, null);
            if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
                StringBuilder sb = new StringBuilder("Destination with route ");
                sb.append(Reflection.getOrCreateKotlinClass(p0.getClass()).getSimpleName());
                sb.append(" cannot be found in navigation graph ");
                sb.append(this._graph);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            Map<String, NavArgument> arguments = navDestinationFindDestinationComprehensive$navigation_runtime_release$default.getArguments();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(arguments.size()));
            Iterator<T> it = arguments.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
            }
            return RouteSerializerKt.generateRouteWithArgs(p0, linkedHashMap);
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) orCreateKotlinClass);
        throw new KotlinNothingValueException();
    }

    public final void navigate$navigation_runtime_release(Uri p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(p0, null, null));
    }

    public final void navigate$navigation_runtime_release(Uri p0, NavOptions p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(p0, null, null), p1, (Navigator.Extras) null);
    }

    public final void navigate$navigation_runtime_release(Uri p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate$navigation_runtime_release(new NavDeepLinkRequest(p0, null, null), p1, p2);
    }

    public final void navigate$navigation_runtime_release(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate$navigation_runtime_release(p0, (NavOptions) null);
    }

    public final void navigate$navigation_runtime_release(NavDeepLinkRequest p0, NavOptions p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate$navigation_runtime_release(p0, p1, (Navigator.Extras) null);
    }

    public final void navigate$navigation_runtime_release(NavDeepLinkRequest p0, NavOptions p1, Navigator.Extras p2) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(p0, "");
        if (this._graph == null) {
            StringBuilder sb = new StringBuilder("Cannot navigate to ");
            sb.append(p0);
            sb.append(". Navigation graph has not been set for NavController ");
            sb.append(this.navController);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(p0, true, true, topGraph$navigation_runtime_release);
        if (deepLinkMatchMatchDeepLinkComprehensive != null) {
            Bundle bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs == null) {
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m7454constructorimpl(bundleAddInDefaultArgs);
            }
            NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
            this.navController.writeIntent$navigation_runtime_release(p0, bundleAddInDefaultArgs);
            navigate$navigation_runtime_release(destination, bundleAddInDefaultArgs, p1, p2);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Navigation destination that matches request ");
        sb2.append(p0);
        sb2.append(" cannot be found in the navigation graph ");
        sb2.append(this._graph);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    public final void navigate$navigation_runtime_release(final NavDestination p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
        boolean z;
        boolean zPopBackStackInternal$navigation_runtime_release;
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavController.NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean z2 = false;
        if (p2 == null) {
            z = false;
        } else {
            if (p2.getPopUpToRoute() != null) {
                String popUpToRoute = p2.getPopUpToRoute();
                Intrinsics.checkNotNull(popUpToRoute);
                zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(popUpToRoute, p2.getPopUpToInclusive(), p2.getPopUpToSaveState());
            } else if (p2.getPopUpToRouteClass() != null) {
                KClass<?> popUpToRouteClass = p2.getPopUpToRouteClass();
                Intrinsics.checkNotNull(popUpToRouteClass);
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
                videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) popUpToRouteClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
                if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                    videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(popUpToRouteClass);
                }
                if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                    zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1), p2.getPopUpToInclusive(), p2.getPopUpToSaveState());
                } else {
                    updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(popUpToRouteClass);
                    throw new KotlinNothingValueException();
                }
            } else if (p2.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = p2.getPopUpToRouteObject();
                Intrinsics.checkNotNull(popUpToRouteObject);
                zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(popUpToRouteObject, p2.getPopUpToInclusive(), p2.getPopUpToSaveState());
            } else if (p2.getPopUpToId() != -1) {
                zPopBackStackInternal$navigation_runtime_release = popBackStackInternal$navigation_runtime_release(p2.getPopUpToId(), p2.getPopUpToInclusive(), p2.getPopUpToSaveState());
            } else {
                z = false;
            }
            z = zPopBackStackInternal$navigation_runtime_release;
        }
        final Bundle bundleAddInDefaultArgs = p0.addInDefaultArgs(p1);
        if (p2 != null && p2.getRestoreState() && this.backStackMap.containsKey(Integer.valueOf(p0.getId()))) {
            booleanRef.element = restoreStateInternal(p0.getId(), bundleAddInDefaultArgs, p2, p3);
            z2 = false;
            booleanRef = booleanRef;
        } else {
            boolean z3 = p2 != null && p2.getSingleTop() && launchSingleTopInternal(p0, p1);
            if (!z3) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                navigateInternal$navigation_runtime_release(this._navigatorProvider.getNavigator(p0.getNavigatorName()), CollectionsKt.listOf(companion.create(getNavContext(), p0, (96 & 4) != 0 ? null : bundleAddInDefaultArgs, (96 & 8) != 0 ? Lifecycle.State.CREATED : getHostLifecycleState$navigation_runtime_release(), (96 & 16) != 0 ? null : this.viewModel, (96 & 32) != 0 ? companion.randomUUID$navigation_common_release() : null, (96 & 64) != 0 ? null : null)), p2, p3, new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavControllerImpl.navigate$lambda$44(booleanRef, this, p0, bundleAddInDefaultArgs, (NavBackStackEntry) obj);
                    }
                });
            }
            z2 = z3;
        }
        this.updateOnBackPressedCallbackEnabledCallback.invoke();
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavController.NavControllerNavigatorState) it2.next()).setNavigating(z2);
        }
        if (z || booleanRef.element || z2) {
            dispatchOnDestinationChanged$navigation_runtime_release();
        } else {
            updateBackStackLifecycle$navigation_runtime_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$44(Ref.BooleanRef booleanRef, NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        booleanRef.element = true;
        addEntryToBackStack$default(navControllerImpl, navDestination, bundle, navBackStackEntry, null, 8, null);
        return Unit.INSTANCE;
    }

    private final boolean launchSingleTopInternal(NavDestination p0, Bundle p1) {
        int iNextIndex;
        NavDestination destination;
        NavBackStackEntry currentBackStackEntry$navigation_runtime_release = getCurrentBackStackEntry$navigation_runtime_release();
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().getDestination() == p0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (p0 instanceof NavGraph) {
            List list = SequencesKt.toList(SequencesKt.map(NavGraph.INSTANCE.childHierarchy((NavGraph) p0), new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(NavControllerImpl.launchSingleTopInternal$lambda$47((NavDestination) obj));
                }
            }));
            if (this.backQueue.size() - iNextIndex != list.size()) {
                return false;
            }
            ArrayDeque<NavBackStackEntry> arrayDeque2 = this.backQueue;
            List<NavBackStackEntry> listSubList = arrayDeque2.subList(iNextIndex, arrayDeque2.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).getDestination().getId()));
            }
            if (!Intrinsics.areEqual(arrayList, list)) {
                return false;
            }
        } else if (currentBackStackEntry$navigation_runtime_release == null || (destination = currentBackStackEntry$navigation_runtime_release.getDestination()) == null || p0.getId() != destination.getId()) {
            return false;
        }
        ArrayDeque arrayDeque3 = new ArrayDeque();
        while (CollectionsKt.getLastIndex(this.backQueue) >= iNextIndex) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.removeLast(this.backQueue);
            unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            arrayDeque3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(p1)));
        }
        ArrayDeque<NavBackStackEntry> arrayDeque4 = arrayDeque3;
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque4) {
            NavGraph parent = navBackStackEntry2.getDestination().getParent();
            if (parent != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry2, getBackStackEntry$navigation_runtime_release(parent.getId()));
            }
            this.backQueue.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : arrayDeque4) {
            this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int launchSingleTopInternal$lambda$47(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        return navDestination.getId();
    }

    private final boolean restoreStateInternal(int p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
        if (!this.backStackMap.containsKey(Integer.valueOf(p0))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(p0));
        CollectionsKt.removeAll(this.backStackMap.values(), new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$51(str, (String) obj));
            }
        });
        return executeRestoreState(instantiateBackStack((ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(str)), p1, p2, p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$51(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    private final boolean restoreStateInternal(String p0) {
        NavBackStackEntryState navBackStackEntryStateFirstOrNull;
        int iHashCode = NavDestination.INSTANCE.createRoute(p0).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(iHashCode))) {
            return restoreStateInternal(iHashCode, null, null, null);
        }
        NavDestination navDestinationFindDestination$navigation_runtime_release = findDestination$navigation_runtime_release(p0);
        if (navDestinationFindDestination$navigation_runtime_release == null) {
            StringBuilder sb = new StringBuilder("Restore State failed: route ");
            sb.append(p0);
            sb.append(" cannot be found from the current destination ");
            sb.append(getCurrentDestination$navigation_runtime_release());
            throw new IllegalStateException(sb.toString().toString());
        }
        final String str = this.backStackMap.get(Integer.valueOf(navDestinationFindDestination$navigation_runtime_release.getId()));
        CollectionsKt.removeAll(this.backStackMap.values(), new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$53(str, (String) obj));
            }
        });
        ArrayDeque<NavBackStackEntryState> arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(str);
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = navDestinationFindDestination$navigation_runtime_release.matchRoute(p0);
        Intrinsics.checkNotNull(deepLinkMatchMatchRoute);
        if (deepLinkMatchMatchRoute.hasMatchingArgs((arrayDeque == null || (navBackStackEntryStateFirstOrNull = arrayDeque.firstOrNull()) == null) ? null : navBackStackEntryStateFirstOrNull.getArgs())) {
            return executeRestoreState(instantiateBackStack(arrayDeque), null, null, null);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean restoreStateInternal$lambda$53(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    private final boolean executeRestoreState(final List<NavBackStackEntry> p0, final Bundle p1, NavOptions p2, Navigator.Extras p3) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : p0) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) CollectionsKt.lastOrNull((List) arrayList);
            if (Intrinsics.areEqual((list == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt.last(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(CollectionsKt.mutableListOf(navBackStackEntry2));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<NavBackStackEntry> list2 : arrayList) {
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) CollectionsKt.first((List) list2)).getDestination().getNavigatorName());
            final Ref.IntRef intRef = new Ref.IntRef();
            navigateInternal$navigation_runtime_release(navigator, list2, p2, p3, new Function1() { // from class: androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return NavControllerImpl.executeRestoreState$lambda$57(booleanRef, p0, intRef, this, p1, (NavBackStackEntry) obj2);
                }
            });
        }
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeRestoreState$lambda$57(Ref.BooleanRef booleanRef, List list, Ref.IntRef intRef, NavControllerImpl navControllerImpl, Bundle bundle, NavBackStackEntry navBackStackEntry) {
        List<NavBackStackEntry> listEmptyList;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        booleanRef.element = true;
        int iIndexOf = list.indexOf(navBackStackEntry);
        if (iIndexOf != -1) {
            int i = iIndexOf + 1;
            listEmptyList = list.subList(intRef.element, i);
            intRef.element = i;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        navControllerImpl.addEntryToBackStack(navBackStackEntry.getDestination(), bundle, navBackStackEntry, listEmptyList);
        return Unit.INSTANCE;
    }

    private final List<NavBackStackEntry> instantiateBackStack(ArrayDeque<NavBackStackEntryState> p0) {
        NavGraph graph$navigation_runtime_release;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryLastOrNull = this.backQueue.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (graph$navigation_runtime_release = navBackStackEntryLastOrNull.getDestination()) == null) {
            graph$navigation_runtime_release = getGraph$navigation_runtime_release();
        }
        if (p0 != null) {
            for (NavBackStackEntryState navBackStackEntryState : p0) {
                NavDestination navDestinationFindDestinationComprehensive$navigation_runtime_release$default = findDestinationComprehensive$navigation_runtime_release$default(this, graph$navigation_runtime_release, navBackStackEntryState.getDestinationId(), true, null, 8, null);
                if (navDestinationFindDestinationComprehensive$navigation_runtime_release$default == null) {
                    String displayName = NavDestination.INSTANCE.getDisplayName(getNavContext(), navBackStackEntryState.getDestinationId());
                    StringBuilder sb = new StringBuilder("Restore State failed: destination ");
                    sb.append(displayName);
                    sb.append(" cannot be found from the current destination ");
                    sb.append(graph$navigation_runtime_release);
                    throw new IllegalStateException(sb.toString().toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(getNavContext(), navDestinationFindDestinationComprehensive$navigation_runtime_release$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                graph$navigation_runtime_release = navDestinationFindDestinationComprehensive$navigation_runtime_release$default;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void addEntryToBackStack$default(NavControllerImpl navControllerImpl, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        navControllerImpl.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    private final void addEntryToBackStack(NavDestination p0, Bundle p1, NavBackStackEntry p2, List<NavBackStackEntry> p3) {
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        Bundle bundle = p1;
        NavBackStackEntry navBackStackEntry2 = p2;
        List<NavBackStackEntry> list = p3;
        NavDestination destination = p2.getDestination();
        if (!(destination instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof FloatingWindow) && popBackStackInternal$navigation_runtime_release$default(this, this.backQueue.last().getDestination().getId(), true, false, 4, (Object) null)) {
            }
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = new ArrayDeque();
        NavBackStackEntry navBackStackEntry3 = null;
        if (p0 instanceof NavGraph) {
            NavGraph navGraph = destination;
            while (true) {
                Intrinsics.checkNotNull(navGraph);
                NavGraph parent = navGraph.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list.listIterator(p3.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                        navBackStackEntryPrevious2 = listIterator.previous();
                    } while (!Intrinsics.areEqual(navBackStackEntryPrevious2.getDestination(), parent));
                    NavBackStackEntry navBackStackEntry4 = navBackStackEntryPrevious2;
                    if (navBackStackEntry4 == null) {
                        NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                        NavBackStackEntry navBackStackEntryCreate = companion.create(getNavContext(), parent, (96 & 4) != 0 ? null : p1, (96 & 8) != 0 ? Lifecycle.State.CREATED : getHostLifecycleState$navigation_runtime_release(), (96 & 16) != 0 ? null : this.viewModel, (96 & 32) != 0 ? companion.randomUUID$navigation_common_release() : null, (96 & 64) != 0 ? null : null);
                        navBackStackEntry = navBackStackEntry2;
                        navBackStackEntry4 = navBackStackEntryCreate;
                    } else {
                        navBackStackEntry = navBackStackEntry2;
                    }
                    arrayDeque.addFirst(navBackStackEntry4);
                    if (!this.backQueue.isEmpty() && this.backQueue.last().getDestination() == parent) {
                        popEntryFromBackStack$navigation_runtime_release$default(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    destination = destination;
                    navBackStackEntry = navBackStackEntry2;
                }
                navGraph = parent;
                if (navGraph == null || navGraph == p0) {
                    break;
                }
                navBackStackEntry2 = navBackStackEntry;
                arrayDeque = arrayDeque;
                bundle = bundle;
                list = list;
                destination = destination;
            }
        } else {
            arrayDeque = arrayDeque;
            destination = destination;
            list = list;
            navBackStackEntry = navBackStackEntry2;
            bundle = bundle;
        }
        NavGraph destination2 = arrayDeque.isEmpty() ? destination : ((NavBackStackEntry) arrayDeque.first()).getDestination();
        while (destination2 != null && findDestination$navigation_runtime_release(destination2.getId(), destination2) != destination2) {
            NavGraph parent2 = destination2.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !SavedStateReader.m7446isEmptyimpl(SavedStateReader.m7368constructorimpl(p1))) ? bundle : null;
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(p3.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                    navBackStackEntryPrevious = listIterator2.previous();
                } while (!Intrinsics.areEqual(navBackStackEntryPrevious.getDestination(), parent2));
                NavBackStackEntry navBackStackEntryCreate2 = navBackStackEntryPrevious;
                if (navBackStackEntryCreate2 == null) {
                    NavBackStackEntry.Companion companion2 = NavBackStackEntry.INSTANCE;
                    navBackStackEntryCreate2 = companion2.create(getNavContext(), parent2, (96 & 4) != 0 ? null : parent2.addInDefaultArgs(bundle2), (96 & 8) != 0 ? Lifecycle.State.CREATED : getHostLifecycleState$navigation_runtime_release(), (96 & 16) != 0 ? null : this.viewModel, (96 & 32) != 0 ? companion2.randomUUID$navigation_common_release() : null, (96 & 64) != 0 ? null : null);
                }
                arrayDeque.addFirst(navBackStackEntryCreate2);
            }
            destination2 = parent2;
        }
        if (!arrayDeque.isEmpty()) {
            destination = ((NavBackStackEntry) arrayDeque.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            NavDestination destination3 = this.backQueue.last().getDestination();
            Intrinsics.checkNotNull(destination3, "");
            if (((NavGraph) destination3).getNodes().get(destination.getId()) != null) {
                break;
            } else {
                popEntryFromBackStack$navigation_runtime_release$default(this, this.backQueue.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntryFirstOrNull = this.backQueue.firstOrNull();
        if (navBackStackEntryFirstOrNull == null) {
            navBackStackEntryFirstOrNull = (NavBackStackEntry) arrayDeque.firstOrNull();
        }
        if (!Intrinsics.areEqual(navBackStackEntryFirstOrNull != null ? navBackStackEntryFirstOrNull.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(p3.size());
            while (listIterator3.hasPrevious()) {
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination4 = navBackStackEntryPrevious3.getDestination();
                NavGraph navGraph2 = this._graph;
                Intrinsics.checkNotNull(navGraph2);
                if (Intrinsics.areEqual(destination4, navGraph2)) {
                    navBackStackEntry3 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryCreate3 = navBackStackEntry3;
            if (navBackStackEntryCreate3 == null) {
                NavBackStackEntry.Companion companion3 = NavBackStackEntry.INSTANCE;
                NavContext navContext = getNavContext();
                NavGraph navGraph3 = this._graph;
                Intrinsics.checkNotNull(navGraph3);
                NavGraph navGraph4 = navGraph3;
                NavGraph navGraph5 = this._graph;
                Intrinsics.checkNotNull(navGraph5);
                navBackStackEntryCreate3 = companion3.create(navContext, navGraph4, (96 & 4) != 0 ? null : navGraph5.addInDefaultArgs(bundle), (96 & 8) != 0 ? Lifecycle.State.CREATED : getHostLifecycleState$navigation_runtime_release(), (96 & 16) != 0 ? null : this.viewModel, (96 & 32) != 0 ? companion3.randomUUID$navigation_common_release() : null, (96 & 64) != 0 ? null : null);
            }
            arrayDeque.addFirst(navBackStackEntryCreate3);
        }
        for (NavBackStackEntry navBackStackEntry5 : arrayDeque) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry5.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                StringBuilder sb = new StringBuilder("NavigatorBackStack for ");
                sb.append(p0.getNavigatorName());
                sb.append(" should already be created");
                throw new IllegalStateException(sb.toString().toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry5);
        }
        ArrayDeque arrayDeque2 = arrayDeque;
        this.backQueue.addAll(arrayDeque2);
        this.backQueue.add(navBackStackEntry);
        for (NavBackStackEntry navBackStackEntry6 : CollectionsKt.plus((Collection<? extends NavBackStackEntry>) arrayDeque2, navBackStackEntry)) {
            NavGraph parent3 = navBackStackEntry6.getDestination().getParent();
            if (parent3 != null) {
                linkChildToParent$navigation_runtime_release(navBackStackEntry6, getBackStackEntry$navigation_runtime_release(parent3.getId()));
            }
        }
    }

    public final void navigate$navigation_runtime_release(String p0, Function1<? super NavOptionsBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        navigate$navigation_runtime_release$default(this, p0, NavOptionsBuilderKt.navOptions(p1), (Navigator.Extras) null, 4, (Object) null);
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if ((i & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release(str, navOptions, extras);
    }

    public final void navigate$navigation_runtime_release(String p0, NavOptions p1, Navigator.Extras p2) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(p0, "");
        if (this._graph == null) {
            StringBuilder sb = new StringBuilder("Cannot navigate to ");
            sb.append(p0);
            sb.append(". Navigation graph has not been set for NavController ");
            sb.append(this);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        NavGraph topGraph$navigation_runtime_release = getTopGraph$navigation_runtime_release();
        NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = topGraph$navigation_runtime_release.matchRouteComprehensive(p0, true, true, topGraph$navigation_runtime_release);
        if (deepLinkMatchMatchRouteComprehensive != null) {
            NavDestination destination = deepLinkMatchMatchRouteComprehensive.getDestination();
            Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchRouteComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs == null) {
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleAddInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m7454constructorimpl(bundleAddInDefaultArgs);
            }
            NavDestination destination2 = deepLinkMatchMatchRouteComprehensive.getDestination();
            this.navController.writeIntent$navigation_runtime_release(NavDeepLinkRequest.Builder.INSTANCE.fromUri(NavUriKt.NavUri(NavDestination.INSTANCE.createRoute(destination.getRoute()))).build(), bundleAddInDefaultArgs);
            navigate$navigation_runtime_release(destination2, bundleAddInDefaultArgs, p1, p2);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Navigation destination that matches route ");
        sb2.append(p0);
        sb2.append(" cannot be found in the navigation graph ");
        sb2.append(this._graph);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> void navigate$navigation_runtime_release(T p0, Function1<? super NavOptionsBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        navigate$navigation_runtime_release$default(this, p0, NavOptionsBuilderKt.navOptions(p1), (Navigator.Extras) null, 4, (Object) null);
    }

    public static /* synthetic */ void navigate$navigation_runtime_release$default(NavControllerImpl navControllerImpl, Object obj, NavOptions navOptions, Navigator.Extras extras, int i, Object obj2) {
        if ((i & 4) != 0) {
            extras = null;
        }
        navControllerImpl.navigate$navigation_runtime_release(obj, navOptions, extras);
    }

    public final <T> void navigate$navigation_runtime_release(T p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(p0), p1, p2);
    }

    public final Bundle saveState$navigation_runtime_release() {
        Pair[] pairArr;
        Bundle bundleBundleOf;
        Pair[] pairArr2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        Pair[] pairArr5;
        ArrayList arrayList = new ArrayList();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList2.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf2);
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry2 : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleOnSaveState = entry2.getValue().onSaveState();
            if (bundleOnSaveState != null) {
                arrayList.add(key);
                SavedStateWriter.m7481putSavedStateimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf2), key, bundleOnSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundleBundleOf = null;
        } else {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr5 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry3 : mapEmptyMap2.entrySet()) {
                    arrayList3.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
                }
                pairArr5 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr5, pairArr5.length));
            Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(bundleBundleOf);
            SavedStateWriter.m7489putStringListimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf2), KEY_NAVIGATOR_STATE_NAMES, arrayList);
            SavedStateWriter.m7481putSavedStateimpl(bundleM7454constructorimpl, KEY_NAVIGATOR_STATE, bundleBundleOf2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapEmptyMap3 = MapsKt.emptyMap();
                if (mapEmptyMap3.isEmpty()) {
                    pairArr4 = new Pair[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(mapEmptyMap3.size());
                    for (Map.Entry entry4 : mapEmptyMap3.entrySet()) {
                        arrayList4.add(TuplesKt.to((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr4 = (Pair[]) arrayList4.toArray(new Pair[0]);
                }
                Bundle bundleBundleOf3 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr4, pairArr4.length));
                SavedStateWriter.m7454constructorimpl(bundleBundleOf3);
                bundleBundleOf = bundleBundleOf3;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<NavBackStackEntry> it = this.backQueue.iterator();
            while (it.hasNext()) {
                arrayList5.add(new NavBackStackEntryState(it.next()).writeToState());
            }
            SavedStateWriter.m7483putSavedStateListimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), KEY_BACK_STACK, arrayList5);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapEmptyMap4 = MapsKt.emptyMap();
                if (mapEmptyMap4.isEmpty()) {
                    pairArr3 = new Pair[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(mapEmptyMap4.size());
                    for (Map.Entry entry5 : mapEmptyMap4.entrySet()) {
                        arrayList6.add(TuplesKt.to((String) entry5.getKey(), entry5.getValue()));
                    }
                    pairArr3 = (Pair[]) arrayList6.toArray(new Pair[0]);
                }
                Bundle bundleBundleOf4 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
                SavedStateWriter.m7454constructorimpl(bundleBundleOf4);
                bundleBundleOf = bundleBundleOf4;
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList arrayList7 = new ArrayList();
            int i = 0;
            for (Map.Entry<Integer, String> entry6 : this.backStackMap.entrySet()) {
                int iIntValue = entry6.getKey().intValue();
                String value = entry6.getValue();
                iArr[i] = iIntValue;
                if (value == null) {
                    value = "";
                }
                arrayList7.add(value);
                i++;
            }
            Bundle bundleM7454constructorimpl2 = SavedStateWriter.m7454constructorimpl(bundleBundleOf);
            SavedStateWriter.m7472putIntArrayimpl(bundleM7454constructorimpl2, KEY_BACK_STACK_DEST_IDS, iArr);
            SavedStateWriter.m7489putStringListimpl(bundleM7454constructorimpl2, KEY_BACK_STACK_IDS, arrayList7);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundleBundleOf == null) {
                Map mapEmptyMap5 = MapsKt.emptyMap();
                if (mapEmptyMap5.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList8 = new ArrayList(mapEmptyMap5.size());
                    for (Map.Entry entry7 : mapEmptyMap5.entrySet()) {
                        arrayList8.add(TuplesKt.to((String) entry7.getKey(), entry7.getValue()));
                    }
                    pairArr2 = (Pair[]) arrayList8.toArray(new Pair[0]);
                }
                Bundle bundleBundleOf5 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                SavedStateWriter.m7454constructorimpl(bundleBundleOf5);
                bundleBundleOf = bundleBundleOf5;
            }
            ArrayList arrayList9 = new ArrayList();
            for (Map.Entry<String, ArrayDeque<NavBackStackEntryState>> entry8 : this.backStackStates.entrySet()) {
                String key2 = entry8.getKey();
                ArrayDeque<NavBackStackEntryState> value2 = entry8.getValue();
                arrayList9.add(key2);
                ArrayList arrayList10 = new ArrayList();
                Iterator<NavBackStackEntryState> it2 = value2.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(it2.next().writeToState());
                }
                SavedStateWriter.m7483putSavedStateListimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), KEY_BACK_STACK_STATES_PREFIX.concat(String.valueOf(key2)), arrayList10);
            }
            SavedStateWriter.m7489putStringListimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), KEY_BACK_STACK_STATES_IDS, arrayList9);
        }
        return bundleBundleOf;
    }

    public final void setLifecycleOwner$navigation_runtime_release(LifecycleOwner p0) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = p0;
        p0.getLifecycle().addObserver(this.lifecycleObserver);
    }

    public final void setViewModelStore$navigation_runtime_release(ViewModelStore p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(this.viewModel, NavControllerViewModel.INSTANCE.getInstance(p0))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.viewModel = NavControllerViewModel.INSTANCE.getInstance(p0);
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$navigation_runtime_release(int p0) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
        }
        NavBackStackEntry backStackEntry$navigation_runtime_release = getBackStackEntry$navigation_runtime_release(p0);
        if (!(backStackEntry$navigation_runtime_release.getDestination() instanceof NavGraph)) {
            StringBuilder sb = new StringBuilder("No NavGraph with ID ");
            sb.append(p0);
            sb.append(" is on the NavController's back stack");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        return backStackEntry$navigation_runtime_release;
    }

    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(int p0) {
        NavBackStackEntry navBackStackEntryPrevious;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (navBackStackEntryPrevious.getDestination().getId() != p0);
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sb = new StringBuilder("No destination with ID ");
        sb.append(p0);
        sb.append(" is on the NavController's back stack. The current destination is ");
        sb.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final NavBackStackEntry getBackStackEntry$navigation_runtime_release(String p0) {
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntry;
        Intrinsics.checkNotNullParameter(p0, "");
        ArrayDeque<NavBackStackEntry> arrayDeque = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            navBackStackEntry = navBackStackEntryPrevious;
        } while (!navBackStackEntry.getDestination().hasRoute(p0, navBackStackEntry.getArguments()));
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        StringBuilder sb = new StringBuilder("No destination with route ");
        sb.append(p0);
        sb.append(" is on the NavController's back stack. The current destination is ");
        sb.append(getCurrentDestination$navigation_runtime_release());
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final <T> NavBackStackEntry getBackStackEntry$navigation_runtime_release(T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getBackStackEntry$navigation_runtime_release(generateRouteFilled$navigation_runtime_release(p0));
    }

    public final NavBackStackEntry getCurrentBackStackEntry$navigation_runtime_release() {
        return this.backQueue.lastOrNull();
    }

    public final lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<NavBackStackEntry> get_currentBackStackEntryFlow$navigation_runtime_release() {
        return this._currentBackStackEntryFlow;
    }

    public final NavBackStackEntry getPreviousBackStackEntry$navigation_runtime_release() {
        Object next;
        Iterator it = CollectionsKt.reversed(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt.asSequence(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof NavGraph)) {
                return (NavBackStackEntry) next;
            }
        }
        next = null;
        return (NavBackStackEntry) next;
    }

    public final void restoreState$navigation_runtime_release(Bundle p0) {
        if (p0 != null) {
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            this.navigatorStateToRestore = SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_NAVIGATOR_STATE) ? SavedStateReader.m7425getSavedStateimpl(bundleM7368constructorimpl, KEY_NAVIGATOR_STATE) : null;
            int i = 0;
            this.backStackToRestore = SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_BACK_STACK) ? (Bundle[]) SavedStateReader.m7428getSavedStateListimpl(bundleM7368constructorimpl, KEY_BACK_STACK).toArray(new Bundle[0]) : null;
            this.backStackStates.clear();
            if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_BACK_STACK_DEST_IDS) && SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_BACK_STACK_IDS)) {
                int[] iArrM7400getIntArrayimpl = SavedStateReader.m7400getIntArrayimpl(bundleM7368constructorimpl, KEY_BACK_STACK_DEST_IDS);
                List<String> listM7442getStringListimpl = SavedStateReader.m7442getStringListimpl(bundleM7368constructorimpl, KEY_BACK_STACK_IDS);
                int length = iArrM7400getIntArrayimpl.length;
                int i2 = 0;
                while (i < length) {
                    this.backStackMap.put(Integer.valueOf(iArrM7400getIntArrayimpl[i]), !Intrinsics.areEqual(listM7442getStringListimpl.get(i2), "") ? listM7442getStringListimpl.get(i2) : null);
                    i++;
                    i2++;
                }
            }
            if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_BACK_STACK_STATES_IDS)) {
                for (String str : SavedStateReader.m7442getStringListimpl(bundleM7368constructorimpl, KEY_BACK_STACK_STATES_IDS)) {
                    if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, KEY_BACK_STACK_STATES_PREFIX.concat(String.valueOf(str)))) {
                        List<Bundle> listM7428getSavedStateListimpl = SavedStateReader.m7428getSavedStateListimpl(bundleM7368constructorimpl, KEY_BACK_STACK_STATES_PREFIX.concat(String.valueOf(str)));
                        Map<String, ArrayDeque<NavBackStackEntryState>> map = this.backStackStates;
                        ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>(listM7428getSavedStateListimpl.size());
                        Iterator<Bundle> it = listM7428getSavedStateListimpl.iterator();
                        while (it.hasNext()) {
                            arrayDeque.add(new NavBackStackEntryState(it.next()));
                        }
                        map.put(str, arrayDeque);
                    }
                }
            }
        }
    }

    public final <T> boolean clearBackStack$navigation_runtime_release(KClass<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) p0), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            return clearBackStack$navigation_runtime_release(RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1));
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) p0);
        throw new KotlinNothingValueException();
    }

    public final <T> NavBackStackEntry getBackStackEntry$navigation_runtime_release(KClass<T> p0) {
        NavBackStackEntry navBackStackEntryPrevious;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) p0), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            int iGenerateHashCode = RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1);
            if (findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), iGenerateHashCode, true, null, 8, null) == null) {
                StringBuilder sb = new StringBuilder("Destination with route ");
                sb.append(p0.getSimpleName());
                sb.append(" cannot be found in navigation graph ");
                sb.append(getGraph$navigation_runtime_release());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            List<NavBackStackEntry> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.currentBackStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            ListIterator<NavBackStackEntry> listIterator = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.listIterator(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
            do {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntryPrevious = null;
                    break;
                }
                navBackStackEntryPrevious = listIterator.previous();
            } while (navBackStackEntryPrevious.getDestination().getId() != iGenerateHashCode);
            NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
            if (navBackStackEntry != null) {
                return navBackStackEntry;
            }
            StringBuilder sb2 = new StringBuilder("No destination with route ");
            sb2.append(p0.getSimpleName());
            sb2.append(" is on the NavController's back stack. The current destination is ");
            sb2.append(getCurrentDestination$navigation_runtime_release());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) p0);
        throw new KotlinNothingValueException();
    }

    public final <T> boolean popBackStack$navigation_runtime_release(KClass<T> p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p0, "");
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) p0), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            int iGenerateHashCode = RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1);
            if (findDestinationComprehensive$navigation_runtime_release$default(this, getGraph$navigation_runtime_release(), iGenerateHashCode, true, null, 8, null) == null) {
                StringBuilder sb = new StringBuilder("Destination with route ");
                sb.append(p0.getSimpleName());
                sb.append(" cannot be found in navigation graph ");
                sb.append(getGraph$navigation_runtime_release());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return popBackStack$navigation_runtime_release(iGenerateHashCode, p1, p2);
        }
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) p0);
        throw new KotlinNothingValueException();
    }
}
