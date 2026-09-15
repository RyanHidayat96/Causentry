package androidx.view.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.view.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\t\b'\u0018\u0000 72\u00020\u0001:\u0003897B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ)\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J%\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001f\u0010!J?\u0010#\u001a\u00020\r\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u001d2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020.0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010,R\"\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00105\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "I", "O", "", "p0", "Landroidx/activity/result/contract/ActivityResultContract;", "p1", "p2", "Landroidx/core/app/ActivityOptionsCompat;", "p3", "", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResultLauncher;", "register", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "unregister$activity", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onRestoreInstanceState", "Landroid/content/Intent;", "", "dispatchResult", "(IILandroid/content/Intent;)Z", "(ILjava/lang/Object;)Z", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "doDispatch", "(Ljava/lang/String;ILandroid/content/Intent;Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;)V", "registerKey", "generateRandomNumber", "()I", "bindRcKey", "(ILjava/lang/String;)V", "", "rcToKey", "Ljava/util/Map;", "keyToRc", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "keyToLifecycleContainers", "", "launchedKeys", "Ljava/util/List;", "keyToCallback", "parsedPendingResults", "pendingResults", "Landroid/os/Bundle;", "Companion", "CallbackAndContract", "LifecycleContainer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ActivityResultRegistry {
    private static final Companion Companion = new Companion(null);
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private final Map<Integer, String> rcToKey = new LinkedHashMap();
    private final Map<String, Integer> keyToRc = new LinkedHashMap();
    private final Map<String, LifecycleContainer> keyToLifecycleContainers = new LinkedHashMap();
    private final List<String> launchedKeys = new ArrayList();
    private final transient Map<String, CallbackAndContract<?>> keyToCallback = new LinkedHashMap();
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();
    private final Bundle pendingResults = new Bundle();

    public abstract <I, O> void onLaunch(int p0, ActivityResultContract<I, O> p1, I p2, ActivityOptionsCompat p3);

    public final <I, O> ActivityResultLauncher<I> register(final String p0, LifecycleOwner p1, final ActivityResultContract<I, O> p2, final ActivityResultCallback<O> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Lifecycle lifecycle = p1.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(p1);
            sb.append(" is attempting to register while current state is ");
            sb.append(lifecycle.getCurrentState());
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        registerKey(p0);
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(p0);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda0
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ActivityResultRegistry.register$lambda$1(this.f$0, p0, p3, p2, lifecycleOwner, event);
            }
        });
        this.keyToLifecycleContainers.put(p0, lifecycleContainer);
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.2
            @Override // androidx.view.result.ActivityResultLauncher
            public final void launch(I p4, ActivityOptionsCompat p5) throws Exception {
                Object obj = ActivityResultRegistry.this.keyToRc.get(p0);
                Object obj2 = p2;
                if (obj != null) {
                    int iIntValue = ((Number) obj).intValue();
                    ActivityResultRegistry.this.launchedKeys.add(p0);
                    try {
                        ActivityResultRegistry.this.onLaunch(iIntValue, p2, p4, p5);
                        return;
                    } catch (Exception e2) {
                        ActivityResultRegistry.this.launchedKeys.remove(p0);
                        throw e2;
                    }
                }
                StringBuilder sb2 = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb2.append(obj2);
                sb2.append(" and input ");
                sb2.append(p4);
                sb2.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(sb2.toString().toString());
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final void unregister() {
                ActivityResultRegistry.this.unregister$activity(p0);
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) p2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (Lifecycle.Event.ON_START == event) {
            activityResultRegistry.keyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
            if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
                Object obj = activityResultRegistry.parsedPendingResults.get(str);
                activityResultRegistry.parsedPendingResults.remove(str);
                activityResultCallback.onActivityResult(obj);
            }
            ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(activityResultRegistry.pendingResults, str, ActivityResult.class);
            if (activityResult != null) {
                activityResultRegistry.pendingResults.remove(str);
                activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                return;
            }
            return;
        }
        if (Lifecycle.Event.ON_STOP == event) {
            activityResultRegistry.keyToCallback.remove(str);
        } else if (Lifecycle.Event.ON_DESTROY == event) {
            activityResultRegistry.unregister$activity(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> register(final String p0, final ActivityResultContract<I, O> p1, ActivityResultCallback<O> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        registerKey(p0);
        this.keyToCallback.put(p0, new CallbackAndContract<>(p2, p1));
        if (this.parsedPendingResults.containsKey(p0)) {
            Object obj = this.parsedPendingResults.get(p0);
            this.parsedPendingResults.remove(p0);
            p2.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, p0, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(p0);
            p2.onActivityResult(p1.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.register.3
            @Override // androidx.view.result.ActivityResultLauncher
            public final void launch(I p3, ActivityOptionsCompat p4) throws Exception {
                Object obj2 = ActivityResultRegistry.this.keyToRc.get(p0);
                Object obj3 = p1;
                if (obj2 != null) {
                    int iIntValue = ((Number) obj2).intValue();
                    ActivityResultRegistry.this.launchedKeys.add(p0);
                    try {
                        ActivityResultRegistry.this.onLaunch(iIntValue, p1, p3, p4);
                        return;
                    } catch (Exception e2) {
                        ActivityResultRegistry.this.launchedKeys.remove(p0);
                        throw e2;
                    }
                }
                StringBuilder sb = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb.append(obj3);
                sb.append(" and input ");
                sb.append(p3);
                sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(sb.toString().toString());
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final void unregister() {
                ActivityResultRegistry.this.unregister$activity(p0);
            }

            @Override // androidx.view.result.ActivityResultLauncher
            public final ActivityResultContract<I, ?> getContract() {
                return (ActivityResultContract<I, ?>) p1;
            }
        };
    }

    public final void unregister$activity(String p0) {
        Integer numRemove;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!this.launchedKeys.contains(p0) && (numRemove = this.keyToRc.remove(p0)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(p0);
        if (this.parsedPendingResults.containsKey(p0)) {
            Objects.toString(this.parsedPendingResults.get(p0));
            this.parsedPendingResults.remove(p0);
        }
        if (this.pendingResults.containsKey(p0)) {
            Objects.toString((ActivityResult) BundleCompat.getParcelable(this.pendingResults, p0, ActivityResult.class));
            this.pendingResults.remove(p0);
        }
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(p0);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.keyToLifecycleContainers.remove(p0);
        }
    }

    public final void onSaveInstanceState(Bundle p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.keyToRc.values()));
        p0.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.keyToRc.keySet()));
        p0.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.launchedKeys));
        p0.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    public final void onRestoreInstanceState(Bundle p0) {
        if (p0 != null) {
            ArrayList<Integer> integerArrayList = p0.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
            ArrayList<String> stringArrayList = p0.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = p0.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
            if (stringArrayList2 != null) {
                this.launchedKeys.addAll(stringArrayList2);
            }
            Bundle bundle = p0.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
            if (bundle != null) {
                this.pendingResults.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (this.keyToRc.containsKey(str)) {
                    Integer numRemove = this.keyToRc.remove(str);
                    if (!this.pendingResults.containsKey(str)) {
                        TypeIntrinsics.asMutableMap(this.rcToKey).remove(numRemove);
                    }
                }
                Integer num = integerArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(num, "");
                int iIntValue = num.intValue();
                String str2 = stringArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(str2, "");
                bindRcKey(iIntValue, str2);
            }
        }
    }

    public final boolean dispatchResult(int p0, int p1, Intent p2) {
        String str = this.rcToKey.get(Integer.valueOf(p0));
        if (str == null) {
            return false;
        }
        doDispatch(str, p1, p2, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean dispatchResult(int p0, O p1) {
        String str = this.rcToKey.get(Integer.valueOf(p0));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.keyToCallback.get(str);
        if ((callbackAndContract != null ? callbackAndContract.getCallback() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, p1);
            return true;
        }
        ActivityResultCallback<?> callback = callbackAndContract.getCallback();
        Intrinsics.checkNotNull(callback, "");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        callback.onActivityResult(p1);
        return true;
    }

    private final <O> void doDispatch(String p0, int p1, Intent p2, CallbackAndContract<O> p3) {
        if ((p3 != null ? p3.getCallback() : null) != null && this.launchedKeys.contains(p0)) {
            p3.getCallback().onActivityResult(p3.getContract().parseResult(p1, p2));
            this.launchedKeys.remove(p0);
        } else {
            this.parsedPendingResults.remove(p0);
            this.pendingResults.putParcelable(p0, new ActivityResult(p1, p2));
        }
    }

    private final void registerKey(String p0) {
        if (this.keyToRc.get(p0) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), p0);
    }

    private final int generateRandomNumber() {
        for (Number number : SequencesKt.generateSequence(new Function0() { // from class: androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActivityResultRegistry.generateRandomNumber$lambda$0();
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer generateRandomNumber$lambda$0() {
        return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + 65536);
    }

    private final void bindRcKey(int p0, String p1) {
        this.rcToKey.put(Integer.valueOf(p0), p1);
        this.keyToRc.put(p1, Integer.valueOf(p0));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "Landroidx/activity/result/ActivityResultCallback;", "p0", "Landroidx/activity/result/contract/ActivityResultContract;", "p1", "<init>", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "callback", "Landroidx/activity/result/ActivityResultCallback;", "getCallback", "()Landroidx/activity/result/ActivityResultCallback;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class CallbackAndContract<O> {
        private final ActivityResultCallback<O> callback;
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            Intrinsics.checkNotNullParameter(activityResultCallback, "");
            Intrinsics.checkNotNullParameter(activityResultContract, "");
            this.callback = activityResultCallback;
            this.contract = activityResultContract;
        }

        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "Landroidx/lifecycle/Lifecycle;", "p0", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleEventObserver;", "", "addObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "clearObservers", "()V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "observers", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class LifecycleContainer {
        private final Lifecycle lifecycle;
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }

        public final void addObserver(LifecycleEventObserver p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.lifecycle.addObserver(p0);
            this.observers.add(p0);
        }

        public final void clearObservers() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.removeObserver((LifecycleEventObserver) it.next());
            }
            this.observers.clear();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "<init>", "()V", "", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, "Ljava/lang/String;", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "LOG_TAG", "", "INITIAL_REQUEST_CODE_VALUE", "I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
