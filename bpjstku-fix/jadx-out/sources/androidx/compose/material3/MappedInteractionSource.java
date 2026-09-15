package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.exifinterface.media.ExifInterface;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/MappedInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "Landroidx/compose/ui/geometry/Offset;", "p1", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "mapPress", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)Landroidx/compose/foundation/interaction/PressInteraction$Press;", "delta", "J", "LclampVideoBitrateIfNotSupported;", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "LclampVideoBitrateIfNotSupported;", "getInteractions", "()LclampVideoBitrateIfNotSupported;", "", "mappedPresses", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;
    private final clampVideoBitrateIfNotSupported<Interaction> interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    private MappedInteractionSource(InteractionSource interactionSource, long j) {
        this.delta = j;
        this.mappedPresses = new LinkedHashMap();
        final clampVideoBitrateIfNotSupported<Interaction> interactions = interactionSource.getInteractions();
        this.interactions = new clampVideoBitrateIfNotSupported<Interaction>() { // from class: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1

            /* JADX INFO: renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements addSignalEosTimeoutIfNeeded {
                final /* synthetic */ addSignalEosTimeoutIfNeeded $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                /* JADX INFO: renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:32:0x009d A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // defpackage.addSignalEosTimeoutIfNeeded
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Interaction interactionMapPress;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.$this_unsafeFlow;
                        PressInteraction.Cancel cancel = (Interaction) obj;
                        if (cancel instanceof PressInteraction.Press) {
                            interactionMapPress = this.this$0.mapPress((PressInteraction.Press) cancel);
                            this.this$0.mappedPresses.put(cancel, interactionMapPress);
                        } else {
                            if (cancel instanceof PressInteraction.Cancel) {
                                PressInteraction.Cancel cancel2 = (PressInteraction.Cancel) cancel;
                                PressInteraction.Press press = (PressInteraction.Press) this.this$0.mappedPresses.remove(cancel2.getPress());
                                if (press != null) {
                                    cancel2 = new PressInteraction.Cancel(press);
                                }
                                cancel = cancel2;
                            } else if (cancel instanceof PressInteraction.Release) {
                                PressInteraction.Release release = (PressInteraction.Release) cancel;
                                PressInteraction.Press press2 = (PressInteraction.Press) this.this$0.mappedPresses.remove(release.getPress());
                                if (press2 != null) {
                                    release = new PressInteraction.Release(press2);
                                }
                                interactionMapPress = release;
                            }
                            anonymousClass1.label = 1;
                            if (addsignaleostimeoutifneeded.emit(cancel, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        cancel = interactionMapPress;
                        anonymousClass1.label = 1;
                        if (addsignaleostimeoutifneeded.emit(cancel, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass2(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = addsignaleostimeoutifneeded;
                    this.this$0 = mappedInteractionSource;
                }
            }

            @Override // defpackage.clampVideoBitrateIfNotSupported
            public final Object collect(addSignalEosTimeoutIfNeeded<? super Interaction> addsignaleostimeoutifneeded, Continuation continuation) {
                Object objCollect = interactions.collect(new AnonymousClass2(addsignaleostimeoutifneeded, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final clampVideoBitrateIfNotSupported<Interaction> getInteractions() {
        return this.interactions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press p0) {
        return new PressInteraction.Press(Offset.m3978minusMKHz9U(p0.getPressPosition(), this.delta), null);
    }

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, j);
    }
}
