package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a/\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\b¢\u0006\u0004\b\t\u0010\u0007\u001a/\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\b¢\u0006\u0004\b\n\u0010\u0007\u001a/\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\b¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u009b\u0001\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0006\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\r\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0019\b\u0006\u0010\u000f\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "p0", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "(Landroid/transition/Transition;Lkotlin/jvm/functions/Function1;)Landroid/transition/Transition$TransitionListener;", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "p1", "p2", "p3", "p4", "addListener", "(Landroid/transition/Transition;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/transition/Transition$TransitionListener;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TransitionKt {
    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function6 = function2;
        if ((i & 4) != 0) {
            function3 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 function7 = function3;
        if ((i & 8) != 0) {
            function4 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            function5 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.5
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }
            };
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(function1, function4, function5, function7, function6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener addListener(Transition transition, Function1<? super Transition, Unit> function1, Function1<? super Transition, Unit> function2, Function1<? super Transition, Unit> function3, Function1<? super Transition, Unit> function4, Function1<? super Transition, Unit> function5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(function1, function4, function5, function3, function2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition p0) {
                function1.invoke(p0);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition p0) {
                function1.invoke(p0);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition p0) {
                function1.invoke(p0);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition p0) {
                function1.invoke(p0);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition p0) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition p0) {
                function1.invoke(p0);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
