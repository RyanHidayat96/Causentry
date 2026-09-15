package androidx.compose.foundation.gestures;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u0010\u001a\u00020\u00062\u0019\u0010\u0005\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u00060\rH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J6\u0010\u0015\u001a\u00020\u00062\u0019\u0010\u0005\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\n0\rH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "<init>", "()V", "", "p0", "", "cancelAndRemoveAll", "(Ljava/lang/Throwable;)V", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "enqueue", "(Landroidx/compose/foundation/gestures/ContentInViewNode$Request;)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "forEachFromSmallest", "(Lkotlin/jvm/functions/Function1;)V", "isEmpty", "()Z", "resumeAndRemoveAll", "resumeAndRemoveWhile", "Landroidx/compose/runtime/collection/MutableVector;", "requests", "Landroidx/compose/runtime/collection/MutableVector;", "", "getSize", "()I", "size"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final boolean enqueue(final ContentInViewNode.Request p0) {
        Rect rectInvoke = p0.getCurrentBounds().invoke();
        if (rectInvoke == null) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> continuation = p0.getContinuation();
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
            return false;
        }
        p0.getContinuation().b(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.enqueue.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                BringIntoViewRequestPriorityQueue.this.requests.remove(p0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        IntRange intRange = new IntRange(0, this.requests.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                Rect rectInvoke2 = this.requests.getContent()[last].getCurrentBounds().invoke();
                if (rectInvoke2 != null) {
                    Rect rectIntersect = rectInvoke.intersect(rectInvoke2);
                    if (Intrinsics.areEqual(rectIntersect, rectInvoke)) {
                        this.requests.add(last + 1, p0);
                        return true;
                    }
                    if (!Intrinsics.areEqual(rectIntersect, rectInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.requests.getContent()[last].getContinuation().TuitionPaymentFragmentbindingInflater1(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last != first) {
                    last--;
                }
            }
        }
        this.requests.add(0, p0);
        return true;
    }

    public final void forEachFromSmallest(Function1<? super Rect, Unit> p0) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                p0.invoke(((ContentInViewNode.Request) content[i]).getCurrentBounds().invoke());
                i--;
            } while (i >= 0);
        }
    }

    public final void resumeAndRemoveAll() {
        IntRange intRange = new IntRange(0, this.requests.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> continuation = this.requests.getContent()[first].getContinuation();
                Unit unit = Unit.INSTANCE;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m8024constructorimpl(unit));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(Function1<? super Rect, Boolean> p0) {
        while (this.requests.isNotEmpty() && p0.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke()).booleanValue()) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> continuation = ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation();
            Unit unit = Unit.INSTANCE;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m8024constructorimpl(unit));
        }
    }

    public final void cancelAndRemoveAll(Throwable p0) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        MediaFormatMustNotUseFrameRateToFindEncoderQuirk[] mediaFormatMustNotUseFrameRateToFindEncoderQuirkArr = new MediaFormatMustNotUseFrameRateToFindEncoderQuirk[size];
        for (int i = 0; i < size; i++) {
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkArr[i] = mutableVector.getContent()[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            mediaFormatMustNotUseFrameRateToFindEncoderQuirkArr[i2].TuitionPaymentFragmentbindingInflater1(p0);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }
}
