package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getCapabilitiesByQualityFor implements BufferProviderState, hasMatchedVideoProfileForDynamicRange {
    private List<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            List<BufferProviderState> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ArrayList arrayList = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            if (list != null) {
                Iterator<BufferProviderState> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().dispose();
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) arrayList.get(0));
                    }
                    throw new CompositeException(arrayList);
                }
            }
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.hasMatchedVideoProfileForDynamicRange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(BufferProviderState bufferProviderState) {
        share.b(bufferProviderState, "d is null");
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            synchronized (this) {
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    List linkedList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = linkedList;
                    }
                    linkedList.add(bufferProviderState);
                    return true;
                }
            }
        }
        bufferProviderState.dispose();
        return false;
    }

    @Override // defpackage.hasMatchedVideoProfileForDynamicRange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(BufferProviderState bufferProviderState) {
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2(bufferProviderState)) {
            return false;
        }
        bufferProviderState.dispose();
        return true;
    }

    @Override // defpackage.hasMatchedVideoProfileForDynamicRange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(BufferProviderState bufferProviderState) {
        share.b(bufferProviderState, "Disposable item is null");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return false;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return false;
            }
            List<BufferProviderState> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return list != null && list.remove(bufferProviderState);
        }
    }
}
