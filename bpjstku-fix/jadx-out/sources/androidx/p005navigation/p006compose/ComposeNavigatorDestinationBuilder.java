package androidx.p005navigation.p006compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composer;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavDestinationBuilder;
import androidx.p005navigation.NavDestinationDsl;
import androidx.p005navigation.NavType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fB^\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u0012\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0013¢\u0006\u0002\b\u00140\u0011\u0012\"\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR0\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRB\u0010!\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&RB\u0010(\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&RB\u0010+\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&RB\u0010.\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&RB\u00102\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010\u001e¢\u0006\u0002\b\u0014¢\u0006\u0002\b\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&"}, d2 = {"Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/compose/ComposeNavigator$Destination;", "Landroidx/navigation/compose/ComposeNavigator;", "p0", "", "p1", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p3", "(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)V", "instantiateDestination", "()Landroidx/navigation/compose/ComposeNavigator$Destination;", "build", "composeNavigator", "Landroidx/navigation/compose/ComposeNavigator;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/jvm/functions/Function4;", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Lkotlin/jvm/functions/Function1;", "getEnterTransition", "()Lkotlin/jvm/functions/Function1;", "setEnterTransition", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "getExitTransition", "setExitTransition", "popEnterTransition", "getPopEnterTransition", "setPopEnterTransition", "popExitTransition", "getPopExitTransition", "setPopExitTransition", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "getSizeTransform", "setSizeTransform"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {
    public static final int $stable = 8;
    private final ComposeNavigator composeNavigator;
    private final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> content;
    private Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;
    private Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;
    private Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;
    private Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;
    private Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform;

    public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition() {
        return this.enterTransition;
    }

    public final void setEnterTransition(Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1) {
        this.enterTransition = function1;
    }

    public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition() {
        return this.exitTransition;
    }

    public final void setExitTransition(Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function1) {
        this.exitTransition = function1;
    }

    public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition() {
        return this.popEnterTransition;
    }

    public final void setPopEnterTransition(Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1) {
        this.popEnterTransition = function1;
    }

    public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition() {
        return this.popExitTransition;
    }

    public final void setPopExitTransition(Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function1) {
        this.popExitTransition = function1;
    }

    public final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> getSizeTransform() {
        return this.sizeTransform;
    }

    public final void setSizeTransform(Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function1) {
        this.sizeTransform = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, String str, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function4) {
        super(composeNavigator, str);
        this.composeNavigator = composeNavigator;
        this.content = function4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, KClass<?> kClass, Map<KType, NavType<?>> map, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function4) {
        super(composeNavigator, kClass, map);
        this.composeNavigator = composeNavigator;
        this.content = function4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.p005navigation.NavDestinationBuilder
    public final ComposeNavigator.Destination instantiateDestination() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }

    @Override // androidx.p005navigation.NavDestinationBuilder
    public final ComposeNavigator.Destination build() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.build();
        destination.setEnterTransition$navigation_compose_release(this.enterTransition);
        destination.setExitTransition$navigation_compose_release(this.exitTransition);
        destination.setPopEnterTransition$navigation_compose_release(this.popEnterTransition);
        destination.setPopExitTransition$navigation_compose_release(this.popExitTransition);
        destination.setSizeTransform$navigation_compose_release(this.sizeTransform);
        return destination;
    }
}
