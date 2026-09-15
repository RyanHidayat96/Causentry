package androidx.view;

import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.app.PictureInPictureParamsCompat;
import androidx.core.app.PictureInPictureProvider;
import androidx.core.app.PictureInPictureUiStateCompat;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.p002lifecycle.C0654ViewTreeLifecycleOwner;
import androidx.p002lifecycle.C0656ViewTreeViewModelStoreOwner;
import androidx.p002lifecycle.HasDefaultViewModelProviderFactory;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LifecycleRegistry;
import androidx.p002lifecycle.ReportFragment;
import androidx.p002lifecycle.SavedStateHandleSupport;
import androidx.p002lifecycle.SavedStateViewModelFactory;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import androidx.p002lifecycle.viewmodel.MutableCreationExtras;
import androidx.p010navigationevent.DirectNavigationEventInput;
import androidx.p010navigationevent.NavigationEventDispatcher;
import androidx.p010navigationevent.NavigationEventDispatcherOwner;
import androidx.p013savedstate.C0681ViewTreeSavedStateRegistryOwner;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.SavedStateRegistryController;
import androidx.p013savedstate.SavedStateRegistryOwner;
import androidx.tracing.Trace;
import androidx.view.contextaware.ContextAware;
import androidx.view.contextaware.ContextAwareHelper;
import androidx.view.contextaware.OnContextAvailableListener;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.ActivityResultRegistryOwner;
import androidx.view.result.contract.ActivityResultContract;
import androidx.view.result.contract.ActivityResultContracts;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\bÝ\u0001Þ\u0001ß\u0001Ü\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0017H\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u0019\u0010 \u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b \u0010\"J#\u0010 \u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b \u0010%J#\u0010&\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0018H\u0017¢\u0006\u0004\b'\u0010\u0013J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020+¢\u0006\u0004\b.\u0010-J)\u00102\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010!2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020/H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020;2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b<\u0010>J'\u0010<\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020;2\u0006\u0010$\u001a\u00020\u00032\u0006\u00100\u001a\u00020?H\u0017¢\u0006\u0004\b<\u0010@J\u0017\u0010A\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020;H\u0016¢\u0006\u0004\bA\u0010=J\u000f\u0010B\u001a\u00020\u0018H\u0016¢\u0006\u0004\bB\u0010\u0013J\u000f\u0010C\u001a\u00020\u0018H\u0002¢\u0006\u0004\bC\u0010\u0013J\u000f\u0010D\u001a\u00020\u0018H\u0017¢\u0006\u0004\bD\u0010\u0013J\u0017\u0010F\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020EH\u0003¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020H2\u0006\u0010$\u001a\u00020\u0014H\u0017¢\u0006\u0004\bI\u0010JJ)\u0010I\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020H2\u0006\u0010$\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\bI\u0010KJA\u0010P\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020L2\u0006\u0010$\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010H2\u0006\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00142\u0006\u0010O\u001a\u00020\u0014H\u0017¢\u0006\u0004\bP\u0010QJK\u0010P\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020L2\u0006\u0010$\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010H2\u0006\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00142\u0006\u0010O\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\bP\u0010SJ)\u0010T\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010HH\u0015¢\u0006\u0004\bT\u0010UJ-\u0010Y\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020W0V2\u0006\u00100\u001a\u00020XH\u0017¢\u0006\u0004\bY\u0010ZJK\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010[\"\u0004\b\u0001\u0010\\2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]2\u0006\u0010$\u001a\u00020^2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010_H\u0007¢\u0006\u0004\ba\u0010bJC\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010[\"\u0004\b\u0001\u0010\\2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010_H\u0007¢\u0006\u0004\ba\u0010cJ\u0017\u0010e\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020dH\u0017¢\u0006\u0004\be\u0010fJ\u001b\u0010h\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020d0g¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020d0g¢\u0006\u0004\bj\u0010iJ\u0017\u0010k\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\bk\u0010\u0016J\u001b\u0010l\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140g¢\u0006\u0004\bl\u0010iJ\u001b\u0010m\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140g¢\u0006\u0004\bm\u0010iJ\u0017\u0010n\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020HH\u0015¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0g¢\u0006\u0004\bp\u0010iJ\u001b\u0010q\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0g¢\u0006\u0004\bq\u0010iJ\u0017\u0010r\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u000201H\u0017¢\u0006\u0004\br\u0010sJ\u001f\u0010r\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u0002012\u0006\u0010$\u001a\u00020dH\u0017¢\u0006\u0004\br\u0010tJ\u001b\u0010v\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020u0g¢\u0006\u0004\bv\u0010iJ\u001b\u0010w\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020u0g¢\u0006\u0004\bw\u0010iJ\u0017\u0010x\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u000201H\u0017¢\u0006\u0004\bx\u0010sJ\u001f\u0010x\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u0002012\u0006\u0010$\u001a\u00020dH\u0017¢\u0006\u0004\bx\u0010tJ\u0017\u0010z\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020yH\u0017¢\u0006\u0004\bz\u0010{J\u001b\u0010}\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020|0g¢\u0006\u0004\b}\u0010iJ\u001b\u0010~\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020|0g¢\u0006\u0004\b~\u0010iJ\u001d\u0010\u0080\u0001\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u007f0g¢\u0006\u0005\b\u0080\u0001\u0010iJ\u001d\u0010\u0081\u0001\u001a\u00020\u00182\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u007f0g¢\u0006\u0005\b\u0081\u0001\u0010iJ\u0019\u0010\u0083\u0001\u001a\u00020\u00182\u0007\u0010\u0015\u001a\u00030\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\u00182\u0007\u0010\u0015\u001a\u00030\u0082\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u0018H\u0015¢\u0006\u0005\b\u0086\u0001\u0010\u0013J\u0019\u0010\u0088\u0001\u001a\u00020\u00182\u0007\u0010\u0015\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u00020\u00182\u0007\u0010\u0015\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0013J\u0013\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u0098\u0001\u0010\u0013R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u008c\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018WX\u0097\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010[R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001f\u0010¨\u0001\u001a\u00020^8\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R$\u0010\u00ad\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0g0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R$\u0010¯\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140g0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010®\u0001R$\u0010°\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0g0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b°\u0001\u0010®\u0001R$\u0010±\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0g0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b±\u0001\u0010®\u0001R$\u0010²\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0g0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b²\u0001\u0010®\u0001R$\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0g0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b³\u0001\u0010®\u0001R\u001f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b´\u0001\u0010®\u0001R\u0019\u0010µ\u0001\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¶\u0001R!\u0010¼\u0001\u001a\u00030¸\u00018CX\u0083\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010 \u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0019\u0010½\u0001\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¶\u0001R\u0018\u0010¿\u0001\u001a\u0004\u0018\u00010\u001c8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u001eR\u0018\u0010Ã\u0001\u001a\u00030À\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Æ\u0001\u001a\u00030\u0099\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R!\u0010Ë\u0001\u001a\u00030Ç\u00018WX\u0097\u0084\u0002¢\u0006\u0010\n\u0006\bÈ\u0001\u0010 \u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R \u0010Ó\u0001\u001a\u00020E8GX\u0087\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010 \u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010Û\u0001\u001a\u00030Ø\u00018G¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/PictureInPictureProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "<init>", "()V", "", "p0", "(I)V", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "onSaveInstanceState", "", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "setContentView", "Landroid/view/View;", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "p1", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "Landroid/view/Menu;", "p2", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "ensureViewModelStore", "onBackPressed", "Landroidx/activity/OnBackPressedDispatcher;", "addObserverForBackInvoker", "(Landroidx/activity/OnBackPressedDispatcher;)V", "Landroid/content/Intent;", "startActivityForResult", "(Landroid/content/Intent;I)V", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "p3", "p4", "p5", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "p6", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/ActivityResultRegistry;", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "onPictureInPictureModeChanged", "Landroid/app/PictureInPictureUiState;", "onPictureInPictureUiStateChanged", "(Landroid/app/PictureInPictureUiState;)V", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "Landroidx/core/app/PictureInPictureUiStateCompat;", "addOnPictureInPictureUiStateChangedListener", "removeOnPictureInPictureUiStateChangedListener", "Landroidx/core/app/PictureInPictureParamsCompat;", "enterPictureInPictureMode", "(Landroidx/core/app/PictureInPictureParamsCompat;)V", "setPictureInPictureParams", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/contextaware/ContextAwareHelper;", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onPictureInPictureUiStateChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/navigationevent/DirectNavigationEventInput;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()Landroidx/navigationevent/DirectNavigationEventInput;", "onBackPressedInput", "hasPictureInPictureSystemFeature", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/navigationevent/NavigationEventDispatcher;", "getNavigationEventDispatcher", "()Landroidx/navigationevent/NavigationEventDispatcher;", "navigationEventDispatcher", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "NonConfigurationInstances", "ReportFullyDrawnExecutor", "ReportFullyDrawnExecutorImpl"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, NavigationEventDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, PictureInPictureProvider, MenuHost, FullyDrawnReporterOwner {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final Companion Companion = new Companion(null);
    private ViewModelStore _viewModelStore;
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;
    private final ContextAwareHelper contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final Lazy defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final Lazy fullyDrawnReporter;
    private boolean hasPictureInPictureSystemFeature;
    private final MenuHostHelper menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final Lazy onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final Lazy onBackPressedInput;
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureUiStateCompat>> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    private final SavedStateRegistryController savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "p0", "", "viewCreated", "(Landroid/view/View;)V", "activityDestroyed", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(View p0);
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.invalidateMenu();
            }
        });
        ComponentActivity componentActivity = this;
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.INSTANCE.create(componentActivity);
        this.savedStateRegistryController = savedStateRegistryControllerCreate;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = LazyKt.lazy(new Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0(this.f$0);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ComponentActivity$activityResultRegistry$1(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = LazyKt.lazy(new Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentActivity.onBackPressedInput_delegate$lambda$0(this.f$0);
            }
        });
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda6
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$1(this.f$0, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda7
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(this.f$0, lifecycleOwner, event);
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner p0, Lifecycle.Event p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        savedStateRegistryControllerCreate.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(componentActivity);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda8
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return ComponentActivity._init_$lambda$3(this.f$0);
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda9
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                ComponentActivity._init_$lambda$4(this.f$0, context);
            }
        });
        this.defaultViewModelProviderFactory = LazyKt.lazy(new Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0(this.f$0);
            }
        });
        this.onBackPressedDispatcher = LazyKt.lazy(new Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentActivity.onBackPressedDispatcher_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "<init>", "()V", "custom", "Ljava/lang/Object;", "getCustom", "()Ljava/lang/Object;", "setCustom", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NonConfigurationInstances {
        private Object custom;
        private ViewModelStore viewModelStore;

        public final Object getCustom() {
            return this.custom;
        }

        public final void setCustom(Object obj) {
            this.custom = obj;
        }

        public final ViewModelStore getViewModelStore() {
            return this.viewModelStore;
        }

        public final void setViewModelStore(ViewModelStore viewModelStore) {
            this.viewModelStore = viewModelStore;
        }
    }

    @Override // androidx.view.FullyDrawnReporterOwner
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FullyDrawnReporter fullyDrawnReporter_delegate$lambda$0(final ComponentActivity componentActivity) {
        return new FullyDrawnReporter(componentActivity.reportFullyDrawnExecutor, new Function0() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return Unit.INSTANCE;
    }

    @Override // androidx.view.result.ActivityResultRegistryOwner
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    private final DirectNavigationEventInput getOnBackPressedInput() {
        return (DirectNavigationEventInput) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectNavigationEventInput onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        DirectNavigationEventInput directNavigationEventInput = new DirectNavigationEventInput();
        componentActivity.getNavigationEventDispatcher().addInput(directNavigationEventInput);
        return directNavigationEventInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.clearAvailableContext();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleConsumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            componentActivity.activityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle p0) {
        this.savedStateRegistryController.performRestore(p0);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(p0);
        ReportFragment.INSTANCE.injectIfNeededIn(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(p0);
        this.savedStateRegistryController.performSave(p0);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nonConfigurationInstances.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        NonConfigurationInstances nonConfigurationInstances2 = new NonConfigurationInstances();
        nonConfigurationInstances2.setCustom(objOnRetainCustomNonConfigurationInstance);
        nonConfigurationInstances2.setViewModelStore(viewModelStore);
        return nonConfigurationInstances2;
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
        if (nonConfigurationInstances != null) {
            return nonConfigurationInstances.getCustom();
        }
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(int p0) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(p0);
    }

    @Override // android.app.Activity
    public void setContentView(View p0) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(p0);
    }

    @Override // android.app.Activity
    public void setContentView(View p0, ViewGroup.LayoutParams p1) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.setContentView(p0, p1);
    }

    @Override // android.app.Activity
    public void addContentView(View p0, ViewGroup.LayoutParams p1) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        reportFullyDrawnExecutor.viewCreated(decorView);
        super.addContentView(p0, p1);
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        C0654ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        C0656ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        C0681ViewTreeSavedStateRegistryOwner.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        C0207ViewTreeOnBackPressedDispatcherOwner.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        View.set(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        androidx.p010navigationevent.View.set(decorView6, this);
    }

    @Override // androidx.view.contextaware.ContextAware
    public Context peekAvailableContext() {
        return this.contextAwareHelper.getContext();
    }

    @Override // androidx.view.contextaware.ContextAware
    public final void addOnContextAvailableListener(OnContextAvailableListener p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(p0);
    }

    @Override // androidx.view.contextaware.ContextAware
    public final void removeOnContextAvailableListener(OnContextAvailableListener p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(p0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int p0, View p1, Menu p2) {
        Intrinsics.checkNotNullParameter(p2, "menu");
        if (p0 != 0) {
            return true;
        }
        super.onPreparePanel(p0, p1, p2);
        this.menuHostHelper.onPrepareMenu(p2);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int p0, Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "menu");
        if (p0 != 0) {
            return true;
        }
        super.onCreatePanelMenu(p0, p1);
        this.menuHostHelper.onCreateMenu(p1, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int p0, MenuItem p1) {
        Intrinsics.checkNotNullParameter(p1, "item");
        if (super.onMenuItemSelected(p0, p1)) {
            return true;
        }
        if (p0 == 0) {
            return this.menuHostHelper.onMenuItemSelected(p1);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int p0, Menu p1) {
        Intrinsics.checkNotNullParameter(p1, "menu");
        this.menuHostHelper.onMenuClosed(p1);
        super.onPanelClosed(p0, p1);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider p0) {
        Intrinsics.checkNotNullParameter(p0, "provider");
        this.menuHostHelper.addMenuProvider(p0);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider p0, LifecycleOwner p1) {
        Intrinsics.checkNotNullParameter(p0, "provider");
        Intrinsics.checkNotNullParameter(p1, "owner");
        this.menuHostHelper.addMenuProvider(p0, p1);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(MenuProvider p0, LifecycleOwner p1, Lifecycle.State p2) {
        Intrinsics.checkNotNullParameter(p0, "provider");
        Intrinsics.checkNotNullParameter(p1, "owner");
        Intrinsics.checkNotNullParameter(p2, "state");
        this.menuHostHelper.addMenuProvider(p0, p1, p2);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(MenuProvider p0) {
        Intrinsics.checkNotNullParameter(p0, "provider");
        this.menuHostHelper.removeMenuProvider(p0);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.ComponentActivity, androidx.p002lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.p002lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        ensureViewModelStore();
        ViewModelStore viewModelStore = this._viewModelStore;
        Intrinsics.checkNotNull(viewModelStore);
        return viewModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                this._viewModelStore = nonConfigurationInstances.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.p002lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedStateViewModelFactory defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new SavedStateViewModelFactory(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    @Override // androidx.p002lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        if (getApplication() != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, extras);
        }
        return mutableCreationExtras;
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedInput().backCompleted();
    }

    @Override // androidx.view.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnBackPressedDispatcher onBackPressedDispatcher_delegate$lambda$0(final ComponentActivity componentActivity) {
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(this.f$0);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.addObserverForBackInvoker(onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
            componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
        }
        return onBackPressedDispatcher;
    }

    @Override // androidx.p010navigationevent.NavigationEventDispatcherOwner
    public NavigationEventDispatcher getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().getEventDispatcher$activity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher p0) {
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity$$ExternalSyntheticLambda2
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$0(p0, this, lifecycleOwner, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
    }

    @Override // androidx.p013savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "intent");
        super.startActivityForResult(p0, p1);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent p0, int p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "intent");
        super.startActivityForResult(p0, p1, p2);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender p0, int p1, Intent p2, int p3, int p4, int p5) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(p0, "intent");
        super.startIntentSenderForResult(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender p0, int p1, Intent p2, int p3, int p4, int p5, Bundle p6) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(p0, "intent");
        super.startIntentSenderForResult(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int p0, int p1, Intent p2) {
        if (this.activityResultRegistry.dispatchResult(p0, p1, p2)) {
            return;
        }
        super.onActivityResult(p0, p1, p2);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        Intrinsics.checkNotNullParameter(p1, "permissions");
        Intrinsics.checkNotNullParameter(p2, "grantResults");
        if (this.activityResultRegistry.dispatchResult(p0, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, p1).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, p2))) {
            return;
        }
        super.onRequestPermissionsResult(p0, p1, p2);
    }

    @Override // androidx.view.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> p0, ActivityResultRegistry p1, ActivityResultCallback<O> p2) {
        Intrinsics.checkNotNullParameter(p0, "contract");
        Intrinsics.checkNotNullParameter(p1, "registry");
        Intrinsics.checkNotNullParameter(p2, "callback");
        return p1.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, p0, p2);
    }

    @Override // androidx.view.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> p0, ActivityResultCallback<O> p1) {
        Intrinsics.checkNotNullParameter(p0, "contract");
        Intrinsics.checkNotNullParameter(p1, "callback");
        return registerForActivityResult(p0, this.activityResultRegistry, p1);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration p0) {
        Intrinsics.checkNotNullParameter(p0, "newConfig");
        super.onConfigurationChanged(p0);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(p0);
        }
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(Consumer<Configuration> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onConfigurationChangedListeners.add(p0);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onConfigurationChangedListeners.remove(p0);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int p0) {
        super.onTrimMemory(p0);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(p0));
        }
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(Consumer<Integer> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onTrimMemoryListeners.add(p0);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(Consumer<Integer> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onTrimMemoryListeners.remove(p0);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent p0) {
        Intrinsics.checkNotNullParameter(p0, "intent");
        super.onNewIntent(p0);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(p0);
        }
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(Consumer<Intent> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onNewIntentListeners.add(p0);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(Consumer<Intent> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onNewIntentListeners.remove(p0);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean p0) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(p0));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean p0, Configuration p1) {
        Intrinsics.checkNotNullParameter(p1, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(p0, p1);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.onMultiWindowModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(p0, p1));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onMultiWindowModeChangedListeners.add(p0);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(Consumer<MultiWindowModeChangedInfo> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onMultiWindowModeChangedListeners.remove(p0);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean p0) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(p0));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean p0, Configuration p1) {
        Intrinsics.checkNotNullParameter(p1, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(p0, p1);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.onPictureInPictureModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(p0, p1));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState p0) {
        Intrinsics.checkNotNullParameter(p0, "pipState");
        super.onPictureInPictureUiStateChanged(p0);
        PictureInPictureUiStateCompat pictureInPictureUiStateCompatFromPictureInPictureUiState = PictureInPictureUiStateCompat.INSTANCE.fromPictureInPictureUiState(p0);
        Iterator<Consumer<PictureInPictureUiStateCompat>> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(pictureInPictureUiStateCompatFromPictureInPictureUiState);
        }
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onPictureInPictureModeChangedListeners.add(p0);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onPictureInPictureModeChangedListeners.remove(p0);
    }

    @Override // androidx.core.app.OnPictureInPictureUiStateChangedProvider
    public final void addOnPictureInPictureUiStateChangedListener(Consumer<PictureInPictureUiStateCompat> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onPictureInPictureUiStateChangedListeners.add(p0);
    }

    @Override // androidx.core.app.OnPictureInPictureUiStateChangedProvider
    public final void removeOnPictureInPictureUiStateChangedListener(Consumer<PictureInPictureUiStateCompat> p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onPictureInPictureUiStateChangedListeners.remove(p0);
    }

    @Override // androidx.core.app.PictureInPictureProvider
    public final void enterPictureInPictureMode(PictureInPictureParamsCompat p0) {
        Intrinsics.checkNotNullParameter(p0, "params");
        if (this.hasPictureInPictureSystemFeature && p0.getIsEnabled()) {
            if (Build.VERSION.SDK_INT >= 26) {
                enterPictureInPictureMode(p0.toPictureInPictureParams());
            } else {
                enterPictureInPictureMode();
            }
        }
    }

    @Override // androidx.core.app.PictureInPictureProvider
    public final void setPictureInPictureParams(PictureInPictureParamsCompat p0) {
        Intrinsics.checkNotNullParameter(p0, "params");
        if (!this.hasPictureInPictureSystemFeature || Build.VERSION.SDK_INT < 26) {
            return;
        }
        setPictureInPictureParams(p0.toPictureInPictureParams());
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(Runnable p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onUserLeaveHintListeners.add(p0);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(Runnable p0) {
        Intrinsics.checkNotNullParameter(p0, "listener");
        this.onUserLeaveHintListeners.remove(p0);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
        } finally {
            Trace.endSection();
        }
    }

    private final ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new ReportFullyDrawnExecutorImpl();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u000eR\"\u0010\u001c\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutorImpl;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "p0", "", "viewCreated", "(Landroid/view/View;)V", "activityDestroyed", "()V", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "endWatchTimeMillis", "J", "getEndWatchTimeMillis", "()J", "currentRunnable", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "", "onDrawScheduled", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class ReportFullyDrawnExecutorImpl implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {
        private Runnable currentRunnable;
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;
        private boolean onDrawScheduled;

        public ReportFullyDrawnExecutorImpl() {
        }

        public final long getEndWatchTimeMillis() {
            return this.endWatchTimeMillis;
        }

        public final Runnable getCurrentRunnable() {
            return this.currentRunnable;
        }

        public final void setCurrentRunnable(Runnable runnable) {
            this.currentRunnable = runnable;
        }

        public final boolean getOnDrawScheduled() {
            return this.onDrawScheduled;
        }

        public final void setOnDrawScheduled(boolean z) {
            this.onDrawScheduled = z;
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public final void viewCreated(View p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            p0.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public final void activityDestroyed() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.currentRunnable = p0;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            if (this.onDrawScheduled) {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.ComponentActivity$ReportFullyDrawnExecutorImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0(this.f$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void execute$lambda$0(ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl) {
            Runnable runnable = reportFullyDrawnExecutorImpl.currentRunnable;
            if (runnable != null) {
                Intrinsics.checkNotNull(runnable);
                runnable.run();
                reportFullyDrawnExecutorImpl.currentRunnable = null;
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().isFullyDrawnReported()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/activity/ComponentActivity$Companion;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
