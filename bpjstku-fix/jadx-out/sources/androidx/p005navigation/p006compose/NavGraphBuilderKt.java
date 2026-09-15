package androidx.p005navigation.p006compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.NamedNavArgument;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavDeepLink;
import androidx.p005navigation.NavGraph;
import androidx.p005navigation.NavGraphBuilder;
import androidx.p005navigation.NavType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aT\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0087\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\r\u0010\u001a\u001a¯\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012¢\u0006\u0004\b\r\u0010\u001d\u001aÇ\u0002\u0010\r\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u001d\b\u0002\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\n\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122$\b\b\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012H\u0087\b¢\u0006\u0004\b\r\u0010#\u001aÎ\u0002\u0010\r\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u001d\b\u0002\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012¢\u0006\u0004\b\r\u0010%\u001a\\\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b&\u0010'\u001að\u0001\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032#\b\u0002\u0010\u0014\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0015\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0016\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0019\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b&\u0010(\u001a¬\u0002\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012¢\u0006\u0004\b&\u0010*\u001aÈ\u0002\u0010&\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030$2\u001d\b\u0002\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\n\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0019\b\b\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0086\b¢\u0006\u0004\b&\u0010+\u001aÏ\u0002\u0010&\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012¢\u0006\u0004\b&\u0010,\u001aÄ\u0002\u0010&\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001e2\u001d\b\u0002\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\n\u0010\f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0019\b\b\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0086\b¢\u0006\u0004\b&\u0010-\u001aË\u0002\u0010&\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u001d\b\u0002\u0010\u0007\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0014\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0013¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012¢\u0006\u0004\b&\u0010.\u001a\\\u00100\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\f\u001a\u00020/2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b0\u00101\u001at\u00100\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u001d\b\u0002\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020/2\u0019\b\b\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\b¢\u0006\u0004\b0\u00102\u001a{\u00100\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u001d\b\u0002\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\f\u001a\u00020/2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b0\u00103"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "p0", "", "Landroidx/navigation/NamedNavArgument;", "p1", "Landroidx/navigation/NavDeepLink;", "p2", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "p3", ComposeNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/animation/ExitTransition;", "p4", "p5", "p6", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "p7", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/animation/SizeTransform;", "p8", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/reflect/KClass;", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/reflect/KClass;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "navigation", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "p9", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/reflect/KClass;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/window/DialogProperties;", DialogNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/reflect/KClass;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavGraphBuilderKt {
    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function3 function3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        composable(navGraphBuilder, str, list, list2, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports AnimatedContent")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, final Function3 function3) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (Function4<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambdaInstance(-1516831465, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavGraphBuilderKt.composable.1
            @Override // kotlin.jvm.functions.Function4
            public final /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1516831465, i, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:55)");
                }
                function3.invoke(navBackStackEntry, composer, Integer.valueOf((i >> 3) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        destination.setRoute(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            destination.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function4 function5, int i, Object obj) {
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i & 4) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function6 = (i & 8) != 0 ? null : function1;
        Function1 function7 = (i & 16) != 0 ? null : function2;
        composable(navGraphBuilder, str, listEmptyList, listEmptyList2, function6, function7, (i & 32) != 0 ? function6 : function3, (i & 64) != 0 ? function7 : function4, function5);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports sizeTransform")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function4 function5) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, function5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            composeNavigatorDestinationBuilder.argument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it2.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(function1);
        composeNavigatorDestinationBuilder.setExitTransition(function2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(function3);
        composeNavigatorDestinationBuilder.setPopExitTransition(function4);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function4 function6, int i, Object obj) {
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i & 4) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function7 = (i & 8) != 0 ? null : function1;
        Function1 function8 = (i & 16) != 0 ? null : function2;
        composable(navGraphBuilder, str, (List<NamedNavArgument>) listEmptyList, (List<NavDeepLink>) listEmptyList2, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i & 32) != 0 ? function7 : function3), (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i & 64) != 0 ? function8 : function4), (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) ((i & 128) != 0 ? null : function5), (Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit>) function6);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function6) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, function6);
        for (NamedNavArgument namedNavArgument : list) {
            composeNavigatorDestinationBuilder.argument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(function1);
        composeNavigatorDestinationBuilder.setExitTransition(function2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(function3);
        composeNavigatorDestinationBuilder.setPopExitTransition(function4);
        composeNavigatorDestinationBuilder.setSizeTransform(function5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function4 function6, int i, Object obj) {
        Map mapEmptyMap = (i & 1) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i & 4) != 0 ? null : function1;
        Function1 function8 = (i & 8) != 0 ? null : function2;
        Function1 function9 = (i & 16) != 0 ? function7 : function3;
        Function1 function10 = (i & 32) != 0 ? function8 : function4;
        Function1 function11 = (i & 64) != 0 ? null : function5;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        composable(navGraphBuilder, Reflection.getOrCreateKotlinClass(Object.class), (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function9, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function10, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) function11, (Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit>) function6);
    }

    public static final /* synthetic */ <T> void composable(NavGraphBuilder navGraphBuilder, Map<KType, NavType<?>> map, List<NavDeepLink> list, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function6) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        composable(navGraphBuilder, Reflection.getOrCreateKotlinClass(Object.class), map, list, function1, function2, function3, function4, function5, function6);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, KClass kClass, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function4 function6, int i, Object obj) {
        Map mapEmptyMap = (i & 2) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i & 8) != 0 ? null : function1;
        Function1 function8 = (i & 16) != 0 ? null : function2;
        composable(navGraphBuilder, kClass, (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i & 32) != 0 ? function7 : function3), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i & 64) != 0 ? function8 : function4), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) ((i & 128) != 0 ? null : function5), (Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit>) function6);
    }

    public static final <T> void composable(NavGraphBuilder navGraphBuilder, KClass<T> kClass, Map<KType, NavType<?>> map, List<NavDeepLink> list, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function6) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), kClass, map, function6);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(function1);
        composeNavigatorDestinationBuilder.setExitTransition(function2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(function3);
        composeNavigatorDestinationBuilder.setPopExitTransition(function4);
        composeNavigatorDestinationBuilder.setSizeTransform(function5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list2, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, (Function1<? super NavGraphBuilder, Unit>) function1);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i, Object obj) {
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i & 8) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function6 = (i & 16) != 0 ? null : function1;
        Function1 function7 = (i & 32) != 0 ? null : function2;
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) listEmptyList, (List<NavDeepLink>) listEmptyList2, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function6, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function7, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i & 64) != 0 ? function6 : function3), (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i & 128) != 0 ? function7 : function4), (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, (Function1<? super NavGraphBuilder, Unit>) function5);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, Object obj) {
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i & 8) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function7 = (i & 16) != 0 ? null : function1;
        Function1 function8 = (i & 32) != 0 ? null : function2;
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) listEmptyList, (List<NavDeepLink>) listEmptyList2, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i & 64) != 0 ? function7 : function3), (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i & 128) != 0 ? function8 : function4), (Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) ((i & 256) != 0 ? null : function5), (Function1<? super NavGraphBuilder, Unit>) function6);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, List<NamedNavArgument> list, List<NavDeepLink> list2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function1<? super NavGraphBuilder, Unit> function6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        function6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            navGraphBuild.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(function1);
            composeNavGraph.setExitTransition$navigation_compose_release(function2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(function3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(function4);
            composeNavGraph.setSizeTransform$navigation_compose_release(function5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, KClass kClass, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, Object obj) {
        Map mapEmptyMap = (i & 2) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i & 8) != 0 ? null : function1;
        Function1 function8 = (i & 16) != 0 ? null : function2;
        Function1 function9 = (i & 32) != 0 ? function7 : function3;
        Function1 function10 = (i & 64) != 0 ? function8 : function4;
        Function1 function11 = (i & 128) != 0 ? null : function5;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, (KClass<?>) kClass, Reflection.getOrCreateKotlinClass(Object.class), (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function9, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function10, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) function11, (Function1<? super NavGraphBuilder, Unit>) function6);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, KClass<?> kClass, Map<KType, NavType<?>> map, List<NavDeepLink> list, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function1<? super NavGraphBuilder, Unit> function6) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, kClass, Reflection.getOrCreateKotlinClass(Object.class), map, list, function1, function2, function3, function4, function5, function6);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, KClass kClass, KClass kClass2, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, Object obj) {
        Map mapEmptyMap = (i & 4) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i & 16) != 0 ? null : function1;
        Function1 function8 = (i & 32) != 0 ? null : function2;
        navigation(navGraphBuilder, (KClass<?>) kClass, kClass2, (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i & 64) != 0 ? function7 : function3), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i & 128) != 0 ? function8 : function4), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) ((i & 256) != 0 ? null : function5), (Function1<? super NavGraphBuilder, Unit>) function6);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, KClass<?> kClass, KClass<T> kClass2, Map<KType, NavType<?>> map, List<NavDeepLink> list, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function1<? super NavGraphBuilder, Unit> function6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), kClass, (KClass<?>) kClass2, map);
        function6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(function1);
            composeNavGraph.setExitTransition$navigation_compose_release(function2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(function3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(function4);
            composeNavGraph.setSizeTransform$navigation_compose_release(function5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, Object obj2) {
        Map mapEmptyMap = (i & 2) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i & 8) != 0 ? null : function1;
        Function1 function8 = (i & 16) != 0 ? null : function2;
        Function1 function9 = (i & 32) != 0 ? function7 : function3;
        Function1 function10 = (i & 64) != 0 ? function8 : function4;
        Function1 function11 = (i & 128) != 0 ? null : function5;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, obj, Reflection.getOrCreateKotlinClass(Object.class), (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function9, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function10, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) function11, (Function1<? super NavGraphBuilder, Unit>) function6);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, Map<KType, NavType<?>> map, List<NavDeepLink> list, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function1<? super NavGraphBuilder, Unit> function6) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, obj, Reflection.getOrCreateKotlinClass(Object.class), map, list, function1, function2, function3, function4, function5, function6);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, KClass kClass, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, Object obj2) {
        Map mapEmptyMap = (i & 4) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i & 16) != 0 ? null : function1;
        Function1 function8 = (i & 32) != 0 ? null : function2;
        navigation(navGraphBuilder, obj, kClass, (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) function7, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) function8, (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i & 64) != 0 ? function7 : function3), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i & 128) != 0 ? function8 : function4), (Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) ((i & 256) != 0 ? null : function5), (Function1<? super NavGraphBuilder, Unit>) function6);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, KClass<T> kClass, Map<KType, NavType<?>> map, List<NavDeepLink> list, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function4, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function5, Function1<? super NavGraphBuilder, Unit> function6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), obj, (KClass<?>) kClass, map);
        function6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(function1);
            composeNavGraph.setExitTransition$navigation_compose_release(function2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(function3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(function4);
            composeNavGraph.setSizeTransform$navigation_compose_release(function5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, DialogProperties dialogProperties, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), str, dialogProperties, function3);
        for (NamedNavArgument namedNavArgument : list) {
            dialogNavigatorDestinationBuilder.argument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map map, List list, DialogProperties dialogProperties, Function3 function3, int i, Object obj) {
        Map mapEmptyMap = (i & 1) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        DialogProperties dialogProperties2 = (i & 4) != 0 ? new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null) : dialogProperties;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        dialog(navGraphBuilder, Reflection.getOrCreateKotlinClass(Object.class), (Map<KType, NavType<?>>) mapEmptyMap, (List<NavDeepLink>) listEmptyList, dialogProperties2, (Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit>) function3);
    }

    public static final /* synthetic */ <T> void dialog(NavGraphBuilder navGraphBuilder, Map<KType, NavType<?>> map, List<NavDeepLink> list, DialogProperties dialogProperties, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        dialog(navGraphBuilder, Reflection.getOrCreateKotlinClass(Object.class), map, list, dialogProperties, function3);
    }

    public static final <T> void dialog(NavGraphBuilder navGraphBuilder, KClass<T> kClass, Map<KType, NavType<?>> map, List<NavDeepLink> list, DialogProperties dialogProperties, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), kClass, map, dialogProperties, function3);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }
}
