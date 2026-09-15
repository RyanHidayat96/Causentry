package androidx.p005navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.TaskStackBuilder;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.p008internal.NavContext;
import androidx.p013savedstate.SavedStateReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002>?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J!\u0010\n\u001a\u00020\u00002\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0012J)\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00182\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J)\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0004\b\u001a\u0010\u0017J)\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00182\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010<\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "setComponentName", "(Ljava/lang/Class;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroid/content/ComponentName;", "(Landroid/content/ComponentName;)Landroidx/navigation/NavDeepLinkBuilder;", "", "setGraph", "(I)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "setDestination", "(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "addDestination", "Landroidx/navigation/NavDestination;", "findDestination", "(I)Landroidx/navigation/NavDestination;", "", "verifyAllDestinations", "()V", "fillInIntent", "setArguments", "(Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/core/app/TaskStackBuilder;", "createTaskStackBuilder", "()Landroidx/core/app/TaskStackBuilder;", "Landroid/app/PendingIntent;", "createPendingIntent", "()Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "Landroidx/navigation/internal/NavContext;", "navContext", "Landroidx/navigation/internal/NavContext;", "getNavContext$navigation_runtime_release", "()Landroidx/navigation/internal/NavContext;", "activity", "Landroid/app/Activity;", "Landroid/content/Intent;", "intent", "Landroid/content/Intent;", "graph", "Landroidx/navigation/NavGraph;", "", "Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "destinations", "Ljava/util/List;", "globalArgs", "Landroid/os/Bundle;", "DeepLinkDestination", "PermissiveNavigatorProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavDeepLinkBuilder {
    private final Activity activity;
    private final Context context;
    private final List<DeepLinkDestination> destinations;
    private Bundle globalArgs;
    private NavGraph graph;
    private final Intent intent;
    private final NavContext navContext;

    public NavDeepLinkBuilder(Context context) {
        Intent launchIntentForPackage;
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        this.navContext = new NavContext(context);
        Activity activity = (Activity) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) new Function1() { // from class: androidx.navigation.NavDeepLinkBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavDeepLinkBuilder.activity$lambda$0((Context) obj);
            }
        }), new Function1() { // from class: androidx.navigation.NavDeepLinkBuilder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavDeepLinkBuilder.activity$lambda$1((Context) obj);
            }
        }));
        this.activity = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    /* JADX INFO: renamed from: getNavContext$navigation_runtime_release, reason: from getter */
    public final NavContext getNavContext() {
        return this.navContext;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "", "", "p0", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "<init>", "(ILandroid/os/Bundle;)V", "destinationId", "I", "getDestinationId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DeepLinkDestination {
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i, Bundle bundle) {
            this.destinationId = i;
            this.arguments = bundle;
        }

        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity activity$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        Intrinsics.checkNotNullParameter(navController, "");
        this.graph = navController.getGraph();
    }

    public final NavDeepLinkBuilder setComponentName(Class<? extends Activity> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return setComponentName(new ComponentName(this.context, p0));
    }

    public final NavDeepLinkBuilder setComponentName(ComponentName p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.intent.setComponent(p0);
        return this;
    }

    public final NavDeepLinkBuilder setGraph(int p0) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(p0));
    }

    public final NavDeepLinkBuilder setGraph(NavGraph p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.graph = p0;
        verifyAllDestinations();
        return this;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i, bundle);
    }

    public final NavDeepLinkBuilder setDestination(int p0, Bundle p1) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(p0, p1));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    public final NavDeepLinkBuilder setDestination(String p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.INSTANCE.createRoute(p0).hashCode(), p1));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i, bundle);
    }

    public final NavDeepLinkBuilder addDestination(int p0, Bundle p1) {
        this.destinations.add(new DeepLinkDestination(p0, p1));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public final NavDeepLinkBuilder addDestination(String p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.destinations.add(new DeepLinkDestination(NavDestination.INSTANCE.createRoute(p0).hashCode(), p1));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    private final NavDestination findDestination(int p0) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this.graph;
        Intrinsics.checkNotNull(navGraph);
        arrayDeque.add(navGraph);
        while (!arrayDeque.isEmpty()) {
            NavDestination navDestination = (NavDestination) arrayDeque.removeFirst();
            if (navDestination.getId() == p0) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        return null;
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                String displayName = NavDestination.INSTANCE.getDisplayName(this.navContext, destinationId);
                StringBuilder sb = new StringBuilder("Navigation destination ");
                sb.append(displayName);
                sb.append(" cannot be found in the navigation graph ");
                sb.append(this.graph);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    private final void fillInIntent() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            int destinationId = deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            NavDestination navDestinationFindDestination = findDestination(destinationId);
            if (navDestinationFindDestination == null) {
                String displayName = NavDestination.INSTANCE.getDisplayName(this.navContext, destinationId);
                StringBuilder sb = new StringBuilder("Navigation destination ");
                sb.append(displayName);
                sb.append(" cannot be found in the navigation graph ");
                sb.append(this.graph);
                throw new IllegalArgumentException(sb.toString());
            }
            for (int i : navDestinationFindDestination.buildDeepLinkIds(navDestination)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(arguments);
            }
            navDestination = navDestinationFindDestination;
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, CollectionsKt.toIntArray(arrayList));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    public final NavDeepLinkBuilder setArguments(Bundle p0) {
        this.globalArgs = p0;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, p0);
        return this;
    }

    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        fillInIntent();
        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
        Intrinsics.checkNotNullExpressionValue(taskStackBuilderAddNextIntentWithParentStack, "");
        int intentCount = taskStackBuilderAddNextIntentWithParentStack.getIntentCount();
        for (int i = 0; i < intentCount; i++) {
            Intent intentEditIntentAt = taskStackBuilderAddNextIntentWithParentStack.editIntentAt(i);
            if (intentEditIntentAt != null) {
                intentEditIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
            }
        }
        return taskStackBuilderAddNextIntentWithParentStack;
    }

    public final PendingIntent createPendingIntent() {
        Bundle bundle = this.globalArgs;
        int iM7371contentDeepHashCodeimpl = bundle != null ? SavedStateReader.m7371contentDeepHashCodeimpl(SavedStateReader.m7368constructorimpl(bundle)) : 0;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            iM7371contentDeepHashCodeimpl = (iM7371contentDeepHashCodeimpl * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            Integer numValueOf = arguments != null ? Integer.valueOf(SavedStateReader.m7371contentDeepHashCodeimpl(SavedStateReader.m7368constructorimpl(arguments))) : null;
            if (numValueOf != null) {
                iM7371contentDeepHashCodeimpl = (iM7371contentDeepHashCodeimpl * 31) + numValueOf.intValue();
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(iM7371contentDeepHashCodeimpl, 201326592);
        Intrinsics.checkNotNull(pendingIntent);
        return pendingIntent;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "<init>", "()V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "getNavigator", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "mDestNavigator", "Landroidx/navigation/Navigator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.p005navigation.Navigator
            public final NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.p005navigation.Navigator
            public final NavDestination navigate(NavDestination p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
                Intrinsics.checkNotNullParameter(p0, "");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.p005navigation.Navigator
            public final boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.p005navigation.NavigatorProvider
        public final <T extends Navigator<? extends NavDestination>> T getNavigator(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return (T) super.getNavigator(p0);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                Intrinsics.checkNotNull(navigator, "");
                return navigator;
            }
        }
    }

    public final NavDeepLinkBuilder addDestination(int i) {
        return addDestination$default(this, i, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder addDestination(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return addDestination$default(this, str, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setDestination(int i) {
        return setDestination$default(this, i, (Bundle) null, 2, (Object) null);
    }

    public final NavDeepLinkBuilder setDestination(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return setDestination$default(this, str, (Bundle) null, 2, (Object) null);
    }
}
