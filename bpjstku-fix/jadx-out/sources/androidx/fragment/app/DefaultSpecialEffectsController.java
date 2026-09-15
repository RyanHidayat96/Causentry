package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0003)*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u001d\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJS\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b#\u0010$J-\u0010'\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0%2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150&H\u0002¢\u0006\u0004\b'\u0010("}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "p0", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "applyContainerChanges", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/b;", "p1", "captureTransitioningViews", "(Ljava/util/ArrayList;Landroid/view/View;)V", "", "", "executeOperations", "(Ljava/util/List;Z)V", "", "", "findNamedViews", "(Ljava/util/Map;Landroid/view/View;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "", "p2", "", "p3", "startAnimations", "(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "p4", "startTransitions", "(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Ljava/util/Map;", "syncAnimations", "(Ljava/util/List;)V", "Landroidx/collection/ArrayMap;", "", "retainMatchingViews", "(Landroidx/collection/ArrayMap;Ljava/util/Collection;)V", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "");
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public final void executeOperations(List<? extends SpecialEffectsController.Operation> p0, boolean p1) {
        SpecialEffectsController.Operation operation;
        Object next;
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<T> it = p0.iterator();
        while (true) {
            operation = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view = operation2.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            if (companion.asOperationState(view) == SpecialEffectsController.Operation.State.VISIBLE && operation2.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) next;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = p0.listIterator(p0.size());
        while (listIterator.hasPrevious()) {
            SpecialEffectsController.Operation operationPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation4 = operationPrevious;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
            View view2 = operation4.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            if (companion2.asOperationState(view2) != SpecialEffectsController.Operation.State.VISIBLE && operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                operation = operationPrevious;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(operation3);
            Objects.toString(operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<SpecialEffectsController.Operation> mutableList = CollectionsKt.toMutableList((Collection) p0);
        syncAnimations(p0);
        Iterator<? extends SpecialEffectsController.Operation> it2 = p0.iterator();
        while (it2.hasNext()) {
            final SpecialEffectsController.Operation next2 = it2.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            next2.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(next2, cancellationSignal, p1));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            next2.markStartedSpecialEffect(cancellationSignal2);
            arrayList2.add(new TransitionInfo(next2, cancellationSignal2, p1, !p1 ? next2 != operation5 : next2 != operation3));
            next2.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.executeOperations$lambda$2(mutableList, next2, this);
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> mapStartTransitions = startTransitions(arrayList2, mutableList, p1, operation3, operation5);
        startAnimations(arrayList, mutableList, mapStartTransitions.containsValue(Boolean.TRUE), mapStartTransitions);
        Iterator<SpecialEffectsController.Operation> it3 = mutableList.iterator();
        while (it3.hasNext()) {
            applyContainerChanges(it3.next());
        }
        mutableList.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(operation3);
            Objects.toString(operation5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List list, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(operation, "");
        Intrinsics.checkNotNullParameter(defaultSpecialEffectsController, "");
        if (list.contains(operation)) {
            list.remove(operation);
            defaultSpecialEffectsController.applyContainerChanges(operation);
        }
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> p0) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) p0)).getFragment();
        for (SpecialEffectsController.Operation operation : p0) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    private final void startAnimations(List<AnimationInfo> p0, List<SpecialEffectsController.Operation> p1, boolean p2, Map<SpecialEffectsController.Operation, Boolean> p3) {
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z = false;
        for (final AnimationInfo animationInfo : p0) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (Intrinsics.areEqual(p3.get(operation), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Objects.toString(fragment);
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z2 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z2) {
                                p1.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.startAnimations.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator p4) {
                                    Intrinsics.checkNotNullParameter(p4, "");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z2) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View view2 = view;
                                        Intrinsics.checkNotNullExpressionValue(view2, "");
                                        finalState.applyState(view2);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Objects.toString(operation);
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Objects.toString(operation);
                            }
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (p2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(fragment2);
                }
                animationInfo2.completeSpecialEffect();
            } else if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(fragment2);
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context, "");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation3 = animation2.animation;
                if (animation3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation3);
                    animationInfo2.completeSpecialEffect();
                } else {
                    getContainer().startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                    endViewTransitionAnimation.setAnimationListener(new AnonymousClass3(operation2, this, view2, animationInfo2));
                    view2.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(operation2);
                    }
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda1
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(operation);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3;", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "p0", "", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "onAnimationRepeat", "onAnimationStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 implements Animation.AnimationListener {
        final /* synthetic */ AnimationInfo $animationInfo;
        final /* synthetic */ SpecialEffectsController.Operation $operation;
        final /* synthetic */ View $viewToAnimate;
        final /* synthetic */ DefaultSpecialEffectsController this$0;

        AnonymousClass3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, AnimationInfo animationInfo) {
            this.$operation = operation;
            this.this$0 = defaultSpecialEffectsController;
            this.$viewToAnimate = view;
            this.$animationInfo = animationInfo;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(this.$operation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            ViewGroup container = this.this$0.getContainer();
            final DefaultSpecialEffectsController defaultSpecialEffectsController = this.this$0;
            final View view = this.$viewToAnimate;
            final AnimationInfo animationInfo = this.$animationInfo;
            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.AnonymousClass3.onAnimationEnd$lambda$0(defaultSpecialEffectsController, view, animationInfo);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(this.$operation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController defaultSpecialEffectsController, View view, AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(defaultSpecialEffectsController, "");
            Intrinsics.checkNotNullParameter(animationInfo, "");
            defaultSpecialEffectsController.getContainer().endViewTransition(view);
            animationInfo.completeSpecialEffect();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController defaultSpecialEffectsController, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(defaultSpecialEffectsController, "");
        Intrinsics.checkNotNullParameter(animationInfo, "");
        Intrinsics.checkNotNullParameter(operation, "");
        view.clearAnimation();
        defaultSpecialEffectsController.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(operation);
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> p0, List<SpecialEffectsController.Operation> p1, boolean p2, final SpecialEffectsController.Operation p3, final SpecialEffectsController.Operation p4) {
        String str;
        View view;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        SpecialEffectsController.Operation operation;
        Object obj3;
        List<TransitionInfo> list;
        Rect rect;
        FragmentTransitionImpl fragmentTransitionImpl;
        Pair pair;
        ArrayList<String> arrayList2;
        ArrayList<String> arrayList3;
        final FragmentTransitionImpl fragmentTransitionImpl2;
        Object obj4;
        int i;
        View view2;
        final Rect rect2;
        final View view3;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        final boolean z = p2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<TransitionInfo> list2 = p0;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list2) {
            if (!((TransitionInfo) obj5).isVisibilityUnchanged()) {
                arrayList4.add(obj5);
            }
        }
        ArrayList<TransitionInfo> arrayList5 = new ArrayList();
        for (Object obj6 : arrayList4) {
            if (((TransitionInfo) obj6).getHandlingImpl() != null) {
                arrayList5.add(obj6);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl3 = null;
        for (TransitionInfo transitionInfo : arrayList5) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl3 != null && handlingImpl != fragmentTransitionImpl3) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(transitionInfo.getOperation().getFragment());
                sb.append(" returned Transition ");
                sb.append(transitionInfo.getTransition());
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            fragmentTransitionImpl3 = handlingImpl;
        }
        if (fragmentTransitionImpl3 == null) {
            for (TransitionInfo transitionInfo2 : p0) {
                linkedHashMap.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap;
        }
        View view4 = new View(getContainer().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList6 = new ArrayList<>();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        Iterator<TransitionInfo> it = p0.iterator();
        View view5 = null;
        Object obj7 = null;
        boolean z2 = false;
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || p3 == null || p4 == null) {
                list = list2;
                rect = rect3;
                fragmentTransitionImpl = fragmentTransitionImpl3;
                arrayList6 = arrayList6;
                arrayList7 = arrayList7;
                linkedHashMap = linkedHashMap;
                view5 = view5;
                list2 = list;
                arrayMap = arrayMap;
                rect3 = rect;
                fragmentTransitionImpl3 = fragmentTransitionImpl;
                z = p2;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl3.wrapTransitionInSet(fragmentTransitionImpl3.cloneTransition(next.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = p4.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "");
                View view6 = view5;
                ArrayList<String> sharedElementSourceNames2 = p3.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "");
                list = list2;
                ArrayList<String> sharedElementTargetNames = p3.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "");
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                int size = sharedElementTargetNames.size();
                View view7 = view4;
                int i2 = 0;
                while (i2 < size) {
                    int i3 = size;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList8 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    size = i3;
                    sharedElementTargetNames = arrayList8;
                }
                ArrayList<String> sharedElementTargetNames2 = p4.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "");
                if (!z) {
                    pair = TuplesKt.to(p3.getFragment().getExitTransitionCallback(), p4.getFragment().getEnterTransitionCallback());
                } else {
                    pair = TuplesKt.to(p3.getFragment().getEnterTransitionCallback(), p4.getFragment().getExitTransitionCallback());
                }
                SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.component2();
                int size2 = sharedElementSourceNames.size();
                Rect rect4 = rect3;
                int i4 = 0;
                while (i4 < size2) {
                    arrayMap.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                    i4++;
                    fragmentTransitionImpl3 = fragmentTransitionImpl3;
                    size2 = size2;
                    objWrapTransitionInSet = objWrapTransitionInSet;
                }
                Object obj8 = objWrapTransitionInSet;
                FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl3;
                if (FragmentManager.isLoggingEnabled(2)) {
                    for (String str2 : sharedElementTargetNames2) {
                    }
                    for (String str3 : sharedElementSourceNames) {
                    }
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                ArrayMap<String, View> arrayMap3 = arrayMap2;
                View view8 = p3.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view8, "");
                defaultSpecialEffectsController.findNamedViews(arrayMap3, view8);
                ArrayList<String> arrayList9 = sharedElementSourceNames;
                arrayMap2.retainAll(arrayList9);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(p3);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i5 = size3 - 1;
                            String str4 = sharedElementSourceNames.get(size3);
                            View view9 = arrayMap2.get(str4);
                            if (view9 == null) {
                                arrayMap.remove(str4);
                                arrayList2 = sharedElementSourceNames;
                            } else {
                                arrayList2 = sharedElementSourceNames;
                                if (!Intrinsics.areEqual(str4, ViewCompat.getTransitionName(view9))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view9), (String) arrayMap.remove(str4));
                                }
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size3 = i5;
                            sharedElementSourceNames = arrayList2;
                        }
                    } else {
                        arrayList2 = sharedElementSourceNames;
                    }
                } else {
                    arrayList2 = sharedElementSourceNames;
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                final ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                ArrayMap<String, View> arrayMap5 = arrayMap4;
                View view10 = p4.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view10, "");
                defaultSpecialEffectsController.findNamedViews(arrayMap5, view10);
                ArrayList<String> arrayList10 = sharedElementTargetNames2;
                arrayMap4.retainAll(arrayList10);
                arrayMap4.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(p4);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap5);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i6 = size4 - 1;
                            String str5 = sharedElementTargetNames2.get(size4);
                            View view11 = arrayMap4.get(str5);
                            if (view11 == null) {
                                Intrinsics.checkNotNullExpressionValue(str5, "");
                                String strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str5);
                                if (strFindKeyForValue != null) {
                                    arrayMap.remove(strFindKeyForValue);
                                }
                                arrayList3 = sharedElementTargetNames2;
                            } else {
                                arrayList3 = sharedElementTargetNames2;
                                if (!Intrinsics.areEqual(str5, ViewCompat.getTransitionName(view11))) {
                                    Intrinsics.checkNotNullExpressionValue(str5, "");
                                    String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str5);
                                    if (strFindKeyForValue2 != null) {
                                        arrayMap.put(strFindKeyForValue2, ViewCompat.getTransitionName(view11));
                                    }
                                }
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size4 = i6;
                            sharedElementTargetNames2 = arrayList3;
                        }
                    } else {
                        arrayList3 = sharedElementTargetNames2;
                    }
                } else {
                    arrayList3 = sharedElementTargetNames2;
                    FragmentTransition.retainValues(arrayMap, arrayMap4);
                }
                Set setKeySet = arrayMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap2, setKeySet);
                Collection<String> collectionValues = arrayMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap4, collectionValues);
                if (arrayMap.isEmpty()) {
                    arrayList6.clear();
                    arrayList7.clear();
                    linkedHashMap = linkedHashMap2;
                    view5 = view6;
                    list2 = list;
                    view4 = view7;
                    rect3 = rect4;
                    fragmentTransitionImpl3 = fragmentTransitionImpl4;
                    obj7 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(p4.getFragment(), p3.getFragment(), z, arrayMap2, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(p4, p3, z, arrayMap4);
                        }
                    });
                    arrayList6.addAll(arrayMap2.values());
                    if (arrayList9.isEmpty()) {
                        fragmentTransitionImpl2 = fragmentTransitionImpl4;
                        obj4 = obj8;
                        i = 0;
                        view2 = view6;
                    } else {
                        i = 0;
                        view2 = arrayMap2.get(arrayList2.get(0));
                        fragmentTransitionImpl2 = fragmentTransitionImpl4;
                        obj4 = obj8;
                        fragmentTransitionImpl2.setEpicenter(obj4, view2);
                    }
                    arrayList7.addAll(arrayMap4.values());
                    if (arrayList10.isEmpty() || (view3 = arrayMap4.get(arrayList3.get(i))) == null) {
                        rect2 = rect4;
                    } else {
                        rect2 = rect4;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.startTransitions$lambda$10(fragmentTransitionImpl2, view3, rect2);
                            }
                        });
                        z2 = true;
                    }
                    view4 = view7;
                    fragmentTransitionImpl2.setSharedElementTargets(obj4, view4, arrayList6);
                    Object obj9 = obj4;
                    obj7 = obj9;
                    ArrayList<View> arrayList11 = arrayList7;
                    rect = rect2;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj7, null, null, null, null, obj9, arrayList11);
                    linkedHashMap2.put(p3, Boolean.TRUE);
                    linkedHashMap2.put(p4, Boolean.TRUE);
                    view5 = view2;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList11;
                    linkedHashMap = linkedHashMap2;
                    list2 = list;
                    arrayMap = arrayMap;
                    rect3 = rect;
                    fragmentTransitionImpl3 = fragmentTransitionImpl;
                    z = p2;
                }
            }
        }
        List<TransitionInfo> list3 = list2;
        View view12 = view5;
        ArrayMap arrayMap6 = arrayMap;
        ArrayList<View> arrayList12 = arrayList6;
        Rect rect5 = rect3;
        FragmentTransitionImpl fragmentTransitionImpl5 = fragmentTransitionImpl3;
        boolean z3 = true;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        ArrayList<View> arrayList13 = arrayList7;
        ArrayList arrayList14 = new ArrayList();
        Object objMergeTransitionsTogether = null;
        Object objMergeTransitionsTogether2 = null;
        for (TransitionInfo transitionInfo3 : p0) {
            if (transitionInfo3.isVisibilityUnchanged()) {
                linkedHashMap3.put(transitionInfo3.getOperation(), Boolean.FALSE);
                transitionInfo3.completeSpecialEffect();
            } else {
                Object objCloneTransition = fragmentTransitionImpl5.cloneTransition(transitionInfo3.getTransition());
                SpecialEffectsController.Operation operation2 = transitionInfo3.getOperation();
                boolean z4 = (obj7 == null || !(operation2 == p3 || operation2 == p4)) ? false : z3;
                if (objCloneTransition != null) {
                    final ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj10 = obj7;
                    View view13 = operation2.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view13, str);
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList15, view13);
                    if (z4) {
                        if (operation2 == p3) {
                            arrayList15.removeAll(CollectionsKt.toSet(arrayList12));
                        } else {
                            arrayList15.removeAll(CollectionsKt.toSet(arrayList13));
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        fragmentTransitionImpl5.addTarget(objCloneTransition, view4);
                        operation = operation2;
                        str = str;
                        obj = objMergeTransitionsTogether;
                        obj2 = objMergeTransitionsTogether2;
                        arrayList = arrayList14;
                        linkedHashMap3 = linkedHashMap3;
                        view = view12;
                        obj7 = obj10;
                        obj3 = objCloneTransition;
                    } else {
                        fragmentTransitionImpl5.addTargets(objCloneTransition, arrayList15);
                        view = view12;
                        obj7 = obj10;
                        str = str;
                        obj = objMergeTransitionsTogether;
                        obj2 = objMergeTransitionsTogether2;
                        arrayList = arrayList14;
                        linkedHashMap3 = linkedHashMap3;
                        fragmentTransitionImpl5.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList15, null, null, null, null);
                        if (operation2.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation = operation2;
                            p1.remove(operation);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(operation.getFragment().mView);
                            obj3 = objCloneTransition;
                            fragmentTransitionImpl5.scheduleHideFragmentView(obj3, operation.getFragment().mView, arrayList16);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList15);
                                }
                            });
                        } else {
                            operation = operation2;
                            obj3 = objCloneTransition;
                        }
                    }
                    if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList14 = arrayList;
                        arrayList14.addAll(arrayList15);
                        rect5 = rect5;
                        if (z2) {
                            fragmentTransitionImpl5.setEpicenter(obj3, rect5);
                        }
                        view12 = view;
                    } else {
                        rect5 = rect5;
                        view12 = view;
                        arrayList14 = arrayList;
                        fragmentTransitionImpl5.setEpicenter(obj3, view12);
                    }
                    linkedHashMap3.put(operation, Boolean.TRUE);
                    if (transitionInfo3.getIsOverlapAllowed()) {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl5.mergeTransitionsTogether(obj2, obj3, null);
                        objMergeTransitionsTogether = obj;
                    } else {
                        objMergeTransitionsTogether2 = obj2;
                        objMergeTransitionsTogether = fragmentTransitionImpl5.mergeTransitionsTogether(obj, obj3, null);
                    }
                    z3 = true;
                    defaultSpecialEffectsController = this;
                } else if (!z4) {
                    linkedHashMap3.put(operation2, Boolean.FALSE);
                    transitionInfo3.completeSpecialEffect();
                }
            }
        }
        String str6 = str;
        ArrayList arrayList17 = arrayList14;
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        Object obj11 = obj7;
        Object objMergeTransitionsInSequence = fragmentTransitionImpl5.mergeTransitionsInSequence(objMergeTransitionsTogether2, objMergeTransitionsTogether, obj11);
        if (objMergeTransitionsInSequence == null) {
            return linkedHashMap4;
        }
        ArrayList<TransitionInfo> arrayList18 = new ArrayList();
        for (Object obj12 : list3) {
            if (!((TransitionInfo) obj12).isVisibilityUnchanged()) {
                arrayList18.add(obj12);
            }
        }
        for (final TransitionInfo transitionInfo4 : arrayList18) {
            Object transition = transitionInfo4.getTransition();
            final SpecialEffectsController.Operation operation3 = transitionInfo4.getOperation();
            boolean z5 = obj11 != null && (operation3 == p3 || operation3 == p4);
            if (transition != null || z5) {
                if (!ViewCompat.isLaidOut(getContainer())) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(getContainer());
                        Objects.toString(operation3);
                    }
                    transitionInfo4.completeSpecialEffect();
                } else {
                    fragmentTransitionImpl5.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(transitionInfo4, operation3);
                        }
                    });
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return linkedHashMap4;
        }
        ArrayList arrayList19 = arrayList17;
        FragmentTransition.setViewVisibility(arrayList19, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl5.prepareSetNameOverridesReordered(arrayList13);
        if (FragmentManager.isLoggingEnabled(2)) {
            for (View view14 : arrayList12) {
                Intrinsics.checkNotNullExpressionValue(view14, str6);
                View view15 = view14;
                Objects.toString(view15);
                ViewCompat.getTransitionName(view15);
            }
            for (View view16 : arrayList13) {
                Intrinsics.checkNotNullExpressionValue(view16, str6);
                View view17 = view16;
                Objects.toString(view17);
                ViewCompat.getTransitionName(view17);
            }
        }
        fragmentTransitionImpl5.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl5.setNameOverridesReordered(getContainer(), arrayList12, arrayList13, arrayListPrepareSetNameOverridesReordered, arrayMap6);
        FragmentTransition.setViewVisibility(arrayList19, 0);
        fragmentTransitionImpl5.swapSharedElementTargets(obj11, arrayList12, arrayList13);
        return linkedHashMap4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, ArrayMap arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z, arrayMap, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        Intrinsics.checkNotNullParameter(fragmentTransitionImpl, "");
        Intrinsics.checkNotNullParameter(rect, "");
        fragmentTransitionImpl.getBoundsOnScreen(view, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        FragmentTransition.setViewVisibility(arrayList, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "");
        Intrinsics.checkNotNullParameter(operation, "");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(operation);
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> setEntrySet = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        CollectionsKt.retainAll(setEntrySet, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry<String, View> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.getTransitionName(entry.getValue())));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    private final void captureTransitioningViews(ArrayList<View> p0, View p1) {
        if (p1 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) p1;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (p0.contains(p1)) {
                    return;
                }
                p0.add(p1);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    captureTransitioningViews(p0, childAt);
                }
            }
            return;
        }
        if (p0.contains(p1)) {
            return;
        }
        p0.add(p1);
    }

    private final void findNamedViews(Map<String, View> p0, View p1) {
        String transitionName = ViewCompat.getTransitionName(p1);
        if (transitionName != null) {
            p0.put(transitionName, p1);
        }
        if (p1 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) p1;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    findNamedViews(p0, childAt);
                }
            }
        }
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation p0) {
        View view = p0.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = p0.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "");
        finalState.applyState(view);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "p0", "Landroidx/core/os/CancellationSignal;", "p1", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;)V", "", "completeSpecialEffect", "()V", "", "isVisibilityUnchanged", "()Z", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "getSignal", "()Landroidx/core/os/CancellationSignal;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;
        private final CancellationSignal signal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(operation, "");
            Intrinsics.checkNotNullParameter(cancellationSignal, "");
            this.operation = operation;
            this.signal = cancellationSignal;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view = this.operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            SpecialEffectsController.Operation.State stateAsOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState != finalState) {
                return (stateAsOperationState == SpecialEffectsController.Operation.State.VISIBLE || finalState == SpecialEffectsController.Operation.State.VISIBLE) ? false : true;
            }
            return true;
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "p0", "Landroidx/core/os/CancellationSignal;", "p1", "", "p2", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;Z)V", "Landroid/content/Context;", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "getAnimation", "(Landroid/content/Context;)Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "Z", "isPop"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            Intrinsics.checkNotNullParameter(operation, "");
            Intrinsics.checkNotNullParameter(cancellationSignal, "");
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(p0, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "p0", "Landroidx/core/os/CancellationSignal;", "p1", "", "p2", "p3", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;ZZ)V", "", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "(Ljava/lang/Object;)Landroidx/fragment/app/FragmentTransitionImpl;", "hasSharedElementTransition", "()Z", "()Landroidx/fragment/app/FragmentTransitionImpl;", "handlingImpl", "isOverlapAllowed", "Z", "sharedElementTransition", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z, boolean z2) {
            Object returnTransition;
            boolean allowEnterTransitionOverlap;
            Object sharedElementEnterTransition;
            super(operation, cancellationSignal);
            Intrinsics.checkNotNullParameter(operation, "");
            Intrinsics.checkNotNullParameter(cancellationSignal, "");
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                allowEnterTransitionOverlap = true;
            } else if (z) {
                allowEnterTransitionOverlap = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = allowEnterTransitionOverlap;
            if (!z2) {
                sharedElementEnterTransition = null;
            } else if (z) {
                sharedElementEnterTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                sharedElementEnterTransition = operation.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = sharedElementEnterTransition;
        }

        public final Object getTransition() {
            return this.transition;
        }

        /* JADX INFO: renamed from: isOverlapAllowed, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append(getOperation().getFragment());
            sb.append(" returned Transition ");
            sb.append(this.transition);
            sb.append(" which uses a different Transition  type than its shared element transition ");
            sb.append(this.sharedElementTransition);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        private final FragmentTransitionImpl getHandlingImpl(Object p0) {
            if (p0 == null) {
                return null;
            }
            if (FragmentTransition.PLATFORM_IMPL != null && FragmentTransition.PLATFORM_IMPL.canHandle(p0)) {
                return FragmentTransition.PLATFORM_IMPL;
            }
            if (FragmentTransition.SUPPORT_IMPL != null && FragmentTransition.SUPPORT_IMPL.canHandle(p0)) {
                return FragmentTransition.SUPPORT_IMPL;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(p0);
            sb.append(" for fragment ");
            sb.append(getOperation().getFragment());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
