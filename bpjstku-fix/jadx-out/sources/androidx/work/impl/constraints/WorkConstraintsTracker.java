package androidx.work.impl.constraints;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import defpackage.EncoderImpl11;
import defpackage.EncoderImplSurfaceInput;
import defpackage.acquireInputBuffer;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "Landroidx/work/impl/constraints/trackers/Trackers;", "p0", "<init>", "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "(Ljava/util/List;)V", "Landroidx/work/impl/model/WorkSpec;", "", "areAllConstraintsMet", "(Landroidx/work/impl/model/WorkSpec;)Z", "LclampVideoBitrateIfNotSupported;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "(Landroidx/work/impl/model/WorkSpec;)LclampVideoBitrateIfNotSupported;", "controllers", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.controllers = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkConstraintsTracker(Trackers trackers) {
        Intrinsics.checkNotNullParameter(trackers, "");
        ConstraintController[] constraintControllerArr = new ConstraintController[8];
        constraintControllerArr[0] = new BatteryChargingController(trackers.getBatteryChargingTracker());
        constraintControllerArr[1] = new BatteryNotLowController(trackers.getBatteryNotLowTracker());
        constraintControllerArr[2] = new StorageNotLowController(trackers.getStorageNotLowTracker());
        constraintControllerArr[3] = new NetworkConnectedController(trackers.getNetworkStateTracker());
        constraintControllerArr[4] = new NetworkUnmeteredController(trackers.getNetworkStateTracker());
        constraintControllerArr[5] = new NetworkNotRoamingController(trackers.getNetworkStateTracker());
        constraintControllerArr[6] = new NetworkMeteredController(trackers.getNetworkStateTracker());
        constraintControllerArr[7] = Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null;
        this((List<? extends ConstraintController>) CollectionsKt.listOfNotNull((Object[]) constraintControllerArr));
    }

    public final clampVideoBitrateIfNotSupported<ConstraintsState> track(WorkSpec p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(p0)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ConstraintController) it.next()).track(p0.constraints));
        }
        final clampVideoBitrateIfNotSupported[] clampvideobitrateifnotsupportedArr = (clampVideoBitrateIfNotSupported[]) CollectionsKt.toList(arrayList3).toArray(new clampVideoBitrateIfNotSupported[0]);
        return acquireInputBuffer.b(new clampVideoBitrateIfNotSupported<ConstraintsState>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1
            @Override // defpackage.clampVideoBitrateIfNotSupported
            public final Object collect(addSignalEosTimeoutIfNeeded<? super ConstraintsState> addsignaleostimeoutifneeded, Continuation continuation) {
                clampVideoBitrateIfNotSupported[] clampvideobitrateifnotsupportedArr2 = clampvideobitrateifnotsupportedArr;
                final clampVideoBitrateIfNotSupported[] clampvideobitrateifnotsupportedArr3 = clampvideobitrateifnotsupportedArr;
                CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(clampvideobitrateifnotsupportedArr2, new Function0<ConstraintsState[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintsState[] invoke() {
                        return new ConstraintsState[clampvideobitrateifnotsupportedArr3.length];
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, new AnonymousClass3(null), addsignaleostimeoutifneeded, null);
                EncoderImpl11 encoderImpl11 = new EncoderImpl11(continuation.getContext(), continuation);
                Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplSurfaceInput.TuitionPaymentFragmentbindingInflater1(encoderImpl11, encoderImpl11, combineKt$combineInternal$2);
                if (objTuitionPaymentFragmentbindingInflater1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                if (objTuitionPaymentFragmentbindingInflater1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objTuitionPaymentFragmentbindingInflater1 = Unit.INSTANCE;
                }
                return objTuitionPaymentFragmentbindingInflater1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentbindingInflater1 : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<addSignalEosTimeoutIfNeeded<? super ConstraintsState>, ConstraintsState[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState.ConstraintsMet constraintsMet;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = (addSignalEosTimeoutIfNeeded) this.L$0;
                        AnonymousClass3 anonymousClass3 = this;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                constraintsMet = null;
                                break;
                            }
                            constraintsMet = constraintsStateArr[i2];
                            if (!Intrinsics.areEqual(constraintsMet, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i2++;
                        }
                        if (constraintsMet == null) {
                            constraintsMet = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (addsignaleostimeoutifneeded.emit(constraintsMet, anonymousClass3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(addSignalEosTimeoutIfNeeded<? super ConstraintsState> addsignaleostimeoutifneeded, ConstraintsState[] constraintsStateArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = addsignaleostimeoutifneeded;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }
            }
        });
    }

    public final boolean areAllConstraintsMet(WorkSpec p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(p0)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            Logger logger = Logger.get();
            String str = WorkConstraintsTrackerKt.TAG;
            StringBuilder sb = new StringBuilder("Work ");
            sb.append(p0.id);
            sb.append(" constrained by ");
            sb.append(CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, new Function1<ConstraintController, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(ConstraintController constraintController) {
                    Intrinsics.checkNotNullParameter(constraintController, "");
                    String simpleName = constraintController.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "");
                    return simpleName;
                }
            }, 31, null));
            logger.debug(str, sb.toString());
        }
        return arrayList2.isEmpty();
    }
}
